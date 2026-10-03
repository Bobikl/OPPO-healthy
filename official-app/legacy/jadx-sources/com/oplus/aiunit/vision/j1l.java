package com.oplus.aiunit.vision;

import android.content.Context;
import androidx.core.content.ContextCompat;
import com.heytap.health.base.ui.widget.HealthButton;
import com.oppo.lib.common.R$color;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes18.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u001a\u000e\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000\u001a\u000e\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000¨\u0006\u0005"}, d2 = {"Lcom/heytap/health/base/ui/widget/HealthButton;", "btn", "", "a", "b", "commonlib_release"}, k = 2, mv = {1, 8, 0})
public final class j1l {
    public static final void a(@NotNull HealthButton btn) {
        Intrinsics.checkNotNullParameter(btn, "btn");
        btn.setEnabled(false);
        Context context = qz0.mContext;
        btn.setDisabledColor(ContextCompat.getColor(context, R$color.color_e5e5e5_wallet));
        btn.setTextColor(ContextCompat.getColor(context, R$color.wallet_color_ffffff));
    }

    public static final void b(@NotNull HealthButton btn) {
        Intrinsics.checkNotNullParameter(btn, "btn");
        btn.setEnabled(true);
        Context context = qz0.mContext;
        btn.setDrawableColor(ContextCompat.getColor(context, R$color.wallet_blue_color));
        btn.setTextColor(ContextCompat.getColor(context, R$color.color_FFFFFF));
    }
}
