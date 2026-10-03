package androidx.window.embedding;

import android.annotation.SuppressLint;
import androidx.annotation.FloatRange;
import androidx.annotation.IntRange;
import androidx.annotation.RestrictTo;
import androidx.window.core.SpecificationComputer;
import androidx.window.core.VerificationMode;
import com.oplus.aiunit.vision.iim;
import com.oplus.aiunit.vision.jla;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.collections.ArraysKt___ArraysKt;
import p010kotlin.jvm.JvmField;
import p010kotlin.jvm.JvmStatic;
import p010kotlin.jvm.functions.Function1;
import p010kotlin.jvm.internal.DefaultConstructorMarker;
import p010kotlin.jvm.internal.Intrinsics;
import p010kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\u0018\u0000 \u00132\u00020\u0001:\u0004\u0012\u0013\u0014\u0015B\u001b\b\u0007\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0013\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\b\u0010\u000e\u001a\u00020\u000fH\u0016J\b\u0010\u0010\u001a\u00020\u0011H\u0016R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0016"}, d2 = {"Landroidx/window/embedding/SplitAttributes;", "", "splitType", "Landroidx/window/embedding/SplitAttributes$SplitType;", "layoutDirection", "Landroidx/window/embedding/SplitAttributes$LayoutDirection;", "(Landroidx/window/embedding/SplitAttributes$SplitType;Landroidx/window/embedding/SplitAttributes$LayoutDirection;)V", "getLayoutDirection", "()Landroidx/window/embedding/SplitAttributes$LayoutDirection;", "getSplitType", "()Landroidx/window/embedding/SplitAttributes$SplitType;", "equals", "", "other", "hashCode", "", "toString", "", "Builder", "Companion", "LayoutDirection", "SplitType", "window_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class SplitAttributes {
    private static final String TAG = SplitAttributes.class.getSimpleName();

    /* JADX INFO: renamed from: layoutDirection, reason: from kotlin metadata and from toString */
    @NotNull
    private final LayoutDirection layoutDir;

    @NotNull
    private final SplitType splitType;

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0006\u0010\u0007\u001a\u00020\bJ\u000e\u0010\t\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0004J\u000e\u0010\n\u001a\u00020\u00002\u0006\u0010\u000b\u001a\u00020\u0006R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\f"}, d2 = {"Landroidx/window/embedding/SplitAttributes$Builder;", "", "()V", "layoutDirection", "Landroidx/window/embedding/SplitAttributes$LayoutDirection;", "splitType", "Landroidx/window/embedding/SplitAttributes$SplitType;", jla.DEFAULT_BUILD_METHOD, "Landroidx/window/embedding/SplitAttributes;", "setLayoutDirection", "setSplitType", "type", "window_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    @SourceDebugExtension({"SMAP\nSplitAttributes.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SplitAttributes.kt\nandroidx/window/embedding/SplitAttributes$Builder\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,443:1\n1#2:444\n*E\n"})
    public static final class Builder {

        @NotNull
        private SplitType splitType = SplitType.SPLIT_TYPE_EQUAL;

        @NotNull
        private LayoutDirection layoutDirection = LayoutDirection.LOCALE;

        @NotNull
        public final SplitAttributes build() {
            return new SplitAttributes(this.splitType, this.layoutDirection);
        }

        @NotNull
        public final Builder setLayoutDirection(@NotNull LayoutDirection layoutDirection) {
            Intrinsics.checkNotNullParameter(layoutDirection, "layoutDirection");
            this.layoutDirection = layoutDirection;
            return this;
        }

        @NotNull
        public final Builder setSplitType(@NotNull SplitType type) {
            Intrinsics.checkNotNullParameter(type, "type");
            this.splitType = type;
            return this;
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\u0018\u0000 \n2\u00020\u0001:\u0001\nB\u0017\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\b\u0010\t\u001a\u00020\u0003H\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0004\u001a\u00020\u0005X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\u000b"}, d2 = {"Landroidx/window/embedding/SplitAttributes$LayoutDirection;", "", iim.a.f, "", "value", "", "(Ljava/lang/String;I)V", "getValue$window_release", "()I", "toString", "Companion", "window_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class LayoutDirection {

        @NotNull
        private final String description;
        private final int value;

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        @NotNull
        public static final Companion INSTANCE = new Companion(null);

        @JvmField
        @NotNull
        public static final LayoutDirection LOCALE = new LayoutDirection("LOCALE", 0);

        @JvmField
        @NotNull
        public static final LayoutDirection LEFT_TO_RIGHT = new LayoutDirection("LEFT_TO_RIGHT", 1);

        @JvmField
        @NotNull
        public static final LayoutDirection RIGHT_TO_LEFT = new LayoutDirection("RIGHT_TO_LEFT", 2);

        @JvmField
        @NotNull
        public static final LayoutDirection TOP_TO_BOTTOM = new LayoutDirection("TOP_TO_BOTTOM", 3);

        @JvmField
        @NotNull
        public static final LayoutDirection BOTTOM_TO_TOP = new LayoutDirection("BOTTOM_TO_TOP", 4);

        @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0017\u0010\t\u001a\u00020\u00042\b\b\u0001\u0010\n\u001a\u00020\u000bH\u0001¢\u0006\u0002\b\fR\u0010\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0006\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0007\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\b\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"Landroidx/window/embedding/SplitAttributes$LayoutDirection$Companion;", "", "()V", "BOTTOM_TO_TOP", "Landroidx/window/embedding/SplitAttributes$LayoutDirection;", "LEFT_TO_RIGHT", "LOCALE", "RIGHT_TO_LEFT", "TOP_TO_BOTTOM", "getLayoutDirectionFromValue", "value", "", "getLayoutDirectionFromValue$window_release", "window_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            @JvmStatic
            @NotNull
            public final LayoutDirection getLayoutDirectionFromValue$window_release(@IntRange(from = 0, to = 4) int value) {
                LayoutDirection layoutDirection = LayoutDirection.LEFT_TO_RIGHT;
                if (value != layoutDirection.getValue()) {
                    layoutDirection = LayoutDirection.RIGHT_TO_LEFT;
                    if (value != layoutDirection.getValue()) {
                        layoutDirection = LayoutDirection.LOCALE;
                        if (value != layoutDirection.getValue()) {
                            layoutDirection = LayoutDirection.TOP_TO_BOTTOM;
                            if (value != layoutDirection.getValue()) {
                                layoutDirection = LayoutDirection.BOTTOM_TO_TOP;
                                if (value != layoutDirection.getValue()) {
                                    throw new IllegalArgumentException("Undefined value:" + value);
                                }
                            }
                        }
                    }
                }
                return layoutDirection;
            }
        }

        private LayoutDirection(String str, int i) {
            this.description = str;
            this.value = i;
        }

        /* JADX INFO: renamed from: getValue$window_release, reason: from getter */
        public final int getValue() {
            return this.value;
        }

        @NotNull
        /* JADX INFO: renamed from: toString, reason: from getter */
        public String getDescription() {
            return this.description;
        }
    }

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\u0018\u0000 \u00112\u00020\u0001:\u0001\u0011B\u0017\b\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0013\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\b\u0010\u000e\u001a\u00020\u000fH\u0016J\b\u0010\u0010\u001a\u00020\u0003H\u0016R\u0014\u0010\u0002\u001a\u00020\u0003X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\u0004\u001a\u00020\u0005X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0012"}, d2 = {"Landroidx/window/embedding/SplitAttributes$SplitType;", "", iim.a.f, "", "value", "", "(Ljava/lang/String;F)V", "getDescription$window_release", "()Ljava/lang/String;", "getValue$window_release", "()F", "equals", "", "other", "hashCode", "", "toString", "Companion", "window_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class SplitType {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        @NotNull
        public static final Companion INSTANCE;

        @JvmField
        @NotNull
        public static final SplitType SPLIT_TYPE_EQUAL;

        @JvmField
        @NotNull
        public static final SplitType SPLIT_TYPE_EXPAND;

        @JvmField
        @NotNull
        public static final SplitType SPLIT_TYPE_HINGE;

        @NotNull
        private final String description;
        private final float value;

        @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0017\u0010\u0007\u001a\u00020\u00042\b\b\u0001\u0010\b\u001a\u00020\tH\u0001¢\u0006\u0002\b\nJ\u0012\u0010\u000b\u001a\u00020\u00042\b\b\u0001\u0010\u000b\u001a\u00020\tH\u0007R\u0010\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0006\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\f"}, d2 = {"Landroidx/window/embedding/SplitAttributes$SplitType$Companion;", "", "()V", "SPLIT_TYPE_EQUAL", "Landroidx/window/embedding/SplitAttributes$SplitType;", "SPLIT_TYPE_EXPAND", "SPLIT_TYPE_HINGE", "buildSplitTypeFromValue", "value", "", "buildSplitTypeFromValue$window_release", "ratio", "window_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            @SuppressLint({"Range"})
            @NotNull
            public final SplitType buildSplitTypeFromValue$window_release(@FloatRange(from = 0.0d, to = 1.0d, toInclusive = false) float value) {
                SplitType splitType = SplitType.SPLIT_TYPE_EXPAND;
                return (value > splitType.getValue() ? 1 : (value == splitType.getValue() ? 0 : -1)) == 0 ? splitType : ratio(value);
            }

            @JvmStatic
            @NotNull
            public final SplitType ratio(@FloatRange(from = 0.0d, fromInclusive = false, to = 1.0d, toInclusive = false) final float ratio) {
                SpecificationComputer.Companion companion = SpecificationComputer.INSTANCE;
                Float fValueOf = Float.valueOf(ratio);
                String TAG = SplitAttributes.TAG;
                Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
                Object objCompute = SpecificationComputer.Companion.startSpecification$default(companion, fValueOf, TAG, VerificationMode.STRICT, null, 4, null).require("Ratio must be in range (0.0, 1.0). Use SplitType.expandContainers() instead of 0 or 1.", new Function1<Float, Boolean>() { // from class: androidx.window.embedding.SplitAttributes$SplitType$Companion$ratio$checkedRatio$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // p010kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Boolean invoke(Float f) {
                        return invoke(f.floatValue());
                    }

                    @NotNull
                    public final Boolean invoke(float f) {
                        double d = ratio;
                        return Boolean.valueOf(((0.0d > d ? 1 : (0.0d == d ? 0 : -1)) <= 0 && (d > 1.0d ? 1 : (d == 1.0d ? 0 : -1)) <= 0) && !ArraysKt___ArraysKt.contains(new Float[]{Float.valueOf(0.0f), Float.valueOf(1.0f)}, Float.valueOf(ratio)));
                    }
                }).compute();
                Intrinsics.checkNotNull(objCompute);
                float fFloatValue = ((Number) objCompute).floatValue();
                return new SplitType("ratio:" + fFloatValue, fFloatValue);
            }
        }

        static {
            Companion companion = new Companion(null);
            INSTANCE = companion;
            SPLIT_TYPE_EXPAND = new SplitType("expandContainers", 0.0f);
            SPLIT_TYPE_EQUAL = companion.ratio(0.5f);
            SPLIT_TYPE_HINGE = new SplitType("hinge", -1.0f);
        }

        public SplitType(@NotNull String description, float f) {
            Intrinsics.checkNotNullParameter(description, "description");
            this.description = description;
            this.value = f;
        }

        @JvmStatic
        @NotNull
        public static final SplitType ratio(@FloatRange(from = 0.0d, fromInclusive = false, to = 1.0d, toInclusive = false) float f) {
            return INSTANCE.ratio(f);
        }

        public boolean equals(@Nullable Object other) {
            if (other == this) {
                return true;
            }
            if (!(other instanceof SplitType)) {
                return false;
            }
            SplitType splitType = (SplitType) other;
            return ((this.value > splitType.value ? 1 : (this.value == splitType.value ? 0 : -1)) == 0) && Intrinsics.areEqual(this.description, splitType.description);
        }

        @NotNull
        /* JADX INFO: renamed from: getDescription$window_release, reason: from getter */
        public final String getDescription() {
            return this.description;
        }

        /* JADX INFO: renamed from: getValue$window_release, reason: from getter */
        public final float getValue() {
            return this.value;
        }

        public int hashCode() {
            return this.description.hashCode() + (Float.hashCode(this.value) * 31);
        }

        @NotNull
        public String toString() {
            return this.description;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public SplitAttributes() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SplitAttributes)) {
            return false;
        }
        SplitAttributes splitAttributes = (SplitAttributes) other;
        return Intrinsics.areEqual(this.splitType, splitAttributes.splitType) && Intrinsics.areEqual(this.layoutDir, splitAttributes.layoutDir);
    }

    @NotNull
    /* JADX INFO: renamed from: getLayoutDirection, reason: from getter */
    public final LayoutDirection getLayoutDir() {
        return this.layoutDir;
    }

    @NotNull
    public final SplitType getSplitType() {
        return this.splitType;
    }

    public int hashCode() {
        return (this.splitType.hashCode() * 31) + this.layoutDir.hashCode();
    }

    @NotNull
    public String toString() {
        return SplitAttributes.class.getSimpleName() + ":{splitType=" + this.splitType + ", layoutDir=" + this.layoutDir + " }";
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public SplitAttributes(@NotNull SplitType splitType, @NotNull LayoutDirection layoutDirection) {
        Intrinsics.checkNotNullParameter(splitType, "splitType");
        Intrinsics.checkNotNullParameter(layoutDirection, "layoutDirection");
        this.splitType = splitType;
        this.layoutDir = layoutDirection;
    }

    public /* synthetic */ SplitAttributes(SplitType splitType, LayoutDirection layoutDirection, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? SplitType.SPLIT_TYPE_EQUAL : splitType, (i & 2) != 0 ? LayoutDirection.LOCALE : layoutDirection);
    }
}
