package com.heytap.nearx.cloudconfig.api;

import androidx.exifinterface.media.ExifInterface;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;

/* JADX INFO: loaded from: classes17.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u001c\u0010\u0002\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u00042\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u0002H\u00040\u0006H&J#\u0010\u0007\u001a\u0004\u0018\u0001H\u0004\"\u0004\b\u0000\u0010\u00042\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u0002H\u00040\u0006H&¢\u0006\u0002\u0010\bJ)\u0010\t\u001a\u00020\n\"\u0004\b\u0000\u0010\u00042\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u0002H\u00040\u00062\u0006\u0010\u000b\u001a\u0002H\u0004H&¢\u0006\u0002\u0010\f¨\u0006\r"}, d2 = {"Lcom/heytap/nearx/cloudconfig/api/ServiceProvider;", "", "containService", "", ExifInterface.GPS_DIRECTION_TRUE, "clazz", "Ljava/lang/Class;", "getService", "(Ljava/lang/Class;)Ljava/lang/Object;", "registerService", "", "impl", "(Ljava/lang/Class;Ljava/lang/Object;)V", "com.heytap.nearx.cloudconfig"}, k = 1, mv = {1, 1, 16})
public interface ServiceProvider {
    <T> boolean containService(@NotNull Class<T> clazz);

    @Nullable
    <T> T getService(@NotNull Class<T> clazz);

    <T> void registerService(@NotNull Class<T> clazz, T impl);
}
