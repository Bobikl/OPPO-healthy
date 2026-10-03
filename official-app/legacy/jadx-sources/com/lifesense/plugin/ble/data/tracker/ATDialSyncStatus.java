package com.lifesense.plugin.ble.data.tracker;

/* JADX INFO: loaded from: classes5.dex */
public enum ATDialSyncStatus {
    Unknown(0),
    Sent(1),
    VerifySuccess(2),
    VerifyFailure(3),
    InstallStart(4),
    InstallSuccess(5),
    InstallFailure(6),
    CancelDownload(7),
    CancelConfirm(8);

    private int status;

    ATDialSyncStatus(int i) {
        this.status = i;
    }

    public static ATDialSyncStatus getSyncStatus(int i) {
        for (ATDialSyncStatus aTDialSyncStatus : values()) {
            if (aTDialSyncStatus.getValue() == i) {
                return aTDialSyncStatus;
            }
        }
        return Unknown;
    }

    public int getValue() {
        return this.status;
    }
}
