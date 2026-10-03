package com.heytap.accessory.sdp.endpoint.state;

import com.heytap.accessory.connectivity.constant.ConnectConstant;
import com.heytap.accessory.misc.utils.g;
import com.heytap.accessory.utils.buffer.Buffer;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes14.dex */
public class c {
    public static final c a;
    public static final c b;
    public static final c c;
    public static final c d;
    public static final c e;
    public static final c f;
    public static String g;
    public static final /* synthetic */ c[] h;

    static {
        a aVar = new a("IDLE", 0);
        a = aVar;
        c cVar = new c("WAIT_FOR_EPI_PROBE_CONFIRM", 1) { // from class: com.heytap.accessory.sdp.endpoint.state.c.b
            {
                a aVar2 = null;
            }

            @Override // com.heytap.accessory.sdp.endpoint.state.c
            public int a(com.heytap.accessory.sdp.endpoint.state.d dVar, long j, Buffer buffer) {
                byte bA = com.heytap.accessory.sdp.endpoint.f.a(buffer);
                com.heytap.accessory.base.logging.a.c(c.g, "Server receive a probe answer. " + j + ", " + ((int) bA));
                if (bA != 4) {
                    com.heytap.accessory.base.logging.a.b(c.g, "Received unsupported message type : " + ((int) bA));
                    return -1;
                }
                if (dVar == null) {
                    com.heytap.accessory.base.logging.a.b(c.g, "pdStateHandler is null, return...");
                    return 0;
                }
                com.heytap.accessory.sdp.endpoint.d dVarC = dVar.c(j, buffer);
                if (dVarC == null || dVarC.p() != 0) {
                    return 0;
                }
                b(dVar);
                c.d.a(dVar);
                return 0;
            }

            @Override // com.heytap.accessory.sdp.endpoint.state.c
            public void g(com.heytap.accessory.sdp.endpoint.state.d dVar) {
                com.heytap.accessory.base.logging.a.c(c.g, "onMessageDispatched waiting for pd offer");
                b(dVar);
                c.c.a(dVar);
            }

            @Override // com.heytap.accessory.sdp.endpoint.state.c
            public void a(com.heytap.accessory.sdp.endpoint.state.d dVar, com.heytap.accessory.message.b bVar) {
                dVar.b(bVar);
            }
        };
        b = cVar;
        c cVar2 = new c("WAIT_FOR_EPI_OFFER_ANSWER", 2) { // from class: com.heytap.accessory.sdp.endpoint.state.c.c
            {
                a aVar2 = null;
            }

            @Override // com.heytap.accessory.sdp.endpoint.state.c
            public int a(com.heytap.accessory.sdp.endpoint.state.d dVar, long j, Buffer buffer) {
                com.heytap.accessory.base.logging.a.c(c.g, "Server received a offer answer");
                if (dVar.a(buffer)) {
                    b(dVar);
                    c.d.a(dVar);
                    return 0;
                }
                b(dVar);
                c.e.a(dVar);
                return 0;
            }
        };
        c = cVar2;
        c cVar3 = new c("PD_SUCCESS", 3) { // from class: com.heytap.accessory.sdp.endpoint.state.c.d
            {
                a aVar2 = null;
            }

            @Override // com.heytap.accessory.sdp.endpoint.state.c
            public void f(com.heytap.accessory.sdp.endpoint.state.d dVar) {
                if (dVar.b() != null) {
                    g.a(dVar.b().d(), dVar.a ? "EPI_OFFER" : "EPI_PROBE");
                }
                dVar.f();
            }
        };
        d = cVar3;
        c cVar4 = new c("PD_ERROR", 4) { // from class: com.heytap.accessory.sdp.endpoint.state.c.e
            {
                a aVar2 = null;
            }

            @Override // com.heytap.accessory.sdp.endpoint.state.c
            public int a(com.heytap.accessory.sdp.endpoint.state.d dVar, long j, Buffer buffer) {
                com.heytap.accessory.base.logging.a.a(c.g, "PD Server : onMessageReceived state : " + dVar.h());
                return -1;
            }

            @Override // com.heytap.accessory.sdp.endpoint.state.c
            public void d(com.heytap.accessory.sdp.endpoint.state.d dVar) {
                com.heytap.accessory.base.logging.a.a(c.g, "PD Server : onConnectionStateChanged state : " + dVar.h());
                b(dVar);
                dVar.a(ConnectConstant.ERROR_DISCOVERY_SELF_PEER_DESCRIPTION_FAILED);
                c.f.a(dVar);
            }

            @Override // com.heytap.accessory.sdp.endpoint.state.c
            public void f(com.heytap.accessory.sdp.endpoint.state.d dVar) {
                com.heytap.accessory.base.logging.a.a(c.g, "PD Server : Entering state : " + dVar.h());
            }
        };
        e = cVar4;
        c cVar5 = new c("ENDED", 5) { // from class: com.heytap.accessory.sdp.endpoint.state.c.f
            {
                a aVar2 = null;
            }

            @Override // com.heytap.accessory.sdp.endpoint.state.c
            public void f(com.heytap.accessory.sdp.endpoint.state.d dVar) {
                dVar.d();
                dVar.a((c) null);
            }
        };
        f = cVar5;
        h = new c[]{aVar, cVar, cVar2, cVar3, cVar4, cVar5};
        g = c.class.getSimpleName() + " - epitrack";
    }

    public c(String str, int i) {
        super(str, i);
    }

    public static c valueOf(String str) {
        return (c) Enum.valueOf(c.class, str);
    }

    public static c[] values() {
        return (c[]) h.clone();
    }

    public void a(com.heytap.accessory.sdp.endpoint.state.d dVar, com.heytap.accessory.base.bean.b bVar) {
    }

    public void b(com.heytap.accessory.sdp.endpoint.state.d dVar) {
        com.heytap.accessory.base.logging.a.a(g, "PD Server Exiting state: " + dVar.h() + " AccessoryId: " + dVar.g());
    }

    public void c(com.heytap.accessory.sdp.endpoint.state.d dVar) {
        b(dVar);
        f.a(dVar);
    }

    public void d(com.heytap.accessory.sdp.endpoint.state.d dVar) {
        b(dVar);
        dVar.a(ConnectConstant.ERROR_DISCOVERY_BT_SOCKET_READ_WRITE_FAILED);
        f.a(dVar);
    }

    public boolean e(com.heytap.accessory.sdp.endpoint.state.d dVar) {
        if (dVar.b().A() != 3) {
            return false;
        }
        b(dVar);
        dVar.e();
        f.a(dVar);
        return true;
    }

    public void f(com.heytap.accessory.sdp.endpoint.state.d dVar) {
    }

    public void g(com.heytap.accessory.sdp.endpoint.state.d dVar) {
    }

    public /* synthetic */ c(String str, int i, a aVar) {
        this(str, i);
    }

    public void a(com.heytap.accessory.sdp.endpoint.state.d dVar, com.heytap.accessory.message.b bVar) {
    }

    public void a(com.heytap.accessory.sdp.endpoint.state.d dVar) {
        dVar.a(this);
        if (dVar.h() != null) {
            com.heytap.accessory.base.logging.a.a(g, "PD Server Entering state: " + dVar.h() + " AccessoryId: " + dVar.g());
        }
        f(dVar);
    }

    public int a(com.heytap.accessory.sdp.endpoint.state.d dVar, long j, Buffer buffer) {
        com.heytap.accessory.base.logging.a.e(g, "PD Server : calling default implementation onMessageReceived");
        return -1;
    }

    public final enum a extends c {
        public a(String str, int i) {
            super(str, i, null);
        }

        @Override // com.heytap.accessory.sdp.endpoint.state.c
        public void a(com.heytap.accessory.sdp.endpoint.state.d dVar, com.heytap.accessory.base.bean.b bVar) {
            com.heytap.accessory.message.b bVarA;
            com.heytap.accessory.base.logging.a.c(c.g, "Server accept a connection: " + bVar.l() + ", getVersion: " + bVar.H() + ", isCached: " + bVar.J());
            dVar.c(bVar);
            if (com.heytap.accessory.sdk.accessorymanager.a.a(bVar.h())) {
                if (!dVar.a(bVar.i(), false)) {
                    return;
                } else {
                    bVar.a(true);
                }
            }
            if (dVar.i()) {
                bVarA = dVar.a(1, -1, bVar.h());
                dVar.k();
                dVar.a = true;
            } else {
                bVarA = dVar.a(3, -1, bVar.h());
                dVar.a = false;
            }
            String str = dVar.a ? "EPI_OFFER" : "EPI_PROBE";
            com.heytap.accessory.base.logging.a.c(c.g, "Server compose a " + str + " msg");
            dVar.b(bVarA);
        }

        @Override // com.heytap.accessory.sdp.endpoint.state.c
        public void g(com.heytap.accessory.sdp.endpoint.state.d dVar) {
            com.heytap.accessory.base.logging.a.a(c.g, "onMessageDispatched() " + dVar.h() + " mIsOfferSent:" + dVar.a);
            b(dVar);
            if (dVar.a) {
                c.c.a(dVar);
            } else {
                c.b.a(dVar);
            }
            dVar.j();
        }

        @Override // com.heytap.accessory.sdp.endpoint.state.c
        public int a(com.heytap.accessory.sdp.endpoint.state.d dVar, long j, Buffer buffer) {
            com.heytap.accessory.base.logging.a.a(c.g, "cache the message, now state is " + dVar.h());
            dVar.b(j, buffer);
            return -1;
        }
    }
}
