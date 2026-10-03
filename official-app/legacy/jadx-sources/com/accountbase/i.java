package com.accountbase;

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
public class i {
    private static void a(String str) {
        UCLogUtil.i("UCHttpHelper " + str);
    }

    public static byte[] b(String str, String str2, Map<String, String> map) {
        HttpURLConnection httpURLConnectionA;
        if (TextUtils.isEmpty(str) || (httpURLConnectionA = a("POST", str, map)) == null) {
            return null;
        }
        a(str2, httpURLConnectionA);
        return a(httpURLConnectionA);
    }

    public static byte[] a(String str, Map<String, String> map) {
        HttpURLConnection httpURLConnectionA;
        if (TextUtils.isEmpty(str) || (httpURLConnectionA = a("GET", str, map)) == null) {
            return null;
        }
        return a(httpURLConnectionA);
    }

    private static final byte[] a(HttpURLConnection httpURLConnection) throws IOException {
        httpURLConnection.connect();
        if (httpURLConnection.getResponseCode() != 200) {
            a("HTTP code: " + httpURLConnection.getResponseCode() + ", url = " + httpURLConnection.getURL());
            return null;
        }
        InputStream inputStreamB = b(httpURLConnection);
        try {
            return a(inputStreamB);
        } finally {
            if (inputStreamB != null) {
                try {
                    inputStreamB.close();
                } catch (IOException unused) {
                }
            }
        }
    }

    private static InputStream b(HttpURLConnection httpURLConnection) {
        String contentEncoding = httpURLConnection.getContentEncoding();
        if (contentEncoding != null && contentEncoding.contains("gzip")) {
            return new GZIPInputStream(httpURLConnection.getInputStream());
        }
        return httpURLConnection.getInputStream();
    }

    private static final byte[] a(InputStream inputStream) throws IOException {
        if (inputStream == null) {
            return null;
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byte[] bArr = new byte[4096];
        while (true) {
            int i = inputStream.read(bArr, 0, 4096);
            if (i > 0) {
                byteArrayOutputStream.write(bArr, 0, i);
            } else {
                return byteArrayOutputStream.toByteArray();
            }
        }
    }

    private static void a(String str, HttpURLConnection httpURLConnection) {
        if (httpURLConnection != null) {
            httpURLConnection.setUseCaches(false);
            httpURLConnection.setDoInput(true);
            httpURLConnection.setDoOutput(true);
            PrintWriter printWriter = new PrintWriter(httpURLConnection.getOutputStream());
            if (!TextUtils.isEmpty(str)) {
                printWriter.print(str);
            }
            printWriter.flush();
            printWriter.close();
        }
    }

    private static final HttpURLConnection a(String str, String str2, Map<String, String> map) {
        try {
            HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(str2).openConnection();
            a("request url: " + str2);
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
            a("error: " + e2.getMessage());
            return null;
        } catch (IOException e3) {
            a("error: " + e3.getMessage());
            return null;
        } catch (Exception e4) {
            a("error: " + e4.getMessage());
            return null;
        }
    }
}
