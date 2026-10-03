package com.oplus.aiunit.vision;

import com.oplus.cardwidget.domain.IExecuteResult;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\b&\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0010\u0010\u0011J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u0010\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H&R$\u0010\u000f\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0005\u0010\n\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000e¨\u0006\u0012"}, d2 = {"Lcom/oplus/aiunit/vision/kdm;", "", "Lcom/oplus/cardwidget/domain/IExecuteResult;", "callback", "", "a", "Lcom/oplus/aiunit/vision/bbm;", "action", "", "b", "Lcom/oplus/cardwidget/domain/IExecuteResult;", "getOnResult", "()Lcom/oplus/cardwidget/domain/IExecuteResult;", "setOnResult", "(Lcom/oplus/cardwidget/domain/IExecuteResult;)V", "onResult", "<init>", "()V", "com.oplus.card.widget.cardwidget"}, k = 1, mv = {1, 8, 0})
public abstract class kdm {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @Nullable
    public IExecuteResult onResult;

    public final void a(@NotNull IExecuteResult callback) {
        Intrinsics.checkNotNullParameter(callback, "callback");
        this.onResult = callback;
    }

    public abstract boolean b(@NotNull CardAction action);
}
