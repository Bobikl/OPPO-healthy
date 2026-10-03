package com.oplus.aiunit.vision;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.util.TypedValue;
import android.view.View;
import android.widget.TextView;
import androidx.preference.PreferenceViewHolder;
import com.heytap.health.wallet.ui.adapter.BaseRecyclerViewHolder;
import com.heytap.nearx.uikit.R$color;
import com.heytap.nearx.uikit.R$id;
import com.oplus.smartenginehelper.entity.TextEntity;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes18.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0010\u0010\u0011J0\u0010\n\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0004H\u0016J\u0018\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u0004H\u0002¨\u0006\u0012"}, d2 = {"Lcom/oplus/aiunit/vision/elc;", "Lcom/oplus/aiunit/vision/clc;", "Landroidx/preference/PreferenceViewHolder;", BaseRecyclerViewHolder.HOLDER_TAG_HEADER, "", "start", "top", TextEntity.ELLIPSIZE_END, "bottom", "", "a", "Landroid/content/Context;", "context", "colorResId", "Landroid/content/res/ColorStateList;", "b", "<init>", "()V", "nearx_release"}, k = 1, mv = {1, 6, 0})
public final class elc extends clc {
    @Override // com.oplus.aiunit.vision.clc
    public void a(@NotNull PreferenceViewHolder holder, int start, int top, int end, int bottom) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        View viewFindViewById = holder.findViewById(R$id.nx_preference);
        if (viewFindViewById != null) {
            viewFindViewById.setPaddingRelative(start, top, end, bottom);
        }
        if (viewFindViewById != null) {
            viewFindViewById.setMinimumHeight((int) TypedValue.applyDimension(1, 64.0f, viewFindViewById.getResources().getDisplayMetrics()));
        }
        View viewFindViewById2 = holder.findViewById(R.id.title);
        if (viewFindViewById2 instanceof TextView) {
            TextView textView = (TextView) viewFindViewById2;
            Context context = textView.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "title.context");
            textView.setTextColor(b(context, R$color.nx_color_preference_title_color_theme2));
        }
        View viewFindViewById3 = holder.findViewById(R.id.summary);
        if (viewFindViewById3 instanceof TextView) {
            TextView textView2 = (TextView) viewFindViewById3;
            Context context2 = textView2.getContext();
            Intrinsics.checkNotNullExpressionValue(context2, "summary.context");
            textView2.setTextColor(b(context2, R$color.nx_preference_secondary_text_color_theme2));
        }
    }

    public final ColorStateList b(Context context, int colorResId) {
        ColorStateList colorStateList = context.getColorStateList(colorResId);
        Intrinsics.checkNotNullExpressionValue(colorStateList, "context.getColorStateList(colorResId)");
        return colorStateList;
    }
}
