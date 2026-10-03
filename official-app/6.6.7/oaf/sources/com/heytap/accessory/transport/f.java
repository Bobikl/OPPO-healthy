package com.heytap.accessory.transport;

import com.heytap.accessory.base.AccessoryManager;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes14.dex */
public class f {
    public static int a(int i, int i2) {
        return (i == 2 && i2 == 5) ? 2 : 0;
    }

    public static boolean a(long j) {
        com.heytap.accessory.base.bean.b bVarA = AccessoryManager.h().a(j);
        return bVarA != null && bVarA.g() == 1;
    }

    public static int a(long j, long j2) {
        com.heytap.accessory.base.bean.b bVarA = AccessoryManager.h().a(j);
        if (bVarA == null) {
            return com.heytap.accessory.sdp.endpoint.f.a(0);
        }
        int iC = bVarA.c() + 7 + 24;
        return (!com.heytap.accessory.session.a.c(j2) || com.heytap.accessory.sdp.endpoint.f.a(bVarA.h()) <= iC) ? iC : com.heytap.accessory.sdp.endpoint.f.a(bVarA.h());
    }
}
