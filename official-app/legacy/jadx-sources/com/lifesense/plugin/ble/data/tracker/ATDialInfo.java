package com.lifesense.plugin.ble.data.tracker;

import com.lifesense.plugin.ble.c.a;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* JADX INFO: loaded from: classes5.dex */
public class ATDialInfo extends ATDeviceData {
    private String backgroundName;
    private String id;
    private int index;
    private String name;
    private int styleId;
    private int type;

    public ATDialInfo() {
        super(null);
    }

    public String getBackgroundName() {
        return this.backgroundName;
    }

    public String getId() {
        return this.id;
    }

    public int getIndex() {
        return this.index;
    }

    public String getName() {
        return this.name;
    }

    public int getStyleId() {
        return this.styleId;
    }

    public int getType() {
        return this.type;
    }

    @Override // com.lifesense.plugin.ble.data.IPacketDecoder
    public void parse(byte[] bArr) {
        if (bArr == null || bArr.length <= 0) {
            return;
        }
        try {
            ByteBuffer byteBufferOrder = ByteBuffer.wrap(bArr).order(ByteOrder.BIG_ENDIAN);
            this.cmd = toUnsignedInt(byteBufferOrder.get());
            this.index = toUnsignedInt(byteBufferOrder.get());
            int unsignedInt = toUnsignedInt(byteBufferOrder.get());
            byte[] bArr2 = new byte[unsignedInt];
            byteBufferOrder.get(bArr2, 0, unsignedInt);
            this.id = a.i(bArr2);
            this.type = toUnsignedInt(byteBufferOrder.get());
            int unsignedInt2 = toUnsignedInt(byteBufferOrder.get());
            byte[] bArr3 = new byte[unsignedInt2];
            byteBufferOrder.get(bArr3, 0, unsignedInt2);
            this.name = a.i(bArr3);
            int unsignedInt3 = toUnsignedInt(byteBufferOrder.get());
            byte[] bArr4 = new byte[unsignedInt3];
            byteBufferOrder.get(bArr4, 0, unsignedInt3);
            this.backgroundName = a.i(bArr4);
            this.styleId = toUnsignedInt(byteBufferOrder.get());
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    public void setBackgroundName(String str) {
        this.backgroundName = str;
    }

    public void setId(String str) {
        this.id = str;
    }

    public void setIndex(int i) {
        this.index = i;
    }

    public void setName(String str) {
        this.name = str;
    }

    public void setStyleId(int i) {
        this.styleId = i;
    }

    public void setType(int i) {
        this.type = i;
    }

    public String toString() {
        return "ATDialInfo{index=" + this.index + ", id='" + this.id + "', type=" + this.type + ", name='" + this.name + "', backgroundName='" + this.backgroundName + "', styleId=" + this.styleId + '}';
    }

    public ATDialInfo(byte[] bArr) {
        super(bArr);
    }
}
