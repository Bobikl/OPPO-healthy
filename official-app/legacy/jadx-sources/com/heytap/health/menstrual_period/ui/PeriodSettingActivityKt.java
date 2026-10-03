package com.heytap.health.menstrual_period.ui;

import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.interaction.InteractionSourceKt;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import com.oplus.smartenginehelper.ParserTag;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.Unit;
import p010kotlin.jvm.functions.Function0;
import p010kotlin.jvm.functions.Function3;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes17.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u001a\u0018\u0010\u0004\u001a\u00020\u0000*\u00020\u00002\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0005"}, d2 = {"Landroidx/compose/ui/Modifier;", "Lkotlin/Function0;", "", ParserTag.TAG_ONCLICK, "a", "menstrual_period_impl_release"}, k = 2, mv = {1, 8, 0})
public final class PeriodSettingActivityKt {
    @NotNull
    public static final Modifier a(@NotNull Modifier modifier, @NotNull final Function0<Unit> onClick) {
        Intrinsics.checkNotNullParameter(modifier, "<this>");
        Intrinsics.checkNotNullParameter(onClick, "onClick");
        return ComposedModifierKt.composed$default(modifier, null, new Function3<Modifier, Composer, Integer, Modifier>() { // from class: com.heytap.health.menstrual_period.ui.PeriodSettingActivityKt$noRippleClickable$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(3);
            }

            @Override // p010kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Modifier invoke(Modifier modifier2, Composer composer, Integer num) {
                return invoke(modifier2, composer, num.intValue());
            }

            @Composable
            @NotNull
            public final Modifier invoke(@NotNull Modifier composed, @Nullable Composer composer, int i) {
                Intrinsics.checkNotNullParameter(composed, "$this$composed");
                composer.startReplaceableGroup(2136778490);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(2136778490, i, -1, "com.heytap.health.menstrual_period.ui.noRippleClickable.<anonymous> (PeriodSettingActivity.kt:353)");
                }
                composer.startReplaceableGroup(-492369756);
                Object objRememberedValue = composer.rememberedValue();
                Composer.Companion companion = Composer.INSTANCE;
                if (objRememberedValue == companion.getEmpty()) {
                    objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                    composer.updateRememberedValue(objRememberedValue);
                }
                composer.endReplaceableGroup();
                MutableInteractionSource mutableInteractionSource = (MutableInteractionSource) objRememberedValue;
                final Function0<Unit> function0 = onClick;
                composer.startReplaceableGroup(1157296644);
                boolean zChanged = composer.changed(function0);
                Object objRememberedValue2 = composer.rememberedValue();
                if (zChanged || objRememberedValue2 == companion.getEmpty()) {
                    objRememberedValue2 = new Function0<Unit>() { // from class: com.heytap.health.menstrual_period.ui.PeriodSettingActivityKt$noRippleClickable$1$2$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(0);
                        }

                        @Override // p010kotlin.jvm.functions.Function0
                        public /* bridge */ /* synthetic */ Unit invoke() {
                            invoke2();
                            return Unit.INSTANCE;
                        }

                        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2() {
                            function0.invoke();
                        }
                    };
                    composer.updateRememberedValue(objRememberedValue2);
                }
                composer.endReplaceableGroup();
                Modifier modifierM185clickableO2vRcR0$default = ClickableKt.m185clickableO2vRcR0$default(composed, mutableInteractionSource, null, false, null, null, (Function0) objRememberedValue2, 28, null);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                composer.endReplaceableGroup();
                return modifierM185clickableO2vRcR0$default;
            }
        }, 1, null);
    }
}
