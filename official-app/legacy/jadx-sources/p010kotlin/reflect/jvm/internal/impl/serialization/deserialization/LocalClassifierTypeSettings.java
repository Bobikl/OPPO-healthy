package p010kotlin.reflect.jvm.internal.impl.serialization.deserialization;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.reflect.jvm.internal.impl.types.SimpleType;

/* JADX INFO: loaded from: classes11.dex */
public interface LocalClassifierTypeSettings {

    public static final class Default implements LocalClassifierTypeSettings {

        @NotNull
        public static final Default INSTANCE = new Default();

        private Default() {
        }

        @Override // p010kotlin.reflect.jvm.internal.impl.serialization.deserialization.LocalClassifierTypeSettings
        @Nullable
        public SimpleType getReplacementTypeForLocalClassifiers() {
            return null;
        }
    }

    @Nullable
    SimpleType getReplacementTypeForLocalClassifiers();
}
