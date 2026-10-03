package com.oplus.aiunit.vision;

import android.net.http.SslError;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\r\u0010\u000eJ \u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016J\u0018\u0010\f\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016¨\u0006\u000f"}, d2 = {"Lcom/oplus/aiunit/vision/n45;", "Lcom/oplus/aiunit/vision/yp9;", "Lcom/oplus/aiunit/vision/pr9;", "fragment", "", "errorCode", "", iim.a.f, "", "b", "Landroid/net/http/SslError;", "error", "a", "<init>", "()V", "lib_webpro_release"}, k = 1, mv = {1, 4, 0})
public final class n45 implements yp9 {
    @Override // com.oplus.aiunit.vision.yp9
    public void a(@NotNull pr9 fragment, @NotNull SslError error) {
        Intrinsics.checkNotNullParameter(fragment, "fragment");
        Intrinsics.checkNotNullParameter(error, "error");
        q7b.a("DefaultErrorHandler", error.toString());
    }

    @Override // com.oplus.aiunit.vision.yp9
    public void b(@NotNull pr9 fragment, int errorCode, @NotNull String description) {
        Intrinsics.checkNotNullParameter(fragment, "fragment");
        Intrinsics.checkNotNullParameter(description, "description");
        q7b.a("DefaultErrorHandler", "error-code: " + errorCode + ", description: " + description);
    }
}
