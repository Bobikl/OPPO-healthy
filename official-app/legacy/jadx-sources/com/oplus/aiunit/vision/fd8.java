package com.oplus.aiunit.vision;

import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Transaction;
import com.heytap.webpro.preload.res.db.entity.H5OfflineRecord;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
@Dao
public abstract class fd8 {
    @Transaction
    public void a(String str, int i) {
        b(str, i);
        td7.e(com.heytap.webpro.preload.res.utils.a.c() + i);
        com.heytap.webpro.preload.res.utils.a.a(str, i);
    }

    public final void b(String str, int i) {
        double d = i;
        List<H5OfflineRecord> listI = i(str, d);
        if (listI == null || listI.isEmpty()) {
            return;
        }
        ise.f().c(str, listI);
        d(str, d);
    }

    @Query("DELETE FROM h5_offline_record WHERE productCode = :productCode")
    public abstract void c(String str);

    @Query("DELETE FROM h5_offline_record WHERE productCode = :productCode and appId = :appId")
    public abstract void d(String str, double d);

    @Insert(onConflict = 1)
    public abstract void e(List<H5OfflineRecord> list);

    @Transaction
    public void f(String str, int i, List<H5OfflineRecord> list) {
        b(str, i);
        e(list);
    }

    @Query("SELECT * FROM h5_offline_record WHERE productCode = :productCode and appId = :appId limit 1")
    public abstract H5OfflineRecord g(String str, double d);

    @Query("SELECT * FROM h5_offline_record WHERE productCode = :productCode")
    public abstract List<H5OfflineRecord> h(String str);

    @Query("SELECT * FROM h5_offline_record WHERE productCode = :productCode and appId = :appId")
    public abstract List<H5OfflineRecord> i(String str, double d);
}
