package com.oplus.aiunit.vision;

import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;
import com.heytap.databaseengineservice.db.table.DBECGRecord;
import java.util.List;

/* JADX INFO: loaded from: classes15.dex */
@Dao
public interface ha6 {
    @Update
    int b(List<DBECGRecord> list);

    @Query("select MAX(modified_time_stamp) from DBECGRecord where ssoid = :ssoid")
    long c(String str);

    @Query("select _id, client_data_id, ssoid, device_unique_id, start_time_stamp, end_time_stamp, ecg_id, hand, data, version, avg_heart_rate, max_heart_rate, expert_interpretation, algorithmsAnalyzeResult, ecg_start_timestamp, aac_start_timestamp, ecg_app_version,app_version,user_info,ecg_result_id,ecg_result_name,symptoms, source, expertState, reportId, serviceApplyId, personState, display, device_version, sync_status, modified_time_stamp from DBECGRecord where ssoid = :ssoid and (client_data_id = :dataId or ecg_id = :dataId) and display != 2 order by start_time_stamp desc")
    DBECGRecord d(String str, String str2);

    @Query("select MAX(modified_time_stamp) from DBECGRecord where ssoid = :ssoid and start_time_stamp between :startTime and :endTime")
    long g(String str, long j2, long j3);

    @Query("select _id, client_data_id, ssoid, device_unique_id, start_time_stamp, end_time_stamp, ecg_id, hand, data, version, avg_heart_rate, max_heart_rate, expert_interpretation, algorithmsAnalyzeResult, ecg_start_timestamp, aac_start_timestamp, ecg_app_version,app_version,user_info,ecg_result_id,ecg_result_name,symptoms, source, expertState, reportId, serviceApplyId, personState, display, device_version, sync_status, modified_time_stamp from DBECGRecord where ssoid = :ssoid and start_time_stamp between :startTime and :endTime and display != 2 order by start_time_stamp desc")
    List<DBECGRecord> h(String str, long j2, long j3);

    @Query("select _id, client_data_id, device_unique_id, start_time_stamp, end_time_stamp, ecg_id, hand, data, ppg_data, aac_data, ecg_start_timestamp, aac_start_timestamp, version, avg_heart_rate, expert_interpretation, display, device_version, ecg_app_version,app_version,user_info,ecg_result_id,ecg_result_name,symptoms, max_heart_rate, source, sync_status, modified_time_stamp ,algorithmsAnalyzeResult, expertState, reportId, serviceApplyId, personState from DBECGRecord where ssoid = :ssoid and sync_status = :syncStatus and start_time_stamp between :startTime and :endTime order by case when :sortOrder = 1 then start_time_stamp end desc, case when :sortOrder = 0 then start_time_stamp end asc limit :limitCount")
    List<DBECGRecord> i(long j2, long j3, int i, int i2, String str, int i3);

    @Query("select _id, client_data_id, ssoid, device_unique_id, start_time_stamp, end_time_stamp, ecg_id, hand, data, version, avg_heart_rate, max_heart_rate, expert_interpretation, algorithmsAnalyzeResult, ecg_start_timestamp, aac_start_timestamp, ecg_app_version,app_version,user_info,ecg_result_id,ecg_result_name,symptoms, source, expertState, reportId, serviceApplyId, personState, display, device_version, sync_status, modified_time_stamp from DBECGRecord where ssoid = :ssoid and (client_data_id = :dataId or ecg_id = :dataId) order by start_time_stamp desc")
    DBECGRecord j(String str, String str2);

    @Query("select * from DBECGRecord where ssoid = :ssoid and device_unique_id = :deviceId and start_time_stamp = :startTime and end_time_stamp <= :endTime order by end_time_stamp asc limit 1")
    DBECGRecord k(String str, String str2, long j2, long j3);

    @Query("delete from DBECGRecord where ssoid = :ssoid")
    int l(String str);

    @Update
    int m(DBECGRecord dBECGRecord);

    @Query("select * from DBECGRecord where ssoid = :ssoid and display != 2 and start_time_stamp between :startTime and :endTime order by start_time_stamp desc limit 1")
    DBECGRecord n(String str, long j2, long j3);

    @Insert(onConflict = 1)
    Long o(DBECGRecord dBECGRecord);
}
