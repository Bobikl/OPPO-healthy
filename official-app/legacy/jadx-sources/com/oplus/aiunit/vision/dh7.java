package com.oplus.aiunit.vision;

import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;
import com.heytap.databaseengineservice.db.table.fitness.DBFitPlan;
import java.util.List;

/* JADX INFO: loaded from: classes15.dex */
@Dao
public interface dh7 {
    @Update
    int a(DBFitPlan dBFitPlan);

    @Update
    int b(List<DBFitPlan> list);

    @Query("select MAX(modified_time) from DBFitPlan where ssoid = :ssoid")
    long c(String str);

    @Query("select * from DBFitPlan where ssoid = :ssoid and plan_id = :planId")
    DBFitPlan d(String str, String str2);

    @Query("select * from DBFitPlan where ssoid = :ssoid and train_type = :trainType order by join_time desc")
    List<DBFitPlan> e(String str, int i);

    @Query("select * from DBFitPlan where ssoid = :ssoid and sync_status = 0 and total_calorie != 0 and _id > :startId order by case when :sortOrder = 1 then _id end desc, case when :sortOrder = 0 then _id end asc limit :limitCount")
    List<DBFitPlan> f(long j2, int i, int i2, String str);

    @Insert(onConflict = 1)
    long g(DBFitPlan dBFitPlan);
}
