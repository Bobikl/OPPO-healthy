package com.oplus.aiunit.vision;

import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;
import com.heytap.databaseengineservice.db.table.DBUserPreference;
import java.util.List;

/* JADX INFO: loaded from: classes15.dex */
@Dao
public interface hpk {
    @Insert(onConflict = 1)
    List<Long> a(List<DBUserPreference> list);

    @Update
    int b(List<DBUserPreference> list);

    @Update
    int c(DBUserPreference dBUserPreference);

    @Query("select * from DBUserPreference where ssoid = :ssoid and module = :module")
    List<DBUserPreference> d(String str, String str2);

    @Query("select * from DBUserPreference where ssoid = :ssoid and preference_key in (:keys)")
    List<DBUserPreference> e(String str, List<String> list);

    @Insert(onConflict = 1)
    Long f(DBUserPreference dBUserPreference);

    @Query("select * from DBUserPreference where ssoid = :ssoid and preference_key = :key")
    DBUserPreference g(String str, String str2);
}
