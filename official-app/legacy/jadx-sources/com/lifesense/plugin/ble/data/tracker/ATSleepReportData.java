package com.lifesense.plugin.ble.data.tracker;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public class ATSleepReportData extends ATDeviceData {
    private int awakeCount;
    private int awakeTime;
    private long bedTime;
    private int countOfSleepItem;
    private int dataOffset;
    private int deepSleepDuration;
    private long getupTime;
    private int lightSleepDuration;
    private int offsetOfSleepItem;
    private int remDuration;
    private int remainCount;
    private List reportItems;
    private int reserved;
    private int sleepType;
    private int totalNumberOfSleepItem;

    public ATSleepReportData(byte[] bArr) {
        super(bArr);
    }

    public int getAwakeCount() {
        return this.awakeCount;
    }

    public int getAwakeTime() {
        return this.awakeTime;
    }

    public long getBedTime() {
        return this.bedTime;
    }

    public int getCountOfSleepItem() {
        return this.countOfSleepItem;
    }

    public int getDataOffset() {
        return this.dataOffset;
    }

    public int getDeepSleepDuration() {
        return this.deepSleepDuration;
    }

    public long getGetupTime() {
        return this.getupTime;
    }

    public int getLightSleepDuration() {
        return this.lightSleepDuration;
    }

    public int getOffsetOfSleepItem() {
        return this.offsetOfSleepItem;
    }

    public int getRemDuration() {
        return this.remDuration;
    }

    public int getRemainCount() {
        return this.remainCount;
    }

    public List getReportItems() {
        return this.reportItems;
    }

    public int getReserved() {
        return this.reserved;
    }

    public int getSleepType() {
        return this.sleepType;
    }

    public int getTotalNumberOfSleepItem() {
        return this.totalNumberOfSleepItem;
    }

    @Override // com.lifesense.plugin.ble.data.IPacketDecoder
    public void parse(byte[] bArr) {
        if (bArr == null || bArr.length <= 0) {
            return;
        }
        try {
            ByteBuffer byteBufferOrder = ByteBuffer.wrap(bArr).order(ByteOrder.BIG_ENDIAN);
            this.cmd = toUnsignedInt(byteBufferOrder.get());
            this.bedTime = byteBufferOrder.getInt();
            this.getupTime = byteBufferOrder.getInt();
            this.awakeTime = byteBufferOrder.getInt();
            this.awakeCount = byteBufferOrder.getInt();
            this.remDuration = byteBufferOrder.getInt();
            this.lightSleepDuration = byteBufferOrder.getInt();
            this.deepSleepDuration = byteBufferOrder.getInt();
            this.sleepType = toUnsignedInt(byteBufferOrder.get());
            this.remainCount = toUnsignedInt(byteBufferOrder.get());
            this.dataOffset = toUnsignedInt(byteBufferOrder.get());
            this.reserved = toUnsignedInt(byteBufferOrder.get());
            this.totalNumberOfSleepItem = toUnsignedInt(byteBufferOrder.get());
            this.offsetOfSleepItem = toUnsignedInt(byteBufferOrder.get());
            this.countOfSleepItem = toUnsignedInt(byteBufferOrder.get());
            this.reportItems = new ArrayList();
            do {
                long j2 = byteBufferOrder.getInt();
                long j3 = byteBufferOrder.getInt();
                int unsignedInt = toUnsignedInt(byteBufferOrder.get());
                int i = byteBufferOrder.getInt();
                ATSleepReportItem aTSleepReportItem = new ATSleepReportItem(unsignedInt);
                aTSleepReportItem.setStartTime(j2);
                aTSleepReportItem.setEndTime(j3);
                aTSleepReportItem.setDuration(i);
                this.reportItems.add(aTSleepReportItem);
            } while (this.srcData.length - byteBufferOrder.position() >= 13);
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    public void setAwakeCount(int i) {
        this.awakeCount = i;
    }

    public void setAwakeTime(int i) {
        this.awakeTime = i;
    }

    public void setBedTime(long j2) {
        this.bedTime = j2;
    }

    public void setCountOfSleepItem(int i) {
        this.countOfSleepItem = i;
    }

    public void setDataOffset(int i) {
        this.dataOffset = i;
    }

    public void setDeepSleepDuration(int i) {
        this.deepSleepDuration = i;
    }

    public void setGetupTime(long j2) {
        this.getupTime = j2;
    }

    public void setLightSleepDuration(int i) {
        this.lightSleepDuration = i;
    }

    public void setOffsetOfSleepItem(int i) {
        this.offsetOfSleepItem = i;
    }

    public void setRemDuration(int i) {
        this.remDuration = i;
    }

    public void setRemainCount(int i) {
        this.remainCount = i;
    }

    public void setReportItems(List list) {
        this.reportItems = list;
    }

    public void setReserved(int i) {
        this.reserved = i;
    }

    public void setSleepType(int i) {
        this.sleepType = i;
    }

    public void setTotalNumberOfSleepItem(int i) {
        this.totalNumberOfSleepItem = i;
    }

    public String toString() {
        return "ATSleepReportData{bedTime=" + this.bedTime + ", getupTime=" + this.getupTime + ", awakeTime=" + this.awakeTime + ", awakeCount=" + this.awakeCount + ", remDuration=" + this.remDuration + ", lightSleepDuration=" + this.lightSleepDuration + ", deepSleepDuration=" + this.deepSleepDuration + ", sleepType=" + this.sleepType + ", remainCount=" + this.remainCount + ", dataOffset=" + this.dataOffset + ", reserved=" + this.reserved + ", totalNumberOfSleepItem=" + this.totalNumberOfSleepItem + ", offsetOfSleepItem=" + this.offsetOfSleepItem + ", countOfSleepItem=" + this.countOfSleepItem + ", reportItems=" + this.reportItems + '}';
    }
}
