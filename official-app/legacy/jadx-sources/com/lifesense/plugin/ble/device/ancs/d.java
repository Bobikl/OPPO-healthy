package com.lifesense.plugin.ble.device.ancs;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public class d extends c {
    private byte[] b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f8742c;
    private int d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f8743e;

    public d(int i, boolean z) {
        this.d = i;
        this.f8743e = z;
    }

    public int a() {
        return this.f8742c;
    }

    public int b() {
        return this.d;
    }

    public List c(int i) {
        if (this.b == null) {
            return null;
        }
        if (i <= 20) {
            i = 20;
        }
        ArrayList arrayList = new ArrayList();
        int i2 = i - 3;
        byte[] bArr = this.b;
        if (bArr.length <= i2) {
            ByteBuffer byteBufferOrder = ByteBuffer.allocate(bArr.length + 3).order(ByteOrder.BIG_ENDIAN);
            byteBufferOrder.put((byte) 1);
            byteBufferOrder.putShort((short) this.b.length);
            byteBufferOrder.put(this.b);
            arrayList.add(Arrays.copyOf(byteBufferOrder.array(), byteBufferOrder.position()));
            return arrayList;
        }
        ByteBuffer byteBufferOrder2 = ByteBuffer.allocate(i).order(ByteOrder.BIG_ENDIAN);
        byteBufferOrder2.put((byte) 1);
        byteBufferOrder2.putShort((short) this.b.length);
        byte[] bArr2 = new byte[i2];
        System.arraycopy(this.b, 0, bArr2, 0, i2);
        byteBufferOrder2.put(bArr2);
        arrayList.add(Arrays.copyOf(byteBufferOrder2.array(), byteBufferOrder2.position()));
        byte[] bArr3 = this.b;
        int length = bArr3.length - i2;
        byte[] bArr4 = new byte[length];
        System.arraycopy(bArr3, i2, bArr4, 0, length);
        int i3 = 2;
        for (byte[] bArr5 : a(bArr4, i - 1)) {
            byte[] bArr6 = new byte[i];
            bArr6[0] = (byte) i3;
            System.arraycopy(bArr5, 0, bArr6, 1, bArr5.length);
            i3++;
            arrayList.add(bArr6);
        }
        return arrayList;
    }

    public byte[] d() {
        try {
            ByteBuffer byteBufferAllocate = ByteBuffer.allocate(3);
            ByteOrder byteOrder = ByteOrder.BIG_ENDIAN;
            ByteBuffer byteBufferOrder = byteBufferAllocate.order(byteOrder);
            byteBufferOrder.put((byte) a());
            byteBufferOrder.put((byte) b());
            byteBufferOrder.put((byte) (c() ? 1 : 0));
            byte[] bArrCopyOf = Arrays.copyOf(byteBufferOrder.array(), byteBufferOrder.position());
            int iC = c(bArrCopyOf);
            ByteBuffer byteBufferOrder2 = ByteBuffer.allocate(bArrCopyOf.length + 2 + 2).order(byteOrder);
            byteBufferOrder2.put((byte) 1);
            byteBufferOrder2.put((byte) (bArrCopyOf.length + 2));
            byteBufferOrder2.put(bArrCopyOf);
            byteBufferOrder2.putShort((short) iC);
            return Arrays.copyOf(byteBufferOrder2.array(), byteBufferOrder2.position());
        } catch (Exception e2) {
            e2.printStackTrace();
            return null;
        }
    }

    public d(byte[] bArr) {
        this.b = bArr;
    }

    public void a(int i) {
        this.f8742c = i;
    }

    public List b(int i) {
        if (this.b == null) {
            return null;
        }
        if (i <= 20) {
            i = 20;
        }
        ArrayList arrayList = new ArrayList();
        int i2 = i - 2;
        byte[] bArr = this.b;
        int i3 = 2;
        if (bArr.length <= i2) {
            byte[] bArr2 = new byte[bArr.length + 2];
            bArr2[0] = 1;
            bArr2[1] = (byte) bArr.length;
            System.arraycopy(bArr, 0, bArr2, 2, bArr.length);
            arrayList.add(bArr2);
            return arrayList;
        }
        byte[] bArr3 = new byte[i];
        bArr3[0] = 1;
        bArr3[1] = (byte) bArr.length;
        System.arraycopy(bArr, 0, bArr3, 2, i2);
        arrayList.add(bArr3);
        byte[] bArr4 = this.b;
        int length = bArr4.length - i2;
        byte[] bArr5 = new byte[length];
        System.arraycopy(bArr4, i2, bArr5, 0, length);
        for (byte[] bArr6 : a(bArr5, i - 1)) {
            byte[] bArr7 = new byte[i];
            bArr7[0] = (byte) i3;
            System.arraycopy(bArr6, 0, bArr7, 1, bArr6.length);
            i3++;
            arrayList.add(bArr7);
        }
        return arrayList;
    }

    public boolean c() {
        return this.f8743e;
    }
}
