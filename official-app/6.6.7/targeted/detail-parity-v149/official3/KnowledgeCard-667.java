package com.heytap.health.hrv.hrv.card;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.platform.ComposeView;
import com.heytap.health.core.operation.space.SpaceView;
import com.heytap.health.hrv.R$id;
import com.heytap.health.hrv.R$layout;
import com.heytap.health.hrv.ui.item.KnowledgeItemKt;
import com.heytap.log.formatter.LogFieldKey;
import com.heytap.store.business.rn.service.RnConstant;
import com.oplus.aiunit.vision.dq8;
import io.protostuff.MapSchema;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.Unit;
import p010kotlin.jvm.functions.Function2;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes16.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\f\u001a\u00020\n\u0012\u0006\u0010\u000e\u001a\u00020\n¢\u0006\u0004\b\u000f\u0010\u0010J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0014J\b\u0010\t\u001a\u00020\bH\u0016R\u0014\u0010\f\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u000bR\u0014\u0010\u000e\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000b¨\u0006\u0011"}, d2 = {"Lcom/heytap/health/hrv/hrv/card/KnowledgeCard;", "Lcom/oplus/aiunit/vision/dq8;", "Landroid/content/Context;", "context", "Landroid/view/View;", "cardView", "", LogFieldKey.PROCESS_NAME_KEY, "", MapSchema.FIELD_NAME_ENTRY, "", "Ljava/lang/String;", "card", "q", RnConstant.KEY_PAGE, "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "hrv_release"}, k = 1, mv = {1, 8, 0})
public final class KnowledgeCard extends dq8 {

    /* JADX INFO: renamed from: p, reason: from kotlin metadata */
    @NotNull
    public final String card;

    /* JADX INFO: renamed from: q, reason: from kotlin metadata */
    @NotNull
    public final String page;

    public KnowledgeCard(@NotNull String card, @NotNull String page) {
        Intrinsics.checkNotNullParameter(card, "card");
        Intrinsics.checkNotNullParameter(page, "page");
        this.card = card;
        this.page = page;
    }

    @Override // com.heytap.health.base.view.recyclercard.a
    public int e() {
        return R$layout.health_hrv_hrv_space;
    }

    @Override // com.oplus.aiunit.vision.dq8
    public void p(@NotNull Context context, @NotNull View cardView) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(cardView, "cardView");
        ComposeView composeView = (ComposeView) cardView.findViewById(R$id.hrv_hrv_space);
        final SpaceView spaceView = new SpaceView(context);
        spaceView.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        spaceView.setCardCode(this.card);
        spaceView.setPageCode(this.page);
        spaceView.b();
        composeView.setContent(ComposableLambdaKt.composableLambdaInstance(-1379760709, true, new Function2<Composer, Integer, Unit>() { // from class: com.heytap.health.hrv.hrv.card.KnowledgeCard$initView$1
            {
                super(2);
            }

            @Override // p010kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
                invoke(composer, num.intValue());
                return Unit.INSTANCE;
            }

            @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
            @Composable
            public final void invoke(@Nullable Composer composer, int i) {
                if ((i & 11) == 2 && composer.getSkipping()) {
                    composer.skipToGroupEnd();
                    return;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1379760709, i, -1, "com.heytap.health.hrv.hrv.card.KnowledgeCard.initView.<anonymous> (KnowledgeCard.kt:38)");
                }
                KnowledgeItemKt.a(spaceView, composer, 8);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
        }));
    }
}