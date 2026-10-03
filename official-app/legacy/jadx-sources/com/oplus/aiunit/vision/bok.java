package com.oplus.aiunit.vision;

import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;
import com.heytap.databaseengineservice.db.table.DBUserGoalInfo;
import java.util.List;

/* JADX INFO: loaded from: classes15.dex */
@Dao
public interface bok {
    @Insert(onConflict = 1)
    List<Long> a(List<DBUserGoalInfo> list);

    @Update
    int b(List<DBUserGoalInfo> list);

    @Query("select * from DBUserGoalInfo where ssoid = :ssoid and type in (:typeList)")
    List<DBUserGoalInfo> c(String str, List<Integer> list);

    @Query("select * from DBUserGoalInfo where ssoid = :ssoid and type = :type")
    DBUserGoalInfo d(String str, int i);

    @Update
    int e(DBUserGoalInfo dBUserGoalInfo);

    @Insert(onConflict = 1)
    Long f(DBUserGoalInfo dBUserGoalInfo);

    @Query("select * from DBUserGoalInfo where ssoid = :ssoid")
    List<DBUserGoalInfo> query(String str);
}
