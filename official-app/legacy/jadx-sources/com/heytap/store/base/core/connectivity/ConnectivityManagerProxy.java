package com.heytap.store.base.core.connectivity;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import com.heytap.store.base.core.ativitylifecycle.ActivityCollectionManager;
import com.heytap.store.base.core.util.DeviceInfoUtil;

/* JADX INFO: loaded from: classes3.dex */
public class ConnectivityManagerProxy {
    private static final int CONNECT_TIMEOUT = 20000;
    public static final int NETWORK_TYPE_ID_NET = 2;
    public static final int NETWORK_TYPE_ID_NOCONNECT = 0;
    public static final int NETWORK_TYPE_ID_OTHERS = 4;
    public static final int NETWORK_TYPE_ID_WAP = 3;
    public static final int NETWORK_TYPE_ID_WIFI = 1;
    public static final String NETWORK_TYPE_NAME_MOBILE = "mobile";
    public static final String NETWORK_TYPE_NAME_MOBILE_NET = "net";
    public static final String NETWORK_TYPE_NAME_MOBILE_WAP = "wap";
    public static final String NETWORK_TYPE_NAME_WIFI = "WIFI";
    private static final int READ_TIMEOUT = 40000;

    private ConnectivityManagerProxy() {
    }

    public static boolean checkNetworkState(Context context) {
        return hasAvailableNet(context) || ActivityCollectionManager.INSTANCE.getInstance().getIsRunInBackground();
    }

    public static NetworkInfo getCurrentActiveNetworkInfo(Context context) {
        if (context == null) {
            return null;
        }
        try {
            ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
            if (connectivityManager != null) {
                return connectivityManager.getActiveNetworkInfo();
            }
        } catch (Exception e2) {
            e2.printStackTrace();
        }
        return null;
    }

    public static String getIPAddress() {
        return "";
    }

    public static int getNetworkType(Context context) {
        NetworkInfo currentActiveNetworkInfo = getCurrentActiveNetworkInfo(context);
        if (currentActiveNetworkInfo == null || !currentActiveNetworkInfo.isAvailable()) {
            return 0;
        }
        if (currentActiveNetworkInfo.getTypeName() == null || !currentActiveNetworkInfo.getTypeName().equalsIgnoreCase("mobile") || currentActiveNetworkInfo.getExtraInfo() == null) {
            return (currentActiveNetworkInfo.getTypeName() == null || !currentActiveNetworkInfo.getTypeName().equalsIgnoreCase("WIFI")) ? 4 : 1;
        }
        if (currentActiveNetworkInfo.getExtraInfo().contains("net")) {
            return 2;
        }
        return currentActiveNetworkInfo.getExtraInfo().contains(NETWORK_TYPE_NAME_MOBILE_WAP) ? 3 : 4;
    }

    public static NetworkType getSubType(Context context) {
        NetworkInfo currentActiveNetworkInfo = getCurrentActiveNetworkInfo(context);
        if (currentActiveNetworkInfo == null || currentActiveNetworkInfo.getType() != 0) {
            return (currentActiveNetworkInfo == null || currentActiveNetworkInfo.getType() != 1) ? NetworkType.UNKNOWN : NetworkType.WIFI;
        }
        int subtype = currentActiveNetworkInfo.getSubtype();
        if (subtype != 8) {
            if (subtype == 18) {
                return NetworkType.IWLAN;
            }
            if (subtype != 12) {
                if (subtype == 13) {
                    return NetworkType.MOBILE4G;
                }
                switch (subtype) {
                    case 1:
                    case 2:
                    case 4:
                        return NetworkType.MOBILE2G;
                    case 3:
                    case 5:
                    case 6:
                        break;
                    default:
                        return NetworkType.MOBILE;
                }
            }
        }
        return NetworkType.MOBILE3G;
    }

    public static String getSubTypeName(Context context) {
        NetworkInfo currentActiveNetworkInfo = getCurrentActiveNetworkInfo(context);
        if (currentActiveNetworkInfo != null) {
            return currentActiveNetworkInfo.getSubtypeName();
        }
        return null;
    }

    public static NetworkType getType(Context context) {
        NetworkInfo currentActiveNetworkInfo = getCurrentActiveNetworkInfo(context);
        if (currentActiveNetworkInfo != null) {
            int type = currentActiveNetworkInfo.getType();
            if (type == 0) {
                return NetworkType.MOBILE;
            }
            if (type == 1) {
                return NetworkType.WIFI;
            }
        }
        return NetworkType.UNKNOWN;
    }

    public static String getTypeName(Context context) {
        NetworkInfo currentActiveNetworkInfo = getCurrentActiveNetworkInfo(context);
        if (currentActiveNetworkInfo != null) {
            return currentActiveNetworkInfo.getTypeName();
        }
        return null;
    }

    public static boolean hasAvailableNet(Context context) {
        return isAvailable(context);
    }

    public static boolean isAirPlaneModeOn(Context context) {
        return false;
    }

    public static boolean isAvailable(Context context) {
        NetworkInfo currentActiveNetworkInfo = getCurrentActiveNetworkInfo(context);
        return currentActiveNetworkInfo != null && currentActiveNetworkInfo.isAvailable();
    }

    public static boolean isConnected(Context context) {
        NetworkInfo currentActiveNetworkInfo = getCurrentActiveNetworkInfo(context);
        return currentActiveNetworkInfo != null && currentActiveNetworkInfo.isConnected();
    }

    public static boolean isNetWorkActive(Context context) {
        ConnectivityManager connectivityManager;
        NetworkInfo activeNetworkInfo;
        if (context == null || (connectivityManager = (ConnectivityManager) context.getApplicationContext().getSystemService("connectivity")) == null) {
            return false;
        }
        try {
            activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
        } catch (Exception e2) {
            e2.printStackTrace();
            activeNetworkInfo = null;
        }
        return activeNetworkInfo != null && activeNetworkInfo.isAvailable();
    }

    public static SimpleNetworkInfo simplizeNetworkInfo(Context context, NetworkInfo networkInfo) {
        if (context == null) {
            return null;
        }
        if (networkInfo != null && networkInfo.isAvailable()) {
            return networkInfo.getType() == 1 ? new SimpleNetworkInfo(true, true, false, false, getSubType(context), getIPAddress(), DeviceInfoUtil.getNetworkType(networkInfo)) : new SimpleNetworkInfo(true, false, false, false, getSubType(context), getIPAddress(), DeviceInfoUtil.getNetworkType(networkInfo));
        }
        return new SimpleNetworkInfo(false, false, false, false, getSubType(context), getIPAddress(), DeviceInfoUtil.getNetworkType(networkInfo));
    }

    public static class SimpleNetworkInfo {
        private String ipAddress;
        private boolean isAir;
        private final boolean isAvailable;
        private boolean isPortal;
        private final boolean isWifi;
        private String netWorkTypeName;
        private NetworkType type;

        public SimpleNetworkInfo(boolean z, boolean z2, boolean z3, boolean z4, NetworkType networkType) {
            this.isAvailable = z;
            this.isWifi = z2;
            this.type = networkType;
            this.isPortal = z3;
            this.isAir = z4;
        }

        public String getIpAddress() {
            return this.ipAddress;
        }

        public String getNetWorkTypeName() {
            return this.netWorkTypeName;
        }

        public NetworkType getType() {
            return this.type;
        }

        public boolean isAir() {
            return this.isAir;
        }

        public boolean isAvailable() {
            return this.isAvailable;
        }

        public boolean isPortal() {
            return this.isPortal;
        }

        public boolean isWifi() {
            return this.isWifi;
        }

        public void setAir(boolean z) {
            this.isAir = z;
        }

        public void setIpAddress(String str) {
            this.ipAddress = str;
        }

        public void setNetWorkTypeName(String str) {
            this.netWorkTypeName = str;
        }

        public void setPortal(boolean z) {
            this.isPortal = z;
        }

        public void setType(NetworkType networkType) {
            this.type = networkType;
        }

        public String toString() {
            return "SimpleNetworkInfo{isAvailable=" + this.isAvailable + ", isWifi=" + this.isWifi + ", isPortal=" + this.isPortal + ", isAir=" + this.isAir + ", type=" + this.type + ", ipAddress=" + this.ipAddress + ", netWorkTypeName=" + this.netWorkTypeName + '}';
        }

        public SimpleNetworkInfo(boolean z, boolean z2, boolean z3, boolean z4, NetworkType networkType, String str, String str2) {
            this.isAvailable = z;
            this.isWifi = z2;
            this.type = networkType;
            this.isPortal = z3;
            this.isAir = z4;
            this.ipAddress = str;
            this.netWorkTypeName = str2;
        }
    }
}
