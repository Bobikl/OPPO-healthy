package com.coui.appcompat.input;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewOutlineProvider;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.coui.appcompat.preference.ListSelectedItemLayout;
import com.oplus.aiunit.vision.bj2;
import com.oplus.aiunit.vision.hm2;
import com.oplus.aiunit.vision.lh2;
import com.oplus.aiunit.vision.ph2;
import com.oplus.aiunit.vision.xl2;
import com.oplus.aiunit.vision.zw3;
import com.support.appcompat.R$attr;
import com.support.input.R$dimen;
import com.support.input.R$styleable;

/* JADX INFO: loaded from: classes13.dex */
public class COUIInputListSelectedItemLayout extends ListSelectedItemLayout {
    public static final int FULL = 4;
    public static final int HEAD = 1;
    public static final int MIDDLE = 2;
    public static final int NONE = 0;
    public static final int T = 32;
    public static final int TAIL = 3;
    public boolean A;
    public int B;
    public int C;
    public int D;
    public boolean E;
    public boolean F;
    public boolean G;
    public int H;
    public final int r;
    public final RectF s;
    public final Paint t;
    public final Drawable u;
    public final ViewOutlineProvider v;
    public float w;
    public int x;
    public Path y;
    public boolean z;

    public class a extends Drawable {
        public a() {
        }

        @Override // android.graphics.drawable.Drawable
        public void draw(@NonNull Canvas canvas) {
            if (!COUIInputListSelectedItemLayout.this.G) {
                canvas.drawColor(COUIInputListSelectedItemLayout.this.H);
            } else {
                COUIInputListSelectedItemLayout.this.t.setColor(COUIInputListSelectedItemLayout.this.H);
                canvas.drawPath(COUIInputListSelectedItemLayout.this.y, COUIInputListSelectedItemLayout.this.t);
            }
        }

        @Override // android.graphics.drawable.Drawable
        public int getOpacity() {
            return 0;
        }

        @Override // android.graphics.drawable.Drawable
        public void setAlpha(int i) {
        }

        @Override // android.graphics.drawable.Drawable
        public void setColorFilter(@Nullable ColorFilter colorFilter) {
        }
    }

    public class b extends ViewOutlineProvider {
        public b() {
        }

        @Override // android.view.ViewOutlineProvider
        public void getOutline(View view, Outline outline) {
            if (Build.VERSION.SDK_INT >= 32) {
                outline.setPath(COUIInputListSelectedItemLayout.this.y);
                COUIInputListSelectedItemLayout.this.F = true;
            }
        }
    }

    public COUIInputListSelectedItemLayout(Context context) {
        this(context, null);
    }

    private void setCardRadiusStyle(int i) {
        if (i == 4) {
            this.z = true;
            this.A = true;
        } else if (i == 1) {
            this.z = true;
            this.A = false;
        } else if (i == 3) {
            this.z = false;
            this.A = true;
        } else {
            this.z = false;
            this.A = false;
        }
    }

    private void setPadding(int i) {
        int i2;
        int i3 = 0;
        if (i == 1) {
            i3 = this.r;
            i2 = 0;
        } else if (i == 3) {
            i2 = this.r;
        } else {
            i3 = i == 4 ? this.r : 0;
            i2 = i3;
        }
        setMinimumHeight(this.B + i3 + i2);
        setPaddingRelative(getPaddingStart(), this.C + i3, getPaddingEnd(), this.D + i2);
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        if (this.G || (Build.VERSION.SDK_INT >= 32 && this.F)) {
            o();
            super.draw(canvas);
        } else {
            canvas.save();
            canvas.clipPath(this.y);
            super.draw(canvas);
            canvas.restore();
        }
    }

    public boolean getIsSelected() {
        return this.E;
    }

    @Override // com.coui.appcompat.preference.ListSelectedItemLayout
    public Path getLayoutPath() {
        if (this.y == null) {
            this.y = new Path();
        }
        return this.y;
    }

    public int getMarginHorizontal() {
        return this.x;
    }

    public final void m(Context context, boolean z) {
        if (z) {
            this.x = context.getResources().getDimensionPixelOffset(R$dimen.coui_preference_input_margin_horizontal_tiny);
        } else {
            this.x = context.getResources().getDimensionPixelOffset(R$dimen.coui_preference_input_margin_horizontal);
        }
        this.H = lh2.a(context, R$attr.couiColorCardBackground);
        this.B = getMinimumHeight();
        this.C = getPaddingTop();
        this.D = getPaddingBottom();
        setBackground(this.u);
    }

    public void n(boolean z, boolean z2) {
        if (this.E != z) {
            this.E = z;
            Drawable background = getBackground();
            if (background instanceof hm2) {
                ((hm2) background).f(1, z, z, z2);
            }
        }
    }

    public final void o() {
        this.y.reset();
        this.s.set(this.x, 0.0f, getWidth() - this.x, getHeight());
        Path path = this.y;
        RectF rectF = this.s;
        float f = this.w;
        boolean z = this.z;
        boolean z2 = this.A;
        xl2.b(path, rectF, f, z, z, z2, z2);
    }

    @Override // com.coui.appcompat.preference.ListSelectedItemLayout, android.view.View
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
    }

    @Override // com.coui.appcompat.preference.ListSelectedItemLayout, android.view.View
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        o();
        if (this.G || Build.VERSION.SDK_INT < 32) {
            this.F = false;
            setClipToOutline(false);
        } else {
            setOutlineProvider(this.v);
            setClipToOutline(true);
        }
    }

    @Override // com.coui.appcompat.preference.ListSelectedItemLayout
    public void setConfigurationChangeListener(zw3 zw3Var) {
    }

    public void setIsSelected(boolean z) {
        n(z, false);
    }

    public void setMarginHorizontal(int i) {
        this.x = i;
        requestLayout();
    }

    @Override // com.coui.appcompat.preference.ListSelectedItemLayout
    public void setPositionInGroup(int i) {
        if (i > 0) {
            setPadding(i);
            setCardRadiusStyle(i);
            o();
        }
    }

    public void setRadius(float f) {
        this.w = f;
        o();
        invalidate();
    }

    public COUIInputListSelectedItemLayout(Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public COUIInputListSelectedItemLayout(Context context, @Nullable AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 0);
    }

    public COUIInputListSelectedItemLayout(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.r = getResources().getDimensionPixelOffset(R$dimen.coui_list_input_head_or_tail_padding);
        this.s = new RectF();
        this.t = new Paint();
        this.u = new a();
        this.v = new b();
        this.z = true;
        this.A = true;
        this.F = false;
        ph2.c(this, false);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.COUIInputListSelectedItemLayout, i, i2);
        boolean z = typedArrayObtainStyledAttributes.getBoolean(R$styleable.COUIInputListSelectedItemLayout_listIsTiny, false);
        this.w = typedArrayObtainStyledAttributes.getDimensionPixelOffset(R$styleable.COUIInputListSelectedItemLayout_couiInputRadius, lh2.c(context, R$attr.couiRoundCornerM));
        m(getContext(), z);
        this.x = typedArrayObtainStyledAttributes.getDimensionPixelOffset(R$styleable.COUIInputListSelectedItemLayout_couiInputListHorizontalMargin, this.x);
        typedArrayObtainStyledAttributes.recycle();
        if (getId() != -1) {
            try {
                if ("single_card".equals(getContext().getResources().getResourceEntryName(getId()))) {
                    a(true);
                }
            } catch (Resources.NotFoundException e2) {
                bj2.c("COUICardListSelectedItemLayout", e2.getMessage());
            }
        }
    }
}
