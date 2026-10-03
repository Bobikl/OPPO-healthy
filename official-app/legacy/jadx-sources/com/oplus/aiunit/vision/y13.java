package com.oplus.aiunit.vision;

import android.R;
import android.content.Context;
import android.graphics.Typeface;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.compose.runtime.internal.StabilityInferred;
import com.heytap.health.ui.R$color;
import com.heytap.health.ui.R$layout;
import com.heytap.health.wallet.ui.adapter.BaseRecyclerViewHolder;
import com.heytap.sporthealth.blib.adapter.face.OnViewClickListener;
import com.heytap.sporthealth.blib.adapter.holder.JViewHolder;
import com.heytap.sporthealth.blib.adapter.vb.JViewBean;
import com.heytap.sporthealth.blib.weiget.ItemSettingListAutoShapeCard;
import io.protostuff.MapSchema;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.collections.CollectionsKt___CollectionsKt;
import p010kotlin.jvm.internal.Intrinsics;
import p010kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: classes2.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010!\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u000f\b\u0017\u0018\u00002\u00020\u0001B\u0017\u0012\u000e\u0010\u0014\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u000f0\u000e¢\u0006\u0004\b\u001c\u0010\u001dJ8\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00062\u000e\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\tH\u0016J\b\u0010\r\u001a\u00020\u0004H\u0016R\u001f\u0010\u0014\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u000f0\u000e8\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R$\u0010\u001b\u001a\u0004\u0018\u00010\u000f8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001a¨\u0006\u001e"}, d2 = {"Lcom/oplus/aiunit/vision/y13;", "Lcom/heytap/sporthealth/blib/adapter/vb/JViewBean;", "Lcom/heytap/sporthealth/blib/adapter/holder/JViewHolder;", BaseRecyclerViewHolder.HOLDER_TAG_HEADER, "", "position", "", "", "payloads", "Lcom/heytap/sporthealth/blib/adapter/face/OnViewClickListener;", "viewClickListener", "", "onBindViewHolder", "bindLayout", "", "Lcom/oplus/aiunit/vision/e03;", "i", "Ljava/util/List;", "b", "()Ljava/util/List;", "cardItems", "j", "Lcom/oplus/aiunit/vision/e03;", "c", "()Lcom/oplus/aiunit/vision/e03;", MapSchema.FIELD_NAME_ENTRY, "(Lcom/oplus/aiunit/vision/e03;)V", "clickedItem", "<init>", "(Ljava/util/List;)V", "lib_ui_release"}, k = 1, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nRecycleCardView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RecycleCardView.kt\ncom/heytap/sporthealth/blib/weiget/CardViewBean\n+ 2 UIConfig.kt\ncom/heytap/sporthealth/blib/helper/UIConfigKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,100:1\n155#2:101\n1855#3:102\n1856#3:104\n1#4:103\n*S KotlinDebug\n*F\n+ 1 RecycleCardView.kt\ncom/heytap/sporthealth/blib/weiget/CardViewBean\n*L\n74#1:101\n76#1:102\n76#1:104\n*E\n"})
public class y13 extends JViewBean {
    public static final int $stable = 8;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @NotNull
    public final List<e03> cardItems;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public e03 clickedItem;

    /* JADX WARN: Multi-variable type inference failed */
    public y13(@NotNull List<? extends e03> cardItems) {
        Intrinsics.checkNotNullParameter(cardItems, "cardItems");
        this.cardItems = cardItems;
        this.clickedItem = cardItems.isEmpty() ? null : (e03) CollectionsKt___CollectionsKt.first((List) cardItems);
    }

    public static final void d(y13 this$0, e03 it, OnViewClickListener onViewClickListener, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(it, "$it");
        this$0.e(it);
        if (onViewClickListener != null) {
            onViewClickListener.onItemClicked(view, this$0);
        }
    }

    @NotNull
    public final List<e03> b() {
        return this.cardItems;
    }

    @Override // com.heytap.sporthealth.blib.adapter.vb.JViewBean
    public int bindLayout() {
        return R$layout.lib_ui_card_item;
    }

    @Nullable
    /* JADX INFO: renamed from: c, reason: from getter */
    public e03 getClickedItem() {
        return this.clickedItem;
    }

    public void e(@Nullable e03 e03Var) {
        this.clickedItem = e03Var;
    }

    @Override // com.heytap.sporthealth.blib.adapter.face.IRecvData
    public void onBindViewHolder(@NotNull JViewHolder holder, int position, @Nullable List<Object> payloads, @Nullable final OnViewClickListener<Object> viewClickListener) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        View view = holder.itemView;
        if (!(view instanceof LinearLayout)) {
            view = null;
        }
        LinearLayout linearLayout = (LinearLayout) view;
        if (linearLayout != null) {
            linearLayout.removeAllViews();
            for (final e03 e03Var : this.cardItems) {
                Context context = linearLayout.getContext();
                String strE = rg7.e(e03Var.getTitle());
                Integer num = e03Var.getCom.heytap.speech.engine.protocol.event.payload.analogclick.Feedback.WIDGET_SUBTITLE java.lang.String();
                String strE2 = num != null ? rg7.e(num.intValue()) : null;
                if (strE2 == null) {
                    strE2 = "";
                } else {
                    Intrinsics.checkNotNullExpressionValue(strE2, "it.subTitle?.run(FitApp::findString) ?: \"\"");
                }
                String str = strE2;
                Integer icon = e03Var.getIcon();
                Integer color = e03Var.getColor();
                Integer assignment = e03Var.getAssignment();
                String strE3 = assignment != null ? rg7.e(assignment.intValue()) : null;
                int color2 = b78.a().getColor(R$color.lib_ui_black_ff);
                Intrinsics.checkNotNullExpressionValue(context, "context");
                Intrinsics.checkNotNullExpressionValue(strE, "findString(it.title)");
                ItemSettingListAutoShapeCard itemSettingListAutoShapeCardF = ItemSettingListAutoShapeCard.f(new ItemSettingListAutoShapeCard(context, strE, str, true, icon, strE3, color, null, Integer.valueOf(color2), 128, null), null, 1, null);
                itemSettingListAutoShapeCardF.setOnClickListener(new View.OnClickListener() { // from class: com.oplus.aiunit.vision.x13
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view2) {
                        y13.d(this.i, e03Var, viewClickListener, view2);
                    }
                });
                linearLayout.addView(itemSettingListAutoShapeCardF, -1, -2);
                if (e03Var.getShow()) {
                    itemSettingListAutoShapeCardF.setVisibility(0);
                } else {
                    itemSettingListAutoShapeCardF.setVisibility(8);
                }
                ((TextView) itemSettingListAutoShapeCardF.findViewById(R.id.title)).setTypeface(Typeface.create("sans-serif-regular", 0));
                itemSettingListAutoShapeCardF.b(e03Var.getShowRedDot());
            }
        }
    }
}
