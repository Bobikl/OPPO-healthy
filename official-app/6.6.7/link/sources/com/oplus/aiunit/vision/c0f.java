package com.oplus.aiunit.vision;

import androidx.annotation.NonNull;
import com.oplus.wearable.linkservice.common.parcel.DeviceInfo;
import com.oplus.wearable.linkservice.sdk.common.ModuleInfo;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes8.dex */
public class c0f {
    public static volatile c0f c;
    public final Map<String, wze> a = new HashMap();
    public HashMap<String, fq9> b = new HashMap<>();

    public static c0f a() {
        if (c == null) {
            synchronized (c0f.class) {
                if (c == null) {
                    c = new c0f();
                }
            }
        }
        return c;
    }

    public final wze b(ModuleInfo moduleInfo) {
        if (moduleInfo == null) {
            uml.b("ProcessorManager", "getProcessor: moduleInfo == null");
            return null;
        }
        String key = moduleInfo.getKey();
        wze wzeVar = this.a.get(key);
        if (wzeVar == null) {
            synchronized (this.a) {
                wzeVar = this.a.get(key);
                if (wzeVar == null) {
                    wzeVar = new wze(moduleInfo);
                    this.a.put(key, wzeVar);
                    wzeVar.h(this.b.get(key));
                }
            }
        }
        return wzeVar;
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
        wze wzeVarB = b(moduleInfo);
        if (wzeVarB != null) {
            wzeVarB.f(i, bArr);
        }
    }

    public void e(String str, @NonNull fq9 fq9Var) {
        this.b.put(str, fq9Var);
    }

    public final void f(String str) {
        wze wzeVar = this.a.get(str);
        if (wzeVar != null) {
            wzeVar.g();
            this.a.remove(str);
        }
    }

    public boolean g(int i, ModuleInfo moduleInfo, sr0 sr0Var) {
        wze wzeVarB = b(moduleInfo);
        if (wzeVarB != null) {
            return wzeVarB.i(i, sr0Var);
        }
        uml.b("ProcessorManager", "unpack: processor is null:" + moduleInfo);
        sr0Var.a(new Throwable(), -1, "processor is null");
        return false;
    }

    public void h(String str) {
        this.b.remove(str);
    }
}
