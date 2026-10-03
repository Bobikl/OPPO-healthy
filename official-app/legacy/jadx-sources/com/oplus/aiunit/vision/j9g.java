package com.oplus.aiunit.vision;

import androidx.compose.runtime.internal.StabilityInferred;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;
import p010kotlin.properties.ReadWriteProperty;
import p010kotlin.reflect.KProperty;

/* JADX INFO: loaded from: classes2.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0007¢\u0006\u0004\b\f\u0010\rJ$\u0010\u0007\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00022\n\u0010\u0006\u001a\u0006\u0012\u0002\b\u00030\u0005H\u0096\u0002¢\u0006\u0004\b\u0007\u0010\bJ%\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0004\u001a\u00020\u00022\n\u0010\u0006\u001a\u0006\u0012\u0002\b\u00030\u00052\u0006\u0010\t\u001a\u00020\u0003H\u0096\u0002¨\u0006\u000e"}, d2 = {"Lcom/oplus/aiunit/vision/j9g;", "Lkotlin/properties/ReadWriteProperty;", "Lcom/oplus/aiunit/vision/ax9;", "", "thisRef", "Lkotlin/reflect/KProperty;", "property", "a", "(Lcom/oplus/aiunit/vision/ax9;Lkotlin/reflect/KProperty;)Ljava/lang/Integer;", "value", "", "b", "<init>", "()V", "lib_ui_release"}, k = 1, mv = {1, 8, 0})
public final class j9g implements ReadWriteProperty<ax9, Integer> {
    public static final int $stable = 0;

    @Override // p010kotlin.properties.ReadWriteProperty, p010kotlin.properties.ReadOnlyProperty
    @NotNull
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public Integer getValue(@NotNull ax9 thisRef, @NotNull KProperty<?> property) {
        Intrinsics.checkNotNullParameter(thisRef, "thisRef");
        Intrinsics.checkNotNullParameter(property, "property");
        return Integer.valueOf(v9g.x(thisRef.o()).z(property.getName() + thisRef.identity(), -1));
    }

    public void b(@NotNull ax9 thisRef, @NotNull KProperty<?> property, int value) {
        Intrinsics.checkNotNullParameter(thisRef, "thisRef");
        Intrinsics.checkNotNullParameter(property, "property");
        v9g.x(thisRef.o()).S(property.getName() + thisRef.identity(), value);
    }

    @Override // p010kotlin.properties.ReadWriteProperty
    public /* bridge */ /* synthetic */ void setValue(ax9 ax9Var, KProperty kProperty, Integer num) {
        b(ax9Var, kProperty, num.intValue());
    }
}
