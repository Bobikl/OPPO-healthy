package com.oplus.aiunit.vision;

import androidx.room.Dao;
import androidx.room.Query;
import com.oplus.accountsdk.open.core.storage.table.AcOldSecondaryTokenInfo;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
@Dao
public interface ub {
    @Query("SELECT * FROM secondary_token_tb")
    List<AcOldSecondaryTokenInfo> a();
}
