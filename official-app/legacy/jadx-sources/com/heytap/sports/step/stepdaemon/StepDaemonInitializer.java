package com.heytap.sports.step.stepdaemon;

import android.app.Application;
import androidx.annotation.Keep;
import androidx.compose.runtime.internal.StabilityInferred;
import com.oplus.aiunit.vision.a7b;
import com.oplus.aiunit.vision.a8a;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;

/* JADX INFO: loaded from: classes2.dex */
@StabilityInferred(parameters = 0)
@Keep
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0007\u0018\u0000 \r2\u00020\u0001:\u0001\u000eB\u0007¢\u0006\u0004\b\u000b\u0010\fJ\b\u0010\u0003\u001a\u00020\u0002H\u0016J\b\u0010\u0005\u001a\u00020\u0004H\u0016J\u0012\u0010\b\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0016J\b\u0010\n\u001a\u00020\tH\u0016¨\u0006\u000f"}, d2 = {"Lcom/heytap/sports/step/stepdaemon/StepDaemonInitializer;", "Lcom/oplus/aiunit/vision/a8a;", "", "configProcess", "", "init", "Landroid/app/Application;", "application", "attachContext", "", "getTag", "<init>", "()V", "Companion", "a", "sport_impl_release"}, k = 1, mv = {1, 8, 0})
public final class StepDaemonInitializer extends a8a {
    public static final int $stable = 0;

    @NotNull
    private static final String TAG = "StepDaemonInitializer";

    @Override // com.oplus.aiunit.vision.a8a
    public void attachContext(@Nullable Application application) {
        super.attachContext(application);
        a7b.f(TAG, "attachContext() in daemon process");
    }

    @Override // com.oplus.aiunit.vision.a8a
    public int configProcess() {
        return 4;
    }

    @Override // com.oplus.aiunit.vision.a8a
    @NotNull
    public String getTag() {
        return TAG;
    }

    @Override // com.oplus.aiunit.vision.a8a
    public void init() {
        a7b.f(TAG, "init() in daemon process");
        Application application = this.mApplication;
        if (application == null) {
            a7b.m(TAG, "init(): mApplication is null, skip StepManagerDaemon.init");
        } else {
            a.INSTANCE.a().e(application);
            a7b.f(TAG, "StepManagerDaemon.init invoked");
        }
    }
}
