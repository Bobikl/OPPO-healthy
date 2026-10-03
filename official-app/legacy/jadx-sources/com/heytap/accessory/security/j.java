package com.heytap.accessory.security;

import androidx.annotation.Nullable;
import com.heytap.accessory.connectivity.constant.ConnectConstant;
import com.heytap.accessory.utils.buffer.Buffer;
import java.util.Map;

/* JADX INFO: loaded from: classes14.dex */
public class j implements f {
    public static final String f = "j";
    public boolean a;
    public n b;
    public g d;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public i f2673c = i.a;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f2674e = ConnectConstant.ERROR_DISCOVERY_AUTHENTICATION_UNKNOWN_REASON;

    public j(g gVar) {
        this.d = gVar;
    }

    @Override // com.heytap.accessory.security.f
    public int a(com.heytap.accessory.base.bean.b bVar, int i) {
        String str = f;
        com.heytap.accessory.base.logging.a.d(str, "Start Authentication - remote(server), local(client)");
        this.b = a(bVar);
        if (!this.a) {
            this.f2673c.b(this);
            return 0;
        }
        com.heytap.accessory.base.logging.a.a(str, "cleaning up pending for acc: " + bVar.l());
        this.f2673c = i.f2672e;
        this.a = false;
        d();
        return ConnectConstant.ERROR_DISCOVERY_AUTHENTICATION_PENDING_ERROR;
    }

    @Override // com.heytap.accessory.security.f
    public int b(long j2, long j3, byte[] bArr, int i, int i2) {
        n nVar = this.b;
        if (nVar == null || nVar.d() == null || !a(b.a(this.b.d()))) {
            return -1;
        }
        try {
            com.heytap.accessory.base.logging.a.a(f, "decrypting datalen(S) : " + bArr.length + "[" + i + "," + i2 + "]");
            n nVar2 = this.b;
            return b.a(nVar2, j2, j3, nVar2.a()).a(bArr, i, i2);
        } catch (com.heytap.accessory.security.wms.e e2) {
            com.heytap.accessory.base.logging.a.e(f, "decrypt failed:" + e2);
            return -1;
        }
    }

    @Override // com.heytap.accessory.security.f
    public void c() {
        n nVar = this.b;
        if (nVar == null) {
            com.heytap.accessory.base.logging.a.a(f, "Store is null. Mark for cleanup and return.");
            this.a = true;
            return;
        }
        for (Map.Entry<c, com.heytap.accessory.security.wms.a> entry : nVar.a().entrySet()) {
            com.heytap.accessory.security.wms.a value = entry.getValue();
            try {
                com.heytap.accessory.base.logging.a.c(f, "Destroy app key: " + entry.getKey());
                value.a();
            } catch (com.heytap.accessory.security.wms.e e2) {
                com.heytap.accessory.base.logging.a.e(f, "cleanUp failed:" + e2);
            }
        }
        this.b.a().clear();
        d();
    }

    public void d() {
        if (this.b.e() != null) {
            this.b.e().a();
        }
    }

    public void e() {
        d();
        this.d.a(this.b.d(), this.f2674e);
    }

    public void f() {
        d();
        this.d.a(this.b.d());
    }

    public i g() {
        return this.f2673c;
    }

    public g h() {
        return this.d;
    }

    public void i() {
        a(this.b.d().l(), b.a().a);
        com.heytap.accessory.base.logging.a.a(f, "sendKscError to remote");
    }

    @Override // com.heytap.accessory.security.f
    public boolean b() {
        return this.f2673c.equals(i.f2671c);
    }

    @Override // com.heytap.accessory.security.f
    public int a(long j2, long j3, byte[] bArr, int i, int i2) {
        n nVar = this.b;
        if (nVar == null || nVar.d() == null || !a(b.a(this.b.d()))) {
            return -1;
        }
        try {
            n nVar2 = this.b;
            com.heytap.accessory.security.wms.a aVarA = b.a(nVar2, j2, j3, nVar2.a());
            com.heytap.accessory.base.logging.a.a(f, "encrypting datalen(S) : " + bArr.length + "[" + i + "," + i2 + "]");
            return aVarA.b(bArr, i, i2);
        } catch (com.heytap.accessory.security.wms.e e2) {
            com.heytap.accessory.base.logging.a.e(f, "encrypt failed:" + e2);
            return -1;
        }
    }

    @Override // com.heytap.accessory.security.f
    public boolean a(long j2, long j3) {
        n nVar = this.b;
        if (nVar != null && nVar.d() != null) {
            c cVar = new c(j2, j3);
            com.heytap.accessory.security.wms.a aVarRemove = this.b.a().remove(cVar);
            if (aVarRemove == null) {
                com.heytap.accessory.base.logging.a.e(f, "removeAppCipher failed. cannot find cipher with providerId:" + j2 + " consumerId:" + j3 + " keyMap:" + this.b.a().keySet());
                return false;
            }
            try {
                com.heytap.accessory.base.logging.a.c(f, "Destroy app key: " + cVar);
                aVarRemove.a();
                return true;
            } catch (com.heytap.accessory.security.wms.e e2) {
                com.heytap.accessory.base.logging.a.e(f, "removeAppCipher failed:" + e2);
                return false;
            }
        }
        com.heytap.accessory.base.logging.a.e(f, "removeAppCipher failed. store for acc is null");
        return false;
    }

    @Override // com.heytap.accessory.security.f
    public void a(Buffer buffer) {
        i iVar = this.f2673c;
        if (iVar != null) {
            iVar.a(this, buffer);
        }
    }

    @Override // com.heytap.accessory.security.f
    public void a(com.heytap.accessory.message.b bVar) {
        i iVar = this.f2673c;
        if (iVar != null) {
            iVar.a(this, bVar);
        }
    }

    @Override // com.heytap.accessory.security.f
    public void a(int i, int i2) {
        i iVar = this.f2673c;
        if (iVar != null) {
            iVar.a(this, i, i2);
        }
    }

    @Override // com.heytap.accessory.security.f
    public void a() {
        com.heytap.accessory.base.logging.a.b(f, "Authentication message did not come in time. Close the connection!");
        this.f2674e = ConnectConstant.ERROR_CHANNEL_AUTH_TIMEOUT;
        e();
    }

    public void a(i iVar) {
        this.f2673c = iVar;
    }

    public boolean a(String str) {
        if (this.b.b() != null) {
            return true;
        }
        com.heytap.accessory.base.logging.a.b(f, "Security key is null (role : server)");
        return false;
    }

    public final n a(com.heytap.accessory.base.bean.b bVar) {
        return b.a(bVar, 2);
    }

    public byte a(long j2, com.heytap.accessory.message.a aVar) {
        return com.heytap.accessory.connectivity.c.b().a(j2, -1L, b.a(j2, aVar));
    }

    public int a(int i, @Nullable Buffer buffer) {
        d dVarA = b.a(i, buffer, this.b);
        long jL = this.b.d().l();
        int i2 = dVarA.b;
        if (i2 != 0) {
            return i2;
        }
        byte bA = a(jL, dVarA.a);
        if (bA == 0) {
            return 0;
        }
        com.heytap.accessory.base.logging.a.e(f, "sendAuth msg error:" + ((int) bA));
        return 1;
    }
}
