package com.oplus.seedling.sdk.manager;

import android.content.Context;
import androidx.annotation.ColorInt;
import androidx.annotation.Keep;
import com.oplus.aiunit.vision.ht9;
import com.oplus.aiunit.vision.s8e;
import com.oplus.pantanal.seedling.constants.TraceConstants;
import com.oplus.seedling.sdk.callback.IUpkVersionObserver;
import com.oplus.seedling.sdk.callback.StartActivityCallback;
import com.oplus.seedling.sdk.card.SeedlingServiceInfo;
import com.oplus.seedling.sdk.entity.CardCreateErrorBean;
import com.oplus.seedling.sdk.entity.StatisticsBean;
import com.oplus.seedling.sdk.pid.PidInfo;
import com.oplus.seedling.sdk.pid.PidObserver;
import com.oplus.seedling.sdk.recommendlist.ListObserver;
import com.oplus.seedling.sdk.recommendlist.ServiceInfo;
import com.oplus.seedling.sdk.seedling.SeedlingCallback;
import com.oplus.seedling.sdk.seedling.SeedlingIntent;
import com.oplus.seedling.sdk.serviceconfig.ConfigListObserver;
import com.oplus.seedling.sdk.task.ISeedlingTask;
import com.oplus.seedling.sdk.task.SeedlingTaskCompatibleImpl;
import java.util.List;
import java.util.Set;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes8.dex */
@Keep
@Metadata(d1 = {"\u0000\u009a\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0017\u0018\u0000 C2\u00020\u0001:\u0001CB\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0016J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0007H\u0002J\u0010\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u0007H\u0016J\u000e\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\fH\u0016J\u0010\u0010\u000e\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u0010H\u0016J\u0010\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0007H\u0016J\u0010\u0010\u0014\u001a\u00020\u00042\u0006\u0010\u0015\u001a\u00020\u0016H\u0016J\u0018\u0010\u0017\u001a\u00020\u00042\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001bH\u0016J\u0010\u0010\u001c\u001a\u00020\u00042\u0006\u0010\u001d\u001a\u00020\u001eH\u0016J\u001e\u0010\u001f\u001a\u00020\u00042\f\u0010 \u001a\b\u0012\u0004\u0012\u00020\"0!2\u0006\u0010\u0015\u001a\u00020#H\u0016J\u0010\u0010$\u001a\u00020\u00042\u0006\u0010\u0015\u001a\u00020%H\u0016J\b\u0010&\u001a\u00020\u0004H\u0016J\u0010\u0010'\u001a\u00020\u00042\u0006\u0010(\u001a\u00020)H\u0016J\u0016\u0010'\u001a\u00020\u00042\f\u0010*\u001a\b\u0012\u0004\u0012\u00020)0\fH\u0016J\u0010\u0010+\u001a\u00020\u00042\u0006\u0010,\u001a\u00020-H\u0016J\u0010\u0010.\u001a\u00020\u00042\u0006\u0010/\u001a\u000200H\u0016J\u0010\u00101\u001a\u00020\u00042\u0006\u00102\u001a\u00020\tH\u0016J\u0010\u00103\u001a\u00020\u00042\u0006\u00104\u001a\u00020\tH\u0016J\u0012\u00105\u001a\u00020\u00042\b\b\u0001\u00106\u001a\u00020\"H\u0017J\u001a\u00105\u001a\u00020\u00042\b\b\u0001\u00106\u001a\u00020\"2\u0006\u00107\u001a\u00020\tH\u0016J \u00108\u001a\u00020\u00042\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u00109\u001a\u00020:2\u0006\u0010\u000f\u001a\u00020;H\u0016J \u0010<\u001a\u00020=2\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u00109\u001a\u00020:2\u0006\u0010\u000f\u001a\u00020;H\u0016J\u0010\u0010>\u001a\u00020\u00042\u0006\u0010\u0015\u001a\u00020\u0016H\u0016J\b\u0010?\u001a\u00020\u0004H\u0016J\b\u0010@\u001a\u00020\u0004H\u0016J\u0010\u0010A\u001a\u00020\u00042\u0006\u0010\u0015\u001a\u00020#H\u0016J\u0010\u0010B\u001a\u00020\u00042\u0006\u0010\u0015\u001a\u00020%H\u0016¨\u0006D"}, d2 = {"Lcom/oplus/seedling/sdk/manager/SeedlingManagerCompatibleImpl;", "Lcom/oplus/seedling/sdk/manager/ISeedlingManager;", "()V", "clearPidObserver", "", "defaultLog", "methodName", "", "disableSubDomain", "", "subDomain", "getCurRecommendList", "", "Lcom/oplus/seedling/sdk/recommendlist/ServiceInfo;", "interceptStartActivity", "callback", "Lcom/oplus/seedling/sdk/callback/StartActivityCallback;", "queryServiceInfo", "Lcom/oplus/seedling/sdk/card/SeedlingServiceInfo;", "serviceId", "register", "observer", "Lcom/oplus/seedling/sdk/recommendlist/ListObserver;", "registerData", "context", "Landroid/content/Context;", "callBack", "Lcom/oplus/seedling/sdk/manager/DataSetCallBack;", "registerPidObserver", "pidObserver", "Lcom/oplus/seedling/sdk/pid/PidObserver;", "registerSeedlingConfig", "supportSize", "", "", "Lcom/oplus/seedling/sdk/serviceconfig/ConfigListObserver;", "registerUpkVersionObserver", "Lcom/oplus/seedling/sdk/callback/IUpkVersionObserver;", "release", "reportStatistics", "statisticsBean", "Lcom/oplus/seedling/sdk/entity/StatisticsBean;", "statisticsList", "sendCardCreateErrorToHost", "cardCreateErrorBean", "Lcom/oplus/seedling/sdk/entity/CardCreateErrorBean;", "sendKilledPid", "pidInfo", "Lcom/oplus/seedling/sdk/pid/PidInfo;", "setAODStatus", "status", "setScreenLocked", "locked", "setWidgetColor", "color", "isColorReversed", "startSeedling", TraceConstants.KEY_ACTION, "Lcom/oplus/seedling/sdk/seedling/SeedlingIntent;", "Lcom/oplus/seedling/sdk/seedling/SeedlingCallback;", "startSeedlingTask", "Lcom/oplus/seedling/sdk/task/ISeedlingTask;", "unregister", "unregisterAll", "unregisterAllSeedlingConfig", "unregisterSeedlingConfig", "unregisterUpkVersionObserver", "Companion", "pantanal-client_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public class SeedlingManagerCompatibleImpl implements ISeedlingManager {

    @NotNull
    private static final String TAG = "SeedlingManagerDefaultImpl";

    private final void defaultLog(String methodName) {
        ht9.a.e(s8e.INSTANCE, TAG, "warning, default impl! maybe version is not compatible, methodName:" + methodName, false, (String) null, false, 0, false, (Throwable) null, 252, (Object) null);
    }

    @Override // com.oplus.seedling.sdk.manager.ISeedlingManager
    public void clearPidObserver() {
        defaultLog("clearPidObserver");
    }

    @Override // com.oplus.seedling.sdk.card.ISeedlingService
    public boolean disableSubDomain(@NotNull String subDomain) {
        Intrinsics.checkNotNullParameter(subDomain, "subDomain");
        defaultLog("disableSubDomain");
        return false;
    }

    @Override // com.oplus.seedling.sdk.manager.ISeedlingManager
    @NotNull
    public List<ServiceInfo> getCurRecommendList() {
        defaultLog("getCurRecommendList");
        return CollectionsKt.emptyList();
    }

    @Override // com.oplus.seedling.sdk.manager.ISeedlingManager
    public void interceptStartActivity(@NotNull StartActivityCallback callback) {
        Intrinsics.checkNotNullParameter(callback, "callback");
        defaultLog("interceptStartActivity");
    }

    @Override // com.oplus.seedling.sdk.card.ISeedlingService
    @NotNull
    public SeedlingServiceInfo queryServiceInfo(@NotNull String serviceId) {
        Intrinsics.checkNotNullParameter(serviceId, "serviceId");
        defaultLog("queryServiceInfo");
        return SeedlingServiceInfo.INSTANCE.empty();
    }

    @Override // com.oplus.seedling.sdk.manager.ISeedlingManager
    public void register(@NotNull ListObserver observer) {
        Intrinsics.checkNotNullParameter(observer, "observer");
        defaultLog("register");
    }

    @Override // com.oplus.seedling.sdk.manager.ISeedlingManager
    public void registerData(@NotNull Context context, @NotNull DataSetCallBack callBack) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(callBack, "callBack");
        defaultLog("registerData");
    }

    @Override // com.oplus.seedling.sdk.manager.ISeedlingManager
    public void registerPidObserver(@NotNull PidObserver pidObserver) {
        Intrinsics.checkNotNullParameter(pidObserver, "pidObserver");
        defaultLog("registerPidObserver");
    }

    @Override // com.oplus.seedling.sdk.manager.ISeedlingManager
    public void registerSeedlingConfig(@NotNull Set<Integer> supportSize, @NotNull ConfigListObserver observer) {
        Intrinsics.checkNotNullParameter(supportSize, "supportSize");
        Intrinsics.checkNotNullParameter(observer, "observer");
        defaultLog("registerSeedlingConfig");
    }

    @Override // com.oplus.seedling.sdk.manager.ISeedlingManager
    public void registerUpkVersionObserver(@NotNull IUpkVersionObserver observer) {
        Intrinsics.checkNotNullParameter(observer, "observer");
        defaultLog("registerUpkVersionObserver");
    }

    @Override // com.oplus.seedling.sdk.manager.ISeedlingManager
    public void release() {
        defaultLog("release");
    }

    @Override // com.oplus.seedling.sdk.manager.ISeedlingManager
    public void reportStatistics(@NotNull StatisticsBean statisticsBean) {
        Intrinsics.checkNotNullParameter(statisticsBean, "statisticsBean");
        defaultLog("reportStatistics");
    }

    @Override // com.oplus.seedling.sdk.manager.ISeedlingManager
    public void sendCardCreateErrorToHost(@NotNull CardCreateErrorBean cardCreateErrorBean) {
        Intrinsics.checkNotNullParameter(cardCreateErrorBean, "cardCreateErrorBean");
        defaultLog("sendCardCreateErrorToHost");
    }

    @Override // com.oplus.seedling.sdk.manager.ISeedlingManager
    public void sendKilledPid(@NotNull PidInfo pidInfo) {
        Intrinsics.checkNotNullParameter(pidInfo, "pidInfo");
        defaultLog("sendKilledPid");
    }

    @Override // com.oplus.seedling.sdk.manager.ISeedlingManager
    public void setAODStatus(boolean status) {
        defaultLog("setAODStatus");
    }

    @Override // com.oplus.seedling.sdk.manager.ISeedlingManager
    public void setScreenLocked(boolean locked) {
        defaultLog("setScreenLocked");
    }

    @Override // com.oplus.seedling.sdk.manager.ISeedlingManager
    @Deprecated(message = "do not use it after sdk 1.0.35 version, please use params contain both color and isColorReversed")
    public void setWidgetColor(@ColorInt int color) {
        defaultLog("setWidgetColor(color)");
    }

    @Override // com.oplus.seedling.sdk.manager.ISeedlingManager
    public void startSeedling(@NotNull Context context, @NotNull SeedlingIntent intent, @NotNull SeedlingCallback callback) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(intent, TraceConstants.KEY_ACTION);
        Intrinsics.checkNotNullParameter(callback, "callback");
        defaultLog("startSeedling");
    }

    @Override // com.oplus.seedling.sdk.manager.ISeedlingManager
    @NotNull
    public ISeedlingTask startSeedlingTask(@NotNull Context context, @NotNull SeedlingIntent intent, @NotNull SeedlingCallback callback) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(intent, TraceConstants.KEY_ACTION);
        Intrinsics.checkNotNullParameter(callback, "callback");
        defaultLog("startSeedlingTask");
        return new SeedlingTaskCompatibleImpl();
    }

    @Override // com.oplus.seedling.sdk.manager.ISeedlingManager
    public void unregister(@NotNull ListObserver observer) {
        Intrinsics.checkNotNullParameter(observer, "observer");
        defaultLog("unregister");
    }

    @Override // com.oplus.seedling.sdk.manager.ISeedlingManager
    public void unregisterAll() {
        defaultLog("unregisterAll");
    }

    @Override // com.oplus.seedling.sdk.manager.ISeedlingManager
    public void unregisterAllSeedlingConfig() {
        defaultLog("unregisterAllSeedlingConfig");
    }

    @Override // com.oplus.seedling.sdk.manager.ISeedlingManager
    public void unregisterSeedlingConfig(@NotNull ConfigListObserver observer) {
        Intrinsics.checkNotNullParameter(observer, "observer");
        defaultLog("unregisterSeedlingConfig");
    }

    @Override // com.oplus.seedling.sdk.manager.ISeedlingManager
    public void unregisterUpkVersionObserver(@NotNull IUpkVersionObserver observer) {
        Intrinsics.checkNotNullParameter(observer, "observer");
        defaultLog("unregisterUpkVersionObserver");
    }

    @Override // com.oplus.seedling.sdk.manager.ISeedlingManager
    public void reportStatistics(@NotNull List<StatisticsBean> statisticsList) {
        Intrinsics.checkNotNullParameter(statisticsList, "statisticsList");
        defaultLog("reportStatisticsList");
    }

    @Override // com.oplus.seedling.sdk.manager.ISeedlingManager
    public void setWidgetColor(@ColorInt int color, boolean isColorReversed) {
        defaultLog("setWidgetColor(color, isColorReversed)");
    }
}
