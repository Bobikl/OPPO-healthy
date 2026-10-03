package com.oplus.aiunit.vision;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.runtime.internal.StabilityInferred;
import com.heytap.health.health.insight.DevSignsData;
import com.heytap.health.health.insight.InsightService;
import com.heytap.log.formatter.LogFieldKey;
import com.heytap.sports.R$id;
import com.heytap.sports.R$layout;
import io.protostuff.MapSchema;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\r\u001a\u00020\n¢\u0006\u0004\b\u000e\u0010\u000fJ\b\u0010\u0003\u001a\u00020\u0002H\u0016J\u001a\u0010\t\u001a\u00020\b2\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016R\u0014\u0010\r\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\f¨\u0006\u0010"}, d2 = {"Lcom/oplus/aiunit/vision/jmh;", "Lcom/oplus/aiunit/vision/c11;", "", MapSchema.FIELD_NAME_ENTRY, "Landroid/content/Context;", "context", "Landroid/view/View;", "cardView", "", LogFieldKey.LEVEL_KEY, "Lcom/heytap/health/health/insight/DevSignsData;", LogFieldKey.PROCESS_NAME_KEY, "Lcom/heytap/health/health/insight/DevSignsData;", "data", "<init>", "(Lcom/heytap/health/health/insight/DevSignsData;)V", "sport_impl_release"}, k = 1, mv = {1, 8, 0})
public final class jmh extends c11 {
    public static final int $stable = 8;

    /* JADX INFO: renamed from: p, reason: from kotlin metadata */
    @NotNull
    public final DevSignsData data;

    public jmh(@NotNull DevSignsData data) {
        Intrinsics.checkNotNullParameter(data, "data");
        this.data = data;
    }

    @Override // com.oplus.aiunit.vision.c11, com.heytap.health.base.view.recyclercard.a
    public int e() {
        return R$layout.sports_workout_health_card_sleep_placeholder;
    }

    @Override // com.oplus.aiunit.vision.c11, com.heytap.health.base.view.recyclercard.a
    public void l(@Nullable Context context, @NotNull View cardView) {
        Intrinsics.checkNotNullParameter(cardView, "cardView");
        super.l(context, cardView);
        if (context != null) {
            Object objNavigation = x0.d().b("/insight/InsightService").navigation();
            Intrinsics.checkNotNull(objNavigation, "null cannot be cast to non-null type com.heytap.health.health.insight.InsightService");
            ((ViewGroup) cardView.findViewById(R$id.fragment_content)).addView(((InsightService) objNavigation).E7(context, this.data));
        }
    }
}
