package com.oplus.aiunit.vision;

import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;
import com.heytap.databaseengineservice.db.table.physique.DBPhysiqueMeasureAll;
import java.util.List;

/* JADX INFO: loaded from: classes15.dex */
@Dao
public interface zje {
    @Insert(onConflict = 1)
    List<Long> a(List<DBPhysiqueMeasureAll> list);

    @Update
    int b(List<DBPhysiqueMeasureAll> list);

    @Query("select * from DBPhysiqueMeasureAll where ssoid = :ssoid order by train_time desc limit 1")
    List<DBPhysiqueMeasureAll> c(String str);

    @Query("select * from DBPhysiqueMeasureAll where ssoid = :ssoid order by train_time desc limit 1")
    DBPhysiqueMeasureAll d(String str);

    @Query("delete from DBPhysiqueMeasureAll where ssoid = :ssoid")
    int delete(String str);

    @Query("select * from DBPhysiqueMeasureAll where ssoid = :ssoid and train_time >= :startTime and train_time <= :endTime order by train_time desc")
    List<DBPhysiqueMeasureAll> e(String str, long j2, long j3);

    @Query("select * from DBPhysiqueMeasureAll where ssoid = :ssoid and sync_status = 0 order by train_time desc")
    List<DBPhysiqueMeasureAll> g(String str);
}
