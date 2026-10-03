package com.heytap.udeviceui.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.heytap.health.wallet.ui.adapter.BaseRecyclerViewHolder;
import com.heytap.nearx.tangramconfig.strategy.Fields;
import com.heytap.udeviceui.R$dimen;
import com.heytap.udeviceui.R$id;
import com.heytap.udeviceui.R$layout;
import com.oplus.aiunit.vision.n52;
import com.oplus.aiunit.vision.txa;
import com.oplus.deviceui.BatteryView;
import com.oplus.smartenginehelper.ParserTag;
import io.protostuff.MapSchema;
import java.util.ArrayList;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes18.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u000e\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\"B\u000f\u0012\u0006\u0010\u001f\u001a\u00020\u0015¢\u0006\u0004\b \u0010!J\u0018\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0016J\b\u0010\b\u001a\u00020\u0005H\u0016J\u0018\u0010\f\u001a\u00020\u000b2\u0006\u0010\t\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\u0005H\u0016J\u0014\u0010\u0010\u001a\u00020\u000b2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\rJ\u001e\u0010\u0014\u001a\u00020\u000b2\u0006\u0010\u0011\u001a\u00020\u00052\u0006\u0010\u0012\u001a\u00020\u00052\u0006\u0010\u0013\u001a\u00020\u0005R\u0016\u0010\u0018\u001a\u00020\u00158\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u001c\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u000e0\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0016\u0010\u001e\u001a\u00020\u00058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001c\u0010\u001d¨\u0006#"}, d2 = {"Lcom/heytap/udeviceui/adapter/LinkInfoAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/heytap/udeviceui/adapter/LinkInfoAdapter$ViewHolder;", "Landroid/view/ViewGroup;", "parent", "", ParserTag.VIEW_TYPE, MapSchema.FIELD_NAME_ENTRY, "getItemCount", BaseRecyclerViewHolder.HOLDER_TAG_HEADER, "position", "", "d", "", "Lcom/oplus/aiunit/vision/txa;", "list", "setList", Fields.WIDTH_FIELD, "dividerWidth", "count", "f", "Landroid/content/Context;", "i", "Landroid/content/Context;", "mContext", "j", "Ljava/util/List;", "mList", MapSchema.FIELD_NAME_KEY, "I", "mCellWidth", "context", "<init>", "(Landroid/content/Context;)V", "ViewHolder", "udeviceui_release"}, k = 1, mv = {1, 4, 2})
public final class LinkInfoAdapter extends RecyclerView.Adapter<ViewHolder> {

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    public Context mContext;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    public List<txa> mList;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    public int mCellWidth;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/heytap/udeviceui/adapter/LinkInfoAdapter$ViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "itemView", "Landroid/view/View;", "(Landroid/view/View;)V", "udeviceui_release"}, k = 1, mv = {1, 4, 2})
    public static final class ViewHolder extends RecyclerView.ViewHolder {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ViewHolder(@NotNull View itemView) {
            super(itemView);
            Intrinsics.checkNotNullParameter(itemView, "itemView");
        }
    }

    public LinkInfoAdapter(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.mContext = context;
        this.mList = new ArrayList();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(@NotNull ViewHolder holder, int position) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        txa txaVar = this.mList.get(position);
        if (this.mCellWidth <= 0) {
            View view = holder.itemView;
            Intrinsics.checkNotNullExpressionValue(view, "holder.itemView");
            view.getLayoutParams().width = this.mContext.getResources().getDimensionPixelSize(R$dimen.link_action_cell_width);
        } else {
            View view2 = holder.itemView;
            Intrinsics.checkNotNullExpressionValue(view2, "holder.itemView");
            view2.getLayoutParams().width = this.mCellWidth;
        }
        View view3 = holder.itemView;
        Intrinsics.checkNotNullExpressionValue(view3, "holder.itemView");
        TextView textView = (TextView) view3.findViewById(R$id.mTextBatteryName);
        Intrinsics.checkNotNullExpressionValue(textView, "holder.itemView.mTextBatteryName");
        textView.setText(txaVar.getCom.heytap.speech.engine.protocol.event.payload.analogclick.Feedback.WIDGET_LABEL java.lang.String());
        View view4 = holder.itemView;
        Intrinsics.checkNotNullExpressionValue(view4, "holder.itemView");
        int i = R$id.mIconBattery;
        BatteryView batteryView = (BatteryView) view4.findViewById(i);
        Intrinsics.checkNotNullExpressionValue(batteryView, "holder.itemView.mIconBattery");
        batteryView.setVisibility(8);
        if (txaVar.getShowBattery()) {
            View view5 = holder.itemView;
            Intrinsics.checkNotNullExpressionValue(view5, "holder.itemView");
            BatteryView batteryView2 = (BatteryView) view5.findViewById(i);
            Intrinsics.checkNotNullExpressionValue(batteryView2, "holder.itemView.mIconBattery");
            batteryView2.setVisibility(0);
            View view6 = holder.itemView;
            Intrinsics.checkNotNullExpressionValue(view6, "holder.itemView");
            ((BatteryView) view6.findViewById(i)).setPower(txaVar.getValue());
            View view7 = holder.itemView;
            Intrinsics.checkNotNullExpressionValue(view7, "holder.itemView");
            ((BatteryView) view7.findViewById(i)).setIsCharging(txaVar.getIsCharging());
            View view8 = holder.itemView;
            Intrinsics.checkNotNullExpressionValue(view8, "holder.itemView");
            int i2 = R$id.mTextBatteryValue;
            TextView textView2 = (TextView) view8.findViewById(i2);
            Intrinsics.checkNotNullExpressionValue(textView2, "holder.itemView.mTextBatteryValue");
            textView2.setTextSize(14.0f);
            View view9 = holder.itemView;
            Intrinsics.checkNotNullExpressionValue(view9, "holder.itemView");
            TextView textView3 = (TextView) view9.findViewById(i2);
            Intrinsics.checkNotNullExpressionValue(textView3, "holder.itemView.mTextBatteryValue");
            textView3.setLineHeight(this.mContext.getResources().getDimensionPixelSize(R$dimen.link_action_text_height));
        } else {
            View view10 = holder.itemView;
            Intrinsics.checkNotNullExpressionValue(view10, "holder.itemView");
            BatteryView batteryView3 = (BatteryView) view10.findViewById(i);
            Intrinsics.checkNotNullExpressionValue(batteryView3, "holder.itemView.mIconBattery");
            batteryView3.setVisibility(8);
            View view11 = holder.itemView;
            Intrinsics.checkNotNullExpressionValue(view11, "holder.itemView");
            int i3 = R$id.mTextBatteryValue;
            TextView textView4 = (TextView) view11.findViewById(i3);
            Intrinsics.checkNotNullExpressionValue(textView4, "holder.itemView.mTextBatteryValue");
            textView4.setTextSize(16.0f);
            View view12 = holder.itemView;
            Intrinsics.checkNotNullExpressionValue(view12, "holder.itemView");
            TextView textView5 = (TextView) view12.findViewById(i3);
            Intrinsics.checkNotNullExpressionValue(textView5, "holder.itemView.mTextBatteryValue");
            textView5.setLineHeight(this.mContext.getResources().getDimensionPixelSize(R$dimen.list_title_text_height));
        }
        View view13 = holder.itemView;
        Intrinsics.checkNotNullExpressionValue(view13, "holder.itemView");
        TextView textView6 = (TextView) view13.findViewById(R$id.mTextBatteryValue);
        Intrinsics.checkNotNullExpressionValue(textView6, "holder.itemView.mTextBatteryValue");
        textView6.setText(txaVar.getValueShow());
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    @NotNull
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public ViewHolder onCreateViewHolder(@NotNull ViewGroup parent, int viewType) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        View convertView = LayoutInflater.from(this.mContext).inflate(n52.INSTANCE.a() ? R$layout.link_text_item_op : R$layout.link_text_item, parent, false);
        Intrinsics.checkNotNullExpressionValue(convertView, "convertView");
        return new ViewHolder(convertView);
    }

    public final void f(int width, int dividerWidth, int count) {
        this.mCellWidth = (width <= 0 || count <= 0) ? this.mContext.getResources().getDimensionPixelSize(R$dimen.link_action_cell_width) : (width - ((count - 1) * dividerWidth)) / count;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.mList.size();
    }

    public final void setList(@NotNull List<txa> list) {
        Intrinsics.checkNotNullParameter(list, "list");
        this.mList.clear();
        this.mList.addAll(list);
        notifyDataSetChanged();
    }
}
