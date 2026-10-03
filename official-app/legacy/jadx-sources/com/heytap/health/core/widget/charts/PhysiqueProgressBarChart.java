package com.heytap.health.core.widget.charts;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.Typeface;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import androidx.annotation.Nullable;
import com.heytap.health.base.R$color;
import com.heytap.health.lib_chart.R$styleable;
import com.oplus.aiunit.vision.ejg;
import com.oplus.aiunit.vision.hz;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes16.dex */
public class PhysiqueProgressBarChart extends View {
    public static final int DEFAULT_BACKGROUND_ALPHA = 50;
    public static final int DEFAULT_END_PROGRESS = 100;
    public static final int DEFAULT_PROGRESS_BAR_CORNER_RADIUS = 3;
    public static final int DEFAULT_PROGRESS_BAR_HEIGHT = 20;
    public static final int DEFAULT_PROGRESS_TEXT_SIZE = 30;
    public static final int DEFAULT_SPACE_WIDTH = 20;
    public static final int DEFAULT_START_PROGRESS = 0;
    public static final int DEFAULT_SUBSCRIPT_HEIGHT = 8;
    public static final int DEFAULT_SUBSCRIPT_WIDTH = 12;
    public String[] A;
    public boolean B;
    public int C;
    public List<b> D;
    public List<b> E;
    public int i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f3770j;
    public int k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public float f3771l;
    public String m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f3772n;
    public int o;
    public int p;
    public int q;
    public int r;
    public float s;
    public int t;
    public int u;
    public int v;
    public int w;
    public int x;
    public boolean y;
    public int z;

    public static final class a {
        public List<b> a;
        public String[] b;

        public a(List<b> list, String[] strArr) {
            this.a = list;
            this.b = strArr;
        }
    }

    public static class b {
        public int a;
        public int b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public String f3773c;

        public b(int i, int i2, String str) {
            this.a = i;
            this.b = i2;
            this.f3773c = str;
        }
    }

    public PhysiqueProgressBarChart(Context context) {
        super(context);
        this.i = 20;
        this.f3770j = -1;
        this.k = 100;
        this.f3771l = 0.0f;
        this.m = null;
        this.p = 20;
        this.q = 10;
        this.r = 20;
        this.s = 30.0f;
        this.A = new String[]{"1", "2", "3", "5"};
        this.B = false;
        this.D = new ArrayList();
        g(context, null);
    }

    private int getProgressIndex() {
        int i = 0;
        while (true) {
            String[] strArr = this.A;
            if (i >= strArr.length) {
                return -1;
            }
            float f = Float.parseFloat(strArr[i]);
            if (i == 0 && this.f3771l < f) {
                return 0;
            }
            String[] strArr2 = this.A;
            if (i == strArr2.length - 1 && this.f3771l >= f) {
                return strArr2.length;
            }
            if (i < strArr2.length - 1) {
                float f2 = this.f3771l;
                if (f2 >= f) {
                    int i2 = i + 1;
                    if (f2 < Float.parseFloat(strArr2[i2])) {
                        return i2;
                    }
                } else {
                    continue;
                }
            }
            i++;
        }
    }

    private int getProgressSegmentPos() {
        float size = (this.f3771l / this.k) * (this.x - (this.i * (this.D.size() - 1)));
        int i = this.z;
        int i2 = (int) (size / i);
        int i3 = (int) (size % i);
        if (i2 == 0) {
            return 0;
        }
        return i3 == 0 ? i2 - 1 : i2;
    }

    public final void a(Canvas canvas) {
        List<b> list = this.D;
        if (list == null || list.size() == 0) {
            return;
        }
        c(canvas);
        if (this.f3771l > 0.0f) {
            b(canvas);
        }
    }

    public final void b(Canvas canvas) {
        e(((int) ((this.f3771l / this.k) * (this.x - (this.i * (this.D.size() - 1))))) % this.z, canvas);
    }

    public final void c(Canvas canvas) {
        this.x = (getWidth() - (this.v * 2)) - this.w;
        int iA = ejg.a(getContext(), 20.0f);
        this.z = (this.x - ((this.D.size() - 1) * this.i)) / this.D.size();
        int i = this.v + (this.C / 2);
        Paint paint = new Paint();
        int progressIndex = getProgressIndex();
        int i2 = 0;
        while (i2 < this.D.size()) {
            int i3 = i2 + 1;
            float f = (this.z * i3) + (this.i * i2);
            if (i2 != progressIndex || hz.b(this.E)) {
                b bVar = this.D.get(i2);
                paint.setShader(new LinearGradient(i, iA, f, this.p + iA, new int[]{bVar.a, bVar.b}, (float[]) null, Shader.TileMode.CLAMP));
            } else {
                b bVar2 = this.E.get(i2);
                paint.setShader(new LinearGradient(i, iA, f, this.p + iA, new int[]{bVar2.a, bVar2.b}, (float[]) null, Shader.TileMode.CLAMP));
            }
            d(i2, paint, canvas);
            paint.reset();
            i2 = i3;
            progressIndex = progressIndex;
        }
    }

    public final void d(int i, Paint paint, Canvas canvas) {
        String[] strArr;
        int iA = ejg.a(getContext(), 20.0f);
        int size = (this.x - ((this.D.size() - 1) * this.i)) / this.D.size();
        int i2 = this.i;
        int i3 = this.v;
        int i4 = ((size + i2) * i) + i3;
        int i5 = ((i + 1) * size) + (i2 * i) + i3;
        if (i == 0) {
            Path path = new Path();
            float f = i4;
            float f2 = iA;
            int i6 = this.p;
            path.addArc(new RectF(f, (i6 * 0.7f) + f2, (i6 * 0.15f * 2.0f) + f, i6 + iA), 90.0f, 90.0f);
            path.lineTo(this.v, (this.p * 0.15f) + f2);
            int i7 = this.p;
            path.addArc(new RectF(f, f2, (i7 * 0.15f * 2.0f) + f, (i7 * 0.15f * 2.0f) + f2), 180.0f, 90.0f);
            path.lineTo(this.v + size, f2);
            path.lineTo(this.v + size, this.p + iA);
            int i8 = this.p;
            path.lineTo((i8 * 0.15f) + this.v, i8 + iA);
            canvas.drawPath(path, paint);
        } else if (i == this.D.size() - 1) {
            Path path2 = new Path();
            int i9 = this.x;
            int i10 = this.p;
            int i11 = this.v;
            float f3 = iA;
            path2.addArc(new RectF((i9 - ((i10 * 0.15f) * 2.0f)) + i11, f3, i9 + i11, (i10 * 0.15f * 2.0f) + f3), 270.0f, 90.0f);
            path2.lineTo(this.x + this.v, (this.p * 0.85f) + f3);
            int i12 = this.x;
            int i13 = this.p;
            int i14 = this.v;
            path2.addArc(new RectF((i12 - ((i13 * 0.15f) * 2.0f)) + i14, (i13 * 0.7f) + f3, i12 + i14, i13 + iA), 0.0f, 90.0f);
            float f4 = i4;
            path2.lineTo(f4, this.p + iA);
            path2.lineTo(f4, f3);
            path2.lineTo((this.x - (this.p * 0.15f)) + this.v, f3);
            canvas.drawPath(path2, paint);
        } else {
            canvas.drawRect(i4, iA, i5, this.p + iA, paint);
        }
        paint.setShader(null);
        paint.setTextAlign(Paint.Align.CENTER);
        paint.setTextSize(ejg.n(getContext(), 12.0f));
        String str = this.D.get(i).f3773c;
        Rect rect = new Rect();
        paint.getTextBounds(str, 0, str.length(), rect);
        float fHeight = this.p + iA + rect.height() + ejg.a(getContext(), 6.0f);
        paint.setTypeface(Typeface.defaultFromStyle(0));
        Context context = getContext();
        int i15 = R$color.lib_base_color_text_black_4D;
        paint.setColor(context.getColor(i15));
        canvas.drawText(str, i4 + (size / 2.0f), fHeight, paint);
        if (!this.B || (strArr = this.A) == null || i >= strArr.length) {
            return;
        }
        String str2 = strArr[i];
        paint.setTextAlign(Paint.Align.CENTER);
        paint.setTypeface(Typeface.defaultFromStyle(0));
        paint.getTextBounds(str2, 0, str2.length(), rect);
        float fHeight2 = iA + this.p + rect.height() + ejg.a(getContext(), 8.5f);
        paint.setColor(getContext().getColor(i15));
        canvas.drawText(str2, i4 + size, fHeight2, paint);
    }

    public final void e(float f, Canvas canvas) {
        int iA = ejg.a(getContext(), 7.0f);
        Paint paint = new Paint();
        paint.setStyle(Paint.Style.FILL);
        int progressIndex = getProgressIndex();
        paint.setAntiAlias(true);
        paint.setColor(f(progressIndex));
        float f2 = ((progressIndex + 0.5f) * this.z) + (progressIndex * this.i) + this.v;
        Path path = new Path();
        float f3 = iA;
        path.moveTo(f2 - (this.o >> 1), f3);
        path.lineTo(f2, this.f3772n + iA);
        path.lineTo((this.o >> 1) + f2, f3);
        path.lineTo(f2 - (this.o >> 1), f3);
        canvas.drawPath(path, paint);
        if (TextUtils.isEmpty(this.m)) {
            return;
        }
        Rect rect = new Rect();
        paint.setTextSize(ejg.n(getContext(), 14.0f));
        paint.setTypeface(Typeface.defaultFromStyle(1));
        paint.setColor(getContext().getColor(R.color.black));
        String str = this.m;
        paint.getTextBounds(str, 0, str.length(), rect);
        canvas.drawText(this.m, (f2 - (rect.width() / 2.0f)) - ejg.a(getContext(), 1.0f), rect.height(), paint);
    }

    public final int f(int i) {
        if (i >= 0 && i < this.D.size() && hz.b(this.E)) {
            return this.D.get(i).a;
        }
        if (i < 0 || i >= this.E.size()) {
            return -1;
        }
        return this.E.get(i).a;
    }

    public final void g(Context context, AttributeSet attributeSet) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.lib_core_healthProgressChart);
        this.y = typedArrayObtainStyledAttributes.getBoolean(R$styleable.lib_core_healthProgressChart_lib_core_subscriptVisibility, true);
        this.i = (int) typedArrayObtainStyledAttributes.getDimension(R$styleable.lib_core_healthProgressChart_lib_core_spaceWidth, 20.0f);
        this.f3770j = typedArrayObtainStyledAttributes.getColor(R$styleable.lib_core_healthProgressChart_lib_core_spaceColor, -1);
        this.k = typedArrayObtainStyledAttributes.getInt(R$styleable.lib_core_healthProgressChart_lib_core_maxProgress, 100);
        this.f3771l = typedArrayObtainStyledAttributes.getInt(R$styleable.lib_core_healthProgressChart_lib_core_progress, 0);
        this.p = (int) typedArrayObtainStyledAttributes.getDimension(R$styleable.lib_core_healthProgressChart_lib_core_progrssBarHeight, 20.0f);
        this.q = (int) typedArrayObtainStyledAttributes.getDimension(R$styleable.lib_core_healthProgressChart_lib_core_subscriptTopPadding, 10.0f);
        this.v = (int) typedArrayObtainStyledAttributes.getDimension(R$styleable.lib_core_healthProgressChart_lib_core_progrssBarPaddingLeft, 0.0f);
        this.w = (int) typedArrayObtainStyledAttributes.getDimension(R$styleable.lib_core_healthProgressChart_lib_core_progrssBarPaddingRight, 0.0f);
        this.s = typedArrayObtainStyledAttributes.getDimension(R$styleable.lib_core_healthProgressChart_lib_core_progressTextSize, 30.0f);
        this.t = typedArrayObtainStyledAttributes.getColor(R$styleable.lib_core_healthProgressChart_lib_core_startProgressTextColor, Color.parseColor("#4D000000"));
        this.u = typedArrayObtainStyledAttributes.getColor(R$styleable.lib_core_healthProgressChart_lib_core_endProgressTextColor, Color.parseColor("#4D000000"));
        typedArrayObtainStyledAttributes.recycle();
        this.p = ejg.a(getContext(), 20.0f);
        this.f3772n = ejg.a(getContext(), 8.0f);
        this.o = ejg.a(getContext(), 12.0f);
        int i = this.f3772n * 2;
        this.C = i;
        this.v += i / 2;
        this.r = ejg.a(getContext(), 10.0f);
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        a(canvas);
    }

    public void setData(a aVar) {
        if (aVar != null) {
            this.D = aVar.a;
            String[] strArr = aVar.b;
            if (strArr != null) {
                this.A = strArr;
            }
            requestLayout();
        }
    }

    public void setMaxProgress(int i) {
        this.k = i;
        requestLayout();
    }

    public void setProgress(float f) {
        this.f3771l = f;
        requestLayout();
    }

    public void setScore(float f) {
        this.m = String.valueOf(f);
    }

    public void setSelectedProgressSegmentList(List<b> list) {
        this.E = list;
    }

    public void setShowProgressText(boolean z) {
        this.B = z;
    }

    public PhysiqueProgressBarChart(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.i = 20;
        this.f3770j = -1;
        this.k = 100;
        this.f3771l = 0.0f;
        this.m = null;
        this.p = 20;
        this.q = 10;
        this.r = 20;
        this.s = 30.0f;
        this.A = new String[]{"1", "2", "3", "5"};
        this.B = false;
        this.D = new ArrayList();
        g(context, attributeSet);
    }

    public PhysiqueProgressBarChart(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.i = 20;
        this.f3770j = -1;
        this.k = 100;
        this.f3771l = 0.0f;
        this.m = null;
        this.p = 20;
        this.q = 10;
        this.r = 20;
        this.s = 30.0f;
        this.A = new String[]{"1", "2", "3", "5"};
        this.B = false;
        this.D = new ArrayList();
        g(context, attributeSet);
    }
}
