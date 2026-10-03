package com.heytap.nearx.tangramconfig;

import androidx.exifinterface.media.ExifInterface;
import com.heytap.nearx.tangramconfig.api.ServiceProvider;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes17.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u001c\u0010\u0007\u001a\u00020\b\"\u0004\b\u0000\u0010\t2\f\u0010\n\u001a\b\u0012\u0004\u0012\u0002H\t0\u000bH\u0016J#\u0010\f\u001a\u0004\u0018\u0001H\t\"\u0004\b\u0000\u0010\t2\f\u0010\n\u001a\b\u0012\u0004\u0012\u0002H\t0\u000bH\u0016¢\u0006\u0002\u0010\rJ)\u0010\u000e\u001a\u00020\u000f\"\u0004\b\u0000\u0010\t2\f\u0010\n\u001a\b\u0012\u0004\u0012\u0002H\t0\u000b2\u0006\u0010\u0010\u001a\u0002H\tH\u0016¢\u0006\u0002\u0010\u0011R\u001a\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0012"}, d2 = {"Lcom/heytap/nearx/tangramconfig/NearXServiceManager;", "Lcom/heytap/nearx/tangramconfig/api/ServiceProvider;", "()V", "serviceMap", "", "", "", "containService", "", ExifInterface.GPS_DIRECTION_TRUE, "clazz", "Ljava/lang/Class;", "getService", "(Ljava/lang/Class;)Ljava/lang/Object;", "registerService", "", "impl", "(Ljava/lang/Class;Ljava/lang/Object;)V", BuildConfig.LIBRARY_PACKAGE_NAME}, k = 1, mv = {1, 7, 1}, xi = 48)
public final class NearXServiceManager implements ServiceProvider {

    @NotNull
    private final Map<String, Object> serviceMap = new ConcurrentHashMap();

    @Override // com.heytap.nearx.tangramconfig.api.ServiceProvider
    public <T> boolean containService(@NotNull Class<T> clazz) {
        Intrinsics.checkNotNullParameter(clazz, "clazz");
        return this.serviceMap.containsKey(clazz.getName());
    }

    @Override // com.heytap.nearx.tangramconfig.api.ServiceProvider
    @Nullable
    public <T> T getService(@NotNull Class<T> clazz) {
        Intrinsics.checkNotNullParameter(clazz, "clazz");
        return (T) this.serviceMap.get(clazz.getName());
    }

    @Override // com.heytap.nearx.tangramconfig.api.ServiceProvider
    public <T> void registerService(@NotNull Class<T> clazz, T impl) {
        Intrinsics.checkNotNullParameter(clazz, "clazz");
        if (impl == null) {
            return;
        }
        if (clazz.isInstance(impl)) {
            Map<String, Object> map = this.serviceMap;
            String name = clazz.getName();
            Intrinsics.checkNotNullExpressionValue(name, "clazz.name");
            map.put(name, impl);
            return;
        }
        throw new IllegalArgumentException("make sure you have correct service, current " + impl + " is not instance of " + clazz);
    }
}
