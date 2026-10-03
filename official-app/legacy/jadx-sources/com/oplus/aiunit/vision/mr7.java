package com.oplus.aiunit.vision;

import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0016\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006¨\u0006\t"}, d2 = {"Lcom/oplus/aiunit/vision/mr7;", "", "", "tag", "Ljava/lang/String;", "getTag", "()Ljava/lang/String;", "<init>", "(Ljava/lang/String;)V", "watchface_impl_release"}, k = 1, mv = {1, 8, 0})
public class mr7 {

    @NotNull
    private final transient String tag;

    public mr7(@NotNull String tag) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        this.tag = tag;
    }

    @NotNull
    public final String getTag() {
        return this.tag;
    }
}
