package com.oplus.aiunit.vision;

import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;
import com.heytap.databaseengineservice.db.table.DBAssessmentRecord;
import java.util.List;

/* JADX INFO: loaded from: classes15.dex */
@Dao
public interface th0 {
    @Insert(onConflict = 1)
    List<Long> a(List<DBAssessmentRecord> list);

    @Update
    int b(List<DBAssessmentRecord> list);

    @Query("select max(modified_timestamp) from DBAssessmentRecord where ssoid = :ssoid")
    long c(String str);

    @Query("select * from DBAssessmentRecord where ssoid = :ssoid and sync_status = 0 and start_timestamp between :startTime and :endTime order by case when :sortOrder = 1 then start_timestamp end desc, case when :sortOrder = 0 then start_timestamp end asc limit :limitCount")
    List<DBAssessmentRecord> d(long j2, long j3, int i, int i2, String str);

    @Query("select * from DBAssessmentRecord where ssoid = :ssoid and start_timestamp between :startTime and :endTime and (del is null or del = 0) order by case when :sortOrder = 1 then start_timestamp end desc, case when :sortOrder = 0 then start_timestamp end asc limit :limit")
    List<DBAssessmentRecord> g(String str, long j2, long j3, int i, int i2);

    @Query("select * from DBAssessmentRecord where ssoid = :ssoid and start_timestamp between :startTime and :endTime and (del is null or del = 0) group by start_timestamp order by case when :sortOrder = 1 then start_timestamp end desc, case when :sortOrder = 0 then start_timestamp end asc")
    List<DBAssessmentRecord> h(String str, long j2, long j3, int i);

    @Query("select * from DBAssessmentRecord where ssoid = :ssoid and start_timestamp between :startTime and :endTime and (del is null or del = 0) and version in (:intConditionArray) order by case when :sortOrder = 1 then start_timestamp end desc, case when :sortOrder = 0 then start_timestamp end asc limit :limit")
    List<DBAssessmentRecord> i(String str, long j2, long j3, int i, int i2, int[] iArr);
}
