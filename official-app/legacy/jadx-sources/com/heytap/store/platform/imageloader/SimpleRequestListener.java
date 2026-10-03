package com.heytap.store.platform.imageloader;

import android.graphics.Bitmap;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0016\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0012\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0016J\u0012\u0010\u0007\u001a\u00020\u00042\b\u0010\b\u001a\u0004\u0018\u00010\tH\u0016¨\u0006\n"}, d2 = {"Lcom/heytap/store/platform/imageloader/SimpleRequestListener;", "Lcom/heytap/store/platform/imageloader/RequestListener;", "()V", "onFailure", "", "throwable", "", "onReady", "resource", "Landroid/graphics/Bitmap;", "ImageLoader_release"}, k = 1, mv = {1, 4, 0})
public class SimpleRequestListener implements RequestListener {
    @Override // com.heytap.store.platform.imageloader.RequestListener
    public void onFailure(@Nullable Throwable throwable) {
    }

    @Override // com.heytap.store.platform.imageloader.RequestListener
    public void onReady(@Nullable Bitmap resource) {
    }
}
