package com.heytap.health.sleep.heartrate.ui.adapter;

import android.content.Context;
import android.widget.TextView;
import androidx.compose.runtime.internal.StabilityInferred;
import com.heytap.health.base.base.BaseRecyclerAdapter;
import com.heytap.health.base.base.BaseViewHolder;
import com.heytap.health.healthbase.util.HealthFrgType;
import com.heytap.health.sleep.heartrate.R$array;
import com.heytap.health.sleep.heartrate.R$id;
import com.heytap.health.sleep.heartrate.R$layout;
import com.heytap.health.sleep.heartrate.R$plurals;
import com.heytap.health.sleep.heartrate.R$string;
import com.heytap.health.wallet.ui.adapter.BaseRecyclerViewHolder;
import com.heytap.log.formatter.LogFieldKey;
import com.oplus.aiunit.vision.HeartRateWarnDayBean;
import com.oplus.aiunit.vision.HeartRateWarnLabelBean;
import com.oplus.aiunit.vision.mq8;
import io.protostuff.MapSchema;
import java.util.Arrays;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;
import p010kotlin.jvm.internal.StringCompanionObject;

/* JADX INFO: loaded from: classes18.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\b\u0004\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u001d\u0012\u0006\u0010\u000f\u001a\u00020\f\u0012\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00020\u0017¢\u0006\u0004\b\u0019\u0010\u001aJ\u000e\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003J\u0018\u0010\u000b\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tH\u0016R\u0014\u0010\u000f\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0016\u0010\u0004\u001a\u00020\u00038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u001e\u0010\u0016\u001a\n\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u00128\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015¨\u0006\u001b"}, d2 = {"Lcom/heytap/health/sleep/heartrate/ui/adapter/SleepHeartRateWarnListAdapter;", "Lcom/heytap/health/base/base/BaseRecyclerAdapter;", "Lcom/oplus/aiunit/vision/a79;", "Lcom/heytap/health/healthbase/util/HealthFrgType;", "type", "", LogFieldKey.LEVEL_KEY, "Lcom/heytap/health/base/base/BaseViewHolder;", BaseRecyclerViewHolder.HOLDER_TAG_HEADER, "", "position", MapSchema.FIELD_NAME_ENTRY, "Landroid/content/Context;", LogFieldKey.MESSAGE_KEY, "Landroid/content/Context;", "context", "n", "Lcom/heytap/health/healthbase/util/HealthFrgType;", "", "", "o", "[Ljava/lang/String;", "labelStrArray", "", "data", "<init>", "(Landroid/content/Context;Ljava/util/List;)V", "sleep_heartrate_release"}, k = 1, mv = {1, 8, 0})
public final class SleepHeartRateWarnListAdapter extends BaseRecyclerAdapter<HeartRateWarnDayBean> {
    public static final int $stable = 8;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    @NotNull
    public final Context context;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public HealthFrgType type;

    /* JADX INFO: renamed from: o, reason: from kotlin metadata */
    @Nullable
    public String[] labelStrArray;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SleepHeartRateWarnListAdapter(@NotNull Context context, @NotNull List<HeartRateWarnDayBean> data) {
        super(data, R$layout.health_sleep_heart_rate_warn_item);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(data, "data");
        this.context = context;
        this.type = HealthFrgType.YEAR;
    }

    @Override // com.heytap.health.base.base.BaseRecyclerAdapter
    public void e(@NotNull BaseViewHolder holder, int position) {
        String[] strArr;
        Intrinsics.checkNotNullParameter(holder, "holder");
        TextView textView = (TextView) holder.getView(R$id.tvTime);
        TextView textView2 = (TextView) holder.getView(R$id.tvLabel);
        HeartRateWarnDayBean heartRateWarnDayBean = (HeartRateWarnDayBean) this.i.get(position);
        if (heartRateWarnDayBean.a().isEmpty()) {
            textView2.setText(this.context.getString(R$string.health_sleep_heart_rate_warning_not_label_v2));
        } else {
            StringBuilder sb = new StringBuilder();
            int size = heartRateWarnDayBean.a().size();
            for (int i = 0; i < size; i++) {
                HeartRateWarnLabelBean heartRateWarnLabelBean = heartRateWarnDayBean.a().get(i);
                int labelId = heartRateWarnLabelBean.getLabelId();
                if ((1 <= labelId && labelId < 7) && (strArr = this.labelStrArray) != null) {
                    sb.append(strArr[heartRateWarnLabelBean.getLabelId() - 1]);
                }
                if (this.type == HealthFrgType.YEAR) {
                    int count = heartRateWarnLabelBean.getCount();
                    String quantityString = this.context.getResources().getQuantityString(R$plurals.health_sleep_heart_rate_warning_count_v2, count);
                    Intrinsics.checkNotNullExpressionValue(quantityString, "context.resources.getQua…unt\n                    )");
                    StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
                    String str = String.format(quantityString, Arrays.copyOf(new Object[]{Integer.valueOf(count)}, 1));
                    Intrinsics.checkNotNullExpressionValue(str, "format(...)");
                    sb.append(str);
                }
                if (i != heartRateWarnDayBean.a().size() - 1) {
                    sb.append("、");
                }
            }
            textView2.setText(sb);
        }
        if (this.type == HealthFrgType.YEAR) {
            textView.setText(mq8.INSTANCE.y(heartRateWarnDayBean.getTimestamp(), "yyy-MMM"));
        } else {
            textView.setText(mq8.INSTANCE.y(heartRateWarnDayBean.getTimestamp(), "yyy-MMM-dd"));
        }
    }

    public final void l(@NotNull HealthFrgType type) {
        Intrinsics.checkNotNullParameter(type, "type");
        this.labelStrArray = this.context.getResources().getStringArray(R$array.health_sleep_heart_rate_warning_label_array_v2);
        this.type = type;
    }
}
