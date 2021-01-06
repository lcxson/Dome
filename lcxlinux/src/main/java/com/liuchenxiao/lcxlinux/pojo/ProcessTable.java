package com.liuchenxiao.lcxlinux.pojo;

import java.io.Serializable;

/**
 * @author 
 * 
 */
public class ProcessTable implements Serializable {
    /**
     * 进程id
     */
    private Integer processId;

    /**
     * 进程名称
     */
    private String processName;

    /**
     * 进程译释
     */
    private String processTranslate;

    /**
     * 主机IP
     */
    private String hostIp;

    /**
     * 启动脚本
     */
    private String processStart;

    /**
     * 停止脚本
     */
    private String processStop;

    /**
     * 查询脚本
     */
    private String processSel;

    private static final long serialVersionUID = 1L;

    public Integer getProcessId() {
        return processId;
    }

    public void setProcessId(Integer processId) {
        this.processId = processId;
    }

    public String getProcessName() {
        return processName;
    }

    public void setProcessName(String processName) {
        this.processName = processName;
    }

    public String getProcessTranslate() {
        return processTranslate;
    }

    public void setProcessTranslate(String processTranslate) {
        this.processTranslate = processTranslate;
    }

    public String getHostIp() {
        return hostIp;
    }

    public void setHostIp(String hostIp) {
        this.hostIp = hostIp;
    }

    public String getProcessStart() {
        return processStart;
    }

    public void setProcessStart(String processStart) {
        this.processStart = processStart;
    }

    public String getProcessStop() {
        return processStop;
    }

    public void setProcessStop(String processStop) {
        this.processStop = processStop;
    }

    public String getProcessSel() {
        return processSel;
    }

    public void setProcessSel(String processSel) {
        this.processSel = processSel;
    }

    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        ProcessTable other = (ProcessTable) that;
        return (this.getProcessId() == null ? other.getProcessId() == null : this.getProcessId().equals(other.getProcessId()))
            && (this.getProcessName() == null ? other.getProcessName() == null : this.getProcessName().equals(other.getProcessName()))
            && (this.getProcessTranslate() == null ? other.getProcessTranslate() == null : this.getProcessTranslate().equals(other.getProcessTranslate()))
            && (this.getHostIp() == null ? other.getHostIp() == null : this.getHostIp().equals(other.getHostIp()))
            && (this.getProcessStart() == null ? other.getProcessStart() == null : this.getProcessStart().equals(other.getProcessStart()))
            && (this.getProcessStop() == null ? other.getProcessStop() == null : this.getProcessStop().equals(other.getProcessStop()))
            && (this.getProcessSel() == null ? other.getProcessSel() == null : this.getProcessSel().equals(other.getProcessSel()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getProcessId() == null) ? 0 : getProcessId().hashCode());
        result = prime * result + ((getProcessName() == null) ? 0 : getProcessName().hashCode());
        result = prime * result + ((getProcessTranslate() == null) ? 0 : getProcessTranslate().hashCode());
        result = prime * result + ((getHostIp() == null) ? 0 : getHostIp().hashCode());
        result = prime * result + ((getProcessStart() == null) ? 0 : getProcessStart().hashCode());
        result = prime * result + ((getProcessStop() == null) ? 0 : getProcessStop().hashCode());
        result = prime * result + ((getProcessSel() == null) ? 0 : getProcessSel().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", processId=").append(processId);
        sb.append(", processName=").append(processName);
        sb.append(", processTranslate=").append(processTranslate);
        sb.append(", hostIp=").append(hostIp);
        sb.append(", processStart=").append(processStart);
        sb.append(", processStop=").append(processStop);
        sb.append(", processSel=").append(processSel);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}