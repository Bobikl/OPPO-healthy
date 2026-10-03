package com.lifesense.android.bluetooth.core.protocol;

import com.lifesense.android.bluetooth.core.bean.Bytable;
import com.lifesense.android.bluetooth.core.bean.constant.BindUserState;
import com.lifesense.android.bluetooth.core.bean.constant.DeviceConfigInfoType;
import com.lifesense.android.bluetooth.core.bean.constant.PacketProfile;
import java.util.Random;

/* JADX INFO: loaded from: classes4.dex */
public final class e {
    public static final int A6_BIND = 1;
    public static final int A6_MEASURED_DATA = 0;
    public static final int A6_UNBIND = 2;
    public static final byte DOWNLOAD_INFORMATION_BROADCAST_ID_COMMAND = 33;
    public static final byte DOWNLOAD_INFORMATION_ENABLE_DISCONNECT_COMMAND = 34;
    public static final byte DOWNLOAD_INFORMATION_UTC_COMMAND = 2;

    public static BindUserState a(int i) {
        if (i == 0) {
            return BindUserState.GUEST;
        }
        if (i == 1) {
            return BindUserState.USER1;
        }
        if (i == 2) {
            return BindUserState.USER2;
        }
        if (i != 3) {
            return i != 4 ? BindUserState.INVALID_USER : BindUserState.USER4;
        }
        return BindUserState.USER3;
    }

    public static byte[] b() {
        return new byte[]{34};
    }

    public static com.lifesense.android.bluetooth.core.business.push.msg.a a(DeviceConfigInfoType deviceConfigInfoType, Object obj) {
        if (obj == null) {
            return null;
        }
        com.lifesense.android.bluetooth.core.business.push.msg.a aVar = new com.lifesense.android.bluetooth.core.business.push.msg.a();
        PacketProfile packetProfile = DeviceConfigInfoType.get(deviceConfigInfoType);
        if (packetProfile == null) {
            return null;
        }
        aVar.a(packetProfile);
        if (!(obj instanceof Bytable)) {
            return null;
        }
        aVar.a(((Bytable) obj).toBytes());
        return aVar;
    }

    public static byte[] a() {
        int iNextInt = new Random().nextInt();
        return new byte[]{33, (byte) ((iNextInt >> 24) & 255), (byte) ((iNextInt >> 16) & 255), (byte) ((iNextInt >> 8) & 255), (byte) (iNextInt & 255)};
    }

    public static byte[] a(int i, boolean z, PacketProfile packetProfile) {
        String strC = com.lifesense.android.bluetooth.core.tools.e.c(com.lifesense.android.bluetooth.core.tools.e.a((short) packetProfile.getCommndValue()));
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(strC);
        stringBuffer.append(com.lifesense.android.bluetooth.core.tools.e.a(i + "", 2));
        stringBuffer.append(com.lifesense.android.bluetooth.core.tools.e.a((z ? 1 : 0) + "", 2));
        return com.lifesense.android.bluetooth.core.tools.e.a(stringBuffer.toString().toCharArray());
    }

    public static byte[] a(DeviceConfigInfoType deviceConfigInfoType) {
        return new byte[]{(byte) PacketProfile.QUERY_DEVICE_CONFIG_INFO.getCommndValue(), 0};
    }

    public static byte[] a(boolean z, String str, int i) {
        String strC = com.lifesense.android.bluetooth.core.tools.e.c(com.lifesense.android.bluetooth.core.tools.e.a((short) PacketProfile.DEVICE_A6_AUTH.getCommndValue()));
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(strC);
        stringBuffer.append(z ? "01" : "02");
        stringBuffer.append(str);
        stringBuffer.append(com.lifesense.android.bluetooth.core.tools.e.a(i + "", 2));
        stringBuffer.append("02");
        return com.lifesense.android.bluetooth.core.tools.e.b(stringBuffer.toString());
    }
}
