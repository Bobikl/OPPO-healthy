package com.oplus.aiunit.vision;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.RawQuery;
import androidx.room.Update;
import androidx.sqlite.db.SupportSQLiteQuery;
import com.heytap.databaseengineservice.db.table.relax.DBRelaxStat;
import java.util.List;

/* JADX INFO: loaded from: classes15.dex */
@Dao
public interface ymf {
    @Query("select 0 as _id,  ssoid, type, sync_status, timezone, display, extension, 0 as modified_timestamp, updated, date, sum(total_duration) as total_duration, sum(total_counts) as total_counts from DBRelaxStat where ssoid = :ssoid and date = :date and type in (:types) and display != 2 group by date order by date desc limit 1")
    List<DBRelaxStat> a(String str, int i, List<Integer> list);

    @Delete
    int b(DBRelaxStat dBRelaxStat);

    @Update
    int c(DBRelaxStat dBRelaxStat);

    @Query("select * from DBRelaxStat where ssoid = :ssoid and date between :startDate and :endDate")
    List<DBRelaxStat> d(String str, int i, int i2);

    @Insert(onConflict = 1)
    Long e(DBRelaxStat dBRelaxStat);

    @Query("select * from DBRelaxStat where ssoid = :ssoid and type = :type and date = :date")
    DBRelaxStat i(String str, int i, int i2);

    @RawQuery
    List<DBRelaxStat> l(SupportSQLiteQuery supportSQLiteQuery);
}
