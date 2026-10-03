package com.coui.appcompat.cardlist;

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
import com.oplus.aiunit.vision.bn2;
import com.oplus.aiunit.vision.byf;
import com.oplus.aiunit.vision.hm2;
import com.oplus.aiunit.vision.lh2;
import com.oplus.aiunit.vision.ph2;
import com.oplus.aiunit.vision.xl2;
import com.oplus.aiunit.vision.zw3;
import com.oplus.graphics.OplusPathAdapter;
import com.support.appcompat.R$attr;
import com.support.preference.R$dimen;
import com.support.preference.R$styleable;

/* JADX INFO: loaded from: classes13.dex */
public class COUICardListSelectedItemLayout extends ListSelectedItemLayout {
    public static final int T = 32;
    public boolean A;
    public int B;
    public int C;
    public int D;
    public boolean E;
    public boolean F;
    public boolean G;
    public int H;
    public OplusPathAdapter I;
    public float[] J;
    public int K;
    public View L;
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
            if (!COUICardListSelectedItemLayout.this.G) {
                canvas.drawColor(COUICardListSelectedItemLayout.this.H);
            } else {
                COUICardListSelectedItemLayout.this.t.setColor(COUICardListSelectedItemLayout.this.H);
                canvas.drawPath(COUICardListSelectedItemLayout.this.y, COUICardListSelectedItemLayout.this.t);
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
                outline.setPath(COUICardListSelectedItemLayout.this.y);
                COUICardListSelectedItemLayout.this.F = true;
            }
        }
    }

    public COUICardListSelectedItemLayout(Context context) {
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
        View view = this.L;
        if (view != null) {
            view.setPaddingRelative(view.getPaddingStart(), getPaddingTop() + i3, this.L.getPaddingEnd(), getPaddingBottom() + i2);
        } else {
            setPaddingRelative(getPaddingStart(), this.C + i3, getPaddingEnd(), this.D + i2);
        }
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

    public float getRadius() {
        return this.w;
    }

    public final void m(Context context, boolean z) {
        if (z) {
            this.x = context.getResources().getDimensionPixelOffset(R$dimen.coui_preference_card_margin_horizontal_tiny);
        } else {
            this.x = context.getResources().getDimensionPixelOffset(R$dimen.coui_preference_card_margin_horizontal);
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
        if (byf.a() != 1) {
            Path path = this.y;
            RectF rectF = this.s;
            float f = this.w;
            boolean z = this.z;
            boolean z2 = this.A;
            xl2.b(path, rectF, f, z, z, z2, z2);
            return;
        }
        if (this.I == null) {
            this.I = new OplusPathAdapter(this.y, 1);
        }
        if (bn2.c() > 37) {
            this.w = this.K;
        }
        float[] fArr = this.J;
        boolean z3 = this.z;
        fArr[0] = z3 ? this.w : 0.0f;
        fArr[1] = z3 ? this.w : 0.0f;
        fArr[2] = z3 ? this.w : 0.0f;
        fArr[3] = z3 ? this.w : 0.0f;
        boolean z4 = this.A;
        fArr[4] = z4 ? this.w : 0.0f;
        fArr[5] = z4 ? this.w : 0.0f;
        fArr[6] = z4 ? this.w : 0.0f;
        fArr[7] = z4 ? this.w : 0.0f;
        if (bn2.c() > 37) {
            this.I.addSmoothRoundRect(this.s, this.J, Path.Direction.CCW, 3.0f);
        } else {
            this.I.addSmoothRoundRect(this.s, this.J, Path.Direction.CCW);
        }
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

    public void setMainLayoutToSetExtraPadding(View view) {
        this.L = view;
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

    public COUICardListSelectedItemLayout(Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public COUICardListSelectedItemLayout(Context context, @Nullable AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 0);
    }

    public COUICardListSelectedItemLayout(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.r = getResources().getDimensionPixelOffset(R$dimen.coui_list_card_head_or_tail_padding);
        this.s = new RectF();
        this.t = new Paint();
        this.u = new a();
        this.v = new b();
        this.z = true;
        this.A = true;
        this.F = false;
        this.J = new float[8];
        ph2.c(this, false);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.COUICardListSelectedItemLayout, i, i2);
        boolean z = typedArrayObtainStyledAttributes.getBoolean(R$styleable.COUICardListSelectedItemLayout_listIsTiny, false);
        this.w = typedArrayObtainStyledAttributes.getDimensionPixelOffset(R$styleable.COUICardListSelectedItemLayout_couiCardRadius, lh2.c(context, R$attr.couiRoundCornerM));
        m(getContext(), z);
        this.x = typedArrayObtainStyledAttributes.getDimensionPixelOffset(R$styleable.COUICardListSelectedItemLayout_couiCardListHorizontalMargin, this.x);
        this.K = getResources().getDimensionPixelSize(R$dimen.coui_card_list_os_16_1_radius_17_dp);
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
