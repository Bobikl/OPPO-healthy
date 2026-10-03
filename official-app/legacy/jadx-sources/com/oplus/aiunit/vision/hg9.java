package com.oplus.aiunit.vision;

import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;
import com.heytap.databaseengineservice.db.table.snore.DBHrvData;
import java.util.List;

/* JADX INFO: loaded from: classes15.dex */
@Dao
public interface hg9 {
    @Insert(onConflict = 1)
    List<Long> a(List<DBHrvData> list);

    @Update
    int b(List<DBHrvData> list);

    @Query("select * from DBHrvTable where ssoid = :ssoid and device_unique_id = :dataClient and start_timestamp between :startTime and :endTime and display = :display order by start_timestamp asc limit :limit")
    List<DBHrvData> c(String str, String str2, long j2, long j3, int i, int i2);

    @Query("select '' as ssoid, client_data_id, device_unique_id, start_timestamp, end_timestamp, hrv_type, hrv_value, metadata, display, sync_status, updated, modified_timestamp from DBHrvTable where ssoid = :ssoid and (sync_status = 0 or updated = 1) and start_timestamp between :startTime and :endTime order by case when :sortOrder = 1 then start_timestamp end desc, case when :sortOrder = 0 then start_timestamp end asc limit :limitCount")
    List<DBHrvData> d(long j2, long j3, int i, int i2, String str);

    @Query("select * from DBHrvTable where ssoid = :ssoid and start_timestamp >= :startTime and end_timestamp <= :endTime order by start_timestamp desc")
    List<DBHrvData> e(String str, long j2, long j3);

    @Query("select * from DBHrvTable where ssoid = :ssoid and start_timestamp between :startTime and :endTime and display = :display group by start_timestamp order by start_timestamp asc")
    List<DBHrvData> f(String str, long j2, long j3, int i);

    @Query("select MAX(modified_timestamp) from DBHrvTable where ssoid = :ssoid and modified_timestamp between :startOfToday and :currentTime")
    long g(String str, long j2, long j3);

    @Query("select * from DBHrvTable where ssoid = :ssoid and start_timestamp between :startTime and :endTime and display = :display order by start_timestamp asc limit :limit")
    List<DBHrvData> h(String str, long j2, long j3, int i, int i2);

    @Query("select * from DBHrvTable where ssoid = :ssoid and device_unique_id = :dataClient and start_timestamp between :startTime and :endTime and display = :display group by start_timestamp order by start_timestamp asc")
    List<DBHrvData> i(String str, String str2, long j2, long j3, int i);
}
