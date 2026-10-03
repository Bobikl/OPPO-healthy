package com.oplus.aiunit.vision;

import androidx.compose.runtime.internal.StabilityInferred;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;
import p010kotlin.properties.ReadWriteProperty;
import p010kotlin.reflect.KProperty;

/* JADX INFO: loaded from: classes2.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0001B\u0007¢\u0006\u0004\b\u000b\u0010\fJ\u001f\u0010\u0007\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0004\u001a\u00020\u00022\n\u0010\u0006\u001a\u0006\u0012\u0002\b\u00030\u0005H\u0096\u0002J'\u0010\n\u001a\u00020\t2\u0006\u0010\u0004\u001a\u00020\u00022\n\u0010\u0006\u001a\u0006\u0012\u0002\b\u00030\u00052\b\u0010\b\u001a\u0004\u0018\u00010\u0003H\u0096\u0002¨\u0006\r"}, d2 = {"Lcom/oplus/aiunit/vision/c9g;", "Lkotlin/properties/ReadWriteProperty;", "Lcom/oplus/aiunit/vision/ax9;", "", "thisRef", "Lkotlin/reflect/KProperty;", "property", "a", "value", "", "b", "<init>", "()V", "lib_ui_release"}, k = 1, mv = {1, 8, 0})
public final class c9g implements ReadWriteProperty<ax9, byte[]> {
    public static final int $stable = 0;

    @Override // p010kotlin.properties.ReadWriteProperty, p010kotlin.properties.ReadOnlyProperty
    @Nullable
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public byte[] getValue(@NotNull ax9 thisRef, @NotNull KProperty<?> property) {
        Intrinsics.checkNotNullParameter(thisRef, "thisRef");
        Intrinsics.checkNotNullParameter(property, "property");
        return v9g.x(thisRef.o()).s(property.getName() + thisRef.identity(), null);
    }

    @Override // p010kotlin.properties.ReadWriteProperty
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public void setValue(@NotNull ax9 thisRef, @NotNull KProperty<?> property, @Nullable byte[] value) {
        Intrinsics.checkNotNullParameter(thisRef, "thisRef");
        Intrinsics.checkNotNullParameter(property, "property");
        v9g.x(thisRef.o()).X(property.getName() + thisRef.identity(), value);
    }
}
