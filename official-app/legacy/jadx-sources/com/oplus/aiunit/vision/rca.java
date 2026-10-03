package com.oplus.aiunit.vision;

import android.content.Intent;
import android.net.Uri;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.DefaultConstructorMarker;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B#\u0012\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\r\u0010\u000eR\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007R\u0019\u0010\f\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\u0006\u0010\n\u001a\u0004\b\u0004\u0010\u000b¨\u0006\u000f"}, d2 = {"Lcom/oplus/aiunit/vision/rca;", "", "", "Landroid/content/Intent;", "a", "[Landroid/content/Intent;", "b", "()[Landroid/content/Intent;", "intents", "Landroid/net/Uri;", "Landroid/net/Uri;", "()Landroid/net/Uri;", "imageUri", "<init>", "([Landroid/content/Intent;Landroid/net/Uri;)V", "lib_webpro_release"}, k = 1, mv = {1, 4, 0})
public final class rca {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final Intent[] intents;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @Nullable
    public final Uri imageUri;

    public rca(@NotNull Intent[] intents, @Nullable Uri uri) {
        Intrinsics.checkNotNullParameter(intents, "intents");
        this.intents = intents;
        this.imageUri = uri;
    }

    @Nullable
    /* JADX INFO: renamed from: a, reason: from getter */
    public final Uri getImageUri() {
        return this.imageUri;
    }

    @NotNull
    /* JADX INFO: renamed from: b, reason: from getter */
    public final Intent[] getIntents() {
        return this.intents;
    }

    public /* synthetic */ rca(Intent[] intentArr, Uri uri, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? new Intent[0] : intentArr, (i & 2) != 0 ? null : uri);
    }
}
