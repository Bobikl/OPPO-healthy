package com.oplus.aiunit.vision;

import android.text.TextUtils;
import android.util.Base64;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.zip.GZIPInputStream;
import java.util.zip.GZIPOutputStream;

/* JADX INFO: loaded from: classes15.dex */
public class w7m {
    public static final String SPORT_DATA_START = "H4sIAAAAAA";

    public static String a(String str) throws IOException {
        if (TextUtils.isEmpty(str)) {
            return str;
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(byteArrayOutputStream);
        gZIPOutputStream.write(str.getBytes(StandardCharsets.UTF_8));
        gZIPOutputStream.close();
        return Base64.encodeToString(byteArrayOutputStream.toByteArray(), 2);
    }

    public static String b(String str) {
        return (TextUtils.isEmpty(str) || str.length() < 13) ? str : str.substring(0, 13);
    }

    public static String c(String str) throws IOException {
        if (TextUtils.isEmpty(str)) {
            return str;
        }
        byte[] bArrDecode = Base64.decode(str.substring(str.lastIndexOf(b(str))), 2);
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        GZIPInputStream gZIPInputStream = new GZIPInputStream(new ByteArrayInputStream(bArrDecode));
        byte[] bArr = new byte[256];
        while (true) {
            int i = gZIPInputStream.read(bArr);
            if (i < 0) {
                gZIPInputStream.close();
                return byteArrayOutputStream.toString("UTF-8");
            }
            byteArrayOutputStream.write(bArr, 0, i);
        }
    }
}
