package com.heytap.weather.vo;

import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public class AdVO {

    public static class AdRequestData {
        private Map data;
        private Map header;

        public Map getData() {
            return this.data;
        }

        public Map getHeader() {
            return this.header;
        }

        public void setData(Map map) {
            this.data = map;
        }

        public void setHeader(Map map) {
            this.header = map;
        }

        public String toString() {
            return "AdRequestData{header=" + this.header + ", data=" + this.data + '}';
        }
    }

    public static class AdResponseData {
        private Object data;
        private String msg;
        private Integer ret;

        public Object getData() {
            return this.data;
        }

        public String getMsg() {
            return this.msg;
        }

        public Integer getRet() {
            return this.ret;
        }

        public void setData(Object obj) {
            this.data = obj;
        }

        public void setMsg(String str) {
            this.msg = str;
        }

        public void setRet(Integer num) {
            this.ret = num;
        }

        public String toString() {
            return "AdResponseData{ret=" + this.ret + ", msg='" + this.msg + "', data=" + this.data + '}';
        }
    }
}
