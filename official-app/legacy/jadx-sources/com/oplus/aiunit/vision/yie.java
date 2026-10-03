package com.oplus.aiunit.vision;

import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.RawQuery;
import androidx.room.Update;
import androidx.sqlite.db.SupportSQLiteQuery;
import com.heytap.databaseengineservice.db.table.DBPhysicalFitness;
import java.util.List;

/* JADX INFO: loaded from: classes15.dex */
@Dao
public interface yie {
    @RawQuery
    List<DBPhysicalFitness> b(SupportSQLiteQuery supportSQLiteQuery);

    @Query("select * from DBPhysicalFitness where ssoid = :ssoid and workout_status = 1 order by user_workout_id desc limit 1")
    DBPhysicalFitness c(String str);

    @Query("select * from DBPhysicalFitness where ssoid = :ssoid and client_data_id = :clientDataId")
    DBPhysicalFitness d(String str, String str2);

    @Query("select * from DBPhysicalFitness where ssoid = :ssoid and workout_status = 1 and vo2_max > 0 order by user_workout_id desc limit 1")
    DBPhysicalFitness e(String str);

    @Update
    int f(DBPhysicalFitness dBPhysicalFitness);

    @Query("select client_data_id from DBPhysicalFitness where ssoid = :ssoid and workout_status = 0 order by modified_Time_stamp asc")
    List<String> g(String str);

    @Insert(onConflict = 1)
    Long h(DBPhysicalFitness dBPhysicalFitness);
}
