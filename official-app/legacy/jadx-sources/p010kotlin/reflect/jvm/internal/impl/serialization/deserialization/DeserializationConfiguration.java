package p010kotlin.reflect.jvm.internal.impl.serialization.deserialization;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.reflect.jvm.internal.impl.metadata.deserialization.BinaryVersion;

/* JADX INFO: loaded from: classes11.dex */
public interface DeserializationConfiguration {

    public static final class Default implements DeserializationConfiguration {

        @NotNull
        public static final Default INSTANCE = new Default();

        private Default() {
        }

        @Override // p010kotlin.reflect.jvm.internal.impl.serialization.deserialization.DeserializationConfiguration
        public boolean getAllowUnstableDependencies() {
            return false;
        }

        @Override // p010kotlin.reflect.jvm.internal.impl.serialization.deserialization.DeserializationConfiguration
        @Nullable
        public BinaryVersion getBinaryVersion() {
            return null;
        }

        @Override // p010kotlin.reflect.jvm.internal.impl.serialization.deserialization.DeserializationConfiguration
        public boolean getPreserveDeclarationsOrdering() {
            return false;
        }

        @Override // p010kotlin.reflect.jvm.internal.impl.serialization.deserialization.DeserializationConfiguration
        public boolean getReportErrorsOnPreReleaseDependencies() {
            return false;
        }

        @Override // p010kotlin.reflect.jvm.internal.impl.serialization.deserialization.DeserializationConfiguration
        public boolean getSkipMetadataVersionCheck() {
            return false;
        }

        @Override // p010kotlin.reflect.jvm.internal.impl.serialization.deserialization.DeserializationConfiguration
        public boolean getSkipPrereleaseCheck() {
            return false;
        }

        @Override // p010kotlin.reflect.jvm.internal.impl.serialization.deserialization.DeserializationConfiguration
        public boolean getTypeAliasesAllowed() {
            return true;
        }
    }

    boolean getAllowUnstableDependencies();

    @Nullable
    BinaryVersion getBinaryVersion();

    boolean getPreserveDeclarationsOrdering();

    boolean getReportErrorsOnPreReleaseDependencies();

    boolean getSkipMetadataVersionCheck();

    boolean getSkipPrereleaseCheck();

    boolean getTypeAliasesAllowed();
}
