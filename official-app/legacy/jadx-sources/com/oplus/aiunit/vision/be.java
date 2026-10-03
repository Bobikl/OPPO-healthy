package com.oplus.aiunit.vision;

import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.Query;
import com.oplus.accountsdk.open.core.storage.table.AcOpenDeviceInfo;

/* JADX INFO: loaded from: classes6.dex */
@Dao
public interface be {
    @Insert(onConflict = 1)
    void a(AcOpenDeviceInfo acOpenDeviceInfo);

    @Query("SELECT * FROM ac_open_device_info_tb WHERE packageName = :pkg")
    AcOpenDeviceInfo b(String str);
}
