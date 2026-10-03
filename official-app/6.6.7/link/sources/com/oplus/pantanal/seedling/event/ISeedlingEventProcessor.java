package com.oplus.pantanal.seedling.event;

import android.content.Context;
import com.oplus.pantanal.seedling.bean.SeedlingCardEvent;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes8.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H&¨\u0006\bÀ\u0006\u0003"}, d2 = {"Lcom/oplus/pantanal/seedling/event/ISeedlingEventProcessor;", "", "handleEvent", "", "context", "Landroid/content/Context;", "event", "Lcom/oplus/pantanal/seedling/bean/SeedlingCardEvent;", "seedling-support_manualRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
public interface ISeedlingEventProcessor {
    void handleEvent(@NotNull Context context, @NotNull SeedlingCardEvent event);
}
