package com.heytap.health.settings.watch.sporthealthsettings2;

import androidx.compose.runtime.internal.StabilityInferred;
import com.heytap.health.protocol.fitness.FitnessProtoV2;
import com.lifesense.plugin.ble.data.tracker.ATCmdProfile;
import com.lifesense.weidong.lzsimplenetlibs.net.invoker.JsonResponse;
import com.oplus.aiunit.model.kdi;
import com.oplus.aiunit.vision.em4;
import com.oplus.aiunit.vision.ln3;
import com.oplus.aiunit.vision.m8b;
import com.oplus.aiunit.vision.wl4;
import com.oplus.wearable.linkservice.sdk.common.MessageEvent;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineStart;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes18.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\b\u0007\u0018\u0000 \u00102\u00020\u0001:\u0001\rB\u0007¢\u0006\u0004\b\u000e\u0010\u000fJ8\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00022\u0018\u0010\t\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\b0\u00070\u0006J\u0016\u0010\r\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0002¨\u0006\u0011"}, d2 = {"Lcom/heytap/health/settings/watch/sporthealthsettings2/HrvSettingRepository;", "", "", "skipValue", "reasonValue", "curMonthSkippedCount", "Lcom/oplus/aiunit/vision/ln3;", "Lkotlin/Pair;", "", "resultCallback", "", "b", JsonResponse.PROTOCOL_JSON_KEY_RET, "a", "<init>", "()V", "Companion", "device_settings_impl_release"}, k = 1, mv = {1, 8, 0})
public final class HrvSettingRepository {
    public static final int $stable = 0;

    public final void a(int code, int curMonthSkippedCount) {
        em4 em4Var = wl4.managerApi;
        if (!em4Var.isCurrentConnected()) {
            m8b.f("HrvSettingRepository", "no Connected");
            return;
        }
        String currentConnectId = em4Var.getCurrentConnectId();
        if (currentConnectId == null) {
            m8b.f("HrvSettingRepository", "deviceMac is null");
            return;
        }
        FitnessProtoV2.SkipTodayConfirm skipTodayConfirmBuild = FitnessProtoV2.SkipTodayConfirm.newBuilder().setCode(code).setCurrentMonthSkippedCount(curMonthSkippedCount).build();
        BuildersKt.launch$default(kdi.INSTANCE, (CoroutineContext) null, (CoroutineStart) null, new HrvSettingRepository$sendDevSkipTodayResult$1(skipTodayConfirmBuild, currentConnectId, new MessageEvent(5, 247, skipTodayConfirmBuild.toByteArray()), null), 3, (Object) null);
    }

    public final void b(int skipValue, int reasonValue, int curMonthSkippedCount, @NotNull ln3<Pair<Integer, String>> resultCallback) {
        Intrinsics.checkNotNullParameter(resultCallback, "resultCallback");
        em4 em4Var = wl4.managerApi;
        if (!em4Var.isCurrentConnected()) {
            m8b.f("HrvSettingRepository", "no Connected");
            resultCallback.onResult(new Pair(-1, ""));
            return;
        }
        String currentConnectId = em4Var.getCurrentConnectId();
        if (currentConnectId == null) {
            m8b.f("HrvSettingRepository", "deviceMac is null");
            resultCallback.onResult(new Pair(-1, ""));
        } else {
            BuildersKt.launch$default(kdi.INSTANCE, (CoroutineContext) null, (CoroutineStart) null, new HrvSettingRepository$skipToday$1(currentConnectId, new MessageEvent(5, ATCmdProfile.DataDeviceStatusOfA5, FitnessProtoV2.SkipToday.newBuilder().setSkip(skipValue).setSkipTodayReason(reasonValue).setCurrentMonthSkippedCount(curMonthSkippedCount).build().toByteArray()), resultCallback, null), 3, (Object) null);
        }
    }
}