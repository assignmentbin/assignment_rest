package com.training.practice.domain;

public class Bug {

    private int bugId;
    private String user;
    private Status status;
    private String title;
    private String desc;

    public Bug(String title, String desc) {
        this.title = title;
        this.desc = desc;
    }

    public int getBugId() {
        return bugId;
    }

    public String getUser() {
        return user;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public void setBugId(int bugId) {
        this.bugId = bugId;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    @Override
    public String toString() {
        return "Bug{" +
                "bugId=" + bugId +
                ", user='" + user + '\'' +
                ", status=" + status +
                ", title='" + title + '\'' +
                ", desc='" + desc + '\'' +
                '}';
    }
}
