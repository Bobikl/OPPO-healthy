package com.oplus.aiunit.vision;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.compose.runtime.internal.StabilityInferred;
import com.heytap.health.base.base.BaseFragment;
import com.heytap.health.operations.router.providers.IOperatorProvider;
import com.heytap.health.sleep.R$layout;
import com.heytap.log.formatter.LogFieldKey;
import io.protostuff.MapSchema;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;
import p010kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: classes18.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u0000 \u000e2\u00020\u0001:\u0001\u000fB\u000f\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0014J\b\u0010\t\u001a\u00020\bH\u0016¨\u0006\u0010"}, d2 = {"Lcom/oplus/aiunit/vision/v6f;", "Lcom/oplus/aiunit/vision/jah;", "Landroid/content/Context;", "context", "Landroid/view/View;", "cardView", "", LogFieldKey.PROCESS_NAME_KEY, "", MapSchema.FIELD_NAME_ENTRY, "Lcom/heytap/health/base/base/BaseFragment;", "baseFragment", "<init>", "(Lcom/heytap/health/base/base/BaseFragment;)V", "Companion", "a", "sleep_release"}, k = 1, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nQuestionCard.kt\nKotlin\n*S Kotlin\n*F\n+ 1 QuestionCard.kt\ncom/heytap/health/sleep/day/card/QuestionCard\n+ 2 UIConfig.kt\ncom/heytap/sporthealth/blib/helper/UIConfigKt\n*L\n1#1,28:1\n155#2:29\n155#2:30\n*S KotlinDebug\n*F\n+ 1 QuestionCard.kt\ncom/heytap/health/sleep/day/card/QuestionCard\n*L\n21#1:29\n22#1:30\n*E\n"})
public final class v6f extends jah {
    public static final int $stable = 0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v6f(@NotNull BaseFragment baseFragment) {
        super(baseFragment);
        Intrinsics.checkNotNullParameter(baseFragment, "baseFragment");
    }

    @Override // com.heytap.health.base.view.recyclercard.a
    public int e() {
        return R$layout.helath_sleep_day_card_question;
    }

    @Override // com.oplus.aiunit.vision.ap8
    public void p(@NotNull Context context, @NotNull View cardView) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(cardView, "cardView");
        View viewT3 = ((IOperatorProvider) x0.d().h(IOperatorProvider.class)).T3((ViewGroup) (!(cardView instanceof ViewGroup) ? null : cardView), "01");
        if (!(cardView instanceof FrameLayout)) {
            cardView = null;
        }
        FrameLayout frameLayout = (FrameLayout) cardView;
        if (frameLayout != null) {
            frameLayout.addView(viewT3);
        }
    }
}
