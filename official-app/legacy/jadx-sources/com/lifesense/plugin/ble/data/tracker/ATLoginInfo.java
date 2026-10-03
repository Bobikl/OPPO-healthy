package com.lifesense.plugin.ble.data.tracker;

import com.lifesense.plugin.ble.c.a;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* JADX INFO: loaded from: classes5.dex */
public class ATLoginInfo extends ATDeviceData {
    public static final int STATE_BOUND = 3;
    public static final int STATE_UNBOUND = 4;
    private String md5;
    private int stateOfBond;

    public ATLoginInfo(byte[] bArr) {
        super(bArr);
    }

    public String getMd5() {
        return this.md5;
    }

    public int getStateOfBond() {
        return this.stateOfBond;
    }

    @Override // com.lifesense.plugin.ble.data.IPacketDecoder
    public void parse(byte[] bArr) {
        if (bArr == null || bArr.length <= 0) {
            return;
        }
        if (bArr.length == 16) {
            byte[] bArr2 = new byte[16];
            System.arraycopy(bArr, 0, bArr2, 0, 16);
            this.md5 = a.d(bArr2);
        } else if (bArr.length > 16) {
            ByteBuffer byteBufferOrder = ByteBuffer.wrap(bArr).order(ByteOrder.LITTLE_ENDIAN);
            byte[] bArr3 = new byte[16];
            byteBufferOrder.get(bArr3, 0, 16);
            this.md5 = a.d(bArr3);
            this.stateOfBond = a.a(byteBufferOrder.get());
        }
    }

    public void setMd5(String str) {
        this.md5 = str;
    }

    public void setStateOfBond(int i) {
        this.stateOfBond = i;
    }

    public String toString() {
        return "ATLoginInfo{md5='" + this.md5 + "', stateOfBond=" + this.stateOfBond + '}';
    }
}
