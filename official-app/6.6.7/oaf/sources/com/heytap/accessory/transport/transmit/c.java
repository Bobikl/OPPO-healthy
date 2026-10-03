package com.heytap.accessory.transport.transmit;

import java.util.List;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes14.dex */
public class c {
    public static final c a;
    public static final c b;
    public static final c c;
    public static final String d;
    public static final /* synthetic */ c[] e;

    public final enum a extends c {
        public a(String str, int i) {
            super(str, i, null);
        }

        @Override // com.heytap.accessory.transport.transmit.c
        public void a(com.heytap.accessory.transport.transmit.d dVar, com.heytap.accessory.misc.utils.d.b bVar) {
            com.heytap.accessory.base.logging.a.d(c.d, "IDLE:Duplicate Ack Received sess:" + bVar.g);
        }

        @Override // com.heytap.accessory.transport.transmit.c
        public int b(com.heytap.accessory.transport.transmit.d dVar, com.heytap.accessory.message.b bVar) {
            com.heytap.accessory.base.logging.a.d(c.d, "IDLE:onSendMessage() sess:" + bVar.e() + " seq#:" + bVar.c().i());
            int iE = dVar.e(bVar.c().i());
            if (iE == 0) {
                dVar.a(bVar);
                return dVar.c(bVar);
            }
            com.heytap.accessory.base.logging.a.b(c.d, "IDLE:onSendMessage() received unexpected packet:" + iE);
            dVar.a(true, bVar.i());
            return 1;
        }

        @Override // com.heytap.accessory.transport.transmit.c
        public void a(com.heytap.accessory.transport.transmit.d dVar, com.heytap.accessory.message.b bVar) {
            com.heytap.accessory.base.logging.a.d(c.d, "IDLE:onMessageDispatched() sess:" + bVar.e());
            b(dVar);
            if (dVar.d(bVar.c().i()) != 0) {
                dVar.a(!dVar.l(), bVar.i());
                return;
            }
            dVar.g();
            dVar.a(!dVar.l(), bVar.i());
            c.b.a(dVar);
        }
    }

    public static /* synthetic */ class d {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[com.heytap.accessory.misc.constants.a.values().length];
            a = iArr;
            try {
                iArr[com.heytap.accessory.misc.constants.a.c.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[com.heytap.accessory.misc.constants.a.d.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    static {
        a aVar = new a("IDLE", 0);
        a = aVar;
        c cVar = new c("WAITING_FOR_BLOCK_ACK", 1) { // from class: com.heytap.accessory.transport.transmit.c.b
            {
                a aVar2 = null;
            }

            @Override // com.heytap.accessory.transport.transmit.c
            public void a(com.heytap.accessory.transport.transmit.d dVar, com.heytap.accessory.misc.utils.d.b bVar) {
                com.heytap.accessory.base.logging.a.d(c.d, "WAITING_FOR_BLOCK_ACK:onAckReceived() sess:" + bVar.g);
                List<com.heytap.accessory.misc.utils.d.a> list = bVar.a;
                long jB = list.get(0).b();
                int i = d.a[bVar.b.ordinal()];
                if (i != 1) {
                    if (i != 2) {
                        return;
                    }
                    dVar.h();
                    dVar.a(dVar.c(jB), dVar.a(list));
                    return;
                }
                if (dVar.f(jB)) {
                    return;
                }
                dVar.a(dVar.b(jB), (List<com.heytap.accessory.message.b>) null);
                if (dVar.k()) {
                    b(dVar);
                    dVar.h();
                    c.a.a(dVar);
                }
            }

            @Override // com.heytap.accessory.transport.transmit.c
            public int b(com.heytap.accessory.transport.transmit.d dVar, com.heytap.accessory.message.b bVar) {
                com.heytap.accessory.base.logging.a.d(c.d, "WAITING_FOR_BLOCK_ACK:onSendMessage() sess:" + bVar.e() + " seq#:" + bVar.c().i());
                long jI = bVar.c().i();
                int iE = dVar.e(jI);
                if (iE == 0) {
                    dVar.h();
                    dVar.a(bVar);
                    return dVar.c(bVar);
                }
                if (iE != 1) {
                    com.heytap.accessory.base.logging.a.b(c.d, "WAITING_FOR_BLOCK_ACK:onSendMessage() received unexpected packet:" + iE);
                    dVar.a(true, bVar.i());
                    return 1;
                }
                if (!dVar.g(jI)) {
                    com.heytap.accessory.base.logging.a.b(c.d, "RETRANSMIT packet isn't in my Window !");
                    dVar.a(!dVar.l(), bVar.i());
                    return 1;
                }
                dVar.h();
                if (dVar.h(jI)) {
                    return dVar.c(bVar);
                }
                b(dVar);
                dVar.f();
                c.a.a(dVar);
                return 1;
            }

            @Override // com.heytap.accessory.transport.transmit.c
            public void a(com.heytap.accessory.transport.transmit.d dVar, long j) {
                com.heytap.accessory.base.logging.a.d(c.d, "WAITING_FOR_BLOCK_ACK:onTimerExpired() sess:" + j);
                dVar.a((List<com.heytap.accessory.message.b>) null, dVar.e());
            }

            @Override // com.heytap.accessory.transport.transmit.c
            public void a(com.heytap.accessory.transport.transmit.d dVar, com.heytap.accessory.message.b bVar) {
                boolean zL;
                int iD = dVar.d(bVar.c().i());
                com.heytap.accessory.base.logging.a.d(c.d, "WAITING_FOR_BLOCK_ACK:onMessageDispatched() sess:" + bVar.e() + " status:" + iD);
                if (iD == 0) {
                    zL = dVar.l();
                } else {
                    if (iD == 1) {
                        dVar.b(bVar);
                    }
                    zL = false;
                }
                dVar.g();
                dVar.a(!zL, bVar.i());
            }
        };
        b = cVar;
        c cVar2 = new c("ENDED", 2) { // from class: com.heytap.accessory.transport.transmit.c.c
            {
                a aVar2 = null;
            }

            @Override // com.heytap.accessory.transport.transmit.c
            public void d(com.heytap.accessory.transport.transmit.d dVar) {
                dVar.h();
                dVar.d();
                dVar.a((c) null);
            }
        };
        c = cVar2;
        e = new c[]{aVar, cVar, cVar2};
        d = c.class.getSimpleName();
    }

    public c(String str, int i) {
        super(str, i);
    }

    public static c valueOf(String str) {
        return (c) Enum.valueOf(c.class, str);
    }

    public static c[] values() {
        return (c[]) e.clone();
    }

    public void b(com.heytap.accessory.transport.transmit.d dVar) {
    }

    public void c(com.heytap.accessory.transport.transmit.d dVar) {
        b(dVar);
        c.a(dVar);
    }

    public void d(com.heytap.accessory.transport.transmit.d dVar) {
    }

    public /* synthetic */ c(String str, int i, a aVar) {
        this(str, i);
    }

    public void a(com.heytap.accessory.transport.transmit.d dVar, com.heytap.accessory.misc.utils.d.b bVar) {
        a("onAckReceived", dVar.j());
    }

    public int b(com.heytap.accessory.transport.transmit.d dVar, com.heytap.accessory.message.b bVar) {
        a("onSendMessage", dVar.j());
        return 1;
    }

    public void a(com.heytap.accessory.transport.transmit.d dVar, long j) {
        a("onTimerExpired", dVar.j());
    }

    public void a(com.heytap.accessory.transport.transmit.d dVar, com.heytap.accessory.message.b bVar) {
        a("onMessageDispatched", dVar.j());
    }

    public void a(com.heytap.accessory.transport.transmit.d dVar) {
        dVar.a(this);
        com.heytap.accessory.base.logging.a.a(d, "SmartRetransmitFsm: Entering state : " + dVar.i());
        d(dVar);
    }

    public final void a(String str, long j) {
        com.heytap.accessory.base.logging.a.b(d, "Illegal State Exception in state: " + name() + " Method :" + str + " SessionId :" + j);
    }
}
