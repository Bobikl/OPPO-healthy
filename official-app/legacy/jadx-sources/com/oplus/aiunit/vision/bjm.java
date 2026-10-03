package com.oplus.aiunit.vision;

import com.oplus.cardwidget.util.Logger;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\u0018\u0000 \b2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\tB\u0007¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\n"}, d2 = {"Lcom/oplus/aiunit/vision/bjm;", "Le/a;", "Lcom/oplus/aiunit/vision/ejm;", "event", "", "c", "<init>", "()V", "b", "a", "com.oplus.card.widget.cardwidget"}, k = 1, mv = {1, 8, 0})
public final class bjm extends e.a<CardStateEvent> {
    public void c(@NotNull CardStateEvent event) {
        Intrinsics.checkNotNullParameter(event, "event");
        Logger logger = Logger.INSTANCE;
        b();
        logger.i("State.CardStateEventAggregate", "CardEvent process event=" + event + ",eventStore=" + ((Object) null));
        event.d(System.currentTimeMillis());
        b();
        a().a(event);
    }
}
