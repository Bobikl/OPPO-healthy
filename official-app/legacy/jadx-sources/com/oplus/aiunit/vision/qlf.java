package com.oplus.aiunit.vision;

import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.RawQuery;
import androidx.room.Update;
import androidx.sqlite.db.SupportSQLiteQuery;
import com.heytap.databaseengineservice.db.table.relax.DBRelax;
import com.heytap.databaseengineservice.db.table.relax.DBRelaxStat;
import java.util.List;

/* JADX INFO: loaded from: classes15.dex */
@Dao
public interface qlf {
    @Insert(onConflict = 1)
    List<Long> a(List<DBRelax> list);

    @Update
    int b(List<DBRelax> list);

    @Query("select MAX(modified_timestamp) from DBRelax where ssoid = :ssoid")
    long c(String str);

    @Query("select client_data_id, '' as ssoid, device_unique_id, start_timestamp, relax_duration, max_hr, min_hr, stress_value, physical_mental, physical_mental_state, type, sub_type, hr_detail, version, extension, display, sync_status, modified_timestamp, updated from DBRelax where ssoid = :ssoid and (sync_status = 0 or updated = 1) and type > 0 and sub_type > 0 and start_timestamp between :startTime and :endTime order by case when :sortOrder = 1 then start_timestamp end desc, case when :sortOrder = 0 then start_timestamp end asc limit :limitCount")
    List<DBRelax> d(long j2, long j3, int i, int i2, String str);

    @Query("select * from DBRelax where ssoid = :ssoid and start_timestamp >= :startTime and start_timestamp <= :endTime order by start_timestamp desc")
    List<DBRelax> e(String str, long j2, long j3);

    @Query("select * from DBRelax where ssoid = :ssoid and start_timestamp between :startTime and :endTime and display = 1 and type = :type order by start_timestamp desc")
    List<DBRelax> f(String str, long j2, long j3, int i);

    @RawQuery
    List<DBRelaxStat> g(SupportSQLiteQuery supportSQLiteQuery);

    @Query("select * from DBRelax where ssoid = :ssoid and start_timestamp between :startTime and :endTime and display != 2 order by start_timestamp desc")
    List<DBRelax> h(String str, long j2, long j3);
}
