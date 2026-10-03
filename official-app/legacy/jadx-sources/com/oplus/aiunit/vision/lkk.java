package com.oplus.aiunit.vision;

import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;
import com.pantanal.server.content.upkmanage.entity.UpkEntity;
import io.protostuff.MapSchema;
import java.util.List;
import kotlinx.coroutines.flow.Flow;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Dao
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\n\bg\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H'J\u0010\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H'J\u0010\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007H'J\u0016\u0010\r\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\f\u0018\u00010\u000bH'J\u0012\u0010\u000e\u001a\u0004\u0018\u00010\u00022\u0006\u0010\b\u001a\u00020\u0007H'J\u0012\u0010\u0010\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u000f\u001a\u00020\u0007H'J\u0018\u0010\u0012\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\u0011\u001a\u00020\tH'J\b\u0010\u0013\u001a\u00020\u0004H'J\u0010\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\fH'J\u001c\u0010\u0015\u001a\u0004\u0018\u00010\u00022\b\u0010\b\u001a\u0004\u0018\u00010\u00072\u0006\u0010\u0011\u001a\u00020\tH'¨\u0006\u0016"}, d2 = {"Lcom/oplus/aiunit/vision/lkk;", "", "Lcom/pantanal/server/content/upkmanage/entity/UpkEntity;", "upkEntity", "", MapSchema.FIELD_NAME_ENTRY, b2n.g, "", "serviceId", "", "c", "Lkotlinx/coroutines/flow/Flow;", "", "f", "i", "packageName", b2n.f, "versionCode", "a", "d", "b", "j", "staticmanagersdk_release"}, k = 1, mv = {1, 5, 1})
public interface lkk {
    @Query("update UpkEntity set need_delete = 1 where service_id = (:serviceId) and version_code = (:versionCode)")
    void a(@NotNull String serviceId, int versionCode);

    @Query("select files_directory_path from UpkEntity where need_delete = 1")
    @Nullable
    List<String> b();

    @Query("delete from UpkEntity where service_id = :serviceId")
    int c(@NotNull String serviceId);

    @Query("delete from UpkEntity where need_delete = 1")
    void d();

    @Insert(onConflict = 1)
    void e(@NotNull UpkEntity upkEntity);

    @Query("SELECT * FROM UpkEntity")
    @Nullable
    Flow<List<UpkEntity>> f();

    @Query("SELECT * FROM UpkEntity WHERE host_package_name = :packageName")
    @Nullable
    UpkEntity g(@NotNull String packageName);

    @Update
    void h(@NotNull UpkEntity upkEntity);

    @Query("SELECT * FROM UpkEntity WHERE service_id = :serviceId and need_delete = -1")
    @Nullable
    UpkEntity i(@NotNull String serviceId);

    @Query("select *from UpkEntity where service_id = (:serviceId) and version_code = (:versionCode)")
    @Nullable
    UpkEntity j(@Nullable String serviceId, int versionCode);
}
