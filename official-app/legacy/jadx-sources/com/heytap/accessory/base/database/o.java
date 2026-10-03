package com.heytap.accessory.base.database;

import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.Query;
import java.util.List;

/* JADX INFO: loaded from: classes14.dex */
@Dao
public interface o {
    @Query("DELETE FROM ServiceDescription WHERE agentId = :agentId AND deviceId = :deviceId")
    int a(int i, String str);

    @Query("DELETE FROM ServiceDescription WHERE agentId = :agentId")
    int a(long j2);

    @Query("DELETE FROM ServiceDescription WHERE agentId = :agentId AND profileId = :profileId AND deviceId = :deviceId AND appName = :appName AND role = :role")
    int a(String str, String str2, long j2, String str3, int i);

    @Insert(onConflict = 1)
    long a(q qVar);

    @Query("SELECT agentId FROM ServiceDescription")
    List<Long> a();

    @Query("SELECT * FROM ServiceDescription WHERE deviceId = :deviceId")
    List<q> a(int i);

    @Query("SELECT appName FROM ServiceDescription WHERE agentId = :agentId")
    List<String> a(String str);

    @Query("SELECT agentId FROM ServiceDescription WHERE profileId = :profileId AND deviceId = :deviceId AND appName = :appName AND role = :role")
    List<Long> a(String str, long j2, String str2, int i);

    @Query("UPDATE ServiceDescription SET sdkVersionCode = :sdkVersionCode WHERE appName = :appName AND agentImplClass = :agentImplClass")
    void a(int i, String str, String str2);

    @Query("DELETE FROM ServiceDescription WHERE deviceId = :deviceId")
    int b(int i);

    @Query("SELECT _id FROM ServiceDescription WHERE profileId = :profileId AND deviceId = :deviceId AND appName = :appName AND role = :role")
    List<Integer> b(String str, long j2, String str2, int i);
}
