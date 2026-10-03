package com.oplus.aiunit.vision;

import java.lang.reflect.Field;
import java.util.HashMap;

/* JADX INFO: loaded from: classes19.dex */
public class elj {
    public HashMap<Integer, String> a = new HashMap<>();
    public String b;

    public elj(String str) {
        this.b = str;
        a();
    }

    public final void a() {
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
}
