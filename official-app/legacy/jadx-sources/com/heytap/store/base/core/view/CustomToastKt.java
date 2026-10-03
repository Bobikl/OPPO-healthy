package com.heytap.store.base.core.view;

import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.GradientDrawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;
import com.heytap.store.base.core.R;
import com.heytap.store.base.core.util.Corners;
import com.heytap.store.base.core.util.ShapeKt;
import com.heytap.store.platform.tools.SizeUtils;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u001a&\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005¨\u0006\u0007"}, d2 = {"showCustomToast", "", "context", "Landroid/content/Context;", "title", "", "message", "Core_release"}, k = 2, mv = {1, 6, 0}, xi = 48)
public final class CustomToastKt {
    public static final void showCustomToast(@NotNull Context context, @Nullable String str, @Nullable String str2) {
        Intrinsics.checkNotNullParameter(context, "context");
        Toast toast = new Toast(context);
        View viewInflate = LayoutInflater.from(context).inflate(R.layout.pf_core_view_custom_toast, (ViewGroup) null);
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setGradientType(0);
        Corners corners = new Corners();
        corners.setRadius(SizeUtils.INSTANCE.dp2px(15.0f) / 1.0f);
        gradientDrawable.setCornerRadii(ShapeKt.render(corners));
        ShapeKt.setShapeSolidColor(gradientDrawable, Color.parseColor("#B3000000"));
        viewInflate.setBackground(gradientDrawable);
        TextView tvTitle = (TextView) viewInflate.findViewById(R.id.title);
        TextView tvMessage = (TextView) viewInflate.findViewById(R.id.text);
        Intrinsics.checkNotNullExpressionValue(tvTitle, "tvTitle");
        boolean z = true;
        tvTitle.setVisibility(str == null || str.length() == 0 ? 8 : 0);
        tvTitle.setText(str);
        Intrinsics.checkNotNullExpressionValue(tvMessage, "tvMessage");
        if (str2 != null && str2.length() != 0) {
            z = false;
        }
        tvMessage.setVisibility(z ? 8 : 0);
        tvMessage.setText(str2);
        toast.setView(viewInflate);
        toast.setDuration(0);
        toast.setGravity(17, 0, 0);
        toast.show();
    }

    public static /* synthetic */ void showCustomToast$default(Context context, String str, String str2, int i, Object obj) {
        if ((i & 2) != 0) {
            str = "";
        }
        if ((i & 4) != 0) {
            str2 = "";
        }
        showCustomToast(context, str, str2);
    }
}
