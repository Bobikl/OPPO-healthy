package com.heytap.health.sleep.day.card;

import android.widget.TextView;
import com.heytap.health.base.task.ThreadUtils;
import com.oplus.aiunit.vision.pmh;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.Pair;
import p010kotlin.Unit;
import p010kotlin.jvm.functions.Function1;
import p010kotlin.jvm.internal.Intrinsics;
import p010kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes18.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\u0010\u0000\u001a\u00020\u00012\u0014\u0010\u0002\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Lkotlin/Pair;", "", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
final class SleepRecoveryCard$refreshCardView$1$1 extends Lambda implements Function1<Pair<? extends Float, ? extends Float>, Unit> {
    final /* synthetic */ pmh this$0;

    public SleepRecoveryCard$refreshCardView$1$1(pmh pmhVar) {
        super(1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void invoke$lambda$1(Pair pair, pmh this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (pair != null) {
            String str = pair.getFirst() + "-" + pair.getSecond();
            TextView textViewJ = pmh.J(this$0);
            if (textViewJ == null) {
                return;
            }
            textViewJ.setText(str);
        }
    }

    @Override // p010kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(Pair<? extends Float, ? extends Float> pair) {
        invoke2((Pair<Float, Float>) pair);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(@Nullable final Pair<Float, Float> pair) {
        final pmh pmhVar = null;
        ThreadUtils.doInUiThread(new Runnable(pmhVar) { // from class: com.heytap.health.sleep.day.card.a
            @Override // java.lang.Runnable
            public final void run() {
                SleepRecoveryCard$refreshCardView$1$1.invoke$lambda$1(this.i, null);
            }
        });
    }
}
