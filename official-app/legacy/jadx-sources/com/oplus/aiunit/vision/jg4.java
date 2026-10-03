package com.oplus.aiunit.vision;

import android.text.TextUtils;
import java.security.KeyStore;
import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicBoolean;
import javax.net.ssl.X509TrustManager;

/* JADX INFO: loaded from: classes19.dex */
public class jg4 implements X509TrustManager {
    public X509TrustManager a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public KeyStore f12884c;
    public final boolean b = true;
    public Map<String, String> d = new ConcurrentHashMap();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Map<X509Certificate, String> f12885e = new HashMap();
    public List<X509Certificate> f = new ArrayList();
    public AtomicBoolean g = new AtomicBoolean(false);
    public Object h = new Object();
    public ExecutorService i = Executors.newSingleThreadExecutor();

    public class a implements Runnable {
        public final /* synthetic */ X509Certificate[] i;

        public a(X509Certificate[] x509CertificateArr) {
            this.i = x509CertificateArr;
        }

        @Override // java.lang.Runnable
        public void run() {
            jg4.this.b(this.i);
        }
    }

    public class b implements Runnable {
        public b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            System.currentTimeMillis();
            synchronized (jg4.this.h) {
                jg4 jg4Var = jg4.this;
                e53.b(jg4Var.f12884c, jg4Var.f, jg4Var.f12885e);
                jg4.this.g.set(true);
                jg4.this.h.notifyAll();
            }
        }
    }

    public jg4(X509TrustManager x509TrustManager) {
        this.a = x509TrustManager;
        try {
            KeyStore keyStore = KeyStore.getInstance("AndroidCAStore");
            this.f12884c = keyStore;
            keyStore.load(null, null);
        } catch (Throwable th) {
            e6b.a("upgrade_CustomTrustManager", "CustomTrustManager failed : " + th.getMessage());
        }
        c();
    }

    public final void b(X509Certificate[] x509CertificateArr) {
        String strC = e53.c(x509CertificateArr[0]);
        if (TextUtils.isEmpty(strC) || !this.g.get() || this.d.containsKey(strC)) {
            return;
        }
        StringBuilder sb = new StringBuilder();
        for (X509Certificate x509Certificate : x509CertificateArr) {
            String lowerCase = x509Certificate.getIssuerDN().getName().toLowerCase();
            for (X509Certificate x509Certificate2 : this.f12885e.keySet()) {
                if (lowerCase.equals(x509Certificate2.getSubjectDN().getName().toLowerCase())) {
                    sb.append(this.f12885e.get(x509Certificate2));
                    sb.append(";");
                    break;
                }
            }
        }
        String string = sb.toString();
        if (TextUtils.isEmpty(string)) {
            return;
        }
        this.d.put(strC, string);
    }

    public final void c() {
        new Thread(new b()).start();
    }

    @Override // javax.net.ssl.X509TrustManager
    public void checkClientTrusted(X509Certificate[] x509CertificateArr, String str) throws CertificateException {
        X509TrustManager x509TrustManager = this.a;
        if (x509TrustManager != null) {
            x509TrustManager.checkClientTrusted(x509CertificateArr, str);
        }
    }

    @Override // javax.net.ssl.X509TrustManager
    public synchronized void checkServerTrusted(X509Certificate[] x509CertificateArr, String str) throws CertificateException {
        try {
            try {
                X509TrustManager x509TrustManager = this.a;
                if (x509TrustManager != null) {
                    x509TrustManager.checkServerTrusted(x509CertificateArr, str);
                    if (!e(x509CertificateArr)) {
                        throw new CertificateException("Proxy Certificate");
                    }
                    this.i.submit(new a(x509CertificateArr));
                }
            } catch (Throwable th) {
                throw th;
            }
        } catch (CertificateException e2) {
            throw e2;
        } catch (Throwable th2) {
            throw new CertificateException(th2);
        }
    }

    public final boolean d(X509Certificate[] x509CertificateArr, List<String> list) {
        X509Certificate[] x509CertificateArrA = e53.a(list, this.f12884c);
        if (x509CertificateArrA == null) {
            return false;
        }
        try {
            boolean z = false;
            for (X509Certificate x509Certificate : x509CertificateArr) {
                String lowerCase = x509Certificate.getIssuerDN().getName().toLowerCase();
                for (X509Certificate x509Certificate2 : x509CertificateArrA) {
                    if (lowerCase.equals(x509Certificate2.getSubjectDN().getName().toLowerCase())) {
                        z = true;
                        break;
                    }
                }
                if (z) {
                    break;
                }
            }
            return z;
        } catch (Throwable th) {
            e6b.a("upgrade_CustomTrustManager", "isAllSysCerts failed : " + th.getMessage());
        }
    }

    public final boolean e(X509Certificate[] x509CertificateArr) {
        if (this.g.get()) {
            return !h(x509CertificateArr);
        }
        if (f(x509CertificateArr)) {
            return true;
        }
        if (!g(x509CertificateArr)) {
            return false;
        }
        i(x509CertificateArr);
        return true;
    }

    public final boolean f(X509Certificate[] x509CertificateArr) {
        String[] strArrSplit;
        String strC = e53.c(x509CertificateArr[0]);
        ArrayList arrayList = new ArrayList();
        if (!TextUtils.isEmpty(strC)) {
            String str = this.d.containsKey(strC) ? this.d.get(strC) : null;
            if (!TextUtils.isEmpty(str) && (strArrSplit = str.split(";")) != null) {
                for (String str2 : strArrSplit) {
                    if (!TextUtils.isEmpty(str2) && !arrayList.contains(str2)) {
                        arrayList.add(str2);
                    }
                }
            }
        }
        return d(x509CertificateArr, arrayList);
    }

    public final boolean g(X509Certificate[] x509CertificateArr) {
        j();
        return !h(x509CertificateArr);
    }

    @Override // javax.net.ssl.X509TrustManager
    public X509Certificate[] getAcceptedIssuers() {
        X509TrustManager x509TrustManager = this.a;
        return x509TrustManager != null ? x509TrustManager.getAcceptedIssuers() : new X509Certificate[0];
    }

    public final boolean h(X509Certificate[] x509CertificateArr) {
        try {
            for (X509Certificate x509Certificate : x509CertificateArr) {
                String lowerCase = x509Certificate.getIssuerDN().getName().toLowerCase();
                Iterator<X509Certificate> it = this.f.iterator();
                while (it.hasNext()) {
                    if (lowerCase.equals(it.next().getSubjectDN().getName().toLowerCase())) {
                        return true;
                    }
                }
            }
        } catch (Throwable th) {
            e6b.a("upgrade_CustomTrustManager", "isUserCerts failed : " + th.getMessage());
        }
        return false;
    }

    public final void i(X509Certificate[] x509CertificateArr) {
        String strC = e53.c(x509CertificateArr[0]);
        if (!TextUtils.isEmpty(strC) && this.g.get() && this.d.containsKey(strC)) {
            this.d.remove(strC);
        }
    }

    public final void j() {
        if (this.g.get()) {
            return;
        }
        synchronized (this.h) {
            if (!this.g.get()) {
                try {
                    this.h.wait();
                } catch (InterruptedException e2) {
                    e6b.a("upgrade_CustomTrustManager", "waitUntileLocalCertsLoaded failed : " + e2.getMessage());
                }
            }
        }
    }
}
