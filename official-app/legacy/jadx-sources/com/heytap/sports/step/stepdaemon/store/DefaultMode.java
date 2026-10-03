package com.heytap.sports.step.stepdaemon.store;

import android.annotation.SuppressLint;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import androidx.compose.runtime.internal.StabilityInferred;
import com.heytap.health.core.provider.adapter.open.SportDataAdapter;
import com.heytap.log.formatter.LogFieldKey;
import com.heytap.sports.step.stepdaemon.store.DefaultMode;
import com.oplus.aiunit.vision.a7b;
import com.oplus.aiunit.vision.b2n;
import com.oplus.aiunit.vision.b78;
import com.oplus.aiunit.vision.d55;
import com.oplus.aiunit.vision.g3k;
import com.oplus.aiunit.vision.lbd;
import com.oplus.aiunit.vision.ld9;
import com.oplus.aiunit.vision.lji;
import com.oplus.aiunit.vision.lz6;
import com.oplus.aiunit.vision.o14;
import com.oplus.aiunit.vision.rdf;
import com.oplus.aiunit.vision.rti;
import com.oplus.aiunit.vision.sre;
import com.oplus.aiunit.vision.su8;
import com.oplus.aiunit.vision.v05;
import com.oplus.aiunit.vision.v9g;
import io.protostuff.MapSchema;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.Unit;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000K\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b*\u0001#\b\u0007\u0018\u0000 .2\u00020\u0001:\u0001\u000fB\u0011\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b,\u0010-J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\b\u0010\b\u001a\u00020\u0006H\u0016J\u0006\u0010\t\u001a\u00020\u0006J\u0006\u0010\n\u001a\u00020\u0006J\b\u0010\u000b\u001a\u00020\u0006H\u0002J\b\u0010\f\u001a\u00020\u0006H\u0002J\b\u0010\r\u001a\u00020\u0006H\u0002R\u0016\u0010\u0011\u001a\u0004\u0018\u00010\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0016\u0010\u0014\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0016\u0010\u0017\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0014\u0010\u001b\u001a\u00020\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0014\u0010\u001f\u001a\u00020\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0014\u0010\"\u001a\u00020 8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010!R\u0014\u0010&\u001a\u00020#8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010%R\u0014\u0010)\u001a\u00020'8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010(R\u0014\u0010+\u001a\u00020\u00068CX\u0082\u0004¢\u0006\u0006\u001a\u0004\b$\u0010*¨\u0006/"}, d2 = {"Lcom/heytap/sports/step/stepdaemon/store/DefaultMode;", "", "", "step", "", "sensorTime", "", "n", LogFieldKey.MESSAGE_KEY, LogFieldKey.LEVEL_KEY, b2n.g, MapSchema.FIELD_NAME_KEY, "f", "j", "Landroid/content/Context;", "a", "Landroid/content/Context;", "mContext", "b", "I", "mLastSensorStep", "c", "J", "mLastSensorTime", "Lcom/oplus/aiunit/vision/lji;", "d", "Lcom/oplus/aiunit/vision/lji;", "mDisplayData", "Lcom/heytap/sports/step/stepdaemon/store/ContentProviderOperate;", MapSchema.FIELD_NAME_ENTRY, "Lcom/heytap/sports/step/stepdaemon/store/ContentProviderOperate;", "mCpOperate", "Lcom/oplus/aiunit/vision/d55;", "Lcom/oplus/aiunit/vision/d55;", "mRepository", "com/heytap/sports/step/stepdaemon/store/DefaultMode$b", b2n.f, "Lcom/heytap/sports/step/stepdaemon/store/DefaultMode$b;", "handler", "Landroid/content/BroadcastReceiver;", "Landroid/content/BroadcastReceiver;", "receiver", "()Lkotlin/Unit;", "readDataFromCP", "<init>", "(Landroid/content/Context;)V", "Companion", "sport_impl_release"}, k = 1, mv = {1, 8, 0})
public final class DefaultMode {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @Nullable
    public final Context mContext;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public int mLastSensorStep;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    public long mLastSensorTime;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    public final lji mDisplayData;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final ContentProviderOperate mCpOperate;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @NotNull
    public final d55 mRepository;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    @NotNull
    public final b handler;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    @NotNull
    public final BroadcastReceiver receiver;
    public static final int $stable = 8;

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\u0006"}, d2 = {"com/heytap/sports/step/stepdaemon/store/DefaultMode$b", "Landroid/os/Handler;", "Landroid/os/Message;", "msg", "", "handleMessage", "sport_impl_release"}, k = 1, mv = {1, 8, 0})
    public static final class b extends Handler {
        public b(Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public void handleMessage(@NotNull Message msg) {
            Intrinsics.checkNotNullParameter(msg, "msg");
            if (1 == msg.what) {
                DefaultMode.this.k();
            }
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "", "a", "(I)V"}, k = 3, mv = {1, 8, 0})
    public static final class c<T> implements o14 {
        public c() {
        }

        public final void a(int i) {
            a7b.f("DefaultMode", "getCurrentDayTotalStepsFromLocal enter");
            Bundle bundleF = SportDataAdapter.F(b78.a());
            if (bundleF != null) {
                long j2 = bundleF.getLong("step");
                double d = bundleF.getDouble("distance");
                double d2 = bundleF.getDouble("calorie");
                long j3 = bundleF.getLong("stepGoal");
                long j4 = bundleF.getLong("calGoal");
                long j5 = bundleF.getLong("actGoal");
                long j6 = bundleF.getLong("timeGoal");
                double d3 = lz6.k() ? bundleF.getDouble("duration") : 0.0d;
                DefaultMode.this.mRepository.k(j2, d, d2);
                DefaultMode.this.mDisplayData.n(d3);
                if (j3 != 0) {
                    DefaultMode.this.mDisplayData.p((int) j3);
                }
                if (j4 != 0) {
                    DefaultMode.this.mDisplayData.j((int) j4);
                }
                if (j5 != 0) {
                    DefaultMode.this.mDisplayData.i((int) j5);
                }
                if (j6 != 0) {
                    DefaultMode.this.mDisplayData.q((int) j6);
                }
                a7b.f("DefaultMode", "getCurrentDayTotalStepsFromLocal mDisplayData: " + DefaultMode.this.mDisplayData);
                if (j2 > 0 || !lz6.k()) {
                    DefaultMode.this.mCpOperate.e(true);
                } else {
                    a7b.f("DefaultMode", "skip sendDataToCP, step is 0 and ExtendStep exists, waiting for ExtendStep data");
                }
            }
        }

        @Override // com.oplus.aiunit.vision.o14
        public /* bridge */ /* synthetic */ void accept(Object obj) {
            a(((Number) obj).intValue());
        }
    }

    public DefaultMode(@Nullable Context context) {
        this.mContext = context;
        lji ljiVar = new lji(0L, 0.0d, 0.0d, 8000, 300000, 12, 30, -1.0d);
        this.mDisplayData = ljiVar;
        ContentProviderOperate contentProviderOperate = new ContentProviderOperate(ljiVar);
        this.mCpOperate = contentProviderOperate;
        d55 d55Var = new d55(ljiVar, contentProviderOperate);
        this.mRepository = d55Var;
        b bVar = new b(Looper.getMainLooper());
        this.handler = bVar;
        this.receiver = new BroadcastReceiver() { // from class: com.heytap.sports.step.stepdaemon.store.DefaultMode$receiver$1
            @Override // android.content.BroadcastReceiver
            public void onReceive(@NotNull Context context2, @NotNull Intent intent) {
                String action;
                Intrinsics.checkNotNullParameter(context2, "context");
                Intrinsics.checkNotNullParameter(intent, "intent");
                if (intent.getAction() == null || (action = intent.getAction()) == null) {
                    return;
                }
                int iHashCode = action.hashCode();
                if (iHashCode == -1454123155) {
                    if (action.equals("android.intent.action.SCREEN_ON")) {
                        this.a.mCpOperate.e(true);
                    }
                } else if (iHashCode == 647021111 && action.equals("com.heytap.health.action_data_refresh")) {
                    a7b.f("DefaultMode", "REFRESH_TYPE:" + intent.getIntExtra("refresh_type", 0));
                    if (1 == intent.getIntExtra("refresh_type", 0)) {
                        this.a.mRepository.j(1L);
                    }
                }
            }
        };
        this.mLastSensorStep = (int) sre.b(context);
        g();
        d55Var.j(0L);
        bVar.sendEmptyMessageDelayed(1, 60000 - (System.currentTimeMillis() - v05.h(System.currentTimeMillis())));
        j();
    }

    public static final void i(DefaultMode this$0, int i) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        a7b.f("DefaultMode", "getStepFromAssScreen assStep: " + i + ", showStep: " + this$0.mDisplayData.getStep());
        long j2 = (long) i;
        int step = (int) (j2 - this$0.mDisplayData.getStep());
        if (step > 0) {
            long j3 = step;
            this$0.mRepository.k(j2, rti.g(j3, 0) + this$0.mDisplayData.getMDistance(), this$0.mDisplayData.getMCalories() + rti.d(j3, 0, 0.0d));
            this$0.mCpOperate.e(true);
            lji ljiVar = this$0.mDisplayData;
            StringBuilder sb = new StringBuilder();
            sb.append("getStepFromAssScreen mLastData: ");
            sb.append(ljiVar);
        }
    }

    public final void f() {
        this.mLastSensorStep = 0;
        this.mRepository.k(0L, 0.0d, 0.0d);
        this.mRepository.i(0L);
        h();
        if (lz6.k()) {
            this.mCpOperate.g(this.mDisplayData);
        } else {
            this.mCpOperate.e(true);
        }
    }

    @SuppressLint({"CheckResult"})
    public final Unit g() {
        lbd.h0(0).L0(su8.c()).a(new c());
        return Unit.INSTANCE;
    }

    public final void h() {
        if (g3k.I()) {
            a7b.f("DefaultMode", "has no permission ACTIVITY_RECOGNITION");
        } else {
            if (lz6.k()) {
                return;
            }
            a.a(this.mContext, new a.InterfaceC0795a() { // from class: com.oplus.aiunit.vision.c55
                @Override // com.heytap.sports.step.stepdaemon.store.a.InterfaceC0795a
                public final void a(int i) {
                    DefaultMode.i(this.a, i);
                }
            });
        }
    }

    public final void j() {
        if (this.mContext != null) {
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.intent.action.SCREEN_ON");
            intentFilter.addAction("com.heytap.health.action_data_refresh");
            rdf.a(this.mContext, this.receiver, intentFilter, 4);
        }
    }

    public final void k() {
        if (lz6.k()) {
            return;
        }
        this.mRepository.f();
        this.handler.sendEmptyMessageDelayed(1, 60000L);
    }

    public final void l() {
        Context context = this.mContext;
        if (context != null) {
            try {
                context.unregisterReceiver(this.receiver);
            } catch (Exception e2) {
                a7b.b("DefaultMode", "onDestroy:" + e2.getMessage());
            }
        }
    }

    public void m() {
        f();
        ld9.J("");
        ld9.z("");
        ld9.x("");
        ld9.P("");
        ld9.H("");
        v9g.x("steps_calories_threshold").S("daily_event_stat_data_invalid_key", 0);
        v9g.x("steps_calories_threshold").S("invalid_step_prompt_manual_close_key", 0);
    }

    public void n(int step, long sensorTime) {
        a7b.f("DefaultMode", "收到传感器的步数上报 mLastUpdateStep: " + this.mLastSensorStep);
        int i = this.mLastSensorStep;
        long j2 = (long) (step - i);
        long j3 = this.mLastSensorTime;
        long j4 = sensorTime - j3;
        if (j2 <= 0) {
            StringBuilder sb = new StringBuilder();
            sb.append("收到传感器的步数上报 increment <= 0：step = ");
            sb.append(step);
            sb.append(", mLastUpdateStep = ");
            sb.append(i);
            return;
        }
        if (j4 <= 0) {
            a7b.b("DefaultMode", "receive time increment < 0：sensorTime = " + sensorTime + ", mLastSensorTime = " + j3);
            return;
        }
        this.mLastSensorStep = step;
        this.mLastSensorTime = sensorTime;
        a7b.f("DefaultMode", "收到传感器的步数上报：step = " + step + ", state = 0, increment = " + j2);
        this.mRepository.k(this.mDisplayData.getStep() + j2, rti.g(j2, 0) + this.mDisplayData.getMDistance(), rti.d(j2, 0, 0.0d) + this.mDisplayData.getMCalories());
        lji ljiVar = this.mDisplayData;
        StringBuilder sb2 = new StringBuilder();
        sb2.append("当前总量 = ");
        sb2.append(ljiVar);
        this.mCpOperate.e(false);
    }
}
