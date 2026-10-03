package com.oplus.aiunit.vision;

import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;
import com.heytap.databaseengineservice.db.table.DBSpo2Warning;
import java.util.List;

/* JADX INFO: loaded from: classes15.dex */
@Dao
public interface d9i {
    @Insert(onConflict = 1)
    List<Long> a(List<DBSpo2Warning> list);

    @Update
    int b(List<DBSpo2Warning> list);

    @Query("select MAX(modified_timestamp) from DBSpo2Warning where ssoid = :ssoid")
    long c(String str);

    @Query("select * from DBSpo2Warning where ssoid = :ssoid and (sync_status = 0 or updated = 1) and start_timestamp between :startTime and :endTime order by case when :sortOrder = 1 then start_timestamp end desc, case when :sortOrder = 0 then start_timestamp end asc limit :limitCount")
    List<DBSpo2Warning> d(long j2, long j3, int i, int i2, String str);

    @Query("select * from DBSpo2Warning where ssoid = :ssoid and start_timestamp between :startTime and :endTime order by case when :sortOrder = 1 then start_timestamp end desc, case when :sortOrder = 0 then start_timestamp end asc limit :limit")
    List<DBSpo2Warning> e(long j2, long j3, int i, int i2, String str);

    @Query("delete from DBSpo2Warning where ssoid = :ssoid")
    int f(String str);

    @Query("select * from DBSpo2Warning where ssoid = :ssoid and start_timestamp between :startTime and :endTime order by :sortOrder")
    List<DBSpo2Warning> g(String str, long j2, long j3, String str2);

    @Query("select count(start_timestamp) from DBSpo2Warning where ssoid = :ssoid and start_timestamp between :startTime and :endTime")
    long h(long j2, long j3, String str);
}
