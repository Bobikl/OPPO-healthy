package com.sensorsdata.analytics.android.sdk.network;

import android.text.TextUtils;
import com.oplus.weatherservicesdk.data.Weather;
import com.platform.usercenter.network.header.HeaderConstant;
import com.sensorsdata.analytics.android.sdk.SALog;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

/* JADX INFO: loaded from: classes10.dex */
class HttpUtils {
    private static final int HTTP_307 = 307;

    public static String getLocation(HttpURLConnection httpURLConnection, String str) throws MalformedURLException {
        if (httpURLConnection == null || TextUtils.isEmpty(str)) {
            return null;
        }
        String headerField = httpURLConnection.getHeaderField(HeaderConstant.HEAD_K_302_LOCATION);
        if (TextUtils.isEmpty(headerField)) {
            headerField = httpURLConnection.getHeaderField("location");
        }
        if (TextUtils.isEmpty(headerField)) {
            return null;
        }
        if (headerField.startsWith("http://") || headerField.startsWith("https://")) {
            return headerField;
        }
        URL url = new URL(str);
        return url.getProtocol() + "://" + url.getHost() + headerField;
    }

    public static String getRetString(InputStream inputStream) throws Throwable {
        BufferedReader bufferedReader;
        Throwable th;
        Exception e2;
        try {
            bufferedReader = new BufferedReader(new InputStreamReader(inputStream, "UTF-8"));
            try {
                try {
                    StringBuilder sb = new StringBuilder();
                    while (true) {
                        String line = bufferedReader.readLine();
                        if (line == null) {
                            break;
                        }
                        sb.append(line);
                        sb.append(Weather.SEPARATOR);
                        th = th;
                        if (bufferedReader != null) {
                            try {
                                bufferedReader.close();
                            } catch (IOException e3) {
                                SALog.printStackTrace(e3);
                            }
                        }
                        if (inputStream == null) {
                            throw th;
                        }
                        try {
                            inputStream.close();
                            throw th;
                        } catch (IOException e4) {
                            SALog.printStackTrace(e4);
                            throw th;
                        }
                    }
                    inputStream.close();
                    String string = sb.toString();
                    try {
                        bufferedReader.close();
                    } catch (IOException e5) {
                        SALog.printStackTrace(e5);
                    }
                    try {
                        inputStream.close();
                    } catch (IOException e6) {
                        SALog.printStackTrace(e6);
                    }
                    return string;
                } catch (Exception e7) {
                    e2 = e7;
                    SALog.printStackTrace(e2);
                    if (bufferedReader != null) {
                        try {
                            bufferedReader.close();
                        } catch (IOException e8) {
                            SALog.printStackTrace(e8);
                        }
                    }
                    if (inputStream == null) {
                        return "";
                    }
                    try {
                        inputStream.close();
                        return "";
                    } catch (IOException e9) {
                        SALog.printStackTrace(e9);
                        return "";
                    }
                }
            } catch (Throwable th2) {
                th = th2;
            }
        } catch (Exception e10) {
            bufferedReader = null;
            e2 = e10;
        } catch (Throwable th3) {
            bufferedReader = null;
            th = th3;
        }
    }

    public static boolean needRedirects(int i) {
        return i == 301 || i == 302 || i == 307;
    }
}
