package com.heytap.health.bloodpressure.util.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.recyclerview.widget.RecyclerView;
import com.coui.appcompat.checkbox.COUICheckBox;
import com.heytap.health.bloodpressure.R$id;
import com.heytap.health.bloodpressure.R$layout;
import com.heytap.health.bloodpressure.R$string;
import com.heytap.health.bloodpressure.bean.TodayTodoListBean;
import com.heytap.health.wallet.ui.adapter.BaseRecyclerViewHolder;
import com.oplus.smartenginehelper.ParserTag;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes15.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0019B\u0015\u0012\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00130\u0012¢\u0006\u0004\b\u0017\u0010\u0018J\u0018\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0016J\u0018\u0010\u000b\u001a\u00020\n2\u0006\u0010\b\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\u0005H\u0016J\b\u0010\f\u001a\u00020\u0005H\u0016J\u0018\u0010\u0011\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fH\u0002R\u001c\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00130\u00128\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015¨\u0006\u001a"}, d2 = {"Lcom/heytap/health/bloodpressure/util/adapter/BloodPressureTrainJoinedAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "Landroid/view/ViewGroup;", "parent", "", ParserTag.VIEW_TYPE, "onCreateViewHolder", BaseRecyclerViewHolder.HOLDER_TAG_HEADER, "position", "", "onBindViewHolder", "getItemCount", "", "type", "Landroid/content/Context;", "context", "d", "", "Lcom/heytap/health/bloodpressure/bean/TodayTodoListBean;", "i", "Ljava/util/List;", "itemList", "<init>", "(Ljava/util/List;)V", "TitleHolder", "blood_pressure_release"}, k = 1, mv = {1, 8, 0})
public final class BloodPressureTrainJoinedAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {
    public static final int $stable = 8;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @NotNull
    public List<TodayTodoListBean> itemList;

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0014\u0010\u0015R\"\u0010\t\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\"\u0010\u0011\u001a\u00020\n8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010¨\u0006\u0016"}, d2 = {"Lcom/heytap/health/bloodpressure/util/adapter/BloodPressureTrainJoinedAdapter$TitleHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "Landroid/widget/TextView;", "i", "Landroid/widget/TextView;", "b", "()Landroid/widget/TextView;", "setPendingName", "(Landroid/widget/TextView;)V", "pendingName", "Lcom/coui/appcompat/checkbox/COUICheckBox;", "j", "Lcom/coui/appcompat/checkbox/COUICheckBox;", "a", "()Lcom/coui/appcompat/checkbox/COUICheckBox;", "setPendingComplete", "(Lcom/coui/appcompat/checkbox/COUICheckBox;)V", "pendingComplete", "Landroid/view/View;", "itemView", "<init>", "(Landroid/view/View;)V", "blood_pressure_release"}, k = 1, mv = {1, 8, 0})
    public static final class TitleHolder extends RecyclerView.ViewHolder {

        /* JADX INFO: renamed from: i, reason: from kotlin metadata */
        @NotNull
        public TextView pendingName;

        /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
        @NotNull
        public COUICheckBox pendingComplete;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public TitleHolder(@NotNull View itemView) {
            super(itemView);
            Intrinsics.checkNotNullParameter(itemView, "itemView");
            View viewFindViewById = itemView.findViewById(R$id.item_pending_name);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById, "itemView.findViewById(R.id.item_pending_name)");
            this.pendingName = (TextView) viewFindViewById;
            View viewFindViewById2 = itemView.findViewById(R$id.item_pending_complete);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "itemView.findViewById(R.id.item_pending_complete)");
            this.pendingComplete = (COUICheckBox) viewFindViewById2;
        }

        @NotNull
        /* JADX INFO: renamed from: a, reason: from getter */
        public final COUICheckBox getPendingComplete() {
            return this.pendingComplete;
        }

        @NotNull
        /* JADX INFO: renamed from: b, reason: from getter */
        public final TextView getPendingName() {
            return this.pendingName;
        }
    }

    public BloodPressureTrainJoinedAdapter(@NotNull List<TodayTodoListBean> itemList) {
        Intrinsics.checkNotNullParameter(itemList, "itemList");
        this.itemList = itemList;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public final String d(String type, Context context) {
        switch (type) {
            case "sleep_classroom":
                String string = context.getString(R$string.health_blood_pressure_sleep_class);
                Intrinsics.checkNotNullExpressionValue(string, "context.getString(R.stri…ood_pressure_sleep_class)");
                return string;
            case "yesterday_sleep":
                String string2 = context.getString(R$string.health_blood_pressure_sleep_yesterday);
                Intrinsics.checkNotNullExpressionValue(string2, "context.getString(R.stri…pressure_sleep_yesterday)");
                return string2;
            case "health_evaluation":
                String string3 = context.getString(R$string.health_blood_pressure_health_assessment);
                Intrinsics.checkNotNullExpressionValue(string3, "context.getString(R.stri…essure_health_assessment)");
                return string3;
            case "motion_circle":
                String string4 = context.getString(R$string.health_blood_pressure_exercise_ring);
                Intrinsics.checkNotNullExpressionValue(string4, "context.getString(R.stri…d_pressure_exercise_ring)");
                return string4;
            case "diet_classroom":
                String string5 = context.getString(R$string.health_blood_pressure_diet_class);
                Intrinsics.checkNotNullExpressionValue(string5, "context.getString(R.stri…lood_pressure_diet_class)");
                return string5;
            case "diet_target":
                String string6 = context.getString(R$string.health_blood_pressure_diet_goals);
                Intrinsics.checkNotNullExpressionValue(string6, "context.getString(R.stri…lood_pressure_diet_goals)");
                return string6;
            default:
                if (type.equals("sleep_classroom")) {
                    String string7 = context.getString(R$string.health_blood_pressure_sleep_class);
                    Intrinsics.checkNotNullExpressionValue(string7, "context.getString(R.stri…ood_pressure_sleep_class)");
                    return string7;
                }
                return "";
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.itemList.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(@NotNull RecyclerView.ViewHolder holder, int position) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        TextView pendingName = ((TitleHolder) holder).getPendingName();
        String type = this.itemList.get(position).getType();
        Context context = holder.itemView.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "holder.itemView.context");
        pendingName.setText(d(type, context));
        TitleHolder titleHolder = (TitleHolder) holder;
        titleHolder.getPendingComplete().setClickable(false);
        titleHolder.getPendingComplete().setChecked(this.itemList.get(position).isCompleted());
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    @NotNull
    public RecyclerView.ViewHolder onCreateViewHolder(@NotNull ViewGroup parent, int viewType) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        View viewInflate = LayoutInflater.from(parent.getContext()).inflate(R$layout.health_blood_pressure_item_pending, parent, false);
        Intrinsics.checkNotNullExpressionValue(viewInflate, "from(parent.context)\n   …m_pending, parent, false)");
        return new TitleHolder(viewInflate);
    }
}
