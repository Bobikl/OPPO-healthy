package com.omron.lib.bean;

import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public class EkiKeyInfo {
    private String appkey;
    private List<Bg> bg;
    private List<Ox> bo;
    private List<Bp> bp;
    private int category;
    private List<Fat> fat;
    private String secret;

    public static class Bg {
        private String bleName;
        private int category = 2;
        private String date;
        private String deviceType;

        public String a() {
            return this.bleName;
        }

        public int b() {
            return this.category;
        }

        public String c() {
            return this.date;
        }

        public String d() {
            return this.deviceType;
        }
    }

    public static class Bp {
        private String bleName;
        private int category = 1;
        private String date;
        private String deviceType;

        public String a() {
            return this.bleName;
        }

        public int b() {
            return this.category;
        }

        public String c() {
            return this.date;
        }

        public String d() {
            return this.deviceType;
        }
    }

    public static class Fat {
        private String bleName;
        private int category = 4;
        private String date;
        private String deviceType;

        public String a() {
            return this.bleName;
        }

        public int b() {
            return this.category;
        }

        public String c() {
            return this.date;
        }

        public String d() {
            return this.deviceType;
        }
    }

    public static class Ox {
        private String bleName;
        private int category = 5;
        private String date;
        private String deviceType;

        public String a() {
            return this.bleName;
        }

        public int b() {
            return this.category;
        }

        public String c() {
            return this.date;
        }

        public String d() {
            return this.deviceType;
        }
    }

    public String a() {
        return this.appkey;
    }

    public List<Bg> b() {
        return this.bg;
    }

    public List<Ox> c() {
        return this.bo;
    }

    public List<Bp> d() {
        return this.bp;
    }

    public List<Fat> e() {
        return this.fat;
    }
}
