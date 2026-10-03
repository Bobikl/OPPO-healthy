package com.oplus.aiunit.vision;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.Query;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;

/* JADX INFO: loaded from: classes19.dex */
@Dao
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\bg\u0018\u00002\u00020\u0001J(\u0010\t\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004H'J\u001a\u0010\f\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH'J\u0010\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\bH'J\u0010\u0010\u0010\u001a\u00020\u000e2\u0006\u0010\u0003\u001a\u00020\u0002H'J\u0018\u0010\u0011\u001a\u00020\u000e2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH'¨\u0006\u0012"}, d2 = {"Lcom/oplus/aiunit/vision/bhf;", "", "", "uniqueFlag", "", "pageSize", TypedValues.CycleType.S_WAVE_OFFSET, "", "Lcom/oplus/aiunit/vision/dhf;", "d", "", "fileId", "c", "record", "", "a", "delete", "b", "recordfilemanager_impl_release"}, k = 1, mv = {1, 8, 0})
public interface bhf {
    @Insert(onConflict = 1)
    void a(@NotNull RecordFileDbBean record);

    @Query("DELETE FROM RecordFileDbBean WHERE unique_flag = :uniqueFlag AND file_Id =:fileId")
    void b(@NotNull String uniqueFlag, long fileId);

    @Query("SELECT * FROM RecordFileDbBean WHERE  unique_flag=:uniqueFlag AND file_Id =:fileId")
    @Nullable
    RecordFileDbBean c(@NotNull String uniqueFlag, long fileId);

    @Query("SELECT * FROM RecordFileDbBean WHERE  unique_flag=:uniqueFlag ORDER BY rowid DESC LIMIT :pageSize OFFSET :offset ")
    @Nullable
    List<RecordFileDbBean> d(@NotNull String uniqueFlag, int pageSize, int offset);

    @Query("DELETE FROM RecordFileDbBean WHERE unique_flag = :uniqueFlag")
    void delete(@NotNull String uniqueFlag);
}
