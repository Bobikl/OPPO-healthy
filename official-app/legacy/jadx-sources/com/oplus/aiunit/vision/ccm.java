package com.oplus.aiunit.vision;

import android.util.Log;
import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.Map;

/* JADX INFO: loaded from: classes8.dex */
public class ccm {
    public amm a(eim eimVar) {
        System.currentTimeMillis();
        try {
            HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(eimVar.c()).openConnection();
            httpURLConnection.setDoInput(true);
            httpURLConnection.setRequestMethod(eimVar.b());
            httpURLConnection.setConnectTimeout(30000);
            c(httpURLConnection, eimVar);
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
                        return amm.b().b(200).c(byteArray).d();
                    }
                    byteArrayOutputStream.write(bArr, 0, i);
                }
            }
        } catch (Exception e2) {
            e2.printStackTrace();
        }
        System.currentTimeMillis();
        return null;
    }

    public final void b(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (RuntimeException e2) {
                throw e2;
            } catch (Exception unused) {
            }
        }
    }

    public final void c(URLConnection uRLConnection, eim eimVar) {
        Map<String, String> mapA = eimVar.a();
        if (mapA != null) {
            for (Map.Entry<String, String> entry : mapA.entrySet()) {
                uRLConnection.setRequestProperty(entry.getKey(), entry.getValue());
            }
        }
    }
}
