package com.lifesense.device.scale.infrastructure.repository;

/* JADX INFO: loaded from: classes4.dex */
public class e {

    public static class a {
        public static b a = new b();
        public static c b = new c();

        public static b b() {
            return a;
        }

        public static c c() {
            return b;
        }
    }

    public static b a() {
        return a.b();
    }

    public static c b() {
        return a.c();
    }
}
