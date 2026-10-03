package com.oplus.aiunit.vision;

import android.content.Context;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.preference.PreferenceManager;
import com.heytap.health.sport.model.MovingGoal;
import com.heytap.sports.R$string;
import io.protostuff.MapSchema;
import java.util.Locale;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0011\u0010\u0012J\u0006\u0010\u0003\u001a\u00020\u0002J\u0006\u0010\u0004\u001a\u00020\u0002J\u0006\u0010\u0005\u001a\u00020\u0002R\u0017\u0010\n\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\u0007\u0010\tR\u0011\u0010\u000e\u001a\u00020\u000b8F¢\u0006\u0006\u001a\u0004\b\f\u0010\r¨\u0006\u0013"}, d2 = {"Lcom/oplus/aiunit/vision/gji;", "", "", "c", "d", MapSchema.FIELD_NAME_ENTRY, "Lcom/oplus/aiunit/vision/eki;", "a", "Lcom/oplus/aiunit/vision/eki;", "()Lcom/oplus/aiunit/vision/eki;", "speaker", "", "b", "()Z", "isEnabled", "Lcom/heytap/health/sport/model/MovingGoal;", "goal", "<init>", "(Lcom/heytap/health/sport/model/MovingGoal;)V", "sport_impl_release"}, k = 1, mv = {1, 8, 0})
public final class gji {
    public static final int $stable = 8;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final eki speaker;

    public gji(@NotNull MovingGoal goal) {
        Intrinsics.checkNotNullParameter(goal, "goal");
        this.speaker = new eki(goal);
    }

    @NotNull
    /* JADX INFO: renamed from: a, reason: from getter */
    public final eki getSpeaker() {
        return this.speaker;
    }

    public final boolean b() {
        if (!Intrinsics.areEqual(Locale.CHINA.getLanguage(), kta.c()) && !Intrinsics.areEqual("ug", kta.c())) {
            return false;
        }
        Context contextA = b78.a();
        return contextA != null && PreferenceManager.getDefaultSharedPreferences(contextA).getBoolean(contextA.getString(R$string.sports_key_switch_voice), true);
    }

    public final void c() {
        if (b()) {
            this.speaker.z();
        }
    }

    public final void d() {
        if (b()) {
            this.speaker.F();
        }
    }

    public final void e() {
        if (b()) {
            this.speaker.I();
        }
    }
}
