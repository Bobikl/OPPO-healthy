package com.oplus.aiunit.vision;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.view.animation.LinearInterpolator;
import androidx.core.internal.view.SupportMenu;
import androidx.interpolator.view.animation.FastOutSlowInInterpolator;
import com.heytap.databaseengine.model.UserInfo;
import com.heytap.health.watchface.business.legacy.main.bean.WatchFaceBean;
import com.heytap.log.formatter.LogFieldKey;
import com.oplus.channel.client.data.Action;
import com.oplus.smartenginehelper.ParserTag;
import com.oplus.smartenginehelper.entity.ClickApiEntity;
import io.protostuff.MapSchema;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes18.dex */
@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u0000 82\u00020\u00012\u00020\u00022\u00020\u0003:\u0002\n\u000bB\u0019\u0012\b\u00105\u001a\u0004\u0018\u000104\u0012\u0006\u0010&\u001a\u00020\u0016¢\u0006\u0004\b6\u00107J\u0010\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\u0010\u0010\n\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0016J\u0010\u0010\u000b\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0016J\u0010\u0010\u000e\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\fH\u0016J\u0010\u0010\u0010\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\bH\u0016J\b\u0010\u0011\u001a\u00020\bH\u0016J\b\u0010\u0012\u001a\u00020\bH\u0016J\u0012\u0010\u0015\u001a\u00020\u00062\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013H\u0016J\b\u0010\u0017\u001a\u00020\u0016H\u0016J\b\u0010\u0018\u001a\u00020\u0006H\u0016J\b\u0010\u0019\u001a\u00020\u0006H\u0016J\u0010\u0010\u001b\u001a\u00020\u00162\u0006\u0010\u001a\u001a\u00020\bH\u0016J\b\u0010\u001c\u001a\u00020\u0006H\u0002J\u0010\u0010\u001e\u001a\u00020\u00062\u0006\u0010\u001d\u001a\u00020\u0004H\u0002J\u0018\u0010\"\u001a\u00020\u00062\u0006\u0010\u001f\u001a\u00020\u00042\u0006\u0010!\u001a\u00020 H\u0002J \u0010$\u001a\u00020\u00062\u0006\u0010\u001f\u001a\u00020\u00042\u0006\u0010!\u001a\u00020 2\u0006\u0010#\u001a\u00020\u0016H\u0002R\u0014\u0010&\u001a\u00020\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010%R\u0018\u0010)\u001a\u0004\u0018\u00010'8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b$\u0010(R\u0016\u0010+\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001e\u0010*R\u0016\u0010,\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001c\u0010*R\u0016\u0010.\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b-\u0010*R\u0016\u00100\u001a\u00020\u00168\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b/\u0010%R\u0014\u00103\u001a\u00020 8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b1\u00102¨\u00069"}, d2 = {"Lcom/oplus/aiunit/vision/qb3;", "Landroid/graphics/drawable/Drawable;", "Landroid/graphics/drawable/Animatable;", "Lcom/oplus/aiunit/vision/mb3;", "", "strokeWidth", "", "setStrokeWidth", "", "color", "a", "b", "Landroid/graphics/Canvas;", "canvas", ParserTag.TAG_DRAW, "alpha", ClickApiEntity.SET_ALPHA, "getAlpha", "getOpacity", "Landroid/graphics/ColorFilter;", "colorFilter", "setColorFilter", "", "isRunning", "start", Action.LIFE_CIRCLE_VALUE_STOP, "level", "onLevelChange", LogFieldKey.LEVEL_KEY, "rotation", MapSchema.FIELD_NAME_KEY, "interpolatedTime", "Lcom/oplus/aiunit/vision/qb3$b;", "ring", "i", "lastFrame", "j", "Z", "mIsIndeterminate", "Landroid/animation/Animator;", "Landroid/animation/Animator;", "mAnimator", UserInfo.SEX_FEMALE, "mRotation", "mRotationCount", LogFieldKey.MESSAGE_KEY, "sweepAngle", "n", "mFinishing", "o", "Lcom/oplus/aiunit/vision/qb3$b;", "mRing", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;Z)V", "Companion", "nearx_release"}, k = 1, mv = {1, 6, 0})
public final class qb3 extends Drawable implements Animatable, mb3 {

    @NotNull
    public static final LinearInterpolator p = new LinearInterpolator();

    @NotNull
    public static final FastOutSlowInInterpolator q = new FastOutSlowInInterpolator();

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    public final boolean mIsIndeterminate;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public Animator mAnimator;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    public float mRotation;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    public float mRotationCount;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    public float sweepAngle;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    public boolean mFinishing;

    /* JADX INFO: renamed from: o, reason: from kotlin metadata */
    @NotNull
    public final b mRing = new b();

    @Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b,\b\u0002\u0018\u00002\u00020\u0001B\t\b\u0000¢\u0006\u0004\bO\u0010\u001dJ\u001f\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\u0007\u0010\bJ'\u0010\f\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\nH\u0000¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u0010\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u000eH\u0000¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0012\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u000eH\u0000¢\u0006\u0004\b\u0012\u0010\u0011J\u0019\u0010\u0015\u001a\u00020\u00062\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013H\u0000¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u0018\u001a\u00020\u00062\u0006\u0010\u0017\u001a\u00020\nH\u0000¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001b\u001a\u00020\u00062\u0006\u0010\u001a\u001a\u00020\nH\u0000¢\u0006\u0004\b\u001b\u0010\u0019J\u000f\u0010\u001c\u001a\u00020\u0006H\u0000¢\u0006\u0004\b\u001c\u0010\u001dJ\u000f\u0010\u001e\u001a\u00020\u0006H\u0000¢\u0006\u0004\b\u001e\u0010\u001dR\u001a\u0010#\u001a\u00020\u001f8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0007\u0010 \u001a\u0004\b!\u0010\"R\u001a\u0010(\u001a\u00020$8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\f\u0010%\u001a\u0004\b&\u0010'R\u001a\u0010*\u001a\u00020$8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0003\u0010%\u001a\u0004\b)\u0010'R\u001a\u0010-\u001a\u00020$8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b+\u0010%\u001a\u0004\b,\u0010'R\"\u00102\u001a\u00020\n8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b.\u0010/\u001a\u0004\b.\u00100\"\u0004\b1\u0010\u0019R\"\u00105\u001a\u00020\n8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b3\u0010/\u001a\u0004\b+\u00100\"\u0004\b4\u0010\u0019R\"\u00109\u001a\u00020\n8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b6\u0010/\u001a\u0004\b7\u00100\"\u0004\b8\u0010\u0019R\"\u0010=\u001a\u00020\n8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b:\u0010/\u001a\u0004\b;\u00100\"\u0004\b<\u0010\u0019R\"\u0010B\u001a\u00020\u000e8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u001e\u0010>\u001a\u0004\b?\u0010@\"\u0004\bA\u0010\u0011R\u0016\u0010D\u001a\u00020\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bC\u0010>R\"\u0010F\u001a\u00020\n8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u0012\u0010/\u001a\u0004\b:\u00100\"\u0004\bE\u0010\u0019R\"\u0010H\u001a\u00020\n8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u0010\u0010/\u001a\u0004\b3\u00100\"\u0004\bG\u0010\u0019R\"\u0010J\u001a\u00020\n8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u0015\u0010/\u001a\u0004\b6\u00100\"\u0004\bI\u0010\u0019R\"\u0010M\u001a\u00020\n8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b4\u0010/\u001a\u0004\bK\u00100\"\u0004\bL\u0010\u0019R\"\u0010N\u001a\u00020\u000e8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u001b\u0010>\u001a\u0004\b\u0003\u0010@\"\u0004\bC\u0010\u0011¨\u0006P"}, d2 = {"Lcom/oplus/aiunit/vision/qb3$b;", "", "Landroid/graphics/Canvas;", "c", "Landroid/graphics/Rect;", "bounds", "", "a", "(Landroid/graphics/Canvas;Landroid/graphics/Rect;)V", "canvas", "", "mCurrentAngle", "b", "(Landroid/graphics/Canvas;Landroid/graphics/Rect;F)V", "", "color", LogFieldKey.LEVEL_KEY, "(I)V", MapSchema.FIELD_NAME_KEY, "Landroid/graphics/ColorFilter;", "colorFilter", LogFieldKey.MESSAGE_KEY, "(Landroid/graphics/ColorFilter;)V", "strokeWidth", "q", "(F)V", "rotation", "o", "r", "()V", "i", "Landroid/graphics/RectF;", "Landroid/graphics/RectF;", "getMTempBounds$nearx_release", "()Landroid/graphics/RectF;", "mTempBounds", "Landroid/graphics/Paint;", "Landroid/graphics/Paint;", "getMPaint$nearx_release", "()Landroid/graphics/Paint;", "mPaint", "getBackgroundPaint$nearx_release", "backgroundPaint", "d", "getMCirclePaint$nearx_release", "mCirclePaint", MapSchema.FIELD_NAME_ENTRY, UserInfo.SEX_FEMALE, "()F", LogFieldKey.PROCESS_NAME_KEY, "startTrim", "f", "n", "endTrim", b2n.f, "getMRotation$nearx_release", "setMRotation$nearx_release", "mRotation", b2n.g, "getMStrokeWidth$nearx_release", "setMStrokeWidth$nearx_release", "mStrokeWidth", "I", "getMColor$nearx_release", "()I", "setMColor$nearx_release", WatchFaceBean.TAG_M_COLOR, "j", "progressBarBgColor", "setStartingStartTrim$nearx_release", "startingStartTrim", "setStartingEndTrim$nearx_release", "startingEndTrim", "setStartingRotation$nearx_release", "startingRotation", "getMRingCenterRadius$nearx_release", "setMRingCenterRadius$nearx_release", "mRingCenterRadius", "alpha", "<init>", "nearx_release"}, k = 1, mv = {1, 6, 0})
    public static final class b {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        @NotNull
        public final RectF mTempBounds = new RectF();

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        @NotNull
        public final Paint mPaint;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        @NotNull
        public final Paint backgroundPaint;

        /* JADX INFO: renamed from: d, reason: from kotlin metadata */
        @NotNull
        public final Paint mCirclePaint;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
        public float startTrim;

        /* JADX INFO: renamed from: f, reason: from kotlin metadata */
        public float endTrim;

        /* JADX INFO: renamed from: g, reason: from kotlin metadata */
        public float mRotation;

        /* JADX INFO: renamed from: h, reason: from kotlin metadata */
        public float mStrokeWidth;

        /* JADX INFO: renamed from: i, reason: from kotlin metadata */
        public int mColor;

        /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
        public int progressBarBgColor;

        /* JADX INFO: renamed from: k, reason: from kotlin metadata */
        public float startingStartTrim;

        /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
        public float startingEndTrim;

        /* JADX INFO: renamed from: m, reason: from kotlin metadata */
        public float startingRotation;

        /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
        public float mRingCenterRadius;

        /* JADX INFO: renamed from: o, reason: from kotlin metadata */
        public int alpha;

        public b() {
            Paint paint = new Paint();
            this.mPaint = paint;
            Paint paint2 = new Paint();
            this.backgroundPaint = paint2;
            Paint paint3 = new Paint();
            this.mCirclePaint = paint3;
            this.mStrokeWidth = 3.0f;
            this.mColor = SupportMenu.CATEGORY_MASK;
            this.progressBarBgColor = -3355444;
            this.alpha = 255;
            paint.setStrokeCap(Paint.Cap.SQUARE);
            paint.setAntiAlias(true);
            paint.setStyle(Paint.Style.STROKE);
            paint2.setStyle(Paint.Style.STROKE);
            paint2.setAntiAlias(true);
            paint3.setColor(0);
        }

        public final void a(@NotNull Canvas c2, @NotNull Rect bounds) {
            Intrinsics.checkNotNullParameter(c2, "c");
            Intrinsics.checkNotNullParameter(bounds, "bounds");
            RectF rectF = this.mTempBounds;
            float f = this.mRingCenterRadius;
            float fMin = this.mStrokeWidth + f;
            if (f <= 0.0f) {
                fMin = (Math.min(bounds.width(), bounds.height()) / 2.0f) - (this.mStrokeWidth / 2.0f);
            }
            rectF.set(bounds.centerX() - fMin, bounds.centerY() - fMin, bounds.centerX() + fMin, bounds.centerY() + fMin);
            float f2 = this.startTrim;
            float f3 = this.mRotation;
            float f4 = 360;
            float f5 = (f2 + f3) * f4;
            float f6 = ((this.endTrim + f3) * f4) - f5;
            this.mPaint.setColor(this.mColor);
            this.mPaint.setAlpha(this.alpha);
            float f7 = this.mStrokeWidth / 2.0f;
            rectF.inset(f7, f7);
            c2.drawCircle(rectF.centerX(), rectF.centerY(), rectF.width() / 2.0f, this.mCirclePaint);
            float f8 = -f7;
            rectF.inset(f8, f8);
            c2.drawArc(rectF, f5, f6, false, this.mPaint);
        }

        public final void b(@NotNull Canvas canvas, @NotNull Rect bounds, float mCurrentAngle) {
            Intrinsics.checkNotNullParameter(canvas, "canvas");
            Intrinsics.checkNotNullParameter(bounds, "bounds");
            float f = this.mRingCenterRadius;
            float fMin = this.mStrokeWidth + f;
            if (f <= 0.0f) {
                fMin = (Math.min(bounds.width(), bounds.height()) / 2.0f) - (this.mStrokeWidth / 2.0f);
            }
            RectF rectF = this.mTempBounds;
            rectF.set(bounds.centerX() - fMin, bounds.centerY() - fMin, bounds.centerX() + fMin, bounds.centerY() + fMin);
            canvas.drawCircle(rectF.centerX(), rectF.centerY(), fMin, this.backgroundPaint);
            this.mPaint.setColor(this.mColor);
            this.mPaint.setAlpha(this.alpha);
            canvas.drawArc(rectF, 0.0f, mCurrentAngle, false, this.mPaint);
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final int getAlpha() {
            return this.alpha;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final float getEndTrim() {
            return this.endTrim;
        }

        /* JADX INFO: renamed from: e, reason: from getter */
        public final float getStartTrim() {
            return this.startTrim;
        }

        /* JADX INFO: renamed from: f, reason: from getter */
        public final float getStartingEndTrim() {
            return this.startingEndTrim;
        }

        /* JADX INFO: renamed from: g, reason: from getter */
        public final float getStartingRotation() {
            return this.startingRotation;
        }

        /* JADX INFO: renamed from: h, reason: from getter */
        public final float getStartingStartTrim() {
            return this.startingStartTrim;
        }

        public final void i() {
            this.startingStartTrim = 0.0f;
            this.startingEndTrim = 0.0f;
            this.startingRotation = 0.0f;
            this.startTrim = 0.0f;
            this.endTrim = 0.0f;
            o(0.0f);
        }

        public final void j(int i) {
            this.alpha = i;
        }

        public final void k(int color) {
            this.progressBarBgColor = color;
            this.backgroundPaint.setColor(color);
        }

        public final void l(int color) {
            this.mColor = color;
        }

        public final void m(@Nullable ColorFilter colorFilter) {
            this.mPaint.setColorFilter(colorFilter);
        }

        public final void n(float f) {
            this.endTrim = f;
        }

        public final void o(float rotation) {
            this.mRotation = rotation;
        }

        public final void p(float f) {
            this.startTrim = f;
        }

        public final void q(float strokeWidth) {
            this.mStrokeWidth = strokeWidth;
            this.mPaint.setStrokeWidth(strokeWidth);
            this.backgroundPaint.setStrokeWidth(strokeWidth);
        }

        public final void r() {
            this.startingStartTrim = this.startTrim;
            this.startingEndTrim = this.endTrim;
            this.startingRotation = this.mRotation;
        }
    }

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0002H\u0016J\u0010\u0010\t\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\n"}, d2 = {"com/oplus/aiunit/vision/qb3$c", "Landroid/animation/Animator$AnimatorListener;", "Landroid/animation/Animator;", "animator", "", ParserTag.TAG_ON_ANIMATION_START, ParserTag.TAG_ON_ANIMATION_END, "animation", ParserTag.TAG_ON_ANIMATION_CANCEL, ParserTag.TAG_ON_ANIMATION_REPEAT, "nearx_release"}, k = 1, mv = {1, 6, 0})
    public static final class c implements Animator.AnimatorListener {

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final /* synthetic */ b f15725j;

        public c(b bVar) {
            this.f15725j = bVar;
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationCancel(@NotNull Animator animation) {
            Intrinsics.checkNotNullParameter(animation, "animation");
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(@NotNull Animator animator) {
            Intrinsics.checkNotNullParameter(animator, "animator");
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(@NotNull Animator animator) {
            Intrinsics.checkNotNullParameter(animator, "animator");
            qb3.this.j(1.0f, this.f15725j, true);
            this.f15725j.r();
            if (!qb3.this.mFinishing) {
                qb3.this.mRotationCount++;
            } else {
                qb3.this.mFinishing = false;
                animator.cancel();
                animator.setDuration(1332L);
                animator.start();
            }
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(@NotNull Animator animator) {
            Intrinsics.checkNotNullParameter(animator, "animator");
            qb3.this.mRotationCount = 0.0f;
        }
    }

    public qb3(@Nullable Context context, boolean z) {
        this.mIsIndeterminate = z;
        context.getClass();
        if (z) {
            l();
        }
    }

    public static final void m(qb3 this$0, b ring, ValueAnimator valueAnimator) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(ring, "$ring");
        Object animatedValue = valueAnimator.getAnimatedValue();
        if (animatedValue == null) {
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Float");
        }
        this$0.j(((Float) animatedValue).floatValue(), ring, false);
        this$0.invalidateSelf();
    }

    @Override // com.oplus.aiunit.vision.mb3
    public void a(int color) {
        this.mRing.k(color);
        invalidateSelf();
    }

    @Override // com.oplus.aiunit.vision.mb3
    public void b(int color) {
        this.mRing.l(color);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(@NotNull Canvas canvas) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        Rect bounds = getBounds();
        Intrinsics.checkNotNullExpressionValue(bounds, "bounds");
        canvas.save();
        if (this.mIsIndeterminate) {
            canvas.rotate(this.mRotation, bounds.exactCenterX(), bounds.exactCenterY());
            this.mRing.a(canvas, bounds);
        } else {
            canvas.rotate(-90.0f, bounds.exactCenterX(), bounds.exactCenterY());
            this.mRing.b(canvas, bounds, this.sweepAngle);
        }
        canvas.restore();
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
        return this.mRing.getAlpha();
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    public final void i(float interpolatedTime, b ring) {
        float fFloor = (float) (Math.floor(ring.getStartingRotation() / 0.8f) + ((double) 1.0f));
        ring.p(ring.getStartingStartTrim() + (((ring.getStartingEndTrim() - 0.01f) - ring.getStartingStartTrim()) * interpolatedTime));
        ring.n(ring.getStartingEndTrim());
        ring.o(ring.getStartingRotation() + ((fFloor - ring.getStartingRotation()) * interpolatedTime));
    }

    @Override // android.graphics.drawable.Animatable
    public boolean isRunning() {
        Animator animator = this.mAnimator;
        if (animator == null) {
            return false;
        }
        return animator.isRunning();
    }

    public final void j(float interpolatedTime, b ring, boolean lastFrame) {
        float interpolation;
        float interpolation2;
        if (this.mFinishing) {
            i(interpolatedTime, ring);
            return;
        }
        if (!(interpolatedTime == 1.0f) || lastFrame) {
            float startingRotation = ring.getStartingRotation();
            if (interpolatedTime < 0.5f) {
                interpolation = ring.getStartingStartTrim();
                interpolation2 = (q.getInterpolation(interpolatedTime / 0.5f) * 0.79f) + 0.01f + interpolation;
            } else {
                float startingStartTrim = ring.getStartingStartTrim() + 0.79f;
                interpolation = startingStartTrim - (((1.0f - q.getInterpolation((interpolatedTime - 0.5f) / 0.5f)) * 0.79f) + 0.01f);
                interpolation2 = startingStartTrim;
            }
            float f = startingRotation + (0.20999998f * interpolatedTime);
            float f2 = (interpolatedTime + this.mRotationCount) * 216.0f;
            ring.p(interpolation);
            ring.n(interpolation2);
            ring.o(f);
            k(f2);
        }
    }

    public final void k(float rotation) {
        this.mRotation = rotation;
    }

    public final void l() {
        final b bVar = this.mRing;
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.oplus.aiunit.vision.pb3
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                qb3.m(this.i, bVar, valueAnimator);
            }
        });
        valueAnimatorOfFloat.setRepeatCount(-1);
        valueAnimatorOfFloat.setRepeatMode(1);
        valueAnimatorOfFloat.setInterpolator(p);
        valueAnimatorOfFloat.addListener(new c(bVar));
        this.mAnimator = valueAnimatorOfFloat;
    }

    @Override // android.graphics.drawable.Drawable
    public boolean onLevelChange(int level) {
        if (this.mIsIndeterminate) {
            return super.onLevelChange(level);
        }
        this.sweepAngle = (level * 360.0f) / 10000.0f;
        invalidateSelf();
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int alpha) {
        this.mRing.j(alpha);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(@Nullable ColorFilter colorFilter) {
        this.mRing.m(colorFilter);
        invalidateSelf();
    }

    @Override // com.oplus.aiunit.vision.mb3
    public void setStrokeWidth(float strokeWidth) {
        this.mRing.q(strokeWidth);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Animatable
    public void start() {
        Animator animator = this.mAnimator;
        if (animator != null) {
            animator.cancel();
        }
        this.mRing.r();
        if (this.mRing.getEndTrim() == this.mRing.getStartTrim()) {
            this.mRing.i();
            Animator animator2 = this.mAnimator;
            if (animator2 != null) {
                animator2.setDuration(1332L);
            }
            Animator animator3 = this.mAnimator;
            if (animator3 == null) {
                return;
            }
            animator3.start();
            return;
        }
        this.mFinishing = true;
        Animator animator4 = this.mAnimator;
        if (animator4 != null) {
            animator4.setDuration(666L);
        }
        Animator animator5 = this.mAnimator;
        if (animator5 == null) {
            return;
        }
        animator5.start();
    }

    @Override // android.graphics.drawable.Animatable
    public void stop() {
        Animator animator = this.mAnimator;
        if (animator != null) {
            animator.cancel();
        }
        k(0.0f);
        this.mRing.i();
        invalidateSelf();
    }
}
