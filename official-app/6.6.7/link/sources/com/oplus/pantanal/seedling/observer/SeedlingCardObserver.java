package com.oplus.pantanal.seedling.observer;

import android.content.Context;
import com.oplus.pantanal.seedling.bean.SeedlingCard;
import com.oplus.pantanal.seedling.constants.Constants;
import com.oplus.pantanal.seedling.update.SeedlingUpdateManager;
import com.oplus.pantanal.seedling.util.Logger;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes8.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J&\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\nH\u0016¨\u0006\f"}, d2 = {"Lcom/oplus/pantanal/seedling/observer/SeedlingCardObserver;", "Lcom/oplus/pantanal/seedling/observer/BaseSeedlingCardObserver;", "()V", "onCardObserve", "", "context", "Landroid/content/Context;", "clientName", "", "cards", "", "Lcom/oplus/pantanal/seedling/bean/SeedlingCard;", "seedling-support_manualRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nSeedlingCardObserver.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SeedlingCardObserver.kt\ncom/oplus/pantanal/seedling/observer/SeedlingCardObserver\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,33:1\n1549#2:34\n1620#2,3:35\n1855#2,2:38\n*S KotlinDebug\n*F\n+ 1 SeedlingCardObserver.kt\ncom/oplus/pantanal/seedling/observer/SeedlingCardObserver\n*L\n26#1:34\n26#1:35,3\n29#1:38,2\n*E\n"})
public final class SeedlingCardObserver extends BaseSeedlingCardObserver {
    @Override // com.oplus.pantanal.seedling.observer.ISeedlingCardObserver
    public void onCardObserve(@NotNull Context context, @NotNull String clientName, @NotNull List<SeedlingCard> cards) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(clientName, "clientName");
        Intrinsics.checkNotNullParameter(cards, "cards");
        Logger logger = Logger.INSTANCE;
        int size = cards.size();
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(cards, 10));
        Iterator<T> it = cards.iterator();
        while (it.hasNext()) {
            arrayList.add(SeedlingCard.getCardUniqueKey$seedling_support_manualRelease$default((SeedlingCard) it.next(), false, 1, null));
        }
        logger.i(Constants.TAG, "SeedlingUpdateManager onCardObserve size:" + size + ",CardUniqueKeyList:" + arrayList);
        SeedlingUpdateManager.INSTANCE.getINSTANCE().getMCardCache().updateCardObserveList$seedling_support_manualRelease(clientName, cards);
        Iterator<T> it2 = getObserverList().iterator();
        while (it2.hasNext()) {
            ((ISeedlingCardObserver) it2.next()).onCardObserve(context, clientName, cards);
        }
    }
}
