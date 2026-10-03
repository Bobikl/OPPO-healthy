package com.heytap.accessory.transport;

import com.heytap.accessory.base.AccessoryManager;

/* JADX INFO: loaded from: classes14.dex */
public class f {
    public static int a(int i, int i2) {
        return (i == 2 && i2 == 5) ? 2 : 0;
    }

    public static boolean a(long j2) {
        com.heytap.accessory.base.bean.b bVarA = AccessoryManager.h().a(j2);
        return bVarA != null && bVarA.g() == 1;
    }

    public static int a(long j2, long j3) {
        com.heytap.accessory.base.bean.b bVarA = AccessoryManager.h().a(j2);
        if (bVarA == null) {
            return com.heytap.accessory.sdp.endpoint.f.a(0);
        }
        int iC = bVarA.c() + 7 + 24;
        return (!com.heytap.accessory.session.a.c(j3) || com.heytap.accessory.sdp.endpoint.f.a(bVarA.h()) <= iC) ? iC : com.heytap.accessory.sdp.endpoint.f.a(bVarA.h());
    }
}
