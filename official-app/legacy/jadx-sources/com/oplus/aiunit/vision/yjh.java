package com.oplus.aiunit.vision;

import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.RawQuery;
import androidx.room.Update;
import androidx.sqlite.db.SupportSQLiteQuery;
import com.heytap.databaseengineservice.db.table.DBSleepIndex;
import java.util.List;

/* JADX INFO: loaded from: classes15.dex */
@Dao
public interface yjh {
    @Insert(onConflict = 1)
    List<Long> a(List<DBSleepIndex> list);

    @Update
    int b(List<DBSleepIndex> list);

    @Query("select MAX(modified_timestamp) from DBSleepIndex where ssoid = :ssoid")
    long c(String str);

    @Query("select * from DBSleepIndex where ssoid = :ssoid and (sync_status = 0 or updated = 1) and data_created_timestamp between :startTime and :endTime order by case when :sortOrder = 1 then data_created_timestamp end desc, case when :sortOrder = 0 then data_created_timestamp end asc limit :limitCount")
    List<DBSleepIndex> d(long j2, long j3, int i, int i2, String str);

    @Query("select * from DBSleepIndex where ssoid = :ssoid and data_created_timestamp >= :startTime and data_created_timestamp <= :endTime order by data_created_timestamp desc")
    List<DBSleepIndex> e(String str, long j2, long j3);

    @Query("delete from DBSleepIndex where ssoid = :ssoid")
    int f(String str);

    @Query("select * from DBSleepIndex where ssoid = :ssoid and device_unique_id = :dataClient and data_created_timestamp between :startTime and :endTime order by data_created_timestamp desc")
    List<DBSleepIndex> g(String str, String str2, long j2, long j3);

    @Query("select * from DBSleepIndex where ssoid = :ssoid and data_created_timestamp between :startTime and :endTime order by data_created_timestamp desc limit :limit")
    List<DBSleepIndex> h(String str, long j2, long j3, int i);

    @Query("select * from DBSleepIndex where ssoid = :ssoid and data_created_timestamp between :startTime and :endTime order by data_created_timestamp desc")
    List<DBSleepIndex> i(String str, long j2, long j3);

    @Query("select * from DBSleepIndex where ssoid = :ssoid and data_created_timestamp in (:dateList) and sync_status = 0")
    List<DBSleepIndex> j(List<Long> list, String str);

    @RawQuery
    List<DBSleepIndex> k(SupportSQLiteQuery supportSQLiteQuery);

    @Query("select * from DBSleepIndex where ssoid = :ssoid and device_unique_id = :dataClient and data_created_timestamp between :startTime and :endTime order by data_created_timestamp desc limit :limit")
    List<DBSleepIndex> l(String str, String str2, long j2, long j3, int i);
}
