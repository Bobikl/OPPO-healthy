package com.oplus.aiunit.vision;

import android.content.Context;
import android.text.format.DateUtils;
import android.widget.TextView;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.recyclerview.widget.RecyclerView;
import com.heytap.health.cardiovascular.R$id;
import com.heytap.health.cardiovascular.R$layout;
import com.heytap.health.cardiovascular.R$string;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes15.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\n\u0010\u000bJ\b\u0010\u0004\u001a\u00020\u0003H\u0016J\u0018\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002H\u0016¨\u0006\f"}, d2 = {"Lcom/oplus/aiunit/vision/ki8;", "Lcom/oplus/aiunit/vision/v01;", "Lcom/oplus/aiunit/vision/li8;", "", "a", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "viewHolder", "itemModel", "", "c", "<init>", "()V", "cardiovascular_release"}, k = 1, mv = {1, 8, 0})
public final class ki8 extends v01<li8> {
    public static final int $stable = 0;

    @Override // com.oplus.aiunit.vision.v01
    public int a() {
        return R$layout.health_cardiovascular_item_header;
    }

    @Override // com.oplus.aiunit.vision.v01
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public void b(@NotNull RecyclerView.ViewHolder viewHolder, @NotNull li8 itemModel) {
        Intrinsics.checkNotNullParameter(viewHolder, "viewHolder");
        Intrinsics.checkNotNullParameter(itemModel, "itemModel");
        TextView textView = (TextView) viewHolder.itemView.findViewById(R$id.tv_title);
        Context context = viewHolder.itemView.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "viewHolder.itemView.context");
        textView.setText(itemModel.b(context));
        TextView textView2 = (TextView) viewHolder.itemView.findViewById(R$id.tv_mesure_detail);
        Context context2 = viewHolder.itemView.getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "viewHolder.itemView.context");
        textView2.setText(itemModel.a(context2));
        TextView textView3 = (TextView) viewHolder.itemView.findViewById(R$id.tv_record_time);
        textView3.setText(textView3.getContext().getString(R$string.health_cardiovascular_measure_time, DateUtils.formatDateTime(viewHolder.itemView.getContext(), itemModel.getCom.oplus.smartenginehelper.entity.ClickApiEntity.TIME java.lang.String(), 145)));
    }
}
