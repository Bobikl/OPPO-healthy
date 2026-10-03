package com.oplus.aiunit.vision;

import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;
import com.heytap.databaseengineservice.db.table.fitness.DBThirdPartFitCourse;
import java.util.List;

/* JADX INFO: loaded from: classes15.dex */
@Dao
public interface kvj {
    @Update
    int a(DBThirdPartFitCourse dBThirdPartFitCourse);

    @Update
    int b(List<DBThirdPartFitCourse> list);

    @Query("select MAX(modified_timestamp) from DBThirdPartFitCourse where ssoid = :ssoid")
    long c(String str);

    @Query("select * from DBThirdPartFitCourse where ssoid = :ssoid and course_id = :courseId")
    DBThirdPartFitCourse d(String str, String str2);

    @Query("select * from DBThirdPartFitCourse where ssoid = :ssoid and sport_mode = :sportMod and deleted != 1")
    List<DBThirdPartFitCourse> e(String str, int i);

    @Insert(onConflict = 1)
    long f(DBThirdPartFitCourse dBThirdPartFitCourse);

    @Query("select * from DBThirdPartFitCourse where ssoid = :ssoid and sync_status = 0")
    List<DBThirdPartFitCourse> g(String str);
}
