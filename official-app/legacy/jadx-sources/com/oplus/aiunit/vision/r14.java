package com.oplus.aiunit.vision;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.recyclerview.widget.RecyclerView;
import com.heytap.health.daily.R$id;
import com.heytap.health.daily.R$layout;
import com.heytap.health.daily.ui.itemview.CardMode;
import com.heytap.health.wallet.ui.adapter.BaseRecyclerViewHolder;
import com.heytap.log.formatter.LogFieldKey;
import io.protostuff.MapSchema;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes16.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0013\b'\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u001f\u001a\u00020\u0019¢\u0006\u0004\b+\u0010\u001eJ\b\u0010\u0003\u001a\u00020\u0002H\u0016J\b\u0010\u0005\u001a\u00020\u0004H&J\b\u0010\u0007\u001a\u00020\u0006H\u0016J\b\u0010\b\u001a\u00020\u0006H\u0016J\b\u0010\t\u001a\u00020\u0004H\u0016J\b\u0010\n\u001a\u00020\u0006H\u0016J\u0006\u0010\u000b\u001a\u00020\u0006J\u0018\u0010\u0011\u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0016J$\u0010\u0017\u001a\u00020\u00102\b\u0010\u0013\u001a\u0004\u0018\u00010\u00122\u0006\u0010\u0014\u001a\u00020\u00022\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015H\u0016J\b\u0010\u0018\u001a\u00020\u0010H\u0016R\"\u0010\u001f\u001a\u00020\u00198\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001a\u0010\u001c\"\u0004\b\u001d\u0010\u001eR\"\u0010\u0016\u001a\u00020\u00158\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0011\u0010 \u001a\u0004\b!\u0010\"\"\u0004\b#\u0010$R\"\u0010*\u001a\u00020\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000b\u0010%\u001a\u0004\b&\u0010'\"\u0004\b(\u0010)¨\u0006,"}, d2 = {"Lcom/oplus/aiunit/vision/r14;", "Lcom/oplus/aiunit/vision/e7c;", "", "a", "", b2n.f, "", "o", "q", "f", LogFieldKey.PROCESS_NAME_KEY, MapSchema.FIELD_NAME_KEY, "Landroid/view/View;", "rootView", "Landroid/widget/FrameLayout;", "subViewRoot", "", "j", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", BaseRecyclerViewHolder.HOLDER_TAG_HEADER, "position", "Landroid/content/Context;", "context", "b", MapSchema.FIELD_NAME_ENTRY, "Lcom/heytap/health/daily/ui/itemview/CardMode;", "i", "Lcom/heytap/health/daily/ui/itemview/CardMode;", "()Lcom/heytap/health/daily/ui/itemview/CardMode;", "setMode", "(Lcom/heytap/health/daily/ui/itemview/CardMode;)V", "mode", "Landroid/content/Context;", b2n.g, "()Landroid/content/Context;", LogFieldKey.MESSAGE_KEY, "(Landroid/content/Context;)V", "Z", LogFieldKey.LEVEL_KEY, "()Z", "n", "(Z)V", "isShowReported", "<init>", "daily_release"}, k = 1, mv = {1, 8, 0})
public abstract class r14 extends e7c {
    public static final int $stable = 8;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @NotNull
    public CardMode mode;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public Context context;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    public boolean isShowReported;

    public r14(@NotNull CardMode mode) {
        Intrinsics.checkNotNullParameter(mode, "mode");
        this.mode = mode;
        Context contextA = b78.a();
        Intrinsics.checkNotNullExpressionValue(contextA, "getAppContext()");
        this.context = contextA;
    }

    @Override // com.oplus.aiunit.vision.e7c
    public int a() {
        return R$layout.health_daily_view_consumption_detail_base_item;
    }

    @Override // com.oplus.aiunit.vision.e7c
    public void b(@Nullable RecyclerView.ViewHolder holder, int position, @Nullable Context context) {
        if (context == null) {
            context = b78.a();
            Intrinsics.checkNotNullExpressionValue(context, "getAppContext()");
        }
        this.context = context;
        if ((holder != null ? holder.itemView : null) != null) {
            TextView textView = (TextView) holder.itemView.findViewById(R$id.card_title);
            TextView textView2 = (TextView) holder.itemView.findViewById(R$id.card_msg);
            ImageView imageView = (ImageView) holder.itemView.findViewById(R$id.right_arrow);
            ImageView imageView2 = (ImageView) holder.itemView.findViewById(R$id.divider_line);
            ImageView imageView3 = (ImageView) holder.itemView.findViewById(R$id.cancel_button);
            FrameLayout subView = (FrameLayout) holder.itemView.findViewById(R$id.sub_view);
            textView.setText(g());
            textView2.setText(f());
            imageView.setVisibility(o() ? 0 : 4);
            imageView2.setVisibility(q() ? 0 : 8);
            imageView3.setVisibility(p() ? 0 : 4);
            View view = holder.itemView;
            Intrinsics.checkNotNullExpressionValue(view, "holder.itemView");
            Intrinsics.checkNotNullExpressionValue(subView, "subView");
            j(view, subView);
        }
    }

    public void e() {
    }

    @NotNull
    public String f() {
        return "";
    }

    @NotNull
    public abstract String g();

    @NotNull
    /* JADX INFO: renamed from: h, reason: from getter */
    public final Context getContext() {
        return this.context;
    }

    @NotNull
    /* JADX INFO: renamed from: i, reason: from getter */
    public final CardMode getMode() {
        return this.mode;
    }

    public void j(@NotNull View rootView, @NotNull FrameLayout subViewRoot) {
        Intrinsics.checkNotNullParameter(rootView, "rootView");
        Intrinsics.checkNotNullParameter(subViewRoot, "subViewRoot");
    }

    public final boolean k() {
        return this.mode == CardMode.DAY;
    }

    /* JADX INFO: renamed from: l, reason: from getter */
    public final boolean getIsShowReported() {
        return this.isShowReported;
    }

    public final void m(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "<set-?>");
        this.context = context;
    }

    public final void n(boolean z) {
        this.isShowReported = z;
    }

    public boolean o() {
        return true;
    }

    public boolean p() {
        return false;
    }

    public boolean q() {
        return true;
    }
}
