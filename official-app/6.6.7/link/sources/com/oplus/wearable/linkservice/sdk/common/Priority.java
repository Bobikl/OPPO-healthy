package com.oplus.wearable.linkservice.sdk.common;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes8.dex */
public enum Priority {
    PRIORITY_LOW(0),
    PRIORITY_MIDDLE(1),
    PRIORITY_HIGH(2);

    private final int mPriority;

    Priority(int i) {
        this.mPriority = i;
    }

    public static Priority createPriority(int i) {
        for (Priority priority : values()) {
            if (priority.mPriority == i) {
                return priority;
            }
        }
        return PRIORITY_MIDDLE;
    }

    public int getPriority() {
        return this.mPriority;
    }
}
