package org.hapjs.card.api;

import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes11.dex */
public class CardConfig {
    public static final String KEY_CLOSE_GLOBAL_DEFAULT_NIGHT_MODE = "closeGlobalDefaultNightMode";
    public static final String KEY_DARK_MODE = "darkMode";
    public static final String KEY_HOST_SOURCE = "hostSource";
    public static final String KEY_TEXT_SIZE_AUTO = "textSizeAuto";
    private Map<String, Object> mConfigs;

    public Object get(String str) {
        Map<String, Object> map = this.mConfigs;
        if (map == null) {
            return null;
        }
        return map.get(str);
    }

    public void set(String str, Object obj) {
        if (this.mConfigs == null) {
            this.mConfigs = new HashMap();
        }
        this.mConfigs.put(str, obj);
    }
}
