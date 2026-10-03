package com.oplus.pantanal.seedling.observer;

import android.content.Context;
import com.oplus.pantanal.seedling.bean.SeedlingCard;
import java.util.List;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes8.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J&\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\tH&¨\u0006\u000bÀ\u0006\u0003"}, d2 = {"Lcom/oplus/pantanal/seedling/observer/ISeedlingCardObserver;", "", "onCardObserve", "", "context", "Landroid/content/Context;", "clientName", "", "cards", "", "Lcom/oplus/pantanal/seedling/bean/SeedlingCard;", "seedling-support_manualRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
public interface ISeedlingCardObserver {
    void onCardObserve(@NotNull Context context, @NotNull String clientName, @NotNull List<SeedlingCard> cards);
}
