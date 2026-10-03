package com.oplus.aiunit.vision;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.text.TextUtils;
import androidx.annotation.DrawableRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.List;

/* JADX INFO: loaded from: classes13.dex */
public class dtf implements btf<Uri, Drawable> {
    public static final brd<Resources.Theme> THEME = brd.e("com.bumptech.glide.load.resource.bitmap.Downsampler.Theme");
    public final Context a;

    public dtf(Context context) {
        this.a = context.getApplicationContext();
    }

    @Override // com.oplus.aiunit.vision.btf
    @Nullable
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public usf<Drawable> a(@NonNull Uri uri, int i, int i2, @NonNull erd erdVar) {
        String authority = uri.getAuthority();
        if (!TextUtils.isEmpty(authority)) {
            Context contextD = d(uri, authority);
            int iG = g(contextD, uri);
            Resources.Theme theme = ((String) cpe.d(authority)).equals(this.a.getPackageName()) ? (Resources.Theme) erdVar.a(THEME) : null;
            return iuc.c(theme == null ? x46.b(this.a, contextD, iG) : x46.a(this.a, iG, theme));
        }
        throw new IllegalStateException("Package name for " + uri + " is null or empty");
    }

    @NonNull
    public final Context d(Uri uri, @NonNull String str) {
        if (str.equals(this.a.getPackageName())) {
            return this.a;
        }
        try {
            return this.a.createPackageContext(str, 0);
        } catch (PackageManager.NameNotFoundException e2) {
            if (str.contains(this.a.getPackageName())) {
                return this.a;
            }
            throw new IllegalArgumentException("Failed to obtain context or unrecognized Uri format for: " + uri, e2);
        }
    }

    @DrawableRes
    public final int e(Uri uri) {
        try {
            return Integer.parseInt(uri.getPathSegments().get(0));
        } catch (NumberFormatException e2) {
            throw new IllegalArgumentException("Unrecognized Uri format: " + uri, e2);
        }
    }

    @DrawableRes
    public final int f(Context context, Uri uri) {
        List<String> pathSegments = uri.getPathSegments();
        String authority = uri.getAuthority();
        String str = pathSegments.get(0);
        String str2 = pathSegments.get(1);
        int identifier = context.getResources().getIdentifier(str2, str, authority);
        if (identifier == 0) {
            identifier = Resources.getSystem().getIdentifier(str2, str, "android");
        }
        if (identifier != 0) {
            return identifier;
        }
        throw new IllegalArgumentException("Failed to find resource id for: " + uri);
    }

    @DrawableRes
    public final int g(Context context, Uri uri) {
        List<String> pathSegments = uri.getPathSegments();
        if (pathSegments.size() == 2) {
            return f(context, uri);
        }
        if (pathSegments.size() == 1) {
            return e(uri);
        }
        throw new IllegalArgumentException("Unrecognized Uri format: " + uri);
    }

    @Override // com.oplus.aiunit.vision.btf
    /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
    public boolean b(@NonNull Uri uri, @NonNull erd erdVar) {
        String scheme = uri.getScheme();
        return scheme != null && scheme.equals("android.resource");
    }
}
