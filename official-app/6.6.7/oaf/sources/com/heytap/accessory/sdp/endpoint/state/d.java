package com.heytap.accessory.sdp.endpoint.state;

import androidx.annotation.Nullable;
import com.heytap.accessory.connectivity.constant.ConnectConstant;
import com.heytap.accessory.sdp.endpoint.h;
import com.heytap.accessory.utils.buffer.Buffer;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes14.dex */
public class d implements h {
    public static final String h = d.class.getSimpleName() + " - epitrack";
    public boolean a;
    public final com.heytap.accessory.base.bean.b b;
    public final e d;
    public com.heytap.accessory.sdp.endpoint.b g;
    public final Object c = new Object();
    public final List<h.a> e = new ArrayList();
    public c f = c.a;

    public d(e eVar, com.heytap.accessory.base.bean.b bVar) {
        this.d = eVar;
        this.b = bVar;
        bVar.h(2);
    }

    @Override // com.heytap.accessory.sdp.endpoint.h
    public void a(com.heytap.accessory.base.bean.b bVar) {
    }

    public void b(long j, Buffer buffer) {
        this.e.add(new h.a(j, buffer));
    }

    @Override // com.heytap.accessory.sdp.endpoint.h
    public void c() {
        synchronized (this.c) {
            c cVar = this.f;
            if (cVar != null) {
                cVar.c(this);
            }
        }
    }

    public void d() {
        this.d.b(this.b.l());
    }

    public void e() {
        this.d.a(this.b.l());
    }

    public void f() {
        com.heytap.accessory.sdp.endpoint.b bVar = this.g;
        if (bVar != null) {
            this.d.a(this.b, bVar.c(), 2);
        }
    }

    public long g() {
        return this.b.l();
    }

    public c h() {
        c cVar;
        synchronized (this.c) {
            cVar = this.f;
        }
        return cVar;
    }

    public boolean i() {
        return com.heytap.accessory.sdp.endpoint.b.e();
    }

    public void j() {
        if (this.e.size() > 0) {
            com.heytap.accessory.base.logging.a.a(h, "cache size > 0, send messages to mFsm" + this.f);
            for (h.a aVar : this.e) {
                this.f.a(this, aVar.a, aVar.b);
            }
        }
        this.e.clear();
    }

    public void k() {
        com.heytap.accessory.base.bean.b bVar = this.b;
        if (bVar == null) {
            com.heytap.accessory.base.logging.a.b(h, "Accessory is null - cannot update local config");
        } else {
            if (this.g == null) {
                com.heytap.accessory.base.logging.a.b(h, "SelfPd is null - cannot update local config");
                return;
            }
            bVar.g(com.heytap.accessory.sdp.endpoint.b.d().o());
            this.b.b(false);
            com.heytap.accessory.connectivity.core.b.j(this.b);
        }
    }

    public boolean a(byte b, boolean z) {
        return false;
    }

    @Override // com.heytap.accessory.sdp.endpoint.h
    public void b(com.heytap.accessory.base.bean.b bVar) {
        synchronized (this.c) {
            this.f.a(this, bVar);
        }
    }

    @Override // com.heytap.accessory.sdp.endpoint.h
    public int a(long j, Buffer buffer) {
        synchronized (this.c) {
            c cVar = this.f;
            if (cVar == null) {
                return -1;
            }
            return cVar.a(this, j, buffer);
        }
    }

    public void b(com.heytap.accessory.message.b bVar) {
        if (bVar == null) {
            com.heytap.accessory.base.logging.a.b(h, "SendMessage failed, msg is NULL !");
        } else {
            this.d.a(bVar);
        }
    }

    public void c(com.heytap.accessory.base.bean.b bVar) {
        this.d.b(bVar);
    }

    @Nullable
    public com.heytap.accessory.sdp.endpoint.d c(long j, Buffer buffer) {
        try {
            if (buffer == null) {
                com.heytap.accessory.base.logging.a.b(h, "Parsing PD Confirm failed, buffer is NULL !");
                if (buffer != null) {
                    buffer.recycle();
                }
                return null;
            }
            com.heytap.accessory.sdp.endpoint.b bVar = this.g;
            if (bVar == null) {
                com.heytap.accessory.base.logging.a.b(h, "Parsing PD Confirm failed, mSelfPd is NULL !");
                buffer.recycle();
                return null;
            }
            com.heytap.accessory.sdp.endpoint.d dVarA = bVar.a(buffer, 4);
            if (dVarA == null) {
                com.heytap.accessory.base.logging.a.b(h, "Parsing PD Confirm failed, EndpointInfoParams is NULL !");
                buffer.recycle();
                return null;
            }
            if (dVarA.p() != 0) {
                com.heytap.accessory.base.logging.a.c(h, "PD status reject, sending offer message");
                b(j, 1, -1);
                this.a = true;
                k();
                buffer.recycle();
                buffer.recycle();
                return dVarA;
            }
            com.heytap.accessory.base.logging.a.c(h, "PD status accept");
            buffer.recycle();
            buffer.recycle();
            return dVarA;
        } catch (Throwable th) {
            if (buffer != null) {
                buffer.recycle();
            }
            throw th;
        }
    }

    public final void b(long j, int i, int i2) {
        com.heytap.accessory.sdp.endpoint.b bVar = this.g;
        if (bVar == null) {
            com.heytap.accessory.base.logging.a.b(h, "sendMessage failed, mSelfPd is NULL !");
            return;
        }
        com.heytap.accessory.message.a aVarA = bVar.a(i, i2);
        if (aVarA == null) {
            com.heytap.accessory.base.logging.a.e(h, "msg is null");
            synchronized (this.c) {
                this.f.e(this);
            }
            this.d.a(this.b, ConnectConstant.ERROR_DISCOVERY_SELF_PEER_DESCRIPTION_FAILED);
            return;
        }
        com.heytap.accessory.message.b bVar2 = new com.heytap.accessory.message.b(j, aVarA.j());
        bVar2.a(aVarA);
        synchronized (this.c) {
            this.f.a(this, bVar2);
        }
    }

    @Override // com.heytap.accessory.sdp.endpoint.h
    public void a(com.heytap.accessory.message.b bVar) {
        synchronized (this.c) {
            c cVar = this.f;
            if (cVar != null) {
                cVar.g(this);
            }
        }
        bVar.c().f().recycle();
    }

    @Override // com.heytap.accessory.sdp.endpoint.h
    public void a(long j, int i, int i2) {
        synchronized (this.c) {
            c cVar = this.f;
            if (cVar != null) {
                cVar.d(this);
            }
        }
    }

    @Override // com.heytap.accessory.sdp.endpoint.h
    public boolean a() {
        synchronized (this.c) {
            c cVar = this.f;
            if (cVar == null) {
                return false;
            }
            return cVar.e(this);
        }
    }

    @Override // com.heytap.accessory.sdp.endpoint.h
    public com.heytap.accessory.base.bean.b b() {
        return this.b;
    }

    public void a(c cVar) {
        synchronized (this.c) {
            this.f = cVar;
        }
    }

    public com.heytap.accessory.message.b a(int i, int i2, int i3) {
        com.heytap.accessory.sdp.endpoint.b bVar = new com.heytap.accessory.sdp.endpoint.b(i3);
        this.g = bVar;
        com.heytap.accessory.message.a aVarA = bVar.a(i, i2);
        if (aVarA == null) {
            return null;
        }
        com.heytap.accessory.message.b bVar2 = new com.heytap.accessory.message.b(this.b.l(), aVarA.j());
        bVar2.a(aVarA);
        return bVar2;
    }

    public void a(int i) {
        this.d.a(this.b, i);
    }

    public boolean a(Buffer buffer) {
        try {
            com.heytap.accessory.sdp.endpoint.b bVar = this.g;
            if (bVar == null) {
                com.heytap.accessory.base.logging.a.b(h, "Parsing PD Offer failed, mSelfPd is NULL !");
                return false;
            }
            com.heytap.accessory.sdp.endpoint.d dVarA = bVar.a(buffer, 2);
            if (dVarA == null) {
                com.heytap.accessory.base.logging.a.b(h, "Parsing PD Offer failed, parse result is null!");
                a();
                this.d.a(this.b, ConnectConstant.ERROR_DISCOVERY_SELF_PEER_DESCRIPTION_FAILED);
                buffer.recycle();
                return false;
            }
            this.g.b(dVarA);
            this.g.c(dVarA);
            this.g.d(dVarA.l());
            buffer.recycle();
            return true;
        } finally {
            buffer.recycle();
        }
    }
}
