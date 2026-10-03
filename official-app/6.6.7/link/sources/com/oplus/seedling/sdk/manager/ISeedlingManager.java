package com.oplus.seedling.sdk.manager;

import android.content.Context;
import androidx.annotation.ColorInt;
import androidx.annotation.Keep;
import androidx.annotation.WorkerThread;
import com.oplus.pantanal.seedling.constants.TraceConstants;
import com.oplus.seedling.sdk.callback.IUpkVersionObserver;
import com.oplus.seedling.sdk.callback.StartActivityCallback;
import com.oplus.seedling.sdk.card.ISeedlingService;
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
import java.util.List;
import java.util.Set;
import kotlin.Deprecated;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes8.dex */
@Keep
@Metadata(d1 = {"\u0000\u008a\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\bg\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\u000e\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H'J\u0010\u0010\u0007\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\tH&J\u0010\u0010\n\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\fH&J\u0018\u0010\r\u001a\u00020\u00032\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0011H&J\u0010\u0010\u0012\u001a\u00020\u00032\u0006\u0010\u0013\u001a\u00020\u0014H&J\u001e\u0010\u0015\u001a\u00020\u00032\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00180\u00172\u0006\u0010\u000b\u001a\u00020\u0019H&J\u0010\u0010\u001a\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\u001bH&J\b\u0010\u001c\u001a\u00020\u0003H&J\u0010\u0010\u001d\u001a\u00020\u00032\u0006\u0010\u001e\u001a\u00020\u001fH&J\u0016\u0010\u001d\u001a\u00020\u00032\f\u0010 \u001a\b\u0012\u0004\u0012\u00020\u001f0\u0005H&J\u0010\u0010!\u001a\u00020\u00032\u0006\u0010\"\u001a\u00020#H&J\u0010\u0010$\u001a\u00020\u00032\u0006\u0010%\u001a\u00020&H&J\u0010\u0010'\u001a\u00020\u00032\u0006\u0010(\u001a\u00020)H&J\u0010\u0010*\u001a\u00020\u00032\u0006\u0010+\u001a\u00020)H&J\u0012\u0010,\u001a\u00020\u00032\b\b\u0001\u0010-\u001a\u00020\u0018H'J\u001a\u0010,\u001a\u00020\u00032\b\b\u0001\u0010-\u001a\u00020\u00182\u0006\u0010.\u001a\u00020)H&J \u0010/\u001a\u00020\u00032\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u00100\u001a\u0002012\u0006\u0010\b\u001a\u000202H&J \u00103\u001a\u0002042\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u00100\u001a\u0002012\u0006\u0010\b\u001a\u000202H&J\u0010\u00105\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\fH&J\b\u00106\u001a\u00020\u0003H&J\b\u00107\u001a\u00020\u0003H&J\u0010\u00108\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\u0019H&J\u0010\u00109\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\u001bH&¨\u0006:"}, d2 = {"Lcom/oplus/seedling/sdk/manager/ISeedlingManager;", "Lcom/oplus/seedling/sdk/card/ISeedlingService;", "clearPidObserver", "", "getCurRecommendList", "", "Lcom/oplus/seedling/sdk/recommendlist/ServiceInfo;", "interceptStartActivity", "callback", "Lcom/oplus/seedling/sdk/callback/StartActivityCallback;", "register", "observer", "Lcom/oplus/seedling/sdk/recommendlist/ListObserver;", "registerData", "context", "Landroid/content/Context;", "callBack", "Lcom/oplus/seedling/sdk/manager/DataSetCallBack;", "registerPidObserver", "pidObserver", "Lcom/oplus/seedling/sdk/pid/PidObserver;", "registerSeedlingConfig", "supportSize", "", "", "Lcom/oplus/seedling/sdk/serviceconfig/ConfigListObserver;", "registerUpkVersionObserver", "Lcom/oplus/seedling/sdk/callback/IUpkVersionObserver;", "release", "reportStatistics", "statisticsBean", "Lcom/oplus/seedling/sdk/entity/StatisticsBean;", "statisticsList", "sendCardCreateErrorToHost", "cardCreateErrorBean", "Lcom/oplus/seedling/sdk/entity/CardCreateErrorBean;", "sendKilledPid", "pidInfo", "Lcom/oplus/seedling/sdk/pid/PidInfo;", "setAODStatus", "status", "", "setScreenLocked", "locked", "setWidgetColor", "color", "isColorReversed", "startSeedling", TraceConstants.KEY_ACTION, "Lcom/oplus/seedling/sdk/seedling/SeedlingIntent;", "Lcom/oplus/seedling/sdk/seedling/SeedlingCallback;", "startSeedlingTask", "Lcom/oplus/seedling/sdk/task/ISeedlingTask;", "unregister", "unregisterAll", "unregisterAllSeedlingConfig", "unregisterSeedlingConfig", "unregisterUpkVersionObserver", "pantanal-client_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public interface ISeedlingManager extends ISeedlingService {
    void clearPidObserver();

    @WorkerThread
    @NotNull
    List<ServiceInfo> getCurRecommendList();

    void interceptStartActivity(@NotNull StartActivityCallback callback);

    void register(@NotNull ListObserver observer);

    void registerData(@NotNull Context context, @NotNull DataSetCallBack callBack);

    void registerPidObserver(@NotNull PidObserver pidObserver);

    void registerSeedlingConfig(@NotNull Set<Integer> supportSize, @NotNull ConfigListObserver observer);

    void registerUpkVersionObserver(@NotNull IUpkVersionObserver observer);

    void release();

    void reportStatistics(@NotNull StatisticsBean statisticsBean);

    void reportStatistics(@NotNull List<StatisticsBean> statisticsList);

    void sendCardCreateErrorToHost(@NotNull CardCreateErrorBean cardCreateErrorBean);

    void sendKilledPid(@NotNull PidInfo pidInfo);

    void setAODStatus(boolean status);

    void setScreenLocked(boolean locked);

    @Deprecated(message = "do not use it after sdk 1.0.35 version, please use params contain both color and isColorReversed")
    void setWidgetColor(@ColorInt int color);

    void setWidgetColor(@ColorInt int color, boolean isColorReversed);

    void startSeedling(@NotNull Context context, @NotNull SeedlingIntent intent, @NotNull SeedlingCallback callback);

    @NotNull
    ISeedlingTask startSeedlingTask(@NotNull Context context, @NotNull SeedlingIntent intent, @NotNull SeedlingCallback callback);

    void unregister(@NotNull ListObserver observer);

    void unregisterAll();

    void unregisterAllSeedlingConfig();

    void unregisterSeedlingConfig(@NotNull ConfigListObserver observer);

    void unregisterUpkVersionObserver(@NotNull IUpkVersionObserver observer);
}
