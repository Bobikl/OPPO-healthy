package com.lifesense.android.bluetooth.core.tools;

import android.annotation.SuppressLint;
import android.bluetooth.BluetoothGatt;
import android.text.TextUtils;
import com.lifesense.android.bluetooth.core.bean.DeviceFeature;
import com.lifesense.android.bluetooth.core.bean.constant.PacketProfile;
import com.lifesense.android.bluetooth.core.enums.ProtocolType;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import org.apache.commons.collections4.CollectionUtils;

/* JADX INFO: loaded from: classes4.dex */
public class a {
    public static DeviceFeature a(byte[] bArr) {
        DeviceFeature deviceFeature = new DeviceFeature();
        if (bArr.length == 4) {
            int iG = e.g(bArr);
            deviceFeature.setBind(a(iG, 0));
            deviceFeature.setUnbind(a(iG, 1));
            deviceFeature.setUtc(a(iG, 2));
            deviceFeature.setTimeZone(a(iG, 3));
            deviceFeature.setTimeStamp(a(iG, 4));
            deviceFeature.setMultiUser(a(iG, 5));
            deviceFeature.setBodyFatPercentage(a(iG, 6));
            deviceFeature.setBasalMetabolism(a(iG, 7));
            deviceFeature.setMusclePercentage(a(iG, 8));
            deviceFeature.setMuscleMass(a(iG, 9));
            deviceFeature.setFatFreeMass(a(iG, 10));
            deviceFeature.setSoftLeanMass(a(iG, 11));
            deviceFeature.setBodyWaterMass(a(iG, 12));
            deviceFeature.setImpedance(a(iG, 13));
        }
        return deviceFeature;
    }

    @SuppressLint({"NewApi"})
    public static String b(byte[] bArr) {
        byte[] bArr2;
        try {
            byte[] bArrCopyOf = Arrays.copyOf(bArr, bArr.length);
            bArr2 = null;
            int i = 0;
            while (i < bArrCopyOf.length - 2) {
                try {
                    int i2 = i + 1;
                    int i3 = bArrCopyOf[i];
                    if (i3 <= 0) {
                        break;
                    }
                    int i4 = i2 + 1;
                    if (bArrCopyOf[i2] != 9) {
                        i = (i3 - 1) + i4;
                    } else {
                        bArr2 = new byte[i3];
                        int i5 = 0;
                        while (i3 > 1 && i4 < bArrCopyOf.length) {
                            int i6 = i4 + 1;
                            bArr2[i5] = bArrCopyOf[i4];
                            i5++;
                            i3--;
                            i4 = i6;
                        }
                        i = i4;
                    }
                } catch (Exception e2) {
                    e = e2;
                    e.printStackTrace();
                }
            }
        } catch (Exception e3) {
            e = e3;
            bArr2 = null;
        }
        if (bArr2 == null || bArr2.length <= 0) {
            return null;
        }
        return e.e(e.d(bArr2));
    }

    public static List<UUID> c(byte[] bArr) {
        byte b;
        ArrayList arrayList = new ArrayList();
        try {
            ByteBuffer byteBufferOrder = ByteBuffer.wrap(bArr).order(ByteOrder.LITTLE_ENDIAN);
            while (byteBufferOrder.remaining() > 2 && (b = byteBufferOrder.get()) != 0) {
                byte b2 = byteBufferOrder.get();
                if (b2 == 2 || b2 == 3) {
                    while (b >= 2) {
                        arrayList.add(UUID.fromString(String.format("%08x-0000-1000-8000-00805f9b34fb", Short.valueOf(byteBufferOrder.getShort()))));
                        b = (byte) (b - 2);
                    }
                } else if (b2 == 6 || b2 == 7) {
                    while (b >= 16) {
                        arrayList.add(new UUID(byteBufferOrder.getLong(), byteBufferOrder.getLong()));
                        b = (byte) (b - 16);
                    }
                } else {
                    byteBufferOrder.position((byteBufferOrder.position() + b) - 1);
                }
            }
            return arrayList;
        } catch (Exception e2) {
            e2.printStackTrace();
            return arrayList;
        }
    }

    public static String d(byte[] bArr) {
        String strC = "";
        int i = 0;
        while (i < bArr.length - 2) {
            int i2 = i + 1;
            byte b = bArr[i];
            if (b == 0) {
                break;
            }
            int i3 = i2 + 1;
            if (bArr[i2] == -1 && b >= 11) {
                strC = e.c(e.a(bArr, i3 + 2, i3 + 4));
            }
            i = (b - 1) + i3;
        }
        return strC;
    }

    public static int e(byte[] bArr) {
        byte b = 1;
        int i = 0;
        while (i < bArr.length - 2) {
            int i2 = i + 1;
            byte b2 = bArr[i];
            if (b2 == 0) {
                break;
            }
            int i3 = i2 + 1;
            if (bArr[i2] == -1 && b2 >= 11) {
                b = bArr[i3 + 4];
            }
            i = (b2 - 1) + i3;
        }
        return b;
    }

    public static PacketProfile a(int i) {
        for (PacketProfile packetProfile : PacketProfile.values()) {
            if (packetProfile.getCommndValue() == i) {
                return packetProfile;
            }
        }
        return PacketProfile.UNKNOWN;
    }

    public static String a(BluetoothGatt bluetoothGatt, int i, int i2, String str) {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("gattStatus=" + i + "(" + i2 + "),");
        StringBuilder sb = new StringBuilder();
        sb.append("bleStatus=");
        sb.append(com.lifesense.android.bluetooth.core.system.b.getInstance().e());
        sb.append(",");
        stringBuffer.append(sb.toString());
        stringBuffer.append("isConnected:" + (com.lifesense.android.bluetooth.core.system.b.getInstance().d(str) != null) + "; ");
        return stringBuffer.toString();
    }

    public static String a(UUID uuid) {
        if (uuid == null) {
            return "null";
        }
        String string = uuid.toString();
        if (!TextUtils.isEmpty(string) && string.length() > 8) {
            string = string.substring(4, 8);
        }
        return string.toUpperCase();
    }

    public static String a(byte[] bArr, ProtocolType protocolType, String str) {
        if (protocolType == null) {
            StringBuilder sb = new StringBuilder();
            sb.append("faield to parse device broadcast name,protocol is null...");
            sb.append(str);
            return null;
        }
        if (protocolType.equals(ProtocolType.A6)) {
            return str.replace(":", "");
        }
        String strB = b(bArr);
        if (strB == null) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Failed to parse device broadcast name:");
            sb2.append(strB);
            return null;
        }
        StringBuilder sb3 = new StringBuilder();
        sb3.append("current scan device broadcast name:");
        sb3.append(strB);
        sb3.append("[");
        sb3.append(str);
        sb3.append("]; ;protocol :");
        sb3.append(protocolType);
        return strB;
    }

    public static List<String> a(List<UUID> list) {
        if (CollectionUtils.isEmpty(list)) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        Iterator<UUID> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(a(it.next()).toUpperCase());
        }
        return arrayList;
    }

    public static boolean a(int i, int i2) {
        return ((i >> i2) & 1) == 1;
    }
}
