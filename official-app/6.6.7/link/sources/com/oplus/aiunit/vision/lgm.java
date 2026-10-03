package com.oplus.aiunit.vision;

import android.util.Log;
import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.Map;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes8.dex */
public class lgm {
    public jqm a(lmm lmmVar) {
        System.currentTimeMillis();
        try {
            HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(lmmVar.c()).openConnection();
            httpURLConnection.setDoInput(true);
            httpURLConnection.setRequestMethod(lmmVar.b());
            httpURLConnection.setConnectTimeout(30000);
            c(httpURLConnection, lmmVar);
            httpURLConnection.connect();
            int responseCode = httpURLConnection.getResponseCode();
            Log.e("test", "responseCode: " + responseCode);
            if (responseCode == 200) {
                InputStream inputStream = httpURLConnection.getInputStream();
                if (inputStream == null) {
                    return null;
                }
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                byte[] bArr = new byte[1024];
                while (true) {
                    int i = inputStream.read(bArr);
                    if (i == -1) {
                        byte[] byteArray = byteArrayOutputStream.toByteArray();
                        b(inputStream);
                        byteArrayOutputStream.close();
                        return jqm.b().b(200).c(byteArray).d();
                    }
                    byteArrayOutputStream.write(bArr, 0, i);
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.currentTimeMillis();
        return null;
    }

    public final void b(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (RuntimeException e) {
                throw e;
            } catch (Exception unused) {
            }
        }
    }

    public final void c(URLConnection uRLConnection, lmm lmmVar) {
        Map<String, String> mapA = lmmVar.a();
        if (mapA != null) {
            for (Map.Entry<String, String> entry : mapA.entrySet()) {
                uRLConnection.setRequestProperty(entry.getKey(), entry.getValue());
            }
        }
    }
}
