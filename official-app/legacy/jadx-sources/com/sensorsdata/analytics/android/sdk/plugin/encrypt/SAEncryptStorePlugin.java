package com.sensorsdata.analytics.android.sdk.plugin.encrypt;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import com.sensorsdata.analytics.android.sdk.BuildConfig;
import com.sensorsdata.analytics.android.sdk.core.mediator.Modules;
import com.sensorsdata.analytics.android.sdk.core.mediator.SAModuleManager;
import com.sensorsdata.analytics.android.sdk.util.SASpUtils;

/* JADX INFO: loaded from: classes10.dex */
public class SAEncryptStorePlugin implements StorePlugin {
    private final String mFileName;
    private final SharedPreferences mStoreSp;

    public SAEncryptStorePlugin(Context context) {
        this(context, BuildConfig.LIBRARY_PACKAGE_NAME);
    }

    private String decryptValue(String str) {
        String str2 = (String) SAModuleManager.getInstance().invokeModuleFunction(Modules.Encrypt.MODULE_NAME, Modules.Encrypt.METHOD_DECRYPT_AES, str);
        return TextUtils.isEmpty(str2) ? str : str2;
    }

    private String encryptValue(String str) {
        String str2 = (String) SAModuleManager.getInstance().invokeModuleFunction(Modules.Encrypt.MODULE_NAME, Modules.Encrypt.METHOD_ENCRYPT_AES, str);
        return TextUtils.isEmpty(str2) ? str : str2;
    }

    @Override // com.sensorsdata.analytics.android.sdk.plugin.encrypt.StorePlugin
    public Boolean getBool(String str) {
        String string = getString(str);
        if (TextUtils.isEmpty(string)) {
            return null;
        }
        return Boolean.valueOf(Boolean.parseBoolean(string));
    }

    @Override // com.sensorsdata.analytics.android.sdk.plugin.encrypt.StorePlugin
    public Float getFloat(String str) {
        String string = getString(str);
        if (TextUtils.isEmpty(string)) {
            return null;
        }
        return Float.valueOf(Float.parseFloat(string));
    }

    @Override // com.sensorsdata.analytics.android.sdk.plugin.encrypt.StorePlugin
    public Integer getInteger(String str) {
        String string = getString(str);
        if (TextUtils.isEmpty(string)) {
            return null;
        }
        return Integer.valueOf(Integer.parseInt(string));
    }

    @Override // com.sensorsdata.analytics.android.sdk.plugin.encrypt.StorePlugin
    public Long getLong(String str) {
        String string = getString(str);
        if (TextUtils.isEmpty(string)) {
            return null;
        }
        return Long.valueOf(Long.parseLong(string));
    }

    @Override // com.sensorsdata.analytics.android.sdk.plugin.encrypt.StorePlugin
    public String getString(String str) {
        String string = this.mStoreSp.getString(encryptValue(str), null);
        if (TextUtils.isEmpty(string)) {
            return null;
        }
        return decryptValue(string);
    }

    @Override // com.sensorsdata.analytics.android.sdk.plugin.encrypt.StorePlugin
    public boolean isExists(String str) {
        return this.mStoreSp.contains(encryptValue(str));
    }

    @Override // com.sensorsdata.analytics.android.sdk.plugin.encrypt.StorePlugin
    public void remove(String str) {
        this.mStoreSp.edit().remove(encryptValue(str)).apply();
    }

    @Override // com.sensorsdata.analytics.android.sdk.plugin.encrypt.StorePlugin
    public void setBool(String str, boolean z) {
        this.mStoreSp.edit().putString(encryptValue(str), encryptValue(String.valueOf(z))).apply();
    }

    @Override // com.sensorsdata.analytics.android.sdk.plugin.encrypt.StorePlugin
    public void setFloat(String str, float f) {
        this.mStoreSp.edit().putString(encryptValue(str), encryptValue(String.valueOf(f))).apply();
    }

    @Override // com.sensorsdata.analytics.android.sdk.plugin.encrypt.StorePlugin
    public void setInteger(String str, int i) {
        this.mStoreSp.edit().putString(encryptValue(str), encryptValue(String.valueOf(i))).apply();
    }

    @Override // com.sensorsdata.analytics.android.sdk.plugin.encrypt.StorePlugin
    public void setLong(String str, long j2) {
        this.mStoreSp.edit().putString(encryptValue(str), encryptValue(String.valueOf(j2))).apply();
    }

    @Override // com.sensorsdata.analytics.android.sdk.plugin.encrypt.StorePlugin
    public void setString(String str, String str2) {
        this.mStoreSp.edit().putString(encryptValue(str), encryptValue(str2)).apply();
    }

    @Override // com.sensorsdata.analytics.android.sdk.plugin.encrypt.StorePlugin
    public String type() {
        return this.mFileName;
    }

    @Override // com.sensorsdata.analytics.android.sdk.plugin.encrypt.StorePlugin
    public void upgrade(StorePlugin storePlugin) {
    }

    public SAEncryptStorePlugin(Context context, String str) {
        this.mStoreSp = SASpUtils.getSharedPreferences(context, str, 0);
        this.mFileName = str;
    }
}
