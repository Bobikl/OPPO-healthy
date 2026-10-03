package com.oplus.aiunit.vision;

import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.RawQuery;
import androidx.room.Update;
import androidx.sqlite.db.SupportSQLiteQuery;
import com.heytap.databaseengineservice.db.table.bloodoxygensaturation.DBBloodOxygenSaturationDataStat;
import java.util.List;

/* JADX INFO: loaded from: classes15.dex */
@Dao
public interface mm1 {
    @Insert(onConflict = 1)
    List<Long> a(List<DBBloodOxygenSaturationDataStat> list);

    @Update
    int b(List<DBBloodOxygenSaturationDataStat> list);

    @Query("select MAX(modified_timestamp) from DBBloodOxygenSaturationDataStat where ssoid = :ssoid")
    long c(String str);

    @Query("select * from DBBloodOxygenSaturationDataStat where ssoid = :ssoid and date between :startDate and :endDate and min_blood_oxygen_saturation > 0 and max_blood_oxygen_saturation >= min_blood_oxygen_saturation")
    List<DBBloodOxygenSaturationDataStat> d(String str, int i, int i2);

    @Query("select _id, client_data_id, date, max_blood_oxygen_saturation, min_blood_oxygen_saturation, average_blood_oxygen_saturation, blood_oxygen_saturation_drop, low_blood_oxygen_saturation_total_time, low_blood_oxygen_saturation_day, metadata, sync_status, timezone, updated, modified_timestamp from DBBloodOxygenSaturationDataStat where ssoid = :ssoid and (sync_status = 0 or updated = 1) and date between :startDate and :endDate and min_blood_oxygen_saturation > 0 and max_blood_oxygen_saturation >= min_blood_oxygen_saturation order by case when :sortOrder = 1 then date end desc, case when :sortOrder = 0 then date end asc limit :limitCount")
    List<DBBloodOxygenSaturationDataStat> e(int i, int i2, int i3, int i4, String str);

    @Query("delete from DBBloodOxygenSaturationDataStat where ssoid = :ssoid")
    int f(String str);

    @Query("select * from DBBloodOxygenSaturationDataStat where ssoid = :ssoid and date in (:dateList) and (sync_status = 0 or updated = 1)")
    List<DBBloodOxygenSaturationDataStat> g(List<Integer> list, String str);

    @Query("select min(date) from DBBloodOxygenSaturationDataStat where ssoid = :ssoid and date >= :oldestDay")
    int h(String str, int i);

    @Query("select MAX(date) from DBBloodOxygenSaturationDataStat where ssoid = :ssoid and date <= :today")
    int j(String str, int i);

    @Query("select * from DBBloodOxygenSaturationDataStat where ssoid = :ssoid and date = :date and min_blood_oxygen_saturation > 0 and max_blood_oxygen_saturation >= min_blood_oxygen_saturation")
    DBBloodOxygenSaturationDataStat k(String str, int i);

    @Insert(onConflict = 1)
    Long l(DBBloodOxygenSaturationDataStat dBBloodOxygenSaturationDataStat);

    @Update
    int m(DBBloodOxygenSaturationDataStat dBBloodOxygenSaturationDataStat);

    @RawQuery
    List<DBBloodOxygenSaturationDataStat> n(SupportSQLiteQuery supportSQLiteQuery);
}
