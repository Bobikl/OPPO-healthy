package com.oplus.aiunit.vision;

import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;
import com.google.android.gms.actions.SearchIntents;
import com.heytap.health.watch.notification.NotificationCloudStatusBean;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;

/* JADX INFO: loaded from: classes19.dex */
@Dao
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001J\u0012\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0003\u001a\u00020\u0002H'J\u0010\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0004H'J\u0010\u0010\n\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u0004H'¨\u0006\u000b"}, d2 = {"Lcom/oplus/aiunit/vision/qvc;", "", "", "mac", "Lcom/heytap/health/watch/notification/NotificationCloudStatusBean;", SearchIntents.EXTRA_QUERY, "bean", "", "a", "", "b", "device_notification_impl2_release"}, k = 1, mv = {1, 8, 0})
public interface qvc {
    @Insert(onConflict = 1)
    long a(@NotNull NotificationCloudStatusBean bean);

    @Update(onConflict = 1)
    int b(@NotNull NotificationCloudStatusBean bean);

    @Query("SELECT * FROM cloud_status where devices = :mac")
    @Nullable
    NotificationCloudStatusBean query(@NotNull String mac);
}
