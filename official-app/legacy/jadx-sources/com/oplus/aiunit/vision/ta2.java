package com.oplus.aiunit.vision;

import android.content.ContentResolver;
import android.content.Context;
import android.database.ContentObserver;
import android.os.Handler;
import android.os.Looper;
import android.provider.Settings;
import androidx.annotation.NonNull;
import com.oplus.drs.base.ChannelMode;
import com.oplus.drs.base.util.NetworkUtils;
import com.oplus.drs.core.upload.upload.ChannelType;
import com.oplus.drs.rom.sdk.comm.DrsSdkCore;

/* JADX INFO: loaded from: classes6.dex */
public final class ta2 {
    public static final int EVENT_SOURCE_DCS = 2;
    public static final int EVENT_SOURCE_TECH_DCS = 4;
    public final Context a;
    public final eqc b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public volatile boolean f16945c = false;
    public volatile int d = Integer.MIN_VALUE;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public volatile int f16946e = Integer.MIN_VALUE;
    public final Object f = new Object();
    public final ContentObserver g = new a(new Handler(Looper.getMainLooper()));

    public class a extends ContentObserver {
        public a(Handler handler) {
            super(handler);
        }

        @Override // android.database.ContentObserver
        public void onChange(boolean z) {
            ta2.this.n();
        }
    }

    public ta2(@NonNull Context context) {
        Context applicationContext = context.getApplicationContext();
        this.a = applicationContext;
        this.b = eqc.b(applicationContext);
    }

    @NonNull
    public j38 b(@NonNull ChannelType channelType) {
        return d(channelType, false, 0);
    }

    @NonNull
    public j38 c(@NonNull ChannelType channelType, boolean z, int i) {
        return d(channelType, z, i);
    }

    @NonNull
    public final j38 d(@NonNull ChannelType channelType, boolean z, int i) {
        if (w56.a() == ChannelMode.STANDALONE) {
            return !j() ? j38.a("BusinessRule", "enableNetRequest=false") : j38.e();
        }
        if (this.b.d()) {
            return j38.a("BusinessRule", "newDeviceProtection(noBreakWindow=" + this.b.h() + "ms)");
        }
        boolean zL = l();
        if (!this.b.f(i(), zL)) {
            return j38.a("BusinessRule", "firstDayMobileDataRestriction(isWifi=" + zL + ")");
        }
        if (!z || !h(i) || f()) {
            return j38.e();
        }
        return j38.a("BusinessRule", "CTA/UE(eventSource=" + i + ")");
    }

    public final void e() {
        if (this.f16945c) {
            return;
        }
        synchronized (this.f) {
            if (this.f16945c) {
                return;
            }
            this.f16945c = true;
            try {
                ContentResolver contentResolver = this.a.getContentResolver();
                contentResolver.registerContentObserver(Settings.System.getUriFor("oplus_customize_cta_user_experience"), false, this.g);
                contentResolver.registerContentObserver(Settings.System.getUriFor("oplus_customize_cta_update_service"), false, this.g);
            } catch (Throwable th) {
                z6b.u("BusinessRuleGate", "ensureSettingsObserver register failed: " + th);
            }
            n();
        }
    }

    public boolean f() {
        return k() && g();
    }

    public boolean g() {
        if (!i()) {
            return true;
        }
        e();
        int iM = this.f16946e;
        if (iM == Integer.MIN_VALUE) {
            iM = m("oplus_customize_cta_update_service", 0);
            this.f16946e = iM;
        }
        return iM == 1;
    }

    public boolean h(int i) {
        return i == 2 || i == 4;
    }

    public final boolean i() {
        try {
            return alf.e();
        } catch (Throwable unused) {
            return false;
        }
    }

    public boolean j() {
        try {
            int i = DrsSdkCore.a;
            Object objInvoke = DrsSdkCore.class.getMethod("isEnableNetRequest", new Class[0]).invoke(null, new Object[0]);
            if (objInvoke instanceof Boolean) {
                return ((Boolean) objInvoke).booleanValue();
            }
        } catch (Throwable th) {
            z6b.u("BusinessRuleGate", "isStandaloneNetRequestEnabled: reflection failed: " + th.getMessage());
        }
        return false;
    }

    public boolean k() {
        e();
        int iM = this.d;
        if (iM == Integer.MIN_VALUE) {
            iM = m("oplus_customize_cta_user_experience", -1);
            this.d = iM;
        }
        return iM == 1;
    }

    public final boolean l() {
        return NetworkUtils.m();
    }

    public final int m(String str, int i) {
        try {
            return Settings.System.getInt(this.a.getContentResolver(), str, i);
        } catch (Throwable unused) {
            return i;
        }
    }

    public final void n() {
        try {
            this.d = m("oplus_customize_cta_user_experience", -1);
        } catch (Throwable unused) {
        }
        try {
            this.f16946e = m("oplus_customize_cta_update_service", 0);
        } catch (Throwable unused2) {
        }
    }

    @NonNull
    public String o() {
        ChannelMode channelModeA = w56.a();
        StringBuilder sb = new StringBuilder("BusinessRuleGate{");
        sb.append("mode=");
        sb.append(channelModeA);
        if (channelModeA == ChannelMode.STANDALONE) {
            sb.append(", enableNetRequest=");
            sb.append(j());
        } else {
            boolean zL = l();
            boolean zI = i();
            sb.append(", isWifi=");
            sb.append(zL);
            sb.append(", isDomestic=");
            sb.append(zI);
            sb.append(", inNoBreakWindow=");
            sb.append(this.b.d());
            sb.append(", salesRestrictionReleased=");
            sb.append(this.b.f(zI, zL));
            sb.append(", ctaUeAllowed=");
            sb.append(f());
        }
        sb.append("}");
        return sb.toString();
    }
}
