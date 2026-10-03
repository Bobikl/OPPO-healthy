package com.oplus.aiunit.vision;

import java.lang.reflect.Field;
import java.util.HashMap;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes8.dex */
public class bpj implements g0a {
    public HashMap<Integer, String> a = new HashMap<>();
    public String b;

    public bpj(String str) {
        this.b = str;
        b();
    }

    @Override // com.oplus.aiunit.vision.g0a
    public String a(int i) {
        if (this.a.containsKey(Integer.valueOf(i))) {
            return this.a.get(Integer.valueOf(i));
        }
        return null;
    }

    public final void b() {
        try {
            Class<?> cls = Class.forName(this.b + "$Stub");
            for (Field field : cls.getDeclaredFields()) {
                if (field.getName().startsWith("TRANSACTION_")) {
                    field.setAccessible(true);
                    this.a.put(Integer.valueOf(field.getInt(cls)), field.getName().replaceFirst("TRANSACTION_", ""));
                }
            }
        } catch (ClassNotFoundException | IllegalAccessException e) {
            e.printStackTrace();
        }
    }

    @Override // com.oplus.aiunit.vision.g0a
    public String getServiceName() {
        return this.b;
    }
}
