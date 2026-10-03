package com.lifesense.plugin.ble.data.tracker.config;

/* JADX INFO: loaded from: classes5.dex */
public class ATWeekStart extends ATConfigItem {
    public static final int WEEK_START_MON = 2;
    public static final int WEEK_START_SAT = 0;
    public static final int WEEK_START_SUN = 1;
    private int week;

    public ATWeekStart(int i) {
        this.week = i;
        this.type = 9;
    }

    @Override // com.lifesense.plugin.ble.data.tracker.config.ATConfigItem
    public int countOfItem() {
        return 1;
    }

    @Override // com.lifesense.plugin.ble.data.IPacketEncoder
    public byte[] encodeCmdBytes() {
        return new byte[]{(byte) this.type, 1, (byte) this.week};
    }

    @Override // com.lifesense.plugin.ble.data.IPacketEncoder
    public int getCmd() {
        return 0;
    }

    public int getWeek() {
        return this.week;
    }

    public void setWeek(int i) {
        this.week = i;
    }

    public String toString() {
        return "ATWeekStart{week=" + this.week + '}';
    }
}
