package com.omron.lib.bean;

/* JADX INFO: loaded from: classes5.dex */
public class IdentifierResponse<T> {
    private int code;
    private Data<T> data;
    private String message;

    public static class Data<T> {
        private String date;
        private String ekiKey;
        private String uuid;

        public String a() {
            return this.date;
        }

        public String b() {
            return this.ekiKey;
        }

        public String c() {
            return this.uuid;
        }
    }

    public Data<T> a() {
        return this.data;
    }
}
