package com.heytap.health.base.splitapk;

import androidx.annotation.Keep;
import com.heytap.health.base.track.a;
import io.protostuff.MapSchema;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\t\bÆ\u0002\u0018\u00002\u00020\u0001:\u0001\u0015B\t\b\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u0018\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002J\u0016\u0010\u0007\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002J\u0018\u0010\b\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002J\u0016\u0010\t\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002J\u0016\u0010\n\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002J*\u0010\u000f\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\r2\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002H\u0002R\u0014\u0010\u0010\u001a\u00020\r8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\r8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0011¨\u0006\u0016"}, d2 = {"Lcom/heytap/health/base/splitapk/SplitTrack;", "", "", "split", "msg", "", "b", "c", "d", MapSchema.FIELD_NAME_ENTRY, "f", "Lcom/heytap/health/base/splitapk/SplitTrack$Stage;", "stage", "", "type", "a", "TYPE_STAT", "I", "TYPE_ERROR", "<init>", "()V", "Stage", "lib_base_release"}, k = 1, mv = {1, 8, 0})
public final class SplitTrack {

    @NotNull
    public static final SplitTrack INSTANCE = new SplitTrack();
    public static final int TYPE_ERROR = 2;
    public static final int TYPE_STAT = 1;

    @Keep
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0087\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lcom/heytap/health/base/splitapk/SplitTrack$Stage;", "", "(Ljava/lang/String;I)V", "Download", "Install", "Load", "lib_base_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public enum Stage {
        Download,
        Install,
        Load
    }

    public final void a(String split, Stage stage, int type, String msg) {
        a.b bVarA = new a.b(4013).a("split", split).a("stage", stage.name()).a("type", Integer.valueOf(type));
        if (!(msg == null || msg.length() == 0)) {
            bVarA.a("msg", msg);
        }
        bVarA.b();
    }

    public final void b(@NotNull String split, @Nullable String msg) {
        Intrinsics.checkNotNullParameter(split, "split");
        a(split, Stage.Download, 1, msg);
    }

    public final void c(@NotNull String split, @NotNull String msg) {
        Intrinsics.checkNotNullParameter(split, "split");
        Intrinsics.checkNotNullParameter(msg, "msg");
        a(split, Stage.Download, 2, msg);
    }

    public final void d(@NotNull String split, @Nullable String msg) {
        Intrinsics.checkNotNullParameter(split, "split");
        a(split, Stage.Install, 1, msg);
    }

    public final void e(@NotNull String split, @NotNull String msg) {
        Intrinsics.checkNotNullParameter(split, "split");
        Intrinsics.checkNotNullParameter(msg, "msg");
        a(split, Stage.Install, 2, msg);
    }

    public final void f(@NotNull String split, @NotNull String msg) {
        Intrinsics.checkNotNullParameter(split, "split");
        Intrinsics.checkNotNullParameter(msg, "msg");
        a(split, Stage.Load, 2, msg);
    }
}
