package com.alipay.android.phone.mrpc.core;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.Proxy;
import android.text.TextUtils;
import android.webkit.CookieManager;
import android.webkit.CookieSyncManager;
import com.heytap.store.base.core.http.HttpConst;
import com.heytap.store.base.core.http.HttpUtils;
import com.heytap.voiceassistant.sdk.tts.constant.SpeechConstant;
import com.heytap.webview.extension.cache.CacheConstants;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.SocketTimeoutException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Callable;
import javax.net.ssl.SSLException;
import javax.net.ssl.SSLHandshakeException;
import javax.net.ssl.SSLPeerUnverifiedException;
import org.apache.http.Header;
import org.apache.http.HttpEntity;
import org.apache.http.HttpHost;
import org.apache.http.HttpRequest;
import org.apache.http.HttpResponse;
import org.apache.http.NoHttpResponseException;
import org.apache.http.client.CookieStore;
import org.apache.http.client.HttpRequestRetryHandler;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.client.methods.HttpUriRequest;
import org.apache.http.conn.ConnectTimeoutException;
import org.apache.http.conn.ConnectionPoolTimeoutException;
import org.apache.http.conn.HttpHostConnectException;
import org.apache.http.cookie.Cookie;
import org.apache.http.entity.AbstractHttpEntity;
import org.apache.http.entity.ByteArrayEntity;
import org.apache.http.impl.client.BasicCookieStore;
import org.apache.http.params.HttpParams;
import org.apache.http.protocol.BasicHttpContext;
import org.apache.http.protocol.HttpContext;

/* JADX INFO: loaded from: classes12.dex */
public final class q implements Callable<u> {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final HttpRequestRetryHandler f559e = new ad();
    public l a;
    public Context b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public o f560c;
    public String d;
    public HttpUriRequest f;
    public CookieManager i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public AbstractHttpEntity f561j;
    public HttpHost k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public URL f562l;
    public String q;
    public HttpContext g = new BasicHttpContext();
    public CookieStore h = new BasicCookieStore();
    public int m = 0;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public boolean f563n = false;
    public boolean o = false;
    public String p = null;

    public q(l lVar, o oVar) {
        this.a = lVar;
        this.b = lVar.a;
        this.f560c = oVar;
    }

    public static long a(String[] strArr) {
        String str;
        for (int i = 0; i < strArr.length; i++) {
            if ("max-age".equalsIgnoreCase(strArr[i]) && (str = strArr[i + 1]) != null) {
                try {
                    return Long.parseLong(str);
                } catch (Exception unused) {
                    continue;
                }
            }
        }
        return 0L;
    }

    public static long b(HttpResponse httpResponse) {
        Header firstHeader = httpResponse.getFirstHeader(CacheConstants.Word.CACHE_CONTROL);
        if (firstHeader != null) {
            String[] strArrSplit = firstHeader.getValue().split(HttpUtils.EQUAL_SIGN);
            if (strArrSplit.length >= 2) {
                try {
                    return a(strArrSplit);
                } catch (NumberFormatException unused) {
                }
            }
        }
        Header firstHeader2 = httpResponse.getFirstHeader("Expires");
        if (firstHeader2 != null) {
            return b.b(firstHeader2.getValue()) - System.currentTimeMillis();
        }
        return 0L;
    }

    private HttpUriRequest c() {
        HttpUriRequest httpUriRequest = this.f;
        if (httpUriRequest != null) {
            return httpUriRequest;
        }
        if (this.f561j == null) {
            byte[] bArrB = this.f560c.b();
            String strB = this.f560c.b("gzip");
            if (bArrB != null) {
                if (TextUtils.equals(strB, SpeechConstant.TRUE_STR)) {
                    this.f561j = b.a(bArrB);
                } else {
                    this.f561j = new ByteArrayEntity(bArrB);
                }
                this.f561j.setContentType(this.f560c.c());
            }
        }
        AbstractHttpEntity abstractHttpEntity = this.f561j;
        if (abstractHttpEntity != null) {
            HttpPost httpPost = new HttpPost(b());
            httpPost.setEntity(abstractHttpEntity);
            this.f = httpPost;
        } else {
            this.f = new HttpGet(b());
        }
        return this.f;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:39:0x00d2  */
    @Override // java.util.concurrent.Callable
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public u call() throws Throwable {
        boolean z;
        HttpHost httpHost;
        while (true) {
            try {
                NetworkInfo[] allNetworkInfo = ((ConnectivityManager) this.b.getSystemService("connectivity")).getAllNetworkInfo();
                boolean z2 = true;
                if (allNetworkInfo == null) {
                    z = false;
                    break;
                }
                int length = allNetworkInfo.length;
                int i = 0;
                while (true) {
                    if (i >= length) {
                        z = false;
                        break;
                    }
                    NetworkInfo networkInfo = allNetworkInfo[i];
                    if (networkInfo != null && networkInfo.isAvailable() && networkInfo.isConnectedOrConnecting()) {
                        z = true;
                        break;
                    }
                    i++;
                }
                if (!z) {
                    throw new HttpException(1, "The network is not available");
                }
                ArrayList<Header> arrayListD = this.f560c.d();
                if (arrayListD != null && !arrayListD.isEmpty()) {
                    Iterator<Header> it = arrayListD.iterator();
                    while (it.hasNext()) {
                        c().addHeader(it.next());
                    }
                }
                b.a((HttpRequest) c());
                b.b((HttpRequest) c());
                c().addHeader(HttpConst.COOKIE, i().getCookie(this.f560c.a()));
                this.g.setAttribute("http.cookie-store", this.h);
                this.a.a().a(f559e);
                long jCurrentTimeMillis = System.currentTimeMillis();
                f();
                this.f.getURI().toString();
                HttpParams params = this.a.a().getParams();
                NetworkInfo activeNetworkInfo = ((ConnectivityManager) this.b.getSystemService("connectivity")).getActiveNetworkInfo();
                HttpHost httpHost2 = null;
                if (activeNetworkInfo == null || !activeNetworkInfo.isAvailable()) {
                    httpHost = null;
                } else {
                    String defaultHost = Proxy.getDefaultHost();
                    int defaultPort = Proxy.getDefaultPort();
                    if (defaultHost != null) {
                        httpHost = new HttpHost(defaultHost, defaultPort);
                    } else {
                        httpHost = null;
                    }
                }
                if (httpHost == null || !TextUtils.equals(httpHost.getHostName(), "127.0.0.1") || httpHost.getPort() != 8087) {
                    httpHost2 = httpHost;
                }
                params.setParameter("http.route.default-proxy", httpHost2);
                HttpHost httpHost3 = this.k;
                if (httpHost3 == null) {
                    URL urlH = h();
                    HttpHost httpHost4 = new HttpHost(urlH.getHost(), g(), urlH.getProtocol());
                    this.k = httpHost4;
                    httpHost3 = httpHost4;
                }
                if (g() == 80) {
                    httpHost3 = new HttpHost(h().getHost());
                }
                HttpResponse httpResponseExecute = this.a.a().execute(httpHost3, this.f, this.g);
                this.a.b(System.currentTimeMillis() - jCurrentTimeMillis);
                List<Cookie> cookies = this.h.getCookies();
                if (this.f560c.e()) {
                    i().removeAllCookie();
                }
                if (!cookies.isEmpty()) {
                    for (Cookie cookie : cookies) {
                        if (cookie.getDomain() != null) {
                            StringBuilder sb = new StringBuilder();
                            sb.append(cookie.getName());
                            sb.append(HttpUtils.EQUAL_SIGN);
                            sb.append(cookie.getValue());
                            sb.append("; domain=");
                            sb.append(cookie.getDomain());
                            sb.append(cookie.isSecure() ? "; Secure" : "");
                            i().setCookie(this.f560c.a(), sb.toString());
                            CookieSyncManager.getInstance().sync();
                        }
                    }
                }
                int statusCode = httpResponseExecute.getStatusLine().getStatusCode();
                String reasonPhrase = httpResponseExecute.getStatusLine().getReasonPhrase();
                if (statusCode != 200) {
                    if (statusCode != 304) {
                        z2 = false;
                    }
                    if (!z2) {
                        throw new HttpException(Integer.valueOf(httpResponseExecute.getStatusLine().getStatusCode()), httpResponseExecute.getStatusLine().getReasonPhrase());
                    }
                }
                u uVarA = a(httpResponseExecute, statusCode, reasonPhrase);
                if (((uVarA == null || uVarA.b() == null) ? -1L : uVarA.b().length) == -1 && (uVarA instanceof p)) {
                    try {
                        Long.parseLong(((p) uVarA).a().getHead("Content-Length"));
                    } catch (Exception unused) {
                    }
                }
                if (this.f560c.a() != null && !TextUtils.isEmpty(f())) {
                    f();
                }
                return uVarA;
            } catch (HttpException e2) {
                e();
                if (this.f560c.f() != null) {
                    e2.getCode();
                    e2.getMsg();
                }
                e2.toString();
                throw e2;
            } catch (NullPointerException e3) {
                e();
                int i2 = this.m;
                if (i2 > 0) {
                    e3.toString();
                    throw new HttpException(0, String.valueOf(e3));
                }
                this.m = i2 + 1;
            } catch (SocketTimeoutException e4) {
                e();
                if (this.f560c.f() != null) {
                    e4.toString();
                }
                e4.toString();
                throw new HttpException(4, String.valueOf(e4));
            } catch (URISyntaxException e5) {
                throw new RuntimeException("Url parser error!", e5.getCause());
            } catch (UnknownHostException e6) {
                e();
                if (this.f560c.f() != null) {
                    e6.toString();
                }
                e6.toString();
                throw new HttpException(9, String.valueOf(e6));
            } catch (SSLHandshakeException e7) {
                e();
                if (this.f560c.f() != null) {
                    e7.toString();
                }
                e7.toString();
                throw new HttpException(2, String.valueOf(e7));
            } catch (SSLPeerUnverifiedException e8) {
                e();
                if (this.f560c.f() != null) {
                    e8.toString();
                }
                e8.toString();
                throw new HttpException(2, String.valueOf(e8));
            } catch (SSLException e9) {
                e();
                if (this.f560c.f() != null) {
                    e9.toString();
                }
                e9.toString();
                throw new HttpException(6, String.valueOf(e9));
            } catch (NoHttpResponseException e10) {
                e();
                if (this.f560c.f() != null) {
                    e10.toString();
                }
                e10.toString();
                throw new HttpException(5, String.valueOf(e10));
            } catch (ConnectionPoolTimeoutException e11) {
                e();
                if (this.f560c.f() != null) {
                    e11.toString();
                }
                e11.toString();
                throw new HttpException(3, String.valueOf(e11));
            } catch (ConnectTimeoutException e12) {
                e();
                if (this.f560c.f() != null) {
                    e12.toString();
                }
                e12.toString();
                throw new HttpException(3, String.valueOf(e12));
            } catch (HttpHostConnectException e13) {
                e();
                if (this.f560c.f() != null) {
                    e13.toString();
                }
                throw new HttpException(8, String.valueOf(e13));
            } catch (IOException e14) {
                e();
                if (this.f560c.f() != null) {
                    e14.toString();
                }
                e14.toString();
                throw new HttpException(6, String.valueOf(e14));
            } catch (Exception e15) {
                e();
                if (this.f560c.f() != null) {
                    e15.toString();
                }
                throw new HttpException(0, String.valueOf(e15));
            }
        }
    }

    private void e() {
        HttpUriRequest httpUriRequest = this.f;
        if (httpUriRequest != null) {
            httpUriRequest.abort();
        }
    }

    private String f() {
        if (!TextUtils.isEmpty(this.q)) {
            return this.q;
        }
        String strB = this.f560c.b("operationType");
        this.q = strB;
        return strB;
    }

    private int g() {
        URL urlH = h();
        return urlH.getPort() == -1 ? urlH.getDefaultPort() : urlH.getPort();
    }

    private URL h() {
        URL url = this.f562l;
        if (url != null) {
            return url;
        }
        URL url2 = new URL(this.f560c.a());
        this.f562l = url2;
        return url2;
    }

    private CookieManager i() {
        CookieManager cookieManager = this.i;
        if (cookieManager != null) {
            return cookieManager;
        }
        CookieManager cookieManager2 = CookieManager.getInstance();
        this.i = cookieManager2;
        return cookieManager2;
    }

    public static HttpUrlHeader a(HttpResponse httpResponse) {
        HttpUrlHeader httpUrlHeader = new HttpUrlHeader();
        for (Header header : httpResponse.getAllHeaders()) {
            httpUrlHeader.setHead(header.getName(), header.getValue());
        }
        return httpUrlHeader;
    }

    private URI b() {
        String strA = this.f560c.a();
        String str = this.d;
        if (str != null) {
            strA = str;
        }
        if (strA != null) {
            return new URI(strA);
        }
        throw new RuntimeException("url should not be null");
    }

    public final o a() {
        return this.f560c;
    }

    private u a(HttpResponse httpResponse, int i, String str) throws Throwable {
        String str2;
        Thread.currentThread().getId();
        HttpEntity entity = httpResponse.getEntity();
        ByteArrayOutputStream byteArrayOutputStream = null;
        String str3 = null;
        if (entity == null || httpResponse.getStatusLine().getStatusCode() != 200) {
            if (entity != null) {
                return null;
            }
            httpResponse.getStatusLine().getStatusCode();
            return null;
        }
        Thread.currentThread().getId();
        try {
            ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream();
            try {
                long jCurrentTimeMillis = System.currentTimeMillis();
                a(entity, byteArrayOutputStream2);
                byte[] byteArray = byteArrayOutputStream2.toByteArray();
                this.o = false;
                this.a.c(System.currentTimeMillis() - jCurrentTimeMillis);
                this.a.a(byteArray.length);
                p pVar = new p(a(httpResponse), i, str, byteArray);
                long jB = b(httpResponse);
                Header contentType = httpResponse.getEntity().getContentType();
                if (contentType != null) {
                    HashMap<String, String> mapA = a(contentType.getValue());
                    str3 = mapA.get("charset");
                    str2 = mapA.get("Content-Type");
                } else {
                    str2 = null;
                }
                pVar.b(str2);
                pVar.a(str3);
                pVar.a(System.currentTimeMillis());
                pVar.b(jB);
                try {
                    byteArrayOutputStream2.close();
                    return pVar;
                } catch (IOException e2) {
                    throw new RuntimeException("ArrayOutputStream close error!", e2.getCause());
                }
            } catch (Throwable th) {
                th = th;
                byteArrayOutputStream = byteArrayOutputStream2;
                if (byteArrayOutputStream != null) {
                    try {
                        byteArrayOutputStream.close();
                    } catch (IOException e3) {
                        throw new RuntimeException("ArrayOutputStream close error!", e3.getCause());
                    }
                }
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    public static HashMap<String, String> a(String str) {
        HashMap<String, String> map = new HashMap<>();
        for (String str2 : str.split(";")) {
            String[] strArrSplit = str2.indexOf(61) == -1 ? new String[]{"Content-Type", str2} : str2.split(HttpUtils.EQUAL_SIGN);
            map.put(strArrSplit[0], strArrSplit[1]);
        }
        return map;
    }

    private void a(HttpEntity httpEntity, OutputStream outputStream) throws IOException {
        InputStream inputStreamA = b.a(httpEntity);
        httpEntity.getContentLength();
        try {
            try {
                byte[] bArr = new byte[2048];
                while (true) {
                    int i = inputStreamA.read(bArr);
                    if (i == -1 || this.f560c.h()) {
                        break;
                    }
                    outputStream.write(bArr, 0, i);
                    this.f560c.f();
                }
                outputStream.flush();
                r.a(inputStreamA);
            } catch (Exception e2) {
                e2.getCause();
                throw new IOException("HttpWorker Request Error!" + e2.getLocalizedMessage());
            }
        } catch (Throwable th) {
            r.a(inputStreamA);
            throw th;
        }
    }
}
