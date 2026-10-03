package com.oplus.aiunit.vision;

import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.Query;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
@Dao
public interface jh5 {
    public static final String TABLE_DEVICE_INFO = "device_info";

    @Query("SELECT * FROM device_info")
    List<ui5> b();

    @Insert(onConflict = 1)
    long c(ui5 ui5Var);

    @Query("SELECT * FROM device_info WHERE NODE_ID=:nodeId")
    ui5 d(String str);

    @Query("DELETE FROM device_info WHERE NODE_ID=:nodeId")
    int delete(String str);
}
