package com.oplus.aiunit.vision;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.zip.Inflater;

/* JADX INFO: loaded from: classes15.dex */
public class a85 {
    public static final String TAG = "DeflateUtil";

    public static byte[] a(byte[] bArr) {
        StringBuilder sb;
        if (bArr == null) {
            return null;
        }
        Inflater inflater = new Inflater();
        inflater.reset();
        inflater.setInput(bArr);
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(bArr.length);
        try {
            try {
                byte[] bArr2 = new byte[1024];
                while (!inflater.finished()) {
                    byteArrayOutputStream.write(bArr2, 0, inflater.inflate(bArr2));
                }
                bArr = byteArrayOutputStream.toByteArray();
                try {
                    byteArrayOutputStream.close();
                } catch (IOException e2) {
                    e = e2;
                    sb = new StringBuilder();
                    sb.append("[decompress] --> finally, ");
                    sb.append(e.getMessage());
                    a7b.b(TAG, sb.toString());
                }
            } catch (Exception e3) {
                a7b.b(TAG, "[decompress] --> " + e3.getMessage());
                try {
                    byteArrayOutputStream.close();
                } catch (IOException e4) {
                    e = e4;
                    sb = new StringBuilder();
                    sb.append("[decompress] --> finally, ");
                    sb.append(e.getMessage());
                    a7b.b(TAG, sb.toString());
                }
            }
            inflater.end();
            return bArr;
        } catch (Throwable th) {
            try {
                byteArrayOutputStream.close();
            } catch (IOException e5) {
                a7b.b(TAG, "[decompress] --> finally, " + e5.getMessage());
            }
            throw th;
        }
    }
}
