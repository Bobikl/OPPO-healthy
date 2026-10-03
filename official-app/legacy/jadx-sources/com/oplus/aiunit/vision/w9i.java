package com.oplus.aiunit.vision;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.RawQuery;
import androidx.room.Update;
import androidx.sqlite.db.SupportSQLiteQuery;
import com.heytap.databaseengineservice.db.table.DBSportDataDetail;
import com.heytap.databaseengineservice.db.table.DBSportDataStat;
import java.util.List;

/* JADX INFO: loaded from: classes15.dex */
@Dao
public interface w9i {
    @Insert(onConflict = 1)
    List<Long> a(List<DBSportDataDetail> list);

    @Update
    int b(List<DBSportDataDetail> list);

    @Query("select * from DBSportDataDetail where ssoid = :ssoid and start_time between :startTime and :endTime and display = :display order by case when :sortOrder = 1 then start_time end desc, case when :sortOrder = 0 then start_time end asc limit :limit")
    List<DBSportDataDetail> c(String str, long j2, long j3, int i, int i2, int i3);

    @Query("select _id, '' as ssoid, client_data_id, device_unique_id, device_category, start_time, end_time, sport_mode, steps, distance, calories, altitude_offset, display, sync_status, updated, data_version, workout, sedentary_state, amount_of_exercise, modified_time, timezone from DBSportDataDetail where ssoid = :ssoid and (sync_status = 0 or updated = 1) and start_time between :startTime and :endTime order by case when :sortOrder = 1 then start_time end desc, case when :sortOrder = 0 then start_time end asc limit :limitCount")
    List<DBSportDataDetail> d(long j2, long j3, int i, int i2, String str);

    @Query("select * from DBSportDataDetail where ssoid = :ssoid and start_time >= :startTime and end_time <= :endTime and display = 1 order by start_time desc")
    List<DBSportDataDetail> e(String str, long j2, long j3);

    @Query("delete from DBSportDataDetail where ssoid = :ssoid")
    int f(String str);

    @Query("select MAX(modified_time) from DBSportDataDetail where ssoid = :ssoid and modified_time between :startOfToday and :currentTime")
    long g(String str, long j2, long j3);

    @Query("select * from DBSportDataDetail where ssoid = :ssoid and start_time between :startTime and :endTime order by start_time desc")
    List<DBSportDataDetail> h(String str, long j2, long j3);

    @Delete
    int i(List<DBSportDataDetail> list);

    @Query("select * from DBSportDataDetail where ssoid = :ssoid and start_time between :startTime and :endTime and display = :display group by start_time order by case when :sortOrder = 1 then start_time end desc, case when :sortOrder = 0 then start_time end asc")
    List<DBSportDataDetail> j(String str, long j2, long j3, int i, int i2);

    @RawQuery
    List<DBSportDataDetail> k(SupportSQLiteQuery supportSQLiteQuery);

    @Query("select * from DBSportDataDetail where ssoid = :ssoid and start_time >= :startTime and end_time <= :endTime and display = 1 order by start_time desc")
    List<DBSportDataDetail> l(String str, long j2, long j3);

    @RawQuery
    List<DBSportDataStat> m(SupportSQLiteQuery supportSQLiteQuery);

    @Query("select * from DBSportDataDetail where ssoid = :ssoid and device_unique_id in (:deviceUniqueIdList) and start_time in (:startTimestampList)")
    List<DBSportDataDetail> n(String str, List<String> list, List<Long> list2);

    @Query("select count(device_unique_id) from DBSportDataDetail where ssoid = :ssoid and device_unique_id = :deviceUniqueId and start_time >= :startTimestamp")
    long o(long j2, String str, String str2);

    @RawQuery
    List<DBSportDataStat> p(SupportSQLiteQuery supportSQLiteQuery);

    @Query("select * from DBSportDataDetail where ssoid = :ssoid and steps > 0 and start_time between :startTime and :endTime group by device_unique_id")
    List<DBSportDataDetail> q(String str, long j2, long j3);
}
