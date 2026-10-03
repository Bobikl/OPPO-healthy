package com.oplus.aiunit.vision;

import androidx.exifinterface.media.ExifInterface;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Lazy;
import p010kotlin.Metadata;
import p010kotlin.jvm.functions.Function0;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a$\u0010\u0004\u001a\n\u0012\u0006\u0012\u0004\u0018\u00018\u00000\u0003\"\u0004\b\u0000\u0010\u00002\u000e\u0010\u0002\u001a\n\u0012\u0006\u0012\u0004\u0018\u00018\u00000\u0001¨\u0006\u0005"}, d2 = {ExifInterface.GPS_DIRECTION_TRUE, "Lkotlin/Function0;", "initializer", "Lkotlin/Lazy;", "a", "lib_ui_release"}, k = 2, mv = {1, 8, 0})
public final class a4i {
    @NotNull
    public static final <T> Lazy<T> a(@NotNull Function0<? extends T> initializer) {
        Intrinsics.checkNotNullParameter(initializer, "initializer");
        return new eva(initializer);
    }
}
