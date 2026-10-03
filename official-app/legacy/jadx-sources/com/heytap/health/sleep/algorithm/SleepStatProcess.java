package com.heytap.health.sleep.algorithm;

import android.content.Context;
import android.content.Intent;
import androidx.compose.runtime.internal.StabilityInferred;
import com.heytap.health.device_settings.setting.IDeviceSettingService;
import com.heytap.log.formatter.LogFieldKey;
import com.oplus.aiunit.vision.a7b;
import com.oplus.aiunit.vision.b2n;
import com.oplus.aiunit.vision.b78;
import com.oplus.aiunit.vision.dqh;
import com.oplus.aiunit.vision.fqh;
import com.oplus.aiunit.vision.lbd;
import com.oplus.aiunit.vision.mq8;
import com.oplus.aiunit.vision.peh;
import com.oplus.aiunit.vision.tqg;
import com.oplus.aiunit.vision.wq8;
import com.oplus.aiunit.vision.x0;
import com.oplus.smartenginehelper.entity.ClickApiEntity;
import io.protostuff.MapSchema;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineName;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.FlowPreview;
import kotlinx.coroutines.sync.Mutex;
import kotlinx.coroutines.sync.MutexKt;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.DefaultConstructorMarker;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes18.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u0000 22\u00020\u0001:\u0002\u0012\u0016B\u0007¢\u0006\u0004\b0\u00101J\u0018\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\u0007J \u0010\t\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0007H\u0007J\u0010\u0010\u000b\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\u0002H\u0002J\u000e\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\fH\u0002J\u0010\u0010\u0010\u001a\u00020\u00052\u0006\u0010\u000f\u001a\u00020\u0007H\u0002R\u0014\u0010\u0014\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0018\u001a\u00020\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0014\u0010\u001c\u001a\u00020\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0014\u0010 \u001a\u00020\u001d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0014\u0010$\u001a\u00020!8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#R\u001a\u0010)\u001a\b\u0012\u0004\u0012\u00020&0%8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010(R\u0014\u0010-\u001a\u00020*8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010,R\u0016\u0010\u000f\u001a\u00020\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b.\u0010/¨\u00063"}, d2 = {"Lcom/heytap/health/sleep/algorithm/SleepStatProcess;", "", "", "startTime", "endTime", "", LogFieldKey.LEVEL_KEY, "", "calibration", LogFieldKey.MESSAGE_KEY, ClickApiEntity.TIME, "o", "Lcom/oplus/aiunit/vision/lbd;", "", "n", "hasCurDaySleepData", LogFieldKey.PROCESS_NAME_KEY, "Lcom/heytap/health/sleep/algorithm/SleepStatTimeProcess;", "a", "Lcom/heytap/health/sleep/algorithm/SleepStatTimeProcess;", "process", "Lkotlinx/coroutines/CoroutineScope;", "b", "Lkotlinx/coroutines/CoroutineScope;", "mScope", "Lcom/oplus/aiunit/vision/peh;", "c", "Lcom/oplus/aiunit/vision/peh;", "sleepDayDataRepository", "Lcom/oplus/aiunit/vision/fqh;", "d", "Lcom/oplus/aiunit/vision/fqh;", "sleepStatTransform", "Lcom/oplus/aiunit/vision/dqh;", MapSchema.FIELD_NAME_ENTRY, "Lcom/oplus/aiunit/vision/dqh;", "sleepStatRepository", "Ljava/util/concurrent/CopyOnWriteArrayList;", "Lcom/heytap/health/sleep/algorithm/SleepStatTimeProcess$SleepNeedSyncTime;", "f", "Ljava/util/concurrent/CopyOnWriteArrayList;", "sleepTimeList", "Lkotlinx/coroutines/sync/Mutex;", b2n.f, "Lkotlinx/coroutines/sync/Mutex;", "mutex", b2n.g, "Z", "<init>", "()V", "Companion", "sleep_release"}, k = 1, mv = {1, 8, 0})
public final class SleepStatProcess {

    @NotNull
    public static final String TAG = "SleepStatProcess";

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final SleepStatTimeProcess process = new SleepStatTimeProcess();

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final CoroutineScope mScope = CoroutineScopeKt.CoroutineScope(new CoroutineName("calculate-sleepStat-data").plus(wq8.INSTANCE.e()));

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final peh sleepDayDataRepository = new peh();

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    public final fqh sleepStatTransform = new fqh();

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final dqh sleepStatRepository = new dqh();

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @NotNull
    public final CopyOnWriteArrayList<SleepStatTimeProcess.SleepNeedSyncTime> sleepTimeList = new CopyOnWriteArrayList<>();

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    @NotNull
    public final Mutex mutex = MutexKt.Mutex$default(false, 1, null);

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    public boolean hasCurDaySleepData;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* JADX INFO: renamed from: com.heytap.health.sleep.algorithm.SleepStatProcess$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0006\u0010\u0003\u001a\u00020\u0002R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\t"}, d2 = {"Lcom/heytap/health/sleep/algorithm/SleepStatProcess$a;", "", "Lcom/heytap/health/sleep/algorithm/SleepStatProcess;", "a", "", "TAG", "Ljava/lang/String;", "<init>", "()V", "sleep_release"}, k = 1, mv = {1, 8, 0})
    public static final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final SleepStatProcess a() {
            return b.INSTANCE.a();
        }
    }

    @StabilityInferred(parameters = 0)
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0007\u0010\bR\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0003\u0010\u0005¨\u0006\t"}, d2 = {"Lcom/heytap/health/sleep/algorithm/SleepStatProcess$b;", "", "Lcom/heytap/health/sleep/algorithm/SleepStatProcess;", "a", "Lcom/heytap/health/sleep/algorithm/SleepStatProcess;", "()Lcom/heytap/health/sleep/algorithm/SleepStatProcess;", "sSingle", "<init>", "()V", "sleep_release"}, k = 1, mv = {1, 8, 0})
    public static final class b {

        @NotNull
        public static final b INSTANCE = new b();

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        @NotNull
        public static final SleepStatProcess sSingle = new SleepStatProcess();
        public static final int $stable = 8;

        @NotNull
        public final SleepStatProcess a() {
            return sSingle;
        }
    }

    @FlowPreview
    public final void l(long startTime, long endTime) {
        m(startTime, endTime, false);
    }

    @FlowPreview
    public final void m(long startTime, long endTime, boolean calibration) {
        BuildersKt__Builders_commonKt.launch$default(this.mScope, wq8.INSTANCE.e(), null, new SleepStatProcess$calculate$1(this, startTime, endTime, calibration, null), 2, null);
    }

    public final lbd<Integer> n() {
        Object objNavigation = x0.d().b("/device_settings/DeviceSettingServiceImpl").navigation();
        Intrinsics.checkNotNull(objNavigation, "null cannot be cast to non-null type com.heytap.health.device_settings.setting.IDeviceSettingService");
        lbd<Integer> lbdVarB4 = ((IDeviceSettingService) objNavigation).B4();
        Intrinsics.checkNotNullExpressionValue(lbdVarB4, "deviceSettingService.readSleepGoal()");
        return lbdVarB4;
    }

    public final void o(long time) {
        long jO = mq8.INSTANCE.o(time);
        for (SleepStatTimeProcess.SleepNeedSyncTime sleepNeedSyncTime : this.sleepTimeList) {
            if (sleepNeedSyncTime.getStartDayTime() == jO) {
                a7b.f(TAG, "remove time");
                this.sleepTimeList.remove(sleepNeedSyncTime);
                return;
            }
        }
    }

    public final void p(boolean hasCurDaySleepData) {
        Context contextA = b78.a();
        Intent intent = new Intent(tqg.SLEEP_STAT_REFRESH);
        intent.setPackage(contextA.getPackageName());
        intent.putExtra("hasCurDaySleepData", hasCurDaySleepData);
        contextA.sendBroadcast(intent);
    }
}
