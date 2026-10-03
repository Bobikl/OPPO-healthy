package com.oplus.aiunit.vision;

import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.Query;
import com.heytap.databaseengineservice.db.table.weight.DBFamilyMemberInfo;
import java.util.List;

/* JADX INFO: loaded from: classes15.dex */
@Dao
public interface u47 {
    @Insert(onConflict = 1)
    List<Long> a(List<DBFamilyMemberInfo> list);

    @Query("select * from DBFamilyMemberInfoTable where ssoid = :ssoid and sub_account = :subAccount and deleted != 1")
    DBFamilyMemberInfo b(String str, int i);

    @Insert(onConflict = 1)
    Long c(DBFamilyMemberInfo dBFamilyMemberInfo);

    @Query("select * from DBFamilyMemberInfoTable where ssoid = :ssoid and user_tag_id = :userTagId and deleted != 1")
    DBFamilyMemberInfo d(String str, String str2);

    @Query("select * from DBFamilyMemberInfoTable where ssoid = :ssoid and deleted != 1 order by created_timestamp asc")
    List<DBFamilyMemberInfo> query(String str);
}
