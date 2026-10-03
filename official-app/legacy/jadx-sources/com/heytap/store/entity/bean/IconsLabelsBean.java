package com.heytap.store.entity.bean;

/* JADX INFO: loaded from: classes4.dex */
public class IconsLabelsBean {
    private Long beginTime;
    private Long clickTime;
    private Integer color;
    private Long endTime;
    private String name;

    public IconsLabelsBean() {
    }

    public Long getBeginTime() {
        return this.beginTime;
    }

    public Long getClikdTime() {
        return this.clickTime;
    }

    public Integer getColor() {
        return this.color;
    }

    public Long getEndTime() {
        return this.endTime;
    }

    public String getName() {
        return this.name;
    }

    public void setBeginTime(Long l2) {
        this.beginTime = l2;
    }

    public void setClikdTime(Long l2) {
        this.clickTime = l2;
    }

    public void setColor(Integer num) {
        this.color = num;
    }

    public void setEndTime(Long l2) {
        this.endTime = l2;
    }

    public void setName(String str) {
        this.name = str;
    }

    public IconsLabelsBean(String str, Integer num) {
        this.name = str;
        this.color = num;
    }
}
