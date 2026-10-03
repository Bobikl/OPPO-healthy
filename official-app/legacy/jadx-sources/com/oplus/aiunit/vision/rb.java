package com.oplus.aiunit.vision;

import androidx.room.Dao;
import androidx.room.Query;
import com.oplus.accountsdk.open.core.storage.table.AcOldAccountInfo;

/* JADX INFO: loaded from: classes6.dex */
@Dao
public interface rb {
    @Query("SELECT * FROM user_tb WHERE alive = :alive")
    AcOldAccountInfo a(String str);

    @Query("DELETE FROM user_tb WHERE ssoid = :ssoid")
    void b(String str);
}
