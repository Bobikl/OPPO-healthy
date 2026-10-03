package com.heytap.wearable.health.gpshandler;

import androidx.annotation.Keep;
import com.heytap.accessory.file.model.Constant;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes2.dex */
@Keep
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0007\u0018\u0000 \u00032\u00020\u0001:\u0001\u0003B\u0005¢\u0006\u0002\u0010\u0002¨\u0006\u0004"}, d2 = {"Lcom/heytap/wearable/health/gpshandler/GPSNativeLib;", "", "()V", "Companion", "lib_gpshandler_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final class GPSNativeLib {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @Keep
    @Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\t\u0010\u0003\u001a\u00020\u0004H\u0086 J$\u0010\u0005\u001a\u00020\u00042\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\u0006\u0010\t\u001a\u00020\nH\u0086 ¢\u0006\u0002\u0010\u000bJ2\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\u00072\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\u00072\u0006\u0010\u000f\u001a\u00020\n2\u0006\u0010\u0010\u001a\u00020\u0011H\u0086 ¢\u0006\u0002\u0010\u0012J\u0011\u0010\u0013\u001a\u00020\u00042\u0006\u0010\u0014\u001a\u00020\u0015H\u0086 J\u0011\u0010\u0016\u001a\u00020\u00042\u0006\u0010\u0017\u001a\u00020\nH\u0086 ¨\u0006\u0018"}, d2 = {"Lcom/heytap/wearable/health/gpshandler/GPSNativeLib$Companion;", "", "()V", "processDeinit", "", "processGoldRead", "hfGpsFileList", "", "", Constant.FILE_SIZE, "", "([Ljava/lang/String;I)V", "processGps", "Lcom/heytap/wearable/health/gpshandler/GpsPoint;", "points", "pointSize", "isEnd", "", "([Lcom/heytap/wearable/health/gpshandler/GpsPoint;IZ)[Lcom/heytap/wearable/health/gpshandler/GpsPoint;", "processInit", "inputParams", "Lcom/heytap/wearable/health/gpshandler/GpsAlgInputParams;", "processLogInit", "logFlag", "lib_gpshandler_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final native void processDeinit();

        public final native void processGoldRead(@NotNull String[] hfGpsFileList, int fileSize);

        @NotNull
        public final native GpsPoint[] processGps(@NotNull GpsPoint[] points, int pointSize, boolean isEnd);

        public final native void processInit(@NotNull GpsAlgInputParams inputParams);

        public final native void processLogInit(int logFlag);
    }

    static {
        System.loadLibrary("gpshandler");
    }
}
