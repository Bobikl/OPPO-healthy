package com.heytap.accessory.security;

import android.content.SharedPreferences;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import com.heytap.accessory.accessorymanager.ConnectConfig;
import com.heytap.accessory.logging.SensitiveLogUtils;
import com.heytap.accessory.misc.utils.PlatformUtils;
import com.heytap.accessory.utils.HexUtils;
import com.heytap.accessory.utils.SystemUtils;
import com.heytap.accessory.utils.buffer.Buffer;
import java.security.InvalidKeyException;
import java.util.Arrays;
import java.util.HashMap;
import javax.crypto.SecretKey;
import javax.crypto.spec.IvParameterSpec;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes14.dex */
public class b {
    public static d a(int i, Buffer buffer, n nVar) {
        d dVar = new d();
        dVar.b = 1;
        if (nVar == null) {
            com.heytap.accessory.base.logging.a.b("AFSecurityUtils - kscTrack", "checkAndCreateAuthPacket : Security Store turns out to be null!!!! ");
            return dVar;
        }
        com.heytap.accessory.security.wms.c cVarE = nVar.e();
        if (a(buffer)) {
            com.heytap.accessory.base.logging.a.b("AFSecurityUtils - kscTrack", "receive remote ksc error msg.");
            a(cVarE.e());
            dVar.b = 3;
            return dVar;
        }
        com.heytap.accessory.base.bean.b bVarD = nVar.d();
        if (bVarD == null) {
            com.heytap.accessory.base.logging.a.b("AFSecurityUtils - kscTrack", "auth failed, accessory is null...");
            return dVar;
        }
        com.heytap.accessory.security.protocol.a aVar = new com.heytap.accessory.security.protocol.a();
        aVar.a = (byte) 1;
        aVar.b = (byte) i;
        switch (i) {
            case 16:
                ConnectConfig connectConfigD = com.heytap.accessory.connectivity.core.util.a.d(cVarE.e(), cVarE.h(), cVarE.i());
                if (connectConfigD == null) {
                    com.heytap.accessory.base.logging.a.b("AFSecurityUtils - kscTrack", "Client auth pack, Connect config not found!");
                    return dVar;
                }
                com.heytap.accessory.base.logging.a.a("AFSecurityUtils - kscTrack", "Client generate AuthPack, connectConfig = " + connectConfigD);
                cVarE.a(connectConfigD.getDeviceId());
                bVarD.a(connectConfigD.getDeviceId());
                com.heytap.accessory.base.logging.a.a("AFSecurityUtils - kscTrack", "auth, compose authParams");
                com.heytap.accessory.security.protocol.a.b bVar = new com.heytap.accessory.security.protocol.a.b();
                bVar.a = cVarE.b();
                bVar.b = cVarE.g();
                bVar.d = cVarE.c();
                bVar.e = connectConfigD.getKscAlias();
                SecretKey secretKeyB = com.heytap.accessory.security.ksc.b.a().b(HexUtils.byteArrayToHexStr(connectConfigD.getDeviceId()), HexUtils.byteArrayToHexStr(connectConfigD.getKscAlias()));
                if (secretKeyB == null) {
                    com.heytap.accessory.base.logging.a.b("AFSecurityUtils - kscTrack", "Client auth pack, Ksc not found!");
                    dVar.b = 2;
                    return dVar;
                }
                cVarE.a(secretKeyB);
                try {
                    bVar.c = a(secretKeyB, cVarE.b(), cVarE.g());
                    aVar.c = bVar;
                    com.heytap.accessory.message.a aVarB = com.heytap.accessory.session.b.b(aVar);
                    dVar.a = aVarB;
                    if (aVarB != null) {
                        dVar.b = 0;
                    }
                    return dVar;
                } catch (com.heytap.accessory.security.ksc.a e) {
                    com.heytap.accessory.base.logging.a.b("AFSecurityUtils - kscTrack", e);
                    dVar.b = 2;
                } catch (com.heytap.accessory.security.wms.e e2) {
                    com.heytap.accessory.base.logging.a.b("AFSecurityUtils - kscTrack", e2);
                    return dVar;
                }
                break;
                break;
            case 17:
                if (cVarE != null) {
                    com.heytap.accessory.security.protocol.a aVarC = com.heytap.accessory.session.b.c(buffer);
                    com.heytap.accessory.base.logging.a.a("AFSecurityUtils - kscTrack", "server parse requestParams = " + aVarC);
                    if (aVarC == null) {
                        com.heytap.accessory.base.logging.a.b("AFSecurityUtils - kscTrack", "auth, authParams is null, quit");
                        a(cVarE.e());
                        return dVar;
                    }
                    if (aVarC.b != 16) {
                        com.heytap.accessory.base.logging.a.b("AFSecurityUtils - kscTrack", "auth type error, 16 is expected, but it is " + ((int) aVarC.b));
                        a(cVarE.e());
                        return dVar;
                    }
                    try {
                        if (!a(aVarC, cVarE)) {
                            com.heytap.accessory.base.logging.a.b("AFSecurityUtils - kscTrack", "auth, authParams check not pass, quit");
                            return dVar;
                        }
                        cVarE.a(aVarC.c.d);
                        bVarD.a(aVarC.c.d);
                        nVar.a(new com.heytap.accessory.security.wms.b(aVarC.c.a, cVarE.b()));
                        com.heytap.accessory.security.protocol.a.c cVar = new com.heytap.accessory.security.protocol.a.c();
                        cVar.b = cVarE.b();
                        cVar.c = cVarE.g();
                        cVar.a = (byte) 0;
                        try {
                            SecretKey secretKeyD = cVarE.d();
                            byte[] bArr = aVarC.c.a;
                            cVar.d = a(secretKeyD, bArr, cVar.b, cVar.c);
                            com.heytap.accessory.base.logging.a.c("AFSecurityUtils - kscTrack", "server generateRS ksc: " + SensitiveLogUtils.toHiddenIfNeed(secretKeyD.getEncoded()) + "; qc: " + SensitiveLogUtils.toHiddenIfNeed(bArr) + "; qs: " + SensitiveLogUtils.toHiddenIfNeed(cVar.b) + "; ts: " + cVar.c + "; Rs: " + SensitiveLogUtils.toHiddenIfNeed(cVar.d));
                            aVar.d = cVar;
                            com.heytap.accessory.message.a aVarC2 = com.heytap.accessory.session.b.c(aVar);
                            dVar.a = aVarC2;
                            if (aVarC2 != null) {
                                dVar.b = 0;
                            }
                            return dVar;
                        } catch (com.heytap.accessory.security.ksc.a e3) {
                            com.heytap.accessory.base.logging.a.b("AFSecurityUtils - kscTrack", e3);
                            dVar.b = 2;
                            return dVar;
                        } catch (com.heytap.accessory.security.wms.e e4) {
                            com.heytap.accessory.base.logging.a.b("AFSecurityUtils - kscTrack", "MESSAGE_TYPE_ACCESSORY_AUTHENTICATE_RESPONSE error," + e4);
                            return dVar;
                        }
                    } catch (com.heytap.accessory.security.ksc.a unused) {
                        com.heytap.accessory.base.logging.a.e("AFSecurityUtils - kscTrack", "checkRequestParams BufferException");
                        dVar.b = 2;
                        return dVar;
                    }
                }
                return dVar;
            case 18:
                com.heytap.accessory.security.protocol.a aVarD = com.heytap.accessory.session.b.d(buffer);
                if (aVarD == null) {
                    com.heytap.accessory.base.logging.a.b("AFSecurityUtils - kscTrack", "auth, responseParams is null, quit");
                    dVar.b = 5;
                } else {
                    if (aVarD.b != 17) {
                        com.heytap.accessory.base.logging.a.b("AFSecurityUtils - kscTrack", "auth type error, 17 is expected, but it is " + ((int) aVarD.b));
                        dVar.b = 5;
                        return dVar;
                    }
                    try {
                        int iB = b(aVarD, cVarE);
                        if (iB != 0) {
                            com.heytap.accessory.base.logging.a.b("AFSecurityUtils - kscTrack", "auth, checkResponseParams failed, quit");
                            dVar.b = iB;
                            return dVar;
                        }
                        byte[] bArr2 = aVarD.d.b;
                        nVar.a(new com.heytap.accessory.security.wms.b(nVar.e().b(), bArr2));
                        com.heytap.accessory.security.protocol.a.a aVar2 = new com.heytap.accessory.security.protocol.a.a();
                        aVar2.a = (byte) 0;
                        try {
                            SecretKey secretKeyD2 = cVarE.d();
                            try {
                                aVar2.b = a(secretKeyD2, bArr2, cVarE.g());
                                com.heytap.accessory.base.logging.a.c("AFSecurityUtils - kscTrack", "client generateRC_2 qs: " + SensitiveLogUtils.toHiddenIfNeed(bArr2) + "; tc: " + cVarE.g() + "; ksc: " + SensitiveLogUtils.toHiddenIfNeed(secretKeyD2.getEncoded()) + "; localRc_2: " + SensitiveLogUtils.toHiddenIfNeed(aVar2.b));
                                aVar.e = aVar2;
                                com.heytap.accessory.message.a aVarA = com.heytap.accessory.session.b.a(aVar);
                                dVar.a = aVarA;
                                if (aVarA != null) {
                                    dVar.b = 0;
                                }
                                return dVar;
                            } catch (com.heytap.accessory.security.ksc.a e5) {
                                com.heytap.accessory.base.logging.a.b("AFSecurityUtils - kscTrack", e5);
                                dVar.b = 2;
                                return dVar;
                            } catch (com.heytap.accessory.security.wms.e e6) {
                                com.heytap.accessory.base.logging.a.b("AFSecurityUtils - kscTrack", "generateResponseClientCode error," + e6);
                                return dVar;
                            }
                        } catch (com.heytap.accessory.security.wms.e e7) {
                            com.heytap.accessory.base.logging.a.b("AFSecurityUtils - kscTrack", "getMatchedKsc error," + e7);
                        }
                    } catch (com.heytap.accessory.security.ksc.a e8) {
                        com.heytap.accessory.base.logging.a.b("AFSecurityUtils - kscTrack", e8);
                        dVar.b = 2;
                        return dVar;
                    }
                }
                return dVar;
            case 19:
            default:
                com.heytap.accessory.base.logging.a.e("AFSecurityUtils - kscTrack", "Invalid option in create auth packet");
                return dVar;
            case 20:
                dVar.b = 3;
                return dVar;
        }
    }

    public static boolean b(com.heytap.accessory.base.bean.b bVar) {
        AuthFalseCount authFalseCountB = b(bVar.d());
        if (authFalseCountB.e()) {
            return authFalseCountB.d();
        }
        authFalseCountB.f();
        com.heytap.accessory.base.logging.a.a("AFSecurityUtils - kscTrack", "checkResponseParams, fc time out, reset time");
        a(bVar.d(), authFalseCountB);
        return false;
    }

    public static AuthFalseCount b(String str) {
        return AuthFalseCount.a(PlatformUtils.getSharedPreferences(PlatformUtils.SECURITY_PREFS, 0).getString("security_fc_" + com.heytap.accessory.misc.utils.g.c(str), ""));
    }

    public static com.heytap.accessory.security.wms.a b(n nVar, long j, long j2, HashMap<c, com.heytap.accessory.security.wms.a> map) throws com.heytap.accessory.security.wms.e {
        c cVar = new c(j, j2);
        com.heytap.accessory.security.wms.a aVar = map.get(cVar);
        if (aVar != null) {
            com.heytap.accessory.base.logging.a.c("AFSecurityUtils - kscTrack", "getServerCipher user old app key : " + cVar);
            return aVar;
        }
        com.heytap.accessory.security.wms.a aVar2 = new com.heytap.accessory.security.wms.a(new com.heytap.accessory.security.wms.d(nVar.c(), nVar.b().a()));
        com.heytap.accessory.base.logging.a.c("AFSecurityUtils - kscTrack", "getServerCipher Create new app key : " + cVar);
        map.put(cVar, aVar2);
        return aVar2;
    }

    public static int b(@NonNull com.heytap.accessory.security.protocol.a aVar, @NonNull com.heytap.accessory.security.wms.c cVar) throws com.heytap.accessory.security.ksc.a {
        com.heytap.accessory.base.logging.a.a("AFSecurityUtils - kscTrack", "checkResponseParams, check requestParams: " + aVar);
        com.heytap.accessory.security.protocol.a.c cVar2 = aVar.d;
        boolean z = true;
        if (cVar2 == null) {
            com.heytap.accessory.base.logging.a.b("AFSecurityUtils - kscTrack", "checkResponseParams, remoteRequest is null");
            return 1;
        }
        ConnectConfig connectConfigD = com.heytap.accessory.connectivity.core.util.a.d(cVar.e(), cVar.h(), cVar.i());
        if (connectConfigD == null) {
            com.heytap.accessory.base.logging.a.b("AFSecurityUtils - kscTrack", "checkResponseParams, connectConfig is null");
            return 1;
        }
        byte[] deviceId = connectConfigD.getDeviceId();
        byte[] kscAlias = connectConfigD.getKscAlias();
        String strE = cVar.e();
        if (TextUtils.isEmpty(strE)) {
            com.heytap.accessory.base.logging.a.b("AFSecurityUtils - kscTrack", "checkResponseParams, remoteId is null");
            return 1;
        }
        AuthFalseCount authFalseCountB = b(cVar.e());
        if (!authFalseCountB.e()) {
            authFalseCountB.f();
            com.heytap.accessory.base.logging.a.a("AFSecurityUtils - kscTrack", "checkResponseParams, fc time out, reset time");
            a(cVar.e(), authFalseCountB);
        }
        if (authFalseCountB.d()) {
            com.heytap.accessory.base.logging.a.e("AFSecurityUtils - kscTrack", "checkResponseParams, fc arrive max. fc = " + authFalseCountB.a());
            return 1;
        }
        long j = cVar2.c;
        cVar.a(j);
        SecretKey secretKeyB = com.heytap.accessory.security.ksc.b.a().b(HexUtils.byteArrayToHexStr(deviceId), HexUtils.byteArrayToHexStr(kscAlias));
        if (secretKeyB != null) {
            try {
                byte[] bArrB = cVar.b();
                byte[] bArr = cVar2.b;
                byte[] bArrA = a(secretKeyB, bArrB, bArr, j);
                byte[] bArr2 = cVar2.d;
                if (Arrays.equals(bArr2, bArrA)) {
                    cVar.a(secretKeyB);
                } else {
                    z = false;
                }
                try {
                    com.heytap.accessory.base.logging.a.c("AFSecurityUtils - kscTrack", "ClientCheckRS ksc: " + SensitiveLogUtils.toHiddenIfNeed(secretKeyB.getEncoded()) + "; qc: " + SensitiveLogUtils.toHiddenIfNeed(bArrB) + "; qs: " + SensitiveLogUtils.toHiddenIfNeed(bArr) + "; ts: " + j + "; localRs: " + SensitiveLogUtils.toHiddenIfNeed(bArrA) + "; remoteRs: " + SensitiveLogUtils.toHiddenIfNeed(bArr2));
                } catch (Exception e) {
                    e = e;
                    com.heytap.accessory.base.logging.a.b("AFSecurityUtils - kscTrack", "checkResponseParams error:" + e);
                }
            } catch (Exception e2) {
                e = e2;
                z = false;
            }
            if (!z) {
                com.heytap.accessory.base.logging.a.e("AFSecurityUtils - kscTrack", "checkResponseParams, rs not match");
                a(strE);
                return 4;
            }
            com.heytap.accessory.base.logging.a.a("AFSecurityUtils - kscTrack", "checkResponseParams, check pass!");
            return 0;
        }
        com.heytap.accessory.base.logging.a.b("AFSecurityUtils - kscTrack", "checkChallengeMac, ksc not found. deviceId = " + SensitiveLogUtils.toHiddenIfNeed(deviceId) + "alias = " + SensitiveLogUtils.toHiddenIfNeed(kscAlias));
        throw new com.heytap.accessory.security.ksc.a("ksc not found");
    }

    public static int a(Buffer buffer, n nVar) {
        com.heytap.accessory.security.protocol.a.a aVar;
        if (a(buffer)) {
            com.heytap.accessory.base.logging.a.b("AFSecurityUtils - kscTrack", "receive remote ksc error msg.");
            return 3;
        }
        com.heytap.accessory.security.protocol.a aVarA = com.heytap.accessory.session.b.a(buffer);
        if (nVar != null && nVar.e() != null) {
            String strE = nVar.e().e();
            if (TextUtils.isEmpty(strE)) {
                com.heytap.accessory.base.logging.a.b("AFSecurityUtils - kscTrack", "checkConfirmPacket, remoteId is null");
                return 1;
            }
            if (aVarA != null && (aVar = aVarA.e) != null) {
                if (aVarA.b != 18) {
                    com.heytap.accessory.base.logging.a.b("AFSecurityUtils - kscTrack", "auth type error, 18 is expected, but it is " + ((int) aVarA.b));
                    a(strE);
                    return 1;
                }
                if (!(aVar.a == 0)) {
                    com.heytap.accessory.base.logging.a.b("AFSecurityUtils - kscTrack", "checkConfirmPacket, status error:" + ((int) aVarA.e.a));
                    a(strE);
                    return 1;
                }
                com.heytap.accessory.security.wms.c cVarE = nVar.e();
                if (cVarE == null) {
                    com.heytap.accessory.base.logging.a.b("AFSecurityUtils - kscTrack", "check confirm failed, selfParams is empty");
                    return 1;
                }
                try {
                    SecretKey secretKeyD = cVarE.d();
                    byte[] bArrA = a(secretKeyD, cVarE.b(), cVarE.f());
                    byte[] bArr = aVarA.e.b;
                    if (Arrays.equals(bArr, bArrA)) {
                        return 0;
                    }
                    com.heytap.accessory.base.logging.a.e("AFSecurityUtils - kscTrack", "checkConfirmPacket rc not equals");
                    com.heytap.accessory.base.logging.a.c("AFSecurityUtils - kscTrack", "serverCheckRC_2 qs: " + SensitiveLogUtils.toHiddenIfNeed(cVarE.b()) + "; tc: " + cVarE.f() + "; ksc: " + SensitiveLogUtils.toHiddenIfNeed(secretKeyD.getEncoded()) + "; localRc_2: " + SensitiveLogUtils.toHiddenIfNeed(bArrA) + "; remoteRc_2: " + SensitiveLogUtils.toHiddenIfNeed(bArr));
                    com.heytap.accessory.base.logging.a.b("AFSecurityUtils - kscTrack", "checkConfirmPacket failed");
                    return 1;
                } catch (com.heytap.accessory.security.ksc.a e) {
                    com.heytap.accessory.base.logging.a.b("AFSecurityUtils - kscTrack", e);
                    return 2;
                } catch (com.heytap.accessory.security.wms.e e2) {
                    com.heytap.accessory.base.logging.a.b("AFSecurityUtils - kscTrack", e2);
                }
            } else {
                com.heytap.accessory.base.logging.a.b("AFSecurityUtils - kscTrack", "checkConfirmPacket, params is null, increaseFC");
                a(strE);
                return 1;
            }
        } else {
            com.heytap.accessory.base.logging.a.b("AFSecurityUtils - kscTrack", "checkConfirmPacket, securityStore or server is null");
            return 1;
        }
    }

    public static boolean a(Buffer buffer) {
        com.heytap.accessory.security.protocol.a aVarB;
        return (buffer == null || (aVarB = com.heytap.accessory.session.b.b(buffer)) == null || aVarB.b != 20) ? false : true;
    }

    public static void a(String str) {
        AuthFalseCount authFalseCountB = b(str);
        authFalseCountB.c();
        com.heytap.accessory.base.logging.a.e("AFSecurityUtils - kscTrack", "increaseFalseCount, fc: " + authFalseCountB.a());
        a(str, authFalseCountB);
    }

    public static void a(String str, AuthFalseCount authFalseCount) {
        if (authFalseCount == null) {
            return;
        }
        SharedPreferences.Editor editorEdit = PlatformUtils.getSharedPreferences(PlatformUtils.SECURITY_PREFS, 0).edit();
        editorEdit.putString("security_fc_" + com.heytap.accessory.misc.utils.g.c(str), authFalseCount.b());
        editorEdit.apply();
    }

    public static d a() {
        d dVar = new d();
        dVar.b = 2;
        dVar.a = com.heytap.accessory.session.b.a();
        return dVar;
    }

    public static String a(com.heytap.accessory.base.bean.b bVar) {
        return bVar.d();
    }

    public static n a(com.heytap.accessory.base.bean.b bVar, int i) {
        n nVar = new n(bVar, i);
        nVar.a(null);
        return nVar;
    }

    public static com.heytap.accessory.message.b a(long j, com.heytap.accessory.message.a aVar) {
        com.heytap.accessory.message.b bVar = new com.heytap.accessory.message.b(j, -1L);
        bVar.a(aVar);
        return bVar;
    }

    public static com.heytap.accessory.security.wms.a a(n nVar, long j, long j2, HashMap<c, com.heytap.accessory.security.wms.a> map) throws com.heytap.accessory.security.wms.e {
        c cVar = new c(j, j2);
        com.heytap.accessory.security.wms.a aVar = map.get(cVar);
        if (aVar != null) {
            com.heytap.accessory.base.logging.a.c("AFSecurityUtils - kscTrack", "getClientCipher user old app key : " + cVar);
            return aVar;
        }
        com.heytap.accessory.security.wms.a aVar2 = new com.heytap.accessory.security.wms.a(new com.heytap.accessory.security.wms.d(nVar.c(), nVar.b().a()));
        com.heytap.accessory.base.logging.a.c("AFSecurityUtils - kscTrack", "getClientCipher Create new app key : " + cVar);
        map.put(cVar, aVar2);
        return aVar2;
    }

    public static boolean a(com.heytap.accessory.security.protocol.a aVar, @NonNull com.heytap.accessory.security.wms.c cVar) throws com.heytap.accessory.security.ksc.a {
        boolean z;
        com.heytap.accessory.base.logging.a.a("AFSecurityUtils - kscTrack", "checkRequestParams, check requestParams: " + aVar);
        if (aVar == null) {
            com.heytap.accessory.base.logging.a.b("AFSecurityUtils - kscTrack", "checkRequestParams, remoteParams is null");
            return false;
        }
        com.heytap.accessory.security.protocol.a.b bVar = aVar.c;
        if (TextUtils.isEmpty(cVar.e())) {
            com.heytap.accessory.base.logging.a.b("AFSecurityUtils - kscTrack", "checkRequestParams, getRemoteAddress is null");
            return false;
        }
        if (bVar == null) {
            com.heytap.accessory.base.logging.a.b("AFSecurityUtils - kscTrack", "checkRequestParams, remoteRequest is null");
            a(cVar.e());
            return false;
        }
        byte[] bArr = bVar.d;
        byte[] bArr2 = bVar.e;
        long j = bVar.b;
        byte[] bArr3 = bVar.c;
        byte[] bArr4 = bVar.a;
        cVar.a(j);
        SecretKey secretKeyB = com.heytap.accessory.security.ksc.b.a().b(HexUtils.byteArrayToHexStr(bArr), HexUtils.byteArrayToHexStr(bArr2));
        if (secretKeyB != null) {
            try {
                byte[] bArrA = a(secretKeyB, bArr4, j);
                if (Arrays.equals(bArr3, bArrA)) {
                    cVar.a(secretKeyB);
                    z = true;
                } else {
                    z = false;
                }
                com.heytap.accessory.base.logging.a.c("AFSecurityUtils - kscTrack", "ServerCheckRC ksc: " + SensitiveLogUtils.toHiddenIfNeed(secretKeyB.getEncoded()) + "; qc: " + SensitiveLogUtils.toHiddenIfNeed(bArr4) + "; tc: " + j + "; localRc: " + SensitiveLogUtils.toHiddenIfNeed(bArrA) + "; remoteRc: " + SensitiveLogUtils.toHiddenIfNeed(bArr3));
                if (z) {
                    com.heytap.accessory.base.logging.a.a("AFSecurityUtils - kscTrack", "checkRequestParams, check pass!");
                    return true;
                }
                com.heytap.accessory.base.logging.a.e("AFSecurityUtils - kscTrack", "checkRequestParams, rc not match");
                a(cVar.e());
                throw new com.heytap.accessory.security.ksc.a("checkRequestParams, rc not match");
            } catch (com.heytap.accessory.security.wms.e e) {
                com.heytap.accessory.base.logging.a.b("AFSecurityUtils - kscTrack", e);
                return false;
            }
        }
        com.heytap.accessory.base.logging.a.b("AFSecurityUtils - kscTrack", "checkChallengeMac, ksc not found. deviceId = " + SensitiveLogUtils.toHiddenIfNeed(bArr) + "alias = " + SensitiveLogUtils.toHiddenIfNeed(bArr2));
        throw new com.heytap.accessory.security.ksc.a("ksc not found");
    }

    public static byte[] a(@NonNull SecretKey secretKey, byte[] bArr, long j) throws com.heytap.accessory.security.ksc.a, com.heytap.accessory.security.wms.e {
        com.heytap.accessory.base.logging.a.a("AFSecurityUtils - kscTrack", "generateChallengeMac,  challengeCode = " + SensitiveLogUtils.toHiddenIfNeed(bArr) + " time = " + j);
        byte[] bArr2 = new byte[bArr.length + 8];
        SystemUtils.arraycopy(bArr, 0, bArr2, 0, bArr.length);
        for (int i = 0; i < 8; i++) {
            bArr2[bArr.length + i] = (byte) (j >>> (i * 8));
        }
        com.heytap.accessory.base.logging.a.a("AFSecurityUtils - kscTrack", "generateChallengeMac, mixCode = " + SensitiveLogUtils.toHiddenIfNeed(bArr2));
        try {
            byte[] bArrA = a.a().a(secretKey, bArr2, 8);
            com.heytap.accessory.base.logging.a.a("AFSecurityUtils - kscTrack", "generateChallengeMac, challengeMacResult = " + SensitiveLogUtils.toHiddenIfNeed(bArrA));
            return bArrA;
        } catch (InvalidKeyException e) {
            throw new com.heytap.accessory.security.ksc.a(e);
        }
    }

    public static byte[] a(@NonNull SecretKey secretKey, byte[] bArr, byte[] bArr2, long j) throws com.heytap.accessory.security.ksc.a, com.heytap.accessory.security.wms.e {
        com.heytap.accessory.base.logging.a.c("AFSecurityUtils - kscTrack", "generateResponseServerCode,  challengeClient = " + SensitiveLogUtils.toHiddenIfNeed(bArr) + " challengeServer = " + SensitiveLogUtils.toHiddenIfNeed(bArr2) + " timeServer = " + j);
        byte[] bArr3 = new byte[24];
        SystemUtils.arraycopy(bArr, 0, bArr3, 0, 8);
        SystemUtils.arraycopy(bArr2, 0, bArr3, 8, 8);
        for (int i = 0; i < 8; i++) {
            bArr3[i + 16] = (byte) (j >>> (i * 8));
        }
        com.heytap.accessory.base.logging.a.a("AFSecurityUtils - kscTrack", "generateChallengeMac, mixCode = " + SensitiveLogUtils.toHiddenIfNeed(bArr3));
        try {
            byte[] bArrA = a.a().a(secretKey, bArr3, 8);
            com.heytap.accessory.base.logging.a.a("AFSecurityUtils - kscTrack", "generateChallengeMac, challengeMacResult = " + SensitiveLogUtils.toHiddenIfNeed(bArrA));
            return bArrA;
        } catch (InvalidKeyException e) {
            throw new com.heytap.accessory.security.ksc.a(e);
        }
    }

    public static IvParameterSpec a(byte[] bArr) {
        if (bArr != null && bArr.length == 16) {
            return new IvParameterSpec(bArr);
        }
        com.heytap.accessory.base.logging.a.b("AFSecurityUtils - kscTrack", "seekerIvSpec size is wrong");
        return null;
    }
}
