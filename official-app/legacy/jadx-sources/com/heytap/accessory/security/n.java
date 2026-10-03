package com.heytap.accessory.security;

import com.heytap.accessory.utils.HexUtils;
import java.util.HashMap;
import javax.crypto.SecretKey;

/* JADX INFO: loaded from: classes14.dex */
public class n {
    public HashMap<c, com.heytap.accessory.security.wms.a> a = new HashMap<>();
    public com.heytap.accessory.base.bean.b b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public com.heytap.accessory.security.wms.b f2681c;
    public com.heytap.accessory.security.wms.c d;

    public n(com.heytap.accessory.base.bean.b bVar, int i) {
        this.b = bVar;
        com.heytap.accessory.base.logging.a.a("SecurityStore - kscTrack", "role = " + i);
        this.d = new com.heytap.accessory.security.wms.c(bVar.d(), bVar.h(), bVar.F());
    }

    public HashMap<c, com.heytap.accessory.security.wms.a> a() {
        return this.a;
    }

    public com.heytap.accessory.security.wms.b b() {
        return this.f2681c;
    }

    public SecretKey c() throws com.heytap.accessory.security.wms.e {
        return this.d.d();
    }

    public com.heytap.accessory.base.bean.b d() {
        return this.b;
    }

    public com.heytap.accessory.security.wms.c e() {
        return this.d;
    }

    public void a(com.heytap.accessory.security.wms.b bVar) {
        if (bVar != null) {
            com.heytap.accessory.base.logging.a.a("SecurityStore - kscTrack", "saveChallengeCode = " + HexUtils.byteArrayToHexStr(bVar.a()));
        }
        this.f2681c = bVar;
    }
}
