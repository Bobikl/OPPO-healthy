package com.heytap.store.platform.imageloader;

import android.graphics.Bitmap;
import android.util.Log;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.oplus.aiunit.vision.j4h;
import com.oplus.aiunit.vision.oak;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0017\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\u0012\u0010\u0013J\"\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0010\u0010\u0005\u001a\f\u0012\u0006\b\u0000\u0012\u00020\u0002\u0018\u00010\u0004H\u0016R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\nR\"\u0010\f\u001a\u00020\u000b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011¨\u0006\u0014"}, d2 = {"Lcom/heytap/store/platform/imageloader/WrapViewTarget;", "Lcom/oplus/aiunit/vision/j4h;", "Landroid/graphics/Bitmap;", "resource", "Lcom/oplus/aiunit/vision/oak;", "transition", "", "onResourceReady", "", "fixedWidth", "Z", "Landroid/widget/ImageView;", "targetView", "Landroid/widget/ImageView;", "getTargetView", "()Landroid/widget/ImageView;", "setTargetView", "(Landroid/widget/ImageView;)V", "<init>", "(ZLandroid/widget/ImageView;)V", "ImageLoader_release"}, k = 1, mv = {1, 4, 0})
public final class WrapViewTarget extends j4h<Bitmap> {
    private final boolean fixedWidth;

    @NotNull
    private ImageView targetView;

    public WrapViewTarget(boolean z, @NotNull ImageView targetView) {
        Intrinsics.checkNotNullParameter(targetView, "targetView");
        this.fixedWidth = z;
        this.targetView = targetView;
    }

    @NotNull
    public final ImageView getTargetView() {
        return this.targetView;
    }

    @Override // com.oplus.aiunit.vision.boj
    public /* bridge */ /* synthetic */ void onResourceReady(Object obj, oak oakVar) {
        onResourceReady((Bitmap) obj, (oak<? super Bitmap>) oakVar);
    }

    public final void setTargetView(@NotNull ImageView imageView) {
        Intrinsics.checkNotNullParameter(imageView, "<set-?>");
        this.targetView = imageView;
    }

    public void onResourceReady(@NotNull Bitmap resource, @Nullable oak<? super Bitmap> transition) {
        Intrinsics.checkNotNullParameter(resource, "resource");
        int width = resource.getWidth();
        int height = resource.getHeight();
        Log.d("WrapViewTarget", "width:" + width + ",height:" + height);
        if (this.fixedWidth) {
            int width2 = (int) (height * ((this.targetView.getWidth() * 0.1f) / (width * 0.1f)));
            ViewGroup.LayoutParams layoutParams = this.targetView.getLayoutParams();
            layoutParams.height = width2;
            this.targetView.setLayoutParams(layoutParams);
            return;
        }
        int height2 = (int) (width * ((this.targetView.getHeight() * 0.1f) / (height * 0.1f)));
        ViewGroup.LayoutParams layoutParams2 = this.targetView.getLayoutParams();
        layoutParams2.width = height2;
        this.targetView.setLayoutParams(layoutParams2);
    }
}
