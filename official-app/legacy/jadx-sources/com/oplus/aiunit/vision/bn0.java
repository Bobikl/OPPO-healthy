package com.oplus.aiunit.vision;

import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.Query;

/* JADX INFO: loaded from: classes19.dex */
@Dao
public interface bn0 {
    @Query("SELECT * FROM a_e WHERE a_e.uid = (:uid)AND a_e.packageName = (:packageName)AND a_e.capability_name = (:capabilityName)AND a_e.auth_code = (:authCode)")
    dn0 a(int i, String str, String str2, String str3);

    @Insert(onConflict = 1)
    void b(dn0 dn0Var);
}
