package com.oplus.aiunit.vision;

import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;
import com.heytap.health.watch.contactsync.db.table.DBSelectContactLite;
import java.util.List;

/* JADX INFO: loaded from: classes19.dex */
@Dao
public interface trg {
    @Insert(onConflict = 1)
    void a(List<DBSelectContactLite> list);

    @Query("delete from selectcontact_lite where mac_address = :macAddress and contact_id in (:id)")
    int b(String str, Long[] lArr);

    @Query("delete from selectcontact_lite where mac_address = :macAddress")
    int c(String str);

    @Update
    int d(List<DBSelectContactLite> list);

    @Query("select * from selectcontact_lite where mac_address =:macAddress order by sort ASC")
    List<DBSelectContactLite> query(String str);
}
