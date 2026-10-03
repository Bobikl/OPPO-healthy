package com.oplus.backup.sdk.common.load;

import android.content.Context;
import com.oplus.backup.sdk.common.plugin.BRPluginConfig;
import com.oplus.backup.sdk.common.utils.BRLog;
import com.oplus.backup.sdk.common.utils.FileUtils;
import java.io.File;
import java.util.HashMap;
import java.util.Set;

/* JADX INFO: loaded from: classes19.dex */
public class BRPluginLoader {
    private static final String TAG = "BRPluginLoader";
    private HashMap<BRPluginConfig, ClassLoader> mPluginMap = new HashMap<>();

    public Class<?> findClass(BRPluginConfig bRPluginConfig, ClassLoader classLoader, int i) throws ClassNotFoundException {
        Class<?> clsLoadClass = null;
        try {
            String[] pluginClass = bRPluginConfig.getPluginClass();
            if (pluginClass != null && pluginClass.length > i) {
                clsLoadClass = classLoader.loadClass(pluginClass[i]);
            }
        } catch (ClassNotFoundException e2) {
            BRLog.e(TAG, "findClass, e =" + e2.getMessage());
        }
        if (clsLoadClass != null) {
            BRLog.d(TAG, "findClass success:");
        } else {
            BRLog.d(TAG, "findClass failed:");
        }
        return clsLoadClass;
    }

    public BRPluginConfig[] getLoadedPlugins() {
        Set<BRPluginConfig> setKeySet = this.mPluginMap.keySet();
        if (setKeySet == null || setKeySet.size() <= 0) {
            return null;
        }
        return (BRPluginConfig[]) setKeySet.toArray(new BRPluginConfig[0]);
    }

    public void getLocalPlugin() {
    }

    public ClassLoader load(Context context, BRPluginConfig bRPluginConfig) {
        return load(context, bRPluginConfig, false);
    }

    public boolean unload(BRPluginConfig bRPluginConfig) {
        this.mPluginMap.remove(bRPluginConfig);
        FileUtils.deleteFileOrFolder(new File(bRPluginConfig.getOptimizedDirectory()));
        return true;
    }

    public ClassLoader load(Context context, BRPluginConfig bRPluginConfig, boolean z) {
        if (bRPluginConfig == null) {
            BRLog.e(TAG, "pluginConfig is null!");
            return null;
        }
        if (this.mPluginMap.containsKey(bRPluginConfig)) {
            if (!z) {
                return this.mPluginMap.get(bRPluginConfig);
            }
            unload(bRPluginConfig);
        }
        BRLog.w(TAG, "pluginConfig no dexPaths!");
        ClassLoader classLoader = context.getClassLoader();
        this.mPluginMap.put(bRPluginConfig, classLoader);
        return classLoader;
    }
}
