package com.allawn.weather.common.vo;

import java.io.Serializable;

/* JADX INFO: loaded from: classes12.dex */
public class DataVO implements Serializable {
    private Long expireTime;

    public Long getExpireTime() {
        return this.expireTime;
    }

    public void setExpireTime(Long l2) {
        this.expireTime = l2;
    }

    public String toString() {
        return "DataVO{expireTime=" + this.expireTime + '}';
    }
}
