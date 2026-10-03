package com.oplus.aiunit.vision;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import com.oplus.wearable.linkservice.common.parcel.DeviceInfo;
import com.oplus.wearable.linkservice.sdk.common.ModuleInfo;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes5.dex */
public class p9k {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static volatile p9k f15277c;
    public final Map<String, o9k> a = new ConcurrentHashMap();
    public final Map<String, a> b = new ConcurrentHashMap();

    public interface a {
        void a(@NonNull ModuleInfo moduleInfo, o9k o9kVar);
    }

    public static p9k e() {
        if (f15277c == null) {
            synchronized (p9k.class) {
                if (f15277c == null) {
                    f15277c = new p9k();
                }
            }
        }
        return f15277c;
    }

    public synchronized void a(String str, int i) {
        if (TextUtils.isEmpty(str)) {
            wil.k("TransferConfigManager", "addConfig: mac == null");
            return;
        }
        wil.a("TransferConfigManager", "updateConfig: " + gdb.a(str) + ",mtu = " + i);
        o9k o9kVar = this.a.get(str);
        if (o9kVar == null) {
            o9kVar = new o9k();
            o9kVar.f(10);
            o9kVar.h(i);
            o9kVar.g(i);
        } else {
            o9kVar.g(i);
            o9kVar.h(i);
        }
        this.a.put(str, o9kVar);
    }

    public synchronized o9k b(ModuleInfo moduleInfo) {
        cn6 cn6VarA;
        cn6 cn6VarA2;
        try {
            if (moduleInfo == null) {
                wil.k("TransferConfigManager", "getConfig: moduleInfo == null");
                return null;
            }
            o9k o9kVar = this.a.get(moduleInfo.getMacAddress());
            if (o9kVar != null) {
                if (!moduleInfo.isMainModule() && (cn6VarA = o9kVar.a()) != null) {
                    cn6VarA.e(eqg.g().i(moduleInfo.getNodeId()));
                    wil.a("TransferConfigManager", "getConfig: newKey");
                }
                return o9kVar;
            }
            o9k o9kVarC = c(moduleInfo);
            if (!moduleInfo.isMainModule() && (cn6VarA2 = o9kVarC.a()) != null) {
                cn6VarA2.e(eqg.g().i(moduleInfo.getNodeId()));
                wil.a("TransferConfigManager", "getConfig: newKey with default config");
            }
            k(moduleInfo, o9kVarC);
            return o9kVarC;
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX WARN: Code duplicated, block: B:20:0x0058 A[Catch: all -> 0x0066, TRY_LEAVE, TryCatch #0 {, blocks: (B:3:0x0001, B:5:0x000c, B:8:0x0017, B:18:0x0044, B:19:0x004e, B:20:0x0058), top: B:26:0x0001 }] */
    @NonNull
    public synchronized o9k c(ModuleInfo moduleInfo) {
        o9k o9kVar = new o9k();
        if (moduleInfo == null) {
            o9kVar.g(20);
            o9kVar.h(20);
            o9kVar.f(10);
            return o9kVar;
        }
        wil.a("TransferConfigManager", "getDefaultConfig: " + moduleInfo.getConnectionType());
        int connectionType = moduleInfo.getConnectionType();
        if (connectionType == 1) {
            o9kVar.g(5000);
            o9kVar.h(5000);
            o9kVar.f(0);
        } else if (connectionType == 2 || connectionType == 3) {
            o9kVar.g(20);
            o9kVar.h(20);
            o9kVar.f(10);
        } else if (connectionType == 4 || connectionType == 5) {
            o9kVar.g(5000);
            o9kVar.h(5000);
            o9kVar.f(0);
        } else {
            o9kVar.g(20);
            o9kVar.h(20);
            o9kVar.f(10);
        }
        return o9kVar;
    }

    /* JADX WARN: Code duplicated, block: B:25:0x0060 A[Catch: all -> 0x0070, TRY_LEAVE, TryCatch #0 {all -> 0x0070, blocks: (B:5:0x0004, B:8:0x000a, B:10:0x0015, B:13:0x0020, B:23:0x004c, B:24:0x0056, B:25:0x0060), top: B:31:0x0002 }] */
    @NonNull
    public synchronized o9k d(ModuleInfo moduleInfo, int i) {
        try {
            if (i == 1) {
                return c(moduleInfo);
            }
            o9k o9kVar = new o9k();
            if (moduleInfo == null) {
                o9kVar.g(20);
                o9kVar.h(20);
                o9kVar.f(10);
                return o9kVar;
            }
            wil.a("TransferConfigManager", "getDefaultConfigCompact: " + moduleInfo.getConnectionType());
            int connectionType = moduleInfo.getConnectionType();
            if (connectionType == 1) {
                o9kVar.g(5940);
                o9kVar.h(990);
                o9kVar.f(0);
            } else if (connectionType == 2 || connectionType == 3) {
                o9kVar.g(20);
                o9kVar.h(20);
                o9kVar.f(10);
            } else if (connectionType == 4 || connectionType == 5) {
                o9kVar.g(5940);
                o9kVar.h(990);
                o9kVar.f(0);
            } else {
                o9kVar.g(20);
                o9kVar.h(20);
                o9kVar.f(10);
            }
            return o9kVar;
        } catch (Throwable th) {
            throw th;
        }
    }

    public synchronized o9k f(ModuleInfo moduleInfo, int i) {
        if (moduleInfo != null) {
            if (!TextUtils.isEmpty(moduleInfo.getMacAddress())) {
                o9k o9kVar = this.a.get(moduleInfo.getMacAddress());
                if (o9kVar != null) {
                    return o9kVar;
                }
                return d(moduleInfo, i);
            }
        }
        return d(moduleInfo, i);
    }

    public void g(ModuleInfo moduleInfo, a aVar) {
        if (moduleInfo == null) {
            wil.k("TransferConfigManager", "registerOnTransferConfigChangeListener: moduleInfo == null");
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
            wil.k("TransferConfigManager", "unregisterOnTransferConfigChangeListener: moduleInfo == null");
        } else {
            this.b.remove(moduleInfo.getMacAddress());
        }
    }

    public synchronized void k(ModuleInfo moduleInfo, o9k o9kVar) {
        try {
            if (moduleInfo == null) {
                wil.k("TransferConfigManager", "updateConfig: moduleInfo == null");
                return;
            }
            wil.a("TransferConfigManager", "updateConfig: " + gdb.a(moduleInfo.getMacAddress()) + ",config = " + o9kVar.toString());
            this.a.put(moduleInfo.getMacAddress(), o9kVar);
            a aVar = this.b.get(moduleInfo.getMacAddress());
            if (aVar != null) {
                aVar.a(moduleInfo, o9kVar);
            }
        } catch (Throwable th) {
            throw th;
        }
    }
}
