package com.oplus.nearx.track.internal.common;

import p010kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\b\n\u0002\b\n\b\u0080\u0001\u0018\u0000 \b2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\tB\u0011\b\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0006\u0010\u0003\u001a\u00020\u0002R\u0014\u0010\u0004\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0005j\u0002\b\nj\u0002\b\u000b¨\u0006\f"}, d2 = {"Lcom/oplus/nearx/track/internal/common/EventNetType;", "", "", "value", "level", "I", "<init>", "(Ljava/lang/String;II)V", "Companion", "a", "NET_TYPE_ALL_NET", "NET_TYPE_WIFI", "core-statistics_release"}, k = 1, mv = {1, 7, 1})
public enum EventNetType {
    NET_TYPE_ALL_NET(1),
    NET_TYPE_WIFI(2);

    private final int level;

    EventNetType(int i) {
        this.level = i;
    }

    /* JADX INFO: renamed from: value, reason: from getter */
    public final int getLevel() {
        return this.level;
    }
}
