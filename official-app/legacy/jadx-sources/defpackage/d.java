package defpackage;

import android.content.Context;
import com.oplus.aiunit.vision.b2n;
import com.oplus.aiunit.vision.bs9;
import com.oplus.aiunit.vision.pv9;
import io.protostuff.MapSchema;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.collections.CollectionsKt__MutableCollectionsKt;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes16.dex */
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b#\u0010$J+\u0010\b\u001a\u00020\u00072\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0012\u0010\u0006\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00050\u0004\"\u00020\u0005¢\u0006\u0004\b\b\u0010\tJJ\u0010\u0016\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\n2\u0006\u0010\u0010\u001a\u00020\r2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\r2\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014H\u0016JJ\u0010\u0000\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\n2\u0006\u0010\u0010\u001a\u00020\r2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\r2\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014H\u0016JJ\u0010\u0017\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\n2\u0006\u0010\u0010\u001a\u00020\r2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\r2\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014H\u0016JJ\u0010\u0018\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\n2\u0006\u0010\u0010\u001a\u00020\r2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\r2\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014H\u0016JJ\u0010\u0019\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\n2\u0006\u0010\u0010\u001a\u00020\r2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\r2\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014H\u0016JR\u0010\u001b\u001a\u00020\u00072\u0006\u0010\u001a\u001a\u00020\u00112\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\n2\u0006\u0010\u0010\u001a\u00020\r2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\r2\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014H\u0002R(\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u00050\u001c8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0018\u0010\u001d\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!¨\u0006%"}, d2 = {"Ld;", "Lcom/oplus/aiunit/vision/bs9;", "Landroid/content/Context;", "context", "", "Lcom/oplus/aiunit/vision/pv9;", "printers", "", b2n.f, "(Landroid/content/Context;[Lcom/oplus/aiunit/vision/pv9;)V", "", "tag", "msg", "", "isMsgContainsSensitiveInfo", "sensitiveMsg", "printThreadInfo", "", "stackTraceDepth", "printClassNameAndMethodName", "", "throwable", "b", "c", "a", MapSchema.FIELD_NAME_ENTRY, "logLevel", "f", "Ljava/util/concurrent/CopyOnWriteArraySet;", "Ljava/util/concurrent/CopyOnWriteArraySet;", "getPrinterSet", "()Ljava/util/concurrent/CopyOnWriteArraySet;", "setPrinterSet", "(Ljava/util/concurrent/CopyOnWriteArraySet;)V", "printerSet", "<init>", "()V", "OLog_release"}, k = 1, mv = {1, 8, 0})
public final class d implements bs9 {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public CopyOnWriteArraySet<pv9> printerSet = new CopyOnWriteArraySet<>();

    @Override // com.oplus.aiunit.vision.bs9
    public void a(@NotNull String tag, @NotNull String msg, boolean isMsgContainsSensitiveInfo, @NotNull String sensitiveMsg, boolean printThreadInfo, int stackTraceDepth, boolean printClassNameAndMethodName, @Nullable Throwable throwable) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        Intrinsics.checkNotNullParameter(msg, "msg");
        Intrinsics.checkNotNullParameter(sensitiveMsg, "sensitiveMsg");
        f(5, tag, msg, isMsgContainsSensitiveInfo, sensitiveMsg, printThreadInfo, stackTraceDepth, printClassNameAndMethodName, throwable);
    }

    @Override // com.oplus.aiunit.vision.bs9
    public void b(@NotNull String tag, @NotNull String msg, boolean isMsgContainsSensitiveInfo, @NotNull String sensitiveMsg, boolean printThreadInfo, int stackTraceDepth, boolean printClassNameAndMethodName, @Nullable Throwable throwable) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        Intrinsics.checkNotNullParameter(msg, "msg");
        Intrinsics.checkNotNullParameter(sensitiveMsg, "sensitiveMsg");
        f(2, tag, msg, isMsgContainsSensitiveInfo, sensitiveMsg, printThreadInfo, stackTraceDepth, printClassNameAndMethodName, throwable);
    }

    @Override // com.oplus.aiunit.vision.bs9
    public void c(@NotNull String tag, @NotNull String msg, boolean isMsgContainsSensitiveInfo, @NotNull String sensitiveMsg, boolean printThreadInfo, int stackTraceDepth, boolean printClassNameAndMethodName, @Nullable Throwable throwable) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        Intrinsics.checkNotNullParameter(msg, "msg");
        Intrinsics.checkNotNullParameter(sensitiveMsg, "sensitiveMsg");
        f(4, tag, msg, isMsgContainsSensitiveInfo, sensitiveMsg, printThreadInfo, stackTraceDepth, printClassNameAndMethodName, throwable);
    }

    @Override // com.oplus.aiunit.vision.bs9
    public void d(@NotNull String tag, @NotNull String msg, boolean isMsgContainsSensitiveInfo, @NotNull String sensitiveMsg, boolean printThreadInfo, int stackTraceDepth, boolean printClassNameAndMethodName, @Nullable Throwable throwable) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        Intrinsics.checkNotNullParameter(msg, "msg");
        Intrinsics.checkNotNullParameter(sensitiveMsg, "sensitiveMsg");
        f(3, tag, msg, isMsgContainsSensitiveInfo, sensitiveMsg, printThreadInfo, stackTraceDepth, printClassNameAndMethodName, throwable);
    }

    @Override // com.oplus.aiunit.vision.bs9
    public void e(@NotNull String tag, @NotNull String msg, boolean isMsgContainsSensitiveInfo, @NotNull String sensitiveMsg, boolean printThreadInfo, int stackTraceDepth, boolean printClassNameAndMethodName, @Nullable Throwable throwable) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        Intrinsics.checkNotNullParameter(msg, "msg");
        Intrinsics.checkNotNullParameter(sensitiveMsg, "sensitiveMsg");
        f(6, tag, msg, isMsgContainsSensitiveInfo, sensitiveMsg, printThreadInfo, stackTraceDepth, printClassNameAndMethodName, throwable);
    }

    public final void f(int logLevel, String tag, String msg, boolean isMsgContainsSensitiveInfo, String sensitiveMsg, boolean printThreadInfo, int stackTraceDepth, boolean printClassNameAndMethodName, Throwable throwable) {
        Iterator<pv9> it = this.printerSet.iterator();
        while (it.hasNext()) {
            it.next().println(logLevel, tag, msg, isMsgContainsSensitiveInfo, sensitiveMsg, printThreadInfo, stackTraceDepth, printClassNameAndMethodName, throwable);
        }
    }

    public final void g(@Nullable Context context, @NotNull pv9... printers) {
        Intrinsics.checkNotNullParameter(printers, "printers");
        CollectionsKt__MutableCollectionsKt.addAll(this.printerSet, printers);
    }
}
