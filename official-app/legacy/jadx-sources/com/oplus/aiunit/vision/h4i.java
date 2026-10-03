package com.oplus.aiunit.vision;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import com.heytap.databaseengineservice.db.table.space.DBSpaceInfo;
import java.util.List;

/* JADX INFO: loaded from: classes15.dex */
@Dao
public interface h4i {
    @Delete
    int a(List<DBSpaceInfo> list);

    @Insert(onConflict = 1)
    List<Long> b(List<DBSpaceInfo> list);

    @Query("delete from DBSpaceInfo")
    int c();

    @Query("select * from DBSpaceInfo where page_code = :pageCode and card_code = :cardCode")
    List<DBSpaceInfo> d(String str, String str2);

    @Query("select * from DBSpaceInfo where page_code = :pageCode")
    List<DBSpaceInfo> query(String str);
}
