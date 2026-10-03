package org.hapjs.card.common.utils;

import android.content.Context;
import android.content.pm.PackageManager;
import android.text.TextUtils;
import android.util.Log;
import dalvik.system.DexClassLoader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes11.dex */
public class CardClassLoader extends DexClassLoader {
    private static final String TAG = "CardClassLoader";
    private PackageLoadRulesHelper mPackageLoadRulesHelper;

    public static class PackageLoadRulesHelper {
        private static final String KEY_DEFAULT = "default";
        private static final String KEY_HOST_PREFERRED_PKGS = "hostPreferredPkgs";
        private static final String KEY_PLATFORM_PREFERRED_PKGS = "platformPreferredPkgs";
        private static final String PACKAGE_LOAD_RULES = "hap/package_load_rules.json";
        private static final String PLATFORM = "platform";
        private Map<String, List<String>> mRulesMap = new HashMap();
        private boolean mPlatformByDefault = true;

        public PackageLoadRulesHelper(Context context, String str) {
            try {
                if (initRules(context.createPackageContext(str, 0))) {
                    return;
                }
            } catch (PackageManager.NameNotFoundException e2) {
                Log.e(CardClassLoader.TAG, "failed to update rules", e2);
            }
            initRules(context);
        }

        private boolean initRules(Context context) {
            try {
                JSONObject jSONObject = new JSONObject(FileUtils.readStreamAsString(context.getResources().getAssets().open(PACKAGE_LOAD_RULES), true));
                JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray(KEY_PLATFORM_PREFERRED_PKGS);
                if (jSONArrayOptJSONArray != null) {
                    ArrayList arrayList = new ArrayList(jSONArrayOptJSONArray.length());
                    for (int i = 0; i < jSONArrayOptJSONArray.length(); i++) {
                        arrayList.add(jSONArrayOptJSONArray.getString(i));
                    }
                    this.mRulesMap.put(KEY_PLATFORM_PREFERRED_PKGS, arrayList);
                }
                JSONArray jSONArrayOptJSONArray2 = jSONObject.optJSONArray(KEY_HOST_PREFERRED_PKGS);
                if (jSONArrayOptJSONArray2 != null) {
                    ArrayList arrayList2 = new ArrayList(jSONArrayOptJSONArray2.length());
                    for (int i2 = 0; i2 < jSONArrayOptJSONArray2.length(); i2++) {
                        arrayList2.add(jSONArrayOptJSONArray2.getString(i2));
                    }
                    this.mRulesMap.put(KEY_HOST_PREFERRED_PKGS, arrayList2);
                }
                this.mPlatformByDefault = TextUtils.equals("platform", jSONObject.optString("default", "platform"));
                return true;
            } catch (IOException | JSONException e2) {
                Log.e(CardClassLoader.TAG, "fail to init rules", e2);
                return false;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public boolean isOurPackage(String str) {
            List<String> list = this.mRulesMap.get(KEY_PLATFORM_PREFERRED_PKGS);
            if (list != null) {
                Iterator<String> it = list.iterator();
                while (it.hasNext()) {
                    if (str.startsWith(it.next())) {
                        return true;
                    }
                }
            }
            List<String> list2 = this.mRulesMap.get(KEY_HOST_PREFERRED_PKGS);
            if (list2 != null) {
                Iterator<String> it2 = list2.iterator();
                while (it2.hasNext()) {
                    if (str.startsWith(it2.next())) {
                        return false;
                    }
                }
            }
            return this.mPlatformByDefault;
        }
    }

    public CardClassLoader(Context context, String str, String str2, String str3, String str4, ClassLoader classLoader) {
        super(str2, str3, str4, classLoader);
        this.mPackageLoadRulesHelper = new PackageLoadRulesHelper(context, str);
    }

    @Override // java.lang.ClassLoader
    public Class<?> loadClass(String str) throws ClassNotFoundException {
        Class<?> clsFindLoadedClass = findLoadedClass(str);
        if (clsFindLoadedClass != null) {
            return clsFindLoadedClass;
        }
        if (this.mPackageLoadRulesHelper.isOurPackage(str)) {
            try {
                clsFindLoadedClass = findClass(str);
            } catch (Exception unused) {
            }
        }
        return clsFindLoadedClass == null ? super.loadClass(str) : clsFindLoadedClass;
    }
}
