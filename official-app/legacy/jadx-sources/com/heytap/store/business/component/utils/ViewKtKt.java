package com.heytap.store.business.component.utils;

import android.graphics.Outline;
import android.view.View;
import android.view.ViewOutlineProvider;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0003\u001a\u0016\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\u0003\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0080T¢\u0006\u0002\n\u0000\"(\u0010\u0004\u001a\u00020\u0003*\u00020\u00052\u0006\u0010\u0002\u001a\u00020\u00038F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\t¨\u0006\u000e"}, d2 = {"NO_GETTER", "", "value", "", "rectRadius", "Landroid/view/View;", "getRectRadius", "(Landroid/view/View;)F", "setRectRadius", "(Landroid/view/View;F)V", "addOutlineProvider", "", "view", "radius", "widget_release"}, k = 2, mv = {1, 6, 0}, xi = 48)
public final class ViewKtKt {

    @NotNull
    public static final String NO_GETTER = "Getter not available";

    public static final void addOutlineProvider(@NotNull View view, final float f) {
        Intrinsics.checkNotNullParameter(view, "view");
        view.setOutlineProvider(new ViewOutlineProvider() { // from class: com.heytap.store.business.component.utils.ViewKtKt.addOutlineProvider.1
            @Override // android.view.ViewOutlineProvider
            public void getOutline(@NotNull View view2, @NotNull Outline outline) {
                Intrinsics.checkNotNullParameter(view2, "view");
                Intrinsics.checkNotNullParameter(outline, "outline");
                outline.setRoundRect(0, 0, view2.getWidth(), view2.getHeight(), f);
                view2.setClipToOutline(true);
            }
        });
    }

    public static final float getRectRadius(@NotNull View view) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        throw new IllegalStateException(NO_GETTER.toString());
    }

    public static final void setRectRadius(@NotNull View view, final float f) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        view.setOutlineProvider(new ViewOutlineProvider() { // from class: com.heytap.store.business.component.utils.ViewKtKt$rectRadius$1
            @Override // android.view.ViewOutlineProvider
            public void getOutline(@NotNull View view2, @NotNull Outline outline) {
                Intrinsics.checkNotNullParameter(view2, "view");
                Intrinsics.checkNotNullParameter(outline, "outline");
                outline.setRoundRect(0, 0, view2.getWidth(), view2.getHeight(), f);
            }
        });
        view.setClipToOutline(true);
    }
}
