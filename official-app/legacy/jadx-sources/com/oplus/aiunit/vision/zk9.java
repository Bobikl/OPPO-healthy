package com.oplus.aiunit.vision;

import android.text.TextUtils;
import android.util.Log;
import com.danikula.videocache.InterruptedProxyCacheException;
import com.danikula.videocache.ProxyCacheException;
import com.platform.usercenter.network.header.HeaderConstant;
import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InterruptedIOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Map;

/* JADX INFO: loaded from: classes13.dex */
public class zk9 implements r3i {
    public final u3i a;
    public final di8 b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public t3i f19457c;
    public HttpURLConnection d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public InputStream f19458e;

    public zk9(String str) {
        this(str, v3i.a());
    }

    @Override // com.oplus.aiunit.vision.r3i
    public void a(long j2) throws ProxyCacheException {
        try {
            HttpURLConnection httpURLConnectionG = g(j2, -1);
            this.d = httpURLConnectionG;
            String contentType = httpURLConnectionG.getContentType();
            this.f19458e = new BufferedInputStream(this.d.getInputStream(), 8192);
            HttpURLConnection httpURLConnection = this.d;
            t3i t3iVar = new t3i(this.f19457c.a, h(httpURLConnection, j2, httpURLConnection.getResponseCode()), contentType);
            this.f19457c = t3iVar;
            this.a.a(t3iVar.a, t3iVar);
        } catch (IOException e2) {
            throw new ProxyCacheException("Error opening connection for " + this.f19457c.a + " with offset " + j2, e2);
        }
    }

    /* JADX WARN: Code duplicated, block: B:21:0x008a  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10 */
    /* JADX WARN: Type inference failed for: r0v11 */
    /* JADX WARN: Type inference failed for: r0v2 */
    /* JADX WARN: Type inference failed for: r0v3 */
    /* JADX WARN: Type inference failed for: r0v5, types: [java.net.HttpURLConnection] */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* JADX WARN: Type inference failed for: r0v8, types: [java.net.HttpURLConnection] */
    public final void b() throws Throwable {
        HttpURLConnection httpURLConnectionG;
        Log.d("video", "Read content info from " + this.f19457c.a);
        ?? r0 = 10000;
        InputStream inputStream = null;
        try {
            try {
                httpURLConnectionG = g(0L, 10000);
                try {
                    long jC = c(httpURLConnectionG);
                    String contentType = httpURLConnectionG.getContentType();
                    inputStream = httpURLConnectionG.getInputStream();
                    t3i t3iVar = new t3i(this.f19457c.a, jC, contentType);
                    this.f19457c = t3iVar;
                    this.a.a(t3iVar.a, t3iVar);
                    Log.d("video", "Source info fetched: " + this.f19457c);
                    b3f.c(inputStream);
                    r0 = httpURLConnectionG;
                } catch (IOException e2) {
                    e = e2;
                    Log.d("video", "Error fetching info from " + this.f19457c.a, e);
                    b3f.c(inputStream);
                    r0 = httpURLConnectionG;
                    if (httpURLConnectionG == null) {
                        return;
                    }
                }
            } catch (Throwable th) {
                th = th;
                b3f.c(inputStream);
                if (r0 != 0) {
                    r0.disconnect();
                }
                throw th;
            }
        } catch (IOException e3) {
            e = e3;
            httpURLConnectionG = null;
        } catch (Throwable th2) {
            th = th2;
            r0 = 0;
            b3f.c(inputStream);
            if (r0 != 0) {
                r0.disconnect();
            }
            throw th;
        }
        r0.disconnect();
    }

    public final long c(HttpURLConnection httpURLConnection) {
        String headerField = httpURLConnection.getHeaderField("Content-Length");
        if (headerField == null) {
            return -1L;
        }
        return Long.parseLong(headerField);
    }

    @Override // com.oplus.aiunit.vision.r3i
    public void close() throws ProxyCacheException {
        HttpURLConnection httpURLConnection = this.d;
        if (httpURLConnection != null) {
            try {
                httpURLConnection.disconnect();
            } catch (ArrayIndexOutOfBoundsException e2) {
                Log.e("video", "Error closing connection correctly. Should happen only on Android L. If anybody know how to fix it, please visit https://github.com/danikula/AndroidVideoCache/issues/88. Until good solution is not know, just ignore this issue :(", e2);
            } catch (IllegalArgumentException | NullPointerException e3) {
                throw new RuntimeException("Wait... but why? WTF!? Really shouldn't happen any more after fixing https://github.com/danikula/AndroidVideoCache/issues/43. If you read it on your device log, please, notify me danikula@gmail.com or create issue here https://github.com/danikula/AndroidVideoCache/issues.", e3);
            }
        }
    }

    public synchronized String d() throws ProxyCacheException {
        if (TextUtils.isEmpty(this.f19457c.f16880c)) {
            b();
        }
        return this.f19457c.f16880c;
    }

    public String e() {
        return this.f19457c.a;
    }

    public final void f(HttpURLConnection httpURLConnection, String str) {
        for (Map.Entry<String, String> entry : this.b.a(str).entrySet()) {
            httpURLConnection.setRequestProperty(entry.getKey(), entry.getValue());
        }
    }

    public final HttpURLConnection g(long j2, int i) throws IOException, ProxyCacheException {
        String str;
        HttpURLConnection httpURLConnection;
        boolean z;
        String headerField = this.f19457c.a;
        int i2 = 0;
        do {
            StringBuilder sb = new StringBuilder();
            sb.append("Open connection ");
            if (j2 > 0) {
                str = " with offset " + j2;
            } else {
                str = "";
            }
            sb.append(str);
            sb.append(" to ");
            sb.append(headerField);
            Log.d("video", sb.toString());
            httpURLConnection = (HttpURLConnection) new URL(headerField).openConnection();
            f(httpURLConnection, headerField);
            if (j2 > 0) {
                httpURLConnection.setRequestProperty("Range", "bytes=" + j2 + "-");
            }
            if (i > 0) {
                httpURLConnection.setConnectTimeout(i);
                httpURLConnection.setReadTimeout(i);
            }
            int responseCode = httpURLConnection.getResponseCode();
            z = responseCode == 301 || responseCode == 302 || responseCode == 303;
            if (z) {
                headerField = httpURLConnection.getHeaderField(HeaderConstant.HEAD_K_302_LOCATION);
                i2++;
                httpURLConnection.disconnect();
            }
            if (i2 > 5) {
                throw new ProxyCacheException("Too many redirects: " + i2);
            }
        } while (z);
        return httpURLConnection;
    }

    public final long h(HttpURLConnection httpURLConnection, long j2, int i) throws IOException {
        long jC = c(httpURLConnection);
        if (i == 200) {
            return jC;
        }
        return i == 206 ? jC + j2 : this.f19457c.b;
    }

    @Override // com.oplus.aiunit.vision.r3i
    public synchronized long length() throws ProxyCacheException {
        if (this.f19457c.b == -2147483648L) {
            b();
        }
        return this.f19457c.b;
    }

    @Override // com.oplus.aiunit.vision.r3i
    public int read(byte[] bArr) throws ProxyCacheException {
        InputStream inputStream = this.f19458e;
        if (inputStream == null) {
            throw new ProxyCacheException("Error reading data from " + this.f19457c.a + ": connection is absent!");
        }
        try {
            return inputStream.read(bArr, 0, bArr.length);
        } catch (InterruptedIOException e2) {
            throw new InterruptedProxyCacheException("Reading source " + this.f19457c.a + " is interrupted", e2);
        } catch (IOException e3) {
            throw new ProxyCacheException("Error reading data from " + this.f19457c.a, e3);
        }
    }

    public String toString() {
        return "HttpUrlSource{sourceInfo='" + this.f19457c + "}";
    }

    public zk9(String str, u3i u3iVar) {
        this(str, u3iVar, new vl6());
    }

    public zk9(String str, u3i u3iVar, di8 di8Var) {
        this.a = (u3i) voe.d(u3iVar);
        this.b = (di8) voe.d(di8Var);
        t3i t3iVar = u3iVar.get(str);
        this.f19457c = t3iVar == null ? new t3i(str, -2147483648L, b3f.g(str)) : t3iVar;
    }

    public zk9(zk9 zk9Var) {
        this.f19457c = zk9Var.f19457c;
        this.a = zk9Var.a;
        this.b = zk9Var.b;
    }
}
