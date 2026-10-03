package com.oplus.aiunit.vision;

import android.content.Context;
import com.heytap.databaseengine.model.physicalMental.PhysicalMentalAchievement;
import com.heytap.health.hrv.R$string;
import com.heytap.log.formatter.LogFieldKey;
import io.protostuff.MapSchema;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;
import p010kotlin.collections.CollectionsKt___CollectionsKt;
import p010kotlin.collections.SetsKt__SetsKt;
import p010kotlin.jvm.internal.Intrinsics;
import p010kotlin.jvm.internal.SourceDebugExtension;
import p010kotlin.ranges.RangesKt___RangesKt;
import p010kotlin.text.StringsKt__StringNumberConversionsKt;
import p010kotlin.text.StringsKt__StringsJVMKt;
import p010kotlin.text.StringsKt__StringsKt;

/* JADX INFO: loaded from: classes16.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\u0010\b\n\u0002\b\u0010\u001a\u0014\u0010\u0002\u001a\u00020\u0000*\u00020\u00002\b\b\u0002\u0010\u0001\u001a\u00020\u0000\u001a\n\u0010\u0003\u001a\u00020\u0000*\u00020\u0000\u001a\n\u0010\u0005\u001a\u00020\u0004*\u00020\u0000\u001a\n\u0010\u0007\u001a\u00020\u0004*\u00020\u0006\u001a\u0012\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b*\u00020\u0006H\u0002\u001a\n\u0010\u000b\u001a\u00020\u0004*\u00020\u0006\u001a\n\u0010\f\u001a\u00020\t*\u00020\u0006\u001a\n\u0010\r\u001a\u00020\u0004*\u00020\u0006\u001a\u0012\u0010\u000f\u001a\u00020\u0004*\u00020\u00062\u0006\u0010\u000e\u001a\u00020\t\u001a\n\u0010\u0010\u001a\u00020\u0000*\u00020\u0006\u001a\n\u0010\u0011\u001a\u00020\u0004*\u00020\u0006\u001a\n\u0010\u0012\u001a\u00020\u0004*\u00020\u0006\u001a\n\u0010\u0013\u001a\u00020\u0004*\u00020\u0006\u001a\n\u0010\u0014\u001a\u00020\u0004*\u00020\u0006\u001a\n\u0010\u0015\u001a\u00020\u0004*\u00020\u0006\u001a\n\u0010\u0016\u001a\u00020\u0004*\u00020\u0006\"\u0014\u0010\u0017\u001a\u00020\t8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018¨\u0006\u0019"}, d2 = {"", "append", "j", LogFieldKey.LEVEL_KEY, "", "i", "Lcom/heytap/databaseengine/model/physicalMental/PhysicalMentalAchievement;", MapSchema.FIELD_NAME_ENTRY, "", "", LogFieldKey.MESSAGE_KEY, b2n.f, "n", "f", "config", "a", LogFieldKey.PROCESS_NAME_KEY, b2n.g, "b", "c", "q", "o", "d", "INVALID_DATA", "I", "hrv_release"}, k = 2, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nDataUtil.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DataUtil.kt\ncom/heytap/health/hrv/util/DataUtilKt\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,253:1\n1603#2,9:254\n1855#2:263\n1856#2:265\n1612#2:266\n1#3:264\n*S KotlinDebug\n*F\n+ 1 DataUtil.kt\ncom/heytap/health/hrv/util/DataUtilKt\n*L\n119#1:254,9\n119#1:263\n119#1:265\n119#1:266\n119#1:264\n*E\n"})
public final class sz4 {
    public static final int INVALID_DATA = 0;

    public static final boolean a(@NotNull PhysicalMentalAchievement physicalMentalAchievement, int i) {
        Intrinsics.checkNotNullParameter(physicalMentalAchievement, "<this>");
        return m(physicalMentalAchievement).contains(Integer.valueOf(i));
    }

    public static final boolean b(@NotNull PhysicalMentalAchievement physicalMentalAchievement) {
        Intrinsics.checkNotNullParameter(physicalMentalAchievement, "<this>");
        return physicalMentalAchievement.getPhysicalMentalAvg() >= 50;
    }

    public static final boolean c(@NotNull PhysicalMentalAchievement physicalMentalAchievement) {
        Intrinsics.checkNotNullParameter(physicalMentalAchievement, "<this>");
        if (f(physicalMentalAchievement) && a(physicalMentalAchievement, 2)) {
            if (e(physicalMentalAchievement) || physicalMentalAchievement.getRegularBedTime() <= 0) {
                return false;
            }
            if (physicalMentalAchievement.getRegularBedTime() <= physicalMentalAchievement.getRegularBedTimeGoal()) {
                return true;
            }
        } else if (physicalMentalAchievement.getSleepDuration() >= 420) {
            return true;
        }
        return false;
    }

    public static final boolean d(@NotNull PhysicalMentalAchievement physicalMentalAchievement) {
        Intrinsics.checkNotNullParameter(physicalMentalAchievement, "<this>");
        if (f(physicalMentalAchievement) && a(physicalMentalAchievement, 9)) {
            if (physicalMentalAchievement.getSunshineGoal() != 0 && physicalMentalAchievement.getSunshine() >= physicalMentalAchievement.getSunshineGoal()) {
                return true;
            }
        } else if (physicalMentalAchievement.getRelaxDurationGoal() != 0 && physicalMentalAchievement.getRelaxDuration() >= RangesKt___RangesKt.coerceAtLeast(physicalMentalAchievement.getRelaxDurationGoal(), 2)) {
            return true;
        }
        return false;
    }

    public static final boolean e(@NotNull PhysicalMentalAchievement physicalMentalAchievement) {
        Intrinsics.checkNotNullParameter(physicalMentalAchievement, "<this>");
        Set<Integer> setM = m(physicalMentalAchievement);
        if (setM.isEmpty()) {
            return physicalMentalAchievement.getLevel() == 0 && physicalMentalAchievement.getPhysicalMentalAvg() == 0 && physicalMentalAchievement.getStep() == 0 && physicalMentalAchievement.getActivityCount() == 0 && physicalMentalAchievement.getSleepDuration() == 0 && physicalMentalAchievement.getRelaxDuration() == 0 && physicalMentalAchievement.getSunshine() == 0 && physicalMentalAchievement.getRegularBedTime() == 0 && physicalMentalAchievement.getExercise() == 0 && physicalMentalAchievement.getCalorie() == 0 && !g(physicalMentalAchievement);
        }
        boolean z = setM.contains(1) && physicalMentalAchievement.getPhysicalMentalAvg() > 0;
        if (setM.contains(2)) {
            z = z || physicalMentalAchievement.getRegularBedTime() > 0;
        }
        if (setM.contains(3)) {
            z = z || physicalMentalAchievement.getSleepDuration() > 0;
        }
        if (setM.contains(4)) {
            z = z || physicalMentalAchievement.getStep() > 0;
        }
        if (setM.contains(5)) {
            z = z || physicalMentalAchievement.getExercise() > 0;
        }
        if (setM.contains(6)) {
            z = z || physicalMentalAchievement.getCalorie() > 0;
        }
        if (setM.contains(7)) {
            z = z || physicalMentalAchievement.getActivityCount() > 0;
        }
        if (setM.contains(8)) {
            z = z || physicalMentalAchievement.getRelaxDuration() > 0;
        }
        if (setM.contains(9)) {
            z = z || physicalMentalAchievement.getSunshine() > 0;
        }
        return (z || g(physicalMentalAchievement)) ? false : true;
    }

    public static final boolean f(@NotNull PhysicalMentalAchievement physicalMentalAchievement) {
        Intrinsics.checkNotNullParameter(physicalMentalAchievement, "<this>");
        return physicalMentalAchievement.getStatsVersion() > 0;
    }

    public static final boolean g(@NotNull PhysicalMentalAchievement physicalMentalAchievement) {
        Intrinsics.checkNotNullParameter(physicalMentalAchievement, "<this>");
        return physicalMentalAchievement.getShouldSkipToday() == 1;
    }

    public static final boolean h(@NotNull PhysicalMentalAchievement physicalMentalAchievement) {
        Intrinsics.checkNotNullParameter(physicalMentalAchievement, "<this>");
        return physicalMentalAchievement.getDate() == mq8.INSTANCE.e(System.currentTimeMillis());
    }

    public static final boolean i(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        return (Intrinsics.areEqual(str, "0") || Intrinsics.areEqual(str, "null")) ? false : true;
    }

    @NotNull
    public static final String j(@NotNull String str, @NotNull String append) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(append, "append");
        int iHashCode = str.hashCode();
        if (iHashCode == -359771092 ? str.equals("2147483647") : iHashCode == 48 ? str.equals("0") : iHashCode == 3392903 ? str.equals("null") : iHashCode == 381796378 && str.equals("-2147483648")) {
            return "--";
        }
        return str + append;
    }

    public static /* synthetic */ String k(String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str2 = "";
        }
        return j(str, str2);
    }

    @NotNull
    public static final String l(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        Context contextA = b78.a();
        if (!Intrinsics.areEqual(str, "0") && !Intrinsics.areEqual(str, "null")) {
            return str;
        }
        String string = contextA.getString(R$string.health_hrv_status_no_data);
        Intrinsics.checkNotNullExpressionValue(string, "{\n        context.getStr…hrv_status_no_data)\n    }");
        return string;
    }

    public static final Set<Integer> m(PhysicalMentalAchievement physicalMentalAchievement) {
        if (StringsKt__StringsJVMKt.isBlank(physicalMentalAchievement.getTargetItemDisplay())) {
            return SetsKt__SetsKt.emptySet();
        }
        List listSplit$default = StringsKt__StringsKt.split$default((CharSequence) StringsKt__StringsKt.removeSuffix(StringsKt__StringsKt.removePrefix(StringsKt__StringsKt.trim((CharSequence) physicalMentalAchievement.getTargetItemDisplay()).toString(), (CharSequence) "["), (CharSequence) "]"), new String[]{","}, false, 0, 6, (Object) null);
        ArrayList arrayList = new ArrayList();
        Iterator it = listSplit$default.iterator();
        while (it.hasNext()) {
            Integer intOrNull = StringsKt__StringNumberConversionsKt.toIntOrNull(StringsKt__StringsKt.trim((CharSequence) it.next()).toString());
            if (intOrNull != null) {
                arrayList.add(intOrNull);
            }
        }
        return CollectionsKt___CollectionsKt.toSet(arrayList);
    }

    public static final int n(@NotNull PhysicalMentalAchievement physicalMentalAchievement) {
        Intrinsics.checkNotNullParameter(physicalMentalAchievement, "<this>");
        if (g(physicalMentalAchievement)) {
            return 100;
        }
        return physicalMentalAchievement.getProgress();
    }

    public static final boolean o(@NotNull PhysicalMentalAchievement physicalMentalAchievement) {
        Intrinsics.checkNotNullParameter(physicalMentalAchievement, "<this>");
        return physicalMentalAchievement.getActivityCountGoal() != 0 && physicalMentalAchievement.getActivityCount() >= physicalMentalAchievement.getActivityCountGoal();
    }

    @NotNull
    public static final String p(@NotNull PhysicalMentalAchievement physicalMentalAchievement) {
        Intrinsics.checkNotNullParameter(physicalMentalAchievement, "<this>");
        Context contextA = b78.a();
        switch (physicalMentalAchievement.getTodaySkipReason()) {
            case 1:
                String string = contextA.getString(R$string.health_hrv_skip_today_item1);
                Intrinsics.checkNotNullExpressionValue(string, "{\n            context.ge…ip_today_item1)\n        }");
                return string;
            case 2:
                String string2 = contextA.getString(R$string.health_hrv_skip_today_item2);
                Intrinsics.checkNotNullExpressionValue(string2, "{\n            context.ge…ip_today_item2)\n        }");
                return string2;
            case 3:
                String string3 = contextA.getString(R$string.health_hrv_skip_today_item3);
                Intrinsics.checkNotNullExpressionValue(string3, "{\n            context.ge…ip_today_item3)\n        }");
                return string3;
            case 4:
                String string4 = contextA.getString(R$string.health_hrv_skip_today_item4);
                Intrinsics.checkNotNullExpressionValue(string4, "{\n            context.ge…ip_today_item4)\n        }");
                return string4;
            case 5:
                String string5 = contextA.getString(R$string.health_hrv_skip_today_item5);
                Intrinsics.checkNotNullExpressionValue(string5, "{\n            context.ge…ip_today_item5)\n        }");
                return string5;
            case 6:
                String string6 = contextA.getString(R$string.health_hrv_skip_today_item6);
                Intrinsics.checkNotNullExpressionValue(string6, "{\n            context.ge…ip_today_item6)\n        }");
                return string6;
            default:
                return "";
        }
    }

    public static final boolean q(@NotNull PhysicalMentalAchievement physicalMentalAchievement) {
        Intrinsics.checkNotNullParameter(physicalMentalAchievement, "<this>");
        if (f(physicalMentalAchievement)) {
            if (a(physicalMentalAchievement, 5)) {
                if (physicalMentalAchievement.getExerciseGoal() != 0 && physicalMentalAchievement.getExercise() >= physicalMentalAchievement.getExerciseGoal()) {
                    return true;
                }
            } else if (a(physicalMentalAchievement, 6)) {
                if (physicalMentalAchievement.getCalorieGoal() != 0 && physicalMentalAchievement.getCalorie() >= physicalMentalAchievement.getCalorieGoal()) {
                    return true;
                }
            } else if (physicalMentalAchievement.getStepGoal() != 0 && physicalMentalAchievement.getStep() >= physicalMentalAchievement.getStepGoal()) {
                return true;
            }
        } else if (physicalMentalAchievement.getStepGoal() != 0 && physicalMentalAchievement.getStep() >= physicalMentalAchievement.getStepGoal()) {
            return true;
        }
        return false;
    }
}
