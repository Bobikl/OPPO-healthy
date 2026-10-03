package com.heytap.accessory.base.database;

import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;
import java.util.List;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes14.dex */
@Dao
public interface f {
    @Insert(onConflict = 1)
    long a(h hVar);

    @Query("SELECT * FROM Device WHERE transportAddress = (:transportAddress)")
    List<h> a(String str);

    @Query("SELECT * FROM Device WHERE transportAddress = (:transportAddress) and transportId=(:transportType) and uuidType=(:uuid)")
    List<h> a(String str, int i, int i2);

    @Update
    int b(h hVar);
}
