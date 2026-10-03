package com.oplus.aiunit.vision;

import android.app.Notification;
import android.content.Context;
import android.content.Intent;
import androidx.compose.runtime.internal.StabilityInferred;
import com.heytap.health.sleep.measure.service.PhoneSleepService;
import com.heytap.sports.service.BgConnect;
import io.protostuff.MapSchema;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.Unit;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes18.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0012\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b(\u0010)J\u0006\u0010\u0003\u001a\u00020\u0002J\u0006\u0010\u0004\u001a\u00020\u0002J\u000e\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0005J\u0006\u0010\t\u001a\u00020\u0007J\u0006\u0010\n\u001a\u00020\u0007J[\u0010\u0016\u001a\u0004\u0018\u00010\u00072\b\u0010\f\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\r2\b\b\u0002\u0010\u0010\u001a\u00020\u00022\b\b\u0002\u0010\u0011\u001a\u00020\u00022\b\b\u0002\u0010\u0013\u001a\u00020\u00122\b\b\u0002\u0010\u0014\u001a\u00020\u00122\b\b\u0002\u0010\u0015\u001a\u00020\u0012¢\u0006\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0019\u001a\u00020\u00188\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0014\u0010\u001b\u001a\u00020\u00188\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u001b\u0010\u001aR\u0014\u0010\u001c\u001a\u00020\r8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0014\u0010\u001e\u001a\u00020\r8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u001e\u0010\u001dR\u0014\u0010\u001f\u001a\u00020\r8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u001f\u0010\u001dR\u0014\u0010 \u001a\u00020\r8\u0006X\u0086T¢\u0006\u0006\n\u0004\b \u0010\u001dR\u0014\u0010!\u001a\u00020\u00188\u0006X\u0086T¢\u0006\u0006\n\u0004\b!\u0010\u001aR\u0014\u0010\"\u001a\u00020\u00188\u0006X\u0086T¢\u0006\u0006\n\u0004\b\"\u0010\u001aR\u0014\u0010#\u001a\u00020\u00188\u0006X\u0086T¢\u0006\u0006\n\u0004\b#\u0010\u001aR\u0014\u0010$\u001a\u00020\u00188\u0006X\u0086T¢\u0006\u0006\n\u0004\b$\u0010\u001aR\u0014\u0010%\u001a\u00020\u00188\u0006X\u0086T¢\u0006\u0006\n\u0004\b%\u0010\u001aR\u0014\u0010&\u001a\u00020\u00188\u0006X\u0086T¢\u0006\u0006\n\u0004\b&\u0010\u001aR\u0014\u0010'\u001a\u00020\u00188\u0006X\u0086T¢\u0006\u0006\n\u0004\b'\u0010\u001a¨\u0006*"}, d2 = {"Lcom/oplus/aiunit/vision/yhe;", "", "", "c", "d", "Landroid/app/Notification;", BgConnect.KEY_NOTIFICATION, "", b2n.f, "b", "a", "Landroid/content/Context;", "context", "", f04.JSON_KEY_RKE_ACTION_TYPE, "result", "dataUnstable", "checking", "", "sleepStartTime", "sleepEndTime", "startMeasureTime", MapSchema.FIELD_NAME_ENTRY, "(Landroid/content/Context;IIZZJJJ)Lkotlin/Unit;", "", "BROADCAST_PHONE_SLEEP_MEASURE_END", "Ljava/lang/String;", "ACTION_TYPE", "ACTION_TYPE_USER_END", "I", "ACTION_TYPE_AUTO_END", "ACTION_TYPE_DETECTED_WAKEUP", "ACTION_TYPE_CHECK_REGISTER", yhe.MEASURE_DATA_UNSTABLE, yhe.MEASURE_CHECKING, yhe.MEASURE_RESULT, yhe.MEASURE_RESULT_MSG, yhe.SLEEP_START_TIME, yhe.SLEEP_END_TIME, yhe.START_MEASURE_TIME, "<init>", "()V", "sleep_release"}, k = 1, mv = {1, 8, 0})
public final class yhe {
    public static final int $stable = 0;

    @NotNull
    public static final String ACTION_TYPE = "MSG_TYPE";
    public static final int ACTION_TYPE_AUTO_END = 1;
    public static final int ACTION_TYPE_CHECK_REGISTER = 3;
    public static final int ACTION_TYPE_DETECTED_WAKEUP = 2;
    public static final int ACTION_TYPE_USER_END = 0;

    @NotNull
    public static final String BROADCAST_PHONE_SLEEP_MEASURE_END = "com.heytap.health.PhoneSleepMeasure";

    @NotNull
    public static final yhe INSTANCE = new yhe();

    @NotNull
    public static final String MEASURE_CHECKING = "MEASURE_CHECKING";

    @NotNull
    public static final String MEASURE_DATA_UNSTABLE = "MEASURE_DATA_UNSTABLE";

    @NotNull
    public static final String MEASURE_RESULT = "MEASURE_RESULT";

    @NotNull
    public static final String MEASURE_RESULT_MSG = "MEASURE_RESULT_MSG";

    @NotNull
    public static final String SLEEP_END_TIME = "SLEEP_END_TIME";

    @NotNull
    public static final String SLEEP_START_TIME = "SLEEP_START_TIME";

    @NotNull
    public static final String START_MEASURE_TIME = "START_MEASURE_TIME";

    public final void a() {
        a7b.f("PhoneSleepManager", "checkRegistered()");
        Context contextA = b78.a();
        Intent intent = new Intent(contextA, (Class<?>) PhoneSleepService.class);
        intent.putExtra(PhoneSleepService.COMMAND_KEY, -2);
        contextA.startService(intent);
    }

    public final void b() {
        a7b.f("PhoneSleepManager", "end()");
        Context contextA = b78.a();
        Intent intent = new Intent(contextA, (Class<?>) PhoneSleepService.class);
        intent.putExtra(PhoneSleepService.COMMAND_KEY, -1);
        contextA.startService(intent);
    }

    public final boolean c() {
        return zhe.INSTANCE.b();
    }

    public final boolean d() {
        return zhe.INSTANCE.c();
    }

    @Nullable
    public final Unit e(@Nullable Context context, int actionType, int result, boolean dataUnstable, boolean checking, long sleepStartTime, long sleepEndTime, long startMeasureTime) {
        if (context == null) {
            return null;
        }
        Intent intent = new Intent(BROADCAST_PHONE_SLEEP_MEASURE_END);
        intent.setPackage(context.getPackageName());
        intent.putExtra(ACTION_TYPE, actionType);
        intent.putExtra(MEASURE_DATA_UNSTABLE, dataUnstable);
        intent.putExtra(MEASURE_CHECKING, checking);
        intent.putExtra(MEASURE_RESULT, result);
        intent.putExtra(MEASURE_RESULT_MSG, "");
        intent.putExtra(SLEEP_START_TIME, sleepStartTime);
        intent.putExtra(SLEEP_END_TIME, sleepEndTime);
        intent.putExtra(START_MEASURE_TIME, startMeasureTime);
        context.sendBroadcast(intent);
        return Unit.INSTANCE;
    }

    public final void g(@NotNull Notification notification) {
        Intrinsics.checkNotNullParameter(notification, "notification");
        a7b.f("PhoneSleepManager", "start()");
        Context contextA = b78.a();
        Intent intent = new Intent(contextA, (Class<?>) PhoneSleepService.class);
        intent.putExtra(PhoneSleepService.COMMAND_KEY, 0);
        intent.putExtra(PhoneSleepService.COMMAND_KEY_NOTIFICATION, notification);
        contextA.startService(intent);
    }
}
