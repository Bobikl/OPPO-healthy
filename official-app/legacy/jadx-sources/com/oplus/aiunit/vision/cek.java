package com.oplus.aiunit.vision;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import com.heytap.databaseengineservice.db.table.snore.DBTypicalFragment;
import java.util.List;

/* JADX INFO: loaded from: classes15.dex */
@Dao
public interface cek {
    @Insert(onConflict = 1)
    List<Long> a(List<DBTypicalFragment> list);

    @Query("select * from DBTypicalFragment where ssoid = :ssoid and date between :startDay and :endDay")
    List<DBTypicalFragment> d(String str, int i, int i2);

    @Delete
    int i(List<DBTypicalFragment> list);
}
