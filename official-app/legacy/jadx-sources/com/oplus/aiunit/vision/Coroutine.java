package com.oplus.aiunit.vision;

import kotlinx.coroutines.CoroutineName;
import kotlinx.coroutines.ThreadContextElement;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;
import p010kotlin.coroutines.AbstractCoroutineContextElement;
import p010kotlin.coroutines.CoroutineContext;
import p010kotlin.jvm.internal.DefaultConstructorMarker;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.oplus.aiunit.vision.ewj, reason: from toString */
/* JADX INFO: loaded from: classes15.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u000b\b\u0000\u0018\u0000 \u00122\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0001\u0013B\u000f\u0012\u0006\u0010\r\u001a\u00020\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\b\u0010\u0004\u001a\u00020\u0002H\u0016J\u0010\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0016J\u0018\u0010\n\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0002H\u0016R\u0014\u0010\r\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u0016\u0010\u000f\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000e\u0010\f¨\u0006\u0014"}, d2 = {"Lcom/oplus/aiunit/vision/ewj;", "Lkotlinx/coroutines/ThreadContextElement;", "", "Lkotlin/coroutines/AbstractCoroutineContextElement;", "toString", "Lkotlin/coroutines/CoroutineContext;", "context", "updateThreadContext", "oldState", "", "restoreThreadContext", "i", "Ljava/lang/String;", "threadType", "j", "tName", "<init>", "(Ljava/lang/String;)V", "Key", "a", "lib_base_release"}, k = 1, mv = {1, 8, 0})
public final class Coroutine extends AbstractCoroutineContextElement implements ThreadContextElement<String> {

    /* JADX INFO: renamed from: Key, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @NotNull
    public final String threadType;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public String tName;

    /* JADX INFO: renamed from: com.oplus.aiunit.vision.ewj$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/oplus/aiunit/vision/ewj$a;", "Lkotlin/coroutines/CoroutineContext$Key;", "Lcom/oplus/aiunit/vision/ewj;", "<init>", "()V", "lib_base_release"}, k = 1, mv = {1, 8, 0})
    public static final class Companion implements CoroutineContext.Key<Coroutine> {
        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Coroutine(@NotNull String threadType) {
        super(INSTANCE);
        Intrinsics.checkNotNullParameter(threadType, "threadType");
        this.threadType = threadType;
        String strC = apj.c(threadType, null);
        Intrinsics.checkNotNullExpressionValue(strC, "getThreadName(threadType, null)");
        this.tName = strC;
    }

    @NotNull
    public String toString() {
        return "Coroutine(" + this.tName + ")";
    }

    @Override // kotlinx.coroutines.ThreadContextElement
    public void restoreThreadContext(@NotNull CoroutineContext context, @NotNull String oldState) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(oldState, "oldState");
        if (apj.RECOVER_THREAD_NAME) {
            Thread.currentThread().setName(oldState);
        }
    }

    @Override // kotlinx.coroutines.ThreadContextElement
    @NotNull
    public String updateThreadContext(@NotNull CoroutineContext context) {
        String name;
        Intrinsics.checkNotNullParameter(context, "context");
        Thread threadCurrentThread = Thread.currentThread();
        String oldName = threadCurrentThread.getName();
        CoroutineName coroutineName = (CoroutineName) context.get(CoroutineName.INSTANCE);
        if (coroutineName == null || (name = coroutineName.getName()) == null) {
            name = "";
        }
        if (name.length() > 0) {
            String strC = apj.c(this.threadType, name);
            Intrinsics.checkNotNullExpressionValue(strC, "getThreadName(threadType, coroutineName)");
            this.tName = strC;
        }
        threadCurrentThread.setName(this.tName);
        Intrinsics.checkNotNullExpressionValue(oldName, "oldName");
        return oldName;
    }
}
