package com.heytap.webview.extension.utils;

import android.content.Intent;
import android.net.Uri;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.DefaultConstructorMarker;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u00002\u00020\u0001B!\u0012\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\u0007R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0019\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\n\n\u0002\u0010\f\u001a\u0004\b\n\u0010\u000b¨\u0006\r"}, d2 = {"Lcom/heytap/webview/extension/utils/IntentInfo;", "", "intents", "", "Landroid/content/Intent;", "imageUri", "Landroid/net/Uri;", "([Landroid/content/Intent;Landroid/net/Uri;)V", "getImageUri", "()Landroid/net/Uri;", "getIntents", "()[Landroid/content/Intent;", "[Landroid/content/Intent;", "lib_webext_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class IntentInfo {

    @Nullable
    private final Uri imageUri;

    @NotNull
    private final Intent[] intents;

    /* JADX WARN: Multi-variable type inference failed */
    public IntentInfo() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    @Nullable
    public final Uri getImageUri() {
        return this.imageUri;
    }

    @NotNull
    public final Intent[] getIntents() {
        return this.intents;
    }

    public IntentInfo(@NotNull Intent[] intents, @Nullable Uri uri) {
        Intrinsics.checkNotNullParameter(intents, "intents");
        this.intents = intents;
        this.imageUri = uri;
    }

    public /* synthetic */ IntentInfo(Intent[] intentArr, Uri uri, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? new Intent[0] : intentArr, (i & 2) != 0 ? null : uri);
    }
}
