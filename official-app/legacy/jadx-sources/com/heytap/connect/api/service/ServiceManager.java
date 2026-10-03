package com.heytap.connect.api.service;

import androidx.exifinterface.media.ExifInterface;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0015\u0010\u0016J+\u0010\u0007\u001a\u00020\u0006\"\u0004\b\u0000\u0010\u00022\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u00032\u0006\u0010\u0005\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u0007\u0010\bJ/\u0010\n\u001a\u0004\u0018\u00018\u0000\"\u0004\b\u0000\u0010\u00022\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u00032\b\u0010\t\u001a\u0004\u0018\u00018\u0000H\u0016¢\u0006\u0004\b\n\u0010\u000bJ#\u0010\r\u001a\u00020\f\"\u0004\b\u0000\u0010\u00022\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003H\u0016¢\u0006\u0004\b\r\u0010\u000eJ)\u0010\u000f\u001a\u00020\u0006\"\u0004\b\u0000\u0010\u00022\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u00032\u0006\u0010\u0005\u001a\u00028\u0000¢\u0006\u0004\b\u000f\u0010\bR\"\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u00120\u00108\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014¨\u0006\u0017"}, d2 = {"Lcom/heytap/connect/api/service/ServiceManager;", "Lcom/heytap/connect/api/service/ServiceProvider;", ExifInterface.GPS_DIRECTION_TRUE, "Ljava/lang/Class;", "clazz", "impl", "", "registerService", "(Ljava/lang/Class;Ljava/lang/Object;)V", "default", "getService", "(Ljava/lang/Class;Ljava/lang/Object;)Ljava/lang/Object;", "", "containService", "(Ljava/lang/Class;)Z", "registerIfNone", "", "", "", "serviceMap", "Ljava/util/Map;", "<init>", "()V", "connect_release"}, k = 1, mv = {1, 5, 1})
public final class ServiceManager implements ServiceProvider {

    @NotNull
    private final Map<String, Object> serviceMap = new ConcurrentHashMap();

    @Override // com.heytap.connect.api.service.ServiceProvider
    public <T> boolean containService(@NotNull Class<T> clazz) {
        Intrinsics.checkNotNullParameter(clazz, "clazz");
        return this.serviceMap.containsKey(clazz.getName());
    }

    @Override // com.heytap.connect.api.service.ServiceProvider
    @Nullable
    public <T> T getService(@NotNull Class<T> clazz, @Nullable T t) {
        Intrinsics.checkNotNullParameter(clazz, "clazz");
        return this.serviceMap.containsKey(clazz.getName()) ? (T) this.serviceMap.get(clazz.getName()) : t;
    }

    public final <T> void registerIfNone(@NotNull Class<T> clazz, T impl) {
        Intrinsics.checkNotNullParameter(clazz, "clazz");
        if (this.serviceMap.containsKey(clazz.getName())) {
            return;
        }
        registerService(clazz, impl);
    }

    @Override // com.heytap.connect.api.service.ServiceProvider
    public <T> void registerService(@NotNull Class<T> clazz, T impl) {
        Intrinsics.checkNotNullParameter(clazz, "clazz");
        if (impl != null) {
            if (clazz.isInstance(impl)) {
                Map<String, Object> map = this.serviceMap;
                String name = clazz.getName();
                Intrinsics.checkNotNullExpressionValue(name, "clazz.name");
                map.put(name, impl);
                return;
            }
            throw new IllegalArgumentException(("make sure you have correct service, current " + impl + " is not instance of " + clazz).toString());
        }
    }
}
