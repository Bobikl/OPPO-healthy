package com.heytap.store.homemodule.databinding;

import androidx.appcompat.widget.AppCompatImageView;
import androidx.databinding.BindingAdapter;
import com.heytap.store.platform.imageloader.ImageLoader;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.JvmStatic;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u001a\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\bH\u0007¨\u0006\t"}, d2 = {"Lcom/heytap/store/homemodule/databinding/ViewKtx;", "", "()V", "loadImg", "", "imageView", "Landroidx/appcompat/widget/AppCompatImageView;", "url", "", "com.heytap.store.business.home-impl"}, k = 1, mv = {1, 6, 0}, xi = 48)
public final class ViewKtx {

    @NotNull
    public static final ViewKtx INSTANCE = new ViewKtx();

    private ViewKtx() {
    }

    @BindingAdapter({"imageUrl"})
    @JvmStatic
    public static final void loadImg(@NotNull AppCompatImageView imageView, @Nullable String url) {
        Intrinsics.checkNotNullParameter(imageView, "imageView");
        if (url == null) {
            return;
        }
        ImageLoader.load(url, imageView);
    }
}
