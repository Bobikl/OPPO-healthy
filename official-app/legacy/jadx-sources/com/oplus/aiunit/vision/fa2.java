package com.oplus.aiunit.vision;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J+\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0012\u0010\u0006\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00050\u0004\"\u00020\u0005H&¢\u0006\u0004\b\b\u0010\tJ-\u0010\r\u001a\u0004\u0018\u00010\f2\u0006\u0010\n\u001a\u00020\u00022\u0012\u0010\u000b\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00050\u0004\"\u00020\u0005H&¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lcom/oplus/aiunit/vision/fa2;", "", "", "topic", "", "", "parts", "", "a", "(Ljava/lang/String;[[B)V", "url", "args", "Lcom/oplus/aiunit/vision/u92$c;", "b", "(Ljava/lang/String;[[B)Lcom/oplus/aiunit/vision/u92$c;", "speechEngine_release"}, k = 1, mv = {1, 5, 1})
public interface fa2 {
    void a(@NotNull String topic, @NotNull byte[]... parts) throws Exception;

    @Nullable
    u92.c b(@NotNull String url, @NotNull byte[]... args) throws Exception;
}
