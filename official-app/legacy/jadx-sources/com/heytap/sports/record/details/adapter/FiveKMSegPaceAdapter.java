package com.heytap.sports.record.details.adapter;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.recyclerview.widget.RecyclerView;
import com.heytap.databaseengine.model.FiveKmPlan;
import com.heytap.health.base.R$color;
import com.heytap.health.wallet.ui.adapter.BaseRecyclerViewHolder;
import com.heytap.log.formatter.LogFieldKey;
import com.heytap.sports.R$id;
import com.heytap.sports.R$layout;
import com.heytap.sports.R$string;
import com.oplus.aiunit.vision.nji;
import com.oplus.smartenginehelper.ParserTag;
import io.protostuff.MapSchema;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u0000 \u00182\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u0019\u001aB\u001d\u0012\u0006\u0010\u0010\u001a\u00020\r\u0012\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00120\u0011¢\u0006\u0004\b\u0016\u0010\u0017J\u0018\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0016J\u0018\u0010\u000b\u001a\u00020\n2\u0006\u0010\b\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\u0005H\u0016J\b\u0010\f\u001a\u00020\u0005H\u0016R\u0014\u0010\u0010\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u001c\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00120\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014¨\u0006\u001b"}, d2 = {"Lcom/heytap/sports/record/details/adapter/FiveKMSegPaceAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/heytap/sports/record/details/adapter/FiveKMSegPaceAdapter$PaceItemViewHolder;", "Landroid/view/ViewGroup;", "parent", "", ParserTag.VIEW_TYPE, MapSchema.FIELD_NAME_ENTRY, BaseRecyclerViewHolder.HOLDER_TAG_HEADER, "position", "", "d", "getItemCount", "Landroid/content/Context;", "i", "Landroid/content/Context;", "mContext", "", "Lcom/heytap/databaseengine/model/FiveKmPlan;", "j", "Ljava/util/List;", "list", "<init>", "(Landroid/content/Context;Ljava/util/List;)V", "Companion", "a", "PaceItemViewHolder", "sport_impl_release"}, k = 1, mv = {1, 8, 0})
public final class FiveKMSegPaceAdapter extends RecyclerView.Adapter<PaceItemViewHolder> {

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @NotNull
    public final Context mContext;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public List<? extends FiveKmPlan> list;
    public static final int $stable = 8;

    @StabilityInferred(parameters = 0)
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u0011\b\u0000\u0012\u0006\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u0017\u0010\n\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010\u0004\u001a\u0004\b\t\u0010\u0006R\u0017\u0010\r\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000b\u0010\u0004\u001a\u0004\b\f\u0010\u0006R\u0017\u0010\u0010\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u0004\u001a\u0004\b\u000f\u0010\u0006¨\u0006\u0015"}, d2 = {"Lcom/heytap/sports/record/details/adapter/FiveKMSegPaceAdapter$PaceItemViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "Landroid/widget/TextView;", "i", "Landroid/widget/TextView;", "d", "()Landroid/widget/TextView;", "type", "j", "b", "distance", MapSchema.FIELD_NAME_KEY, "c", "pace", LogFieldKey.LEVEL_KEY, "a", "content", "Landroid/view/View;", "itemView", "<init>", "(Landroid/view/View;)V", "sport_impl_release"}, k = 1, mv = {1, 8, 0})
    public static final class PaceItemViewHolder extends RecyclerView.ViewHolder {
        public static final int $stable = 8;

        /* JADX INFO: renamed from: i, reason: from kotlin metadata */
        @NotNull
        public final TextView type;

        /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
        @NotNull
        public final TextView distance;

        /* JADX INFO: renamed from: k, reason: from kotlin metadata */
        @NotNull
        public final TextView pace;

        /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
        @NotNull
        public final TextView content;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public PaceItemViewHolder(@NotNull View itemView) {
            super(itemView);
            Intrinsics.checkNotNullParameter(itemView, "itemView");
            View viewFindViewById = itemView.findViewById(R$id.tv_type);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById, "itemView.findViewById(R.id.tv_type)");
            this.type = (TextView) viewFindViewById;
            View viewFindViewById2 = itemView.findViewById(R$id.tv_distance);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "itemView.findViewById(R.id.tv_distance)");
            this.distance = (TextView) viewFindViewById2;
            View viewFindViewById3 = itemView.findViewById(R$id.tv_pace);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById3, "itemView.findViewById(R.id.tv_pace)");
            this.pace = (TextView) viewFindViewById3;
            View viewFindViewById4 = itemView.findViewById(R$id.tv_content);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById4, "itemView.findViewById(R.id.tv_content)");
            this.content = (TextView) viewFindViewById4;
        }

        @NotNull
        /* JADX INFO: renamed from: a, reason: from getter */
        public final TextView getContent() {
            return this.content;
        }

        @NotNull
        /* JADX INFO: renamed from: b, reason: from getter */
        public final TextView getDistance() {
            return this.distance;
        }

        @NotNull
        /* JADX INFO: renamed from: c, reason: from getter */
        public final TextView getPace() {
            return this.pace;
        }

        @NotNull
        /* JADX INFO: renamed from: d, reason: from getter */
        public final TextView getType() {
            return this.type;
        }
    }

    public FiveKMSegPaceAdapter(@NotNull Context mContext, @NotNull List<? extends FiveKmPlan> list) {
        Intrinsics.checkNotNullParameter(mContext, "mContext");
        Intrinsics.checkNotNullParameter(list, "list");
        this.mContext = mContext;
        this.list = list;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(@NotNull PaceItemViewHolder holder, int position) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        FiveKmPlan fiveKmPlan = this.list.get(position);
        StringBuilder sb = new StringBuilder();
        sb.append("onBindViewHolder type = ");
        sb.append(fiveKmPlan);
        if (fiveKmPlan.getType() == 2) {
            holder.getType().setText(this.mContext.getString(R$string.sports_health_record_five_km_seg_pace_type_2));
        } else {
            holder.getType().setText(this.mContext.getString(R$string.sports_run));
        }
        holder.getDistance().setText(fiveKmPlan.getDistance() + this.mContext.getString(R$string.sports_detail_elevation_chart_Y_description));
        holder.getPace().setText(nji.s((long) fiveKmPlan.getAvgPace()));
        if (fiveKmPlan.getAvgPace() < fiveKmPlan.getMinPace() && fiveKmPlan.getAvgPace() != 0) {
            holder.getContent().setVisibility(0);
            holder.getContent().setText(this.mContext.getString(R$string.sports_health_record_five_km_seg_pace_too_fast));
            holder.getContent().setTextColor(this.mContext.getColor(R$color.lib_base_color_text_too_fast));
            return;
        }
        if (fiveKmPlan.getAvgPace() <= fiveKmPlan.getMaxPace()) {
            holder.getContent().setVisibility(8);
            return;
        }
        holder.getContent().setVisibility(0);
        holder.getContent().setText(this.mContext.getString(R$string.sports_health_record_five_km_seg_pace_too_slow));
        holder.getContent().setTextColor(this.mContext.getColor(R$color.lib_base_color_text_too_slow));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    @NotNull
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public PaceItemViewHolder onCreateViewHolder(@NotNull ViewGroup parent, int viewType) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        View viewInflate = View.inflate(parent.getContext(), R$layout.sports_card_five_km_seg_pace_item, null);
        Intrinsics.checkNotNullExpressionValue(viewInflate, "inflate(parent.context, …e_km_seg_pace_item, null)");
        return new PaceItemViewHolder(viewInflate);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.list.size();
    }
}
