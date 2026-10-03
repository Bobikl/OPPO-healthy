package com.oplus.aiunit.vision;

import java.lang.reflect.Field;
import java.util.HashMap;

/* JADX INFO: loaded from: classes8.dex */
public class dlj implements zy9 {
    public HashMap<Integer, String> a = new HashMap<>();
    public String b;

    public dlj(String str) {
        this.b = str;
        b();
    }

    @Override // com.oplus.aiunit.vision.zy9
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
        } catch (ClassNotFoundException | IllegalAccessException e2) {
            e2.printStackTrace();
        }
    }

    @Override // com.oplus.aiunit.vision.zy9
    public String getServiceName() {
        return this.b;
    }
}
