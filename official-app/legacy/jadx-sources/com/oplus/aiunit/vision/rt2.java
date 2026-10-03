package com.oplus.aiunit.vision;

import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.Query;
import java.util.List;

/* JADX INFO: loaded from: classes19.dex */
@Dao
public interface rt2 {
    @Insert(onConflict = 1)
    List<Long> a(List<n15> list);

    @Query("update calls_lite set status = :status where mac_address = :macAddress and status_modify_time = :syncTime")
    int b(String str, int i, long j2);

    @Query("delete from calls_lite where mac_address = :macAddress")
    int c(String str);

    @Query("delete from calls_lite where mac_address = :macAddress and status = :status and status_modify_time = :syncTime")
    int d(String str, int i, long j2);

    @Query("select * from calls_lite where mac_address =:macAddress order by date DESC")
    List<n15> query(String str);
}
