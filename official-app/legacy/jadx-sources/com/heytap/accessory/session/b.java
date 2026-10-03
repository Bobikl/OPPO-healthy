package com.heytap.accessory.session;

import androidx.annotation.Nullable;
import com.heytap.accessory.utils.buffer.Buffer;
import com.oplus.smartenginehelper.entity.ClickApiEntity;

/* JADX INFO: loaded from: classes14.dex */
public class b {
    public static final String a = b.class.getSimpleName() + " - kscTrack";

    public static com.heytap.accessory.message.a a(com.heytap.accessory.session.params.a aVar, long j2) {
        return a(j2, 1L, aVar);
    }

    public static com.heytap.accessory.message.a b(long j2, long j3, com.heytap.accessory.session.params.a aVar) {
        com.heytap.accessory.message.e eVarA = com.heytap.accessory.message.e.a(j2, j3, aVar.h.length + 5 + 1);
        try {
            eVarA.a(aVar.f);
            eVarA.a(aVar.a, 2);
            eVarA.a(aVar.f2711e, 2);
            eVarA.a(aVar.h);
            eVarA.a((byte) 59);
            return eVarA.a();
        } catch (Exception e2) {
            com.heytap.accessory.base.logging.a.e(a, e2 + " :composeAgentAuthenticateRequest");
            return null;
        }
    }

    public static com.heytap.accessory.message.a c(long j2, long j3, com.heytap.accessory.session.params.a aVar) {
        String str = a;
        com.heytap.accessory.base.logging.a.a(str, "composeAgentAuthenticateResponse: " + aVar.b);
        Buffer buffer = aVar.b;
        if (buffer == null) {
            com.heytap.accessory.base.logging.a.b(str, "encrypt failed!");
            return com.heytap.accessory.message.a.a(j2, j3);
        }
        com.heytap.accessory.message.e eVarA = com.heytap.accessory.message.e.a(j2, j3, buffer.getPayloadLength() + 1 + 2 + 2 + aVar.h.length + 1);
        try {
            eVarA.a(aVar.f);
            eVarA.a(aVar.a, 2);
            eVarA.a(aVar.f2711e, 2);
            eVarA.a(aVar.h);
            eVarA.a((byte) 59);
            eVarA.a(aVar.b);
        } catch (Exception e2) {
            com.heytap.accessory.base.logging.a.e(a, e2.toString() + " :composeAgentAuthenticateResponse");
        }
        return eVarA.a();
    }

    @Nullable
    public static com.heytap.accessory.security.protocol.a d(Buffer buffer) {
        com.heytap.accessory.message.d dVarA = com.heytap.accessory.message.d.a(-1, buffer, 0);
        com.heytap.accessory.security.protocol.a aVar = new com.heytap.accessory.security.protocol.a();
        aVar.d = new com.heytap.accessory.security.protocol.a.c();
        try {
            aVar.b = dVarA.a("messageType");
            aVar.a = dVarA.a("authVersion");
            aVar.d.a = dVarA.a("statusCode");
            aVar.d.b = dVarA.a(8, "authParams.serverChallengeCode");
            aVar.d.f2686c = dVarA.c(8, "authParams.serverTime");
            aVar.d.d = dVarA.a(8, "authParams.serverMac");
            return aVar;
        } catch (com.heytap.accessory.message.c e2) {
            com.heytap.accessory.base.logging.a.e(a, e2.toString() + " :parseAccessoryAuthResponse");
            return null;
        }
    }

    public static com.heytap.accessory.message.a a(long j2, long j3, com.heytap.accessory.session.params.a aVar) {
        if (aVar.h.length > 64) {
            com.heytap.accessory.base.logging.a.b(a, "in composeAgentAuthenticateMessage!! Application service profile ID cannot be more than 128 characters");
            return com.heytap.accessory.message.a.a(j2, j3);
        }
        byte b = aVar.f;
        if (b == 5) {
            return b(j2, j3, aVar);
        }
        if (b == 6) {
            return c(j2, j3, aVar);
        }
        com.heytap.accessory.base.logging.a.b(a, "in composeAgentAuthenticateMessage!! Invalid command ID!");
        return com.heytap.accessory.message.a.a(j2, j3);
    }

    public static com.heytap.accessory.session.params.a a(com.heytap.accessory.message.a aVar) {
        com.heytap.accessory.session.params.a aVar2 = new com.heytap.accessory.session.params.a();
        aVar2.f = (byte) 5;
        com.heytap.accessory.message.d dVar = new com.heytap.accessory.message.d(aVar);
        try {
            dVar.a("messageType");
            aVar2.a = dVar.b(2, "remoteAgentId");
            aVar2.f2711e = dVar.b(2, "localAgentId");
            aVar2.h = dVar.a((byte) 59, "profileId");
            return aVar2;
        } catch (com.heytap.accessory.message.c e2) {
            com.heytap.accessory.base.logging.a.e(a, e2 + " :parseAgentAuthenticateRequest");
            return null;
        }
    }

    public static com.heytap.accessory.message.a b(com.heytap.accessory.security.protocol.a aVar) {
        com.heytap.accessory.base.logging.a.a(a, "composeAccessoryAuthRequest: " + aVar);
        com.heytap.accessory.message.e eVarA = com.heytap.accessory.message.e.a(38);
        try {
            eVarA.a(aVar.b);
            eVarA.a(aVar.a);
            eVarA.a(aVar.f2682c.a);
            eVarA.a(aVar.f2682c.b, 8);
            eVarA.a(aVar.f2682c.f2684c);
            eVarA.a(aVar.f2682c.d);
            eVarA.a(aVar.f2682c.f2685e);
            return eVarA.a();
        } catch (com.heytap.accessory.message.c e2) {
            com.heytap.accessory.base.logging.a.e(a, e2.toString() + " :composeAccessoryAuthRequest");
            return null;
        }
    }

    public static com.heytap.accessory.message.a c(com.heytap.accessory.security.protocol.a aVar) {
        com.heytap.accessory.base.logging.a.a(a, "composeAccessoryAuthResponse: " + aVar);
        com.heytap.accessory.message.e eVarA = com.heytap.accessory.message.e.a(27);
        try {
            eVarA.a(aVar.b);
            eVarA.a(aVar.a);
            eVarA.a(aVar.d.a);
            eVarA.a(aVar.d.b);
            eVarA.a(aVar.d.f2686c, 8);
            eVarA.a(aVar.d.d);
            return eVarA.a();
        } catch (com.heytap.accessory.message.c e2) {
            com.heytap.accessory.base.logging.a.e(a, e2.toString() + " :composeAccessoryAuthResponse");
            return null;
        }
    }

    public static com.heytap.accessory.session.params.a a(com.heytap.accessory.message.a aVar, long j2) {
        com.heytap.accessory.session.params.a aVar2 = new com.heytap.accessory.session.params.a();
        aVar2.f = (byte) 6;
        com.heytap.accessory.message.d dVar = new com.heytap.accessory.message.d(aVar);
        try {
            dVar.a("msgType");
            aVar2.a = dVar.b(2, "remoteAgentId");
            aVar2.f2711e = dVar.b(2, "localAgentId");
            aVar2.h = dVar.a((byte) 59, "profileId");
            synchronized (aVar) {
                Buffer bufferF = aVar.f();
                bufferF.setOffset(aVar.e() + dVar.a());
                bufferF.setPayloadLength(aVar.g());
                aVar2.b = bufferF;
                com.heytap.accessory.base.logging.a.a(a, "parseAgentAuthenticateResponse: " + aVar2.b);
            }
            return aVar2;
        } catch (com.heytap.accessory.message.c e2) {
            com.heytap.accessory.base.logging.a.e(a, e2.toString() + " :parseAgentAuthenticateResponse");
            return null;
        }
    }

    public static com.heytap.accessory.security.protocol.a b(Buffer buffer) {
        com.heytap.accessory.message.d dVarA = com.heytap.accessory.message.d.a(-1, buffer, 0);
        com.heytap.accessory.security.protocol.a aVar = new com.heytap.accessory.security.protocol.a();
        try {
            aVar.b = dVarA.a("messageType");
            aVar.a = dVarA.a("authVersion");
            return aVar;
        } catch (com.heytap.accessory.message.c e2) {
            com.heytap.accessory.base.logging.a.e(a, e2.toString() + " :parseAccessoryAuthKscError");
            return null;
        }
    }

    @Nullable
    public static com.heytap.accessory.security.protocol.a c(Buffer buffer) {
        com.heytap.accessory.message.d dVarA = com.heytap.accessory.message.d.a(-1, buffer, 0);
        com.heytap.accessory.security.protocol.a aVar = new com.heytap.accessory.security.protocol.a();
        aVar.f2682c = new com.heytap.accessory.security.protocol.a.b();
        try {
            aVar.b = dVarA.a("messageType");
            aVar.a = dVarA.a("authVersion");
            aVar.f2682c.a = dVarA.a(8, "authRequestParams.challengeCode");
            aVar.f2682c.b = dVarA.c(8, ClickApiEntity.TIME);
            aVar.f2682c.f2684c = dVarA.a(8, "authRequestParams.mac");
            aVar.f2682c.d = dVarA.a(6, "authRequestParams.deviceId");
            aVar.f2682c.f2685e = dVarA.a(6, "authRequestParams.kscAlias");
            return aVar;
        } catch (com.heytap.accessory.message.c e2) {
            com.heytap.accessory.base.logging.a.b(a, "parseAccessoryAuthRequest error," + e2);
            return null;
        }
    }

    public static com.heytap.accessory.message.a a(com.heytap.accessory.security.protocol.a aVar) {
        com.heytap.accessory.base.logging.a.a(a, "composeAccessoryAuthConfirm: " + aVar);
        com.heytap.accessory.message.e eVarA = com.heytap.accessory.message.e.a(11);
        try {
            eVarA.a(aVar.b);
            eVarA.a(aVar.a);
            eVarA.a(aVar.f2683e.a);
            eVarA.a(aVar.f2683e.b, 8);
            return eVarA.a();
        } catch (com.heytap.accessory.message.c e2) {
            com.heytap.accessory.base.logging.a.e(a, e2.toString() + " :composeAccessoryAuthConfirm");
            return null;
        }
    }

    public static com.heytap.accessory.message.a a() {
        com.heytap.accessory.base.logging.a.a(a, "composeAccessoryAuthKscError ");
        com.heytap.accessory.message.e eVarA = com.heytap.accessory.message.e.a(2);
        try {
            eVarA.a((byte) 20);
            eVarA.a((byte) 1);
            return eVarA.a();
        } catch (com.heytap.accessory.message.c e2) {
            com.heytap.accessory.base.logging.a.e(a, e2.toString() + " :composeAccessoryAuthKscError");
            return null;
        }
    }

    public static com.heytap.accessory.security.protocol.a a(Buffer buffer) {
        com.heytap.accessory.message.d dVarA = com.heytap.accessory.message.d.a(-1, buffer, 0);
        com.heytap.accessory.security.protocol.a aVar = new com.heytap.accessory.security.protocol.a();
        aVar.f2683e = new com.heytap.accessory.security.protocol.a.C0258a();
        try {
            aVar.b = dVarA.a("messageType");
            aVar.a = dVarA.a("authVersion");
            aVar.f2683e.a = dVarA.a("authConfirm.statusCode");
            aVar.f2683e.b = dVarA.a(8, "rc_2");
            return aVar;
        } catch (com.heytap.accessory.message.c e2) {
            com.heytap.accessory.base.logging.a.e(a, e2.toString() + " :parseAccessoryAuthConfirm");
            return null;
        }
    }
}
