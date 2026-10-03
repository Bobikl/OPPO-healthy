package com.oplus.aiunit.vision;

import androidx.compose.runtime.internal.StabilityInferred;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes18.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\t\u001a\u00020\u0002\u0012\n\u0010\u000f\u001a\u0006\u0012\u0002\b\u00030\n¢\u0006\u0004\b\u0010\u0010\u0011R\"\u0010\t\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR&\u0010\u000f\u001a\u0006\u0012\u0002\b\u00030\n8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0005\u0010\u000b\u001a\u0004\b\u0003\u0010\f\"\u0004\b\r\u0010\u000e¨\u0006\u0012"}, d2 = {"Lcom/oplus/aiunit/vision/ugh;", "", "", "a", "Ljava/lang/String;", "b", "()Ljava/lang/String;", "setTitle", "(Ljava/lang/String;)V", "title", "Ljava/lang/Class;", "Ljava/lang/Class;", "()Ljava/lang/Class;", "setCls", "(Ljava/lang/Class;)V", "cls", "<init>", "(Ljava/lang/String;Ljava/lang/Class;)V", "sleep_release"}, k = 1, mv = {1, 8, 0})
public final class ugh {
    public static final int $stable = 8;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public String title;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public Class<?> cls;

    public ugh(@NotNull String title, @NotNull Class<?> cls) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(cls, "cls");
        this.title = title;
        this.cls = cls;
    }

    @NotNull
    public final Class<?> a() {
        return this.cls;
    }

    @NotNull
    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getTitle() {
        return this.title;
    }
}
