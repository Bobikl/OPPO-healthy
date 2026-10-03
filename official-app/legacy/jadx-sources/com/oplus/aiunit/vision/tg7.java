package com.oplus.aiunit.vision;

import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;
import com.heytap.databaseengineservice.db.table.fitness.DBFitCourse;
import java.util.List;

/* JADX INFO: loaded from: classes15.dex */
@Dao
public interface tg7 {
    @Update
    int b(List<DBFitCourse> list);

    @Query("select MAX(modified_time) from DBFitCourse where ssoid = :ssoid")
    long c(String str);

    @Query("select * from DBFitCourse where ssoid = :ssoid and course_id = :courseId")
    DBFitCourse d(String str, String str2);

    @Query("select * from DBFitCourse where ssoid = :ssoid and train_type = :trainType")
    List<DBFitCourse> e(String str, int i);

    @Query("select * from DBFitCourse where ssoid = :ssoid and sync_status = 0 and _id > :startId order by case when :sortOrder = 1 then _id end desc, case when :sortOrder = 0 then _id end asc limit :limitCount")
    List<DBFitCourse> f(long j2, int i, int i2, String str);

    @Update
    int g(DBFitCourse dBFitCourse);

    @Insert(onConflict = 1)
    long h(DBFitCourse dBFitCourse);
}
