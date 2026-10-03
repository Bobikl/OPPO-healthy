package androidx.constraintlayout.compose;

import android.os.Handler;
import android.os.Looper;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;
import p010kotlin.Unit;
import p010kotlin.jvm.functions.Function0;
import p010kotlin.jvm.functions.Function1;
import p010kotlin.jvm.internal.Intrinsics;
import p010kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n"}, d2 = {"Lkotlin/Function0;", "", "it", "<anonymous>"}, k = 3, mv = {1, 5, 1})
public final class ConstraintSetForInlineDsl$observer$1 extends Lambda implements Function1<Function0<? extends Unit>, Unit> {
    final /* synthetic */ ConstraintSetForInlineDsl this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ConstraintSetForInlineDsl$observer$1(ConstraintSetForInlineDsl constraintSetForInlineDsl) {
        super(1);
        this.this$0 = constraintSetForInlineDsl;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: invoke$lambda-1, reason: not valid java name */
    public static final void m4398invoke$lambda1(Function0 tmp0) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke();
    }

    @Override // p010kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(Function0<? extends Unit> function0) {
        invoke2((Function0<Unit>) function0);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(@NotNull final Function0<Unit> it) {
        Intrinsics.checkNotNullParameter(it, "it");
        if (Intrinsics.areEqual(Looper.myLooper(), Looper.getMainLooper())) {
            it.invoke();
            return;
        }
        Handler handler = this.this$0.handler;
        if (handler == null) {
            handler = new Handler(Looper.getMainLooper());
            this.this$0.handler = handler;
        }
        handler.post(new Runnable() { // from class: androidx.constraintlayout.compose.a
            @Override // java.lang.Runnable
            public final void run() {
                ConstraintSetForInlineDsl$observer$1.m4398invoke$lambda1(it);
            }
        });
    }
}
