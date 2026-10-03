package p010kotlin.reflect.jvm.internal.impl.types;

import org.jetbrains.annotations.NotNull;
import p010kotlin.jvm.functions.Function0;
import p010kotlin.jvm.internal.Intrinsics;
import p010kotlin.reflect.jvm.internal.impl.storage.NotNullLazyValue;
import p010kotlin.reflect.jvm.internal.impl.storage.StorageManager;
import p010kotlin.reflect.jvm.internal.impl.types.checker.KotlinTypeRefiner;
import p010kotlin.reflect.jvm.internal.impl.types.model.KotlinTypeMarker;

/* JADX INFO: loaded from: classes11.dex */
public final class LazyWrappedType extends WrappedType {

    @NotNull
    private final Function0<KotlinType> computation;

    @NotNull
    private final NotNullLazyValue<KotlinType> lazyValue;

    @NotNull
    private final StorageManager storageManager;

    /* JADX WARN: Multi-variable type inference failed */
    public LazyWrappedType(@NotNull StorageManager storageManager, @NotNull Function0<? extends KotlinType> computation) {
        Intrinsics.checkNotNullParameter(storageManager, "storageManager");
        Intrinsics.checkNotNullParameter(computation, "computation");
        this.storageManager = storageManager;
        this.computation = computation;
        this.lazyValue = storageManager.createLazyValue(computation);
    }

    @Override // p010kotlin.reflect.jvm.internal.impl.types.WrappedType
    @NotNull
    public KotlinType getDelegate() {
        return this.lazyValue.invoke();
    }

    @Override // p010kotlin.reflect.jvm.internal.impl.types.WrappedType
    public boolean isComputed() {
        return this.lazyValue.isComputed();
    }

    @Override // p010kotlin.reflect.jvm.internal.impl.types.KotlinType
    @NotNull
    public LazyWrappedType refine(@NotNull final KotlinTypeRefiner kotlinTypeRefiner) {
        Intrinsics.checkNotNullParameter(kotlinTypeRefiner, "kotlinTypeRefiner");
        return new LazyWrappedType(this.storageManager, new Function0<KotlinType>() { // from class: kotlin.reflect.jvm.internal.impl.types.LazyWrappedType.refine.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // p010kotlin.jvm.functions.Function0
            @NotNull
            public final KotlinType invoke() {
                return kotlinTypeRefiner.refineType((KotlinTypeMarker) this.computation.invoke());
            }
        });
    }
}
