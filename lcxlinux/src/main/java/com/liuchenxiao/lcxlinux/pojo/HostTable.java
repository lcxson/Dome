package com.liuchenxiao.lcxlinux.pojo;

import java.io.Serializable;

/**
 * @author 
 * 
 */
public class HostTable implements Serializable {
    /**
     * hots_id
     */
    private Integer hostId;

    /**
     * host_ip
     */
    private String hostIp;

    /**
     * host_name
     */
    private String hostName;

    /**
     * password
     */
    private String password;

    private static final long serialVersionUID = 1L;

    public Integer getHostId() {
        return hostId;
    }

    public void setHostId(Integer hostId) {
        this.hostId = hostId;
    }

    public String getHostIp() {
        return hostIp;
    }

    public void setHostIp(String hostIp) {
        this.hostIp = hostIp;
    }

    public String getHostName() {
        return hostName;
    }

    public void setHostName(String hostName) {
        this.hostName = hostName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
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
        HostTable other = (HostTable) that;
        return (this.getHostId() == null ? other.getHostId() == null : this.getHostId().equals(other.getHostId()))
            && (this.getHostIp() == null ? other.getHostIp() == null : this.getHostIp().equals(other.getHostIp()))
            && (this.getHostName() == null ? other.getHostName() == null : this.getHostName().equals(other.getHostName()))
            && (this.getPassword() == null ? other.getPassword() == null : this.getPassword().equals(other.getPassword()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getHostId() == null) ? 0 : getHostId().hashCode());
        result = prime * result + ((getHostIp() == null) ? 0 : getHostIp().hashCode());
        result = prime * result + ((getHostName() == null) ? 0 : getHostName().hashCode());
        result = prime * result + ((getPassword() == null) ? 0 : getPassword().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", hostId=").append(hostId);
        sb.append(", hostIp=").append(hostIp);
        sb.append(", hostName=").append(hostName);
        sb.append(", password=").append(password);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}