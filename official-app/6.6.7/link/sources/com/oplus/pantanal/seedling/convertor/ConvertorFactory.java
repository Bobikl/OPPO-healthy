package com.oplus.pantanal.seedling.convertor;

import com.oplus.smartenginehelper.ParserTag;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes8.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J:\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u0002H\b\u0012\u0004\u0012\u0002H\t0\u0006\"\u0004\b\u0000\u0010\b\"\u0004\b\u0001\u0010\t2\u001a\u0010\n\u001a\u0016\u0012\u0012\b\u0001\u0012\u000e\u0012\u0004\u0012\u0002H\b\u0012\u0004\u0012\u0002H\t0\u00060\u0005R2\u0010\u0003\u001a&\u0012\u0014\u0012\u0012\u0012\u000e\b\u0001\u0012\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u00060\u0005\u0012\f\u0012\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u00060\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000b"}, d2 = {"Lcom/oplus/pantanal/seedling/convertor/ConvertorFactory;", "", "()V", "factoryCache", "Ljava/util/concurrent/ConcurrentHashMap;", "Ljava/lang/Class;", "Lcom/oplus/pantanal/seedling/convertor/IConvertor;", ParserTag.TAG_GET, "T", "R", "clazz", "seedling-support_manualRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class ConvertorFactory {

    @NotNull
    public static final ConvertorFactory INSTANCE = new ConvertorFactory();

    @NotNull
    private static final ConcurrentHashMap<Class<? extends IConvertor<?, ?>>, IConvertor<?, ?>> factoryCache = new ConcurrentHashMap<>();

    private ConvertorFactory() {
    }

    @NotNull
    public final <T, R> IConvertor<T, R> get(@NotNull Class<? extends IConvertor<T, R>> clazz) throws IllegalAccessException, InstantiationException {
        Intrinsics.checkNotNullParameter(clazz, "clazz");
        ConcurrentHashMap<Class<? extends IConvertor<?, ?>>, IConvertor<?, ?>> concurrentHashMap = factoryCache;
        IConvertor<T, R> iConvertorNewInstance = (IConvertor) concurrentHashMap.get(clazz);
        if (iConvertorNewInstance == null) {
            iConvertorNewInstance = clazz.newInstance();
            Intrinsics.checkNotNull(iConvertorNewInstance);
            concurrentHashMap.put((Class<? extends IConvertor<?, ?>>) clazz, (IConvertor<?, ?>) iConvertorNewInstance);
        }
        Intrinsics.checkNotNull(iConvertorNewInstance, "null cannot be cast to non-null type com.oplus.pantanal.seedling.convertor.IConvertor<T of com.oplus.pantanal.seedling.convertor.ConvertorFactory.get, R of com.oplus.pantanal.seedling.convertor.ConvertorFactory.get>");
        return iConvertorNewInstance;
    }
}
