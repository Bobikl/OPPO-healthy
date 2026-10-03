package com.oplus.aiunit.vision;

import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;
import com.heytap.databaseengineservice.db.table.DBSleep;
import java.util.List;

/* JADX INFO: loaded from: classes15.dex */
@Dao
public interface tbh {
    @Insert(onConflict = 1)
    List<Long> a(List<DBSleep> list);

    @Update
    int b(List<DBSleep> list);

    @Query("select * from DBSleepTable where ssoid = :ssoid and device_unique_id = :dataClient and start_time between :startTime and :endTime and display = :display group by start_time order by case when :sortOrder = 1 then start_time end desc, case when :sortOrder = 0 then start_time end asc")
    List<DBSleep> c(String str, String str2, long j2, long j3, int i, int i2);

    @Query("select _id, '' as ssoid, client_data_id, device_unique_id, start_time, end_time, sleep_type, sleep_state, alg_origin_state, metadata, data_version, device_type, display, sync_status, updated, modified_timestamp from DBSleepTable where ssoid = :ssoid and (sync_status = 0 or updated = 1) and start_time between :startTime and :endTime order by case when :sortOrder = 1 then start_time end desc, case when :sortOrder = 0 then start_time end asc limit :limitCount")
    List<DBSleep> d(long j2, long j3, int i, int i2, String str);

    @Query("select * from DBSleepTable where ssoid = :ssoid and start_time >= :startTime and end_time <= :endTime and (device_type is null or device_type != 0) order by start_time desc")
    List<DBSleep> e(String str, long j2, long j3);

    @Query("delete from DBSleepTable where ssoid = :ssoid")
    int f(String str);

    @Query("select MAX(modified_timestamp) from DBSleepTable where ssoid = :ssoid and modified_timestamp between :startOfToday and :currentTime")
    long g(String str, long j2, long j3);

    @Query("select ssoid from DBSleepTable where ssoid is not null and ssoid != '' and display = 1 group by ssoid")
    List<String> h();

    @Query("select * from DBSleepTable where ssoid = :ssoid and device_unique_id = :deviceUniqueId and start_time between :startTime and :endTime and display = :display order by case when :sortOrder = 1 then start_time end desc, case when :sortOrder = 0 then start_time end asc limit :limit")
    List<DBSleep> i(String str, String str2, long j2, long j3, int i, int i2, int i3);

    @Query("select * from DBSleepTable where ssoid = :ssoid and start_time between :startTime and :endTime and device_type = :deviceType order by case when :sortOrder = 1 then start_time end desc, case when :sortOrder = 0 then start_time end asc limit :limit")
    List<DBSleep> j(String str, long j2, long j3, int i, int i2, String str2);

    @Query("select * from DBSleepTable where ssoid = :ssoid and start_time between :startTime and :endTime and display = :display order by case when :sortOrder = 1 then start_time end desc, case when :sortOrder = 0 then start_time end asc limit :limit")
    List<DBSleep> k(String str, long j2, long j3, int i, int i2, int i3);

    @Query("select * from DBSleepTable where ssoid = :ssoid and start_time between :startTime and :endTime and (device_type is null or device_type != 0) group by start_time order by case when :sortOrder = 1 then start_time end desc, case when :sortOrder = 0 then start_time end asc")
    List<DBSleep> l(String str, long j2, long j3, int i);

    @Query("select * from DBSleepTable where ssoid = :ssoid and start_time between :startTime and :endTime and device_type = :deviceType group by start_time order by case when :sortOrder = 1 then start_time end desc, case when :sortOrder = 0 then start_time end asc")
    List<DBSleep> m(String str, long j2, long j3, int i, String str2);

    @Query("select * from DBSleepTable where ssoid = :ssoid and start_time between :startTime and :endTime and display = :display group by start_time order by case when :sortOrder = 1 then start_time end desc, case when :sortOrder = 0 then start_time end asc")
    List<DBSleep> n(String str, long j2, long j3, int i, int i2);
}
