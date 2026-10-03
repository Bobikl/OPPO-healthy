package com.oplus.aiunit.vision;

import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Transaction;
import com.oplus.accountsdk.open.core.storage.table.AcOpenAccountInfo;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
@Dao
public interface xb {
    @Query("DELETE FROM ac_open_account_info_tb")
    void a();

    @Transaction
    default void b(AcOpenAccountInfo acOpenAccountInfo) {
        a();
        c(acOpenAccountInfo);
    }

    @Insert(onConflict = 1)
    void c(AcOpenAccountInfo acOpenAccountInfo);

    @Query("SELECT * FROM ac_open_account_info_tb")
    List<AcOpenAccountInfo> d();
}
