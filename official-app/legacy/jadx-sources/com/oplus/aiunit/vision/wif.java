package com.oplus.aiunit.vision;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import com.heytap.databaseengineservice.db.table.DBRecoveryHeartRate;
import java.util.List;

/* JADX INFO: loaded from: classes15.dex */
@Dao
public interface wif {
    @Insert(onConflict = 1)
    List<Long> a(List<DBRecoveryHeartRate> list);

    @Delete
    int b(DBRecoveryHeartRate dBRecoveryHeartRate);

    @Query("select * from DBRecoveryHeartRate where ssoid = :ssoid and device_unique_id = :deviceUniqueId and start_timestamp = :startTimestamp and sport_mode = :sportMode")
    DBRecoveryHeartRate c(String str, String str2, long j2, int i);
}
