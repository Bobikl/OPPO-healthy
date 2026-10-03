package com.oplus.aiunit.vision;

import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;
import com.heytap.databaseengineservice.db.table.snore.DBSnoreResult;
import java.util.List;

/* JADX INFO: loaded from: classes15.dex */
@Dao
public interface kzh {
    @Insert(onConflict = 1)
    List<Long> a(List<DBSnoreResult> list);

    @Update
    int b(DBSnoreResult dBSnoreResult);

    @Query("select * from DBSnoreResult where ssoid = :ssoid and date between :startDay and :endDay")
    List<DBSnoreResult> d(String str, int i, int i2);

    @Query("select * from DBSnoreResult where ssoid = :ssoid and date = :date")
    DBSnoreResult e(String str, int i);
}
