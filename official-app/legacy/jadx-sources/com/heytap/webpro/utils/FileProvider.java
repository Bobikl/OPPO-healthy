package com.heytap.webpro.utils;

import android.content.Context;
import com.oplus.aiunit.vision.d94;
import p010kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0016¨\u0006\u0005"}, d2 = {"Lcom/heytap/webpro/utils/FileProvider;", "Landroidx/core/content/FileProvider;", "()V", "onCreate", "", "lib_webpro_release"}, k = 1, mv = {1, 4, 0})
public final class FileProvider extends androidx.core.content.FileProvider {
    @Override // androidx.core.content.FileProvider, android.content.ContentProvider
    public boolean onCreate() {
        Context context = getContext();
        if (context != null) {
            d94.c(context);
        }
        return super.onCreate();
    }
}
