package com.lifesense.plugin.ble.data.tracker;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Arrays;

/* JADX INFO: loaded from: classes5.dex */
public class ATSleepReportItem {
    public static final int LEN_OF_ITEM = 12;
    private int duration;
    private long endTime;
    private long startTime;
    private int state;

    private ATSleepReportItem() {
    }

    public ATSleepReportItem(int i) {
        this.state = i;
    }

    public int getDuration() {
        return this.duration;
    }

    public long getEndTime() {
        return this.endTime;
    }

    public long getStartTime() {
        return this.startTime;
    }

    public int getState() {
        return this.state;
    }

    public void setDuration(int i) {
        this.duration = i;
    }

    public void setEndTime(long j2) {
        this.endTime = j2;
    }

    public void setStartTime(long j2) {
        this.startTime = j2;
    }

    public void setState(int i) {
        this.state = i;
    }

    public byte[] toBytes() {
        ByteBuffer byteBufferOrder = ByteBuffer.allocate(12).order(ByteOrder.BIG_ENDIAN);
        byteBufferOrder.put((byte) this.state);
        byteBufferOrder.put((byte) 0);
        byteBufferOrder.putInt((int) getStartTime());
        byteBufferOrder.putInt((int) getEndTime());
        byteBufferOrder.putShort((short) getDuration());
        return Arrays.copyOf(byteBufferOrder.array(), byteBufferOrder.position());
    }

    public String toString() {
        return "ATSleepReportItem{state=" + this.state + ", startTime=" + this.startTime + ", endTime=" + this.endTime + ", duration=" + this.duration + '}';
    }
}
