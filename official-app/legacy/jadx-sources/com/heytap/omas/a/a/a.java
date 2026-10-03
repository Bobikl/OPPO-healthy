package com.heytap.omas.a.a;

import android.content.Context;
import android.text.TextUtils;
import android.util.Base64;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.gson.JsonSyntaxException;
import com.heytap.omas.a.c.f;
import com.heytap.omas.a.e.i;
import com.heytap.omas.a.e.m;
import com.heytap.omas.omkms.data.d;
import com.heytap.omas.omkms.data.h;
import com.heytap.omas.omkms.data.l;
import com.heytap.omas.omkms.exception.AuthenticationException;
import com.heytap.omas.proto.Omkms3;
import com.heytap.omas.wb.WbkitAndr;
import java.util.Arrays;

/* JADX INFO: loaded from: classes19.dex */
public final class a {
    private static final String a = "OmkmsAuth";
    private static final String b = "AndroidKeyStore";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final String f7568c = "HMAC";
    private static final String d = "SHA256";

    private a() {
    }

    public static d a(Context context, h hVar) {
        byte[] bArrA = a(hVar);
        if (bArrA != null && bArrA.length != 0) {
            byte[] bArrHmac = WbkitAndr.hmac(com.heytap.omas.a.e.c.a(new String(hVar.getWbId()).getBytes(), new String(hVar.getAppName()).getBytes()), bArrA);
            if (bArrHmac != null && bArrHmac.length != 0) {
                byte[] bArrB = b(context, hVar);
                if (a(hVar, bArrA, bArrHmac, bArrB)) {
                    return d.a(hVar).a(bArrHmac).b(bArrB).a();
                }
                return null;
            }
            i.b(a, "auth: WbkitAndr.hmac return null,this always should not happen,bug here.");
        }
        return null;
    }

    @Nullable
    private static byte[] b(Context context, h hVar) {
        if (context == null || hVar == null) {
            i.c(a, "genPkgInfo: Parameters invalid.");
            return null;
        }
        String packageName = context.getPackageName();
        return (packageName + "^" + com.heytap.omas.a.e.b.b(context, packageName)).getBytes();
    }

    public static void a(@NonNull Omkms3.Pack pack, @NonNull l lVar, @NonNull com.heytap.omas.omkms.feature.b bVar) throws AuthenticationException {
        if (pack == null || lVar == null || lVar.a() == null || lVar.a().b() == null) {
            throw new AuthenticationException("Parameters invalid.");
        }
        if (TextUtils.isEmpty(pack.getHeaderString())) {
            i.b(a, "cipherTextAuth: headerString:" + pack.getHeaderString());
            throw new AuthenticationException("cipher text auth fail,pack not contains header content.");
        }
        if (TextUtils.isEmpty(pack.getPayloadString())) {
            i.b(a, "cipherTextAuth: payloadString:" + pack.getPayloadString());
            throw new AuthenticationException("cipher text auth fail,pack not contains payload content.");
        }
        if (TextUtils.isEmpty(pack.getSignatureString())) {
            i.b(a, "cipherTextAuth: signatureString:" + pack.getSignatureString());
            throw new AuthenticationException("cipher text auth fail,pack not contains signature content.");
        }
        Omkms3.CMSSignedData signature = pack.getSignature();
        byte[] bArrA = com.heytap.omas.a.e.c.a(pack.getHeaderString().getBytes(), pack.getPayloadString().getBytes());
        if (!f7568c.equals(signature.getSignAlg()) || !"SHA256".equals(signature.getHashId())) {
            i.b(a, "cipherTextAu: only support sigAlg=HMAC,hashId=SHA256. sigAlg=" + signature.getSignAlg() + ",hashId=" + signature.getHashId());
            throw new AuthenticationException("cipher text auth fail,only support sigAlg=HMAC,hashId=SHA256.");
        }
        if (signature.getSignedContent() == null) {
            throw new AuthenticationException("cipher text auth fail,signature not contains signed content data.");
        }
        String keyType = pack.getHeader().getKeyType();
        keyType.hashCode();
        if (keyType.equals("WB")) {
            if (WbkitAndr.verify(lVar.a().a(), lVar.a().c(), Base64.decode(signature.getSignedContent(), 2), bArrA, lVar.a().b().getWbId(), lVar.a().b().getWbKeyId(), lVar.a().b().getWbVersion()) == 0) {
                return;
            }
            i.b(a, "cipherTextAuth: signature authentication failed.");
            throw new AuthenticationException("cipher text auth fail,signature authentication failed.");
        }
        if (!keyType.equals("SessionKey")) {
            throw new IllegalStateException("Should not take place always,Unexpected value: " + lVar.c());
        }
        if (!pack.getHeader().getKeyType().equals(lVar.c())) {
            i.c(a, "cipherTextAuth: keyType not match. header key type:" + pack.getHeader().getKeyType() + ",secKitClient key type:" + lVar.c());
        }
        String nonce = pack.getHeader().getNonce();
        if (TextUtils.isEmpty(nonce)) {
            i.b(a, "cipherTextAuth: nonce:" + pack.getHeader().getNonce());
            throw new AuthenticationException("cipher text auth fail,header of pack not contains nonce content.always should not take place.");
        }
        try {
            Omkms3.NonceClass nonceClass = (Omkms3.NonceClass) com.heytap.omas.a.e.h.a(nonce, Omkms3.NonceClass.class);
            if (TextUtils.isEmpty(nonceClass.getEncryptedDekJsonString())) {
                i.b(a, "cipherTextAuth: encryptedDek:" + nonceClass.getEncryptedDekJsonString());
                throw new AuthenticationException("cipher text auth fail,header of pack not contains encryptedDek content.always should not take place.");
            }
            byte[] bArrA2 = com.heytap.omas.a.e.c.a(pack.getHeaderString().getBytes(), pack.getPayloadString().getBytes());
            byte[] bArrA3 = bVar.a();
            if (bArrA3 == null || bArrA3.length == 0) {
                throw new AuthenticationException("internal error,not found local kek,always should not take place.");
            }
            if (TextUtils.isEmpty(nonceClass.getEncryptedMkJsonString())) {
                i.b(a, "cipherTextAuth: encryptedMk:" + nonceClass.getEncryptedMkJsonString());
                throw new AuthenticationException("cipher text auth fail,header of pack not contains encryptedMk content.always should not take place.");
            }
            byte[] bArrA4 = com.heytap.omas.a.c.a.a(lVar.a().b()).a(nonceClass.getEncryptedMk(), bArrA3);
            if (bArrA4 == null || bArrA4.length == 0) {
                throw new AuthenticationException("cipher text invalid,cannot decrypt encrypted mk.");
            }
            if (!f.a(bArrA2, bArrA4, signature)) {
                throw new AuthenticationException("data signature verify fail,cipherText invalid.");
            }
        } catch (JsonSyntaxException e2) {
            i.b(a, "cipherTextAuth: nonce illegal," + e2);
            throw new AuthenticationException("cipher text auth fail,nonce of header invalid,always should not take place.");
        }
    }

    public static boolean a(Context context, long j2, long j3) {
        String str;
        if (context == null) {
            throw new IllegalArgumentException("checkSessionKeyTimeValid: context cannot be null.");
        }
        long jA = com.heytap.omas.a.e.l.a().a(context);
        long jB = m.b() + jA;
        long j4 = com.heytap.omas.a.e.l.f7597e;
        if (jA == j4 || j2 == j4 || j3 == j4 || j2 >= j3) {
            str = "timeStampAuth,parameters invalid.";
        } else {
            if (jB >= j2 && 10 + jB <= j3) {
                return true;
            }
            str = "timeStampAuth,time not between begin time with end time.calibratedTime:" + jB + ",sessionKeyBeginTime:" + j2 + ",sessionKeyEndTime:" + j3;
        }
        i.b(a, str);
        return false;
    }

    private static boolean a(h hVar, byte[] bArr, byte[] bArr2, byte[] bArr3) {
        String str;
        if (hVar == null) {
            str = "appNameAuth: parameter invalid,initParamSpec cannot be null.";
        } else {
            if (bArr == null || bArr.length == 0) {
                i.b(a, "appNameAuth: parameter invalid,secretKey cannot be null or length == 0.");
                return false;
            }
            if (bArr2 == null || bArr2.length == 0) {
                i.b(a, "appNameAuth: parameter invalid,secretKey cannot be null or length == 0.");
                return false;
            }
            if (bArr3 == null) {
                i.c(a, "appNameAuth: pkgInfo not specify.");
            }
            byte[] appid = WbkitAndr.getAppid(bArr2, bArr3, hVar.getWbId(), hVar.getWbVersion());
            if (appid == null) {
                str = "appNameAuth: auth fail. cannot getAppName.";
            } else {
                if (Arrays.equals(appid, hVar.getAppName())) {
                    return true;
                }
                Arrays.toString(appid);
                Arrays.toString(hVar.getAppName());
                str = "appNameAuth,auth fail.";
            }
        }
        i.b(a, str);
        return false;
    }

    private static byte[] a(h hVar) {
        String str;
        if (hVar == null) {
            str = "appNameAuth: parameter invalid,initParamSpec cannot be null.";
        } else {
            byte[] sk = WbkitAndr.getSk(hVar.getAccessKey(), hVar.getWbId(), hVar.getWbVersion());
            if (sk != null && sk.length != 0) {
                return sk;
            }
            str = "accessKeyAuth: accessKey auth fail.";
        }
        i.b(a, str);
        return null;
    }
}
