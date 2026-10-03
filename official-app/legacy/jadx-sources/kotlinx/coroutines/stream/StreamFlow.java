package kotlinx.coroutines.stream;

import androidx.exifinterface.media.ExifInterface;
import com.oplus.aiunit.vision.i25;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.stream.Stream;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.ResultKt;
import p010kotlin.Unit;
import p010kotlin.coroutines.Continuation;
import p010kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import p010kotlin.coroutines.jvm.internal.ContinuationImpl;
import p010kotlin.coroutines.jvm.internal.DebugMetadata;
import p010kotlin.jvm.Volatile;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u0002B\u0013\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004¢\u0006\u0002\u0010\u0005J\u001f\u0010\b\u001a\u00020\t2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\u000bH\u0096@ø\u0001\u0000¢\u0006\u0002\u0010\fR\t\u0010\u0006\u001a\u00020\u0007X\u0082\u0004R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004X\u0082\u0004¢\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\r"}, d2 = {"Lkotlinx/coroutines/stream/StreamFlow;", ExifInterface.GPS_DIRECTION_TRUE, "Lkotlinx/coroutines/flow/Flow;", "stream", "Ljava/util/stream/Stream;", "(Ljava/util/stream/Stream;)V", "consumed", "Lkotlinx/atomicfu/AtomicBoolean;", i25.PARAM_LOG_STATUS, "", "collector", "Lkotlinx/coroutines/flow/FlowCollector;", "(Lkotlinx/coroutines/flow/FlowCollector;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {1, 8, 0}, xi = 48)
final class StreamFlow<T> implements Flow<T> {

    @NotNull
    private static final AtomicIntegerFieldUpdater consumed$FU = AtomicIntegerFieldUpdater.newUpdater(StreamFlow.class, "consumed");

    @Volatile
    private volatile int consumed = 0;

    @NotNull
    private final Stream<T> stream;

    /* JADX INFO: renamed from: kotlinx.coroutines.stream.StreamFlow$collect$1, reason: invalid class name */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    @DebugMetadata(c = "kotlinx.coroutines.stream.StreamFlow", f = "Stream.kt", i = {0, 0}, l = {26}, m = i25.PARAM_LOG_STATUS, n = {"this", "collector"}, s = {"L$0", "L$1"})
    public static final class AnonymousClass1 extends ContinuationImpl {
        Object L$0;
        Object L$1;
        Object L$2;
        int label;
        /* synthetic */ Object result;
        final /* synthetic */ StreamFlow<T> this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(StreamFlow<T> streamFlow, Continuation<? super AnonymousClass1> continuation) {
            super(continuation);
            this.this$0 = streamFlow;
        }

        @Override // p010kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return this.this$0.collect(null, this);
        }
    }

    public StreamFlow(@NotNull Stream<T> stream) {
        this.stream = stream;
    }

    /* JADX WARN: Code duplicated, block: B:24:0x005e A[Catch: all -> 0x0079, TRY_LEAVE, TryCatch #1 {all -> 0x0079, blocks: (B:22:0x0058, B:24:0x005e), top: B:39:0x0058 }] */
    /* JADX WARN: Code duplicated, block: B:44:0x0070 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:46:? A[LOOP:0: B:39:0x0058->B:46:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // kotlinx.coroutines.flow.Flow
    @Nullable
    public Object collect(@NotNull FlowCollector<? super T> flowCollector, @NotNull Continuation<? super Unit> continuation) throws Throwable {
        AnonymousClass1 anonymousClass1;
        StreamFlow<T> streamFlow;
        Throwable th;
        Iterator<T> it;
        FlowCollector flowCollector2;
        T next;
        if (continuation instanceof AnonymousClass1) {
            anonymousClass1 = (AnonymousClass1) continuation;
            int i = anonymousClass1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                anonymousClass1.label = i - Integer.MIN_VALUE;
            } else {
                anonymousClass1 = new AnonymousClass1(this, continuation);
            }
        } else {
            anonymousClass1 = new AnonymousClass1(this, continuation);
        }
        Object obj = anonymousClass1.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = anonymousClass1.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(obj);
            if (!consumed$FU.compareAndSet(this, 0, 1)) {
                throw new IllegalStateException("Stream.consumeAsFlow can be collected only once".toString());
            }
            try {
                streamFlow = this;
                it = this.stream.iterator();
                flowCollector2 = flowCollector;
                while (it.hasNext()) {
                    next = it.next();
                    anonymousClass1.L$0 = streamFlow;
                    anonymousClass1.L$1 = flowCollector2;
                    anonymousClass1.L$2 = it;
                    anonymousClass1.label = 1;
                    if (flowCollector2.emit(next, anonymousClass1) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                }
                streamFlow.stream.close();
                return Unit.INSTANCE;
            } catch (Throwable th2) {
                streamFlow = this;
                th = th2;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            it = (Iterator) anonymousClass1.L$2;
            FlowCollector flowCollector3 = (FlowCollector) anonymousClass1.L$1;
            StreamFlow<T> streamFlow2 = (StreamFlow) anonymousClass1.L$0;
            try {
                ResultKt.throwOnFailure(obj);
                flowCollector2 = flowCollector3;
                streamFlow = streamFlow2;
                while (it.hasNext()) {
                    try {
                        next = it.next();
                        anonymousClass1.L$0 = streamFlow;
                        anonymousClass1.L$1 = flowCollector2;
                        anonymousClass1.L$2 = it;
                        anonymousClass1.label = 1;
                        if (flowCollector2.emit(next, anonymousClass1) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    } catch (Throwable th3) {
                        th = th3;
                    }
                }
                streamFlow.stream.close();
                return Unit.INSTANCE;
            } catch (Throwable th4) {
                th = th4;
                streamFlow = streamFlow2;
            }
        }
        streamFlow.stream.close();
        throw th;
    }
}
