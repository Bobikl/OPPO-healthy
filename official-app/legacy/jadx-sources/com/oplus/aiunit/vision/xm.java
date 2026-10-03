package com.oplus.aiunit.vision;

import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;
import com.heytap.databaseengineservice.db.table.DBAccountInfo;
import java.util.List;

/* JADX INFO: loaded from: classes15.dex */
@Dao
public interface xm {
    @Update
    int b(List<DBAccountInfo> list);

    @Insert(onConflict = 1)
    Long c(DBAccountInfo dBAccountInfo);

    @Update
    int d(DBAccountInfo dBAccountInfo);

    @Query("select * from DBAccountInfo where ssoid = :ssoid")
    DBAccountInfo query(String str);

    @Query("select * from DBAccountInfo where isLogin = :login")
    List<DBAccountInfo> query(boolean z);
}
