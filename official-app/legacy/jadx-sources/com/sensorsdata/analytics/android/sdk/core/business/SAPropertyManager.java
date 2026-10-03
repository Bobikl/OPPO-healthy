package com.sensorsdata.analytics.android.sdk.core.business;

import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes10.dex */
public class SAPropertyManager {
    private Map<String, String> mLimitKeys;

    public static class Holder {
        public static SAPropertyManager INSTANCE = new SAPropertyManager();
    }

    public static SAPropertyManager getInstance() {
        return Holder.INSTANCE;
    }

    public String getLimitValue(String str) {
        Map<String, String> map = this.mLimitKeys;
        if (map == null) {
            return null;
        }
        return map.get(str);
    }

    public boolean isLimitKey(String str) {
        Map<String, String> map = this.mLimitKeys;
        return map != null && map.containsKey(str);
    }

    public void registerLimitKeys(Map<String, String> map) {
        if (map != null) {
            this.mLimitKeys.putAll(map);
        }
    }

    private SAPropertyManager() {
        this.mLimitKeys = new HashMap();
    }
}
