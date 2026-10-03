package androidx.compose.ui.graphics;

import androidx.compose.runtime.Stable;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.DpRect;
import com.oplus.smartenginehelper.ParserTag;
import com.oplus.smartenginehelper.entity.ClickApiEntity;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0018\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\t\bf\u0018\u00002\u00020\u0001R\u0018\u0010\u0002\u001a\u00020\u0003X¦\u000e¢\u0006\f\u001a\u0004\b\u0004\u0010\u0005\"\u0004\b\u0006\u0010\u0007R-\u0010\b\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\t8V@VX\u0096\u000eø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u0018\u0010\u000e\u001a\u00020\u0003X¦\u000e¢\u0006\f\u001a\u0004\b\u000f\u0010\u0005\"\u0004\b\u0010\u0010\u0007R \u0010\u0011\u001a\u00020\u00128fX¦\u000e¢\u0006\u0012\u0012\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R-\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u0019\u001a\u00020\u001a8V@VX\u0096\u000eø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR(\u0010!\u001a\u0004\u0018\u00010 2\b\u0010\u001f\u001a\u0004\u0018\u00010 8V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b\"\u0010#\"\u0004\b$\u0010%R\u0018\u0010&\u001a\u00020\u0003X¦\u000e¢\u0006\f\u001a\u0004\b'\u0010\u0005\"\u0004\b(\u0010\u0007R\u0018\u0010)\u001a\u00020\u0003X¦\u000e¢\u0006\f\u001a\u0004\b*\u0010\u0005\"\u0004\b+\u0010\u0007R\u0018\u0010,\u001a\u00020\u0003X¦\u000e¢\u0006\f\u001a\u0004\b-\u0010\u0005\"\u0004\b.\u0010\u0007R\u0018\u0010/\u001a\u00020\u0003X¦\u000e¢\u0006\f\u001a\u0004\b0\u0010\u0005\"\u0004\b1\u0010\u0007R\u0018\u00102\u001a\u00020\u0003X¦\u000e¢\u0006\f\u001a\u0004\b3\u0010\u0005\"\u0004\b4\u0010\u0007R\u0018\u00105\u001a\u00020\u0003X¦\u000e¢\u0006\f\u001a\u0004\b6\u0010\u0005\"\u0004\b7\u0010\u0007R\u0018\u00108\u001a\u000209X¦\u000e¢\u0006\f\u001a\u0004\b:\u0010;\"\u0004\b<\u0010=R\u001d\u0010>\u001a\u00020?8VX\u0096\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0006\u001a\u0004\b@\u0010\u000bR-\u0010A\u001a\u00020\t2\u0006\u0010A\u001a\u00020\t8V@VX\u0096\u000eø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\u001a\u0004\bB\u0010\u000b\"\u0004\bC\u0010\rR!\u0010D\u001a\u00020EX¦\u000eø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\u001a\u0004\bF\u0010\u000b\"\u0004\bG\u0010\rR\u0018\u0010H\u001a\u00020\u0003X¦\u000e¢\u0006\f\u001a\u0004\bI\u0010\u0005\"\u0004\bJ\u0010\u0007R\u0018\u0010K\u001a\u00020\u0003X¦\u000e¢\u0006\f\u001a\u0004\bL\u0010\u0005\"\u0004\bM\u0010\u0007ø\u0001\u0003\u0082\u0002\u0015\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!\n\u0004\b!0\u0001¨\u0006NÀ\u0006\u0003"}, d2 = {"Landroidx/compose/ui/graphics/GraphicsLayerScope;", "Landroidx/compose/ui/unit/Density;", "alpha", "", "getAlpha", "()F", ClickApiEntity.SET_ALPHA, "(F)V", "ambientShadowColor", "Landroidx/compose/ui/graphics/Color;", "getAmbientShadowColor-0d7_KjU", "()J", "setAmbientShadowColor-8_81llA", "(J)V", "cameraDistance", "getCameraDistance", "setCameraDistance", "clip", "", "getClip$annotations", "()V", "getClip", "()Z", "setClip", "(Z)V", "compositingStrategy", "Landroidx/compose/ui/graphics/CompositingStrategy;", "getCompositingStrategy--NrFUSI", "()I", "setCompositingStrategy-aDBOjCE", "(I)V", "<anonymous parameter 0>", "Landroidx/compose/ui/graphics/RenderEffect;", "renderEffect", "getRenderEffect", "()Landroidx/compose/ui/graphics/RenderEffect;", "setRenderEffect", "(Landroidx/compose/ui/graphics/RenderEffect;)V", "rotationX", "getRotationX", "setRotationX", "rotationY", "getRotationY", "setRotationY", "rotationZ", "getRotationZ", "setRotationZ", "scaleX", "getScaleX", "setScaleX", "scaleY", "getScaleY", "setScaleY", "shadowElevation", "getShadowElevation", "setShadowElevation", ParserTag.TAG_SHAPE, "Landroidx/compose/ui/graphics/Shape;", "getShape", "()Landroidx/compose/ui/graphics/Shape;", "setShape", "(Landroidx/compose/ui/graphics/Shape;)V", "size", "Landroidx/compose/ui/geometry/Size;", "getSize-NH-jbRc", "spotShadowColor", "getSpotShadowColor-0d7_KjU", "setSpotShadowColor-8_81llA", "transformOrigin", "Landroidx/compose/ui/graphics/TransformOrigin;", "getTransformOrigin-SzJe1aQ", "setTransformOrigin-__ExYCQ", "translationX", "getTranslationX", "setTranslationX", "translationY", "getTranslationY", "setTranslationY", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public interface GraphicsLayerScope extends Density {

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public static final class DefaultImpls {
        @Deprecated
        /* JADX INFO: renamed from: getAmbientShadowColor-0d7_KjU, reason: not valid java name */
        public static long m1807getAmbientShadowColor0d7_KjU(@NotNull GraphicsLayerScope graphicsLayerScope) {
            return GraphicsLayerScope.super.mo1798getAmbientShadowColor0d7_KjU();
        }

        public static /* synthetic */ void getClip$annotations() {
        }

        @Deprecated
        /* JADX INFO: renamed from: getCompositingStrategy--NrFUSI, reason: not valid java name */
        public static int m1808getCompositingStrategyNrFUSI(@NotNull GraphicsLayerScope graphicsLayerScope) {
            return GraphicsLayerScope.super.mo1799getCompositingStrategyNrFUSI();
        }

        @Deprecated
        @Nullable
        public static RenderEffect getRenderEffect(@NotNull GraphicsLayerScope graphicsLayerScope) {
            return GraphicsLayerScope.super.getRenderEffect();
        }

        @Deprecated
        /* JADX INFO: renamed from: getSize-NH-jbRc, reason: not valid java name */
        public static long m1809getSizeNHjbRc(@NotNull GraphicsLayerScope graphicsLayerScope) {
            return GraphicsLayerScope.super.mo1800getSizeNHjbRc();
        }

        @Deprecated
        /* JADX INFO: renamed from: getSpotShadowColor-0d7_KjU, reason: not valid java name */
        public static long m1810getSpotShadowColor0d7_KjU(@NotNull GraphicsLayerScope graphicsLayerScope) {
            return GraphicsLayerScope.super.mo1801getSpotShadowColor0d7_KjU();
        }

        @Stable
        @Deprecated
        /* JADX INFO: renamed from: roundToPx--R2X_6o, reason: not valid java name */
        public static int m1811roundToPxR2X_6o(@NotNull GraphicsLayerScope graphicsLayerScope, long j2) {
            return GraphicsLayerScope.super.mo306roundToPxR2X_6o(j2);
        }

        @Stable
        @Deprecated
        /* JADX INFO: renamed from: roundToPx-0680j_4, reason: not valid java name */
        public static int m1812roundToPx0680j_4(@NotNull GraphicsLayerScope graphicsLayerScope, float f) {
            return GraphicsLayerScope.super.mo307roundToPx0680j_4(f);
        }

        @Deprecated
        /* JADX INFO: renamed from: setAmbientShadowColor-8_81llA, reason: not valid java name */
        public static void m1813setAmbientShadowColor8_81llA(@NotNull GraphicsLayerScope graphicsLayerScope, long j2) {
            GraphicsLayerScope.super.mo1803setAmbientShadowColor8_81llA(j2);
        }

        @Deprecated
        /* JADX INFO: renamed from: setCompositingStrategy-aDBOjCE, reason: not valid java name */
        public static void m1814setCompositingStrategyaDBOjCE(@NotNull GraphicsLayerScope graphicsLayerScope, int i) {
            GraphicsLayerScope.super.mo1804setCompositingStrategyaDBOjCE(i);
        }

        @Deprecated
        public static void setRenderEffect(@NotNull GraphicsLayerScope graphicsLayerScope, @Nullable RenderEffect renderEffect) {
            GraphicsLayerScope.super.setRenderEffect(renderEffect);
        }

        @Deprecated
        /* JADX INFO: renamed from: setSpotShadowColor-8_81llA, reason: not valid java name */
        public static void m1815setSpotShadowColor8_81llA(@NotNull GraphicsLayerScope graphicsLayerScope, long j2) {
            GraphicsLayerScope.super.mo1805setSpotShadowColor8_81llA(j2);
        }

        @Stable
        @Deprecated
        /* JADX INFO: renamed from: toDp-GaN1DYA, reason: not valid java name */
        public static float m1816toDpGaN1DYA(@NotNull GraphicsLayerScope graphicsLayerScope, long j2) {
            return GraphicsLayerScope.super.mo308toDpGaN1DYA(j2);
        }

        @Stable
        @Deprecated
        /* JADX INFO: renamed from: toDp-u2uoSUM, reason: not valid java name */
        public static float m1817toDpu2uoSUM(@NotNull GraphicsLayerScope graphicsLayerScope, float f) {
            return GraphicsLayerScope.super.mo309toDpu2uoSUM(f);
        }

        @Stable
        @Deprecated
        /* JADX INFO: renamed from: toDpSize-k-rfVVM, reason: not valid java name */
        public static long m1819toDpSizekrfVVM(@NotNull GraphicsLayerScope graphicsLayerScope, long j2) {
            return GraphicsLayerScope.super.mo311toDpSizekrfVVM(j2);
        }

        @Stable
        @Deprecated
        /* JADX INFO: renamed from: toPx--R2X_6o, reason: not valid java name */
        public static float m1820toPxR2X_6o(@NotNull GraphicsLayerScope graphicsLayerScope, long j2) {
            return GraphicsLayerScope.super.mo312toPxR2X_6o(j2);
        }

        @Stable
        @Deprecated
        /* JADX INFO: renamed from: toPx-0680j_4, reason: not valid java name */
        public static float m1821toPx0680j_4(@NotNull GraphicsLayerScope graphicsLayerScope, float f) {
            return GraphicsLayerScope.super.mo313toPx0680j_4(f);
        }

        @Stable
        @Deprecated
        @NotNull
        public static Rect toRect(@NotNull GraphicsLayerScope graphicsLayerScope, @NotNull DpRect receiver) {
            Intrinsics.checkNotNullParameter(receiver, "$receiver");
            return GraphicsLayerScope.super.toRect(receiver);
        }

        @Stable
        @Deprecated
        /* JADX INFO: renamed from: toSize-XkaWNTQ, reason: not valid java name */
        public static long m1822toSizeXkaWNTQ(@NotNull GraphicsLayerScope graphicsLayerScope, long j2) {
            return GraphicsLayerScope.super.mo314toSizeXkaWNTQ(j2);
        }

        @Stable
        @Deprecated
        /* JADX INFO: renamed from: toSp-0xMU5do, reason: not valid java name */
        public static long m1823toSp0xMU5do(@NotNull GraphicsLayerScope graphicsLayerScope, float f) {
            return GraphicsLayerScope.super.mo315toSp0xMU5do(f);
        }

        @Stable
        @Deprecated
        /* JADX INFO: renamed from: toSp-kPz2Gy4, reason: not valid java name */
        public static long m1824toSpkPz2Gy4(@NotNull GraphicsLayerScope graphicsLayerScope, float f) {
            return GraphicsLayerScope.super.mo316toSpkPz2Gy4(f);
        }

        @Stable
        @Deprecated
        /* JADX INFO: renamed from: toDp-u2uoSUM, reason: not valid java name */
        public static float m1818toDpu2uoSUM(@NotNull GraphicsLayerScope graphicsLayerScope, int i) {
            return GraphicsLayerScope.super.mo310toDpu2uoSUM(i);
        }

        @Stable
        @Deprecated
        /* JADX INFO: renamed from: toSp-kPz2Gy4, reason: not valid java name */
        public static long m1825toSpkPz2Gy4(@NotNull GraphicsLayerScope graphicsLayerScope, int i) {
            return GraphicsLayerScope.super.mo317toSpkPz2Gy4(i);
        }
    }

    float getAlpha();

    /* JADX INFO: renamed from: getAmbientShadowColor-0d7_KjU, reason: not valid java name */
    default long mo1798getAmbientShadowColor0d7_KjU() {
        return GraphicsLayerScopeKt.getDefaultShadowColor();
    }

    float getCameraDistance();

    boolean getClip();

    /* JADX INFO: renamed from: getCompositingStrategy--NrFUSI, reason: not valid java name */
    default int mo1799getCompositingStrategyNrFUSI() {
        return CompositingStrategy.INSTANCE.m1702getAutoNrFUSI();
    }

    @Nullable
    default RenderEffect getRenderEffect() {
        return null;
    }

    float getRotationX();

    float getRotationY();

    float getRotationZ();

    float getScaleX();

    float getScaleY();

    float getShadowElevation();

    @NotNull
    Shape getShape();

    /* JADX INFO: renamed from: getSize-NH-jbRc, reason: not valid java name */
    default long mo1800getSizeNHjbRc() {
        return Size.INSTANCE.m1457getUnspecifiedNHjbRc();
    }

    /* JADX INFO: renamed from: getSpotShadowColor-0d7_KjU, reason: not valid java name */
    default long mo1801getSpotShadowColor0d7_KjU() {
        return GraphicsLayerScopeKt.getDefaultShadowColor();
    }

    /* JADX INFO: renamed from: getTransformOrigin-SzJe1aQ, reason: not valid java name */
    long mo1802getTransformOriginSzJe1aQ();

    float getTranslationX();

    float getTranslationY();

    void setAlpha(float f);

    /* JADX INFO: renamed from: setAmbientShadowColor-8_81llA, reason: not valid java name */
    default void mo1803setAmbientShadowColor8_81llA(long j2) {
    }

    void setCameraDistance(float f);

    void setClip(boolean z);

    /* JADX INFO: renamed from: setCompositingStrategy-aDBOjCE, reason: not valid java name */
    default void mo1804setCompositingStrategyaDBOjCE(int i) {
    }

    default void setRenderEffect(@Nullable RenderEffect renderEffect) {
    }

    void setRotationX(float f);

    void setRotationY(float f);

    void setRotationZ(float f);

    void setScaleX(float f);

    void setScaleY(float f);

    void setShadowElevation(float f);

    void setShape(@NotNull Shape shape);

    /* JADX INFO: renamed from: setSpotShadowColor-8_81llA, reason: not valid java name */
    default void mo1805setSpotShadowColor8_81llA(long j2) {
    }

    /* JADX INFO: renamed from: setTransformOrigin-__ExYCQ, reason: not valid java name */
    void mo1806setTransformOrigin__ExYCQ(long j2);

    void setTranslationX(float f);

    void setTranslationY(float f);
}
