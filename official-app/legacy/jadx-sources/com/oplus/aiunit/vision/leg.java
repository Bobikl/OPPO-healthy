package com.oplus.aiunit.vision;

import android.os.ParcelUuid;
import android.util.ArrayMap;
import android.util.SparseArray;
import androidx.annotation.Nullable;
import com.heytap.connect.cipher.AESUtil;
import com.heytap.store.base.core.http.HttpUtils;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.UUID;

/* JADX INFO: loaded from: classes16.dex */
public class leg {
    public final int a;

    @Nullable
    public final List<ParcelUuid> b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final SparseArray<byte[]> f13659c;
    public final Map<ParcelUuid, byte[]> d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f13660e;
    public final String f;
    public final byte[] g;
    public static final char[] h = AESUtil.HEX.toCharArray();
    public static final ParcelUuid BASE_UUID = ParcelUuid.fromString("00000000-0000-1000-8000-00805F9B34FB");

    public leg(List<ParcelUuid> list, SparseArray<byte[]> sparseArray, Map<ParcelUuid, byte[]> map, int i, int i2, String str, byte[] bArr) {
        this.b = list;
        this.f13659c = sparseArray;
        this.d = map;
        this.f = str;
        this.a = i;
        this.f13660e = i2;
        this.g = bArr;
    }

    public static byte[] a(byte[] bArr, int i, int i2) {
        byte[] bArr2 = new byte[i2];
        System.arraycopy(bArr, i, bArr2, 0, i2);
        return bArr2;
    }

    /* JADX WARN: Code duplicated, block: B:27:0x0095  */
    /* JADX WARN: Code duplicated, block: B:28:0x0097  */
    public static leg c(byte[] bArr) {
        ArrayList arrayList;
        if (bArr == null) {
            return null;
        }
        a7b.b("ScanRecordUtilMYX23P", "进入parseFromBytes");
        ArrayList arrayList2 = new ArrayList();
        SparseArray sparseArray = new SparseArray();
        ArrayMap arrayMap = new ArrayMap();
        int i = 0;
        String str = null;
        byte b = -2147483648;
        int i2 = -1;
        while (i < bArr.length) {
            try {
                int i3 = i + 1;
                int i4 = bArr[i] & 255;
                if (i4 == 0) {
                    if (arrayList2.isEmpty()) {
                        arrayList = null;
                    } else {
                        arrayList = arrayList2;
                    }
                    return new leg(arrayList, sparseArray, arrayMap, i2, b, str, bArr);
                }
                int i5 = i4 - 1;
                int i6 = i3 + 1;
                int i7 = bArr[i3] & 255;
                if (i7 == 22) {
                    arrayMap.put(e(a(bArr, i6, 16)), a(bArr, i6 + 2, i5 - 2));
                } else if (i7 != 255) {
                    switch (i7) {
                        case 1:
                            i2 = bArr[i6] & 255;
                            break;
                        case 2:
                        case 3:
                            d(bArr, i6, i5, 16, arrayList2);
                            break;
                        case 4:
                        case 5:
                            d(bArr, i6, i5, 32, arrayList2);
                            break;
                        case 6:
                        case 7:
                            d(bArr, i6, i5, 128, arrayList2);
                            break;
                        case 8:
                        case 9:
                            str = new String(a(bArr, i6, i5));
                            break;
                        case 10:
                            b = bArr[i6];
                            break;
                    }
                } else {
                    sparseArray.put(((bArr[i6 + 1] & 255) << 8) + (255 & bArr[i6]), a(bArr, i6 + 2, i5 - 2));
                }
                i = i5 + i6;
            } catch (Exception e2) {
                a7b.b("ScanRecordUtil", "unable to parse scan record: " + Arrays.toString(bArr) + "    error:" + e2.getMessage());
                return new leg(null, null, null, -1, Integer.MIN_VALUE, null, bArr);
            }
        }
        if (arrayList2.isEmpty()) {
            arrayList = null;
        } else {
            arrayList = arrayList2;
        }
        return new leg(arrayList, sparseArray, arrayMap, i2, b, str, bArr);
    }

    public static int d(byte[] bArr, int i, int i2, int i3, List<ParcelUuid> list) {
        while (i2 > 0) {
            list.add(e(a(bArr, i, i3)));
            i2 -= i3;
            i += i3;
        }
        return i;
    }

    public static ParcelUuid e(byte[] bArr) {
        if (bArr == null) {
            throw new IllegalArgumentException("uuidBytes cannot be null");
        }
        int length = bArr.length;
        if (length != 16 && length != 32 && length != 128) {
            throw new IllegalArgumentException("uuidBytes length invalid - " + length);
        }
        if (length == 128) {
            ByteBuffer byteBufferOrder = ByteBuffer.wrap(bArr).order(ByteOrder.LITTLE_ENDIAN);
            return new ParcelUuid(new UUID(byteBufferOrder.getLong(8), byteBufferOrder.getLong(0)));
        }
        long j2 = length == 16 ? ((long) (bArr[0] & 255)) + ((long) ((bArr[1] & 255) << 8)) : ((long) (bArr[0] & 255)) + ((long) ((bArr[1] & 255) << 8)) + ((long) ((bArr[2] & 255) << 16)) + ((long) ((bArr[3] & 255) << 24));
        ParcelUuid parcelUuid = BASE_UUID;
        return new ParcelUuid(new UUID(parcelUuid.getUuid().getMostSignificantBits() + (j2 << 32), parcelUuid.getUuid().getLeastSignificantBits()));
    }

    public static String f(SparseArray<byte[]> sparseArray) {
        if (sparseArray == null) {
            return "null";
        }
        if (sparseArray.size() == 0) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder();
        sb.append('{');
        for (int i = 0; i < sparseArray.size(); i++) {
            sb.append(sparseArray.keyAt(i));
            sb.append(HttpUtils.EQUAL_SIGN);
            sb.append(Arrays.toString(sparseArray.valueAt(i)));
        }
        sb.append('}');
        return sb.toString();
    }

    public static <T> String g(Map<T, byte[]> map) {
        if (map == null) {
            return "null";
        }
        if (map.isEmpty()) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder();
        sb.append('{');
        Iterator<Map.Entry<T, byte[]>> it = map.entrySet().iterator();
        while (it.hasNext()) {
            T key = it.next().getKey();
            sb.append(key);
            sb.append(HttpUtils.EQUAL_SIGN);
            sb.append(Arrays.toString(map.get(key)));
            if (it.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append('}');
        return sb.toString();
    }

    public SparseArray<byte[]> b() {
        return this.f13659c;
    }

    public String toString() {
        return "ScanRecord [mAdvertiseFlags=" + this.a + ", mServiceUuids=" + this.b + ", mManufacturerSpecificData=" + f(this.f13659c) + ", mServiceData=" + g(this.d) + ", mTxPowerLevel=" + this.f13660e + ", mDeviceName=" + this.f + "]";
    }
}
