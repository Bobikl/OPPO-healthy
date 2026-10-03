package com.oplus.aiunit.vision;

import android.graphics.Bitmap;
import coil.size.Size;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.coroutines.Continuation;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J#\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H¦@ø\u0001\u0000¢\u0006\u0004\b\u0006\u0010\u0007R\u0014\u0010\u000b\u001a\u00020\b8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\nø\u0001\u0001\u0082\u0002\n\n\u0002\b\u0019\n\u0004\b!0\u0001¨\u0006\fÀ\u0006\u0001"}, d2 = {"Lcom/oplus/aiunit/vision/y9k;", "", "Landroid/graphics/Bitmap;", "input", "Lcoil/size/e;", "size", "a", "(Landroid/graphics/Bitmap;Lcoil/size/e;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "getCacheKey", "()Ljava/lang/String;", "cacheKey", "coil-base_release"}, k = 1, mv = {1, 9, 0})
public interface y9k {
    @Nullable
    Object a(@NotNull Bitmap bitmap, @NotNull Size size, @NotNull Continuation<? super Bitmap> continuation);

    @NotNull
    String getCacheKey();
}
