package com.oplus.aiunit.vision;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.text.TextUtils;
import java.lang.annotation.Annotation;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes12.dex */
public final class t2n {
    public static Map<Class<? extends s2n>, s2n> d = new HashMap();
    public w2n a;
    public SQLiteDatabase b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public s2n f16871c;

    public t2n(Context context, s2n s2nVar) {
        try {
            this.a = new w2n(context.getApplicationContext(), s2nVar.b(), s2nVar.c(), s2nVar);
        } catch (Throwable th) {
            th.printStackTrace();
        }
        this.f16871c = s2nVar;
    }

    public static ContentValues a(Object obj, u2n u2nVar) {
        ContentValues contentValues = new ContentValues();
        for (Field field : m(obj.getClass(), u2nVar.b())) {
            field.setAccessible(true);
            i(obj, field, contentValues);
        }
        return contentValues;
    }

    public static synchronized s2n c(Class<? extends s2n> cls) throws IllegalAccessException, InstantiationException {
        if (d.get(cls) == null) {
            d.put(cls, cls.newInstance());
        }
        return d.get(cls);
    }

    public static <T> T d(Cursor cursor, Class<T> cls, u2n u2nVar) throws IllegalAccessException, NoSuchMethodException, InstantiationException, InvocationTargetException {
        Field[] fieldArrM = m(cls, u2nVar.b());
        Constructor<T> declaredConstructor = cls.getDeclaredConstructor(new Class[0]);
        declaredConstructor.setAccessible(true);
        T tNewInstance = declaredConstructor.newInstance(new Object[0]);
        for (Field field : fieldArrM) {
            field.setAccessible(true);
            Annotation annotation = field.getAnnotation(v2n.class);
            if (annotation != null) {
                v2n v2nVar = (v2n) annotation;
                int iB = v2nVar.b();
                int columnIndex = cursor.getColumnIndex(v2nVar.a());
                switch (iB) {
                    case 1:
                        field.set(tNewInstance, Short.valueOf(cursor.getShort(columnIndex)));
                        break;
                    case 2:
                        field.set(tNewInstance, Integer.valueOf(cursor.getInt(columnIndex)));
                        break;
                    case 3:
                        field.set(tNewInstance, Float.valueOf(cursor.getFloat(columnIndex)));
                        break;
                    case 4:
                        field.set(tNewInstance, Double.valueOf(cursor.getDouble(columnIndex)));
                        break;
                    case 5:
                        field.set(tNewInstance, Long.valueOf(cursor.getLong(columnIndex)));
                        break;
                    case 6:
                        field.set(tNewInstance, cursor.getString(columnIndex));
                        break;
                    case 7:
                        field.set(tNewInstance, cursor.getBlob(columnIndex));
                        break;
                }
            }
        }
        return tNewInstance;
    }

    public static <T> String e(u2n u2nVar) {
        if (u2nVar == null) {
            return null;
        }
        return u2nVar.a();
    }

    public static <T> void f(SQLiteDatabase sQLiteDatabase, T t) {
        u2n u2nVarO = o(t.getClass());
        String strE = e(u2nVarO);
        if (TextUtils.isEmpty(strE) || sQLiteDatabase == null) {
            return;
        }
        sQLiteDatabase.insert(strE, null, a(t, u2nVarO));
    }

    public static void i(Object obj, Field field, ContentValues contentValues) {
        Annotation annotation = field.getAnnotation(v2n.class);
        if (annotation == null) {
        }
        v2n v2nVar = (v2n) annotation;
        try {
            switch (v2nVar.b()) {
                case 1:
                    contentValues.put(v2nVar.a(), Short.valueOf(field.getShort(obj)));
                    break;
                case 2:
                    contentValues.put(v2nVar.a(), Integer.valueOf(field.getInt(obj)));
                    break;
                case 3:
                    contentValues.put(v2nVar.a(), Float.valueOf(field.getFloat(obj)));
                    break;
                case 4:
                    contentValues.put(v2nVar.a(), Double.valueOf(field.getDouble(obj)));
                    break;
                case 5:
                    contentValues.put(v2nVar.a(), Long.valueOf(field.getLong(obj)));
                    break;
                case 6:
                    contentValues.put(v2nVar.a(), (String) field.get(obj));
                    break;
                case 7:
                    contentValues.put(v2nVar.a(), (byte[]) field.get(obj));
                    break;
            }
        } catch (IllegalAccessException e2) {
            e2.printStackTrace();
        }
    }

    public static Field[] m(Class<?> cls, boolean z) {
        if (cls == null) {
            return null;
        }
        return z ? cls.getSuperclass().getDeclaredFields() : cls.getDeclaredFields();
    }

    public static <T> u2n o(Class<T> cls) {
        Annotation annotation = cls.getAnnotation(u2n.class);
        if (annotation != null) {
            return (u2n) annotation;
        }
        return null;
    }

    public final SQLiteDatabase b() {
        try {
            if (this.b == null) {
                this.b = this.a.getReadableDatabase();
            }
        } catch (Throwable th) {
            a2n.e(th, "dbs", "grd");
        }
        return this.b;
    }

    public final <T> void g(T t) {
        q(t);
    }

    public final void h(Object obj, String str) {
        synchronized (this.f16871c) {
            List listP = p(str, obj.getClass());
            if (listP == null || listP.size() == 0) {
                g(obj);
            } else {
                r(str, obj);
            }
        }
    }

    public final <T> void j(String str, Class<T> cls) {
        synchronized (this.f16871c) {
            String strE = e(o(cls));
            if (TextUtils.isEmpty(strE)) {
                return;
            }
            SQLiteDatabase sQLiteDatabaseN = n();
            this.b = sQLiteDatabaseN;
            if (sQLiteDatabaseN == null) {
                return;
            }
            try {
                sQLiteDatabaseN.delete(strE, str, null);
                SQLiteDatabase sQLiteDatabase = this.b;
                if (sQLiteDatabase != null) {
                    sQLiteDatabase.close();
                    this.b = null;
                }
            } catch (Throwable th) {
                try {
                    a2n.e(th, "dbs", "dld");
                    SQLiteDatabase sQLiteDatabase2 = this.b;
                    if (sQLiteDatabase2 != null) {
                        sQLiteDatabase2.close();
                    }
                } catch (Throwable th2) {
                    SQLiteDatabase sQLiteDatabase3 = this.b;
                    if (sQLiteDatabase3 != null) {
                        sQLiteDatabase3.close();
                        this.b = null;
                    }
                    throw th2;
                }
            }
        }
    }

    public final <T> void k(String str, Object obj) {
        synchronized (this.f16871c) {
            if (obj == null) {
                return;
            }
            u2n u2nVarO = o(obj.getClass());
            String strE = e(u2nVarO);
            if (TextUtils.isEmpty(strE)) {
                return;
            }
            ContentValues contentValuesA = a(obj, u2nVarO);
            SQLiteDatabase sQLiteDatabaseN = n();
            this.b = sQLiteDatabaseN;
            if (sQLiteDatabaseN == null) {
                return;
            }
            try {
                sQLiteDatabaseN.update(strE, contentValuesA, str, null);
                SQLiteDatabase sQLiteDatabase = this.b;
                if (sQLiteDatabase != null) {
                    sQLiteDatabase.close();
                    this.b = null;
                }
            } catch (Throwable th) {
                try {
                    a2n.e(th, "dbs", "udd");
                    SQLiteDatabase sQLiteDatabase2 = this.b;
                    if (sQLiteDatabase2 != null) {
                        sQLiteDatabase2.close();
                    }
                } catch (Throwable th2) {
                    SQLiteDatabase sQLiteDatabase3 = this.b;
                    if (sQLiteDatabase3 != null) {
                        sQLiteDatabase3.close();
                        this.b = null;
                    }
                    throw th2;
                }
            }
        }
    }

    public final <T> void l(List<T> list) {
        String str;
        String str2;
        synchronized (this.f16871c) {
            if (list.size() == 0) {
                return;
            }
            SQLiteDatabase sQLiteDatabaseN = n();
            this.b = sQLiteDatabaseN;
            if (sQLiteDatabaseN == null) {
                return;
            }
            try {
                sQLiteDatabaseN.beginTransaction();
                Iterator<T> it = list.iterator();
                while (it.hasNext()) {
                    f(this.b, it.next());
                }
                this.b.setTransactionSuccessful();
                try {
                    if (this.b.inTransaction()) {
                        this.b.endTransaction();
                    }
                } catch (Throwable th) {
                    a2n.e(th, "dbs", "ild");
                }
                try {
                    this.b.close();
                    this.b = null;
                } catch (Throwable th2) {
                    th = th2;
                    str = "dbs";
                    str2 = "ild";
                    a2n.e(th, str, str2);
                }
            } catch (Throwable th3) {
                try {
                    a2n.e(th3, "dbs", "ild");
                    try {
                        if (this.b.inTransaction()) {
                            this.b.endTransaction();
                        }
                    } catch (Throwable th4) {
                        a2n.e(th4, "dbs", "ild");
                    }
                    try {
                        this.b.close();
                        this.b = null;
                    } catch (Throwable th5) {
                        th = th5;
                        str = "dbs";
                        str2 = "ild";
                        a2n.e(th, str, str2);
                    }
                } catch (Throwable th6) {
                    try {
                        if (!this.b.inTransaction()) {
                            this.b.close();
                            this.b = null;
                            throw th6;
                        }
                        this.b.endTransaction();
                        try {
                            this.b.close();
                            this.b = null;
                            throw th6;
                        } catch (Throwable th7) {
                            a2n.e(th7, "dbs", "ild");
                            throw th6;
                        }
                    } catch (Throwable th8) {
                        a2n.e(th8, "dbs", "ild");
                    }
                }
            }
        }
    }

    public final SQLiteDatabase n() {
        try {
            SQLiteDatabase sQLiteDatabase = this.b;
            if (sQLiteDatabase == null || sQLiteDatabase.isReadOnly()) {
                SQLiteDatabase sQLiteDatabase2 = this.b;
                if (sQLiteDatabase2 != null) {
                    sQLiteDatabase2.close();
                }
                this.b = this.a.getWritableDatabase();
            }
        } catch (Throwable th) {
            a2n.e(th, "dbs", "gwd");
        }
        return this.b;
    }

    public final <T> List<T> p(String str, Class<T> cls) {
        return s(str, cls);
    }

    public final <T> void q(T t) {
        synchronized (this.f16871c) {
            SQLiteDatabase sQLiteDatabaseN = n();
            this.b = sQLiteDatabaseN;
            if (sQLiteDatabaseN == null) {
                return;
            }
            try {
                f(sQLiteDatabaseN, t);
                SQLiteDatabase sQLiteDatabase = this.b;
                if (sQLiteDatabase != null) {
                    sQLiteDatabase.close();
                    this.b = null;
                }
            } catch (Throwable th) {
                try {
                    a2n.e(th, "dbs", "itd");
                    SQLiteDatabase sQLiteDatabase2 = this.b;
                    if (sQLiteDatabase2 != null) {
                        sQLiteDatabase2.close();
                    }
                } catch (Throwable th2) {
                    SQLiteDatabase sQLiteDatabase3 = this.b;
                    if (sQLiteDatabase3 != null) {
                        sQLiteDatabase3.close();
                        this.b = null;
                    }
                    throw th2;
                }
            }
        }
    }

    public final <T> void r(String str, Object obj) {
        k(str, obj);
    }

    /* JADX WARN: Code duplicated, block: B:104:? A[Catch: all -> 0x00dc, SYNTHETIC, TryCatch #7 {, blocks: (B:4:0x0003, B:6:0x0014, B:7:0x001a, B:9:0x001e, B:28:0x005e, B:27:0x0057, B:21:0x0045, B:62:0x00b6, B:44:0x0089, B:37:0x0073, B:55:0x009f, B:76:0x00d9, B:75:0x00d2, B:69:0x00c0, B:77:0x00da, B:70:0x00c7, B:72:0x00cb, B:34:0x006e, B:18:0x0040, B:22:0x004c, B:24:0x0050, B:50:0x0091, B:52:0x009a, B:66:0x00bb), top: B:96:0x0003, inners: #1, #2, #4, #5, #6, #9, #10 }] */
    /* JADX WARN: Code duplicated, block: B:24:0x0050 A[Catch: all -> 0x0056, TRY_LEAVE, TryCatch #5 {all -> 0x0056, blocks: (B:22:0x004c, B:24:0x0050), top: B:92:0x004c, outer: #7 }] */
    /* JADX WARN: Code duplicated, block: B:72:0x00cb A[Catch: all -> 0x00d1, TRY_LEAVE, TryCatch #1 {all -> 0x00d1, blocks: (B:70:0x00c7, B:72:0x00cb), top: B:84:0x00c7, outer: #7 }] */
    public final <T> List<T> s(String str, Class<T> cls) {
        Cursor cursorQuery;
        SQLiteDatabase sQLiteDatabase;
        String str2;
        String str3;
        SQLiteDatabase sQLiteDatabase2;
        synchronized (this.f16871c) {
            ArrayList arrayList = new ArrayList();
            u2n u2nVarO = o(cls);
            String strE = e(u2nVarO);
            if (this.b == null) {
                this.b = b();
            }
            if (this.b == null || TextUtils.isEmpty(strE) || str == null) {
                return arrayList;
            }
            try {
                cursorQuery = this.b.query(strE, null, str, null, null, null, null);
                try {
                    if (cursorQuery != null) {
                        while (cursorQuery.moveToNext()) {
                            arrayList.add(d(cursorQuery, cls, u2nVarO));
                        }
                        try {
                            cursorQuery.close();
                        } catch (Throwable th) {
                            a2n.e(th, "dbs", "sld");
                        }
                        try {
                            SQLiteDatabase sQLiteDatabase3 = this.b;
                            if (sQLiteDatabase3 != null) {
                                sQLiteDatabase3.close();
                                this.b = null;
                            }
                        } catch (Throwable th2) {
                            th = th2;
                            str2 = "dbs";
                            str3 = "sld";
                            a2n.e(th, str2, str3);
                        }
                        return arrayList;
                    }
                    this.b.close();
                    this.b = null;
                    if (cursorQuery == null) {
                        sQLiteDatabase2 = this.b;
                        if (sQLiteDatabase2 != null) {
                            sQLiteDatabase2.close();
                            this.b = null;
                        }
                        return arrayList;
                    }
                    try {
                        cursorQuery.close();
                    } catch (Throwable th3) {
                        a2n.e(th3, "dbs", "sld");
                    }
                    try {
                        sQLiteDatabase2 = this.b;
                        if (sQLiteDatabase2 != null) {
                            sQLiteDatabase2.close();
                            this.b = null;
                        }
                    } catch (Throwable th4) {
                        a2n.e(th4, "dbs", "sld");
                    }
                    return arrayList;
                } catch (Throwable th5) {
                    th = th5;
                    try {
                        a2n.e(th, "dbs", "sld");
                        if (cursorQuery != null) {
                            try {
                                cursorQuery.close();
                            } catch (Throwable th6) {
                                a2n.e(th6, "dbs", "sld");
                            }
                        }
                        try {
                            SQLiteDatabase sQLiteDatabase4 = this.b;
                            if (sQLiteDatabase4 != null) {
                                sQLiteDatabase4.close();
                                this.b = null;
                            }
                        } catch (Throwable th7) {
                            th = th7;
                            str2 = "dbs";
                            str3 = "sld";
                            a2n.e(th, str2, str3);
                        }
                    } catch (Throwable th8) {
                        if (cursorQuery == null) {
                            sQLiteDatabase = this.b;
                            if (sQLiteDatabase != null) {
                                throw th8;
                            }
                            sQLiteDatabase.close();
                            this.b = null;
                            throw th8;
                        }
                        try {
                            cursorQuery.close();
                        } catch (Throwable th9) {
                            a2n.e(th9, "dbs", "sld");
                        }
                        try {
                            sQLiteDatabase = this.b;
                            if (sQLiteDatabase != null) {
                                throw th8;
                            }
                            sQLiteDatabase.close();
                            this.b = null;
                            throw th8;
                        } catch (Throwable th10) {
                            a2n.e(th10, "dbs", "sld");
                            throw th8;
                        }
                    }
                }
            } catch (Throwable th11) {
                th = th11;
                cursorQuery = null;
            }
            throw th;
        }
    }
}
