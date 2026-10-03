package com.sensorsdata.analytics.android.autotrack.core;

import android.app.Activity;
import android.app.Dialog;
import android.view.View;
import com.sensorsdata.analytics.android.autotrack.aop.FragmentTrackHelper;
import com.sensorsdata.analytics.android.autotrack.core.autotrack.ActivityLifecycleCallbacks;
import com.sensorsdata.analytics.android.autotrack.core.autotrack.FragmentViewScreenCallbacks;
import com.sensorsdata.analytics.android.autotrack.core.business.SAPageTools;
import com.sensorsdata.analytics.android.autotrack.core.impl.AutoTrackProtocolIml;
import com.sensorsdata.analytics.android.autotrack.core.pageleave.ActivityPageLeaveCallbacks;
import com.sensorsdata.analytics.android.autotrack.core.pageleave.FragmentPageLeaveCallbacks;
import com.sensorsdata.analytics.android.autotrack.core.plugins.AutoTrackEventPlugin;
import com.sensorsdata.analytics.android.sdk.SALog;
import com.sensorsdata.analytics.android.sdk.SensorsDataAPI;
import com.sensorsdata.analytics.android.sdk.core.SAContextManager;
import com.sensorsdata.analytics.android.sdk.exceptions.SensorsDataExceptionHandler;
import com.sensorsdata.analytics.android.sdk.internal.beans.InternalConfigOptions;
import com.sensorsdata.analytics.android.sdk.monitor.SensorsDataLifecycleMonitorManager;
import java.util.List;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes10.dex */
public class AutoTrackContextHelper {
    private static final String TAG = "AutoTrackContextHelper";
    private ActivityLifecycleCallbacks mActivityLifecycleCallbacks;
    private final InternalConfigOptions mInternalConfigs;
    private final AutoTrackProtocolIml mProtocolImp;
    private final SAContextManager mSAContextManager;

    public AutoTrackContextHelper(SAContextManager sAContextManager) {
        this.mSAContextManager = sAContextManager;
        this.mInternalConfigs = sAContextManager.getInternalConfigs();
        this.mProtocolImp = new AutoTrackProtocolIml(sAContextManager);
        registerListener();
        sAContextManager.getPluginManager().registerPropertyPlugin(new AutoTrackEventPlugin());
        try {
            if (sAContextManager.getInternalConfigs().context instanceof Activity) {
                delayExecution((Activity) sAContextManager.getInternalConfigs().context);
            }
        } catch (Exception e2) {
            SALog.printStackTrace(e2);
        }
    }

    public void delayExecution(Activity activity) {
        ActivityLifecycleCallbacks activityLifecycleCallbacks = this.mActivityLifecycleCallbacks;
        if (activityLifecycleCallbacks != null) {
            activityLifecycleCallbacks.onActivityCreated(activity, null);
            this.mActivityLifecycleCallbacks.onDelayInitStarted(activity);
        }
        if (SALog.isLogEnabled()) {
            SALog.i(TAG, "SDK init success by：" + activity.getClass().getName());
        }
    }

    public <T> T invokeModuleFunction(String str, Object... objArr) {
        str.hashCode();
        switch (str) {
            case "isActivityAutoTrackAppViewScreenIgnored":
                return (T) Boolean.valueOf(this.mProtocolImp.isActivityAutoTrackAppViewScreenIgnored((Class) objArr[0]));
            case "setViewFragmentName":
                this.mProtocolImp.setViewFragmentName((View) objArr[0], (String) objArr[1]);
                return null;
            case "isActivityAutoTrackAppClickIgnored":
                return (T) Boolean.valueOf(this.mProtocolImp.isActivityAutoTrackAppClickIgnored((Class) objArr[0]));
            case "disableAutoTrack":
                Object obj = objArr[0];
                if (obj instanceof SensorsDataAPI.AutoTrackEventType) {
                    this.mProtocolImp.disableAutoTrack((SensorsDataAPI.AutoTrackEventType) obj);
                    return null;
                }
                this.mProtocolImp.disableAutoTrack((List<SensorsDataAPI.AutoTrackEventType>) obj);
                return null;
            case "getLastScreenTrackProperties":
                return (T) this.mProtocolImp.getLastScreenTrackProperties();
            case "ignoreAutoTrackActivities":
                this.mProtocolImp.ignoreAutoTrackActivities((List) objArr[0]);
                return null;
            case "resumeAutoTrackActivities":
                this.mProtocolImp.resumeAutoTrackActivities((List) objArr[0]);
                return null;
            case "enableAutoTrack":
                this.mProtocolImp.enableAutoTrack((List<SensorsDataAPI.AutoTrackEventType>) objArr[0]);
                return null;
            case "trackViewScreen":
                if (objArr.length != 1) {
                    this.mProtocolImp.trackViewScreen((String) objArr[0], (JSONObject) objArr[1]);
                    return null;
                }
                Object obj2 = objArr[0];
                if (obj2 instanceof Activity) {
                    this.mProtocolImp.trackViewScreen((Activity) obj2);
                    return null;
                }
                this.mProtocolImp.trackViewScreen(obj2);
                return null;
            case "ignoreAutoTrackActivity":
                this.mProtocolImp.ignoreAutoTrackActivity((Class) objArr[0]);
                return null;
            case "ignoreAutoTrackFragment":
                this.mProtocolImp.ignoreAutoTrackFragment((Class) objArr[0]);
                return null;
            case "ignoreViewType":
                this.mProtocolImp.ignoreViewType((Class) objArr[0]);
                return null;
            case "trackFragmentAppViewScreen":
                this.mProtocolImp.trackFragmentAppViewScreen();
                return null;
            case "getReferrerScreenTitle":
                return (T) SAPageTools.getReferrerTitle();
            case "isAutoTrackEnabled":
                return (T) Boolean.valueOf(this.mProtocolImp.isAutoTrackEnabled());
            case "setViewActivity":
                this.mProtocolImp.setViewActivity((View) objArr[0], (Activity) objArr[1]);
                return null;
            case "setViewProperties":
                this.mProtocolImp.setViewProperties((View) objArr[0], (JSONObject) objArr[1]);
                return null;
            case "setViewID":
                Object obj3 = objArr[0];
                if (obj3 instanceof View) {
                    this.mProtocolImp.setViewID((View) obj3, (String) objArr[1]);
                    return null;
                }
                if (obj3 instanceof Dialog) {
                    this.mProtocolImp.setViewID((Dialog) obj3, (String) objArr[1]);
                    return null;
                }
                this.mProtocolImp.setViewID(obj3, (String) objArr[1]);
                return null;
            case "resumeAutoTrackActivity":
                this.mProtocolImp.resumeAutoTrackActivity((Class) objArr[0]);
                return null;
            case "isFragmentAutoTrackAppViewScreen":
                return (T) Boolean.valueOf(this.mProtocolImp.isFragmentAutoTrackAppViewScreen((Class) objArr[0]));
            case "ignoreAutoTrackFragments":
                this.mProtocolImp.ignoreAutoTrackFragments((List) objArr[0]);
                return null;
            case "ignoreView":
                if (objArr.length == 1) {
                    this.mProtocolImp.ignoreView((View) objArr[0]);
                    return null;
                }
                this.mProtocolImp.ignoreView((View) objArr[0], ((Boolean) objArr[1]).booleanValue());
                return null;
            case "isAutoTrackEventTypeIgnored":
                Object obj4 = objArr[0];
                return obj4 instanceof Integer ? (T) Boolean.valueOf(this.mProtocolImp.isAutoTrackEventTypeIgnored(((Integer) obj4).intValue())) : (T) Boolean.valueOf(this.mProtocolImp.isAutoTrackEventTypeIgnored((SensorsDataAPI.AutoTrackEventType) obj4));
            case "enableAutoTrackFragment":
                this.mProtocolImp.enableAutoTrackFragment((Class) objArr[0]);
                return null;
            case "trackViewAppClick":
                if (objArr.length == 1) {
                    this.mProtocolImp.trackViewAppClick((View) objArr[0]);
                    return null;
                }
                this.mProtocolImp.trackViewAppClick((View) objArr[0], (JSONObject) objArr[1]);
                return null;
            case "getLastScreenUrl":
                return (T) this.mProtocolImp.getLastScreenUrl();
            case "isTrackFragmentAppViewScreenEnabled":
                return (T) Boolean.valueOf(this.mProtocolImp.isTrackFragmentAppViewScreenEnabled());
            case "getIgnoredViewTypeList":
                return (T) this.mProtocolImp.getIgnoredViewTypeList();
            case "resumeIgnoredAutoTrackFragment":
                this.mProtocolImp.resumeIgnoredAutoTrackFragment((Class) objArr[0]);
                return null;
            case "enableAutoTrackFragments":
                this.mProtocolImp.enableAutoTrackFragments((List) objArr[0]);
                return null;
            case "resumeIgnoredAutoTrackFragments":
                this.mProtocolImp.resumeIgnoredAutoTrackFragments((List) objArr[0]);
                return null;
            case "clearReferrerWhenAppEnd":
                this.mProtocolImp.clearReferrerWhenAppEnd();
                return null;
            case "clearLastScreenUrl":
                this.mProtocolImp.clearLastScreenUrl();
                return null;
            default:
                return null;
        }
    }

    public void registerListener() {
        this.mActivityLifecycleCallbacks = new ActivityLifecycleCallbacks(this.mSAContextManager);
        SensorsDataLifecycleMonitorManager.getInstance().addActivityLifeCallback(this.mActivityLifecycleCallbacks);
        SensorsDataExceptionHandler.addExceptionListener(this.mActivityLifecycleCallbacks);
        FragmentTrackHelper.addFragmentCallbacks(new FragmentViewScreenCallbacks());
        if (this.mInternalConfigs.saConfigOptions.isTrackPageLeave()) {
            ActivityPageLeaveCallbacks activityPageLeaveCallbacks = new ActivityPageLeaveCallbacks(this.mInternalConfigs.saConfigOptions.getIgnorePageLeave());
            SensorsDataLifecycleMonitorManager.getInstance().addActivityLifeCallback(activityPageLeaveCallbacks);
            SensorsDataExceptionHandler.addExceptionListener(activityPageLeaveCallbacks);
            if (this.mInternalConfigs.saConfigOptions.isTrackFragmentPageLeave()) {
                FragmentPageLeaveCallbacks fragmentPageLeaveCallbacks = new FragmentPageLeaveCallbacks(this.mInternalConfigs.saConfigOptions.getIgnorePageLeave());
                FragmentTrackHelper.addFragmentCallbacks(fragmentPageLeaveCallbacks);
                SensorsDataExceptionHandler.addExceptionListener(fragmentPageLeaveCallbacks);
            }
        }
    }
}
