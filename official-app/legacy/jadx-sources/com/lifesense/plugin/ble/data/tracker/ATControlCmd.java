package com.lifesense.plugin.ble.data.tracker;

/* JADX INFO: loaded from: classes5.dex */
public enum ATControlCmd {
    Unknown(0),
    EmergencyAlarm(1),
    PhoneLocation(2),
    TakePictures(3),
    PlayMusic(4),
    PauseMusic(5),
    PreviousMusic(6),
    NextMusic(7),
    Answer(4096),
    Hangup(4097),
    Mute(4098),
    Volume(4099);

    private int cmd;

    ATControlCmd(int i) {
        this.cmd = i;
    }

    public static ATControlCmd getControlCmd(int i) {
        for (ATControlCmd aTControlCmd : values()) {
            if (aTControlCmd.cmd == i) {
                return aTControlCmd;
            }
        }
        return Unknown;
    }

    public int getCmd() {
        return this.cmd;
    }
}
