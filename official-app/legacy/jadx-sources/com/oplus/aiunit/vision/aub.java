package com.oplus.aiunit.vision;

import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.core.app.NotificationCompat;
import androidx.core.app.NotificationManagerCompat;
import androidx.core.content.ContextCompat;
import androidx.core.os.BuildCompat;
import androidx.core.os.BundleCompat;
import com.heytap.health.base.R$mipmap;
import com.heytap.health.menstrual_period.R$plurals;
import com.heytap.health.menstrual_period.R$string;
import com.heytap.health.menstrual_period.data.SymptomType;
import com.heytap.health.menstrual_period.notify.SymptomAlarmService;
import com.heytap.health.menstrual_period.ui.MenstrualDetailActivity;
import com.heytap.health.menstrual_period.ui.MenstrualSymptomStatActivity;
import io.protostuff.MapSchema;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;
import p010kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: classes17.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u0000 \u001b2\u00020\u0001:\u0001\u0017B\u0007¢\u0006\u0004\b\u0019\u0010\u001aJ\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004J\u000e\u0010\t\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0002J\b\u0010\n\u001a\u00020\u0006H\u0002J\u0012\u0010\u000b\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0002J\b\u0010\f\u001a\u00020\u0006H\u0002J\b\u0010\r\u001a\u00020\u0006H\u0002J\b\u0010\u000e\u001a\u00020\u0006H\u0002J,\u0010\u0014\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u00102\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0013H\u0002J\u0010\u0010\u0017\u001a\u00020\u00062\u0006\u0010\u0016\u001a\u00020\u0015H\u0002R\u0014\u0010\u0016\u001a\u00020\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018¨\u0006\u001c"}, d2 = {"Lcom/oplus/aiunit/vision/aub;", "", "", "notifyType", "Landroid/os/Bundle;", "bundle", "", "b", "predictDays", b2n.f, "f", b2n.g, MapSchema.FIELD_NAME_ENTRY, "d", "c", "notifyId", "", "title", "content", "Landroid/content/Intent;", "i", "Landroid/content/Context;", "context", "a", "Landroid/content/Context;", "<init>", "()V", "Companion", "menstrual_period_impl_release"}, k = 1, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nMenstrualNotification.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MenstrualNotification.kt\ncom/heytap/health/menstrual_period/notify/MenstrualNotification\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,212:1\n1#2:213\n*E\n"})
public final class aub {
    public static final int NOTIFICATION_ID_DELAY = 20013;
    public static final int NOTIFICATION_ID_END_TIME = 20012;
    public static final int NOTIFICATION_ID_FIRST_DAY_TIME = 20011;
    public static final int NOTIFICATION_ID_PREDICT_TIME = 20010;
    public static final int NOTIFICATION_ID_SYMPTOM = 20014;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final Context context;
    public static final int $stable = 8;

    public aub() {
        Context contextA = b78.a();
        Intrinsics.checkNotNullExpressionValue(contextA, "getAppContext()");
        this.context = contextA;
    }

    public static /* synthetic */ void j(aub aubVar, int i, String str, String str2, Intent intent, int i2, Object obj) {
        if ((i2 & 8) != 0) {
            intent = null;
        }
        aubVar.i(i, str, str2, intent);
    }

    public final void a(Context context) {
        String string = context.getString(R$string.health_menstrual_period_notify_channel);
        Intrinsics.checkNotNullExpressionValue(string, "context.getString(R.stri…al_period_notify_channel)");
        NotificationChannel notificationChannel = new NotificationChannel("new_record_channel_id", string, 3);
        NotificationManager notificationManager = (NotificationManager) context.getSystemService(NotificationManager.class);
        if (notificationManager != null) {
            notificationManager.createNotificationChannel(notificationChannel);
        }
    }

    public final void b(int notifyType, @Nullable Bundle bundle) {
        switch (notifyType) {
            case 20010:
                f();
                z7b.f("MenstrualNotification", "dataLog: " + os.j());
                break;
            case 20011:
                e();
                z7b.f("MenstrualNotification", "dataLog: " + os.g());
                break;
            case 20012:
                d();
                z7b.f("MenstrualNotification", "dataLog: " + os.d());
                break;
            case 20013:
                c();
                z7b.f("MenstrualNotification", "dataLog: " + os.a());
                break;
            case 20014:
                h(bundle);
                break;
        }
    }

    public final void c() {
        String string = this.context.getString(R$string.health_menstrual_notify_delay_title);
        Intrinsics.checkNotNullExpressionValue(string, "context.getString(R.stri…trual_notify_delay_title)");
        String string2 = this.context.getString(R$string.health_menstrual_notify_delay_text);
        Intrinsics.checkNotNullExpressionValue(string2, "context.getString(R.stri…strual_notify_delay_text)");
        j(this, 20013, string, string2, null, 8, null);
    }

    public final void d() {
        String string = this.context.getString(R$string.health_menstrual_notify_end_title);
        Intrinsics.checkNotNullExpressionValue(string, "context.getString(R.stri…nstrual_notify_end_title)");
        String string2 = this.context.getString(R$string.health_menstrual_notify_end_text);
        Intrinsics.checkNotNullExpressionValue(string2, "context.getString(R.stri…enstrual_notify_end_text)");
        j(this, 20012, string, string2, null, 8, null);
    }

    public final void e() {
        String string = this.context.getString(R$string.health_menstrual_notify_first_day_title);
        Intrinsics.checkNotNullExpressionValue(string, "context.getString(R.stri…l_notify_first_day_title)");
        String string2 = this.context.getString(R$string.health_menstrual_notify_first_day_text);
        Intrinsics.checkNotNullExpressionValue(string2, "context.getString(R.stri…al_notify_first_day_text)");
        j(this, 20011, string, string2, null, 8, null);
    }

    public final void f() {
        boolean zP4 = nsb.a(gl4.managerApi.getCurrActiveMac()).p4();
        a7b.f("MenstrualNotification", "isSupportMenstrualAlgor = " + zP4);
        if (zP4) {
            a7b.f("MenstrualNotification", "devices that support the algorithm do not display");
            return;
        }
        String string = this.context.getString(R$string.health_menstrual_period_notify_predict_title);
        Intrinsics.checkNotNullExpressionValue(string, "context.getString(R.stri…iod_notify_predict_title)");
        String string2 = this.context.getString(R$string.health_menstrual_period_notify_predict_text);
        Intrinsics.checkNotNullExpressionValue(string2, "context.getString(R.stri…riod_notify_predict_text)");
        j(this, 20010, string, string2, null, 8, null);
    }

    public final void g(int predictDays) {
        String string = this.context.getString(R$string.health_menstrual_period_notify_predict_title);
        Intrinsics.checkNotNullExpressionValue(string, "context.getString(R.stri…iod_notify_predict_title)");
        j(this, 20010, string, qtf.i(R$plurals.health_menstrual_period_notify_predict, predictDays), null, 8, null);
    }

    public final void h(Bundle bundle) {
        SymptomType symptomType;
        String string = this.context.getString(R$string.health_menstrual_notify_symptom_title);
        Intrinsics.checkNotNullExpressionValue(string, "context.getString(R.stri…ual_notify_symptom_title)");
        Object obj = null;
        if (bundle != null) {
            try {
                symptomType = (SymptomType) BundleCompat.getSerializable(bundle, SymptomAlarmService.KEY_SYMPTOM_TYPE, SymptomType.class);
            } catch (Exception e2) {
                a7b.b("MenstrualNotification", "notifySymptom getSerializable error " + e2.getMessage());
                return;
            }
        } else {
            symptomType = null;
        }
        SymptomType.SymptomValueBase symptomValueBase = bundle != null ? (SymptomType.SymptomValueBase) BundleCompat.getSerializable(bundle, SymptomAlarmService.KEY_SYMPTOM_TYPE_VALUE_BASE, SymptomType.SymptomValueBase.class) : null;
        if (symptomType == null || symptomValueBase == null) {
            a7b.b("MenstrualNotification", "notifySymptom. symptomType=" + symptomType + ", valueBase=" + symptomValueBase);
            return;
        }
        for (Object obj2 : SymptomType.transBitToSymptomValue$default(symptomType, 0, 1, null)) {
            if (((SymptomType.SymptomValueBase) obj2).getBitPos() == symptomValueBase.getBitPos()) {
                obj = obj2;
                break;
            }
        }
        SymptomType.SymptomValueBase symptomValueBase2 = (SymptomType.SymptomValueBase) obj;
        if (symptomValueBase2 == null) {
            a7b.b("MenstrualNotification", "notifySymptom. newValueBase is null");
            return;
        }
        SymptomType symptomTypeG = new u6j().g(symptomType.getTypeValue().getType(), symptomType.getValue(), symptomType.getModifiedTime(), symptomType.getCreateTime());
        Context context = this.context;
        String string2 = context.getString(R$string.health_menstrual_notify_symptom_text, context.getString(symptomTypeG.getTextId()));
        Intrinsics.checkNotNullExpressionValue(string2, "context.getString(R.stri…g(newSymptomType.textId))");
        i(20014, string, string2, MenstrualSymptomStatActivity.INSTANCE.a(this.context, symptomTypeG, symptomValueBase2));
    }

    public final void i(int notifyId, String title, String content, Intent i) {
        int i2 = BuildCompat.isAtLeastS() ? 167772160 : 134217728;
        if (i == null) {
            i = new Intent(this.context, (Class<?>) MenstrualDetailActivity.class);
        }
        PendingIntent activity = PendingIntent.getActivity(this.context, 0, i, i2);
        a(this.context);
        NotificationCompat.Builder autoCancel = new NotificationCompat.Builder(this.context, "new_record_channel_id").setSmallIcon(R$mipmap.lib_base_ic_launcher).setContentTitle(title).setContentText(content).setContentIntent(activity).setPriority(0).setAutoCancel(true);
        Intrinsics.checkNotNullExpressionValue(autoCancel, "Builder(context, CHANNEL…     .setAutoCancel(true)");
        NotificationManagerCompat notificationManagerCompatFrom = NotificationManagerCompat.from(this.context);
        Intrinsics.checkNotNullExpressionValue(notificationManagerCompatFrom, "from(context)");
        if (ContextCompat.checkSelfPermission(this.context, "android.permission.POST_NOTIFICATIONS") != 0) {
            return;
        }
        notificationManagerCompatFrom.notify(notifyId, autoCancel.build());
        hub.j(System.currentTimeMillis());
        a7b.f("MenstrualNotification", "Notification show");
    }
}
