package com.oplus.aiunit.vision;

import androidx.compose.runtime.internal.StabilityInferred;
import com.heytap.health.devicemanager.util.DeviceManagerUtils;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicBoolean;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;

/* JADX INFO: loaded from: classes16.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0002R\u0016\u0010\t\u001a\u00020\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0003\u0010\bR\u0016\u0010\n\u001a\u00020\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0006\u0010\b¨\u0006\r"}, d2 = {"Lcom/oplus/aiunit/vision/rjd;", "", "", "a", "init", "", "b", "Ljava/util/concurrent/atomic/AtomicBoolean;", "Ljava/util/concurrent/atomic/AtomicBoolean;", "initStatus", "isOnePlus", "<init>", "()V", "daily_release"}, k = 1, mv = {1, 8, 0})
public final class rjd {

    @NotNull
    public static final rjd INSTANCE = new rjd();

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public static AtomicBoolean initStatus = new AtomicBoolean(false);

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public static AtomicBoolean isOnePlus = new AtomicBoolean(false);
    public static final int $stable = 8;

    public final boolean a() {
        if (initStatus.get()) {
            return isOnePlus.get();
        }
        DeviceManagerUtils deviceManagerUtils = DeviceManagerUtils.INSTANCE;
        String[] strArrD = deviceManagerUtils.d();
        if (!deviceManagerUtils.g((String[]) Arrays.copyOf(strArrD, strArrD.length))) {
            String[] strArrD2 = deviceManagerUtils.d();
            if (!deviceManagerUtils.f((String[]) Arrays.copyOf(strArrD2, strArrD2.length))) {
                return false;
            }
        }
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x002a  */
    public final void b(boolean init) {
        boolean z;
        if (!init) {
            initStatus.set(false);
            return;
        }
        AtomicBoolean atomicBoolean = isOnePlus;
        DeviceManagerUtils deviceManagerUtils = DeviceManagerUtils.INSTANCE;
        String[] strArrD = deviceManagerUtils.d();
        if (!deviceManagerUtils.g((String[]) Arrays.copyOf(strArrD, strArrD.length))) {
            String[] strArrD2 = deviceManagerUtils.d();
            z = deviceManagerUtils.f((String[]) Arrays.copyOf(strArrD2, strArrD2.length));
        }
        atomicBoolean.set(z);
        initStatus.set(true);
    }
}
