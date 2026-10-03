package com.oplus.aiunit.vision;

import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;
import org.greenrobot.greendao.DaoException;
import rx.schedulers.Schedulers;

/* JADX INFO: loaded from: classes11.dex */
public class c6 {
    private final wz4 db;
    private final Map<Class<?>, a6<?, ?>> entityToDao = new HashMap();
    private volatile u4g rxTxIo;
    private volatile u4g rxTxPlain;

    public c6(wz4 wz4Var) {
        this.db = wz4Var;
    }

    public <V> V callInTx(Callable<V> callable) throws Exception {
        this.db.beginTransaction();
        try {
            V vCall = callable.call();
            this.db.setTransactionSuccessful();
            return vCall;
        } finally {
            this.db.endTransaction();
        }
    }

    public <V> V callInTxNoException(Callable<V> callable) {
        this.db.beginTransaction();
        try {
            try {
                V vCall = callable.call();
                this.db.setTransactionSuccessful();
                this.db.endTransaction();
                return vCall;
            } catch (Exception e2) {
                throw new DaoException("Callable failed", e2);
            }
        } catch (Throwable th) {
            this.db.endTransaction();
            throw th;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public <T> void delete(T t) {
        getDao(t.getClass()).delete(t);
    }

    public <T> void deleteAll(Class<T> cls) {
        getDao(cls).deleteAll();
    }

    public Collection<a6<?, ?>> getAllDaos() {
        return Collections.unmodifiableCollection(this.entityToDao.values());
    }

    public a6<?, ?> getDao(Class<? extends Object> cls) {
        a6<?, ?> a6Var = this.entityToDao.get(cls);
        if (a6Var != null) {
            return a6Var;
        }
        throw new DaoException("No DAO registered for " + cls);
    }

    public wz4 getDatabase() {
        return this.db;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public <T> long insert(T t) {
        return getDao(t.getClass()).insert(t);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public <T> long insertOrReplace(T t) {
        return getDao(t.getClass()).insertOrReplace(t);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public <T, K> T load(Class<T> cls, K k) {
        return (T) getDao(cls).load(k);
    }

    public <T, K> List<T> loadAll(Class<T> cls) {
        return (List<T>) getDao(cls).loadAll();
    }

    public <T> h5f<T> queryBuilder(Class<T> cls) {
        return (h5f<T>) getDao(cls).queryBuilder();
    }

    public <T, K> List<T> queryRaw(Class<T> cls, String str, String... strArr) {
        return (List<T>) getDao(cls).queryRaw(str, strArr);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public <T> void refresh(T t) {
        getDao(t.getClass()).refresh(t);
    }

    public <T> void registerDao(Class<T> cls, a6<T, ?> a6Var) {
        this.entityToDao.put(cls, a6Var);
    }

    public void runInTx(Runnable runnable) {
        this.db.beginTransaction();
        try {
            runnable.run();
            this.db.setTransactionSuccessful();
        } finally {
            this.db.endTransaction();
        }
    }

    public u4g rxTx() {
        if (this.rxTxIo == null) {
            this.rxTxIo = new u4g(this, Schedulers.io());
        }
        return this.rxTxIo;
    }

    public u4g rxTxPlain() {
        if (this.rxTxPlain == null) {
            this.rxTxPlain = new u4g(this);
        }
        return this.rxTxPlain;
    }

    public org.greenrobot.greendao.async.b startAsyncSession() {
        return new org.greenrobot.greendao.async.b(this);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public <T> void update(T t) {
        getDao(t.getClass()).update(t);
    }
}
