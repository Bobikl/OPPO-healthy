package p010kotlin.reflect.jvm.internal.impl.load.kotlin;

import java.util.List;
import org.jetbrains.annotations.NotNull;
import p010kotlin.collections.CollectionsKt__CollectionsKt;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public interface PackagePartProvider {

    public static final class Empty implements PackagePartProvider {

        @NotNull
        public static final Empty INSTANCE = new Empty();

        private Empty() {
        }

        @Override // p010kotlin.reflect.jvm.internal.impl.load.kotlin.PackagePartProvider
        @NotNull
        public List<String> findPackageParts(@NotNull String packageFqName) {
            Intrinsics.checkNotNullParameter(packageFqName, "packageFqName");
            return CollectionsKt__CollectionsKt.emptyList();
        }
    }

    @NotNull
    List<String> findPackageParts(@NotNull String str);
}
