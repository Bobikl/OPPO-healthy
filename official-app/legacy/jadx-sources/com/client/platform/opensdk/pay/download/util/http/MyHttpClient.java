package com.client.platform.opensdk.pay.download.util.http;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.text.TextUtils;
import com.client.platform.opensdk.pay.download.util.Util;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.InetSocketAddress;
import java.net.Proxy;
import java.net.URI;
import java.net.URL;
import java.util.Map;

/* JADX INFO: loaded from: classes13.dex */
public class MyHttpClient {
    private static final String CHINAMOBILEWAP = "cmwap";
    private static final String CHINAUNICOM3GNET = "3gwap";
    private static final String CHINAUNICOMWAP = "uniwap";
    protected static final int CONNECTION_TIMEOUT_MS = 30000;
    protected static final int RETRIED_TIME = 3;
    protected static final int RETRIEVE_LIMIT = 20;
    protected static final int SOCKET_TIMEOUT_MS = 30000;
    protected Context ctx;

    public MyHttpClient(Context context) {
        this.ctx = context;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0026  */
    public static HttpURLConnection getURLConnectioin(Context context, String str) throws IOException {
        Proxy proxy;
        URL url = new URL(Util.Utf8URLencode(str));
        if (isMobileActive(context)) {
            String defaultHost = android.net.Proxy.getDefaultHost();
            int defaultPort = android.net.Proxy.getDefaultPort();
            if (defaultHost != null) {
                proxy = new Proxy(Proxy.Type.HTTP, new InetSocketAddress(defaultHost, defaultPort));
            } else {
                proxy = null;
            }
        } else {
            proxy = null;
        }
        HttpURLConnection httpURLConnection = proxy != null ? (HttpURLConnection) url.openConnection(proxy) : (HttpURLConnection) url.openConnection();
        httpURLConnection.setConnectTimeout(30000);
        httpURLConnection.setReadTimeout(30000);
        httpURLConnection.setRequestProperty("User-Agent", "Mozilla/5.0 (Windows; U; Windows NT 5.1; zh-CN; rv:1.9.2) Gecko/20100115 Firefox/3.6");
        return httpURLConnection;
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0067  */
    public static HttpURLConnection getUrlConnecttion(Context context, String str) throws IOException {
        HttpURLConnection httpURLConnection;
        URL url = new URL(Util.Utf8URLencode(str));
        if (isChinaMobileWap(context)) {
            String host = url.getHost();
            int port = url.getPort();
            httpURLConnection = (HttpURLConnection) new URL(str).openConnection();
            if (port != -1) {
                host = host + ":" + port;
            }
            httpURLConnection.setRequestProperty("X-Online-Host", host);
        } else if (isMobileNotChinaUniocomWap(context)) {
            String defaultHost = android.net.Proxy.getDefaultHost();
            int defaultPort = android.net.Proxy.getDefaultPort();
            if (TextUtils.isEmpty(defaultHost)) {
                httpURLConnection = null;
            } else {
                httpURLConnection = (HttpURLConnection) url.openConnection(new Proxy(Proxy.Type.HTTP, new InetSocketAddress(defaultHost, defaultPort)));
            }
        } else {
            httpURLConnection = null;
        }
        return httpURLConnection == null ? (HttpURLConnection) url.openConnection() : httpURLConnection;
    }

    public static boolean isChinaMobileWap(Context context) {
        NetworkInfo activeNetworkInfo;
        return (context == null || (activeNetworkInfo = ((ConnectivityManager) context.getSystemService("connectivity")).getActiveNetworkInfo()) == null || !activeNetworkInfo.isAvailable() || 1 == activeNetworkInfo.getType() || !CHINAMOBILEWAP.equals(activeNetworkInfo.getExtraInfo())) ? false : true;
    }

    public static boolean isMobileActive(Context context) {
        NetworkInfo activeNetworkInfo = ((ConnectivityManager) context.getSystemService("connectivity")).getActiveNetworkInfo();
        return activeNetworkInfo != null && activeNetworkInfo.getType() == 0;
    }

    public static boolean isMobileNotChinaUniocomWap(Context context) {
        NetworkInfo activeNetworkInfo;
        return (context == null || (activeNetworkInfo = ((ConnectivityManager) context.getSystemService("connectivity")).getActiveNetworkInfo()) == null || !activeNetworkInfo.isAvailable() || 1 == activeNetworkInfo.getType() || CHINAUNICOMWAP.equals(activeNetworkInfo.getExtraInfo()) || CHINAUNICOM3GNET.equals(activeNetworkInfo.getExtraInfo())) ? false : true;
    }

    public static HttpURLConnection openConnection(String str, byte[] bArr, Map<String, String> map, int i, String str2) {
        HttpURLConnection httpURLConnection;
        try {
            httpURLConnection = (HttpURLConnection) new URL(str2).openConnection();
            try {
                httpURLConnection.setDoInput(true);
                httpURLConnection.setUseCaches(false);
                httpURLConnection.setConnectTimeout(i);
                httpURLConnection.setReadTimeout(30000);
                httpURLConnection.setRequestMethod(str);
                if ("POST".equals(str)) {
                    httpURLConnection.setDoOutput(true);
                    if (map != null) {
                        for (String str3 : map.keySet()) {
                            httpURLConnection.setRequestProperty(str3, map.get(str3));
                        }
                    }
                }
            } catch (Exception unused) {
                if (httpURLConnection != null) {
                    httpURLConnection.disconnect();
                    return null;
                }
            }
        } catch (Exception unused2) {
            httpURLConnection = null;
        }
        return httpURLConnection;
    }

    public URI createURI(String str) throws Exception {
        return new URI(str);
    }
}
