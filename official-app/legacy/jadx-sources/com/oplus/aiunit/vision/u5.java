package com.oplus.aiunit.vision;

import com.heytap.store.base.core.http.HttpUtils;
import com.oppo.osec.signer.AmazonClientException;
import com.oppo.osec.signer.SdkClientException;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import org.apache.commons.codec.digest.MessageDigestAlgorithms;

/* JADX INFO: loaded from: classes9.dex */
public abstract class u5 {
    public static ThreadLocal<MessageDigest> a = ujg.a(new a());
    public static String EMPTY_STRING_SHA256_HEX = be1.a(a(""));

    public class a extends ThreadLocal<MessageDigest> {
        @Override // java.lang.ThreadLocal
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public MessageDigest initialValue() {
            try {
                return MessageDigest.getInstance(MessageDigestAlgorithms.SHA_256);
            } catch (NoSuchAlgorithmException e2) {
                throw new SdkClientException("Unable to get SHA256 Function" + e2.getMessage(), e2);
            }
        }
    }

    public static byte[] a(String str) throws SdkClientException {
        try {
            MessageDigest messageDigestH = h();
            messageDigestH.update(str.getBytes(h1j.UTF8));
            return messageDigestH.digest();
        } catch (Exception e2) {
            throw new SdkClientException("Unable to compute hash while signing request: " + e2.getMessage(), e2);
        }
    }

    public static MessageDigest h() {
        MessageDigest messageDigest = a.get();
        messageDigest.reset();
        return messageDigest;
    }

    public InputStream b(w2h<?> w2hVar) {
        if (!com.oppo.osec.signer.util.a.e(w2hVar)) {
            return c(w2hVar);
        }
        String strC = com.oppo.osec.signer.util.a.c(w2hVar);
        return strC == null ? new ByteArrayInputStream(new byte[0]) : new ByteArrayInputStream(strC.getBytes(h1j.UTF8));
    }

    public InputStream c(w2h<?> w2hVar) {
        try {
            InputStream inputStreamE = w2hVar.e();
            if (inputStreamE == null) {
                return new ByteArrayInputStream(new byte[0]);
            }
            if (inputStreamE.markSupported()) {
                return inputStreamE;
            }
            throw new SdkClientException("Unable to read request payload to sign request.");
        } catch (AmazonClientException e2) {
            throw e2;
        } catch (Exception e3) {
            throw new SdkClientException("Unable to read request payload to sign request: " + e3.getMessage(), e3);
        }
    }

    public String d(w2h<?> w2hVar) {
        if (w2hVar.i().getQuery() != null) {
            for (String str : w2hVar.i().getRawQuery().split("&")) {
                String[] strArrE = h1j.e(str, kam.h);
                if (strArrE.length == 2) {
                    w2hVar.g(strArrE[0], strArrE[1]);
                }
                if (strArrE.length == 1) {
                    w2hVar.g(strArrE[0], "");
                }
            }
        }
        return f(w2hVar.getParameters(), true);
    }

    public String e(w2h<?> w2hVar) {
        String strF = w2hVar.f();
        if ((strF == null || strF.equals("OLD")) ? false : true) {
            return d(w2hVar);
        }
        if (w2hVar.i().getQuery() != null) {
            for (String str : w2hVar.i().getQuery().split("&")) {
                String[] strArrSplit = str.split(HttpUtils.EQUAL_SIGN);
                if (strArrSplit.length == 2) {
                    w2hVar.g(strArrSplit[0], strArrSplit[1]);
                }
            }
        }
        return f(w2hVar.getParameters(), false);
    }

    public String f(Map<String, List<String>> map, boolean z) {
        TreeMap treeMap = new TreeMap();
        for (Map.Entry<String, List<String>> entry : map.entrySet()) {
            String key = entry.getKey();
            List<String> value = entry.getValue();
            ArrayList arrayList = new ArrayList(value.size());
            if (!z) {
                key = com.oppo.osec.signer.util.a.d(key, false);
                Iterator<String> it = value.iterator();
                while (it.hasNext()) {
                    arrayList.add(com.oppo.osec.signer.util.a.d(it.next(), false));
                }
                value = arrayList;
            }
            Collections.sort(value);
            treeMap.put(key, value);
        }
        StringBuilder sb = new StringBuilder();
        for (Map.Entry entry2 : treeMap.entrySet()) {
            for (String str : (List) entry2.getValue()) {
                if (sb.length() > 0) {
                    sb.append("&");
                }
                sb.append((String) entry2.getKey());
                if (!h1j.b(str)) {
                    sb.append(HttpUtils.EQUAL_SIGN);
                    sb.append(str);
                }
            }
        }
        return sb.toString();
    }

    public String g(String str, boolean z) {
        if (str == null || str.isEmpty()) {
            return "/";
        }
        if (z) {
            str = com.oppo.osec.signer.util.a.d(str, true);
        }
        return str.startsWith("/") ? str : "/".concat(str);
    }

    /* JADX WARN: Code duplicated, block: B:30:0x004e A[EXC_TOP_SPLITTER, SYNTHETIC] */
    public byte[] i(InputStream inputStream) throws Throwable {
        njg njgVar;
        Throwable th;
        Exception e2;
        try {
            njgVar = new njg(inputStream, h());
            try {
                try {
                    while (njgVar.read(new byte[1024]) > -1) {
                    }
                    byte[] bArrDigest = njgVar.getMessageDigest().digest();
                    try {
                        njgVar.close();
                    } catch (IOException e3) {
                        e3.printStackTrace();
                    }
                    return bArrDigest;
                } catch (Exception e4) {
                    e2 = e4;
                    throw new SdkClientException("Unable to compute hash while signing request: " + e2.getMessage(), e2);
                }
            } catch (Throwable th2) {
                th = th2;
                if (njgVar != null) {
                    try {
                        njgVar.close();
                    } catch (IOException e5) {
                        e5.printStackTrace();
                    }
                }
                throw th;
            }
        } catch (Exception e6) {
            njgVar = null;
            e2 = e6;
        } catch (Throwable th3) {
            njgVar = null;
            th = th3;
            if (njgVar != null) {
                njgVar.close();
            }
            throw th;
        }
    }
}
