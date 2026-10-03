package com.heytap.store.db.manager;

import android.content.Context;
import com.heytap.store.db.entity.dao.DaoMaster;
import com.heytap.store.db.entity.dao.DaoSession;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public class DaoManager {
    private static volatile DaoManager daoManager;
    private static DaoSession session;

    private DaoManager() {
    }

    public static DaoSession getDaoSession(Context context) {
        if (session == null) {
            session = new DaoMaster(MySQLiteOpenHelper.getInstance(context.getApplicationContext()).getWritableDatabase()).newSession();
        }
        return session;
    }

    public static DaoManager getInstance(Context context) {
        getDaoSession(context);
        if (daoManager == null) {
            synchronized (DaoManager.class) {
                if (daoManager == null) {
                    daoManager = new DaoManager();
                }
            }
        }
        return daoManager;
    }

    public void deleteAll(Class cls) {
        session.deleteAll(cls);
    }

    public void deleteObject(Object obj) {
        if (obj != null) {
            session.delete(obj);
        }
    }

    public boolean insertMultObject(final List<Object> list) {
        if (list == null || list.isEmpty()) {
            return false;
        }
        session.runInTx(new Runnable() { // from class: com.heytap.store.db.manager.DaoManager.1
            @Override // java.lang.Runnable
            public void run() {
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    DaoManager.this.insertObject(it.next());
                }
            }
        });
        return true;
    }

    public boolean insertObject(Object obj) {
        return (obj == null || session.insert(obj) == -1) ? false : true;
    }

    public <T> List<T> queryAll(Class cls) {
        return session.loadAll(cls);
    }

    public void updateMultObject(final List<Object> list) {
        if (list == null || list.isEmpty()) {
            return;
        }
        session.runInTx(new Runnable() { // from class: com.heytap.store.db.manager.DaoManager.2
            @Override // java.lang.Runnable
            public void run() {
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    DaoManager.this.updateObject(it.next());
                }
            }
        });
    }

    public void updateObject(Object obj) {
        if (obj != null) {
            session.update(obj);
        }
    }

    public boolean insertMultObject(List<Object> list, Class cls) {
        if (list == null || list.isEmpty()) {
            return false;
        }
        session.getDao(cls).insertInTx(list);
        return true;
    }

    public void updateMultObject(List<Object> list, Class cls) {
        if (list == null || list.isEmpty()) {
            return;
        }
        session.getDao(cls).updateInTx(list);
    }
}
