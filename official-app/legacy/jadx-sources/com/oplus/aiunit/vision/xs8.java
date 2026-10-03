package com.oplus.aiunit.vision;

import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.os.Build;
import android.text.TextUtils;
import com.heytap.health.base.R$string;
import com.heytap.health.base.task.ThreadUtils;
import com.heytap.log.formatter.LogFieldKey;
import io.protostuff.MapSchema;
import java.util.HashMap;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.Unit;
import p010kotlin.jvm.internal.DefaultConstructorMarker;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes17.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0007\u0018\u0000 \u00122\u00020\u0001:\u0001\u0013B\u0007¢\u0006\u0004\b\u0010\u0010\u0011J\u0006\u0010\u0003\u001a\u00020\u0002J\u0006\u0010\u0005\u001a\u00020\u0004J\u0006\u0010\u0007\u001a\u00020\u0006J\n\u0010\t\u001a\u0004\u0018\u00010\bH\u0016J\u0012\u0010\u000b\u001a\u00020\u00042\b\u0010\n\u001a\u0004\u0018\u00010\bH\u0016J\b\u0010\f\u001a\u00020\u0004H\u0016J\b\u0010\u000e\u001a\u00020\rH\u0016J\b\u0010\u000f\u001a\u00020\u0004H\u0002¨\u0006\u0014"}, d2 = {"Lcom/oplus/aiunit/vision/xs8;", "", "Lcom/oplus/aiunit/vision/vs8;", b2n.g, "", MapSchema.FIELD_NAME_KEY, "", b2n.f, "", "i", "registerId", "n", LogFieldKey.MESSAGE_KEY, "", "j", "f", "<init>", "()V", "Companion", "a", "push_base_release"}, k = 1, mv = {1, 8, 0})
public final class xs8 {
    public static final int LAST_DATE_FROM_NOW = 7;

    @Nullable
    public static xs8 a;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    public static final String b = "HealthPushManagerHelper";

    /* JADX INFO: renamed from: com.oplus.aiunit.vision.xs8$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002R\u001a\u0010\u0005\u001a\u00020\u00048\u0006X\u0086D¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u0018\u0010\t\u001a\u0004\u0018\u00010\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\t\u0010\nR\u0014\u0010\f\u001a\u00020\u000b8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\f\u0010\r¨\u0006\u0010"}, d2 = {"Lcom/oplus/aiunit/vision/xs8$a;", "", "Lcom/oplus/aiunit/vision/xs8;", "a", "", "TAG", "Ljava/lang/String;", "b", "()Ljava/lang/String;", "INSTANCE", "Lcom/oplus/aiunit/vision/xs8;", "", "LAST_DATE_FROM_NOW", "I", "<init>", "()V", "push_base_release"}, k = 1, mv = {1, 8, 0})
    public static final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @Nullable
        public final xs8 a() {
            if (xs8.a == null) {
                synchronized (xs8.class) {
                    if (xs8.a == null) {
                        xs8.a = new xs8();
                    }
                    Unit unit = Unit.INSTANCE;
                }
            }
            return xs8.a;
        }

        @NotNull
        public final String b() {
            return xs8.b;
        }
    }

    @Metadata(d1 = {"\u0000!\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0018\u0010\t\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0007H\u0016¨\u0006\n"}, d2 = {"com/oplus/aiunit/vision/xs8$b", "Lcom/oplus/aiunit/vision/u61;", "Lcom/oplus/aiunit/vision/qm3;", "result", "", MapSchema.FIELD_NAME_ENTRY, "", "", "errMsg", "b", "push_base_release"}, k = 1, mv = {1, 8, 0})
    public static final class b extends u61<qm3> {
        public final /* synthetic */ String i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final /* synthetic */ String f18746j;
        public final /* synthetic */ String k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public final /* synthetic */ xs8 f18747l;

        public b(String str, String str2, String str3, xs8 xs8Var) {
            this.i = str;
            this.f18746j = str2;
            this.k = str3;
            this.f18747l = xs8Var;
        }

        @Override // com.oplus.aiunit.vision.u61
        public void b(@NotNull Throwable e2, @NotNull String errMsg) {
            Intrinsics.checkNotNullParameter(e2, "e");
            Intrinsics.checkNotNullParameter(errMsg, "errMsg");
            a7b.b(xs8.INSTANCE.b(), "pushRegister failed");
        }

        @Override // com.oplus.aiunit.vision.u61
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public void d(@NotNull qm3 result) {
            Intrinsics.checkNotNullParameter(result, "result");
            a7b.f(xs8.INSTANCE.b(), "pushRegister success. registerId:" + this.i + "; oldRegisterId:" + this.f18746j);
            v9g.x("health_share_preference_oobe").U("register_ssoid_old", v9g.w().D("user_ssoid"));
            v9g.x("health_share_preference_oobe").U("register_uniqueId_old", this.k);
            v9g.x("health_share_preference_oobe").U("registerID_old", this.i);
            this.f18747l.f();
        }
    }

    public static final void l(HashMap params, String str, String str2, String str3, xs8 this$0) {
        Intrinsics.checkNotNullParameter(params, "$params");
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        ((r3f) com.heytap.health.network.core.a.j(r3f.class)).a(params).L0(su8.c()).n0(f30.c()).subscribe(new b(str, str2, str3, this$0));
    }

    public final void f() {
        NotificationChannel notificationChannel = new NotificationChannel("1", qtf.l(R$string.lib_base_default_notification_name), 2);
        notificationChannel.setDescription("weekly_description");
        Object systemService = qtf.d().getSystemService((Class<Object>) NotificationManager.class);
        Intrinsics.checkNotNullExpressionValue(systemService, "getContext().getSystemSe…ationManager::class.java)");
        ((NotificationManager) systemService).createNotificationChannel(notificationChannel);
    }

    public final int g() {
        if (ilj.B()) {
            return 1;
        }
        if (ilj.y()) {
            return 4;
        }
        if (ilj.E()) {
            return 8;
        }
        if (ilj.w()) {
            return 2;
        }
        return ilj.v() ? 32 : -1;
    }

    @NotNull
    public final vs8 h() {
        String str = b;
        a7b.f(str, "Phone MANUFACTURER is " + Build.MANUFACTURER + ", Band is " + Build.BRAND);
        if (ilj.B()) {
            a7b.f(str, "OPPO PUSH");
            return new ms8();
        }
        String name = rs8.class.getName();
        if (ilj.y()) {
            a7b.f(str, "XIAO MI PUSH");
            name = "com.heytap.health.push_third.manager.HealthMiPushManager";
        } else if (ilj.E()) {
            a7b.f(str, "VIVO PUSH");
            name = "com.heytap.health.push_third.manager.HealthVivoPushManager";
        } else if (ilj.w()) {
            a7b.f(str, "HUAWEI PUSH");
            name = "com.heytap.health.push_third.manager.HealthHWPushManager";
        } else if (ilj.v()) {
            a7b.f(str, "Honor PUSH");
            name = "com.heytap.health.push_third.manager.HealthHonorPushManager";
        } else {
            a7b.f(str, "OTHER PUSH");
        }
        try {
            Object objNewInstance = Class.forName(name).newInstance();
            return objNewInstance instanceof vs8 ? (vs8) objNewInstance : new rs8();
        } catch (Exception e2) {
            a7b.c(b, "Error is " + e2.getMessage(), e2);
            return new rs8();
        }
    }

    @Nullable
    public String i() {
        String strE = v9g.x("health_share_preference_oobe").E("registerID", "register_failure");
        return Intrinsics.areEqual(strE, "register_failure") ? "register_failure" : strE;
    }

    public long j() {
        long jB = v9g.x("health_share_preference_oobe").B("registerID_time", 0L);
        String str = b;
        StringBuilder sb = new StringBuilder();
        sb.append("getRegisterIdDistanceDays | registerTime is ");
        sb.append(jB);
        if (jB == 0) {
            return 7L;
        }
        long jO = x05.o(jB, System.currentTimeMillis());
        a7b.f(str, "两个register id 相差天数：" + jO);
        return jO;
    }

    public final void k() {
        String str = b;
        a7b.f(str, "pushRegister()");
        final String strE = ilj.e();
        xs8 xs8VarA = INSTANCE.a();
        Intrinsics.checkNotNull(xs8VarA);
        final String strI = xs8VarA.i();
        if (TextUtils.isEmpty(strI) || Intrinsics.areEqual(strI, "register_failure") || !ilj.b()) {
            a7b.b(str, "push register fail");
            return;
        }
        String strD = v9g.x("health_share_preference_oobe").D("register_ssoid_old");
        String strD2 = v9g.x("health_share_preference_oobe").D("register_uniqueId_old");
        final String strD3 = v9g.x("health_share_preference_oobe").D("registerID_old");
        final HashMap map = new HashMap();
        map.put("mobileUniqueId", strE);
        map.put("registerId", strI);
        map.put("oldSsoid", strD);
        map.put("oldMobileUniqueId", strD2);
        map.put("oldRegisterId", strD3);
        map.put("channel", Integer.valueOf(g()));
        ThreadUtils.doInUiThread(new Runnable() { // from class: com.oplus.aiunit.vision.ws8
            @Override // java.lang.Runnable
            public final void run() {
                xs8.l(map, strI, strD3, strE, this);
            }
        });
    }

    public void m() {
        v9g.x("health_share_preference_oobe").U("registerID", "register_failure");
    }

    public void n(@Nullable String registerId) {
        StringBuilder sb = new StringBuilder();
        sb.append("putRegisterIdAndTime registerId is ");
        sb.append(registerId);
        if (TextUtils.isEmpty(registerId)) {
            m();
            return;
        }
        v9g.x("health_share_preference_oobe").U("registerID", registerId);
        v9g.x("health_share_preference_oobe").T("registerID_time", System.currentTimeMillis());
        k();
    }
}
