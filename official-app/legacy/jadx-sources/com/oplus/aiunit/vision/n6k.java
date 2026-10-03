package com.oplus.aiunit.vision;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.RawQuery;
import androidx.sqlite.db.SimpleSQLiteQuery;
import androidx.sqlite.db.SupportSQLiteQuery;
import com.heytap.databaseengineservice.db.table.DBTrackMetadata;
import java.util.List;

/* JADX INFO: loaded from: classes15.dex */
@Dao
public interface n6k {
    @Insert(onConflict = 1)
    List<Long> a(List<DBTrackMetadata> list);

    @RawQuery
    List<DBTrackMetadata> b(SupportSQLiteQuery supportSQLiteQuery);

    @Query("delete from DBTrackMetadata where ssoid = :ssoid and start_timestamp = :startTimestamp and end_timestamp = :endTimestamp and sport_mode = :sportMode")
    void c(String str, long j2, long j3, int i);

    @RawQuery
    int d(SimpleSQLiteQuery simpleSQLiteQuery);

    @Query("select * from DBTrackMetadata where ssoid = :ssoid and start_timestamp >= :startTime and end_timestamp <= :endTime order by start_timestamp desc")
    List<DBTrackMetadata> e(String str, long j2, long j3);

    @Query("select * from DBTrackMetadata where ssoid = :ssoid and client_data_id = :dataId")
    DBTrackMetadata f(String str, String str2);

    @Delete
    int g(DBTrackMetadata dBTrackMetadata);

    @Query("select * from DBTrackMetadata where ssoid = :ssoid and start_timestamp between :startTime and :endTime order by start_timestamp desc")
    List<DBTrackMetadata> h(String str, long j2, long j3);
}
