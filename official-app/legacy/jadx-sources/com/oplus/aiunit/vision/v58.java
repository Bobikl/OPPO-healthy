package com.oplus.aiunit.vision;

import android.text.TextUtils;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes13.dex */
public class v58 {
    public static final Pattern d = Pattern.compile("[R,r]ange:[ ]?bytes=(\\d*)-");

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final Pattern f17717e = Pattern.compile("GET /(.*) HTTP");
    public final String a;
    public final long b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f17718c;

    public v58(String str) {
        voe.d(str);
        long jA = a(str);
        this.b = Math.max(0L, jA);
        this.f17718c = jA >= 0;
        this.a = b(str);
    }

    public static v58 c(InputStream inputStream) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream, "UTF-8"));
        StringBuilder sb = new StringBuilder();
        while (true) {
            String line = bufferedReader.readLine();
            if (TextUtils.isEmpty(line)) {
                return new v58(sb.toString());
            }
            sb.append(line);
            sb.append('\n');
        }
    }

    public final long a(String str) {
        Matcher matcher = d.matcher(str);
        if (matcher.find()) {
            return Long.parseLong(matcher.group(1));
        }
        return -1L;
    }

    public final String b(String str) {
        Matcher matcher = f17717e.matcher(str);
        if (matcher.find()) {
            return matcher.group(1);
        }
        throw new IllegalArgumentException("Invalid request `" + str + "`: url not found!");
    }

    public String toString() {
        return "GetRequest{rangeOffset=" + this.b + ", partial=" + this.f17718c + ", uri='" + this.a + "'}";
    }
}
