package com.oplus.aiunit.vision;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;
import com.google.android.gms.actions.SearchIntents;
import com.heytap.health.watch.notification.NotificationRoomBean;
import io.protostuff.MapSchema;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;

/* JADX INFO: loaded from: classes19.dex */
@Dao
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010!\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0005\bg\u0018\u00002\u00020\u0001J\u0012\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0003\u001a\u00020\u0002H'J \u0010\b\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0018\u00010\u00062\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00020\u0006H'J\u000e\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00040\tH'J\u0010\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\u0004H'J\u001c\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\f0\t2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00040\tH'J\u0010\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000b\u001a\u00020\u000fH'J\u0016\u0010\u0013\u001a\u00020\u00102\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0006H'J\u0010\u0010\u0014\u001a\u00020\u00102\u0006\u0010\u000b\u001a\u00020\u0004H'¨\u0006\u0015"}, d2 = {"Lcom/oplus/aiunit/vision/kxc;", "", "", "packageName", "Lcom/heytap/health/watch/notification/NotificationRoomBean;", SearchIntents.EXTRA_QUERY, "", "pks", "b", "", "j", "user", "", "f", "a", "Lcom/oplus/aiunit/vision/jxc;", "", MapSchema.FIELD_NAME_ENTRY, "beans", "d", "c", "device_notification_impl2_release"}, k = 1, mv = {1, 8, 0})
public interface kxc {
    @Insert(onConflict = 1)
    @NotNull
    List<Long> a(@NotNull List<NotificationRoomBean> user);

    @Query("SELECT * FROM notification_packages where packageName in (:pks)")
    @Nullable
    List<NotificationRoomBean> b(@NotNull List<String> pks);

    @Delete
    int c(@NotNull NotificationRoomBean user);

    @Update(entity = NotificationRoomBean.class, onConflict = 1)
    int d(@NotNull List<NotificationRoomBeanStatus> beans);

    @Update(entity = NotificationRoomBean.class, onConflict = 1)
    int e(@NotNull NotificationRoomBeanStatus user);

    @Insert(onConflict = 1)
    long f(@NotNull NotificationRoomBean user);

    @Query("SELECT * FROM notification_packages ORDER BY viewType DESC , isOpen DESC , appNamePy ASC ")
    @NotNull
    List<NotificationRoomBean> j();

    @Query("SELECT * FROM notification_packages where packageName = :packageName")
    @Nullable
    NotificationRoomBean query(@NotNull String packageName);
}
