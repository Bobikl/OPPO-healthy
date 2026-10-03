package com.heytap.omas.a.d;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.SharedPreferences;
import androidx.annotation.NonNull;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.heytap.health.base.encrypt.AesGcmAndroidKeyStore;
import com.heytap.omas.a.e.e;
import com.heytap.omas.a.e.i;
import com.heytap.omas.omkms.data.h;
import com.heytap.omas.omkms.security.CertException;
import java.io.BufferedInputStream;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.security.InvalidKeyException;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
import java.security.Principal;
import java.security.PublicKey;
import java.security.SignatureException;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;

/* JADX INFO: loaded from: classes19.dex */
public class b {
    public static final String a = "X509CertManager";
    public static final String b = "x.509";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final String f7593c = "certificate-pool";
    private static final String d = "kms_cert_alias";

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final String f7594e = "kms_certs_alias_info";
    private static final String f = "kms_cert_";
    private static KeyStore g;

    public static class a extends TypeToken<List<String>> {
    }

    static {
        try {
            KeyStore keyStore = KeyStore.getInstance(AesGcmAndroidKeyStore.KEY_STORE_MODULE);
            g = keyStore;
            keyStore.load(null);
        } catch (Exception e2) {
            i.b(a, "keyStore get instance exception:" + e2.getMessage());
        }
    }

    private b() {
    }

    public static X509Certificate a(String str) throws CertificateException {
        return (X509Certificate) CertificateFactory.getInstance(b).generateCertificate(new ByteArrayInputStream(str.getBytes()));
    }

    public static List<String> b(Context context, h hVar, List<X509Certificate> list) {
        try {
            if (g == null) {
                i.b(a, "saveTrustedCertChain: android key store can not use,should not take place always,and cert chain would not be persistent storage.");
                return null;
            }
            if (list != null && list.size() != 0) {
                ArrayList arrayList = new ArrayList();
                for (X509Certificate x509Certificate : list) {
                    arrayList.add(hVar.getEnvConfig().getEnvName() + "_" + f + list.indexOf(x509Certificate));
                    i.c(a, "saveTrustedCertChain: " + hVar.getEnvConfig().getEnvName() + "_" + f + list.indexOf(x509Certificate) + " had save into android key store.");
                    KeyStore keyStore = g;
                    StringBuilder sb = new StringBuilder();
                    sb.append(hVar.getEnvConfig().getEnvName());
                    sb.append("_");
                    sb.append(f);
                    sb.append(list.indexOf(x509Certificate));
                    keyStore.setCertificateEntry(sb.toString(), x509Certificate);
                }
                a(context, hVar, arrayList);
                return arrayList;
            }
            i.b(a, "saveTrustedCertChain: cert chain is empty,would not save anythings.");
            return null;
        } catch (Exception e2) {
            i.b(a, "saveTrustedCertChain: exception:" + e2.getMessage());
            return null;
        }
    }

    private static List<String> c(Context context, h hVar) {
        try {
            if (context == null) {
                i.c(a, "getInterCertAlias,parameter invalid.");
                return null;
            }
            String string = context.getSharedPreferences(d, 0).getString(hVar.getEnvConfig().getEnvName() + "_" + f7594e, null);
            if (string == null) {
                i.c(a, "getCertChainAliasList: not found aliases info.");
                return null;
            }
            List<String> list = (List) new Gson().fromJson(string, new a().getType());
            list.toString();
            return list;
        } catch (Exception e2) {
            i.c(a, "getCertChainAliasList: fail." + e2.getMessage());
            return null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:41:0x00a4 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Not initialized variable reg: 8, insn: 0x00a1: MOVE (r2 I:??[OBJECT, ARRAY]) = (r8 I:??[OBJECT, ARRAY]), block:B:29:0x00a1 */
    @NonNull
    public static List<X509Certificate> a(Context context) throws Throwable {
        BufferedInputStream bufferedInputStream;
        ArrayList arrayList = new ArrayList();
        BufferedInputStream bufferedInputStream2 = null;
        try {
            try {
                try {
                    CertificateFactory certificateFactory = CertificateFactory.getInstance(b);
                    String[] list = context.getAssets().list(f7593c);
                    if (list == null || list.length == 0) {
                        i.b(a, "loadRootCertsFromFile,cannot found root certs.");
                        throw new CertException.LoadEccCertException("loadCertsFromFile,cannot found root certs");
                    }
                    int length = list.length;
                    int i = 0;
                    while (i < length) {
                        String str = list[i];
                        BufferedInputStream bufferedInputStream3 = new BufferedInputStream(context.getAssets().open("certificate-pool/" + str));
                        try {
                            arrayList.add((X509Certificate) certificateFactory.generateCertificate(bufferedInputStream3));
                            i++;
                            bufferedInputStream2 = bufferedInputStream3;
                        } catch (IOException | CertificateException e2) {
                            e = e2;
                            i.b(a, "loadRootCertFromFile,IO exception occur.detail: " + e.getMessage());
                            throw new CertException.LoadEccCertException("loadCertsFromFile exception:" + e.getMessage());
                        }
                    }
                    if (bufferedInputStream2 != null) {
                        try {
                            bufferedInputStream2.close();
                        } catch (IOException e3) {
                            i.a(e3);
                        }
                    }
                    return arrayList;
                } catch (Throwable th) {
                    th = th;
                    bufferedInputStream2 = bufferedInputStream;
                    if (bufferedInputStream2 != null) {
                        try {
                            bufferedInputStream2.close();
                        } catch (IOException e4) {
                            i.a(e4);
                        }
                    }
                    throw th;
                }
            } catch (IOException | CertificateException e5) {
                e = e5;
            }
        } catch (Throwable th2) {
            th = th2;
            if (bufferedInputStream2 != null) {
                bufferedInputStream2.close();
            }
            throw th;
        }
    }

    public static void b(Context context, h hVar) {
        try {
            if (context == null) {
                i.b(a, "deleteKmsCertChain: parameter invalid,context must not be null.");
                return;
            }
            SharedPreferences.Editor editorEdit = context.getSharedPreferences(d, 0).edit();
            List<String> listC = c(context, hVar);
            if (listC == null) {
                i.c(a, "deleteKmsCertChain: no any kms cert aliases found.");
                editorEdit.clear();
                return;
            }
            for (String str : listC) {
                if (g.containsAlias(str)) {
                    g.deleteEntry(str);
                } else {
                    i.c(a, "deleteKmsCertChain: key store not contains alias:" + str);
                }
            }
            i.c(a, "deleteKmsCertChain: commitResult:" + editorEdit.clear().commit());
        } catch (KeyStoreException e2) {
            i.c(a, "deleteKmsCertChain: exception:" + e2.getMessage());
        }
    }

    public static List<String> a(Context context, h hVar) {
        try {
            if (g == null) {
                i.b(a, "checkCertChainStatus: key store is null,should always take place here.");
                return null;
            }
            List<String> listC = c(context, hVar);
            if (listC != null && listC.size() != 0) {
                listC.toString();
                ArrayList arrayList = new ArrayList();
                for (String str : listC) {
                    if (!g.containsAlias(str)) {
                        i.b(a, "checkCertChainStatus: key store not contains alias:" + str);
                        return null;
                    }
                    arrayList.add(g.getCertificate(str).getEncoded());
                }
                List<String> listA = e.a(arrayList);
                if (listA != null && listA.size() != 0) {
                    CertificateFactory certificateFactory = CertificateFactory.getInstance(b);
                    ArrayList arrayList2 = new ArrayList();
                    try {
                        Iterator<String> it = listA.iterator();
                        while (it.hasNext()) {
                            arrayList2.add((X509Certificate) certificateFactory.generateCertificate(new ByteArrayInputStream(it.next().getBytes())));
                        }
                        a(context, a(context), arrayList2);
                        return listA;
                    } catch (CertificateException e2) {
                        i.b(a, "checkCertChainStatus: format pem cert to x509 cert, exception:" + e2.getMessage());
                        b(context, hVar);
                        return null;
                    }
                }
                i.c(a, "checkCertChainStatus: der certs to pem format fail.");
                return null;
            }
            i.c(a, "checkCertChainStatus: kms cert chain alias info mot found.");
            return null;
        } catch (CertException.CertChainException | CertException.CertChainVerifyException | CertException.LoadEccCertException | KeyStoreException | CertificateException e3) {
            i.c(a, "checkCertChainStatus: " + e3);
            b(context, hVar);
            return null;
        }
    }

    @SuppressLint({"RestrictedApi"})
    public static List<X509Certificate> a(@NonNull Context context, @NonNull List<X509Certificate> list, @NonNull List<X509Certificate> list2) throws CertException.CertChainException, CertException.CertChainVerifyException {
        int size;
        if (list != null) {
            boolean z = true;
            if (list.size() >= 1) {
                if (list2 == null || (size = list2.size()) < 1) {
                    i.b(a, "checkCertChainTrusted:parameter error,certChainList must not be null or < 1.");
                    throw new IllegalArgumentException("parameter invalid.certChainLen must not be null or <1");
                }
                boolean z2 = false;
                int i = 0;
                while (true) {
                    int i2 = size - 1;
                    if (i == i2) {
                        Iterator<X509Certificate> it = list.iterator();
                        X509Certificate x509Certificate = null;
                        while (true) {
                            if (!it.hasNext()) {
                                z = z2;
                                break;
                            }
                            X509Certificate next = it.next();
                            Objects.toString(next.getSubjectDN());
                            Objects.toString(next.getIssuerDN());
                            list.lastIndexOf(next);
                            if (list2.get(i2).getIssuerDN().equals(next.getSubjectDN())) {
                                try {
                                    list2.get(i2).verify(next.getPublicKey());
                                    try {
                                        list.lastIndexOf(next);
                                        x509Certificate = next;
                                        break;
                                    } catch (Exception unused) {
                                        x509Certificate = next;
                                        z2 = true;
                                        i.c(a, "checkCertChainTrusted: verify exception while use public key,index of anchorCertList[" + list.lastIndexOf(next) + "]");
                                        list.lastIndexOf(next);
                                    }
                                } catch (Exception unused2) {
                                }
                            }
                        }
                        if (!z) {
                            i.b(a, "checkCertChainTrusted,not signed by root cert.");
                            throw new CertException.CertChainException("checkCertChainTrusted,cannot found root cert of certChainLis.");
                        }
                        if (x509Certificate != null) {
                            list2.add(x509Certificate);
                        }
                        if (!a(list2)) {
                            throw new CertException.CertChainException("certChain invalidity.");
                        }
                        list2.remove(x509Certificate);
                        i.c(a, "checkCertChainTrusted: success");
                        return list2;
                    }
                    try {
                        X509Certificate x509Certificate2 = list2.get(i);
                        Objects.toString(x509Certificate2.getSubjectDN());
                        Objects.toString(x509Certificate2.getIssuerDN());
                        if (x509Certificate2.getIssuerDN().equals(x509Certificate2.getSubjectDN())) {
                            i.b(a, "checkCertChainTrusted: certChain[" + i + "] cannot be self sign.");
                            throw new CertException.CertChainVerifyException("checkCertChainTrusted:certChain[\"" + i + " \"] cannot be self sign.");
                        }
                        int i3 = i + 1;
                        Principal subjectDN = list2.get(i3).getSubjectDN();
                        Principal issuerDN = x509Certificate2.getIssuerDN();
                        PublicKey publicKey = list2.get(i3).getPublicKey();
                        Objects.toString(issuerDN);
                        Objects.toString(subjectDN);
                        if (!issuerDN.equals(subjectDN)) {
                            i.b(a, "checkCertChainTrusted: Issuer not match upper cert,index{" + i + "].");
                            throw new CertException.CertChainVerifyException("checkCertChainTrusted: Issuer not match upper cert,index{" + i + "].");
                        }
                        x509Certificate2.verify(publicKey);
                        i = i3;
                    } catch (InvalidKeyException e2) {
                        i.a("checkCertChainTrusted: InvalidKeyException.detail: " + e2.getMessage());
                        throw new CertException.CertChainVerifyException("InvalidKeyException.detail:" + e2.getMessage());
                    } catch (NoSuchAlgorithmException e3) {
                        i.a("checkCertChainTrusted: NoSuchAlgorithmException.detail: " + e3.getMessage());
                        throw new CertException.CertChainVerifyException("NoSuchAlgorithmException.detail:" + e3.getMessage());
                    } catch (NoSuchProviderException e4) {
                        i.a("checkCertChainTrusted: NoSuchProviderException.detail: " + e4.getMessage());
                        throw new CertException.CertChainVerifyException("NoSuchProviderException.detail:" + e4.getMessage());
                    } catch (SignatureException e5) {
                        i.a("checkCertChainTrusted: SignatureException.detail: " + e5.getMessage());
                        throw new CertException.CertChainVerifyException("SignatureException.detail:" + e5.getMessage());
                    } catch (CertificateException e6) {
                        i.a("checkCertChainTrusted.detail: " + e6.getMessage());
                        throw new CertException.CertChainVerifyException("CertificateException.detail:" + e6.getMessage());
                    }
                }
            }
        }
        i.b(a, "checkCertChainTrusted:parameter error,anchorCertList must not be null or < 1.");
        throw new IllegalArgumentException("parameter invalid.anchorCertList must not be null or < 1 .");
    }

    private static void a(Context context, h hVar, List<String> list) {
        String str;
        if (context == null || list == null || list.isEmpty()) {
            str = "saveCertChainAlias: parameter invalid.";
        } else {
            SharedPreferences.Editor editorEdit = context.getSharedPreferences(d, 0).edit();
            editorEdit.putString(hVar.getEnvConfig().getEnvName() + "_" + f7594e, new Gson().toJson(list));
            str = "saveCertChainAlias,commitResult:" + editorEdit.commit();
        }
        i.c(a, str);
    }

    private static boolean a(List<X509Certificate> list) {
        try {
            for (X509Certificate x509Certificate : list) {
                x509Certificate.checkValidity();
                Objects.toString(x509Certificate.getNotBefore());
                Objects.toString(x509Certificate.getNotAfter());
            }
            return true;
        } catch (Exception e2) {
            e2.getMessage();
            return false;
        }
    }
}
