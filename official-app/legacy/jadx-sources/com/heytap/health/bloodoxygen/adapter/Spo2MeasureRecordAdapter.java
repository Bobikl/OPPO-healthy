package com.heytap.health.bloodoxygen.adapter;

import android.annotation.SuppressLint;
import android.content.Context;
import android.widget.TextView;
import com.heytap.health.base.base.BaseRecyclerAdapter;
import com.heytap.health.base.base.BaseViewHolder;
import com.heytap.health.bloodoxygen.R$id;
import com.heytap.health.bloodoxygen.R$layout;
import com.heytap.health.core.widget.charts.data.TimeStampedData;
import com.heytap.health.wallet.ui.adapter.BaseRecyclerViewHolder;
import com.heytap.log.formatter.LogFieldKey;
import com.oplus.aiunit.vision.fn9;
import com.oplus.aiunit.vision.v05;
import io.protostuff.MapSchema;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u001d\u0012\u0006\u0010\f\u001a\u00020\t\u0012\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010J\u0018\u0010\b\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0017R\u0014\u0010\f\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000b¨\u0006\u0011"}, d2 = {"Lcom/heytap/health/bloodoxygen/adapter/Spo2MeasureRecordAdapter;", "Lcom/heytap/health/base/base/BaseRecyclerAdapter;", "Lcom/heytap/health/core/widget/charts/data/TimeStampedData;", "Lcom/heytap/health/base/base/BaseViewHolder;", BaseRecyclerViewHolder.HOLDER_TAG_HEADER, "", "position", "", MapSchema.FIELD_NAME_ENTRY, "Landroid/content/Context;", LogFieldKey.MESSAGE_KEY, "Landroid/content/Context;", "context", "", "data", "<init>", "(Landroid/content/Context;Ljava/util/List;)V", "blood_oxygen_release"}, k = 1, mv = {1, 8, 0})
public final class Spo2MeasureRecordAdapter extends BaseRecyclerAdapter<TimeStampedData> {

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    @NotNull
    public final Context context;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Spo2MeasureRecordAdapter(@NotNull Context context, @NotNull List<? extends TimeStampedData> data) {
        super(data, R$layout.health_spo2_measure_record_view_item);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(data, "data");
        this.context = context;
    }

    @Override // com.heytap.health.base.base.BaseRecyclerAdapter
    @SuppressLint({"SetTextI18n"})
    public void e(@NotNull BaseViewHolder holder, int position) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        Object obj = this.i.get(position);
        Intrinsics.checkNotNull(obj);
        TimeStampedData timeStampedData = (TimeStampedData) obj;
        TextView textView = (TextView) holder.getView(R$id.tv_time);
        TextView textView2 = (TextView) holder.getView(R$id.tv_value);
        textView.setText(fn9.g(timeStampedData.getTimestamp(), v05.DATE_FORMAT_HOUR));
        textView2.setText(String.valueOf((int) timeStampedData.getY()) + " %");
    }
}
