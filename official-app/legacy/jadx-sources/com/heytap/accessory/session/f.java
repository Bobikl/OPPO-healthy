package com.heytap.accessory.session;

import p010kotlin.io.encoding.Base64;

/* JADX INFO: loaded from: classes14.dex */
public class f {
    public static final boolean a = true;
    public static final String b = "f";

    public static com.heytap.accessory.message.a a(com.heytap.accessory.session.params.a aVar, long j2) {
        if (a || aVar != null) {
            return a(j2, 1L, aVar);
        }
        throw new AssertionError();
    }

    public static com.heytap.accessory.message.a b(com.heytap.accessory.session.params.a aVar, long j2) {
        if (a || aVar != null) {
            return b(j2, 1L, aVar);
        }
        throw new AssertionError();
    }

    public static com.heytap.accessory.message.a c(long j2, long j3, com.heytap.accessory.session.params.a aVar) {
        com.heytap.accessory.message.a aVarC = com.heytap.accessory.message.a.c(j2, j3, (aVar.g * 7) + 7 + aVar.h.length + 1);
        if (aVarC == null) {
            com.heytap.accessory.base.logging.a.b(b, "failed creating BaseMessage by Invalid PayloadLength! - 1");
            return null;
        }
        com.heytap.accessory.message.e eVar = new com.heytap.accessory.message.e(aVarC);
        try {
            eVar.a(aVar.f);
            eVar.a(aVar.a, 2);
            eVar.a(aVar.f2711e, 2);
            eVar.a(aVar.h);
            eVar.a((byte) 59);
            eVar.a(aVar.g, 2);
            for (int i = 0; i < aVar.g; i++) {
                eVar.a(aVar.d.get(i).intValue(), 2);
            }
            for (int i2 = 0; i2 < aVar.g; i2++) {
                eVar.a(aVar.f2710c.get(i2).a, 2);
            }
            for (int i3 = 0; i3 < aVar.g; i3++) {
                eVar.a(aVar.f2710c.get(i3).f2713c.b);
                eVar.a(aVar.f2710c.get(i3).f2713c.a);
            }
            for (int i4 = 0; i4 < aVar.g; i4++) {
                eVar.a(aVar.f2710c.get(i4).b);
            }
            return eVar.a();
        } catch (Exception e2) {
            com.heytap.accessory.base.logging.a.e(b, e2 + " :composeServiceConnectionRequest");
            return null;
        }
    }

    public static com.heytap.accessory.message.a d(long j2, long j3, com.heytap.accessory.session.params.a aVar) {
        com.heytap.accessory.message.a aVarC = com.heytap.accessory.message.a.c(j2, j3, (aVar.g * 2) + 8 + aVar.h.length + 1);
        if (aVarC == null) {
            com.heytap.accessory.base.logging.a.b(b, "failed creating BaseMessage by Invalid PayloadLength! - 1");
            return null;
        }
        com.heytap.accessory.message.e eVar = new com.heytap.accessory.message.e(aVarC);
        try {
            eVar.a(aVar.f);
            eVar.a(aVar.a, 2);
            eVar.a(aVar.f2711e, 2);
            eVar.a(aVar.h);
            eVar.a((byte) 59);
            eVar.a(aVar.i);
            eVar.a(aVar.g, 2);
            for (int i = 0; i < aVar.g; i++) {
                eVar.a(aVar.d.get(i).intValue(), 2);
            }
            return eVar.a();
        } catch (Exception e2) {
            com.heytap.accessory.base.logging.a.e(b, e2 + " :composeServiceConnectionResponse.");
            return null;
        }
    }

    public static com.heytap.accessory.message.a e(long j2, long j3, com.heytap.accessory.session.params.a aVar) {
        com.heytap.accessory.message.a aVarC = com.heytap.accessory.message.a.c(j2, j3, aVar.h.length + 5 + 1);
        if (aVarC == null) {
            com.heytap.accessory.base.logging.a.b(b, "failed creating BaseMessage by Invalid PayloadLength! - 1");
            return null;
        }
        com.heytap.accessory.message.e eVar = new com.heytap.accessory.message.e(aVarC);
        try {
            eVar.a(aVar.f);
            eVar.a(aVar.a, 2);
            eVar.a(aVar.f2711e, 2);
            eVar.a(aVar.h);
            eVar.a((byte) 59);
            return eVar.a();
        } catch (Exception e2) {
            com.heytap.accessory.base.logging.a.e(b, e2 + " :composeServiceTerminationRequest");
            return null;
        }
    }

    public static com.heytap.accessory.message.a f(long j2, long j3, com.heytap.accessory.session.params.a aVar) {
        com.heytap.accessory.message.a aVarC = com.heytap.accessory.message.a.c(j2, j3, aVar.h.length + 6 + 1);
        if (aVarC == null) {
            com.heytap.accessory.base.logging.a.b(b, "failed creating BaseMessage by Invalid PayloadLength! - 1");
            return null;
        }
        com.heytap.accessory.message.e eVar = new com.heytap.accessory.message.e(aVarC);
        try {
            eVar.a(aVar.f);
            eVar.a(aVar.a, 2);
            eVar.a(aVar.f2711e, 2);
            eVar.a(aVar.h);
            eVar.a((byte) 59);
            eVar.a(aVar.i);
            return aVarC;
        } catch (Exception e2) {
            com.heytap.accessory.base.logging.a.e(b, e2 + " :composeServiceTerminationResponse");
            return null;
        }
    }

    public static com.heytap.accessory.message.a g(long j2, long j3, com.heytap.accessory.session.params.a aVar) {
        if (aVar == null) {
            com.heytap.accessory.base.logging.a.b(b, "composeSessionConfigRequest failed, params is null");
            return null;
        }
        com.heytap.accessory.message.a aVarC = com.heytap.accessory.message.a.c(j2, j3, (aVar.g * 2) + 8);
        if (aVarC == null) {
            com.heytap.accessory.base.logging.a.b(b, "failed creating BaseMessage by Invalid PayloadLength! - 1");
            return null;
        }
        com.heytap.accessory.message.e eVar = new com.heytap.accessory.message.e(aVarC);
        try {
            eVar.a(aVar.f);
            eVar.a(aVar.a, 2);
            eVar.a(aVar.f2711e, 2);
            eVar.a(aVar.f2712j);
            eVar.a(aVar.g, 2);
            for (int i = 0; i < aVar.g; i++) {
                eVar.a(aVar.d.get(i).intValue(), 2);
            }
            return eVar.a();
        } catch (Exception e2) {
            com.heytap.accessory.base.logging.a.e(b, e2.toString() + " :composeServiceConnectionRequest");
            return null;
        }
    }

    public static com.heytap.accessory.message.a a(long j2, long j3, com.heytap.accessory.session.params.a aVar) {
        if (aVar.h.length > 64) {
            com.heytap.accessory.base.logging.a.b(b, "in composeServiceConnectionClosureMessage!! Application service profile ID cannot be more than 128 characters");
            return com.heytap.accessory.message.a.a(j2, j3);
        }
        byte b2 = aVar.f;
        if (b2 == 3) {
            return e(j2, j3, aVar);
        }
        if (b2 == 4) {
            return f(j2, j3, aVar);
        }
        com.heytap.accessory.base.logging.a.b(b, "in composeServiceConnectionClosureMessage!! Invalid command ID!");
        return com.heytap.accessory.message.a.a(j2, j3);
    }

    public static com.heytap.accessory.message.a b(long j2, long j3, com.heytap.accessory.session.params.a aVar) {
        if (aVar.h.length > 64) {
            com.heytap.accessory.base.logging.a.b(b, "in composeServiceConnectionCreationMessage!!  Application service profile ID cannot be more than 128 characters");
            return com.heytap.accessory.message.a.a(j2, j3);
        }
        byte b2 = aVar.f;
        if (b2 == 1) {
            return c(j2, j3, aVar);
        }
        if (b2 == 2) {
            return d(j2, j3, aVar);
        }
        com.heytap.accessory.base.logging.a.b(b, "in composeServiceConnectionCreationMessage!! Invalid command ID!");
        return com.heytap.accessory.message.a.a(j2, j3);
    }

    public static com.heytap.accessory.session.params.a a(com.heytap.accessory.message.a aVar) {
        com.heytap.accessory.session.params.a aVar2 = new com.heytap.accessory.session.params.a();
        com.heytap.accessory.message.d dVar = new com.heytap.accessory.message.d(aVar);
        try {
            aVar2.f = dVar.a("messageType ");
            aVar2.a = dVar.b(2, "remoteAgentId ");
            aVar2.f2711e = dVar.b(2, "localAgentId ");
            aVar2.h = dVar.a((byte) 59, "profileId ");
            aVar2.g = dVar.b(2, "nSessions ");
            for (int i = 0; i < aVar2.g; i++) {
                aVar2.d.add(Long.valueOf(dVar.b(2, "sessionIds")));
                aVar2.f2710c.add(new com.heytap.accessory.session.params.a.C0262a());
            }
            for (int i2 = 0; i2 < aVar2.g; i2++) {
                aVar2.f2710c.get(i2).a = dVar.b(2, "channelInfoRecords");
            }
            for (int i3 = 0; i3 < aVar2.g; i3++) {
                aVar2.f2710c.get(i3).f2713c.b = dVar.a("qosParams.type");
                aVar2.f2710c.get(i3).f2713c.a = dVar.a("qosParams.classType");
            }
            for (int i4 = 0; i4 < aVar2.g; i4++) {
                aVar2.f2710c.get(i4).b = dVar.a("payloadType");
            }
            return aVar2;
        } catch (Exception e2) {
            com.heytap.accessory.base.logging.a.e(b, e2 + " :parseServiceConnectionRequest");
            return null;
        }
    }

    public static com.heytap.accessory.session.params.a b(com.heytap.accessory.message.a aVar) {
        com.heytap.accessory.session.params.a aVar2 = new com.heytap.accessory.session.params.a();
        com.heytap.accessory.message.d dVar = new com.heytap.accessory.message.d(aVar);
        try {
            dVar.a("msgType");
            aVar2.f = (byte) 2;
            aVar2.a = dVar.b(2, "remoteAgentId");
            aVar2.f2711e = dVar.b(2, "localAgentId");
            if (dVar.a(Base64.padSymbol)) {
                aVar2.h = dVar.a(17, "profileId");
            } else {
                aVar2.h = dVar.a((byte) 59, "profileId");
            }
            aVar2.i = dVar.a("statusCode");
            aVar2.g = dVar.b(2, "nSessions");
            for (int i = 0; i < aVar2.g; i++) {
                aVar2.d.add(Long.valueOf(dVar.b(2, "session")));
            }
            return aVar2;
        } catch (Exception e2) {
            com.heytap.accessory.base.logging.a.e(b, e2 + " :parseServiceConnectionResponse");
            return null;
        }
    }

    public static com.heytap.accessory.session.params.a e(com.heytap.accessory.message.a aVar) {
        com.heytap.accessory.session.params.a aVar2 = new com.heytap.accessory.session.params.a();
        com.heytap.accessory.message.d dVar = new com.heytap.accessory.message.d(aVar);
        try {
            dVar.a("messageType");
            aVar2.f = (byte) 7;
            aVar2.a = dVar.b(2, "remoteAgentId");
            aVar2.f2711e = dVar.b(2, "localAgentId");
            aVar2.f2712j = dVar.a("runningState");
            com.heytap.accessory.base.logging.a.c(b, "params.runningState:" + ((int) aVar2.f2712j));
            aVar2.g = dVar.a("sessionCount");
            for (int i = 0; i < aVar2.g; i++) {
                aVar2.d.add(Long.valueOf(dVar.b(2, "sessionIds")));
            }
            return aVar2;
        } catch (Exception e2) {
            com.heytap.accessory.base.logging.a.e(b, e2.toString() + " :parseServiceTerminationResponse");
            return null;
        }
    }

    public static com.heytap.accessory.session.params.a f(com.heytap.accessory.message.a aVar) {
        com.heytap.accessory.session.params.a aVar2 = new com.heytap.accessory.session.params.a();
        com.heytap.accessory.message.d dVar = new com.heytap.accessory.message.d(aVar);
        try {
            aVar2.f = (byte) 8;
            dVar.a("msgType");
            aVar2.a = dVar.b(2, "remoteAgentId");
            aVar2.f2711e = dVar.b(2, "localAgentId");
            aVar2.i = dVar.a("runningState");
            aVar2.g = dVar.a("sessionCount");
            for (int i = 0; i < aVar2.g; i++) {
                aVar2.d.add(Long.valueOf(dVar.b(2, "sessionIds")));
            }
            return aVar2;
        } catch (Exception e2) {
            com.heytap.accessory.base.logging.a.e(b, e2.toString() + " :parseServiceTerminationResponse");
            return null;
        }
    }

    public static com.heytap.accessory.session.params.a d(com.heytap.accessory.message.a aVar) {
        com.heytap.accessory.session.params.a aVar2 = new com.heytap.accessory.session.params.a();
        com.heytap.accessory.message.d dVar = new com.heytap.accessory.message.d(aVar);
        try {
            dVar.a("messageType");
            aVar2.f = (byte) 4;
            aVar2.a = dVar.b(2, "remoteAgentId");
            aVar2.f2711e = dVar.b(2, "localAgentId");
            if (dVar.a(Base64.padSymbol)) {
                aVar2.h = dVar.a(17, "profileId");
            } else {
                aVar2.h = dVar.a((byte) 59, "profileId");
            }
            aVar2.i = dVar.a("statusCode");
            return aVar2;
        } catch (Exception e2) {
            com.heytap.accessory.base.logging.a.e(b, e2 + " :parseServiceTerminationResponse");
            return null;
        }
    }

    public static com.heytap.accessory.session.params.a c(com.heytap.accessory.message.a aVar) {
        com.heytap.accessory.session.params.a aVar2 = new com.heytap.accessory.session.params.a();
        com.heytap.accessory.message.d dVar = new com.heytap.accessory.message.d(aVar);
        try {
            aVar2.f = dVar.a("messageType");
            aVar2.a = dVar.b(2, "remoteAgentId");
            aVar2.f2711e = dVar.b(2, "localAgentId");
            if (dVar.a(Base64.padSymbol)) {
                aVar2.h = dVar.a(17, "profileId");
            } else {
                aVar2.h = dVar.a((byte) 59, "profileId");
            }
            return aVar2;
        } catch (Exception e2) {
            com.heytap.accessory.base.logging.a.e(b, e2 + " :parseServiceTerminationRequest");
            return null;
        }
    }
}
