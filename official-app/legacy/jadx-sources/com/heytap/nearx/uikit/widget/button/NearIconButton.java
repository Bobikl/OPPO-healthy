package com.heytap.nearx.uikit.widget.button;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import com.heytap.nearx.uikit.R$styleable;
import com.heytap.nearx.uikit.widget.NearButton;
import com.heytap.wearable.support.watchface.common.utils.ResourcesUtil;
import com.oplus.aiunit.vision.whc;
import com.oplus.aiunit.vision.y04;
import java.util.LinkedHashMap;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.Unit;
import p010kotlin.jvm.JvmOverloads;
import p010kotlin.jvm.internal.DefaultConstructorMarker;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes18.dex */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0017\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0018\b\u0016\u0018\u0000 ?2\u00020\u0001:\u0001?B%\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ(\u0010\"\u001a\u00020#2\u0006\u0010$\u001a\u00020\u000b2\u0006\u0010%\u001a\u00020&2\u0006\u0010'\u001a\u00020(2\u0006\u0010)\u001a\u00020(H\u0002J\b\u0010*\u001a\u00020\u0007H\u0016J\b\u0010+\u001a\u00020\u0007H\u0016J\b\u0010,\u001a\u00020\u0007H\u0016J\b\u0010-\u001a\u00020\u0007H\u0016J\u0010\u0010.\u001a\u00020(2\u0006\u0010/\u001a\u00020\u000bH\u0016J\u0010\u00100\u001a\u00020(2\u0006\u0010/\u001a\u00020\u000bH\u0016J\u0010\u00101\u001a\u00020(2\u0006\u0010/\u001a\u00020\u000bH\u0016J\u0010\u00102\u001a\u00020(2\u0006\u0010/\u001a\u00020\u000bH\u0016J\u0010\u00103\u001a\u00020(2\u0006\u0010/\u001a\u00020\u000bH\u0016J\u0010\u00104\u001a\u00020(2\u0006\u0010/\u001a\u00020\u000bH\u0016J\u0010\u00105\u001a\u00020(2\u0006\u0010/\u001a\u00020\u000bH\u0016J\u0010\u00106\u001a\u00020(2\u0006\u0010/\u001a\u00020\u000bH\u0016J\b\u00107\u001a\u00020(H\u0002J\b\u00108\u001a\u00020(H\u0002J\u0010\u00109\u001a\u00020#2\u0006\u0010%\u001a\u00020&H\u0014J0\u0010:\u001a\u00020#2\b\u0010;\u001a\u0004\u0018\u00010\u000b2\b\u0010<\u001a\u0004\u0018\u00010\u000b2\b\u0010=\u001a\u0004\u0018\u00010\u000b2\b\u0010>\u001a\u0004\u0018\u00010\u000bH\u0016R\u001a\u0010\t\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u000b\u0018\u00010\nX\u0082\u000e¢\u0006\u0004\n\u0002\u0010\fR$\u0010\u000e\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u0007@FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R$\u0010\u0013\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u0007@FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0010\"\u0004\b\u0015\u0010\u0012R$\u0010\u0016\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u0007@FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0010\"\u0004\b\u0018\u0010\u0012R$\u0010\u0019\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u0007@FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u0010\"\u0004\b\u001b\u0010\u0012R$\u0010\u001c\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u0007@FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u0010\"\u0004\b\u001e\u0010\u0012R\u0019\u0010\u001f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000b0\n8F¢\u0006\u0006\u001a\u0004\b \u0010!¨\u0006@"}, d2 = {"Lcom/heytap/nearx/uikit/widget/button/NearIconButton;", "Lcom/heytap/nearx/uikit/widget/NearButton;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "_mShowing", "", "Landroid/graphics/drawable/Drawable;", "[Landroid/graphics/drawable/Drawable;", "value", "iconPadding", "getIconPadding", "()I", "setIconPadding", "(I)V", "iconPaddingBottom", "getIconPaddingBottom", "setIconPaddingBottom", "iconPaddingLeft", "getIconPaddingLeft", "setIconPaddingLeft", "iconPaddingRight", "getIconPaddingRight", "setIconPaddingRight", "iconPaddingTop", "getIconPaddingTop", "setIconPaddingTop", "mShowing", "getMShowing", "()[Landroid/graphics/drawable/Drawable;", "drawIcon", "", "icon", "canvas", "Landroid/graphics/Canvas;", "positionX", "", "positionY", "getCompoundPaddingBottom", "getCompoundPaddingLeft", "getCompoundPaddingRight", "getCompoundPaddingTop", "getDrawableBottomXPosition", ResourcesUtil.ResourceType.DRAWABLE, "getDrawableBottomYPosition", "getDrawableLeftXPosition", "getDrawableLeftYPosition", "getDrawableRightXPosition", "getDrawableRightYPosition", "getDrawableTopXPosition", "getDrawableTopYPosition", "getTextMaxWidth", "getTextMinLeft", "onDraw", "setCompoundDrawables", y04.TIME_STYLE_LEFT_DIR_NAME, "top", y04.TIME_STYLE_RIGHT_DIR_NAME, "bottom", "Companion", "nearx_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
public class NearIconButton extends NearButton {
    public static final int BOTTOM = 3;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    private static final int DEF_ICON_PADDING = whc.c(8);
    public static final int LEFT = 0;
    public static final int RIGHT = 2;
    public static final int TOP = 1;

    @NotNull
    public Map<Integer, View> _$_findViewCache;

    @Nullable
    private Drawable[] _mShowing;
    private int iconPadding;
    private int iconPaddingBottom;
    private int iconPaddingLeft;
    private int iconPaddingRight;
    private int iconPaddingTop;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u0011\u0010\u0005\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u000e\u0010\b\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u000b"}, d2 = {"Lcom/heytap/nearx/uikit/widget/button/NearIconButton$Companion;", "", "()V", "BOTTOM", "", "DEF_ICON_PADDING", "getDEF_ICON_PADDING", "()I", "LEFT", "RIGHT", "TOP", "nearx_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final int getDEF_ICON_PADDING() {
            return NearIconButton.DEF_ICON_PADDING;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public NearIconButton(@NotNull Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    private final void drawIcon(Drawable icon, Canvas canvas, float positionX, float positionY) {
        canvas.save();
        canvas.translate(positionX, positionY);
        icon.draw(canvas);
        canvas.restore();
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

    @Override // com.heytap.nearx.uikit.widget.NearButton, com.heytap.nearx.uikit.internal.widget.InnerButton
    public void _$_clearFindViewByIdCache() {
        this._$_findViewCache.clear();
    }

    @Override // com.heytap.nearx.uikit.widget.NearButton, com.heytap.nearx.uikit.internal.widget.InnerButton
    @Nullable
    public View _$_findCachedViewById(int i) {
        Map<Integer, View> map = this._$_findViewCache;
        View view = map.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View viewFindViewById = findViewById(i);
        if (viewFindViewById == null) {
            return null;
        }
        map.put(Integer.valueOf(i), viewFindViewById);
        return viewFindViewById;
    }

    @Override // android.widget.TextView
    public int getCompoundPaddingBottom() {
        Drawable drawable = getMShowing()[3];
        Integer numValueOf = drawable == null ? null : Integer.valueOf(getPaddingBottom() + getCompoundDrawablePadding() + drawable.getBounds().height());
        return numValueOf == null ? getPaddingBottom() : numValueOf.intValue();
    }

    @Override // android.widget.TextView
    public int getCompoundPaddingLeft() {
        Drawable drawable = getMShowing()[0];
        Integer numValueOf = drawable == null ? null : Integer.valueOf(getPaddingLeft() + getCompoundDrawablePadding() + drawable.getBounds().width());
        return numValueOf == null ? getPaddingLeft() : numValueOf.intValue();
    }

    @Override // android.widget.TextView
    public int getCompoundPaddingRight() {
        Drawable drawable = getMShowing()[2];
        Integer numValueOf = drawable == null ? null : Integer.valueOf(getPaddingRight() + getCompoundDrawablePadding() + drawable.getBounds().width());
        return numValueOf == null ? getPaddingRight() : numValueOf.intValue();
    }

    @Override // android.widget.TextView
    public int getCompoundPaddingTop() {
        Drawable drawable = getMShowing()[1];
        Integer numValueOf = drawable == null ? null : Integer.valueOf(getPaddingTop() + getCompoundDrawablePadding() + drawable.getBounds().height());
        return numValueOf == null ? getPaddingTop() : numValueOf.intValue();
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
        return (scrollY - height) + getIconPaddingBottom();
    }

    public float getDrawableLeftXPosition(@NotNull Drawable drawable) {
        Intrinsics.checkNotNullParameter(drawable, "drawable");
        return ((getScrollX() + getPaddingLeft()) + getTextMinLeft()) - this.iconPaddingLeft;
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
        Intrinsics.checkNotNullParameter(drawable, "drawable");
        Drawable drawable2 = getMShowing()[0];
        Float fValueOf = drawable2 == null ? null : Float.valueOf(getDrawableLeftXPosition(drawable2) + drawable2.getBounds().width() + getCompoundDrawablePadding() + getIconPaddingLeft());
        return (fValueOf == null ? getScrollX() + getPaddingLeft() + getTextMinLeft() : fValueOf.floatValue()) + getTextMaxWidth() + getCompoundDrawablePadding() + this.iconPaddingRight;
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
        return (scrollY + height) - getIconPaddingTop();
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

    @Override // com.heytap.nearx.uikit.widget.NearButton, com.heytap.nearx.uikit.internal.widget.InnerButton, android.widget.TextView, android.view.View
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
        if (drawable4 == null) {
            return;
        }
        drawIcon(drawable4, canvas, getDrawableBottomXPosition(drawable4), getDrawableBottomYPosition(drawable4));
    }

    @Override // android.widget.TextView
    public void setCompoundDrawables(@Nullable Drawable left, @Nullable Drawable top, @Nullable Drawable right, @Nullable Drawable bottom) {
        if (this._mShowing == null) {
            this._mShowing = new Drawable[4];
        }
        Drawable[] mShowing = getMShowing();
        int length = mShowing.length;
        int i = 0;
        while (i < length) {
            Drawable drawable = mShowing[i];
            i++;
            if (drawable != null) {
                drawable.setCallback(null);
            }
        }
        Drawable[] mShowing2 = getMShowing();
        if (left == null) {
            left = null;
        } else {
            left.setState(getDrawableState());
            left.setCallback(this);
            Unit unit = Unit.INSTANCE;
        }
        mShowing2[0] = left;
        Drawable[] mShowing3 = getMShowing();
        if (top == null) {
            top = null;
        } else {
            top.setState(getDrawableState());
            top.setCallback(this);
            Unit unit2 = Unit.INSTANCE;
        }
        mShowing3[1] = top;
        Drawable[] mShowing4 = getMShowing();
        if (right == null) {
            right = null;
        } else {
            right.setState(getDrawableState());
            right.setCallback(this);
            Unit unit3 = Unit.INSTANCE;
        }
        mShowing4[2] = right;
        Drawable[] mShowing5 = getMShowing();
        if (bottom == null) {
            bottom = null;
        } else {
            bottom.setState(getDrawableState());
            bottom.setCallback(this);
            Unit unit4 = Unit.INSTANCE;
        }
        mShowing5[3] = bottom;
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
    public NearIconButton(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public /* synthetic */ NearIconButton(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? R.attr.buttonStyle : i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public NearIconButton(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
        int i2 = DEF_ICON_PADDING;
        this.iconPadding = i2;
        this.iconPaddingLeft = i2;
        this.iconPaddingRight = i2;
        this.iconPaddingTop = i2;
        this.iconPaddingBottom = i2;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.NearIconButton);
        int i3 = R$styleable.NearIconButton_iconPadding;
        boolean zHasValue = typedArrayObtainStyledAttributes.hasValue(i3);
        if (zHasValue) {
            setIconPadding(typedArrayObtainStyledAttributes.getDimensionPixelSize(i3, i2));
        }
        setIconPaddingLeft(typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.NearIconButton_iconPaddingLeft, zHasValue ? getIconPadding() : i2));
        setIconPaddingRight(typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.NearIconButton_iconPaddingRight, zHasValue ? getIconPadding() : i2));
        setIconPaddingTop(typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.NearIconButton_iconPaddingTop, zHasValue ? getIconPadding() : i2));
        setIconPaddingBottom(typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.NearIconButton_iconPaddingBottom, zHasValue ? getIconPadding() : i2));
        typedArrayObtainStyledAttributes.recycle();
        this._$_findViewCache = new LinkedHashMap();
    }
}
