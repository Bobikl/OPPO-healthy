package com.lifesense.plugin.ble.device.proto.A5.parser;

import com.lifesense.plugin.ble.data.LSErrorCode;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public class d {
    public static final int DATA_FRAME_LENGTH_DEFAULT = 20;
    public static final int FILE_HEAD_LENGTH_DEFAULT = 120;
    public int a;
    public int b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f8759c;
    public int d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f8760e;
    public int f;

    public static int a(byte b) {
        LSErrorCode lSErrorCode;
        if (b == 1 || b == 6) {
            lSErrorCode = LSErrorCode.LowBattery;
        } else if (b == 2) {
            lSErrorCode = LSErrorCode.VersionNotMatch;
        } else {
            lSErrorCode = b == 3 ? LSErrorCode.FileHeaderError : LSErrorCode.Unknown;
        }
        return lSErrorCode.getCode();
    }

    public static List b(byte[] bArr) {
        ArrayList arrayList = new ArrayList();
        int length = bArr.length;
        int i = 0;
        int i2 = 0;
        while (length > i) {
            byte[] bArr2 = new byte[20];
            i2++;
            int i3 = 2;
            bArr2[0] = 2;
            bArr2[1] = (byte) (i2 & 255);
            if (i == 0) {
                bArr2[2] = (byte) (length & 255);
            } else {
                i3 = 1;
            }
            int i4 = i3 + 1;
            int iMin = Math.min(20 - i4, length - i);
            System.arraycopy(bArr, i, bArr2, i4, iMin);
            i += iMin;
            arrayList.add(bArr2);
        }
        return arrayList;
    }

    public static byte[] c(byte[] bArr) {
        ByteBuffer byteBufferOrder = ByteBuffer.wrap(bArr).order(ByteOrder.BIG_ENDIAN);
        int iA = com.lifesense.plugin.ble.c.a.a(byteBufferOrder.get());
        com.lifesense.plugin.ble.c.a.a(byteBufferOrder.get());
        int iA2 = com.lifesense.plugin.ble.c.a.a(byteBufferOrder.get()) + 1;
        byte[] bArr2 = new byte[iA2];
        bArr2[0] = (byte) iA;
        byteBufferOrder.get(bArr2, 1, iA2 - 1);
        return bArr2;
    }

    public String toString() {
        return "A5OtaPacket [deviceReceiveFrameMaxEveryBlock=" + this.a + ", deviceFrameMax=" + this.b + ", upgradFileStart=" + this.f8759c + ", upgradFileOffset=" + this.d + ", upgradFileLenght=" + this.f8760e + ", upgradPregress=" + this.f + "]";
    }

    public static d a(byte[] bArr) {
        d dVar = new d();
        dVar.a = bArr[3] & 255;
        dVar.b = bArr[4] & 255;
        byte[] bArr2 = new byte[4];
        System.arraycopy(bArr, 5, bArr2, 0, 4);
        dVar.f8759c = com.lifesense.plugin.ble.c.a.f(bArr2);
        System.arraycopy(bArr, 9, bArr2, 0, 4);
        dVar.d = com.lifesense.plugin.ble.c.a.f(bArr2);
        System.arraycopy(bArr, 13, bArr2, 0, 4);
        int iF = com.lifesense.plugin.ble.c.a.f(bArr2);
        dVar.f8760e = iF;
        dVar.f = (int) (((dVar.d - dVar.f8759c) / iF) * 100.0f);
        return dVar;
    }

    public String a() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("Upgrade Info = [ ");
        stringBuffer.append("MaxFrames:" + this.a + " ;");
        stringBuffer.append("MaxCacheFrames:" + this.b + " ;");
        stringBuffer.append("StartAddress:" + this.f8759c + " ;");
        stringBuffer.append("OffsetAddress:" + this.d + " ;");
        stringBuffer.append("FileLenght:" + this.f8760e + " ;");
        StringBuilder sb = new StringBuilder();
        sb.append("UpgradeProgress:");
        sb.append(this.f);
        stringBuffer.append(sb.toString());
        stringBuffer.append(" ]");
        return stringBuffer.toString();
    }
}
