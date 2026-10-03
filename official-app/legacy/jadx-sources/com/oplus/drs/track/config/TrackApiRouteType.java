package com.oplus.drs.track.config;

import p010kotlin.Metadata;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\b\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\n¨\u0006\u000b"}, d2 = {"Lcom/oplus/drs/track/config/TrackApiRouteType;", "", "value", "", "(Ljava/lang/String;II)V", "getValue", "()I", "PREV_TRACK_API", "DRS_LOCAL_IPC", "DRS_REMOTE_IPC", "DRS_LOCAL_DIRECT", "obus-sdk_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
public enum TrackApiRouteType {
    PREV_TRACK_API(-1),
    DRS_LOCAL_IPC(0),
    DRS_REMOTE_IPC(1),
    DRS_LOCAL_DIRECT(100);

    private final int value;

    TrackApiRouteType(int i) {
        this.value = i;
    }

    public final int getValue() {
        return this.value;
    }
}
