package com.oplus.aiunit.vision;

import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;
import com.heytap.databaseengineservice.db.table.snore.DBSnoreFeature;
import java.util.List;

/* JADX INFO: loaded from: classes15.dex */
@Dao
public interface ewh {
    @Insert(onConflict = 1)
    List<Long> a(List<DBSnoreFeature> list);

    @Update
    int b(List<DBSnoreFeature> list);

    @Query("select '' as ssoid, device_unique_id, record_start_timestamp, record_end_timestamp, snore_start_timestamp, snore_end_timestamp, features, display, sync_status, updated, modified_timestamp from DBSnoreFeature where ssoid = :ssoid and (sync_status = 0 or updated = 1) and snore_start_timestamp between :startTime and :endTime order by case when :sortOrder = 1 then snore_start_timestamp end desc, case when :sortOrder = 0 then snore_start_timestamp end asc limit :limitCount")
    List<DBSnoreFeature> d(long j2, long j3, int i, int i2, String str);

    @Query("select MAX(modified_timestamp) from DBSnoreFeature where ssoid = :ssoid and modified_timestamp between :startOfToday and :currentTime")
    long g(String str, long j2, long j3);

    @Query("select * from DBSnoreFeature where ssoid = :ssoid and snore_start_timestamp between :startTime and :endTime and display = :display group by snore_start_timestamp order by snore_start_timestamp asc")
    List<DBSnoreFeature> h(String str, long j2, long j3, int i);

    @Query("select * from DBSnoreFeature where ssoid = :ssoid and snore_start_timestamp between :startTime and :endTime and display = :display order by snore_start_timestamp asc limit :limit")
    List<DBSnoreFeature> i(String str, long j2, long j3, int i, int i2);
}
