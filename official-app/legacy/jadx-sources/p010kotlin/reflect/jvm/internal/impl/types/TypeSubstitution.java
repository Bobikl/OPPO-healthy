package p010kotlin.reflect.jvm.internal.impl.types;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.jvm.JvmField;
import p010kotlin.jvm.internal.DefaultConstructorMarker;
import p010kotlin.jvm.internal.Intrinsics;
import p010kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations;

/* JADX INFO: loaded from: classes11.dex */
public abstract class TypeSubstitution {

    @NotNull
    public static final Companion Companion = new Companion(null);

    @JvmField
    @NotNull
    public static final TypeSubstitution EMPTY = new TypeSubstitution() { // from class: kotlin.reflect.jvm.internal.impl.types.TypeSubstitution$Companion$EMPTY$1
        @Nullable
        public Void get(@NotNull KotlinType key) {
            Intrinsics.checkNotNullParameter(key, "key");
            return null;
        }

        @Override // p010kotlin.reflect.jvm.internal.impl.types.TypeSubstitution
        public boolean isEmpty() {
            return true;
        }

        @NotNull
        public String toString() {
            return "Empty TypeSubstitution";
        }

        @Override // p010kotlin.reflect.jvm.internal.impl.types.TypeSubstitution
        /* JADX INFO: renamed from: get, reason: collision with other method in class */
        public /* bridge */ /* synthetic */ TypeProjection mo6589get(KotlinType kotlinType) {
            return (TypeProjection) get(kotlinType);
        }
    };

    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public boolean approximateCapturedTypes() {
        return false;
    }

    public boolean approximateContravariantCapturedTypes() {
        return false;
    }

    @NotNull
    public final TypeSubstitutor buildSubstitutor() {
        TypeSubstitutor typeSubstitutorCreate = TypeSubstitutor.create(this);
        Intrinsics.checkNotNullExpressionValue(typeSubstitutorCreate, "create(this)");
        return typeSubstitutorCreate;
    }

    @NotNull
    public Annotations filterAnnotations(@NotNull Annotations annotations) {
        Intrinsics.checkNotNullParameter(annotations, "annotations");
        return annotations;
    }

    @Nullable
    /* JADX INFO: renamed from: get */
    public abstract TypeProjection mo6589get(@NotNull KotlinType kotlinType);

    public boolean isEmpty() {
        return false;
    }

    @NotNull
    public KotlinType prepareTopLevelType(@NotNull KotlinType topLevelType, @NotNull Variance position) {
        Intrinsics.checkNotNullParameter(topLevelType, "topLevelType");
        Intrinsics.checkNotNullParameter(position, "position");
        return topLevelType;
    }

    @NotNull
    public final TypeSubstitution replaceWithNonApproximating() {
        return new TypeSubstitution() { // from class: kotlin.reflect.jvm.internal.impl.types.TypeSubstitution.replaceWithNonApproximating.1
            @Override // p010kotlin.reflect.jvm.internal.impl.types.TypeSubstitution
            public boolean approximateCapturedTypes() {
                return false;
            }

            @Override // p010kotlin.reflect.jvm.internal.impl.types.TypeSubstitution
            public boolean approximateContravariantCapturedTypes() {
                return false;
            }

            @Override // p010kotlin.reflect.jvm.internal.impl.types.TypeSubstitution
            @NotNull
            public Annotations filterAnnotations(@NotNull Annotations annotations) {
                Intrinsics.checkNotNullParameter(annotations, "annotations");
                return TypeSubstitution.this.filterAnnotations(annotations);
            }

            @Override // p010kotlin.reflect.jvm.internal.impl.types.TypeSubstitution
            @Nullable
            /* JADX INFO: renamed from: get */
            public TypeProjection mo6589get(@NotNull KotlinType key) {
                Intrinsics.checkNotNullParameter(key, "key");
                return TypeSubstitution.this.mo6589get(key);
            }

            @Override // p010kotlin.reflect.jvm.internal.impl.types.TypeSubstitution
            public boolean isEmpty() {
                return TypeSubstitution.this.isEmpty();
            }

            @Override // p010kotlin.reflect.jvm.internal.impl.types.TypeSubstitution
            @NotNull
            public KotlinType prepareTopLevelType(@NotNull KotlinType topLevelType, @NotNull Variance position) {
                Intrinsics.checkNotNullParameter(topLevelType, "topLevelType");
                Intrinsics.checkNotNullParameter(position, "position");
                return TypeSubstitution.this.prepareTopLevelType(topLevelType, position);
            }
        };
    }
}
