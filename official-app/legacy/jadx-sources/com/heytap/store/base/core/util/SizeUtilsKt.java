package com.heytap.store.base.core.util;

import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import androidx.core.content.ContextCompat;
import com.heytap.nearx.uikit.widget.cardview.NearCardView2;
import com.heytap.store.base.core.R;
import com.heytap.store.base.core.navigation.SystemUiHelper;
import com.heytap.store.platform.tools.SizeUtils;
import com.oplus.aiunit.vision.vhc;
import com.oplus.aiunit.vision.whc;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0010\b\n\u0002\u0010\u0004\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u000e\u0010\t\u001a\u00020\u00012\u0006\u0010\n\u001a\u00020\u000b\u001a\u0016\u0010\f\u001a\u00020\u00012\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000e\u001a\u0016\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0001\u001a\"\u0010\u0014\u001a\u00020\u0010*\u00020\u00152\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\u0016\u001a\u00020\u00012\u0006\u0010\u0017\u001a\u00020\u0001\"\u0016\u0010\u0000\u001a\u00020\u0001*\u00020\u00028Æ\u0002¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0016\u0010\u0005\u001a\u00020\u0006*\u00020\u00028Æ\u0002¢\u0006\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\u0018"}, d2 = {"dp", "", "", "getDp", "(Ljava/lang/Number;)I", "px", "", "getPx", "(Ljava/lang/Number;)F", "getPanelGravity", "context", "Landroid/content/Context;", "getPanelHeight", "isLarge", "", "setTransparentWindow", "", "activity", "Landroid/app/Activity;", "currentSystemUiVisibility", "setCardRadius", "Lcom/heytap/nearx/uikit/widget/cardview/NearCardView2;", "radius", "singleRadius", "Core_release"}, k = 2, mv = {1, 6, 0}, xi = 48)
public final class SizeUtilsKt {
    public static final int getDp(@NotNull Number number) {
        Intrinsics.checkNotNullParameter(number, "<this>");
        return SizeUtils.INSTANCE.dp2px(number.floatValue());
    }

    public static final int getPanelGravity(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        int i = whc.i(context);
        return (i == 2 || i == 3) ? 17 : 80;
    }

    public static final int getPanelHeight(@NotNull Context context, boolean z) {
        Intrinsics.checkNotNullParameter(context, "context");
        int screenHeight = DisplayUtil.getScreenHeight(context);
        int i = whc.i(context);
        return (int) ((i == 2 || i == 3 || !z) ? ((double) screenHeight) * 0.75d : ((double) screenHeight) * 0.9d);
    }

    public static final float getPx(@NotNull Number number) {
        Intrinsics.checkNotNullParameter(number, "<this>");
        return number.floatValue() * Resources.getSystem().getDisplayMetrics().density;
    }

    public static final void setCardRadius(@NotNull NearCardView2 nearCardView2, @NotNull Context context, int i, int i2) {
        Intrinsics.checkNotNullParameter(nearCardView2, "<this>");
        Intrinsics.checkNotNullParameter(context, "context");
        int i3 = whc.i(context);
        if (i3 == 2 || i3 == 3) {
            nearCardView2.setNxCardCornerRadius(i);
            return;
        }
        nearCardView2.setNxCardTLCornerRadius(i2);
        nearCardView2.setNxCardTRCornerRadius(i2);
        SizeUtils sizeUtils = SizeUtils.INSTANCE;
        float f = 0;
        nearCardView2.setNxCardBLCornerRadius(sizeUtils.dp2px(f));
        nearCardView2.setNxCardBRCornerRadius(sizeUtils.dp2px(f));
    }

    public static final void setTransparentWindow(@NotNull Activity activity, int i) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        int i2 = whc.i(activity);
        if (i2 == 2 || i2 == 3) {
            SystemUiHelper.setTransparentStatusBar(activity, !vhc.a(activity));
            SystemUiHelper.setTransparentNavigationBar(activity, true);
        } else {
            activity.getWindow().getDecorView().setSystemUiVisibility(i);
            activity.getWindow().setNavigationBarColor(vhc.a(activity) ? -16777216 : ContextCompat.getColor(activity, R.color.pf_core_navigation_bar_light));
        }
    }
}
