package com.oplus.aiunit.vision;

import android.content.Context;
import androidx.compose.runtime.internal.StabilityInferred;
import com.heytap.sports.step.stepdaemon.store.DefaultMode;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\u0016\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004J\u0006\u0010\b\u001a\u00020\u0006R\u0017\u0010\r\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\n\u0010\f¨\u0006\u0012"}, d2 = {"Lcom/oplus/aiunit/vision/ep4;", "", "", "step", "", "sensorTimeStamp", "", "b", "c", "Lcom/heytap/sports/step/stepdaemon/store/DefaultMode;", "a", "Lcom/heytap/sports/step/stepdaemon/store/DefaultMode;", "()Lcom/heytap/sports/step/stepdaemon/store/DefaultMode;", "defaultMode", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "sport_impl_release"}, k = 1, mv = {1, 8, 0})
public final class ep4 {
    public static final int $stable = 8;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final DefaultMode defaultMode;

    public ep4(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.defaultMode = new DefaultMode(context);
    }

    @NotNull
    /* JADX INFO: renamed from: a, reason: from getter */
    public final DefaultMode getDefaultMode() {
        return this.defaultMode;
    }

    public final void b(int step, long sensorTimeStamp) {
        this.defaultMode.n(step, sensorTimeStamp);
    }

    public final void c() {
        this.defaultMode.m();
        this.defaultMode.n(0, 0L);
    }
}
