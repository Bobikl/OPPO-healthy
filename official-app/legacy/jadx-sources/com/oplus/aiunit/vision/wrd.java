package com.oplus.aiunit.vision;

import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.RawQuery;
import androidx.room.Update;
import androidx.sqlite.db.SupportSQLiteQuery;
import com.heytap.databaseengineservice.db.table.snore.DBOsaResult;
import java.util.List;

/* JADX INFO: loaded from: classes15.dex */
@Dao
public interface wrd {
    @Insert(onConflict = 1)
    List<Long> a(List<DBOsaResult> list);

    @Update
    int b(List<DBOsaResult> list);

    @Query("select max(modified_timestamp) from DBOsaResult where ssoid = :ssoid")
    long c(String str);

    @Query("select * from DBOsaResult where ssoid = :ssoid and date between :startDate and :endDate")
    List<DBOsaResult> d(String str, int i, int i2);

    @Query("select '' as ssoid, date, timezone, first_sleep_time, last_sleep_time, first_spo2_time, last_spo2_time, first_hrv_time, last_hrv_time, first_snore_info_time, last_snore_info_time, record_time_interval, osa_level, snore_result_bean, typical_fragment, typical_fragment_num, osa_feature, sleep_breath_type, invalid_spo2_ratio, snore_ratio, extension, sync_status, updated, modified_timestamp, updated, version, snore_file_id_list, ahi, from_type, silenced_ratio, silenced_time from DBOsaResult where ssoid = :ssoid and (sync_status = 0 or updated = 1) and first_sleep_time > 0 and date between :startDate and :endDate order by case when :sortOrder = 1 then date end desc, case when :sortOrder = 0 then date end asc limit :limitCount ")
    List<DBOsaResult> e(int i, int i2, int i3, int i4, String str);

    @Query("delete from DBOsaResult where ssoid = :ssoid")
    int f(String str);

    @Query("select * from DBOsaResult where ssoid = :ssoid and date in (:dateList) and (sync_status = 0 or updated = 1)")
    List<DBOsaResult> g(List<Integer> list, String str);

    @Query("select * from DBOsaResult where ssoid = :ssoid and date = :date")
    DBOsaResult h(String str, int i);

    @Query("select * from DBOsaResult where ssoid = :ssoid and date between :startDate and :endDate order by case when :sortOrder = 1 then date end desc, case when :sortOrder = 0 then date end asc limit :count")
    List<DBOsaResult> i(String str, int i, int i2, int i3, int i4);

    @Query("select snore_file_id_list from DBOsaResult where ssoid = :ssoid and date not in (select date from DBSnoreDbFileInfo where ssoid = :ssoid group by date) and length(snore_file_id_list) > 32")
    List<String> j(String str);

    @Query("select * from DBOsaResult where ssoid = :ssoid and date = :date and version = :version")
    DBOsaResult k(String str, int i, int i2);

    @Update
    int l(DBOsaResult dBOsaResult);

    @Query("select * from DBOsaResult where ssoid = :ssoid and version in (:intConditionArray) and date between :startDate and :endDate")
    List<DBOsaResult> m(String str, int[] iArr, int i, int i2);

    @Insert(onConflict = 1)
    Long n(DBOsaResult dBOsaResult);

    @RawQuery
    List<DBOsaResult> o(SupportSQLiteQuery supportSQLiteQuery);

    @Query("select * from DBOsaResult where ssoid = :ssoid and version in (:intConditionArray) and date between :startDate and :endDate order by case when :sortOrder = 1 then date end desc, case when :sortOrder = 0 then date end asc limit :count")
    List<DBOsaResult> p(String str, int[] iArr, int i, int i2, int i3, int i4);
}
