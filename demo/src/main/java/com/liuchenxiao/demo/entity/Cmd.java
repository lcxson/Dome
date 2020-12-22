package com.liuchenxiao.demo.entity;

import org.aspectj.weaver.GeneratedReferenceTypeDelegate;

import javax.persistence.*;


@Entity
@Table(name = "cmd_table")
public class Cmd {

    @Id
   @GeneratedValue(strategy = GenerationType.IDENTITY)
    Integer cmd_id;
    String start_shell;
    String stop_shell;
    String status_shell;


    public Integer getCmd_id() {
        return cmd_id;
    }

    public void setCmd_id(Integer cmd_id) {
        this.cmd_id = cmd_id;
    }

    public String getStart_shell() {
        return start_shell;
    }

    public void setStart_shell(String start_shell) {
        this.start_shell = start_shell;
    }

    public String getStop_shell() {
        return stop_shell;
    }

    public void setStop_shell(String stop_shell) {
        this.stop_shell = stop_shell;
    }

    public String getStatus_shell() {
        return status_shell;
    }

    public void setStatus_shell(String status_shell) {
        this.status_shell = status_shell;
    }

    @Override
    public String toString() {
        return "Cmd{" +
                "cmd_id=" + cmd_id +
                ", start_shell='" + start_shell + '\'' +
                ", stop_shell='" + stop_shell + '\'' +
                ", status_shell='" + status_shell + '\'' +
                '}';
    }
}
