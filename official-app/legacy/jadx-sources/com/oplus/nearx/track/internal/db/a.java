package com.oplus.nearx.track.internal.db;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import com.oplus.aiunit.vision.i7k;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes8.dex */
public class a {
    public static final Object a = new Object();

    /* JADX INFO: renamed from: com.oplus.nearx.track.internal.db.a$a, reason: collision with other inner class name */
    public class C0970a implements Iterator<List<ExceptionEntity>> {
        public final List<ExceptionEntity> i = new ArrayList();

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public boolean f19942j = true;
        public long k = 0;

        public C0970a() {
        }

        @Override // java.util.Iterator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public List<ExceptionEntity> next() {
            SQLiteDatabase sQLiteDatabaseI;
            a aVar;
            this.i.clear();
            synchronized (a.a) {
                Cursor cursorQuery = null;
                try {
                    try {
                        sQLiteDatabaseI = i7k.i();
                        try {
                            sQLiteDatabaseI.beginTransaction();
                            cursorQuery = sQLiteDatabaseI.query("table_exception_cache", null, "_id >=?", new String[]{String.valueOf(this.k)}, null, null, "_id asc", String.valueOf(20));
                            if (cursorQuery != null && cursorQuery.moveToFirst()) {
                                do {
                                    this.i.add(ExceptionEntity.convertCursor(cursorQuery));
                                } while (cursorQuery.moveToNext());
                            }
                            sQLiteDatabaseI.setTransactionSuccessful();
                            a.this.d(cursorQuery);
                            aVar = a.this;
                        } catch (Exception unused) {
                            a.this.d(cursorQuery);
                            aVar = a.this;
                        } catch (Throwable th) {
                            th = th;
                            a.this.d(cursorQuery);
                            a.this.f(sQLiteDatabaseI);
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
                aVar.f(sQLiteDatabaseI);
            }
            int size = this.i.size();
            if (size > 0) {
                this.k = this.i.get(size - 1)._id + 1;
            }
            this.f19942j = size >= 20;
            return this.i;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f19942j;
        }

        @Override // java.util.Iterator
        public void remove() {
            a aVar;
            synchronized (a.a) {
                SQLiteDatabase sQLiteDatabaseI = null;
                try {
                    try {
                        sQLiteDatabaseI = i7k.i();
                        sQLiteDatabaseI.beginTransaction();
                        Iterator<ExceptionEntity> it = this.i.iterator();
                        while (it.hasNext()) {
                            sQLiteDatabaseI.delete("table_exception_cache", "_id =?", new String[]{String.valueOf(it.next()._id)});
                        }
                        sQLiteDatabaseI.setTransactionSuccessful();
                        aVar = a.this;
                    } catch (Throwable th) {
                        a.this.f(sQLiteDatabaseI);
                        throw th;
                    }
                } catch (Exception unused) {
                    aVar = a.this;
                }
                aVar.f(sQLiteDatabaseI);
            }
        }
    }

    public static class b {
        public static final a a = new a();
    }

    public static a g() {
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
        contentValues.put("module_id", Long.valueOf(exceptionEntity.moduleId));
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
                    sQLiteDatabaseI = i7k.i();
                    try {
                        sQLiteDatabaseI.beginTransaction();
                        ContentValues contentValues = new ContentValues();
                        Iterator<ExceptionEntity> it = list.iterator();
                        Cursor cursorQuery = null;
                        while (it.hasNext()) {
                            try {
                                ExceptionEntity next = it.next();
                                String[] strArr = {String.valueOf(next.moduleId), next.md5};
                                Iterator<ExceptionEntity> it2 = it;
                                cursorQuery = sQLiteDatabaseI.query("table_exception_cache", null, "module_id =? AND md5 =? ", strArr, null, null, null);
                                if (cursorQuery == null || !cursorQuery.moveToFirst()) {
                                    e(contentValues, next, null);
                                    sQLiteDatabaseI.insert("table_exception_cache", null, contentValues);
                                } else {
                                    e(contentValues, next, ExceptionEntity.convertCursor(cursorQuery));
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

    public C0970a i() {
        return new C0970a();
    }
}
