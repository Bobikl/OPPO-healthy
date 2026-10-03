package com.heytap.mspsdk.listener;

import java.util.HashMap;

/* JADX INFO: loaded from: classes19.dex */
public class b {
    public int a;
    public String b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public HashMap<String, String> f7403c;

    public void a(int i) {
        this.a = i;
    }

    public void b(HashMap<String, String> map) {
        this.f7403c = map;
    }

    public void c(String str) {
        this.b = str;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Result{code='");
        sb.append(this.a);
        sb.append('\'');
        sb.append(", message='");
        sb.append(this.b);
        sb.append('\'');
        sb.append(", item='");
        HashMap<String, String> map = this.f7403c;
        sb.append(map != null ? map.toString() : null);
        sb.append('\'');
        sb.append('}');
        return sb.toString();
    }
}
