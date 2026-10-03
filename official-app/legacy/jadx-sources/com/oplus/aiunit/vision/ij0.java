package com.oplus.aiunit.vision;

import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;
import com.heytap.databaseengineservice.db.table.atrialfibril.DBAtrialFibrilDetail;
import java.util.List;

/* JADX INFO: loaded from: classes15.dex */
@Dao
public interface ij0 {
    @Insert(onConflict = 1)
    List<Long> a(List<DBAtrialFibrilDetail> list);

    @Update
    int b(List<DBAtrialFibrilDetail> list);

    @Query("select '' as ssoid, client_data_id, device_unique_id, atrial_fibril_status, reliability, warn_flag, data_created_timestamp, display, modified_timestamp, sync_status, updated from DBAtrialFibrilDetail where ssoid = :ssoid and (sync_status = 0 or updated = 1) and data_created_timestamp between :startTime and :endTime order by case when :sortOrder = 1 then data_created_timestamp end desc, case when :sortOrder = 0 then data_created_timestamp end asc limit :limitCount")
    List<DBAtrialFibrilDetail> d(long j2, long j3, int i, int i2, String str);

    @Query("select * from DBAtrialFibrilDetail where ssoid = :ssoid and data_created_timestamp >= :startTime and data_created_timestamp <= :endTime order by data_created_timestamp desc")
    List<DBAtrialFibrilDetail> e(String str, long j2, long j3);

    @Query("select MAX(modified_timestamp) from DBAtrialFibrilDetail where ssoid = :ssoid and modified_timestamp between :startOfToday and :currentTime")
    long g(String str, long j2, long j3);

    @Query("select * from DBAtrialFibrilDetail where ssoid = :ssoid and data_created_timestamp between :startTime and :endTime and display = :display order by case when :sortOrder = 1 then data_created_timestamp end desc, case when :sortOrder = 0 then data_created_timestamp end asc")
    List<DBAtrialFibrilDetail> j(String str, long j2, long j3, int i, int i2);

    @Query("select * from DBAtrialFibrilDetail where ssoid = :ssoid and data_created_timestamp between :startTime and :endTime and display = :display order by case when :sortOrder = 1 then data_created_timestamp end desc, case when :sortOrder = 0 then data_created_timestamp end asc limit :limit")
    List<DBAtrialFibrilDetail> k(String str, long j2, long j3, int i, int i2, int i3);
}
