package com.oplus.aiunit.vision;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import com.heytap.health.watchface.business.creation.db.LivePhotoRecord;
import java.util.List;

/* JADX INFO: loaded from: classes19.dex */
@Dao
public interface i2b {
    @Insert(onConflict = 1)
    void a(LivePhotoRecord livePhotoRecord);

    @Query("SELECT * FROM livePhotoRecord WHERE device_flag=:device_flag AND taskStatus != 0")
    List<LivePhotoRecord> b(String str);

    @Query("DELETE FROM livePhotoRecord WHERE taskId = :taskId")
    void c(long j2);

    @Query("SELECT * FROM livePhotoRecord WHERE device_flag=:device_flag AND (taskStatus = 0 OR taskStatus = 100)")
    List<LivePhotoRecord> d(String str);

    @Query("DELETE FROM livePhotoRecord WHERE device_flag = :device_flag")
    void delete(String str);

    @Delete
    int e(LivePhotoRecord livePhotoRecord);

    @Query("SELECT * FROM livePhotoRecord WHERE device_flag=:device_flag AND taskStatus = 0")
    List<LivePhotoRecord> f(String str);

    @Query("SELECT * FROM livePhotoRecord WHERE device_flag=:device_flag AND taskStatus = 100")
    List<LivePhotoRecord> g(String str);
}
