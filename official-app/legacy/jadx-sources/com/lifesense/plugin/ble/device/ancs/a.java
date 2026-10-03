package com.lifesense.plugin.ble.device.ancs;

import com.lifesense.plugin.ble.data.LSAppCategory;
import com.lifesense.plugin.ble.data.tracker.ATImageMessage;
import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public class a extends c {
    public static final int MESSAGE_CATEGORY_ADD = 0;
    public static final int MESSAGE_CATEGORY_MODIFIED = 1;
    public static final int MESSAGE_CATEGORY_REMOVED = 2;
    public static final int MESSAGE_TYPE_IMAGE = 2;
    public static final int MESSAGE_TYPE_INCOMING_CALL = 1;
    public static final int MESSAGE_TYPE_SOCIAL = 4;
    private static int b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f8733c = 4;
    private int d = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f8734e = 0;
    private int f;
    private String g;
    private String h;
    private int i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private long f8735j;
    private int k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private ATImageMessage f8736l;
    private String m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private com.lifesense.plugin.ble.device.a.a.a.d f8737n;
    private int o;

    public a(String str, String str2, int i) {
        this.g = str;
        this.h = str2;
        this.i = i;
        int i2 = b + 1;
        b = i2;
        this.f = i2;
        this.f8735j = System.currentTimeMillis();
        this.f8736l = null;
        this.o = 0;
    }

    public int a() {
        return this.o;
    }

    public String b() {
        return this.m;
    }

    public com.lifesense.plugin.ble.device.a.a.a.d c() {
        return this.f8737n;
    }

    public ATImageMessage d() {
        return this.f8736l;
    }

    public int e() {
        return this.k;
    }

    public int f() {
        return this.f8733c;
    }

    public int g() {
        return this.f;
    }

    public String h() {
        return this.g;
    }

    public String i() {
        return this.h;
    }

    public int j() {
        return this.i;
    }

    public byte[] k() {
        String str = this.g;
        if (str == null) {
            return null;
        }
        try {
            byte[] bytes = str.getBytes("utf-8");
            if (bytes == null || bytes.length <= 240) {
                return bytes;
            }
            byte[] bArr = new byte[240];
            System.arraycopy(bytes, 0, bArr, 0, 240);
            return bArr;
        } catch (UnsupportedEncodingException e2) {
            e2.printStackTrace();
            return null;
        }
    }

    public byte[] l() {
        byte[] bArrK = k();
        if (bArrK == null) {
            return null;
        }
        byte[] bArr = new byte[bArrK.length + 13];
        bArr[0] = (byte) this.f8733c;
        bArr[1] = (byte) this.d;
        byte[] bArrA = a((short) this.i);
        System.arraycopy(bArrA, 0, bArr, 2, bArrA.length);
        int length = 2 + bArrA.length;
        bArr[length] = (byte) this.f8734e;
        int i = length + 1;
        byte[] bArrD = d(this.f);
        System.arraycopy(bArrD, 0, bArr, i, bArrD.length);
        int length2 = i + bArrD.length;
        byte[] bArrA2 = a((short) bArrK.length);
        System.arraycopy(bArrA2, 0, bArr, length2, bArrA2.length);
        int length3 = length2 + bArrA2.length;
        System.arraycopy(bArrK, 0, bArr, length3, bArrK.length);
        int length4 = length3 + bArrK.length;
        int i2 = 0;
        for (int i3 = 0; i3 < length4; i3++) {
            i2 += bArr[i3] & 255;
        }
        byte[] bArrA3 = a((short) i2);
        System.arraycopy(bArrA3, 0, bArr, length4, bArrA3.length);
        return bArr;
    }

    public int m() {
        ATImageMessage aTImageMessage;
        if (this.i == LSAppCategory.IncomingCall.getValue()) {
            return 1;
        }
        if (this.i == LSAppCategory.WeatherInfo.getValue()) {
            return 3;
        }
        if (this.i == LSAppCategory.MusicInfo.getValue()) {
            return 4;
        }
        if (this.i != LSAppCategory.IotDevice.getValue() || (aTImageMessage = this.f8736l) == null || aTImageMessage.getIotDevice() == null) {
            return 2;
        }
        return (this.f8736l.getIotDevice().getWorkingState() & 15) | ((this.f8736l.getIotDevice().getIndex() << 4) & 240);
    }

    public byte[] n() {
        ATImageMessage aTImageMessage = this.f8736l;
        if (aTImageMessage == null || aTImageMessage.getImageBytes() == null) {
            return null;
        }
        ByteBuffer byteBufferOrder = ByteBuffer.allocate(30).order(ByteOrder.BIG_ENDIAN);
        byteBufferOrder.put((byte) m());
        byteBufferOrder.put((byte) 1);
        byteBufferOrder.put((byte) this.d);
        byteBufferOrder.putShort((short) this.f8736l.getHorizontalPx());
        byteBufferOrder.putShort((short) this.f8736l.getVerticalPx());
        byteBufferOrder.put((byte) this.f8736l.getColor());
        byteBufferOrder.put((byte) this.f8736l.getAlgorithm());
        int iA = com.lifesense.plugin.ble.device.proto.A5.parser.f.a(this.f8736l.getTime());
        int iB = com.lifesense.plugin.ble.device.proto.A5.parser.f.b(this.f8736l.getTime());
        byteBufferOrder.put((byte) iA);
        byteBufferOrder.put((byte) iB);
        byteBufferOrder.putShort((byte) j());
        byte[] bArr = new byte[8];
        for (int i = 0; i < 8; i++) {
            bArr[i] = 0;
        }
        byteBufferOrder.put(bArr);
        byteBufferOrder.putShort((short) this.f8736l.getImageBytes().length);
        byteBufferOrder.putShort((short) 1);
        byteBufferOrder.putShort((short) c(Arrays.copyOf(byteBufferOrder.array(), byteBufferOrder.position())));
        return Arrays.copyOf(byteBufferOrder.array(), byteBufferOrder.position());
    }

    public String o() {
        StringBuilder sb;
        int iG;
        ATImageMessage aTImageMessage = this.f8736l;
        if (aTImageMessage != null && aTImageMessage.getImageBytes() != null) {
            sb = new StringBuilder();
            sb.append("01");
            iG = m();
        } else {
            if (LSAppCategory.IncomingCall.getValue() == this.i) {
                return "0001";
            }
            sb = new StringBuilder();
            sb.append("00");
            iG = g();
        }
        sb.append(iG);
        return sb.toString();
    }

    public String toString() {
        return "AncsMessage{type=" + this.f8733c + ", category=" + this.d + ", count=" + this.f8734e + ", id=" + this.f + ", title='" + this.g + "', content='" + this.h + "', appId=" + this.i + ", time=" + this.f8735j + ", callState=" + this.k + ", imageInfo=" + this.f8736l + ", resendCount=" + this.o + '}';
    }

    public static String a(boolean z, int i, int i2) {
        StringBuilder sb;
        if (z) {
            sb = new StringBuilder();
            sb.append("01");
            sb.append(i2);
        } else {
            sb = new StringBuilder();
            sb.append("00");
            sb.append(i);
        }
        return sb.toString();
    }

    private byte[] e(int i) {
        String str = this.h;
        if (str != null && str.length() != 0) {
            try {
                byte[] bytes = this.h.getBytes("utf-8");
                if (bytes.length <= i) {
                    return bytes;
                }
                byte[] bArr = new byte[i];
                System.arraycopy(bytes, 0, bArr, 0, i);
                return bArr;
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
        return null;
    }

    public void b(int i) {
        this.k = i;
    }

    public void c(int i) {
        this.f8734e = i;
    }

    public List a(b bVar) {
        if (bVar != null && bVar.a() == 161) {
            try {
                ArrayList arrayList = new ArrayList();
                List<byte[]> listA = a(e(bVar.c()), 250);
                int i = 1;
                for (byte[] bArr : listA) {
                    ByteBuffer byteBufferOrder = ByteBuffer.allocate(bArr.length + 13).order(ByteOrder.BIG_ENDIAN);
                    byteBufferOrder.put((byte) -63);
                    byteBufferOrder.put((byte) bVar.d());
                    byteBufferOrder.putInt(bVar.f());
                    byteBufferOrder.put((byte) listA.size());
                    byteBufferOrder.put((byte) i);
                    byteBufferOrder.put((byte) bVar.b());
                    byteBufferOrder.putShort((short) bArr.length);
                    byteBufferOrder.put(bArr);
                    byteBufferOrder.putShort((short) c(Arrays.copyOf(byteBufferOrder.array(), byteBufferOrder.position())));
                    i++;
                    arrayList.add(Arrays.copyOf(byteBufferOrder.array(), byteBufferOrder.position()));
                }
                return arrayList;
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
        return null;
    }

    public void b(String str) {
        this.g = str;
    }

    public void c(String str) {
        this.h = str;
    }

    public void a(int i) {
        this.o = i;
    }

    public byte[] b(b bVar) {
        ATImageMessage aTImageMessage;
        if (bVar == null || (aTImageMessage = this.f8736l) == null || aTImageMessage.getImageBytes() == null) {
            return null;
        }
        ByteBuffer byteBufferOrder = ByteBuffer.allocate(this.f8736l.getImageBytes().length + 1 + 1 + 2 + 2 + 2).order(ByteOrder.BIG_ENDIAN);
        byteBufferOrder.put((byte) m());
        byteBufferOrder.put((byte) 2);
        byteBufferOrder.putShort((short) this.f8736l.getImageBytes().length);
        byteBufferOrder.putShort((short) 0);
        byteBufferOrder.put(this.f8736l.getImageBytes());
        byteBufferOrder.putShort((short) c(Arrays.copyOf(byteBufferOrder.array(), byteBufferOrder.position())));
        return Arrays.copyOf(byteBufferOrder.array(), byteBufferOrder.position());
    }

    public void a(ATImageMessage aTImageMessage) {
        this.f8736l = aTImageMessage;
    }

    public void a(com.lifesense.plugin.ble.device.a.a.a.d dVar) {
        this.f8737n = dVar;
    }

    public void a(String str) {
        this.m = str;
    }
}
