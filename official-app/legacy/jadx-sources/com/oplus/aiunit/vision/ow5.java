package com.oplus.aiunit.vision;

import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.RawQuery;
import androidx.room.Update;
import androidx.sqlite.db.SupportSQLiteQuery;
import com.heytap.databaseengineservice.db.table.DBDisturbSleep;
import java.util.List;

/* JADX INFO: loaded from: classes15.dex */
@Dao
public interface ow5 {
    @Insert(onConflict = 1)
    List<Long> a(List<DBDisturbSleep> list);

    @Update
    int b(List<DBDisturbSleep> list);

    @Query("select *from DBDisturbSleep where ssoid = :ssoid and sync_status = 0 and start_timestamp between :startTime and :endTime order by case when :sortOrder = 1 then start_timestamp end desc, case when :sortOrder = 0 then start_timestamp end asc limit :limitCount")
    List<DBDisturbSleep> d(long j2, long j3, int i, int i2, String str);

    @Query("delete from DBDisturbSleep where ssoid = :ssoid")
    int f(String str);

    @RawQuery
    List<DBDisturbSleep> h(SupportSQLiteQuery supportSQLiteQuery);
}
