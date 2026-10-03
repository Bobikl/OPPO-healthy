package com.heytap.health.community.focus;

import android.content.Context;
import android.graphics.Matrix;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageView;
import androidx.appcompat.widget.AppCompatImageView;
import com.heytap.databaseengine.model.UserInfo;
import com.heytap.log.formatter.LogFieldKey;
import com.heytap.wearable.support.watchface.common.utils.ResourcesUtil;
import com.oplus.aiunit.vision.b2n;
import com.oplus.aiunit.vision.vdg;
import com.oplus.aiunit.vision.y04;
import com.oplus.smartenginehelper.entity.ImageEntity;
import io.protostuff.MapSchema;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.Triple;
import p010kotlin.Unit;
import p010kotlin.jvm.functions.Function1;
import p010kotlin.jvm.internal.DefaultConstructorMarker;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(d1 = {"\u0000\u0082\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0014\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u0000 O2\u00020\u00012\u00020\u0002:\u0003PQRB\u0011\b\u0016\u0012\u0006\u0010G\u001a\u00020F¢\u0006\u0004\bH\u0010IB\u001b\b\u0016\u0012\u0006\u0010G\u001a\u00020F\u0012\b\u0010K\u001a\u0004\u0018\u00010J¢\u0006\u0004\bH\u0010LB#\b\u0016\u0012\u0006\u0010G\u001a\u00020F\u0012\b\u0010K\u001a\u0004\u0018\u00010J\u0012\u0006\u0010M\u001a\u00020\u0007¢\u0006\u0004\bH\u0010NJ\u0012\u0010\u0006\u001a\u00020\u00052\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003H\u0016J\u0010\u0010\t\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016J\u001c\u0010\u000f\u001a\u00020\u000e2\b\u0010\u000b\u001a\u0004\u0018\u00010\n2\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0016J0\u0010\u0015\u001a\u00020\u00052\u0006\u0010\u0010\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u00072\u0006\u0010\u0012\u001a\u00020\u00072\u0006\u0010\u0013\u001a\u00020\u00072\u0006\u0010\u0014\u001a\u00020\u0007H\u0014J\b\u0010\u0016\u001a\u00020\u0005H\u0002J\u0010\u0010\u0019\u001a\u00020\u000e2\u0006\u0010\u0018\u001a\u00020\u0017H\u0002J\u0010\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001b\u001a\u00020\u001aH\u0002J\b\u0010\u001e\u001a\u00020\u0005H\u0002J\u0010\u0010\u001f\u001a\u00020\u00172\u0006\u0010\u001b\u001a\u00020\u001aH\u0002J\u0010\u0010 \u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\fH\u0002J\b\u0010!\u001a\u00020\u0005H\u0002J\u0010\u0010\"\u001a\u00020\u00172\u0006\u0010\r\u001a\u00020\fH\u0002J\u0018\u0010&\u001a\u00020\u00172\u0006\u0010$\u001a\u00020#2\u0006\u0010%\u001a\u00020#H\u0002J2\u0010+\u001a\u0014\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u00170*2\u0006\u0010'\u001a\u00020\u001a2\u0006\u0010(\u001a\u00020\u00172\u0006\u0010)\u001a\u00020\u0017H\u0002J\u0018\u0010-\u001a\u00020\u00052\u0006\u0010,\u001a\u00020#2\u0006\u0010\r\u001a\u00020\fH\u0002R\u0016\u0010/\u001a\u00020\u001a8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001e\u0010.R\u0014\u0010$\u001a\u00020#8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u00100R\u0014\u00101\u001a\u00020#8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u00100R\u0014\u00104\u001a\u0002028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u00103R\u0016\u00106\u001a\u00020\u00178\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b&\u00105R\u0016\u00108\u001a\u00020\u001a8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b7\u0010.R\u0016\u0010'\u001a\u00020\u001a8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b9\u0010.R\u0016\u0010;\u001a\u00020#8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b:\u00100R\u0016\u0010?\u001a\u00020<8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b=\u0010>R\u0016\u0010A\u001a\u00020\u00178\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b@\u00105R\u0016\u0010E\u001a\u00020B8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bC\u0010D¨\u0006S"}, d2 = {"Lcom/heytap/health/community/focus/ScaleImageView;", "Landroidx/appcompat/widget/AppCompatImageView;", "Landroid/view/View$OnTouchListener;", "Landroid/graphics/drawable/Drawable;", ResourcesUtil.ResourceType.DRAWABLE, "", "setImageDrawable", "", "resId", "setImageResource", "Landroid/view/View;", "v", "Landroid/view/MotionEvent;", "event", "", "onTouch", "changed", y04.TIME_STYLE_LEFT_DIR_NAME, "top", y04.TIME_STYLE_RIGHT_DIR_NAME, "bottom", "onLayout", b2n.f, "", "touchScale", "d", "Landroid/graphics/Matrix;", ImageEntity.SCALE_TYPE_MATRIX, "Landroid/graphics/RectF;", MapSchema.FIELD_NAME_ENTRY, "i", "f", MapSchema.FIELD_NAME_KEY, "j", LogFieldKey.LEVEL_KEY, "Lcom/heytap/health/community/focus/ScaleImageView$b;", "firstTouch", "endTouch", LogFieldKey.MESSAGE_KEY, "tempMatrix", "dX", "dY", "Lkotlin/Triple;", "c", "point", b2n.g, "Landroid/graphics/Matrix;", "scaleMatrix", "Lcom/heytap/health/community/focus/ScaleImageView$b;", "lastTouch", "", "[F", "matrixFloatArray", UserInfo.SEX_FEMALE, "initialScale", "n", "initialMatrix", "o", LogFieldKey.PROCESS_NAME_KEY, "touchCenter", "Lcom/heytap/health/community/focus/ScaleImageView$TouchMode;", "q", "Lcom/heytap/health/community/focus/ScaleImageView$TouchMode;", "touchMode", "r", "firstTouchDist", "Lcom/oplus/aiunit/vision/vdg;", "s", "Lcom/oplus/aiunit/vision/vdg;", "scaleAnimator", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "Landroid/util/AttributeSet;", "attrs", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Companion", "a", "b", "TouchMode", "community_impl_release"}, k = 1, mv = {1, 8, 0})
public final class ScaleImageView extends AppCompatImageView implements View.OnTouchListener {

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @NotNull
    public Matrix scaleMatrix;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final Touch firstTouch;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    @NotNull
    public final Touch lastTouch;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final float[] matrixFloatArray;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    public float initialScale;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public Matrix initialMatrix;

    /* JADX INFO: renamed from: o, reason: from kotlin metadata */
    @NotNull
    public Matrix tempMatrix;

    /* JADX INFO: renamed from: p, reason: from kotlin metadata */
    @NotNull
    public Touch touchCenter;

    /* JADX INFO: renamed from: q, reason: from kotlin metadata */
    @NotNull
    public TouchMode touchMode;

    /* JADX INFO: renamed from: r, reason: from kotlin metadata */
    public float firstTouchDist;

    /* JADX INFO: renamed from: s, reason: from kotlin metadata */
    @NotNull
    public vdg scaleAnimator;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lcom/heytap/health/community/focus/ScaleImageView$TouchMode;", "", "(Ljava/lang/String;I)V", "NONE", "ZOOM", "DRAG", "community_impl_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public enum TouchMode {
        NONE,
        ZOOM,
        DRAG
    }

    /* JADX INFO: renamed from: com.heytap.health.community.focus.ScaleImageView$b, reason: from toString */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0007\n\u0002\b\f\b\u0086\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\b\u0002\u0010\u000f\u001a\u00020\t\u0012\b\b\u0002\u0010\u0012\u001a\u00020\t¢\u0006\u0004\b\u0013\u0010\u0014J\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\"\u0010\u000f\u001a\u00020\t8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\n\u0010\u000b\u001a\u0004\b\n\u0010\f\"\u0004\b\r\u0010\u000eR\"\u0010\u0012\u001a\u00020\t8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0010\u0010\u000b\u001a\u0004\b\u0010\u0010\f\"\u0004\b\u0011\u0010\u000e¨\u0006\u0015"}, d2 = {"Lcom/heytap/health/community/focus/ScaleImageView$b;", "", "", "toString", "", "hashCode", "other", "", "equals", "", "a", UserInfo.SEX_FEMALE, "()F", "c", "(F)V", "x", "b", "d", "y", "<init>", "(FF)V", "community_impl_release"}, k = 1, mv = {1, 8, 0})
    public static final /* data */ class Touch {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
        public float x;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
        public float y;

        /* JADX WARN: Illegal instructions before constructor call */
        public Touch() {
            float f = 0.0f;
            this(f, f, 3, null);
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final float getX() {
            return this.x;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final float getY() {
            return this.y;
        }

        public final void c(float f) {
            this.x = f;
        }

        public final void d(float f) {
            this.y = f;
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Touch)) {
                return false;
            }
            Touch touch = (Touch) other;
            return Float.compare(this.x, touch.x) == 0 && Float.compare(this.y, touch.y) == 0;
        }

        public int hashCode() {
            return (Float.hashCode(this.x) * 31) + Float.hashCode(this.y);
        }

        @NotNull
        public String toString() {
            return "Touch(x=" + this.x + ", y=" + this.y + ")";
        }

        public Touch(float f, float f2) {
            this.x = f;
            this.y = f2;
        }

        public /* synthetic */ Touch(float f, float f2, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? 0.0f : f, (i & 2) != 0 ? 0.0f : f2);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ScaleImageView(@NotNull Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        this.scaleMatrix = new Matrix();
        float f = 0.0f;
        int i = 3;
        DefaultConstructorMarker defaultConstructorMarker = null;
        this.firstTouch = new Touch(f, f, i, defaultConstructorMarker);
        this.lastTouch = new Touch(f, f, i, defaultConstructorMarker);
        this.matrixFloatArray = new float[9];
        this.initialScale = 1.0f;
        this.initialMatrix = new Matrix();
        this.tempMatrix = new Matrix();
        this.touchCenter = new Touch(f, f, i, defaultConstructorMarker);
        this.touchMode = TouchMode.NONE;
        this.firstTouchDist = 1.0f;
        this.scaleAnimator = new vdg();
        g();
    }

    public final Triple<Boolean, Float, Float> c(Matrix tempMatrix, float dX, float dY) {
        boolean z;
        RectF rectFE = e(tempMatrix);
        if (rectFE.width() <= getWidth() || rectFE.right < getWidth() || rectFE.left > 0.0f) {
            z = false;
            dX = 0.0f;
        } else {
            z = true;
        }
        if (rectFE.height() <= getHeight() || rectFE.bottom < getHeight() || rectFE.top > 0.0f) {
            dY = 0.0f;
        }
        return new Triple<>(Boolean.valueOf(z), Float.valueOf(dX), Float.valueOf(dY));
    }

    public final boolean d(float touchScale) {
        float f = (f(this.scaleMatrix) * touchScale) / this.initialScale;
        return ((double) f) >= 0.8d && f <= 4.0f;
    }

    public final RectF e(Matrix matrix) {
        Matrix matrix2 = new Matrix(matrix);
        RectF rectF = new RectF();
        rectF.set(0.0f, 0.0f, getDrawable().getIntrinsicWidth(), getDrawable().getIntrinsicHeight());
        matrix2.mapRect(rectF);
        return rectF;
    }

    public final float f(Matrix matrix) {
        matrix.getValues(this.matrixFloatArray);
        return this.matrixFloatArray[0];
    }

    public final void g() {
        setScaleType(ImageView.ScaleType.MATRIX);
        setOnTouchListener(this);
    }

    public final void h(Touch point, MotionEvent event) {
        float x = event.getX(0) + event.getX(1);
        float y = event.getY(0) + event.getY(1);
        point.c(x / 2.0f);
        point.d(y / 2.0f);
    }

    public final void i() {
        float width;
        float height;
        if (f(this.scaleMatrix) < this.initialScale) {
            this.scaleAnimator.b(this.scaleMatrix, this.initialMatrix, new Function1<Matrix, Unit>() { // from class: com.heytap.health.community.focus.ScaleImageView$performBoundaryAnimation$1
                {
                    super(1);
                }

                @Override // p010kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(Matrix matrix) {
                    invoke2(matrix);
                    return Unit.INSTANCE;
                }

                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(@NotNull Matrix it) {
                    Intrinsics.checkNotNullParameter(it, "it");
                    this.this$0.scaleMatrix = it;
                    ScaleImageView scaleImageView = this.this$0;
                    scaleImageView.setImageMatrix(scaleImageView.scaleMatrix);
                }
            });
            return;
        }
        RectF rectFE = e(this.scaleMatrix);
        if (rectFE.width() >= getWidth()) {
            width = rectFE.right < ((float) getWidth()) ? getWidth() - rectFE.right : 0.0f;
            float f = rectFE.left;
            if (f > 0.0f) {
                width = -f;
            }
        } else {
            width = ((getWidth() * 0.5f) - rectFE.right) + (rectFE.width() * 0.5f);
        }
        if (rectFE.height() >= getHeight()) {
            float f2 = rectFE.top;
            height = f2 > 0.0f ? -f2 : 0.0f;
            if (rectFE.bottom < getHeight()) {
                height = getHeight() - rectFE.bottom;
            }
        } else {
            height = ((getHeight() * 0.5f) - rectFE.bottom) + (rectFE.height() * 0.5f);
        }
        this.tempMatrix.set(this.scaleMatrix);
        this.tempMatrix.postTranslate(width, height);
        this.scaleAnimator.b(this.scaleMatrix, this.tempMatrix, new Function1<Matrix, Unit>() { // from class: com.heytap.health.community.focus.ScaleImageView$performBoundaryAnimation$2
            {
                super(1);
            }

            @Override // p010kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Matrix matrix) {
                invoke2(matrix);
                return Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(@NotNull Matrix it) {
                Intrinsics.checkNotNullParameter(it, "it");
                this.this$0.scaleMatrix = it;
                ScaleImageView scaleImageView = this.this$0;
                scaleImageView.setImageMatrix(scaleImageView.scaleMatrix);
            }
        });
    }

    public final void j() {
        float f;
        float f2;
        Drawable drawable = getDrawable();
        if (drawable == null) {
            return;
        }
        int intrinsicWidth = drawable.getIntrinsicWidth();
        int intrinsicHeight = drawable.getIntrinsicHeight();
        int width = getWidth();
        int height = getHeight();
        if (intrinsicWidth * height > width * intrinsicHeight) {
            f = width;
            f2 = intrinsicWidth;
        } else {
            f = height;
            f2 = intrinsicHeight;
        }
        float f3 = f / f2;
        this.scaleMatrix.setScale(f3, f3);
        this.scaleMatrix.postTranslate((int) (((width - (intrinsicWidth * f3)) * 0.5f) + 0.5f), (int) (((height - (intrinsicHeight * f3)) * 0.5f) + 0.5f));
        setImageMatrix(this.scaleMatrix);
    }

    public final void k(MotionEvent event) {
        Touch touch = this.firstTouch;
        touch.c(event.getX());
        touch.d(event.getY());
        this.lastTouch.c(event.getX());
        this.lastTouch.d(event.getY());
    }

    public final float l(MotionEvent event) {
        float x = event.getX(0) - event.getX(1);
        float y = event.getY(0) - event.getY(1);
        return (float) Math.sqrt((x * x) + (y * y));
    }

    public final float m(Touch firstTouch, Touch endTouch) {
        float x = endTouch.getX() - firstTouch.getX();
        float y = endTouch.getY() - firstTouch.getY();
        return (float) Math.sqrt((x * x) + (y * y));
    }

    @Override // android.view.View
    public void onLayout(boolean changed, int left, int top, int right, int bottom) {
        super.onLayout(changed, left, top, right, bottom);
        j();
        this.initialMatrix.set(this.scaleMatrix);
        this.initialScale = f(this.scaleMatrix);
    }

    @Override // android.view.View.OnTouchListener
    public boolean onTouch(@Nullable View v, @Nullable MotionEvent event) {
        if (event == null || v == null) {
            return false;
        }
        getParent().requestDisallowInterceptTouchEvent(true);
        int action = event.getAction() & 255;
        if (action == 0) {
            k(event);
            this.touchMode = TouchMode.NONE;
        } else if (action == 1) {
            TouchMode touchMode = this.touchMode;
            if (touchMode == TouchMode.ZOOM || touchMode == TouchMode.DRAG) {
                i();
            }
        } else if (action == 2) {
            if (this.touchMode != TouchMode.ZOOM) {
                float x = event.getX() - this.lastTouch.getX();
                float y = event.getY() - this.lastTouch.getY();
                if (m(this.firstTouch, new Touch(event.getX(), event.getY())) > 10.0f) {
                    this.touchMode = TouchMode.DRAG;
                }
                this.tempMatrix.set(this.scaleMatrix);
                this.tempMatrix.postTranslate(x, y);
                Triple<Boolean, Float, Float> tripleC = c(this.tempMatrix, x, y);
                boolean zBooleanValue = tripleC.component1().booleanValue();
                this.scaleMatrix.postTranslate(tripleC.component2().floatValue(), tripleC.component3().floatValue());
                if (!zBooleanValue) {
                    getParent().requestDisallowInterceptTouchEvent(false);
                }
            } else if (event.getPointerCount() >= 2) {
                float fL = l(event);
                float f = fL / this.firstTouchDist;
                if (d(f)) {
                    this.firstTouchDist = fL;
                    this.scaleMatrix.postScale(f, f, this.touchCenter.getX(), this.touchCenter.getY());
                }
            }
            this.lastTouch.c(event.getX());
            this.lastTouch.d(event.getY());
            setImageMatrix(this.scaleMatrix);
        } else if (action == 5 && event.getPointerCount() >= 2) {
            float fL2 = l(event);
            this.firstTouchDist = fL2;
            if (fL2 > 10.0f) {
                this.touchMode = TouchMode.ZOOM;
            }
            h(this.touchCenter, event);
        }
        return true;
    }

    @Override // androidx.appcompat.widget.AppCompatImageView, android.widget.ImageView
    public void setImageDrawable(@Nullable Drawable drawable) {
        super.setImageDrawable(drawable);
        this.scaleMatrix = new Matrix();
        j();
    }

    @Override // androidx.appcompat.widget.AppCompatImageView, android.widget.ImageView
    public void setImageResource(int resId) {
        super.setImageResource(resId);
        j();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ScaleImageView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
        this.scaleMatrix = new Matrix();
        float f = 0.0f;
        int i = 3;
        DefaultConstructorMarker defaultConstructorMarker = null;
        this.firstTouch = new Touch(f, f, i, defaultConstructorMarker);
        this.lastTouch = new Touch(f, f, i, defaultConstructorMarker);
        this.matrixFloatArray = new float[9];
        this.initialScale = 1.0f;
        this.initialMatrix = new Matrix();
        this.tempMatrix = new Matrix();
        this.touchCenter = new Touch(f, f, i, defaultConstructorMarker);
        this.touchMode = TouchMode.NONE;
        this.firstTouchDist = 1.0f;
        this.scaleAnimator = new vdg();
        g();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ScaleImageView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
        this.scaleMatrix = new Matrix();
        float f = 0.0f;
        int i2 = 3;
        DefaultConstructorMarker defaultConstructorMarker = null;
        this.firstTouch = new Touch(f, f, i2, defaultConstructorMarker);
        this.lastTouch = new Touch(f, f, i2, defaultConstructorMarker);
        this.matrixFloatArray = new float[9];
        this.initialScale = 1.0f;
        this.initialMatrix = new Matrix();
        this.tempMatrix = new Matrix();
        this.touchCenter = new Touch(f, f, i2, defaultConstructorMarker);
        this.touchMode = TouchMode.NONE;
        this.firstTouchDist = 1.0f;
        this.scaleAnimator = new vdg();
        g();
    }
}
