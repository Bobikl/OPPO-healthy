package com.oplus.aiunit.vision;

import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.net.Uri;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.io.InputStream;
import java.util.List;

/* JADX INFO: loaded from: classes13.dex */
public final class otf<DataT> implements n2c<Uri, DataT> {
    public final Context a;
    public final n2c<Integer, DataT> b;

    public static final class a implements o2c<Uri, AssetFileDescriptor> {
        public final Context a;

        public a(Context context) {
            this.a = context;
        }

        @Override // com.oplus.aiunit.vision.o2c
        public void c() {
        }

        @Override // com.oplus.aiunit.vision.o2c
        @NonNull
        public n2c<Uri, AssetFileDescriptor> d(@NonNull p7c p7cVar) {
            return new otf(this.a, p7cVar.d(Integer.class, AssetFileDescriptor.class));
        }
    }

    public static final class b implements o2c<Uri, InputStream> {
        public final Context a;

        public b(Context context) {
            this.a = context;
        }

        @Override // com.oplus.aiunit.vision.o2c
        public void c() {
        }

        @Override // com.oplus.aiunit.vision.o2c
        @NonNull
        public n2c<Uri, InputStream> d(@NonNull p7c p7cVar) {
            return new otf(this.a, p7cVar.d(Integer.class, InputStream.class));
        }
    }

    public otf(Context context, n2c<Integer, DataT> n2cVar) {
        this.a = context.getApplicationContext();
        this.b = n2cVar;
    }

    public static o2c<Uri, AssetFileDescriptor> e(Context context) {
        return new a(context);
    }

    public static o2c<Uri, InputStream> f(Context context) {
        return new b(context);
    }

    @Override // com.oplus.aiunit.vision.n2c
    @Nullable
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public n2c.a<DataT> a(@NonNull Uri uri, int i, int i2, @NonNull erd erdVar) {
        List<String> pathSegments = uri.getPathSegments();
        if (pathSegments.size() == 1) {
            return g(uri, i, i2, erdVar);
        }
        if (pathSegments.size() == 2) {
            return h(uri, i, i2, erdVar);
        }
        if (!Log.isLoggable("ResourceUriLoader", 5)) {
            return null;
        }
        Log.w("ResourceUriLoader", "Failed to parse resource uri: " + uri);
        return null;
    }

    @Override // com.oplus.aiunit.vision.n2c
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public boolean b(@NonNull Uri uri) {
        return "android.resource".equals(uri.getScheme()) && this.a.getPackageName().equals(uri.getAuthority());
    }

    @Nullable
    public final n2c.a<DataT> g(@NonNull Uri uri, int i, int i2, @NonNull erd erdVar) {
        try {
            int i3 = Integer.parseInt(uri.getPathSegments().get(0));
            if (i3 != 0) {
                return this.b.a(Integer.valueOf(i3), i, i2, erdVar);
            }
            if (Log.isLoggable("ResourceUriLoader", 5)) {
                Log.w("ResourceUriLoader", "Failed to parse a valid non-0 resource id from: " + uri);
            }
            return null;
        } catch (NumberFormatException e2) {
            if (Log.isLoggable("ResourceUriLoader", 5)) {
                Log.w("ResourceUriLoader", "Failed to parse resource id from: " + uri, e2);
            }
            return null;
        }
    }

    @Nullable
    public final n2c.a<DataT> h(@NonNull Uri uri, int i, int i2, @NonNull erd erdVar) {
        List<String> pathSegments = uri.getPathSegments();
        int identifier = this.a.getResources().getIdentifier(pathSegments.get(1), pathSegments.get(0), this.a.getPackageName());
        if (identifier != 0) {
            return this.b.a(Integer.valueOf(identifier), i, i2, erdVar);
        }
        if (!Log.isLoggable("ResourceUriLoader", 5)) {
            return null;
        }
        Log.w("ResourceUriLoader", "Failed to find resource id for: " + uri);
        return null;
    }
}
