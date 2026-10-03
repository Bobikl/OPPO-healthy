package com.heytap.health.device.tab.utils;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.LifecycleCoroutineScope;
import com.heytap.health.devicemanager.api.DMLocalDeviceManagerApi;
import com.heytap.health.devicemanager.api.IAccountDeviceRequestService;
import com.heytap.health.devicemanager.api.IDeviceVersionUtilService;
import com.heytap.health.devicemanager.processor.bean.UserDeviceInfo;
import com.oplus.aiunit.vision.ao0;
import com.oplus.aiunit.vision.g4j;
import com.oplus.aiunit.vision.juk;
import com.oplus.aiunit.vision.lbd;
import com.oplus.aiunit.vision.md1;
import com.oplus.aiunit.vision.rh0;
import com.oplus.aiunit.vision.su8;
import com.oplus.aiunit.vision.wq8;
import com.oplus.aiunit.vision.x0;
import io.protostuff.MapSchema;
import io.reactivex.rxjava3.disposables.a;
import java.util.List;
import java.util.concurrent.CancellationException;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CancellableContinuation;
import kotlinx.coroutines.CancellableContinuationImpl;
import kotlinx.coroutines.Job;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.Result;
import p010kotlin.ResultKt;
import p010kotlin.Unit;
import p010kotlin.collections.CollectionsKt__CollectionsKt;
import p010kotlin.coroutines.Continuation;
import p010kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt;
import p010kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import p010kotlin.coroutines.jvm.internal.DebugProbesKt;
import p010kotlin.jvm.JvmStatic;
import p010kotlin.jvm.functions.Function1;
import p010kotlin.jvm.internal.DefaultConstructorMarker;
import p010kotlin.jvm.internal.Intrinsics;
import p010kotlin.jvm.internal.Ref;
import p010kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: classes16.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\bÇ\u0002\u0018\u00002\u00020\u0001:\u0004\u000f\u0013\u0018\rB\t\b\u0002¢\u0006\u0004\b\u0016\u0010\u0017J \u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0007J\u0013\u0010\u000b\u001a\u00020\nH\u0082@ø\u0001\u0000¢\u0006\u0004\b\u000b\u0010\fJ\u0013\u0010\r\u001a\u00020\nH\u0082@ø\u0001\u0000¢\u0006\u0004\b\r\u0010\fR\u0014\u0010\u0011\u001a\u00020\u000e8\u0002X\u0082D¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0018\u0010\u0015\u001a\u0004\u0018\u00010\u00128\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0019"}, d2 = {"Lcom/heytap/health/device/tab/utils/RequestDeviceListHelper;", "", "Landroidx/lifecycle/LifecycleCoroutineScope;", "lifecycleCoroutineScope", "Lcom/heytap/health/device/tab/utils/RequestDeviceListHelper$c;", "requestType", "Lcom/heytap/health/device/tab/utils/RequestDeviceListHelper$b;", "callback", "", "f", "Lcom/heytap/health/device/tab/utils/RequestDeviceListHelper$a;", MapSchema.FIELD_NAME_ENTRY, "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "d", "", "a", "Ljava/lang/String;", "TAG", "Lkotlinx/coroutines/Job;", "b", "Lkotlinx/coroutines/Job;", "requestJob", "<init>", "()V", "c", "device_settings_impl_release"}, k = 1, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nRequestDeviceListHelper.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RequestDeviceListHelper.kt\ncom/heytap/health/device/tab/utils/RequestDeviceListHelper\n+ 2 CancellableContinuation.kt\nkotlinx/coroutines/CancellableContinuationKt\n*L\n1#1,244:1\n314#2,11:245\n*S KotlinDebug\n*F\n+ 1 RequestDeviceListHelper.kt\ncom/heytap/health/device/tab/utils/RequestDeviceListHelper\n*L\n197#1:245,11\n*E\n"})
public final class RequestDeviceListHelper {

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @Nullable
    public static Job requestJob;

    @NotNull
    public static final RequestDeviceListHelper INSTANCE = new RequestDeviceListHelper();

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public static final String TAG = "RequestDeviceListHelper";
    public static final int $stable = 8;

    /* JADX INFO: renamed from: com.heytap.health.device.tab.utils.RequestDeviceListHelper$a, reason: from toString */
    @StabilityInferred(parameters = 0)
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u000f\u001a\u00020\u000b\u0012\u0006\u0010\u0014\u001a\u00020\u0010¢\u0006\u0004\b\u0015\u0010\u0016J\b\u0010\u0003\u001a\u00020\u0002H\u0016J\u0006\u0010\u0005\u001a\u00020\u0004J\u0006\u0010\u0006\u001a\u00020\u0004J\t\u0010\b\u001a\u00020\u0007HÖ\u0001J\u0013\u0010\n\u001a\u00020\u00042\b\u0010\t\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0017\u0010\u000f\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\f\u0010\u000eR\u0017\u0010\u0014\u001a\u00020\u00108\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0017"}, d2 = {"Lcom/heytap/health/device/tab/utils/RequestDeviceListHelper$a;", "", "", "toString", "", "c", "d", "", "hashCode", "other", "equals", "Lcom/oplus/aiunit/vision/rh0;", "a", "Lcom/oplus/aiunit/vision/rh0;", "()Lcom/oplus/aiunit/vision/rh0;", "result", "Lcom/heytap/health/device/tab/utils/RequestDeviceListHelper$d;", "b", "Lcom/heytap/health/device/tab/utils/RequestDeviceListHelper$d;", "()Lcom/heytap/health/device/tab/utils/RequestDeviceListHelper$d;", "resultType", "<init>", "(Lcom/oplus/aiunit/vision/rh0;Lcom/heytap/health/device/tab/utils/RequestDeviceListHelper$d;)V", "device_settings_impl_release"}, k = 1, mv = {1, 8, 0})
    public static final /* data */ class AssembleQueryResultWrapper {
        public static final int $stable = 8;

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        @NotNull
        public final rh0 result;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
        @NotNull
        public final d resultType;

        public AssembleQueryResultWrapper(@NotNull rh0 result, @NotNull d resultType) {
            Intrinsics.checkNotNullParameter(result, "result");
            Intrinsics.checkNotNullParameter(resultType, "resultType");
            this.result = result;
            this.resultType = resultType;
        }

        @NotNull
        /* JADX INFO: renamed from: a, reason: from getter */
        public final rh0 getResult() {
            return this.result;
        }

        @NotNull
        /* JADX INFO: renamed from: b, reason: from getter */
        public final d getResultType() {
            return this.resultType;
        }

        public final boolean c() {
            return Intrinsics.areEqual(this.resultType, d.a.INSTANCE);
        }

        public final boolean d() {
            return Intrinsics.areEqual(this.resultType, d.b.INSTANCE);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof AssembleQueryResultWrapper)) {
                return false;
            }
            AssembleQueryResultWrapper assembleQueryResultWrapper = (AssembleQueryResultWrapper) other;
            return Intrinsics.areEqual(this.result, assembleQueryResultWrapper.result) && Intrinsics.areEqual(this.resultType, assembleQueryResultWrapper.resultType);
        }

        public int hashCode() {
            return (this.result.hashCode() * 31) + this.resultType.hashCode();
        }

        @NotNull
        public String toString() {
            return "AssembleQueryResultWrapper(resultType=" + this.resultType + ")";
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bf\u0018\u00002\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H&J\b\u0010\u0004\u001a\u00020\u0002H&J\u001b\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H¦@ø\u0001\u0000¢\u0006\u0004\b\u0007\u0010\bJ\b\u0010\t\u001a\u00020\u0002H&\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\n"}, d2 = {"Lcom/heytap/health/device/tab/utils/RequestDeviceListHelper$b;", "", "", "onStart", "c", "Lcom/heytap/health/device/tab/utils/RequestDeviceListHelper$a;", "assembleQueryResult", "b", "(Lcom/heytap/health/device/tab/utils/RequestDeviceListHelper$a;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "a", "device_settings_impl_release"}, k = 1, mv = {1, 8, 0})
    public interface b {
        void a();

        @Nullable
        Object b(@NotNull AssembleQueryResultWrapper assembleQueryResultWrapper, @NotNull Continuation<? super Unit> continuation);

        void c();

        void onStart();
    }

    @StabilityInferred(parameters = 0)
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0003\u0007\b\t¨\u0006\n"}, d2 = {"Lcom/heytap/health/device/tab/utils/RequestDeviceListHelper$c;", "", "<init>", "()V", "a", "b", "c", "Lcom/heytap/health/device/tab/utils/RequestDeviceListHelper$c$a;", "Lcom/heytap/health/device/tab/utils/RequestDeviceListHelper$c$b;", "Lcom/heytap/health/device/tab/utils/RequestDeviceListHelper$c$c;", "device_settings_impl_release"}, k = 1, mv = {1, 8, 0})
    public static abstract class c {
        public static final int $stable = 0;

        @StabilityInferred(parameters = 0)
        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\b\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\u0006"}, d2 = {"Lcom/heytap/health/device/tab/utils/RequestDeviceListHelper$c$a;", "Lcom/heytap/health/device/tab/utils/RequestDeviceListHelper$c;", "", "toString", "<init>", "()V", "device_settings_impl_release"}, k = 1, mv = {1, 8, 0})
        public static final class a extends c {
            public static final int $stable = 0;

            @NotNull
            public static final a INSTANCE = new a();

            public a() {
                super(null);
            }

            @NotNull
            public String toString() {
                return "All";
            }
        }

        @StabilityInferred(parameters = 0)
        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\b\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\u0006"}, d2 = {"Lcom/heytap/health/device/tab/utils/RequestDeviceListHelper$c$b;", "Lcom/heytap/health/device/tab/utils/RequestDeviceListHelper$c;", "", "toString", "<init>", "()V", "device_settings_impl_release"}, k = 1, mv = {1, 8, 0})
        public static final class b extends c {
            public static final int $stable = 0;

            @NotNull
            public static final b INSTANCE = new b();

            public b() {
                super(null);
            }

            @NotNull
            public String toString() {
                return "Cache";
            }
        }

        /* JADX INFO: renamed from: com.heytap.health.device.tab.utils.RequestDeviceListHelper$c$c, reason: collision with other inner class name */
        @StabilityInferred(parameters = 0)
        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\b\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\u0006"}, d2 = {"Lcom/heytap/health/device/tab/utils/RequestDeviceListHelper$c$c;", "Lcom/heytap/health/device/tab/utils/RequestDeviceListHelper$c;", "", "toString", "<init>", "()V", "device_settings_impl_release"}, k = 1, mv = {1, 8, 0})
        public static final class C0336c extends c {
            public static final int $stable = 0;

            @NotNull
            public static final C0336c INSTANCE = new C0336c();

            public C0336c() {
                super(null);
            }

            @NotNull
            public String toString() {
                return "Cloud";
            }
        }

        public c() {
        }

        public /* synthetic */ c(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @StabilityInferred(parameters = 0)
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, d2 = {"Lcom/heytap/health/device/tab/utils/RequestDeviceListHelper$d;", "", "<init>", "()V", "a", "b", "Lcom/heytap/health/device/tab/utils/RequestDeviceListHelper$d$a;", "Lcom/heytap/health/device/tab/utils/RequestDeviceListHelper$d$b;", "device_settings_impl_release"}, k = 1, mv = {1, 8, 0})
    public static abstract class d {
        public static final int $stable = 0;

        @StabilityInferred(parameters = 0)
        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\b\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\u0006"}, d2 = {"Lcom/heytap/health/device/tab/utils/RequestDeviceListHelper$d$a;", "Lcom/heytap/health/device/tab/utils/RequestDeviceListHelper$d;", "", "toString", "<init>", "()V", "device_settings_impl_release"}, k = 1, mv = {1, 8, 0})
        public static final class a extends d {
            public static final int $stable = 0;

            @NotNull
            public static final a INSTANCE = new a();

            public a() {
                super(null);
            }

            @NotNull
            public String toString() {
                return "Cache";
            }
        }

        @StabilityInferred(parameters = 0)
        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\b\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\u0006"}, d2 = {"Lcom/heytap/health/device/tab/utils/RequestDeviceListHelper$d$b;", "Lcom/heytap/health/device/tab/utils/RequestDeviceListHelper$d;", "", "toString", "<init>", "()V", "device_settings_impl_release"}, k = 1, mv = {1, 8, 0})
        public static final class b extends d {
            public static final int $stable = 0;

            @NotNull
            public static final b INSTANCE = new b();

            public b() {
                super(null);
            }

            @NotNull
            public String toString() {
                return "Cloud";
            }
        }

        public d() {
        }

        public /* synthetic */ d(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u00052\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0000H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"", "Lcom/heytap/health/devicemanager/processor/bean/UserDeviceInfo;", "userDeviceInfos", "Lcom/oplus/aiunit/vision/g4j;", "strings", "Lcom/oplus/aiunit/vision/rh0;", "a", "(Ljava/util/List;Ljava/util/List;)Lcom/oplus/aiunit/vision/rh0;"}, k = 3, mv = {1, 8, 0})
    public static final class e<T1, T2, R> implements md1 {
        public static final e<T1, T2, R> INSTANCE = new e<>();

        @Override // com.oplus.aiunit.vision.md1
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final rh0 apply(@NotNull List<? extends UserDeviceInfo> userDeviceInfos, @NotNull List<g4j> strings) {
            Intrinsics.checkNotNullParameter(userDeviceInfos, "userDeviceInfos");
            Intrinsics.checkNotNullParameter(strings, "strings");
            rh0 rh0Var = new rh0();
            rh0Var.d(userDeviceInfos);
            rh0Var.c(strings);
            return rh0Var;
        }
    }

    @Metadata(d1 = {"\u0000#\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u0003\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0010\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0016J\u0010\u0010\b\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002H\u0016J\u0010\u0010\u000b\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\tH\u0016¨\u0006\f"}, d2 = {"com/heytap/health/device/tab/utils/RequestDeviceListHelper$f", "Lcom/oplus/aiunit/vision/ao0;", "Lcom/oplus/aiunit/vision/rh0;", "Lio/reactivex/rxjava3/disposables/a;", "d", "", "onSubscribe", "result", "c", "", MapSchema.FIELD_NAME_ENTRY, "onError", "device_settings_impl_release"}, k = 1, mv = {1, 8, 0})
    public static final class f extends ao0<rh0> {

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final /* synthetic */ Ref.ObjectRef<a> f3982j;
        public final /* synthetic */ CancellableContinuation<AssembleQueryResultWrapper> k;

        /* JADX WARN: Multi-variable type inference failed */
        public f(Ref.ObjectRef<a> objectRef, CancellableContinuation<? super AssembleQueryResultWrapper> cancellableContinuation) {
            this.f3982j = objectRef;
            this.k = cancellableContinuation;
        }

        @Override // com.oplus.aiunit.vision.ao0
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public void b(@NotNull rh0 result) {
            Intrinsics.checkNotNullParameter(result, "result");
            CancellableContinuation<AssembleQueryResultWrapper> cancellableContinuation = this.k;
            Result.Companion companion = Result.INSTANCE;
            cancellableContinuation.resumeWith(Result.m5287constructorimpl(new AssembleQueryResultWrapper(result, d.b.INSTANCE)));
        }

        @Override // com.oplus.aiunit.vision.ao0, com.oplus.aiunit.vision.aed
        public void onError(@NotNull Throwable e2) {
            Intrinsics.checkNotNullParameter(e2, "e");
            super.onError(e2);
            CancellableContinuation<AssembleQueryResultWrapper> cancellableContinuation = this.k;
            Result.Companion companion = Result.INSTANCE;
            cancellableContinuation.resumeWith(Result.m5287constructorimpl(ResultKt.createFailure(e2)));
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.oplus.aiunit.vision.ao0, com.oplus.aiunit.vision.aed
        public void onSubscribe(@NotNull a d) {
            Intrinsics.checkNotNullParameter(d, "d");
            super.onSubscribe(d);
            this.f3982j.element = d;
        }
    }

    @JvmStatic
    public static final void f(@NotNull LifecycleCoroutineScope lifecycleCoroutineScope, @NotNull c requestType, @NotNull b callback) {
        Intrinsics.checkNotNullParameter(lifecycleCoroutineScope, "lifecycleCoroutineScope");
        Intrinsics.checkNotNullParameter(requestType, "requestType");
        Intrinsics.checkNotNullParameter(callback, "callback");
        Job job = requestJob;
        if (job != null && !job.isCancelled()) {
            job.cancel(new CancellationException("Repeat request, cancel the pre"));
        }
        requestJob = BuildersKt__Builders_commonKt.launch$default(lifecycleCoroutineScope, wq8.INSTANCE.e(), null, new RequestDeviceListHelper$requestDeviceList$2(requestType, callback, null), 2, null);
    }

    /* JADX WARN: Code duplicated, block: B:26:0x0061  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object d(Continuation<? super AssembleQueryResultWrapper> continuation) {
        RequestDeviceListHelper$getDeviceListByCache$1 requestDeviceListHelper$getDeviceListByCache$1;
        rh0 rh0Var;
        juk<rh0> jukVarQ;
        if (continuation instanceof RequestDeviceListHelper$getDeviceListByCache$1) {
            requestDeviceListHelper$getDeviceListByCache$1 = (RequestDeviceListHelper$getDeviceListByCache$1) continuation;
            int i = requestDeviceListHelper$getDeviceListByCache$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                requestDeviceListHelper$getDeviceListByCache$1.label = i - Integer.MIN_VALUE;
            } else {
                requestDeviceListHelper$getDeviceListByCache$1 = new RequestDeviceListHelper$getDeviceListByCache$1(this, continuation);
            }
        } else {
            requestDeviceListHelper$getDeviceListByCache$1 = new RequestDeviceListHelper$getDeviceListByCache$1(this, continuation);
        }
        Object objB = requestDeviceListHelper$getDeviceListByCache$1.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = requestDeviceListHelper$getDeviceListByCache$1.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objB);
            Object objNavigation = x0.d().b(DMLocalDeviceManagerApi.SERVICE_DB_DEVICE).navigation();
            rh0Var = null;
            DMLocalDeviceManagerApi dMLocalDeviceManagerApi = objNavigation instanceof DMLocalDeviceManagerApi ? (DMLocalDeviceManagerApi) objNavigation : null;
            if (dMLocalDeviceManagerApi != null && (jukVarQ = dMLocalDeviceManagerApi.Q()) != null) {
                requestDeviceListHelper$getDeviceListByCache$1.label = 1;
                objB = jukVarQ.b(requestDeviceListHelper$getDeviceListByCache$1);
                if (objB == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            if (rh0Var == null) {
                rh0Var = new rh0();
            }
            return new AssembleQueryResultWrapper(rh0Var, d.a.INSTANCE);
        }
        if (i2 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(objB);
        rh0Var = (rh0) objB;
        if (rh0Var == null) {
            rh0Var = new rh0();
        }
        return new AssembleQueryResultWrapper(rh0Var, d.a.INSTANCE);
    }

    public final Object e(Continuation<? super AssembleQueryResultWrapper> continuation) {
        lbd<List<UserDeviceInfo>> lbdVarH0;
        lbd<List<g4j>> lbdVarH1;
        CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(IntrinsicsKt__IntrinsicsJvmKt.intercepted(continuation), 1);
        cancellableContinuationImpl.initCancellability();
        final Ref.ObjectRef objectRef = new Ref.ObjectRef();
        Object objNavigation = x0.d().b("/devicemanager/IAccountDeviceRequestService").navigation();
        IAccountDeviceRequestService iAccountDeviceRequestService = objNavigation instanceof IAccountDeviceRequestService ? (IAccountDeviceRequestService) objNavigation : null;
        Object objNavigation2 = x0.d().b("/devicemanager/IDeviceVersionUtilService").navigation();
        IDeviceVersionUtilService iDeviceVersionUtilService = objNavigation2 instanceof IDeviceVersionUtilService ? (IDeviceVersionUtilService) objNavigation2 : null;
        if (iAccountDeviceRequestService == null || (lbdVarH0 = iAccountDeviceRequestService.Z9()) == null) {
            lbdVarH0 = lbd.h0(CollectionsKt__CollectionsKt.emptyList());
            Intrinsics.checkNotNullExpressionValue(lbdVarH0, "just(emptyList())");
        }
        if (iDeviceVersionUtilService == null || (lbdVarH1 = iDeviceVersionUtilService.h7()) == null) {
            lbdVarH1 = lbd.h0(CollectionsKt__CollectionsKt.emptyList());
            Intrinsics.checkNotNullExpressionValue(lbdVarH1, "just(emptyList())");
        }
        lbd.k1(lbdVarH0, lbdVarH1, e.INSTANCE).L0(su8.c()).subscribe(new f(objectRef, cancellableContinuationImpl));
        cancellableContinuationImpl.invokeOnCancellation(new Function1<Throwable, Unit>() { // from class: com.heytap.health.device.tab.utils.RequestDeviceListHelper$getDeviceListByCloud$2$3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
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
                a aVar = objectRef.element;
                if (aVar == null || aVar.isDisposed()) {
                    return;
                }
                aVar.dispose();
            }
        });
        Object result = cancellableContinuationImpl.getResult();
        if (result == IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            DebugProbesKt.probeCoroutineSuspended(continuation);
        }
        return result;
    }
}
