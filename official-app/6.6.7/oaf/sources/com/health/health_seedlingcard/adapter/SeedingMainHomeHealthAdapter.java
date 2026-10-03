package com.health.health_seedlingcard.adapter;

import android.content.Context;
import android.os.Bundle;
import com.health.health_seedlingcard.adapter.SeedingMainHomeHealthAdapter;
import com.health.health_seedlingcard.utlis.SeedlingCardDataToShowHelper;
import com.heytap.health.core.provider.StepDataObserverManager;
import com.heytap.health.devicemanager.lock.LockList;
import com.oplus.aiunit.vision.dyf;
import com.oplus.aiunit.vision.e88;
import com.oplus.aiunit.vision.g7b;
import com.oplus.aiunit.vision.i7k;
import com.oplus.aiunit.vision.jug;
import com.oplus.aiunit.vision.m8b;
import com.oplus.aiunit.vision.qy9;
import com.oplus.pantanal.seedling.bean.SeedlingCard;
import com.oplus.pantanal.seedling.intelligent.IntelligentData;
import com.oplus.pantanal.seedling.update.SeedlingCardOptions;
import com.oplus.pantanal.seedling.util.SeedlingTool;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes14.dex */
@Metadata(d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u0000 72\u00020\u0001:\u00018B\u0007¢\u0006\u0004\b5\u00106J\u001c\u0010\u0006\u001a\u00020\u00052\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00010\u0002H\u0016J\u0018\u0010\u000b\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tH\u0016J\u0018\u0010\f\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tH\u0016J\u0018\u0010\r\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tH\u0016J\u0018\u0010\u000e\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tH\u0016J\u0018\u0010\u000f\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tH\u0016J\u0018\u0010\u0010\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tH\u0016J \u0010\u0013\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u0012\u001a\u00020\u0011H\u0016J&\u0010\u0017\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\u0014\u001a\u00020\u00032\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\t0\u0015H\u0016J\u0018\u0010\u001a\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u0019\u001a\u00020\u0018H\u0002J\b\u0010\u001b\u001a\u00020\u0005H\u0002J\b\u0010\u001c\u001a\u00020\u0005H\u0002J\u0010\u0010\u001d\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\tH\u0002J\u0018\u0010 \u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\u001f\u001a\u00020\u001eH\u0002J&\u0010%\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\t2\b\u0010\"\u001a\u0004\u0018\u00010!2\n\b\u0002\u0010$\u001a\u0004\u0018\u00010#H\u0002R\u001a\u0010(\u001a\b\u0012\u0004\u0012\u00020\t0&8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010'R\u0018\u0010+\u001a\u0004\u0018\u00010!8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b)\u0010*R\u001c\u0010-\u001a\b\u0012\u0004\u0012\u00020\t0&8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b,\u0010'R\u0016\u00100\u001a\u00020\u00188\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b.\u0010/R\u0014\u00104\u001a\u0002018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b2\u00103¨\u00069"}, d2 = {"Lcom/health/health_seedlingcard/adapter/SeedingMainHomeHealthAdapter;", "Lcom/oplus/aiunit/vision/qy9;", "", "", "adapters", "", "c", "Landroid/content/Context;", "context", "Lcom/oplus/pantanal/seedling/bean/SeedlingCard;", "card", "onCardCreate", "onDestroy", "onHide", "onShow", "onSubscribed", "onUnSubscribed", "Landroid/os/Bundle;", "data", "onUpdateData", "clientName", "", "cards", "onCardObserve", "", "upkVersionCode", "e", "d", "h", "b", "", "state", "f", "Lorg/json/JSONObject;", "businessData", "Lcom/oplus/pantanal/seedling/update/SeedlingCardOptions;", "cardOptions", "i", "Lcom/heytap/health/devicemanager/lock/LockList;", "Lcom/heytap/health/devicemanager/lock/LockList;", "onShowSportCard", "j", "Lorg/json/JSONObject;", "sleepReminderData", "k", "subscribCardList", "l", "J", "lastSendingDataTimestamp", "Lcom/heytap/health/core/provider/StepDataObserverManager$a;", "m", "Lcom/heytap/health/core/provider/StepDataObserverManager$a;", "stepDataListener", "<init>", "()V", "Companion", "a", "health_seedlingcard_release"}, k = 1, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nSeedingMainHomeHealthAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SeedingMainHomeHealthAdapter.kt\ncom/health/health_seedlingcard/adapter/SeedingMainHomeHealthAdapter\n+ 2 LockUtils.kt\ncom/heytap/health/devicemanager/lock/LockUtilsKt\n*L\n1#1,287:1\n32#2,11:288\n19#2,11:299\n19#2,11:310\n19#2,11:321\n19#2,11:332\n19#2,11:343\n32#2,11:354\n*S KotlinDebug\n*F\n+ 1 SeedingMainHomeHealthAdapter.kt\ncom/health/health_seedlingcard/adapter/SeedingMainHomeHealthAdapter\n*L\n83#1:288,11\n94#1:299,11\n112#1:310,11\n132#1:321,11\n150#1:332,11\n242#1:343,11\n49#1:354,11\n*E\n"})
public final class SeedingMainHomeHealthAdapter implements qy9 {

    @Nullable
    public JSONObject j;
    public long l;

    @NotNull
    public final LockList<SeedlingCard> i = new LockList<>();

    @NotNull
    public LockList<SeedlingCard> k = new LockList<>();

    @NotNull
    public final StepDataObserverManager.a m = new StepDataObserverManager.a() { // from class: com.oplus.aiunit.vision.fug
        public final void a() {
            SeedingMainHomeHealthAdapter.g(this.a);
        }
    };

    public static final void g(SeedingMainHomeHealthAdapter seedingMainHomeHealthAdapter) {
        Intrinsics.checkNotNullParameter(seedingMainHomeHealthAdapter, "this$0");
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (jCurrentTimeMillis - seedingMainHomeHealthAdapter.l > 3000) {
            m8b.f("SeedingMainHomeHealth", "send data to seedling card when sport data changed");
            m8b.f("SeedingMainHomeHealth", "send data to seedling card size = " + seedingMainHomeHealthAdapter.i.size());
            seedingMainHomeHealthAdapter.l = jCurrentTimeMillis;
            LockList<SeedlingCard> lockList = seedingMainHomeHealthAdapter.i;
            try {
                g7b.a("", "readLock");
                lockList.readLock();
                for (Object obj : lockList) {
                    Intrinsics.checkNotNullExpressionValue(obj, "it");
                    SeedlingCard seedlingCard = (SeedlingCard) obj;
                    seedingMainHomeHealthAdapter.e(seedlingCard, seedlingCard.getUpkVersionCode());
                }
                Unit unit = Unit.INSTANCE;
            } finally {
                lockList.readUnLock();
                g7b.a("", "readUnLock");
            }
        }
    }

    public static /* synthetic */ void j(SeedingMainHomeHealthAdapter seedingMainHomeHealthAdapter, SeedlingCard seedlingCard, JSONObject jSONObject, SeedlingCardOptions seedlingCardOptions, int i, Object obj) {
        if ((i & 4) != 0) {
            seedlingCardOptions = null;
        }
        seedingMainHomeHealthAdapter.i(seedlingCard, jSONObject, seedlingCardOptions);
    }

    public final void b(SeedlingCard card) {
        boolean z;
        LockList<SeedlingCard> lockList = this.k;
        try {
            g7b.a("", "writeLock");
            lockList.writeLock();
            Iterator it = lockList.iterator();
            Intrinsics.checkNotNullExpressionValue(it, "it.iterator()");
            while (true) {
                if (!it.hasNext()) {
                    z = true;
                    break;
                }
                SeedlingCard seedlingCard = (SeedlingCard) it.next();
                if (Intrinsics.areEqual(seedlingCard.getServiceId(), card.getServiceId()) && seedlingCard.getCardId() == card.getCardId() && seedlingCard.getCardIndex() == card.getCardIndex() && seedlingCard.getHost().getHostId() == card.getHost().getHostId()) {
                    z = false;
                    break;
                }
            }
            if (z) {
                lockList.add(card);
            }
            m8b.f("SeedingMainHomeHealth", "on seedling card add is = " + z + " ");
            Unit unit = Unit.INSTANCE;
        } finally {
            lockList.writeUnLock();
            g7b.a("", "writeUnLock");
        }
    }

    public void c(@NotNull Map<String, qy9> adapters) {
        Intrinsics.checkNotNullParameter(adapters, "adapters");
        m8b.f("SeedingMainHomeHealth", "register");
        adapters.put(jug.REACH_STEP_GOAL_SID, this);
        adapters.put(jug.CURRENT_STEP_SID, this);
        adapters.put(jug.SYNC_WERUN_STEPS_SID, this);
        adapters.put(jug.STEP_ACHIEVEMENTS_SID, this);
        adapters.put(jug.WEEKLY_STEP_REPORT_SID, this);
        adapters.put(jug.LATEST_SLEEP_DATA_SID, this);
        adapters.put(jug.SLEEP_REMINDER_SID, this);
    }

    public final void d() {
        m8b.f("SeedingMainHomeHealth", "register seedling card sport data change Event");
        StepDataObserverManager.INSTANCE.addListener(this.m);
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public final void e(final SeedlingCard card, long upkVersionCode) throws JSONException {
        boolean zI = i7k.I();
        boolean zX = i7k.x();
        Context contextA = e88.a();
        StringBuilder sb = new StringBuilder();
        sb.append("seedling card isPermission = ");
        sb.append(!zI);
        sb.append("  isLogin = ");
        sb.append(!zX);
        m8b.f("SeedingMainHomeHealth", sb.toString());
        if (!Intrinsics.areEqual(card.getServiceId(), jug.SLEEP_REMINDER_SID) && (zI || zX)) {
            Intrinsics.checkNotNullExpressionValue(contextA, "context");
            f(contextA, 0);
        }
        boolean z = zI || zX;
        String serviceId = card.getServiceId();
        int iHashCode = serviceId.hashCode();
        if (iHashCode == -857767536) {
            if (serviceId.equals(jug.REACH_STEP_GOAL_SID)) {
                j(this, card, SeedlingCardDataToShowHelper.g(z), null, 4, null);
            }
            return;
        }
        if (iHashCode == -857766826) {
            if (serviceId.equals(jug.SLEEP_REMINDER_SID) && this.j == null) {
                this.j = SeedlingCardDataToShowHelper.d();
                for (Object obj : this.k) {
                    Intrinsics.checkNotNullExpressionValue(obj, "subscribCardList");
                    if (Intrinsics.areEqual(((SeedlingCard) obj).getServiceId(), jug.SLEEP_REMINDER_SID)) {
                        j(this, card, this.j, null, 4, null);
                    }
                }
                return;
            }
            return;
        }
        switch (iHashCode) {
            case -857767514:
                if (serviceId.equals(jug.STEP_ACHIEVEMENTS_SID)) {
                    SeedlingCardDataToShowHelper.e(null, zX).a(new Function1<dyf<JSONObject>, Unit>() { // from class: com.health.health_seedlingcard.adapter.SeedingMainHomeHealthAdapter$sendDataToSeedlingCard$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(1);
                        }

                        public /* bridge */ /* synthetic */ Object invoke(Object obj2) {
                            invoke((dyf<JSONObject>) obj2);
                            return Unit.INSTANCE;
                        }

                        public final void invoke(@NotNull dyf<JSONObject> dyfVar) {
                            Intrinsics.checkNotNullParameter(dyfVar, "it");
                            SeedingMainHomeHealthAdapter.j(this.this$0, card, (JSONObject) dyfVar.b(), null, 4, null);
                        }
                    });
                    break;
                }
                break;
            case -857767513:
                if (serviceId.equals(jug.WEEKLY_STEP_REPORT_SID)) {
                    SeedlingCardDataToShowHelper.i(card, zX).a(new Function1<dyf<JSONObject>, Unit>() { // from class: com.health.health_seedlingcard.adapter.SeedingMainHomeHealthAdapter$sendDataToSeedlingCard$2
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(1);
                        }

                        public /* bridge */ /* synthetic */ Object invoke(Object obj2) {
                            invoke((dyf<JSONObject>) obj2);
                            return Unit.INSTANCE;
                        }

                        public final void invoke(@NotNull dyf<JSONObject> dyfVar) {
                            Intrinsics.checkNotNullParameter(dyfVar, "it");
                            SeedingMainHomeHealthAdapter.j(this.this$0, card, (JSONObject) dyfVar.b(), null, 4, null);
                        }
                    });
                    break;
                }
                break;
            case -857767512:
                if (serviceId.equals(jug.SYNC_WERUN_STEPS_SID)) {
                    j(this, card, SeedlingCardDataToShowHelper.f(z), null, 4, null);
                    break;
                }
                break;
            case -857767511:
                if (serviceId.equals(jug.CURRENT_STEP_SID)) {
                    j(this, card, SeedlingCardDataToShowHelper.h(z), null, 4, null);
                    break;
                }
                break;
            case -857767510:
                if (serviceId.equals(jug.LATEST_SLEEP_DATA_SID)) {
                    SeedlingCardDataToShowHelper.c(card, upkVersionCode, zX).a(new Function1<dyf<JSONObject>, Unit>() { // from class: com.health.health_seedlingcard.adapter.SeedingMainHomeHealthAdapter$sendDataToSeedlingCard$3
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(1);
                        }

                        public /* bridge */ /* synthetic */ Object invoke(Object obj2) {
                            invoke((dyf<JSONObject>) obj2);
                            return Unit.INSTANCE;
                        }

                        public final void invoke(@NotNull dyf<JSONObject> dyfVar) {
                            Intrinsics.checkNotNullParameter(dyfVar, "it");
                            SeedingMainHomeHealthAdapter.j(this.this$0, card, (JSONObject) dyfVar.b(), null, 4, null);
                        }
                    });
                    break;
                }
                break;
        }
    }

    public final void f(Context context, int state) throws JSONException {
        long jCurrentTimeMillis = System.currentTimeMillis();
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("state", state);
        SeedlingTool.INSTANCE.updateIntelligentData(context, new IntelligentData(jCurrentTimeMillis, 10105, jug.PERMISSION_STATE_EVENT, jSONObject, (JSONObject) null, (SeedlingCardOptions) null, (String) null, 112, (DefaultConstructorMarker) null));
        m8b.f("SeedingMainHomeHealth", "send health permission state data to smart brain = " + state);
    }

    public final void h() {
        m8b.f("SeedingMainHomeHealth", "unregister seedling card sport data change Event");
        StepDataObserverManager.INSTANCE.removeListener(this.m);
    }

    public final void i(SeedlingCard card, JSONObject businessData, SeedlingCardOptions cardOptions) {
        SeedlingTool.INSTANCE.updateData(card, businessData, cardOptions);
    }

    public void onCardCreate(@NotNull Context context, @NotNull SeedlingCard card) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(card, "card");
    }

    public void onCardObserve(@NotNull Context context, @NotNull String clientName, @NotNull List<SeedlingCard> cards) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(clientName, "clientName");
        Intrinsics.checkNotNullParameter(cards, "cards");
        m8b.f("SeedingMainHomeHealth", "on seedling card onCardObserve " + cards);
        LockList<SeedlingCard> lockList = this.k;
        try {
            g7b.a("", "writeLock");
            lockList.writeLock();
            lockList.clear();
            lockList.addAll(cards);
        } finally {
            lockList.writeUnLock();
            g7b.a("", "writeUnLock");
        }
    }

    public void onDestroy(@NotNull Context context, @NotNull SeedlingCard card) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(card, "card");
    }

    public void onHide(@NotNull Context context, @NotNull SeedlingCard card) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(card, "card");
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public void onShow(@NotNull Context context, @NotNull SeedlingCard card) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(card, "card");
        m8b.f("SeedingMainHomeHealth", "on seedling card onShow " + card);
        b(card);
        LockList<SeedlingCard> lockList = this.k;
        try {
            g7b.a("", "readLock");
            lockList.readLock();
            for (Object obj : lockList) {
                Intrinsics.checkNotNullExpressionValue(obj, "it");
                SeedlingCard seedlingCard = (SeedlingCard) obj;
                if (Intrinsics.areEqual(card.getServiceId(), seedlingCard.getServiceId())) {
                    e(seedlingCard, card.getUpkVersionCode());
                }
            }
            Unit unit = Unit.INSTANCE;
            lockList.readUnLock();
            g7b.a("", "readUnLock");
            String serviceId = card.getServiceId();
            switch (serviceId.hashCode()) {
                case -857767536:
                    if (!serviceId.equals(jug.REACH_STEP_GOAL_SID)) {
                        return;
                    }
                    break;
                case -857767512:
                    if (!serviceId.equals(jug.SYNC_WERUN_STEPS_SID)) {
                        return;
                    }
                    break;
                case -857767511:
                    if (!serviceId.equals(jug.CURRENT_STEP_SID)) {
                        return;
                    }
                    break;
                default:
                    return;
            }
            LockList<SeedlingCard> lockList2 = this.i;
            try {
                g7b.a("", "writeLock");
                lockList2.writeLock();
                if (!lockList2.contains(card)) {
                    lockList2.add(card);
                }
            } finally {
                lockList2.writeUnLock();
                g7b.a("", "writeUnLock");
            }
        } catch (Throwable th) {
            lockList.readUnLock();
            g7b.a("", "readUnLock");
            throw th;
        }
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public void onSubscribed(@NotNull Context context, @NotNull SeedlingCard card) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(card, "card");
        m8b.f("SeedingMainHomeHealth", "on seedling card onSubscribed " + card);
        String serviceId = card.getServiceId();
        switch (serviceId.hashCode()) {
            case -857767536:
                if (!serviceId.equals(jug.REACH_STEP_GOAL_SID)) {
                    return;
                }
                break;
            case -857767512:
                if (!serviceId.equals(jug.SYNC_WERUN_STEPS_SID)) {
                    return;
                }
                break;
            case -857767511:
                if (!serviceId.equals(jug.CURRENT_STEP_SID)) {
                    return;
                }
                break;
            default:
                return;
        }
        h();
        d();
        LockList<SeedlingCard> lockList = this.i;
        try {
            g7b.a("", "writeLock");
            lockList.writeLock();
            if (!lockList.contains(card)) {
                lockList.add(card);
            }
            Unit unit = Unit.INSTANCE;
        } finally {
            lockList.writeUnLock();
            g7b.a("", "writeUnLock");
        }
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public void onUnSubscribed(@NotNull Context context, @NotNull SeedlingCard card) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(card, "card");
        m8b.f("SeedingMainHomeHealth", "on seedling card onUnSubscribed " + card);
        String serviceId = card.getServiceId();
        switch (serviceId.hashCode()) {
            case -857767536:
                if (!serviceId.equals(jug.REACH_STEP_GOAL_SID)) {
                    return;
                }
                break;
            case -857767512:
                if (!serviceId.equals(jug.SYNC_WERUN_STEPS_SID)) {
                    return;
                }
                break;
            case -857767511:
                if (!serviceId.equals(jug.CURRENT_STEP_SID)) {
                    return;
                }
                break;
            case -857766826:
                if (serviceId.equals(jug.SLEEP_REMINDER_SID)) {
                    this.j = null;
                    return;
                }
                return;
            default:
                return;
        }
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
            if (this.i.size() < 1) {
                h();
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
    }
}
