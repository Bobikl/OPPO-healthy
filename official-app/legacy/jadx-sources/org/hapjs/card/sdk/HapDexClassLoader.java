package org.hapjs.card.sdk;

import android.text.TextUtils;
import dalvik.system.DexClassLoader;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes11.dex */
public class HapDexClassLoader extends DexClassLoader {
    private boolean mDefaultRule;
    private final JSONObject mRule;
    private String mSourcePath;

    public HapDexClassLoader(CardPluginInfo cardPluginInfo, JSONObject jSONObject, ClassLoader classLoader) {
        super(cardPluginInfo.getSourceDir(), cardPluginInfo.getOptimizedDir(), cardPluginInfo.getNativeLibraries(), classLoader);
        this.mDefaultRule = true;
        this.mRule = jSONObject;
        this.mSourcePath = cardPluginInfo.getSourceDir();
        if (jSONObject != null) {
            this.mDefaultRule = TextUtils.equals("platform", jSONObject.optString("default", "platform"));
        }
    }

    private boolean isOurPackage(String str) {
        JSONObject jSONObject = this.mRule;
        if (jSONObject == null || jSONObject.length() <= 0) {
            if (str.startsWith("java")) {
                return false;
            }
            if (str.startsWith("android.support") || str.startsWith("androidx")) {
                return true;
            }
            return (str.startsWith("android") || str.startsWith("org.json") || str.startsWith("org.hapjs.card") || str.startsWith("com.nearme.instant.xcard")) ? false : true;
        }
        JSONArray jSONArrayOptJSONArray = this.mRule.optJSONArray("hostPreferredPkgs");
        if (jSONArrayOptJSONArray != null) {
            for (int i = 0; i < jSONArrayOptJSONArray.length(); i++) {
                if (str.startsWith(jSONArrayOptJSONArray.optString(i))) {
                    return true;
                }
            }
        }
        JSONArray jSONArrayOptJSONArray2 = this.mRule.optJSONArray("platformPreferredPkgs");
        if (jSONArrayOptJSONArray2 != null) {
            for (int i2 = 0; i2 < jSONArrayOptJSONArray2.length(); i2++) {
                if (str.startsWith(jSONArrayOptJSONArray2.optString(i2))) {
                    return false;
                }
            }
        }
        return this.mDefaultRule;
    }

    @Override // java.lang.ClassLoader
    public Class<?> loadClass(String str) throws ClassNotFoundException {
        Class<?> clsFindLoadedClass = findLoadedClass(str);
        if (clsFindLoadedClass != null) {
            return clsFindLoadedClass;
        }
        if (isOurPackage(str)) {
            try {
                clsFindLoadedClass = findClass(str);
            } catch (Exception unused) {
            }
        }
        return clsFindLoadedClass == null ? super.loadClass(str) : clsFindLoadedClass;
    }
}
