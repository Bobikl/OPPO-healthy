package com.heytap.connect.api.service;

import androidx.exifinterface.media.ExifInterface;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J+\u0010\u0007\u001a\u00020\u0006\"\u0004\b\u0000\u0010\u00022\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u00032\u0006\u0010\u0005\u001a\u00028\u0000H&¢\u0006\u0004\b\u0007\u0010\bJ1\u0010\n\u001a\u0004\u0018\u00018\u0000\"\u0004\b\u0000\u0010\u00022\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00018\u0000H&¢\u0006\u0004\b\n\u0010\u000bJ#\u0010\r\u001a\u00020\f\"\u0004\b\u0000\u0010\u00022\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003H&¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lcom/heytap/connect/api/service/ServiceProvider;", "", ExifInterface.GPS_DIRECTION_TRUE, "Ljava/lang/Class;", "clazz", "impl", "", "registerService", "(Ljava/lang/Class;Ljava/lang/Object;)V", "default", "getService", "(Ljava/lang/Class;Ljava/lang/Object;)Ljava/lang/Object;", "", "containService", "(Ljava/lang/Class;)Z", "connect_release"}, k = 1, mv = {1, 5, 1})
public interface ServiceProvider {

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    public static final class DefaultImpls {
        public static /* synthetic */ Object getService$default(ServiceProvider serviceProvider, Class cls, Object obj, int i, Object obj2) {
            if (obj2 != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getService");
            }
            if ((i & 2) != 0) {
                obj = null;
            }
            return serviceProvider.getService(cls, obj);
        }
    }

    <T> boolean containService(@NotNull Class<T> clazz);

    @Nullable
    <T> T getService(@NotNull Class<T> clazz, @Nullable T t);

    <T> void registerService(@NotNull Class<T> clazz, T impl);
}
