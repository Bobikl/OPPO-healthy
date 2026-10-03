package com.oplus.aiunit.vision;

import android.util.Base64;
import android.util.Log;
import com.oplus.weatherservicesdk.data.Weather;
import com.oplus.weatherservicesdk.model.SecureSettingsData;
import com.oppo.osec.signer.SdkClientException;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;

/* JADX INFO: loaded from: classes9.dex */
public class msk extends u5 {
    public static final List<String> d = Arrays.asList("connection", "x-amzn-trace-id");
    public final mjg b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f14212c;

    public msk() {
        this(true);
    }

    public String j(w2h<?> w2hVar) {
        InputStream inputStreamB = b(w2hVar);
        w2hVar.h();
        inputStreamB.mark(-1);
        String strA = be1.a(i(inputStreamB));
        try {
            inputStreamB.reset();
            try {
                inputStreamB.close();
            } catch (IOException e2) {
                e2.printStackTrace();
            }
            return strA;
        } catch (IOException e3) {
            throw new SdkClientException("Unable to reset stream after calculating AWS4 signature", e3);
        }
    }

    public String k(w2h<?> w2hVar, String str) {
        return w2hVar.c().toString() + Weather.SEPARATOR + g(com.oppo.osec.signer.util.a.a(w2hVar.i().getPath(), w2hVar.d()), this.f14212c) + Weather.SEPARATOR + e(w2hVar) + Weather.SEPARATOR + l(w2hVar) + Weather.SEPARATOR + n(w2hVar) + Weather.SEPARATOR + str;
    }

    public String l(w2h<?> w2hVar) {
        ArrayList<String> arrayList = new ArrayList(w2hVar.a().keySet());
        Collections.sort(arrayList, String.CASE_INSENSITIVE_ORDER);
        Map<String, String> mapA = w2hVar.a();
        StringBuilder sb = new StringBuilder();
        for (String str : arrayList) {
            if (!o(str)) {
                String strD = h1j.d(str);
                String str2 = mapA.get(str);
                h1j.a(sb, strD);
                sb.append(":");
                if (str2 != null) {
                    h1j.a(sb, str2);
                }
                sb.append(Weather.SEPARATOR);
            }
        }
        return sb.toString();
    }

    public HashMap<String, String> m(ik9 ik9Var, mh8 mh8Var) throws Exception {
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream((ik9Var.a() == null ? "" : ik9Var.a()).getBytes(StandardCharsets.UTF_8));
        String string = UUID.randomUUID().toString();
        String strValueOf = String.valueOf(System.currentTimeMillis());
        Map<String, String> mapB = ik9Var.b();
        HashMap<String, String> map = new HashMap<>();
        mapB.put("X-Euler-Timestamp", strValueOf);
        mapB.put("X-Euler-Nonce", string);
        mapB.putAll(map);
        x2h x2hVar = new x2h(ik9Var.e(), "/", ik9Var.c(), mapB, byteArrayInputStream);
        x2hVar.b(ik9Var.d());
        String strK = k(x2hVar, j(x2hVar));
        Log.d("signatureInfo", "signing string is\n" + strK);
        String strEncodeToString = Base64.encodeToString(mh8Var.a(strK.getBytes(StandardCharsets.UTF_8)), 2);
        map.put("x-euler-headers", n(x2hVar));
        map.put("x-euler-const", "20139000::" + strEncodeToString + SecureSettingsData.SEPARATOR + strValueOf + SecureSettingsData.SEPARATOR + string + SecureSettingsData.SEPARATOR + "null");
        return map;
    }

    public String n(w2h<?> w2hVar) {
        ArrayList<String> arrayList = new ArrayList(w2hVar.a().keySet());
        Collections.sort(arrayList, String.CASE_INSENSITIVE_ORDER);
        StringBuilder sb = new StringBuilder();
        for (String str : arrayList) {
            if (!o(str)) {
                if (sb.length() > 0) {
                    sb.append(";");
                }
                sb.append(h1j.d(str));
            }
        }
        return sb.toString();
    }

    public boolean o(String str) {
        return d.contains(str.toLowerCase());
    }

    public msk(boolean z) {
        this(z, mjg.b.a());
    }

    public msk(boolean z, mjg mjgVar) {
        this.f14212c = z;
        this.b = mjgVar;
    }
}
