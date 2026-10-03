package com.heytap.nearx.taphttp.statitics;

import android.content.Context;
import com.oplus.aiunit.vision.IExceptionProcess;
import com.oplus.aiunit.vision.i6k;
import com.oplus.aiunit.vision.m7k;
import java.util.Iterator;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Lazy;
import p010kotlin.LazyKt__LazyJVMKt;
import p010kotlin.Metadata;
import p010kotlin.Unit;
import p010kotlin.collections.ArraysKt___ArraysKt;
import p010kotlin.jvm.functions.Function0;
import p010kotlin.jvm.internal.Intrinsics;
import p010kotlin.text.StringsKt__StringsKt;

/* JADX INFO: loaded from: classes17.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u0016\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004R\u0018\u0010\u000b\u001a\u0004\u0018\u00010\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\t\u0010\nR\u001b\u0010\u000f\u001a\u00020\f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0007\u0010\r\u001a\u0004\b\t\u0010\u000e¨\u0006\u0012"}, d2 = {"Lcom/heytap/nearx/taphttp/statitics/TrackException;", "", "Landroid/content/Context;", "context", "", "moduleId", "", "b", "Lcom/oplus/aiunit/vision/i6k;", "a", "Lcom/oplus/aiunit/vision/i6k;", "collector", "Lcom/oplus/aiunit/vision/IExceptionProcess;", "Lkotlin/Lazy;", "()Lcom/oplus/aiunit/vision/IExceptionProcess;", "exceptionProcess", "<init>", "()V", "com.heytap.nearx.httpdns"}, k = 1, mv = {1, 4, 0})
public final class TrackException {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    public static volatile i6k collector;
    public static final TrackException INSTANCE = new TrackException();

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public static final Lazy exceptionProcess = LazyKt__LazyJVMKt.lazy(new Function0<TrackException$exceptionProcess$2.a>() { // from class: com.heytap.nearx.taphttp.statitics.TrackException$exceptionProcess$2

        @Metadata(d1 = {"\u0000)\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u001c\u0010\u0007\u001a\u00020\u00062\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016J\b\u0010\t\u001a\u00020\bH\u0016J\n\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0016¨\u0006\f"}, d2 = {"com/heytap/nearx/taphttp/statitics/TrackException$exceptionProcess$2$a", "Lcom/oplus/aiunit/vision/IExceptionProcess;", "Ljava/lang/Thread;", "p0", "", "p1", "", "filter", "", "getModuleVersion", "Lcom/oplus/aiunit/vision/m7k;", "getKvProperties", "com.heytap.nearx.httpdns"}, k = 1, mv = {1, 4, 0})
        public static final class a implements IExceptionProcess {
            @Override // com.oplus.aiunit.vision.IExceptionProcess
            public boolean filter(@Nullable Thread p0, @Nullable Throwable p1) {
                if (p1 == null) {
                    return false;
                }
                StackTraceElement[] stackTrace = p1.getStackTrace();
                Intrinsics.checkNotNullExpressionValue(stackTrace, "p1.stackTrace");
                Iterator it = ArraysKt___ArraysKt.filterNotNull(stackTrace).iterator();
                while (it.hasNext()) {
                    String className = ((StackTraceElement) it.next()).getClassName();
                    if (className != null && (StringsKt__StringsKt.contains$default((CharSequence) className, (CharSequence) "okhttp", false, 2, (Object) null) || StringsKt__StringsKt.contains$default((CharSequence) className, (CharSequence) "httpdns", false, 2, (Object) null) || StringsKt__StringsKt.contains$default((CharSequence) className, (CharSequence) "taphttp", false, 2, (Object) null))) {
                        return true;
                    }
                }
                return false;
            }

            @Override // com.oplus.aiunit.vision.IExceptionProcess
            @Nullable
            public m7k getKvProperties() {
                return null;
            }

            @Override // com.oplus.aiunit.vision.IExceptionProcess
            @NotNull
            public String getModuleVersion() {
                return "4.9.3.7";
            }
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // p010kotlin.jvm.functions.Function0
        @NotNull
        public final a invoke() {
            return new a();
        }
    });

    public final IExceptionProcess a() {
        return (IExceptionProcess) exceptionProcess.getValue();
    }

    public final void b(@NotNull Context context, long moduleId) {
        Intrinsics.checkNotNullParameter(context, "context");
        if (collector == null) {
            synchronized (TrackException.class) {
                if (collector == null) {
                    i6k i6kVarA = i6k.a(context, moduleId);
                    i6kVarA.c(INSTANCE.a());
                    collector = i6kVarA;
                }
                Unit unit = Unit.INSTANCE;
            }
        }
    }
}
