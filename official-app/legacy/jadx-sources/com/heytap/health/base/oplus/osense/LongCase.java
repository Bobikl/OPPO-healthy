package com.heytap.health.base.oplus.osense;

import com.oplus.mydevices.sdk.Constants;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\r\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0017\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011¨\u0006\u0012"}, d2 = {"Lcom/heytap/health/base/oplus/osense/LongCase;", "", "caseName", "", "mode", "", "(Ljava/lang/String;ILjava/lang/String;I)V", "getCaseName", "()Ljava/lang/String;", "getMode", "()I", "PHONE_SLEEP_RECORDING", "PHONE_SLEEP_SENSOR", "PHONE_SPORTS_GPS", "PHONE_SPORTS_NO_GPS", "PHONE_STEP_SENSOR", "WATCH_RECONNECT", "ALL_HEALTH_DATA_CLOUD_SYNC", "lib_base_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public enum LongCase {
    PHONE_SLEEP_RECORDING("phone_sleep_recording", Constants.LINKAGE_SET_ACTIVE),
    PHONE_SLEEP_SENSOR("phone_sleep_sensor", 256),
    PHONE_SPORTS_GPS("phone_sports_gps", 8),
    PHONE_SPORTS_NO_GPS("phone_sports_no_gps", 256),
    PHONE_STEP_SENSOR("phone_step_sensor", 12),
    WATCH_RECONNECT("watch_reconnect", 256),
    ALL_HEALTH_DATA_CLOUD_SYNC("user_or_fiend_first_sync_all", 256);


    @NotNull
    private final String caseName;
    private final int mode;

    LongCase(String str, int i) {
        this.caseName = str;
        this.mode = i;
    }

    @NotNull
    public final String getCaseName() {
        return this.caseName;
    }

    public final int getMode() {
        return this.mode;
    }
}
