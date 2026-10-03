package com.oplus.aiunit.vision;

import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.Query;
import com.heytap.databaseengineservice.db.table.DBDeviceInfo;
import java.util.List;

/* JADX INFO: loaded from: classes15.dex */
@Dao
public interface kh5 {
    @Query("select * from DBDeviceInfo where device_unique_id in (:list) or mac in (:list)")
    List<DBDeviceInfo> b(List<String> list);

    @Insert(onConflict = 1)
    Long c(DBDeviceInfo dBDeviceInfo);
}
