package com.heytap.accessory.pair.common.db;

import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;
import java.util.List;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes14.dex */
@Dao
public interface KscDao {
    @Query("DELETE FROM ksc_info WHERE deviceId = :deviceId AND alias = :alias")
    void delete(String str, String str2);

    @Query("SELECT * FROM ksc_info ORDER BY date")
    List<EncryptedKscInfo> getAllKscInfos();

    @Query("SELECT * FROM ksc_info WHERE deviceId = :deviceId")
    List<EncryptedKscInfo> getKscInfo(String str);

    @Query("SELECT * FROM ksc_info WHERE deviceId = :deviceId AND alias = :alias")
    List<EncryptedKscInfo> getKscInfo(String str, String str2);

    @Insert(onConflict = 1)
    void insert(EncryptedKscInfo encryptedKscInfo);

    @Update
    void update(EncryptedKscInfo encryptedKscInfo);
}
