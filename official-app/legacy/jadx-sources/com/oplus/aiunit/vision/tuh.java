package com.oplus.aiunit.vision;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;
import com.heytap.databaseengineservice.db.table.snore.DBSnoreDbFileInfo;
import java.util.List;

/* JADX INFO: loaded from: classes15.dex */
@Dao
public interface tuh {
    @Insert(onConflict = 1)
    List<Long> a(List<DBSnoreDbFileInfo> list);

    @Query("select * from DBSnoreDbFileInfo where client_file_id = :clientFileId")
    DBSnoreDbFileInfo b(String str);

    @Query("select client_file_id from DBSnoreDbFileInfo where ssoid = :ssoid and date = :date")
    List<String> c(String str, int i);

    @Query("select * from DBSnoreDbFileInfo where ssoid = :ssoid and date between :startDay and :endDay")
    List<DBSnoreDbFileInfo> d(String str, int i, int i2);

    @Query("select * from DBSnoreDbFileInfo where ssoid = :ssoid and date = :date")
    List<DBSnoreDbFileInfo> e(String str, int i);

    @Query("select client_file_id from DBSnoreDbFileInfo where ssoid = :ssoid and date = :date")
    List<String> f(String str, int i);

    @Query("select client_file_id from DBSnoreDbFileInfo where ssoid = :ssoid and display = :display")
    List<String> g(String str, int i);

    @Query("select * from DBSnoreDbFileInfo where ssoid = :ssoid and start_timestamp = :startTimestamp and end_timestamp = :endTimestamp")
    DBSnoreDbFileInfo h(String str, long j2, long j3);

    @Delete
    int i(List<DBSnoreDbFileInfo> list);

    @Update
    int j(DBSnoreDbFileInfo dBSnoreDbFileInfo);

    @Query("select * from DBSnoreDbFileInfo where ssoid = :ssoid and sync_status = :syncStatus")
    List<DBSnoreDbFileInfo> k(String str, int i);
}
