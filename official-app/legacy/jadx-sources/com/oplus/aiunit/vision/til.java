package com.oplus.aiunit.vision;

import android.content.Context;
import android.os.Handler;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import com.oplus.wearable.linkservice.common.parcel.DeviceInfo;
import com.oplus.wearable.linkservice.sdk.common.ModuleInfo;
import java.io.PrintWriter;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes5.dex */
public class til {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static til f17030e;
    public Handler b;
    public final HashMap<String, DeviceInfo> a = new HashMap<>();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Set<String> f17031c = new HashSet();
    public final qz3 d = new a();

    public class a extends qz3 {
        public a() {
        }

        @Override // com.oplus.aiunit.vision.qz3
        public void a(@NonNull DeviceInfo deviceInfo) {
            til.this.m(deviceInfo);
        }

        @Override // com.oplus.aiunit.vision.qz3
        public void d(@NonNull DeviceInfo deviceInfo, int i) {
            til.this.n(deviceInfo, i);
        }
    }

    public static til k() {
        til tilVar;
        synchronized (til.class) {
            if (f17030e == null) {
                f17030e = new til();
            }
            tilVar = f17030e;
        }
        return tilVar;
    }

    public final void c(@NonNull DeviceInfo deviceInfo) {
        synchronized (this.a) {
            if (e(deviceInfo.getMainModuleInfo()) || e(deviceInfo.getStubModuleInfo())) {
                this.a.put(deviceInfo.getNodeId(), deviceInfo);
            }
        }
    }

    public final boolean d(ModuleInfo moduleInfo, String str) {
        if (moduleInfo == null) {
            return false;
        }
        return TextUtils.equals(moduleInfo.getMacAddress(), str);
    }

    public final boolean e(ModuleInfo moduleInfo) {
        return moduleInfo != null && moduleInfo.getState() == 2;
    }

    public void f(DeviceInfo deviceInfo) {
        this.f17031c.remove(deviceInfo.getNodeId());
    }

    public void g(PrintWriter printWriter, String[] strArr) {
        synchronized (this.a) {
            printWriter.println("WearableDeviceManager:");
            printWriter.println("  mDeviceMap:" + this.a.size());
            for (Map.Entry<String, DeviceInfo> entry : this.a.entrySet()) {
                printWriter.println("    " + entry.getKey() + " -> " + entry.getValue().dump());
            }
        }
    }

    public ModuleInfo h(String str) {
        DeviceInfo deviceInfoI;
        if (TextUtils.isEmpty(str) || (deviceInfoI = i(str)) == null) {
            return null;
        }
        ModuleInfo stubModuleInfo = deviceInfoI.getStubModuleInfo();
        ModuleInfo mainModuleInfo = deviceInfoI.getMainModuleInfo();
        if (stubModuleInfo != null) {
            if (TextUtils.equals(stubModuleInfo.getMacAddress(), str)) {
                return stubModuleInfo;
            }
            if ((stubModuleInfo.getState() == 2) && mainModuleInfo != null && TextUtils.equals(mainModuleInfo.getMacAddress(), str)) {
                return stubModuleInfo;
            }
        }
        if (mainModuleInfo == null || !TextUtils.equals(mainModuleInfo.getMacAddress(), str)) {
            return null;
        }
        return mainModuleInfo;
    }

    public final DeviceInfo i(@NonNull String str) {
        synchronized (this.a) {
            if (this.a.containsKey(str)) {
                return this.a.get(str);
            }
            Iterator<Map.Entry<String, DeviceInfo>> it = this.a.entrySet().iterator();
            while (it.hasNext()) {
                DeviceInfo value = it.next().getValue();
                if (d(value.getMainModuleInfo(), str) || d(value.getStubModuleInfo(), str)) {
                    return value;
                }
            }
            return null;
        }
    }

    public Collection<DeviceInfo> j() {
        Collection<DeviceInfo> collectionValues;
        synchronized (this.a) {
            collectionValues = this.a.values();
        }
        return collectionValues;
    }

    public void l(Context context) {
        if (this.b == null) {
            this.b = new Handler(context.getMainLooper());
        }
        p();
        nre.c(context, "connected_device_info");
    }

    public final void m(DeviceInfo deviceInfo) {
        wil.d("WearableDeviceManager", "onDeviceConnected: DEVICE-CONNECT " + gdb.a(deviceInfo.getNodeId()));
        c(deviceInfo);
        so5.h().l(deviceInfo.getNodeId());
        yil.h().n(deviceInfo);
    }

    public final void n(DeviceInfo deviceInfo, int i) {
        wil.d("WearableDeviceManager", "onDeviceDisConnected: DEVICE-DISCONNECT " + gdb.a(deviceInfo.getNodeId()));
        r(deviceInfo);
        so5.h().m(deviceInfo.getNodeId());
        yil.h().o(deviceInfo, i);
    }

    public void o(DeviceInfo deviceInfo) {
        this.f17031c.add(deviceInfo.getNodeId());
    }

    public final void p() {
        pc5.v().h(this.d);
    }

    public void q() {
        synchronized (this.a) {
            this.a.clear();
        }
        synchronized (til.class) {
            f17030e = null;
        }
        s();
        this.b = null;
    }

    public final void r(@NonNull DeviceInfo deviceInfo) {
        synchronized (this.a) {
            if (!e(deviceInfo.getMainModuleInfo()) && !e(deviceInfo.getStubModuleInfo())) {
                this.a.remove(deviceInfo.getNodeId());
            }
        }
    }

    public final void s() {
        pc5.v().l(this.d);
    }
}
