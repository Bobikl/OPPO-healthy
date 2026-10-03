package com.oplus.aiunit.vision;

import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.Query;
import com.heytap.databaseengineservice.db.table.newsleep.HeartRateWarningBehavior;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;

/* JADX INFO: loaded from: classes15.dex */
@Dao
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001J.\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0004H'J6\u0010\f\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\u0004H'J\u001c\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\b2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\t0\bH'¨\u0006\u0010"}, d2 = {"Lcom/oplus/aiunit/vision/g79;", "", "", "ssoid", "", "startDay", "endDay", "sortOrder", "", "Lcom/heytap/databaseengineservice/db/table/newsleep/DBHeartRateWarningBehavior;", "d", "limit", "f", "list", "", "a", "databaseengineservice_release"}, k = 1, mv = {1, 8, 0})
public interface g79 {
    @Insert(onConflict = 1)
    @NotNull
    List<Long> a(@NotNull List<HeartRateWarningBehavior> list);

    @Query("select * from DBHeartRateWarningBehavior where ssoid = :ssoid and date between :startDay and :endDay order by case when :sortOrder = 1 then date end desc, case when :sortOrder = 0 then date end asc")
    @NotNull
    List<HeartRateWarningBehavior> d(@NotNull String ssoid, int startDay, int endDay, int sortOrder);

    @Query("select * from DBHeartRateWarningBehavior where ssoid = :ssoid and date between :startDay and :endDay order by  case when :sortOrder = 1 then date end desc, case when :sortOrder = 0 then date end asc limit :limit")
    @NotNull
    List<HeartRateWarningBehavior> f(@NotNull String ssoid, int startDay, int endDay, int sortOrder, int limit);
}
