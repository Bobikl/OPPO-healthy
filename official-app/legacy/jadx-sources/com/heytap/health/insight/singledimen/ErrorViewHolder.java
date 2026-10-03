package com.heytap.health.insight.singledimen;

import android.view.View;
import androidx.compose.runtime.internal.StabilityInferred;
import com.heytap.health.insight.singledimen.base.TrendViewHolder;
import com.oplus.aiunit.vision.g11;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes16.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\n"}, d2 = {"Lcom/heytap/health/insight/singledimen/ErrorViewHolder;", "Lcom/heytap/health/insight/singledimen/base/TrendViewHolder;", "Lcom/oplus/aiunit/vision/g11;", "contentLogic", "", "b", "Landroid/view/View;", "itemView", "<init>", "(Landroid/view/View;)V", "health_impl_release"}, k = 1, mv = {1, 8, 0})
public final class ErrorViewHolder extends TrendViewHolder {
    public static final int $stable = 0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ErrorViewHolder(@NotNull View itemView) {
        super(itemView);
        Intrinsics.checkNotNullParameter(itemView, "itemView");
    }

    @Override // com.heytap.health.insight.singledimen.base.TrendViewHolder
    public void b(@NotNull g11 contentLogic) {
        Intrinsics.checkNotNullParameter(contentLogic, "contentLogic");
    }
}
