package androidx.constraintlayout.compose;

import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.Unit;
import p010kotlin.jvm.functions.Function2;
import p010kotlin.jvm.functions.Function3;
import p010kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes.dex */
@Metadata(k = 3, mv = {1, 5, 1}, xi = 48)
public final class MotionLayoutKt$MotionLayoutCore$3$2 extends Lambda implements Function2<Composer, Integer, Unit> {
    final /* synthetic */ int $$changed;
    final /* synthetic */ Function3<MotionLayoutScope, Composer, Integer, Unit> $content;
    final /* synthetic */ MotionLayoutScope $scope;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public MotionLayoutKt$MotionLayoutCore$3$2(Function3<? super MotionLayoutScope, ? super Composer, ? super Integer, Unit> function3, MotionLayoutScope motionLayoutScope, int i) {
        super(2);
        this.$content = function3;
        this.$scope = motionLayoutScope;
        this.$$changed = i;
    }

    @Override // p010kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
        invoke(composer, num.intValue());
        return Unit.INSTANCE;
    }

    @Composable
    public final void invoke(@Nullable Composer composer, int i) {
        if (((i & 11) ^ 2) == 0 && composer.getSkipping()) {
            composer.skipToGroupEnd();
        } else {
            this.$content.invoke(this.$scope, composer, Integer.valueOf(((this.$$changed >> 21) & 112) | 8));
        }
    }
}
