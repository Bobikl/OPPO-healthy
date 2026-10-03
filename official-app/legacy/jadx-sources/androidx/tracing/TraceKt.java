package androidx.tracing;

import androidx.exifinterface.media.ExifInterface;
import com.heytap.speech.engine.protocol.event.payload.analogclick.Feedback;
import com.heytap.store.base.core.http.HttpConst;
import com.oplus.utrace.db.UTraceSQLiteHelperKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.ResultKt;
import p010kotlin.coroutines.Continuation;
import p010kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import p010kotlin.coroutines.jvm.internal.ContinuationImpl;
import p010kotlin.coroutines.jvm.internal.DebugMetadata;
import p010kotlin.jvm.functions.Function0;
import p010kotlin.jvm.functions.Function1;
import p010kotlin.jvm.internal.InlineMarker;
import p010kotlin.jvm.internal.Intrinsics;
import p010kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000(\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\u001a3\u0010\u0000\u001a\u0002H\u0001\"\u0004\b\u0000\u0010\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u0002H\u00010\u0003H\u0086\bø\u0001\u0000¢\u0006\u0002\u0010\u0006\u001a/\u0010\u0000\u001a\u0002H\u0001\"\u0004\b\u0000\u0010\u00012\u0006\u0010\u0007\u001a\u00020\u00042\u000e\b\u0004\u0010\u0005\u001a\b\u0012\u0004\u0012\u0002H\u00010\u0003H\u0086\bø\u0001\u0000¢\u0006\u0002\u0010\b\u001aA\u0010\t\u001a\u0002H\u0001\"\u0004\b\u0000\u0010\u00012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\u00032\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u0002H\u00010\u0003H\u0086\bø\u0001\u0000¢\u0006\u0002\u0010\r\u001aG\u0010\t\u001a\u0002H\u0001\"\u0004\b\u0000\u0010\u00012\u0006\u0010\u000e\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\f2\u001e\b\u0004\u0010\u0005\u001a\u0018\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00010\u0011\u0012\u0006\u0012\u0004\u0018\u00010\u00120\u0010H\u0086Hø\u0001\u0001¢\u0006\u0002\u0010\u0013\u0082\u0002\u000b\n\u0005\b\u009920\u0001\n\u0002\b\u0019¨\u0006\u0014"}, d2 = {UTraceSQLiteHelperKt.TRACE_TABLE_NAME, ExifInterface.GPS_DIRECTION_TRUE, "lazyLabel", "Lkotlin/Function0;", "", "block", "(Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;)Ljava/lang/Object;", Feedback.WIDGET_LABEL, "(Ljava/lang/String;Lkotlin/jvm/functions/Function0;)Ljava/lang/Object;", "traceAsync", "lazyMethodName", "lazyCookie", "", "(Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;)Ljava/lang/Object;", "methodName", HttpConst.COOKIE, "Lkotlin/Function1;", "Lkotlin/coroutines/Continuation;", "", "(Ljava/lang/String;ILkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "tracing-ktx_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class TraceKt {

    /* JADX INFO: renamed from: androidx.tracing.TraceKt$traceAsync$1, reason: invalid class name */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 176)
    @DebugMetadata(c = "androidx.tracing.TraceKt", f = "Trace.kt", i = {0, 0}, l = {76}, m = "traceAsync", n = {"methodName", HttpConst.COOKIE}, s = {"L$0", "I$0"})
    @SourceDebugExtension({"SMAP\nTrace.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Trace.kt\nandroidx/tracing/TraceKt$traceAsync$1\n*L\n1#1,111:1\n*E\n"})
    public static final class AnonymousClass1<T> extends ContinuationImpl {
        int I$0;
        Object L$0;
        int label;
        /* synthetic */ Object result;

        public AnonymousClass1(Continuation<? super AnonymousClass1> continuation) {
            super(continuation);
        }

        @Override // p010kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return TraceKt.traceAsync(null, 0, null, this);
        }
    }

    public static final <T> T trace(@NotNull String label, @NotNull Function0<? extends T> block) {
        Intrinsics.checkNotNullParameter(label, "label");
        Intrinsics.checkNotNullParameter(block, "block");
        Trace.beginSection(label);
        try {
            return block.invoke();
        } finally {
            InlineMarker.finallyStart(1);
            Trace.endSection();
            InlineMarker.finallyEnd(1);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Nullable
    public static final <T> Object traceAsync(@NotNull String str, int i, @NotNull Function1<? super Continuation<? super T>, ? extends Object> function1, @NotNull Continuation<? super T> continuation) {
        AnonymousClass1 anonymousClass1;
        if (continuation instanceof AnonymousClass1) {
            anonymousClass1 = (AnonymousClass1) continuation;
            int i2 = anonymousClass1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                anonymousClass1.label = i2 - Integer.MIN_VALUE;
            } else {
                anonymousClass1 = new AnonymousClass1(continuation);
            }
        } else {
            anonymousClass1 = new AnonymousClass1(continuation);
        }
        Object objInvoke = anonymousClass1.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i3 = anonymousClass1.label;
        try {
            if (i3 == 0) {
                ResultKt.throwOnFailure(objInvoke);
                Trace.beginAsyncSection(str, i);
                anonymousClass1.L$0 = str;
                anonymousClass1.I$0 = i;
                anonymousClass1.label = 1;
                objInvoke = function1.invoke(anonymousClass1);
                if (objInvoke == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i3 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                i = anonymousClass1.I$0;
                str = (String) anonymousClass1.L$0;
                ResultKt.throwOnFailure(objInvoke);
            }
            InlineMarker.finallyStart(1);
            Trace.endAsyncSection(str, i);
            InlineMarker.finallyEnd(1);
            return objInvoke;
        } catch (Throwable th) {
            InlineMarker.finallyStart(1);
            Trace.endAsyncSection(str, i);
            InlineMarker.finallyEnd(1);
            throw th;
        }
    }

    private static final <T> Object traceAsync$$forInline(String str, int i, Function1<? super Continuation<? super T>, ? extends Object> function1, Continuation<? super T> continuation) {
        Trace.beginAsyncSection(str, i);
        try {
            return function1.invoke(continuation);
        } finally {
            InlineMarker.finallyStart(1);
            Trace.endAsyncSection(str, i);
            InlineMarker.finallyEnd(1);
        }
    }

    public static final <T> T trace(@NotNull Function0<String> lazyLabel, @NotNull Function0<? extends T> block) {
        Intrinsics.checkNotNullParameter(lazyLabel, "lazyLabel");
        Intrinsics.checkNotNullParameter(block, "block");
        boolean zIsEnabled = Trace.isEnabled();
        if (zIsEnabled) {
            Trace.beginSection(lazyLabel.invoke());
        }
        try {
            return block.invoke();
        } finally {
            InlineMarker.finallyStart(1);
            if (zIsEnabled) {
                Trace.endSection();
            }
            InlineMarker.finallyEnd(1);
        }
    }

    public static final <T> T traceAsync(@NotNull Function0<String> lazyMethodName, @NotNull Function0<Integer> lazyCookie, @NotNull Function0<? extends T> block) {
        String strInvoke;
        int iIntValue;
        Intrinsics.checkNotNullParameter(lazyMethodName, "lazyMethodName");
        Intrinsics.checkNotNullParameter(lazyCookie, "lazyCookie");
        Intrinsics.checkNotNullParameter(block, "block");
        if (Trace.isEnabled()) {
            strInvoke = lazyMethodName.invoke();
            iIntValue = lazyCookie.invoke().intValue();
            Trace.beginAsyncSection(strInvoke, iIntValue);
        } else {
            strInvoke = null;
            iIntValue = 0;
        }
        try {
            return block.invoke();
        } finally {
            InlineMarker.finallyStart(1);
            if (strInvoke != null) {
                Trace.endAsyncSection(strInvoke, iIntValue);
            }
            InlineMarker.finallyEnd(1);
        }
    }
}
