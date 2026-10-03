package com.heytap.log.util;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Environment;
import android.telephony.TelephonyManager;
import androidx.exifinterface.media.ExifInterface;
import com.oplus.mydevices.sdk.compat.DeviceInfoCompat;
import com.oplus.nearx.track.internal.remoteconfig.cloudconfig.entity.EventRuleEntity;
import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

/* JADX INFO: loaded from: classes19.dex */
public class BaseInfoUtil {
    public static String convertMethod(byte b) {
        if (b == 1) {
            return ExifInterface.GPS_MEASUREMENT_INTERRUPTED;
        }
        if (b == 2) {
            return "D";
        }
        if (b != 3) {
            return b != 4 ? ExifInterface.LONGITUDE_EAST : ExifInterface.LONGITUDE_WEST;
        }
        return "I";
    }

    public static String convertTime(long j2) {
        try {
            return new SimpleDateFormat("yyyy/MM/dd HH:mm:ss", Locale.getDefault()).format(new Date(j2));
        } catch (Throwable unused) {
            return "0";
        }
    }

    public static String convertTimeForName(long j2, String str) {
        return new SimpleDateFormat(str, Locale.getDefault()).format(new Date(j2));
    }

    private static long getFreeSpace(File file) {
        if (file == null) {
            return -1L;
        }
        return file.getUsableSpace();
    }

    public static long getInternalFreeSpace() {
        return getFreeSpace(Environment.getDataDirectory());
    }

    public static String getNetWorkInfo() {
        return getNetWorkType(AppUtil.getAppContext());
    }

    private static String getNetWorkType(Context context) {
        StringBuilder sb = new StringBuilder();
        try {
            NetworkInfo activeNetworkInfo = ((ConnectivityManager) context.getSystemService("connectivity")).getActiveNetworkInfo();
            if (activeNetworkInfo != null && activeNetworkInfo.isAvailable() && activeNetworkInfo.isConnected()) {
                if (activeNetworkInfo.getType() == 1) {
                    sb.append("wifi");
                    return sb.toString();
                }
                TelephonyManager telephonyManager = (TelephonyManager) context.getSystemService("phone");
                sb.append(telephonyManager.getNetworkOperatorName());
                sb.append("_");
                int networkType = telephonyManager.getNetworkType();
                switch (networkType) {
                    case 1:
                    case 2:
                    case 4:
                    case 7:
                    case 11:
                        sb.append("2G");
                        break;
                    case 3:
                    case 5:
                    case 6:
                    case 8:
                    case 9:
                    case 10:
                    case 12:
                    case 14:
                    case 15:
                        sb.append("3G");
                        break;
                    case 13:
                        sb.append(EventRuleEntity.ACCEPT_NET_4G);
                        break;
                    default:
                        sb.append("unknown:");
                        sb.append(networkType);
                        break;
                }
                return sb.toString();
            }
            sb.append(DeviceInfoCompat.DeviceState.DISCONNECTED);
            return sb.toString();
        } catch (Throwable unused) {
        }
    }

    public static boolean isWifiStatusConnect() {
        try {
            ConnectivityManager connectivityManager = (ConnectivityManager) AppUtil.getAppSpContext().getSystemService("connectivity");
            if (connectivityManager != null) {
                return NetworkInfo.State.CONNECTED == connectivityManager.getNetworkInfo(1).getState();
            }
            return false;
        } catch (Throwable unused) {
            return false;
        }
    }
}
