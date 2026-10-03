package com.heytap.health.heartrate.ui.adapter;

import android.annotation.SuppressLint;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.core.content.ContextCompat;
import androidx.recyclerview.widget.RecyclerView;
import com.heytap.databaseengine.model.HeartRateWarning;
import com.heytap.health.base.R$color;
import com.heytap.health.heartrate.R$drawable;
import com.heytap.health.heartrate.R$id;
import com.heytap.health.heartrate.R$layout;
import com.heytap.health.heartrate.R$string;
import com.heytap.health.heartrate.ui.HeartWarnListActivity;
import com.heytap.health.wallet.ui.adapter.BaseRecyclerViewHolder;
import com.heytap.log.formatter.LogFieldKey;
import com.oplus.aiunit.vision.b2n;
import com.oplus.aiunit.vision.b78;
import com.oplus.aiunit.vision.fn9;
import com.oplus.aiunit.vision.v05;
import com.oplus.smartenginehelper.ParserTag;
import io.protostuff.MapSchema;
import java.util.ArrayList;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.DefaultConstructorMarker;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes16.dex */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u001a\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001-B\u001b\u0012\b\b\u0002\u0010\u001c\u001a\u00020\r\u0012\b\b\u0002\u0010 \u001a\u00020\r¢\u0006\u0004\b+\u0010,J\u0018\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0016J\u0018\u0010\u000b\u001a\u00020\n2\u0006\u0010\b\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\u0005H\u0017J\b\u0010\f\u001a\u00020\u0005H\u0016J\u000e\u0010\u000f\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\rJ\u0014\u0010\u0013\u001a\u00020\n2\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010J\u0014\u0010\u0015\u001a\u00020\n2\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u0014R\"\u0010\u001c\u001a\u00020\r8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR\"\u0010 \u001a\u00020\r8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001d\u0010\u0017\u001a\u0004\b\u001e\u0010\u0019\"\u0004\b\u001f\u0010\u001bR\u0016\u0010\u000e\u001a\u00020\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b!\u0010\u0017R\u001c\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\"\u0010#R\"\u0010*\u001a\u00020\u00058\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'\"\u0004\b(\u0010)¨\u0006."}, d2 = {"Lcom/heytap/health/heartrate/ui/adapter/HeartRateWarnAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/heytap/health/heartrate/ui/adapter/HeartRateWarnAdapter$ViewHolder;", "Landroid/view/ViewGroup;", "parent", "", ParserTag.VIEW_TYPE, MapSchema.FIELD_NAME_ENTRY, BaseRecyclerViewHolder.HOLDER_TAG_HEADER, "position", "", "d", "getItemCount", "", HeartWarnListActivity.IS_DAY, b2n.f, "", "Lcom/heytap/databaseengine/model/HeartRateWarning;", "dataList", "setDataList", "", "f", "i", "Z", "getShowDivider", "()Z", "setShowDivider", "(Z)V", "showDivider", "j", "getShowNoMore", "setShowNoMore", "showNoMore", MapSchema.FIELD_NAME_KEY, LogFieldKey.LEVEL_KEY, "Ljava/util/List;", LogFieldKey.MESSAGE_KEY, "I", "getMaxCount", "()I", "setMaxCount", "(I)V", "maxCount", "<init>", "(ZZ)V", "ViewHolder", "heartrate_release"}, k = 1, mv = {1, 8, 0})
public final class HeartRateWarnAdapter extends RecyclerView.Adapter<ViewHolder> {

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    public boolean showDivider;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    public boolean showNoMore;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    public boolean isDay;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public List<HeartRateWarning> dataList;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    public int maxCount;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u000f\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u001a\u001a\u00020\u000e¢\u0006\u0004\b\u001b\u0010\u001cR\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u0017\u0010\n\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010\u0004\u001a\u0004\b\t\u0010\u0006R\u0017\u0010\r\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000b\u0010\u0004\u001a\u0004\b\f\u0010\u0006R\u0017\u0010\u0013\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0016\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0010\u001a\u0004\b\u0015\u0010\u0012R\u0017\u0010\u0019\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0004\u001a\u0004\b\u0018\u0010\u0006¨\u0006\u001d"}, d2 = {"Lcom/heytap/health/heartrate/ui/adapter/HeartRateWarnAdapter$ViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "Landroid/widget/TextView;", "i", "Landroid/widget/TextView;", "c", "()Landroid/widget/TextView;", "timeRangeTv", "j", "a", "heartRateRangeTv", MapSchema.FIELD_NAME_KEY, "f", "warnTypeTv", "Landroid/view/View;", LogFieldKey.LEVEL_KEY, "Landroid/view/View;", MapSchema.FIELD_NAME_ENTRY, "()Landroid/view/View;", "vDivider", LogFieldKey.MESSAGE_KEY, "b", "rootView", "n", "d", "tvNoMore", "itemView", "<init>", "(Landroid/view/View;)V", "heartrate_release"}, k = 1, mv = {1, 8, 0})
    public static final class ViewHolder extends RecyclerView.ViewHolder {

        /* JADX INFO: renamed from: i, reason: from kotlin metadata */
        @NotNull
        public final TextView timeRangeTv;

        /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
        @NotNull
        public final TextView heartRateRangeTv;

        /* JADX INFO: renamed from: k, reason: from kotlin metadata */
        @NotNull
        public final TextView warnTypeTv;

        /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
        @NotNull
        public final View vDivider;

        /* JADX INFO: renamed from: m, reason: from kotlin metadata */
        @NotNull
        public final View rootView;

        /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
        @NotNull
        public final TextView tvNoMore;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ViewHolder(@NotNull View itemView) {
            super(itemView);
            Intrinsics.checkNotNullParameter(itemView, "itemView");
            View viewFindViewById = itemView.findViewById(R$id.tv_time_range);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById, "itemView.findViewById(R.id.tv_time_range)");
            this.timeRangeTv = (TextView) viewFindViewById;
            View viewFindViewById2 = itemView.findViewById(R$id.tv_heart_rate_range);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "itemView.findViewById(R.id.tv_heart_rate_range)");
            this.heartRateRangeTv = (TextView) viewFindViewById2;
            View viewFindViewById3 = itemView.findViewById(R$id.tv_warn_type);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById3, "itemView.findViewById(R.id.tv_warn_type)");
            this.warnTypeTv = (TextView) viewFindViewById3;
            View viewFindViewById4 = itemView.findViewById(R$id.vDivider);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById4, "itemView.findViewById(R.id.vDivider)");
            this.vDivider = viewFindViewById4;
            View viewFindViewById5 = itemView.findViewById(R$id.rootView);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById5, "itemView.findViewById(R.id.rootView)");
            this.rootView = viewFindViewById5;
            View viewFindViewById6 = itemView.findViewById(R$id.tvNoMore);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById6, "itemView.findViewById(R.id.tvNoMore)");
            this.tvNoMore = (TextView) viewFindViewById6;
        }

        @NotNull
        /* JADX INFO: renamed from: a, reason: from getter */
        public final TextView getHeartRateRangeTv() {
            return this.heartRateRangeTv;
        }

        @NotNull
        /* JADX INFO: renamed from: b, reason: from getter */
        public final View getRootView() {
            return this.rootView;
        }

        @NotNull
        /* JADX INFO: renamed from: c, reason: from getter */
        public final TextView getTimeRangeTv() {
            return this.timeRangeTv;
        }

        @NotNull
        /* JADX INFO: renamed from: d, reason: from getter */
        public final TextView getTvNoMore() {
            return this.tvNoMore;
        }

        @NotNull
        /* JADX INFO: renamed from: e, reason: from getter */
        public final View getVDivider() {
            return this.vDivider;
        }

        @NotNull
        /* JADX INFO: renamed from: f, reason: from getter */
        public final TextView getWarnTypeTv() {
            return this.warnTypeTv;
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public HeartRateWarnAdapter() {
        boolean z = false;
        this(z, z, 3, null);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    @SuppressLint({"SetTextI18n"})
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(@NotNull ViewHolder holder, int position) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        HeartRateWarning heartRateWarning = this.dataList.get(position);
        String strG = fn9.g(heartRateWarning.getStartTimestamp(), this.isDay ? v05.DATE_FORMAT_HOUR : "yyyy/MM/dd HH:mm");
        holder.getTimeRangeTv().setText(strG + "-" + fn9.g(heartRateWarning.getEndTimestamp(), v05.DATE_FORMAT_HOUR));
        holder.getHeartRateRangeTv().setText(b78.a().getString(R$string.health_heart_rate_frequency, heartRateWarning.getMinHeartRate() + "-" + heartRateWarning.getMaxHeartRate()));
        holder.getWarnTypeTv().setText(heartRateWarning.getWarningType() == 1 ? b78.a().getString(R$string.health_heart_rate_warn_low) : b78.a().getString(R$string.health_heart_rate_warn_high));
        holder.getVDivider().setVisibility((!this.showDivider || position == 0) ? 8 : 0);
        if (position == 0) {
            if (this.showDivider) {
                holder.getRootView().setBackground(ContextCompat.getDrawable(holder.getRootView().getContext(), R$drawable.health_heart_rate_warn_view_top_bg));
            } else {
                holder.getRootView().setBackground(null);
            }
            holder.getTvNoMore().setVisibility(8);
            return;
        }
        if (position < this.maxCount - 1) {
            if (this.showDivider) {
                holder.getRootView().setBackgroundColor(ContextCompat.getColor(holder.getRootView().getContext(), R$color.lib_base_card_white_bg));
            } else {
                holder.getRootView().setBackground(null);
            }
            holder.getTvNoMore().setVisibility(8);
            return;
        }
        if (this.showDivider) {
            holder.getRootView().setBackground(ContextCompat.getDrawable(holder.getRootView().getContext(), R$drawable.health_heart_rate_warn_view_bottom_bg));
        } else {
            holder.getRootView().setBackground(null);
        }
        if (!this.showNoMore || this.maxCount <= 0) {
            return;
        }
        holder.getTvNoMore().setVisibility(0);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    @NotNull
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public ViewHolder onCreateViewHolder(@NotNull ViewGroup parent, int viewType) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        View view = LayoutInflater.from(parent.getContext()).inflate(R$layout.health_heart_rate_warn_data_item, parent, false);
        Intrinsics.checkNotNullExpressionValue(view, "view");
        return new ViewHolder(view);
    }

    public final void f(@NotNull List<? extends HeartRateWarning> dataList) {
        Intrinsics.checkNotNullParameter(dataList, "dataList");
        this.dataList.clear();
        this.dataList.addAll(dataList);
        notifyDataSetChanged();
    }

    public final void g(boolean isDay) {
        this.isDay = isDay;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.dataList.size();
    }

    public final void setDataList(@NotNull List<HeartRateWarning> dataList) {
        Intrinsics.checkNotNullParameter(dataList, "dataList");
        this.dataList = dataList;
    }

    public final void setMaxCount(int i) {
        this.maxCount = i;
    }

    public /* synthetic */ HeartRateWarnAdapter(boolean z, boolean z2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? false : z, (i & 2) != 0 ? false : z2);
    }

    public HeartRateWarnAdapter(boolean z, boolean z2) {
        this.showDivider = z;
        this.showNoMore = z2;
        this.dataList = new ArrayList();
    }
}
