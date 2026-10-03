package com.heytap.accessory.transport.assemble;

import com.heytap.accessory.transport.f;

/* JADX INFO: loaded from: classes14.dex */
public class c implements com.heytap.accessory.transport.acknowledge.b {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final String f2773c = "c";
    public final b a;
    public com.heytap.accessory.message.a b;

    public c(b bVar) {
        this.a = bVar;
    }

    @Override // com.heytap.accessory.transport.acknowledge.b
    public void a() {
    }

    @Override // com.heytap.accessory.transport.acknowledge.b
    public void a(long j2, byte b, com.heytap.accessory.message.a aVar) {
        if (aVar == null || aVar.g() <= 0) {
            com.heytap.accessory.base.logging.a.e(f2773c, "Invalid Payload length received!! ");
            com.heytap.accessory.message.a aVar2 = this.b;
            if (aVar2 != null) {
                aVar2.f().recycle();
                this.b = null;
            }
            if (aVar.f() != null) {
                aVar.f().recycle();
                return;
            }
            return;
        }
        if (b == 0) {
            this.a.a(j2, aVar.j(), aVar);
            return;
        }
        if (1 == b) {
            int iA = f.a(j2, aVar.j());
            com.heytap.accessory.base.logging.a.d(f2773c, "Reassembling FIRST_FRAGMENT, Max SDU Size = " + iA);
            com.heytap.accessory.message.a aVar3 = new com.heytap.accessory.message.a(aVar.j());
            this.b = aVar3;
            aVar3.h(aVar.d());
            this.b.b(aVar.o());
            this.b.a(j2, aVar.f(), iA);
            aVar.f().recycle();
            return;
        }
        if (this.b == null) {
            com.heytap.accessory.base.logging.a.e(f2773c, "Message is null upon receiving fragment " + ((int) b));
            return;
        }
        if (2 == b) {
            com.heytap.accessory.base.logging.a.d(f2773c, "Reassembling MIDDLE_FRAGMENT");
            this.b.a(aVar.f());
            aVar.f().recycle();
        } else if (3 == b) {
            com.heytap.accessory.base.logging.a.d(f2773c, "Reassembling LAST_FRAGMENT");
            this.b.a(aVar.f());
            this.a.a(j2, aVar.j(), this.b);
            aVar.f().recycle();
            this.b = null;
        }
    }

    @Override // com.heytap.accessory.transport.acknowledge.b
    public void a(long j2, long j3, byte b, com.heytap.accessory.message.a aVar) {
        if (aVar == null || aVar.g() <= 0) {
            if (aVar != null) {
                com.heytap.accessory.base.logging.a.e(f2773c, "Invalid Payload length received!! " + aVar.g());
            }
            com.heytap.accessory.message.a aVar2 = this.b;
            if (aVar2 != null) {
                aVar2.f().recycle();
                this.b = null;
            }
            if (aVar != null && aVar.f() != null) {
                aVar.f().recycle();
            }
            com.heytap.accessory.base.logging.a.b(f2773c, "current msg error! will close this session:" + j3);
            this.a.a(j2, j3, null);
            return;
        }
        if (b == 0) {
            this.a.a(j2, aVar.j(), aVar);
            return;
        }
        if (1 == b) {
            int iA = f.a(j2, aVar.j());
            com.heytap.accessory.base.logging.a.d(f2773c, "Reassembling FIRST_FRAGMENT, Max SDU Size = " + iA);
            com.heytap.accessory.message.a aVar3 = new com.heytap.accessory.message.a(aVar.j());
            this.b = aVar3;
            aVar3.h(aVar.d());
            this.b.b(aVar.o());
            this.b.a(j2, aVar.f(), iA);
            aVar.f().recycle();
            return;
        }
        if (this.b == null) {
            com.heytap.accessory.base.logging.a.e(f2773c, "Message is null upon receiving fragment " + ((int) b));
            return;
        }
        if (2 == b) {
            com.heytap.accessory.base.logging.a.d(f2773c, "Reassembling MIDDLE_FRAGMENT");
            this.b.a(aVar.f());
            aVar.f().recycle();
        } else if (3 == b) {
            com.heytap.accessory.base.logging.a.d(f2773c, "Reassembling LAST_FRAGMENT");
            this.b.a(aVar.f());
            this.a.a(j2, aVar.j(), this.b);
            aVar.f().recycle();
            this.b = null;
        }
    }
}
