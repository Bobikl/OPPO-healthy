package com.heytap.log.nx.http;

import android.annotation.SuppressLint;
import android.text.TextUtils;
import android.util.Log;
import java.lang.reflect.InvocationTargetException;
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
public class CustomTrustManager implements X509TrustManager {
    private static final String TAG = "CustomTrustManager";
    KeyStore mKeyStore;
    protected X509TrustManager trustManager;
    private final boolean needCheckHttpsCert = true;
    Map<String, String> mMemoryCache = new ConcurrentHashMap();
    Map<X509Certificate, String> sysCerts = new HashMap();
    List<X509Certificate> userCerts = new ArrayList();
    AtomicBoolean localCertsLoaded = new AtomicBoolean(false);
    Object mLock = new Object();
    ExecutorService executorService = Executors.newSingleThreadExecutor();

    public CustomTrustManager(X509TrustManager x509TrustManager) {
        this.trustManager = x509TrustManager;
        try {
            KeyStore keyStore = KeyStore.getInstance("AndroidCAStore");
            this.mKeyStore = keyStore;
            keyStore.load(null, null);
        } catch (Throwable th) {
            Log.w(TAG, "CustomTrustManager failed : " + th.getMessage());
        }
        getCertsFromKeyStore();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: cacheCerts, reason: merged with bridge method [inline-methods] */
    public void lambda$checkServerTrusted$0(X509Certificate[] x509CertificateArr) {
        String hostFromCert = CertificateUtil.getHostFromCert(x509CertificateArr[0]);
        if (TextUtils.isEmpty(hostFromCert) || !this.localCertsLoaded.get() || this.mMemoryCache.containsKey(hostFromCert)) {
            return;
        }
        StringBuilder sb = new StringBuilder();
        for (X509Certificate x509Certificate : x509CertificateArr) {
            String lowerCase = x509Certificate.getIssuerDN().getName().toLowerCase();
            for (X509Certificate x509Certificate2 : this.sysCerts.keySet()) {
                if (lowerCase.equals(x509Certificate2.getSubjectDN().getName().toLowerCase())) {
                    sb.append(this.sysCerts.get(x509Certificate2));
                    sb.append(";");
                    break;
                }
            }
        }
        String string = sb.toString();
        if (TextUtils.isEmpty(string)) {
            return;
        }
        this.mMemoryCache.put(hostFromCert, string);
    }

    private void getCertsFromKeyStore() {
        new Thread(new Runnable() { // from class: com.heytap.log.nx.http.CustomTrustManager.2
            @Override // java.lang.Runnable
            public void run() {
                System.currentTimeMillis();
                synchronized (CustomTrustManager.this.mLock) {
                    CustomTrustManager customTrustManager = CustomTrustManager.this;
                    CertificateUtil.getCertsFromKeyStore(customTrustManager.mKeyStore, customTrustManager.userCerts, customTrustManager.sysCerts);
                    CustomTrustManager.this.localCertsLoaded.set(true);
                    CustomTrustManager.this.mLock.notifyAll();
                }
            }
        }).start();
    }

    private boolean isAllSysCerts(X509Certificate[] x509CertificateArr, List<String> list) {
        X509Certificate[] certsFromAlias = CertificateUtil.getCertsFromAlias(list, this.mKeyStore);
        if (certsFromAlias == null) {
            return false;
        }
        try {
            boolean z = false;
            for (X509Certificate x509Certificate : x509CertificateArr) {
                String lowerCase = x509Certificate.getIssuerDN().getName().toLowerCase();
                for (X509Certificate x509Certificate2 : certsFromAlias) {
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
            Log.w(TAG, "isAllSysCerts failed : " + th.getMessage());
        }
    }

    private boolean isTrusted(X509Certificate[] x509CertificateArr) {
        if (this.localCertsLoaded.get()) {
            return !isUserCerts(x509CertificateArr);
        }
        if (isTrustedUsingCache(x509CertificateArr)) {
            return true;
        }
        if (!isTrustedUsingKeyStroe(x509CertificateArr)) {
            return false;
        }
        removeCache(x509CertificateArr);
        return true;
    }

    private boolean isTrustedUsingCache(X509Certificate[] x509CertificateArr) {
        String[] strArrSplit;
        String hostFromCert = CertificateUtil.getHostFromCert(x509CertificateArr[0]);
        ArrayList arrayList = new ArrayList();
        if (!TextUtils.isEmpty(hostFromCert)) {
            String str = this.mMemoryCache.containsKey(hostFromCert) ? this.mMemoryCache.get(hostFromCert) : null;
            if (!TextUtils.isEmpty(str) && (strArrSplit = str.split(";")) != null) {
                for (String str2 : strArrSplit) {
                    if (!TextUtils.isEmpty(str2) && !arrayList.contains(str2)) {
                        arrayList.add(str2);
                    }
                }
            }
        }
        return isAllSysCerts(x509CertificateArr, arrayList);
    }

    private boolean isTrustedUsingKeyStroe(X509Certificate[] x509CertificateArr) {
        waitUntileLocalCertsLoaded();
        return !isUserCerts(x509CertificateArr);
    }

    private boolean isUserCerts(X509Certificate[] x509CertificateArr) {
        try {
            for (X509Certificate x509Certificate : x509CertificateArr) {
                String lowerCase = x509Certificate.getIssuerDN().getName().toLowerCase();
                Iterator<X509Certificate> it = this.userCerts.iterator();
                while (it.hasNext()) {
                    if (lowerCase.equals(it.next().getSubjectDN().getName().toLowerCase())) {
                        return true;
                    }
                }
            }
        } catch (Throwable th) {
            Log.w(TAG, "isUserCerts failed : " + th.getMessage());
        }
        return false;
    }

    private void removeCache(X509Certificate[] x509CertificateArr) {
        String hostFromCert = CertificateUtil.getHostFromCert(x509CertificateArr[0]);
        if (!TextUtils.isEmpty(hostFromCert) && this.localCertsLoaded.get() && this.mMemoryCache.containsKey(hostFromCert)) {
            this.mMemoryCache.remove(hostFromCert);
        }
    }

    private void waitUntileLocalCertsLoaded() {
        if (this.localCertsLoaded.get()) {
            return;
        }
        synchronized (this.mLock) {
            if (!this.localCertsLoaded.get()) {
                try {
                    this.mLock.wait();
                } catch (InterruptedException e2) {
                    Log.w(TAG, "waitUntileLocalCertsLoaded failed : " + e2.getMessage());
                }
            }
        }
    }

    @Override // javax.net.ssl.X509TrustManager
    public void checkClientTrusted(X509Certificate[] x509CertificateArr, String str) throws CertificateException {
        X509TrustManager x509TrustManager = this.trustManager;
        if (x509TrustManager != null) {
            x509TrustManager.checkClientTrusted(x509CertificateArr, str);
        }
    }

    @Override // javax.net.ssl.X509TrustManager
    public synchronized void checkServerTrusted(final X509Certificate[] x509CertificateArr, String str) throws CertificateException {
        try {
            try {
                X509TrustManager x509TrustManager = this.trustManager;
                if (x509TrustManager != null) {
                    x509TrustManager.checkServerTrusted(x509CertificateArr, str);
                    if (!isTrusted(x509CertificateArr)) {
                        throw new CertificateException("checkServerTrusted Proxy Certificate");
                    }
                    this.executorService.submit(new Runnable() { // from class: com.heytap.log.nx.http.CustomTrustManager.1
                        @Override // java.lang.Runnable
                        public void run() {
                            CustomTrustManager.this.lambda$checkServerTrusted$0(x509CertificateArr);
                        }
                    });
                }
            } catch (Throwable th) {
                Log.d(TAG, "checkServerTrusted error-2: " + th.getMessage());
                throw new CertificateException(th);
            }
        } catch (CertificateException e2) {
            Log.d(TAG, "checkServerTrusted error-1: " + e2.getMessage());
            throw e2;
        }
    }

    @Override // javax.net.ssl.X509TrustManager
    public X509Certificate[] getAcceptedIssuers() {
        X509TrustManager x509TrustManager = this.trustManager;
        return x509TrustManager != null ? x509TrustManager.getAcceptedIssuers() : new X509Certificate[0];
    }

    @SuppressLint({"NewApi"})
    public synchronized void checkServerTrusted(final X509Certificate[] x509CertificateArr, String str, String str2) throws CertificateException {
        try {
            try {
                X509TrustManager x509TrustManager = this.trustManager;
                if (x509TrustManager != null) {
                    if (str2 != null) {
                        x509TrustManager.getClass().getMethod("checkServerTrusted", X509Certificate[].class, String.class, String.class).invoke(this.trustManager, x509CertificateArr, str, str2);
                    } else {
                        x509TrustManager.checkServerTrusted(x509CertificateArr, str);
                    }
                    if (isTrusted(x509CertificateArr)) {
                        this.executorService.submit(new Runnable() { // from class: com.heytap.log.nx.http.a
                            @Override // java.lang.Runnable
                            public final void run() {
                                this.i.lambda$checkServerTrusted$0(x509CertificateArr);
                            }
                        });
                    } else {
                        throw new CertificateException("checkServerTrusted Proxy Certificate");
                    }
                }
            } catch (NoSuchMethodException e2) {
                Log.d(TAG, "checkServerTrusted-2 error-1: " + e2.getMessage());
                this.trustManager.checkServerTrusted(x509CertificateArr, str);
            } catch (CertificateException e3) {
                Log.d(TAG, "checkServerTrusted error-3: " + e3.getMessage());
                throw e3;
            }
        } catch (IllegalAccessException | InvocationTargetException e4) {
            Log.d(TAG, "checkServerTrusted-2 error-2: " + e4.getMessage());
            throw new CertificateException("Reflection failed: " + e4.getMessage());
        } catch (Throwable th) {
            Log.d(TAG, "checkServerTrusted error-4: " + th.getMessage());
            throw new CertificateException(th);
        }
    }
}
