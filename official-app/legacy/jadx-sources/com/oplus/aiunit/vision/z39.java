package com.oplus.aiunit.vision;

import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.RawQuery;
import androidx.room.Update;
import androidx.sqlite.db.SupportSQLiteQuery;
import com.heytap.databaseengineservice.db.table.DBHeartRate;
import com.heytap.databaseengineservice.db.table.DBHeartRateDataStat;
import java.util.List;

/* JADX INFO: loaded from: classes15.dex */
@Dao
public interface z39 {
    @Insert(onConflict = 1)
    List<Long> a(List<DBHeartRate> list);

    @Update
    int b(List<DBHeartRate> list);

    @Query("select distinct _id, ssoid, device_type, device_unique_id, data_created_timestamp, heart_rate_type, avg(case when heart_rate_type = '4' then heart_rate_value end) as heart_rate_value, avg(case when heart_rate_type = '5' then heart_rate_value end) as display, sync_status, modified_timestamp, updated from DBHeartRate where ssoid = :ssoid and data_created_timestamp between :startTime and :endTime and display = :display and heart_rate_type in (4, 5) order by case when :sortOrder = 'asc' then data_created_timestamp end asc,  case when :sortOrder = 'desc' then data_created_timestamp end desc")
    List<DBHeartRate> c(String str, long j2, long j3, int i, String str2);

    @Query("select _id, '' as ssoid, client_data_id, device_type, device_unique_id, heart_rate_type, heart_rate_value, reliability, data_created_timestamp, display, modified_timestamp, sync_status, updated from DBHeartRate where ssoid = :ssoid and (sync_status = 0 or updated = 1) and data_created_timestamp between :startTime and :endTime order by case when :sortOrder = 1 then data_created_timestamp end desc, case when :sortOrder = 0 then data_created_timestamp end asc limit :limitCount")
    List<DBHeartRate> d(long j2, long j3, int i, int i2, String str);

    @Query("select * from DBHeartRate where ssoid = :ssoid and data_created_timestamp >= :startTime and data_created_timestamp <= :endTime order by data_created_timestamp desc")
    List<DBHeartRate> e(String str, long j2, long j3);

    @Query("delete from DBHeartRate where ssoid = :ssoid")
    int f(String str);

    @Query("select MAX(modified_timestamp) from DBHeartRate where ssoid = :ssoid and modified_timestamp between :startOfToday and :currentTime")
    long g(String str, long j2, long j3);

    @Query("select * from DBHeartRate where ssoid = :ssoid and data_created_timestamp between :startTime and :endTime and display = :display order by case when :sortOrder = 1 then data_created_timestamp end desc, case when :sortOrder = 0 then data_created_timestamp end asc")
    List<DBHeartRate> h(String str, long j2, long j3, int i, int i2);

    @RawQuery
    DBHeartRateDataStat i(SupportSQLiteQuery supportSQLiteQuery);

    @Query("select distinct _id, ssoid, device_type, device_unique_id, data_created_timestamp, heart_rate_type, heart_rate_value, display, sync_status, modified_timestamp, updated from DBHeartRate where ssoid = :ssoid and data_created_timestamp between :startTime and :endTime and display = :display and heart_rate_type = :heartRateType order by case when :sortOrder = 'asc' then data_created_timestamp end asc,  case when :sortOrder = 'desc' then data_created_timestamp end desc")
    List<DBHeartRate> j(String str, long j2, long j3, int i, int i2, String str2);

    @Query("select distinct _id, ssoid, device_type, device_unique_id, data_created_timestamp, heart_rate_type, heart_rate_value, display, sync_status, modified_timestamp, updated from DBHeartRate where ssoid = :ssoid and data_created_timestamp between :startTime and :endTime and display = :display and heart_rate_type not in (:heartRateType) group by data_created_timestamp order by case when :sortOrder = 'asc' then data_created_timestamp end asc,  case when :sortOrder = 'desc' then data_created_timestamp end desc")
    List<DBHeartRate> k(String str, long j2, long j3, int i, int[] iArr, String str2);

    @RawQuery
    List<DBHeartRateDataStat> l(SupportSQLiteQuery supportSQLiteQuery);

    @RawQuery
    List<DBHeartRate> m(SupportSQLiteQuery supportSQLiteQuery);
}
