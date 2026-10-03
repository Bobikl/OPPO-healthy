package com.oplus.aiunit.vision;

import java.io.ByteArrayOutputStream;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.zip.GZIPOutputStream;

/* JADX INFO: loaded from: classes10.dex */
public final class msm<T> implements nmm<T> {
    public final wcm a;
    public final boolean b = true;

    public msm(wcm wcmVar) {
        this.a = wcmVar;
    }

    @Override // com.oplus.aiunit.vision.nmm
    public final avm a(ArrayList arrayList) {
        int i;
        try {
            HttpURLConnection httpURLConnection = (HttpURLConnection) new URL("https://spider-tracker.xiaohongshu.com/api/spider").openConnection();
            httpURLConnection.setRequestMethod("POST");
            httpURLConnection.setReadTimeout(10000);
            httpURLConnection.setConnectTimeout(5000);
            httpURLConnection.setDoInput(true);
            httpURLConnection.setDoOutput(true);
            httpURLConnection.addRequestProperty("Content-Type", "application/octet-stream; charset=utf-8");
            if (this.b) {
                httpURLConnection.setRequestProperty(ar9.CONTENT_ENCODING, "gzip");
            }
            httpURLConnection.connect();
            try {
                OutputStream outputStream = httpURLConnection.getOutputStream();
                if (this.b) {
                    outputStream = new GZIPOutputStream(outputStream);
                }
                this.a.getClass();
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    byteArrayOutputStream.write((byte[]) it.next());
                }
                outputStream.write(byteArrayOutputStream.toByteArray());
                outputStream.flush();
                outputStream.close();
                try {
                    int responseCode = httpURLConnection.getResponseCode();
                    String responseMessage = httpURLConnection.getResponseMessage();
                    httpURLConnection.disconnect();
                    avm avmVar = new avm();
                    if (responseCode < 200 || responseCode >= 300) {
                        avmVar.a = false;
                    } else {
                        avmVar.a = true;
                    }
                    avmVar.b = responseCode;
                    avmVar.f9505c = responseMessage;
                    return avmVar;
                } catch (Throwable th) {
                    th = th;
                    i = -1;
                    return avm.a(i, th);
                }
            } catch (Throwable th2) {
                th = th2;
                i = -2;
            }
        } catch (Throwable th3) {
            th = th3;
            i = -4;
        }
    }
}
