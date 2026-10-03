package com.heytap.accessory.security.ksc;

import android.text.TextUtils;
import android.util.Pair;
import androidx.annotation.Nullable;
import com.heytap.accessory.base.database.KscDatabase;
import com.heytap.accessory.base.database.k;
import com.heytap.accessory.base.database.m;
import com.heytap.accessory.logging.SensitiveLogUtils;
import com.heytap.accessory.misc.utils.PlatformUtils;
import com.heytap.accessory.security.e;
import com.heytap.accessory.security.h;
import com.heytap.accessory.utils.HexUtils;
import java.util.List;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;

/* JADX INFO: loaded from: classes14.dex */
public class b {
    public static final String a = b.class.getSimpleName() + " - kscTrack";
    public static volatile b b;

    public static b a() {
        if (b == null) {
            synchronized (b.class) {
                if (b == null) {
                    b = new b();
                }
            }
        }
        return b;
    }

    @Nullable
    public SecretKey b(String str, String str2) {
        if (TextUtils.isEmpty(str2)) {
            com.heytap.accessory.base.logging.a.e(a, "alias is empty, so return empty ksc");
            return null;
        }
        m mVarA = KscDatabase.b(PlatformUtils.getDefaultStorageContext()).a();
        List<k> listB = mVarA.b(str, str2);
        if (listB == null || listB.size() == 0) {
            String str3 = a;
            com.heytap.accessory.base.logging.a.a(str3, "loadKsc empty, try custom ksc,deviceId = " + SensitiveLogUtils.toHiddenIfNeed(str) + "; alias = " + SensitiveLogUtils.toHiddenIfNeed(str2));
            List<k> listB2 = mVarA.b("", str2);
            if (listB2 == null || listB2.size() == 0) {
                com.heytap.accessory.base.logging.a.e(str3, "custom loadKsc empty, deviceId = " + SensitiveLogUtils.toHiddenIfNeed("") + "; alias = " + SensitiveLogUtils.toHiddenIfNeed(str2));
                return null;
            }
            listB = listB2;
        }
        String str4 = a;
        com.heytap.accessory.base.logging.a.a(str4, "loadKsc from db = " + listB);
        k kVar = listB.get(0);
        if (kVar == null) {
            com.heytap.accessory.base.logging.a.b(str4, "ksc unknown error");
            return null;
        }
        try {
            Cipher cipherA = e.a(kVar.f2450e);
            if (cipherA == null) {
                throw new SecurityException("loadKsc cipher init failed");
            }
            byte[] bArrDoFinal = cipherA.doFinal(HexUtils.hexStrToByteArray(kVar.d));
            com.heytap.accessory.base.logging.a.a(str4, "loadKsc decryptKsc = " + SensitiveLogUtils.toHiddenIfNeed(bArrDoFinal));
            return new h.a(bArrDoFinal, "HmacSHA512");
        } catch (Exception e2) {
            com.heytap.accessory.base.logging.a.b(a, "loadKsc error," + e2);
            return null;
        }
    }

    public void c(String str, String str2) {
        KscDatabase.b(PlatformUtils.getDefaultStorageContext()).a().a(str, str2);
    }

    public boolean a(String str, String str2, byte[] bArr) throws a {
        m mVarA = KscDatabase.b(PlatformUtils.getDefaultStorageContext()).a();
        List<k> listB = mVarA.b(str, str2);
        if (listB != null && !listB.isEmpty()) {
            String str3 = a;
            com.heytap.accessory.base.logging.a.e(str3, "Alias is duplicate. param is deviceId = " + SensitiveLogUtils.toHiddenIfNeed(str) + "; alias = " + SensitiveLogUtils.toHiddenIfNeed(str2));
            StringBuilder sb = new StringBuilder();
            sb.append("db is kscList = ");
            sb.append(listB);
            com.heytap.accessory.base.logging.a.e(str3, sb.toString());
            return false;
        }
        List<k> listB2 = mVarA.b("", str2);
        if (listB2 != null && !listB2.isEmpty()) {
            com.heytap.accessory.base.logging.a.e(a, "Custom alias is duplicate. deviceId = " + SensitiveLogUtils.toHiddenIfNeed(str) + "; alias = " + SensitiveLogUtils.toHiddenIfNeed(str2));
            return false;
        }
        if (bArr != null && bArr.length == 16) {
            try {
                Pair<String, Cipher> pairA = e.a();
                if (pairA != null && pairA.second != null && !TextUtils.isEmpty((CharSequence) pairA.first)) {
                    String str4 = (String) pairA.first;
                    String str5 = a;
                    com.heytap.accessory.base.logging.a.a(str5, "saveKsc-KscEncrypt, before encrypt, deviceId = " + SensitiveLogUtils.toHiddenIfNeed(str) + "; ksc(md5) = " + SensitiveLogUtils.toMd5IfNeed(bArr) + "; kscAlias = " + SensitiveLogUtils.toHiddenIfNeed(str2));
                    byte[] bArrDoFinal = ((Cipher) pairA.second).doFinal(bArr);
                    com.heytap.accessory.base.logging.a.a(str5, "saveKsc-KscEncrypt, after encrypt, deviceId = " + SensitiveLogUtils.toHiddenIfNeed(str) + "; encryptedKsc = " + SensitiveLogUtils.toHiddenIfNeed(bArrDoFinal) + "; kscAlias = " + SensitiveLogUtils.toHiddenIfNeed(str2));
                    String strByteArrayToHexStr = HexUtils.byteArrayToHexStr(bArrDoFinal);
                    k kVar = new k();
                    kVar.d = strByteArrayToHexStr;
                    if (str == null) {
                        str = "";
                    }
                    kVar.a = str;
                    kVar.b = str2;
                    kVar.f2450e = str4;
                    kVar.f = System.currentTimeMillis();
                    mVarA.a(kVar);
                    return true;
                }
                throw new a("Iv is null while save ksc");
            } catch (Exception e2) {
                com.heytap.accessory.base.logging.a.b(a, "saveKsc failed.", e2);
                return false;
            }
        }
        throw new a("Ksc length error, now is " + (bArr != null ? bArr.length : 0) + "; 16 is required.");
    }

    public boolean a(String str, String str2) {
        if (str == null) {
            str = "";
        }
        if (str2 == null) {
            str2 = "";
        }
        List<k> listB = KscDatabase.b(PlatformUtils.getDefaultStorageContext()).a().b(str, str2);
        boolean z = (listB == null || listB.isEmpty()) ? false : true;
        com.heytap.accessory.base.logging.a.a(a, "checkKscExist, , deviceIdHex: " + SensitiveLogUtils.toHiddenIfNeed(str) + ", kscAliasHex: " + SensitiveLogUtils.toHiddenIfNeed(str2) + ", result: " + z);
        return z;
    }
}
