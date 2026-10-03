package com.oplus.aiunit.vision;

import android.content.Context;
import android.content.SharedPreferences;
import com.oplus.accountsdk.base.common.util.AcLogUtil;
import java.util.HashMap;

/* JADX INFO: loaded from: classes6.dex */
public abstract class tj {
    public HashMap<String, a> a = new HashMap<>();

    public class a {
        public SharedPreferences a;
        public String b;

        public a(SharedPreferences sharedPreferences, String str) {
            this.a = sharedPreferences;
            this.b = str;
        }

        public boolean a(Context context) {
            try {
                SharedPreferences.Editor editorEdit = this.a.edit();
                editorEdit.clear();
                return editorEdit.commit();
            } catch (Throwable th) {
                AcLogUtil.e("AcSpHelper", "clear error: " + th);
                if (context != null) {
                    return context.getSharedPreferences(this.b, 0).edit().clear().commit();
                }
                return false;
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public <T> T b(String str, T t) {
            try {
                if (t instanceof String) {
                    return (T) this.a.getString(str, (String) t);
                }
                if (t instanceof Integer) {
                    return (T) Integer.valueOf(this.a.getInt(str, ((Integer) t).intValue()));
                }
                if (t instanceof Boolean) {
                    return (T) Boolean.valueOf(this.a.getBoolean(str, ((Boolean) t).booleanValue()));
                }
                if (t instanceof Float) {
                    return (T) Float.valueOf(this.a.getFloat(str, ((Float) t).floatValue()));
                }
                return t instanceof Long ? (T) Long.valueOf(this.a.getLong(str, ((Long) t).longValue())) : t;
            } catch (Throwable th) {
                AcLogUtil.e("AcSpHelper", "get error: " + th);
                return t;
            }
        }

        public boolean c(String str, Object obj) {
            SharedPreferences.Editor editorEdit = this.a.edit();
            try {
                if (obj instanceof String) {
                    editorEdit.putString(str, (String) obj);
                } else if (obj instanceof Integer) {
                    editorEdit.putInt(str, ((Integer) obj).intValue());
                } else if (obj instanceof Boolean) {
                    editorEdit.putBoolean(str, ((Boolean) obj).booleanValue());
                } else if (obj instanceof Float) {
                    editorEdit.putFloat(str, ((Float) obj).floatValue());
                } else if (obj instanceof Long) {
                    editorEdit.putLong(str, ((Long) obj).longValue());
                } else {
                    editorEdit.putString(str, obj.toString());
                }
                return editorEdit.commit();
            } catch (Exception e2) {
                AcLogUtil.e("AcSpHelper", "put error ", e2);
                return false;
            }
        }

        public boolean d(String str) {
            try {
                SharedPreferences.Editor editorEdit = this.a.edit();
                editorEdit.remove(str);
                return editorEdit.commit();
            } catch (Throwable th) {
                AcLogUtil.e("AcSpHelper", "remove error: " + th);
                return false;
            }
        }
    }

    public a a(Context context) {
        return d("sdkCommonSp" + c(), context);
    }

    public a b(Context context) {
        return d("spLogged" + c(), context);
    }

    public abstract String c();

    public a d(String str, Context context) {
        a aVar = this.a.get(str);
        if (aVar != null) {
            return aVar;
        }
        a aVar2 = new a(context.getSharedPreferences(str, 0), str);
        this.a.put(str, aVar2);
        return aVar2;
    }
}
