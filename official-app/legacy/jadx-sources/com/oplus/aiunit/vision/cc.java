package com.oplus.aiunit.vision;

import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Transaction;
import com.oplus.accountsdk.open.core.storage.table.AcOpenAccountToken;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
@Dao
public interface cc {
    @Query("DELETE FROM ac_open_account_token_tb")
    void a();

    @Query("SELECT * FROM ac_open_account_token_tb")
    List<AcOpenAccountToken> b();

    @Transaction
    default void c(AcOpenAccountToken acOpenAccountToken) {
        a();
        d(acOpenAccountToken);
    }

    @Insert(onConflict = 1)
    void d(AcOpenAccountToken acOpenAccountToken);
}
