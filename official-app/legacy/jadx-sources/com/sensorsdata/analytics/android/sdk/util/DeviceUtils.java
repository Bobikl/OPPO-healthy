package com.sensorsdata.analytics.android.sdk.util;

import android.content.Context;
import android.graphics.Point;
import android.os.Build;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.WindowManager;
import com.oplus.aiunit.vision.pcm;
import com.oplus.pantaconnect.sdk.connectionservice.lan.LanConstants;
import com.oplus.smartenginehelper.ParserTag;
import com.sensorsdata.analytics.android.sdk.SALog;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* JADX INFO: loaded from: classes10.dex */
public class DeviceUtils {
    public static String exec(String str) {
        BufferedReader bufferedReader;
        InputStreamReader inputStreamReader;
        try {
            inputStreamReader = new InputStreamReader(Runtime.getRuntime().exec(str).getInputStream());
            try {
                bufferedReader = new BufferedReader(inputStreamReader);
                try {
                    StringBuilder sb = new StringBuilder();
                    while (true) {
                        String line = bufferedReader.readLine();
                        if (line == null) {
                            break;
                        }
                        sb.append(line);
                    }
                    String string = sb.toString();
                    try {
                        bufferedReader.close();
                    } catch (Throwable th) {
                        SALog.i("SA.Exec", th.getMessage());
                    }
                    try {
                        inputStreamReader.close();
                    } catch (IOException e2) {
                        SALog.i("SA.Exec", e2.getMessage());
                    }
                    return string;
                } catch (Throwable th2) {
                    th = th2;
                    try {
                        SALog.i("SA.Exec", th.getMessage());
                        return null;
                    } finally {
                        if (bufferedReader != null) {
                            try {
                                bufferedReader.close();
                            } catch (Throwable th3) {
                                SALog.i("SA.Exec", th3.getMessage());
                            }
                        }
                        if (inputStreamReader != null) {
                            try {
                                inputStreamReader.close();
                            } catch (IOException e3) {
                                SALog.i("SA.Exec", e3.getMessage());
                            }
                        }
                    }
                }
            } catch (Throwable th4) {
                th = th4;
                bufferedReader = null;
            }
        } catch (Throwable th5) {
            th = th5;
            bufferedReader = null;
            inputStreamReader = null;
        }
    }

    public static String getBrand() {
        try {
            String str = Build.BRAND;
            return str != null ? str.trim().toUpperCase() : LanConstants.OPERATOR_UNKNOWN;
        } catch (Exception e2) {
            SALog.printStackTrace(e2);
            return LanConstants.OPERATOR_UNKNOWN;
        }
    }

    public static int[] getDeviceSize(Context context) {
        int[] iArr = new int[2];
        try {
            Display defaultDisplay = ((WindowManager) context.getSystemService("window")).getDefaultDisplay();
            int rotation = defaultDisplay.getRotation();
            Point point = new Point();
            defaultDisplay.getRealSize(point);
            int i = point.x;
            int i2 = point.y;
            iArr[0] = getNaturalWidth(rotation, i, i2);
            iArr[1] = getNaturalHeight(rotation, i, i2);
        } catch (Exception unused) {
            if (context.getResources() != null) {
                DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
                iArr[0] = displayMetrics.widthPixels;
                iArr[1] = displayMetrics.heightPixels;
            }
        }
        return iArr;
    }

    public static String getHarmonyOSVersion() {
        if (!isHarmonyOs()) {
            return null;
        }
        String prop = getProp(pcm.b, "");
        return TextUtils.isEmpty(prop) ? exec(SensorsDataUtils.COMMAND_HARMONYOS_VERSION) : prop;
    }

    public static String getManufacturer() {
        try {
            String str = Build.MANUFACTURER;
            return str != null ? str.trim().toUpperCase() : LanConstants.OPERATOR_UNKNOWN;
        } catch (Exception e2) {
            SALog.printStackTrace(e2);
            return LanConstants.OPERATOR_UNKNOWN;
        }
    }

    public static String getModel() {
        String str = Build.MODEL;
        return TextUtils.isEmpty(str) ? LanConstants.OPERATOR_UNKNOWN : str.trim();
    }

    private static int getNaturalHeight(int i, int i2, int i3) {
        return (i == 0 || i == 2) ? i3 : i2;
    }

    private static int getNaturalWidth(int i, int i2, int i3) {
        return (i == 0 || i == 2) ? i2 : i3;
    }

    public static String getOS() {
        String str = Build.VERSION.RELEASE;
        return str == null ? LanConstants.OPERATOR_UNKNOWN : str;
    }

    private static String getProp(String str, String str2) {
        try {
            Class<?> cls = Class.forName("android.os.SystemProperties");
            String str3 = (String) cls.getDeclaredMethod(ParserTag.TAG_GET, String.class).invoke(cls, str);
            return TextUtils.isEmpty(str3) ? str2 : str3;
        } catch (Throwable th) {
            SALog.i("SA.SystemProperties", th.getMessage());
            return str2;
        }
    }

    private static boolean isHarmonyOs() {
        try {
            Class<?> cls = Class.forName("com.huawei.system.BuildEx");
            Object objInvoke = cls.getMethod("getOsBrand", new Class[0]).invoke(cls, new Object[0]);
            if (objInvoke == null) {
                return false;
            }
            return "harmony".equalsIgnoreCase(objInvoke.toString());
        } catch (Throwable th) {
            SALog.i("SA.HasHarmonyOS", th.getMessage());
            return false;
        }
    }
}
