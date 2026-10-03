package p010kotlin.reflect.jvm.internal.impl.serialization.deserialization;

import org.jetbrains.annotations.NotNull;
import p010kotlin.jvm.internal.Intrinsics;
import p010kotlin.reflect.jvm.internal.impl.metadata.deserialization.NameResolver;
import p010kotlin.reflect.jvm.internal.impl.name.ClassId;
import p010kotlin.reflect.jvm.internal.impl.name.Name;

/* JADX INFO: loaded from: classes11.dex */
public final class NameResolverUtilKt {
    @NotNull
    public static final ClassId getClassId(@NotNull NameResolver nameResolver, int i) {
        Intrinsics.checkNotNullParameter(nameResolver, "<this>");
        ClassId classIdFromString = ClassId.fromString(nameResolver.getQualifiedClassName(i), nameResolver.isLocalClassName(i));
        Intrinsics.checkNotNullExpressionValue(classIdFromString, "fromString(getQualifiedC… isLocalClassName(index))");
        return classIdFromString;
    }

    @NotNull
    public static final Name getName(@NotNull NameResolver nameResolver, int i) {
        Intrinsics.checkNotNullParameter(nameResolver, "<this>");
        Name nameGuessByFirstCharacter = Name.guessByFirstCharacter(nameResolver.getString(i));
        Intrinsics.checkNotNullExpressionValue(nameGuessByFirstCharacter, "guessByFirstCharacter(getString(index))");
        return nameGuessByFirstCharacter;
    }
}
