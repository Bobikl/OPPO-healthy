package com.oplus.aiunit.vision;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import com.heytap.databaseengineservice.db.table.snore.DBSnoreDbBuff;
import java.util.List;

/* JADX INFO: loaded from: classes15.dex */
@Dao
public interface puh {
    @Insert(onConflict = 1)
    List<Long> a(List<DBSnoreDbBuff> list);

    @Query("select * from DBSnoreDbBuff where ssoid = :ssoid and mode = :mode and utc_timestamp between :startTime and :endTime")
    List<DBSnoreDbBuff> b(String str, int i, long j2, long j3);

    @Query("select * from DBSnoreDbBuff where ssoid = :ssoid and date between :startDay and :endDay")
    List<DBSnoreDbBuff> d(String str, int i, int i2);

    @Delete
    int i(List<DBSnoreDbBuff> list);

    @Query("select * from DBSnoreDbBuff where ssoid = :ssoid and mode = :mode and date between :startDay and :endDay")
    List<DBSnoreDbBuff> m(String str, int i, int i2, int i3);
}
