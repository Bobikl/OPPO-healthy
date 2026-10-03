package com.oplus.aiunit.vision;

import android.content.Context;
import android.view.View;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.recyclerview.widget.RecyclerView;
import com.heytap.health.health.impl.R$layout;
import com.heytap.health.wallet.ui.adapter.BaseRecyclerViewHolder;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;
import p010kotlin.Unit;
import p010kotlin.jvm.functions.Function0;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes16.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\t0\u000b¢\u0006\u0004\b\u0011\u0010\u0012J\b\u0010\u0003\u001a\u00020\u0002H\u0016J \u0010\n\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0007H\u0016R\u001d\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\t0\u000b8\u0006¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0013"}, d2 = {"Lcom/oplus/aiunit/vision/cb9;", "Lcom/oplus/aiunit/vision/e7c;", "", "a", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", BaseRecyclerViewHolder.HOLDER_TAG_HEADER, "position", "Landroid/content/Context;", "context", "", "b", "Lkotlin/Function0;", "i", "Lkotlin/jvm/functions/Function0;", "getClickBlock", "()Lkotlin/jvm/functions/Function0;", "clickBlock", "<init>", "(Lkotlin/jvm/functions/Function0;)V", "health_impl_release"}, k = 1, mv = {1, 8, 0})
public final class cb9 extends e7c {
    public static final int $stable = 0;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @NotNull
    public final Function0<Unit> clickBlock;

    public cb9(@NotNull Function0<Unit> clickBlock) {
        Intrinsics.checkNotNullParameter(clickBlock, "clickBlock");
        this.clickBlock = clickBlock;
    }

    public static final void f(cb9 this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.clickBlock.invoke();
    }

    @Override // com.oplus.aiunit.vision.e7c
    public int a() {
        return R$layout.health_home_edit;
    }

    @Override // com.oplus.aiunit.vision.e7c
    public void b(@NotNull RecyclerView.ViewHolder holder, int position, @NotNull Context context) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        Intrinsics.checkNotNullParameter(context, "context");
        holder.itemView.setOnClickListener(new View.OnClickListener() { // from class: com.oplus.aiunit.vision.bb9
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                cb9.f(this.i, view);
            }
        });
    }
}
