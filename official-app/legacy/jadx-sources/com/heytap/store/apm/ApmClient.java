package com.heytap.store.apm;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.heytap.databaseengine.model.UserGoalInfo;
import com.heytap.store.apm.ApmClient;
import com.heytap.store.apm.config.ApmConfig;
import com.heytap.store.apm.util.DataReportUtilKt;
import com.heytap.store.apm.util.HttpResponsesTrack;
import com.heytap.store.base.core.util.DataParserUtil;
import com.heytap.store.business.configservice.IConfigService;
import com.heytap.store.business.configservice.IConfigViewModel;
import com.heytap.store.platform.htrouter.launcher.business.HTAliasRouter;
import com.oplus.aiunit.vision.h4g;
import com.oplus.aiunit.vision.p14;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes19.dex */
public class ApmClient {
    private static final String APM_CONFIG_NAME = "apm_config";
    public static final String TAG = "ApmClient";
    private static long applicationStartTime;
    private static boolean hasTrackAppStart;
    public static ApmConfig apmConfig = new ApmConfig();
    public static boolean logEnable = false;
    private static Map<Integer, PageTracker> pageTrackTask = new HashMap();

    public class a implements Application.ActivityLifecycleCallbacks {
        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityCreated(@NonNull Activity activity, @Nullable Bundle bundle) {
            String simpleName = activity.getClass().getSimpleName();
            if (!PageFilter.isPageFiltered(activity.getClass().getName())) {
                PageTracker pageTracker = new PageTracker(activity);
                ApmClient.pageTrackTask.put(Integer.valueOf(activity.hashCode()), pageTracker);
                pageTracker.start();
            }
            boolean zIsAPPStartFiltered = PageFilter.isAPPStartFiltered(simpleName);
            if (!ApmClient.apmConfig.getCtaPassed() || ApmClient.hasTrackAppStart || zIsAPPStartFiltered) {
                return;
            }
            String stringExtra = activity.getIntent().getStringExtra("original_link");
            if (stringExtra == null) {
                stringExtra = "";
            }
            if (ApmClient.logEnable) {
                if (TextUtils.isEmpty(stringExtra)) {
                    Log.d(ApmClient.TAG, "桌面点击");
                } else {
                    Log.d(ApmClient.TAG, "外部拉起");
                }
            }
            boolean unused = ApmClient.hasTrackAppStart = true;
            DataReportUtilKt.reportAppStart(System.currentTimeMillis() - ApmClient.applicationStartTime, stringExtra, simpleName, false);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityDestroyed(@NonNull Activity activity) {
            PageTracker pageTracker = (PageTracker) ApmClient.pageTrackTask.remove(Integer.valueOf(activity.hashCode()));
            if (pageTracker != null) {
                pageTracker.exit();
            }
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPaused(@NonNull Activity activity) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityResumed(@NonNull Activity activity) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivitySaveInstanceState(@NonNull Activity activity, @NonNull Bundle bundle) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStarted(@NonNull Activity activity) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStopped(@NonNull Activity activity) {
        }
    }

    public static Map<Integer, PageTracker> getPageTrackTask() {
        return pageTrackTask;
    }

    private static void getRemoteConfig() {
        IConfigService iConfigService = (IConfigService) HTAliasRouter.getInstance().getService(IConfigService.class);
        if (iConfigService != null) {
            IConfigViewModel configViewModel = iConfigService.getConfigViewModel();
            if (configViewModel != null) {
                configViewModel.requestConfig(APM_CONFIG_NAME);
            }
            String stringConfig = iConfigService.getStringConfig(APM_CONFIG_NAME, "APM_PAGE_TIME_OUT", UserGoalInfo.DEVICE_STEPS_GOAL_DEFAULT);
            String stringConfig2 = iConfigService.getStringConfig(APM_CONFIG_NAME, "APM_PAGE_FILTER", "");
            String stringConfig3 = iConfigService.getStringConfig(APM_CONFIG_NAME, "APM_API_FILTER", "");
            try {
                HttpResponsesTrack.successRate = Float.parseFloat(iConfigService.getStringConfig(APM_CONFIG_NAME, "APM_API_RATE", "0.01"));
            } catch (Exception unused) {
            }
            String stringConfig4 = iConfigService.getStringConfig(APM_CONFIG_NAME, "APM_EXCEPTION_FILTER", "");
            if (logEnable) {
                Log.d(TAG, "pageTimeOut:" + stringConfig);
                Log.d(TAG, "pageFilter:" + stringConfig2);
                Log.d(TAG, "apiFilter:" + stringConfig3);
                Log.d(TAG, "exceptionFilter:" + stringConfig4);
            }
            apmConfig.setPageTimeOut(DataParserUtil.parseLong(stringConfig, 5000));
            if (!TextUtils.isEmpty(stringConfig2)) {
                PageFilter.pageFilterList.addAll(Arrays.asList(stringConfig2.split(",")));
            }
            if (!TextUtils.isEmpty(stringConfig3)) {
                PageFilter.apiFilterList.addAll(Arrays.asList(stringConfig3.split(",")));
            }
            if (TextUtils.isEmpty(stringConfig4)) {
                return;
            }
            PageFilter.exceptionFilterList.addAll(Arrays.asList(stringConfig4.split(",")));
        }
    }

    public static void init(Application application, ApmConfig apmConfig2) {
        apmConfig = apmConfig2;
        logEnable = apmConfig2.getLogEnable();
        applicationStartTime = System.currentTimeMillis();
        track(application);
    }

    public static boolean isEnable() {
        ApmConfig apmConfig2 = apmConfig;
        return apmConfig2 != null && apmConfig2.getApmEnable();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$track$0(Throwable th) throws Exception {
    }

    public static boolean reportEnable() {
        return apmConfig.getReportEnable();
    }

    public static void startTrackPage(ViewGroup viewGroup, String str) {
    }

    private static void track(Application application) {
        if (!isEnable() || !apmConfig.getCtaPassed()) {
            h4g.A(new p14() { // from class: com.oplus.aiunit.vision.g80
                @Override // com.oplus.aiunit.vision.p14
                public final void accept(Object obj) throws Exception {
                    ApmClient.lambda$track$0((Throwable) obj);
                }
            });
            return;
        }
        h4g.A(new p14() { // from class: com.oplus.aiunit.vision.h80
            @Override // com.oplus.aiunit.vision.p14
            public final void accept(Object obj) {
                DataReportUtilKt.reportExceptionEvent((Throwable) obj);
            }
        });
        try {
            getRemoteConfig();
        } catch (Exception e2) {
            Log.e(TAG, "getRemoteConfig error");
            if (logEnable) {
                e2.printStackTrace();
            }
        }
        if (apmConfig.getPageTrackerEnable()) {
            application.registerActivityLifecycleCallbacks(new a());
        }
    }
}
