package androidx.window.embedding;

import androidx.annotation.FloatRange;
import com.oplus.aiunit.vision.iim;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.JvmField;
import p010kotlin.jvm.JvmStatic;
import p010kotlin.jvm.internal.DefaultConstructorMarker;
import p010kotlin.jvm.internal.Intrinsics;
import p010kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\u0018\u0000 \u00112\u00020\u0001:\u0001\u0011B\u0017\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0013\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\b\u0010\u000e\u001a\u00020\u000fH\u0016J\b\u0010\u0010\u001a\u00020\u0003H\u0016R\u0014\u0010\u0002\u001a\u00020\u0003X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\u0004\u001a\u00020\u0005X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0012"}, d2 = {"Landroidx/window/embedding/EmbeddingAspectRatio;", "", iim.a.f, "", "value", "", "(Ljava/lang/String;F)V", "getDescription$window_release", "()Ljava/lang/String;", "getValue$window_release", "()F", "equals", "", "other", "hashCode", "", "toString", "Companion", "window_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class EmbeddingAspectRatio {

    @NotNull
    private final String description;
    private final float value;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @JvmField
    @NotNull
    public static final EmbeddingAspectRatio ALWAYS_ALLOW = new EmbeddingAspectRatio("ALWAYS_ALLOW", 0.0f);

    @JvmField
    @NotNull
    public static final EmbeddingAspectRatio ALWAYS_DISALLOW = new EmbeddingAspectRatio("ALWAYS_DISALLOW", -1.0f);

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0015\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\bH\u0000¢\u0006\u0002\b\tJ\u0012\u0010\n\u001a\u00020\u00042\b\b\u0001\u0010\n\u001a\u00020\bH\u0007R\u0010\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u000b"}, d2 = {"Landroidx/window/embedding/EmbeddingAspectRatio$Companion;", "", "()V", "ALWAYS_ALLOW", "Landroidx/window/embedding/EmbeddingAspectRatio;", "ALWAYS_DISALLOW", "buildAspectRatioFromValue", "value", "", "buildAspectRatioFromValue$window_release", "ratio", "window_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    @SourceDebugExtension({"SMAP\nEmbeddingAspectRatio.kt\nKotlin\n*S Kotlin\n*F\n+ 1 EmbeddingAspectRatio.kt\nandroidx/window/embedding/EmbeddingAspectRatio$Companion\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,109:1\n1#2:110\n*E\n"})
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final EmbeddingAspectRatio buildAspectRatioFromValue$window_release(float value) {
            EmbeddingAspectRatio embeddingAspectRatio = EmbeddingAspectRatio.ALWAYS_ALLOW;
            if (value == embeddingAspectRatio.getValue()) {
                return embeddingAspectRatio;
            }
            EmbeddingAspectRatio embeddingAspectRatio2 = EmbeddingAspectRatio.ALWAYS_DISALLOW;
            return value == embeddingAspectRatio2.getValue() ? embeddingAspectRatio2 : ratio(value);
        }

        @JvmStatic
        @NotNull
        public final EmbeddingAspectRatio ratio(@FloatRange(from = 1.0d, fromInclusive = false) float ratio) {
            if (!(ratio > 1.0f)) {
                throw new IllegalArgumentException("Ratio must be greater than 1.".toString());
            }
            return new EmbeddingAspectRatio("ratio:" + ratio, ratio, null);
        }
    }

    public /* synthetic */ EmbeddingAspectRatio(String str, float f, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, f);
    }

    @JvmStatic
    @NotNull
    public static final EmbeddingAspectRatio ratio(@FloatRange(from = 1.0d, fromInclusive = false) float f) {
        return INSTANCE.ratio(f);
    }

    public boolean equals(@Nullable Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof EmbeddingAspectRatio)) {
            return false;
        }
        EmbeddingAspectRatio embeddingAspectRatio = (EmbeddingAspectRatio) other;
        return ((this.value > embeddingAspectRatio.value ? 1 : (this.value == embeddingAspectRatio.value ? 0 : -1)) == 0) && Intrinsics.areEqual(this.description, embeddingAspectRatio.description);
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
        return "EmbeddingAspectRatio(" + this.description + ')';
    }

    private EmbeddingAspectRatio(String str, float f) {
        this.description = str;
        this.value = f;
    }
}
