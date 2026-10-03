package com.oplus.aiunit.vision;

import android.text.TextUtils;
import com.oplus.wearable.linkservice.common.parcel.DeviceInfo;
import com.oplus.wearable.linkservice.sdk.common.ModuleInfo;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import p010kotlin.jvm.internal.ByteCompanionObject;

/* JADX INFO: loaded from: classes5.dex */
public class d14 {
    public static volatile d14 d;
    public ho9 b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public List<Integer> f10334c = new ArrayList();
    public Map<String, Map<String, go9>> a = new ConcurrentHashMap();

    public d14() {
        this.f10334c.add(1);
        this.f10334c.add(21);
        this.f10334c.add(22);
        this.f10334c.add(21);
        this.f10334c.add(24);
        this.f10334c.add(25);
        this.f10334c.add(36);
        this.f10334c.add(37);
    }

    public static d14 f() {
        if (d == null) {
            synchronized (d14.class) {
                if (d == null) {
                    d = new d14();
                }
            }
        }
        return d;
    }

    public void a(ModuleInfo moduleInfo, go9 go9Var) {
        if (moduleInfo == null) {
            wil.d("ConsultHelperManager", "addIConsultHelper: moduleInfo == null");
            return;
        }
        Map<String, go9> concurrentHashMap = this.a.get(moduleInfo.getNodeId());
        if (concurrentHashMap == null) {
            concurrentHashMap = new ConcurrentHashMap<>();
        }
        concurrentHashMap.put(moduleInfo.getKey(), go9Var);
        this.a.put(moduleInfo.getNodeId(), concurrentHashMap);
    }

    public boolean b(ModuleInfo moduleInfo, br0 br0Var) {
        if (br0Var == null || moduleInfo == null || br0Var.f()) {
            return false;
        }
        byte[] bArrC = br0Var.c();
        if (bArrC.length >= 2) {
            byte b = bArrC[0];
            int i = bArrC[1] & ByteCompanionObject.MAX_VALUE;
            wil.a("ConsultHelperManager", "checkDataIsConsultData: serviceId " + ((int) b) + ",commandId" + i);
            if (b == 1 && this.f10334c.contains(Integer.valueOf(i))) {
                wil.d("ConsultHelperManager", "checkDataIsConsultData internal command: serviceId " + ((int) b) + ",commandId" + i);
                go9 go9VarE = e(moduleInfo);
                if (go9VarE == null || !go9VarE.e()) {
                    wil.b("ConsultHelperManager", "checkDataIsConsultData: consultHelper " + go9VarE);
                } else {
                    go9VarE.a(bArrC);
                }
                return true;
            }
        }
        return false;
    }

    public final synchronized void c(String str) {
        if (TextUtils.isEmpty(str)) {
            wil.b("ConsultHelperManager", "clearConsultHelper: nodeId == null");
        } else {
            d(this.a.get(str));
            this.a.remove(str);
        }
    }

    public final synchronized void d(Map<String, go9> map) {
        if (map == null) {
            return;
        }
        Iterator<Map.Entry<String, go9>> it = map.entrySet().iterator();
        while (it.hasNext()) {
            it.next().getValue().b();
        }
        map.clear();
    }

    public synchronized go9 e(ModuleInfo moduleInfo) {
        if (moduleInfo == null) {
            return null;
        }
        Map<String, go9> map = this.a.get(moduleInfo.getNodeId());
        if (map == null) {
            return null;
        }
        return map.get(moduleInfo.getKey());
    }

    public synchronized go9 g(ModuleInfo moduleInfo) {
        go9 go9VarE = e(moduleInfo);
        if (go9VarE == null) {
            ho9 ho9Var = this.b;
            if (ho9Var == null) {
                wil.k("ConsultHelperManager", "getOrCreateConsultHelper: mIConsultHelperFactory == null");
                return null;
            }
            go9VarE = ho9Var.a(moduleInfo);
            a(moduleInfo, go9VarE);
        }
        return go9VarE;
    }

    public synchronized void h(ho9 ho9Var) {
        this.b = ho9Var;
    }

    public synchronized void i(DeviceInfo deviceInfo, boolean z, byte[] bArr) {
        try {
            if (deviceInfo == null) {
                wil.d("ConsultHelperManager", "setConsultHelperBondAndKey: deviceInfo == null");
                return;
            }
            ModuleInfo mainModuleInfo = deviceInfo.getMainModuleInfo();
            go9 go9VarE = e(mainModuleInfo);
            go9 go9VarE2 = e(deviceInfo.getStubModuleInfo());
            if ((go9VarE != null && go9VarE.e()) || (go9VarE2 != null && go9VarE2.e())) {
                wil.k("ConsultHelperManager", "setConsultHelperBondAndKey: consulting not clear");
            } else {
                c(deviceInfo.getNodeId());
            }
            if (mainModuleInfo != null) {
                go9 go9VarG = g(mainModuleInfo);
                if (go9VarG != null) {
                    go9VarG.c(z);
                    go9VarG.d(bArr);
                } else {
                    wil.d("ConsultHelperManager", "setConsultHelperBondAndKey: consultHelper == null");
                }
            } else {
                wil.d("ConsultHelperManager", "setConsultHelperBondAndKey: mainModuleInfo == null");
            }
            ModuleInfo stubModuleInfo = deviceInfo.getStubModuleInfo();
            if (stubModuleInfo != null) {
                go9 go9VarG2 = g(stubModuleInfo);
                if (go9VarG2 != null) {
                    go9VarG2.c(z);
                    go9VarG2.d(bArr);
                } else {
                    wil.d("ConsultHelperManager", "setConsultHelperBondAndKey:stub consultHelper == null");
                }
            } else {
                wil.d("ConsultHelperManager", "setConsultHelperBondAndKey: stubModuleInfo == null");
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public synchronized void j(DeviceInfo deviceInfo) {
        wil.a("ConsultHelperManager", "stopConsult: ");
        if (deviceInfo == null) {
            wil.k("ConsultHelperManager", "stopConsult: deviceInfo == null");
        } else {
            c(deviceInfo.getNodeId());
        }
    }
}
