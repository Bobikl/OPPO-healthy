package p010kotlin.reflect.jvm.internal.impl.descriptors.java;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.jvm.internal.Intrinsics;
import p010kotlin.reflect.jvm.internal.impl.descriptors.Visibilities;
import p010kotlin.reflect.jvm.internal.impl.descriptors.Visibility;

/* JADX INFO: loaded from: classes11.dex */
public final class JavaVisibilities {

    @NotNull
    public static final JavaVisibilities INSTANCE = new JavaVisibilities();

    public static final class PackageVisibility extends Visibility {

        @NotNull
        public static final PackageVisibility INSTANCE = new PackageVisibility();

        private PackageVisibility() {
            super("package", false);
        }

        @Override // p010kotlin.reflect.jvm.internal.impl.descriptors.Visibility
        @Nullable
        public Integer compareTo(@NotNull Visibility visibility) {
            Intrinsics.checkNotNullParameter(visibility, "visibility");
            if (this == visibility) {
                return 0;
            }
            return Visibilities.INSTANCE.isPrivate(visibility) ? 1 : -1;
        }

        @Override // p010kotlin.reflect.jvm.internal.impl.descriptors.Visibility
        @NotNull
        public String getInternalDisplayName() {
            return "public/*package*/";
        }

        @Override // p010kotlin.reflect.jvm.internal.impl.descriptors.Visibility
        @NotNull
        public Visibility normalize() {
            return Visibilities.Protected.INSTANCE;
        }
    }

    public static final class ProtectedAndPackage extends Visibility {

        @NotNull
        public static final ProtectedAndPackage INSTANCE = new ProtectedAndPackage();

        private ProtectedAndPackage() {
            super("protected_and_package", true);
        }

        @Override // p010kotlin.reflect.jvm.internal.impl.descriptors.Visibility
        @Nullable
        public Integer compareTo(@NotNull Visibility visibility) {
            Intrinsics.checkNotNullParameter(visibility, "visibility");
            if (Intrinsics.areEqual(this, visibility)) {
                return 0;
            }
            if (visibility == Visibilities.Internal.INSTANCE) {
                return null;
            }
            return Integer.valueOf(Visibilities.INSTANCE.isPrivate(visibility) ? 1 : -1);
        }

        @Override // p010kotlin.reflect.jvm.internal.impl.descriptors.Visibility
        @NotNull
        public String getInternalDisplayName() {
            return "protected/*protected and package*/";
        }

        @Override // p010kotlin.reflect.jvm.internal.impl.descriptors.Visibility
        @NotNull
        public Visibility normalize() {
            return Visibilities.Protected.INSTANCE;
        }
    }

    public static final class ProtectedStaticVisibility extends Visibility {

        @NotNull
        public static final ProtectedStaticVisibility INSTANCE = new ProtectedStaticVisibility();

        private ProtectedStaticVisibility() {
            super("protected_static", true);
        }

        @Override // p010kotlin.reflect.jvm.internal.impl.descriptors.Visibility
        @NotNull
        public String getInternalDisplayName() {
            return "protected/*protected static*/";
        }

        @Override // p010kotlin.reflect.jvm.internal.impl.descriptors.Visibility
        @NotNull
        public Visibility normalize() {
            return Visibilities.Protected.INSTANCE;
        }
    }

    private JavaVisibilities() {
    }
}
