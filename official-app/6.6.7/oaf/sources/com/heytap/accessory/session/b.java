package com.heytap.accessory.session;

import androidx.annotation.Nullable;
import com.heytap.accessory.utils.buffer.Buffer;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes14.dex */
public class b {
    public static final String a = b.class.getSimpleName() + " - kscTrack";

    public static com.heytap.accessory.message.a a(com.heytap.accessory.session.params.a aVar, long j) {
        return a(j, 1L, aVar);
    }

    public static com.heytap.accessory.message.a b(long j, long j2, com.heytap.accessory.session.params.a aVar) {
        com.heytap.accessory.message.e eVarA = com.heytap.accessory.message.e.a(j, j2, aVar.h.length + 5 + 1);
        try {
            eVarA.a(aVar.f);
            eVarA.a(aVar.a, 2);
            eVarA.a(aVar.e, 2);
            eVarA.a(aVar.h);
            eVarA.a((byte) 59);
            return eVarA.a();
        } catch (Exception e) {
            com.heytap.accessory.base.logging.a.e(a, e + " :composeAgentAuthenticateRequest");
            return null;
        }
    }

    public static com.heytap.accessory.message.a c(long j, long j2, com.heytap.accessory.session.params.a aVar) {
        String str = a;
        com.heytap.accessory.base.logging.a.a(str, "composeAgentAuthenticateResponse: " + aVar.b);
        Buffer buffer = aVar.b;
        if (buffer == null) {
            com.heytap.accessory.base.logging.a.b(str, "encrypt failed!");
            return com.heytap.accessory.message.a.a(j, j2);
        }
        com.heytap.accessory.message.e eVarA = com.heytap.accessory.message.e.a(j, j2, buffer.getPayloadLength() + 1 + 2 + 2 + aVar.h.length + 1);
        try {
            eVarA.a(aVar.f);
            eVarA.a(aVar.a, 2);
            eVarA.a(aVar.e, 2);
            eVarA.a(aVar.h);
            eVarA.a((byte) 59);
            eVarA.a(aVar.b);
        } catch (Exception e) {
            com.heytap.accessory.base.logging.a.e(a, e.toString() + " :composeAgentAuthenticateResponse");
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
            aVar.d.c = dVarA.c(8, "authParams.serverTime");
            aVar.d.d = dVarA.a(8, "authParams.serverMac");
            return aVar;
        } catch (com.heytap.accessory.message.c e) {
            com.heytap.accessory.base.logging.a.e(a, e.toString() + " :parseAccessoryAuthResponse");
            return null;
        }
    }

    public static com.heytap.accessory.message.a a(long j, long j2, com.heytap.accessory.session.params.a aVar) {
        if (aVar.h.length > 64) {
            com.heytap.accessory.base.logging.a.b(a, "in composeAgentAuthenticateMessage!! Application service profile ID cannot be more than 128 characters");
            return com.heytap.accessory.message.a.a(j, j2);
        }
        byte b = aVar.f;
        if (b == 5) {
            return b(j, j2, aVar);
        }
        if (b == 6) {
            return c(j, j2, aVar);
        }
        com.heytap.accessory.base.logging.a.b(a, "in composeAgentAuthenticateMessage!! Invalid command ID!");
        return com.heytap.accessory.message.a.a(j, j2);
    }

    public static com.heytap.accessory.session.params.a a(com.heytap.accessory.message.a aVar) {
        com.heytap.accessory.session.params.a aVar2 = new com.heytap.accessory.session.params.a();
        aVar2.f = (byte) 5;
        com.heytap.accessory.message.d dVar = new com.heytap.accessory.message.d(aVar);
        try {
            dVar.a("messageType");
            aVar2.a = dVar.b(2, "remoteAgentId");
            aVar2.e = dVar.b(2, "localAgentId");
            aVar2.h = dVar.a((byte) 59, "profileId");
            return aVar2;
        } catch (com.heytap.accessory.message.c e) {
            com.heytap.accessory.base.logging.a.e(a, e + " :parseAgentAuthenticateRequest");
            return null;
        }
    }

    public static com.heytap.accessory.message.a b(com.heytap.accessory.security.protocol.a aVar) {
        com.heytap.accessory.base.logging.a.a(a, "composeAccessoryAuthRequest: " + aVar);
        com.heytap.accessory.message.e eVarA = com.heytap.accessory.message.e.a(38);
        try {
            eVarA.a(aVar.b);
            eVarA.a(aVar.a);
            eVarA.a(aVar.c.a);
            eVarA.a(aVar.c.b, 8);
            eVarA.a(aVar.c.c);
            eVarA.a(aVar.c.d);
            eVarA.a(aVar.c.e);
            return eVarA.a();
        } catch (com.heytap.accessory.message.c e) {
            com.heytap.accessory.base.logging.a.e(a, e.toString() + " :composeAccessoryAuthRequest");
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
            eVarA.a(aVar.d.c, 8);
            eVarA.a(aVar.d.d);
            return eVarA.a();
        } catch (com.heytap.accessory.message.c e) {
            com.heytap.accessory.base.logging.a.e(a, e.toString() + " :composeAccessoryAuthResponse");
            return null;
        }
    }

    public static com.heytap.accessory.session.params.a a(com.heytap.accessory.message.a aVar, long j) {
        com.heytap.accessory.session.params.a aVar2 = new com.heytap.accessory.session.params.a();
        aVar2.f = (byte) 6;
        com.heytap.accessory.message.d dVar = new com.heytap.accessory.message.d(aVar);
        try {
            dVar.a("msgType");
            aVar2.a = dVar.b(2, "remoteAgentId");
            aVar2.e = dVar.b(2, "localAgentId");
            aVar2.h = dVar.a((byte) 59, "profileId");
            synchronized (aVar) {
                Buffer bufferF = aVar.f();
                bufferF.setOffset(aVar.e() + dVar.a());
                bufferF.setPayloadLength(aVar.g());
                aVar2.b = bufferF;
                com.heytap.accessory.base.logging.a.a(a, "parseAgentAuthenticateResponse: " + aVar2.b);
            }
            return aVar2;
        } catch (com.heytap.accessory.message.c e) {
            com.heytap.accessory.base.logging.a.e(a, e.toString() + " :parseAgentAuthenticateResponse");
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
        } catch (com.heytap.accessory.message.c e) {
            com.heytap.accessory.base.logging.a.e(a, e.toString() + " :parseAccessoryAuthKscError");
            return null;
        }
    }

    @Nullable
    public static com.heytap.accessory.security.protocol.a c(Buffer buffer) {
        com.heytap.accessory.message.d dVarA = com.heytap.accessory.message.d.a(-1, buffer, 0);
        com.heytap.accessory.security.protocol.a aVar = new com.heytap.accessory.security.protocol.a();
        aVar.c = new com.heytap.accessory.security.protocol.a.b();
        try {
            aVar.b = dVarA.a("messageType");
            aVar.a = dVarA.a("authVersion");
            aVar.c.a = dVarA.a(8, "authRequestParams.challengeCode");
            aVar.c.b = dVarA.c(8, "time");
            aVar.c.c = dVarA.a(8, "authRequestParams.mac");
            aVar.c.d = dVarA.a(6, "authRequestParams.deviceId");
            aVar.c.e = dVarA.a(6, "authRequestParams.kscAlias");
            return aVar;
        } catch (com.heytap.accessory.message.c e) {
            com.heytap.accessory.base.logging.a.b(a, "parseAccessoryAuthRequest error," + e);
            return null;
        }
    }

    public static com.heytap.accessory.message.a a(com.heytap.accessory.security.protocol.a aVar) {
        com.heytap.accessory.base.logging.a.a(a, "composeAccessoryAuthConfirm: " + aVar);
        com.heytap.accessory.message.e eVarA = com.heytap.accessory.message.e.a(11);
        try {
            eVarA.a(aVar.b);
            eVarA.a(aVar.a);
            eVarA.a(aVar.e.a);
            eVarA.a(aVar.e.b, 8);
            return eVarA.a();
        } catch (com.heytap.accessory.message.c e) {
            com.heytap.accessory.base.logging.a.e(a, e.toString() + " :composeAccessoryAuthConfirm");
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
        } catch (com.heytap.accessory.message.c e) {
            com.heytap.accessory.base.logging.a.e(a, e.toString() + " :composeAccessoryAuthKscError");
            return null;
        }
    }

    public static com.heytap.accessory.security.protocol.a a(Buffer buffer) {
        com.heytap.accessory.message.d dVarA = com.heytap.accessory.message.d.a(-1, buffer, 0);
        com.heytap.accessory.security.protocol.a aVar = new com.heytap.accessory.security.protocol.a();
        aVar.e = new com.heytap.accessory.security.protocol.a.a();
        try {
            aVar.b = dVarA.a("messageType");
            aVar.a = dVarA.a("authVersion");
            aVar.e.a = dVarA.a("authConfirm.statusCode");
            aVar.e.b = dVarA.a(8, "rc_2");
            return aVar;
        } catch (com.heytap.accessory.message.c e) {
            com.heytap.accessory.base.logging.a.e(a, e.toString() + " :parseAccessoryAuthConfirm");
            return null;
        }
    }
}
