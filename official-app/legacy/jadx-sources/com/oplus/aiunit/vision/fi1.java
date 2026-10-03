package com.oplus.aiunit.vision;

import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.Query;
import java.util.List;

/* JADX INFO: loaded from: classes19.dex */
@Dao
public interface fi1 {
    @Insert(onConflict = 1)
    List<Long> a(List<m15> list);

    @Query("update blocked_lite set status = :status where mac_address = :macAddress and status_modify_time = :syncTime")
    int b(String str, int i, long j2);

    @Query("delete from blocked_lite where mac_address = :macAddress")
    int c(String str);

    @Query("delete from blocked_lite where mac_address = :macAddress and status = :status and status_modify_time = :syncTime")
    int d(String str, int i, long j2);

    @Query("select * from blocked_lite where mac_address =:macAddress order by blocked_id ASC")
    List<m15> query(String str);
}
