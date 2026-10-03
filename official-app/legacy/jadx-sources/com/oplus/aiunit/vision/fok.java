package com.oplus.aiunit.vision;

import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;
import com.heytap.databaseengineservice.db.table.DBUserInfo;

/* JADX INFO: loaded from: classes15.dex */
@Dao
public interface fok {
    @Update
    int a(DBUserInfo dBUserInfo);

    @Insert(onConflict = 1)
    Long b(DBUserInfo dBUserInfo);

    @Query("select * from DBUserInfo where ssoid = :ssoid")
    DBUserInfo query(String str);
}
