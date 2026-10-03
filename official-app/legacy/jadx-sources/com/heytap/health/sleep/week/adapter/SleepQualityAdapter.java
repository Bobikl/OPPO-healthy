package com.heytap.health.sleep.week.adapter;

import android.content.Context;
import android.widget.TextView;
import androidx.compose.runtime.internal.StabilityInferred;
import com.heytap.health.base.base.BaseRecyclerAdapter;
import com.heytap.health.base.base.BaseViewHolder;
import com.heytap.health.sleep.R$drawable;
import com.heytap.health.sleep.R$id;
import com.heytap.health.sleep.R$layout;
import com.heytap.health.sleep.R$string;
import com.heytap.health.wallet.ui.adapter.BaseRecyclerViewHolder;
import com.heytap.log.formatter.LogFieldKey;
import com.oplus.aiunit.vision.rqh;
import com.oplus.aiunit.vision.ybh;
import com.oplus.aiunit.vision.z05;
import io.protostuff.MapSchema;
import java.util.Arrays;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;
import p010kotlin.jvm.internal.StringCompanionObject;

/* JADX INFO: loaded from: classes18.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0004\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u001d\u0012\u0006\u0010\f\u001a\u00020\t\u0012\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010J\u0018\u0010\b\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0016R\u0014\u0010\f\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000b¨\u0006\u0011"}, d2 = {"Lcom/heytap/health/sleep/week/adapter/SleepQualityAdapter;", "Lcom/heytap/health/base/base/BaseRecyclerAdapter;", "Lcom/oplus/aiunit/vision/rqh;", "Lcom/heytap/health/base/base/BaseViewHolder;", BaseRecyclerViewHolder.HOLDER_TAG_HEADER, "", "position", "", MapSchema.FIELD_NAME_ENTRY, "Landroid/content/Context;", LogFieldKey.MESSAGE_KEY, "Landroid/content/Context;", "context", "", "data", "<init>", "(Landroid/content/Context;Ljava/util/List;)V", "sleep_release"}, k = 1, mv = {1, 8, 0})
public final class SleepQualityAdapter extends BaseRecyclerAdapter<rqh> {
    public static final int $stable = 8;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    @NotNull
    public final Context context;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SleepQualityAdapter(@NotNull Context context, @NotNull List<rqh> data) {
        super(data, R$layout.health_sleep_card_quality_item);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(data, "data");
        this.context = context;
    }

    @Override // com.heytap.health.base.base.BaseRecyclerAdapter
    public void e(@NotNull BaseViewHolder holder, int position) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        rqh rqhVar = (rqh) this.i.get(position);
        TextView textView = (TextView) holder.getView(R$id.tv_title);
        TextView textView2 = (TextView) holder.getView(R$id.tv_desc);
        TextView textView3 = (TextView) holder.getView(R$id.tv_sleep_status);
        if (position == 2 && rqhVar.getTotalRemSleepAverageTime() <= 0) {
            position = 3;
        }
        if (position == 0) {
            textView.setText(this.context.getString(R$string.health_sleep_daily_deep));
            String strC = z05.c(rqhVar.getTotalDeepSleepAverageTime(), false);
            StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
            String string = this.context.getString(R$string.health_sleep_analyze_time_scale);
            Intrinsics.checkNotNullExpressionValue(string, "context.getString(R.stri…sleep_analyze_time_scale)");
            String str = String.format(string, Arrays.copyOf(new Object[]{strC, Integer.valueOf(rqhVar.getDeepSleepScale())}, 2));
            Intrinsics.checkNotNullExpressionValue(str, "format(...)");
            textView2.setText(str);
            int iA = ybh.a(rqhVar.getDeepSleepScale());
            if (iA == -2) {
                textView3.setText(this.context.getString(R$string.health_sleep_over_less));
                textView3.setBackgroundResource(R$drawable.health_sleep_bg_sleep_label_slight);
                return;
            } else if (iA == -1) {
                textView3.setText(this.context.getString(R$string.health_sleep_rahter_less));
                textView3.setBackgroundResource(R$drawable.health_sleep_bg_sleep_label_slight);
                return;
            } else {
                if (iA != 0) {
                    return;
                }
                textView3.setText(this.context.getString(R$string.health_sleep_normal));
                textView3.setBackgroundResource(R$drawable.health_sleep_bg_sleep_label_normal);
                return;
            }
        }
        if (position == 1) {
            textView.setText(this.context.getString(R$string.health_sleep_daily_light));
            String strC2 = z05.c(rqhVar.getTotalLightSleepAverageTime(), false);
            StringCompanionObject stringCompanionObject2 = StringCompanionObject.INSTANCE;
            String string2 = this.context.getString(R$string.health_sleep_analyze_time_scale);
            Intrinsics.checkNotNullExpressionValue(string2, "context.getString(R.stri…sleep_analyze_time_scale)");
            String str2 = String.format(string2, Arrays.copyOf(new Object[]{strC2, Integer.valueOf(rqhVar.getLightSleepScale())}, 2));
            Intrinsics.checkNotNullExpressionValue(str2, "format(...)");
            textView2.setText(str2);
            int iB = ybh.b(rqhVar.getTotalLightSleepAverageTime(), rqhVar.getLightSleepScale());
            if (iB == 0) {
                textView3.setText(this.context.getString(R$string.health_sleep_normal));
                textView3.setBackgroundResource(R$drawable.health_sleep_bg_sleep_label_normal);
                return;
            } else if (iB == 1) {
                textView3.setText(this.context.getString(R$string.health_sleep_rather_more));
                textView3.setBackgroundResource(R$drawable.health_sleep_bg_sleep_label_slight);
                return;
            } else {
                if (iB != 2) {
                    return;
                }
                textView3.setText(this.context.getString(R$string.health_sleep_over_more));
                textView3.setBackgroundResource(R$drawable.health_sleep_bg_sleep_label_slight);
                return;
            }
        }
        if (position != 2) {
            if (position != 3) {
                return;
            }
            textView.setText(this.context.getString(R$string.health_sleep_daily_awake));
            textView2.setText(z05.c(rqhVar.getTotalWakeSleepAverageTime(), false));
            int iD = ybh.d(rqhVar.getTotalWakeSleepAverageTime());
            if (iD == 0) {
                textView3.setText(this.context.getString(R$string.health_sleep_normal));
                textView3.setBackgroundResource(R$drawable.health_sleep_bg_sleep_label_normal);
                return;
            } else if (iD == 1) {
                textView3.setText(this.context.getString(R$string.health_sleep_rather_long));
                textView3.setBackgroundResource(R$drawable.health_sleep_bg_sleep_label_slight);
                return;
            } else {
                if (iD != 2) {
                    return;
                }
                textView3.setText(this.context.getString(R$string.health_sleep_over_long));
                textView3.setBackgroundResource(R$drawable.health_sleep_bg_sleep_label_slight);
                return;
            }
        }
        textView.setText(this.context.getString(R$string.health_sleep_daily_wake));
        String strC3 = z05.c(rqhVar.getTotalRemSleepAverageTime(), false);
        StringCompanionObject stringCompanionObject3 = StringCompanionObject.INSTANCE;
        String string3 = this.context.getString(R$string.health_sleep_analyze_time_scale);
        Intrinsics.checkNotNullExpressionValue(string3, "context.getString(R.stri…sleep_analyze_time_scale)");
        String str3 = String.format(string3, Arrays.copyOf(new Object[]{strC3, Integer.valueOf(rqhVar.getRemSleepScale())}, 2));
        Intrinsics.checkNotNullExpressionValue(str3, "format(...)");
        textView2.setText(str3);
        int iC = ybh.c(rqhVar.getRemSleepScale());
        if (iC == -1) {
            textView3.setText(this.context.getString(R$string.health_sleep_rahter_less));
            textView3.setBackgroundResource(R$drawable.health_sleep_bg_sleep_label_slight);
        } else if (iC == 0) {
            textView3.setText(this.context.getString(R$string.health_sleep_normal));
            textView3.setBackgroundResource(R$drawable.health_sleep_bg_sleep_label_normal);
        } else {
            if (iC != 1) {
                return;
            }
            textView3.setText(this.context.getString(R$string.health_sleep_rather_more));
            textView3.setBackgroundResource(R$drawable.health_sleep_bg_sleep_label_slight);
        }
    }
}
