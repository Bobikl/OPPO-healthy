package androidx.compose.ui.unit;

import androidx.compose.runtime.Immutable;
import androidx.compose.runtime.Stable;
import com.heytap.nearx.tangramconfig.strategy.Fields;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;
import p010kotlin.PublishedApi;
import p010kotlin.jvm.JvmInline;
import p010kotlin.jvm.internal.DefaultConstructorMarker;
import p010kotlin.jvm.internal.FloatCompanionObject;
import p010kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\r\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0087@\u0018\u0000 02\u00020\u0001:\u00010B\u0014\b\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0003ø\u0001\u0000¢\u0006\u0004\b\u0004\u0010\u0005J\u0019\u0010\u0010\u001a\u00020\u0007H\u0087\nø\u0001\u0002ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\u0011\u0010\u000bJ\u0019\u0010\u0012\u001a\u00020\u0007H\u0087\nø\u0001\u0002ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\u0013\u0010\u000bJ'\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\r\u001a\u00020\u00072\b\b\u0002\u0010\u0006\u001a\u00020\u0007ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\u0015\u0010\u0016J!\u0010\u0017\u001a\u00020\u00002\u0006\u0010\u0018\u001a\u00020\u0019H\u0087\u0002ø\u0001\u0002ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\u001a\u0010\u001bJ!\u0010\u0017\u001a\u00020\u00002\u0006\u0010\u0018\u001a\u00020\u001cH\u0087\u0002ø\u0001\u0002ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\u001a\u0010\u001dJ\u001a\u0010\u001e\u001a\u00020\u001f2\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b \u0010!J\u0010\u0010\"\u001a\u00020\u001cHÖ\u0001¢\u0006\u0004\b#\u0010$J\u001e\u0010%\u001a\u00020\u00002\u0006\u0010\u0018\u001a\u00020\u0000H\u0087\nø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b&\u0010'J\u001e\u0010(\u001a\u00020\u00002\u0006\u0010\u0018\u001a\u00020\u0000H\u0087\nø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b)\u0010'J!\u0010*\u001a\u00020\u00002\u0006\u0010\u0018\u001a\u00020\u0019H\u0087\u0002ø\u0001\u0002ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b+\u0010\u001bJ!\u0010*\u001a\u00020\u00002\u0006\u0010\u0018\u001a\u00020\u001cH\u0087\u0002ø\u0001\u0002ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b+\u0010\u001dJ\u000f\u0010,\u001a\u00020-H\u0017¢\u0006\u0004\b.\u0010/R#\u0010\u0006\u001a\u00020\u00078FX\u0087\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\u0012\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bR\u0016\u0010\u0002\u001a\u00020\u00038\u0000X\u0081\u0004¢\u0006\b\n\u0000\u0012\u0004\b\f\u0010\tR#\u0010\r\u001a\u00020\u00078FX\u0087\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\u0012\u0004\b\u000e\u0010\t\u001a\u0004\b\u000f\u0010\u000b\u0088\u0001\u0002\u0092\u0001\u00020\u0003ø\u0001\u0000\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u00061"}, d2 = {"Landroidx/compose/ui/unit/DpSize;", "", "packedValue", "", "constructor-impl", "(J)J", Fields.HEIGHT_FIELD, "Landroidx/compose/ui/unit/Dp;", "getHeight-D9Ej5fM$annotations", "()V", "getHeight-D9Ej5fM", "(J)F", "getPackedValue$annotations", Fields.WIDTH_FIELD, "getWidth-D9Ej5fM$annotations", "getWidth-D9Ej5fM", "component1", "component1-D9Ej5fM", "component2", "component2-D9Ej5fM", "copy", "copy-DwJknco", "(JFF)J", "div", "other", "", "div-Gh9hcWk", "(JF)J", "", "(JI)J", "equals", "", "equals-impl", "(JLjava/lang/Object;)Z", "hashCode", "hashCode-impl", "(J)I", "minus", "minus-e_xh8Ic", "(JJ)J", "plus", "plus-e_xh8Ic", "times", "times-Gh9hcWk", "toString", "", "toString-impl", "(J)Ljava/lang/String;", "Companion", "ui-unit_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@Immutable
@JvmInline
@SourceDebugExtension({"SMAP\nDp.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Dp.kt\nandroidx/compose/ui/unit/DpSize\n+ 2 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 Dp.kt\nandroidx/compose/ui/unit/Dp\n*L\n1#1,557:1\n34#2:558\n41#2:560\n174#3:559\n174#3:561\n473#3:568\n154#3:569\n58#4:562\n51#4:563\n92#4:564\n88#4:565\n75#4:566\n71#4:567\n*S KotlinDebug\n*F\n+ 1 Dp.kt\nandroidx/compose/ui/unit/DpSize\n*L\n391#1:558\n404#1:560\n391#1:559\n404#1:561\n447#1:568\n457#1:569\n418#1:562\n425#1:563\n434#1:564\n437#1:565\n440#1:566\n443#1:567\n*E\n"})
public final class DpSize {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    private static final long Unspecified;
    private static final long Zero;
    private final long packedValue;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u001c\u0010\u0003\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\u0005\u0010\u0006R\u001c\u0010\b\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\t\u0010\u0006\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\n"}, d2 = {"Landroidx/compose/ui/unit/DpSize$Companion;", "", "()V", "Unspecified", "Landroidx/compose/ui/unit/DpSize;", "getUnspecified-MYxV2XQ", "()J", "J", "Zero", "getZero-MYxV2XQ", "ui-unit_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: renamed from: getUnspecified-MYxV2XQ, reason: not valid java name */
        public final long m4211getUnspecifiedMYxV2XQ() {
            return DpSize.Unspecified;
        }

        /* JADX INFO: renamed from: getZero-MYxV2XQ, reason: not valid java name */
        public final long m4212getZeroMYxV2XQ() {
            return DpSize.Zero;
        }
    }

    static {
        float f = 0;
        Zero = DpKt.m4126DpSizeYgX7TsA(Dp.m4104constructorimpl(f), Dp.m4104constructorimpl(f));
        Dp.Companion companion = Dp.INSTANCE;
        Unspecified = DpKt.m4126DpSizeYgX7TsA(companion.m4124getUnspecifiedD9Ej5fM(), companion.m4124getUnspecifiedD9Ej5fM());
    }

    private /* synthetic */ DpSize(long j2) {
        this.packedValue = j2;
    }

    /* JADX INFO: renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ DpSize m4190boximpl(long j2) {
        return new DpSize(j2);
    }

    @Stable
    /* JADX INFO: renamed from: component1-D9Ej5fM, reason: not valid java name */
    public static final float m4191component1D9Ej5fM(long j2) {
        return m4202getWidthD9Ej5fM(j2);
    }

    @Stable
    /* JADX INFO: renamed from: component2-D9Ej5fM, reason: not valid java name */
    public static final float m4192component2D9Ej5fM(long j2) {
        return m4200getHeightD9Ej5fM(j2);
    }

    /* JADX INFO: renamed from: constructor-impl, reason: not valid java name */
    public static long m4193constructorimpl(long j2) {
        return j2;
    }

    /* JADX INFO: renamed from: copy-DwJknco, reason: not valid java name */
    public static final long m4194copyDwJknco(long j2, float f, float f2) {
        return DpKt.m4126DpSizeYgX7TsA(f, f2);
    }

    /* JADX INFO: renamed from: copy-DwJknco$default, reason: not valid java name */
    public static /* synthetic */ long m4195copyDwJknco$default(long j2, float f, float f2, int i, Object obj) {
        if ((i & 1) != 0) {
            f = m4202getWidthD9Ej5fM(j2);
        }
        if ((i & 2) != 0) {
            f2 = m4200getHeightD9Ej5fM(j2);
        }
        return m4194copyDwJknco(j2, f, f2);
    }

    @Stable
    /* JADX INFO: renamed from: div-Gh9hcWk, reason: not valid java name */
    public static final long m4197divGh9hcWk(long j2, int i) {
        float f = i;
        return DpKt.m4126DpSizeYgX7TsA(Dp.m4104constructorimpl(m4202getWidthD9Ej5fM(j2) / f), Dp.m4104constructorimpl(m4200getHeightD9Ej5fM(j2) / f));
    }

    /* JADX INFO: renamed from: equals-impl, reason: not valid java name */
    public static boolean m4198equalsimpl(long j2, Object obj) {
        return (obj instanceof DpSize) && j2 == ((DpSize) obj).getPackedValue();
    }

    /* JADX INFO: renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m4199equalsimpl0(long j2, long j3) {
        return j2 == j3;
    }

    /* JADX INFO: renamed from: getHeight-D9Ej5fM, reason: not valid java name */
    public static final float m4200getHeightD9Ej5fM(long j2) {
        if (!(j2 != Unspecified)) {
            throw new IllegalStateException("DpSize is unspecified".toString());
        }
        FloatCompanionObject floatCompanionObject = FloatCompanionObject.INSTANCE;
        return Dp.m4104constructorimpl(Float.intBitsToFloat((int) (j2 & 4294967295L)));
    }

    @Stable
    /* JADX INFO: renamed from: getHeight-D9Ej5fM$annotations, reason: not valid java name */
    public static /* synthetic */ void m4201getHeightD9Ej5fM$annotations() {
    }

    @PublishedApi
    public static /* synthetic */ void getPackedValue$annotations() {
    }

    /* JADX INFO: renamed from: getWidth-D9Ej5fM, reason: not valid java name */
    public static final float m4202getWidthD9Ej5fM(long j2) {
        if (!(j2 != Unspecified)) {
            throw new IllegalStateException("DpSize is unspecified".toString());
        }
        FloatCompanionObject floatCompanionObject = FloatCompanionObject.INSTANCE;
        return Dp.m4104constructorimpl(Float.intBitsToFloat((int) (j2 >> 32)));
    }

    @Stable
    /* JADX INFO: renamed from: getWidth-D9Ej5fM$annotations, reason: not valid java name */
    public static /* synthetic */ void m4203getWidthD9Ej5fM$annotations() {
    }

    /* JADX INFO: renamed from: hashCode-impl, reason: not valid java name */
    public static int m4204hashCodeimpl(long j2) {
        return Long.hashCode(j2);
    }

    @Stable
    /* JADX INFO: renamed from: minus-e_xh8Ic, reason: not valid java name */
    public static final long m4205minuse_xh8Ic(long j2, long j3) {
        return DpKt.m4126DpSizeYgX7TsA(Dp.m4104constructorimpl(m4202getWidthD9Ej5fM(j2) - m4202getWidthD9Ej5fM(j3)), Dp.m4104constructorimpl(m4200getHeightD9Ej5fM(j2) - m4200getHeightD9Ej5fM(j3)));
    }

    @Stable
    /* JADX INFO: renamed from: plus-e_xh8Ic, reason: not valid java name */
    public static final long m4206pluse_xh8Ic(long j2, long j3) {
        return DpKt.m4126DpSizeYgX7TsA(Dp.m4104constructorimpl(m4202getWidthD9Ej5fM(j2) + m4202getWidthD9Ej5fM(j3)), Dp.m4104constructorimpl(m4200getHeightD9Ej5fM(j2) + m4200getHeightD9Ej5fM(j3)));
    }

    @Stable
    /* JADX INFO: renamed from: times-Gh9hcWk, reason: not valid java name */
    public static final long m4208timesGh9hcWk(long j2, int i) {
        float f = i;
        return DpKt.m4126DpSizeYgX7TsA(Dp.m4104constructorimpl(m4202getWidthD9Ej5fM(j2) * f), Dp.m4104constructorimpl(m4200getHeightD9Ej5fM(j2) * f));
    }

    @Stable
    @NotNull
    /* JADX INFO: renamed from: toString-impl, reason: not valid java name */
    public static String m4209toStringimpl(long j2) {
        if (!(j2 != INSTANCE.m4211getUnspecifiedMYxV2XQ())) {
            return "DpSize.Unspecified";
        }
        return ((Object) Dp.m4115toStringimpl(m4202getWidthD9Ej5fM(j2))) + " x " + ((Object) Dp.m4115toStringimpl(m4200getHeightD9Ej5fM(j2)));
    }

    public boolean equals(Object obj) {
        return m4198equalsimpl(this.packedValue, obj);
    }

    public int hashCode() {
        return m4204hashCodeimpl(this.packedValue);
    }

    @Stable
    @NotNull
    public String toString() {
        return m4209toStringimpl(this.packedValue);
    }

    /* JADX INFO: renamed from: unbox-impl, reason: not valid java name and from getter */
    public final /* synthetic */ long getPackedValue() {
        return this.packedValue;
    }

    @Stable
    /* JADX INFO: renamed from: div-Gh9hcWk, reason: not valid java name */
    public static final long m4196divGh9hcWk(long j2, float f) {
        return DpKt.m4126DpSizeYgX7TsA(Dp.m4104constructorimpl(m4202getWidthD9Ej5fM(j2) / f), Dp.m4104constructorimpl(m4200getHeightD9Ej5fM(j2) / f));
    }

    @Stable
    /* JADX INFO: renamed from: times-Gh9hcWk, reason: not valid java name */
    public static final long m4207timesGh9hcWk(long j2, float f) {
        return DpKt.m4126DpSizeYgX7TsA(Dp.m4104constructorimpl(m4202getWidthD9Ej5fM(j2) * f), Dp.m4104constructorimpl(m4200getHeightD9Ej5fM(j2) * f));
    }
}
