package com.oplus.aiunit.vision;

import okhttp3.MediaType;

/* JADX INFO: loaded from: classes6.dex */
public class ffd {
    public static gqf a(String str, MediaType mediaType) {
        try {
            return gqf.create(mediaType, str);
        } catch (NoSuchMethodError unused) {
            z6b.k("OkHttpCompat", "Fallback to OkHttp 4.x API for RequestBody.create (String)");
            try {
                return (gqf) gqf.class.getMethod("create", String.class, MediaType.class).invoke(null, str, mediaType);
            } catch (Exception e2) {
                z6b.p("OkHttpCompat", "Failed to create RequestBody with reflection", e2);
                throw new RuntimeException("Cannot create RequestBody with any known API", e2);
            }
        }
    }

    public static gqf b(byte[] bArr, MediaType mediaType) {
        try {
            return gqf.create(mediaType, bArr);
        } catch (NoSuchMethodError unused) {
            z6b.k("OkHttpCompat", "Fallback to OkHttp 4.x API for RequestBody.create (byte[])");
            try {
                return (gqf) gqf.class.getMethod("create", byte[].class, MediaType.class).invoke(null, bArr, mediaType);
            } catch (Exception e2) {
                z6b.p("OkHttpCompat", "Failed to create RequestBody with reflection", e2);
                throw new RuntimeException("Cannot create RequestBody with any known API", e2);
            }
        }
    }
}
