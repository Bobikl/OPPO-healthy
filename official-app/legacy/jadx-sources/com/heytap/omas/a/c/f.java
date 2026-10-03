package com.heytap.omas.a.c;

import android.content.Context;
import android.text.TextUtils;
import android.util.Base64;
import android.util.Log;
import androidx.annotation.NonNull;
import com.google.gson.JsonSyntaxException;
import com.heytap.omas.a.e.h;
import com.heytap.omas.a.e.i;
import com.heytap.omas.omkms.data.l;
import com.heytap.omas.omkms.exception.AuthenticationException;
import com.heytap.omas.proto.Omkms3;
import com.heytap.omas.wb.WbkitAndr;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;

/* JADX INFO: loaded from: classes19.dex */
public class f {
    private static final String a = "SignatureUtil";
    private static final String b = "HMAC";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final String f7590c = "SHA256";
    private static final String d = "WB";

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final String f7591e = "SessionKey";
    private static final String f = "HmacSHA256";
    private static final int g = 0;

    public static Omkms3.CMSSignedData a(com.heytap.omas.omkms.data.d dVar, byte[] bArr) {
        if (dVar != null && bArr != null && bArr.length != 0) {
            byte[] bArrSignature = WbkitAndr.signature(dVar.a(), dVar.c(), bArr, dVar.b().getWbId(), dVar.b().getWbKeyId(), dVar.b().getWbVersion());
            if (bArrSignature != null && bArrSignature.length != 0) {
                return Omkms3.CMSSignedData.newBuilder().setHashId("SHA256").setSignedContent(Base64.encodeToString(bArrSignature, 2)).setSignAlg(b).build();
            }
            i.b(a, "commProtoCmsWbSign:  WbkitAndr.signature return null.that indicate user'info auth fail.");
        }
        return null;
    }

    private static String b(Context context, l lVar, byte[] bArr, com.heytap.omas.omkms.feature.b bVar) throws AuthenticationException {
        if (lVar == null || lVar.a() == null) {
            throw new AuthenticationException("userInitInfo must not be null");
        }
        if (bArr == null || bArr.length == 0) {
            throw new AuthenticationException("data cannot be null or empty.");
        }
        if (bVar == null) {
            i.b(a, "ticketManager cannot be null or empty.");
            return null;
        }
        Omkms3.ServiceSessionInfo serviceSessionInfoB = lVar.b();
        if (serviceSessionInfoB == null) {
            Log.e(a, "businessSessionKeyMacSign: serviceSessionInfo is null,should not take place always.");
            return null;
        }
        try {
            byte[] bArrA = bVar.a();
            Omkms3.CMSEncryptedData cMSEncryptedDataA = a.a(lVar.a().b()).a(Base64.decode(lVar.b().getDek(), 2), bArrA);
            Omkms3.CMSEncryptedData cMSEncryptedDataA2 = a.a(lVar.a().b()).a(Base64.decode(lVar.b().getMk(), 2), bArrA);
            if (cMSEncryptedDataA != null && cMSEncryptedDataA2 != null) {
                String strA = h.a(cMSEncryptedDataA, (Class<Omkms3.CMSEncryptedData>) Omkms3.CMSEncryptedData.class);
                String strA2 = h.a(Omkms3.NonceClass.newBuilder().setEncryptedDekString(strA).setEncryptedMkString(h.a(cMSEncryptedDataA2, (Class<Omkms3.CMSEncryptedData>) Omkms3.CMSEncryptedData.class)).build(), (Class<Omkms3.NonceClass>) Omkms3.NonceClass.class);
                Mac mac = Mac.getInstance(f);
                mac.init(new SecretKeySpec(Base64.decode(serviceSessionInfoB.getMk(), 2), f));
                return h.a(Omkms3.Pack.newBuilder().setSignature(h.a(Omkms3.CMSSignedData.newBuilder().setHashId("SHA256").setSignedContent(Base64.encodeToString(mac.doFinal(bArr), 2)).setSignAlg(b).build(), (Class<Omkms3.CMSSignedData>) Omkms3.CMSSignedData.class)).setHeader(h.a(com.heytap.omas.omkms.feature.e.a(context, lVar.a(), serviceSessionInfoB.getTicket(), strA2), (Class<Omkms3.Header>) Omkms3.Header.class)).build(), (Class<Omkms3.Pack>) Omkms3.Pack.class);
            }
            i.b(a, "sessionEncrypt: commProtoCmsEncrypt return null,slways shopuld not take place.");
            return null;
        } catch (InvalidKeyException | NoSuchAlgorithmException unused) {
            i.b(a, "businessSessionKeyMacSign: all ways should not log out here.");
            return null;
        }
    }

    public static Omkms3.CMSSignedData a(byte[] bArr, byte[] bArr2) {
        if (bArr != null && bArr2 != null) {
            try {
                SecretKeySpec secretKeySpec = new SecretKeySpec(bArr2, f);
                Mac mac = Mac.getInstance(f);
                mac.init(secretKeySpec);
                Omkms3.CMSSignedData cMSSignedDataBuild = Omkms3.CMSSignedData.newBuilder().setHashId("SHA256").setSignedContent(Base64.encodeToString(mac.doFinal(bArr), 2)).setSignAlg(b).build();
                cMSSignedDataBuild.toString();
                return cMSSignedDataBuild;
            } catch (Exception e2) {
                i.b(a, "commProtoCmsSign: Mac exception:" + e2.getMessage());
            }
        }
        return null;
    }

    public static Omkms3.CMSSignedData a(byte[] bArr, byte[] bArr2, byte[] bArr3) {
        if (bArr == null || bArr2 == null || bArr3 == null) {
            throw new IllegalArgumentException("Parameters invalid.");
        }
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(bArr3, f);
            Mac mac = Mac.getInstance(f);
            mac.init(secretKeySpec);
            return Omkms3.CMSSignedData.newBuilder().setHashId("SHA256").setSignedContent(Base64.encodeToString(mac.doFinal(com.heytap.omas.a.e.c.a(bArr, bArr2)), 2)).setSignAlg(b).build();
        } catch (InvalidKeyException | NoSuchAlgorithmException e2) {
            i.b(a, "commProtoCmsSign: Mac exception:" + e2);
            return null;
        }
    }

    private static String a(Context context, com.heytap.omas.omkms.data.d dVar, byte[] bArr) {
        if (dVar != null && bArr != null && bArr.length != 0) {
            byte[] bArrSignature = WbkitAndr.signature(dVar.a(), dVar.c(), bArr, dVar.b().getWbId(), dVar.b().getWbKeyId(), dVar.b().getWbVersion());
            if (bArrSignature != null && bArrSignature.length != 0) {
                return h.a(Omkms3.Pack.newBuilder().setSignature(h.a(Omkms3.CMSSignedData.newBuilder().setHashId("SHA256").setSignedContent(Base64.encodeToString(bArrSignature, 2)).setSignAlg(b).build(), (Class<Omkms3.CMSSignedData>) Omkms3.CMSSignedData.class)).setHeader(h.a(com.heytap.omas.omkms.feature.e.a(dVar, com.heytap.omas.a.e.l.a().a(context)), (Class<Omkms3.Header>) Omkms3.Header.class)).build(), (Class<Omkms3.Pack>) Omkms3.Pack.class);
            }
            i.b(a, "commProtoCmsWbSign:  WbkitAndr.signature return null.that indicate user'info auth fail.");
        }
        return null;
    }

    public static String a(Context context, l lVar, byte[] bArr, @NonNull com.heytap.omas.omkms.feature.b bVar) throws AuthenticationException {
        if (context == null || lVar == null || bArr == null || bVar == null) {
            throw new IllegalArgumentException("Parameters invalid.");
        }
        if (lVar.a().b().getSignMode() != 1) {
            String strC = lVar.c();
            strC.hashCode();
            if (!strC.equals("WB")) {
                if (strC.equals("SessionKey")) {
                    return b(context, lVar, bArr, bVar);
                }
                throw new IllegalStateException("Unexpected value: " + lVar.c());
            }
        }
        return a(context, lVar.a(), bArr);
    }

    /* JADX WARN: Code duplicated, block: B:32:0x009f  */
    public static boolean a(Context context, l lVar, String str, byte[] bArr, com.heytap.omas.omkms.feature.b bVar) throws AuthenticationException {
        byte b2;
        if (context == null || lVar == null) {
            throw new IllegalArgumentException("Parameters invalid.");
        }
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException("Parameters invalid,macSignedData cannot be null or empty.");
        }
        try {
            Omkms3.Pack pack = (Omkms3.Pack) h.a(str, Omkms3.Pack.class);
            Omkms3.Header header = pack.getHeader();
            Omkms3.CMSSignedData signature = pack.getSignature();
            if (header == null) {
                throw new AuthenticationException("Parameters invalid.macSignedData not contains header content.");
            }
            if (signature == null) {
                throw new AuthenticationException("Parameters invalid.macSignedData not contains signature content.");
            }
            if (!"SHA256".equals(signature.getHashId())) {
                throw new AuthenticationException("Not support this hashId:" + signature.getHashId());
            }
            if (!b.equals(signature.getSignAlg())) {
                throw new AuthenticationException("Not support this algorithm:" + signature.getSignAlg());
            }
            if (!lVar.c().equals(header.getKeyType())) {
                i.c(a, "Key type not mach,type of init is:" + lVar.c() + ",while key type of cmsMacSignedData is:" + header.getKeyType());
            }
            if (TextUtils.isEmpty(signature.getSignedContent())) {
                throw new AuthenticationException("signed content cannot be null or empty,signed data invalid.");
            }
            String keyType = header.getKeyType();
            int iHashCode = keyType.hashCode();
            if (iHashCode != -639668215) {
                if (iHashCode == 2763 && keyType.equals("WB")) {
                    b2 = 0;
                } else {
                    b2 = -1;
                }
            } else if (keyType.equals("SessionKey")) {
                b2 = 1;
            } else {
                b2 = -1;
            }
            if (b2 == 0) {
                return a(lVar.a(), Base64.decode(signature.getSignedContent().getBytes(), 2), bArr);
            }
            if (b2 != 1) {
                throw new IllegalStateException("Unexpected value: " + lVar.c());
            }
            byte[] bArrA = bVar.a();
            if (bArrA == null || bArrA.length == 0) {
                i.b(a, "businessDataDecrypt: fatal error,cannot found local kek,always should not take place.");
                throw new AuthenticationException("businessDataDecrypt: fatal error,cannot found local kek, always should not take place.");
            }
            if (TextUtils.isEmpty(header.getNonce())) {
                i.b(a, "businessMacVerify: nonce of header cannot be null or empty, signed data invalid.");
                throw new AuthenticationException("nonce of header cannot be null or empty, signed data invalid.");
            }
            Omkms3.NonceClass nonceClass = (Omkms3.NonceClass) h.a(header.getNonce(), Omkms3.NonceClass.class);
            if (TextUtils.isEmpty(nonceClass.getEncryptedMkJsonString())) {
                i.b(a, "businessMacVerify: nonce of header not contain encryptedMk, signed data invalid.");
                throw new AuthenticationException("businessMacVerify: nonce of header not contain encryptedMk, signed data invalid.");
            }
            byte[] bArrA2 = a.a(lVar.a().b()).a(nonceClass.getEncryptedMk(), bArrA);
            if (bArrA2 != null && bArrA2.length != 0) {
                return a(lVar, Base64.decode(signature.getSignedContent(), 2), bArr, bArrA2);
            }
            i.b(a, "businessMacVerify: encrypted mk decrypt fail,always should not take place.");
            throw new AuthenticationException("businessMacVerify: encrypted mk decrypt fail,always should not take place.");
        } catch (JsonSyntaxException e2) {
            i.b(a, "businessMacVerify: I" + e2);
            throw new AuthenticationException("CmsMacSignedData invalid.");
        }
    }

    public static boolean a(com.heytap.omas.omkms.data.d dVar, byte[] bArr, Omkms3.CMSSignedData cMSSignedData) {
        StringBuilder sb;
        String string;
        String hashId;
        if (dVar == null) {
            string = "commProtoCmsWbVerify: Parameters invalid.initParamData:" + dVar;
        } else {
            if (bArr == null || bArr.length == 0) {
                sb = new StringBuilder();
                sb.append("commProtoCmsWbVerify: Parameters invalid.srcData:");
                sb.append(bArr);
            } else if (cMSSignedData == null) {
                string = "commProtoCmsWbVerify: Parameters invalid.cmsSignedData:null";
            } else {
                if (!b.equals(cMSSignedData.getSignAlg())) {
                    sb = new StringBuilder();
                    sb.append("commProtoCmsWbVerify: Parameters invalid,Signature'signAlg not match ,cmsSignedData'signAlg:");
                    hashId = cMSSignedData.getSignAlg();
                } else if (!"SHA256".equals(cMSSignedData.getHashId())) {
                    sb = new StringBuilder();
                    sb.append("commProtoCmsWbVerify: Parameters invalid,Signature'hashId not match ,cmsSignedData'hashId:");
                    hashId = cMSSignedData.getHashId();
                } else if (cMSSignedData.getSignedContent() == null || cMSSignedData.getSignedContent().getBytes().length == 0) {
                    string = "commProtoCmsWbVerify: Server data error,cmsSignedData'Content must not be null or length ==0 ";
                } else {
                    if (WbkitAndr.verify(dVar.a(), dVar.c(), Base64.decode(cMSSignedData.getSignedContent(), 2), bArr, dVar.b().getWbId(), dVar.b().getWbKeyId(), dVar.b().getWbVersion()) == 0) {
                        return true;
                    }
                    string = "commProtoCmsWbVerify: fail.";
                }
                sb.append(hashId);
            }
            string = sb.toString();
        }
        i.b(a, string);
        return false;
    }

    private static boolean a(com.heytap.omas.omkms.data.d dVar, byte[] bArr, byte[] bArr2) {
        if (dVar == null) {
            i.b(a, "businessWbMacVerify: Parameters invalid,initParamData must not be null.");
            throw new IllegalArgumentException("Parameters invalid,initParamData must not be null.");
        }
        if (bArr == null || bArr.length == 0) {
            i.b(a, "businessWbMacVerify: Parameters invalid,omasMacSignedData must not be null or length == 0");
            throw new IllegalArgumentException("Parameters invalid,omasMacSignedData cannot be null.");
        }
        if (bArr2 == null || bArr2.length == 0) {
            throw new IllegalArgumentException("Parameters invalid,data cannot be null.");
        }
        int iVerify = WbkitAndr.verify(dVar.a(), dVar.c(), bArr, bArr2, dVar.b().getWbId(), dVar.b().getWbKeyId(), dVar.b().getWbVersion());
        if (iVerify == 0) {
            return true;
        }
        i.b(a, "businessWbMacVerify: fail. ret:" + iVerify);
        return false;
    }

    private static boolean a(l lVar, byte[] bArr, byte[] bArr2, byte[] bArr3) throws AuthenticationException {
        String str;
        if (lVar == null || lVar.a() == null) {
            throw new AuthenticationException("userInitInfo or InitParamData must not be null");
        }
        if (lVar.a().b() == null) {
            return false;
        }
        if (bArr2 == null || bArr2.length == 0) {
            str = "businessSessionKeyMacVerify: Parameters invalid,metaContentData must not be null or length == 0";
        } else {
            try {
                Mac mac = Mac.getInstance(f);
                mac.init(new SecretKeySpec(bArr3, f));
                return Arrays.equals(mac.doFinal(bArr2), bArr);
            } catch (InvalidKeyException | NoSuchAlgorithmException unused) {
                str = "businessSessionKeyMacSign: all ways should not log out here.";
            }
        }
        i.b(a, str);
        return false;
    }

    public static boolean a(byte[] bArr, byte[] bArr2, Omkms3.CMSSignedData cMSSignedData) {
        String str;
        if (bArr == null || bArr2 == null) {
            str = "commProtoCmsVerify: Parameters invalid.data:" + bArr + ",signKey:" + bArr2;
        } else {
            try {
                SecretKeySpec secretKeySpec = new SecretKeySpec(bArr2, f);
                Mac mac = Mac.getInstance(f);
                mac.init(secretKeySpec);
                if (Arrays.equals(Base64.decode(cMSSignedData.getSignedContent(), 2), mac.doFinal(bArr))) {
                    return true;
                }
                i.b(a, "commProtoCmsVerify: unSuccessful.");
                return false;
            } catch (InvalidKeyException | NoSuchAlgorithmException e2) {
                str = "commProtoCmsVerify: Mac Exception:" + e2.getMessage();
            }
        }
        i.b(a, str);
        return false;
    }
}
