package com.oplus.aiunit.vision;

import androidx.lifecycle.LiveData;
import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import java.util.List;

/* JADX INFO: loaded from: classes19.dex */
@Dao
public interface v9c {
    @Insert(onConflict = 1)
    void a(List<dac> list);

    @Query("SELECT * FROM music_record WHERE mac_address = :macAddress ORDER BY `index` ASC")
    LiveData<List<dac>> b(String str);

    @Delete
    void c(dac dacVar);

    @Query("DELETE from music_record WHERE mac_address = :macAddress")
    void o(String str);

    @Query("SELECT * FROM music_record WHERE mac_address = :macAddress ORDER BY `index` ASC")
    List<dac> query(String str);
}
