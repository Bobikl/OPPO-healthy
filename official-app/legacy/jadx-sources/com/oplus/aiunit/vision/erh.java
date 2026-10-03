package com.oplus.aiunit.vision;

import android.content.Context;
import android.view.View;
import androidx.compose.runtime.internal.StabilityInferred;
import com.heytap.health.base.base.BaseFragment;
import com.heytap.log.formatter.LogFieldKey;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes18.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\b'\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0010\u001a\u00020\t¢\u0006\u0004\b\u0011\u0010\u000fJ&\u0010\b\u001a\u00020\u00072\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004H\u0016R\"\u0010\u0010\u001a\u00020\t8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000f¨\u0006\u0012"}, d2 = {"Lcom/oplus/aiunit/vision/erh;", "Lcom/oplus/aiunit/vision/ap8;", "Landroid/content/Context;", "context", "Landroid/view/View;", "itemView", "cardView", "", "f", "Lcom/heytap/health/base/base/BaseFragment;", LogFieldKey.PROCESS_NAME_KEY, "Lcom/heytap/health/base/base/BaseFragment;", "getBaseFragment", "()Lcom/heytap/health/base/base/BaseFragment;", "setBaseFragment", "(Lcom/heytap/health/base/base/BaseFragment;)V", "baseFragment", "<init>", "sleep_release"}, k = 1, mv = {1, 8, 0})
public abstract class erh extends ap8 {
    public static final int $stable = 8;

    /* JADX INFO: renamed from: p, reason: from kotlin metadata */
    @NotNull
    public BaseFragment baseFragment;

    public erh(@NotNull BaseFragment baseFragment) {
        Intrinsics.checkNotNullParameter(baseFragment, "baseFragment");
        this.baseFragment = baseFragment;
    }

    @Override // com.heytap.health.base.view.recyclercard.a
    public void f(@Nullable Context context, @Nullable View itemView, @Nullable View cardView) {
        super.f(context, itemView, cardView);
        if (cardView != null) {
            y0l.d(this.baseFragment, cardView);
        }
    }
}
