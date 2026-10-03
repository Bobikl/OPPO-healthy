package com.oplus.aiunit.vision;

import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.RawQuery;
import androidx.room.Update;
import androidx.sqlite.db.SupportSQLiteQuery;
import com.heytap.databaseengineservice.db.table.bloodoxygensaturation.DBBloodOxygenSaturation;
import com.heytap.databaseengineservice.db.table.bloodoxygensaturation.DBBloodOxygenSaturationDataStat;
import java.util.List;

/* JADX INFO: loaded from: classes15.dex */
@Dao
public interface hm1 {
    @Insert(onConflict = 1)
    List<Long> a(List<DBBloodOxygenSaturation> list);

    @Update
    int b(List<DBBloodOxygenSaturation> list);

    @Query("select _id, '' as ssoid, client_data_id, device_unique_id, blood_oxygen_saturation_type, blood_oxygen_saturation_value, data_created_timestamp, display, modified_timestamp, sync_status, updated from DBBloodOxygenSaturation where ssoid = :ssoid and (sync_status = 0 or updated = 1) and data_created_timestamp between :startTime and :endTime and blood_oxygen_saturation_type >= 0 and blood_oxygen_saturation_type <= 10 order by case when :sortOrder = 1 then data_created_timestamp end desc, case when :sortOrder = 0 then data_created_timestamp end asc limit :limitCount")
    List<DBBloodOxygenSaturation> d(long j2, long j3, int i, int i2, String str);

    @Query("select * from DBBloodOxygenSaturation where ssoid = :ssoid and data_created_timestamp >= :startTime and data_created_timestamp <= :endTime order by data_created_timestamp desc")
    List<DBBloodOxygenSaturation> e(String str, long j2, long j3);

    @Query("delete from DBBloodOxygenSaturation where ssoid = :ssoid")
    int f(String str);

    @Query("select MAX(modified_timestamp) from DBBloodOxygenSaturation where ssoid = :ssoid and modified_timestamp between :startOfToday and :currentTime")
    long g(String str, long j2, long j3);

    @Query("select count(*) from DBBloodOxygenSaturation where ssoid = :ssoid and data_created_timestamp between :startTime and :endTime and display = 1 and blood_oxygen_saturation_type in (:type) and blood_oxygen_saturation_value < 90")
    int h(String str, long j2, long j3, int[] iArr);

    @Query("select _id, ssoid, device_unique_id, :date as date, max(blood_oxygen_saturation_value) as max_blood_oxygen_saturation, 0 as blood_oxygen_saturation_drop, 0 as low_blood_oxygen_saturation_total_time, 0 as low_blood_oxygen_saturation_day,  min(blood_oxygen_saturation_value) as min_blood_oxygen_saturation, avg(blood_oxygen_saturation_value) as average_blood_oxygen_saturation, sync_status, 0 as modified_timestamp, updated from DBBloodOxygenSaturation where ssoid = :ssoid and data_created_timestamp >= :startTime and data_created_timestamp <= :endTime  and blood_oxygen_saturation_type in (:types) and display = 1 order by data_created_timestamp desc limit 1")
    DBBloodOxygenSaturationDataStat i(String str, long j2, long j3, int i, List<Integer> list);

    @Query("select * from DBBloodOxygenSaturation where ssoid = :ssoid and display = :display order by data_created_timestamp desc")
    List<DBBloodOxygenSaturation> j(String str, int i);

    @Query("select * from DBBloodOxygenSaturation where ssoid = :ssoid and data_created_timestamp between :startTime and :endTime and display = :display and blood_oxygen_saturation_type in (:spo2Type) order by case when :sortOrder = 1 then data_created_timestamp end desc, case when :sortOrder = 0 then data_created_timestamp end asc limit :limit")
    List<DBBloodOxygenSaturation> k(String str, long j2, long j3, int i, int i2, List<Integer> list, int i3);

    @Query("select * from DBBloodOxygenSaturation where ssoid = :ssoid and data_created_timestamp between :startTime and :endTime and display = :display and blood_oxygen_saturation_type in (:spo2Type) order by case when :sortOrder = 1 then data_created_timestamp end desc, case when :sortOrder = 0 then data_created_timestamp end asc")
    List<DBBloodOxygenSaturation> l(String str, long j2, long j3, int i, List<Integer> list, int i2);

    @RawQuery
    DBBloodOxygenSaturationDataStat m(SupportSQLiteQuery supportSQLiteQuery);
}
