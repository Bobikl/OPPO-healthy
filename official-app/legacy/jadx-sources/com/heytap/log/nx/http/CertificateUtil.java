package com.heytap.log.nx.http;

import android.text.TextUtils;
import android.util.Log;
import java.security.KeyStore;
import java.security.cert.Certificate;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes19.dex */
public class CertificateUtil {
    private static final String TAG = "CertificateUtil";

    public static X509Certificate[] getCertsFromAlias(List<String> list, KeyStore keyStore) {
        ArrayList arrayList = new ArrayList();
        if (keyStore != null && list != null && list.size() > 0) {
            try {
                Iterator<String> it = list.iterator();
                while (it.hasNext()) {
                    Certificate certificate = keyStore.getCertificate(it.next());
                    if (certificate != null && (certificate instanceof X509Certificate)) {
                        arrayList.add((X509Certificate) certificate);
                    }
                }
            } catch (Throwable unused) {
            }
        }
        if (arrayList.size() <= 0) {
            return null;
        }
        X509Certificate[] x509CertificateArr = new X509Certificate[arrayList.size()];
        for (int i = 0; i < arrayList.size(); i++) {
            x509CertificateArr[i] = (X509Certificate) arrayList.get(i);
        }
        return x509CertificateArr;
    }

    public static void getCertsFromKeyStore(KeyStore keyStore, List<X509Certificate> list, Map<X509Certificate, String> map) {
        if (keyStore == null || list == null || map == null) {
            return;
        }
        try {
            Enumeration<String> enumerationAliases = keyStore.aliases();
            while (enumerationAliases.hasMoreElements()) {
                String strNextElement = enumerationAliases.nextElement();
                Certificate certificate = keyStore.getCertificate(strNextElement);
                if (certificate != null && (certificate instanceof X509Certificate)) {
                    if (strNextElement.startsWith("user:")) {
                        list.add((X509Certificate) certificate);
                    } else if (strNextElement.startsWith("system:")) {
                        map.put((X509Certificate) certificate, strNextElement);
                    }
                }
            }
        } catch (Throwable th) {
            Log.w(TAG, "getCertsFromKeyStore : " + th.getMessage());
        }
    }

    public static String getHostFromCert(X509Certificate x509Certificate) {
        try {
            Collection<List<?>> subjectAlternativeNames = x509Certificate.getSubjectAlternativeNames();
            if (subjectAlternativeNames == null) {
                return null;
            }
            for (List<?> list : subjectAlternativeNames) {
                for (int i = 0; i < list.size(); i++) {
                    String string = list.get(i).toString();
                    if (!TextUtils.isEmpty(string) && string.equals("2")) {
                        String string2 = list.get(i + 1).toString();
                        return (TextUtils.isEmpty(string2) || !string2.startsWith("*.")) ? string2 : string2.substring(2);
                    }
                }
            }
            return null;
        } catch (Throwable unused) {
            return null;
        }
    }
}
