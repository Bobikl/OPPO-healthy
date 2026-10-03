package com.oplus.epona.provider;

import androidx.annotation.NonNull;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public class ProviderInfo {
    private String mClassName;
    private Map<String, Method> mMethodCache = new HashMap();
    private Map<String, ProviderMethodInfo> mMethods;
    private String mName;
    private boolean mNeedIPC;
    private boolean mNeedLog;

    public ProviderInfo(String str, String str2, @NonNull Map<String, ProviderMethodInfo> map, boolean z, boolean z2) {
        this.mName = str;
        this.mClassName = str2;
        this.mMethods = map;
        this.mNeedIPC = z;
        this.mNeedLog = z2;
    }

    private Class<?>[] params(String[] strArr) throws ClassNotFoundException {
        if (strArr == null || strArr.length == 0) {
            return null;
        }
        int length = strArr.length;
        Class<?>[] clsArr = new Class[length];
        for (int i = 0; i < length; i++) {
            clsArr[i] = Class.forName(strArr[i]);
        }
        return clsArr;
    }

    public boolean containsAction(String str) {
        Map<String, ProviderMethodInfo> map = this.mMethods;
        if (map == null) {
            return false;
        }
        return map.containsKey(str);
    }

    public String getClassName() {
        return this.mClassName;
    }

    public Method getMethod(String str) {
        Method method = this.mMethodCache.get(str);
        if (method != null) {
            return method;
        }
        ProviderMethodInfo providerMethodInfo = this.mMethods.get(str);
        try {
            Method declaredMethod = Class.forName(this.mClassName).getDeclaredMethod(providerMethodInfo.getMethodName(), params(providerMethodInfo.getMethodParams()));
            this.mMethodCache.put(str, declaredMethod);
            return declaredMethod;
        } catch (Exception unused) {
            return null;
        }
    }

    public ProviderMethodInfo getMethodInfo(String str) {
        return this.mMethods.get(str);
    }

    public String getName() {
        return this.mName;
    }

    public boolean needIPC() {
        return this.mNeedIPC;
    }

    public boolean needLog() {
        return this.mNeedLog;
    }
}
