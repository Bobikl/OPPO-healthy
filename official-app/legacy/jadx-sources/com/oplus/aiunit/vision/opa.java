package com.oplus.aiunit.vision;

import android.content.Context;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes6.dex */
public final class opa implements ur9 {
    public static final ConcurrentHashMap<String, opa> b = new ConcurrentHashMap<>();
    public final ur9 a;

    public opa(Context context, String str) {
        this.a = new ppa(context, str);
    }

    public static opa a(Context context, String str) {
        if (str == null) {
            str = "";
        }
        ConcurrentHashMap<String, opa> concurrentHashMap = b;
        opa opaVar = concurrentHashMap.get(str);
        if (opaVar != null) {
            return opaVar;
        }
        synchronized (concurrentHashMap) {
            opa opaVar2 = concurrentHashMap.get(str);
            if (opaVar2 != null) {
                return opaVar2;
            }
            opa opaVar3 = new opa(context, str);
            concurrentHashMap.put(str, opaVar3);
            return opaVar3;
        }
    }

    @Override // com.oplus.aiunit.vision.ur9
    public boolean contains(String str) {
        return this.a.contains(str);
    }

    @Override // com.oplus.aiunit.vision.ur9
    public boolean getBoolean(String str, boolean z) {
        return this.a.getBoolean(str, z);
    }

    @Override // com.oplus.aiunit.vision.ur9
    public int getInt(String str, int i) {
        return this.a.getInt(str, i);
    }

    @Override // com.oplus.aiunit.vision.ur9
    public long getLong(String str, long j2) {
        return this.a.getLong(str, j2);
    }

    @Override // com.oplus.aiunit.vision.ur9
    public String getString(String str, String str2) {
        return this.a.getString(str, str2);
    }

    @Override // com.oplus.aiunit.vision.ur9
    public String[] keys() {
        return this.a.keys();
    }

    @Override // com.oplus.aiunit.vision.ur9
    public void putBoolean(String str, boolean z) {
        this.a.putBoolean(str, z);
    }

    @Override // com.oplus.aiunit.vision.ur9
    public void putInt(String str, int i) {
        this.a.putInt(str, i);
    }

    @Override // com.oplus.aiunit.vision.ur9
    public void putLong(String str, long j2) {
        this.a.putLong(str, j2);
    }

    @Override // com.oplus.aiunit.vision.ur9
    public void putString(String str, String str2) {
        this.a.putString(str, str2);
    }

    @Override // com.oplus.aiunit.vision.ur9
    public void remove(String str) {
        this.a.remove(str);
    }
}
