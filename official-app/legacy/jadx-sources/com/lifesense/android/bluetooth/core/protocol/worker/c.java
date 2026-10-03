package com.lifesense.android.bluetooth.core.protocol.worker;

import com.lifesense.android.bluetooth.core.bean.constant.DeviceType;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes4.dex */
public class c {
    public static Map<DeviceType, Class<? extends BaseDeviceWorker>> a = new ConcurrentHashMap();
    public static Map<DeviceType, Class<? extends BaseDeviceWorker>> b = new ConcurrentHashMap();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static Map<DeviceType, Class<? extends BaseDeviceWorker>> f8625c = new ConcurrentHashMap();
    public static Map<DeviceType, com.lifesense.android.bluetooth.core.business.sync.a> d = new ConcurrentHashMap();

    public static com.lifesense.android.bluetooth.core.business.sync.a a(DeviceType deviceType) {
        return d.get(deviceType);
    }

    public static Class<? extends BaseDeviceWorker> b(DeviceType deviceType) {
        return f8625c.get(deviceType);
    }

    public static Class<? extends BaseDeviceWorker> c(DeviceType deviceType) {
        return a.get(deviceType);
    }

    public static Class<? extends BaseDeviceWorker> d(DeviceType deviceType) {
        return b.get(deviceType);
    }

    public static void a(DeviceType deviceType, com.lifesense.android.bluetooth.core.business.sync.a aVar) {
        d.put(deviceType, aVar);
    }

    public static void b(DeviceType deviceType, Class<? extends BaseDeviceWorker> cls) {
        a.put(deviceType, cls);
    }

    public static void c(DeviceType deviceType, Class<? extends BaseDeviceWorker> cls) {
        b.put(deviceType, cls);
    }

    public static void a(DeviceType deviceType, Class<? extends BaseDeviceWorker> cls) {
        f8625c.put(deviceType, cls);
    }
}
