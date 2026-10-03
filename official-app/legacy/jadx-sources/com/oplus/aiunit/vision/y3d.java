package com.oplus.aiunit.vision;

import android.app.OplusActivityTaskManager;
import android.os.Bundle;
import com.heytap.health.base.base.BaseActivity;
import com.oplus.wrapper.app.Activity;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\t\u0010\nJ\u0016\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004J\u0010\u0010\b\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002H\u0002¨\u0006\u000b"}, d2 = {"Lcom/oplus/aiunit/vision/y3d;", "", "Lcom/heytap/health/base/base/BaseActivity;", "activity", "", "moveTaskToBack", "", "a", "b", "<init>", "()V", "lib_base_release"}, k = 1, mv = {1, 8, 0})
public final class y3d {

    @NotNull
    public static final y3d INSTANCE = new y3d();

    public final void a(@NotNull BaseActivity activity, boolean moveTaskToBack) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        try {
            if (v3d.f()) {
                Activity.enableRootViewBackAnim(activity, true);
                if (moveTaskToBack) {
                    b(activity);
                }
            }
        } catch (Throwable th) {
            a7b.b("OPlusOnBackInvoked", "enable() t: " + th.getMessage());
        }
    }

    public final void b(BaseActivity activity) {
        try {
            Bundle bundle = new Bundle();
            bundle.putBoolean("shouldMoveTaskToBack", true);
            bundle.putBoolean("shouldFinishActivity", false);
            OplusActivityTaskManager oplusActivityTaskManager = OplusActivityTaskManager.getInstance();
            if (oplusActivityTaskManager != null) {
                oplusActivityTaskManager.setBackInvokePolicyForPredictive(activity, bundle);
            }
        } catch (Throwable th) {
            a7b.b("OPlusOnBackInvoked", "enableMoveTaskToBack() t: " + th.getMessage());
        }
    }
}
