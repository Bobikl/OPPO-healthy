package com.platform.sdk.center.statistic;

import android.content.Context;
import androidx.autofill.HintConstants;
import com.heytap.store.business.rn.service.RnConstant;
import com.oplus.aiunit.vision.h27;
import com.platform.sdk.center.deprecated.AcDispatcherManager;
import com.platform.usercenter.basic.annotation.Keep;
import java.util.HashMap;

/* JADX INFO: loaded from: classes9.dex */
@Keep
public class AcStatisticMethod {
    private static final String AD_ID = "ad_id";
    private static final String CLICK = "click";
    private static final String EVENT_RESULT = "event_result";
    private static final String GUIDE_TEXT = "guide_text";
    private static final String LOGIN_STATUES = "login_statues";
    private static final String LOGIN_STATUS = "login_status";
    private static final String LOG_TAG = "log_tag";
    private static final String NATIVE_PAGE = "native_page";
    private static final String PAGE_MODE = "page_mode";
    private static final String REQPKG = "reqpkg";
    private static final String SDK_PAGE = "sdk_page";
    private static final String TRACKID = "trackId";
    private static final String TYPE = "type";
    private static final String VIEW = "view";

    public static void avatarShow(Context context, String str) {
        HashMap map = new HashMap();
        map.put(LOG_TAG, SDK_PAGE);
        map.put("type", VIEW);
        map.put("ad_id", str);
        map.put(REQPKG, context.getPackageName());
        map.put("uc_center_sdk_version", String.valueOf(303000));
        AcDispatcherManager.getInstance().onStatistics("3012", SDK_PAGE, "ad_upper", map);
    }

    public static void bottomAdvertClick(Context context, String str, String str2, String str3) {
        HashMap map = new HashMap();
        map.put(LOG_TAG, SDK_PAGE);
        map.put("type", CLICK);
        map.put("ad_id", str);
        map.put(LOGIN_STATUS, str2);
        map.put(TRACKID, str3);
        map.put(REQPKG, context.getPackageName());
        map.put("uc_center_sdk_version", String.valueOf(303000));
        AcDispatcherManager.getInstance().onStatistics("3012", SDK_PAGE, "ad_lower", map);
    }

    public static void bottomAdvertShow(Context context, String str, String str2, String str3) {
        HashMap map = new HashMap();
        map.put(LOG_TAG, SDK_PAGE);
        map.put("type", VIEW);
        map.put("ad_id", str);
        map.put(LOGIN_STATUS, str2);
        map.put(TRACKID, str3);
        map.put(REQPKG, context.getPackageName());
        map.put("uc_center_sdk_version", String.valueOf(303000));
        AcDispatcherManager.getInstance().onStatistics("3012", SDK_PAGE, "ad_lower", map);
    }

    public static void bubbleViewShow(Context context, String str, boolean z) {
        HashMap map = new HashMap();
        map.put(LOG_TAG, SDK_PAGE);
        map.put("type", VIEW);
        map.put(EVENT_RESULT, "empty");
        map.put(PAGE_MODE, NATIVE_PAGE);
        map.put(GUIDE_TEXT, str);
        map.put(LOGIN_STATUES, z ? "1" : "0");
        map.put(REQPKG, context.getPackageName());
        map.put("uc_center_sdk_version", String.valueOf(303000));
        AcDispatcherManager.getInstance().onStatistics("3012", SDK_PAGE, "guide_air", map);
    }

    public static void clickAvatar(Context context) {
        HashMap map = new HashMap();
        map.put("type", CLICK);
        map.put(LOG_TAG, SDK_PAGE);
        map.put(REQPKG, context.getPackageName());
        map.put("uc_center_sdk_version", String.valueOf(303000));
        AcDispatcherManager.getInstance().onStatistics("3012", SDK_PAGE, h27.FAMILY_KEY_PUSH_FRIEND_AVATAR, map);
    }

    public static void clickLogin(Context context) {
        HashMap map = new HashMap();
        map.put(LOG_TAG, SDK_PAGE);
        map.put("type", CLICK);
        map.put(REQPKG, context.getPackageName());
        map.put("uc_center_sdk_version", String.valueOf(303000));
        AcDispatcherManager.getInstance().onStatistics("3012", SDK_PAGE, "log_btn", map);
    }

    public static void clickNamePlate(Context context, String str) {
        HashMap map = new HashMap();
        map.put(LOG_TAG, SDK_PAGE);
        map.put(REQPKG, context.getPackageName());
        map.put("nameplate_id", str);
        map.put("type", CLICK);
        map.put(REQPKG, context.getPackageName());
        map.put("uc_center_sdk_version", String.valueOf(303000));
        AcDispatcherManager.getInstance().onStatistics("3012", SDK_PAGE, "sdk_nameplate_btn", map);
    }

    public static void clickOperationInfoView(Context context, String str, String str2, String str3) {
        HashMap map = new HashMap();
        map.put(LOG_TAG, SDK_PAGE);
        map.put("type", CLICK);
        map.put(REQPKG, context.getPackageName());
        map.put("heytap_type", str);
        map.put("is_warn", str2);
        map.put("click_btn", str3);
        map.put(REQPKG, context.getPackageName());
        map.put("uc_center_sdk_version", String.valueOf(303000));
        AcDispatcherManager.getInstance().onStatistics("3012", SDK_PAGE, "ad_lower", map);
    }

    public static void clickSignBtn(Context context) {
        HashMap map = new HashMap();
        map.put(LOG_TAG, SDK_PAGE);
        map.put("type", CLICK);
        map.put(REQPKG, context.getPackageName());
        map.put("uc_center_sdk_version", String.valueOf(303000));
        AcDispatcherManager.getInstance().onStatistics("3012", SDK_PAGE, "sign_btn", map);
    }

    public static void clickUserName(Context context) {
        HashMap map = new HashMap();
        map.put(LOG_TAG, SDK_PAGE);
        map.put("type", CLICK);
        map.put(REQPKG, context.getPackageName());
        map.put("uc_center_sdk_version", String.valueOf(303000));
        AcDispatcherManager.getInstance().onStatistics("3012", SDK_PAGE, HintConstants.AUTOFILL_HINT_USERNAME, map);
    }

    public static void identityClick(Context context, String str, String str2) {
        HashMap map = new HashMap();
        map.put(LOG_TAG, SDK_PAGE);
        map.put("type", CLICK);
        map.put(EVENT_RESULT, RnConstant.KEY_PAGE);
        map.put(PAGE_MODE, NATIVE_PAGE);
        map.put(GUIDE_TEXT, str);
        map.put("btn_id", str2);
        map.put(REQPKG, context.getPackageName());
        map.put("uc_center_sdk_version", String.valueOf(303000));
        AcDispatcherManager.getInstance().onStatistics("3012", SDK_PAGE, "funtion_guide_btn", map);
    }

    public static void identityViewShow(Context context, String str) {
        HashMap map = new HashMap();
        map.put(LOG_TAG, SDK_PAGE);
        map.put("type", VIEW);
        map.put(EVENT_RESULT, "empty");
        map.put(PAGE_MODE, NATIVE_PAGE);
        map.put(GUIDE_TEXT, str);
        map.put(REQPKG, context.getPackageName());
        map.put("uc_center_sdk_version", String.valueOf(303000));
        AcDispatcherManager.getInstance().onStatistics("3012", SDK_PAGE, "funtion_guide", map);
    }

    public static void pageShow(Context context, String str) {
        HashMap map = new HashMap();
        map.put(LOG_TAG, SDK_PAGE);
        map.put("type", VIEW);
        map.put(LOGIN_STATUS, str);
        map.put(REQPKG, context.getPackageName());
        map.put("uc_center_sdk_version", String.valueOf(303000));
        AcDispatcherManager.getInstance().onStatistics("3012", SDK_PAGE, RnConstant.KEY_PAGE, map);
    }

    public static void showNamePlate(Context context) {
        HashMap map = new HashMap();
        map.put(LOG_TAG, SDK_PAGE);
        map.put("type", VIEW);
        map.put(REQPKG, context.getPackageName());
        map.put(REQPKG, context.getPackageName());
        map.put("uc_center_sdk_version", String.valueOf(303000));
        AcDispatcherManager.getInstance().onStatistics("3012", SDK_PAGE, "sdk_nameplate_page", map);
    }

    public static void showOperationInfoView(Context context, String str, String str2) {
        HashMap map = new HashMap();
        map.put(LOG_TAG, SDK_PAGE);
        map.put("type", VIEW);
        map.put(REQPKG, context.getPackageName());
        map.put("heytap_type", str);
        map.put("is_warn", str2);
        map.put(REQPKG, context.getPackageName());
        map.put("uc_center_sdk_version", String.valueOf(303000));
        AcDispatcherManager.getInstance().onStatistics("3012", SDK_PAGE, "ad_lower", map);
    }
}
