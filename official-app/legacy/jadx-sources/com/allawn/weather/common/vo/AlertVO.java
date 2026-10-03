package com.allawn.weather.common.vo;

import java.util.List;

/* JADX INFO: loaded from: classes12.dex */
public class AlertVO extends DataVO {
    private List<AlertDataVO> data;
    private String homeDes;
    private long vaildTime;

    public List<AlertDataVO> getData() {
        return this.data;
    }

    public String getHomeDes() {
        return this.homeDes;
    }

    public long getVaildTime() {
        return this.vaildTime;
    }

    public void setData(List<AlertDataVO> list) {
        this.data = list;
    }

    public void setHomeDes(String str) {
        this.homeDes = str;
    }

    public void setVaildTime(long j2) {
        this.vaildTime = j2;
    }
}
