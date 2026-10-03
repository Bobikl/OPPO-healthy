package com.oplus.aiunit.vision;

import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.RawQuery;
import androidx.room.Update;
import androidx.sqlite.db.SupportSQLiteQuery;
import com.heytap.databaseengineservice.db.table.DBHearingHealth;
import com.heytap.databaseengineservice.db.table.DBHearingHealthStat;
import java.util.List;

/* JADX INFO: loaded from: classes15.dex */
@Dao
public interface iy8 {
    @Insert(onConflict = 1)
    List<Long> a(List<DBHearingHealth> list);

    @Update
    int b(List<DBHearingHealth> list);

    @Query("select min(data_created_timestamp) from DBHearingHealthTable where ssoid = :ssoid and display = :display")
    List<Long> c(String str, int i);

    @Query("select '' as ssoid, device_unique_id, device_name, db_value, duration, data_created_timestamp, display, modified_timestamp, sync_status, updated from DBHearingHealthTable where ssoid = :ssoid and (sync_status = 0 or updated = 1) and data_created_timestamp between :startTime and :endTime order by case when :sortOrder = 1 then data_created_timestamp end desc, case when :sortOrder = 0 then data_created_timestamp end asc limit :limitCount")
    List<DBHearingHealth> d(long j2, long j3, int i, int i2, String str);

    @RawQuery
    List<DBHearingHealth> e(SupportSQLiteQuery supportSQLiteQuery);

    @RawQuery
    DBHearingHealthStat f(SupportSQLiteQuery supportSQLiteQuery);

    @Query("select MAX(modified_timestamp) from DBHearingHealthTable where ssoid = :ssoid and modified_timestamp between :startOfToday and :currentTime")
    long g(String str, long j2, long j3);

    @RawQuery
    List<DBHearingHealthStat> i(SupportSQLiteQuery supportSQLiteQuery);

    @Query("select * from DBHearingHealthTable where ssoid = :ssoid and data_created_timestamp between :startTime and :endTime and display = :display order by case when :sortOrder = 1 then data_created_timestamp end desc, case when :sortOrder = 0 then data_created_timestamp end asc")
    List<DBHearingHealth> j(String str, long j2, long j3, int i, int i2);
}
