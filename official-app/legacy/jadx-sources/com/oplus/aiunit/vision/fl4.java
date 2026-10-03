package com.oplus.aiunit.vision;

import android.net.Uri;
import com.heytap.log.formatter.LogFieldKey;
import io.protostuff.MapSchema;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Deprecated;
import p010kotlin.Metadata;
import p010kotlin.ReplaceWith;

/* JADX INFO: loaded from: classes16.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\bf\u0018\u00002\u00020\u0001:\u0001\u0016J4\u0010\n\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0004H'J@\u0010\r\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u00042\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000bH&J \u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u000eH&J \u0010\u0012\u001a\u00020\u00102\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u000eH&J \u0010\u0014\u001a\u00020\u00102\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0013\u001a\u00020\u00072\u0006\u0010\u000f\u001a\u00020\u000eH&J \u0010\u0015\u001a\u00020\u00102\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0013\u001a\u00020\u00072\u0006\u0010\u000f\u001a\u00020\u000eH&¨\u0006\u0017"}, d2 = {"Lcom/oplus/aiunit/vision/fl4;", "", "Lcom/oplus/aiunit/vision/ra5;", "role", "", "mac", "type", "", "serviceId", "filePath", "f", "Landroid/net/Uri;", "fileUri", "i", "Lcom/oplus/aiunit/vision/fl4$a;", "listener", "", b2n.f, LogFieldKey.LEVEL_KEY, "serverId", b2n.g, MapSchema.FIELD_NAME_KEY, "a", "device_manager_release"}, k = 1, mv = {1, 8, 0})
public interface fl4 {

    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J \u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H&J \u0010\n\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H&J \u0010\u000b\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H&¨\u0006\f"}, d2 = {"Lcom/oplus/aiunit/vision/fl4$a;", "", "Lcom/oplus/aiunit/vision/ra5$c;", "role", "", "macAddress", "Lcom/oplus/aiunit/vision/mc7;", "fileTaskInfo", "", "b", "a", "c", "device_manager_release"}, k = 1, mv = {1, 8, 0})
    public interface a {
        void a(@NotNull ra5.c role, @NotNull String macAddress, @NotNull mc7 fileTaskInfo);

        void b(@NotNull ra5.c role, @NotNull String macAddress, @NotNull mc7 fileTaskInfo);

        void c(@NotNull ra5.c role, @NotNull String macAddress, @NotNull mc7 fileTaskInfo);
    }

    @Deprecated(message = "高版本使用路径不能直接读取，需要使用uri，使用前要授权", replaceWith = @ReplaceWith(expression = "sendFileAndroidUri", imports = {}))
    @Nullable
    String f(@NotNull ra5 role, @Nullable String mac, @NotNull String type, int serviceId, @NotNull String filePath);

    void g(@NotNull ra5 role, @NotNull String type, @NotNull a listener);

    void h(@NotNull ra5 role, int serverId, @NotNull a listener);

    @Nullable
    String i(@NotNull ra5 role, @Nullable String mac, @NotNull String type, int serviceId, @NotNull String filePath, @Nullable Uri fileUri);

    void k(@NotNull ra5 role, int serverId, @NotNull a listener);

    void l(@NotNull ra5 role, @NotNull String type, @NotNull a listener);
}
