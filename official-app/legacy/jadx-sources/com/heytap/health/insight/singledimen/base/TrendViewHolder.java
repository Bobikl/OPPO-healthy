package com.heytap.health.insight.singledimen.base;

import android.view.View;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.recyclerview.widget.RecyclerView;
import com.oplus.aiunit.vision.g11;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes16.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\b'\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&R$\u0010\f\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000b¨\u0006\u0011"}, d2 = {"Lcom/heytap/health/insight/singledimen/base/TrendViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "Lcom/oplus/aiunit/vision/g11;", "contentLogic", "", "b", "i", "Lcom/oplus/aiunit/vision/g11;", "a", "()Lcom/oplus/aiunit/vision/g11;", "c", "(Lcom/oplus/aiunit/vision/g11;)V", "beforeLogic", "Landroid/view/View;", "itemView", "<init>", "(Landroid/view/View;)V", "health_impl_release"}, k = 1, mv = {1, 8, 0})
public abstract class TrendViewHolder extends RecyclerView.ViewHolder {
    public static final int $stable = 8;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @Nullable
    public g11 beforeLogic;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TrendViewHolder(@NotNull View itemView) {
        super(itemView);
        Intrinsics.checkNotNullParameter(itemView, "itemView");
    }

    @Nullable
    /* JADX INFO: renamed from: a, reason: from getter */
    public final g11 getBeforeLogic() {
        return this.beforeLogic;
    }

    public abstract void b(@NotNull g11 contentLogic);

    public final void c(@Nullable g11 g11Var) {
        this.beforeLogic = g11Var;
    }
}
