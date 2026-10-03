package com.oplus.aiunit.vision;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import com.oplus.wearable.linkservice.common.parcel.DeviceInfo;
import com.oplus.wearable.linkservice.sdk.common.ModuleInfo;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes8.dex */
public class rdk {
    public static volatile rdk c;
    public final Map<String, qdk> a = new ConcurrentHashMap();
    public final Map<String, a> b = new ConcurrentHashMap();

    public interface a {
        void a(@NonNull ModuleInfo moduleInfo, qdk qdkVar);
    }

    public static rdk e() {
        if (c == null) {
            synchronized (rdk.class) {
                if (c == null) {
                    c = new rdk();
                }
            }
        }
        return c;
    }

    public synchronized void a(String str, int i) {
        if (TextUtils.isEmpty(str)) {
            uml.k("TransferConfigManager", "addConfig: mac == null");
            return;
        }
        uml.a("TransferConfigManager", "updateConfig: " + veb.a(str) + ",mtu = " + i);
        qdk qdkVar = this.a.get(str);
        if (qdkVar == null) {
            qdkVar = new qdk();
            qdkVar.f(10);
            qdkVar.h(i);
            qdkVar.g(i);
        } else {
            qdkVar.g(i);
            qdkVar.h(i);
        }
        this.a.put(str, qdkVar);
    }

    public synchronized qdk b(ModuleInfo moduleInfo) {
        ao6 ao6VarA;
        ao6 ao6VarA2;
        try {
            if (moduleInfo == null) {
                uml.k("TransferConfigManager", "getConfig: moduleInfo == null");
                return null;
            }
            qdk qdkVar = this.a.get(moduleInfo.getMacAddress());
            if (qdkVar != null) {
                if (!moduleInfo.isMainModule() && (ao6VarA = qdkVar.a()) != null) {
                    ao6VarA.e(utg.g().i(moduleInfo.getNodeId()));
                    uml.a("TransferConfigManager", "getConfig: newKey");
                }
                return qdkVar;
            }
            qdk qdkVarC = c(moduleInfo);
            if (!moduleInfo.isMainModule() && (ao6VarA2 = qdkVarC.a()) != null) {
                ao6VarA2.e(utg.g().i(moduleInfo.getNodeId()));
                uml.a("TransferConfigManager", "getConfig: newKey with default config");
            }
            k(moduleInfo, qdkVarC);
            return qdkVarC;
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX WARN: Code duplicated, block: B:20:0x0058 A[Catch: all -> 0x0066, TRY_LEAVE, TryCatch #0 {, blocks: (B:3:0x0001, B:5:0x000c, B:8:0x0017, B:18:0x0044, B:19:0x004e, B:20:0x0058), top: B:26:0x0001 }] */
    @NonNull
    public synchronized qdk c(ModuleInfo moduleInfo) {
        qdk qdkVar = new qdk();
        if (moduleInfo == null) {
            qdkVar.g(20);
            qdkVar.h(20);
            qdkVar.f(10);
            return qdkVar;
        }
        uml.a("TransferConfigManager", "getDefaultConfig: " + moduleInfo.getConnectionType());
        int connectionType = moduleInfo.getConnectionType();
        if (connectionType == 1) {
            qdkVar.g(5000);
            qdkVar.h(5000);
            qdkVar.f(0);
        } else if (connectionType == 2 || connectionType == 3) {
            qdkVar.g(20);
            qdkVar.h(20);
            qdkVar.f(10);
        } else if (connectionType == 4 || connectionType == 5) {
            qdkVar.g(5000);
            qdkVar.h(5000);
            qdkVar.f(0);
        } else {
            qdkVar.g(20);
            qdkVar.h(20);
            qdkVar.f(10);
        }
        return qdkVar;
    }

    /* JADX WARN: Code duplicated, block: B:25:0x0060 A[Catch: all -> 0x0070, TRY_LEAVE, TryCatch #0 {all -> 0x0070, blocks: (B:5:0x0004, B:8:0x000a, B:10:0x0015, B:13:0x0020, B:23:0x004c, B:24:0x0056, B:25:0x0060), top: B:31:0x0002 }] */
    @NonNull
    public synchronized qdk d(ModuleInfo moduleInfo, int i) {
        try {
            if (i == 1) {
                return c(moduleInfo);
            }
            qdk qdkVar = new qdk();
            if (moduleInfo == null) {
                qdkVar.g(20);
                qdkVar.h(20);
                qdkVar.f(10);
                return qdkVar;
            }
            uml.a("TransferConfigManager", "getDefaultConfigCompact: " + moduleInfo.getConnectionType());
            int connectionType = moduleInfo.getConnectionType();
            if (connectionType == 1) {
                qdkVar.g(5940);
                qdkVar.h(990);
                qdkVar.f(0);
            } else if (connectionType == 2 || connectionType == 3) {
                qdkVar.g(20);
                qdkVar.h(20);
                qdkVar.f(10);
            } else if (connectionType == 4 || connectionType == 5) {
                qdkVar.g(5940);
                qdkVar.h(990);
                qdkVar.f(0);
            } else {
                qdkVar.g(20);
                qdkVar.h(20);
                qdkVar.f(10);
            }
            return qdkVar;
        } catch (Throwable th) {
            throw th;
        }
    }

    public synchronized qdk f(ModuleInfo moduleInfo, int i) {
        if (moduleInfo != null) {
            if (!TextUtils.isEmpty(moduleInfo.getMacAddress())) {
                qdk qdkVar = this.a.get(moduleInfo.getMacAddress());
                if (qdkVar != null) {
                    return qdkVar;
                }
                return d(moduleInfo, i);
            }
        }
        return d(moduleInfo, i);
    }

    public void g(ModuleInfo moduleInfo, a aVar) {
        if (moduleInfo == null) {
            uml.k("TransferConfigManager", "registerOnTransferConfigChangeListener: moduleInfo == null");
        } else {
            this.b.put(moduleInfo.getMacAddress(), aVar);
        }
    }

    public void h(DeviceInfo deviceInfo) {
        if (deviceInfo == null) {
            return;
        }
        i(deviceInfo.getMainModuleInfo());
        i(deviceInfo.getStubModuleInfo());
    }

    public synchronized void i(ModuleInfo moduleInfo) {
        if (moduleInfo == null) {
            return;
        }
        this.a.remove(moduleInfo.getMacAddress());
    }

    public void j(ModuleInfo moduleInfo) {
        if (moduleInfo == null) {
            uml.k("TransferConfigManager", "unregisterOnTransferConfigChangeListener: moduleInfo == null");
        } else {
            this.b.remove(moduleInfo.getMacAddress());
        }
    }

    public synchronized void k(ModuleInfo moduleInfo, qdk qdkVar) {
        try {
            if (moduleInfo == null) {
                uml.k("TransferConfigManager", "updateConfig: moduleInfo == null");
                return;
            }
            uml.a("TransferConfigManager", "updateConfig: " + veb.a(moduleInfo.getMacAddress()) + ",config = " + qdkVar.toString());
            this.a.put(moduleInfo.getMacAddress(), qdkVar);
            a aVar = this.b.get(moduleInfo.getMacAddress());
            if (aVar != null) {
                aVar.a(moduleInfo, qdkVar);
            }
        } catch (Throwable th) {
            throw th;
        }
    }
}
