package com.heytap.health.esim.bugfix;

import com.oplus.aiunit.vision.iq9;
import java.util.Observable;
import java.util.Observer;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;
import p010kotlin.jvm.functions.Function0;
import p010kotlin.jvm.internal.Intrinsics;
import p010kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes16.dex */
@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Ljava/util/Observer;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
public final class WhiteCardFix$observer$2 extends Lambda implements Function0<Observer> {
    final /* synthetic */ WhiteCardFix this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WhiteCardFix$observer$2(WhiteCardFix whiteCardFix) {
        super(0);
        this.this$0 = whiteCardFix;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void invoke$lambda$0(WhiteCardFix this$0, Observable observable, Object arg) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        iq9 iq9Var = this$0.eSIMFix;
        if (iq9Var != null) {
            Intrinsics.checkNotNullExpressionValue(arg, "arg");
            iq9Var.b(arg);
        }
    }

    @Override // p010kotlin.jvm.functions.Function0
    @NotNull
    public final Observer invoke() {
        final WhiteCardFix whiteCardFix = this.this$0;
        return new Observer() { // from class: com.heytap.health.esim.bugfix.a
            @Override // java.util.Observer
            public final void update(Observable observable, Object obj) {
                WhiteCardFix$observer$2.invoke$lambda$0(whiteCardFix, observable, obj);
            }
        };
    }
}
