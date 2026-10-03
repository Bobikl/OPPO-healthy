package com.heytap.accessory.transport.acknowledge;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes14.dex */
public class e {
    public static final e a;
    public static final e b;
    public static final e c;
    public static final e d;
    public static final e e;
    public static final String f;
    public static final /* synthetic */ e[] g;

    static {
        a aVar = new a("IDLE", 0);
        a = aVar;
        e eVar = new e("WAIT_TO_SEND_BLOCK_ACK", 1) { // from class: com.heytap.accessory.transport.acknowledge.e.b
            {
                a aVar2 = null;
            }

            @Override // com.heytap.accessory.transport.acknowledge.e
            public void a(f fVar, com.heytap.accessory.misc.utils.d.b bVar) {
                com.heytap.accessory.base.logging.a.a(e.f, "WAIT_TO_SEND_BLOCK_ACK:onDataReceived() sess:" + bVar.g + " seq#:" + bVar.f);
                fVar.i();
                int iC = fVar.c(bVar.f);
                if (iC != 0) {
                    if (iC == 2) {
                        fVar.g();
                        return;
                    }
                    b(fVar);
                    fVar.b(bVar);
                    fVar.f();
                    fVar.h();
                    e.c.a(fVar);
                    return;
                }
                fVar.a(bVar.f);
                if (!fVar.p()) {
                    fVar.c(bVar);
                    fVar.g();
                    return;
                }
                b(fVar);
                fVar.d();
                fVar.b(bVar.f);
                fVar.c(bVar);
                e.a.a(fVar);
            }

            @Override // com.heytap.accessory.transport.acknowledge.e
            public void a(f fVar, Long l) {
                com.heytap.accessory.base.logging.a.a(e.f, "WAIT_TO_SEND_BLOCK_ACK:onTimerExpired() sess:" + fVar.m());
                b(fVar);
                fVar.b(l.longValue());
                e.a.a(fVar);
            }
        };
        b = eVar;
        e eVar2 = new e("NOTIFY_HOLE", 2) { // from class: com.heytap.accessory.transport.acknowledge.e.c
            {
                a aVar2 = null;
            }

            @Override // com.heytap.accessory.transport.acknowledge.e
            public void a(f fVar, com.heytap.accessory.misc.utils.d.b bVar) {
                com.heytap.accessory.base.logging.a.a(e.f, "NOTIFY_HOLE:onDataReceived() sess:" + bVar.g + " seq#:" + bVar.f);
                fVar.j();
                int iC = fVar.c(bVar.f);
                if (iC == 0) {
                    b(fVar);
                    fVar.a(bVar.f);
                    fVar.c(bVar);
                    fVar.a(Long.valueOf(bVar.f));
                    if (fVar.n()) {
                        fVar.b(fVar.l());
                        e.a.a(fVar);
                        return;
                    } else {
                        fVar.g();
                        e.d.a(fVar);
                        return;
                    }
                }
                if (iC == 2) {
                    if (!fVar.o()) {
                        fVar.f();
                        fVar.h();
                        return;
                    } else {
                        b(fVar);
                        fVar.c();
                        e.a.a(fVar);
                        return;
                    }
                }
                if (fVar.o()) {
                    b(fVar);
                    fVar.c();
                    e.a.a(fVar);
                } else {
                    fVar.b(bVar);
                    fVar.f();
                    fVar.h();
                }
            }

            @Override // com.heytap.accessory.transport.acknowledge.e
            public void a(f fVar, Long l) {
                com.heytap.accessory.base.logging.a.a(e.f, "NOTIFY_HOLE:onTimerExpired() sess:" + fVar.m() + "  seq#:" + l);
                if (fVar.o()) {
                    b(fVar);
                    fVar.c();
                    e.a.a(fVar);
                } else {
                    fVar.f();
                    fVar.h();
                }
            }
        };
        c = eVar2;
        e eVar3 = new e("FILL_HOLE", 3) { // from class: com.heytap.accessory.transport.acknowledge.e.d
            {
                a aVar2 = null;
            }

            @Override // com.heytap.accessory.transport.acknowledge.e
            public void a(f fVar, com.heytap.accessory.misc.utils.d.b bVar) {
                com.heytap.accessory.base.logging.a.a(e.f, "FILL_HOLE:onDataReceived() sess:" + bVar.g + " seq#:" + bVar.f);
                fVar.i();
                int iC = fVar.c(bVar.f);
                if (iC != 0) {
                    if (iC == 2) {
                        fVar.g();
                        return;
                    }
                    fVar.b(bVar);
                    fVar.f();
                    fVar.h();
                    e.c.a(fVar);
                    return;
                }
                fVar.a(bVar.f);
                fVar.c(bVar);
                fVar.a(Long.valueOf(bVar.f));
                if (!fVar.n()) {
                    fVar.g();
                    return;
                }
                b(fVar);
                fVar.b(fVar.l());
                e.a.a(fVar);
            }

            @Override // com.heytap.accessory.transport.acknowledge.e
            public void d(f fVar) {
                fVar.e();
            }

            @Override // com.heytap.accessory.transport.acknowledge.e
            public void a(f fVar, Long l) {
                com.heytap.accessory.base.logging.a.a(e.f, "FILL_HOLE:onTimerExpired() sess:" + fVar.m());
                b(fVar);
                fVar.f();
                fVar.h();
                e.c.a(fVar);
            }
        };
        d = eVar3;
        e eVar4 = new e("ENDED", 4) { // from class: com.heytap.accessory.transport.acknowledge.e.e
            {
                a aVar2 = null;
            }

            @Override // com.heytap.accessory.transport.acknowledge.e
            public void d(f fVar) {
                com.heytap.accessory.base.logging.a.d(e.f, "ENDED; Cleanup sess:" + fVar.m());
                fVar.i();
                fVar.j();
                fVar.c();
                fVar.a((e) null);
            }
        };
        e = eVar4;
        g = new e[]{aVar, eVar, eVar2, eVar3, eVar4};
        f = e.class.getSimpleName();
    }

    public e(String str, int i) {
        super(str, i);
    }

    public static e valueOf(String str) {
        return (e) Enum.valueOf(e.class, str);
    }

    public static e[] values() {
        return (e[]) g.clone();
    }

    public void b(f fVar) {
    }

    public void c(f fVar) {
        b(fVar);
        e.a(fVar);
    }

    public void d(f fVar) {
    }

    public /* synthetic */ e(String str, int i, a aVar) {
        this(str, i);
    }

    public void a(f fVar, com.heytap.accessory.misc.utils.d.b bVar) {
        a("onDataReceived", fVar.m());
    }

    public void a(f fVar, Long l) {
        a("onTimerExpired", fVar.m());
    }

    public void a(f fVar) {
        fVar.a(this);
        com.heytap.accessory.base.logging.a.a(f, "SmartAckFsm: Entering state : " + fVar.k());
        d(fVar);
    }

    public final void a(String str, long j) {
        com.heytap.accessory.base.logging.a.b(f, "Illegal State Exception in state: " + name() + " Method :" + str + " SessionId :" + j);
    }

    public final enum a extends e {
        public a(String str, int i) {
            super(str, i, null);
        }

        @Override // com.heytap.accessory.transport.acknowledge.e
        public void a(f fVar, com.heytap.accessory.misc.utils.d.b bVar) {
            com.heytap.accessory.base.logging.a.a(e.f, "IDLE:onDataReceived() sess:" + bVar.g + " seq#:" + bVar.f);
            int iC = fVar.c(bVar.f);
            if (iC == 0) {
                b(fVar);
                fVar.a(bVar.f);
                fVar.c(bVar);
                fVar.g();
                e.b.a(fVar);
                return;
            }
            if (iC == 2) {
                fVar.b(fVar.l());
                return;
            }
            b(fVar);
            fVar.b(bVar);
            fVar.f();
            fVar.h();
            e.c.a(fVar);
        }

        @Override // com.heytap.accessory.transport.acknowledge.e
        public void d(f fVar) {
            fVar.e();
        }

        @Override // com.heytap.accessory.transport.acknowledge.e
        public void a(f fVar, Long l) {
            com.heytap.accessory.base.logging.a.a(e.f, "IDLE:onTimerExpired() sess:" + fVar.m() + " Ignoring...");
        }
    }
}
