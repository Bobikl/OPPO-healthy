package com.heytap.wearable.support.watchface.edit;

import android.content.Context;
import com.heytap.wearable.support.watchface.common.log.SdkDebugLog;
import com.heytap.wearable.support.watchface.runtime.config.WatchFaceConfig;
import com.heytap.wearable.support.watchface.runtime.config.WatchFaceStyleConfig;
import java.util.ArrayList;
import java.util.HashMap;

/* JADX INFO: loaded from: classes2.dex */
public class ConfigManager {
    private static final int MAX_STYLES = 10;
    private static final String TAG = "ConfigManager";
    private final HashMap<String, WatchFaceConfig> mConfigs;

    public static class SingletonHolder {
        private static final ConfigManager INSTANCE = new ConfigManager();

        private SingletonHolder() {
        }
    }

    public static ConfigManager getInstance() {
        return SingletonHolder.INSTANCE;
    }

    private boolean hasStyles(WatchFaceConfig watchFaceConfig) {
        return (watchFaceConfig == null || watchFaceConfig.getStyles() == null || watchFaceConfig.getStyles().size() <= 0) ? false : true;
    }

    private WatchFaceConfig updateWatchFaceConfig(WatchFaceConfig watchFaceConfig) {
        if (watchFaceConfig.getStyles().size() > 10) {
            ArrayList arrayList = new ArrayList();
            for (int i = 0; i < 10; i++) {
                arrayList.add(watchFaceConfig.getStyles().get(i));
            }
            watchFaceConfig.getStyles().clear();
            watchFaceConfig.getStyles().addAll(arrayList);
        }
        for (int i2 = 0; i2 < watchFaceConfig.getStyles().size(); i2++) {
            ((WatchFaceStyleConfig) watchFaceConfig.getStyles().get(i2)).setIndex(i2);
        }
        return watchFaceConfig;
    }

    public WatchFaceConfig getWatchFaceConfig(Context context, String str, String str2) throws Throwable {
        WatchFaceConfig watchFaceConfig = this.mConfigs.get(str);
        SdkDebugLog.d(TAG, "[getWatchFaceConfig] packageName = " + str + " className = " + str2 + " watchFaceConfig = " + watchFaceConfig);
        if (watchFaceConfig != null) {
            WatchFaceConfig watchFaceConfigLoadSdcardStyles = ConfigUtils.loadSdcardStyles(context, str);
            return hasStyles(watchFaceConfigLoadSdcardStyles) ? updateWatchFaceConfig(watchFaceConfigLoadSdcardStyles) : watchFaceConfig;
        }
        WatchFaceConfig watchFaceConfigLoadStyles = loadStyles(context, str, str2);
        SdkDebugLog.d(TAG, "[getWatchFaceConfig] styles size = " + watchFaceConfigLoadStyles.getStyles().size());
        this.mConfigs.put(str, watchFaceConfigLoadStyles);
        return watchFaceConfigLoadStyles;
    }

    public WatchFaceConfig loadStyles(Context context, String str, String str2) throws Throwable {
        WatchFaceConfig watchFaceConfigLoadSdcardStyles = ConfigUtils.loadSdcardStyles(context, str);
        if (hasStyles(watchFaceConfigLoadSdcardStyles)) {
            SdkDebugLog.d(TAG, "[loadStyles] sdcard has styles");
        } else {
            watchFaceConfigLoadSdcardStyles = ConfigUtils.loadAssetsStyles(context, str2);
            if (hasStyles(watchFaceConfigLoadSdcardStyles)) {
                SdkDebugLog.d(TAG, "[loadStyles] assets has styles");
            } else {
                SdkDebugLog.d(TAG, "[loadStyles] getDefaultWatchFaceConfig");
                watchFaceConfigLoadSdcardStyles = WatchFaceConfig.getDefaultWatchFaceConfig();
            }
        }
        return updateWatchFaceConfig(watchFaceConfigLoadSdcardStyles);
    }

    private ConfigManager() {
        this.mConfigs = new HashMap<>();
    }
}
