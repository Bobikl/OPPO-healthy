package com.heytap.accessory.sdp.endpoint.state;

import com.heytap.accessory.connectivity.constant.ConnectConstant;
import com.heytap.accessory.utils.buffer.Buffer;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes14.dex */
public class a {
    public static final a a;
    public static final a b;
    public static final a c;
    public static final a d;
    public static final a e;
    public static final a f;
    public static final a g;
    public static String h;
    public static final /* synthetic */ a[] i;

    public final enum a extends a {
        public a(String str, int i) {
            super(str, i, null);
        }

        @Override // com.heytap.accessory.sdp.endpoint.state.a
        public void b(com.heytap.accessory.sdp.endpoint.state.b bVar, com.heytap.accessory.base.bean.b bVar2) {
            com.heytap.accessory.base.bean.b bVarC = com.heytap.accessory.connectivity.core.b.c(bVar2.d(), bVar2.h(), bVar2.F());
            if (bVarC != null && bVarC.J() && com.heytap.accessory.sdk.accessorymanager.a.a(bVarC.h())) {
                if (!bVar.a(bVarC.i(), false)) {
                    com.heytap.accessory.base.logging.a.b(a.h, "onConnectionRequest() category Error for accessory " + bVar2.l());
                    return;
                }
                bVar2.a(true);
            }
            b(bVar);
            com.heytap.accessory.base.logging.a.c(a.h, "Client start connect server: " + bVar2.k());
            bVar.c(bVar2);
            com.heytap.accessory.misc.utils.g.h(bVar2.d());
            a.b.a(bVar);
        }
    }

    static {
        a aVar = new a("IDLE", 0);
        a = aVar;
        a aVar2 = new a("CONNECTING", 1) { // from class: com.heytap.accessory.sdp.endpoint.state.a.b
            {
                a aVar3 = null;
            }

            @Override // com.heytap.accessory.sdp.endpoint.state.a
            public void a(com.heytap.accessory.sdp.endpoint.state.b bVar, long j, int i2, int i3) {
                b(bVar);
                String str = a.h;
                StringBuilder sb = new StringBuilder();
                sb.append("Client Connection State Changed. active:");
                sb.append(i2 == 2);
                com.heytap.accessory.base.logging.a.c(str, sb.toString());
                if (i2 == 2) {
                    com.heytap.accessory.base.bean.b bVarB = bVar.b();
                    if (bVarB != null) {
                        com.heytap.accessory.misc.utils.g.b(bVarB.d());
                    }
                    a.c.a(bVar);
                } else {
                    super.a(bVar, j, i2, i3);
                }
                bVar.j();
            }

            @Override // com.heytap.accessory.sdp.endpoint.state.a
            public int a(com.heytap.accessory.sdp.endpoint.state.b bVar, long j, Buffer buffer) {
                com.heytap.accessory.base.logging.a.a(a.h, "cache the message, now state is " + bVar.g());
                bVar.b(j, buffer);
                return -1;
            }
        };
        b = aVar2;
        a aVar3 = new a("WAITING_FOR_EPI", 2) { // from class: com.heytap.accessory.sdp.endpoint.state.a.c
            {
                a aVar4 = null;
            }

            @Override // com.heytap.accessory.sdp.endpoint.state.a
            public int a(com.heytap.accessory.sdp.endpoint.state.b bVar, long j, Buffer buffer) {
                bVar.i();
                byte bA = com.heytap.accessory.sdp.endpoint.f.a(buffer);
                if (!bVar.a(bA, false, bVar.b().h())) {
                    com.heytap.accessory.base.logging.a.b(a.h, "epi error. create epi failed");
                    return -1;
                }
                if (bA == 3) {
                    com.heytap.accessory.base.logging.a.d(a.h, "Client receive a probe epi request " + j + ", messageType: " + ((int) bA));
                    bVar.d(j, buffer);
                } else {
                    if (bA != 1) {
                        com.heytap.accessory.base.logging.a.b(a.h, "Received unsupported message type : " + ((int) bA));
                        return -1;
                    }
                    com.heytap.accessory.base.logging.a.d(a.h, "Client receive a offer epi request " + j + ", messageType: " + ((int) bA));
                    bVar.c(j, buffer);
                }
                return 0;
            }

            @Override // com.heytap.accessory.sdp.endpoint.state.a
            public void b(com.heytap.accessory.sdp.endpoint.state.b bVar, com.heytap.accessory.message.b bVar2) {
                int iB = com.heytap.accessory.sdp.endpoint.f.b(bVar2.c().f());
                com.heytap.accessory.base.logging.a.a(a.h, "WAITING_FOR_PD onSendMessage > getProtocolVersion() : " + iB);
                bVar.b(bVar2);
            }

            @Override // com.heytap.accessory.sdp.endpoint.state.a
            public void a(com.heytap.accessory.sdp.endpoint.state.b bVar, com.heytap.accessory.message.b bVar2) {
                com.heytap.accessory.base.logging.a.a(a.h, "onMessageDispatched() " + bVar2.a());
                b(bVar);
                Buffer bufferF = bVar2.c().f();
                byte bA = com.heytap.accessory.sdp.endpoint.f.a(bufferF);
                int iB = com.heytap.accessory.sdp.endpoint.f.b(bufferF);
                com.heytap.accessory.base.logging.a.a(a.h, "WAITING_FOR_PD > getProtocolVersion() : " + iB);
                if (bA != 4) {
                    if (bA != 2) {
                        com.heytap.accessory.base.logging.a.b(a.h, "Received unsupported message type : " + ((int) bA));
                        return;
                    }
                    a.d.a(bVar);
                    return;
                }
                byte bC = com.heytap.accessory.sdp.endpoint.f.c(bufferF);
                com.heytap.accessory.base.logging.a.a(a.h, "statusCode==" + ((int) bC));
                if (bC == 0) {
                    a.d.a(bVar);
                } else {
                    a.e.a(bVar);
                }
            }
        };
        c = aVar3;
        a aVar4 = new a("PD_SUCCESS", 3) { // from class: com.heytap.accessory.sdp.endpoint.state.a.d
            {
                a aVar5 = null;
            }

            @Override // com.heytap.accessory.sdp.endpoint.state.a
            public void e(com.heytap.accessory.sdp.endpoint.state.b bVar) {
                if (bVar.b() != null) {
                    com.heytap.accessory.misc.utils.g.a(bVar.b().d(), bVar.g ? "EPI_OFFER" : "EPI_PROBE");
                }
                bVar.f();
            }
        };
        d = aVar4;
        a aVar5 = new a("WAITING_FOR_PD_OFFER_3_3", 4) { // from class: com.heytap.accessory.sdp.endpoint.state.a.e
            {
                a aVar6 = null;
            }

            @Override // com.heytap.accessory.sdp.endpoint.state.a
            public int a(com.heytap.accessory.sdp.endpoint.state.b bVar, long j, Buffer buffer) {
                byte bA = com.heytap.accessory.sdp.endpoint.f.a(buffer);
                if (bA == 1) {
                    bVar.c(j, buffer);
                    return 0;
                }
                com.heytap.accessory.base.logging.a.b(a.h, "Received unsupported message type : " + ((int) bA));
                return -1;
            }

            @Override // com.heytap.accessory.sdp.endpoint.state.a
            public void b(com.heytap.accessory.sdp.endpoint.state.b bVar, com.heytap.accessory.message.b bVar2) {
                bVar.b(bVar2);
            }

            @Override // com.heytap.accessory.sdp.endpoint.state.a
            public void a(com.heytap.accessory.sdp.endpoint.state.b bVar, com.heytap.accessory.message.b bVar2) {
                byte bA = com.heytap.accessory.sdp.endpoint.f.a(bVar2.c().f());
                if (bA != 2) {
                    com.heytap.accessory.base.logging.a.b(a.h, "Received unsupported message type : " + ((int) bA));
                    return;
                }
                b(bVar);
                a.d.a(bVar);
            }
        };
        e = aVar5;
        a aVar6 = new a("PD_ERROR", 5) { // from class: com.heytap.accessory.sdp.endpoint.state.a.f
            {
                a aVar7 = null;
            }

            @Override // com.heytap.accessory.sdp.endpoint.state.a
            public int a(com.heytap.accessory.sdp.endpoint.state.b bVar, long j, Buffer buffer) {
                com.heytap.accessory.base.logging.a.a(a.h, "PD Client : onMessageReceived state : " + bVar.g());
                return -1;
            }

            @Override // com.heytap.accessory.sdp.endpoint.state.a
            public void e(com.heytap.accessory.sdp.endpoint.state.b bVar) {
                com.heytap.accessory.base.logging.a.a(a.h, "PD Client : Entering state : " + bVar.g());
            }

            @Override // com.heytap.accessory.sdp.endpoint.state.a
            public void a(com.heytap.accessory.sdp.endpoint.state.b bVar, long j, int i2, int i3) {
                com.heytap.accessory.base.logging.a.a(a.h, "PD Client : onConnectionStateChanged state : " + bVar.g());
                b(bVar);
                bVar.a(ConnectConstant.ERROR_DISCOVERY_SELF_PEER_DESCRIPTION_FAILED);
                a.g.a(bVar);
            }
        };
        f = aVar6;
        a aVar7 = new a("ENDED", 6) { // from class: com.heytap.accessory.sdp.endpoint.state.a.g
            {
                a aVar8 = null;
            }

            @Override // com.heytap.accessory.sdp.endpoint.state.a
            public void e(com.heytap.accessory.sdp.endpoint.state.b bVar) {
                bVar.d();
                bVar.a((a) null);
            }
        };
        g = aVar7;
        i = new a[]{aVar, aVar2, aVar3, aVar4, aVar5, aVar6, aVar7};
        h = a.class.getSimpleName() + " - epitrack";
    }

    public a(String str, int i2) {
        super(str, i2);
    }

    public static a valueOf(String str) {
        return (a) Enum.valueOf(a.class, str);
    }

    public static a[] values() {
        return (a[]) i.clone();
    }

    public void a(com.heytap.accessory.sdp.endpoint.state.b bVar, com.heytap.accessory.message.b bVar2) {
    }

    public void b(com.heytap.accessory.sdp.endpoint.state.b bVar) {
    }

    public void c(com.heytap.accessory.sdp.endpoint.state.b bVar) {
        b(bVar);
        g.a(bVar);
    }

    public boolean d(com.heytap.accessory.sdp.endpoint.state.b bVar) {
        if (bVar.b().A() != 3) {
            return false;
        }
        b(bVar);
        bVar.e();
        g.a(bVar);
        return true;
    }

    public void e(com.heytap.accessory.sdp.endpoint.state.b bVar) {
    }

    public /* synthetic */ a(String str, int i2, a aVar) {
        this(str, i2);
    }

    public void b(com.heytap.accessory.sdp.endpoint.state.b bVar, com.heytap.accessory.base.bean.b bVar2) {
    }

    public void a(com.heytap.accessory.sdp.endpoint.state.b bVar, com.heytap.accessory.base.bean.b bVar2) {
        bVar.e();
        bVar.d(bVar2);
        a(bVar, bVar2.l(), 3, 1);
    }

    public void b(com.heytap.accessory.sdp.endpoint.state.b bVar, com.heytap.accessory.message.b bVar2) {
    }

    public int a(com.heytap.accessory.sdp.endpoint.state.b bVar, long j, Buffer buffer) {
        com.heytap.accessory.base.logging.a.e(h, "PD Client : calling default implementation onMessageReceived");
        return -1;
    }

    public void a(com.heytap.accessory.sdp.endpoint.state.b bVar, long j, int i2, int i3) {
        b(bVar);
        if (i3 == 1 && i2 != 1) {
            i3 = -1111;
        }
        bVar.a(i3);
        g.a(bVar);
    }

    public void a(com.heytap.accessory.sdp.endpoint.state.b bVar) {
        bVar.a(this);
        if (bVar.g() != null) {
            com.heytap.accessory.base.logging.a.a(h, "PD Client : Entering state : " + bVar.g());
        }
        e(bVar);
    }
}
