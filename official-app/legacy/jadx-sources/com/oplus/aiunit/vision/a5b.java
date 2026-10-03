package com.oplus.aiunit.vision;

import com.heytap.sportwatch.proto.GpsData$GpsConfig;
import io.protostuff.MapSchema;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\f\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u0006\u0010\u0006\u001a\u00020\u0002J\u0016\u0010\n\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0007J\u000e\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\u0002J\u0010\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\u0007H\u0002R\u0014\u0010\u0010\u001a\u00020\u00078\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u00078\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0011R\u0014\u0010\u0013\u001a\u00020\u00078\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0013\u0010\u0011R\u0014\u0010\u0014\u001a\u00020\u00078\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0014\u0010\u0011R\u0014\u0010\u0015\u001a\u00020\u00078\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0015\u0010\u0011R\u0014\u0010\u0016\u001a\u00020\u00078\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0016\u0010\u0011R\u0014\u0010\u0017\u001a\u00020\u00078\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0017\u0010\u0011¨\u0006\u001a"}, d2 = {"Lcom/oplus/aiunit/vision/a5b;", "", "Lcom/heytap/sportwatch/proto/GpsData$GpsConfig;", "config", "", "d", "c", "", "infoBitmap", "bit", "b", "Lcom/oplus/aiunit/vision/ami;", "a", "provider", "", MapSchema.FIELD_NAME_ENTRY, "BIT_LAT_LNG", "I", "BIT_ACCURACY", "BIT_ALTITUDE", "BIT_SPEED", "BIT_DISTANCE", "BIT_NMEA", "BIT_BEARING", "<init>", "()V", "device_data_sync_impl_release"}, k = 1, mv = {1, 8, 0})
public final class a5b {
    public static final int BIT_ACCURACY = 1;
    public static final int BIT_ALTITUDE = 2;
    public static final int BIT_BEARING = 6;
    public static final int BIT_DISTANCE = 4;
    public static final int BIT_LAT_LNG = 0;
    public static final int BIT_NMEA = 5;
    public static final int BIT_SPEED = 3;

    @NotNull
    public static final a5b INSTANCE = new a5b();

    @NotNull
    public final StartParams a(@NotNull GpsData$GpsConfig config) {
        Intrinsics.checkNotNullParameter(config, "config");
        String strE = e(config.getProvider());
        return new StartParams(strE, Intrinsics.areEqual(strE, "network") ? Math.max(10000, config.getSampleInterval() * 1000) : config.getSampleInterval() * 1000, config.getDistanceThreshold());
    }

    public final boolean b(int infoBitmap, int bit) {
        return ((infoBitmap >> bit) & 1) == 1;
    }

    @NotNull
    public final GpsData$GpsConfig c() {
        GpsData$GpsConfig gpsData$GpsConfigBuild = GpsData$GpsConfig.newBuilder().setCriteria(1).setProvider(1).setSendType(1).setSampleInterval(3).setDistanceThreshold(0).setInfoBitmap(95).setSupportOptimize(0).build();
        Intrinsics.checkNotNullExpressionValue(gpsData$GpsConfigBuild, "newBuilder()\n           …IZE)\n            .build()");
        return gpsData$GpsConfigBuild;
    }

    public final boolean d(@NotNull GpsData$GpsConfig config) {
        Intrinsics.checkNotNullParameter(config, "config");
        if (config.getInfoBitmap() == 0) {
            return false;
        }
        if (config.getSendType() == 2) {
            return (config.getGroupSendCount() == 0 || config.getGroupSendInterval() == 0) ? false : true;
        }
        return true;
    }

    public final String e(int provider) {
        return (provider == 1 || provider != 2) ? f58.GPS : "network";
    }
}
