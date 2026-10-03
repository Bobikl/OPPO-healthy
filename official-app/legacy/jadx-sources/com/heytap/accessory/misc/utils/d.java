package com.heytap.accessory.misc.utils;

import java.util.List;

/* JADX INFO: loaded from: classes14.dex */
public class d {
    public static final String a = "d";

    public static final class b {
        public List<a> a;
        public com.heytap.accessory.misc.constants.a b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public byte f2613c;
        public byte d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public com.heytap.accessory.message.a f2614e;
        public long f;
        public long g;
    }

    public static com.heytap.accessory.session.params.a a(com.heytap.accessory.message.a aVar, long j2) {
        if (aVar == null || aVar.f() == null || aVar.g() <= 0) {
            com.heytap.accessory.base.logging.a.b(a, "Error while retreiving the Message params!");
            return null;
        }
        byte bD = aVar.d(0);
        switch (bD) {
            case 1:
                com.heytap.accessory.session.params.a aVarA = com.heytap.accessory.session.f.a(aVar);
                com.heytap.accessory.base.logging.a.a(a, "parseServiceConnectionRequest: " + aVarA);
                return aVarA;
            case 2:
                com.heytap.accessory.session.params.a aVarB = com.heytap.accessory.session.f.b(aVar);
                com.heytap.accessory.base.logging.a.a(a, "parseServiceConnectionResponse: " + aVarB);
                return aVarB;
            case 3:
                com.heytap.accessory.session.params.a aVarC = com.heytap.accessory.session.f.c(aVar);
                com.heytap.accessory.base.logging.a.a(a, "parseServiceTerminationRequest: " + aVarC);
                return aVarC;
            case 4:
                com.heytap.accessory.session.params.a aVarD = com.heytap.accessory.session.f.d(aVar);
                com.heytap.accessory.base.logging.a.a(a, "parseServiceTerminationResponse: " + aVarD);
                return aVarD;
            case 5:
                com.heytap.accessory.session.params.a aVarA2 = com.heytap.accessory.session.b.a(aVar);
                com.heytap.accessory.base.logging.a.a(a, "parseAgentAuthenticateRequest: " + aVarA2);
                return aVarA2;
            case 6:
                com.heytap.accessory.session.params.a aVarA3 = com.heytap.accessory.session.b.a(aVar, j2);
                com.heytap.accessory.base.logging.a.a(a, "parseAgentAuthenticateResponse: " + aVarA3);
                return aVarA3;
            case 7:
                com.heytap.accessory.session.params.a aVarE = com.heytap.accessory.session.f.e(aVar);
                com.heytap.accessory.base.logging.a.a(a, "parseSessionConfigRequest: " + aVarE);
                return aVarE;
            case 8:
                com.heytap.accessory.session.params.a aVarF = com.heytap.accessory.session.f.f(aVar);
                com.heytap.accessory.base.logging.a.a(a, "parseSessionConfigResponse: " + aVarF);
                return aVarF;
            default:
                com.heytap.accessory.base.logging.a.b(a, "invalid message type " + ((int) bD) + " received!");
                return null;
        }
    }

    public static int b(com.heytap.accessory.message.a aVar) {
        if (aVar != null && aVar.f() != null && aVar.g() > 0) {
            return aVar.d(0);
        }
        com.heytap.accessory.base.logging.a.b(a, "Error while Parsing Capability Discovery Response Message!");
        return -1;
    }

    public static boolean c(com.heytap.accessory.message.a aVar) {
        com.heytap.accessory.message.d dVar = new com.heytap.accessory.message.d(aVar);
        int iD = (aVar.d(0) & 56) >> 3;
        int iB = -1;
        try {
            if (iD == 0) {
                byte bA = dVar.a("mexHeader");
                byte b2 = (byte) ((bA >> 2) & 1);
                byte b3 = (byte) (bA & 1);
                int iB2 = dVar.b(2, "destAgent");
                int iB3 = dVar.b(2, "sourceAgent");
                iB = dVar.b(2, "transactionId");
                aVar.e(7);
                aVar.a(String.valueOf(iB2));
                aVar.b(String.valueOf(iB3));
                if (b3 == 1) {
                    aVar.a(true);
                }
                aVar.b(b2 == 1);
            } else {
                if (iD != 1) {
                    com.heytap.accessory.base.logging.a.b(a, "Error parsing message exchange params - invalid message type!");
                    return false;
                }
                aVar.g((byte) ((dVar.a("ackStatus") & 6) >> 1));
                iB = dVar.b(2, "transactionId");
            }
        } catch (Exception e2) {
            com.heytap.accessory.base.logging.a.b(a, "parseMexHeader error," + e2);
        }
        aVar.h(iD);
        aVar.i(iB);
        com.heytap.accessory.base.logging.a.a(a, "parseMexHeader2 =" + aVar.toString());
        return true;
    }

    public static final class a {
        public final long a;
        public final long b;

        public a(long j2) {
            this.b = j2;
            this.a = -1L;
        }

        public long a() {
            return this.a;
        }

        public long b() {
            return this.b;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("(");
            sb.append(this.b);
            String str = ")";
            if (this.a != -1) {
                str = "," + this.a + ")";
            }
            sb.append(str);
            return sb.toString();
        }

        public a(long j2, long j3) {
            this.b = j2;
            this.a = j3;
        }
    }

    public static boolean a(com.heytap.accessory.message.a aVar) {
        com.heytap.accessory.message.e eVar = new com.heytap.accessory.message.e(aVar);
        byte bD = (byte) (((aVar.d() << 3) & 56) | ((byte) ((aVar.m() << 6) & 192)));
        try {
            if (aVar.d() == 0) {
                int i = Integer.parseInt(aVar.b());
                int i2 = Integer.parseInt(aVar.k());
                aVar.c(7);
                if (aVar.o()) {
                    bD = (byte) (bD | 4);
                }
                if (aVar.n()) {
                    bD = (byte) (bD | 1);
                }
                eVar.a(bD);
                eVar.a(i, 2);
                eVar.a(i2, 2);
            } else if (aVar.d() == 1) {
                eVar.a((byte) (bD | (((byte) (((byte) aVar.a()) << 1)) & 6)));
            } else {
                com.heytap.accessory.base.logging.a.b(a, "Error compsing the message exchange params - invalid message type!");
                return false;
            }
            eVar.a(aVar.l(), 2);
            com.heytap.accessory.base.logging.a.a(a, "composeMexHeader success1!!!!" + aVar.toString());
        } catch (com.heytap.accessory.message.c e2) {
            com.heytap.accessory.base.logging.a.b(a, "composeMexHeader error," + e2);
        }
        com.heytap.accessory.base.logging.a.a(a, "composeMexHeader success2!!!!");
        return true;
    }
}
