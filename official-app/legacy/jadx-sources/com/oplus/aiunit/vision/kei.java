package com.oplus.aiunit.vision;

import android.database.Cursor;
import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.RawQuery;
import androidx.sqlite.db.SimpleSQLiteQuery;
import androidx.sqlite.db.SupportSQLiteQuery;
import com.heytap.databaseengineservice.db.table.sportrecord.DBSportMetadata;
import java.util.List;

/* JADX INFO: loaded from: classes15.dex */
@Dao
public interface kei {
    @Insert(onConflict = 1)
    List<Long> a(List<DBSportMetadata> list);

    @RawQuery
    List<DBSportMetadata> b(SupportSQLiteQuery supportSQLiteQuery);

    @Query("delete from DBSportMetadata where ssoid = :ssoid and start_timestamp = :startTimestamp and end_timestamp = :endTimestamp and sport_mode = :sportMode")
    void c(String str, long j2, long j3, int i);

    @RawQuery
    int d(SimpleSQLiteQuery simpleSQLiteQuery);

    @Query("select * from DBSportMetadata where ssoid = :ssoid and start_timestamp >= :startTime and end_timestamp <= :endTime order by start_timestamp desc")
    List<DBSportMetadata> e(String str, long j2, long j3);

    @RawQuery
    Cursor f(SupportSQLiteQuery supportSQLiteQuery);

    @Delete
    int i(List<DBSportMetadata> list);
}
