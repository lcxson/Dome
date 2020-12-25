package com.liuchenxiao.springbootssm.pojo;

public class StatusDataMsg {
    private String MsgCode;
    private String Msg;
    private String ErrMsg;
    private Account account;

    public String getMsgCode() {
        return MsgCode;
    }

    public void setMsgCode(String msgCode) {
        MsgCode = msgCode;
    }

    public String getMsg() {
        return Msg;
    }

    public void setMsg(String msg) {
        Msg = msg;
    }

    public String getErrMsg() {
        return ErrMsg;
    }

    public void setErrMsg(String errMsg) {
        ErrMsg = errMsg;
    }

    public Account getAccount() {
        return account;
    }

    public void setAccount(Account account) {
        this.account = account;
    }

    @Override
    public String toString() {
        return "StatusDataMsg{" +
                "MsgCode='" + MsgCode + '\'' +
                ", Msg='" + Msg + '\'' +
                ", ErrMsg='" + ErrMsg + '\'' +
                ", account=" + account +
                '}';
    }

}

