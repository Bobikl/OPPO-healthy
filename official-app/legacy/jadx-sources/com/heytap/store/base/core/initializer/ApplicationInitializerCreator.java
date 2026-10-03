package com.heytap.store.base.core.initializer;

import androidx.exifinterface.media.ExifInterface;
import com.heytap.store.base.core.initializer.ApplicationInitializer;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;
import p010kotlin.Pair;
import p010kotlin.collections.MapsKt__MapsKt;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0002\b\u0003\bf\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u00022\u00020\u0003J\u0014\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00028\u00000\u0005H\u0016J(\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00028\u00000\u00052\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00030\bH\u0016J!\u0010\t\u001a\u00028\u00002\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00030\bH&¢\u0006\u0002\u0010\n¨\u0006\u000b"}, d2 = {"Lcom/heytap/store/base/core/initializer/ApplicationInitializerCreator;", ExifInterface.GPS_DIRECTION_TRUE, "Lcom/heytap/store/base/core/initializer/ApplicationInitializer;", "", "create", "Lkotlin/Pair;", "", "parameter", "", "createInitializer", "(Ljava/util/Map;)Lcom/heytap/store/base/core/initializer/ApplicationInitializer;", "Core_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
public interface ApplicationInitializerCreator<T extends ApplicationInitializer> {

    @Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
    public static final class DefaultImpls {
        @NotNull
        public static <T extends ApplicationInitializer> Pair<String, T> create(@NotNull ApplicationInitializerCreator<T> applicationInitializerCreator) {
            Intrinsics.checkNotNullParameter(applicationInitializerCreator, "this");
            return applicationInitializerCreator.create(MapsKt__MapsKt.emptyMap());
        }

        @NotNull
        public static <T extends ApplicationInitializer> Pair<String, T> create(@NotNull ApplicationInitializerCreator<T> applicationInitializerCreator, @NotNull Map<String, ? extends Object> parameter) {
            Intrinsics.checkNotNullParameter(applicationInitializerCreator, "this");
            Intrinsics.checkNotNullParameter(parameter, "parameter");
            return new Pair<>(applicationInitializerCreator.getClass().getName(), applicationInitializerCreator.createInitializer(parameter));
        }
    }

    @NotNull
    Pair<String, T> create();

    @NotNull
    Pair<String, T> create(@NotNull Map<String, ? extends Object> parameter);

    @NotNull
    T createInitializer(@NotNull Map<String, ? extends Object> parameter);
}
