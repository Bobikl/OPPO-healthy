package com.heytap.store.db.manager;

import com.oplus.aiunit.vision.wz4;
import java.util.Iterator;
import java.util.SortedMap;
import java.util.TreeMap;

/* JADX INFO: loaded from: classes4.dex */
public class DBMigration implements MySQLiteOpenHelper.OnExecuteMigrationListener {
    private static final SortedMap<Integer, Migration> ALL_MIGRATIONS = new TreeMap();

    public interface Migration {
        void migrate(wz4 wz4Var);
    }

    @Override // com.heytap.store.db.manager.MySQLiteOpenHelper.OnExecuteMigrationListener
    public void executeMigrations(wz4 wz4Var, int i, int i2) {
        Iterator<Integer> it = ALL_MIGRATIONS.subMap(Integer.valueOf(i), Integer.valueOf(i2)).keySet().iterator();
        while (it.hasNext()) {
            ALL_MIGRATIONS.get(it.next()).migrate(wz4Var);
        }
    }
}
