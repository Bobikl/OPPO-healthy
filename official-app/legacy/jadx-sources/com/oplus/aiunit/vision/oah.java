package com.oplus.aiunit.vision;

import androidx.compose.runtime.internal.StabilityInferred;
import com.heytap.health.device_data_sync.data_sync.SleepCalibrationItem;
import com.heytap.health.device_data_sync.data_sync.SleepFixDataItem;
import java.util.List;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;
import p010kotlin.collections.MapsKt__MapsKt;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes18.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0010\u0010\u0011R4\u0010\f\u001a\u0014\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR4\u0010\u000f\u001a\u0014\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\u00040\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\b\u0010\u0007\u001a\u0004\b\u0006\u0010\t\"\u0004\b\u000e\u0010\u000b¨\u0006\u0012"}, d2 = {"Lcom/oplus/aiunit/vision/oah;", "", "", "", "", "Lcom/heytap/health/device_data_sync/data_sync/SleepFixDataItem;", "a", "Ljava/util/Map;", "b", "()Ljava/util/Map;", "d", "(Ljava/util/Map;)V", "sleepFixDataMap", "Lcom/heytap/health/device_data_sync/data_sync/SleepCalibrationItem;", "c", "sleepCalibrationMap", "<init>", "()V", "sleep_release"}, k = 1, mv = {1, 8, 0})
public final class oah {
    public static final int $stable = 8;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public Map<String, ? extends List<? extends SleepFixDataItem>> sleepFixDataMap = MapsKt__MapsKt.emptyMap();

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public Map<String, ? extends List<? extends SleepCalibrationItem>> sleepCalibrationMap = MapsKt__MapsKt.emptyMap();

    @NotNull
    public final Map<String, List<SleepCalibrationItem>> a() {
        return this.sleepCalibrationMap;
    }

    @NotNull
    public final Map<String, List<SleepFixDataItem>> b() {
        return this.sleepFixDataMap;
    }

    public final void c(@NotNull Map<String, ? extends List<? extends SleepCalibrationItem>> map) {
        Intrinsics.checkNotNullParameter(map, "<set-?>");
        this.sleepCalibrationMap = map;
    }

    public final void d(@NotNull Map<String, ? extends List<? extends SleepFixDataItem>> map) {
        Intrinsics.checkNotNullParameter(map, "<set-?>");
        this.sleepFixDataMap = map;
    }
}
