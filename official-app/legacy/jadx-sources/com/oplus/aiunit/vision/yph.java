package com.oplus.aiunit.vision;

import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.RawQuery;
import androidx.room.Update;
import androidx.sqlite.db.SupportSQLiteQuery;
import com.heytap.databaseengineservice.db.table.DBSleepDataStat;
import java.util.List;

/* JADX INFO: loaded from: classes15.dex */
@Dao
public interface yph {
    @Insert(onConflict = 1)
    List<Long> a(List<DBSleepDataStat> list);

    @Update
    int b(List<DBSleepDataStat> list);

    @Query("select MAX(modified_timestamp) from DBSleepDataStatTable where ssoid = :ssoid")
    long c(String str);

    @Query("select * from DBSleepDataStatTable where ssoid = :ssoid and date between :startDate and :endDate")
    List<DBSleepDataStat> d(String str, int i, int i2);

    @Query("select '' as ssoid, '' as device_unique_id, _id, client_data_id, date, timezone, fall_asleep, sleep_out, total_sleep_time, total_deep_sleep_time, total_lightly_sleep_time, total_rem_time, total_wake_up_time, sleep_score, checked_sleep_score, metadata, sync_status, updated, modified_timestamp from DBSleepDataStatTable where ssoid = :ssoid and (sync_status = 0 or updated = 1) and total_wake_up_time >= 0 and total_sleep_time <= 1440 and fall_asleep < 9999 and date between :startDate and :endDate order by case when :sortOrder = 1 then date end desc, case when :sortOrder = 0 then date end asc limit :limitCount")
    List<DBSleepDataStat> e(int i, int i2, int i3, int i4, String str);

    @Query("delete from DBSleepDataStatTable where ssoid = :ssoid")
    int f(String str);

    @Query("select * from DBSleepDataStatTable where ssoid = :ssoid and date in (:dateList) and (sync_status = 0 or updated = 1)")
    List<DBSleepDataStat> g(List<Integer> list, String str);

    @Query("select min(date) from DBSleepDataStatTable where ssoid = :ssoid and total_sleep_time > 0 and date >= :oldestDay")
    int h(String str, int i);

    @Insert(onConflict = 5)
    List<Long> i(List<DBSleepDataStat> list);

    @Query("select MAX(date) from DBSleepDataStatTable where ssoid = :ssoid and total_sleep_time > 0 and date <= :today")
    int j(String str, int i);

    @Query("select * from DBSleepDataStatTable where ssoid = :ssoid and date = :date")
    DBSleepDataStat k(String str, int i);

    @RawQuery
    List<DBSleepDataStat> l(SupportSQLiteQuery supportSQLiteQuery);

    @Update
    int m(DBSleepDataStat dBSleepDataStat);

    @Insert(onConflict = 1)
    Long n(DBSleepDataStat dBSleepDataStat);

    @Query("select * from DBSleepDataStatTable where ssoid = :ssoid and date between :startDate and :endDate order by case when :sortOrder = 1 then date end desc, case when :sortOrder = 0 then date end asc limit :limitCount")
    List<DBSleepDataStat> o(int i, int i2, int i3, int i4, String str);

    @Query("select * from DBSleepDataStatTable where ssoid = :ssoid")
    List<DBSleepDataStat> query(String str);
}
