package com.oplus.aiunit.vision;

import androidx.room.Dao;
import androidx.room.Query;
import com.heytap.databaseengineservice.db.table.DBUserBoundDevice;
import java.util.List;

/* JADX INFO: loaded from: classes15.dex */
@Dao
public interface qnk {
    @Query("select * from DBUserBoundDevice where ssoid = :ssoid")
    List<DBUserBoundDevice> query(String str);
}
