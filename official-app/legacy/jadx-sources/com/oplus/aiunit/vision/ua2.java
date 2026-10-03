package com.oplus.aiunit.vision;

import android.util.StatsLog;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002R\u0014\u0010\u0007\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\bR\u0014\u0010\t\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\t\u0010\b¨\u0006\f"}, d2 = {"Lcom/oplus/aiunit/vision/ua2;", "", "", "businessLabel", "", "a", "b", "LABEL_LOCATION_GPS_FOR_WATCH", "I", "LABEL_LOCATION_NETWORK_FOR_WATCH", "<init>", "()V", "lib_base_release"}, k = 1, mv = {1, 8, 0})
public final class ua2 {

    @NotNull
    public static final ua2 INSTANCE = new ua2();
    public static final int LABEL_LOCATION_GPS_FOR_WATCH = 100;
    public static final int LABEL_LOCATION_NETWORK_FOR_WATCH = 200;

    public final void a(int businessLabel) {
        StringBuilder sb = new StringBuilder();
        sb.append("start() called with: businessLabel = ");
        sb.append(businessLabel);
        StatsLog.logStart(businessLabel);
    }

    public final void b(int businessLabel) {
        StringBuilder sb = new StringBuilder();
        sb.append("stop() called with: businessLabel = ");
        sb.append(businessLabel);
        StatsLog.logStop(businessLabel);
    }
}
