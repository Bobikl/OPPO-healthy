package com.heytap.accessory.sdp.endpoint.state;

import com.heytap.accessory.connectivity.constant.ConnectConstant;
import com.heytap.accessory.sdp.endpoint.h;
import com.heytap.accessory.utils.buffer.Buffer;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes14.dex */
public class b implements h {
    public static final String i = b.class.getSimpleName() + " - epitrack";
    public com.heytap.accessory.sdp.endpoint.b b;
    public com.heytap.accessory.base.bean.b c;
    public e e;
    public boolean g;
    public final Object a = new Object();
    public com.heytap.accessory.sdp.endpoint.state.a d = com.heytap.accessory.sdp.endpoint.state.a.a;
    public int f = 0;
    public final List<h.a> h = new ArrayList();

    public class a implements Runnable {
        public final /* synthetic */ com.heytap.accessory.base.bean.b a;

        public a(com.heytap.accessory.base.bean.b bVar) {
            this.a = bVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            b.this.b(this.a);
        }
    }

    public b(e eVar, com.heytap.accessory.base.bean.b bVar) {
        this.c = null;
        this.e = null;
        this.e = eVar;
        this.c = bVar;
        bVar.h(1);
    }

    public boolean a(byte b, boolean z) {
        return true;
    }

    public void b(long j, Buffer buffer) {
        this.h.add(new h.a(j, buffer));
    }

    @Override // com.heytap.accessory.sdp.endpoint.h
    public void c() {
        synchronized (this.a) {
            com.heytap.accessory.sdp.endpoint.state.a aVar = this.d;
            if (aVar != null) {
                aVar.c(this);
            }
        }
    }

    public void d(com.heytap.accessory.base.bean.b bVar) {
        this.e.a(bVar);
    }

    public void e() {
        this.e.a(this.c.l());
    }

    public void f() {
        com.heytap.accessory.sdp.endpoint.b bVar = this.b;
        if (bVar != null) {
            this.e.a(this.c, bVar.c(), 1);
        }
    }

    public com.heytap.accessory.sdp.endpoint.state.a g() {
        com.heytap.accessory.sdp.endpoint.state.a aVar;
        synchronized (this.a) {
            aVar = this.d;
        }
        return aVar;
    }

    public boolean h() {
        return com.heytap.accessory.sdp.endpoint.b.e();
    }

    public void i() {
        this.e.d(this.c);
    }

    public void j() {
        if (this.h.size() > 0) {
            com.heytap.accessory.base.logging.a.a(i, "cache size > 0, send messages to mFsm" + this.d);
            for (h.a aVar : this.h) {
                this.d.a(this, aVar.a, aVar.b);
            }
        }
        this.h.clear();
    }

    public void k() {
        com.heytap.accessory.connectivity.c.b().a(this.c);
    }

    public void l() {
        com.heytap.accessory.base.bean.b bVar = this.c;
        if (bVar == null) {
            com.heytap.accessory.base.logging.a.b(i, "Accessory is null - cannot update local config");
        } else if (this.b == null) {
            com.heytap.accessory.base.logging.a.b(i, "SelfPd is null - cannot update local config");
        } else {
            bVar.g(com.heytap.accessory.sdp.service.b.g().h());
            this.c.b(false);
        }
    }

    @Override // com.heytap.accessory.sdp.endpoint.h
    public void a(com.heytap.accessory.base.bean.b bVar) {
        synchronized (this.a) {
            com.heytap.accessory.base.logging.a.a(i, "pdStateHandler connect Fsm: " + this.d);
            com.heytap.accessory.sdp.endpoint.state.a aVar = this.d;
            if (aVar != null) {
                aVar.b(this, bVar);
            }
        }
    }

    @Override // com.heytap.accessory.sdp.endpoint.h
    public void b(com.heytap.accessory.base.bean.b bVar) {
        int i2;
        synchronized (this.a) {
            com.heytap.accessory.sdp.endpoint.state.a aVar = this.d;
            if (aVar != null && aVar != com.heytap.accessory.sdp.endpoint.state.a.c && (i2 = this.f) <= 20) {
                this.f = i2 + 1;
                com.heytap.accessory.base.logging.a.e(i, "Current State :" + this.d + " Expected State : WAITING_FOR_PD Retry Count: " + this.f);
                com.heytap.accessory.connectivity.core.b.d().postDelayed(new a(bVar), 500L);
                return;
            }
            bVar.a(this.c.l());
            com.heytap.accessory.sdp.endpoint.state.a aVar2 = this.d;
            if (aVar2 != null) {
                aVar2.a(this, bVar);
            } else {
                e(bVar);
                e();
            }
        }
    }

    public void d() {
        this.e.b(this.c.l());
    }

    public void e(com.heytap.accessory.base.bean.b bVar) {
        this.e.b(bVar);
    }

    public void d(long j, Buffer buffer) {
        int i2 = 0;
        this.g = false;
        try {
            com.heytap.accessory.sdp.endpoint.b bVar = this.b;
            if (bVar == null) {
                com.heytap.accessory.base.logging.a.b(i, "Parsing PD Probe_3_3 failed, mSelfPd is NULL !");
                return;
            }
            com.heytap.accessory.sdp.endpoint.d dVarA = bVar.a(buffer, 3);
            if (dVarA == null) {
                com.heytap.accessory.base.logging.a.b(i, "EPI_PROBE parsing failed");
                a();
                this.e.a(this.c, ConnectConstant.ERROR_DISCOVERY_SELF_PEER_DESCRIPTION_FAILED);
                buffer.recycle();
                return;
            }
            com.heytap.accessory.base.bean.b bVarD = com.heytap.accessory.connectivity.core.b.d(dVarA.j(), this.c.h(), this.c.F());
            this.c.b(bVarD != null);
            if (this.c.J() && !h()) {
                com.heytap.accessory.base.logging.a.c(i, "PD status accept, sending accept message");
                this.c.g(dVarA.j());
            } else {
                if (!this.c.J()) {
                    com.heytap.accessory.base.logging.a.c(i, "PD status reject, sending reject no cache message");
                    i2 = 3;
                } else {
                    com.heytap.accessory.base.logging.a.c(i, "PD status reject, sending reject config change message");
                    this.g = true;
                    l();
                    i2 = 5;
                }
                if (bVarD != null) {
                    com.heytap.accessory.connectivity.core.b.j(bVarD);
                }
            }
            b(j, 4, i2);
            buffer.recycle();
        } finally {
            buffer.recycle();
        }
    }

    public void c(com.heytap.accessory.base.bean.b bVar) {
        this.e.c(bVar);
    }

    public void c(long j, Buffer buffer) {
        this.g = true;
        try {
            com.heytap.accessory.sdp.endpoint.b bVar = this.b;
            if (bVar == null) {
                com.heytap.accessory.base.logging.a.b(i, "Parsing PD Offer_3_3 failed, mSelfPd is NULL !");
                return;
            }
            com.heytap.accessory.sdp.endpoint.d dVarA = bVar.a(buffer, 1);
            if (dVarA == null) {
                com.heytap.accessory.base.logging.a.b(i, "EPI_OFFER parsing failed");
                a();
                this.e.a(this.c, ConnectConstant.ERROR_DISCOVERY_SELF_PEER_DESCRIPTION_FAILED);
                buffer.recycle();
                return;
            }
            byte bD = dVarA.d();
            if (com.heytap.accessory.sdk.accessorymanager.a.a(this.c.h())) {
                if (!a(bD, true)) {
                    buffer.recycle();
                    return;
                }
                this.c.a(true);
            }
            l();
            com.heytap.accessory.base.logging.a.c(i, "Parsing PD offer, sending answer message");
            this.b.b(dVarA);
            b(j, 2, -1);
            this.b.c(dVarA);
            this.b.d(dVarA.l());
            com.heytap.accessory.base.bean.b bVarD = com.heytap.accessory.connectivity.core.b.d(dVarA.j(), this.c.h(), this.c.F());
            if (bVarD != null) {
                com.heytap.accessory.connectivity.core.b.j(bVarD);
            }
            buffer.recycle();
        } finally {
            buffer.recycle();
        }
    }

    @Override // com.heytap.accessory.sdp.endpoint.h
    public int a(long j, Buffer buffer) {
        synchronized (this.a) {
            com.heytap.accessory.sdp.endpoint.state.a aVar = this.d;
            if (aVar == null) {
                return -1;
            }
            return aVar.a(this, j, buffer);
        }
    }

    @Override // com.heytap.accessory.sdp.endpoint.h
    public void a(com.heytap.accessory.message.b bVar) {
        synchronized (this.a) {
            com.heytap.accessory.sdp.endpoint.state.a aVar = this.d;
            if (aVar != null) {
                aVar.a(this, bVar);
            }
        }
        bVar.c().f().recycle();
    }

    public void b(com.heytap.accessory.message.b bVar) {
        this.e.a(bVar);
    }

    public final void b(long j, int i2, int i3) {
        com.heytap.accessory.sdp.endpoint.b bVar = this.b;
        if (bVar == null) {
            com.heytap.accessory.base.logging.a.b(i, "sendMessage failed, mSelfPd is NULL !");
            return;
        }
        com.heytap.accessory.message.a aVarA = bVar.a(i2, i3);
        if (aVarA == null) {
            com.heytap.accessory.base.logging.a.e(i, "msg is null");
            synchronized (this.a) {
                this.d.d(this);
            }
            this.e.a(this.c, ConnectConstant.ERROR_DISCOVERY_SELF_PEER_DESCRIPTION_FAILED);
            return;
        }
        com.heytap.accessory.message.b bVar2 = new com.heytap.accessory.message.b(j, aVarA.j());
        bVar2.a(aVarA);
        synchronized (this.a) {
            this.d.b(this, bVar2);
        }
    }

    @Override // com.heytap.accessory.sdp.endpoint.h
    public void a(long j, int i2, int i3) {
        synchronized (this.a) {
            com.heytap.accessory.sdp.endpoint.state.a aVar = this.d;
            if (aVar != null) {
                aVar.a(this, j, i2, i3);
            }
        }
    }

    @Override // com.heytap.accessory.sdp.endpoint.h
    public boolean a() {
        synchronized (this.a) {
            com.heytap.accessory.sdp.endpoint.state.a aVar = this.d;
            if (aVar == null) {
                return false;
            }
            return aVar.d(this);
        }
    }

    public void a(com.heytap.accessory.sdp.endpoint.state.a aVar) {
        synchronized (this.a) {
            this.d = aVar;
        }
    }

    public void a(int i2) {
        this.e.a(this.c, i2);
    }

    public boolean a(byte b, boolean z, int i2) {
        String str = i;
        com.heytap.accessory.base.logging.a.d(str, "Creating a PD Object, MsgType : " + ((int) b));
        if (b >= 1 && b <= 4) {
            this.b = new com.heytap.accessory.sdp.endpoint.b(i2);
            return true;
        }
        com.heytap.accessory.base.logging.a.b(str, "Received Unsupported MessageType : " + ((int) b));
        return false;
    }

    @Override // com.heytap.accessory.sdp.endpoint.h
    public com.heytap.accessory.base.bean.b b() {
        return this.c;
    }
}
