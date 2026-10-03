package com.oplus.aiunit.vision;

import androidx.exifinterface.media.ExifInterface;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u000f\u0010\u0010J+\u0010\u0007\u001a\u00020\u0006\"\u0004\b\u0000\u0010\u00022\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u00032\u0006\u0010\u0005\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u0007\u0010\bJ%\u0010\t\u001a\u0004\u0018\u00018\u0000\"\u0004\b\u0000\u0010\u00022\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003H\u0016¢\u0006\u0004\b\t\u0010\nR \u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u00010\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\r¨\u0006\u0011"}, d2 = {"Lcom/oplus/aiunit/vision/c89;", "", ExifInterface.GPS_DIRECTION_TRUE, "Ljava/lang/Class;", "clazz", "impl", "", "b", "(Ljava/lang/Class;Ljava/lang/Object;)V", "a", "(Ljava/lang/Class;)Ljava/lang/Object;", "", "", "Ljava/util/Map;", "serviceMap", "<init>", "()V", "com.heytap.nearx.common"}, k = 1, mv = {1, 4, 0})
public final class c89 {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    public final Map<String, Object> serviceMap = new ConcurrentHashMap();

    @Nullable
    public <T> T a(@NotNull Class<T> clazz) {
        Intrinsics.checkNotNullParameter(clazz, "clazz");
        return (T) this.serviceMap.get(clazz.getName());
    }

    public <T> void b(@NotNull Class<T> clazz, T impl) {
        Intrinsics.checkNotNullParameter(clazz, "clazz");
        if (impl != null) {
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
}
