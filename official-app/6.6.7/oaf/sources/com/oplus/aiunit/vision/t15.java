package com.oplus.aiunit.vision;

import com.health.health_seedlingcard.R$string;
import java.time.LocalDateTime;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes14.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\r\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u001a\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004H\u0007J\u0010\u0010\b\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002H\u0007J\u0010\u0010\t\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002H\u0007J\b\u0010\u000b\u001a\u00020\nH\u0007J\b\u0010\f\u001a\u00020\u0006H\u0007J\b\u0010\r\u001a\u00020\u0006H\u0007J\b\u0010\u000e\u001a\u00020\u0006H\u0007J\b\u0010\u000f\u001a\u00020\u0006H\u0007J\b\u0010\u0010\u001a\u00020\u0004H\u0007J\u0010\u0010\u0012\u001a\u00020\u00062\u0006\u0010\u0011\u001a\u00020\u0002H\u0002R\u0014\u0010\u0013\u001a\u00020\n8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014¨\u0006\u0017"}, d2 = {"Lcom/oplus/aiunit/vision/t15;", "", "", "time", "", "isNullData", "", "b", "a", "d", "", "h", "i", "e", "g", "f", "k", "gap", "j", "millisecondsOnDay", "J", "<init>", "()V", "health_seedlingcard_release"}, k = 1, mv = {1, 8, 0})
public final class t15 {

    @NotNull
    public static final t15 INSTANCE = new t15();
    public static final long millisecondsOnDay = 86400000;

    @JvmStatic
    @NotNull
    public static final String a(int time) {
        int i = time / 60;
        if (i <= 0) {
            return "";
        }
        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
        String string = e88.a().getString(R$string.seedling_card_time_hour);
        Intrinsics.checkNotNullExpressionValue(string, "getAppContext()\n        ….seedling_card_time_hour)");
        String str = String.format(string, Arrays.copyOf(new Object[]{String.valueOf(i)}, 1));
        Intrinsics.checkNotNullExpressionValue(str, "format(...)");
        return str;
    }

    @JvmStatic
    @NotNull
    public static final String b(int time, boolean isNullData) {
        if (time <= 0 && isNullData) {
            StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
            String string = e88.a().getString(R$string.seedling_card_minute);
            Intrinsics.checkNotNullExpressionValue(string, "getAppContext()\n        …ing.seedling_card_minute)");
            String str = String.format(string, Arrays.copyOf(new Object[]{"-- "}, 1));
            Intrinsics.checkNotNullExpressionValue(str, "format(...)");
            return str;
        }
        if (time < 60) {
            StringCompanionObject stringCompanionObject2 = StringCompanionObject.INSTANCE;
            String string2 = e88.a().getString(R$string.seedling_card_minute);
            Intrinsics.checkNotNullExpressionValue(string2, "getAppContext()\n        …ing.seedling_card_minute)");
            String str2 = String.format(string2, Arrays.copyOf(new Object[]{String.valueOf(time)}, 1));
            Intrinsics.checkNotNullExpressionValue(str2, "format(...)");
            return str2;
        }
        int i = time / 60;
        int i2 = time % 60;
        if (i2 <= 0) {
            StringCompanionObject stringCompanionObject3 = StringCompanionObject.INSTANCE;
            String string3 = e88.a().getString(R$string.seedling_card_time_hour);
            Intrinsics.checkNotNullExpressionValue(string3, "getAppContext()\n        ….seedling_card_time_hour)");
            String str3 = String.format(string3, Arrays.copyOf(new Object[]{String.valueOf(i)}, 1));
            Intrinsics.checkNotNullExpressionValue(str3, "format(...)");
            return str3;
        }
        StringCompanionObject stringCompanionObject4 = StringCompanionObject.INSTANCE;
        String string4 = e88.a().getString(R$string.seedling_card_hour_minute);
        Intrinsics.checkNotNullExpressionValue(string4, "getAppContext()\n        …eedling_card_hour_minute)");
        String str4 = String.format(string4, Arrays.copyOf(new Object[]{String.valueOf(i), String.valueOf(i2)}, 2));
        Intrinsics.checkNotNullExpressionValue(str4, "format(...)");
        return str4;
    }

    public static /* synthetic */ String c(int i, boolean z, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            z = false;
        }
        return b(i, z);
    }

    @JvmStatic
    @NotNull
    public static final String d(int time) {
        int i = time % 60;
        if (i <= 0) {
            return "";
        }
        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
        String string = e88.a().getString(R$string.seedling_card_minute);
        Intrinsics.checkNotNullExpressionValue(string, "getAppContext()\n        …ing.seedling_card_minute)");
        String str = String.format(string, Arrays.copyOf(new Object[]{String.valueOf(i)}, 1));
        Intrinsics.checkNotNullExpressionValue(str, "format(...)");
        return str;
    }

    @JvmStatic
    @NotNull
    public static final String e() {
        return INSTANCE.j(6);
    }

    @JvmStatic
    @NotNull
    public static final String f() {
        return INSTANCE.j(13);
    }

    @JvmStatic
    @NotNull
    public static final String g() {
        return INSTANCE.j(7);
    }

    @JvmStatic
    public static final long h() {
        LocalDateTime localDateTimeNow = LocalDateTime.now();
        Intrinsics.checkNotNullExpressionValue(localDateTimeNow, "now()");
        int value = localDateTimeNow.getDayOfWeek().getValue();
        m8b.f("SettingAvtivity", "dayOfWeek " + value);
        return q15.n(System.currentTimeMillis()) - ((((long) (value - 1)) * millisecondsOnDay) + 1);
    }

    @JvmStatic
    @NotNull
    public static final String i() {
        return INSTANCE.j(0);
    }

    @JvmStatic
    public static final boolean k() {
        LocalDateTime localDateTimeNow = LocalDateTime.now();
        Intrinsics.checkNotNullExpressionValue(localDateTimeNow, "now()");
        int hour = localDateTimeNow.getHour();
        return 6 <= hour && hour < 13;
    }

    public final String j(int gap) {
        LocalDateTime localDateTimeNow = LocalDateTime.now();
        Intrinsics.checkNotNullExpressionValue(localDateTimeNow, "now()");
        return pr8.INSTANCE.y(q15.n(System.currentTimeMillis()) - (((long) (localDateTimeNow.getDayOfWeek().getValue() + gap)) * millisecondsOnDay), "MMM-dd");
    }
}
