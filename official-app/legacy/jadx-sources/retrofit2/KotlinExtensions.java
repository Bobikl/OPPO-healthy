package retrofit2;

import androidx.exifinterface.media.ExifInterface;
import com.heytap.health.watch.netnumber.callinterception.AbsCallInterceptionHandlerKt;
import com.oplus.aiunit.vision.at2;
import com.oplus.aiunit.vision.ega;
import com.oplus.aiunit.vision.xr2;
import com.oplus.aiunit.vision.ztf;
import java.lang.reflect.Method;
import kotlinx.coroutines.CancellableContinuation;
import kotlinx.coroutines.CancellableContinuationImpl;
import kotlinx.coroutines.Dispatchers;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.KotlinNullPointerException;
import p010kotlin.Metadata;
import p010kotlin.Result;
import p010kotlin.ResultKt;
import p010kotlin.Unit;
import p010kotlin.coroutines.Continuation;
import p010kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt;
import p010kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import p010kotlin.coroutines.jvm.internal.DebugProbesKt;
import p010kotlin.jvm.JvmName;
import p010kotlin.jvm.functions.Function1;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0002\b\u0003\u001a'\u0010\u0003\u001a\u00028\u0000\"\b\b\u0000\u0010\u0001*\u00020\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0086@ø\u0001\u0000¢\u0006\u0004\b\u0003\u0010\u0004\u001a+\u0010\u0005\u001a\u0004\u0018\u00018\u0000\"\b\b\u0000\u0010\u0001*\u00020\u0000*\n\u0012\u0006\u0012\u0004\u0018\u00018\u00000\u0002H\u0087@ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0004\u001a)\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u0006\"\u0004\b\u0000\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0086@ø\u0001\u0000¢\u0006\u0004\b\u0007\u0010\u0004\u001a\u001b\u0010\u000b\u001a\u00020\n*\u00060\bj\u0002`\tH\u0080@ø\u0001\u0000¢\u0006\u0004\b\u000b\u0010\f\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\r"}, d2 = {"", ExifInterface.GPS_DIRECTION_TRUE, "Lcom/oplus/aiunit/vision/xr2;", "a", "(Lcom/oplus/aiunit/vision/xr2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "b", "Lcom/oplus/aiunit/vision/ztf;", "c", "Ljava/lang/Exception;", "Lkotlin/Exception;", "", "d", "(Ljava/lang/Exception;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "retrofit"}, k = 2, mv = {1, 4, 0})
@JvmName(name = "KotlinExtensions")
public final class KotlinExtensions {

    /* JADX INFO: Add missing generic type declarations: [T] */
    @Metadata(d1 = {"\u0000#\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J$\u0010\u0007\u001a\u00020\u00062\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u00022\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004H\u0016J\u001e\u0010\n\u001a\u00020\u00062\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\t\u001a\u00020\bH\u0016¨\u0006\u000b"}, d2 = {"retrofit2/KotlinExtensions$a", "Lcom/oplus/aiunit/vision/at2;", "Lcom/oplus/aiunit/vision/xr2;", "call", "Lcom/oplus/aiunit/vision/ztf;", AbsCallInterceptionHandlerKt.GSON_KEY_RESPONSE, "", "onResponse", "", "t", "onFailure", "retrofit"}, k = 1, mv = {1, 4, 0})
    public static final class a<T> implements at2<T> {
        public final /* synthetic */ CancellableContinuation i;

        public a(CancellableContinuation cancellableContinuation) {
            this.i = cancellableContinuation;
        }

        @Override // com.oplus.aiunit.vision.at2
        public void onFailure(@NotNull xr2<T> call, @NotNull Throwable t) {
            Intrinsics.checkParameterIsNotNull(call, "call");
            Intrinsics.checkParameterIsNotNull(t, "t");
            CancellableContinuation cancellableContinuation = this.i;
            Result.Companion companion = Result.INSTANCE;
            cancellableContinuation.resumeWith(Result.m5287constructorimpl(ResultKt.createFailure(t)));
        }

        @Override // com.oplus.aiunit.vision.at2
        public void onResponse(@NotNull xr2<T> call, @NotNull ztf<T> response) {
            Intrinsics.checkParameterIsNotNull(call, "call");
            Intrinsics.checkParameterIsNotNull(response, "response");
            if (!response.g()) {
                CancellableContinuation cancellableContinuation = this.i;
                HttpException httpException = new HttpException(response);
                Result.Companion companion = Result.INSTANCE;
                cancellableContinuation.resumeWith(Result.m5287constructorimpl(ResultKt.createFailure(httpException)));
                return;
            }
            T tA = response.a();
            if (tA != null) {
                this.i.resumeWith(Result.m5287constructorimpl(tA));
                return;
            }
            Object objS = call.request().s(ega.class);
            if (objS == null) {
                Intrinsics.throwNpe();
            }
            Intrinsics.checkExpressionValueIsNotNull(objS, "call.request().tag(Invocation::class.java)!!");
            Method method = ((ega) objS).a();
            StringBuilder sb = new StringBuilder();
            sb.append("Response from ");
            Intrinsics.checkExpressionValueIsNotNull(method, "method");
            Class<?> declaringClass = method.getDeclaringClass();
            Intrinsics.checkExpressionValueIsNotNull(declaringClass, "method.declaringClass");
            sb.append(declaringClass.getName());
            sb.append('.');
            sb.append(method.getName());
            sb.append(" was null but response body type was declared as non-null");
            KotlinNullPointerException kotlinNullPointerException = new KotlinNullPointerException(sb.toString());
            CancellableContinuation cancellableContinuation2 = this.i;
            Result.Companion companion2 = Result.INSTANCE;
            cancellableContinuation2.resumeWith(Result.m5287constructorimpl(ResultKt.createFailure(kotlinNullPointerException)));
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    @Metadata(d1 = {"\u0000#\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00018\u00000\u0001J(\u0010\u0007\u001a\u00020\u00062\u000e\u0010\u0003\u001a\n\u0012\u0006\u0012\u0004\u0018\u00018\u00000\u00022\u000e\u0010\u0005\u001a\n\u0012\u0006\u0012\u0004\u0018\u00018\u00000\u0004H\u0016J \u0010\n\u001a\u00020\u00062\u000e\u0010\u0003\u001a\n\u0012\u0006\u0012\u0004\u0018\u00018\u00000\u00022\u0006\u0010\t\u001a\u00020\bH\u0016¨\u0006\u000b"}, d2 = {"retrofit2/KotlinExtensions$b", "Lcom/oplus/aiunit/vision/at2;", "Lcom/oplus/aiunit/vision/xr2;", "call", "Lcom/oplus/aiunit/vision/ztf;", AbsCallInterceptionHandlerKt.GSON_KEY_RESPONSE, "", "onResponse", "", "t", "onFailure", "retrofit"}, k = 1, mv = {1, 4, 0})
    public static final class b<T> implements at2<T> {
        public final /* synthetic */ CancellableContinuation i;

        public b(CancellableContinuation cancellableContinuation) {
            this.i = cancellableContinuation;
        }

        @Override // com.oplus.aiunit.vision.at2
        public void onFailure(@NotNull xr2<T> call, @NotNull Throwable t) {
            Intrinsics.checkParameterIsNotNull(call, "call");
            Intrinsics.checkParameterIsNotNull(t, "t");
            CancellableContinuation cancellableContinuation = this.i;
            Result.Companion companion = Result.INSTANCE;
            cancellableContinuation.resumeWith(Result.m5287constructorimpl(ResultKt.createFailure(t)));
        }

        @Override // com.oplus.aiunit.vision.at2
        public void onResponse(@NotNull xr2<T> call, @NotNull ztf<T> response) {
            Intrinsics.checkParameterIsNotNull(call, "call");
            Intrinsics.checkParameterIsNotNull(response, "response");
            if (response.g()) {
                this.i.resumeWith(Result.m5287constructorimpl(response.a()));
                return;
            }
            CancellableContinuation cancellableContinuation = this.i;
            HttpException httpException = new HttpException(response);
            Result.Companion companion = Result.INSTANCE;
            cancellableContinuation.resumeWith(Result.m5287constructorimpl(ResultKt.createFailure(httpException)));
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    @Metadata(d1 = {"\u0000#\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J$\u0010\u0007\u001a\u00020\u00062\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u00022\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004H\u0016J\u001e\u0010\n\u001a\u00020\u00062\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\t\u001a\u00020\bH\u0016¨\u0006\u000b"}, d2 = {"retrofit2/KotlinExtensions$c", "Lcom/oplus/aiunit/vision/at2;", "Lcom/oplus/aiunit/vision/xr2;", "call", "Lcom/oplus/aiunit/vision/ztf;", AbsCallInterceptionHandlerKt.GSON_KEY_RESPONSE, "", "onResponse", "", "t", "onFailure", "retrofit"}, k = 1, mv = {1, 4, 0})
    public static final class c<T> implements at2<T> {
        public final /* synthetic */ CancellableContinuation i;

        public c(CancellableContinuation cancellableContinuation) {
            this.i = cancellableContinuation;
        }

        @Override // com.oplus.aiunit.vision.at2
        public void onFailure(@NotNull xr2<T> call, @NotNull Throwable t) {
            Intrinsics.checkParameterIsNotNull(call, "call");
            Intrinsics.checkParameterIsNotNull(t, "t");
            CancellableContinuation cancellableContinuation = this.i;
            Result.Companion companion = Result.INSTANCE;
            cancellableContinuation.resumeWith(Result.m5287constructorimpl(ResultKt.createFailure(t)));
        }

        @Override // com.oplus.aiunit.vision.at2
        public void onResponse(@NotNull xr2<T> call, @NotNull ztf<T> response) {
            Intrinsics.checkParameterIsNotNull(call, "call");
            Intrinsics.checkParameterIsNotNull(response, "response");
            this.i.resumeWith(Result.m5287constructorimpl(response));
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002¨\u0006\u0003"}, d2 = {"<anonymous>", "", "run", "retrofit2/KotlinExtensions$suspendAndThrow$2$1"}, k = 3, mv = {1, 1, 15})
    public static final class d implements Runnable {
        public final /* synthetic */ Continuation i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final /* synthetic */ Exception f20833j;

        public d(Continuation continuation, Exception exc) {
            this.i = continuation;
            this.f20833j = exc;
        }

        @Override // java.lang.Runnable
        public final void run() {
            Continuation continuationIntercepted = IntrinsicsKt__IntrinsicsJvmKt.intercepted(this.i);
            Exception exc = this.f20833j;
            Result.Companion companion = Result.INSTANCE;
            continuationIntercepted.resumeWith(Result.m5287constructorimpl(ResultKt.createFailure(exc)));
        }
    }

    @Nullable
    public static final <T> Object a(@NotNull final xr2<T> xr2Var, @NotNull Continuation<? super T> continuation) {
        CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(IntrinsicsKt__IntrinsicsJvmKt.intercepted(continuation), 1);
        cancellableContinuationImpl.invokeOnCancellation(new Function1<Throwable, Unit>() { // from class: retrofit2.KotlinExtensions$await$$inlined$suspendCancellableCoroutine$lambda$1
            {
                super(1);
            }

            @Override // p010kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
                invoke2(th);
                return Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(@Nullable Throwable th) {
                xr2Var.cancel();
            }
        });
        xr2Var.h(new a(cancellableContinuationImpl));
        Object result = cancellableContinuationImpl.getResult();
        if (result == IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            DebugProbesKt.probeCoroutineSuspended(continuation);
        }
        return result;
    }

    @JvmName(name = "awaitNullable")
    @Nullable
    public static final <T> Object b(@NotNull final xr2<T> xr2Var, @NotNull Continuation<? super T> continuation) {
        CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(IntrinsicsKt__IntrinsicsJvmKt.intercepted(continuation), 1);
        cancellableContinuationImpl.invokeOnCancellation(new Function1<Throwable, Unit>() { // from class: retrofit2.KotlinExtensions$await$$inlined$suspendCancellableCoroutine$lambda$2
            {
                super(1);
            }

            @Override // p010kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
                invoke2(th);
                return Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(@Nullable Throwable th) {
                xr2Var.cancel();
            }
        });
        xr2Var.h(new b(cancellableContinuationImpl));
        Object result = cancellableContinuationImpl.getResult();
        if (result == IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            DebugProbesKt.probeCoroutineSuspended(continuation);
        }
        return result;
    }

    @Nullable
    public static final <T> Object c(@NotNull final xr2<T> xr2Var, @NotNull Continuation<? super ztf<T>> continuation) {
        CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(IntrinsicsKt__IntrinsicsJvmKt.intercepted(continuation), 1);
        cancellableContinuationImpl.invokeOnCancellation(new Function1<Throwable, Unit>() { // from class: retrofit2.KotlinExtensions$awaitResponse$$inlined$suspendCancellableCoroutine$lambda$1
            {
                super(1);
            }

            @Override // p010kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
                invoke2(th);
                return Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(@Nullable Throwable th) {
                xr2Var.cancel();
            }
        });
        xr2Var.h(new c(cancellableContinuationImpl));
        Object result = cancellableContinuationImpl.getResult();
        if (result == IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            DebugProbesKt.probeCoroutineSuspended(continuation);
        }
        return result;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Nullable
    public static final Object d(@NotNull Exception exc, @NotNull Continuation<?> continuation) {
        KotlinExtensions$suspendAndThrow$1 kotlinExtensions$suspendAndThrow$1;
        if (continuation instanceof KotlinExtensions$suspendAndThrow$1) {
            kotlinExtensions$suspendAndThrow$1 = (KotlinExtensions$suspendAndThrow$1) continuation;
            int i = kotlinExtensions$suspendAndThrow$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                kotlinExtensions$suspendAndThrow$1.label = i - Integer.MIN_VALUE;
            } else {
                kotlinExtensions$suspendAndThrow$1 = new KotlinExtensions$suspendAndThrow$1(continuation);
            }
        } else {
            kotlinExtensions$suspendAndThrow$1 = new KotlinExtensions$suspendAndThrow$1(continuation);
        }
        Object obj = kotlinExtensions$suspendAndThrow$1.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = kotlinExtensions$suspendAndThrow$1.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(obj);
            kotlinExtensions$suspendAndThrow$1.L$0 = exc;
            kotlinExtensions$suspendAndThrow$1.label = 1;
            Dispatchers.getDefault().mo6874dispatch(kotlinExtensions$suspendAndThrow$1.get$context(), new d(kotlinExtensions$suspendAndThrow$1, exc));
            Object coroutine_suspended2 = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (coroutine_suspended2 == IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                DebugProbesKt.probeCoroutineSuspended(kotlinExtensions$suspendAndThrow$1);
            }
            if (coroutine_suspended2 == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        return Unit.INSTANCE;
    }
}
