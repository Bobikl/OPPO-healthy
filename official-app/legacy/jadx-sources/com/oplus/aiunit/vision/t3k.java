package com.oplus.aiunit.vision;

import android.text.TextUtils;

/* JADX INFO: loaded from: classes15.dex */
public class t3k {
    public static final String[] a = {"queryTrainingPlanList", "queryCourseList", "getRecommendedCourses", "queryPlanList", "queryPlanDetail", "queryCourseDetail", "queryOperationList", "queryTrainingPlanDetail", "getEmotionalList", "queryH5OperationList", "queryPrivacyVersionV2", "queryDeviceList", "queryH5OperationList", "user-agreement.html", "privacy-statement.html", zv8.a.BASE_URL + zv8.a.TOKEN_VERIFY, "login", "storeLogin", "queryAccountInfo", "querySwitchStatus", "queryCardConfigList", "getUserProjectCard", "recommendPostForFree", "board", "exchangeSymmetricKey", "highQualityPosts"};
    public static final String[] b = {"login", "queryAccountInfo", "queryKey", "storeLogin", "exchangeSymmetricKey"};

    public static boolean a(String str) {
        String strTrim = str.trim();
        if (TextUtils.isEmpty(strTrim)) {
            return false;
        }
        if (strTrim.startsWith("https://api.gotokeep")) {
            return true;
        }
        String[] strArr = a;
        if (strArr != null && strArr.length > 0) {
            String[] strArrSplit = strTrim.split("/");
            if (strArrSplit.length < 1) {
                return false;
            }
            String str2 = strArrSplit[strArrSplit.length - 1];
            for (String str3 : strArr) {
                if (str2.equals(str3)) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("这个链接在白名单里面：");
                    sb.append(str3);
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean b(String str) {
        String strTrim = str.trim();
        if (TextUtils.isEmpty(strTrim)) {
            return false;
        }
        String[] strArrSplit = strTrim.split("/");
        if (strArrSplit.length < 1) {
            return false;
        }
        String str2 = strArrSplit[strArrSplit.length - 1];
        for (String str3 : b) {
            if (str3.equals(str2)) {
                a7b.f("TouristWhiteLink", "this link isLoginRequest");
                return true;
            }
        }
        return false;
    }
}
