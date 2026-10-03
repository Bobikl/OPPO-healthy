package com.heytap.omas.a.e;

import android.util.Base64;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes19.dex */
public class e {
    private static final String a = "CertUtils";

    public static List<String> a(List<byte[]> list) {
        if (list == null || list.size() == 0) {
            i.b(a, "certsDerToPem");
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (byte[] bArr : list) {
            String str = "-----BEGIN CERTIFICATE-----\n" + Base64.encodeToString(bArr, 2) + "\n-----END CERTIFICATE-----";
            list.indexOf(bArr);
            arrayList.add(str);
        }
        return arrayList;
    }
}
