package com.heytap.health.wallet.jsbridge;

import android.text.TextUtils;
import androidx.collection.ArrayMap;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes18.dex */
public class NativeMethodInjectHelper {
    private static volatile NativeMethodInjectHelper mInstance;
    private ArrayMap<String, ArrayMap<String, Method>> mArrayMap = new ArrayMap<>();
    private List<Class<?>> mInjectClasses = new ArrayList();

    private NativeMethodInjectHelper() {
    }

    public static NativeMethodInjectHelper getInstance() {
        NativeMethodInjectHelper nativeMethodInjectHelper = mInstance;
        if (nativeMethodInjectHelper == null) {
            synchronized (NativeMethodInjectHelper.class) {
                nativeMethodInjectHelper = mInstance;
                if (nativeMethodInjectHelper == null) {
                    nativeMethodInjectHelper = new NativeMethodInjectHelper();
                    mInstance = nativeMethodInjectHelper;
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
        ArrayMap<String, Method> arrayMap = new ArrayMap<>();
        for (Method method : cls.getDeclaredMethods()) {
            int modifiers = method.getModifiers();
            if ((modifiers & 1) != 0 && (modifiers & 8) != 0 && (parameterTypes = method.getParameterTypes()) != null && parameterTypes.length == 2 && JSONObject.class == parameterTypes[0] && JsCallback.class == parameterTypes[1]) {
                arrayMap.put(method.getName(), method);
            }
        }
        this.mArrayMap.put(cls.getSimpleName(), arrayMap);
    }

    public NativeMethodInjectHelper clazz(Class<?> cls) {
        if (cls != null) {
            this.mInjectClasses.add(cls);
        }
        return this;
    }

    public Method findMethod(String str, String str2) {
        ArrayMap<String, Method> arrayMap;
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2) || !this.mArrayMap.containsKey(str) || (arrayMap = this.mArrayMap.get(str)) == null || !arrayMap.containsKey(str2)) {
            return null;
        }
        return arrayMap.get(str2);
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
