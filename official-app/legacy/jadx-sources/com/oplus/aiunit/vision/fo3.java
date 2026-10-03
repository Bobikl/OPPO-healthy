package com.oplus.aiunit.vision;

import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@dja(method = "report")
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\n\u0010\u000bJ \u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¨\u0006\f"}, d2 = {"Lcom/oplus/aiunit/vision/fo3;", "Lcom/oplus/aiunit/vision/nr9;", "Lcom/oplus/aiunit/vision/pr9;", "fragment", "Lcom/oplus/aiunit/vision/jja;", "apiArguments", "Lcom/oplus/aiunit/vision/kr9;", "callback", "", "execute", "<init>", "()V", "lib_webpro_jsbridge_release"}, k = 1, mv = {1, 4, 0})
public final class fo3 implements nr9 {
    @Override // com.oplus.aiunit.vision.nr9
    public void execute(@NotNull pr9 fragment, @NotNull jja apiArguments, @NotNull kr9 callback) {
        Intrinsics.checkNotNullParameter(fragment, "fragment");
        Intrinsics.checkNotNullParameter(apiArguments, "apiArguments");
        Intrinsics.checkNotNullParameter(callback, "callback");
        q7b.a("report", apiArguments.toString());
        kr9.b.d(callback, null, 1, null);
    }
}
