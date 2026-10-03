package com.omron;

import android.content.Context;
import android.content.SharedPreferences;
import android.util.Log;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes5.dex */
public class o {
    private static Boolean a = Boolean.FALSE;

    public static class a {
        private static final Method a = a();

        private static Method a() {
            if (!o.a.booleanValue()) {
                return null;
            }
            try {
                return SharedPreferences.Editor.class.getMethod("apply", new Class[0]);
            } catch (NoSuchMethodException unused) {
                return null;
            }
        }

        public static void b(SharedPreferences.Editor editor) {
            editor.commit();
        }

        public static void a(SharedPreferences.Editor editor) {
            try {
                Method method = a;
                if (method != null) {
                    method.invoke(editor, new Object[0]);
                    return;
                }
            } catch (IllegalAccessException | IllegalArgumentException | InvocationTargetException unused) {
            }
            editor.commit();
        }
    }

    public static void b(Context context, String str, Object obj) {
        a(context, str, obj, false);
    }

    /* JADX WARN: Code duplicated, block: B:18:0x0052  */
    public static Object a(Context context, String str, Object obj) {
        Object objValueOf;
        SharedPreferences sharedPreferences = context.getSharedPreferences("omronlib_share_data", 0);
        if (obj instanceof String) {
            objValueOf = sharedPreferences.getString(str, (String) obj);
        } else if (obj instanceof Integer) {
            objValueOf = Integer.valueOf(sharedPreferences.getInt(str, ((Integer) obj).intValue()));
        } else {
            boolean z = obj instanceof Long;
            if (z) {
                objValueOf = Long.valueOf(sharedPreferences.getLong(str, ((Long) obj).longValue()));
            } else if (obj instanceof Boolean) {
                objValueOf = Boolean.valueOf(sharedPreferences.getBoolean(str, ((Boolean) obj).booleanValue()));
            } else if (obj instanceof Float) {
                objValueOf = Float.valueOf(sharedPreferences.getFloat(str, ((Float) obj).floatValue()));
            } else if (z) {
                objValueOf = Long.valueOf(sharedPreferences.getLong(str, ((Long) obj).longValue()));
            } else {
                objValueOf = null;
            }
        }
        Log.d("SharePreferenceUtil", "get: object  " + objValueOf);
        return objValueOf;
    }

    /* JADX WARN: Code duplicated, block: B:19:0x0068  */
    public static void a(Context context, String str, Object obj, boolean z) {
        String string;
        SharedPreferences.Editor editorEdit = context.getSharedPreferences("omronlib_share_data", 0).edit();
        Log.i("SharePreferenceUtil", "key:" + str + " : " + obj.toString());
        if (!(obj instanceof String)) {
            if (obj instanceof Integer) {
                editorEdit.putInt(str, ((Integer) obj).intValue());
            } else {
                boolean z2 = obj instanceof Long;
                if (z2) {
                    editorEdit.putLong(str, ((Long) obj).longValue());
                } else if (obj instanceof Boolean) {
                    editorEdit.putBoolean(str, ((Boolean) obj).booleanValue());
                } else if (obj instanceof Float) {
                    editorEdit.putFloat(str, ((Float) obj).floatValue());
                } else if (z2) {
                    editorEdit.putLong(str, ((Long) obj).longValue());
                } else {
                    string = obj.toString();
                }
            }
            a(z, editorEdit);
        }
        string = (String) obj;
        editorEdit.putString(str, string);
        a(z, editorEdit);
    }

    private static void a(boolean z, SharedPreferences.Editor editor) {
        if (z) {
            a.b(editor);
        } else {
            a.a(editor);
        }
    }
}
