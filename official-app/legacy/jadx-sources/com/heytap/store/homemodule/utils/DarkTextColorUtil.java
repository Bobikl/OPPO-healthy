package com.heytap.store.homemodule.utils;

import android.graphics.ColorMatrix;
import android.graphics.ColorMatrixColorFilter;
import android.graphics.Paint;
import android.view.View;
import com.heytap.store.base.core.util.DarkModeUtilsKt;
import com.oplus.aiunit.vision.lo9;
import com.sensorsdata.analytics.android.sdk.advert.oaid.OAIDRom;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Lazy;
import p010kotlin.LazyKt__LazyJVMKt;
import p010kotlin.Metadata;
import p010kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fJ\u0010\u0010\r\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fJ\u0010\u0010\u000e\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fR\u001b\u0010\u0003\u001a\u00020\u00048BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u000f"}, d2 = {"Lcom/heytap/store/homemodule/utils/DarkTextColorUtil;", "", "()V", lo9.TAG_DEFAULT_CREATION_PAINT, "Landroid/graphics/Paint;", "getPaint", "()Landroid/graphics/Paint;", "paint$delegate", "Lkotlin/Lazy;", "cancelForce", "", "view", "Landroid/view/View;", "forceDark", "forceDarkXiaoMi", "com.heytap.store.business.home-impl"}, k = 1, mv = {1, 6, 0}, xi = 48)
public final class DarkTextColorUtil {

    @NotNull
    public static final DarkTextColorUtil INSTANCE = new DarkTextColorUtil();

    /* JADX INFO: renamed from: paint$delegate, reason: from kotlin metadata */
    @NotNull
    private static final Lazy paint = LazyKt__LazyJVMKt.lazy(new Function0<Paint>() { // from class: com.heytap.store.homemodule.utils.DarkTextColorUtil$paint$2
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // p010kotlin.jvm.functions.Function0
        @NotNull
        public final Paint invoke() {
            Paint paint2 = new Paint();
            paint2.setColorFilter(new ColorMatrixColorFilter(new ColorMatrix(new float[]{0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f})));
            return paint2;
        }
    });

    private DarkTextColorUtil() {
    }

    private final Paint getPaint() {
        return (Paint) paint.getValue();
    }

    public final void cancelForce(@Nullable View view) {
        if (view == null) {
            return;
        }
        view.setLayerType(0, null);
    }

    public final void forceDark(@Nullable View view) {
        if (view == null) {
            return;
        }
        view.setLayerType(2, getPaint());
    }

    public final void forceDarkXiaoMi(@Nullable View view) {
        if (view != null && DarkModeUtilsKt.isDarkMode(view)) {
            if (OAIDRom.isXiaomi() || OAIDRom.isBlackShark()) {
                forceDark(view);
            }
        }
    }
}
