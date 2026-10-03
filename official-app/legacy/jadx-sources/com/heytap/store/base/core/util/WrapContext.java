package com.heytap.store.base.core.util;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewManager;
import androidx.exifinterface.media.ExifInterface;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00012\u00020\u0002J\u0010\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0016J\u0018\u0010\n\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\fH\u0016R\u0012\u0010\u0003\u001a\u00028\u0000X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\r"}, d2 = {"Lcom/heytap/store/base/core/util/WrapContext;", ExifInterface.GPS_DIRECTION_TRUE, "Landroid/view/ViewManager;", "owner", "getOwner", "()Ljava/lang/Object;", "removeView", "", "view", "Landroid/view/View;", "updateViewLayout", "params", "Landroid/view/ViewGroup$LayoutParams;", "Core_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
public interface WrapContext<T> extends ViewManager {

    @Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
    public static final class DefaultImpls {
        public static <T> void removeView(@NotNull WrapContext<? extends T> wrapContext, @NotNull View view) {
            Intrinsics.checkNotNullParameter(wrapContext, "this");
            Intrinsics.checkNotNullParameter(view, "view");
            throw new UnsupportedOperationException();
        }

        public static <T> void updateViewLayout(@NotNull WrapContext<? extends T> wrapContext, @NotNull View view, @NotNull ViewGroup.LayoutParams params) {
            Intrinsics.checkNotNullParameter(wrapContext, "this");
            Intrinsics.checkNotNullParameter(view, "view");
            Intrinsics.checkNotNullParameter(params, "params");
            throw new UnsupportedOperationException();
        }
    }

    T getOwner();

    @Override // android.view.ViewManager
    void removeView(@NotNull View view);

    @Override // android.view.ViewManager
    void updateViewLayout(@NotNull View view, @NotNull ViewGroup.LayoutParams params);
}
