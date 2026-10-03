package com.heytap.accessory.connectivity.params;

import java.util.UUID;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes14.dex */
public class b extends c {
    public UUID b;

    @Override // com.heytap.accessory.connectivity.params.c
    public void a(int i) {
        if (i == 1) {
            this.b = UUID.fromString("a49ebb15-cb06-495c-9f4f-bb80a90cdf00");
        } else {
            this.b = UUID.fromString("a49eaa15-cb06-495c-9f4f-bb80a90cdf00");
        }
    }

    @Override // com.heytap.accessory.connectivity.params.c
    public String a() {
        return this.b.toString();
    }

    public c a(String str) {
        this.b = UUID.fromString(str);
        return this;
    }
}
