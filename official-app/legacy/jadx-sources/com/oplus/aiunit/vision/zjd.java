package com.oplus.aiunit.vision;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.RawQuery;
import androidx.room.Update;
import androidx.sqlite.db.SupportSQLiteQuery;
import com.heytap.databaseengineservice.db.table.DBOneTimeSportStat;
import java.util.List;

/* JADX INFO: loaded from: classes15.dex */
@Dao
public interface zjd {
    @Query("select * from DBOneTimeSportStat where ssoid = :ssoid and sport_mode in (:sportMode) and date = :date")
    List<DBOneTimeSportStat> a(String str, int[] iArr, int i);

    @Update
    int b(List<DBOneTimeSportStat> list);

    @Query("select MAX(modified_time) from DBOneTimeSportStat where ssoid = :ssoid")
    long c(String str);

    @Query("select * from DBOneTimeSportStat where ssoid = :ssoid and date between :startDate and :endDate")
    List<DBOneTimeSportStat> d(String str, int i, int i2);

    @Query("select _id, client_data_id, start_time, end_time, date, sport_mode, total_steps, total_distance, total_calories, total_altitude_offset, total_duration, max_duration, total_counts, total_abnormal_counts, fastest_pace, longest_distance, ox_max, british_fastest_pace, display, sync_status, updated, modified_time from DBOneTimeSportStat where ssoid = :ssoid and (sync_status = 0 or updated = 1) and date between :startDate and :endDate and start_time > 0 order by case when :sortOrder = 1 then date end desc, case when :sortOrder = 0 then date end asc limit :limitCount")
    List<DBOneTimeSportStat> e(int i, int i2, int i3, int i4, String str);

    @Insert(onConflict = 1)
    Long f(DBOneTimeSportStat dBOneTimeSportStat);

    @Query("select * from DBOneTimeSportStat where ssoid = :ssoid and date in (:dataList) and (sync_status = 0 or updated = 1)")
    List<DBOneTimeSportStat> g(List<Integer> list, String str);

    @RawQuery
    List<DBOneTimeSportStat> h(SupportSQLiteQuery supportSQLiteQuery);

    @Query("select * from DBOneTimeSportStat where ssoid = :ssoid and sport_mode = :sportMode and date = :date")
    DBOneTimeSportStat i(String str, int i, int i2);

    @Delete
    int j(DBOneTimeSportStat dBOneTimeSportStat);

    @Update
    int k(DBOneTimeSportStat dBOneTimeSportStat);

    @Query("select 0 as _id, device_unique_id, ssoid, start_time, :sportMode as sport_mode, end_time, sync_status, timezone, display, 0 as modified_time, updated, date, sum(total_steps) as total_steps, sum(total_distance) as total_distance, sum(total_calories) as total_calories, sum(total_duration) as total_duration, sum(total_altitude_offset) as total_altitude_offset, sum(total_counts) as total_counts, sum(total_abnormal_counts) as total_abnormal_counts, min(fastest_pace) as fastest_pace, max(longest_distance) as longest_distance, max(ox_max) as ox_max, min(british_fastest_pace) as british_fastest_pace, max(max_duration) as max_duration from DBOneTimeSportStat where ssoid = :ssoid and date = :date and sport_mode not in (:sportMode, -3, -4)and display != 2 group by date order by date desc limit 1")
    List<DBOneTimeSportStat> l(String str, int i, int i2);
}
