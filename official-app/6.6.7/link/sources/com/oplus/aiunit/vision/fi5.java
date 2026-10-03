package com.oplus.aiunit.vision;

import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.Query;
import java.util.List;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes8.dex */
@Dao
public interface fi5 {
    public static final String TABLE_DEVICE_INFO = "device_info";

    @Query("SELECT * FROM device_info")
    List<qj5> b();

    @Insert(onConflict = 1)
    long c(qj5 qj5Var);

    @Query("SELECT * FROM device_info WHERE NODE_ID=:nodeId")
    qj5 d(String str);

    @Query("DELETE FROM device_info WHERE NODE_ID=:nodeId")
    int delete(String str);
}
