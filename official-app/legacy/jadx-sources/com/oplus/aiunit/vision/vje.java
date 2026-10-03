package com.oplus.aiunit.vision;

import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;
import com.heytap.databaseengineservice.db.table.physique.DBPhysiqueMeasureDetail;
import java.util.List;

/* JADX INFO: loaded from: classes15.dex */
@Dao
public interface vje {
    @Insert(onConflict = 1)
    List<Long> a(List<DBPhysiqueMeasureDetail> list);

    @Update
    int b(List<DBPhysiqueMeasureDetail> list);

    @Query("select * from DBPhysiqueMeasureDetail where ssoid = :ssoid and train_time in (select max(train_time) as train_time from DBPhysiqueMeasureDetail where ssoid =:ssoid group by train_parent_id order by train_time desc) group by train_parent_id, train_time order by train_time asc")
    List<DBPhysiqueMeasureDetail> c(String str);

    @Query("select * from DBPhysiqueMeasureDetail where ssoid = :ssoid and train_parent_id = :trainParentId order by train_time desc limit 1")
    List<DBPhysiqueMeasureDetail> d(String str, int i);

    @Query("delete from DBPhysiqueMeasureDetail where ssoid = :ssoid")
    int delete(String str);

    @Query("select * from DBPhysiqueMeasureDetail where ssoid = :ssoid and train_time >= :startTime and train_time <= :endTime order by train_time desc")
    List<DBPhysiqueMeasureDetail> e(String str, long j2, long j3);

    @Query("select * from DBPhysiqueMeasureDetail where ssoid = :ssoid order by train_time desc limit 1")
    List<DBPhysiqueMeasureDetail> f(String str);

    @Query("select * from DBPhysiqueMeasureDetail where ssoid = :ssoid and sync_status = 0 order by train_time desc")
    List<DBPhysiqueMeasureDetail> g(String str);
}
