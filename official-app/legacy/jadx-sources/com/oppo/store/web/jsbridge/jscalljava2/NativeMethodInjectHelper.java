package com.oppo.store.web.jsbridge.jscalljava2;

import android.os.Handler;
import android.text.TextUtils;
import android.webkit.WebView;
import androidx.collection.ArrayMap;
import com.heytap.store.base.core.util.WeakActivityHandler;
import com.oppo.store.web.jsbridge.javacalljs.JavaCallJs;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes9.dex */
public class NativeMethodInjectHelper {
    private static volatile NativeMethodInjectHelper sInstance;
    private final ArrayMap<String, ArrayMap<String, Method>> mArrayMap = new ArrayMap<>();
    private final List<Class<?>> mInjectClasses = new ArrayList();

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
        Class<?> cls2;
        if (cls == null) {
            return;
        }
        ArrayMap<String, Method> arrayMap = new ArrayMap<>();
        for (Method method : cls.getDeclaredMethods()) {
            int modifiers = method.getModifiers();
            if ((modifiers & 1) != 0 && (modifiers & 8) != 0 && (parameterTypes = method.getParameterTypes()) != null && parameterTypes.length == 4 && WebView.class == parameterTypes[0] && JSONObject.class == parameterTypes[1] && JavaCallJs.class == parameterTypes[2] && (Handler.class == (cls2 = parameterTypes[3]) || WeakActivityHandler.class == cls2)) {
                arrayMap.put(method.getName(), method);
            }
        }
        ArrayMap<String, ArrayMap<String, Method>> arrayMap2 = this.mArrayMap;
        if (arrayMap2 != null) {
            arrayMap2.put(cls.getSimpleName(), arrayMap);
            this.mArrayMap.put(cls.getName(), arrayMap);
        }
    }

    public NativeMethodInjectHelper clazz(Class<?> cls) {
        if (cls == null) {
            throw new NullPointerException("NativeMethodInjectHelper:The clazz can not be null!");
        }
        this.mInjectClasses.add(cls);
        return this;
    }

    public Boolean findAllClassMethod(String str) {
        if (TextUtils.isEmpty(str)) {
            return Boolean.FALSE;
        }
        for (Map.Entry<String, ArrayMap<String, Method>> entry : this.mArrayMap.entrySet()) {
            if (entry != null && entry.getValue().containsKey(str)) {
                return Boolean.TRUE;
            }
        }
        return Boolean.FALSE;
    }

    public Method findMethod(String str, String str2) {
        ArrayMap<String, ArrayMap<String, Method>> arrayMap;
        ArrayMap<String, Method> arrayMap2;
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2) || (arrayMap = this.mArrayMap) == null || !arrayMap.containsKey(str) || (arrayMap2 = this.mArrayMap.get(str)) == null || !arrayMap2.containsKey(str2)) {
            return null;
        }
        return arrayMap2.get(str2);
    }

    public void inject() {
        int size = this.mInjectClasses.size();
        if (size != 0) {
            ArrayMap<String, ArrayMap<String, Method>> arrayMap = this.mArrayMap;
            if (arrayMap != null) {
                arrayMap.clear();
            }
            for (int i = 0; i < size; i++) {
                putMethod(this.mInjectClasses.get(i));
            }
            this.mInjectClasses.clear();
        }
    }
}
