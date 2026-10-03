package com.oplus.aiunit.vision;

import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.RawQuery;
import androidx.room.Update;
import androidx.sqlite.db.SupportSQLiteQuery;
import com.heytap.databaseengineservice.db.table.stress.DBStress;
import com.heytap.databaseengineservice.db.table.stress.DBStressDataStat;
import java.util.List;

/* JADX INFO: loaded from: classes15.dex */
@Dao
public interface jxi {
    @Insert(onConflict = 1)
    List<Long> a(List<DBStress> list);

    @Update
    int b(List<DBStress> list);

    @RawQuery
    DBStressDataStat c(SupportSQLiteQuery supportSQLiteQuery);

    @Query("select _id, '' as ssoid, client_data_id, device_unique_id, device_name, stress_type, stress_value, data_created_timestamp, display, modified_timestamp, sync_status, updated, sdnn, rmssd from DBStressTable where ssoid = :ssoid and (sync_status = 0 or updated = 1) and data_created_timestamp between :startTime and :endTime and stress_type >= 0 order by case when :sortOrder = 1 then data_created_timestamp end desc, case when :sortOrder = 0 then data_created_timestamp end asc limit :limitCount")
    List<DBStress> d(long j2, long j3, int i, int i2, String str);

    @Query("select * from DBStressTable where ssoid = :ssoid and data_created_timestamp >= :startTime and data_created_timestamp <= :endTime order by data_created_timestamp desc")
    List<DBStress> e(String str, long j2, long j3);

    @Query("delete from DBStressTable where ssoid = :ssoid")
    int f(String str);

    @Query("select MAX(modified_timestamp) from DBStressTable where ssoid = :ssoid and modified_timestamp between :startOfToday and :currentTime")
    long g(String str, long j2, long j3);

    @RawQuery
    List<DBStressDataStat> h(SupportSQLiteQuery supportSQLiteQuery);

    @Query("select * from DBStressTable where ssoid = :ssoid and data_created_timestamp between :startTime and :endTime and display = :display order by case when :sortOrder = 1 then data_created_timestamp end desc, case when :sortOrder = 0 then data_created_timestamp end asc")
    List<DBStress> i(String str, long j2, long j3, int i, int i2);

    @RawQuery
    List<DBStress> j(SupportSQLiteQuery supportSQLiteQuery);
}
