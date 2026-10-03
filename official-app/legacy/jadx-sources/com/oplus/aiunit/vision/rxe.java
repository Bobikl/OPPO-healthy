package com.oplus.aiunit.vision;

import androidx.annotation.NonNull;
import com.oplus.wearable.linkservice.common.parcel.DeviceInfo;
import com.oplus.wearable.linkservice.sdk.common.ModuleInfo;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes5.dex */
public class rxe {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static volatile rxe f16388c;
    public final Map<String, lxe> a = new HashMap();
    public HashMap<String, zo9> b = new HashMap<>();

    public static rxe a() {
        if (f16388c == null) {
            synchronized (rxe.class) {
                if (f16388c == null) {
                    f16388c = new rxe();
                }
            }
        }
        return f16388c;
    }

    public final lxe b(ModuleInfo moduleInfo) {
        if (moduleInfo == null) {
            wil.b(com.coloros.sceneservice.j.c.TAG, "getProcessor: moduleInfo == null");
            return null;
        }
        String key = moduleInfo.getKey();
        lxe lxeVar = this.a.get(key);
        if (lxeVar == null) {
            synchronized (this.a) {
                lxeVar = this.a.get(key);
                if (lxeVar == null) {
                    lxeVar = new lxe(moduleInfo);
                    this.a.put(key, lxeVar);
                    lxeVar.h(this.b.get(key));
                }
            }
        }
        return lxeVar;
    }

    public void c(DeviceInfo deviceInfo) {
        ModuleInfo mainModuleInfo = deviceInfo.getMainModuleInfo();
        if (mainModuleInfo != null) {
            f(mainModuleInfo.getKey());
        }
        ModuleInfo stubModuleInfo = deviceInfo.getStubModuleInfo();
        if (stubModuleInfo != null) {
            f(stubModuleInfo.getKey());
        }
    }

    public void d(int i, ModuleInfo moduleInfo, byte[] bArr) {
        lxe lxeVarB = b(moduleInfo);
        if (lxeVarB != null) {
            lxeVarB.f(i, bArr);
        }
    }

    public void e(String str, @NonNull zo9 zo9Var) {
        this.b.put(str, zo9Var);
    }

    public final void f(String str) {
        lxe lxeVar = this.a.get(str);
        if (lxeVar != null) {
            lxeVar.g();
            this.a.remove(str);
        }
    }

    public boolean g(int i, ModuleInfo moduleInfo, br0 br0Var) {
        lxe lxeVarB = b(moduleInfo);
        if (lxeVarB != null) {
            return lxeVarB.i(i, br0Var);
        }
        wil.b(com.coloros.sceneservice.j.c.TAG, "unpack: processor is null:" + moduleInfo);
        br0Var.a(new Throwable(), -1, "processor is null");
        return false;
    }

    public void h(String str) {
        this.b.remove(str);
    }
}
