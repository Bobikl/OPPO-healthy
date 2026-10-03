package com.heytap.sports.recommend.service;

import android.content.Context;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.unit.Dp;
import com.alibaba.android.arouter.facade.annotation.Route;
import com.heytap.health.base.base.BaseActivity;
import com.heytap.health.sport.services.SportRecommendService;
import com.heytap.sports.recommend.repo.RecommendRepo;
import com.heytap.sports.recommend.ui.CardEnterKt;
import com.heytap.sports.recommend.ui.DataShowKt;
import com.heytap.sports.recommend.ui.UploadSelectedData;
import com.heytap.sports.recommend.util.RecommendUtil;
import com.oplus.aiunit.vision.a7b;
import com.oplus.aiunit.vision.v9g;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.Unit;
import p010kotlin.jvm.functions.Function2;
import p010kotlin.jvm.internal.Intrinsics;
import p010kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: classes2.dex */
@StabilityInferred(parameters = 0)
@Route(path = "/recommend/SportRecommendService")
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0017¢\u0006\u0004\b\u0005\u0010\u0006J\b\u0010\b\u001a\u00020\u0007H\u0016J\u0012\u0010\u000b\u001a\u00020\u00042\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0016J\b\u0010\f\u001a\u00020\u0004H\u0016¨\u0006\u000f"}, d2 = {"Lcom/heytap/sports/recommend/service/SportRecommendServiceImpl;", "Lcom/heytap/health/sport/services/SportRecommendService;", "Lcom/heytap/health/base/base/BaseActivity;", "activity", "", "T0", "(Lcom/heytap/health/base/base/BaseActivity;Landroidx/compose/runtime/Composer;I)V", "", "Va", "Landroid/content/Context;", "context", "init", "t5", "<init>", "()V", "recommend_release"}, k = 1, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nSportRecommendServiceImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SportRecommendServiceImpl.kt\ncom/heytap/sports/recommend/service/SportRecommendServiceImpl\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,54:1\n154#2:55\n*S KotlinDebug\n*F\n+ 1 SportRecommendServiceImpl.kt\ncom/heytap/sports/recommend/service/SportRecommendServiceImpl\n*L\n32#1:55\n*E\n"})
public final class SportRecommendServiceImpl implements SportRecommendService {
    public static final int $stable = 0;

    @Override // com.heytap.health.sport.services.SportRecommendService
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public void T0(@NotNull final BaseActivity activity, @Nullable Composer composer, final int i) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        Composer composerStartRestartGroup = composer.startRestartGroup(1787231008);
        if ((i & 1) == 0 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1787231008, i, -1, "com.heytap.sports.recommend.service.SportRecommendServiceImpl.CreateCompose (SportRecommendServiceImpl.kt:30)");
            }
            float f = 16;
            CardEnterKt.f(PaddingKt.m430paddingqDBjuR0$default(Modifier.INSTANCE, Dp.m4104constructorimpl(f), Dp.m4104constructorimpl(12), Dp.m4104constructorimpl(f), 0.0f, 8, null), composerStartRestartGroup, 0, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: com.heytap.sports.recommend.service.SportRecommendServiceImpl$CreateCompose$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(2);
            }

            @Override // p010kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                invoke(composer2, num.intValue());
                return Unit.INSTANCE;
            }

            public final void invoke(@Nullable Composer composer2, int i2) {
                this.$tmp0_rcvr.T0(activity, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1));
            }
        });
    }

    @Override // com.heytap.health.sport.services.SportRecommendService
    public boolean Va() {
        return RecommendUtil.INSTANCE.i();
    }

    @Override // com.alibaba.android.arouter.facade.template.IProvider
    public void init(@Nullable Context context) {
    }

    @Override // com.heytap.health.sport.services.SportRecommendService
    public void t5() {
        boolean zR = v9g.x("Recommend").r("send_question_success", false);
        a7b.f("SportRecommendServiceImpl", "checkAndResendQuestionnaire isSent: " + zR);
        if (zR) {
            return;
        }
        UploadSelectedData uploadSelectedDataD = RecommendUtil.INSTANCE.d();
        if (uploadSelectedDataD.getUserAnsList().isEmpty()) {
            return;
        }
        byte[] bArrQ = DataShowKt.q(uploadSelectedDataD);
        a7b.f("SportRecommendServiceImpl", "checkAndResendQuestionnaire sending...");
        new RecommendRepo().b(bArrQ);
    }
}
