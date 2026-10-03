package com.oplus.aiunit.vision;

import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.RawQuery;
import androidx.room.Update;
import androidx.sqlite.db.SupportSQLiteQuery;
import com.heytap.databaseengineservice.db.table.DBBreathRate;
import java.util.List;

/* JADX INFO: loaded from: classes15.dex */
@Dao
public interface x52 {
    @Insert(onConflict = 1)
    List<Long> a(List<DBBreathRate> list);

    @Update
    int b(List<DBBreathRate> list);

    @Query("select * from DBBreathRate where ssoid = :ssoid and data_created_timestamp between :startTime and :endTime and display = :display order by case when :sortOrder =1 then data_created_timestamp end desc, case when :sortOrder = 0 then data_created_timestamp end asc limit :limit")
    List<DBBreathRate> c(String str, long j2, long j3, int i, int i2, int i3);

    @Query("select * from DBBreathRate where ssoid = :ssoid and (sync_status = 0 or updated = 1) and data_created_timestamp between :startTime and :endTime order by case when :sortOrder = 1 then data_created_timestamp end desc, case when :sortOrder = 0 then data_created_timestamp end asc limit :limitCount")
    List<DBBreathRate> d(long j2, long j3, int i, int i2, String str);

    @Query("select * from DBBreathRate where ssoid = :ssoid and data_created_timestamp >= :startTime and data_created_timestamp <= :endTime order by data_created_timestamp desc")
    List<DBBreathRate> e(String str, long j2, long j3);

    @Query("delete from DBBreathRate where ssoid = :ssoid")
    int f(String str);

    @Query("select MAX(modified_timestamp) from DBBreathRate where ssoid = :ssoid and modified_timestamp between :startOfToday and :currentTime")
    long g(String str, long j2, long j3);

    @Query("select * from DBBreathRate where ssoid = :ssoid and data_created_timestamp between :startTime and :endTime and display = :display group by data_created_timestamp order by case when :sortOrder =1 then data_created_timestamp end desc, case when :sortOrder = 0 then data_created_timestamp end asc")
    List<DBBreathRate> j(String str, long j2, long j3, int i, int i2);

    @RawQuery
    List<DBBreathRate> k(SupportSQLiteQuery supportSQLiteQuery);
}
