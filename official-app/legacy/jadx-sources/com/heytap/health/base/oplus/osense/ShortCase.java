package com.heytap.health.base.oplus.osense;

import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\n¨\u0006\u000b"}, d2 = {"Lcom/heytap/health/base/oplus/osense/ShortCase;", "", "caseName", "", "(Ljava/lang/String;ILjava/lang/String;)V", "getCaseName", "()Ljava/lang/String;", "HEALTH_DATA_CLOUD_SYNC", "TRANSPARENT_PUSH_LOG", "PUNCHING_HABIT", "MONTHLY_MEDAL", "lib_base_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public enum ShortCase {
    HEALTH_DATA_CLOUD_SYNC("health_data_cloud_sync"),
    TRANSPARENT_PUSH_LOG("transparent_push_log"),
    PUNCHING_HABIT("punching_habit"),
    MONTHLY_MEDAL("monthly_medal");


    @NotNull
    private final String caseName;

    ShortCase(String str) {
        this.caseName = str;
    }

    @NotNull
    public final String getCaseName() {
        return this.caseName;
    }
}
