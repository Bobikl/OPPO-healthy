package com.coui.appcompat.button;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import com.heytap.wearable.support.watchface.common.utils.ResourcesUtil;
import com.oplus.aiunit.vision.rh2;
import com.oplus.aiunit.vision.y04;
import com.support.nearx.R$styleable;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.Unit;
import p010kotlin.jvm.JvmOverloads;
import p010kotlin.jvm.internal.DefaultConstructorMarker;
import p010kotlin.jvm.internal.Intrinsics;
import p010kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0010\u0011\n\u0002\b\u001e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0016\u0018\u0000 G2\u00020\u0001:\u0001HB'\b\u0007\u0012\u0006\u0010A\u001a\u00020@\u0012\n\b\u0002\u0010C\u001a\u0004\u0018\u00010B\u0012\b\b\u0002\u0010D\u001a\u00020\u0016¢\u0006\u0004\bE\u0010FJ0\u0010\b\u001a\u00020\u00072\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\u0010\u0004\u001a\u0004\u0018\u00010\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u00022\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002H\u0016J\u0010\u0010\u000b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tH\u0014J\u0010\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u0002H\u0016J\u0010\u0010\u000f\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u0002H\u0016J\u0010\u0010\u0010\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u0002H\u0016J\u0010\u0010\u0011\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u0002H\u0016J\u0010\u0010\u0012\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u0002H\u0016J\u0010\u0010\u0013\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u0002H\u0016J\u0010\u0010\u0014\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u0002H\u0016J\u0010\u0010\u0015\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u0002H\u0016J\b\u0010\u0017\u001a\u00020\u0016H\u0016J\b\u0010\u0018\u001a\u00020\u0016H\u0016J\b\u0010\u0019\u001a\u00020\u0016H\u0016J\b\u0010\u001a\u001a\u00020\u0016H\u0016J(\u0010\u001e\u001a\u00020\u00072\u0006\u0010\u001b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u001c\u001a\u00020\r2\u0006\u0010\u001d\u001a\u00020\rH\u0002J\b\u0010\u001f\u001a\u00020\rH\u0002J\b\u0010 \u001a\u00020\rH\u0002R \u0010$\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0018\u00010!8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\"\u0010#R*\u0010,\u001a\u00020\u00162\u0006\u0010%\u001a\u00020\u00168\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)\"\u0004\b*\u0010+R*\u00100\u001a\u00020\u00162\u0006\u0010%\u001a\u00020\u00168\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b-\u0010'\u001a\u0004\b.\u0010)\"\u0004\b/\u0010+R*\u00104\u001a\u00020\u00162\u0006\u0010%\u001a\u00020\u00168\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b1\u0010'\u001a\u0004\b2\u0010)\"\u0004\b3\u0010+R*\u00108\u001a\u00020\u00162\u0006\u0010%\u001a\u00020\u00168\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b5\u0010'\u001a\u0004\b6\u0010)\"\u0004\b7\u0010+R*\u0010<\u001a\u00020\u00162\u0006\u0010%\u001a\u00020\u00168\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b9\u0010'\u001a\u0004\b:\u0010)\"\u0004\b;\u0010+R\u0019\u0010?\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020!8F¢\u0006\u0006\u001a\u0004\b=\u0010>¨\u0006I"}, d2 = {"Lcom/coui/appcompat/button/COUIIconButton;", "Lcom/coui/appcompat/button/COUIButton;", "Landroid/graphics/drawable/Drawable;", y04.TIME_STYLE_LEFT_DIR_NAME, "top", y04.TIME_STYLE_RIGHT_DIR_NAME, "bottom", "", "setCompoundDrawables", "Landroid/graphics/Canvas;", "canvas", "onDraw", ResourcesUtil.ResourceType.DRAWABLE, "", "getDrawableBottomXPosition", "getDrawableBottomYPosition", "getDrawableTopXPosition", "getDrawableTopYPosition", "getDrawableRightXPosition", "getDrawableRightYPosition", "getDrawableLeftXPosition", "getDrawableLeftYPosition", "", "getCompoundPaddingLeft", "getCompoundPaddingRight", "getCompoundPaddingTop", "getCompoundPaddingBottom", "icon", "positionX", "positionY", "drawIcon", "getTextMaxWidth", "getTextMinLeft", "", "d0", "[Landroid/graphics/drawable/Drawable;", "_mShowing", "value", "e0", "I", "getIconPadding", "()I", "setIconPadding", "(I)V", "iconPadding", "f0", "getIconPaddingLeft", "setIconPaddingLeft", "iconPaddingLeft", "g0", "getIconPaddingRight", "setIconPaddingRight", "iconPaddingRight", "h0", "getIconPaddingTop", "setIconPaddingTop", "iconPaddingTop", "i0", "getIconPaddingBottom", "setIconPaddingBottom", "iconPaddingBottom", "getMShowing", "()[Landroid/graphics/drawable/Drawable;", "mShowing", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Companion", "a", "coui-support-nearx_release"}, k = 1, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nCOUIIconButton.kt\nKotlin\n*S Kotlin\n*F\n+ 1 COUIIconButton.kt\ncom/coui/appcompat/button/COUIIconButton\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,379:1\n13579#2,2:380\n*S KotlinDebug\n*F\n+ 1 COUIIconButton.kt\ncom/coui/appcompat/button/COUIIconButton\n*L\n120#1:380,2\n*E\n"})
public class COUIIconButton extends COUIButton {
    public static final int BOTTOM = 3;
    public static final int LEFT = 0;
    public static final int RIGHT = 2;
    public static final int TOP = 1;

    /* JADX INFO: renamed from: d0, reason: from kotlin metadata */
    @Nullable
    public Drawable[] _mShowing;

    /* JADX INFO: renamed from: e0, reason: from kotlin metadata */
    public int iconPadding;

    /* JADX INFO: renamed from: f0, reason: from kotlin metadata */
    public int iconPaddingLeft;

    /* JADX INFO: renamed from: g0, reason: from kotlin metadata */
    public int iconPaddingRight;

    /* JADX INFO: renamed from: h0, reason: from kotlin metadata */
    public int iconPaddingTop;

    /* JADX INFO: renamed from: i0, reason: from kotlin metadata */
    public int iconPaddingBottom;
    public static final int j0 = rh2.a(8);

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public COUIIconButton(@NotNull Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    private final float getTextMaxWidth() {
        float lineWidth = getLayout().getLineWidth(0);
        int lineCount = getLayout().getLineCount();
        for (int i = 0; i < lineCount; i++) {
            lineWidth = Math.max(lineWidth, getLayout().getLineWidth(i));
        }
        return lineWidth;
    }

    private final float getTextMinLeft() {
        float lineLeft = getLayout().getLineLeft(0);
        int lineCount = getLayout().getLineCount();
        for (int i = 0; i < lineCount; i++) {
            lineLeft = Math.min(lineLeft, getLayout().getLineLeft(i));
        }
        return lineLeft;
    }

    public final void drawIcon(Drawable icon, Canvas canvas, float positionX, float positionY) {
        canvas.save();
        canvas.translate(positionX, positionY);
        icon.draw(canvas);
        canvas.restore();
    }

    @Override // android.widget.TextView
    public int getCompoundPaddingBottom() {
        Drawable drawable = getMShowing()[3];
        return drawable != null ? getPaddingBottom() + getCompoundDrawablePadding() + drawable.getBounds().height() : getPaddingBottom();
    }

    @Override // android.widget.TextView
    public int getCompoundPaddingLeft() {
        Drawable drawable = getMShowing()[0];
        return drawable != null ? getPaddingLeft() + getCompoundDrawablePadding() + drawable.getBounds().width() : getPaddingLeft();
    }

    @Override // android.widget.TextView
    public int getCompoundPaddingRight() {
        Drawable drawable = getMShowing()[2];
        return drawable != null ? getPaddingRight() + getCompoundDrawablePadding() + drawable.getBounds().width() : getPaddingRight();
    }

    @Override // android.widget.TextView
    public int getCompoundPaddingTop() {
        Drawable drawable = getMShowing()[1];
        return drawable != null ? getPaddingTop() + getCompoundDrawablePadding() + drawable.getBounds().height() : getPaddingTop();
    }

    public float getDrawableBottomXPosition(@NotNull Drawable drawable) {
        int iWidth;
        Intrinsics.checkNotNullParameter(drawable, "drawable");
        int right = ((getRight() - getLeft()) - getCompoundPaddingRight()) - getCompoundPaddingLeft();
        int scrollX = getScrollX() + getCompoundPaddingLeft();
        int gravity = getGravity() & 7;
        if (gravity != 3) {
            iWidth = gravity != 5 ? (right - drawable.getBounds().width()) >> 1 : right - (((int) (drawable.getBounds().width() + getTextMaxWidth())) >> 1);
        } else {
            iWidth = drawable.getBounds().width() >> 1;
        }
        return scrollX + iWidth;
    }

    public float getDrawableBottomYPosition(@NotNull Drawable drawable) {
        int height;
        Intrinsics.checkNotNullParameter(drawable, "drawable");
        int bottom = ((getBottom() - getTop()) - getCompoundPaddingBottom()) - getCompoundPaddingTop();
        int scrollY = (((getScrollY() + getBottom()) - getTop()) - getPaddingBottom()) - getLayout().getHeight();
        int gravity = getGravity() & 112;
        if (gravity != 48) {
            height = gravity != 80 ? (bottom - getLayout().getHeight()) >> 1 : 0;
        } else {
            height = bottom - getLayout().getHeight();
        }
        return (scrollY - height) + this.iconPaddingBottom;
    }

    public float getDrawableLeftXPosition(@NotNull Drawable drawable) {
        Intrinsics.checkNotNullParameter(drawable, "drawable");
        return TextUtils.isEmpty(getText()) ? (getWidth() / 2) - (drawable.getIntrinsicWidth() / 2) : ((getScrollX() + getPaddingLeft()) + getTextMinLeft()) - this.iconPaddingLeft;
    }

    public float getDrawableLeftYPosition(@NotNull Drawable drawable) {
        int iHeight;
        Intrinsics.checkNotNullParameter(drawable, "drawable");
        int bottom = ((getBottom() - getTop()) - getCompoundPaddingBottom()) - getCompoundPaddingTop();
        int scrollY = getScrollY() + getCompoundPaddingTop();
        int gravity = getGravity() & 112;
        if (gravity != 48) {
            iHeight = gravity != 80 ? (bottom - drawable.getBounds().height()) >> 1 : bottom - drawable.getBounds().height();
        } else {
            iHeight = 0;
        }
        return scrollY + iHeight;
    }

    public float getDrawableRightXPosition(@NotNull Drawable drawable) {
        float textMinLeft;
        Intrinsics.checkNotNullParameter(drawable, "drawable");
        Drawable drawable2 = getMShowing()[0];
        if (drawable2 != null) {
            textMinLeft = getDrawableLeftXPosition(drawable2) + drawable2.getBounds().width() + getCompoundDrawablePadding() + this.iconPaddingLeft;
        } else {
            textMinLeft = getTextMinLeft() + getScrollX() + getPaddingLeft();
        }
        return textMinLeft + getTextMaxWidth() + getCompoundDrawablePadding() + this.iconPaddingRight;
    }

    public float getDrawableRightYPosition(@NotNull Drawable drawable) {
        int iHeight;
        Intrinsics.checkNotNullParameter(drawable, "drawable");
        int bottom = ((getBottom() - getTop()) - getCompoundPaddingBottom()) - getCompoundPaddingTop();
        int scrollY = getScrollY() + getCompoundPaddingTop();
        int gravity = getGravity() & 112;
        if (gravity != 48) {
            iHeight = gravity != 80 ? (bottom - drawable.getBounds().height()) >> 1 : bottom - drawable.getBounds().height();
        } else {
            iHeight = 0;
        }
        return scrollY + iHeight;
    }

    public float getDrawableTopXPosition(@NotNull Drawable drawable) {
        int iWidth;
        Intrinsics.checkNotNullParameter(drawable, "drawable");
        int right = ((getRight() - getLeft()) - getCompoundPaddingRight()) - getCompoundPaddingLeft();
        int scrollX = getScrollX() + getCompoundPaddingLeft();
        int gravity = getGravity() & 7;
        if (gravity != 3) {
            iWidth = gravity != 5 ? (right - drawable.getBounds().width()) >> 1 : right - (((int) (drawable.getBounds().width() + getTextMaxWidth())) >> 1);
        } else {
            iWidth = drawable.getBounds().width() >> 1;
        }
        return scrollX + iWidth;
    }

    public float getDrawableTopYPosition(@NotNull Drawable drawable) {
        int height;
        Intrinsics.checkNotNullParameter(drawable, "drawable");
        int bottom = ((getBottom() - getTop()) - getCompoundPaddingBottom()) - getCompoundPaddingTop();
        int scrollY = getScrollY() + getPaddingTop();
        int gravity = getGravity() & 112;
        if (gravity != 48) {
            height = gravity != 80 ? (bottom - getLayout().getHeight()) >> 1 : bottom - getLayout().getHeight();
        } else {
            height = 0;
        }
        return (scrollY + height) - this.iconPaddingTop;
    }

    public final int getIconPadding() {
        return this.iconPadding;
    }

    public final int getIconPaddingBottom() {
        return this.iconPaddingBottom;
    }

    public final int getIconPaddingLeft() {
        return this.iconPaddingLeft;
    }

    public final int getIconPaddingRight() {
        return this.iconPaddingRight;
    }

    public final int getIconPaddingTop() {
        return this.iconPaddingTop;
    }

    @NotNull
    public final Drawable[] getMShowing() {
        Drawable[] drawableArr = this._mShowing;
        Intrinsics.checkNotNull(drawableArr);
        return drawableArr;
    }

    @Override // com.coui.appcompat.button.COUIButton, android.widget.TextView, android.view.View
    public void onDraw(@NotNull Canvas canvas) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        super.onDraw(canvas);
        Drawable drawable = getMShowing()[0];
        if (drawable != null) {
            drawIcon(drawable, canvas, getDrawableLeftXPosition(drawable), getDrawableLeftYPosition(drawable));
        }
        Drawable drawable2 = getMShowing()[2];
        if (drawable2 != null) {
            drawIcon(drawable2, canvas, getDrawableRightXPosition(drawable2), getDrawableRightYPosition(drawable2));
        }
        Drawable drawable3 = getMShowing()[1];
        if (drawable3 != null) {
            drawIcon(drawable3, canvas, getDrawableTopXPosition(drawable3), getDrawableTopYPosition(drawable3));
        }
        Drawable drawable4 = getMShowing()[3];
        if (drawable4 != null) {
            drawIcon(drawable4, canvas, getDrawableBottomXPosition(drawable4), getDrawableBottomYPosition(drawable4));
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawables(@Nullable Drawable left, @Nullable Drawable top, @Nullable Drawable right, @Nullable Drawable bottom) {
        if (this._mShowing == null) {
            this._mShowing = new Drawable[4];
        }
        for (Drawable drawable : getMShowing()) {
            if (drawable != null) {
                drawable.setCallback(null);
            }
        }
        Drawable[] mShowing = getMShowing();
        if (left != null) {
            left.setState(getDrawableState());
            left.setCallback(this);
            Unit unit = Unit.INSTANCE;
        } else {
            left = null;
        }
        mShowing[0] = left;
        Drawable[] mShowing2 = getMShowing();
        if (top != null) {
            top.setState(getDrawableState());
            top.setCallback(this);
            Unit unit2 = Unit.INSTANCE;
        } else {
            top = null;
        }
        mShowing2[1] = top;
        Drawable[] mShowing3 = getMShowing();
        if (right != null) {
            right.setState(getDrawableState());
            right.setCallback(this);
            Unit unit3 = Unit.INSTANCE;
        } else {
            right = null;
        }
        mShowing3[2] = right;
        Drawable[] mShowing4 = getMShowing();
        if (bottom != null) {
            bottom.setState(getDrawableState());
            bottom.setCallback(this);
            Unit unit4 = Unit.INSTANCE;
        } else {
            bottom = null;
        }
        mShowing4[3] = bottom;
        invalidate();
        requestLayout();
    }

    public final void setIconPadding(int i) {
        setIconPaddingLeft(i);
        setIconPaddingRight(i);
        setIconPaddingTop(i);
        setIconPaddingBottom(i);
        this.iconPadding = i;
    }

    public final void setIconPaddingBottom(int i) {
        this.iconPaddingBottom = i;
        postInvalidate();
    }

    public final void setIconPaddingLeft(int i) {
        this.iconPaddingLeft = i;
        postInvalidate();
    }

    public final void setIconPaddingRight(int i) {
        this.iconPaddingRight = i;
        postInvalidate();
    }

    public final void setIconPaddingTop(int i) {
        this.iconPaddingTop = i;
        postInvalidate();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public COUIIconButton(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public /* synthetic */ COUIIconButton(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? R.attr.buttonStyle : i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public COUIIconButton(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
        int i2 = j0;
        this.iconPadding = i2;
        this.iconPaddingLeft = i2;
        this.iconPaddingRight = i2;
        this.iconPaddingTop = i2;
        this.iconPaddingBottom = i2;
        setSingleLine(false);
        setEllipsize(null);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.COUIIconButton);
        int i3 = R$styleable.COUIIconButton_iconPadding;
        boolean zHasValue = typedArrayObtainStyledAttributes.hasValue(i3);
        if (zHasValue) {
            setIconPadding(typedArrayObtainStyledAttributes.getDimensionPixelSize(i3, i2));
        }
        setIconPaddingLeft(typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.COUIIconButton_iconPaddingLeft, zHasValue ? this.iconPadding : i2));
        setIconPaddingRight(typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.COUIIconButton_iconPaddingRight, zHasValue ? this.iconPadding : i2));
        setIconPaddingTop(typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.COUIIconButton_iconPaddingTop, zHasValue ? this.iconPadding : i2));
        setIconPaddingBottom(typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.COUIIconButton_iconPaddingBottom, zHasValue ? this.iconPadding : i2));
        typedArrayObtainStyledAttributes.recycle();
    }
}
