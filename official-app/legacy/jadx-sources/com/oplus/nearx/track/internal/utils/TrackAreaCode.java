package com.oplus.nearx.track.internal.utils;

import com.oplus.aiunit.vision.alf;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0006\u0010\u0005\u001a\u00020\u0003R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000b¨\u0006\f"}, d2 = {"Lcom/oplus/nearx/track/internal/utils/TrackAreaCode;", "", "value", "", "(Ljava/lang/String;ILjava/lang/String;)V", "getValue", "CN", "EU", alf.SA, alf.RU, alf.US, "SEA", "core-statistics_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
public enum TrackAreaCode {
    CN("AreaCode_CN"),
    EU("AreaCode_EU"),
    SA("AreaCode_SA"),
    RU("AreaCode_RU"),
    US("AreaCode_US"),
    SEA("AreaCode_SEA");


    @NotNull
    private final String value;

    TrackAreaCode(String str) {
        this.value = str;
    }

    @NotNull
    public final String getValue() {
        return this.value;
    }
}
