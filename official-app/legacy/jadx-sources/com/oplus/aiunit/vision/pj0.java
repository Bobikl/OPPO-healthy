package com.oplus.aiunit.vision;

import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;
import com.heytap.databaseengineservice.db.table.atrialfibril.DBAtrialFibrilWarn;
import java.util.List;

/* JADX INFO: loaded from: classes15.dex */
@Dao
public interface pj0 {
    @Insert(onConflict = 1)
    List<Long> a(List<DBAtrialFibrilWarn> list);

    @Update
    int b(List<DBAtrialFibrilWarn> list);

    @Query("select * from DBAtrialFibrilWarn where ssoid = :ssoid and data_created_timestamp between :startTime and :endTime and warn_flag = :warnFlag order by case when :sortOrder = 1 then data_created_timestamp end desc, case when :sortOrder = 0 then data_created_timestamp end asc limit :limit")
    List<DBAtrialFibrilWarn> c(int i, String str, long j2, long j3, int i2, int i3);

    @Query("select '' as ssoid, client_data_id, device_unique_id, atrial_fibril_status, reliability, warn_flag, data_created_timestamp, modified_timestamp, sync_status, updated from DBAtrialFibrilWarn where ssoid = :ssoid and (sync_status = 0 or updated = 1) and warn_flag between 0 and 2 and data_created_timestamp between :startTime and :endTime order by case when :sortOrder = 1 then data_created_timestamp end desc, case when :sortOrder = 0 then data_created_timestamp end asc limit :limitCount")
    List<DBAtrialFibrilWarn> d(long j2, long j3, int i, int i2, String str);

    @Query("select * from DBAtrialFibrilWarn where ssoid = :ssoid and data_created_timestamp >= :startTime and data_created_timestamp <= :endTime order by data_created_timestamp desc")
    List<DBAtrialFibrilWarn> e(String str, long j2, long j3);

    @Query("select * from DBAtrialFibrilWarn where ssoid = :ssoid and data_created_timestamp between :startTime and :endTime and warn_flag = :warnFlag order by case when :sortOrder = 1 then data_created_timestamp end desc, case when :sortOrder = 0 then data_created_timestamp end asc")
    List<DBAtrialFibrilWarn> f(int i, String str, long j2, long j3, int i2);

    @Query("select MAX(modified_timestamp) from DBAtrialFibrilWarn where ssoid = :ssoid and modified_timestamp between :startOfToday and :currentTime")
    long g(String str, long j2, long j3);
}
