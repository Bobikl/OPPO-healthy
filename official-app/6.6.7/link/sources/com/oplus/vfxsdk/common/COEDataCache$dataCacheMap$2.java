package com.oplus.vfxsdk.common;

import java.util.concurrent.ConcurrentHashMap;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes8.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "Ljava/util/concurrent/ConcurrentHashMap;", "", "Lcom/oplus/vfxsdk/common/COEData;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
final class COEDataCache$dataCacheMap$2 extends Lambda implements Function0<ConcurrentHashMap<String, COEData>> {
    public static final COEDataCache$dataCacheMap$2 INSTANCE = new COEDataCache$dataCacheMap$2();

    public COEDataCache$dataCacheMap$2() {
        super(0);
    }

    @NotNull
    public final ConcurrentHashMap<String, COEData> invoke() {
        return new ConcurrentHashMap<>();
    }
}
