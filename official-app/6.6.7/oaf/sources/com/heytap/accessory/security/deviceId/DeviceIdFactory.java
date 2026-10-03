package com.heytap.accessory.security.deviceId;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes14.dex */
public class DeviceIdFactory {
    private static IDeviceIdFetcher sIDeviceIdFetcher;

    public static IDeviceIdFetcher getIDeviceIdFetcher() {
        if (sIDeviceIdFetcher == null) {
            sIDeviceIdFetcher = new b();
        }
        return sIDeviceIdFetcher;
    }

    public static void setIDeviceIdFetcher(IDeviceIdFetcher iDeviceIdFetcher) {
        sIDeviceIdFetcher = iDeviceIdFetcher;
    }
}
