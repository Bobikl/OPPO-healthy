package com.oplus.drs.core.track;

/* JADX INFO: loaded from: classes6.dex */
public enum EventNetType {
    NET_TYPE_ALL_NET(1),
    NET_TYPE_WIFI(2);

    private final int level;

    EventNetType(int i) {
        this.level = i;
    }

    public static EventNetType getEnum(int i) {
        for (EventNetType eventNetType : values()) {
            if (eventNetType.level == i) {
                return eventNetType;
            }
        }
        return NET_TYPE_ALL_NET;
    }

    public int value() {
        return this.level;
    }
}
