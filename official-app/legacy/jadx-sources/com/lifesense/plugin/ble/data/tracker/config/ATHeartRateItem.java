package com.lifesense.plugin.ble.data.tracker.config;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Arrays;

/* JADX INFO: loaded from: classes5.dex */
public class ATHeartRateItem {
    private boolean enable;
    private int factor;
    private int index;
    private int maxValue;
    private int minValue;
    private int type;

    public int getFactor() {
        return this.factor;
    }

    public int getIndex() {
        return this.index;
    }

    public int getMaxValue() {
        return this.maxValue;
    }

    public int getMinValue() {
        return this.minValue;
    }

    public int getType() {
        return this.type;
    }

    public boolean isEnable() {
        return this.enable;
    }

    public void setEnable(boolean z) {
        this.enable = z;
    }

    public void setFactor(int i) {
        this.factor = i;
    }

    public void setIndex(int i) {
        this.index = i;
    }

    public void setMaxValue(int i) {
        this.maxValue = i;
    }

    public void setMinValue(int i) {
        this.minValue = i;
    }

    public void setType(int i) {
        this.type = i;
    }

    public byte[] toBytes() {
        ByteBuffer byteBufferOrder = ByteBuffer.allocate(6).order(ByteOrder.BIG_ENDIAN);
        byteBufferOrder.put((byte) this.index);
        byteBufferOrder.put((byte) this.type);
        byteBufferOrder.put(this.enable ? (byte) 1 : (byte) 0);
        byteBufferOrder.put((byte) this.factor);
        byteBufferOrder.put((byte) this.maxValue);
        byteBufferOrder.put((byte) this.minValue);
        return Arrays.copyOf(byteBufferOrder.array(), byteBufferOrder.position());
    }

    public String toString() {
        return "ATHeartRateItem{type=" + this.type + ", enable=" + this.enable + ", factor=" + this.factor + ", maxValue=" + this.maxValue + ", minValue=" + this.minValue + '}';
    }
}
