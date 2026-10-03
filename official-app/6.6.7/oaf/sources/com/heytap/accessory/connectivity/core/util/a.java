package com.heytap.accessory.connectivity.core.util;

import android.content.SharedPreferences;
import android.text.TextUtils;
import android.util.ArrayMap;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.heytap.accessory.accessorymanager.ConnectConfig;
import com.heytap.accessory.misc.utils.PlatformUtils;
import com.heytap.accessory.platform.GenericServiceNative;
import com.heytap.accessory.utils.HexUtils;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes14.dex */
public class a {
    public static final String b = "a";
    public static final Object a = new Object();
    public static Map<String, b> c = new ArrayMap();
    public static Map<String, ConnectConfig> d = new HashMap();

    @NonNull
    public static List<ConnectConfig> b() {
        ArrayList arrayList = new ArrayList();
        String string = PlatformUtils.getSharedPreferences(PlatformUtils.ACCESSORY_PREFS, 0).getString("DiscoveryData", null);
        String str = b;
        com.heytap.accessory.base.logging.a.a(str, "retrieveCachedInfo data:" + string);
        if (string == null || string.isEmpty()) {
            com.heytap.accessory.base.logging.a.e(str, "No cached device info found!");
            return arrayList;
        }
        String[] strArrSplit = string.split("_");
        if (strArrSplit.length == 0) {
            com.heytap.accessory.base.logging.a.e(str, "Array length is 0!");
            return arrayList;
        }
        com.heytap.accessory.base.logging.a.c(str, "Retrieving device info len:" + strArrSplit.length);
        for (String str2 : strArrSplit) {
            b bVarA = b.a(str2);
            if (bVarA != null) {
                String address = bVarA.b.getAddress();
                int transportType = bVarA.b.getTransportType();
                int uidType = bVarA.b.getUidType();
                com.heytap.accessory.base.logging.a.c(b, "retrieveCachedInfo Address: " + address + new com.heytap.accessory.connectivity.core.data.a().toString());
                synchronized (a) {
                    c.put(b(address, transportType, uidType), bVarA);
                }
                arrayList.add(bVarA.b);
            }
        }
        return arrayList;
    }

    public static ConnectConfig c(String str, int i, int i2) {
        b bVar;
        synchronized (a) {
            bVar = c.get(b(str, i, i2));
        }
        if (bVar == null) {
            return null;
        }
        return bVar.b;
    }

    public static ConnectConfig d(String str, int i, int i2) {
        return d.get(b(str, i, i2));
    }

    public static void e(String str, int i, int i2) {
        synchronized (a) {
            c.remove(b(str, i, i2));
        }
        SharedPreferences sharedPreferences = PlatformUtils.getSharedPreferences(PlatformUtils.ACCESSORY_PREFS, 0);
        SharedPreferences.Editor editorEdit = sharedPreferences.edit();
        String string = sharedPreferences.getString("DiscoveryData", null);
        if (string == null || string.isEmpty()) {
            com.heytap.accessory.base.logging.a.e(b, "No cached Account info!");
            return;
        }
        String[] strArrSplit = string.split("_");
        if (strArrSplit.length == 0) {
            com.heytap.accessory.base.logging.a.e(b, "Array length is 0!");
            return;
        }
        StringBuilder sbA = com.heytap.accessory.base.objectpool.a.a();
        for (String str2 : strArrSplit) {
            if (!a(str2, str, i, i2)) {
                sbA.append(str2);
                sbA.append("_");
            }
        }
        editorEdit.putString("DiscoveryData", sbA.toString());
        editorEdit.apply();
        com.heytap.accessory.base.objectpool.a.a(sbA);
        com.heytap.accessory.base.logging.a.c(b, "deleteFromCache Address: " + str + " transportType:" + i + " uuid:" + i2);
    }

    public static void a(String str, int i, int i2, ConnectConfig connectConfig) {
        com.heytap.accessory.base.logging.a.a(b + "- kscTrack", "cacheMemoryConfig, address = " + HexUtils.hideAddress(str) + "; transportType" + i + "; config = " + connectConfig);
        d.put(b(str, i, i2), connectConfig);
    }

    public static void a(ConnectConfig connectConfig) {
        b bVar;
        String str = b;
        com.heytap.accessory.base.logging.a.a(str, "cacheDeviceInfo, config = " + connectConfig);
        synchronized (a) {
            bVar = c.get(b(connectConfig.getAddress(), connectConfig.getTransportType(), connectConfig.getUidType()));
        }
        if (bVar != null && bVar.b.getRetryMode() == connectConfig.getRetryMode() && Arrays.equals(bVar.b.getDeviceId(), connectConfig.getDeviceId()) && Arrays.equals(bVar.b.getKscAlias(), connectConfig.getKscAlias())) {
            com.heytap.accessory.base.logging.a.c(str, "cacheDeviceInfo Address: " + connectConfig.getAddress() + " getTransportType:" + connectConfig.getTransportType() + " already present!");
            return;
        }
        e(connectConfig.getAddress(), connectConfig.getTransportType(), connectConfig.getUidType());
        SharedPreferences sharedPreferences = PlatformUtils.getSharedPreferences(PlatformUtils.ACCESSORY_PREFS, 0);
        SharedPreferences.Editor editorEdit = sharedPreferences.edit();
        StringBuilder sbA = com.heytap.accessory.base.objectpool.a.a();
        String packageName = "";
        for (GenericServiceNative.GenericFwConnection genericFwConnection : new ArrayList(GenericServiceNative.CONNECTION_MAP.values())) {
            if (genericFwConnection.containsKey(b(connectConfig.getAddress(), connectConfig.getTransportType(), connectConfig.getUidType()))) {
                packageName = genericFwConnection.getPackageName();
                break;
            }
        }
        b bVar2 = new b();
        bVar2.b = connectConfig;
        bVar2.a = packageName;
        com.heytap.accessory.base.logging.a.c(b, "cacheDeviceInfo Address: " + connectConfig.getAddress() + bVar2.toString());
        synchronized (a) {
            c.put(b(connectConfig.getAddress(), connectConfig.getTransportType(), connectConfig.getUidType()), bVar2);
        }
        String string = bVar2.a() + "_";
        sbA.append(string);
        String string2 = sharedPreferences.getString("DiscoveryData", null);
        if (string2 != null) {
            sbA.append(string2);
            string = sbA.toString();
        }
        editorEdit.putString("DiscoveryData", string);
        editorEdit.apply();
        com.heytap.accessory.base.objectpool.a.a(sbA);
    }

    public static class b {
        public String a;
        public ConnectConfig b;

        public b() {
        }

        @Nullable
        public static b a(String str) {
            if (TextUtils.isEmpty(str)) {
                return null;
            }
            String[] strArrSplit = str.split(";");
            if (strArrSplit.length != 7) {
                return null;
            }
            try {
                b bVar = new b();
                byte[] bArrHexStrToByteArray = HexUtils.hexStrToByteArray(strArrSplit[0]);
                String str2 = strArrSplit[1];
                byte[] bArrHexStrToByteArray2 = HexUtils.hexStrToByteArray(strArrSplit[2]);
                int i = Integer.parseInt(strArrSplit[3]);
                int i2 = Integer.parseInt(strArrSplit[4]);
                bVar.a = strArrSplit[5];
                bVar.b = new ConnectConfig(str2, i, bArrHexStrToByteArray, bArrHexStrToByteArray2, i2, Integer.parseInt(strArrSplit[6]));
                return bVar;
            } catch (Exception e) {
                com.heytap.accessory.base.logging.a.b(a.b, "createFromPack error," + e);
                return null;
            }
        }

        public String a() {
            return HexUtils.byteArrayToHexStr(this.b.getDeviceId()) + ";" + this.b.getAddress() + ";" + HexUtils.byteArrayToHexStr(this.b.getKscAlias()) + ";" + this.b.getTransportType() + ";" + this.b.getRetryMode() + ";" + this.a + ";" + this.b.getUidType();
        }
    }

    public static String b(String str, int i, int i2) {
        return str + ";" + i + ";" + i2;
    }

    public static void a(String str, int i, int i2) {
        e(str, i, i2);
    }

    public static List<String> a(String str) {
        ArrayList arrayList = new ArrayList();
        synchronized (a) {
            for (Map.Entry<String, b> entry : c.entrySet()) {
                if (entry.getValue().a.equalsIgnoreCase(str)) {
                    arrayList.add(entry.getKey());
                }
            }
        }
        return arrayList;
    }

    public static void a(ConnectConfig connectConfig, int i) {
        com.heytap.accessory.base.logging.a.a(b, "modifyDeviceCache: retry = " + connectConfig.getRetryMode() + " state = " + i);
        int retryMode = connectConfig.getRetryMode();
        if (retryMode != 1) {
            if (retryMode != 2) {
                return;
            }
            a(connectConfig);
        } else if (i <= 4) {
            a(connectConfig);
        }
    }

    public static void a(com.heytap.accessory.base.bean.b bVar, int i, int i2) {
        boolean z = false;
        for (GenericServiceNative.GenericFwConnection genericFwConnection : new ArrayList(GenericServiceNative.CONNECTION_MAP.values())) {
            com.heytap.accessory.base.logging.a.a(b, "sendToReceiver packageName:" + genericFwConnection.getPackageName());
            genericFwConnection.notifyConnectionEvent(i, bVar, i2);
            z = true;
        }
        if (z) {
            return;
        }
        com.heytap.accessory.base.logging.a.b(b, "Cannot Notify as package not found for address: " + bVar.d());
    }

    public static boolean a(String str, String str2, int i, int i2) {
        String[] strArrSplit = str.split(";");
        if (strArrSplit.length >= 6 || !strArrSplit[1].equals(str2)) {
            return strArrSplit[1].equals(str2) && Integer.parseInt(strArrSplit[3]) == i && i2 == Integer.parseInt(strArrSplit[6]);
        }
        return true;
    }
}
