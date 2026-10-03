package p010kotlin.reflect.jvm.internal.impl.descriptors;

import java.util.Collection;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Unit;
import p010kotlin.jvm.functions.Function1;
import p010kotlin.jvm.internal.Intrinsics;
import p010kotlin.reflect.jvm.internal.impl.types.KotlinType;
import p010kotlin.reflect.jvm.internal.impl.types.TypeConstructor;

/* JADX INFO: loaded from: classes11.dex */
public interface SupertypeLoopChecker {

    public static final class EMPTY implements SupertypeLoopChecker {

        @NotNull
        public static final EMPTY INSTANCE = new EMPTY();

        private EMPTY() {
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // p010kotlin.reflect.jvm.internal.impl.descriptors.SupertypeLoopChecker
        @NotNull
        public Collection<KotlinType> findLoopsInSupertypesAndDisconnect(@NotNull TypeConstructor currentTypeConstructor, @NotNull Collection<? extends KotlinType> superTypes, @NotNull Function1<? super TypeConstructor, ? extends Iterable<? extends KotlinType>> neighbors, @NotNull Function1<? super KotlinType, Unit> reportLoop) {
            Intrinsics.checkNotNullParameter(currentTypeConstructor, "currentTypeConstructor");
            Intrinsics.checkNotNullParameter(superTypes, "superTypes");
            Intrinsics.checkNotNullParameter(neighbors, "neighbors");
            Intrinsics.checkNotNullParameter(reportLoop, "reportLoop");
            return superTypes;
        }
    }

    @NotNull
    Collection<KotlinType> findLoopsInSupertypesAndDisconnect(@NotNull TypeConstructor typeConstructor, @NotNull Collection<? extends KotlinType> collection, @NotNull Function1<? super TypeConstructor, ? extends Iterable<? extends KotlinType>> function1, @NotNull Function1<? super KotlinType, Unit> function2);
}
