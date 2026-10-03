package com.health.health_seedlingcard.adapter;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.text.TextUtils;
import com.health.health_seedlingcard.model.SportRecordModel;
import com.health.health_seedlingcard.receiver.HealthDataRefreshReceiver;
import com.health.health_seedlingcard.utlis.b;
import com.heytap.health.devicemanager.lock.LockList;
import com.oplus.aiunit.vision.ddd;
import com.oplus.aiunit.vision.dyf;
import com.oplus.aiunit.vision.g7b;
import com.oplus.aiunit.vision.jug;
import com.oplus.aiunit.vision.m8b;
import com.oplus.aiunit.vision.p30;
import com.oplus.aiunit.vision.qy9;
import com.oplus.aiunit.vision.rfd;
import com.oplus.aiunit.vision.vgf;
import com.oplus.aiunit.vision.wv8;
import com.oplus.pantanal.seedling.bean.CancelPanelActionConfigEnum;
import com.oplus.pantanal.seedling.bean.SeedlingCard;
import com.oplus.pantanal.seedling.update.SeedlingCardOptions;
import com.oplus.pantanal.seedling.util.SeedlingTool;
import io.reactivex.rxjava3.disposables.a;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes14.dex */
@Metadata(d1 = {"\u0000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\b\t*\u0001-\u0018\u0000 32\u00020\u0001:\u00014B\u0007¢\u0006\u0004\b1\u00102J\u001c\u0010\u0006\u001a\u00020\u00052\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00010\u0002H\u0016J\u0018\u0010\u000b\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tH\u0016J&\u0010\u000f\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\u00032\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\t0\rH\u0016J\u0018\u0010\u0010\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tH\u0016J\u0018\u0010\u0011\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tH\u0016J\u0018\u0010\u0012\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tH\u0016J\u0018\u0010\u0013\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tH\u0016J \u0010\u0016\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u0015\u001a\u00020\u0014H\u0016J\u0018\u0010\u0017\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tH\u0016J\u0010\u0010\u0018\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0002J\u0010\u0010\u001b\u001a\u00020\u00052\u0006\u0010\u001a\u001a\u00020\u0019H\u0002J\b\u0010\u001c\u001a\u00020\u0005H\u0002J\b\u0010\u001d\u001a\u00020\u0005H\u0002R\u001c\u0010 \u001a\b\u0012\u0004\u0012\u00020\t0\u001e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0006\u0010\u001fR\u0016\u0010#\u001a\u00020!8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0018\u0010\"R\u0018\u0010&\u001a\u0004\u0018\u00010$8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001d\u0010%R\u001b\u0010,\u001a\u00020'8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b(\u0010)\u001a\u0004\b*\u0010+R\u0014\u00100\u001a\u00020-8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b.\u0010/¨\u00065"}, d2 = {"Lcom/health/health_seedlingcard/adapter/SportsRecordAdapter;", "Lcom/oplus/aiunit/vision/qy9;", "", "", "adapters", "", "i", "Landroid/content/Context;", "context", "Lcom/oplus/pantanal/seedling/bean/SeedlingCard;", "card", "onCardCreate", "clientName", "", "cards", "onCardObserve", "onSubscribed", "onShow", "onHide", "onUnSubscribed", "Landroid/os/Bundle;", "data", "onUpdateData", "onDestroy", "j", "", "forceRefresh", "h", "f", "k", "Lcom/heytap/health/devicemanager/lock/LockList;", "Lcom/heytap/health/devicemanager/lock/LockList;", "onShowCardList", "", "J", "lastUpdateTime", "Lio/reactivex/rxjava3/disposables/a;", "Lio/reactivex/rxjava3/disposables/a;", "mDisposable", "Lcom/health/health_seedlingcard/model/SportRecordModel;", "l", "Lkotlin/Lazy;", "g", "()Lcom/health/health_seedlingcard/model/SportRecordModel;", "model", "com/health/health_seedlingcard/adapter/SportsRecordAdapter$healthDataRefreshReceiver$1", "m", "Lcom/health/health_seedlingcard/adapter/SportsRecordAdapter$healthDataRefreshReceiver$1;", "healthDataRefreshReceiver", "<init>", "()V", "Companion", "a", "health_seedlingcard_release"}, k = 1, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nSportsRecordAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SportsRecordAdapter.kt\ncom/health/health_seedlingcard/adapter/SportsRecordAdapter\n+ 2 LockUtils.kt\ncom/heytap/health/devicemanager/lock/LockUtilsKt\n*L\n1#1,218:1\n19#2,11:219\n19#2,11:230\n19#2,11:241\n*S KotlinDebug\n*F\n+ 1 SportsRecordAdapter.kt\ncom/health/health_seedlingcard/adapter/SportsRecordAdapter\n*L\n69#1:219,11\n79#1:230,11\n93#1:241,11\n*E\n"})
public final class SportsRecordAdapter implements qy9 {

    @NotNull
    public static final String TAG = "SportsRecordAdapter";
    public long j;

    @Nullable
    public a k;

    @NotNull
    public LockList<SeedlingCard> i = new LockList<>();

    @NotNull
    public final Lazy l = LazyKt.lazy(new Function0<SportRecordModel>() { // from class: com.health.health_seedlingcard.adapter.SportsRecordAdapter$model$2
        @NotNull
        public final SportRecordModel invoke() {
            return new SportRecordModel();
        }
    });

    @NotNull
    public final SportsRecordAdapter$healthDataRefreshReceiver$1 m = new BroadcastReceiver() { // from class: com.health.health_seedlingcard.adapter.SportsRecordAdapter$healthDataRefreshReceiver$1
        @Override // android.content.BroadcastReceiver
        public void onReceive(@Nullable Context context, @Nullable Intent intent) {
            if (TextUtils.equals("com.heytap.health.action_data_refresh", intent != null ? intent.getAction() : null)) {
                Intrinsics.checkNotNull(intent);
                int intExtra = intent.getIntExtra("refresh_type", 0);
                if (intExtra == 2) {
                    m8b.f(SportsRecordAdapter.TAG, "healthDataRefreshReceiver:" + intExtra);
                    this.a.h(false);
                }
            }
        }
    };

    @Metadata(d1 = {"\u0000#\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u0003\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0010\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0016J\u0010\u0010\b\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002H\u0016J\u0010\u0010\u000b\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\tH\u0016J\b\u0010\f\u001a\u00020\u0005H\u0016¨\u0006\r"}, d2 = {"com/health/health_seedlingcard/adapter/SportsRecordAdapter$b", "Lcom/oplus/aiunit/vision/rfd;", "", "Lio/reactivex/rxjava3/disposables/a;", "d", "", "onSubscribe", "t", "a", "", "e", "onError", "onComplete", "health_seedlingcard_release"}, k = 1, mv = {1, 8, 0})
    public static final class b implements rfd<Long> {
        public b() {
        }

        public void a(long t) {
            SportsRecordAdapter.this.k();
        }

        public void onComplete() {
            SportsRecordAdapter.this.f();
        }

        public void onError(@NotNull Throwable e) {
            Intrinsics.checkNotNullParameter(e, "e");
            SportsRecordAdapter.this.f();
        }

        public /* bridge */ /* synthetic */ void onNext(Object obj) {
            a(((Number) obj).longValue());
        }

        public void onSubscribe(@NotNull a d) {
            Intrinsics.checkNotNullParameter(d, "d");
            SportsRecordAdapter.this.k = d;
        }
    }

    public final void f() {
        a aVar = this.k;
        if (aVar == null || aVar.isDisposed()) {
            return;
        }
        aVar.dispose();
    }

    public final SportRecordModel g() {
        return (SportRecordModel) this.l.getValue();
    }

    public final void h(boolean forceRefresh) {
        long jAbs = Math.abs(System.currentTimeMillis() - this.j);
        m8b.f(TAG, "processData:" + this.j + " ,intervalTime:" + jAbs);
        if (jAbs > HealthDataRefreshReceiver.ONE_MINUTE || forceRefresh) {
            k();
            return;
        }
        long j = ((long) 60000) - jAbs;
        m8b.f(TAG, "processData countdownTime:" + j);
        f();
        ddd.a1(j, TimeUnit.MILLISECONDS).K0(wv8.c()).n0(p30.c()).subscribe(new b());
    }

    public void i(@NotNull Map<String, qy9> adapters) {
        Intrinsics.checkNotNullParameter(adapters, "adapters");
        m8b.f(TAG, "register");
        adapters.put(jug.SPORTS_RECORD_SID, this);
    }

    public final void j(Context context) {
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("com.heytap.health.action_data_refresh");
        vgf.a(context, this.m, intentFilter, 4);
    }

    public final void k() {
        long jCurrentTimeMillis = System.currentTimeMillis();
        this.j = jCurrentTimeMillis;
        m8b.f(TAG, "updateData:" + jCurrentTimeMillis);
        g().c().a(new Function1<dyf<JSONObject>, Unit>() { // from class: com.health.health_seedlingcard.adapter.SportsRecordAdapter$updateData$1
            {
                super(1);
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((dyf<JSONObject>) obj);
                return Unit.INSTANCE;
            }

            public final void invoke(@NotNull dyf<JSONObject> dyfVar) {
                SeedlingCardOptions seedlingCardOptions;
                Intrinsics.checkNotNullParameter(dyfVar, "it");
                JSONObject jSONObject = (JSONObject) dyfVar.b();
                if (jSONObject == null) {
                    m8b.f(SportsRecordAdapter.TAG, "jsonObject is null");
                    return;
                }
                b.INSTANCE.a(SportsRecordAdapter.TAG, "uiData = " + jSONObject);
                if (jSONObject.has("sportingStatusTitle")) {
                    m8b.f(SportsRecordAdapter.TAG, "pages/index");
                    seedlingCardOptions = new SeedlingCardOptions("pages/index", (String) null, false, (Boolean) null, false, (Integer) null, (List) null, (Map) null, (Map) null, (CancelPanelActionConfigEnum) null, (Map) null, (Integer) null, 0, false, (Long) null, (Map) null, 65534, (DefaultConstructorMarker) null);
                } else {
                    m8b.f(SportsRecordAdapter.TAG, "pages/empty");
                    seedlingCardOptions = new SeedlingCardOptions("pages/empty", (String) null, false, (Boolean) null, false, (Integer) null, (List) null, (Map) null, (Map) null, (CancelPanelActionConfigEnum) null, (Map) null, (Integer) null, 0, false, (Long) null, (Map) null, 65534, (DefaultConstructorMarker) null);
                }
                LockList<SeedlingCard> lockList = this.this$0.i;
                try {
                    g7b.a("", "readLock");
                    lockList.readLock();
                    for (SeedlingCard seedlingCard : lockList) {
                        StringBuilder sb = new StringBuilder();
                        sb.append("item card:");
                        sb.append(seedlingCard);
                        SeedlingTool.INSTANCE.updateData(seedlingCard, jSONObject, seedlingCardOptions);
                    }
                    Unit unit = Unit.INSTANCE;
                } finally {
                    lockList.readUnLock();
                    g7b.a("", "readUnLock");
                }
            }
        });
    }

    public void onCardCreate(@NotNull Context context, @NotNull SeedlingCard card) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(card, "card");
        m8b.f(TAG, "onCardCreate " + card);
    }

    public void onCardObserve(@NotNull Context context, @NotNull String clientName, @NotNull List<SeedlingCard> cards) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(clientName, "clientName");
        Intrinsics.checkNotNullParameter(cards, "cards");
        m8b.f(TAG, "onCardObserve " + cards);
    }

    public void onDestroy(@NotNull Context context, @NotNull SeedlingCard card) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(card, "card");
        m8b.f(TAG, "onDestroy " + card);
    }

    public void onHide(@NotNull Context context, @NotNull SeedlingCard card) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(card, "card");
        m8b.f(TAG, "onHide " + card);
    }

    public void onShow(@NotNull Context context, @NotNull SeedlingCard card) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(card, "card");
        m8b.f(TAG, "onShow " + card);
        LockList<SeedlingCard> lockList = this.i;
        try {
            g7b.a("", "writeLock");
            lockList.writeLock();
            if (!lockList.contains(card)) {
                lockList.add(card);
            }
            Unit unit = Unit.INSTANCE;
            lockList.writeUnLock();
            g7b.a("", "writeUnLock");
            h(true);
        } catch (Throwable th) {
            lockList.writeUnLock();
            g7b.a("", "writeUnLock");
            throw th;
        }
    }

    public void onSubscribed(@NotNull Context context, @NotNull SeedlingCard card) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(card, "card");
        m8b.f(TAG, "onSubscribed " + card);
        LockList<SeedlingCard> lockList = this.i;
        try {
            g7b.a("", "writeLock");
            lockList.writeLock();
            if (!lockList.contains(card)) {
                lockList.add(card);
            }
            Unit unit = Unit.INSTANCE;
            lockList.writeUnLock();
            g7b.a("", "writeUnLock");
            j(context);
        } catch (Throwable th) {
            lockList.writeUnLock();
            g7b.a("", "writeUnLock");
            throw th;
        }
    }

    public void onUnSubscribed(@NotNull Context context, @NotNull SeedlingCard card) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(card, "card");
        m8b.f(TAG, "onUnSubscribed " + card);
        LockList<SeedlingCard> lockList = this.i;
        try {
            g7b.a("", "writeLock");
            lockList.writeLock();
            if (lockList.contains(card)) {
                lockList.remove(card);
            }
            Unit unit = Unit.INSTANCE;
            lockList.writeUnLock();
            g7b.a("", "writeUnLock");
            if (this.i.isEmpty()) {
                context.unregisterReceiver(this.m);
            }
        } catch (Throwable th) {
            lockList.writeUnLock();
            g7b.a("", "writeUnLock");
            throw th;
        }
    }

    public void onUpdateData(@NotNull Context context, @NotNull SeedlingCard card, @NotNull Bundle data) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(card, "card");
        Intrinsics.checkNotNullParameter(data, "data");
        m8b.f(TAG, "onUpdateData " + card);
    }
}
