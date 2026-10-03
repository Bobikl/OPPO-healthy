package com.oplus.aiunit.vision;

import androidx.compose.runtime.internal.StabilityInferred;
import com.heytap.health.insight.device.InsightNotificationCategory;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.NoWhenBranchMatchedException;
import p010kotlin.jvm.internal.Intrinsics;
import p010kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: classes16.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0018\u0010\u0007\u001a\u00020\u00062\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0005\u001a\u00020\u0004J\u000e\u0010\t\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\b¨\u0006\f"}, d2 = {"Lcom/oplus/aiunit/vision/raa;", "", "", "notifyCode", "", "category", "", "b", "Lcom/heytap/health/insight/device/InsightNotificationCategory;", "a", "<init>", "()V", "health_impl_release"}, k = 1, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nInsightNotificationSwitchManager.kt\nKotlin\n*S Kotlin\n*F\n+ 1 InsightNotificationSwitchManager.kt\ncom/heytap/health/insight/device/InsightNotificationSwitchManager\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,90:1\n1747#2,3:91\n*S KotlinDebug\n*F\n+ 1 InsightNotificationSwitchManager.kt\ncom/heytap/health/insight/device/InsightNotificationSwitchManager\n*L\n38#1:91,3\n*E\n"})
public final class raa {
    public static final int $stable = 0;

    @NotNull
    public static final raa INSTANCE = new raa();

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[InsightNotificationCategory.values().length];
            try {
                iArr[InsightNotificationCategory.WRIST_TEMPERATURE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[InsightNotificationCategory.SLEEP_VITAL_SIGNS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[InsightNotificationCategory.SLEEP_TREND.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[InsightNotificationCategory.HEART_RATE_TREND.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[InsightNotificationCategory.PHYSICAL_MENTAL_STATE.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[InsightNotificationCategory.STEP_TREND.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[InsightNotificationCategory.CONSUMPTION_TREND.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public final boolean a(@NotNull InsightNotificationCategory category) {
        Intrinsics.checkNotNullParameter(category, "category");
        switch (a.$EnumSwitchMapping$0[category.ordinal()]) {
            case 1:
                return waa.W();
            case 2:
                return waa.Q();
            case 3:
                return waa.N();
            case 4:
                return waa.H();
            case 5:
                return waa.K();
            case 6:
                return waa.T();
            case 7:
                return waa.E();
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    public final boolean b(@Nullable String notifyCode, int category) {
        boolean z = false;
        if (notifyCode == null || notifyCode.length() == 0) {
            a7b.m("InsightNotificationSwitchManager", "isNotificationEnabled: notifyCode is null or empty, default allow");
            return true;
        }
        List<InsightNotificationCategory> listA = svc.INSTANCE.a(notifyCode, category);
        if (listA.isEmpty()) {
            StringBuilder sb = new StringBuilder();
            sb.append("isNotificationEnabled: cannot determine category for code=");
            sb.append(notifyCode);
            sb.append(", default allow");
            return true;
        }
        List<InsightNotificationCategory> list = listA;
        if (!(list instanceof Collection) || !list.isEmpty()) {
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                if (INSTANCE.a((InsightNotificationCategory) it.next())) {
                    z = true;
                    break;
                }
            }
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("isNotificationEnabled: code=");
        sb2.append(notifyCode);
        sb2.append(", categories=");
        sb2.append(listA);
        sb2.append(", enabled=");
        sb2.append(z);
        return z;
    }
}
