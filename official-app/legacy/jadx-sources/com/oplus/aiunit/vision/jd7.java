package com.oplus.aiunit.vision;

import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes16.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bR\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0003\u0010\u0005¨\u0006\t"}, d2 = {"Lcom/oplus/aiunit/vision/jd7;", "Lcom/oplus/aiunit/vision/zlk;", "", "a", "Ljava/lang/String;", "()Ljava/lang/String;", "path", "<init>", "(Ljava/lang/String;)V", "health_archives_release"}, k = 1, mv = {1, 8, 0})
public final class jd7 implements zlk {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final String path;

    public jd7(@NotNull String path) {
        Intrinsics.checkNotNullParameter(path, "path");
        this.path = path;
    }

    @NotNull
    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getPath() {
        return this.path;
    }
}
