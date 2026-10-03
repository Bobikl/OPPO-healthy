package com.heytap.store.util;

import android.graphics.Bitmap;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016J\u0012\u0010\u0004\u001a\u00020\u00032\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0016¨\u0006\u0007"}, d2 = {"Lcom/heytap/store/util/IProductLoadImgListener;", "", "onFailure", "", "onSuccess", "bitmap", "Landroid/graphics/Bitmap;", "util_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
public interface IProductLoadImgListener {

    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    public static final class DefaultImpls {
        public static void onFailure(@NotNull IProductLoadImgListener iProductLoadImgListener) {
        }

        public static void onSuccess(@NotNull IProductLoadImgListener iProductLoadImgListener, @Nullable Bitmap bitmap) {
        }
    }

    void onFailure();

    void onSuccess(@Nullable Bitmap bitmap);
}
