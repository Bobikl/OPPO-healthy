package com.lifesense.plugin.ble.device.proto.A5.parser;

import android.text.TextUtils;
import com.lifesense.plugin.ble.data.LSAppCategory;
import com.lifesense.plugin.ble.data.tracker.ATControlStatus;
import com.lifesense.plugin.ble.data.tracker.ATExerciseNotify;
import com.lifesense.plugin.ble.data.tracker.ATUserInfo;
import com.lifesense.plugin.ble.data.tracker.setting.ATEncourageType;
import com.lifesense.plugin.ble.data.tracker.setting.ATGpsStatus;
import com.lifesense.plugin.ble.data.tracker.setting.ATMessageRemindType;
import com.lifesense.plugin.ble.data.tracker.setting.ATWeekDay;
import com.oplus.aiunit.vision.gra;
import java.util.Calendar;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public class f {
    public static final String DEFAULT_PHONE_PLATFORM = "02";
    public static final String DEFAULT_TIME_ZONE = "08";

    public static byte a(List list) {
        int i;
        byte b = 0;
        if (list != null && list.size() > 0) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                switch (g.b[((ATWeekDay) it.next()).ordinal()]) {
                    case 1:
                        i = b | 1;
                        break;
                    case 2:
                        i = b | 2;
                        break;
                    case 3:
                        i = b | 4;
                        break;
                    case 4:
                        i = b | 8;
                        break;
                    case 5:
                        i = b | 16;
                        break;
                    case 6:
                        i = b | 32;
                        break;
                    case 7:
                        i = b | 64;
                        break;
                    default:
                        continue;
                }
                b = (byte) i;
            }
        }
        return b;
    }

    public static int b(String str) {
        if (str == null || str.lastIndexOf(":") == -1) {
            return 0;
        }
        return Integer.parseInt(str.substring(str.lastIndexOf(":") + 1, str.length()));
    }

    public static String c(String str) {
        if (str == null || str.length() == 0) {
            return null;
        }
        try {
            boolean zContains = str.contains("-");
            int i = Integer.parseInt(str.substring(4, 6));
            int i2 = Integer.parseInt(str.substring(7));
            if (zContains) {
                i2 = -i2;
                i = -i;
            }
            int i3 = (((i * 60) + i2) / 15) + 48;
            if (i3 < 0) {
                return null;
            }
            String hexString = Integer.toHexString(i3);
            if (hexString.length() >= 2) {
                return hexString;
            }
            return "0" + hexString;
        } catch (Exception unused) {
            return null;
        }
    }

    public static int d(String str, String str2) {
        if (str == null || str.lastIndexOf(":") == -1 || str2 == null || str2.lastIndexOf(":") == -1) {
            return 0;
        }
        return ((a(str2) * 60) + b(str2)) - ((a(str) * 60) + b(str));
    }

    public static int a(String str) {
        if (str == null || str.lastIndexOf(":") == -1) {
            return 0;
        }
        return Integer.parseInt(str.substring(0, str.lastIndexOf(":")));
    }

    public static byte[] b() {
        return com.lifesense.plugin.ble.c.a.a(com.lifesense.plugin.ble.c.a.c(Long.toHexString(Calendar.getInstance().getTimeInMillis() / 1000), 8).toCharArray());
    }

    public static String c(String str, String str2) {
        if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
            try {
                if (str.equalsIgnoreCase(str2.replace(":", ""))) {
                    return null;
                }
                return str.toUpperCase();
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
        return null;
    }

    public static String d(String str) {
        if (str != null && str.length() >= 12) {
            try {
                String strSubstring = str.substring(0, 6);
                String strSubstring2 = str.substring(6, str.length());
                long j2 = Long.parseLong(strSubstring, 16);
                long j3 = Long.parseLong(strSubstring2, 16);
                return String.format("%08d", Long.valueOf(j2)) + String.format("%08d", Long.valueOf(j3));
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
        return null;
    }

    public static ATUserInfo a() {
        ATUserInfo aTUserInfo = new ATUserInfo();
        aTUserInfo.setWeight(60.0f);
        aTUserInfo.setHeight(1.7f);
        aTUserInfo.setTargetState(ATEncourageType.Step);
        aTUserInfo.setWeekTargetSteps(100000);
        aTUserInfo.setPreviousDeviceSteps(0);
        aTUserInfo.setClearData(false);
        aTUserInfo.setEnableHeartRateDetect(true);
        aTUserInfo.setDisableDetectStartTime("08:00");
        aTUserInfo.setDisableDetectEndTime("22:00");
        return aTUserInfo;
    }

    public static byte[] b(String str, String str2) {
        String strSubstring;
        if (str2 == null || str2.length() <= 2) {
            strSubstring = String.format("%02X", Long.valueOf(Long.parseLong(Integer.toHexString(com.lifesense.plugin.ble.c.b.e() / 3600000), 16)));
            if (strSubstring != null && strSubstring.length() > 2) {
                strSubstring = strSubstring.substring(strSubstring.length() - 2, strSubstring.length());
            }
        } else {
            strSubstring = c(com.lifesense.plugin.ble.c.b.d());
            if (strSubstring == null || strSubstring.length() == 0) {
                strSubstring = gra.SWITCH_ESIM_AC_CODE_BLACKLIST;
            }
        }
        String strD = com.lifesense.plugin.ble.c.a.d(b());
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(str);
        stringBuffer.append(strD);
        stringBuffer.append(strSubstring);
        stringBuffer.append("02");
        return com.lifesense.plugin.ble.c.a.a(stringBuffer.toString().toCharArray());
    }

    public static ATMessageRemindType a(LSAppCategory lSAppCategory) {
        if (lSAppCategory == null) {
            return ATMessageRemindType.DefaultMessage;
        }
        switch (g.a[lSAppCategory.ordinal()]) {
            case 1:
                return ATMessageRemindType.DefaultMessage;
            case 2:
                return ATMessageRemindType.IncomingCall;
            case 3:
                return ATMessageRemindType.Sms;
            case 4:
                return ATMessageRemindType.Wechat;
            case 5:
                return ATMessageRemindType.QQ;
            case 6:
                return ATMessageRemindType.FaceBook;
            case 7:
                return ATMessageRemindType.Twitter;
            case 8:
                return ATMessageRemindType.Line;
            case 9:
                return ATMessageRemindType.Gmail;
            case 10:
                return ATMessageRemindType.Kakao;
            case 11:
                return ATMessageRemindType.WhatsApp;
            case 12:
                return ATMessageRemindType.SeWellness;
            case 13:
                return ATMessageRemindType.Instagram;
            default:
                return ATMessageRemindType.Unknown;
        }
    }

    public static byte[] a(ATControlStatus aTControlStatus) {
        byte[] bArr = new byte[6];
        bArr[0] = (byte) 169;
        bArr[5] = (byte) aTControlStatus.getWorkStaus();
        return bArr;
    }

    public static byte[] a(ATExerciseNotify aTExerciseNotify, ATGpsStatus aTGpsStatus) {
        if (aTExerciseNotify == null) {
            return null;
        }
        byte[] bArr = new byte[10];
        bArr[0] = -31;
        bArr[1] = (byte) aTExerciseNotify.getFlag();
        if (aTExerciseNotify.getFlag() != 1) {
            bArr[2] = 1;
            for (int i = 0; i < 7; i++) {
                bArr[i + 3] = 0;
            }
            return bArr;
        }
        if (aTGpsStatus == null) {
            bArr[2] = (byte) ATGpsStatus.Unavailable.getGpsStatus();
        } else {
            bArr[2] = (byte) aTGpsStatus.getGpsStatus();
        }
        for (int i2 = 0; i2 < 7; i2++) {
            bArr[i2 + 3] = 0;
        }
        return bArr;
    }

    public static byte[] a(ATUserInfo aTUserInfo) {
        String strA;
        float weekTargetExerciseAmount;
        if (aTUserInfo == null) {
            return null;
        }
        byte[] bArr = new byte[28];
        bArr[0] = (byte) 80;
        byte[] bArrB = b();
        bArr[1] = bArrB[0];
        bArr[2] = bArrB[1];
        bArr[3] = bArrB[2];
        bArr[4] = bArrB[3];
        if (aTUserInfo.getWeight() > 0.0f) {
            float weight = aTUserInfo.getWeight();
            if (weight > 300.0f) {
                weight = 300.0f;
            }
            if (weight < 5.0f) {
                weight = 5.0f;
            }
            byte[] bArrB2 = com.lifesense.plugin.ble.c.a.b(com.lifesense.plugin.ble.c.a.a(weight));
            bArr[5] = bArrB2[0];
            bArr[6] = bArrB2[1];
            bArr[7] = bArrB2[2];
            bArr[8] = bArrB2[3];
        } else {
            bArr[5] = -1;
            bArr[6] = 0;
            bArr[7] = 2;
            bArr[8] = 88;
        }
        if (aTUserInfo.getHeight() > 0.0f) {
            float height = aTUserInfo.getHeight();
            if (height > 3.0f) {
                height = 3.0f;
            }
            if (height < 0.5d) {
                height = 0.5f;
            }
            byte[] bArrB3 = com.lifesense.plugin.ble.c.a.b(com.lifesense.plugin.ble.c.a.a(height));
            bArr[9] = bArrB3[0];
            bArr[10] = bArrB3[1];
            bArr[11] = bArrB3[2];
            bArr[12] = bArrB3[3];
        } else {
            bArr[9] = -2;
            bArr[10] = 0;
            bArr[11] = 0;
            bArr[12] = -81;
        }
        bArr[13] = (byte) (aTUserInfo.getTargetState() == null ? 0 : aTUserInfo.getTargetState().getValue());
        byte[] bArrB4 = new byte[4];
        if (aTUserInfo.getTargetState() == ATEncourageType.Step) {
            strA = com.lifesense.plugin.ble.c.a.a(Long.toHexString(aTUserInfo.getWeekTargetSteps()), 8);
        } else {
            if (aTUserInfo.getTargetState() == ATEncourageType.Calories) {
                weekTargetExerciseAmount = aTUserInfo.getWeekTargetCalories();
            } else if (aTUserInfo.getTargetState() == ATEncourageType.Distance) {
                weekTargetExerciseAmount = aTUserInfo.getWeekTargetDistance();
            } else if (aTUserInfo.getTargetState() == ATEncourageType.ExerciseAmount) {
                weekTargetExerciseAmount = aTUserInfo.getWeekTargetExerciseAmount();
            } else {
                strA = "";
            }
            strA = com.lifesense.plugin.ble.c.a.a(weekTargetExerciseAmount);
        }
        if (strA != null && strA.length() > 1) {
            bArrB4 = com.lifesense.plugin.ble.c.a.b(strA);
        }
        bArr[14] = bArrB4[0];
        bArr[15] = bArrB4[1];
        bArr[16] = bArrB4[2];
        bArr[17] = bArrB4[3];
        bArr[18] = 0;
        bArr[19] = 0;
        bArr[20] = 0;
        bArr[21] = 0;
        if (aTUserInfo.isClearData()) {
            bArr[21] = 1;
        }
        bArr[22] = 0;
        bArr[23] = 1;
        if (!aTUserInfo.isEnableHeartRateDetect()) {
            bArr[23] = 0;
        }
        bArr[24] = (byte) a(aTUserInfo.getDisableDetectStartTime());
        bArr[25] = (byte) b(aTUserInfo.getDisableDetectStartTime());
        bArr[26] = (byte) a(aTUserInfo.getDisableDetectEndTime());
        bArr[27] = (byte) b(aTUserInfo.getDisableDetectEndTime());
        return bArr;
    }

    public static byte[] a(String str, int i) {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(String.format("%02X", Integer.valueOf(i)));
        return com.lifesense.plugin.ble.c.a.a(stringBuffer.toString().toCharArray());
    }

    public static byte[] a(String str, String str2) {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(str2);
        stringBuffer.append(str);
        return com.lifesense.plugin.ble.c.a.a(stringBuffer.toString().toCharArray());
    }

    public static byte[] a(String str, boolean z) {
        byte[] bytes = str.getBytes();
        byte[] bArr = new byte[bytes.length + 2];
        bArr[0] = (byte) 123;
        bArr[1] = (byte) (!z ? 1 : 0);
        System.arraycopy(bytes, 0, bArr, 2, bytes.length);
        return bArr;
    }

    public static byte[] a(boolean z) {
        byte[] bArr = new byte[10];
        bArr[0] = (byte) 167;
        bArr[1] = 1;
        bArr[2] = z ? (byte) 1 : (byte) 0;
        return bArr;
    }

    public static byte[] a(boolean z, float f, float f2) {
        String strC = c(com.lifesense.plugin.ble.c.b.d());
        if (strC == null || strC.length() == 0) {
            strC = gra.SWITCH_ESIM_AC_CODE_BLACKLIST;
        }
        String strD = com.lifesense.plugin.ble.c.a.d(b());
        if (f > 300.0f) {
            f = 300.0f;
        }
        if (f < 5.0f) {
            f = 5.0f;
        }
        String strA = com.lifesense.plugin.ble.c.a.a(f);
        if (f2 > 3.0f) {
            f2 = 3.0f;
        }
        if (f2 < 0.5d) {
            f2 = 0.5f;
        }
        String strA2 = com.lifesense.plugin.ble.c.a.a(f2);
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(Integer.toHexString(227));
        stringBuffer.append(z ? "00" : "01");
        stringBuffer.append(strD);
        stringBuffer.append(strC);
        stringBuffer.append("02");
        stringBuffer.append(strA);
        stringBuffer.append(strA2);
        return com.lifesense.plugin.ble.c.a.a(stringBuffer.toString().toCharArray());
    }
}
