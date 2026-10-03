package com.oplus.aiunit.vision;

import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.RawQuery;
import androidx.room.Update;
import androidx.sqlite.db.SupportSQLiteQuery;
import com.heytap.databaseengineservice.db.table.bloodpressure.DBBloodPressure;
import com.heytap.databaseengineservice.db.table.bloodpressure.DBBloodPressureStat;
import java.util.List;

/* JADX INFO: loaded from: classes15.dex */
@Dao
public interface lo1 {
    @Insert(onConflict = 1)
    List<Long> a(List<DBBloodPressure> list);

    @Update
    int b(List<DBBloodPressure> list);

    @Query("select MAX(modified_timestamp) from DBBloodPressure where ssoid = :ssoid")
    long c(String str);

    @Query("select '' as ssoid, manufacturer, model, device_unique_id, measure_timestamp, bp_type, systolic, diastolic, pulse, arrhythmia_flg, bm_flg, cws_flg, evaluation, display, sync_status, modified_timestamp, updated, deleted, collect_exception_type from DBBloodPressure where ssoid = :ssoid and (sync_status = 0 or updated = 1) and measure_timestamp between :startTime and :endTime order by case when :sortOrder = 1 then measure_timestamp end desc, case when :sortOrder = 0 then measure_timestamp end asc limit :limitCount")
    List<DBBloodPressure> d(long j2, long j3, int i, int i2, String str);

    @Query("select * from DBBloodPressure where ssoid = :ssoid and measure_timestamp >= :startTime and measure_timestamp <= :endTime and deleted != 1 order by case when :sortOrder = 1 then measure_timestamp end desc, case when :sortOrder = 0 then measure_timestamp end asc")
    List<DBBloodPressure> e(String str, long j2, long j3, int i);

    @RawQuery
    List<DBBloodPressure> h(SupportSQLiteQuery supportSQLiteQuery);

    @RawQuery
    List<DBBloodPressureStat> i(SupportSQLiteQuery supportSQLiteQuery);

    @Query("select * from DBBloodPressure where ssoid = :ssoid and device_unique_id = :deviceId and measure_timestamp = :measureTime")
    List<DBBloodPressure> j(String str, String str2, long j2);

    @Insert(onConflict = 1)
    Long k(DBBloodPressure dBBloodPressure);

    @Query("select * from DBBloodPressure where ssoid = :ssoid and device_unique_id in (:deviceIds) and measure_timestamp in (:measureTimestamps)")
    List<DBBloodPressure> l(String str, List<String> list, List<Long> list2);

    @Update
    int m(DBBloodPressure dBBloodPressure);

    @RawQuery
    DBBloodPressureStat n(SupportSQLiteQuery supportSQLiteQuery);
}
