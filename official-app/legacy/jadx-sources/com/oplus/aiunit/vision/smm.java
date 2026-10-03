package com.oplus.aiunit.vision;

import android.text.TextUtils;
import androidx.annotation.WorkerThread;
import com.heytap.store.base.core.http.HttpUtils;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.HttpURLConnection;
import java.net.URL;
import java.nio.charset.StandardCharsets;
import java.util.Map;

/* JADX INFO: loaded from: classes10.dex */
public final class smm {
    @WorkerThread
    public static String a(String str, Map<String, Object> map) throws IOException, com.xingin.xhssharesdk.l.c, com.xingin.xhssharesdk.l.b {
        if (TextUtils.isEmpty(str)) {
            throw new com.xingin.xhssharesdk.l.c();
        }
        StringBuilder sb = new StringBuilder();
        for (String str2 : map.keySet()) {
            if (sb.length() != 0) {
                sb.append("&");
            }
            sb.append(str2);
            sb.append(HttpUtils.EQUAL_SIGN);
            sb.append(map.get(str2));
        }
        HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(str).openConnection();
        httpURLConnection.setRequestProperty("accept", "*/*");
        httpURLConnection.setRequestProperty("connection", "Keep-Alive");
        httpURLConnection.setRequestProperty("Content-Length", String.valueOf(sb.length()));
        httpURLConnection.setRequestMethod("POST");
        httpURLConnection.setConnectTimeout(5000);
        httpURLConnection.setReadTimeout(8000);
        httpURLConnection.setDoInput(true);
        httpURLConnection.setDoOutput(true);
        PrintWriter printWriter = new PrintWriter(httpURLConnection.getOutputStream());
        printWriter.write(sb.toString());
        printWriter.flush();
        printWriter.close();
        if (httpURLConnection.getResponseCode() != 200) {
            httpURLConnection.disconnect();
            throw new com.xingin.xhssharesdk.l.b(httpURLConnection.getResponseCode());
        }
        InputStream inputStream = httpURLConnection.getInputStream();
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream, StandardCharsets.UTF_8));
        StringBuilder sb2 = new StringBuilder();
        while (true) {
            String line = bufferedReader.readLine();
            if (line == null) {
                bufferedReader.close();
                inputStream.close();
                String string = sb2.toString();
                httpURLConnection.disconnect();
                return string;
            }
            sb2.append(line);
        }
    }
}
