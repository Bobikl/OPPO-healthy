package com.nearme.instant.androidx.card;

import android.text.TextUtils;
import com.nearme.instant.xcard.utils.PublicPrefUtil;
import dalvik.system.DexClassLoader;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes5.dex */
public class AndroidXHapDexClassLoader extends DexClassLoader {
    private boolean mDefaultRule;
    private Map<String, List<String>> mMap;

    public AndroidXHapDexClassLoader(String str, String str2, String str3, ClassLoader classLoader) {
        super(str, str2, str3, classLoader);
        this.mMap = new HashMap();
        this.mDefaultRule = true;
        initPackageList();
    }

    private void initPackageList() {
        String cardPackageList = PublicPrefUtil.getCardPackageList();
        if (TextUtils.isEmpty(cardPackageList)) {
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject(cardPackageList);
            String strOptString = jSONObject.optString("white", "");
            String strOptString2 = jSONObject.optString("black", "");
            this.mDefaultRule = jSONObject.optBoolean("default", true);
            this.mMap.put("white", Arrays.asList(strOptString.split(",")));
            this.mMap.put("black", Arrays.asList(strOptString2.split(",")));
        } catch (JSONException unused) {
        }
    }

    private boolean isOurPackage(String str) {
        if (this.mMap.isEmpty()) {
            if (str.startsWith("java")) {
                return false;
            }
            if (str.startsWith("android.support") || str.startsWith("androidx")) {
                return true;
            }
            return (str.startsWith("android") || str.startsWith("org.json") || str.startsWith("org.hapjs.card") || str.startsWith("com.nearme.instant.xcard")) ? false : true;
        }
        List<String> list = this.mMap.get("white");
        if (list != null) {
            Iterator<String> it = list.iterator();
            while (it.hasNext()) {
                if (str.startsWith(it.next())) {
                    return true;
                }
            }
        }
        List<String> list2 = this.mMap.get("black");
        if (list2 != null) {
            Iterator<String> it2 = list2.iterator();
            while (it2.hasNext()) {
                if (str.startsWith(it2.next())) {
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
