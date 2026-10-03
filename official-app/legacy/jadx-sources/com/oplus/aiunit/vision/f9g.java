package com.oplus.aiunit.vision;

import android.content.ContentProvider;
import android.content.ContentValues;
import android.database.Cursor;
import android.database.MatrixCursor;
import android.text.TextUtils;
import com.google.gson.Gson;
import com.heytap.health.base.encrypt.AesGcmAndroidKeyStore;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Objects;

/* JADX INFO: loaded from: classes16.dex */
public abstract class f9g<T> extends f74 {
    public final String b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Gson f11272c;
    public AesGcmAndroidKeyStore d;

    public f9g(ContentProvider contentProvider) {
        super(contentProvider);
        this.b = "SPContentAdapter";
        this.f11272c = new Gson();
        this.d = AesGcmAndroidKeyStore.g();
    }

    public Cursor j(String[] strArr, T t) {
        Field field;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        int i = 0;
        if (strArr == null) {
            Field[] fields = t.getClass().getFields();
            while (i < fields.length) {
                arrayList2.add(fields[i].getName());
                arrayList.add(l(fields[i], t));
                i++;
            }
        } else {
            while (i < strArr.length) {
                String str = strArr[i];
                arrayList2.add(str);
                try {
                    field = t.getClass().getField(str);
                } catch (NoSuchFieldException e2) {
                    a7b.b("SPContentAdapter", "buildCursor Exception : " + e2.getMessage());
                    field = null;
                }
                arrayList.add(l(field, t));
                i++;
            }
        }
        if (arrayList.size() == 0) {
            return null;
        }
        MatrixCursor matrixCursor = new MatrixCursor((String[]) arrayList2.toArray(new String[arrayList2.size()]), 1);
        matrixCursor.addRow(arrayList);
        return matrixCursor;
    }

    public T k(String str, String str2, Class<T> cls) {
        String strD = v9g.x(str).D(str2);
        if (TextUtils.isEmpty(strD)) {
            return null;
        }
        try {
            T t = (T) this.f11272c.fromJson(strD, (Class) cls);
            StringBuilder sb = new StringBuilder();
            sb.append("deSerialize---jsonT: ");
            sb.append(strD);
            return t;
        } catch (Exception e2) {
            a7b.b("SPContentAdapter", "deSerialize---e: " + e2.getMessage());
            return null;
        }
    }

    public Object l(Field field, Object obj) {
        if (field != null && obj != null) {
            Class<?> type = field.getType();
            try {
                if (type == Long.TYPE) {
                    return Long.valueOf(field.getLong(obj));
                }
                if (type == Integer.TYPE) {
                    return Integer.valueOf(field.getInt(obj));
                }
                if (type == Double.TYPE) {
                    return Double.valueOf(field.getDouble(obj));
                }
                if (type == Boolean.TYPE) {
                    return Boolean.valueOf(field.getBoolean(obj));
                }
                if (type == String.class) {
                    return field.get(obj);
                }
                return null;
            } catch (IllegalAccessException e2) {
                a7b.b("SPContentAdapter", "getFieldValue Exception : " + e2.getMessage());
            }
        }
        return null;
    }

    public void m(T t, String str, String str2) {
        String json = this.f11272c.toJson(t);
        StringBuilder sb = new StringBuilder();
        sb.append("serialize---jsonT: ");
        sb.append(json);
        if (TextUtils.isEmpty(json)) {
            return;
        }
        v9g.x(str).U(str2, json);
    }

    public void n(T t, ContentValues contentValues) {
        Iterator<String> it = contentValues.keySet().iterator();
        while (it.hasNext()) {
            try {
                Field field = t.getClass().getField(it.next());
                Class<?> type = field.getType();
                String name = field.getName();
                if (type == Long.TYPE) {
                    Long asLong = contentValues.getAsLong(name);
                    if (asLong != null) {
                        field.setLong(t, asLong.longValue());
                    }
                } else if (type == Integer.TYPE) {
                    Integer asInteger = contentValues.getAsInteger(name);
                    if (asInteger != null) {
                        field.setInt(t, asInteger.intValue());
                    }
                } else if (type == Double.TYPE) {
                    Double asDouble = contentValues.getAsDouble(name);
                    if (asDouble != null) {
                        field.setDouble(t, asDouble.doubleValue());
                    }
                } else if (type == Boolean.TYPE) {
                    Boolean asBoolean = contentValues.getAsBoolean(name);
                    if (asBoolean != null) {
                        field.setBoolean(t, asBoolean.booleanValue());
                    }
                } else if (type == String.class) {
                    field.set(t, Objects.toString(contentValues.getAsString(name), ""));
                }
            } catch (Exception e2) {
                a7b.b("SPContentAdapter", "setContentValues Exception : " + e2.getMessage());
            }
        }
    }
}
