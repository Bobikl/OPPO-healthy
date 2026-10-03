package com.heytap.accessory.base.database;

import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.Query;
import java.util.List;

/* JADX INFO: loaded from: classes14.dex */
@Dao
public interface m {
    @Insert(onConflict = 1)
    void a(k kVar);

    @Query("DELETE FROM ksc_info WHERE deviceId = :deviceId AND alias = :alias")
    void a(String str, String str2);

    @Query("SELECT * FROM ksc_info WHERE deviceId = :deviceId AND alias = :alias")
    List<k> b(String str, String str2);
}
