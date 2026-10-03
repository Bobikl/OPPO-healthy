package com.heytap.health.base.track.quality;

import androidx.annotation.Keep;
import com.coloros.sceneservice.e.b;
import com.heytap.health.base.track.a;
import com.oplus.aiunit.vision.b2n;
import com.oplus.aiunit.vision.cxe;
import io.protostuff.MapSchema;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\bÆ\u0002\u0018\u00002\u00020\u0001:\u0001\u0012B\t\b\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u0016\u0010\b\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0006J\u000e\u0010\t\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u0016\u0010\n\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0006J\u000e\u0010\u000b\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u0018\u0010\f\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u0006J \u0010\u000f\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¨\u0006\u0013"}, d2 = {"Lcom/heytap/health/base/track/quality/QualityTrack;", "", "Lcom/heytap/health/base/track/quality/Scenes;", "qs", "", "b", "", "stageReason", "c", "f", b2n.f, "d", MapSchema.FIELD_NAME_ENTRY, "Lcom/heytap/health/base/track/quality/QualityTrack$Stage;", "stage", "a", "<init>", "()V", "Stage", "lib_base_release"}, k = 1, mv = {1, 8, 0})
public final class QualityTrack {

    @NotNull
    public static final QualityTrack INSTANCE = new QualityTrack();

    @Keep
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0087\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lcom/heytap/health/base/track/quality/QualityTrack$Stage;", "", "(Ljava/lang/String;I)V", "Enter", cxe.MSG_SUC, "Fail", "lib_base_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public enum Stage {
        Enter,
        Success,
        Fail
    }

    public final void a(Scenes qs, Stage stage, String stageReason) {
        a.b bVar = new a.b(4008);
        bVar.a(b.TABLE_NAME, qs.name());
        bVar.a("stage", stage.name());
        if (stageReason.length() > 0) {
            bVar.a("stage_reason", stageReason);
        }
        bVar.b();
    }

    public final void b(@NotNull Scenes qs) {
        Intrinsics.checkNotNullParameter(qs, "qs");
        c(qs, "");
    }

    public final void c(@NotNull Scenes qs, @NotNull String stageReason) {
        Intrinsics.checkNotNullParameter(qs, "qs");
        Intrinsics.checkNotNullParameter(stageReason, "stageReason");
        a(qs, Stage.Enter, stageReason);
    }

    public final void d(@NotNull Scenes qs) {
        Intrinsics.checkNotNullParameter(qs, "qs");
        e(qs, "");
    }

    public final void e(@NotNull Scenes qs, @NotNull String stageReason) {
        Intrinsics.checkNotNullParameter(qs, "qs");
        Intrinsics.checkNotNullParameter(stageReason, "stageReason");
        a(qs, Stage.Fail, stageReason);
    }

    public final void f(@NotNull Scenes qs) {
        Intrinsics.checkNotNullParameter(qs, "qs");
        g(qs, "");
    }

    public final void g(@NotNull Scenes qs, @NotNull String stageReason) {
        Intrinsics.checkNotNullParameter(qs, "qs");
        Intrinsics.checkNotNullParameter(stageReason, "stageReason");
        a(qs, Stage.Success, stageReason);
    }
}
