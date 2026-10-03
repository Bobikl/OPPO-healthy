package p010kotlin.reflect.jvm.internal.impl.types.checker;

import p010kotlin.reflect.jvm.internal.impl.types.SpecialTypesKt;
import p010kotlin.reflect.jvm.internal.impl.types.UnwrappedType;

/* JADX INFO: loaded from: classes11.dex */
public final class ClassicTypeSystemContextKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final UnwrappedType makeDefinitelyNotNullOrNotNullInternal(UnwrappedType unwrappedType) {
        return SpecialTypesKt.makeDefinitelyNotNullOrNotNull$default(unwrappedType, false, 1, null);
    }
}
