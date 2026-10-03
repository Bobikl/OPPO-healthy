package com.heytap.health.step.detail.ui.stephistory2.detailitem;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.heytap.health.step.R$id;
import com.heytap.health.step.R$layout;
import com.heytap.health.wallet.ui.adapter.BaseRecyclerViewHolder;
import com.heytap.log.formatter.LogFieldKey;
import com.oplus.aiunit.vision.b2n;
import com.oplus.aiunit.vision.b78;
import com.oplus.aiunit.vision.e7c;
import com.oplus.aiunit.vision.t13;
import io.protostuff.MapSchema;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.DefaultConstructorMarker;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes18.dex */
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\b&\u0018\u00002\u00020\u0001:\u0001&B\u0011\u0012\b\b\u0002\u0010\u001f\u001a\u00020\u0019¢\u0006\u0004\b%\u0010\u001eJ\b\u0010\u0003\u001a\u00020\u0002H\u0016J\b\u0010\u0005\u001a\u00020\u0004H&J\b\u0010\u0007\u001a\u00020\u0006H\u0016J\b\u0010\b\u001a\u00020\u0006H\u0016J\b\u0010\t\u001a\u00020\u0004H\u0016J\b\u0010\n\u001a\u00020\u0006H\u0016J\b\u0010\f\u001a\u00020\u000bH\u0016J\u0006\u0010\r\u001a\u00020\u0006J\u0018\u0010\u0012\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0016J$\u0010\u0018\u001a\u00020\u000b2\b\u0010\u0014\u001a\u0004\u0018\u00010\u00132\u0006\u0010\u0015\u001a\u00020\u00022\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016H\u0016R\"\u0010\u001f\u001a\u00020\u00198\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0012\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR\"\u0010\u0017\u001a\u00020\u00168\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\r\u0010 \u001a\u0004\b!\u0010\"\"\u0004\b#\u0010$¨\u0006'"}, d2 = {"Lcom/heytap/health/step/detail/ui/stephistory2/detailitem/BaseItemView;", "Lcom/oplus/aiunit/vision/e7c;", "", "a", "", "f", "", LogFieldKey.LEVEL_KEY, "n", MapSchema.FIELD_NAME_ENTRY, LogFieldKey.MESSAGE_KEY, "", "o", "j", "Landroid/view/View;", "rootView", "Landroid/widget/FrameLayout;", "subViewRoot", "i", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", BaseRecyclerViewHolder.HOLDER_TAG_HEADER, "position", "Landroid/content/Context;", "context", "b", "Lcom/heytap/health/step/detail/ui/stephistory2/detailitem/BaseItemView$CARD_MODE;", "Lcom/heytap/health/step/detail/ui/stephistory2/detailitem/BaseItemView$CARD_MODE;", b2n.g, "()Lcom/heytap/health/step/detail/ui/stephistory2/detailitem/BaseItemView$CARD_MODE;", "setMode", "(Lcom/heytap/health/step/detail/ui/stephistory2/detailitem/BaseItemView$CARD_MODE;)V", "mode", "Landroid/content/Context;", b2n.f, "()Landroid/content/Context;", MapSchema.FIELD_NAME_KEY, "(Landroid/content/Context;)V", "<init>", "CARD_MODE", "step_release"}, k = 1, mv = {1, 8, 0})
public abstract class BaseItemView extends e7c {

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @NotNull
    public CARD_MODE mode;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public Context context;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lcom/heytap/health/step/detail/ui/stephistory2/detailitem/BaseItemView$CARD_MODE;", "", "(Ljava/lang/String;I)V", t13.DAY, t13.WEEK, t13.MONTH, t13.YEAR, "step_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public enum CARD_MODE {
        DAY,
        WEEK,
        MONTH,
        YEAR
    }

    /* JADX WARN: Multi-variable type inference failed */
    public BaseItemView() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    @Override // com.oplus.aiunit.vision.e7c
    public int a() {
        return R$layout.step_detail_base_item;
    }

    @Override // com.oplus.aiunit.vision.e7c
    public void b(@Nullable RecyclerView.ViewHolder holder, int position, @Nullable Context context) {
        if (context == null) {
            context = b78.a();
            Intrinsics.checkNotNullExpressionValue(context, "getAppContext()");
        }
        this.context = context;
        if ((holder != null ? holder.itemView : null) != null) {
            ((TextView) holder.itemView.findViewById(R$id.card_title)).setText(f());
            ((TextView) holder.itemView.findViewById(R$id.card_msg)).setText(e());
            ((ImageView) holder.itemView.findViewById(R$id.right_arrow)).setVisibility(l() ? 0 : 4);
            ((ImageView) holder.itemView.findViewById(R$id.divider_line)).setVisibility(n() ? 0 : 8);
            ((ImageView) holder.itemView.findViewById(R$id.cancel_button)).setVisibility(m() ? 0 : 4);
            View view = holder.itemView;
            Intrinsics.checkNotNullExpressionValue(view, "holder.itemView");
            View viewFindViewById = holder.itemView.findViewById(R$id.sub_view);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById, "holder.itemView.findViewById(R.id.sub_view)");
            i(view, (FrameLayout) viewFindViewById);
        }
    }

    @NotNull
    public String e() {
        return "";
    }

    @NotNull
    public abstract String f();

    @NotNull
    /* JADX INFO: renamed from: g, reason: from getter */
    public final Context getContext() {
        return this.context;
    }

    @NotNull
    /* JADX INFO: renamed from: h, reason: from getter */
    public final CARD_MODE getMode() {
        return this.mode;
    }

    public void i(@NotNull View rootView, @NotNull FrameLayout subViewRoot) {
        Intrinsics.checkNotNullParameter(rootView, "rootView");
        Intrinsics.checkNotNullParameter(subViewRoot, "subViewRoot");
    }

    public final boolean j() {
        return this.mode == CARD_MODE.DAY;
    }

    public final void k(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "<set-?>");
        this.context = context;
    }

    public boolean l() {
        return true;
    }

    public boolean m() {
        return false;
    }

    public boolean n() {
        return true;
    }

    public void o() {
    }

    public BaseItemView(@NotNull CARD_MODE mode) {
        Intrinsics.checkNotNullParameter(mode, "mode");
        this.mode = mode;
        Context contextA = b78.a();
        Intrinsics.checkNotNullExpressionValue(contextA, "getAppContext()");
        this.context = contextA;
    }

    public /* synthetic */ BaseItemView(CARD_MODE card_mode, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? CARD_MODE.DAY : card_mode);
    }
}
