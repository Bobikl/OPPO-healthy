package com.oplus.aiunit.vision;

import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;
import com.heytap.databaseengineservice.db.table.DBHeartRateWarning;
import java.util.List;

/* JADX INFO: loaded from: classes15.dex */
@Dao
public interface j79 {
    @Insert(onConflict = 1)
    List<Long> a(List<DBHeartRateWarning> list);

    @Update
    int b(List<DBHeartRateWarning> list);

    @Query("select MAX(modified_timestamp) from DBHeartRateWarning where ssoid = :ssoid")
    long c(String str);

    @Query("select * from DBHeartRateWarning where ssoid = :ssoid and (sync_status = 0 or updated = 1) and start_timestamp between :startTime and :endTime order by case when :sortOrder = 1 then start_timestamp end desc, case when :sortOrder = 0 then start_timestamp end asc limit :limitCount")
    List<DBHeartRateWarning> d(long j2, long j3, int i, int i2, String str);

    @Query("select * from DBHeartRateWarning where ssoid = :ssoid and start_timestamp >= :startTime and start_timestamp <= :endTime group by start_timestamp order by start_timestamp desc")
    List<DBHeartRateWarning> e(String str, long j2, long j3);

    @Query("delete from DBHeartRateWarning where ssoid = :ssoid")
    int f(String str);

    @Query("select start_timestamp from DBHeartRateWarning where ssoid = :ssoid and start_timestamp >= :startTime and start_timestamp <= :endTime order by start_timestamp asc")
    List<Long> g(String str, long j2, long j3);

    @Query("select * from DBHeartRateWarning where ssoid = :ssoid and start_timestamp between :startTime and :endTime order by case when :sortOrder = 1 then start_timestamp end desc, case when :sortOrder = 0 then start_timestamp end asc")
    List<DBHeartRateWarning> h(String str, long j2, long j3, int i);

    @Query("select count(start_timestamp) from DBHeartRateWarning where ssoid = :ssoid and start_timestamp between :startTime and :endTime and warning_heart_rate_type = :heartRateType")
    long i(long j2, long j3, int i, String str);

    @Query("select * from DBHeartRateWarning where ssoid = :ssoid and start_timestamp between :startTime and :endTime and warning_heart_rate_type = :heartRateType order by case when :sortOrder = 1 then start_timestamp end desc, case when :sortOrder = 0 then start_timestamp end asc limit :limit")
    List<DBHeartRateWarning> j(long j2, long j3, int i, int i2, int i3, String str);
}
