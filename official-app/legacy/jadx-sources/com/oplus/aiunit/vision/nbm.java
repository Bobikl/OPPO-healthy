package com.oplus.aiunit.vision;

import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.Query;

/* JADX INFO: loaded from: classes8.dex */
@Dao
public interface nbm {
    @Query("SELECT * FROM a_e WHERE a_e.uid = (:uid)AND a_e.capability_name = (:capabilityName)")
    nlm a(int i, String str);

    @Insert(onConflict = 1)
    void a(nlm nlmVar);
}
