package com.oplus.aiunit.vision;

import androidx.lifecycle.LiveData;
import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.Query;
import java.util.List;

/* JADX INFO: loaded from: classes19.dex */
@Dao
public interface f34 {
    @Insert(onConflict = 1)
    void a(List<r15> list);

    @Query("update contact_lite set status = :status where mac_address = :macAddress and status_modify_time = :syncTime")
    int b(String str, int i, long j2);

    @Query("delete from contact_lite where mac_address = :macAddress")
    int c(String str);

    @Query("select count(*) = 0 from contact_lite where mac_address =:macAddress and status <> 0")
    LiveData<Boolean> d(String str);

    @Query("delete from contact_lite where mac_address = :macAddress and status = :status and status_modify_time = :syncTime")
    int e(String str, int i, long j2);

    @Query("select * from contact_lite where mac_address =:macAddress and contact_id=:contactId")
    r15 f(String str, long j2);

    @Query("select * from contact_lite where mac_address =:macAddress order by contact_id asc")
    List<r15> query(String str);
}
