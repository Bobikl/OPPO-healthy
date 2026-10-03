package com.heytap.health.bloodoxygen.adapter;

import android.annotation.SuppressLint;
import android.content.Context;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.content.ContextCompat;
import com.heytap.databaseengine.model.Spo2Warning;
import com.heytap.health.base.R$color;
import com.heytap.health.base.base.BaseRecyclerAdapter;
import com.heytap.health.base.base.BaseViewHolder;
import com.heytap.health.bloodoxygen.R$drawable;
import com.heytap.health.bloodoxygen.R$id;
import com.heytap.health.bloodoxygen.R$layout;
import com.heytap.health.bloodoxygen.R$string;
import com.heytap.health.wallet.ui.adapter.BaseRecyclerViewHolder;
import com.heytap.log.formatter.LogFieldKey;
import com.oplus.aiunit.vision.fn9;
import com.oplus.aiunit.vision.v05;
import io.protostuff.MapSchema;
import java.util.Arrays;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.DefaultConstructorMarker;
import p010kotlin.jvm.internal.Intrinsics;
import p010kotlin.jvm.internal.StringCompanionObject;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0016\n\u0002\u0010 \n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B1\u0012\u0006\u0010\f\u001a\u00020\t\u0012\f\u0010%\u001a\b\u0012\u0004\u0012\u00020\u00020$\u0012\b\b\u0002\u0010\u0014\u001a\u00020\r\u0012\b\b\u0002\u0010\u0018\u001a\u00020\r¢\u0006\u0004\b&\u0010'J\u0018\u0010\b\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0017R\u0014\u0010\f\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\"\u0010\u0014\u001a\u00020\r8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\"\u0010\u0018\u001a\u00020\r8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0015\u0010\u000f\u001a\u0004\b\u0016\u0010\u0011\"\u0004\b\u0017\u0010\u0013R\"\u0010\u001f\u001a\u00020\u00058\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR\"\u0010#\u001a\u00020\u00058\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b \u0010\u001a\u001a\u0004\b!\u0010\u001c\"\u0004\b\"\u0010\u001e¨\u0006("}, d2 = {"Lcom/heytap/health/bloodoxygen/adapter/Spo2WarningAdapter;", "Lcom/heytap/health/base/base/BaseRecyclerAdapter;", "Lcom/heytap/databaseengine/model/Spo2Warning;", "Lcom/heytap/health/base/base/BaseViewHolder;", BaseRecyclerViewHolder.HOLDER_TAG_HEADER, "", "position", "", MapSchema.FIELD_NAME_ENTRY, "Landroid/content/Context;", LogFieldKey.MESSAGE_KEY, "Landroid/content/Context;", "context", "", "n", "Z", "getShowDivider", "()Z", "setShowDivider", "(Z)V", "showDivider", "o", "getShowNoMore", "setShowNoMore", "showNoMore", LogFieldKey.PROCESS_NAME_KEY, "I", "getType", "()I", "setType", "(I)V", "type", "q", "getMaxCount", "setMaxCount", "maxCount", "", "data", "<init>", "(Landroid/content/Context;Ljava/util/List;ZZ)V", "blood_oxygen_release"}, k = 1, mv = {1, 8, 0})
public final class Spo2WarningAdapter extends BaseRecyclerAdapter<Spo2Warning> {

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    @NotNull
    public final Context context;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    public boolean showDivider;

    /* JADX INFO: renamed from: o, reason: from kotlin metadata */
    public boolean showNoMore;

    /* JADX INFO: renamed from: p, reason: from kotlin metadata */
    public int type;

    /* JADX INFO: renamed from: q, reason: from kotlin metadata */
    public int maxCount;

    public /* synthetic */ Spo2WarningAdapter(Context context, List list, boolean z, boolean z2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, list, (i & 4) != 0 ? false : z, (i & 8) != 0 ? false : z2);
    }

    @Override // com.heytap.health.base.base.BaseRecyclerAdapter
    @SuppressLint({"SetTextI18n"})
    public void e(@NotNull BaseViewHolder holder, int position) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        Object obj = this.i.get(position);
        Intrinsics.checkNotNull(obj);
        Spo2Warning spo2Warning = (Spo2Warning) obj;
        ConstraintLayout constraintLayout = (ConstraintLayout) holder.getView(R$id.rootView);
        TextView textView = (TextView) holder.getView(R$id.tv_time_range);
        TextView textView2 = (TextView) holder.getView(R$id.tv_warning_value);
        TextView textView3 = (TextView) holder.getView(R$id.tvNoMore);
        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
        String string = this.context.getString(R$string.health_blood_oxygen_warning_range);
        Intrinsics.checkNotNullExpressionValue(string, "context.getString(R.stri…ood_oxygen_warning_range)");
        String str = String.format(string, Arrays.copyOf(new Object[]{String.valueOf(spo2Warning.getLowestValue()), String.valueOf(spo2Warning.getHighestValue())}, 2));
        Intrinsics.checkNotNullExpressionValue(str, "format(...)");
        textView2.setText(str);
        textView.setText(fn9.g(spo2Warning.getStartTimestamp(), this.type == 0 ? v05.DATE_FORMAT_HOUR : "yyyy/MM/dd HH:mm") + "-" + fn9.g(spo2Warning.getEndTimestamp(), v05.DATE_FORMAT_HOUR));
        holder.getView(R$id.vDivider).setVisibility((!this.showDivider || position == 0) ? 8 : 0);
        if (position == 0) {
            constraintLayout.setBackground(ContextCompat.getDrawable(this.context, R$drawable.health_blood_oxygen_warn_top_bg));
            textView3.setVisibility(8);
        } else {
            if (position < this.maxCount - 1) {
                constraintLayout.setBackgroundColor(ContextCompat.getColor(this.context, R$color.lib_base_card_white_bg));
                textView3.setVisibility(8);
                return;
            }
            constraintLayout.setBackground(ContextCompat.getDrawable(this.context, R$drawable.health_blood_oxygen_warn_bottom_bg));
            if (!this.showNoMore || this.maxCount <= 0) {
                return;
            }
            textView3.setVisibility(0);
        }
    }

    public final void setMaxCount(int i) {
        this.maxCount = i;
    }

    public final void setType(int i) {
        this.type = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Spo2WarningAdapter(@NotNull Context context, @NotNull List<? extends Spo2Warning> data, boolean z, boolean z2) {
        super(data, R$layout.health_spo2_warning_view_item);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(data, "data");
        this.context = context;
        this.showDivider = z;
        this.showNoMore = z2;
        this.type = 1;
    }
}
