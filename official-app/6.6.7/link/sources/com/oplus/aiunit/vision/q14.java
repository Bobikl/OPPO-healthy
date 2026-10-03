package com.oplus.aiunit.vision;

import android.text.TextUtils;
import com.oplus.wearable.linkservice.common.parcel.DeviceInfo;
import com.oplus.wearable.linkservice.sdk.common.ModuleInfo;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes8.dex */
public class q14 {
    public static volatile q14 d;
    public np9 b;
    public List<Integer> c = new ArrayList();
    public Map<String, Map<String, mp9>> a = new ConcurrentHashMap();

    public q14() {
        this.c.add(1);
        this.c.add(21);
        this.c.add(22);
        this.c.add(21);
        this.c.add(24);
        this.c.add(25);
        this.c.add(36);
        this.c.add(37);
    }

    public static q14 f() {
        if (d == null) {
            synchronized (q14.class) {
                if (d == null) {
                    d = new q14();
                }
            }
        }
        return d;
    }

    public void a(ModuleInfo moduleInfo, mp9 mp9Var) {
        if (moduleInfo == null) {
            uml.d("ConsultHelperManager", "addIConsultHelper: moduleInfo == null");
            return;
        }
        Map<String, mp9> concurrentHashMap = this.a.get(moduleInfo.getNodeId());
        if (concurrentHashMap == null) {
            concurrentHashMap = new ConcurrentHashMap<>();
        }
        concurrentHashMap.put(moduleInfo.getKey(), mp9Var);
        this.a.put(moduleInfo.getNodeId(), concurrentHashMap);
    }

    public boolean b(ModuleInfo moduleInfo, sr0 sr0Var) {
        if (sr0Var == null || moduleInfo == null || sr0Var.f()) {
            return false;
        }
        byte[] bArrC = sr0Var.c();
        if (bArrC.length >= 2) {
            byte b = bArrC[0];
            int i = bArrC[1] & 127;
            uml.a("ConsultHelperManager", "checkDataIsConsultData: serviceId " + ((int) b) + ",commandId" + i);
            if (b == 1 && this.c.contains(Integer.valueOf(i))) {
                uml.d("ConsultHelperManager", "checkDataIsConsultData internal command: serviceId " + ((int) b) + ",commandId" + i);
                mp9 mp9VarE = e(moduleInfo);
                if (mp9VarE == null || !mp9VarE.e()) {
                    uml.b("ConsultHelperManager", "checkDataIsConsultData: consultHelper " + mp9VarE);
                } else {
                    mp9VarE.a(bArrC);
                }
                return true;
            }
        }
        return false;
    }

    public final synchronized void c(String str) {
        if (TextUtils.isEmpty(str)) {
            uml.b("ConsultHelperManager", "clearConsultHelper: nodeId == null");
        } else {
            d(this.a.get(str));
            this.a.remove(str);
        }
    }

    public final synchronized void d(Map<String, mp9> map) {
        if (map == null) {
            return;
        }
        Iterator<Map.Entry<String, mp9>> it = map.entrySet().iterator();
        while (it.hasNext()) {
            it.next().getValue().b();
        }
        map.clear();
    }

    public synchronized mp9 e(ModuleInfo moduleInfo) {
        if (moduleInfo == null) {
            return null;
        }
        Map<String, mp9> map = this.a.get(moduleInfo.getNodeId());
        if (map == null) {
            return null;
        }
        return map.get(moduleInfo.getKey());
    }

    public synchronized mp9 g(ModuleInfo moduleInfo) {
        mp9 mp9VarE = e(moduleInfo);
        if (mp9VarE == null) {
            np9 np9Var = this.b;
            if (np9Var == null) {
                uml.k("ConsultHelperManager", "getOrCreateConsultHelper: mIConsultHelperFactory == null");
                return null;
            }
            mp9VarE = np9Var.a(moduleInfo);
            a(moduleInfo, mp9VarE);
        }
        return mp9VarE;
    }

    public synchronized void h(np9 np9Var) {
        this.b = np9Var;
    }

    public synchronized void i(DeviceInfo deviceInfo, boolean z, byte[] bArr) {
        try {
            if (deviceInfo == null) {
                uml.d("ConsultHelperManager", "setConsultHelperBondAndKey: deviceInfo == null");
                return;
            }
            ModuleInfo mainModuleInfo = deviceInfo.getMainModuleInfo();
            mp9 mp9VarE = e(mainModuleInfo);
            mp9 mp9VarE2 = e(deviceInfo.getStubModuleInfo());
            if ((mp9VarE != null && mp9VarE.e()) || (mp9VarE2 != null && mp9VarE2.e())) {
                uml.k("ConsultHelperManager", "setConsultHelperBondAndKey: consulting not clear");
            } else {
                c(deviceInfo.getNodeId());
            }
            if (mainModuleInfo != null) {
                mp9 mp9VarG = g(mainModuleInfo);
                if (mp9VarG != null) {
                    mp9VarG.c(z);
                    mp9VarG.d(bArr);
                } else {
                    uml.d("ConsultHelperManager", "setConsultHelperBondAndKey: consultHelper == null");
                }
            } else {
                uml.d("ConsultHelperManager", "setConsultHelperBondAndKey: mainModuleInfo == null");
            }
            ModuleInfo stubModuleInfo = deviceInfo.getStubModuleInfo();
            if (stubModuleInfo != null) {
                mp9 mp9VarG2 = g(stubModuleInfo);
                if (mp9VarG2 != null) {
                    mp9VarG2.c(z);
                    mp9VarG2.d(bArr);
                } else {
                    uml.d("ConsultHelperManager", "setConsultHelperBondAndKey:stub consultHelper == null");
                }
            } else {
                uml.d("ConsultHelperManager", "setConsultHelperBondAndKey: stubModuleInfo == null");
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public synchronized void j(DeviceInfo deviceInfo) {
        uml.a("ConsultHelperManager", "stopConsult: ");
        if (deviceInfo == null) {
            uml.k("ConsultHelperManager", "stopConsult: deviceInfo == null");
        } else {
            c(deviceInfo.getNodeId());
        }
    }
}
