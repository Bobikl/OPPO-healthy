package com.lifesense.plugin.ble.c;

import android.annotation.SuppressLint;
import android.text.TextUtils;
import com.lifesense.plugin.ble.data.LSAppCategory;
import com.lifesense.plugin.ble.data.LSDeviceInfo;
import com.lifesense.plugin.ble.data.LSProtocolType;
import com.lifesense.plugin.ble.data.tracker.setting.ATProductModel;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;

/* JADX INFO: loaded from: classes5.dex */
public class c {
    private static com.lifesense.plugin.ble.device.proto.e a = com.lifesense.plugin.ble.device.proto.e.a();

    public static int a(int i, int i2) {
        int i3 = i / 100;
        if (i == i2 || i2 > i) {
            return 100;
        }
        if (i2 % i3 >= i3) {
            return 0;
        }
        int i4 = i2 / i3;
        if (i4 == 100 || i4 > 100) {
            return 99;
        }
        return i4;
    }

    public static String b(String str, List list) {
        LSProtocolType lSProtocolType;
        if (list == null || list.size() <= 0) {
            lSProtocolType = LSProtocolType.Unknown;
        } else {
            String string = com.lifesense.plugin.ble.device.proto.e.a().a(list).toString();
            if (string == null || !LSProtocolType.WechatActivityTracker.toString().equalsIgnoreCase(string) || str == null || str.length() <= 0) {
                return string;
            }
            if (str.startsWith("LS_SCA") || str.startsWith("LS_W") || str.startsWith("1LS_W")) {
                lSProtocolType = LSProtocolType.WechatScale;
            } else {
                if (!str.startsWith("1LS_G") && !str.startsWith("LS_SHK")) {
                    return string;
                }
                lSProtocolType = LSProtocolType.WechatGlucoseMeter;
            }
        }
        return lSProtocolType.toString();
    }

    public static int c(byte[] bArr) {
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
            i = i3 + (b2 - 1);
        }
        return b;
    }

    public static String d(byte[] bArr) {
        String strD = "";
        int i = 0;
        while (i < bArr.length - 2) {
            int i2 = i + 1;
            byte b = bArr[i];
            if (b == 0) {
                break;
            }
            int i3 = i2 + 1;
            if (bArr[i2] == -1 && b >= 11) {
                strD = a.d(a.a(bArr, i3, i3 + 2));
            }
            i = i3 + (b - 1);
        }
        return strD;
    }

    public static String e(byte[] bArr) {
        String strD = "";
        int i = 0;
        while (i < bArr.length - 2) {
            int i2 = i + 1;
            byte b = bArr[i];
            if (b == 0) {
                break;
            }
            int i3 = i2 + 1;
            if (bArr[i2] == -1 && b >= 11) {
                strD = a.d(a.a(bArr, i3 + 2, i3 + 4));
            }
            i = i3 + (b - 1);
        }
        return strD;
    }

    public static boolean f(byte[] bArr) {
        return bArr != null && (Integer.parseInt(a.d(new byte[]{bArr[0]}), 16) & 128) == 128;
    }

    public static String g(byte[] bArr) {
        String str = "";
        int i = 0;
        while (i < bArr.length - 2) {
            try {
                int i2 = i + 1;
                int i3 = bArr[i] & 255;
                if (i3 == 0) {
                    break;
                }
                int i4 = i2 + 1;
                if ((bArr[i2] & 255) == 255) {
                    str = str + a.d(a.a(bArr, i4, (i3 - 1) + i4));
                }
                i = (i3 - 1) + i4;
            } catch (Exception unused) {
            }
        }
        return str;
    }

    public static int h(byte[] bArr) {
        try {
            if (bArr.length < 11) {
                return 0;
            }
            byte[] bArr2 = new byte[6];
            System.arraycopy(bArr, 2, bArr2, 0, 6);
            a.d(bArr2).toUpperCase();
            byte[] bArr3 = new byte[1];
            System.arraycopy(bArr, 10, bArr3, 0, 1);
            return a.a(bArr3[0]);
        } catch (Exception e2) {
            e2.printStackTrace();
            return 0;
        }
    }

    public static String i(byte[] bArr) {
        try {
            byte[] bArr2 = new byte[6];
            if (bArr.length >= 11) {
                System.arraycopy(bArr, 2, bArr2, 0, 6);
            } else {
                System.arraycopy(bArr, bArr.length - 6, bArr2, 0, 6);
            }
            return a.d(bArr2).toUpperCase();
        } catch (Exception e2) {
            e2.printStackTrace();
            return "";
        }
    }

    public static int a(LSDeviceInfo lSDeviceInfo, double d) {
        float f;
        float f2;
        ATProductModel aTProductModelA = a(lSDeviceInfo);
        if (aTProductModelA.equals(ATProductModel.Bonbon) || aTProductModelA.equals(ATProductModel.BonbonC)) {
            f = 3.0f;
            f2 = 2.1f;
        } else {
            f2 = 3.6f;
            f = 4.1f;
            if (!aTProductModelA.equals(ATProductModel.MamboWatch) && !aTProductModelA.equals(ATProductModel.Mambo3)) {
                if (aTProductModelA.equals(ATProductModel.MamboHR)) {
                    f2 = 3.55f;
                } else if (aTProductModelA.equals(ATProductModel.MamboCall) || aTProductModelA.equals(ATProductModel.Mambo)) {
                    f2 = 3.64f;
                }
            }
        }
        if (d >= f) {
            return 100;
        }
        double d2 = f2;
        if (d <= d2) {
            return 0;
        }
        try {
            return Integer.parseInt(a.a(((d - d2) / ((double) (f - f2))) * 100.0d, 0));
        } catch (Exception unused) {
            return 0;
        }
    }

    @SuppressLint({"NewApi"})
    public static String b(byte[] bArr) {
        int i;
        byte[] bArrCopyOf = Arrays.copyOf(bArr, bArr.length);
        byte[] bArr2 = null;
        for (int i2 = 0; i2 < bArrCopyOf.length - 2; i2 = i) {
            int i3 = i2 + 1;
            int i4 = bArrCopyOf[i2];
            if (i4 == 0) {
                break;
            }
            i = i3 + 1;
            byte b = bArrCopyOf[i3];
            if (b == 8 || b == 9) {
                bArr2 = new byte[i4];
                int i5 = 0;
                while (i4 > 1) {
                    bArr2[i5] = bArrCopyOf[i];
                    i5++;
                    i4--;
                    i++;
                }
            } else {
                i += i4 - 1;
            }
        }
        if (bArr2 == null || bArr2.length <= 0) {
            return null;
        }
        return a.i(a.h(bArr2));
    }

    public static LSAppCategory c(String str) {
        if (str != null) {
            String str2 = new String(str);
            if (str.startsWith("AA01")) {
                str2 = str2.substring(4);
            }
            if (str2.length() >= 4) {
                int i = Integer.parseInt(str2.substring(2, 4), 16);
                if (i == 2) {
                    return LSAppCategory.All;
                }
                if (i == 254) {
                    return LSAppCategory.SeWellness;
                }
                switch (i) {
                    case 4:
                        return LSAppCategory.Sms;
                    case 5:
                        return LSAppCategory.Wechat;
                    case 6:
                        return LSAppCategory.QQ;
                    case 7:
                        return LSAppCategory.Facebook;
                    case 8:
                        return LSAppCategory.Twitter;
                    case 9:
                        return LSAppCategory.Line;
                    case 10:
                        return LSAppCategory.Gmail;
                    case 11:
                        return LSAppCategory.KaKao;
                    case 12:
                        return LSAppCategory.WhatsApp;
                }
            }
        }
        return null;
    }

    public static boolean d(String str) {
        if (str != null) {
            String str2 = new String(str);
            if (str.startsWith("AA01")) {
                str2 = str2.substring(4);
            }
            if (str2.length() >= 6 && Integer.parseInt(str2.substring(4, 6), 16) == 1) {
                return true;
            }
        }
        return false;
    }

    public static ATProductModel a(LSDeviceInfo lSDeviceInfo) {
        String modelNumber = lSDeviceInfo.getModelNumber();
        String softwareVersion = lSDeviceInfo.getSoftwareVersion();
        if (TextUtils.isEmpty(modelNumber)) {
            return ATProductModel.Unknown;
        }
        if (modelNumber.contains("407")) {
            return ATProductModel.Bonbon;
        }
        if (modelNumber.contains("410")) {
            return ATProductModel.BonbonC;
        }
        if (!modelNumber.contains("405")) {
            if (modelNumber.contains("415")) {
                return ATProductModel.MamboWatch;
            }
            if (modelNumber.contains("417")) {
                return ATProductModel.Mambo2;
            }
            if (modelNumber.contains("418")) {
                return ATProductModel.Ziva;
            }
            if (modelNumber.contains("421")) {
                return ATProductModel.MamboDD;
            }
            if (modelNumber.contains("422")) {
                return ATProductModel.MamboMID;
            }
            return modelNumber.contains("428") ? ATProductModel.Mambo3 : ATProductModel.Unknown;
        }
        if (!TextUtils.isEmpty(softwareVersion) && softwareVersion.length() > 2) {
            String strSubstring = softwareVersion.substring(2);
            if (TextUtils.isDigitsOnly(strSubstring)) {
                try {
                    int i = Integer.parseInt(strSubstring);
                    if (i <= 19) {
                        return ATProductModel.Mambo;
                    }
                    if (i > 27 && i <= 59) {
                        return ATProductModel.MamboCall;
                    }
                    if (i >= 60) {
                        return ATProductModel.MamboHR;
                    }
                } catch (Exception unused) {
                    return ATProductModel.Mambo;
                }
            }
        }
        return ATProductModel.Mambo;
    }

    public static boolean b(int i, int i2) {
        return ((i >> i2) & 1) == 1;
    }

    public static String a(String str) {
        if (str != null && str.length() != 0) {
            try {
                int iLastIndexOf = str.lastIndexOf(":");
                String hexString = Integer.toHexString(a.a((byte) (Integer.parseInt(str.substring(iLastIndexOf + 1), 16) - 2)));
                StringBuffer stringBuffer = new StringBuffer();
                stringBuffer.append(str.substring(0, iLastIndexOf));
                stringBuffer.append(":");
                stringBuffer.append(a.c(hexString, 2));
                return stringBuffer.toString().toUpperCase();
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
        return str;
    }

    public static boolean b(String str) {
        if (str == null || str.length() <= 0) {
            return false;
        }
        return str.startsWith("LsD") || str.startsWith("LsDfu");
    }

    public static String a(String str, List list) {
        if (list == null || list.size() <= 0) {
            return "00";
        }
        String string = com.lifesense.plugin.ble.device.proto.e.a().a(list).toString();
        if (!LSProtocolType.WechatActivityTracker.toString().equalsIgnoreCase(string)) {
            if (LSProtocolType.A6.toString().equalsIgnoreCase(string)) {
                return (str == null || !str.startsWith("LS2")) ? "01" : "02";
            }
            return a(list);
        }
        if (str == null || str.length() <= 0) {
            return "04";
        }
        if (str.startsWith("LS_SCA") || str.startsWith("LS_W")) {
            return "01";
        }
        return (str.equals("1LS_G") || str.equals("LS_SHK")) ? "06" : "04";
    }

    public static String a(List list) {
        if (list == null || list.size() <= 0) {
            return "00";
        }
        Iterator it = list.iterator();
        String str = "00";
        while (it.hasNext()) {
            UUID uuid = (UUID) it.next();
            String strD = a.d(uuid.toString());
            if (strD != "00") {
                StringBuilder sb = new StringBuilder();
                sb.append("set device type—?");
                sb.append(strD);
                sb.append(" uuid—?");
                sb.append(uuid.toString().substring(4, 8));
                return strD;
            }
            str = strD;
        }
        return str;
    }

    public static String a(byte[] bArr, String str, String str2) {
        StringBuilder sb = null;
        if (str == null || str.length() == 0) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("faield to parse device broadcast name,protocol is null...");
            sb2.append(str2);
            return null;
        }
        if (str.equals(LSProtocolType.A4.toString())) {
            byte[] bArrH = a.h(bArr);
            if (bArr != null && bArrH.length > 0) {
                sb = new StringBuilder(bArrH.length);
                for (byte b : bArrH) {
                    sb.append(String.format("%02X ", Byte.valueOf(b)));
                }
            }
            String strReplace = sb.toString().replace(" ", "");
            String strSubstring = strReplace.substring(strReplace.length() - 12);
            StringBuilder sb3 = new StringBuilder();
            sb3.append("current scan device broadcast name:");
            sb3.append(b(bArr));
            sb3.append("; broadcast Id=");
            sb3.append(strSubstring);
            return strSubstring;
        }
        if (str.equals(LSProtocolType.A5.toString()) || str.equals(LSProtocolType.WechatActivityTracker.toString()) || str.equals(LSProtocolType.WechatCallAT.toString()) || str.equals(LSProtocolType.WechatScale.toString()) || str.equals(LSProtocolType.A6.toString())) {
            return str2.replace(":", "");
        }
        String strB = b(bArr);
        if (strB == null) {
            StringBuilder sb4 = new StringBuilder();
            sb4.append("Failed to parse device broadcast name:");
            sb4.append(strB);
            sb4.append("[");
            sb4.append(str2);
            sb4.append("]");
            return null;
        }
        StringBuilder sb5 = new StringBuilder();
        sb5.append("current scan device broadcast name:");
        sb5.append(strB);
        sb5.append("[");
        sb5.append(str2);
        sb5.append("]; ;protocol :");
        sb5.append(str);
        return strB;
    }

    public static List a(byte[] bArr) {
        byte b;
        ArrayList arrayList = new ArrayList();
        try {
            ByteBuffer byteBufferOrder = ByteBuffer.wrap(bArr).order(ByteOrder.LITTLE_ENDIAN);
            while (byteBufferOrder.remaining() > 2 && (b = byteBufferOrder.get()) != 0) {
                byte b2 = byteBufferOrder.get();
                if (b2 == 2 || b2 == 3) {
                    while (b >= 2) {
                        UUID uuidFromString = UUID.fromString(String.format("%08x-0000-1000-8000-00805f9b34fb", Short.valueOf(byteBufferOrder.getShort())));
                        if (!arrayList.contains(uuidFromString)) {
                            arrayList.add(uuidFromString);
                        }
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
}
