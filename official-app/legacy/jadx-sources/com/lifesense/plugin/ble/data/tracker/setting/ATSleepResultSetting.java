package com.lifesense.plugin.ble.data.tracker.setting;

import com.lifesense.plugin.ble.data.LSDeviceSyncSetting;
import com.lifesense.plugin.ble.data.tracker.ATSleepReportItem;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public class ATSleepResultSetting extends LSDeviceSyncSetting {
    private int awakeCount;
    private int awakeTime;
    private int deepSleepTime;
    private long fallAsleepTime;
    private long getupTime;
    private int index;
    private List items;
    private int lightSleepTime;

    @Override // com.lifesense.plugin.ble.data.IPacketEncoder
    public byte[] encodeCmdBytes() {
        if (getItems() == null || getItems().size() <= 0) {
            return null;
        }
        ByteBuffer byteBufferOrder = ByteBuffer.allocate(getItems().size() * 12).order(ByteOrder.BIG_ENDIAN);
        Iterator it = getItems().iterator();
        while (it.hasNext()) {
            byteBufferOrder.put(((ATSleepReportItem) it.next()).toBytes());
        }
        byte[] bArrCopyOf = Arrays.copyOf(byteBufferOrder.array(), byteBufferOrder.position());
        ByteBuffer byteBufferOrder2 = ByteBuffer.allocate(bArrCopyOf.length + 1 + 1 + 8 + 8 + 2).order(ByteOrder.BIG_ENDIAN);
        byteBufferOrder2.put((byte) getCmd());
        byteBufferOrder2.put((byte) getIndex());
        byteBufferOrder2.putInt((int) getFallAsleepTime());
        byteBufferOrder2.putInt((int) getGetupTime());
        byteBufferOrder2.putShort((short) getDeepSleepTime());
        byteBufferOrder2.putShort((short) getLightSleepTime());
        byteBufferOrder2.putShort((short) getAwakeTime());
        byteBufferOrder2.putShort((short) getAwakeCount());
        byteBufferOrder2.putShort((short) getItems().size());
        byteBufferOrder2.put(bArrCopyOf);
        return Arrays.copyOf(byteBufferOrder2.array(), byteBufferOrder2.position());
    }

    public int getAwakeCount() {
        return this.awakeCount;
    }

    public int getAwakeTime() {
        return this.awakeTime;
    }

    @Override // com.lifesense.plugin.ble.data.IPacketEncoder
    public int getCmd() {
        this.cmd = 243;
        return 243;
    }

    public int getDeepSleepTime() {
        return this.deepSleepTime;
    }

    public long getFallAsleepTime() {
        return this.fallAsleepTime;
    }

    public long getGetupTime() {
        return this.getupTime;
    }

    public int getIndex() {
        return this.index;
    }

    public List getItems() {
        return this.items;
    }

    public int getLightSleepTime() {
        return this.lightSleepTime;
    }

    public void setAwakeCount(int i) {
        this.awakeCount = i;
    }

    public void setAwakeTime(int i) {
        this.awakeTime = i;
    }

    public void setDeepSleepTime(int i) {
        this.deepSleepTime = i;
    }

    public void setFallAsleepTime(long j2) {
        this.fallAsleepTime = j2;
    }

    public void setGetupTime(long j2) {
        this.getupTime = j2;
    }

    public void setIndex(int i) {
        this.index = i;
    }

    public void setItems(List list) {
        this.items = list;
    }

    public void setLightSleepTime(int i) {
        this.lightSleepTime = i;
    }

    @Override // com.lifesense.plugin.ble.data.IDeviceSetting
    public String toString() {
        return "ATSleepResultSetting{index=" + this.index + ", fallAsleepTime=" + this.fallAsleepTime + ", getupTime=" + this.getupTime + ", deepSleepTime=" + this.deepSleepTime + ", lightSleepTime=" + this.lightSleepTime + ", awakeTime=" + this.awakeTime + ", awakeCount=" + this.awakeCount + ", items=" + this.items + '}';
    }
}
