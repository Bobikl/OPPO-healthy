package com.platform.usercenter.jsbridge;

import android.os.Handler;
import android.text.TextUtils;
import android.util.ArrayMap;
import android.webkit.WebView;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes9.dex */
public class NativeMethodInjectHelper {
    private static volatile NativeMethodInjectHelper sInstance;
    private Map<String, Map<String, Method>> mArrayMap = new HashMap();
    private List<Class<?>> mInjectClasses = new ArrayList();

    private NativeMethodInjectHelper() {
    }

    public static NativeMethodInjectHelper getInstance() {
        NativeMethodInjectHelper nativeMethodInjectHelper = sInstance;
        if (nativeMethodInjectHelper == null) {
            synchronized (NativeMethodInjectHelper.class) {
                nativeMethodInjectHelper = sInstance;
                if (nativeMethodInjectHelper == null) {
                    nativeMethodInjectHelper = new NativeMethodInjectHelper();
                    sInstance = nativeMethodInjectHelper;
                }
            }
        }
        return nativeMethodInjectHelper;
    }

    private void putMethod(Class<?> cls) {
        Class<?>[] parameterTypes;
        if (cls == null) {
            return;
        }
        ArrayMap arrayMap = new ArrayMap();
        for (Method method : cls.getDeclaredMethods()) {
            int modifiers = method.getModifiers();
            if ((modifiers & 1) != 0 && (modifiers & 8) != 0 && (parameterTypes = method.getParameterTypes()) != null && parameterTypes.length == 4 && WebView.class == parameterTypes[0] && JSONObject.class == parameterTypes[1] && JsCallback.class == parameterTypes[2] && Handler.class == parameterTypes[3]) {
                arrayMap.put(method.getName(), method);
            }
        }
        this.mArrayMap.put(cls.getSimpleName(), arrayMap);
    }

    public NativeMethodInjectHelper clazz(Class<?> cls) {
        if (cls == null) {
            throw new NullPointerException("NativeMethodInjectHelper:The clazz can not be null!");
        }
        this.mInjectClasses.add(cls);
        return this;
    }

    public Method findMethod(String str, String str2) {
        Map<String, Method> map;
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2) || !this.mArrayMap.containsKey(str) || (map = this.mArrayMap.get(str)) == null || !map.containsKey(str2)) {
            return null;
        }
        return map.get(str2);
    }

    public void inject() {
        int size = this.mInjectClasses.size();
        if (size != 0) {
            this.mArrayMap.clear();
            for (int i = 0; i < size; i++) {
                putMethod(this.mInjectClasses.get(i));
            }
            this.mInjectClasses.clear();
        }
    }
}
