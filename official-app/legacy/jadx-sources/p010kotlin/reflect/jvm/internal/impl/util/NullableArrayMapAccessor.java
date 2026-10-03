package p010kotlin.reflect.jvm.internal.impl.util;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.jvm.internal.Intrinsics;
import p010kotlin.properties.ReadOnlyProperty;
import p010kotlin.reflect.KClass;
import p010kotlin.reflect.KProperty;

/* JADX INFO: loaded from: classes11.dex */
public final class NullableArrayMapAccessor<K, V, T extends V> extends AbstractArrayMapOwner.AbstractArrayMapAccessor<K, V, T> implements ReadOnlyProperty<AbstractArrayMapOwner<K, V>, V> {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NullableArrayMapAccessor(@NotNull KClass<? extends K> key, int i) {
        super(key, i);
        Intrinsics.checkNotNullParameter(key, "key");
    }

    @Override // p010kotlin.properties.ReadOnlyProperty
    public /* bridge */ /* synthetic */ Object getValue(Object obj, KProperty kProperty) {
        return getValue((AbstractArrayMapOwner) obj, (KProperty<?>) kProperty);
    }

    @Nullable
    public T getValue(@NotNull AbstractArrayMapOwner<K, V> thisRef, @NotNull KProperty<?> property) {
        Intrinsics.checkNotNullParameter(thisRef, "thisRef");
        Intrinsics.checkNotNullParameter(property, "property");
        return extractValue(thisRef);
    }
}
