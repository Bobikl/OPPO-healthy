package com.oplus.aiunit.vision;

import com.heytap.health.watch.netnumber.callinterception.AbsCallInterceptionHandlerKt;
import io.protostuff.MapSchema;
import java.io.IOException;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H&J\u0018\u0010\n\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\bH&¨\u0006\u000b"}, d2 = {"Lcom/oplus/aiunit/vision/zs2;", "", "Lcom/oplus/aiunit/vision/wr2;", "call", "Ljava/io/IOException;", MapSchema.FIELD_NAME_ENTRY, "", "onFailure", "Lcom/oplus/aiunit/vision/ytf;", AbsCallInterceptionHandlerKt.GSON_KEY_RESPONSE, "onResponse", "okhttp4_extension_release"}, k = 1, mv = {1, 4, 0})
public interface zs2 {
    void onFailure(@NotNull wr2 call, @NotNull IOException e2);

    void onResponse(@NotNull wr2 call, @NotNull ytf response) throws IOException;
}
