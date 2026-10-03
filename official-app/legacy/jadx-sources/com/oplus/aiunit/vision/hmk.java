package com.oplus.aiunit.vision;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.nio.charset.Charset;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.zip.GZIPInputStream;
import java.util.zip.Inflater;
import java.util.zip.InflaterInputStream;

/* JADX INFO: loaded from: classes3.dex */
public class hmk implements ar9 {

    @NonNull
    public final HttpURLConnection i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final int f12202j;
    public final String k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final String f12203l;
    public final String m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public long f12204n;

    @NonNull
    public final Map<String, String> o;

    public hmk(@NonNull HttpURLConnection httpURLConnection) throws IOException {
        this.f12204n = -1L;
        this.i = httpURLConnection;
        this.f12202j = httpURLConnection.getResponseCode();
        this.k = httpURLConnection.getResponseMessage();
        String contentType = httpURLConnection.getContentType();
        this.f12203l = contentType;
        this.m = g83.a(contentType);
        try {
            this.f12204n = Long.parseLong(httpURLConnection.getHeaderField("Content-Length"));
        } catch (Exception unused) {
        }
        if (this.f12204n < 0) {
            this.f12204n = httpURLConnection.getContentLength();
        }
        this.o = a(httpURLConnection);
    }

    @NonNull
    public final Map<String, String> a(HttpURLConnection httpURLConnection) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Map<String, List<String>> headerFields = httpURLConnection.getHeaderFields();
        if (headerFields != null) {
            for (String str : headerFields.keySet()) {
                if (str != null) {
                    linkedHashMap.put(str, httpURLConnection.getHeaderField(str));
                }
            }
        }
        return linkedHashMap;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.i.disconnect();
    }

    @Override // com.oplus.aiunit.vision.ar9
    public InputStream f() throws IOException {
        InputStream errorStream = this.i.getErrorStream();
        if (errorStream == null) {
            String strG = g(ar9.CONTENT_ENCODING);
            if ("gzip".equalsIgnoreCase(strG)) {
                errorStream = new GZIPInputStream(this.i.getInputStream());
            } else {
                errorStream = "deflate".equalsIgnoreCase(strG) ? new InflaterInputStream(this.i.getInputStream(), new Inflater(true)) : this.i.getInputStream();
            }
        }
        return new BufferedInputStream(errorStream);
    }

    public String g(String str) {
        Map<String, String> mapH = h();
        if (mapH == null) {
            return null;
        }
        return mapH.get(str);
    }

    public Map<String, String> h() {
        return this.o;
    }

    @Override // com.oplus.aiunit.vision.ar9
    public String k() {
        return TextUtils.isEmpty(this.m) ? Charset.defaultCharset().name() : this.m;
    }

    @Override // com.oplus.aiunit.vision.ar9
    public String r() {
        return this.k;
    }

    @Override // com.oplus.aiunit.vision.ar9
    public int statusCode() {
        return this.f12202j;
    }

    public String toString() {
        return "UrlConnectionResponse{statusCode=" + this.f12202j + ", statusMessage='" + this.k + "', contentType='" + this.f12203l + "', contentLength=" + this.f12204n + ", headers=" + this.o + '}';
    }
}
