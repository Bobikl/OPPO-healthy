package com.oplus.aiunit.vision;

import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;
import com.heytap.databaseengineservice.db.table.DBHealthOriginData;
import java.util.List;

/* JADX INFO: loaded from: classes15.dex */
@Dao
public interface ns8 {
    @Update
    int a(DBHealthOriginData dBHealthOriginData);

    @Update
    int b(List<DBHealthOriginData> list);

    @Query("select * from DBHealthOriginData where ssoid = :ssoid and start_time = :startTime and end_time = :endTime and device_unique_id = :deviceId and data_type = :dataType")
    List<DBHealthOriginData> c(String str, long j2, long j3, String str2, int i);

    @Query("select _id, client_data_id, device_unique_id, device_category, start_time, end_time, data_type, data, metadata, version, del, sync_status, modified_timestamp from DBHealthOriginData where ssoid = :ssoid and sync_status = 0 and end_time > start_time and start_time between :startTime and :endTime order by case when :sortOrder = 1 then start_time end desc, case when :sortOrder = 0 then start_time end asc limit :limitCount")
    List<DBHealthOriginData> d(long j2, long j3, int i, int i2, String str);

    @Query("select * from DBHealthOriginData where ssoid = :ssoid and ((start_time between :startTime and :endTime) or (end_time between :startTime and :endTime)) and data_type = :dataType order by start_time asc")
    List<DBHealthOriginData> e(String str, long j2, long j3, int i);

    @Insert(onConflict = 1)
    Long f(DBHealthOriginData dBHealthOriginData);

    @Query("select MAX(modified_timestamp) from DBHealthOriginData where ssoid = :ssoid and modified_timestamp between :startOfToday and :currentTime")
    long g(String str, long j2, long j3);
}
