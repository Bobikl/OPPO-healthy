package com.heytap.health.health_archives.autosync;

import com.oplus.aiunit.vision.a7b;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;

/* JADX INFO: loaded from: classes16.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J\u001e\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004H&J\b\u0010\b\u001a\u00020\u0006H\u0016J\b\u0010\t\u001a\u00020\u0006H\u0016¨\u0006\n"}, d2 = {"Lcom/heytap/health/health_archives/autosync/a;", "", "", "progressCount", "", "progressPrompt", "", "c", "b", "a", "health_archives_release"}, k = 1, mv = {1, 8, 0})
public interface a {

    /* JADX INFO: renamed from: com.heytap.health.health_archives.autosync.a$a, reason: collision with other inner class name */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public static final class C0442a {
        public static void a(@NotNull a aVar) {
            a7b.f("AutoSyncCallback", "onSyncAlbumComplete");
        }

        public static void b(@NotNull a aVar) {
            a7b.f("AutoSyncCallback", "onSyncPdfComplete");
        }

        public static /* synthetic */ void c(a aVar, int i, String str, int i2, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: onSyncProgressChange");
            }
            if ((i2 & 1) != 0) {
                i = 0;
            }
            if ((i2 & 2) != 0) {
                str = null;
            }
            aVar.c(i, str);
        }
    }

    void a();

    void b();

    void c(int progressCount, @Nullable String progressPrompt);
}
