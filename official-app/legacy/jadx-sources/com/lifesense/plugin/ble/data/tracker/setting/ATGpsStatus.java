package com.lifesense.plugin.ble.data.tracker.setting;

/* JADX INFO: loaded from: classes5.dex */
public enum ATGpsStatus {
    Unavailable(0),
    PositioningFailure(1),
    PositioningSuccess(3),
    Refuse(128);

    private int status;

    ATGpsStatus(int i) {
        this.status = i;
    }

    public static ATGpsStatus getPhoneGpsStatus(int i) {
        for (ATGpsStatus aTGpsStatus : values()) {
            if (aTGpsStatus.getGpsStatus() == i) {
                return aTGpsStatus;
            }
        }
        return Unavailable;
    }

    public int getGpsStatus() {
        return this.status;
    }
}
