package com.heytap.health.devicepair.manager;

import com.heytap.health.devicemanager.api.DMLocalDeviceManagerApi;
import com.heytap.health.devicemanager.client.params.DMPairParams;
import com.heytap.health.devicemanager.util.BluetoothUtil;
import com.heytap.health.devicepair.manager.task.TaskBindDevice;
import com.heytap.health.devicepair.manager.task.TaskCheckSsoid;
import com.heytap.health.devicepair.manager.task.TaskConnectDevice;
import com.heytap.health.devicepair.manager.task.iwatch.TaskIWatchConnectDevice;
import com.heytap.log.formatter.LogFieldKey;
import com.oplus.aiunit.vision.b2n;
import com.oplus.aiunit.vision.gl4;
import com.oplus.aiunit.vision.ml4;
import com.oplus.aiunit.vision.ol4;
import com.oplus.aiunit.vision.qe0;
import com.oplus.aiunit.vision.x0;
import com.oplus.aiunit.vision.y0k;
import com.oplus.aiunit.vision.y5e;
import com.opos.process.bridge.base.BridgeConstant;
import io.protostuff.MapSchema;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Lazy;
import p010kotlin.LazyKt__LazyJVMKt;
import p010kotlin.Metadata;
import p010kotlin.Unit;
import p010kotlin.jvm.functions.Function0;
import p010kotlin.jvm.functions.Function1;
import p010kotlin.jvm.internal.Intrinsics;
import p010kotlin.jvm.internal.SourceDebugExtension;
import p010kotlin.text.StringsKt__StringsJVMKt;

/* JADX INFO: loaded from: classes16.dex */
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u001dB\u000f\u0012\u0006\u0010\u001f\u001a\u00020\u001c¢\u0006\u0004\b*\u0010+J\u0014\u0010\u0006\u001a\u00020\u00052\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002J\u0006\u0010\u0007\u001a\u00020\u0005J\u0013\u0010\b\u001a\u00020\u0005H\u0087@ø\u0001\u0000¢\u0006\u0004\b\b\u0010\tJ\u000e\u0010\f\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\nJ\u001a\u0010\u000f\u001a\u00020\u00052\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00050\rJ\u000e\u0010\u0010\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\nJ\u0006\u0010\u0012\u001a\u00020\u0011J\u000e\u0010\u0015\u001a\u00020\u00052\u0006\u0010\u0014\u001a\u00020\u0013J\u0006\u0010\u0016\u001a\u00020\u0005J\u0010\u0010\u0017\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\nH\u0002J\u0010\u0010\u0018\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\nH\u0002J\u0010\u0010\u0019\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\nH\u0002J\b\u0010\u001a\u001a\u00020\u0005H\u0002J\b\u0010\u001b\u001a\u00020\u0005H\u0002R\u0014\u0010\u001f\u001a\u00020\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0014\u0010\"\u001a\u00020\u00118\u0002X\u0082D¢\u0006\u0006\n\u0004\b \u0010!R\u0018\u0010\u0014\u001a\u0004\u0018\u00010\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b#\u0010$R!\u0010)\u001a\b\u0012\u0004\u0012\u00020\u00030%8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0006\u0010&\u001a\u0004\b'\u0010(\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006,"}, d2 = {"Lcom/heytap/health/devicepair/manager/PairManager;", "", "", "Lcom/heytap/health/devicepair/manager/a;", "tasks", "", "d", "r", b2n.g, "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/heytap/health/devicepair/manager/ResultData;", BridgeConstant.KEY_RESULT_DATA, b2n.f, "Lkotlin/Function1;", "resetResultCallback", LogFieldKey.PROCESS_NAME_KEY, "n", "", "i", "Lcom/heytap/health/devicepair/manager/PairManager$a;", "pairCallback", "q", "f", LogFieldKey.LEVEL_KEY, MapSchema.FIELD_NAME_KEY, LogFieldKey.MESSAGE_KEY, "o", MapSchema.FIELD_NAME_ENTRY, "Lcom/heytap/health/devicepair/manager/PairContext;", "a", "Lcom/heytap/health/devicepair/manager/PairContext;", "pairContext", "b", "Ljava/lang/String;", "TAG", "c", "Lcom/heytap/health/devicepair/manager/PairManager$a;", "Ljava/util/LinkedList;", "Lkotlin/Lazy;", "j", "()Ljava/util/LinkedList;", "pairTasks", "<init>", "(Lcom/heytap/health/devicepair/manager/PairContext;)V", "device_pair_impl_release"}, k = 1, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nPairManager.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PairManager.kt\ncom/heytap/health/devicepair/manager/PairManager\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,315:1\n1855#2,2:316\n1855#2,2:318\n*S KotlinDebug\n*F\n+ 1 PairManager.kt\ncom/heytap/health/devicepair/manager/PairManager\n*L\n53#1:316,2\n262#1:318,2\n*E\n"})
public final class PairManager {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final PairContext pairContext;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final String TAG;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public a pairCallback;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    public final Lazy pairTasks;

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&J\u0010\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¨\u0006\u0007"}, d2 = {"Lcom/heytap/health/devicepair/manager/PairManager$a;", "", "Lcom/heytap/health/devicepair/manager/ResultData;", BridgeConstant.KEY_RESULT_DATA, "", "a", "b", "device_pair_impl_release"}, k = 1, mv = {1, 8, 0})
    public interface a {
        void a(@NotNull ResultData resultData);

        void b(@NotNull ResultData resultData);
    }

    public PairManager(@NotNull PairContext pairContext) {
        Intrinsics.checkNotNullParameter(pairContext, "pairContext");
        this.pairContext = pairContext;
        this.TAG = "PairManager";
        this.pairTasks = LazyKt__LazyJVMKt.lazy(new Function0<LinkedList<com.heytap.health.devicepair.manager.a>>() { // from class: com.heytap.health.devicepair.manager.PairManager$pairTasks$2
            @Override // p010kotlin.jvm.functions.Function0
            @NotNull
            public final LinkedList<a> invoke() {
                return new LinkedList<>();
            }
        });
    }

    public final void d(@NotNull List<? extends com.heytap.health.devicepair.manager.a> tasks) {
        Intrinsics.checkNotNullParameter(tasks, "tasks");
        j().clear();
        j().addAll(tasks);
        com.heytap.health.devicepair.manager.a aVar = null;
        for (com.heytap.health.devicepair.manager.a aVar2 : j()) {
            if (aVar != null) {
                aVar2.n(aVar);
                aVar.m(aVar2);
            }
            aVar = aVar2;
        }
    }

    /* JADX WARN: Code duplicated, block: B:19:0x004e  */
    /* JADX WARN: Code duplicated, block: B:21:0x005a  */
    /* JADX WARN: Code duplicated, block: B:28:0x006e  */
    public final void e() {
        boolean z;
        com.heytap.health.devicepair.manager.a preTask;
        ResultData taskResultData;
        ResultData.PairExpandBean pairExpandBean;
        String msg;
        Iterator<com.heytap.health.devicepair.manager.a> it = j().iterator();
        boolean z2 = false;
        while (true) {
            if (it.hasNext()) {
                com.heytap.health.devicepair.manager.a next = it.next();
                if (!Intrinsics.areEqual(next.getClass(), TaskIWatchConnectDevice.class)) {
                    if (Intrinsics.areEqual(next.getClass(), TaskConnectDevice.class)) {
                        preTask = next.getPreTask();
                        if (preTask == null && (taskResultData = preTask.getTaskResultData()) != null && taskResultData.b()) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                    }
                    if (!z2 && Intrinsics.areEqual(next.getClass(), TaskBindDevice.class)) {
                        ResultData taskResultData2 = next.getTaskResultData();
                        if (taskResultData2 != null && taskResultData2.b()) {
                            z = true;
                            break;
                        }
                        break;
                    }
                } else {
                    ResultData taskResultData3 = next.getTaskResultData();
                    if ((taskResultData3 == null || (pairExpandBean = taskResultData3.getPairExpandBean()) == null || (msg = pairExpandBean.getMsg()) == null || !StringsKt__StringsJVMKt.startsWith$default(msg, "-10001", false, 2, null)) ? false : true) {
                        ml4.c(this.TAG, "checkPairState iwatch reject pair by user");
                        z = false;
                        z2 = true;
                        break;
                    } else {
                        if (Intrinsics.areEqual(next.getClass(), TaskConnectDevice.class)) {
                            preTask = next.getPreTask();
                            if (preTask == null) {
                                z2 = false;
                            } else {
                                z2 = false;
                            }
                        }
                        if (!z2) {
                        }
                    }
                }
            }
            z = false;
            break;
        }
        ml4.d(this.TAG, "checkPairState bindSuccess:" + z + " isExeConnect:" + z2);
        if (!z2 || z) {
            return;
        }
        n(ResultData.Companion.b(ResultData.INSTANCE, 0, new ResultData.PairExpandBean(ResultData.PairFailType.NORMAL, "PairActivity Finish"), 1, null));
    }

    public final void f() {
        e();
        o();
    }

    public final void g(@NotNull ResultData resultData) {
        Intrinsics.checkNotNullParameter(resultData, "resultData");
        this.pairContext.q(resultData);
    }

    /* JADX WARN: Code duplicated, block: B:28:0x0079 A[Catch: Exception -> 0x010e, TRY_LEAVE, TryCatch #0 {Exception -> 0x010e, blocks: (B:40:0x00e5, B:26:0x0073, B:28:0x0079, B:45:0x010a, B:25:0x006b), top: B:52:0x006b }] */
    /* JADX WARN: Code duplicated, block: B:30:0x00a7 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:31:0x00a8  */
    /* JADX WARN: Code duplicated, block: B:44:0x0107  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:39:0x00e4 -> B:40:0x00e5). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:44:0x0107 -> B:26:0x0073). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @android.annotation.SuppressLint({"HealthLint_ExceptionPrintDetector"})
    @org.jetbrains.annotations.Nullable
    public final java.lang.Object h(@org.jetbrains.annotations.NotNull p010kotlin.coroutines.Continuation<? super p010kotlin.Unit> r13) {
        /*
            Method dump skipped, instruction units count: 342
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.heytap.health.devicepair.manager.PairManager.h(kotlin.coroutines.Continuation):java.lang.Object");
    }

    @NotNull
    public final String i() {
        return y5e.b(this.pairContext.getPairParams().getId()).X1() ? this.pairContext.getDeviceSsoid() : "";
    }

    public final LinkedList<com.heytap.health.devicepair.manager.a> j() {
        return (LinkedList) this.pairTasks.getValue();
    }

    public final void k(ResultData resultData) {
        a aVar = this.pairCallback;
        if (aVar != null) {
            aVar.b(resultData);
        }
    }

    public final void l(final ResultData resultData) {
        if (this.pairCallback == null) {
            ml4.c(this.TAG, "pairCallback == null");
        } else {
            this.pairContext.n(new Function0<Unit>() { // from class: com.heytap.health.devicepair.manager.PairManager$notifyResult$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                @Override // p010kotlin.jvm.functions.Function0
                public /* bridge */ /* synthetic */ Unit invoke() {
                    invoke2();
                    return Unit.INSTANCE;
                }

                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2() {
                    try {
                        ml4.d(this.this$0.TAG, "pair handle finish result " + resultData);
                        if (resultData.b()) {
                            this.this$0.m(resultData);
                            return;
                        }
                        if (!qe0.E()) {
                            y0k.h(resultData.getPairExpandBean().getMsg());
                        }
                        if (resultData.d() == 0) {
                            this.this$0.k(resultData);
                        }
                    } catch (Exception e2) {
                        ml4.c(this.this$0.TAG, "notify error!!!" + e2.getMessage());
                    }
                }
            });
        }
    }

    public final void m(ResultData resultData) {
        a aVar = this.pairCallback;
        if (aVar != null) {
            aVar.a(resultData);
        }
    }

    public final void n(@NotNull ResultData resultData) {
        Intrinsics.checkNotNullParameter(resultData, "resultData");
        if (StringsKt__StringsJVMKt.startsWith$default(resultData.getPairExpandBean().getMsg(), "-10001", false, 2, null)) {
            ml4.d(this.TAG, "pairFailToClean Igonre for Iwatch");
            return;
        }
        String id = this.pairContext.getPairParams().getId();
        String model = this.pairContext.getPairParams().getModel();
        Object objNavigation = x0.d().b(DMLocalDeviceManagerApi.SERVICE_DB_DEVICE).navigation();
        DMLocalDeviceManagerApi dMLocalDeviceManagerApi = objNavigation instanceof DMLocalDeviceManagerApi ? (DMLocalDeviceManagerApi) objNavigation : null;
        if (dMLocalDeviceManagerApi != null) {
            dMLocalDeviceManagerApi.e9(this.pairContext.getContext(), id);
        }
        ol4 ol4Var = gl4.managerApi;
        ol4Var.disconnectDeviceByMac(new DMPairParams(id, model, "pairmanager pair faile : " + resultData.getPairExpandBean().getMsg(), 0, null, null, null, 120, null));
        ol4Var.y(id, model, "pairmanager pair faile : " + resultData.getPairExpandBean().getMsg());
        ol4Var.deleteDeviceByMac(id);
        BluetoothUtil.INSTANCE.h(id);
    }

    public final void o() {
        Iterator<T> it = j().iterator();
        while (it.hasNext()) {
            ((com.heytap.health.devicepair.manager.a) it.next()).j();
        }
        this.pairCallback = null;
        this.pairContext.p();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void p(@NotNull Function1<? super ResultData, Unit> resetResultCallback) {
        Intrinsics.checkNotNullParameter(resetResultCallback, "resetResultCallback");
        ml4.d(this.TAG, "exeReset");
        new TaskCheckSsoid(this.pairContext, null, 2, 0 == true ? 1 : 0).z(1, resetResultCallback);
    }

    public final void q(@NotNull a pairCallback) {
        Intrinsics.checkNotNullParameter(pairCallback, "pairCallback");
        this.pairCallback = pairCallback;
    }

    public final void r() {
        ml4.d(this.TAG, "start pair " + this.pairContext.getPairParams());
        if (this.pairContext.getPairParams().getId().length() == 0) {
            return;
        }
        if (this.pairContext.getPairParams().getModel().length() == 0) {
            return;
        }
        this.pairContext.x(new PairManager$startPair$1(this, null));
    }
}
