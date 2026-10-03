package com.oplus.aiunit.vision;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;

/* JADX INFO: loaded from: classes17.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\t\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\t\u0010\nR$\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0003\u0010\u0005\"\u0004\b\u0006\u0010\u0007¨\u0006\u000b"}, d2 = {"Lcom/oplus/aiunit/vision/bni;", "", "", "a", "Ljava/lang/String;", "()Ljava/lang/String;", "b", "(Ljava/lang/String;)V", "initOafMessage", "<init>", "()V", "oafhost_release"}, k = 1, mv = {1, 8, 0})
public final class bni {

    @NotNull
    public static final bni INSTANCE = new bni();

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @Nullable
    public static String initOafMessage;

    @Nullable
    public final String a() {
        return initOafMessage;
    }

    public final void b(@Nullable String str) {
        initOafMessage = str;
    }
}
