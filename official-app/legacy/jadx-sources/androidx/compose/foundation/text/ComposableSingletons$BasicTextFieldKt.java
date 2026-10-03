package androidx.compose.foundation.text;

import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableInferredTarget;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.Unit;
import p010kotlin.jvm.functions.Function2;
import p010kotlin.jvm.functions.Function3;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
public final class ComposableSingletons$BasicTextFieldKt {

    @NotNull
    public static final ComposableSingletons$BasicTextFieldKt INSTANCE = new ComposableSingletons$BasicTextFieldKt();

    /* JADX INFO: renamed from: lambda-1, reason: not valid java name */
    @NotNull
    public static Function3<Function2<? super Composer, ? super Integer, Unit>, Composer, Integer, Unit> f0lambda1 = ComposableLambdaKt.composableLambdaInstance(997835932, false, new Function3<Function2<? super Composer, ? super Integer, ? extends Unit>, Composer, Integer, Unit>() { // from class: androidx.compose.foundation.text.ComposableSingletons$BasicTextFieldKt$lambda-1$1
        @Override // p010kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(Function2<? super Composer, ? super Integer, ? extends Unit> function2, Composer composer, Integer num) {
            invoke((Function2<? super Composer, ? super Integer, Unit>) function2, composer, num.intValue());
            return Unit.INSTANCE;
        }

        @Composable
        @ComposableInferredTarget(scheme = "[0[0]]")
        public final void invoke(@NotNull Function2<? super Composer, ? super Integer, Unit> innerTextField, @Nullable Composer composer, int i) {
            Intrinsics.checkNotNullParameter(innerTextField, "innerTextField");
            if ((i & 14) == 0) {
                i |= composer.changedInstance(innerTextField) ? 4 : 2;
            }
            if ((i & 91) == 18 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(997835932, i, -1, "androidx.compose.foundation.text.ComposableSingletons$BasicTextFieldKt.lambda-1.<anonymous> (BasicTextField.kt:139)");
            }
            innerTextField.invoke(composer, Integer.valueOf(i & 14));
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });

    /* JADX INFO: renamed from: lambda-2, reason: not valid java name */
    @NotNull
    public static Function3<Function2<? super Composer, ? super Integer, Unit>, Composer, Integer, Unit> f1lambda2 = ComposableLambdaKt.composableLambdaInstance(2105616367, false, new Function3<Function2<? super Composer, ? super Integer, ? extends Unit>, Composer, Integer, Unit>() { // from class: androidx.compose.foundation.text.ComposableSingletons$BasicTextFieldKt$lambda-2$1
        @Override // p010kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(Function2<? super Composer, ? super Integer, ? extends Unit> function2, Composer composer, Integer num) {
            invoke((Function2<? super Composer, ? super Integer, Unit>) function2, composer, num.intValue());
            return Unit.INSTANCE;
        }

        @Composable
        @ComposableInferredTarget(scheme = "[0[0]]")
        public final void invoke(@NotNull Function2<? super Composer, ? super Integer, Unit> innerTextField, @Nullable Composer composer, int i) {
            Intrinsics.checkNotNullParameter(innerTextField, "innerTextField");
            if ((i & 14) == 0) {
                i |= composer.changedInstance(innerTextField) ? 4 : 2;
            }
            if ((i & 91) == 18 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(2105616367, i, -1, "androidx.compose.foundation.text.ComposableSingletons$BasicTextFieldKt.lambda-2.<anonymous> (BasicTextField.kt:285)");
            }
            innerTextField.invoke(composer, Integer.valueOf(i & 14));
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });

    /* JADX INFO: renamed from: lambda-3, reason: not valid java name */
    @NotNull
    public static Function3<Function2<? super Composer, ? super Integer, Unit>, Composer, Integer, Unit> f2lambda3 = ComposableLambdaKt.composableLambdaInstance(434140383, false, new Function3<Function2<? super Composer, ? super Integer, ? extends Unit>, Composer, Integer, Unit>() { // from class: androidx.compose.foundation.text.ComposableSingletons$BasicTextFieldKt$lambda-3$1
        @Override // p010kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(Function2<? super Composer, ? super Integer, ? extends Unit> function2, Composer composer, Integer num) {
            invoke((Function2<? super Composer, ? super Integer, Unit>) function2, composer, num.intValue());
            return Unit.INSTANCE;
        }

        @Composable
        @ComposableInferredTarget(scheme = "[0[0]]")
        public final void invoke(@NotNull Function2<? super Composer, ? super Integer, Unit> innerTextField, @Nullable Composer composer, int i) {
            Intrinsics.checkNotNullParameter(innerTextField, "innerTextField");
            if ((i & 14) == 0) {
                i |= composer.changedInstance(innerTextField) ? 4 : 2;
            }
            if ((i & 91) == 18 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(434140383, i, -1, "androidx.compose.foundation.text.ComposableSingletons$BasicTextFieldKt.lambda-3.<anonymous> (BasicTextField.kt:329)");
            }
            innerTextField.invoke(composer, Integer.valueOf(i & 14));
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });

    /* JADX INFO: renamed from: lambda-4, reason: not valid java name */
    @NotNull
    public static Function3<Function2<? super Composer, ? super Integer, Unit>, Composer, Integer, Unit> f3lambda4 = ComposableLambdaKt.composableLambdaInstance(-34833998, false, new Function3<Function2<? super Composer, ? super Integer, ? extends Unit>, Composer, Integer, Unit>() { // from class: androidx.compose.foundation.text.ComposableSingletons$BasicTextFieldKt$lambda-4$1
        @Override // p010kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(Function2<? super Composer, ? super Integer, ? extends Unit> function2, Composer composer, Integer num) {
            invoke((Function2<? super Composer, ? super Integer, Unit>) function2, composer, num.intValue());
            return Unit.INSTANCE;
        }

        @Composable
        @ComposableInferredTarget(scheme = "[0[0]]")
        public final void invoke(@NotNull Function2<? super Composer, ? super Integer, Unit> innerTextField, @Nullable Composer composer, int i) {
            Intrinsics.checkNotNullParameter(innerTextField, "innerTextField");
            if ((i & 14) == 0) {
                i |= composer.changedInstance(innerTextField) ? 4 : 2;
            }
            if ((i & 91) == 18 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-34833998, i, -1, "androidx.compose.foundation.text.ComposableSingletons$BasicTextFieldKt.lambda-4.<anonymous> (BasicTextField.kt:369)");
            }
            innerTextField.invoke(composer, Integer.valueOf(i & 14));
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });

    @NotNull
    /* JADX INFO: renamed from: getLambda-1$foundation_release, reason: not valid java name */
    public final Function3<Function2<? super Composer, ? super Integer, Unit>, Composer, Integer, Unit> m714getLambda1$foundation_release() {
        return f0lambda1;
    }

    @NotNull
    /* JADX INFO: renamed from: getLambda-2$foundation_release, reason: not valid java name */
    public final Function3<Function2<? super Composer, ? super Integer, Unit>, Composer, Integer, Unit> m715getLambda2$foundation_release() {
        return f1lambda2;
    }

    @NotNull
    /* JADX INFO: renamed from: getLambda-3$foundation_release, reason: not valid java name */
    public final Function3<Function2<? super Composer, ? super Integer, Unit>, Composer, Integer, Unit> m716getLambda3$foundation_release() {
        return f2lambda3;
    }

    @NotNull
    /* JADX INFO: renamed from: getLambda-4$foundation_release, reason: not valid java name */
    public final Function3<Function2<? super Composer, ? super Integer, Unit>, Composer, Integer, Unit> m717getLambda4$foundation_release() {
        return f3lambda4;
    }
}
