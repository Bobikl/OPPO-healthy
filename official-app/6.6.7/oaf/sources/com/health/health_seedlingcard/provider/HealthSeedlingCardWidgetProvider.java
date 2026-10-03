package com.health.health_seedlingcard.provider;

import android.content.Context;
import android.os.Bundle;
import com.health.health_seedlingcard.adapter.SeedingMainHomeHealthAdapter;
import com.health.health_seedlingcard.adapter.SportsRecordAdapter;
import com.health.health_seedlingcard.adapter.StepSecondaryHomeAdapter;
import com.oplus.aiunit.vision.m8b;
import com.oplus.aiunit.vision.qy9;
import com.oplus.pantanal.seedling.SeedlingCardWidgetProvider;
import com.oplus.pantanal.seedling.bean.SeedlingCard;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes14.dex */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\b\u0007\u0018\u0000 \u001d2\u00020\u0001:\u0001\u001eB\u0007¢\u0006\u0004\b\u001b\u0010\u001cJ\u001e\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0002J\u0012\u0010\u000b\u001a\u0004\u0018\u00010\n2\u0006\u0010\t\u001a\u00020\u0005H\u0002J\u0018\u0010\f\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\u0005H\u0016J&\u0010\u000f\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\r2\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0016J\u0018\u0010\u0010\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\u0005H\u0016J\u0018\u0010\u0011\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\u0005H\u0016J\u0018\u0010\u0012\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\u0005H\u0016J\u0018\u0010\u0013\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\u0005H\u0016J\u0018\u0010\u0014\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\u0005H\u0016J \u0010\u0017\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\u00052\u0006\u0010\u0016\u001a\u00020\u0015H\u0016R \u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\n0\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001a¨\u0006\u001f"}, d2 = {"Lcom/health/health_seedlingcard/provider/HealthSeedlingCardWidgetProvider;", "Lcom/oplus/pantanal/seedling/SeedlingCardWidgetProvider;", "Landroid/content/Context;", "context", "", "Lcom/oplus/pantanal/seedling/bean/SeedlingCard;", "cards", "", "dispatchObserve", "card", "Lcom/oplus/aiunit/vision/qy9;", "adapter", "onCardCreate", "", "clientName", "onCardObserve", "onDestroy", "onHide", "onShow", "onSubscribed", "onUnSubscribed", "Landroid/os/Bundle;", "data", "onUpdateData", "", "mAdapters", "Ljava/util/Map;", "<init>", "()V", "Companion", "a", "health_seedlingcard_release"}, k = 1, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nHealthSeedlingCardWidgetProvider.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HealthSeedlingCardWidgetProvider.kt\ncom/health/health_seedlingcard/provider/HealthSeedlingCardWidgetProvider\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n*L\n1#1,123:1\n1855#2,2:124\n215#3,2:126\n*S KotlinDebug\n*F\n+ 1 HealthSeedlingCardWidgetProvider.kt\ncom/health/health_seedlingcard/provider/HealthSeedlingCardWidgetProvider\n*L\n60#1:124,2\n67#1:126,2\n*E\n"})
public final class HealthSeedlingCardWidgetProvider extends SeedlingCardWidgetProvider {

    @NotNull
    public static final String TAG = "HealthSeedlingProvider";

    @NotNull
    private final Map<String, qy9> mAdapters;

    public HealthSeedlingCardWidgetProvider() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        this.mAdapters = linkedHashMap;
        new SeedingMainHomeHealthAdapter().c(linkedHashMap);
        new StepSecondaryHomeAdapter().e(linkedHashMap);
        new SportsRecordAdapter().i(linkedHashMap);
    }

    private final qy9 adapter(SeedlingCard card) {
        return this.mAdapters.get(card.getServiceId());
    }

    private final void dispatchObserve(Context context, List<SeedlingCard> cards) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (SeedlingCard seedlingCard : cards) {
            qy9 qy9VarAdapter = adapter(seedlingCard);
            if (qy9VarAdapter != null) {
                if (!linkedHashMap.containsKey(qy9VarAdapter)) {
                    linkedHashMap.put(qy9VarAdapter, new ArrayList());
                }
                List list = (List) linkedHashMap.get(qy9VarAdapter);
                if (list != null) {
                    list.add(seedlingCard);
                }
            }
        }
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            ((qy9) entry.getKey()).onCardObserve(context, "", (List) entry.getValue());
        }
    }

    public void onCardCreate(@NotNull Context context, @NotNull SeedlingCard card) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(card, "card");
        m8b.f(TAG, "onCardCreate " + card);
        qy9 qy9VarAdapter = adapter(card);
        if (qy9VarAdapter != null) {
            qy9VarAdapter.onCardCreate(context, card);
        }
    }

    public void onCardObserve(@NotNull Context context, @NotNull String clientName, @NotNull List<SeedlingCard> cards) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(clientName, "clientName");
        Intrinsics.checkNotNullParameter(cards, "cards");
        m8b.f(TAG, "onCardObserve " + cards);
        dispatchObserve(context, cards);
    }

    public void onDestroy(@NotNull Context context, @NotNull SeedlingCard card) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(card, "card");
        m8b.f(TAG, "onDestroy " + card);
        qy9 qy9VarAdapter = adapter(card);
        if (qy9VarAdapter != null) {
            qy9VarAdapter.onDestroy(context, card);
        }
    }

    public void onHide(@NotNull Context context, @NotNull SeedlingCard card) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(card, "card");
        m8b.f(TAG, "onHide " + card);
        qy9 qy9VarAdapter = adapter(card);
        if (qy9VarAdapter != null) {
            qy9VarAdapter.onHide(context, card);
        }
    }

    public void onShow(@NotNull Context context, @NotNull SeedlingCard card) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(card, "card");
        m8b.f(TAG, "onShow " + card);
        qy9 qy9VarAdapter = adapter(card);
        if (qy9VarAdapter != null) {
            qy9VarAdapter.onShow(context, card);
        }
    }

    public void onSubscribed(@NotNull Context context, @NotNull SeedlingCard card) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(card, "card");
        m8b.f(TAG, "onSubscribed " + card);
        qy9 qy9VarAdapter = adapter(card);
        if (qy9VarAdapter != null) {
            qy9VarAdapter.onSubscribed(context, card);
        }
    }

    public void onUnSubscribed(@NotNull Context context, @NotNull SeedlingCard card) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(card, "card");
        m8b.f(TAG, "onUnSubscribed " + card);
        qy9 qy9VarAdapter = adapter(card);
        if (qy9VarAdapter != null) {
            qy9VarAdapter.onUnSubscribed(context, card);
        }
    }

    public void onUpdateData(@NotNull Context context, @NotNull SeedlingCard card, @NotNull Bundle data) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(card, "card");
        Intrinsics.checkNotNullParameter(data, "data");
        m8b.f(TAG, "onUpdateData " + card);
        qy9 qy9VarAdapter = adapter(card);
        if (qy9VarAdapter != null) {
            qy9VarAdapter.onUpdateData(context, card, data);
        }
    }
}
