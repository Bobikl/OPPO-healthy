package com.oplus.aiunit.vision;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes17.dex */
public class ut6 {
    public static final Object a = new Object();

    public class a implements Iterator<List<ExceptionEntity>> {
        public final List<ExceptionEntity> i = new ArrayList();

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public boolean f17595j = true;
        public long k = 0;

        public a() {
        }

        @Override // java.util.Iterator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public List<ExceptionEntity> next() {
            SQLiteDatabase sQLiteDatabaseI;
            ut6 ut6Var;
            this.i.clear();
            synchronized (ut6.a) {
                Cursor cursorQuery = null;
                try {
                    try {
                        sQLiteDatabaseI = j7k.i();
                        try {
                            sQLiteDatabaseI.beginTransaction();
                            cursorQuery = sQLiteDatabaseI.query("table_exception_cache", null, "_id >=?", new String[]{String.valueOf(this.k)}, null, null, "_id asc", String.valueOf(20));
                            if (cursorQuery != null && cursorQuery.moveToFirst()) {
                                do {
                                    this.i.add(ExceptionEntity.a(cursorQuery));
                                } while (cursorQuery.moveToNext());
                            }
                            sQLiteDatabaseI.setTransactionSuccessful();
                            ut6.this.d(cursorQuery);
                            ut6Var = ut6.this;
                        } catch (Exception unused) {
                            ut6.this.d(cursorQuery);
                            ut6Var = ut6.this;
                        } catch (Throwable th) {
                            th = th;
                            ut6.this.d(cursorQuery);
                            ut6.this.f(sQLiteDatabaseI);
                            throw th;
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                } catch (Exception unused2) {
                    sQLiteDatabaseI = null;
                } catch (Throwable th3) {
                    th = th3;
                    sQLiteDatabaseI = null;
                }
                ut6Var.f(sQLiteDatabaseI);
            }
            int size = this.i.size();
            if (size > 0) {
                this.k = this.i.get(size - 1).a + 1;
            }
            this.f17595j = size >= 20;
            return this.i;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f17595j;
        }

        @Override // java.util.Iterator
        public void remove() {
            ut6 ut6Var;
            synchronized (ut6.a) {
                SQLiteDatabase sQLiteDatabaseI = null;
                try {
                    try {
                        sQLiteDatabaseI = j7k.i();
                        sQLiteDatabaseI.beginTransaction();
                        Iterator<ExceptionEntity> it = this.i.iterator();
                        while (it.hasNext()) {
                            sQLiteDatabaseI.delete("table_exception_cache", "_id =?", new String[]{String.valueOf(it.next().a)});
                        }
                        sQLiteDatabaseI.setTransactionSuccessful();
                        ut6Var = ut6.this;
                    } catch (Throwable th) {
                        ut6.this.f(sQLiteDatabaseI);
                        throw th;
                    }
                } catch (Exception unused) {
                    ut6Var = ut6.this;
                }
                ut6Var.f(sQLiteDatabaseI);
            }
        }
    }

    public static class b {
        public static final ut6 a = new ut6();
    }

    public static ut6 g() {
        return b.a;
    }

    public final void d(Cursor cursor) {
        if (cursor != null) {
            try {
                if (cursor.isClosed()) {
                    return;
                }
                cursor.close();
            } catch (Throwable unused) {
            }
        }
    }

    public final void e(ContentValues contentValues, ExceptionEntity exceptionEntity, ExceptionEntity exceptionEntity2) {
        contentValues.clear();
        contentValues.put("module_id", Long.valueOf(exceptionEntity.b));
        contentValues.put("event_time", Long.valueOf(exceptionEntity.eventTime));
        contentValues.put("exception", exceptionEntity.exception);
        contentValues.put("count", Long.valueOf(exceptionEntity.count + (exceptionEntity2 == null ? 0L : exceptionEntity2.count)));
        contentValues.put("module_version", exceptionEntity.moduleVersion);
        contentValues.put("md5", exceptionEntity.md5);
        contentValues.put("kv_properties", exceptionEntity.kvProperties);
    }

    public final void f(SQLiteDatabase sQLiteDatabase) {
        if (sQLiteDatabase != null) {
            try {
                sQLiteDatabase.endTransaction();
            } catch (Throwable unused) {
            }
        }
    }

    public void h(List<ExceptionEntity> list) {
        Cursor cursor;
        SQLiteDatabase sQLiteDatabaseI;
        Cursor cursor2;
        if (list == null || list.isEmpty()) {
            return;
        }
        synchronized (a) {
            try {
                try {
                    sQLiteDatabaseI = j7k.i();
                    try {
                        sQLiteDatabaseI.beginTransaction();
                        ContentValues contentValues = new ContentValues();
                        Iterator<ExceptionEntity> it = list.iterator();
                        Cursor cursorQuery = null;
                        while (it.hasNext()) {
                            try {
                                ExceptionEntity next = it.next();
                                String[] strArr = {String.valueOf(next.b), next.md5};
                                Iterator<ExceptionEntity> it2 = it;
                                cursorQuery = sQLiteDatabaseI.query("table_exception_cache", null, "module_id =? AND md5 =? ", strArr, null, null, null);
                                if (cursorQuery == null || !cursorQuery.moveToFirst()) {
                                    e(contentValues, next, null);
                                    sQLiteDatabaseI.insert("table_exception_cache", null, contentValues);
                                } else {
                                    e(contentValues, next, ExceptionEntity.a(cursorQuery));
                                    sQLiteDatabaseI.update("table_exception_cache", contentValues, "module_id =? AND md5 =? ", strArr);
                                }
                                d(cursorQuery);
                                it = it2;
                            } catch (Exception unused) {
                                cursor2 = cursorQuery;
                                d(cursor2);
                            } catch (Throwable th) {
                                th = th;
                                cursor = cursorQuery;
                                d(cursor);
                                f(sQLiteDatabaseI);
                                throw th;
                            }
                        }
                        sQLiteDatabaseI.setTransactionSuccessful();
                        d(cursorQuery);
                    } catch (Exception unused2) {
                        cursor2 = null;
                    } catch (Throwable th2) {
                        th = th2;
                        cursor = null;
                    }
                } catch (Throwable th3) {
                    throw th3;
                }
            } catch (Exception unused3) {
                cursor2 = null;
                sQLiteDatabaseI = null;
            } catch (Throwable th4) {
                th = th4;
                cursor = null;
                sQLiteDatabaseI = null;
            }
            f(sQLiteDatabaseI);
        }
    }

    public a i() {
        return new a();
    }
}
