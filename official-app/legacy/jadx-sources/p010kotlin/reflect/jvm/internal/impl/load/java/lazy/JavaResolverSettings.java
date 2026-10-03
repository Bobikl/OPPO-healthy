package p010kotlin.reflect.jvm.internal.impl.load.java.lazy;

import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
public interface JavaResolverSettings {

    @NotNull
    public static final Companion Companion = Companion.$$INSTANCE;

    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        private Companion() {
        }
    }

    public static final class Default implements JavaResolverSettings {

        @NotNull
        public static final Default INSTANCE = new Default();

        private Default() {
        }

        @Override // p010kotlin.reflect.jvm.internal.impl.load.java.lazy.JavaResolverSettings
        public boolean getCorrectNullabilityForNotNullTypeParameter() {
            return false;
        }

        @Override // p010kotlin.reflect.jvm.internal.impl.load.java.lazy.JavaResolverSettings
        public boolean getEnhancePrimitiveArrays() {
            return false;
        }

        @Override // p010kotlin.reflect.jvm.internal.impl.load.java.lazy.JavaResolverSettings
        public boolean getIgnoreNullabilityForErasedValueParameters() {
            return false;
        }

        @Override // p010kotlin.reflect.jvm.internal.impl.load.java.lazy.JavaResolverSettings
        public boolean getTypeEnhancementImprovementsInStrictMode() {
            return false;
        }
    }

    boolean getCorrectNullabilityForNotNullTypeParameter();

    boolean getEnhancePrimitiveArrays();

    boolean getIgnoreNullabilityForErasedValueParameters();

    boolean getTypeEnhancementImprovementsInStrictMode();
}
