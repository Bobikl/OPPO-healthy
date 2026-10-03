package p010kotlin.reflect.jvm.internal.impl.metadata.deserialization;

import org.jetbrains.annotations.NotNull;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class VersionSpecificBehaviorKt {
    public static final boolean isKotlin1Dot4OrLater(@NotNull BinaryVersion version) {
        Intrinsics.checkNotNullParameter(version, "version");
        return (version.getMajor() == 1 && version.getMinor() >= 4) || version.getMajor() > 1;
    }

    public static final boolean isVersionRequirementTableWrittenCorrectly(@NotNull BinaryVersion version) {
        Intrinsics.checkNotNullParameter(version, "version");
        return isKotlin1Dot4OrLater(version);
    }
}
