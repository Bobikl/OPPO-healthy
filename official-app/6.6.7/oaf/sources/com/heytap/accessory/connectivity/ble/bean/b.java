package com.heytap.accessory.connectivity.ble.bean;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes14.dex */
public class b {
    public String a;
    public List<c> b = new ArrayList();

    public b(String str) {
        this.a = str;
    }

    public void a(c cVar) {
        this.b.add(cVar);
    }

    public String b() {
        return this.a;
    }

    public List<c> a() {
        return this.b;
    }
}
