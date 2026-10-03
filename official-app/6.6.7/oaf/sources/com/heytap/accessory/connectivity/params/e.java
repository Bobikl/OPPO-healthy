package com.heytap.accessory.connectivity.params;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes14.dex */
public class e extends c {
    public int b;

    @Override // com.heytap.accessory.connectivity.params.c
    public void a(int i) {
        this.b = 46888;
    }

    @Override // com.heytap.accessory.connectivity.params.c
    public String a() {
        return String.valueOf(this.b);
    }

    public c a(String str) {
        this.b = Integer.parseInt(str);
        return this;
    }
}
