package com.oplus.aiunit.vision;

import android.content.Context;
import com.oplus.account.netrequest.intercepter.AcCode301Interceptor;
import com.oplus.account.netrequest.intercepter.AcNetLoggingInterceptor;
import java.security.KeyManagementException;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.security.cert.CertificateException;
import java.security.cert.CertificateExpiredException;
import java.security.cert.CertificateNotYetValidException;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import javax.net.ssl.SSLContext;
import javax.net.ssl.TrustManager;
import javax.net.ssl.TrustManagerFactory;
import javax.net.ssl.X509TrustManager;

/* JADX INFO: loaded from: classes6.dex */
public class cj {
    public static final int DEFAULT_CONNECT_TIMEOUT = 20;
    public static final int DEFAULT_READ_TIMEOUT = 20;
    public static final int DEFAULT_WRITE_TIMEOUT = 20;
    public static final String EXCEPTION_CERT_EXPIRED = "CertificateExpiredException";
    public static final String EXCEPTION_CERT_NOT_YET_VALID = "CertificateNotYetValidException";
    public Context a;
    public lb b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public List<jea> f10097c;
    public volatile evf d;

    public class a implements AcNetLoggingInterceptor.a {
        public a() {
        }

        @Override // com.oplus.account.netrequest.intercepter.AcNetLoggingInterceptor.a
        public void log(String str) {
            mb.b("AcIntercept.Log", str);
        }
    }

    public class b implements X509TrustManager {
        public b() {
        }

        @Override // javax.net.ssl.X509TrustManager
        public void checkClientTrusted(X509Certificate[] x509CertificateArr, String str) throws CertificateException {
        }

        @Override // javax.net.ssl.X509TrustManager
        public void checkServerTrusted(X509Certificate[] x509CertificateArr, String str) throws CertificateException {
            for (X509Certificate x509Certificate : x509CertificateArr) {
                mb.b("AcIntercept.RetrofitMgr", "Chain All Count:" + x509CertificateArr.length + ", Subject: " + x509Certificate.getSubjectDN().getName() + ", issuer: " + x509Certificate.getIssuerDN().getName() + ", not before Date: " + x509Certificate.getNotBefore() + ", not after Data: " + x509Certificate.getNotAfter());
                try {
                    x509Certificate.checkValidity();
                    TrustManagerFactory trustManagerFactory = TrustManagerFactory.getInstance("X509");
                    trustManagerFactory.init((KeyStore) null);
                    for (TrustManager trustManager : trustManagerFactory.getTrustManagers()) {
                        ((X509TrustManager) trustManager).checkServerTrusted(x509CertificateArr, str);
                    }
                } catch (KeyStoreException e2) {
                    mb.a("AcIntercept.RetrofitMgr", "checkServerTrusted error: " + e2.getMessage());
                    throw new RuntimeException(e2);
                } catch (NoSuchAlgorithmException e3) {
                    mb.a("AcIntercept.RetrofitMgr", "checkServerTrusted error: " + e3.getMessage());
                    throw new RuntimeException(e3);
                } catch (CertificateExpiredException unused) {
                    mb.b("AcIntercept.RetrofitMgr", "CertificateExpiredException!!!!!!!!!!!!!!");
                    throw new RuntimeException("CertificateExpiredException");
                } catch (CertificateNotYetValidException unused2) {
                    mb.b("AcIntercept.RetrofitMgr", "CertificateNotYetValidException!!!!!!!!!!!");
                    throw new RuntimeException("CertificateNotYetValidException");
                }
            }
        }

        @Override // javax.net.ssl.X509TrustManager
        public X509Certificate[] getAcceptedIssuers() {
            return new X509Certificate[0];
        }
    }

    public cj(Context context, List<jea> list, lb lbVar) {
        this.a = context;
        this.f10097c = list;
        this.b = lbVar;
    }

    public final efd a() {
        ArrayList arrayList = new ArrayList();
        List<jea> list = this.f10097c;
        if (list != null && list.size() > 0) {
            arrayList.addAll(this.f10097c);
        }
        Context context = this.a;
        lb lbVar = this.b;
        h9 h9Var = new h9(context, lbVar.a, lbVar.b);
        wi wiVar = new wi();
        new n7(this.a, this);
        dk dkVar = new dk();
        new AcCode301Interceptor(this.a);
        new xi();
        ck ckVar = new ck();
        p7 p7Var = new p7();
        AcNetLoggingInterceptor acNetLoggingInterceptor = new AcNetLoggingInterceptor(new a());
        acNetLoggingInterceptor.f(AcNetLoggingInterceptor.Level.BODY);
        g8 g8Var = new g8(this.a);
        zi ziVar = new zi(this.a);
        aj ajVar = new aj();
        d9 d9Var = new d9();
        arrayList.add(h9Var);
        arrayList.add(wiVar);
        arrayList.add(dkVar);
        arrayList.add(ckVar);
        arrayList.add(p7Var);
        arrayList.add(acNetLoggingInterceptor);
        arrayList.add(g8Var);
        arrayList.add(ziVar);
        arrayList.add(ajVar);
        arrayList.add(d9Var);
        efd.a aVar = new efd.a();
        lb lbVar2 = this.b;
        int i = lbVar2 != null ? lbVar2.d : 20;
        int i2 = lbVar2 != null ? lbVar2.f13614e : 20;
        int i3 = lbVar2 != null ? lbVar2.f : 20;
        TimeUnit timeUnit = TimeUnit.SECONDS;
        aVar.g(i, timeUnit);
        aVar.b0(i2, timeUnit);
        aVar.X(i3, timeUnit);
        try {
            TrustManager[] trustManagerArr = {new b()};
            SSLContext sSLContext = SSLContext.getInstance("TLS");
            sSLContext.init(null, trustManagerArr, new SecureRandom());
            aVar.a0(sSLContext.getSocketFactory(), (X509TrustManager) trustManagerArr[0]);
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                aVar.a((jea) it.next());
            }
            return aVar.c();
        } catch (KeyManagementException e2) {
            throw new RuntimeException(e2);
        } catch (NoSuchAlgorithmException e3) {
            throw new RuntimeException(e3);
        }
    }

    public final evf b() {
        efd efdVarA = a();
        evf.b bVar = new evf.b();
        bVar.b(a9.a());
        bVar.d(this.b.f13613c);
        bVar.g(efdVarA);
        return bVar.e();
    }

    public <T> T c(Class<T> cls) {
        evf evfVarB = this.d;
        if (evfVarB == null) {
            synchronized (this) {
                if (evfVarB == null) {
                    evfVarB = b();
                    this.d = evfVarB;
                }
            }
        }
        return (T) evfVarB.b(cls);
    }
}
