package com.oplus.aiunit.vision;

import android.content.Context;
import android.content.SharedPreferences;
import java.util.Map;

/* JADX INFO: loaded from: classes8.dex */
public class p1h {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static volatile p1h f15151c;
    public SharedPreferences a;
    public SharedPreferences.Editor b;

    public p1h(Context context) {
        if (context != null) {
            SharedPreferences sharedPreferences = context.getSharedPreferences("oms", 0);
            this.a = sharedPreferences;
            this.b = sharedPreferences.edit();
        }
    }

    public static p1h b(Context context) {
        if (f15151c == null) {
            synchronized (p1h.class) {
                if (f15151c == null && context != null) {
                    f15151c = new p1h(context.getApplicationContext());
                }
            }
        }
        return f15151c;
    }

    public Object a(String str, Object obj) {
        SharedPreferences sharedPreferences = this.a;
        if (sharedPreferences == null) {
            return null;
        }
        if (obj instanceof String) {
            return sharedPreferences.getString(str, (String) obj);
        }
        if (obj instanceof Integer) {
            return Integer.valueOf(sharedPreferences.getInt(str, ((Integer) obj).intValue()));
        }
        if (obj instanceof Boolean) {
            return Boolean.valueOf(sharedPreferences.getBoolean(str, ((Boolean) obj).booleanValue()));
        }
        if (obj instanceof Float) {
            return Float.valueOf(sharedPreferences.getFloat(str, ((Float) obj).floatValue()));
        }
        if (obj instanceof Long) {
            return Long.valueOf(sharedPreferences.getLong(str, ((Long) obj).longValue()));
        }
        w7i.i("SharedPreferencesUtil", " get defaultObject type error,please check", new Object[0]);
        return null;
    }

    public void c(String str, Object obj) {
        SharedPreferences.Editor editor = this.b;
        if (editor == null) {
            return;
        }
        if (obj instanceof String) {
            editor.putString(str, (String) obj);
        } else if (obj instanceof Integer) {
            editor.putInt(str, ((Integer) obj).intValue());
        } else if (obj instanceof Boolean) {
            editor.putBoolean(str, ((Boolean) obj).booleanValue());
        } else if (obj instanceof Float) {
            editor.putFloat(str, ((Float) obj).floatValue());
        } else if (obj instanceof Long) {
            editor.putLong(str, ((Long) obj).longValue());
        } else {
            w7i.i("SharedPreferencesUtil", " put key - value: value type error,please check", new Object[0]);
        }
        this.b.apply();
    }

    public void d(Map<String, Object> map) {
        if (map == null || this.b == null) {
            return;
        }
        for (Map.Entry<String, Object> entry : map.entrySet()) {
            String key = entry.getKey();
            Object value = entry.getValue();
            if (value instanceof String) {
                this.b.putString(key, (String) value);
            } else if (value instanceof Integer) {
                this.b.putInt(key, ((Integer) value).intValue());
            } else if (value instanceof Boolean) {
                this.b.putBoolean(key, ((Boolean) value).booleanValue());
            } else if (value instanceof Float) {
                this.b.putFloat(key, ((Float) value).floatValue());
            } else if (value instanceof Long) {
                this.b.putLong(key, ((Long) value).longValue());
            } else {
                w7i.i("SharedPreferencesUtil", " put map value type error,please check", new Object[0]);
            }
        }
        this.b.apply();
    }
}
