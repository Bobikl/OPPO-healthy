package com.oplus.aiunit.vision;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import com.oplus.weatherservicesdk.data.Weather;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;

/* JADX INFO: loaded from: classes12.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY})
public class a55 implements vab {

    @NonNull
    public final HttpURLConnection i;

    public a55(@NonNull HttpURLConnection httpURLConnection) {
        this.i = httpURLConnection;
    }

    public final String a(HttpURLConnection httpURLConnection) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(httpURLConnection.getErrorStream()));
        StringBuilder sb = new StringBuilder();
        while (true) {
            try {
                String line = bufferedReader.readLine();
                if (line != null) {
                    sb.append(line);
                    sb.append('\n');
                } else {
                    try {
                        break;
                    } catch (Exception unused) {
                    }
                }
            } catch (Throwable th) {
                try {
                    bufferedReader.close();
                } catch (Exception unused2) {
                }
                throw th;
            }
        }
        bufferedReader.close();
        return sb.toString();
    }

    @Override // com.oplus.aiunit.vision.vab
    public boolean b() {
        try {
            return this.i.getResponseCode() / 100 == 2;
        } catch (IOException unused) {
            return false;
        }
    }

    @Override // com.oplus.aiunit.vision.vab
    @Nullable
    public String c() {
        try {
            if (b()) {
                return null;
            }
            return "Unable to fetch " + this.i.getURL() + ". Failed with " + this.i.getResponseCode() + Weather.SEPARATOR + a(this.i);
        } catch (IOException e2) {
            o7b.d("get error failed ", e2);
            return e2.getMessage();
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.i.disconnect();
    }

    @Override // com.oplus.aiunit.vision.vab
    @Nullable
    public String d() {
        return this.i.getContentType();
    }

    @Override // com.oplus.aiunit.vision.vab
    @NonNull
    public InputStream e() throws IOException {
        return this.i.getInputStream();
    }
}
