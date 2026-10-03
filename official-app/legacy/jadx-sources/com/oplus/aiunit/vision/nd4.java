package com.oplus.aiunit.vision;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;
import androidx.room.Upsert;
import java.util.List;

/* JADX INFO: loaded from: classes19.dex */
@Dao
public interface nd4 {
    @Query("DELETE FROM creationrecord WHERE mac_address = :macAddress")
    void delete(String str);

    @Query("DELETE FROM creationrecord WHERE mac_address = :macAddress AND packageName = :packageName")
    void delete(String str, String str2);

    @Delete
    int i(List<ud4> list);

    @Query("SELECT * FROM creationrecord")
    List<ud4> j();

    @Query("SELECT position FROM creationrecord order by position limit 1")
    int k();

    @Query("SELECT * FROM creationrecord WHERE type = :type AND mac_address=:macAddress AND unique_flag=:uniqueFlag AND isDelete = 0 limit 1")
    ud4 l(int i, String str, String str2);

    @Update
    int m(ud4 ud4Var);

    @Insert(onConflict = 1)
    void n(ud4 ud4Var);

    @Delete
    int o(ud4 ud4Var);

    @Query("DELETE FROM creationrecord WHERE type = :type AND mac_address = :macAddress")
    void p(int i, String str);

    @Query("SELECT * FROM creationrecord WHERE type = :type AND mac_address=:macAddress order by position")
    List<ud4> q(int i, String str);

    @Upsert
    void r(ud4 ud4Var);

    @Query("SELECT * FROM creationrecord WHERE  mac_address=:macAddress AND packageName=:packageName limit 1")
    ud4 s(String str, String str2);

    @Query("SELECT COUNT(position) FROM creationrecord WHERE type = :type AND mac_address = :macAddress")
    int t(int i, String str);

    @Query("SELECT COUNT(position) FROM creationrecord WHERE  mac_address = :macAddress")
    int u(String str);

    @Query("SELECT * FROM creationrecord WHERE type = :type AND mac_address=:macAddress AND unique_flag=:uniqueFlag limit 1")
    ud4 v(int i, String str, String str2);

    @Query("SELECT * FROM creationrecord WHERE type = :type AND mac_address=:macAddress AND isDelete = 0 order by position")
    List<ud4> w(int i, String str);

    @Query("SELECT COUNT(position) FROM creationrecord WHERE type = :type AND mac_address = :macAddress AND isDelete = 0")
    int x(int i, String str);
}
