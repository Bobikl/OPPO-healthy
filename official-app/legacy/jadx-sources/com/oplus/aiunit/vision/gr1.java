package com.oplus.aiunit.vision;

import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.RawQuery;
import androidx.room.Update;
import androidx.sqlite.db.SupportSQLiteQuery;
import com.heytap.databaseengineservice.db.table.bloodpressure.DBBloodPressureStat;
import java.util.List;

/* JADX INFO: loaded from: classes15.dex */
@Dao
public interface gr1 {
    @Update
    int b(List<DBBloodPressureStat> list);

    @Query("select MAX(modified_Timestamp) from DBBloodPressureStat where ssoid = :ssoid")
    long c(String str);

    @Query("select * from DBBloodPressureStat where ssoid = :ssoid and date between :startDate and :endDate")
    List<DBBloodPressureStat> d(String str, int i, int i2);

    @Query("select '' as ssoid, date, bp_type, max_systolic, min_systolic, avg_systolic, max_diastolic, min_diastolic, avg_diastolic, normal_times, high_normal_times, mild_hypertension_times, moderate_hypertension_times, severe_hypertension_times, high_times, low_times, sync_status, modified_timestamp, updated from DBBloodPressureStat where ssoid = :ssoid and (sync_status = 0 or updated = 1) and date between :startDate and :endDate  order by case when :sortOrder = 1 then date end desc, case when :sortOrder = 0 then date end asc limit :limitCount")
    List<DBBloodPressureStat> e(int i, int i2, int i3, int i4, String str);

    @Query("select * from DBBloodPressureStat where ssoid = :ssoid and date in (:dateList) and (sync_status = 0 or updated = 1)")
    List<DBBloodPressureStat> g(List<Integer> list, String str);

    @Query("select min(date) from DBBloodPressureStat where ssoid = :ssoid and date >= :oldestDay and min_diastolic > 0")
    int h(String str, int i);

    @Query("select * from DBBloodPressureStat where ssoid = :ssoid and date = :date and bp_type = :bpType")
    DBBloodPressureStat i(String str, int i, int i2);

    @Query("select MAX(date) from DBBloodPressureStat where ssoid = :ssoid and date <= :today and min_diastolic > 0")
    int j(String str, int i);

    @Update
    int k(DBBloodPressureStat dBBloodPressureStat);

    @RawQuery
    List<DBBloodPressureStat> l(SupportSQLiteQuery supportSQLiteQuery);

    @Insert(onConflict = 1)
    Long m(DBBloodPressureStat dBBloodPressureStat);
}
