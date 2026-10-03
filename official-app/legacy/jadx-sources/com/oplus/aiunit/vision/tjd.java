package com.oplus.aiunit.vision;

import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.RawQuery;
import androidx.room.Update;
import androidx.sqlite.db.SimpleSQLiteQuery;
import androidx.sqlite.db.SupportSQLiteQuery;
import com.heytap.databaseengineservice.db.table.DBOneTimeSport;
import java.util.List;

/* JADX INFO: loaded from: classes15.dex */
@Dao
public interface tjd {
    @Query("select * from DBOneTimeSport where ssoid = :ssoid and start_time between :startTime and :endTime and display != 2 order by case when :sortOrder = 1 then start_time end desc,case when :sortOrder = 0 then start_time end asc limit :limitCount")
    List<DBOneTimeSport> A(long j2, long j3, int i, int i2, String str);

    @Query("select * from DBOneTimeSport where ssoid = :ssoid and sport_mode in (:sportModes) and device_category in (:deviceCategory) order by start_time desc limit :count")
    DBOneTimeSport B(String str, List<Integer> list, List<String> list2, int i);

    @Query("select * from DBOneTimeSport where client_data_id = :clientDataId")
    List<DBOneTimeSport> C(String str);

    @Insert(onConflict = 1)
    Long D(DBOneTimeSport dBOneTimeSport);

    @Query("select _id, client_data_id, ssoid, device_unique_id, device_category, start_time, end_time, sport_mode, app_source, data_version, meta_data, display, sync_status, timezone, modified_time, updated, included_rhr from DBOneTimeSport where ssoid = :ssoid and start_time between :startTime and :endTime and display != 2 order by start_time desc limit :count")
    List<DBOneTimeSport> E(long j2, long j3, int i, String str);

    @Insert(onConflict = 1)
    List<Long> a(List<DBOneTimeSport> list);

    @Update
    int b(List<DBOneTimeSport> list);

    @Query("select MAX(modified_time) from DBOneTimeSport where ssoid = :ssoid and device_category != 'THIRD'")
    long c(String str);

    @RawQuery
    int d(SimpleSQLiteQuery simpleSQLiteQuery);

    @Query("select * from DBOneTimeSport where ssoid = :ssoid and client_data_id = :dataId")
    DBOneTimeSport f(String str, String str2);

    @Query("select * from DBOneTimeSport where ssoid = :ssoid and ((start_time between :startTime and :endTime) and (end_time between :startTime and :endTime)) and display != 2 and sport_mode in (:sportModes)")
    List<DBOneTimeSport> g(String str, long j2, long j3, List<Integer> list);

    @Query("select * from DBOneTimeSport where ssoid = :ssoid and start_time between :startTime and :endTime and display != 2 order by start_time desc")
    List<DBOneTimeSport> h(String str, long j2, long j3);

    @Query("select * from DBOneTimeSport where ssoid = :ssoid and start_time between :startTime and :endTime order by start_time desc limit :count")
    List<DBOneTimeSport> i(long j2, long j3, int i, String str);

    @Query("select * from DBOneTimeSport where ssoid = :ssoid and display != 2 and start_time in (select start_timestamp from DBTrackMetadata where ssoid = :ssoid and abnormal_track = 1000 and start_timestamp between :startTime and :endTime order by start_timestamp desc limit :count) order by start_time desc, modified_time desc")
    List<DBOneTimeSport> j(long j2, long j3, int i, String str);

    @Query("select * from DBOneTimeSport where ssoid = :ssoid and start_time = :startTime and end_time = :endTime and sport_mode = :sportMode and display != 2")
    List<DBOneTimeSport> k(String str, long j2, long j3, int i);

    @Query("select * from DBOneTimeSport where _id in (:ids)")
    List<DBOneTimeSport> l(List<Long> list);

    @Query("select * from DBOneTimeSport where end_time between :startTime and :endTime order by end_time desc limit :count")
    List<DBOneTimeSport> m(long j2, long j3, int i);

    @Query("select _id, client_data_id, device_unique_id, device_category, start_time, end_time, sport_mode, app_source, data, meta_data, data_version, display, sync_status, updated, included_rhr, modified_time from DBOneTimeSport where ssoid = :ssoid and end_time > 0 and (sync_status = 0 or updated > 0) and device_category != 'THIRD' and start_time between :startTime and :endTime order by case when :sortOrder = 1 then start_time end desc, case when :sortOrder = 0 then start_time end asc limit :count")
    List<DBOneTimeSport> n(long j2, long j3, int i, int i2, String str);

    @Query("select _id, client_data_id, device_unique_id, device_category, start_time, end_time, sport_mode, app_source, data, meta_data, data_version, display, sync_status, updated, included_rhr, modified_time from DBOneTimeSport where ssoid = :ssoid and end_time > 0 and (sync_status = 0 or updated > 0) and device_category = 'THIRD' and start_time between :startTime and :endTime order by case when :sortOrder = 1 then start_time end desc, case when :sortOrder = 0 then start_time end asc limit :count")
    List<DBOneTimeSport> o(long j2, long j3, int i, int i2, String str);

    @Query("select MAX(modified_time) from DBOneTimeSport where ssoid = :ssoid and device_category = 'THIRD'")
    long p(String str);

    @Query("select * from DBOneTimeSport where ssoid = :ssoid and ((start_time <= :startTime) and (end_time >= :endTime)) and display != 2 and sport_mode in (:sportModes)")
    List<DBOneTimeSport> q(String str, long j2, long j3, List<Integer> list);

    @RawQuery
    List<DBOneTimeSport> r(SupportSQLiteQuery supportSQLiteQuery);

    @Query("select * from DBOneTimeSport where ssoid = :ssoid and device_unique_id = :deviceId and start_time = :startTime and end_time = :endTime and sport_mode in (:sportModes)")
    List<DBOneTimeSport> s(String str, String str2, long j2, long j3, List<Integer> list);

    @Update
    int t(DBOneTimeSport dBOneTimeSport);

    @Query("select * from DBOneTimeSport where ssoid = :ssoid and start_time >= :startTime and end_time <= :endTime")
    List<DBOneTimeSport> u(String str, long j2, long j3);

    @Query("select _id, ssoid, device_unique_id, start_time, end_time, sport_mode, app_source, meta_data, data_version, display, sync_status, timezone, modified_time, updated, included_rhr from DBOneTimeSport where ssoid = :ssoid and start_time between :startTime and :endTime and display = 1 and sport_mode = :sportMode order by start_time desc")
    List<DBOneTimeSport> v(String str, long j2, long j3, int i);

    @Query("select * from DBOneTimeSport where ssoid = :ssoid and display != 2 and sport_mode in (:sportModes) and start_time between :startTime and :endTime order by case when :sortOrder = 1 then start_time end desc, case when :sortOrder = 0 then start_time end asc limit :count")
    List<DBOneTimeSport> w(long j2, long j3, int i, int i2, List<Integer> list, String str);

    @Query("select * from DBOneTimeSport where ssoid = :ssoid and start_time = :startTime and end_time = :endTime and sport_mode = :sportMode")
    List<DBOneTimeSport> x(String str, long j2, long j3, int i);

    @Query("select * from DBOneTimeSport where ssoid = :ssoid and start_time between :startTime and :endTime and sport_mode in (:sportModes) and display != 2 order by start_time asc")
    List<DBOneTimeSport> y(String str, long j2, long j3, List<Integer> list);

    @RawQuery
    List<DBOneTimeSport> z(SupportSQLiteQuery supportSQLiteQuery);
}
