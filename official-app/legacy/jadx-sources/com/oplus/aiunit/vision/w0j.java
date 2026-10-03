package com.oplus.aiunit.vision;

import android.content.res.AssetFileDescriptor;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.io.File;
import java.io.InputStream;

/* JADX INFO: loaded from: classes13.dex */
public class w0j<Data> implements n2c<String, Data> {
    public final n2c<Uri, Data> a;

    public static final class a implements o2c<String, AssetFileDescriptor> {
        @Override // com.oplus.aiunit.vision.o2c
        public void c() {
        }

        @Override // com.oplus.aiunit.vision.o2c
        public n2c<String, AssetFileDescriptor> d(@NonNull p7c p7cVar) {
            return new w0j(p7cVar.d(Uri.class, AssetFileDescriptor.class));
        }
    }

    public static class b implements o2c<String, ParcelFileDescriptor> {
        @Override // com.oplus.aiunit.vision.o2c
        public void c() {
        }

        @Override // com.oplus.aiunit.vision.o2c
        @NonNull
        public n2c<String, ParcelFileDescriptor> d(@NonNull p7c p7cVar) {
            return new w0j(p7cVar.d(Uri.class, ParcelFileDescriptor.class));
        }
    }

    public static class c implements o2c<String, InputStream> {
        @Override // com.oplus.aiunit.vision.o2c
        public void c() {
        }

        @Override // com.oplus.aiunit.vision.o2c
        @NonNull
        public n2c<String, InputStream> d(@NonNull p7c p7cVar) {
            return new w0j(p7cVar.d(Uri.class, InputStream.class));
        }
    }

    public w0j(n2c<Uri, Data> n2cVar) {
        this.a = n2cVar;
    }

    @Nullable
    public static Uri e(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        if (str.charAt(0) == '/') {
            return f(str);
        }
        Uri uri = Uri.parse(str);
        return uri.getScheme() == null ? f(str) : uri;
    }

    public static Uri f(String str) {
        return Uri.fromFile(new File(str));
    }

    @Override // com.oplus.aiunit.vision.n2c
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public n2c.a<Data> a(@NonNull String str, int i, int i2, @NonNull erd erdVar) {
        Uri uriE = e(str);
        if (uriE == null || !this.a.b(uriE)) {
            return null;
        }
        return this.a.a(uriE, i, i2, erdVar);
    }

    @Override // com.oplus.aiunit.vision.n2c
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public boolean b(@NonNull String str) {
        return true;
    }
}
