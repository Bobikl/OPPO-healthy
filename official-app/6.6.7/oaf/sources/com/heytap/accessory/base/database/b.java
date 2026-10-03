package com.heytap.accessory.base.database;

import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.Query;
import java.util.List;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes14.dex */
@Dao
public interface b {
    @Query("DELETE FROM ChannelDescription WHERE agentId = :agentId")
    int a(String str);

    @Query("SELECT * FROM ChannelDescription WHERE agentId = :agentId")
    List<d> a(long j);

    @Insert(onConflict = 5)
    List<Long> a(List<d> list);
}
