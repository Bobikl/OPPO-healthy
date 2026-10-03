package com.health.health_seedlingcard.adapter;

import android.content.Context;
import android.os.Bundle;
import com.health.health_seedlingcard.adapter.StepSecondaryHomeAdapter;
import com.health.health_seedlingcard.model.StepSecondaryMode;
import com.health.health_seedlingcard.utlis.b;
import com.heytap.health.core.provider.StepDataObserverManager;
import com.oplus.aiunit.vision.i7k;
import com.oplus.aiunit.vision.jug;
import com.oplus.aiunit.vision.m8b;
import com.oplus.aiunit.vision.o7k;
import com.oplus.aiunit.vision.ot8;
import com.oplus.aiunit.vision.qy9;
import com.oplus.pantanal.seedling.bean.SeedlingCard;
import com.oplus.pantanal.seedling.update.SeedlingCardOptions;
import com.oplus.pantanal.seedling.util.SeedlingTool;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes14.dex */
@Metadata(d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010!\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u0000 32\u00020\u0001:\u00014B\u0007¢\u0006\u0004\b1\u00102J\u001c\u0010\u0006\u001a\u00020\u00052\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00010\u0002H\u0016J\u0018\u0010\u000b\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tH\u0016J\u0018\u0010\f\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tH\u0016J\u0018\u0010\r\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tH\u0016J\u0018\u0010\u000e\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tH\u0016J\u0018\u0010\u000f\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tH\u0016J \u0010\u0012\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u0011\u001a\u00020\u0010H\u0016J&\u0010\u0016\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\u0013\u001a\u00020\u00032\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\t0\u0014H\u0016J\u0018\u0010\u0017\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tH\u0016J\u0010\u0010\u0018\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0002J\u0010\u0010\u0019\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0002J\b\u0010\u001a\u001a\u00020\u0005H\u0002J\u0012\u0010\u001d\u001a\u00020\u00052\b\u0010\u001c\u001a\u0004\u0018\u00010\u001bH\u0002J\b\u0010\u001f\u001a\u00020\u001eH\u0002R:\u0010#\u001a&\u0012\f\u0012\n !*\u0004\u0018\u00010\t0\t !*\u0012\u0012\f\u0012\n !*\u0004\u0018\u00010\t0\t\u0018\u00010\u00140 8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001a\u0010\"R\u001b\u0010(\u001a\u00020$8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001d\u0010%\u001a\u0004\b&\u0010'R\u0016\u0010,\u001a\u00020)8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b*\u0010+R\u0014\u00100\u001a\u00020-8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b.\u0010/¨\u00065"}, d2 = {"Lcom/health/health_seedlingcard/adapter/StepSecondaryHomeAdapter;", "Lcom/oplus/aiunit/vision/qy9;", "", "", "adapters", "", "e", "Landroid/content/Context;", "context", "Lcom/oplus/pantanal/seedling/bean/SeedlingCard;", "card", "onCardCreate", "onShow", "onHide", "onSubscribed", "onUnSubscribed", "Landroid/os/Bundle;", "data", "onUpdateData", "clientName", "", "cards", "onCardObserve", "onDestroy", "f", "h", "i", "Lorg/json/JSONObject;", "stepJSONObject", "j", "", "d", "", "kotlin.jvm.PlatformType", "Ljava/util/List;", "mSubscribeCardList", "Lcom/health/health_seedlingcard/model/StepSecondaryMode;", "Lkotlin/Lazy;", "c", "()Lcom/health/health_seedlingcard/model/StepSecondaryMode;", "mode", "", "k", "J", "lastChangeStepTime", "Lcom/heytap/health/core/provider/StepDataObserverManager$a;", "l", "Lcom/heytap/health/core/provider/StepDataObserverManager$a;", "stepDataListener", "<init>", "()V", "Companion", "a", "health_seedlingcard_release"}, k = 1, mv = {1, 8, 0})
public final class StepSecondaryHomeAdapter implements qy9 {

    @NotNull
    public static final String TAG = "StepHomeAdapter";
    public static final int UPK_VERSION_SVG = 1000004;
    public long k;
    public List<SeedlingCard> i = Collections.synchronizedList(new ArrayList());

    @NotNull
    public final Lazy j = LazyKt.lazy(new Function0<StepSecondaryMode>() { // from class: com.health.health_seedlingcard.adapter.StepSecondaryHomeAdapter$mode$2
        @NotNull
        public final StepSecondaryMode invoke() {
            return new StepSecondaryMode();
        }
    });

    @NotNull
    public final StepDataObserverManager.a l = new StepDataObserverManager.a() { // from class: com.oplus.aiunit.vision.ywi
        public final void a() {
            StepSecondaryHomeAdapter.g(this.a);
        }
    };

    public static final void g(StepSecondaryHomeAdapter stepSecondaryHomeAdapter) {
        Intrinsics.checkNotNullParameter(stepSecondaryHomeAdapter, "this$0");
        long jAbs = Math.abs(System.currentTimeMillis() - stepSecondaryHomeAdapter.k);
        m8b.f(TAG, "onChange:" + jAbs);
        if (jAbs > 2000) {
            stepSecondaryHomeAdapter.k = System.currentTimeMillis();
            stepSecondaryHomeAdapter.i();
        }
    }

    public final StepSecondaryMode c() {
        return (StepSecondaryMode) this.j.getValue();
    }

    public final boolean d() {
        List listK = ot8.k();
        List list = listK;
        if (!(list == null || list.isEmpty())) {
            m8b.f(TAG, "userDeviceInfoList size:" + listK.size());
            return true;
        }
        boolean zH = o7k.h();
        boolean zG = o7k.g();
        boolean z = !i7k.I();
        m8b.f(TAG, "agreeHealth:" + zH + " ," + zG + " ," + z);
        return (zH || zG) && z;
    }

    public void e(@NotNull Map<String, qy9> adapters) {
        Intrinsics.checkNotNullParameter(adapters, "adapters");
        m8b.f(TAG, "register");
        adapters.put(jug.SECONDARY_STEP_SID, this);
    }

    public final void f(Context context) {
        m8b.f(TAG, "registerContentObserver");
        StepDataObserverManager.INSTANCE.addListener(this.l);
    }

    public final void h(Context context) {
        m8b.f(TAG, "unregisterContentObserver");
        StepDataObserverManager.INSTANCE.removeListener(this.l);
    }

    public final void i() {
        if (this.i.isEmpty()) {
            m8b.f(TAG, "subscribe card is empty");
            return;
        }
        List<SeedlingCard> list = this.i;
        long upkVersionCode = list.get(list.size() - 1).getUpkVersionCode();
        m8b.f(TAG, "upkVersionCode:" + upkVersionCode);
        if (d()) {
            c().e(upkVersionCode, new Function1<JSONObject, Unit>() { // from class: com.health.health_seedlingcard.adapter.StepSecondaryHomeAdapter$updateData$1
                {
                    super(1);
                }

                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    invoke((JSONObject) obj);
                    return Unit.INSTANCE;
                }

                public final void invoke(@NotNull JSONObject jSONObject) {
                    Intrinsics.checkNotNullParameter(jSONObject, "it");
                    this.this$0.j(jSONObject);
                }
            });
        } else {
            j(c().f(upkVersionCode));
        }
    }

    public final void j(JSONObject stepJSONObject) {
        b.INSTANCE.a(TAG, "uiData = " + stepJSONObject);
        m8b.f(TAG, " send UI data to Secondary steps card:" + this.i.size());
        List<SeedlingCard> list = this.i;
        Intrinsics.checkNotNullExpressionValue(list, "mSubscribeCardList");
        synchronized (list) {
            for (SeedlingCard seedlingCard : this.i) {
                StringBuilder sb = new StringBuilder();
                sb.append("item card:");
                sb.append(seedlingCard);
                SeedlingTool seedlingTool = SeedlingTool.INSTANCE;
                Intrinsics.checkNotNullExpressionValue(seedlingCard, "seedlingCard");
                seedlingTool.updateData(seedlingCard, stepJSONObject, (SeedlingCardOptions) null);
            }
            Unit unit = Unit.INSTANCE;
        }
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
        this.i.clear();
        this.i.addAll(cards);
        List<SeedlingCard> list = this.i;
        Intrinsics.checkNotNullExpressionValue(list, "mSubscribeCardList");
        if (!list.isEmpty()) {
            f(context);
        }
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
        m8b.f(TAG, "onShow " + card + " ,size:" + this.i.size());
        if (!this.i.contains(card)) {
            m8b.f(TAG, "add card");
            this.i.add(card);
        }
        if (this.i.isEmpty()) {
            m8b.f(TAG, "add card 2");
            this.i.add(card);
        }
        List<SeedlingCard> list = this.i;
        Intrinsics.checkNotNullExpressionValue(list, "mSubscribeCardList");
        if (!list.isEmpty()) {
            f(context);
        }
        i();
    }

    public void onSubscribed(@NotNull Context context, @NotNull SeedlingCard card) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(card, "card");
        m8b.f(TAG, "onSubscribed " + card);
    }

    public void onUnSubscribed(@NotNull Context context, @NotNull SeedlingCard card) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(card, "card");
        m8b.f(TAG, "onUnSubscribed " + card);
        if (this.i.contains(card)) {
            this.i.remove(card);
        }
        if (this.i.isEmpty()) {
            h(context);
        }
    }

    public void onUpdateData(@NotNull Context context, @NotNull SeedlingCard card, @NotNull Bundle data) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(card, "card");
        Intrinsics.checkNotNullParameter(data, "data");
        m8b.f(TAG, "onUpdateData " + card);
    }
}
