package com.oplus.aiunit.vision;

import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;
import com.heytap.databaseengineservice.db.table.snore.DBSnoreEnvNoise;
import java.util.List;

/* JADX INFO: loaded from: classes15.dex */
@Dao
public interface hvh {
    @Insert(onConflict = 1)
    List<Long> a(List<DBSnoreEnvNoise> list);

    @Update
    int b(List<DBSnoreEnvNoise> list);

    @Query("select * from DBSnoreEnvNoise where ssoid = :ssoid and (sync_status = 0 or updated = 1) and data_created_timestamp between :startTime and :endTime order by case when :sortOrder = 1 then data_created_timestamp end desc, case when :sortOrder = 0 then data_created_timestamp end asc limit :limitCount")
    List<DBSnoreEnvNoise> d(long j2, long j3, int i, int i2, String str);

    @Query("delete from DBSnoreEnvNoise where ssoid = :ssoid")
    int f(String str);

    @Query("select MAX(modified_timestamp) from DBSnoreEnvNoise where ssoid = :ssoid and modified_timestamp between :startOfToday and :currentTime")
    long g(String str, long j2, long j3);

    @Query("select * from DBSnoreEnvNoise where ssoid = :ssoid and data_created_timestamp between :startTime and :endTime and display = :display group by data_created_timestamp order by data_created_timestamp asc")
    List<DBSnoreEnvNoise> h(String str, long j2, long j3, int i);

    @Query("select * from DBSnoreEnvNoise where ssoid = :ssoid and data_created_timestamp between :startTime and :endTime and display = :display order by data_created_timestamp asc limit :limit")
    List<DBSnoreEnvNoise> i(String str, long j2, long j3, int i, int i2);
}
