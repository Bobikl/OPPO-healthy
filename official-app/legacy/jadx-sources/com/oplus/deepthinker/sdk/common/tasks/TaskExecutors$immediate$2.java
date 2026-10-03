package com.oplus.deepthinker.sdk.common.tasks;

import com.oplus.aiunit.vision.qoj;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;
import p010kotlin.jvm.functions.Function0;
import p010kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lcom/oplus/aiunit/vision/qoj;", "invoke", "()Lcom/oplus/aiunit/vision/qoj;", "<anonymous>"}, k = 3, mv = {1, 6, 0})
final class TaskExecutors$immediate$2 extends Lambda implements Function0<qoj> {
    public static final TaskExecutors$immediate$2 INSTANCE = new TaskExecutors$immediate$2();

    public TaskExecutors$immediate$2() {
        super(0);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // p010kotlin.jvm.functions.Function0
    @NotNull
    public final qoj invoke() {
        return new qoj();
    }
}
