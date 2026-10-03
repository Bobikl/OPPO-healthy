package com.heytap.health.wallet.bus.event;

import androidx.annotation.Keep;

/* JADX INFO: loaded from: classes18.dex */
@Keep
public class NfcMigrateCardEvent {
    public static final int EVENT_START_MIGRATE_OUT = 1;
    public int event;

    public NfcMigrateCardEvent() {
    }

    public NfcMigrateCardEvent(int i) {
        this.event = i;
    }
}
