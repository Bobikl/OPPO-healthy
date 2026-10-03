package com.heytap.msp.bean;

import android.util.Log;
import java.io.Serializable;

/* JADX INFO: loaded from: classes19.dex */
public class Response implements Serializable {
    private static final long serialVersionUID = 5021727723632710374L;
    int code;
    String data;
    String message;

    public static <T extends Response> T create(int i, String str, Class<T> cls) {
        T t = null;
        try {
            T tNewInstance = cls.newInstance();
            try {
                tNewInstance.code = i;
                tNewInstance.message = str;
                return tNewInstance;
            } catch (Exception e2) {
                e = e2;
                t = tNewInstance;
                Log.e("Msp-Log-comm", e.toString());
                return t;
            }
        } catch (Exception e3) {
            e = e3;
        }
    }

    public int getCode() {
        return this.code;
    }

    public String getData() {
        return this.data;
    }

    public String getMessage() {
        return this.message;
    }

    public void setCode(int i) {
        this.code = i;
    }

    public void setData(String str) {
        this.data = str;
    }

    public void setMessage(String str) {
        this.message = str;
    }

    public String toString() {
        return "Response{code=" + this.code + ", message='" + this.message + "'}";
    }

    public static Response create(int i, String str) {
        Response response = new Response();
        response.code = i;
        response.message = str;
        return response;
    }

    public static Response create(int i, String str, String str2) {
        Response response = new Response();
        response.code = i;
        response.message = str;
        response.data = str2;
        return response;
    }
}
