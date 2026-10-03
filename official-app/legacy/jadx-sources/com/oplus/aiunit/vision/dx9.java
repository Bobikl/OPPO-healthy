package com.oplus.aiunit.vision;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import androidx.annotation.Nullable;
import androidx.core.app.ActivityOptionsCompat;

/* JADX INFO: loaded from: classes16.dex */
public interface dx9 {
    void a(Activity activity, Uri uri, String str, @Nullable ActivityOptionsCompat activityOptionsCompat, @Nullable String str2);

    void b(dx9 dx9Var);

    void c(Activity activity, Uri uri, String str, int i, boolean z);

    boolean d(String str);

    void e(Uri uri, String str, Intent intent);
}
