package com.oplus.aiunit.vision;

import android.text.TextUtils;
import com.oplus.wearable.linkservice.common.parcel.DeviceInfo;
import com.oplus.wearable.linkservice.sdk.common.ModuleInfo;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes8.dex */
public class utg {
    public static volatile utg d;
    public Map<String, byte[]> a = new ConcurrentHashMap();
    public final Object b = new Object();
    public final Object c = new Object();

    public static utg g() {
        if (d == null) {
            synchronized (utg.class) {
                if (d == null) {
                    d = new utg();
                }
            }
        }
        return d;
    }

    public void a(String str) {
        if (TextUtils.isEmpty(str)) {
            uml.d("SecurityManager", "mac address empty");
        } else {
            this.a.remove(str);
            wya.c().b(str);
        }
    }

    public byte[] b(byte[] bArr, byte[] bArr2, String str) {
        return c(bArr, bArr2, null, str);
    }

    public byte[] c(byte[] bArr, byte[] bArr2, byte[] bArr3, String str) {
        if (bArr2 == null) {
            uml.b("SecurityManager", "decrypt: key == null can not decrypt");
            return null;
        }
        if (bArr == null || bArr.length == 0) {
            uml.b("SecurityManager", "decrypt: data == null");
            return null;
        }
        synchronized (this.c) {
            bp9 bp9VarA = rb3.a(str);
            if (bp9VarA == null) {
                uml.b("SecurityManager", "decrypt: Cipher is null");
                return null;
            }
            try {
                return bp9VarA.b(bArr, bArr2, bArr3);
            } catch (IllegalArgumentException e) {
                uml.b("SecurityManager", "encrypt: error " + e.getMessage());
                return null;
            }
        }
    }

    public byte[] d(byte[] bArr, byte[] bArr2, String str) {
        return e(bArr, bArr2, null, str);
    }

    public byte[] e(byte[] bArr, byte[] bArr2, byte[] bArr3, String str) {
        if (bArr2 == null) {
            uml.b("SecurityManager", "encrypt: key == null can not encrypt");
            return null;
        }
        if (bArr == null || bArr.length == 0) {
            uml.b("SecurityManager", "encrypt: data == null");
            return null;
        }
        synchronized (this.b) {
            bp9 bp9VarA = rb3.a(str);
            if (bp9VarA == null) {
                uml.b("SecurityManager", "encrypt: Cipher is null");
                return null;
            }
            try {
                return bp9VarA.a(bArr, bArr2, bArr3);
            } catch (IllegalArgumentException e) {
                uml.b("SecurityManager", "encrypt: error " + e.getMessage());
                return null;
            }
        }
    }

    public byte[] f(long j, long j2, String str) {
        uml.a("SecurityManager", "time1:" + j + " time2:" + j2);
        bp9 bp9VarA = rb3.a(str);
        if (bp9VarA == null) {
            return null;
        }
        return bp9VarA.c(j, j2);
    }

    public List<DeviceInfo> h() {
        List<qj5> listF = wya.c().f();
        ArrayList arrayList = new ArrayList();
        for (qj5 qj5Var : listF) {
            DeviceInfo deviceInfo = new DeviceInfo();
            deviceInfo.setNodeId(qj5Var.e());
            ModuleInfo moduleInfo = new ModuleInfo();
            moduleInfo.setNodeId(qj5Var.e());
            moduleInfo.setConnectionType(qj5Var.d());
            moduleInfo.setMacAddress(qj5Var.c());
            deviceInfo.setMainModuleInfo(moduleInfo);
            moduleInfo.setMainModule(true);
            if (!TextUtils.isEmpty(qj5Var.g())) {
                ModuleInfo moduleInfo2 = new ModuleInfo();
                moduleInfo2.setNodeId(qj5Var.e());
                moduleInfo2.setConnectionType(qj5Var.h());
                moduleInfo2.setMacAddress(qj5Var.g());
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
        qj5 qj5VarG = wya.c().g(str);
        uml.a("SecurityManager", "queryKey: nodeId " + veb.a(str));
        if (qj5VarG == null || TextUtils.isEmpty(qj5VarG.a())) {
            return bArr;
        }
        byte[] bArrB = if8.b(qj5VarG.a());
        this.a.put(str, bArrB);
        return bArrB;
    }

    public void j(String str, byte[] bArr) {
        if (TextUtils.isEmpty(str)) {
            uml.d("SecurityManager", "mac address empty");
            return;
        }
        if (bArr == null) {
            uml.d("SecurityManager", "key is empty");
            bArr = new byte[0];
        }
        uml.a("SecurityManager", "saveKey: nodeId " + veb.a(str));
        DeviceInfo deviceInfoB = kd5.v().b(str);
        if (deviceInfoB == null) {
            uml.b("SecurityManager", "saveKey: deviceInfo == null");
            return;
        }
        this.a.put(str, bArr);
        qj5 qj5Var = new qj5();
        qj5Var.m(deviceInfoB.getNodeId());
        ModuleInfo mainModuleInfo = deviceInfoB.getMainModuleInfo();
        if (mainModuleInfo != null) {
            qj5Var.k(mainModuleInfo.getMacAddress());
            qj5Var.l(mainModuleInfo.getConnectionType());
        }
        ModuleInfo stubModuleInfo = deviceInfoB.getStubModuleInfo();
        if (stubModuleInfo != null) {
            qj5Var.o(stubModuleInfo.getMacAddress());
            qj5Var.p(stubModuleInfo.getConnectionType());
        }
        qj5Var.i(if8.a(bArr));
        wya.c().e(qj5Var);
    }
}
