package com.heytap.accessory.security;

import androidx.annotation.Nullable;
import com.heytap.accessory.connectivity.constant.ConnectConstant;
import com.heytap.accessory.utils.buffer.Buffer;
import java.util.Map;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes14.dex */
public class m implements f {
    public static final String f = "m";
    public boolean a;
    public g c;
    public n d;
    public l b = l.a;
    public int e = ConnectConstant.ERROR_DISCOVERY_AUTHENTICATION_REMOTE_CREDENTIALS_FAILED;

    public m(g gVar) {
        this.c = gVar;
    }

    @Override // com.heytap.accessory.security.f
    public int a(com.heytap.accessory.base.bean.b bVar, int i) {
        String str = f;
        com.heytap.accessory.base.logging.a.d(str, "Start authentication - remote(client), local(server)");
        n nVarB = b(bVar, i);
        this.d = nVarB;
        if (nVarB == null) {
            com.heytap.accessory.base.logging.a.b(str, "Server not populated properly");
            this.b = l.e;
            return ConnectConstant.ERROR_DISCOVERY_AUTHENTICATION_REMOTE_CREDENTIALS_FAILED;
        }
        if (!this.a) {
            this.b.b(this);
            return 0;
        }
        com.heytap.accessory.base.logging.a.a(str, "cleaning up pending for acc: " + bVar.l());
        this.b = l.e;
        this.a = false;
        d();
        return ConnectConstant.ERROR_DISCOVERY_AUTHENTICATION_PENDING_ERROR;
    }

    @Override // com.heytap.accessory.security.f
    public int b(long j, long j2, byte[] bArr, int i, int i2) {
        n nVar = this.d;
        if (nVar == null || nVar.d() == null || !a(b.a(this.d.d()))) {
            return -1;
        }
        try {
            n nVar2 = this.d;
            com.heytap.accessory.security.wms.a aVarB = b.b(nVar2, j, j2, nVar2.a());
            com.heytap.accessory.base.logging.a.a(f, "decrypting datalen(S) : " + bArr.length + "[" + i + "," + i2 + "]");
            return aVarB.a(bArr, i, i2);
        } catch (com.heytap.accessory.security.wms.e e) {
            com.heytap.accessory.base.logging.a.e(f, "decrypt failed:" + e);
            return -1;
        }
    }

    @Override // com.heytap.accessory.security.f
    public void c() {
        n nVar = this.d;
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
            } catch (com.heytap.accessory.security.wms.e e) {
                com.heytap.accessory.base.logging.a.e(f, "cleanUp failed:" + e);
            }
        }
        this.d.a().clear();
        d();
    }

    public void d() {
        if (this.d.e() != null) {
            this.d.e().a();
        }
    }

    public void e() {
        d();
        this.c.a(this.d.d(), this.e);
    }

    public void f() {
        d();
        this.c.a(this.d.d());
    }

    public l g() {
        return this.b;
    }

    public g h() {
        return this.c;
    }

    public void i() {
        a(this.d.d().l(), b.a().a);
        com.heytap.accessory.base.logging.a.a(f, "sendKscError to remote");
    }

    @Override // com.heytap.accessory.security.f
    public boolean b() {
        return this.b.equals(l.c);
    }

    public n b(com.heytap.accessory.base.bean.b bVar, int i) {
        return b.a(bVar, 1);
    }

    public int b(Buffer buffer) {
        return b.a(buffer, this.d);
    }

    @Override // com.heytap.accessory.security.f
    public int a(long j, long j2, byte[] bArr, int i, int i2) {
        n nVar = this.d;
        if (nVar == null || nVar.d() == null || !a(b.a(this.d.d()))) {
            return -1;
        }
        try {
            n nVar2 = this.d;
            com.heytap.accessory.security.wms.a aVarB = b.b(nVar2, j, j2, nVar2.a());
            com.heytap.accessory.base.logging.a.a(f, "encrypting datalen(S) : " + bArr.length + "[" + i + "," + i2 + "]");
            return aVarB.b(bArr, i, i2);
        } catch (com.heytap.accessory.security.wms.e e) {
            com.heytap.accessory.base.logging.a.e(f, "encrypt failed:" + e);
            return -1;
        }
    }

    @Override // com.heytap.accessory.security.f
    public boolean a(long j, long j2) {
        n nVar = this.d;
        if (nVar != null && nVar.d() != null) {
            c cVar = new c(j, j2);
            com.heytap.accessory.security.wms.a aVarRemove = this.d.a().remove(cVar);
            if (aVarRemove == null) {
                com.heytap.accessory.base.logging.a.e(f, "removeAppCipher failed. cannot find cipher with providerId:" + j + " consumerId:" + j2 + " keyMap:" + this.d.a().keySet());
                return false;
            }
            try {
                com.heytap.accessory.base.logging.a.c(f, "Destroy app key: " + cVar);
                aVarRemove.a();
                return true;
            } catch (com.heytap.accessory.security.wms.e e) {
                com.heytap.accessory.base.logging.a.e(f, "removeAppCipher failed:" + e);
                return false;
            }
        }
        com.heytap.accessory.base.logging.a.b(f, "removeAppCipher failed. store for acc is null");
        return false;
    }

    @Override // com.heytap.accessory.security.f
    public void a(Buffer buffer) {
        l lVar = this.b;
        if (lVar != null) {
            lVar.a(this, buffer);
        }
    }

    @Override // com.heytap.accessory.security.f
    public void a(com.heytap.accessory.message.b bVar) {
        l lVar = this.b;
        if (lVar != null) {
            lVar.a(this, bVar);
        }
    }

    @Override // com.heytap.accessory.security.f
    public void a(int i, int i2) {
        l lVar = this.b;
        if (lVar != null) {
            lVar.a(this, i, i2);
        }
    }

    @Override // com.heytap.accessory.security.f
    public void a() {
        com.heytap.accessory.base.logging.a.b(f, "Authentication message did not come in time. Close the connection!");
        this.e = ConnectConstant.ERROR_CHANNEL_AUTH_TIMEOUT;
        e();
    }

    public void a(l lVar) {
        this.b = lVar;
    }

    public boolean a(String str) {
        if (this.d.b() != null) {
            return true;
        }
        com.heytap.accessory.base.logging.a.b(f, "Security key is null (role : server)");
        return false;
    }

    public int a(int i, @Nullable Buffer buffer) {
        d dVarA = b.a(i, buffer, this.d);
        long jL = this.d.d().l();
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

    public byte a(long j, com.heytap.accessory.message.a aVar) {
        return com.heytap.accessory.connectivity.c.b().a(j, -1L, b.a(j, aVar));
    }
}
