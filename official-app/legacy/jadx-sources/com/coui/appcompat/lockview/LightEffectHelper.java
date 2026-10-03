package com.coui.appcompat.lockview;

import android.graphics.BlendMode;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RadialGradient;
import android.view.View;
import androidx.dynamicanimation.animation.FloatValueHolder;
import com.coui.appcompat.animation.dynamicanimation.COUIDynamicAnimation;
import com.coui.appcompat.animation.dynamicanimation.c;

/* JADX INFO: loaded from: classes13.dex */
class LightEffectHelper {
    private static final float APPEAR_SPRING_RESPONSE = 0.3f;
    private static final float DEFAULT_ALPHA_VALUE = 255.0f;
    private static final float DEFAULT_DELAY_PERCENT = 0.6f;
    private static final float DEFAULT_SPRING_RESPONSE = 0.3f;
    private static final float DISAPPEAR_SPRING_RESPONSE = 0.6f;
    private LightEffectHelperCallback mCallback;
    private float mInnerLightAlpha;
    private com.coui.appcompat.animation.dynamicanimation.b mInnerLightAnimator;
    private float mInnerLightRadius;
    private RadialGradient mInnerLightShader;
    private float mOuterLightAlpha;
    private com.coui.appcompat.animation.dynamicanimation.b mOuterLightAnimator;
    private float mOuterLightRadiusEnd;
    private float mOuterLightRadiusStart;
    private RadialGradient mOuterLightShader;
    private final Matrix mRadialMatrix;
    private final View mTargetView;

    public interface LightEffectHelperCallback {
        default void onInnerLightUpdate(float f) {
        }
    }

    public LightEffectHelper(View view) {
        this(view, 0.0f, 0.0f, null, null);
    }

    private void ensureLightEffectAnimator() {
        if (this.mInnerLightAnimator == null) {
            c cVar = new c();
            cVar.i(0.0f);
            cVar.l(0.3f);
            com.coui.appcompat.animation.dynamicanimation.b bVar = new com.coui.appcompat.animation.dynamicanimation.b(new FloatValueHolder(this.mInnerLightAlpha));
            this.mInnerLightAnimator = bVar;
            bVar.E(cVar);
            this.mInnerLightAnimator.b(new COUIDynamicAnimation.r() { // from class: com.coui.appcompat.lockview.a
                @Override // com.coui.appcompat.animation.dynamicanimation.COUIDynamicAnimation.r
                public final void onAnimationUpdate(COUIDynamicAnimation cOUIDynamicAnimation, float f, float f2) {
                    this.a.lambda$ensureLightEffectAnimator$0(cOUIDynamicAnimation, f, f2);
                }
            });
        }
        if (this.mOuterLightAnimator == null) {
            c cVar2 = new c();
            cVar2.i(0.0f);
            cVar2.l(0.3f);
            com.coui.appcompat.animation.dynamicanimation.b bVar2 = new com.coui.appcompat.animation.dynamicanimation.b(new FloatValueHolder(this.mOuterLightAlpha));
            this.mOuterLightAnimator = bVar2;
            bVar2.E(cVar2);
            this.mOuterLightAnimator.b(new COUIDynamicAnimation.r() { // from class: com.coui.appcompat.lockview.b
                @Override // com.coui.appcompat.animation.dynamicanimation.COUIDynamicAnimation.r
                public final void onAnimationUpdate(COUIDynamicAnimation cOUIDynamicAnimation, float f, float f2) {
                    this.a.lambda$ensureLightEffectAnimator$1(cOUIDynamicAnimation, f, f2);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$ensureLightEffectAnimator$0(COUIDynamicAnimation cOUIDynamicAnimation, float f, float f2) {
        this.mInnerLightAlpha = f;
        LightEffectHelperCallback lightEffectHelperCallback = this.mCallback;
        if (lightEffectHelperCallback != null) {
            lightEffectHelperCallback.onInnerLightUpdate(f);
        }
        View view = this.mTargetView;
        if (view != null) {
            view.invalidate();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$ensureLightEffectAnimator$1(COUIDynamicAnimation cOUIDynamicAnimation, float f, float f2) {
        this.mOuterLightAlpha = f;
        View view = this.mTargetView;
        if (view != null) {
            view.invalidate();
        }
    }

    public void drawLightEffect(Canvas canvas, float f, Path path, Paint paint, float f2, float f3) {
        if (paint == null || this.mInnerLightShader == null || this.mOuterLightShader == null) {
            return;
        }
        float f4 = this.mOuterLightRadiusEnd;
        float f5 = this.mOuterLightRadiusStart;
        float f6 = (((this.mOuterLightAlpha / 255.0f) * (f4 - f5)) + f5) / f4;
        this.mRadialMatrix.reset();
        this.mRadialMatrix.setScale(f6, f6, f2, f3);
        this.mOuterLightShader.setLocalMatrix(this.mRadialMatrix);
        paint.setShader(this.mOuterLightShader);
        paint.setAlpha((int) this.mOuterLightAlpha);
        paint.setBlendMode(BlendMode.LIGHTEN);
        canvas.drawPath(path, paint);
        this.mRadialMatrix.reset();
        this.mRadialMatrix.setScale(f, f, f2, f3);
        this.mInnerLightShader.setLocalMatrix(this.mRadialMatrix);
        paint.setShader(this.mInnerLightShader);
        paint.setAlpha((int) this.mInnerLightAlpha);
        canvas.drawCircle(f2, f3, this.mInnerLightRadius * f, paint);
    }

    public void executeLightEffectAnimator(boolean z) {
        ensureLightEffectAnimator();
        this.mInnerLightAnimator.x(z ? 255.0f : 0.0f);
        this.mOuterLightAnimator.A().l(z ? 0.3f : 0.6f);
        this.mOuterLightAnimator.x(z ? 255.0f : 0.0f);
    }

    public void setCallback(LightEffectHelperCallback lightEffectHelperCallback) {
        this.mCallback = lightEffectHelperCallback;
    }

    public void updateLightShaderConfig(float f, float f2, RadialGradient radialGradient, RadialGradient radialGradient2) {
        this.mInnerLightRadius = f;
        this.mOuterLightRadiusStart = 0.6f * f2;
        this.mOuterLightRadiusEnd = f2;
        this.mInnerLightShader = radialGradient;
        this.mOuterLightShader = radialGradient2;
    }

    public LightEffectHelper(View view, float f, float f2, RadialGradient radialGradient, RadialGradient radialGradient2) {
        this.mTargetView = view;
        this.mRadialMatrix = new Matrix();
        this.mInnerLightRadius = f;
        this.mOuterLightRadiusStart = 0.6f * f2;
        this.mOuterLightRadiusEnd = f2;
        this.mInnerLightShader = radialGradient;
        this.mOuterLightShader = radialGradient2;
    }
}
