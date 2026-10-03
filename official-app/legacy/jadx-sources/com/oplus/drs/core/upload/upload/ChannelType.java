package com.oplus.drs.core.upload.upload;

/* JADX INFO: loaded from: classes6.dex */
public enum ChannelType {
    REALTIME("Realtime", true),
    PSEUDO("Pseudo", true),
    NON_REALTIME("NonRealtime", false);

    private final String displayName;
    private final boolean isHighPriority;

    ChannelType(String str, boolean z) {
        this.displayName = str;
        this.isHighPriority = z;
    }

    public String getDisplayName() {
        return this.displayName;
    }

    public boolean isHighPriority() {
        return this.isHighPriority;
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.displayName;
    }
}
