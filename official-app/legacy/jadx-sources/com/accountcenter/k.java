package com.accountcenter;

import android.text.TextUtils;
import com.heytap.weather.service.WeatherCloud;
import com.platform.usercenter.tools.log.UCLogUtil;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Map;
import java.util.zip.GZIPInputStream;

/* JADX INFO: loaded from: classes12.dex */
@Deprecated
public final class k {
    public static final byte[] a(HttpURLConnection httpURLConnection) throws IOException {
        httpURLConnection.connect();
        byte[] byteArray = null;
        if (httpURLConnection.getResponseCode() != 200) {
            UCLogUtil.i("UCHttpHelper " + ("HTTP code: " + httpURLConnection.getResponseCode() + ", url = " + httpURLConnection.getURL()));
            return null;
        }
        String contentEncoding = httpURLConnection.getContentEncoding();
        InputStream inputStream = (contentEncoding == null || !contentEncoding.contains("gzip")) ? httpURLConnection.getInputStream() : new GZIPInputStream(httpURLConnection.getInputStream());
        if (inputStream != null) {
            try {
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                byte[] bArr = new byte[4096];
                while (true) {
                    int i = inputStream.read(bArr, 0, 4096);
                    if (i <= 0) {
                        break;
                    }
                    byteArrayOutputStream.write(bArr, 0, i);
                }
                byteArray = byteArrayOutputStream.toByteArray();
            } catch (Throwable th) {
                try {
                    inputStream.close();
                } catch (IOException unused) {
                }
                throw th;
            }
        }
        if (inputStream != null) {
            try {
                inputStream.close();
            } catch (IOException unused2) {
            }
        }
        return byteArray;
    }

    public static byte[] b(String str, String str2, Map<String, String> map) {
        HttpURLConnection httpURLConnectionA;
        if (TextUtils.isEmpty(str) || (httpURLConnectionA = a("POST", str, map)) == null) {
            return null;
        }
        httpURLConnectionA.setUseCaches(false);
        httpURLConnectionA.setDoInput(true);
        httpURLConnectionA.setDoOutput(true);
        PrintWriter printWriter = new PrintWriter(httpURLConnectionA.getOutputStream());
        if (!TextUtils.isEmpty(str2)) {
            printWriter.print(str2);
        }
        printWriter.flush();
        printWriter.close();
        return a(httpURLConnectionA);
    }

    public static final HttpURLConnection a(String str, String str2, Map<String, String> map) {
        try {
            HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(str2).openConnection();
            UCLogUtil.i("UCHttpHelper " + ("request url: " + str2));
            httpURLConnection.setRequestProperty("Accept", "*/*");
            httpURLConnection.setRequestProperty("Accept-Language", WeatherCloud.LANGUAGE);
            httpURLConnection.setRequestProperty("Accept-Charset", "utf-8");
            httpURLConnection.setRequestProperty("Connection", "Keep-Alive");
            if (map != null) {
                for (String str3 : map.keySet()) {
                    httpURLConnection.setRequestProperty(str3, map.get(str3));
                }
            }
            httpURLConnection.setConnectTimeout(10000);
            httpURLConnection.setReadTimeout(30000);
            httpURLConnection.setRequestMethod(str);
            return httpURLConnection;
        } catch (MalformedURLException e2) {
            UCLogUtil.i("UCHttpHelper " + ("error: " + e2.getMessage()));
            return null;
        } catch (IOException e3) {
            UCLogUtil.i("UCHttpHelper " + ("error: " + e3.getMessage()));
            return null;
        } catch (Exception e4) {
            UCLogUtil.i("UCHttpHelper " + ("error: " + e4.getMessage()));
            return null;
        }
    }
}
