package com.heytap.webpro.preload.res.entity;

import androidx.annotation.Keep;

/* JADX INFO: loaded from: classes3.dex */
@Keep
public class TraceBean {
    public final int code;
    public final String msg;

    private TraceBean(int i, String str) {
        this.code = i;
        this.msg = str;
    }

    public static TraceBean create(int i, String str) {
        return new TraceBean(i, str);
    }

    public String toString() {
        return "TraceBean{code=" + this.code + ", msg='" + this.msg + "'}";
    }
}
