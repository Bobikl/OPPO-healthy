package p010kotlin.reflect.jvm.internal.impl.types.checker;

import java.util.Collection;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.jvm.internal.Intrinsics;
import p010kotlin.jvm.internal.Reflection;
import p010kotlin.reflect.jvm.internal.impl.builtins.PrimitiveType;
import p010kotlin.reflect.jvm.internal.impl.name.FqName;
import p010kotlin.reflect.jvm.internal.impl.name.FqNameUnsafe;
import p010kotlin.reflect.jvm.internal.impl.types.TypeCheckerState;
import p010kotlin.reflect.jvm.internal.impl.types.model.ArgumentList;
import p010kotlin.reflect.jvm.internal.impl.types.model.CaptureStatus;
import p010kotlin.reflect.jvm.internal.impl.types.model.CapturedTypeConstructorMarker;
import p010kotlin.reflect.jvm.internal.impl.types.model.CapturedTypeMarker;
import p010kotlin.reflect.jvm.internal.impl.types.model.DefinitelyNotNullTypeMarker;
import p010kotlin.reflect.jvm.internal.impl.types.model.DynamicTypeMarker;
import p010kotlin.reflect.jvm.internal.impl.types.model.FlexibleTypeMarker;
import p010kotlin.reflect.jvm.internal.impl.types.model.KotlinTypeMarker;
import p010kotlin.reflect.jvm.internal.impl.types.model.RawTypeMarker;
import p010kotlin.reflect.jvm.internal.impl.types.model.SimpleTypeMarker;
import p010kotlin.reflect.jvm.internal.impl.types.model.TypeArgumentListMarker;
import p010kotlin.reflect.jvm.internal.impl.types.model.TypeArgumentMarker;
import p010kotlin.reflect.jvm.internal.impl.types.model.TypeConstructorMarker;
import p010kotlin.reflect.jvm.internal.impl.types.model.TypeParameterMarker;
import p010kotlin.reflect.jvm.internal.impl.types.model.TypeVariableTypeConstructorMarker;
import p010kotlin.reflect.jvm.internal.impl.types.model.TypeVariance;

/* JADX INFO: loaded from: classes11.dex */
public final class SimpleClassicTypeSystemContext implements ClassicTypeSystemContext {

    @NotNull
    public static final SimpleClassicTypeSystemContext INSTANCE = new SimpleClassicTypeSystemContext();

    private SimpleClassicTypeSystemContext() {
    }

    @Override // p010kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext
    public boolean areEqualTypeConstructors(@NotNull TypeConstructorMarker typeConstructorMarker, @NotNull TypeConstructorMarker typeConstructorMarker2) {
        return ClassicTypeSystemContext.DefaultImpls.areEqualTypeConstructors(this, typeConstructorMarker, typeConstructorMarker2);
    }

    @Override // p010kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext
    public int argumentsCount(@NotNull KotlinTypeMarker kotlinTypeMarker) {
        return ClassicTypeSystemContext.DefaultImpls.argumentsCount(this, kotlinTypeMarker);
    }

    @Override // p010kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext
    @NotNull
    public TypeArgumentListMarker asArgumentList(@NotNull SimpleTypeMarker simpleTypeMarker) {
        return ClassicTypeSystemContext.DefaultImpls.asArgumentList(this, simpleTypeMarker);
    }

    @Override // p010kotlin.reflect.jvm.internal.impl.types.checker.ClassicTypeSystemContext, p010kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext
    @Nullable
    public CapturedTypeMarker asCapturedType(@NotNull SimpleTypeMarker simpleTypeMarker) {
        return ClassicTypeSystemContext.DefaultImpls.asCapturedType(this, simpleTypeMarker);
    }

    @Override // p010kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext
    @Nullable
    public DefinitelyNotNullTypeMarker asDefinitelyNotNullType(@NotNull SimpleTypeMarker simpleTypeMarker) {
        return ClassicTypeSystemContext.DefaultImpls.asDefinitelyNotNullType(this, simpleTypeMarker);
    }

    @Override // p010kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext
    @Nullable
    public DynamicTypeMarker asDynamicType(@NotNull FlexibleTypeMarker flexibleTypeMarker) {
        return ClassicTypeSystemContext.DefaultImpls.asDynamicType(this, flexibleTypeMarker);
    }

    @Override // p010kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext
    @Nullable
    public FlexibleTypeMarker asFlexibleType(@NotNull KotlinTypeMarker kotlinTypeMarker) {
        return ClassicTypeSystemContext.DefaultImpls.asFlexibleType(this, kotlinTypeMarker);
    }

    @Override // p010kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext
    @Nullable
    public RawTypeMarker asRawType(@NotNull FlexibleTypeMarker flexibleTypeMarker) {
        return ClassicTypeSystemContext.DefaultImpls.asRawType(this, flexibleTypeMarker);
    }

    @Override // p010kotlin.reflect.jvm.internal.impl.types.checker.ClassicTypeSystemContext, p010kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext
    @Nullable
    public SimpleTypeMarker asSimpleType(@NotNull KotlinTypeMarker kotlinTypeMarker) {
        return ClassicTypeSystemContext.DefaultImpls.asSimpleType(this, kotlinTypeMarker);
    }

    @Override // p010kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext
    @NotNull
    public TypeArgumentMarker asTypeArgument(@NotNull KotlinTypeMarker kotlinTypeMarker) {
        return ClassicTypeSystemContext.DefaultImpls.asTypeArgument(this, kotlinTypeMarker);
    }

    @Override // p010kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext
    @Nullable
    public SimpleTypeMarker captureFromArguments(@NotNull SimpleTypeMarker simpleTypeMarker, @NotNull CaptureStatus captureStatus) {
        return ClassicTypeSystemContext.DefaultImpls.captureFromArguments(this, simpleTypeMarker, captureStatus);
    }

    @Override // p010kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext
    @NotNull
    public CaptureStatus captureStatus(@NotNull CapturedTypeMarker capturedTypeMarker) {
        return ClassicTypeSystemContext.DefaultImpls.captureStatus(this, capturedTypeMarker);
    }

    @Override // p010kotlin.reflect.jvm.internal.impl.types.checker.ClassicTypeSystemContext
    @NotNull
    public KotlinTypeMarker createFlexibleType(@NotNull SimpleTypeMarker simpleTypeMarker, @NotNull SimpleTypeMarker simpleTypeMarker2) {
        return ClassicTypeSystemContext.DefaultImpls.createFlexibleType(this, simpleTypeMarker, simpleTypeMarker2);
    }

    @Override // p010kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext
    @Nullable
    public List<SimpleTypeMarker> fastCorrespondingSupertypes(SimpleTypeMarker simpleTypeMarker, TypeConstructorMarker constructor) {
        Intrinsics.checkNotNullParameter(simpleTypeMarker, "<this>");
        Intrinsics.checkNotNullParameter(constructor, "constructor");
        return null;
    }

    @Override // p010kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext
    @NotNull
    public TypeArgumentMarker get(TypeArgumentListMarker typeArgumentListMarker, int i) {
        Intrinsics.checkNotNullParameter(typeArgumentListMarker, "<this>");
        if (typeArgumentListMarker instanceof SimpleTypeMarker) {
            return getArgument((KotlinTypeMarker) typeArgumentListMarker, i);
        }
        if (typeArgumentListMarker instanceof ArgumentList) {
            TypeArgumentMarker typeArgumentMarker = ((ArgumentList) typeArgumentListMarker).get(i);
            Intrinsics.checkNotNullExpressionValue(typeArgumentMarker, "get(index)");
            return typeArgumentMarker;
        }
        throw new IllegalStateException(("unknown type argument list type: " + typeArgumentListMarker + ", " + Reflection.getOrCreateKotlinClass(typeArgumentListMarker.getClass())).toString());
    }

    @Override // p010kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext
    @NotNull
    public TypeArgumentMarker getArgument(@NotNull KotlinTypeMarker kotlinTypeMarker, int i) {
        return ClassicTypeSystemContext.DefaultImpls.getArgument(this, kotlinTypeMarker, i);
    }

    @Override // p010kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext
    @Nullable
    public TypeArgumentMarker getArgumentOrNull(SimpleTypeMarker simpleTypeMarker, int i) {
        Intrinsics.checkNotNullParameter(simpleTypeMarker, "<this>");
        boolean z = false;
        if (i >= 0 && i < argumentsCount(simpleTypeMarker)) {
            z = true;
        }
        if (z) {
            return getArgument(simpleTypeMarker, i);
        }
        return null;
    }

    @Override // p010kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext
    @NotNull
    public List<TypeArgumentMarker> getArguments(@NotNull KotlinTypeMarker kotlinTypeMarker) {
        return ClassicTypeSystemContext.DefaultImpls.getArguments(this, kotlinTypeMarker);
    }

    @Override // p010kotlin.reflect.jvm.internal.impl.types.TypeSystemCommonBackendContext
    @NotNull
    public FqNameUnsafe getClassFqNameUnsafe(@NotNull TypeConstructorMarker typeConstructorMarker) {
        return ClassicTypeSystemContext.DefaultImpls.getClassFqNameUnsafe(this, typeConstructorMarker);
    }

    @Override // p010kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext
    @NotNull
    public TypeParameterMarker getParameter(@NotNull TypeConstructorMarker typeConstructorMarker, int i) {
        return ClassicTypeSystemContext.DefaultImpls.getParameter(this, typeConstructorMarker, i);
    }

    @Override // p010kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext
    @NotNull
    public List<TypeParameterMarker> getParameters(@NotNull TypeConstructorMarker typeConstructorMarker) {
        return ClassicTypeSystemContext.DefaultImpls.getParameters(this, typeConstructorMarker);
    }

    @Override // p010kotlin.reflect.jvm.internal.impl.types.TypeSystemCommonBackendContext
    @Nullable
    public PrimitiveType getPrimitiveArrayType(@NotNull TypeConstructorMarker typeConstructorMarker) {
        return ClassicTypeSystemContext.DefaultImpls.getPrimitiveArrayType(this, typeConstructorMarker);
    }

    @Override // p010kotlin.reflect.jvm.internal.impl.types.TypeSystemCommonBackendContext
    @Nullable
    public PrimitiveType getPrimitiveType(@NotNull TypeConstructorMarker typeConstructorMarker) {
        return ClassicTypeSystemContext.DefaultImpls.getPrimitiveType(this, typeConstructorMarker);
    }

    @Override // p010kotlin.reflect.jvm.internal.impl.types.TypeSystemCommonBackendContext
    @NotNull
    public KotlinTypeMarker getRepresentativeUpperBound(@NotNull TypeParameterMarker typeParameterMarker) {
        return ClassicTypeSystemContext.DefaultImpls.getRepresentativeUpperBound(this, typeParameterMarker);
    }

    @Override // p010kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext
    @NotNull
    public KotlinTypeMarker getType(@NotNull TypeArgumentMarker typeArgumentMarker) {
        return ClassicTypeSystemContext.DefaultImpls.getType(this, typeArgumentMarker);
    }

    @Override // p010kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext
    @Nullable
    public TypeParameterMarker getTypeParameter(@NotNull TypeVariableTypeConstructorMarker typeVariableTypeConstructorMarker) {
        return ClassicTypeSystemContext.DefaultImpls.getTypeParameter(this, typeVariableTypeConstructorMarker);
    }

    @Override // p010kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext
    @Nullable
    public TypeParameterMarker getTypeParameterClassifier(@NotNull TypeConstructorMarker typeConstructorMarker) {
        return ClassicTypeSystemContext.DefaultImpls.getTypeParameterClassifier(this, typeConstructorMarker);
    }

    @Override // p010kotlin.reflect.jvm.internal.impl.types.TypeSystemCommonBackendContext
    @Nullable
    public KotlinTypeMarker getUnsubstitutedUnderlyingType(@NotNull KotlinTypeMarker kotlinTypeMarker) {
        return ClassicTypeSystemContext.DefaultImpls.getUnsubstitutedUnderlyingType(this, kotlinTypeMarker);
    }

    @Override // p010kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext
    @NotNull
    public List<KotlinTypeMarker> getUpperBounds(@NotNull TypeParameterMarker typeParameterMarker) {
        return ClassicTypeSystemContext.DefaultImpls.getUpperBounds(this, typeParameterMarker);
    }

    @Override // p010kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext
    @NotNull
    public TypeVariance getVariance(@NotNull TypeArgumentMarker typeArgumentMarker) {
        return ClassicTypeSystemContext.DefaultImpls.getVariance(this, typeArgumentMarker);
    }

    @Override // p010kotlin.reflect.jvm.internal.impl.types.TypeSystemCommonBackendContext
    public boolean hasAnnotation(@NotNull KotlinTypeMarker kotlinTypeMarker, @NotNull FqName fqName) {
        return ClassicTypeSystemContext.DefaultImpls.hasAnnotation(this, kotlinTypeMarker, fqName);
    }

    @Override // p010kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext
    public boolean hasFlexibleNullability(KotlinTypeMarker kotlinTypeMarker) {
        Intrinsics.checkNotNullParameter(kotlinTypeMarker, "<this>");
        return isMarkedNullable(lowerBoundIfFlexible(kotlinTypeMarker)) != isMarkedNullable(upperBoundIfFlexible(kotlinTypeMarker));
    }

    @Override // p010kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext
    public boolean hasRecursiveBounds(@NotNull TypeParameterMarker typeParameterMarker, @Nullable TypeConstructorMarker typeConstructorMarker) {
        return ClassicTypeSystemContext.DefaultImpls.hasRecursiveBounds(this, typeParameterMarker, typeConstructorMarker);
    }

    @Override // p010kotlin.reflect.jvm.internal.impl.types.model.TypeSystemOptimizationContext
    public boolean identicalArguments(@NotNull SimpleTypeMarker simpleTypeMarker, @NotNull SimpleTypeMarker simpleTypeMarker2) {
        return ClassicTypeSystemContext.DefaultImpls.identicalArguments(this, simpleTypeMarker, simpleTypeMarker2);
    }

    @Override // p010kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext
    @NotNull
    public KotlinTypeMarker intersectTypes(@NotNull List<? extends KotlinTypeMarker> list) {
        return ClassicTypeSystemContext.DefaultImpls.intersectTypes(this, list);
    }

    @Override // p010kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext
    public boolean isAnyConstructor(@NotNull TypeConstructorMarker typeConstructorMarker) {
        return ClassicTypeSystemContext.DefaultImpls.isAnyConstructor(this, typeConstructorMarker);
    }

    @Override // p010kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext
    public boolean isCapturedType(KotlinTypeMarker kotlinTypeMarker) {
        Intrinsics.checkNotNullParameter(kotlinTypeMarker, "<this>");
        SimpleTypeMarker simpleTypeMarkerAsSimpleType = asSimpleType(kotlinTypeMarker);
        return (simpleTypeMarkerAsSimpleType != null ? asCapturedType(simpleTypeMarkerAsSimpleType) : null) != null;
    }

    @Override // p010kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext
    public boolean isClassType(SimpleTypeMarker simpleTypeMarker) {
        Intrinsics.checkNotNullParameter(simpleTypeMarker, "<this>");
        return isClassTypeConstructor(typeConstructor(simpleTypeMarker));
    }

    @Override // p010kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext
    public boolean isClassTypeConstructor(@NotNull TypeConstructorMarker typeConstructorMarker) {
        return ClassicTypeSystemContext.DefaultImpls.isClassTypeConstructor(this, typeConstructorMarker);
    }

    @Override // p010kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext
    public boolean isCommonFinalClassConstructor(@NotNull TypeConstructorMarker typeConstructorMarker) {
        return ClassicTypeSystemContext.DefaultImpls.isCommonFinalClassConstructor(this, typeConstructorMarker);
    }

    @Override // p010kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext
    public boolean isDefinitelyNotNullType(KotlinTypeMarker kotlinTypeMarker) {
        Intrinsics.checkNotNullParameter(kotlinTypeMarker, "<this>");
        SimpleTypeMarker simpleTypeMarkerAsSimpleType = asSimpleType(kotlinTypeMarker);
        return (simpleTypeMarkerAsSimpleType != null ? asDefinitelyNotNullType(simpleTypeMarkerAsSimpleType) : null) != null;
    }

    @Override // p010kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext
    public boolean isDenotable(@NotNull TypeConstructorMarker typeConstructorMarker) {
        return ClassicTypeSystemContext.DefaultImpls.isDenotable(this, typeConstructorMarker);
    }

    @Override // p010kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext
    public boolean isDynamic(KotlinTypeMarker kotlinTypeMarker) {
        Intrinsics.checkNotNullParameter(kotlinTypeMarker, "<this>");
        FlexibleTypeMarker flexibleTypeMarkerAsFlexibleType = asFlexibleType(kotlinTypeMarker);
        return (flexibleTypeMarkerAsFlexibleType != null ? asDynamicType(flexibleTypeMarkerAsFlexibleType) : null) != null;
    }

    @Override // p010kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext
    public boolean isError(@NotNull KotlinTypeMarker kotlinTypeMarker) {
        return ClassicTypeSystemContext.DefaultImpls.isError(this, kotlinTypeMarker);
    }

    @Override // p010kotlin.reflect.jvm.internal.impl.types.TypeSystemCommonBackendContext
    public boolean isInlineClass(@NotNull TypeConstructorMarker typeConstructorMarker) {
        return ClassicTypeSystemContext.DefaultImpls.isInlineClass(this, typeConstructorMarker);
    }

    @Override // p010kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext
    public boolean isIntegerLiteralType(SimpleTypeMarker simpleTypeMarker) {
        Intrinsics.checkNotNullParameter(simpleTypeMarker, "<this>");
        return isIntegerLiteralTypeConstructor(typeConstructor(simpleTypeMarker));
    }

    @Override // p010kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext
    public boolean isIntegerLiteralTypeConstructor(@NotNull TypeConstructorMarker typeConstructorMarker) {
        return ClassicTypeSystemContext.DefaultImpls.isIntegerLiteralTypeConstructor(this, typeConstructorMarker);
    }

    @Override // p010kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext
    public boolean isIntersection(@NotNull TypeConstructorMarker typeConstructorMarker) {
        return ClassicTypeSystemContext.DefaultImpls.isIntersection(this, typeConstructorMarker);
    }

    @Override // p010kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext
    public boolean isMarkedNullable(@NotNull SimpleTypeMarker simpleTypeMarker) {
        return ClassicTypeSystemContext.DefaultImpls.isMarkedNullable(this, simpleTypeMarker);
    }

    @Override // p010kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext
    public boolean isNotNullTypeParameter(@NotNull KotlinTypeMarker kotlinTypeMarker) {
        return ClassicTypeSystemContext.DefaultImpls.isNotNullTypeParameter(this, kotlinTypeMarker);
    }

    @Override // p010kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext
    public boolean isNothing(KotlinTypeMarker kotlinTypeMarker) {
        Intrinsics.checkNotNullParameter(kotlinTypeMarker, "<this>");
        return isNothingConstructor(typeConstructor(kotlinTypeMarker)) && !isNullableType(kotlinTypeMarker);
    }

    @Override // p010kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext
    public boolean isNothingConstructor(@NotNull TypeConstructorMarker typeConstructorMarker) {
        return ClassicTypeSystemContext.DefaultImpls.isNothingConstructor(this, typeConstructorMarker);
    }

    @Override // p010kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext
    public boolean isNullableType(@NotNull KotlinTypeMarker kotlinTypeMarker) {
        return ClassicTypeSystemContext.DefaultImpls.isNullableType(this, kotlinTypeMarker);
    }

    @Override // p010kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext
    public boolean isOldCapturedType(@NotNull CapturedTypeMarker capturedTypeMarker) {
        return ClassicTypeSystemContext.DefaultImpls.isOldCapturedType(this, capturedTypeMarker);
    }

    @Override // p010kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext
    public boolean isPrimitiveType(@NotNull SimpleTypeMarker simpleTypeMarker) {
        return ClassicTypeSystemContext.DefaultImpls.isPrimitiveType(this, simpleTypeMarker);
    }

    @Override // p010kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext
    public boolean isProjectionNotNull(@NotNull CapturedTypeMarker capturedTypeMarker) {
        return ClassicTypeSystemContext.DefaultImpls.isProjectionNotNull(this, capturedTypeMarker);
    }

    @Override // p010kotlin.reflect.jvm.internal.impl.types.checker.ClassicTypeSystemContext, p010kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext
    public boolean isSingleClassifierType(@NotNull SimpleTypeMarker simpleTypeMarker) {
        return ClassicTypeSystemContext.DefaultImpls.isSingleClassifierType(this, simpleTypeMarker);
    }

    @Override // p010kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext
    public boolean isStarProjection(@NotNull TypeArgumentMarker typeArgumentMarker) {
        return ClassicTypeSystemContext.DefaultImpls.isStarProjection(this, typeArgumentMarker);
    }

    @Override // p010kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext
    public boolean isStubType(@NotNull SimpleTypeMarker simpleTypeMarker) {
        return ClassicTypeSystemContext.DefaultImpls.isStubType(this, simpleTypeMarker);
    }

    @Override // p010kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext
    public boolean isStubTypeForBuilderInference(@NotNull SimpleTypeMarker simpleTypeMarker) {
        return ClassicTypeSystemContext.DefaultImpls.isStubTypeForBuilderInference(this, simpleTypeMarker);
    }

    @Override // p010kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext
    public boolean isTypeVariableType(@NotNull KotlinTypeMarker kotlinTypeMarker) {
        return ClassicTypeSystemContext.DefaultImpls.isTypeVariableType(this, kotlinTypeMarker);
    }

    @Override // p010kotlin.reflect.jvm.internal.impl.types.TypeSystemCommonBackendContext
    public boolean isUnderKotlinPackage(@NotNull TypeConstructorMarker typeConstructorMarker) {
        return ClassicTypeSystemContext.DefaultImpls.isUnderKotlinPackage(this, typeConstructorMarker);
    }

    @Override // p010kotlin.reflect.jvm.internal.impl.types.checker.ClassicTypeSystemContext, p010kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext
    @NotNull
    public SimpleTypeMarker lowerBound(@NotNull FlexibleTypeMarker flexibleTypeMarker) {
        return ClassicTypeSystemContext.DefaultImpls.lowerBound(this, flexibleTypeMarker);
    }

    @Override // p010kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext
    @NotNull
    public SimpleTypeMarker lowerBoundIfFlexible(KotlinTypeMarker kotlinTypeMarker) {
        SimpleTypeMarker simpleTypeMarkerLowerBound;
        Intrinsics.checkNotNullParameter(kotlinTypeMarker, "<this>");
        FlexibleTypeMarker flexibleTypeMarkerAsFlexibleType = asFlexibleType(kotlinTypeMarker);
        if (flexibleTypeMarkerAsFlexibleType != null && (simpleTypeMarkerLowerBound = lowerBound(flexibleTypeMarkerAsFlexibleType)) != null) {
            return simpleTypeMarkerLowerBound;
        }
        SimpleTypeMarker simpleTypeMarkerAsSimpleType = asSimpleType(kotlinTypeMarker);
        Intrinsics.checkNotNull(simpleTypeMarkerAsSimpleType);
        return simpleTypeMarkerAsSimpleType;
    }

    @Override // p010kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext
    @Nullable
    public KotlinTypeMarker lowerType(@NotNull CapturedTypeMarker capturedTypeMarker) {
        return ClassicTypeSystemContext.DefaultImpls.lowerType(this, capturedTypeMarker);
    }

    @Override // p010kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext
    @NotNull
    public KotlinTypeMarker makeDefinitelyNotNullOrNotNull(@NotNull KotlinTypeMarker kotlinTypeMarker) {
        return ClassicTypeSystemContext.DefaultImpls.makeDefinitelyNotNullOrNotNull(this, kotlinTypeMarker);
    }

    @Override // p010kotlin.reflect.jvm.internal.impl.types.TypeSystemCommonBackendContext
    @NotNull
    public KotlinTypeMarker makeNullable(KotlinTypeMarker kotlinTypeMarker) {
        SimpleTypeMarker simpleTypeMarkerWithNullability;
        Intrinsics.checkNotNullParameter(kotlinTypeMarker, "<this>");
        SimpleTypeMarker simpleTypeMarkerAsSimpleType = asSimpleType(kotlinTypeMarker);
        return (simpleTypeMarkerAsSimpleType == null || (simpleTypeMarkerWithNullability = withNullability(simpleTypeMarkerAsSimpleType, true)) == null) ? kotlinTypeMarker : simpleTypeMarkerWithNullability;
    }

    @NotNull
    public TypeCheckerState newTypeCheckerState(boolean z, boolean z2) {
        return ClassicTypeSystemContext.DefaultImpls.newTypeCheckerState(this, z, z2);
    }

    @Override // p010kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext
    @NotNull
    public SimpleTypeMarker original(@NotNull DefinitelyNotNullTypeMarker definitelyNotNullTypeMarker) {
        return ClassicTypeSystemContext.DefaultImpls.original(this, definitelyNotNullTypeMarker);
    }

    @Override // p010kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext
    @NotNull
    public SimpleTypeMarker originalIfDefinitelyNotNullable(SimpleTypeMarker simpleTypeMarker) {
        SimpleTypeMarker simpleTypeMarkerOriginal;
        Intrinsics.checkNotNullParameter(simpleTypeMarker, "<this>");
        DefinitelyNotNullTypeMarker definitelyNotNullTypeMarkerAsDefinitelyNotNullType = asDefinitelyNotNullType(simpleTypeMarker);
        return (definitelyNotNullTypeMarkerAsDefinitelyNotNullType == null || (simpleTypeMarkerOriginal = original(definitelyNotNullTypeMarkerAsDefinitelyNotNullType)) == null) ? simpleTypeMarker : simpleTypeMarkerOriginal;
    }

    @Override // p010kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext
    public int parametersCount(@NotNull TypeConstructorMarker typeConstructorMarker) {
        return ClassicTypeSystemContext.DefaultImpls.parametersCount(this, typeConstructorMarker);
    }

    @Override // p010kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext
    @NotNull
    public Collection<KotlinTypeMarker> possibleIntegerTypes(@NotNull SimpleTypeMarker simpleTypeMarker) {
        return ClassicTypeSystemContext.DefaultImpls.possibleIntegerTypes(this, simpleTypeMarker);
    }

    @Override // p010kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext
    @NotNull
    public TypeArgumentMarker projection(@NotNull CapturedTypeConstructorMarker capturedTypeConstructorMarker) {
        return ClassicTypeSystemContext.DefaultImpls.projection(this, capturedTypeConstructorMarker);
    }

    @Override // p010kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext
    public int size(TypeArgumentListMarker typeArgumentListMarker) {
        Intrinsics.checkNotNullParameter(typeArgumentListMarker, "<this>");
        if (typeArgumentListMarker instanceof SimpleTypeMarker) {
            return argumentsCount((KotlinTypeMarker) typeArgumentListMarker);
        }
        if (typeArgumentListMarker instanceof ArgumentList) {
            return ((ArgumentList) typeArgumentListMarker).size();
        }
        throw new IllegalStateException(("unknown type argument list type: " + typeArgumentListMarker + ", " + Reflection.getOrCreateKotlinClass(typeArgumentListMarker.getClass())).toString());
    }

    @Override // p010kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext
    @NotNull
    public TypeCheckerState.SupertypesPolicy substitutionSupertypePolicy(@NotNull SimpleTypeMarker simpleTypeMarker) {
        return ClassicTypeSystemContext.DefaultImpls.substitutionSupertypePolicy(this, simpleTypeMarker);
    }

    @Override // p010kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext
    @NotNull
    public Collection<KotlinTypeMarker> supertypes(@NotNull TypeConstructorMarker typeConstructorMarker) {
        return ClassicTypeSystemContext.DefaultImpls.supertypes(this, typeConstructorMarker);
    }

    @Override // p010kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext
    @NotNull
    public CapturedTypeConstructorMarker typeConstructor(@NotNull CapturedTypeMarker capturedTypeMarker) {
        return ClassicTypeSystemContext.DefaultImpls.typeConstructor((ClassicTypeSystemContext) this, capturedTypeMarker);
    }

    @Override // p010kotlin.reflect.jvm.internal.impl.types.checker.ClassicTypeSystemContext, p010kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext
    @NotNull
    public SimpleTypeMarker upperBound(@NotNull FlexibleTypeMarker flexibleTypeMarker) {
        return ClassicTypeSystemContext.DefaultImpls.upperBound(this, flexibleTypeMarker);
    }

    @Override // p010kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext
    @NotNull
    public SimpleTypeMarker upperBoundIfFlexible(KotlinTypeMarker kotlinTypeMarker) {
        SimpleTypeMarker simpleTypeMarkerUpperBound;
        Intrinsics.checkNotNullParameter(kotlinTypeMarker, "<this>");
        FlexibleTypeMarker flexibleTypeMarkerAsFlexibleType = asFlexibleType(kotlinTypeMarker);
        if (flexibleTypeMarkerAsFlexibleType != null && (simpleTypeMarkerUpperBound = upperBound(flexibleTypeMarkerAsFlexibleType)) != null) {
            return simpleTypeMarkerUpperBound;
        }
        SimpleTypeMarker simpleTypeMarkerAsSimpleType = asSimpleType(kotlinTypeMarker);
        Intrinsics.checkNotNull(simpleTypeMarkerAsSimpleType);
        return simpleTypeMarkerAsSimpleType;
    }

    @Override // p010kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext
    @NotNull
    public KotlinTypeMarker withNullability(@NotNull KotlinTypeMarker kotlinTypeMarker, boolean z) {
        return ClassicTypeSystemContext.DefaultImpls.withNullability(this, kotlinTypeMarker, z);
    }

    @Override // p010kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext
    @NotNull
    public TypeVariance getVariance(@NotNull TypeParameterMarker typeParameterMarker) {
        return ClassicTypeSystemContext.DefaultImpls.getVariance(this, typeParameterMarker);
    }

    @Override // p010kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext
    public boolean isMarkedNullable(KotlinTypeMarker kotlinTypeMarker) {
        Intrinsics.checkNotNullParameter(kotlinTypeMarker, "<this>");
        return (kotlinTypeMarker instanceof SimpleTypeMarker) && isMarkedNullable((SimpleTypeMarker) kotlinTypeMarker);
    }

    @Override // p010kotlin.reflect.jvm.internal.impl.types.checker.ClassicTypeSystemContext, p010kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext
    @NotNull
    public TypeConstructorMarker typeConstructor(@NotNull SimpleTypeMarker simpleTypeMarker) {
        return ClassicTypeSystemContext.DefaultImpls.typeConstructor(this, simpleTypeMarker);
    }

    @Override // p010kotlin.reflect.jvm.internal.impl.types.checker.ClassicTypeSystemContext, p010kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext
    @NotNull
    public SimpleTypeMarker withNullability(@NotNull SimpleTypeMarker simpleTypeMarker, boolean z) {
        return ClassicTypeSystemContext.DefaultImpls.withNullability((ClassicTypeSystemContext) this, simpleTypeMarker, z);
    }

    @Override // p010kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext
    @NotNull
    public TypeConstructorMarker typeConstructor(KotlinTypeMarker kotlinTypeMarker) {
        Intrinsics.checkNotNullParameter(kotlinTypeMarker, "<this>");
        SimpleTypeMarker simpleTypeMarkerAsSimpleType = asSimpleType(kotlinTypeMarker);
        if (simpleTypeMarkerAsSimpleType == null) {
            simpleTypeMarkerAsSimpleType = lowerBoundIfFlexible(kotlinTypeMarker);
        }
        return typeConstructor(simpleTypeMarkerAsSimpleType);
    }
}
