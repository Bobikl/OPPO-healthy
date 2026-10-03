package com.oplus.aiunit.vision;

import android.database.CrossProcessCursor;
import android.database.Cursor;
import android.database.CursorWindow;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteStatement;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import org.greenrobot.greendao.DaoException;
import rx.schedulers.Schedulers;

/* JADX INFO: loaded from: classes11.dex */
public abstract class a6<T, K> {
    protected final cs4 config;
    protected final wz4 db;
    protected final l2a<K, T> identityScope;
    protected final m2a<T> identityScopeLong;
    protected final boolean isStandardSQLite;
    protected final int pkOrdinal;
    private volatile o3g<T, K> rxDao;
    private volatile o3g<T, K> rxDaoPlain;
    protected final c6 session;
    protected final anj statements;

    public a6(cs4 cs4Var) {
        this(cs4Var, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void deleteByKeyInsideSynchronized(K k, d05 d05Var) {
        if (k instanceof Long) {
            d05Var.bindLong(1, ((Long) k).longValue());
        } else {
            if (k == 0) {
                throw new DaoException("Cannot delete entity, key is null");
            }
            d05Var.bindString(1, k.toString());
        }
        d05Var.execute();
    }

    /* JADX WARN: Code duplicated, block: B:19:0x003e A[Catch: all -> 0x003a, TryCatch #1 {all -> 0x003a, blocks: (B:10:0x001f, B:11:0x0023, B:13:0x0029, B:15:0x0036, B:19:0x003e, B:20:0x0042, B:22:0x0048, B:24:0x0051), top: B:48:0x001f, outer: #0 }] */
    /* JADX WARN: Code duplicated, block: B:22:0x0048 A[Catch: all -> 0x003a, TryCatch #1 {all -> 0x003a, blocks: (B:10:0x001f, B:11:0x0023, B:13:0x0029, B:15:0x0036, B:19:0x003e, B:20:0x0042, B:22:0x0048, B:24:0x0051), top: B:48:0x001f, outer: #0 }] */
    /* JADX WARN: Code duplicated, block: B:32:0x0061 A[Catch: all -> 0x0079, TryCatch #0 {, blocks: (B:4:0x000f, B:6:0x0013, B:30:0x005d, B:32:0x0061, B:33:0x0064, B:26:0x0055, B:28:0x0059, B:29:0x005c, B:10:0x001f, B:11:0x0023, B:13:0x0029, B:15:0x0036, B:19:0x003e, B:20:0x0042, B:22:0x0048, B:24:0x0051), top: B:47:0x000f, outer: #2, inners: #1 }] */
    /* JADX WARN: Code duplicated, block: B:52:0x0051 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:54:0x0042 A[SYNTHETIC] */
    private void deleteInTxInternal(Iterable<T> iterable, Iterable<K> iterable2) {
        ArrayList arrayList;
        l2a<K, T> l2aVar;
        l2a<K, T> l2aVar2;
        assertSinglePk();
        d05 d05VarB = this.statements.b();
        this.db.beginTransaction();
        try {
            synchronized (d05VarB) {
                l2a<K, T> l2aVar3 = this.identityScope;
                if (l2aVar3 != null) {
                    l2aVar3.lock();
                    arrayList = new ArrayList();
                } else {
                    arrayList = null;
                }
                if (iterable != null) {
                    try {
                        Iterator<T> it = iterable.iterator();
                        while (it.hasNext()) {
                            K keyVerified = getKeyVerified(it.next());
                            deleteByKeyInsideSynchronized(keyVerified, d05VarB);
                            if (arrayList != null) {
                                arrayList.add(keyVerified);
                            }
                        }
                        if (iterable2 != null) {
                            for (K k : iterable2) {
                                deleteByKeyInsideSynchronized(k, d05VarB);
                                if (arrayList != null) {
                                    arrayList.add(k);
                                }
                            }
                        }
                        l2aVar = this.identityScope;
                        if (l2aVar != null) {
                            l2aVar.unlock();
                        }
                    } catch (Throwable th) {
                        l2a<K, T> l2aVar4 = this.identityScope;
                        if (l2aVar4 != null) {
                            l2aVar4.unlock();
                        }
                        throw th;
                    }
                } else {
                    if (iterable2 != null) {
                        while (r4.hasNext()) {
                            deleteByKeyInsideSynchronized(k, d05VarB);
                            if (arrayList != null) {
                                arrayList.add(k);
                            }
                        }
                    }
                    l2aVar = this.identityScope;
                    if (l2aVar != null) {
                        l2aVar.unlock();
                    }
                }
                throw th;
            }
            this.db.setTransactionSuccessful();
            if (arrayList != null && (l2aVar2 = this.identityScope) != null) {
                l2aVar2.a(arrayList);
            }
            this.db.endTransaction();
        } catch (Throwable th2) {
            this.db.endTransaction();
            throw th2;
        }
    }

    private long executeInsert(T t, d05 d05Var, boolean z) {
        long jInsertInsideTx;
        if (this.db.isDbLockedByCurrentThread()) {
            jInsertInsideTx = insertInsideTx(t, d05Var);
        } else {
            this.db.beginTransaction();
            try {
                jInsertInsideTx = insertInsideTx(t, d05Var);
                this.db.setTransactionSuccessful();
                this.db.endTransaction();
            } catch (Throwable th) {
                this.db.endTransaction();
                throw th;
            }
        }
        if (z) {
            updateKeyAfterInsertAndAttach(t, jInsertInsideTx, true);
        }
        return jInsertInsideTx;
    }

    private void executeInsertInTx(d05 d05Var, Iterable<T> iterable, boolean z) {
        this.db.beginTransaction();
        try {
            synchronized (d05Var) {
                try {
                    l2a<K, T> l2aVar = this.identityScope;
                    if (l2aVar != null) {
                        l2aVar.lock();
                    }
                    try {
                        if (this.isStandardSQLite) {
                            SQLiteStatement sQLiteStatement = (SQLiteStatement) d05Var.a();
                            for (T t : iterable) {
                                bindValues(sQLiteStatement, t);
                                if (z) {
                                    updateKeyAfterInsertAndAttach(t, sQLiteStatement.executeInsert(), false);
                                } else {
                                    sQLiteStatement.execute();
                                }
                            }
                        } else {
                            for (T t2 : iterable) {
                                bindValues(d05Var, t2);
                                if (z) {
                                    updateKeyAfterInsertAndAttach(t2, d05Var.executeInsert(), false);
                                } else {
                                    d05Var.execute();
                                }
                            }
                        }
                        l2a<K, T> l2aVar2 = this.identityScope;
                        if (l2aVar2 != null) {
                            l2aVar2.unlock();
                        }
                    } catch (Throwable th) {
                        l2a<K, T> l2aVar3 = this.identityScope;
                        if (l2aVar3 != null) {
                            l2aVar3.unlock();
                        }
                        throw th;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            this.db.setTransactionSuccessful();
            this.db.endTransaction();
        } catch (Throwable th3) {
            this.db.endTransaction();
            throw th3;
        }
    }

    private long insertInsideTx(T t, d05 d05Var) {
        synchronized (d05Var) {
            if (!this.isStandardSQLite) {
                bindValues(d05Var, t);
                return d05Var.executeInsert();
            }
            SQLiteStatement sQLiteStatement = (SQLiteStatement) d05Var.a();
            bindValues(sQLiteStatement, t);
            return sQLiteStatement.executeInsert();
        }
    }

    private void loadAllUnlockOnWindowBounds(Cursor cursor, CursorWindow cursorWindow, List<T> list) {
        int startPosition = cursorWindow.getStartPosition() + cursorWindow.getNumRows();
        int i = 0;
        while (true) {
            list.add(loadCurrent(cursor, 0, false));
            int i2 = i + 1;
            if (i2 >= startPosition) {
                CursorWindow cursorWindowMoveToNextUnlocked = moveToNextUnlocked(cursor);
                if (cursorWindowMoveToNextUnlocked == null) {
                    return;
                } else {
                    startPosition = cursorWindowMoveToNextUnlocked.getStartPosition() + cursorWindowMoveToNextUnlocked.getNumRows();
                }
            } else if (!cursor.moveToNext()) {
                return;
            }
            i = i2 + 1;
        }
    }

    private CursorWindow moveToNextUnlocked(Cursor cursor) {
        this.identityScope.unlock();
        try {
            if (cursor.moveToNext()) {
                return ((CrossProcessCursor) cursor).getWindow();
            }
            return null;
        } finally {
            this.identityScope.lock();
        }
    }

    public void assertSinglePk() {
        if (this.config.m.length == 1) {
            return;
        }
        throw new DaoException(this + " (" + this.config.f10218j + ") does not have a single-column primary key");
    }

    public void attachEntity(T t) {
    }

    public abstract void bindValues(SQLiteStatement sQLiteStatement, T t);

    public abstract void bindValues(d05 d05Var, T t);

    public long count() {
        return this.statements.a().simpleQueryForLong();
    }

    public void delete(T t) {
        assertSinglePk();
        deleteByKey(getKeyVerified(t));
    }

    public void deleteAll() {
        this.db.execSQL("DELETE FROM '" + this.config.f10218j + "'");
        l2a<K, T> l2aVar = this.identityScope;
        if (l2aVar != null) {
            l2aVar.clear();
        }
    }

    public void deleteByKey(K k) {
        assertSinglePk();
        d05 d05VarB = this.statements.b();
        if (this.db.isDbLockedByCurrentThread()) {
            synchronized (d05VarB) {
                deleteByKeyInsideSynchronized(k, d05VarB);
            }
        } else {
            this.db.beginTransaction();
            try {
                synchronized (d05VarB) {
                    deleteByKeyInsideSynchronized(k, d05VarB);
                }
                this.db.setTransactionSuccessful();
                this.db.endTransaction();
            } catch (Throwable th) {
                this.db.endTransaction();
                throw th;
            }
        }
        l2a<K, T> l2aVar = this.identityScope;
        if (l2aVar != null) {
            l2aVar.remove(k);
        }
    }

    public void deleteByKeyInTx(Iterable<K> iterable) {
        deleteInTxInternal(null, iterable);
    }

    public void deleteInTx(Iterable<T> iterable) {
        deleteInTxInternal(iterable, null);
    }

    public boolean detach(T t) {
        if (this.identityScope == null) {
            return false;
        }
        return this.identityScope.c(getKeyVerified(t), t);
    }

    public void detachAll() {
        l2a<K, T> l2aVar = this.identityScope;
        if (l2aVar != null) {
            l2aVar.clear();
        }
    }

    public String[] getAllColumns() {
        return this.config.f10219l;
    }

    public wz4 getDatabase() {
        return this.db;
    }

    public abstract K getKey(T t);

    public K getKeyVerified(T t) {
        K key = getKey(t);
        if (key != null) {
            return key;
        }
        if (t == null) {
            throw new NullPointerException("Entity may not be null");
        }
        throw new DaoException("Entity has no key");
    }

    public String[] getNonPkColumns() {
        return this.config.f10220n;
    }

    public String[] getPkColumns() {
        return this.config.m;
    }

    public yye getPkProperty() {
        return this.config.o;
    }

    public yye[] getProperties() {
        return this.config.k;
    }

    public c6 getSession() {
        return this.session;
    }

    public anj getStatements() {
        return this.config.q;
    }

    public String getTablename() {
        return this.config.f10218j;
    }

    public abstract boolean hasKey(T t);

    public long insert(T t) {
        return executeInsert(t, this.statements.d(), true);
    }

    public void insertInTx(Iterable<T> iterable) {
        insertInTx(iterable, isEntityUpdateable());
    }

    public long insertOrReplace(T t) {
        return executeInsert(t, this.statements.c(), true);
    }

    public void insertOrReplaceInTx(Iterable<T> iterable, boolean z) {
        executeInsertInTx(this.statements.c(), iterable, z);
    }

    public long insertWithoutSettingPk(T t) {
        return executeInsert(t, this.statements.c(), false);
    }

    public abstract boolean isEntityUpdateable();

    public T load(K k) {
        T t;
        assertSinglePk();
        if (k == null) {
            return null;
        }
        l2a<K, T> l2aVar = this.identityScope;
        return (l2aVar == null || (t = l2aVar.get(k)) == null) ? loadUniqueAndCloseCursor(this.db.b(this.statements.f(), new String[]{k.toString()})) : t;
    }

    public List<T> loadAll() {
        return loadAllAndCloseCursor(this.db.b(this.statements.e(), null));
    }

    public List<T> loadAllAndCloseCursor(Cursor cursor) {
        try {
            return loadAllFromCursor(cursor);
        } finally {
            cursor.close();
        }
    }

    /* JADX WARN: Code duplicated, block: B:18:0x0055  */
    /* JADX WARN: Code duplicated, block: B:20:0x0059  */
    /* JADX WARN: Code duplicated, block: B:30:0x007e A[DONT_GENERATE] */
    /* JADX WARN: Code duplicated, block: B:40:? A[SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v0, types: [com.oplus.aiunit.vision.a6, com.oplus.aiunit.vision.a6<T, K>] */
    /* JADX WARN: Type inference failed for: r6v1, types: [com.oplus.aiunit.vision.a6] */
    /* JADX WARN: Type inference failed for: r6v3, types: [com.oplus.aiunit.vision.l2a, com.oplus.aiunit.vision.l2a<K, T>] */
    public List<T> loadAllFromCursor(Cursor cursor) {
        CursorWindow window;
        boolean z;
        l2a<K, T> l2aVar;
        int count = cursor.getCount();
        if (count == 0) {
            return new ArrayList();
        }
        ArrayList arrayList = new ArrayList(count);
        if (cursor instanceof CrossProcessCursor) {
            window = ((CrossProcessCursor) cursor).getWindow();
            if (window != null) {
                if (window.getNumRows() == count) {
                    cursor = new o77(window);
                    z = true;
                } else {
                    ds4.a("Window vs. result size: " + window.getNumRows() + "/" + count);
                }
            }
            if (cursor.moveToFirst()) {
                l2aVar = this.identityScope;
                if (l2aVar != null) {
                    l2aVar.lock();
                    this.identityScope.b(count);
                }
                if (!z || window == null) {
                    do {
                        arrayList.add(loadCurrent(cursor, 0, false));
                    } while (cursor.moveToNext());
                } else {
                    try {
                        if (this.identityScope != null) {
                            loadAllUnlockOnWindowBounds(cursor, window, arrayList);
                        } else {
                            do {
                                arrayList.add(loadCurrent(cursor, 0, false));
                            } while (cursor.moveToNext());
                        }
                    } finally {
                        l2a<K, T> l2aVar2 = this.identityScope;
                        if (l2aVar2 != null) {
                            l2aVar2.unlock();
                        }
                    }
                }
            }
            return arrayList;
        }
        window = null;
        z = false;
        if (cursor.moveToFirst()) {
            l2aVar = this.identityScope;
            if (l2aVar != null) {
                l2aVar.lock();
                this.identityScope.b(count);
            }
            if (z) {
                do {
                    arrayList.add(loadCurrent(cursor, 0, false));
                } while (cursor.moveToNext());
            } else {
                do {
                    arrayList.add(loadCurrent(cursor, 0, false));
                } while (cursor.moveToNext());
            }
        }
        return arrayList;
    }

    public T loadByRowId(long j2) {
        return loadUniqueAndCloseCursor(this.db.b(this.statements.g(), new String[]{Long.toString(j2)}));
    }

    public final T loadCurrent(Cursor cursor, int i, boolean z) {
        if (this.identityScopeLong != null) {
            if (i != 0 && cursor.isNull(this.pkOrdinal + i)) {
                return null;
            }
            long j2 = cursor.getLong(this.pkOrdinal + i);
            m2a<T> m2aVar = this.identityScopeLong;
            T tH = z ? m2aVar.h(j2) : m2aVar.i(j2);
            if (tH != null) {
                return tH;
            }
            T entity = readEntity(cursor, i);
            attachEntity(entity);
            if (z) {
                this.identityScopeLong.l(j2, entity);
            } else {
                this.identityScopeLong.m(j2, entity);
            }
            return entity;
        }
        if (this.identityScope == null) {
            if (i != 0 && readKey(cursor, i) == null) {
                return null;
            }
            T entity2 = readEntity(cursor, i);
            attachEntity(entity2);
            return entity2;
        }
        K key = readKey(cursor, i);
        if (i != 0 && key == null) {
            return null;
        }
        l2a<K, T> l2aVar = this.identityScope;
        T tE = z ? l2aVar.get(key) : l2aVar.e(key);
        if (tE != null) {
            return tE;
        }
        T entity3 = readEntity(cursor, i);
        attachEntity(key, entity3, z);
        return entity3;
    }

    public final <O> O loadCurrentOther(a6<O, ?> a6Var, Cursor cursor, int i) {
        return a6Var.loadCurrent(cursor, i, true);
    }

    public T loadUnique(Cursor cursor) {
        if (!cursor.moveToFirst()) {
            return null;
        }
        if (cursor.isLast()) {
            return loadCurrent(cursor, 0, true);
        }
        throw new DaoException("Expected unique result, but count was " + cursor.getCount());
    }

    public T loadUniqueAndCloseCursor(Cursor cursor) {
        try {
            return loadUnique(cursor);
        } finally {
            cursor.close();
        }
    }

    public h5f<T> queryBuilder() {
        return h5f.j(this);
    }

    public List<T> queryRaw(String str, String... strArr) {
        return loadAllAndCloseCursor(this.db.b(this.statements.e() + str, strArr));
    }

    public f5f<T> queryRawCreate(String str, Object... objArr) {
        return queryRawCreateListArgs(str, Arrays.asList(objArr));
    }

    public f5f<T> queryRawCreateListArgs(String str, Collection<Object> collection) {
        return f5f.e(this, this.statements.e() + str, collection.toArray());
    }

    public abstract T readEntity(Cursor cursor, int i);

    public abstract void readEntity(Cursor cursor, T t, int i);

    public abstract K readKey(Cursor cursor, int i);

    public void refresh(T t) {
        assertSinglePk();
        K keyVerified = getKeyVerified(t);
        Cursor cursorB = this.db.b(this.statements.f(), new String[]{keyVerified.toString()});
        try {
            if (!cursorB.moveToFirst()) {
                throw new DaoException("Entity does not exist in the database anymore: " + t.getClass() + " with key " + keyVerified);
            }
            if (cursorB.isLast()) {
                readEntity(cursorB, t, 0);
                attachEntity(keyVerified, t, true);
                cursorB.close();
            } else {
                throw new DaoException("Expected unique result, but count was " + cursorB.getCount());
            }
        } catch (Throwable th) {
            cursorB.close();
            throw th;
        }
    }

    public o3g<T, K> rx() {
        if (this.rxDao == null) {
            this.rxDao = new o3g<>(this, Schedulers.io());
        }
        return this.rxDao;
    }

    public o3g<T, K> rxPlain() {
        if (this.rxDaoPlain == null) {
            this.rxDaoPlain = new o3g<>(this);
        }
        return this.rxDaoPlain;
    }

    public void save(T t) {
        if (hasKey(t)) {
            update(t);
        } else {
            insert(t);
        }
    }

    public void saveInTx(T... tArr) {
        saveInTx(Arrays.asList(tArr));
    }

    public void update(T t) {
        assertSinglePk();
        d05 d05VarH = this.statements.h();
        if (this.db.isDbLockedByCurrentThread()) {
            synchronized (d05VarH) {
                if (this.isStandardSQLite) {
                    updateInsideSynchronized((Object) t, (SQLiteStatement) d05VarH.a(), true);
                } else {
                    updateInsideSynchronized((Object) t, d05VarH, true);
                }
            }
            return;
        }
        this.db.beginTransaction();
        try {
            synchronized (d05VarH) {
                updateInsideSynchronized((Object) t, d05VarH, true);
            }
            this.db.setTransactionSuccessful();
            this.db.endTransaction();
        } catch (Throwable th) {
            this.db.endTransaction();
            throw th;
        }
    }

    public void updateInTx(Iterable<T> iterable) {
        RuntimeException runtimeException;
        d05 d05VarH = this.statements.h();
        this.db.beginTransaction();
        try {
            synchronized (d05VarH) {
                l2a<K, T> l2aVar = this.identityScope;
                if (l2aVar != null) {
                    l2aVar.lock();
                }
                try {
                    if (this.isStandardSQLite) {
                        SQLiteStatement sQLiteStatement = (SQLiteStatement) d05VarH.a();
                        Iterator<T> it = iterable.iterator();
                        while (it.hasNext()) {
                            updateInsideSynchronized((Object) it.next(), sQLiteStatement, false);
                        }
                    } else {
                        Iterator<T> it2 = iterable.iterator();
                        while (it2.hasNext()) {
                            updateInsideSynchronized((Object) it2.next(), d05VarH, false);
                        }
                    }
                    l2a<K, T> l2aVar2 = this.identityScope;
                    if (l2aVar2 != null) {
                        l2aVar2.unlock();
                    }
                } catch (Throwable th) {
                    l2a<K, T> l2aVar3 = this.identityScope;
                    if (l2aVar3 != null) {
                        l2aVar3.unlock();
                    }
                    throw th;
                }
            }
            this.db.setTransactionSuccessful();
            this.db.endTransaction();
            runtimeException = null;
        } catch (RuntimeException e2) {
            try {
                this.db.endTransaction();
                runtimeException = e2;
            } catch (RuntimeException e3) {
                ds4.f("Could not end transaction (rethrowing initial exception)", e3);
                throw e2;
            }
        } catch (Throwable th2) {
            this.db.endTransaction();
            throw th2;
        }
        if (runtimeException != null) {
            throw runtimeException;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void updateInsideSynchronized(T t, d05 d05Var, boolean z) {
        bindValues(d05Var, t);
        int length = this.config.f10219l.length + 1;
        Object key = getKey(t);
        if (key instanceof Long) {
            d05Var.bindLong(length, ((Long) key).longValue());
        } else {
            if (key == null) {
                throw new DaoException("Cannot update entity without key - was it inserted before?");
            }
            d05Var.bindString(length, key.toString());
        }
        d05Var.execute();
        attachEntity(key, t, z);
    }

    public abstract K updateKeyAfterInsert(T t, long j2);

    public void updateKeyAfterInsertAndAttach(T t, long j2, boolean z) {
        if (j2 != -1) {
            attachEntity(updateKeyAfterInsert(t, j2), t, z);
        } else {
            ds4.e("Could not insert row (executeInsert returned -1)");
        }
    }

    public a6(cs4 cs4Var, c6 c6Var) {
        this.config = cs4Var;
        this.session = c6Var;
        wz4 wz4Var = cs4Var.i;
        this.db = wz4Var;
        this.isStandardSQLite = wz4Var.a() instanceof SQLiteDatabase;
        m2a<T> m2aVar = (l2a<K, T>) cs4Var.c();
        this.identityScope = m2aVar;
        if (m2aVar instanceof m2a) {
            this.identityScopeLong = m2aVar;
        } else {
            this.identityScopeLong = null;
        }
        this.statements = cs4Var.q;
        yye yyeVar = cs4Var.o;
        this.pkOrdinal = yyeVar != null ? yyeVar.a : -1;
    }

    public final void attachEntity(K k, T t, boolean z) {
        attachEntity(t);
        l2a<K, T> l2aVar = this.identityScope;
        if (l2aVar == null || k == null) {
            return;
        }
        if (z) {
            l2aVar.put(k, t);
        } else {
            l2aVar.d(k, t);
        }
    }

    public void deleteByKeyInTx(K... kArr) {
        deleteInTxInternal(null, Arrays.asList(kArr));
    }

    public void deleteInTx(T... tArr) {
        deleteInTxInternal(Arrays.asList(tArr), null);
    }

    public void insertInTx(T... tArr) {
        insertInTx(Arrays.asList(tArr), isEntityUpdateable());
    }

    public void saveInTx(Iterable<T> iterable) {
        Iterator<T> it = iterable.iterator();
        int i = 0;
        int i2 = 0;
        while (it.hasNext()) {
            if (hasKey(it.next())) {
                i++;
            } else {
                i2++;
            }
        }
        if (i <= 0 || i2 <= 0) {
            if (i2 > 0) {
                insertInTx(iterable);
                return;
            } else {
                if (i > 0) {
                    updateInTx(iterable);
                    return;
                }
                return;
            }
        }
        ArrayList arrayList = new ArrayList(i);
        ArrayList arrayList2 = new ArrayList(i2);
        for (T t : iterable) {
            if (hasKey(t)) {
                arrayList.add(t);
            } else {
                arrayList2.add(t);
            }
        }
        this.db.beginTransaction();
        try {
            updateInTx(arrayList);
            insertInTx(arrayList2);
            this.db.setTransactionSuccessful();
        } finally {
            this.db.endTransaction();
        }
    }

    public void insertInTx(Iterable<T> iterable, boolean z) {
        executeInsertInTx(this.statements.d(), iterable, z);
    }

    public void insertOrReplaceInTx(Iterable<T> iterable) {
        insertOrReplaceInTx(iterable, isEntityUpdateable());
    }

    public void insertOrReplaceInTx(T... tArr) {
        insertOrReplaceInTx(Arrays.asList(tArr), isEntityUpdateable());
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void updateInsideSynchronized(T t, SQLiteStatement sQLiteStatement, boolean z) {
        bindValues(sQLiteStatement, t);
        int length = this.config.f10219l.length + 1;
        Object key = getKey(t);
        if (key instanceof Long) {
            sQLiteStatement.bindLong(length, ((Long) key).longValue());
        } else if (key != null) {
            sQLiteStatement.bindString(length, key.toString());
        } else {
            throw new DaoException("Cannot update entity without key - was it inserted before?");
        }
        sQLiteStatement.execute();
        attachEntity(key, t, z);
    }

    public void updateInTx(T... tArr) {
        updateInTx(Arrays.asList(tArr));
    }
}
