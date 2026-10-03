package com.oplus.aiunit.vision;

import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.Query;
import com.oplus.accountsdk.open.core.storage.table.AcOpenSQLKeyValue;

/* JADX INFO: loaded from: classes6.dex */
@Dao
public interface hg {
    @Insert(onConflict = 1)
    void a(AcOpenSQLKeyValue acOpenSQLKeyValue);

    @Query("SELECT * FROM ac_open_sql_config_tb WHERE sqlKey = :key")
    AcOpenSQLKeyValue b(String str);

    @Query("DELETE FROM ac_open_sql_config_tb WHERE sqlKey = :key")
    int delete(String str);
}
