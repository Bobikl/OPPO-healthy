package ru.noties.jlatexmath;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import androidx.annotation.ColorInt;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.Px;
import com.oplus.aiunit.vision.lk3;
import com.oplus.aiunit.vision.o20;
import com.oplus.aiunit.vision.q9a;
import com.oplus.aiunit.vision.tpj;
import com.oplus.aiunit.vision.tpj.b;
import com.oplus.aiunit.vision.vpj;

/* JADX INFO: loaded from: classes11.dex */
public class a extends Drawable {
    public static final int ALIGN_CENTER = 1;
    public static final int ALIGN_LEFT = 0;
    public static final int ALIGN_RIGHT = 2;
    public final vpj a;
    public final int b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Drawable f20839c;
    public final o20 d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f20840e;
    public final int f;

    /* JADX INFO: renamed from: ru.noties.jlatexmath.a$a, reason: collision with other inner class name */
    public static class C1058a {
        public final String a;
        public float b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f20841c = -16777216;
        public int d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public Drawable f20842e;
        public q9a f;

        public C1058a(@NonNull String str) {
            this.a = str;
        }

        @NonNull
        public C1058a g(int i) {
            this.d = i;
            return this;
        }

        @NonNull
        public C1058a h(@Nullable Drawable drawable) {
            this.f20842e = drawable;
            return this;
        }

        @NonNull
        public a i() {
            return new a(this);
        }

        @NonNull
        public C1058a j(@ColorInt int i) {
            this.f20841c = i;
            return this;
        }

        @NonNull
        @Deprecated
        public C1058a k(boolean z) {
            return this;
        }

        @NonNull
        public C1058a l(@Px float f) {
            this.b = f;
            return this;
        }
    }

    public a(@NonNull C1058a c1058a) {
        vpj vpjVarA = new tpj(c1058a.a).new b().b(new lk3(c1058a.f20841c)).c(c1058a.b).d(0).a();
        this.a = vpjVarA;
        if (c1058a.f != null) {
            vpjVarA.e(c1058a.f);
        }
        this.b = c1058a.d;
        this.f20839c = c1058a.f20842e;
        this.d = new o20();
        int iB = vpjVarA.b();
        this.f20840e = iB;
        int iA = vpjVarA.a();
        this.f = iA;
        setBounds(0, 0, iB, iA);
    }

    @NonNull
    public static C1058a a(@NonNull String str) {
        return new C1058a(str);
    }

    @NonNull
    public vpj b() {
        return this.a;
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(@NonNull Canvas canvas) {
        int i;
        Rect bounds = getBounds();
        int iSave = canvas.save();
        try {
            Drawable drawable = this.f20839c;
            if (drawable != null) {
                drawable.draw(canvas);
            }
            int iWidth = bounds.width();
            int iHeight = bounds.height();
            int i2 = this.f20840e;
            float fMin = (i2 > iWidth || this.f > iHeight) ? Math.min(iWidth / i2, iHeight / this.f) : 1.0f;
            int i3 = (int) ((this.f20840e * fMin) + 0.5f);
            int i4 = (iHeight - ((int) ((this.f * fMin) + 0.5f))) / 2;
            int i5 = this.b;
            if (i5 == 1) {
                i = (iWidth - i3) / 2;
            } else {
                i = i5 == 2 ? iWidth - i3 : 0;
            }
            if (i4 != 0 || i != 0) {
                canvas.translate(i, i4);
            }
            if (Float.compare(fMin, 1.0f) != 0) {
                canvas.scale(fMin, fMin);
            }
            this.d.u(canvas);
            this.a.c(null, this.d, 0, 0);
        } finally {
            canvas.restoreToCount(iSave);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        return this.f;
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        return this.f20840e;
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -1;
    }

    @Override // android.graphics.drawable.Drawable
    public void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        Drawable drawable = this.f20839c;
        if (drawable != null) {
            drawable.setBounds(rect);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i) {
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(@Nullable ColorFilter colorFilter) {
    }
}
