package com.oplus.aiunit.vision;

import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;
import com.heytap.databaseengineservice.db.table.DBTumbleRecord;
import java.util.List;

/* JADX INFO: loaded from: classes15.dex */
@Dao
public interface wck {
    @Insert(onConflict = 1)
    List<Long> a(List<DBTumbleRecord> list);

    @Update
    int b(List<DBTumbleRecord> list);

    @Query("select max(data_created_timestamp) from DBTumbleRecord where ssoid = :ssoid and sync_status = 1")
    long c(String str);

    @Query("select '' as ssoid, device_unique_id, state, data_created_timestamp, display, modified_timestamp, sync_status, updated from DBTumbleRecord where ssoid = :ssoid and (sync_status = 0 or updated = 1) and data_created_timestamp between :startTime and :endTime order by case when :sortOrder = 1 then data_created_timestamp end desc, case when :sortOrder = 0 then data_created_timestamp end asc limit :limitCount")
    List<DBTumbleRecord> d(long j2, long j3, int i, int i2, String str);

    @Query("select * from DBTumbleRecord where ssoid = :ssoid and data_created_timestamp >= :startTime and data_created_timestamp <= :endTime order by data_created_timestamp desc")
    List<DBTumbleRecord> e(String str, long j2, long j3);
}
