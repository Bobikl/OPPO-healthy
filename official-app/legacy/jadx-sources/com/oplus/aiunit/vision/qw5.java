package com.oplus.aiunit.vision;

import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.RawQuery;
import androidx.sqlite.db.SimpleSQLiteQuery;
import androidx.sqlite.db.SupportSQLiteQuery;
import com.heytap.databaseengineservice.db.table.DBDisturbSleepStat;
import java.util.List;

/* JADX INFO: loaded from: classes15.dex */
@Dao
public interface qw5 {
    @Insert(onConflict = 1)
    List<Long> a(List<DBDisturbSleepStat> list);

    @Query("delete from DBDisturbSleepStat where ssoid = :ssoid")
    int f(String str);

    @Query("select *from DBDisturbSleepStat where ssoid = :ssoid and sync_status = 0")
    List<DBDisturbSleepStat> g(String str);

    @RawQuery
    List<DBDisturbSleepStat> h(SupportSQLiteQuery supportSQLiteQuery);

    @Query("select max(date) from DBDisturbSleepStat where ssoid = :ssoid")
    int i(String str);

    @RawQuery
    int j(SimpleSQLiteQuery simpleSQLiteQuery);
}
