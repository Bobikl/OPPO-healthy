package com.oplus.aiunit.vision;

import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.Query;
import com.heytap.databaseengineservice.db.table.sleepdaystat.SleepMainData;
import java.util.List;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;

/* JADX INFO: loaded from: classes15.dex */
@Dao
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001J,\u0010\t\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\b\u0018\u00010\u00072\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004H'J$\u0010\f\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u000b\u0018\u00010\u00072\u0010\u0010\n\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\b\u0018\u00010\u0007H'¨\u0006\r"}, d2 = {"Lcom/oplus/aiunit/vision/efh;", "", "", "ssoid", "", f04.JSON_KEY_DIGITAL_KEY_START_TIME, "endDate", "", "Lcom/heytap/databaseengineservice/db/table/sleepdaystat/DBSleepMainData;", "d", "list", "", "a", "databaseengineservice_release"}, k = 1, mv = {1, 8, 0})
public interface efh {
    @Insert(onConflict = 1)
    @Nullable
    List<Long> a(@Nullable List<SleepMainData> list);

    @Query("select * from DBSleepMainStat where ssoid = :ssoid and date between :startDate and :endDate")
    @Nullable
    List<SleepMainData> d(@Nullable String ssoid, int startDate, int endDate);
}
