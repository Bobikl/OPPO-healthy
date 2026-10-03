package com.oplus.aiunit.vision;

import android.net.Uri;
import com.oplus.smartenginehelper.ParserTag;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes16.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bR\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0003\u0010\u0005¨\u0006\t"}, d2 = {"Lcom/oplus/aiunit/vision/t84;", "Lcom/oplus/aiunit/vision/zlk;", "Landroid/net/Uri;", "a", "Landroid/net/Uri;", "()Landroid/net/Uri;", ParserTag.TAG_URI, "<init>", "(Landroid/net/Uri;)V", "health_archives_release"}, k = 1, mv = {1, 8, 0})
public final class t84 implements zlk {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final Uri uri;

    public t84(@NotNull Uri uri) {
        Intrinsics.checkNotNullParameter(uri, "uri");
        this.uri = uri;
    }

    @NotNull
    /* JADX INFO: renamed from: a, reason: from getter */
    public final Uri getUri() {
        return this.uri;
    }
}
