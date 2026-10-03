package com.oplus.aiunit.vision;

import com.heytap.okhttp.extension.speed.SpeedDetector;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes18.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u000f\u001a\u00020\u000b¢\u0006\u0004\b\u0010\u0010\u0011J\u0006\u0010\u0003\u001a\u00020\u0002R\u0017\u0010\b\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007R\u0016\u0010\n\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0006\u0010\tR\u001a\u0010\u000f\u001a\u00020\u000b8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\f\u0010\u000e¨\u0006\u0012"}, d2 = {"Lcom/oplus/aiunit/vision/j6i;", "", "", "a", "Lcom/heytap/okhttp/extension/speed/SpeedDetector;", "Lcom/heytap/okhttp/extension/speed/SpeedDetector;", "b", "()Lcom/heytap/okhttp/extension/speed/SpeedDetector;", "speedDetector", "Z", "enableSpeedLimit", "Lcom/oplus/aiunit/vision/p6i;", "c", "Lcom/oplus/aiunit/vision/p6i;", "()Lcom/oplus/aiunit/vision/p6i;", "speedManager", "<init>", "(Lcom/oplus/aiunit/vision/p6i;)V", "okhttp4_extension_release"}, k = 1, mv = {1, 4, 0})
public final class j6i {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final SpeedDetector speedDetector;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public boolean enableSpeedLimit;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final p6i speedManager;

    public j6i(@NotNull p6i speedManager) {
        Intrinsics.checkNotNullParameter(speedManager, "speedManager");
        this.speedManager = speedManager;
        this.speedDetector = new SpeedDetector(null, 1L, speedManager);
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final boolean getEnableSpeedLimit() {
        return this.enableSpeedLimit;
    }

    @NotNull
    /* JADX INFO: renamed from: b, reason: from getter */
    public final SpeedDetector getSpeedDetector() {
        return this.speedDetector;
    }

    @NotNull
    /* JADX INFO: renamed from: c, reason: from getter */
    public final p6i getSpeedManager() {
        return this.speedManager;
    }
}
