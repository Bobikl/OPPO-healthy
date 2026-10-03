package com.lifesense.plugin.ble.data.tracker.setting;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public enum ATWeekDay {
    Monday(1),
    Tuesday(2),
    Wednesday(4),
    Thursday(8),
    Friday(16),
    Saturday(32),
    Sunday(64);

    private int value;

    ATWeekDay(int i) {
        this.value = i;
    }

    public static List toWeekDay(int i) {
        ArrayList arrayList = new ArrayList();
        for (ATWeekDay aTWeekDay : values()) {
            if ((aTWeekDay.getValue() & i) == aTWeekDay.getValue()) {
                arrayList.add(aTWeekDay);
            }
        }
        return arrayList;
    }

    public int getValue() {
        return this.value;
    }
}
