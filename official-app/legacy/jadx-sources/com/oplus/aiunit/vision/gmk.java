package com.oplus.aiunit.vision;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import java.io.BufferedOutputStream;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.ProtocolException;
import java.net.URL;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public class gmk implements wq9 {
    @Override // com.oplus.aiunit.vision.wq9
    @NonNull
    public ar9 a(@NonNull yq9 yq9Var) throws IOException {
        HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(yq9Var.getUrl()).openConnection();
        httpURLConnection.setRequestMethod(yq9Var.getMethod());
        c(yq9Var, httpURLConnection);
        httpURLConnection.connect();
        if (b(yq9Var) && !TextUtils.isEmpty(yq9Var.getContent())) {
            BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(httpURLConnection.getOutputStream());
            bufferedOutputStream.write(yq9Var.getContent().getBytes(g83.a(yq9Var.getContentType())));
            bufferedOutputStream.flush();
            bufferedOutputStream.close();
        }
        return new hmk(httpURLConnection);
    }

    public boolean b(@NonNull yq9 yq9Var) {
        return "POST".equalsIgnoreCase(yq9Var.getMethod());
    }

    public void c(@NonNull yq9 yq9Var, @NonNull HttpURLConnection httpURLConnection) throws ProtocolException {
        httpURLConnection.setInstanceFollowRedirects(true);
        httpURLConnection.setConnectTimeout(30000);
        httpURLConnection.setReadTimeout(10000);
        Map<String, String> mapA = yq9Var.a();
        if (mapA != null) {
            for (Map.Entry<String, String> entry : mapA.entrySet()) {
                httpURLConnection.setRequestProperty(entry.getKey(), entry.getValue());
            }
        }
        if (b(yq9Var)) {
            httpURLConnection.setDoOutput(true);
            httpURLConnection.setDoInput(true);
            httpURLConnection.setUseCaches(false);
        }
    }
}
