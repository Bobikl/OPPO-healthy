package com.oplus.aiunit.vision;

import android.content.Context;
import android.view.View;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.ViewModelProvider;
import com.heytap.log.formatter.LogFieldKey;
import com.heytap.sports.R$layout;
import com.heytap.sports.coach.tips.CoachTipsViewModel;
import io.protostuff.MapSchema;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.Unit;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0017\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0013\u0010\u0014J\b\u0010\u0003\u001a\u00020\u0002H\u0016J\u001a\u0010\t\u001a\u00020\b2\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016J\u0014\u0010\f\u001a\u00020\u0002*\u00020\n2\u0006\u0010\u000b\u001a\u00020\nH\u0004R(\u0010\u0012\u001a\u0004\u0018\u00010\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u000f\u0010\u0011¨\u0006\u0015"}, d2 = {"Lcom/oplus/aiunit/vision/c11;", "Lcom/heytap/health/base/view/recyclercard/a;", "", MapSchema.FIELD_NAME_ENTRY, "Landroid/content/Context;", "context", "Landroid/view/View;", "cardView", "", LogFieldKey.LEVEL_KEY, "", "alpha", LogFieldKey.PROCESS_NAME_KEY, "Lcom/heytap/sports/coach/tips/CoachTipsViewModel;", "<set-?>", "o", "Lcom/heytap/sports/coach/tips/CoachTipsViewModel;", "()Lcom/heytap/sports/coach/tips/CoachTipsViewModel;", "viewModel", "<init>", "()V", "sport_impl_release"}, k = 1, mv = {1, 8, 0})
public class c11 extends com.heytap.health.base.view.recyclercard.a {
    public static final int $stable = 8;

    /* JADX INFO: renamed from: o, reason: from kotlin metadata */
    @Nullable
    public CoachTipsViewModel viewModel;

    @Override // com.heytap.health.base.view.recyclercard.a
    public int e() {
        return R$layout.sports_layout_coach_tips_base_card;
    }

    @Override // com.heytap.health.base.view.recyclercard.a
    public void l(@Nullable Context context, @NotNull View cardView) {
        Intrinsics.checkNotNullParameter(cardView, "cardView");
        super.l(context, cardView);
        Unit unit = null;
        FragmentActivity fragmentActivity = context instanceof FragmentActivity ? (FragmentActivity) context : null;
        if (fragmentActivity != null) {
            this.viewModel = (CoachTipsViewModel) new ViewModelProvider(fragmentActivity).get(CoachTipsViewModel.class);
            unit = Unit.INSTANCE;
        }
        if (unit == null) {
            a7b.b("BaseCoachTipsCard", "context is not FragmentActivity!" + context);
        }
    }

    @Nullable
    /* JADX INFO: renamed from: o, reason: from getter */
    public final CoachTipsViewModel getViewModel() {
        return this.viewModel;
    }

    public final int p(long j2, long j3) {
        return j3 >= 100 ? (int) j2 : (int) ((j2 & 16777215) | (((j3 * ((long) 255)) / ((long) 100)) << 24));
    }
}
