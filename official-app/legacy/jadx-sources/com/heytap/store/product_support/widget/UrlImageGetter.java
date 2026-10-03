package com.heytap.store.product_support.widget;

import android.content.Context;
import android.graphics.drawable.Drawable;
import com.bumptech.glide.a;
import com.oplus.aiunit.vision.eg4;
import com.oplus.aiunit.vision.oak;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u000bB\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0016\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\f"}, d2 = {"Lcom/heytap/store/product_support/widget/UrlImageGetter;", "", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "getDrawable", "", "url", "", "onDrawableLoadListener", "Lcom/heytap/store/product_support/widget/UrlImageGetter$OnDrawableLoadListener;", "OnDrawableLoadListener", "product-support_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
final class UrlImageGetter {

    @NotNull
    private final Context context;

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&¨\u0006\u0006À\u0006\u0003"}, d2 = {"Lcom/heytap/store/product_support/widget/UrlImageGetter$OnDrawableLoadListener;", "", "onReady", "", "resource", "Landroid/graphics/drawable/Drawable;", "product-support_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public interface OnDrawableLoadListener {
        void onReady(@NotNull Drawable resource);
    }

    public UrlImageGetter(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.context = context;
    }

    public final void getDrawable(@NotNull String url, @NotNull final OnDrawableLoadListener onDrawableLoadListener) {
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullParameter(onDrawableLoadListener, "onDrawableLoadListener");
        a.v(this.context).q(url).N0(new eg4<Drawable>() { // from class: com.heytap.store.product_support.widget.UrlImageGetter.getDrawable.1
            @Override // com.oplus.aiunit.vision.boj
            public void onLoadCleared(@Nullable Drawable placeholder) {
            }

            @Override // com.oplus.aiunit.vision.boj
            public /* bridge */ /* synthetic */ void onResourceReady(Object obj, oak oakVar) {
                onResourceReady((Drawable) obj, (oak<? super Drawable>) oakVar);
            }

            public void onResourceReady(@NotNull Drawable resource, @Nullable oak<? super Drawable> transition) {
                Intrinsics.checkNotNullParameter(resource, "resource");
                onDrawableLoadListener.onReady(resource);
            }
        });
    }
}
