package com.oplus.aiunit.vision;

import android.text.TextUtils;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.VisibleForTesting;
import com.bumptech.glide.Priority;
import com.bumptech.glide.load.DataSource;
import com.bumptech.glide.load.HttpException;
import com.platform.usercenter.network.header.HeaderConstant;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.Map;

/* JADX INFO: loaded from: classes13.dex */
public class vk9 implements ft4<InputStream> {

    @VisibleForTesting
    public static final b o = new a();
    public final y68 i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final int f17885j;
    public final b k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public HttpURLConnection f17886l;
    public InputStream m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public volatile boolean f17887n;

    public static class a implements b {
        @Override // com.oplus.aiunit.vision.vk9.b
        public HttpURLConnection a(URL url) throws IOException {
            return (HttpURLConnection) url.openConnection();
        }
    }

    public interface b {
        HttpURLConnection a(URL url) throws IOException;
    }

    public vk9(y68 y68Var, int i) {
        this(y68Var, i, o);
    }

    public static int e(HttpURLConnection httpURLConnection) {
        try {
            return httpURLConnection.getResponseCode();
        } catch (IOException e2) {
            if (!Log.isLoggable("HttpUrlFetcher", 3)) {
                return -1;
            }
            Log.d("HttpUrlFetcher", "Failed to get a response code", e2);
            return -1;
        }
    }

    public static boolean h(int i) {
        return i / 100 == 2;
    }

    public static boolean i(int i) {
        return i / 100 == 3;
    }

    @Override // com.oplus.aiunit.vision.ft4
    @NonNull
    public Class<InputStream> a() {
        return InputStream.class;
    }

    @Override // com.oplus.aiunit.vision.ft4
    public void b() {
        InputStream inputStream = this.m;
        if (inputStream != null) {
            try {
                inputStream.close();
            } catch (IOException unused) {
            }
        }
        HttpURLConnection httpURLConnection = this.f17886l;
        if (httpURLConnection != null) {
            httpURLConnection.disconnect();
        }
        this.f17886l = null;
    }

    @Override // com.oplus.aiunit.vision.ft4
    @NonNull
    public DataSource c() {
        return DataSource.REMOTE;
    }

    @Override // com.oplus.aiunit.vision.ft4
    public void cancel() {
        this.f17887n = true;
    }

    public final HttpURLConnection d(URL url, Map<String, String> map) throws HttpException {
        try {
            HttpURLConnection httpURLConnectionA = this.k.a(url);
            for (Map.Entry<String, String> entry : map.entrySet()) {
                httpURLConnectionA.addRequestProperty(entry.getKey(), entry.getValue());
            }
            httpURLConnectionA.setConnectTimeout(this.f17885j);
            httpURLConnectionA.setReadTimeout(this.f17885j);
            httpURLConnectionA.setUseCaches(false);
            httpURLConnectionA.setDoInput(true);
            httpURLConnectionA.setInstanceFollowRedirects(false);
            return httpURLConnectionA;
        } catch (IOException e2) {
            throw new HttpException("URL.openConnection threw", 0, e2);
        }
    }

    @Override // com.oplus.aiunit.vision.ft4
    public void f(@NonNull Priority priority, @NonNull ft4.a<? super InputStream> aVar) {
        StringBuilder sb;
        long jB = p6b.b();
        try {
            aVar.d(j(this.i.g(), 0, null, this.i.c()));
            if (Log.isLoggable("HttpUrlFetcher", 2)) {
                sb = new StringBuilder();
                sb.append("Finished http url fetcher fetch in ");
                sb.append(p6b.a(jB));
                String string = sb.toString();
            }
        } catch (IOException e2) {
            if (Log.isLoggable("HttpUrlFetcher", 3)) {
                Log.d("HttpUrlFetcher", "Failed to load data for url", e2);
            }
            aVar.e(e2);
            if (!Log.isLoggable("HttpUrlFetcher", 2)) {
            } else {
                sb = new StringBuilder();
            }
        } finally {
            if (Log.isLoggable("HttpUrlFetcher", 2)) {
                Log.v("HttpUrlFetcher", "Finished http url fetcher fetch in " + p6b.a(jB));
            }
        }
    }

    public final InputStream g(HttpURLConnection httpURLConnection) throws HttpException {
        try {
            if (TextUtils.isEmpty(httpURLConnection.getContentEncoding())) {
                this.m = c84.g(httpURLConnection.getInputStream(), httpURLConnection.getContentLength());
            } else {
                if (Log.isLoggable("HttpUrlFetcher", 3)) {
                    Log.d("HttpUrlFetcher", "Got non empty content encoding: " + httpURLConnection.getContentEncoding());
                }
                this.m = httpURLConnection.getInputStream();
            }
            return this.m;
        } catch (IOException e2) {
            throw new HttpException("Failed to obtain InputStream", e(httpURLConnection), e2);
        }
    }

    public final InputStream j(URL url, int i, URL url2, Map<String, String> map) throws HttpException {
        if (i >= 5) {
            throw new HttpException("Too many (> 5) redirects!", -1);
        }
        if (url2 != null) {
            try {
                if (url.toURI().equals(url2.toURI())) {
                    throw new HttpException("In re-direct loop", -1);
                }
            } catch (URISyntaxException unused) {
            }
        }
        HttpURLConnection httpURLConnectionD = d(url, map);
        this.f17886l = httpURLConnectionD;
        try {
            httpURLConnectionD.connect();
            this.m = this.f17886l.getInputStream();
            if (this.f17887n) {
                return null;
            }
            int iE = e(this.f17886l);
            if (h(iE)) {
                return g(this.f17886l);
            }
            if (!i(iE)) {
                if (iE == -1) {
                    throw new HttpException(iE);
                }
                try {
                    throw new HttpException(this.f17886l.getResponseMessage(), iE);
                } catch (IOException e2) {
                    throw new HttpException("Failed to get a response message", iE, e2);
                }
            }
            String headerField = this.f17886l.getHeaderField(HeaderConstant.HEAD_K_302_LOCATION);
            if (TextUtils.isEmpty(headerField)) {
                throw new HttpException("Received empty or null redirect url", iE);
            }
            try {
                URL url3 = new URL(url, headerField);
                b();
                return j(url3, i + 1, url, map);
            } catch (MalformedURLException e3) {
                throw new HttpException("Bad redirect url: " + headerField, iE, e3);
            }
        } catch (IOException e4) {
            throw new HttpException("Failed to connect or obtain data", e(this.f17886l), e4);
        }
    }

    @VisibleForTesting
    public vk9(y68 y68Var, int i, b bVar) {
        this.i = y68Var;
        this.f17885j = i;
        this.k = bVar;
    }
}
