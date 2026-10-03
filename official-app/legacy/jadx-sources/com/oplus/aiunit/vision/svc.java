package com.oplus.aiunit.vision;

import androidx.compose.runtime.internal.StabilityInferred;
import com.heytap.databaseengine.apiv3.data.Element;
import com.heytap.health.insight.data.datasource.net.InsightNetConstant;
import com.heytap.health.insight.device.InsightNotificationCategory;
import com.heytap.health.insight.device.NotifyCategoryId;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.collections.CollectionsKt__CollectionsKt;
import p010kotlin.jvm.internal.Intrinsics;
import p010kotlin.text.StringsKt__StringsKt;

/* JADX INFO: loaded from: classes16.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\t\u0010\nJ\u001e\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0005\u001a\u00020\u0004¨\u0006\u000b"}, d2 = {"Lcom/oplus/aiunit/vision/svc;", "", "", "notifyCode", "", "category", "", "Lcom/heytap/health/insight/device/InsightNotificationCategory;", "a", "<init>", "()V", "health_impl_release"}, k = 1, mv = {1, 8, 0})
public final class svc {
    public static final int $stable = 0;

    @NotNull
    public static final svc INSTANCE = new svc();

    @NotNull
    public final List<InsightNotificationCategory> a(@Nullable String notifyCode, int category) {
        if (notifyCode == null || notifyCode.length() == 0) {
            a7b.m("NotificationCodeCategoryMapper", "getNotificationCategories: notifyCode is null or empty");
            return CollectionsKt__CollectionsKt.emptyList();
        }
        String lowerCase = notifyCode.toLowerCase(Locale.ROOT);
        Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
        ArrayList arrayList = new ArrayList();
        if (category == NotifyCategoryId.SIGNS.getCategory()) {
            if (StringsKt__StringsKt.contains$default((CharSequence) lowerCase, (CharSequence) "wristtemp", false, 2, (Object) null) || StringsKt__StringsKt.contains$default((CharSequence) lowerCase, (CharSequence) "wrist_temp", false, 2, (Object) null) || StringsKt__StringsKt.contains$default((CharSequence) lowerCase, (CharSequence) "fever", false, 2, (Object) null)) {
                arrayList.add(InsightNotificationCategory.WRIST_TEMPERATURE);
            } else if (StringsKt__StringsKt.contains$default((CharSequence) lowerCase, (CharSequence) "sleephr", false, 2, (Object) null) || StringsKt__StringsKt.contains$default((CharSequence) lowerCase, (CharSequence) "sleep_hr", false, 2, (Object) null) || Intrinsics.areEqual(lowerCase, InsightNetConstant.SIGNS_SLEEP_HR.getKey()) || Intrinsics.areEqual(lowerCase, InsightNetConstant.SIGNS_SLEEP_HR_BASE.getKey()) || Intrinsics.areEqual(lowerCase, InsightNetConstant.SIGNS_SLEEP_HR_SAFE_UP.getKey())) {
                arrayList.add(InsightNotificationCategory.SLEEP_VITAL_SIGNS);
            }
        } else if (category == NotifyCategoryId.SINGLE_DIMEN.getCategory()) {
            if (StringsKt__StringsKt.contains$default((CharSequence) lowerCase, (CharSequence) "step", false, 2, (Object) null)) {
                arrayList.add(InsightNotificationCategory.STEP_TREND);
            } else if (StringsKt__StringsKt.contains$default((CharSequence) lowerCase, (CharSequence) "calorie", false, 2, (Object) null)) {
                arrayList.add(InsightNotificationCategory.CONSUMPTION_TREND);
            } else if (StringsKt__StringsKt.contains$default((CharSequence) lowerCase, (CharSequence) "hrv", false, 2, (Object) null)) {
                arrayList.add(InsightNotificationCategory.PHYSICAL_MENTAL_STATE);
            } else if (StringsKt__StringsKt.contains$default((CharSequence) lowerCase, (CharSequence) Element.ELEMENT_NAME_SLEEP, false, 2, (Object) null) && !StringsKt__StringsKt.contains$default((CharSequence) lowerCase, (CharSequence) "sleephr", false, 2, (Object) null) && !StringsKt__StringsKt.contains$default((CharSequence) lowerCase, (CharSequence) "sleep_hr", false, 2, (Object) null)) {
                arrayList.add(InsightNotificationCategory.SLEEP_TREND);
            } else if ((StringsKt__StringsKt.contains$default((CharSequence) lowerCase, (CharSequence) "hr", false, 2, (Object) null) || StringsKt__StringsKt.contains$default((CharSequence) lowerCase, (CharSequence) "heart", false, 2, (Object) null)) && !StringsKt__StringsKt.contains$default((CharSequence) lowerCase, (CharSequence) "hrv", false, 2, (Object) null)) {
                arrayList.add(InsightNotificationCategory.HEART_RATE_TREND);
            }
        } else if (category == NotifyCategoryId.CROSS_ANALYSIS.getCategory()) {
            if (StringsKt__StringsKt.contains$default((CharSequence) lowerCase, (CharSequence) "sleephr", false, 2, (Object) null) || StringsKt__StringsKt.contains$default((CharSequence) lowerCase, (CharSequence) "sleep_hr", false, 2, (Object) null) || Intrinsics.areEqual(lowerCase, InsightNetConstant.CROSS_CODE_SLEEP_HR_UP.getKey()) || Intrinsics.areEqual(lowerCase, InsightNetConstant.CROSS_CODE_SLEEP_HR_UPS.getKey())) {
                arrayList.add(InsightNotificationCategory.SLEEP_VITAL_SIGNS);
                arrayList.add(InsightNotificationCategory.SLEEP_TREND);
            } else if (StringsKt__StringsKt.contains$default((CharSequence) lowerCase, (CharSequence) Element.ELEMENT_NAME_SLEEP, false, 2, (Object) null) && !StringsKt__StringsKt.contains$default((CharSequence) lowerCase, (CharSequence) "sleephr", false, 2, (Object) null) && !StringsKt__StringsKt.contains$default((CharSequence) lowerCase, (CharSequence) "sleep_hr", false, 2, (Object) null)) {
                arrayList.add(InsightNotificationCategory.SLEEP_TREND);
            } else if (StringsKt__StringsKt.contains$default((CharSequence) lowerCase, (CharSequence) "step", false, 2, (Object) null)) {
                arrayList.add(InsightNotificationCategory.STEP_TREND);
                if (StringsKt__StringsKt.contains$default((CharSequence) lowerCase, (CharSequence) Element.ELEMENT_NAME_SLEEP, false, 2, (Object) null)) {
                    arrayList.add(InsightNotificationCategory.SLEEP_TREND);
                }
            } else if (StringsKt__StringsKt.contains$default((CharSequence) lowerCase, (CharSequence) "calorie", false, 2, (Object) null) || StringsKt__StringsKt.contains$default((CharSequence) lowerCase, (CharSequence) "consumption", false, 2, (Object) null)) {
                arrayList.add(InsightNotificationCategory.CONSUMPTION_TREND);
            }
        }
        StringBuilder sb = new StringBuilder();
        sb.append("getNotificationCategories: code=");
        sb.append(notifyCode);
        sb.append(", category=");
        sb.append(category);
        sb.append(", result=");
        sb.append(arrayList);
        return arrayList;
    }
}
