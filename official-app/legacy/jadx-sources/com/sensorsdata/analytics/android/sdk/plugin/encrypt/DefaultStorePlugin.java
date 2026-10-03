package com.sensorsdata.analytics.android.sdk.plugin.encrypt;

import android.content.Context;
import android.content.SharedPreferences;
import com.sensorsdata.analytics.android.sdk.util.SASpUtils;
import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
public abstract class DefaultStorePlugin implements StorePlugin {
    private final String mFileName;
    private final SharedPreferences mStoreSp;

    public DefaultStorePlugin(Context context, String str) {
        this.mStoreSp = SASpUtils.getSharedPreferences(context, str, 0);
        this.mFileName = str;
    }

    private String getKey(String str) {
        return str.replaceFirst(type(), "");
    }

    @Override // com.sensorsdata.analytics.android.sdk.plugin.encrypt.StorePlugin
    public Boolean getBool(String str) {
        if (isExists(str)) {
            return Boolean.valueOf(this.mStoreSp.getBoolean(getKey(str), false));
        }
        return null;
    }

    @Override // com.sensorsdata.analytics.android.sdk.plugin.encrypt.StorePlugin
    public Float getFloat(String str) {
        if (isExists(str)) {
            return Float.valueOf(this.mStoreSp.getFloat(getKey(str), 0.0f));
        }
        return null;
    }

    @Override // com.sensorsdata.analytics.android.sdk.plugin.encrypt.StorePlugin
    public Integer getInteger(String str) {
        if (isExists(str)) {
            return Integer.valueOf(this.mStoreSp.getInt(getKey(str), 0));
        }
        return null;
    }

    @Override // com.sensorsdata.analytics.android.sdk.plugin.encrypt.StorePlugin
    public Long getLong(String str) {
        if (isExists(str)) {
            return Long.valueOf(this.mStoreSp.getLong(getKey(str), 0L));
        }
        return null;
    }

    @Override // com.sensorsdata.analytics.android.sdk.plugin.encrypt.StorePlugin
    public String getString(String str) {
        if (isExists(str)) {
            return this.mStoreSp.getString(getKey(str), null);
        }
        return null;
    }

    @Override // com.sensorsdata.analytics.android.sdk.plugin.encrypt.StorePlugin
    public boolean isExists(String str) {
        return this.mStoreSp.contains(getKey(str));
    }

    @Override // com.sensorsdata.analytics.android.sdk.plugin.encrypt.StorePlugin
    public void remove(String str) {
        this.mStoreSp.edit().remove(getKey(str)).apply();
    }

    @Override // com.sensorsdata.analytics.android.sdk.plugin.encrypt.StorePlugin
    public void setBool(String str, boolean z) {
        this.mStoreSp.edit().putBoolean(getKey(str), z).apply();
    }

    @Override // com.sensorsdata.analytics.android.sdk.plugin.encrypt.StorePlugin
    public void setFloat(String str, float f) {
        this.mStoreSp.edit().putFloat(getKey(str), f).apply();
    }

    @Override // com.sensorsdata.analytics.android.sdk.plugin.encrypt.StorePlugin
    public void setInteger(String str, int i) {
        this.mStoreSp.edit().putInt(getKey(str), i).apply();
    }

    @Override // com.sensorsdata.analytics.android.sdk.plugin.encrypt.StorePlugin
    public void setLong(String str, long j2) {
        this.mStoreSp.edit().putLong(getKey(str), j2).apply();
    }

    @Override // com.sensorsdata.analytics.android.sdk.plugin.encrypt.StorePlugin
    public void setString(String str, String str2) {
        this.mStoreSp.edit().putString(getKey(str), str2).apply();
    }

    public abstract List<String> storeKeys();

    @Override // com.sensorsdata.analytics.android.sdk.plugin.encrypt.StorePlugin
    public String type() {
        return this.mFileName;
    }

    @Override // com.sensorsdata.analytics.android.sdk.plugin.encrypt.StorePlugin
    public void upgrade(StorePlugin storePlugin) {
    }
}
