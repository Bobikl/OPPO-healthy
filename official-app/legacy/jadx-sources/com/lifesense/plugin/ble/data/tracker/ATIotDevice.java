package com.lifesense.plugin.ble.data.tracker;

import com.lifesense.plugin.ble.c.a;
import com.squareup.moshi.Json;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Arrays;

/* JADX INFO: loaded from: classes5.dex */
public class ATIotDevice {
    private int index = 1;
    private String name;
    private int nodeState;
    private int workingState;

    public int getIndex() {
        return this.index;
    }

    public String getName() {
        return this.name;
    }

    public int getNodeState() {
        return this.nodeState;
    }

    public int getWorkingState() {
        return this.workingState;
    }

    public void setIndex(int i) {
        this.index = i;
    }

    public void setName(String str) {
        this.name = str;
    }

    public void setNodeState(int i) {
        this.nodeState = i;
    }

    public void setWorkingState(int i) {
        this.workingState = i;
    }

    public byte[] toBytes() {
        try {
            ByteBuffer byteBufferOrder = ByteBuffer.allocate(16).order(ByteOrder.BIG_ENDIAN);
            byteBufferOrder.put((byte) this.index);
            byteBufferOrder.put((byte) this.nodeState);
            byteBufferOrder.put((byte) this.workingState);
            byte[] bArrA = a.a(this.name + Json.UNSET_NAME);
            if (bArrA == null || bArrA.length <= 13) {
                byte[] bArr = new byte[13];
                if (bArrA != null) {
                    System.arraycopy(bArrA, 0, bArr, 0, bArrA.length);
                }
                byteBufferOrder.put(bArr, 0, 13);
            } else {
                byteBufferOrder.put(bArrA, 0, 12);
                byteBufferOrder.put((byte) 0);
            }
            return Arrays.copyOf(byteBufferOrder.array(), byteBufferOrder.position());
        } catch (Exception e2) {
            e2.printStackTrace();
            return null;
        }
    }

    public String toString() {
        return "ATIotDevice{index=" + this.index + ", name='" + this.name + "', nodeState=" + this.nodeState + ", workingState=" + this.workingState + '}';
    }
}
