package p010kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.jvm.internal.Intrinsics;
import p010kotlin.reflect.jvm.internal.impl.load.java.structure.JavaEnumValueAnnotationArgument;
import p010kotlin.reflect.jvm.internal.impl.name.ClassId;
import p010kotlin.reflect.jvm.internal.impl.name.Name;

/* JADX INFO: loaded from: classes11.dex */
public final class ReflectJavaEnumValueAnnotationArgument extends ReflectJavaAnnotationArgument implements JavaEnumValueAnnotationArgument {

    @NotNull
    private final Enum<?> value;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ReflectJavaEnumValueAnnotationArgument(@Nullable Name name, @NotNull Enum<?> value) {
        super(name, null);
        Intrinsics.checkNotNullParameter(value, "value");
        this.value = value;
    }

    @Override // p010kotlin.reflect.jvm.internal.impl.load.java.structure.JavaEnumValueAnnotationArgument
    @Nullable
    public Name getEntryName() {
        return Name.identifier(this.value.name());
    }

    @Override // p010kotlin.reflect.jvm.internal.impl.load.java.structure.JavaEnumValueAnnotationArgument
    @Nullable
    public ClassId getEnumClassId() {
        Class<?> enumClass = this.value.getClass();
        if (!enumClass.isEnum()) {
            enumClass = enumClass.getEnclosingClass();
        }
        Intrinsics.checkNotNullExpressionValue(enumClass, "enumClass");
        return ReflectClassUtilKt.getClassId(enumClass);
    }
}
