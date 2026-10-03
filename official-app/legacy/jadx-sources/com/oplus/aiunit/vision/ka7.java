package com.oplus.aiunit.vision;

import android.net.Uri;
import io.protostuff.MapSchema;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Deprecated;
import p010kotlin.Metadata;
import p010kotlin.ReplaceWith;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\bf\u0018\u00002\u00020\u0001:\u0001\bJ,\u0010\b\u001a\u0004\u0018\u00010\u00022\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002H'J8\u0010\u000b\u001a\u0004\u0018\u00010\u00022\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u00022\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\tH&J\u0018\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\u0002H&J\u0010\u0010\u0011\u001a\u00020\u00102\u0006\u0010\f\u001a\u00020\u0002H&J\u0010\u0010\u0012\u001a\u00020\u00102\u0006\u0010\f\u001a\u00020\u0002H&J\u0018\u0010\u0015\u001a\u00020\u00102\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0014\u001a\u00020\u0013H&J\u0018\u0010\u0016\u001a\u00020\u00102\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0014\u001a\u00020\u0013H&J\u0018\u0010\u0018\u001a\u00020\u00102\u0006\u0010\u0017\u001a\u00020\u00052\u0006\u0010\u0014\u001a\u00020\u0013H&J\u0018\u0010\u0019\u001a\u00020\u00102\u0006\u0010\u0017\u001a\u00020\u00052\u0006\u0010\u0014\u001a\u00020\u0013H&J\u0010\u0010\u001a\u001a\u00020\u00102\u0006\u0010\u0014\u001a\u00020\u0013H&J\u0010\u0010\u001b\u001a\u00020\u00102\u0006\u0010\u0014\u001a\u00020\u0013H&¨\u0006\u001c"}, d2 = {"Lcom/oplus/aiunit/vision/ka7;", "", "", "mac", "type", "", "serviceId", "filePath", "a", "Landroid/net/Uri;", "fileUri", "b", "taskId", "receivePath", "", "receiveFile", "", "rejectFile", "cancelFile", "Lcom/oplus/aiunit/vision/ka7$a;", "listener", "f", b2n.f, "serverId", "c", b2n.g, "d", MapSchema.FIELD_NAME_ENTRY, "lib_heytapconnect_release"}, k = 1, mv = {1, 8, 0})
public interface ka7 {

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H&J\u0018\u0010\b\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H&J\u0018\u0010\t\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H&¨\u0006\n"}, d2 = {"Lcom/oplus/aiunit/vision/ka7$a;", "", "", "macAddress", "Lcom/oplus/aiunit/vision/mc7;", "fileTaskInfo", "", "c", "a", "b", "lib_heytapconnect_release"}, k = 1, mv = {1, 8, 0})
    public interface a {
        void a(@NotNull String macAddress, @NotNull mc7 fileTaskInfo);

        void b(@NotNull String macAddress, @NotNull mc7 fileTaskInfo);

        void c(@NotNull String macAddress, @NotNull mc7 fileTaskInfo);
    }

    @Deprecated(message = "高版本使用路径不能直接读取，需要使用uri，使用前要授权", replaceWith = @ReplaceWith(expression = "sendFileAndroidUri", imports = {}))
    @Nullable
    String a(@Nullable String mac, @NotNull String type, int serviceId, @NotNull String filePath);

    @Nullable
    String b(@Nullable String mac, @NotNull String type, int serviceId, @NotNull String filePath, @Nullable Uri fileUri);

    void c(int serverId, @NotNull a listener);

    void cancelFile(@NotNull String taskId);

    void d(@NotNull a listener);

    void e(@NotNull a listener);

    void f(@NotNull String type, @NotNull a listener);

    void g(@NotNull String type, @NotNull a listener);

    void h(int serverId, @NotNull a listener);

    boolean receiveFile(@NotNull String taskId, @NotNull String receivePath);

    void rejectFile(@NotNull String taskId);
}
