package com.oplus.aiunit.vision;

import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.RawQuery;
import androidx.room.Update;
import androidx.sqlite.db.SupportSQLiteQuery;
import com.heytap.databaseengineservice.db.table.stress.DBStressDataStat;
import java.util.List;

/* JADX INFO: loaded from: classes15.dex */
@Dao
public interface h0j {
    @Insert(onConflict = 1)
    List<Long> a(List<DBStressDataStat> list);

    @Update
    int b(List<DBStressDataStat> list);

    @Query("select MAX(modified_timestamp) from DBStressDataStatTable where ssoid = :ssoid")
    long c(String str);

    @Query("select * from DBStressDataStatTable where ssoid = :ssoid and date between :startDate and :endDate")
    List<DBStressDataStat> d(String str, int i, int i2);

    @Query("select _id, device_unique_id, client_data_id, date, max_hr, min_hr, average_hr, max_stress_timestamp, relax_stress_total_time, normal_stress_total_time, middle_stress_total_time, high_stress_total_time, metadata, sync_status, timezone, updated, modified_timestamp from DBStressDataStatTable where ssoid = :ssoid and (sync_status = 0 or updated = 1) and date between :startDate and :endDate order by case when :sortOrder = 1 then date end desc, case when :sortOrder = 0 then date end asc limit :limitCount")
    List<DBStressDataStat> e(int i, int i2, int i3, int i4, String str);

    @Query("delete from DBStressDataStatTable where ssoid = :ssoid")
    int f(String str);

    @Query("select * from DBStressDataStatTable where ssoid = :ssoid and date in (:dateList) and (sync_status = 0 or updated = 1)")
    List<DBStressDataStat> g(List<Integer> list, String str);

    @Query("select min(date) from DBStressDataStatTable where ssoid = :ssoid and date >= :oldestDay")
    int h(String str, int i);

    @Insert(onConflict = 1)
    Long i(DBStressDataStat dBStressDataStat);

    @Query("select MAX(date) from DBStressDataStatTable where ssoid = :ssoid and date <= :today")
    int j(String str, int i);

    @Query("select * from DBStressDataStatTable where ssoid = :ssoid and date = :date")
    DBStressDataStat k(String str, int i);

    @RawQuery
    List<DBStressDataStat> l(SupportSQLiteQuery supportSQLiteQuery);

    @Update
    int m(DBStressDataStat dBStressDataStat);
}
