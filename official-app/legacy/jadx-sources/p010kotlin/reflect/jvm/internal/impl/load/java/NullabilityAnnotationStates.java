package p010kotlin.reflect.jvm.internal.impl.load.java;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.collections.MapsKt__MapsKt;
import p010kotlin.reflect.jvm.internal.impl.name.FqName;

/* JADX INFO: loaded from: classes11.dex */
public interface NullabilityAnnotationStates<T> {

    @NotNull
    public static final Companion Companion = Companion.$$INSTANCE;

    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        @NotNull
        private static final NullabilityAnnotationStates EMPTY = new NullabilityAnnotationStatesImpl(MapsKt__MapsKt.emptyMap());

        private Companion() {
        }

        @NotNull
        public final NullabilityAnnotationStates getEMPTY() {
            return EMPTY;
        }
    }

    @Nullable
    T get(@NotNull FqName fqName);
}
