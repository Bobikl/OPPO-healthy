package com.oplus.pantanal.seedling.cache;

import com.oplus.pantanal.seedling.bean.SeedlingCard;
import java.util.List;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes8.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\bf\u0018\u00002\u00020\u0001J2\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000bH&¨\u0006\fÀ\u0006\u0003"}, d2 = {"Lcom/oplus/pantanal/seedling/cache/ISeedlingCardCache;", "", "querySeedlingCardList", "", "Lcom/oplus/pantanal/seedling/bean/SeedlingCard;", "serviceId", "", "serviceInstanceId", "isSupportInstanceId", "", "instanceIdMatchType", "", "seedling-support_manualRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
public interface ISeedlingCardCache {

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class DefaultImpls {
    }

    static /* synthetic */ List querySeedlingCardList$default(ISeedlingCardCache iSeedlingCardCache, String str, String str2, boolean z, int i, int i2, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: querySeedlingCardList");
        }
        if ((i2 & 4) != 0) {
            z = false;
        }
        if ((i2 & 8) != 0) {
            i = 1;
        }
        return iSeedlingCardCache.querySeedlingCardList(str, str2, z, i);
    }

    @NotNull
    List<SeedlingCard> querySeedlingCardList(@NotNull String serviceId, @NotNull String serviceInstanceId, boolean isSupportInstanceId, int instanceIdMatchType);
}
