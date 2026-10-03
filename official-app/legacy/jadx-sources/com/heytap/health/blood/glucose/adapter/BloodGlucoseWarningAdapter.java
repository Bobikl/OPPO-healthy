package com.heytap.health.blood.glucose.adapter;

import android.content.Context;
import android.widget.TextView;
import com.heytap.databaseengine.model.bloodsugar.BloodSugarWarning;
import com.heytap.health.base.base.BaseRecyclerAdapter;
import com.heytap.health.base.base.BaseViewHolder;
import com.heytap.health.blood.glucose.R$id;
import com.heytap.health.blood.glucose.R$layout;
import com.heytap.health.blood.glucose.R$string;
import com.heytap.health.wallet.ui.adapter.BaseRecyclerViewHolder;
import com.heytap.log.formatter.LogFieldKey;
import com.oplus.aiunit.vision.mq8;
import io.protostuff.MapSchema;
import java.util.Arrays;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;
import p010kotlin.jvm.internal.StringCompanionObject;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u001d\u0012\u0006\u0010\f\u001a\u00020\t\u0012\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010J\u0018\u0010\b\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0016R\u0014\u0010\f\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000b¨\u0006\u0011"}, d2 = {"Lcom/heytap/health/blood/glucose/adapter/BloodGlucoseWarningAdapter;", "Lcom/heytap/health/base/base/BaseRecyclerAdapter;", "Lcom/heytap/databaseengine/model/bloodsugar/BloodSugarWarning;", "Lcom/heytap/health/base/base/BaseViewHolder;", BaseRecyclerViewHolder.HOLDER_TAG_HEADER, "", "position", "", MapSchema.FIELD_NAME_ENTRY, "Landroid/content/Context;", LogFieldKey.MESSAGE_KEY, "Landroid/content/Context;", "context", "", "dataList", "<init>", "(Landroid/content/Context;Ljava/util/List;)V", "blood_glucose_release"}, k = 1, mv = {1, 8, 0})
public final class BloodGlucoseWarningAdapter extends BaseRecyclerAdapter<BloodSugarWarning> {

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    @NotNull
    public final Context context;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BloodGlucoseWarningAdapter(@NotNull Context context, @NotNull List<BloodSugarWarning> dataList) {
        super(dataList, R$layout.health_blood_glucose_card_warning_item);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(dataList, "dataList");
        this.context = context;
    }

    @Override // com.heytap.health.base.base.BaseRecyclerAdapter
    public void e(@NotNull BaseViewHolder holder, int position) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        Object obj = this.i.get(position);
        Intrinsics.checkNotNull(obj);
        BloodSugarWarning bloodSugarWarning = (BloodSugarWarning) obj;
        TextView textView = (TextView) holder.getView(R$id.tv_date);
        TextView textView2 = (TextView) holder.getView(R$id.tv_details);
        textView.setText(mq8.INSTANCE.y(bloodSugarWarning.getTimestamp(), "MMMd HH:mm"));
        if (bloodSugarWarning.getWarningType() == 2) {
            StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
            String string = this.context.getString(R$string.health_blood_glucose_warning_format_height);
            Intrinsics.checkNotNullExpressionValue(string, "context.getString(R.stri…se_warning_format_height)");
            String str = String.format(string, Arrays.copyOf(new Object[]{bloodSugarWarning.getValue()}, 1));
            Intrinsics.checkNotNullExpressionValue(str, "format(...)");
            textView2.setText(str);
            return;
        }
        if (bloodSugarWarning.getWarningType() == 1) {
            StringCompanionObject stringCompanionObject2 = StringCompanionObject.INSTANCE;
            String string2 = this.context.getString(R$string.health_blood_glucose_warning_format_low);
            Intrinsics.checkNotNullExpressionValue(string2, "context.getString(R.stri…ucose_warning_format_low)");
            String str2 = String.format(string2, Arrays.copyOf(new Object[]{bloodSugarWarning.getValue()}, 1));
            Intrinsics.checkNotNullExpressionValue(str2, "format(...)");
            textView2.setText(str2);
        }
    }
}
