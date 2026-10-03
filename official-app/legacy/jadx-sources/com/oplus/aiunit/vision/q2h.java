package com.oplus.aiunit.vision;

import android.util.Base64;
import com.heytap.accessory.utils.ByteUtils;
import com.heytap.accessory.utils.HexUtils;
import com.heytap.store.base.core.http.HttpUtils;
import java.nio.charset.StandardCharsets;
import java.security.KeyFactory;
import java.security.PublicKey;
import java.security.Signature;
import java.security.spec.X509EncodedKeySpec;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Consumer;

/* JADX INFO: loaded from: classes19.dex */
public class q2h {
    public static final String SHA1_WITH_RSA = "SHA1withRSA";

    public static class a implements Comparable<a> {
        public final String i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final List<String> f15609j;

        @Override // java.lang.Comparable
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public int compareTo(a aVar) {
            return this.i.compareTo(aVar.i);
        }

        public a(String str, List<String> list) {
            this.i = str;
            this.f15609j = list;
        }
    }

    public static byte[] b(byte[] bArr, byte... bArr2) {
        if (bArr == null) {
            return d(bArr2);
        }
        if (bArr2 == null) {
            return d(bArr);
        }
        byte[] bArr3 = new byte[bArr.length + bArr2.length];
        System.arraycopy(bArr, 0, bArr3, 0, bArr.length);
        System.arraycopy(bArr2, 0, bArr3, bArr.length, bArr2.length);
        return bArr3;
    }

    public static byte[] c(HashMap<String, List<String>> map, byte[] bArr) {
        String strSubstring;
        ltl.a("SignCheckUtil", "paramMap " + map);
        ltl.a("SignCheckUtil", "body " + ByteUtils.byteToString(bArr));
        if (map == null || map.size() <= 0) {
            strSubstring = "";
        } else {
            ArrayList<a> arrayList = new ArrayList(map.size());
            for (Map.Entry<String, List<String>> entry : map.entrySet()) {
                if (!"sign".equals(f(entry.getKey()))) {
                    final ArrayList arrayList2 = new ArrayList(entry.getValue().size());
                    entry.getValue().forEach(new Consumer() { // from class: com.oplus.aiunit.vision.o2h
                        @Override // java.util.function.Consumer
                        public final void accept(Object obj) {
                            q2h.e(arrayList2, (String) obj);
                        }
                    });
                    arrayList.add(new a(f(entry.getKey()), arrayList2));
                }
            }
            Collections.sort(arrayList);
            StringBuilder sb = new StringBuilder(256);
            for (a aVar : arrayList) {
                Collections.sort(aVar.f15609j);
                for (String str : aVar.f15609j) {
                    sb.append(aVar.i);
                    sb.append(HttpUtils.EQUAL_SIGN);
                    sb.append(str);
                    sb.append("&");
                }
            }
            strSubstring = sb.toString().substring(0, sb.length() - 1);
        }
        ltl.a("SignCheckUtil", "dataStr " + strSubstring);
        byte[] bytes = strSubstring.getBytes(StandardCharsets.UTF_8);
        ltl.a("SignCheckUtil", "dataByte " + HexUtils.byteArrayToHexStr(bytes));
        return bArr.length > 0 ? b(bytes, bArr) : bytes;
    }

    public static byte[] d(byte[] bArr) {
        if (bArr == null) {
            return null;
        }
        return (byte[]) bArr.clone();
    }

    public static /* synthetic */ void e(List list, String str) {
        list.add(f(str));
    }

    public static String f(String str) {
        if (str == null) {
            return null;
        }
        return str.trim();
    }

    public static boolean g(byte[] bArr, byte[] bArr2, String str) {
        try {
            PublicKey publicKeyGeneratePublic = KeyFactory.getInstance("RSA").generatePublic(new X509EncodedKeySpec(Base64.decode(str, 0)));
            Signature signature = Signature.getInstance(SHA1_WITH_RSA);
            signature.initVerify(publicKeyGeneratePublic);
            signature.update(bArr);
            return signature.verify(bArr2);
        } catch (Exception e2) {
            throw new RuntimeException("verify sign with rsa error", e2);
        }
    }
}
