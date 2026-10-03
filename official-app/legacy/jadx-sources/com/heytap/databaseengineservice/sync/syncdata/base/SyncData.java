package com.heytap.databaseengineservice.sync.syncdata.base;

import android.os.PowerManager;
import androidx.exifinterface.media.ExifInterface;
import com.heytap.databaseengine.api.RxExtendKt;
import com.heytap.databaseengineservice.sync.network.DBBaseResponse;
import com.heytap.databaseengineservice.sync.responsebean.PullHealthDataVersionParamsNew;
import com.heytap.databaseengineservice.sync.responsebean.VersionListRspBodyNewModify;
import com.oplus.aiunit.vision.b2n;
import com.oplus.aiunit.vision.cj4;
import com.oplus.aiunit.vision.hz;
import com.oplus.aiunit.vision.lbd;
import com.oplus.aiunit.vision.p9j;
import com.oplus.aiunit.vision.qa2;
import com.oplus.aiunit.vision.x6;
import io.protostuff.MapSchema;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CompletableJob;
import kotlinx.coroutines.CoroutineExceptionHandler;
import kotlinx.coroutines.CoroutineName;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.SupervisorKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.ResultKt;
import p010kotlin.Unit;
import p010kotlin.collections.CollectionsKt__CollectionsKt;
import p010kotlin.collections.CollectionsKt___CollectionsKt;
import p010kotlin.coroutines.AbstractCoroutineContextElement;
import p010kotlin.coroutines.Continuation;
import p010kotlin.coroutines.CoroutineContext;
import p010kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import p010kotlin.jvm.functions.Function1;
import p010kotlin.jvm.functions.Function2;
import p010kotlin.jvm.internal.DefaultConstructorMarker;
import p010kotlin.jvm.internal.Intrinsics;
import p010kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000e\n\u0002\b\u0006\b&\u0018\u0000 -*\b\b\u0000\u0010\u0002*\u00020\u00012\u00020\u0003:\u0001.B\u0011\u0012\b\u0010*\u001a\u0004\u0018\u00010)¢\u0006\u0004\b+\u0010,J\u008c\u0001\u0010\u0014\u001a\u00020\u000e2\u0006\u0010\u0005\u001a\u00020\u00042\u001e\u0010\u000b\u001a\u001a\u0012\u0004\u0012\u00020\u0007\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\b0\u00062$\u0010\r\u001a \u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0004\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\t0\b0\f2\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u000e0\u00062\u0018\u0010\u0011\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00100\u00062\b\b\u0002\u0010\u0013\u001a\u00020\u0012J\b\u0010\u0015\u001a\u00020\u000eH\u0002JA\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00040\u00102\u0006\u0010\u0005\u001a\u00020\u00042\u001e\u0010\u000b\u001a\u001a\u0012\u0004\u0012\u00020\u0007\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\b0\u0006H\u0082@ø\u0001\u0000¢\u0006\u0004\b\u0016\u0010\u0017J,\u0010\u0002\u001a\u00020\u000e2\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00040\u00102\u0006\u0010\u0013\u001a\u00020\u00122\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00028\u00000\u0000H\u0002Jg\u0010\u001a\u001a\u00020\u000e2$\u0010\r\u001a \u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0004\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\t0\b0\f2\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u000e0\u00062\u0018\u0010\u0011\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00100\u0006H\u0082@ø\u0001\u0000¢\u0006\u0004\b\u001a\u0010\u001bJg\u0010\u001c\u001a\u00020\u000e2$\u0010\r\u001a \u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0004\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\t0\b0\f2\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u000e0\u00062\u0018\u0010\u0011\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00100\u0006H\u0082@ø\u0001\u0000¢\u0006\u0004\b\u001c\u0010\u001bR8\u0010!\u001a&\u0012\f\u0012\n \u001e*\u0004\u0018\u00010\u00040\u0004 \u001e*\u0012\u0012\f\u0012\n \u001e*\u0004\u0018\u00010\u00040\u0004\u0018\u00010\u001d0\u001d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R\"\u0010(\u001a\u00020\u00128\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%\"\u0004\b&\u0010'\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006/"}, d2 = {"Lcom/heytap/databaseengineservice/sync/syncdata/base/SyncData;", "", ExifInterface.GPS_DIRECTION_TRUE, "Lcom/oplus/aiunit/vision/x6;", "", "version", "Lkotlin/Function1;", "Lcom/heytap/databaseengineservice/sync/responsebean/PullHealthDataVersionParamsNew;", "Lcom/oplus/aiunit/vision/lbd;", "Lcom/heytap/databaseengineservice/sync/network/DBBaseResponse;", "Lcom/heytap/databaseengineservice/sync/responsebean/VersionListRspBodyNewModify;", "queryVersionList", "Lkotlin/Function2;", "servicePullData", "", "saveData", "", "syncDoneVersion", "", "supportLazyLoad", "O", "M", "S", "(JLkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "modifiedTimeVersions", "syncData", "Q", "(Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "R", "Ljava/util/concurrent/CopyOnWriteArrayList;", "kotlin.jvm.PlatformType", b2n.f, "Ljava/util/concurrent/CopyOnWriteArrayList;", "mVersions", b2n.g, "Z", "N", "()Z", "U", "(Z)V", "supportVersions", "", "ssoid", "<init>", "(Ljava/lang/String;)V", "Companion", "a", "databaseengineservice_release"}, k = 1, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nSyncData.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SyncData.kt\ncom/heytap/databaseengineservice/sync/syncdata/base/SyncData\n+ 2 CoroutineExceptionHandler.kt\nkotlinx/coroutines/CoroutineExceptionHandlerKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,316:1\n48#2,4:317\n1855#3,2:321\n1855#3,2:323\n*S KotlinDebug\n*F\n+ 1 SyncData.kt\ncom/heytap/databaseengineservice/sync/syncdata/base/SyncData\n*L\n122#1:317,4\n199#1:321,2\n242#1:323,2\n*E\n"})
public abstract class SyncData<T> extends x6 {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE;

    @NotNull
    public static final CompletableJob i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static int f2886j;

    @NotNull
    public static CoroutineScope k;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    public final CopyOnWriteArrayList<Long> mVersions;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    public boolean supportVersions;

    /* JADX INFO: renamed from: com.heytap.databaseengineservice.sync.syncdata.base.SyncData$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0018\u0010\u0012J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\b\u0010\u0006\u001a\u00020\u0004H\u0002J\b\u0010\u0007\u001a\u00020\u0002H\u0002R\u0014\u0010\b\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\tR\u0014\u0010\n\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\n\u0010\tR\u0014\u0010\u000b\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000b\u0010\tR\u0014\u0010\f\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\f\u0010\tR\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u001c\u0010\u0010\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\f\n\u0004\b\u0010\u0010\t\u0012\u0004\b\u0011\u0010\u0012R\u0016\u0010\u0013\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0016\u001a\u00020\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017¨\u0006\u0019"}, d2 = {"Lcom/heytap/databaseengineservice/sync/syncdata/base/SyncData$a;", "", "", "parallelism", "Lkotlinx/coroutines/CoroutineScope;", "c", "d", MapSchema.FIELD_NAME_ENTRY, "PARALLELISM_POWER_SAVE", "I", "PARALLELISM_SCREEN_OFF", "PARALLELISM_SCREEN_ON", "SP_WRITE_BATCH_SIZE", "", "TAG", "Ljava/lang/String;", "currentParallelism", "getCurrentParallelism$annotations", "()V", "mCoroutineScope", "Lkotlinx/coroutines/CoroutineScope;", "Lkotlinx/coroutines/CompletableJob;", "supervisorJob", "Lkotlinx/coroutines/CompletableJob;", "<init>", "databaseengineservice_release"}, k = 1, mv = {1, 8, 0})
    public static final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final synchronized CoroutineScope c(int parallelism) {
            SyncData.f2886j = parallelism;
            cj4.c("SyncBaseStat", "createScope parallelism=" + parallelism);
            return CoroutineScopeKt.CoroutineScope(new CoroutineName("SyncBaseStat").plus(Dispatchers.getIO().limitedParallelism(parallelism)).plus(SyncData.i));
        }

        public final synchronized CoroutineScope d() {
            int iE = e();
            if (iE != SyncData.f2886j) {
                SyncData.k = c(iE);
            }
            return SyncData.k;
        }

        public final int e() {
            try {
                Object systemService = qa2.INSTANCE.b().b().getSystemService("power");
                PowerManager powerManager = systemService instanceof PowerManager ? (PowerManager) systemService : null;
                if (powerManager == null || !powerManager.isPowerSaveMode()) {
                    return powerManager != null ? powerManager.isInteractive() : true ? 5 : 3;
                }
                return 2;
            } catch (Exception e2) {
                cj4.b("SyncBaseStat", "resolveParallelism error: " + e2.getMessage());
                return 3;
            }
        }
    }

    @Metadata(d1 = {"\u0000!\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u00012\u00020\u0002J\u0018\u0010\b\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¨\u0006\t¸\u0006\u0000"}, d2 = {"kotlinx/coroutines/CoroutineExceptionHandlerKt$CoroutineExceptionHandler$1", "Lkotlin/coroutines/AbstractCoroutineContextElement;", "Lkotlinx/coroutines/CoroutineExceptionHandler;", "Lkotlin/coroutines/CoroutineContext;", "context", "", "exception", "", "handleException", "kotlinx-coroutines-core"}, k = 1, mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nCoroutineExceptionHandler.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CoroutineExceptionHandler.kt\nkotlinx/coroutines/CoroutineExceptionHandlerKt$CoroutineExceptionHandler$1\n+ 2 SyncData.kt\ncom/heytap/databaseengineservice/sync/syncdata/base/SyncData\n*L\n1#1,110:1\n123#2,5:111\n*E\n"})
    public static final class b extends AbstractCoroutineContextElement implements CoroutineExceptionHandler {
        public final /* synthetic */ SyncData i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(CoroutineExceptionHandler.Companion companion, SyncData syncData) {
            super(companion);
            this.i = syncData;
        }

        @Override // kotlinx.coroutines.CoroutineExceptionHandler
        public void handleException(@NotNull CoroutineContext context, @NotNull Throwable exception) {
            SyncData syncData = this.i;
            cj4.b("SyncBaseStat", syncData.o() + " " + exception);
            syncData.v();
        }
    }

    static {
        Companion companion = new Companion(null);
        INSTANCE = companion;
        i = SupervisorKt.SupervisorJob$default((Job) null, 1, (Object) null);
        k = companion.c(3);
    }

    public SyncData(@Nullable String str) {
        super(str);
        this.mVersions = p();
    }

    public static /* synthetic */ void P(SyncData syncData, long j2, Function1 function1, Function2 function2, Function1 function3, Function1 function4, boolean z, int i2, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: pullData");
        }
        syncData.O(j2, function1, function2, function3, function4, (i2 & 32) != 0 ? false : z);
    }

    public final void M() {
        p9j.b(o(), CollectionsKt__CollectionsKt.emptyList(), this.b);
    }

    /* JADX INFO: renamed from: N, reason: from getter */
    public final boolean getSupportVersions() {
        return this.supportVersions;
    }

    public final void O(long version, @NotNull Function1<? super PullHealthDataVersionParamsNew, ? extends lbd<DBBaseResponse<VersionListRspBodyNewModify>>> queryVersionList, @NotNull Function2<? super Long, ? super Long, ? extends lbd<DBBaseResponse<T>>> servicePullData, @NotNull Function1<? super T, Unit> saveData, @NotNull Function1<? super T, ? extends List<Long>> syncDoneVersion, boolean supportLazyLoad) {
        Intrinsics.checkNotNullParameter(queryVersionList, "queryVersionList");
        Intrinsics.checkNotNullParameter(servicePullData, "servicePullData");
        Intrinsics.checkNotNullParameter(saveData, "saveData");
        Intrinsics.checkNotNullParameter(syncDoneVersion, "syncDoneVersion");
        BuildersKt__Builders_commonKt.launch$default(INSTANCE.d(), new b(CoroutineExceptionHandler.INSTANCE, this), null, new SyncData$pullData$1(this, version, queryVersionList, supportLazyLoad, servicePullData, saveData, syncDoneVersion, null), 2, null);
    }

    /* JADX WARN: Code duplicated, block: B:19:0x0091  */
    /* JADX WARN: Code duplicated, block: B:21:0x00ad A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:22:0x00ae  */
    /* JADX WARN: Code duplicated, block: B:25:0x00d7 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:26:0x00d8  */
    /* JADX WARN: Code duplicated, block: B:29:0x00ee  */
    /* JADX WARN: Code duplicated, block: B:36:0x0142  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:26:0x00d8 -> B:27:0x00e1). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public final java.lang.Object Q(p010kotlin.jvm.functions.Function2<? super java.lang.Long, ? super java.lang.Long, ? extends com.oplus.aiunit.vision.lbd<com.heytap.databaseengineservice.sync.network.DBBaseResponse<T>>> r12, p010kotlin.jvm.functions.Function1<? super T, p010kotlin.Unit> r13, p010kotlin.jvm.functions.Function1<? super T, ? extends java.util.List<java.lang.Long>> r14, p010kotlin.coroutines.Continuation<? super p010kotlin.Unit> r15) {
        /*
            Method dump skipped, instruction units count: 353
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.heytap.databaseengineservice.sync.syncdata.base.SyncData.Q(kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function1, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:25:0x019f  */
    /* JADX WARN: Code duplicated, block: B:27:0x01cb A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:28:0x01cc  */
    /* JADX WARN: Code duplicated, block: B:31:0x01ea  */
    /* JADX WARN: Code duplicated, block: B:32:0x01f9  */
    /* JADX WARN: Code duplicated, block: B:34:0x020e  */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:34:0x020e -> B:91:0x04df). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:53:0x0313 -> B:54:0x032c). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public final java.lang.Object R(p010kotlin.jvm.functions.Function2<? super java.lang.Long, ? super java.lang.Long, ? extends com.oplus.aiunit.vision.lbd<com.heytap.databaseengineservice.sync.network.DBBaseResponse<T>>> r26, p010kotlin.jvm.functions.Function1<? super T, p010kotlin.Unit> r27, p010kotlin.jvm.functions.Function1<? super T, ? extends java.util.List<java.lang.Long>> r28, p010kotlin.coroutines.Continuation<? super p010kotlin.Unit> r29) {
        /*
            Method dump skipped, instruction units count: 1296
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.heytap.databaseengineservice.sync.syncdata.base.SyncData.R(kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function1, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x00cb, code lost:
    
        if (r5 != 1) goto L27;
     */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x0072 -> B:18:0x0075). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object S(long j2, Function1<? super PullHealthDataVersionParamsNew, ? extends lbd<DBBaseResponse<VersionListRspBodyNewModify>>> function1, Continuation<? super List<Long>> continuation) {
        SyncData$requestVersions$1 syncData$requestVersions$1;
        PullHealthDataVersionParamsNew pullHealthDataVersionParamsNew;
        List arrayList;
        long[] jArr;
        if (continuation instanceof SyncData$requestVersions$1) {
            syncData$requestVersions$1 = (SyncData$requestVersions$1) continuation;
            int i2 = syncData$requestVersions$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                syncData$requestVersions$1.label = i2 - Integer.MIN_VALUE;
            } else {
                syncData$requestVersions$1 = new SyncData$requestVersions$1(this, continuation);
            }
        } else {
            syncData$requestVersions$1 = new SyncData$requestVersions$1(this, continuation);
        }
        Object objC = syncData$requestVersions$1.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i3 = syncData$requestVersions$1.label;
        if (i3 == 0) {
            ResultKt.throwOnFailure(objC);
            long[] jArr2 = {j2};
            pullHealthDataVersionParamsNew = new PullHealthDataVersionParamsNew(j2, 0);
            arrayList = new ArrayList();
            jArr = jArr2;
            lbd<DBBaseResponse<VersionListRspBodyNewModify>> lbdVarInvoke = function1.invoke(pullHealthDataVersionParamsNew);
            syncData$requestVersions$1.L$0 = this;
            syncData$requestVersions$1.L$1 = function1;
            syncData$requestVersions$1.L$2 = jArr;
            syncData$requestVersions$1.L$3 = pullHealthDataVersionParamsNew;
            syncData$requestVersions$1.L$4 = arrayList;
            syncData$requestVersions$1.label = 1;
            objC = RxExtendKt.c(lbdVarInvoke, syncData$requestVersions$1);
            if (objC == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            List list = (List) syncData$requestVersions$1.L$4;
            PullHealthDataVersionParamsNew pullHealthDataVersionParamsNew2 = (PullHealthDataVersionParamsNew) syncData$requestVersions$1.L$3;
            jArr = (long[]) syncData$requestVersions$1.L$2;
            function1 = (Function1) syncData$requestVersions$1.L$1;
            SyncData<T> syncData = (SyncData) syncData$requestVersions$1.L$0;
            ResultKt.throwOnFailure(objC);
            arrayList = list;
            this = syncData;
            pullHealthDataVersionParamsNew = pullHealthDataVersionParamsNew2;
        }
        Intrinsics.checkNotNullExpressionValue(objC, "queryVersionList.invoke(resReq).awaitOnce()");
        DBBaseResponse dBBaseResponse = (DBBaseResponse) objC;
        if (dBBaseResponse.getBody() != null && !hz.b(((VersionListRspBodyNewModify) dBBaseResponse.getBody()).getModifiedTimestampList())) {
            int hasMore = ((VersionListRspBodyNewModify) dBBaseResponse.getBody()).getHasMore();
            List<Long> modifiedTimestampList = ((VersionListRspBodyNewModify) dBBaseResponse.getBody()).getModifiedTimestampList();
            Intrinsics.checkNotNullExpressionValue(modifiedTimestampList, "versionsResponse.body.modifiedTimestampList");
            Object objMaxOrNull = CollectionsKt___CollectionsKt.maxOrNull((Iterable<? extends Object>) modifiedTimestampList);
            Intrinsics.checkNotNull(objMaxOrNull);
            jArr[0] = ((Number) objMaxOrNull).longValue();
            arrayList.addAll(modifiedTimestampList);
            if (hasMore == 1) {
                pullHealthDataVersionParamsNew.setModifiedTimestamp(jArr[0]);
            }
        }
        cj4.c("SyncBaseStat", "type " + this.o() + ": modifiedTimeVersions " + arrayList);
        return arrayList;
    }

    public final void T(List<Long> modifiedTimeVersions, boolean supportLazyLoad, SyncData<T> syncData) {
        if (hz.b(modifiedTimeVersions)) {
            return;
        }
        cj4.c("SyncBaseStat", "saveVersions mVersions:" + this.mVersions);
        l(modifiedTimeVersions, this.mVersions);
        if (supportLazyLoad) {
            this.f18504c.e(this.mVersions, syncData, this.b);
        } else {
            p9j.b(o(), this.mVersions, this.b);
        }
    }

    public final void U(boolean z) {
        this.supportVersions = z;
    }
}
