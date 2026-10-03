package com.heytap.accessory.connectivity;

import com.heytap.accessory.connectivity.params.d;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes14.dex */
public class b {
    public static a a(long j, int i, int i2, int i3) {
        com.heytap.accessory.connectivity.params.c cVarA = d.a(j, i, i2, i3);
        if (i == 2) {
            return com.heytap.accessory.connectivity.bt.b.a(cVarA);
        }
        if (i == 1) {
            return com.heytap.accessory.connectivity.wifi.socket.a.a(cVarA);
        }
        if (i == 4) {
            return com.heytap.accessory.connectivity.ble.d.a(cVarA);
        }
        return null;
    }

    public static a a(com.heytap.accessory.base.bean.b bVar, int i) {
        com.heytap.accessory.connectivity.params.c cVarA = d.a(bVar.l(), bVar.h(), bVar.F(), i);
        if (bVar.h() == 2) {
            return com.heytap.accessory.connectivity.bt.b.a(bVar, cVarA);
        }
        if (bVar.h() == 1) {
            return com.heytap.accessory.connectivity.wifi.socket.a.a(bVar, cVarA);
        }
        if (bVar.h() == 4) {
            return com.heytap.accessory.connectivity.ble.d.a(bVar, cVarA);
        }
        return null;
    }
}
