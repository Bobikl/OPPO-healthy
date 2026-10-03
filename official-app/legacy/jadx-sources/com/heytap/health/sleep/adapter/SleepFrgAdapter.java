package com.heytap.health.sleep.adapter;

import android.content.Context;
import android.widget.TextView;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.core.content.ContextCompat;
import com.heytap.health.base.base.BaseRecyclerAdapter;
import com.heytap.health.base.base.BaseViewHolder;
import com.heytap.health.sleep.R$color;
import com.heytap.health.sleep.R$id;
import com.heytap.health.sleep.R$layout;
import com.heytap.health.sleep.R$string;
import com.heytap.health.wallet.ui.adapter.BaseRecyclerViewHolder;
import com.heytap.log.formatter.LogFieldKey;
import com.oplus.aiunit.vision.ihh;
import com.oplus.aiunit.vision.x8h;
import com.oplus.aiunit.vision.ybh;
import com.oplus.aiunit.vision.z05;
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
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0004\b\u0007\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001B!\u0012\u0006\u0010\u0017\u001a\u00020\u0015\u0012\u0010\u0010\u0019\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0018\u00010\u0018¢\u0006\u0004\b\u001a\u0010\u001bJ\u0018\u0010\b\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0016J8\u0010\u0011\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\t2\u0006\u0010\u000e\u001a\u00020\t2\u0006\u0010\u0010\u001a\u00020\u000fH\u0002J8\u0010\u0012\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\t2\u0006\u0010\u000e\u001a\u00020\t2\u0006\u0010\u0010\u001a\u00020\u000fH\u0002J8\u0010\u0013\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\t2\u0006\u0010\u000e\u001a\u00020\t2\u0006\u0010\u0010\u001a\u00020\u000fH\u0002J8\u0010\u0014\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\t2\u0006\u0010\u000e\u001a\u00020\t2\u0006\u0010\u0010\u001a\u00020\u000fH\u0002R\u0014\u0010\u0017\u001a\u00020\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0016¨\u0006\u001c"}, d2 = {"Lcom/heytap/health/sleep/adapter/SleepFrgAdapter;", "Lcom/heytap/health/base/base/BaseRecyclerAdapter;", "Lcom/oplus/aiunit/vision/x8h;", "Lcom/heytap/health/base/base/BaseViewHolder;", BaseRecyclerViewHolder.HOLDER_TAG_HEADER, "", "position", "", MapSchema.FIELD_NAME_ENTRY, "Landroid/widget/TextView;", "tvSleepType", "tvSleepTime", "tvSleepStatus", "tvSleepDesc", "tvSleepDesc2", "Lcom/oplus/aiunit/vision/ihh;", "sleepFrgBean", LogFieldKey.LEVEL_KEY, LogFieldKey.MESSAGE_KEY, "n", "o", "Landroid/content/Context;", "Landroid/content/Context;", "context", "", "data", "<init>", "(Landroid/content/Context;Ljava/util/List;)V", "sleep_release"}, k = 1, mv = {1, 8, 0})
public final class SleepFrgAdapter extends BaseRecyclerAdapter<x8h> {
    public static final int $stable = 8;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    @NotNull
    public final Context context;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SleepFrgAdapter(@NotNull Context context, @Nullable List<x8h> list) {
        super(list, R$layout.health_sleep_frg_dialog_item);
        Intrinsics.checkNotNullParameter(context, "context");
        this.context = context;
    }

    @Override // com.heytap.health.base.base.BaseRecyclerAdapter
    public void e(@NotNull BaseViewHolder holder, int position) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        TextView tvSleepType = (TextView) holder.getView(R$id.tv_sleep_type);
        TextView tvSleepTime = (TextView) holder.getView(R$id.tv_sleep_time);
        TextView tvSleepStatus = (TextView) holder.getView(R$id.tv_sleep_status);
        TextView tvSleepDesc = (TextView) holder.getView(R$id.tv_sleep_desc);
        TextView tvSleepDesc2 = (TextView) holder.getView(R$id.tv_sleep_desc2);
        Object obj = this.i.get(position);
        Intrinsics.checkNotNull(obj);
        x8h x8hVar = (x8h) obj;
        ihh sleepFrgBean = x8hVar.getSleepFrgBean();
        int type = x8hVar.getType();
        if (type == 1) {
            Intrinsics.checkNotNullExpressionValue(tvSleepType, "tvSleepType");
            Intrinsics.checkNotNullExpressionValue(tvSleepTime, "tvSleepTime");
            Intrinsics.checkNotNullExpressionValue(tvSleepStatus, "tvSleepStatus");
            Intrinsics.checkNotNullExpressionValue(tvSleepDesc, "tvSleepDesc");
            Intrinsics.checkNotNullExpressionValue(tvSleepDesc2, "tvSleepDesc2");
            l(tvSleepType, tvSleepTime, tvSleepStatus, tvSleepDesc, tvSleepDesc2, sleepFrgBean);
            return;
        }
        if (type == 2) {
            Intrinsics.checkNotNullExpressionValue(tvSleepType, "tvSleepType");
            Intrinsics.checkNotNullExpressionValue(tvSleepTime, "tvSleepTime");
            Intrinsics.checkNotNullExpressionValue(tvSleepStatus, "tvSleepStatus");
            Intrinsics.checkNotNullExpressionValue(tvSleepDesc, "tvSleepDesc");
            Intrinsics.checkNotNullExpressionValue(tvSleepDesc2, "tvSleepDesc2");
            m(tvSleepType, tvSleepTime, tvSleepStatus, tvSleepDesc, tvSleepDesc2, sleepFrgBean);
            return;
        }
        if (type == 3) {
            Intrinsics.checkNotNullExpressionValue(tvSleepType, "tvSleepType");
            Intrinsics.checkNotNullExpressionValue(tvSleepTime, "tvSleepTime");
            Intrinsics.checkNotNullExpressionValue(tvSleepStatus, "tvSleepStatus");
            Intrinsics.checkNotNullExpressionValue(tvSleepDesc, "tvSleepDesc");
            Intrinsics.checkNotNullExpressionValue(tvSleepDesc2, "tvSleepDesc2");
            n(tvSleepType, tvSleepTime, tvSleepStatus, tvSleepDesc, tvSleepDesc2, sleepFrgBean);
            return;
        }
        if (type != 4) {
            return;
        }
        Intrinsics.checkNotNullExpressionValue(tvSleepType, "tvSleepType");
        Intrinsics.checkNotNullExpressionValue(tvSleepTime, "tvSleepTime");
        Intrinsics.checkNotNullExpressionValue(tvSleepStatus, "tvSleepStatus");
        Intrinsics.checkNotNullExpressionValue(tvSleepDesc, "tvSleepDesc");
        Intrinsics.checkNotNullExpressionValue(tvSleepDesc2, "tvSleepDesc2");
        o(tvSleepType, tvSleepTime, tvSleepStatus, tvSleepDesc, tvSleepDesc2, sleepFrgBean);
    }

    public final void l(TextView tvSleepType, TextView tvSleepTime, TextView tvSleepStatus, TextView tvSleepDesc, TextView tvSleepDesc2, ihh sleepFrgBean) {
        tvSleepType.setText(R$string.health_sleep_deep);
        tvSleepType.setTextColor(ContextCompat.getColor(this.context, R$color.health_sleep_3c41b0));
        tvSleepTime.setText(z05.d(sleepFrgBean.k(), 23.0f, 0, true, 0));
        tvSleepDesc.setText(R$string.health_sleep_deep_desc_1);
        tvSleepDesc2.setText(R$string.health_sleep_deep_desc2);
        int iA = ybh.a(sleepFrgBean.b());
        String string = this.context.getString(R$string.health_sleep_normal);
        Intrinsics.checkNotNullExpressionValue(string, "context.getString(R.string.health_sleep_normal)");
        if (iA == -2) {
            string = this.context.getString(R$string.health_sleep_over_less);
            Intrinsics.checkNotNullExpressionValue(string, "context.getString(R.string.health_sleep_over_less)");
        } else if (iA == -1) {
            string = this.context.getString(R$string.health_sleep_rahter_less);
            Intrinsics.checkNotNullExpressionValue(string, "context.getString(R.stri…health_sleep_rahter_less)");
        }
        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
        String string2 = this.context.getString(R$string.health_sleep_analyze_scale);
        Intrinsics.checkNotNullExpressionValue(string2, "context.getString(R.stri…alth_sleep_analyze_scale)");
        String str = String.format(string2, Arrays.copyOf(new Object[]{String.valueOf(sleepFrgBean.b()), string}, 2));
        Intrinsics.checkNotNullExpressionValue(str, "format(...)");
        tvSleepStatus.setText(str);
    }

    public final void m(TextView tvSleepType, TextView tvSleepTime, TextView tvSleepStatus, TextView tvSleepDesc, TextView tvSleepDesc2, ihh sleepFrgBean) {
        tvSleepType.setText(R$string.health_sleep_light);
        tvSleepType.setTextColor(ContextCompat.getColor(this.context, R$color.health_sleep_5d64e9));
        tvSleepTime.setText(z05.d(sleepFrgBean.l(), 23.0f, 0, true, 0));
        if (sleepFrgBean.m() > 0) {
            tvSleepDesc.setText(R$string.health_sleep_light_desc_has_rem);
        } else {
            tvSleepDesc.setText(R$string.health_sleep_light_desc_no_rem);
        }
        tvSleepDesc2.setText(R$string.health_sleep_light_desc2);
        int iB = ybh.b(sleepFrgBean.m(), sleepFrgBean.e());
        String string = this.context.getString(R$string.health_sleep_normal);
        Intrinsics.checkNotNullExpressionValue(string, "context.getString(R.string.health_sleep_normal)");
        if (iB == 1) {
            string = this.context.getString(R$string.health_sleep_rather_more);
            Intrinsics.checkNotNullExpressionValue(string, "context.getString(R.stri…health_sleep_rather_more)");
        } else if (iB == 2) {
            string = this.context.getString(R$string.health_sleep_over_more);
            Intrinsics.checkNotNullExpressionValue(string, "context.getString(R.string.health_sleep_over_more)");
        }
        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
        String string2 = this.context.getString(R$string.health_sleep_analyze_scale);
        Intrinsics.checkNotNullExpressionValue(string2, "context.getString(R.stri…alth_sleep_analyze_scale)");
        String str = String.format(string2, Arrays.copyOf(new Object[]{String.valueOf(sleepFrgBean.e()), string}, 2));
        Intrinsics.checkNotNullExpressionValue(str, "format(...)");
        tvSleepStatus.setText(str);
    }

    public final void n(TextView tvSleepType, TextView tvSleepTime, TextView tvSleepStatus, TextView tvSleepDesc, TextView tvSleepDesc2, ihh sleepFrgBean) {
        tvSleepType.setText(R$string.health_sleep_rem_full_name);
        tvSleepType.setTextColor(ContextCompat.getColor(this.context, R$color.health_sleep_72c6fb));
        tvSleepTime.setText(z05.d(sleepFrgBean.m(), 23.0f, 0, true, 0));
        tvSleepDesc.setText(R$string.health_sleep_rem_desc);
        tvSleepDesc2.setText(R$string.health_sleep_rem_desc2);
        int iC = ybh.c(sleepFrgBean.f());
        String string = this.context.getString(R$string.health_sleep_normal);
        Intrinsics.checkNotNullExpressionValue(string, "context.getString(R.string.health_sleep_normal)");
        if (iC == -1) {
            string = this.context.getString(R$string.health_sleep_rahter_less);
            Intrinsics.checkNotNullExpressionValue(string, "context.getString(R.stri…health_sleep_rahter_less)");
        } else if (iC == 1) {
            string = this.context.getString(R$string.health_sleep_rather_more);
            Intrinsics.checkNotNullExpressionValue(string, "context.getString(R.stri…health_sleep_rather_more)");
        }
        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
        String string2 = this.context.getString(R$string.health_sleep_analyze_scale);
        Intrinsics.checkNotNullExpressionValue(string2, "context.getString(R.stri…alth_sleep_analyze_scale)");
        String str = String.format(string2, Arrays.copyOf(new Object[]{String.valueOf(sleepFrgBean.f()), string}, 2));
        Intrinsics.checkNotNullExpressionValue(str, "format(...)");
        tvSleepStatus.setText(str);
    }

    public final void o(TextView tvSleepType, TextView tvSleepTime, TextView tvSleepStatus, TextView tvSleepDesc, TextView tvSleepDesc2, ihh sleepFrgBean) {
        tvSleepType.setText(R$string.health_sleep_awake);
        tvSleepType.setTextColor(ContextCompat.getColor(this.context, R$color.health_sleep_ffbb0e));
        tvSleepTime.setText(z05.d(sleepFrgBean.o(), 23.0f, 0, true, 0));
        tvSleepDesc.setText(R$string.health_sleep_wake_tip_v2);
        tvSleepDesc2.setText(R$string.health_sleep_stage_description_desc32);
        int iD = ybh.d(sleepFrgBean.o());
        String string = this.context.getString(R$string.health_sleep_normal);
        Intrinsics.checkNotNullExpressionValue(string, "context.getString(R.string.health_sleep_normal)");
        if (iD == 1) {
            string = this.context.getString(R$string.health_sleep_rather_long);
            Intrinsics.checkNotNullExpressionValue(string, "context.getString(R.stri…health_sleep_rather_long)");
        } else if (iD == 2) {
            string = this.context.getString(R$string.health_sleep_over_long);
            Intrinsics.checkNotNullExpressionValue(string, "context.getString(R.string.health_sleep_over_long)");
        }
        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
        String string2 = this.context.getString(R$string.health_sleep_analyze_scale2);
        Intrinsics.checkNotNullExpressionValue(string2, "context.getString(R.stri…lth_sleep_analyze_scale2)");
        String str = String.format(string2, Arrays.copyOf(new Object[]{string}, 1));
        Intrinsics.checkNotNullExpressionValue(str, "format(...)");
        tvSleepStatus.setText(str);
    }
}
