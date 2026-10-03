package com.lifesense.plugin.ble.data.tracker.setting;

/* JADX INFO: loaded from: classes5.dex */
public enum ATRemoteControlCmd {
    Unknown(0),
    EmergencyAlarm(1),
    PhoneLocation(2),
    TakePictures(3),
    PlayMusic(4),
    PauseMusic(5),
    PreviousMusic(6),
    NextMusic(7);

    private int cmd;

    ATRemoteControlCmd(int i) {
        this.cmd = i;
    }

    public static ATRemoteControlCmd getRemoteControlCmd(int i) {
        for (ATRemoteControlCmd aTRemoteControlCmd : values()) {
            if (aTRemoteControlCmd.cmd == i) {
                return aTRemoteControlCmd;
            }
        }
        return Unknown;
    }

    public int getCmd() {
        return this.cmd;
    }
}
