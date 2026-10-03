package com.oplus.aiunit.vision;

import android.content.ContentResolver;
import android.content.res.AssetFileDescriptor;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import androidx.annotation.NonNull;
import com.heytap.webview.extension.protocol.Const;
import java.io.InputStream;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* JADX INFO: loaded from: classes13.dex */
public class vlk<Data> implements n2c<Uri, Data> {
    public static final Set<String> b = Collections.unmodifiableSet(new HashSet(Arrays.asList(Const.Scheme.SCHEME_FILE, "content", "android.resource")));
    public final c<Data> a;

    public static final class a implements o2c<Uri, AssetFileDescriptor>, c<AssetFileDescriptor> {
        public final ContentResolver a;

        public a(ContentResolver contentResolver) {
            this.a = contentResolver;
        }

        @Override // com.oplus.aiunit.vision.vlk.c
        public ft4<AssetFileDescriptor> a(Uri uri) {
            return new zh0(this.a, uri);
        }

        @Override // com.oplus.aiunit.vision.o2c
        public void c() {
        }

        @Override // com.oplus.aiunit.vision.o2c
        public n2c<Uri, AssetFileDescriptor> d(p7c p7cVar) {
            return new vlk(this);
        }
    }

    public static class b implements o2c<Uri, ParcelFileDescriptor>, c<ParcelFileDescriptor> {
        public final ContentResolver a;

        public b(ContentResolver contentResolver) {
            this.a = contentResolver;
        }

        @Override // com.oplus.aiunit.vision.vlk.c
        public ft4<ParcelFileDescriptor> a(Uri uri) {
            return new bb7(this.a, uri);
        }

        @Override // com.oplus.aiunit.vision.o2c
        public void c() {
        }

        @Override // com.oplus.aiunit.vision.o2c
        @NonNull
        public n2c<Uri, ParcelFileDescriptor> d(p7c p7cVar) {
            return new vlk(this);
        }
    }

    public interface c<Data> {
        ft4<Data> a(Uri uri);
    }

    public static class d implements o2c<Uri, InputStream>, c<InputStream> {
        public final ContentResolver a;

        public d(ContentResolver contentResolver) {
            this.a = contentResolver;
        }

        @Override // com.oplus.aiunit.vision.vlk.c
        public ft4<InputStream> a(Uri uri) {
            return new cwi(this.a, uri);
        }

        @Override // com.oplus.aiunit.vision.o2c
        public void c() {
        }

        @Override // com.oplus.aiunit.vision.o2c
        @NonNull
        public n2c<Uri, InputStream> d(p7c p7cVar) {
            return new vlk(this);
        }
    }

    public vlk(c<Data> cVar) {
        this.a = cVar;
    }

    @Override // com.oplus.aiunit.vision.n2c
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public n2c.a<Data> a(@NonNull Uri uri, int i, int i2, @NonNull erd erdVar) {
        return new n2c.a<>(new ebd(uri), this.a.a(uri));
    }

    @Override // com.oplus.aiunit.vision.n2c
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public boolean b(@NonNull Uri uri) {
        return b.contains(uri.getScheme());
    }
}
