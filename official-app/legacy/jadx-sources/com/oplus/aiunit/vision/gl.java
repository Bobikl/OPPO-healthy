package com.oplus.aiunit.vision;

import android.content.ContentProviderClient;
import android.net.Uri;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes19.dex */
public final class gl {

    @Nullable
    public final ContentProviderClient a;

    @NonNull
    public final Uri b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NonNull
    public final String f11804c;

    public gl(@Nullable ContentProviderClient contentProviderClient, @NonNull Uri uri, @NonNull String str) {
        this.a = contentProviderClient;
        this.b = uri;
        this.f11804c = str;
    }

    @Nullable
    public ContentProviderClient a() {
        return this.a;
    }

    @NonNull
    public Uri b() {
        return this.b;
    }
}
