package com.oplus.aiunit.vision;

import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.RawQuery;
import androidx.room.Update;
import androidx.sqlite.db.SupportSQLiteQuery;
import com.heytap.databaseengineservice.db.table.DBHearingHealthStat;
import java.util.List;

/* JADX INFO: loaded from: classes15.dex */
@Dao
public interface ly8 {
    @Insert(onConflict = 1)
    Long a(DBHearingHealthStat dBHearingHealthStat);

    @Update(onConflict = 1)
    int b(List<DBHearingHealthStat> list);

    @Query("select MAX(modified_timestamp) from DBHearingHealthStatTable where ssoid = :ssoid")
    long c(String str);

    @Query("select * from DBHearingHealthStatTable where ssoid = :ssoid and date between :startDate and :endDate")
    List<DBHearingHealthStat> d(String str, int i, int i2);

    @Query("select '' as ssoid, '' as device_unique_id, date, timezone, total_duration, max_value, min_value, average_value, exposure, extension, sync_status, modified_timestamp, updated from DBHearingHealthStatTable where ssoid = :ssoid and (sync_status = 0 or updated = 1) and date between :startDate and :endDate order by case when :sortOrder = 1 then date end desc, case when :sortOrder = 0 then date end asc limit :limitCount")
    List<DBHearingHealthStat> e(int i, int i2, int i3, int i4, String str);

    @RawQuery
    List<DBHearingHealthStat> f(SupportSQLiteQuery supportSQLiteQuery);

    @Query("select * from DBHearingHealthStatTable where ssoid = :ssoid and date in (:dataList) and (sync_status = 0 or updated = 1)")
    List<DBHearingHealthStat> g(String str, List<Integer> list);

    @Update(onConflict = 1)
    int h(DBHearingHealthStat dBHearingHealthStat);

    @Query("select * from DBHearingHealthStatTable where ssoid = :ssoid and date = :date")
    DBHearingHealthStat k(String str, int i);
}
