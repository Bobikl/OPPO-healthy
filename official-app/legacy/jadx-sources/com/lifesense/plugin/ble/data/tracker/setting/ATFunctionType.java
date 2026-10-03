package com.lifesense.plugin.ble.data.tracker.setting;

import com.oplus.aiunit.vision.k18;

/* JADX INFO: loaded from: classes5.dex */
public enum ATFunctionType {
    Unknown(65535),
    HeartbeatDataCollect(256),
    ScreenPowerOn(512),
    ManualExerciseMode(768),
    LowBatteryReminder(1024),
    scrollDisplay(k18.GL_INVALID_ENUM),
    IncomingCall(2048),
    MessageRemind(4096);

    public int command;

    ATFunctionType(int i) {
        this.command = i;
    }
}
