package p010kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import org.jetbrains.annotations.NotNull;
import p010kotlin.jvm.internal.Intrinsics;
import p010kotlin.reflect.jvm.internal.impl.load.java.structure.JavaField;

/* JADX INFO: loaded from: classes11.dex */
public final class ReflectJavaField extends ReflectJavaMember implements JavaField {

    @NotNull
    private final Field member;

    public ReflectJavaField(@NotNull Field member) {
        Intrinsics.checkNotNullParameter(member, "member");
        this.member = member;
    }

    @Override // p010kotlin.reflect.jvm.internal.impl.load.java.structure.JavaField
    public boolean getHasConstantNotNullInitializer() {
        return false;
    }

    @Override // p010kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.ReflectJavaMember
    @NotNull
    public Field getMember() {
        return this.member;
    }

    @Override // p010kotlin.reflect.jvm.internal.impl.load.java.structure.JavaField
    public boolean isEnumEntry() {
        return getMember().isEnumConstant();
    }

    @Override // p010kotlin.reflect.jvm.internal.impl.load.java.structure.JavaField
    @NotNull
    public ReflectJavaType getType() {
        ReflectJavaType.Factory factory = ReflectJavaType.Factory;
        Type genericType = getMember().getGenericType();
        Intrinsics.checkNotNullExpressionValue(genericType, "member.genericType");
        return factory.create(genericType);
    }
}
