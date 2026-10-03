package com.heytap.health.settings.watch.sporthealthsettings2.ui.collaborationRelated;

import androidx.compose.runtime.internal.StabilityInferred;
import com.heytap.log.consts.LogSenderConst;
import com.oplus.aiunit.vision.a7b;
import com.oplus.aiunit.vision.b2n;
import com.oplus.aiunit.vision.b78;
import com.oplus.aiunit.vision.ci3;
import io.protostuff.MapSchema;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.Unit;
import p010kotlin.jvm.internal.Intrinsics;
import p010kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: classes18.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\u00020\u0001:\u0001\u0005B\t\b\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\t\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0007J\u000e\u0010\u000b\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u0007J\u000e\u0010\u000e\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\fJ:\u0010\u0016\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u000f2\b\u0010\u0012\u001a\u0004\u0018\u00010\u000f2\b\u0010\u0013\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\u0014\u001a\u00020\u000f2\u0006\u0010\u0015\u001a\u00020\u000fJ\u000e\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0017\u001a\u00020\u000fR\u001a\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00020\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u001b¨\u0006\u001f"}, d2 = {"Lcom/heytap/health/settings/watch/sporthealthsettings2/ui/collaborationRelated/a;", "", "Lcom/heytap/health/settings/watch/sporthealthsettings2/ui/collaborationRelated/a$a;", "listener", "", "a", b2n.f, "", "progress", MapSchema.FIELD_NAME_ENTRY, "status", "f", "", "success", "d", "", "url", LogSenderConst.FILENAME, "fileMd5", CloudDownloadWorker.KEY_SECRET, "tempDir", "decryptDir", "b", "child", "Ljava/io/File;", "c", "", "Ljava/util/List;", "listeners", "<init>", "()V", "device_settings_impl_release"}, k = 1, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nCloudDownloadManager.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CloudDownloadManager.kt\ncom/heytap/health/settings/watch/sporthealthsettings2/ui/collaborationRelated/CloudDownloadManager\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,141:1\n1855#2,2:142\n1855#2,2:144\n1855#2,2:146\n*S KotlinDebug\n*F\n+ 1 CloudDownloadManager.kt\ncom/heytap/health/settings/watch/sporthealthsettings2/ui/collaborationRelated/CloudDownloadManager\n*L\n66#1:142,2\n75#1:144,2\n84#1:146,2\n*E\n"})
public final class a {

    @NotNull
    public static final a INSTANCE = new a();

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public static final List<InterfaceC0623a> listeners = new ArrayList();
    public static final int $stable = 8;

    /* JADX INFO: renamed from: com.heytap.health.settings.watch.sporthealthsettings2.ui.collaborationRelated.a$a, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&J\u0010\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0002H&J\u0010\u0010\n\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\bH&¨\u0006\u000b"}, d2 = {"Lcom/heytap/health/settings/watch/sporthealthsettings2/ui/collaborationRelated/a$a;", "", "", "progress", "", "onProgressChanged", "status", "a", "", "success", "b", "device_settings_impl_release"}, k = 1, mv = {1, 8, 0})
    public interface InterfaceC0623a {
        void a(int status);

        void b(boolean success);

        void onProgressChanged(int progress);
    }

    public final void a(@NotNull InterfaceC0623a listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        List<InterfaceC0623a> list = listeners;
        synchronized (list) {
            if (!list.contains(listener)) {
                list.add(listener);
            }
            Unit unit = Unit.INSTANCE;
        }
    }

    public final void b(@NotNull String url, @NotNull String fileName, @Nullable String fileMd5, @Nullable String secret, @NotNull String tempDir, @NotNull String decryptDir) {
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullParameter(fileName, "fileName");
        Intrinsics.checkNotNullParameter(tempDir, "tempDir");
        Intrinsics.checkNotNullParameter(decryptDir, "decryptDir");
        if (secret == null) {
            a7b.b("CloudDownloadManager", "downloadAndDecrypt: secret 为 null");
            f(2);
            d(false);
            return;
        }
        try {
            ci3.INSTANCE.c(url, fileName, fileMd5, secret, tempDir, decryptDir);
            a7b.f("CloudDownloadManager", "downloadAndDecrypt: 下载任务已启动");
        } catch (Exception e2) {
            a7b.c("CloudDownloadManager", "downloadAndDecrypt: 启动下载任务失败", e2);
            f(2);
            d(false);
        }
    }

    @NotNull
    public final File c(@NotNull String child) {
        Intrinsics.checkNotNullParameter(child, "child");
        return new File(b78.a().getFilesDir(), child);
    }

    public final void d(boolean success) {
        List<InterfaceC0623a> list = listeners;
        synchronized (list) {
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                ((InterfaceC0623a) it.next()).b(success);
            }
            Unit unit = Unit.INSTANCE;
        }
    }

    public final void e(int progress) {
        List<InterfaceC0623a> list = listeners;
        synchronized (list) {
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                ((InterfaceC0623a) it.next()).onProgressChanged(progress);
            }
            Unit unit = Unit.INSTANCE;
        }
    }

    public final void f(int status) {
        List<InterfaceC0623a> list = listeners;
        synchronized (list) {
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                ((InterfaceC0623a) it.next()).a(status);
            }
            Unit unit = Unit.INSTANCE;
        }
    }

    public final void g(@NotNull InterfaceC0623a listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        List<InterfaceC0623a> list = listeners;
        synchronized (list) {
            list.remove(listener);
        }
    }
}
