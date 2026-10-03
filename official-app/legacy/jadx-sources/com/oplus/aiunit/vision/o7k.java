package com.oplus.aiunit.vision;

import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;
import com.heytap.databaseengineservice.db.table.DBTrackTemp;
import java.util.List;

/* JADX INFO: loaded from: classes15.dex */
@Dao
public interface o7k {
    @Update
    int a(DBTrackTemp dBTrackTemp);

    @Insert(onConflict = 1)
    Long b(DBTrackTemp dBTrackTemp);

    @Query("delete from DBTrackTemp where ssoid = :ssoid")
    int delete(String str);

    @Query("select * from DBTrackTemp where ssoid = :ssoid")
    List<DBTrackTemp> query(String str);
}
