package com.heytap.health.watchpair.manager;

import androidx.exifinterface.media.ExifInterface;
import androidx.lifecycle.MutableLiveData;
import com.heytap.health.base.utils.AsyncResultCoroutine;
import com.heytap.health.devicemanager.api.ICloudDeviceProcessorService;
import com.heytap.health.devicemanager.deviceability.DeviceModel;
import com.heytap.health.devicemanager.lock.LockDMHashMap;
import com.heytap.log.formatter.LogFieldKey;
import com.oplus.aiunit.vision.b78;
import com.oplus.aiunit.vision.hk5;
import com.oplus.aiunit.vision.jm5;
import com.oplus.aiunit.vision.lc5;
import com.oplus.aiunit.vision.ml4;
import com.oplus.aiunit.vision.o14;
import com.oplus.aiunit.vision.r16;
import com.oplus.aiunit.vision.su8;
import com.oplus.aiunit.vision.u5b;
import com.oplus.aiunit.vision.u61;
import com.oplus.aiunit.vision.urf;
import com.oplus.aiunit.vision.wq8;
import com.oplus.aiunit.vision.x0;
import io.protostuff.MapSchema;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlinx.coroutines.CancellableContinuation;
import kotlinx.coroutines.CancellableContinuationImpl;
import kotlinx.coroutines.CoroutineName;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.Result;
import p010kotlin.ResultKt;
import p010kotlin.Unit;
import p010kotlin.coroutines.Continuation;
import p010kotlin.coroutines.CoroutineContext;
import p010kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt;
import p010kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import p010kotlin.coroutines.jvm.internal.DebugProbesKt;
import p010kotlin.jvm.functions.Function0;
import p010kotlin.jvm.functions.Function1;
import p010kotlin.jvm.functions.Function3;
import p010kotlin.jvm.internal.Intrinsics;
import p010kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(d1 = {"\u0000\u0086\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\bÆ\u0002\u0018\u00002\u00020\u0001:\u0001/B\t\b\u0002¢\u0006\u0004\bD\u00108J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u0014\u0010\n\u001a\u00020\t2\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006J\u0014\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00040\r2\u0006\u0010\f\u001a\u00020\u000bJ(\u0010\u0011\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00100\u00102\u0012\u0010\u000f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00060\u0006H\u0002J/\u0010\u0012\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u000b2\u0012\u0010\u000f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00100\u0010H\u0082@ø\u0001\u0000¢\u0006\u0004\b\u0012\u0010\u0013J\u001e\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00040\u00162\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0015\u001a\u00020\u0014H\u0002J\u0016\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00140\u00162\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J6\u0010\u001e\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u00022\u0010\b\u0002\u0010\u001b\u001a\n\u0012\u0004\u0012\u00020\u001a\u0018\u00010\u00192\u0012\u0010\u001d\u001a\u000e\u0012\u0004\u0012\u00020\u001a\u0012\u0004\u0012\u00020\t0\u001cH\u0002J\u0012\u0010\u001f\u001a\u0004\u0018\u00010\u001a2\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J0\u0010!\u001a\u00020\t2\u0012\u0010\u000f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00100\u00102\u0012\u0010 \u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00040\u001cH\u0002Jf\u0010)\u001a\b\u0012\u0004\u0012\u00028\u00000\u0016\"\u0004\b\u0000\u0010\"2(\u0010'\u001a$\b\u0001\u0012\u0004\u0012\u00020$\u0012\u0004\u0012\u00020%\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0&\u0012\u0006\u0012\u0004\u0018\u00010\u00010#2\u001c\u0010(\u001a\u0018\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000&\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u001cH\u0002ø\u0001\u0000¢\u0006\u0004\b)\u0010*J#\u0010+\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0015\u001a\u00020\u0014H\u0082@ø\u0001\u0000¢\u0006\u0004\b+\u0010,J\u001b\u0010-\u001a\u00020\u00142\u0006\u0010\u0003\u001a\u00020\u0002H\u0082@ø\u0001\u0000¢\u0006\u0004\b-\u0010.R\u001e\u00101\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b/\u00100R \u00109\u001a\u0002028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b3\u00104\u0012\u0004\b7\u00108\u001a\u0004\b5\u00106R \u0010=\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u001a0:8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b;\u0010<R)\u0010C\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u001a0:0>8\u0006¢\u0006\f\n\u0004\b?\u0010@\u001a\u0004\bA\u0010B\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006E"}, d2 = {"Lcom/heytap/health/watchpair/manager/DeviceResDownloadManager;", "", "", "model", "", MapSchema.FIELD_NAME_KEY, "", "", "types", "", LogFieldKey.LEVEL_KEY, "Lcom/oplus/aiunit/vision/urf;", "downloadType", "Lcom/heytap/health/base/utils/AsyncResultCoroutine;", "w", "modelsList", "", LogFieldKey.MESSAGE_KEY, "n", "(Lcom/oplus/aiunit/vision/urf;Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/heytap/health/watchpair/manager/DownloadBean;", "downloadBean", "Lkotlinx/coroutines/flow/Flow;", "q", "r", "Lkotlin/Function0;", "Lcom/heytap/health/watchpair/manager/b;", "initBlock", "Lkotlin/Function1;", "updateBlock", "x", "u", "block", "j", ExifInterface.GPS_DIRECTION_TRUE, "Lkotlin/Function3;", "", "", "Lkotlin/coroutines/Continuation;", "retryBlock", "executeBlock", LogFieldKey.PROCESS_NAME_KEY, "(Lkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function1;)Lkotlinx/coroutines/flow/Flow;", "o", "(Ljava/lang/String;Lcom/heytap/health/watchpair/manager/DownloadBean;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "s", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "a", "Ljava/util/List;", "debugOpenTypes", "Ljava/io/File;", "b", "Ljava/io/File;", "v", "()Ljava/io/File;", "getOobeResFilePath$annotations", "()V", "oobeResFilePath", "Lcom/heytap/health/devicemanager/lock/LockDMHashMap;", "c", "Lcom/heytap/health/devicemanager/lock/LockDMHashMap;", "downloadMaps", "Landroidx/lifecycle/MutableLiveData;", "d", "Landroidx/lifecycle/MutableLiveData;", "t", "()Landroidx/lifecycle/MutableLiveData;", "downloadResLivedata", "<init>", "device_pair_impl_release"}, k = 1, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nDeviceResDownloadManager.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DeviceResDownloadManager.kt\ncom/heytap/health/watchpair/manager/DeviceResDownloadManager\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 LockUtils.kt\ncom/heytap/health/devicemanager/lock/LockUtilsKt\n+ 4 CancellableContinuation.kt\nkotlinx/coroutines/CancellableContinuationKt\n*L\n1#1,552:1\n1855#2:553\n1855#2,2:554\n1856#2:556\n1855#2,2:557\n19#3,11:559\n32#3,11:570\n314#4,11:581\n314#4,11:592\n*S KotlinDebug\n*F\n+ 1 DeviceResDownloadManager.kt\ncom/heytap/health/watchpair/manager/DeviceResDownloadManager\n*L\n164#1:553\n166#1:554,2\n164#1:556\n218#1:557,2\n363#1:559,11\n376#1:570,11\n435#1:581,11\n462#1:592,11\n*E\n"})
public final class DeviceResDownloadManager {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @Nullable
    public static List<Integer> debugOpenTypes;

    @NotNull
    public static final DeviceResDownloadManager INSTANCE = new DeviceResDownloadManager();

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public static final File oobeResFilePath = new File(b78.a().getFilesDir().getAbsolutePath(), "device_pair_oobe_res");

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static final LockDMHashMap<String, DownloadResult> downloadMaps = new LockDMHashMap<>();

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    public static final MutableLiveData<LockDMHashMap<String, DownloadResult>> downloadResLivedata = new MutableLiveData<>();

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\bÂ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0006\u0010\u0007R\u0014\u0010\u0005\u001a\u00020\u00028\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004¨\u0006\b"}, d2 = {"Lcom/heytap/health/watchpair/manager/DeviceResDownloadManager$a;", "Lkotlinx/coroutines/CoroutineScope;", "Lkotlin/coroutines/CoroutineContext;", "getCoroutineContext", "()Lkotlin/coroutines/CoroutineContext;", "coroutineContext", "<init>", "()V", "device_pair_impl_release"}, k = 1, mv = {1, 8, 0})
    public static final class a implements CoroutineScope {

        @NotNull
        public static final a INSTANCE = new a();
        public final /* synthetic */ CoroutineScope i = CoroutineScopeKt.CoroutineScope(new CoroutineName("DeviceResMan").plus(wq8.INSTANCE.e()));

        @Override // kotlinx.coroutines.CoroutineScope
        @NotNull
        public CoroutineContext getCoroutineContext() {
            return this.i.getCoroutineContext();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "result", "", "a", "(F)V"}, k = 3, mv = {1, 8, 0})
    public static final class b<T> implements o14 {
        public final /* synthetic */ CancellableContinuation<Boolean> i;

        /* JADX WARN: Multi-variable type inference failed */
        public b(CancellableContinuation<? super Boolean> cancellableContinuation) {
            this.i = cancellableContinuation;
        }

        public final void a(float f) {
            if (f == 100.0f) {
                CancellableContinuation<Boolean> cancellableContinuation = this.i;
                Result.Companion companion = Result.INSTANCE;
                cancellableContinuation.resumeWith(Result.m5287constructorimpl(Boolean.TRUE));
            } else {
                CancellableContinuation<Boolean> cancellableContinuation2 = this.i;
                Result.Companion companion2 = Result.INSTANCE;
                cancellableContinuation2.resumeWith(Result.m5287constructorimpl(ResultKt.createFailure(new IllegalStateException("download result fail:" + f))));
            }
        }

        @Override // com.oplus.aiunit.vision.o14
        public /* bridge */ /* synthetic */ void accept(Object obj) {
            a(((Number) obj).floatValue());
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", MapSchema.FIELD_NAME_ENTRY, "", "a", "(Ljava/lang/Throwable;)V"}, k = 3, mv = {1, 8, 0})
    public static final class c<T> implements o14 {
        public final /* synthetic */ CancellableContinuation<Boolean> i;

        /* JADX WARN: Multi-variable type inference failed */
        public c(CancellableContinuation<? super Boolean> cancellableContinuation) {
            this.i = cancellableContinuation;
        }

        @Override // com.oplus.aiunit.vision.o14
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final void accept(@NotNull Throwable e2) {
            Intrinsics.checkNotNullParameter(e2, "e");
            CancellableContinuation<Boolean> cancellableContinuation = this.i;
            Result.Companion companion = Result.INSTANCE;
            cancellableContinuation.resumeWith(Result.m5287constructorimpl(ResultKt.createFailure(e2)));
        }
    }

    @Metadata(d1 = {"\u0000!\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0012\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016J\u0018\u0010\t\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0007H\u0016¨\u0006\n"}, d2 = {"com/heytap/health/watchpair/manager/DeviceResDownloadManager$d", "Lcom/oplus/aiunit/vision/u61;", "Lcom/oplus/aiunit/vision/hk5;", "result", "", MapSchema.FIELD_NAME_ENTRY, "", "", "errMsg", "b", "device_pair_impl_release"}, k = 1, mv = {1, 8, 0})
    public static final class d extends u61<hk5> {
        public final /* synthetic */ String i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final /* synthetic */ CancellableContinuation<DownloadBean> f7169j;

        /* JADX WARN: Multi-variable type inference failed */
        public d(String str, CancellableContinuation<? super DownloadBean> cancellableContinuation) {
            this.i = str;
            this.f7169j = cancellableContinuation;
        }

        @Override // com.oplus.aiunit.vision.u61
        public void b(@NotNull Throwable e2, @NotNull String errMsg) {
            Intrinsics.checkNotNullParameter(e2, "e");
            Intrinsics.checkNotNullParameter(errMsg, "errMsg");
            String str = "msg:" + errMsg + ",crash:" + e2.getMessage();
            ml4.c("DeviceResManager", "getResBeanFail," + str + ",model:" + this.i);
            CancellableContinuation<DownloadBean> cancellableContinuation = this.f7169j;
            Result.Companion companion = Result.INSTANCE;
            cancellableContinuation.resumeWith(Result.m5287constructorimpl(ResultKt.createFailure(new IllegalStateException(str))));
        }

        @Override // com.oplus.aiunit.vision.u61
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public void d(@Nullable hk5 result) {
            if (result == null) {
                String str = this.i;
                CancellableContinuation<DownloadBean> cancellableContinuation = this.f7169j;
                String str2 = "getResBeanFail DeviceModelDetailRsp is null,model:" + str;
                ml4.c("DeviceResManager", str2);
                Result.Companion companion = Result.INSTANCE;
                cancellableContinuation.resumeWith(Result.m5287constructorimpl(ResultKt.createFailure(new IllegalStateException(str2))));
                return;
            }
            String str3 = this.i;
            CancellableContinuation<DownloadBean> cancellableContinuation2 = this.f7169j;
            String strC = result.c();
            String strB = result.b();
            if (!(strC == null || strC.length() == 0)) {
                if (!(strB == null || strB.length() == 0)) {
                    ml4.a("DeviceResManager", "get file path success,start download file model:" + str3);
                    Result.Companion companion2 = Result.INSTANCE;
                    cancellableContinuation2.resumeWith(Result.m5287constructorimpl(new DownloadBean(strC, strB)));
                    return;
                }
            }
            String str4 = "getResBeanFail url or md5 is empty,url:" + strC + ",md5:" + strB + ",model:" + str3;
            ml4.c("DeviceResManager", str4);
            Result.Companion companion3 = Result.INSTANCE;
            cancellableContinuation2.resumeWith(Result.m5287constructorimpl(ResultKt.createFailure(new IllegalStateException(str4))));
        }
    }

    @NotNull
    public static final File v() {
        return oobeResFilePath;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void y(DeviceResDownloadManager deviceResDownloadManager, String str, Function0 function0, Function1 function1, int i, Object obj) {
        if ((i & 2) != 0) {
            function0 = null;
        }
        deviceResDownloadManager.x(str, function0, function1);
    }

    public final void j(List<List<String>> modelsList, Function1<? super String, Boolean> block) {
        Iterator<List<String>> it = modelsList.iterator();
        while (it.hasNext()) {
            List<String> next = it.next();
            Iterator<String> it2 = next.iterator();
            boolean zBooleanValue = false;
            while (it2.hasNext() && !(zBooleanValue = block.invoke(it2.next()).booleanValue())) {
            }
            if (zBooleanValue) {
                ml4.a("DeviceResManager", "checkDownloadState is downloaddone " + next);
                it.remove();
            }
        }
    }

    public final boolean k(@NotNull String model) {
        Intrinsics.checkNotNullParameter(model, "model");
        return jm5.INSTANCE.b(model);
    }

    public final void l(@NotNull List<Integer> types) {
        Intrinsics.checkNotNullParameter(types, "types");
        debugOpenTypes = types;
    }

    public final List<List<String>> m(List<? extends List<String>> modelsList) {
        if (modelsList.isEmpty()) {
            return new ArrayList();
        }
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = modelsList.iterator();
        while (it.hasNext()) {
            List list = (List) it.next();
            ArrayList arrayList2 = new ArrayList();
            Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                arrayList2.add((String) it2.next());
            }
            arrayList.add(arrayList2);
        }
        return arrayList;
    }

    /* JADX WARN: Code duplicated, block: B:25:0x00cc  */
    /* JADX WARN: Code duplicated, block: B:27:0x00de A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:26:0x00dc -> B:28:0x00df). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public final java.lang.Object n(final com.oplus.aiunit.vision.urf r12, java.util.List<java.util.List<java.lang.String>> r13, p010kotlin.coroutines.Continuation<? super java.lang.Boolean> r14) {
        /*
            Method dump skipped, instruction units count: 239
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.heytap.health.watchpair.manager.DeviceResDownloadManager.n(com.oplus.aiunit.vision.urf, java.util.List, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final Object o(String str, DownloadBean downloadBean, Continuation<? super Boolean> continuation) {
        CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(IntrinsicsKt__IntrinsicsJvmKt.intercepted(continuation), 1);
        cancellableContinuationImpl.initCancellability();
        final io.reactivex.rxjava3.disposables.a aVarW = r16.f().d(downloadBean.getPath(), v().getAbsolutePath(), str + ".zip", true).L0(su8.c()).i0().w(new b(cancellableContinuationImpl), new c(cancellableContinuationImpl));
        Intrinsics.checkNotNullExpressionValue(aVarW, "continuation ->\n        ….resumeWithException(e) }");
        cancellableContinuationImpl.invokeOnCancellation(new Function1<Throwable, Unit>() { // from class: com.heytap.health.watchpair.manager.DeviceResDownloadManager$dowdnloadFileFromCloud$2$1
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
                if (aVarW.isDisposed()) {
                    return;
                }
                aVarW.dispose();
            }
        });
        Object result = cancellableContinuationImpl.getResult();
        if (result == IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            DebugProbesKt.probeCoroutineSuspended(continuation);
        }
        return result;
    }

    public final <T> Flow<T> p(Function3<? super Throwable, ? super Long, ? super Continuation<? super Unit>, ? extends Object> retryBlock, Function1<? super Continuation<? super T>, ? extends Object> executeBlock) {
        return FlowKt.retryWhen(FlowKt.flow(new DeviceResDownloadManager$getCommonFlow$1(executeBlock, null)), new DeviceResDownloadManager$getCommonFlow$2(retryBlock, null));
    }

    public final Flow<Boolean> q(String model, DownloadBean downloadBean) {
        return p(new DeviceResDownloadManager$getDownloadFileFlow$1(model, null), new DeviceResDownloadManager$getDownloadFileFlow$2(model, downloadBean, null));
    }

    public final Flow<DownloadBean> r(String model) {
        return p(new DeviceResDownloadManager$getDownloadPathFlowByModel$1(model, null), new DeviceResDownloadManager$getDownloadPathFlowByModel$2(model, null));
    }

    public final Object s(String str, Continuation<? super DownloadBean> continuation) {
        CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(IntrinsicsKt__IntrinsicsJvmKt.intercepted(continuation), 1);
        cancellableContinuationImpl.initCancellability();
        int iIntValue = ((Number) lc5.d(str).a(new Function1<DeviceModel, Integer>() { // from class: com.heytap.health.watchpair.manager.DeviceResDownloadManager$getDownloadPathFromCloudByModel$2$deviceType$1
            @Override // p010kotlin.jvm.functions.Function1
            @NotNull
            public final Integer invoke(@NotNull DeviceModel applyMode) {
                Intrinsics.checkNotNullParameter(applyMode, "$this$applyMode");
                return Integer.valueOf(applyMode.s9(applyMode.ua()));
            }
        })).intValue();
        Object objNavigation = x0.d().b(ICloudDeviceProcessorService.SERVICE_PATH).navigation();
        Intrinsics.checkNotNull(objNavigation, "null cannot be cast to non-null type com.heytap.health.devicemanager.api.ICloudDeviceProcessorService");
        ((ICloudDeviceProcessorService) objNavigation).a8(str, iIntValue).subscribe(new d(str, cancellableContinuationImpl));
        Object result = cancellableContinuationImpl.getResult();
        if (result == IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            DebugProbesKt.probeCoroutineSuspended(continuation);
        }
        return result;
    }

    @NotNull
    public final MutableLiveData<LockDMHashMap<String, DownloadResult>> t() {
        return downloadResLivedata;
    }

    public final DownloadResult u(String model) {
        LockDMHashMap<String, DownloadResult> lockDMHashMap = downloadMaps;
        try {
            u5b.a("", "readLock");
            lockDMHashMap.readLock();
            return lockDMHashMap.get(model);
        } finally {
            lockDMHashMap.readUnLock();
            u5b.a("", "readUnLock");
        }
    }

    @NotNull
    public final AsyncResultCoroutine<Boolean> w(@NotNull urf downloadType) {
        Intrinsics.checkNotNullParameter(downloadType, "downloadType");
        return new AsyncResultCoroutine<>(a.INSTANCE, new DeviceResDownloadManager$startDownload$1(downloadType, null));
    }

    public final void x(String model, Function0<DownloadResult> initBlock, Function1<? super DownloadResult, Unit> updateBlock) {
        LockDMHashMap<String, DownloadResult> lockDMHashMap = downloadMaps;
        try {
            u5b.a("", "writeLock");
            lockDMHashMap.writeLock();
            DownloadResult downloadResultInvoke = lockDMHashMap.get(model);
            if (downloadResultInvoke == null && initBlock != null) {
                downloadResultInvoke = initBlock.invoke();
            }
            if (downloadResultInvoke != null) {
                updateBlock.invoke(downloadResultInvoke);
                lockDMHashMap.put(model, downloadResultInvoke);
            }
            downloadResLivedata.postValue(lockDMHashMap);
            Unit unit = Unit.INSTANCE;
        } finally {
            lockDMHashMap.writeUnLock();
            u5b.a("", "writeUnLock");
        }
    }
}
