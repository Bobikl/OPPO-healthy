package com.oplus.aiunit.vision;

import android.net.http.SslError;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J \u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H&J\u0018\u0010\f\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH&¨\u0006\r"}, d2 = {"Lcom/oplus/aiunit/vision/yp9;", "", "Lcom/oplus/aiunit/vision/pr9;", "fragment", "", "errorCode", "", iim.a.f, "", "b", "Landroid/net/http/SslError;", "error", "a", "lib_webpro_release"}, k = 1, mv = {1, 4, 0})
public interface yp9 {
    void a(@NotNull pr9 fragment, @NotNull SslError error);

    void b(@NotNull pr9 fragment, int errorCode, @NotNull String description);
}
