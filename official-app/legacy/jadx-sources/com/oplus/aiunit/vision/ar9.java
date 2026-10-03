package com.oplus.aiunit.vision;

import com.oplus.weatherservicesdk.data.Weather;
import java.io.BufferedReader;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.charset.Charset;

/* JADX INFO: loaded from: classes3.dex */
public interface ar9 extends Closeable {
    public static final String CONTENT_ENCODING = "Content-Encoding";
    public static final String CONTENT_LENGTH = "Content-Length";
    public static final String CONTENT_TYPE = "Content-Type";

    default boolean b() {
        int iStatusCode = statusCode();
        return iStatusCode >= 200 && iStatusCode < 300;
    }

    InputStream f() throws IOException;

    default String j() throws IOException {
        InputStream inputStreamF = f();
        try {
            InputStreamReader inputStreamReader = new InputStreamReader(inputStreamF, Charset.forName(k()));
            try {
                BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
                try {
                    StringBuilder sb = new StringBuilder();
                    while (true) {
                        String line = bufferedReader.readLine();
                        if (line == null) {
                            break;
                        }
                        sb.append(line);
                        sb.append(Weather.SEPARATOR);
                        try {
                            inputStreamReader.close();
                        } catch (Throwable th) {
                            th.addSuppressed(th);
                        }
                        throw th;
                    }
                    String string = sb.toString();
                    bufferedReader.close();
                    inputStreamReader.close();
                    if (inputStreamF != null) {
                        inputStreamF.close();
                    }
                    return string;
                } catch (Throwable th2) {
                    try {
                        bufferedReader.close();
                    } catch (Throwable th3) {
                        th2.addSuppressed(th3);
                    }
                    throw th2;
                }
            } catch (Throwable th4) {
                inputStreamReader.close();
                throw th4;
            }
        } catch (Throwable th5) {
            if (inputStreamF != null) {
                try {
                    inputStreamF.close();
                } catch (Throwable th6) {
                    th5.addSuppressed(th6);
                }
            }
            throw th5;
        }
    }

    String k();

    String r();

    int statusCode();
}
