package org.hapjs.card.sdk;

import android.util.Log;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes11.dex */
public class ProxyHandler implements InvocationHandler {
    private static final String TAG = "ProxyHandler";
    private final Object mProxy;

    public ProxyHandler(Object obj) {
        this.mProxy = obj;
    }

    private static Object getDefaultValue(Class<?> cls) {
        if (cls == Boolean.TYPE) {
            return Boolean.FALSE;
        }
        if (cls == Byte.TYPE) {
            return (byte) 0;
        }
        if (cls == Short.TYPE) {
            return (short) 0;
        }
        if (cls == Character.TYPE) {
            return (char) 0;
        }
        if (cls == Integer.TYPE) {
            return 0;
        }
        if (cls == Long.TYPE) {
            return 0L;
        }
        if (cls == Float.TYPE) {
            return Float.valueOf(0.0f);
        }
        if (cls == Double.TYPE) {
            return Double.valueOf(0.0d);
        }
        return null;
    }

    @Override // java.lang.reflect.InvocationHandler
    public Object invoke(Object obj, Method method, Object[] objArr) throws Throwable {
        try {
            Object obj2 = this.mProxy;
            if (obj2 != null) {
                return method.invoke(obj2, objArr);
            }
            Log.e(TAG, String.format("invoke \"%s\" fail. mProxy is null", method.toGenericString()));
            return getDefaultValue(method.getReturnType());
        } catch (InvocationTargetException e2) {
            if (e2.getTargetException() instanceof AbstractMethodError) {
                Log.w(TAG, String.format("invoke \"%s\" of %s fail. proxy not implement this method.", method.toGenericString(), this.mProxy.getClass()));
            } else {
                Log.w(TAG, String.format("invoke \"%s\" of %s fail.", method.toGenericString(), this.mProxy.getClass()), e2);
            }
            return getDefaultValue(method.getReturnType());
        }
    }
}
