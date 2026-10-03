package com.oplus.aiunit.vision;

import android.text.TextUtils;
import com.oplus.wearable.linkservice.common.parcel.DeviceInfo;
import com.oplus.wearable.linkservice.sdk.common.ModuleInfo;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes5.dex */
public class eqg {
    public static volatile eqg d;
    public Map<String, byte[]> a = new ConcurrentHashMap();
    public final Object b = new Object();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f11026c = new Object();

    public static eqg g() {
        if (d == null) {
            synchronized (eqg.class) {
                if (d == null) {
                    d = new eqg();
                }
            }
        }
        return d;
    }

    public void a(String str) {
        if (TextUtils.isEmpty(str)) {
            wil.d("SecurityManager", "mac address empty");
        } else {
            this.a.remove(str);
            lxa.c().b(str);
        }
    }

    public byte[] b(byte[] bArr, byte[] bArr2, String str) {
        return c(bArr, bArr2, null, str);
    }

    public byte[] c(byte[] bArr, byte[] bArr2, byte[] bArr3, String str) {
        if (bArr2 == null) {
            wil.b("SecurityManager", "decrypt: key == null can not decrypt");
            return null;
        }
        if (bArr == null || bArr.length == 0) {
            wil.b("SecurityManager", "decrypt: data == null");
            return null;
        }
        synchronized (this.f11026c) {
            vn9 vn9VarA = db3.a(str);
            if (vn9VarA == null) {
                wil.b("SecurityManager", "decrypt: Cipher is null");
                return null;
            }
            try {
                return vn9VarA.b(bArr, bArr2, bArr3);
            } catch (IllegalArgumentException e2) {
                wil.b("SecurityManager", "encrypt: error " + e2.getMessage());
                return null;
            }
        }
    }

    public byte[] d(byte[] bArr, byte[] bArr2, String str) {
        return e(bArr, bArr2, null, str);
    }

    public byte[] e(byte[] bArr, byte[] bArr2, byte[] bArr3, String str) {
        if (bArr2 == null) {
            wil.b("SecurityManager", "encrypt: key == null can not encrypt");
            return null;
        }
        if (bArr == null || bArr.length == 0) {
            wil.b("SecurityManager", "encrypt: data == null");
            return null;
        }
        synchronized (this.b) {
            vn9 vn9VarA = db3.a(str);
            if (vn9VarA == null) {
                wil.b("SecurityManager", "encrypt: Cipher is null");
                return null;
            }
            try {
                return vn9VarA.a(bArr, bArr2, bArr3);
            } catch (IllegalArgumentException e2) {
                wil.b("SecurityManager", "encrypt: error " + e2.getMessage());
                return null;
            }
        }
    }

    public byte[] f(long j2, long j3, String str) {
        wil.a("SecurityManager", "time1:" + j2 + " time2:" + j3);
        vn9 vn9VarA = db3.a(str);
        if (vn9VarA == null) {
            return null;
        }
        return vn9VarA.c(j2, j3);
    }

    public List<DeviceInfo> h() {
        List<ui5> listF = lxa.c().f();
        ArrayList arrayList = new ArrayList();
        for (ui5 ui5Var : listF) {
            DeviceInfo deviceInfo = new DeviceInfo();
            deviceInfo.setNodeId(ui5Var.e());
            ModuleInfo moduleInfo = new ModuleInfo();
            moduleInfo.setNodeId(ui5Var.e());
            moduleInfo.setConnectionType(ui5Var.d());
            moduleInfo.setMacAddress(ui5Var.c());
            deviceInfo.setMainModuleInfo(moduleInfo);
            moduleInfo.setMainModule(true);
            if (!TextUtils.isEmpty(ui5Var.g())) {
                ModuleInfo moduleInfo2 = new ModuleInfo();
                moduleInfo2.setNodeId(ui5Var.e());
                moduleInfo2.setConnectionType(ui5Var.h());
                moduleInfo2.setMacAddress(ui5Var.g());
                deviceInfo.setStubModuleInfo(moduleInfo2);
                moduleInfo2.setMainModule(false);
            }
            arrayList.add(deviceInfo);
        }
        return arrayList;
    }

    public byte[] i(String str) {
        byte[] bArr = !TextUtils.isEmpty(str) ? this.a.get(str) : null;
        if (bArr != null) {
            return bArr;
        }
        ui5 ui5VarG = lxa.c().g(str);
        wil.a("SecurityManager", "queryKey: nodeId " + gdb.a(str));
        if (ui5VarG == null || TextUtils.isEmpty(ui5VarG.a())) {
            return bArr;
        }
        byte[] bArrB = fe8.b(ui5VarG.a());
        this.a.put(str, bArrB);
        return bArrB;
    }

    public void j(String str, byte[] bArr) {
        if (TextUtils.isEmpty(str)) {
            wil.d("SecurityManager", "mac address empty");
            return;
        }
        if (bArr == null) {
            wil.d("SecurityManager", "key is empty");
            bArr = new byte[0];
        }
        wil.a("SecurityManager", "saveKey: nodeId " + gdb.a(str));
        DeviceInfo deviceInfoB = pc5.v().b(str);
        if (deviceInfoB == null) {
            wil.b("SecurityManager", "saveKey: deviceInfo == null");
            return;
        }
        this.a.put(str, bArr);
        ui5 ui5Var = new ui5();
        ui5Var.m(deviceInfoB.getNodeId());
        ModuleInfo mainModuleInfo = deviceInfoB.getMainModuleInfo();
        if (mainModuleInfo != null) {
            ui5Var.k(mainModuleInfo.getMacAddress());
            ui5Var.l(mainModuleInfo.getConnectionType());
        }
        ModuleInfo stubModuleInfo = deviceInfoB.getStubModuleInfo();
        if (stubModuleInfo != null) {
            ui5Var.o(stubModuleInfo.getMacAddress());
            ui5Var.p(stubModuleInfo.getConnectionType());
        }
        ui5Var.i(fe8.a(bArr));
        lxa.c().e(ui5Var);
    }
}
