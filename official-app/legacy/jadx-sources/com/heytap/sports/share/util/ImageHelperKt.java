package com.heytap.sports.share.util;

import com.heytap.health.base.utils.AsyncResultCoroutine;
import java.io.File;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\u001a\u0014\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0001\u001a\u00020\u0000¨\u0006\u0005"}, d2 = {"Ljava/io/File;", "filer", "Lcom/heytap/health/base/utils/AsyncResultCoroutine;", "", "a", "sport_impl_release"}, k = 2, mv = {1, 8, 0})
public final class ImageHelperKt {
    @NotNull
    public static final AsyncResultCoroutine<Boolean> a(@NotNull File filer) {
        Intrinsics.checkNotNullParameter(filer, "filer");
        return new AsyncResultCoroutine<>(null, new ImageHelperKt$uploadImageReview$1(filer, null), 1, null);
    }
}
