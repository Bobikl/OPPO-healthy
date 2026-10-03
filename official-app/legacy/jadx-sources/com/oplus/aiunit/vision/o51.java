package com.oplus.aiunit.vision;

import android.content.Context;
import android.view.View;
import android.widget.TextView;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.recyclerview.widget.RecyclerView;
import com.heytap.health.base.R$color;
import com.heytap.health.bloodpressure.R$id;
import com.heytap.health.wallet.ui.adapter.BaseRecyclerViewHolder;
import com.heytap.log.formatter.LogFieldKey;
import io.protostuff.MapSchema;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes15.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0014\b'\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b%\u0010&J\b\u0010\u0003\u001a\u00020\u0002H\u0016J\b\u0010\u0004\u001a\u00020\u0002H\u0016J\b\u0010\u0006\u001a\u00020\u0005H&J\b\u0010\u0007\u001a\u00020\u0005H\u0016J\b\u0010\t\u001a\u00020\bH\u0016J\b\u0010\u000b\u001a\u00020\nH&J\b\u0010\f\u001a\u00020\nH&J$\u0010\u0012\u001a\u00020\n2\b\u0010\u000e\u001a\u0004\u0018\u00010\r2\u0006\u0010\u000f\u001a\u00020\b2\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u0016R$\u0010\u0019\u001a\u0004\u0018\u00010\u00138\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0014\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\"\u0010\u001f\u001a\u00020\u00108\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000b\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR\"\u0010!\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0004\u0010 \u001a\u0004\b!\u0010\"\"\u0004\b#\u0010$¨\u0006'"}, d2 = {"Lcom/oplus/aiunit/vision/o51;", "Lcom/oplus/aiunit/vision/e7c;", "", LogFieldKey.LEVEL_KEY, MapSchema.FIELD_NAME_KEY, "", b2n.f, MapSchema.FIELD_NAME_ENTRY, "", "f", "", "j", LogFieldKey.MESSAGE_KEY, "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", BaseRecyclerViewHolder.HOLDER_TAG_HEADER, "position", "Landroid/content/Context;", "context", "b", "Landroid/view/View;", "i", "Landroid/view/View;", "()Landroid/view/View;", "setMRootView", "(Landroid/view/View;)V", "mRootView", "Landroid/content/Context;", b2n.g, "()Landroid/content/Context;", "setMContext", "(Landroid/content/Context;)V", "mContext", "Z", "isFirstLoad", "()Z", "setFirstLoad", "(Z)V", "<init>", "()V", "blood_pressure_release"}, k = 1, mv = {1, 8, 0})
public abstract class o51 extends e7c {
    public static final int $stable = 8;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @Nullable
    public View mRootView;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public Context mContext;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    public boolean isFirstLoad;

    public o51() {
        Context contextA = b78.a();
        Intrinsics.checkNotNullExpressionValue(contextA, "getAppContext()");
        this.mContext = contextA;
    }

    @Override // com.oplus.aiunit.vision.e7c
    public void b(@Nullable RecyclerView.ViewHolder holder, int position, @Nullable Context context) {
        View view;
        if (context != null) {
            this.mContext = context;
        }
        if (holder == null || (view = holder.itemView) == null) {
            return;
        }
        this.mRootView = view;
        TextView textView = (TextView) view.findViewById(R$id.card_title);
        if (textView != null) {
            textView.setText(g());
        }
        TextView textView2 = (TextView) view.findViewById(R$id.card_msg);
        if (textView2 != null) {
            Intrinsics.checkNotNullExpressionValue(textView2, "findViewById<TextView>(R.id.card_msg)");
            textView2.setText(e());
            textView2.setTextColor(f());
        }
        View viewFindViewById = view.findViewById(R$id.card_right_arrow);
        if (viewFindViewById != null) {
            viewFindViewById.setVisibility(l() ? 0 : 8);
        }
        View viewFindViewById2 = view.findViewById(R$id.card_divider_line);
        if (viewFindViewById2 != null) {
            viewFindViewById2.setVisibility(k() ? 0 : 8);
        }
        j();
        this.isFirstLoad = true;
        m();
    }

    @NotNull
    public String e() {
        return "";
    }

    public int f() {
        return this.mContext.getColor(R$color.lib_base_color_text_black_4D);
    }

    @NotNull
    public abstract String g();

    @NotNull
    /* JADX INFO: renamed from: h, reason: from getter */
    public final Context getMContext() {
        return this.mContext;
    }

    @Nullable
    /* JADX INFO: renamed from: i, reason: from getter */
    public final View getMRootView() {
        return this.mRootView;
    }

    public abstract void j();

    public boolean k() {
        return true;
    }

    public boolean l() {
        return true;
    }

    public abstract void m();
}
