package com.liuchenxiao.springbootssm.filter;


import org.springframework.stereotype.Component;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;


@Component
@WebFilter(urlPatterns = "/*")
public class AccountFilter implements Filter {

    //不需要拦截的uri
        private final String[] IGNORE_URI={"/plugins","/account","/Main","/index"};
    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain)
            throws IOException, ServletException {
        //做强转
         HttpServletRequest request= (HttpServletRequest)servletRequest;
         HttpServletResponse response=(HttpServletResponse)servletResponse;
        //从session里 找到url
        String uri = request.getRequestURI();

        System.out.println( "-----------filter---------"+uri );


        boolean pass=canPassIgnoerUri(uri);
        System.out.println("pass++++++++++"+pass);
        if(pass){
            //放行
            filterChain.doFilter(request,response);
            // return 下面方法不执行
            return;
        }
        //从当前session找Account
        Object account = request.getSession().getAttribute("account");
        if (null == account){
            //没登陆跳转登录页面
            response.sendRedirect("Main/account/login");
            return;
        }
    }



    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        //加载Filter 启动之前需要加载的资源
        System.out.println("---------------------AccountFilter  init已启动----------------------");
        Filter.super.init(filterConfig);
    }

    @Override
    public void destroy() {

    }


    private boolean canPassIgnoerUri(String uri) {

        //判断uil的启示部分是否包含IGNORE_URI
        //下级目录也能访问startsWith
        System.out.println("+++++++++++++:"+uri);
        for(String val:IGNORE_URI){
            if (uri.startsWith(val)){
                return true;
            }
        }
        return false;
    }
}
