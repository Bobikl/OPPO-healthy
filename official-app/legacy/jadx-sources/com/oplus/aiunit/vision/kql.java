package com.oplus.aiunit.vision;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.RawQuery;
import androidx.sqlite.db.SupportSQLiteQuery;
import com.heytap.databaseengineservice.db.table.weight.DBWeightBodyFat;
import java.util.List;

/* JADX INFO: loaded from: classes15.dex */
@Dao
public interface kql {
    @Insert(onConflict = 1)
    List<Long> a(List<DBWeightBodyFat> list);

    @Query("select * from DBWeightBodyFatTable where weight_id in (:weightIdList) and deleted != 1")
    List<DBWeightBodyFat> b(List<String> list);

    @Query("select * from DBWeightBodyFatTable where user_tag_id = :userTagId and weight_id in (:weightIdList) and deleted != 1")
    List<DBWeightBodyFat> c(String str, List<String> list);

    @RawQuery
    List<DBWeightBodyFat> d(SupportSQLiteQuery supportSQLiteQuery);

    @Query("select * from DBWeightBodyFatTable where user_tag_id = :userTagId and deleted != 1 order by measurement_timestamp desc limit 1")
    DBWeightBodyFat e(String str);

    @Query("select * from DBWeightBodyFatTable where user_tag_id = :userTagId and deleted != 1 order by measurement_timestamp asc")
    List<DBWeightBodyFat> f(String str);

    @Query("select * from DBWeightBodyFatTable where weight_id = :weightId and measurement_timestamp = :measurementTimestamp and deleted != 1")
    DBWeightBodyFat g(String str, long j2);

    @Insert(onConflict = 1)
    Long h(DBWeightBodyFat dBWeightBodyFat);

    @Delete
    int i(DBWeightBodyFat dBWeightBodyFat);

    @Query("select measurement_timestamp from DBWeightBodyFatTable where user_tag_id = :userTagId and deleted != 1 group by measurement_timestamp")
    List<Long> j(String str);

    @Query("select * from DBWeightBodyFatTable where user_tag_id = :userTagId and deleted != 1 and measurement_timestamp in (select max(measurement_timestamp) as measurement_timestamp from DBWeightBodyFatTable where measurement_timestamp between :startTime and :endTime group by strftime('%Y%m%d', datetime(measurement_timestamp/1000 +0800*36, 'unixepoch'))) order by measurement_timestamp desc")
    List<DBWeightBodyFat> k(String str, long j2, long j3);

    @Query("select max(modified_timestamp) from DBWeightBodyFatTable where ssoid = :ssoid and modified_timestamp < :modifiedTime")
    long l(String str, long j2);

    @Query("select * from DBWeightBodyFatTable where user_tag_id = :userTagId and deleted != 1 group by measurement_timestamp order by measurement_timestamp asc")
    List<DBWeightBodyFat> m(String str);

    @Query("select * from DBWeightBodyFatTable where ssoid = :ssoid and user_tag_id = '' and measurement_timestamp < :measurementTimestamp and deleted != 1 order by measurement_timestamp desc limit :count")
    List<DBWeightBodyFat> n(String str, long j2, int i);

    @Query("select max(modified_timestamp) from DBWeightBodyFatTable where ssoid = :ssoid and user_tag_id = '' and modified_timestamp < :modifiedTime")
    long o(String str, long j2);

    @Query("select max(modified_timestamp) from DBWeightBodyFatTable where ssoid = :ssoid and user_tag_id = :userTagId and modified_timestamp < :modifiedTime")
    long p(String str, String str2, long j2);

    @Query("select measurement_timestamp from DBWeightBodyFatTable where ssoid = :ssoid and user_tag_id = '' and deleted != 1 order by measurement_timestamp asc")
    List<Long> q(String str);

    @Query("select * from DBWeightBodyFatTable where user_tag_id = :userTagId and weight_status = :weightStatus and deleted != 1 order by measurement_timestamp ")
    List<DBWeightBodyFat> r(String str, int i);
}
