package com.heytap.health.sleep.week.adapter;

import android.content.Context;
import android.widget.TextView;
import androidx.compose.runtime.internal.StabilityInferred;
import com.heytap.health.base.base.BaseRecyclerAdapter;
import com.heytap.health.base.base.BaseViewHolder;
import com.heytap.health.sleep.R$array;
import com.heytap.health.sleep.R$id;
import com.heytap.health.sleep.R$layout;
import com.heytap.health.sleep.R$plurals;
import com.heytap.health.wallet.ui.adapter.BaseRecyclerViewHolder;
import com.heytap.log.formatter.LogFieldKey;
import com.oplus.aiunit.vision.HeartRateWarnLabelBean;
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
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\b\u0004\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u001d\u0012\u0006\u0010\r\u001a\u00020\n\u0012\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00020\u0013¢\u0006\u0004\b\u0015\u0010\u0016J\u0006\u0010\u0004\u001a\u00020\u0003J\u0018\u0010\t\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016R\u0014\u0010\r\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u001e\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011¨\u0006\u0017"}, d2 = {"Lcom/heytap/health/sleep/week/adapter/SleepHeartRateWarningAdapter;", "Lcom/heytap/health/base/base/BaseRecyclerAdapter;", "Lcom/oplus/aiunit/vision/f79;", "", LogFieldKey.LEVEL_KEY, "Lcom/heytap/health/base/base/BaseViewHolder;", BaseRecyclerViewHolder.HOLDER_TAG_HEADER, "", "position", MapSchema.FIELD_NAME_ENTRY, "Landroid/content/Context;", LogFieldKey.MESSAGE_KEY, "Landroid/content/Context;", "context", "", "", "n", "[Ljava/lang/String;", "labelStrArray", "", "data", "<init>", "(Landroid/content/Context;Ljava/util/List;)V", "sleep_release"}, k = 1, mv = {1, 8, 0})
public final class SleepHeartRateWarningAdapter extends BaseRecyclerAdapter<HeartRateWarnLabelBean> {
    public static final int $stable = 8;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    @NotNull
    public final Context context;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public String[] labelStrArray;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SleepHeartRateWarningAdapter(@NotNull Context context, @NotNull List<HeartRateWarnLabelBean> data) {
        super(data, R$layout.health_sleep_heart_rate_warning_item);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(data, "data");
        this.context = context;
    }

    @Override // com.heytap.health.base.base.BaseRecyclerAdapter
    public void e(@NotNull BaseViewHolder holder, int position) {
        String[] strArr;
        Intrinsics.checkNotNullParameter(holder, "holder");
        TextView textView = (TextView) holder.getView(R$id.tv_title);
        TextView textView2 = (TextView) holder.getView(R$id.tv_count);
        HeartRateWarnLabelBean heartRateWarnLabelBean = (HeartRateWarnLabelBean) this.i.get(position);
        int labelId = heartRateWarnLabelBean.getLabelId();
        boolean z = false;
        if (1 <= labelId && labelId < 7) {
            z = true;
        }
        if (z && (strArr = this.labelStrArray) != null) {
            textView.setText(strArr[heartRateWarnLabelBean.getLabelId() - 1]);
        }
        String quantityString = this.context.getResources().getQuantityString(R$plurals.health_sleep_heart_rate_warning_count, heartRateWarnLabelBean.getCount());
        Intrinsics.checkNotNullExpressionValue(quantityString, "context.resources.getQua…     data.count\n        )");
        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
        String str = String.format(quantityString, Arrays.copyOf(new Object[]{Integer.valueOf(heartRateWarnLabelBean.getCount())}, 1));
        Intrinsics.checkNotNullExpressionValue(str, "format(...)");
        textView2.setText(str);
    }

    public final void l() {
        this.labelStrArray = this.context.getResources().getStringArray(R$array.health_sleep_heart_rate_warning_label_array);
    }
}
