package com.oplus.aiunit.vision;

import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.RawQuery;
import androidx.room.Update;
import androidx.sqlite.db.SupportSQLiteQuery;
import com.heytap.databaseengineservice.db.table.DBHeartRateDataStat;
import java.util.List;

/* JADX INFO: loaded from: classes15.dex */
@Dao
public interface j69 {
    @Insert(onConflict = 1)
    List<Long> a(List<DBHeartRateDataStat> list);

    @Update
    int b(List<DBHeartRateDataStat> list);

    @Query("select MAX(modified_timestamp) from DBHeartRateDataStatTable where ssoid = :ssoid")
    long c(String str);

    @Query("select * from DBHeartRateDataStatTable where ssoid = :ssoid and date between :startDate and :endDate")
    List<DBHeartRateDataStat> d(String str, int i, int i2);

    @Query("select _id, client_data_id, date, max_hr, min_hr, average_hr, rest_hr, walk_avg_hr, sleep_base_hr, metadata, sync_status, timezone, updated, modified_timestamp from DBHeartRateDataStatTable where ssoid = :ssoid and (sync_status = 0 or updated = 1) and date between :startDate and :endDate order by case when :sortOrder = 1 then date end desc, case when :sortOrder = 0 then date end asc limit :limitCount")
    List<DBHeartRateDataStat> e(int i, int i2, int i3, int i4, String str);

    @Query("delete from DBHeartRateDataStatTable where ssoid = :ssoid")
    int f(String str);

    @Query("select * from DBHeartRateDataStatTable where ssoid = :ssoid and date in (:dateList) and (sync_status = 0 or updated = 1)")
    List<DBHeartRateDataStat> g(List<Integer> list, String str);

    @Query("select min(date) from DBHeartRateDataStatTable where ssoid = :ssoid and date >= :oldestDay")
    int h(String str, int i);

    @Query("select * from DBHeartRateDataStatTable where ssoid = :ssoid and date between :startDate and :endDate order by case when :sortOrder = 1 then date end desc, case when :sortOrder = 0 then date end asc limit :limitCount")
    List<DBHeartRateDataStat> i(int i, int i2, int i3, int i4, String str);

    @Query("select MAX(date) from DBHeartRateDataStatTable where ssoid = :ssoid and date <= :today")
    int j(String str, int i);

    @Query("select * from DBHeartRateDataStatTable where ssoid = :ssoid and date = :date")
    DBHeartRateDataStat k(String str, int i);

    @Query("select avg(rest_hr) from (select rest_hr from DBHeartRateDataStatTable where ssoid = :ssoid and rest_hr != 0 order by date desc limit :count)")
    int l(String str, int i);

    @Query("select max_hr from DBHeartRateDataStatTable where ssoid = :ssoid order by date desc limit :count")
    int m(String str, int i);

    @Insert(onConflict = 1)
    Long n(DBHeartRateDataStat dBHeartRateDataStat);

    @Update
    int o(DBHeartRateDataStat dBHeartRateDataStat);

    @RawQuery
    List<DBHeartRateDataStat> p(SupportSQLiteQuery supportSQLiteQuery);
}
