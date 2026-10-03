package com.heytap.health.ui.widget.listselector;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.widget.TextView;
import androidx.annotation.Nullable;
import androidx.exifinterface.media.ExifInterface;
import com.google.security.cryptauth.lib.securegcm.SecureGcmConstants;
import com.heytap.databaseengine.model.UserInfo;
import com.heytap.health.ui.R$dimen;
import com.heytap.health.ui.R$styleable;
import com.heytap.store.base.widget.banner.config.BannerConfig;
import com.oplus.aiunit.vision.c8l;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: loaded from: classes18.dex */
public class SideIndexBar extends View {
    public static final String[] w = {"A", c8l.KEY_B, "C", "D", ExifInterface.LONGITUDE_EAST, UserInfo.SEX_FEMALE, "G", "H", "I", "J", "K", "L", "M", "N", "O", SecureGcmConstants.MESSAGE_KEY, "Q", "R", "S", ExifInterface.GPS_DIRECTION_TRUE, "U", ExifInterface.GPS_MEASUREMENT_INTERRUPTED, ExifInterface.LONGITUDE_WEST, "X", "Y", "Z"};
    public List<String> i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public float f6094j;
    public int k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f6095l;
    public int m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f6096n;
    public Paint o;
    public Paint p;
    public int q;
    public int r;
    public float s;
    public TextView t;
    public a u;
    public int v;

    public interface a {
        void z2(String str, int i);
    }

    public SideIndexBar(Context context) {
        this(context, null);
    }

    public final void a(Context context, AttributeSet attributeSet, int i) {
        ArrayList arrayList = new ArrayList();
        this.i = arrayList;
        arrayList.addAll(Arrays.asList(w));
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.SideIndexBar);
        this.k = typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.SideIndexBar_IndexBarTextSize, getResources().getDimensionPixelSize(R$dimen.tv_12sp));
        this.f6095l = typedArrayObtainStyledAttributes.getColor(R$styleable.SideIndexBar_IndexBarNormalTextColor, BannerConfig.INDICATOR_SELECTED_COLOR);
        this.m = typedArrayObtainStyledAttributes.getColor(R$styleable.SideIndexBar_IndexBarSelectedTextColor, -16711936);
        Paint paint = new Paint(1);
        this.o = paint;
        paint.setTextSize(this.k);
        this.o.setColor(this.f6095l);
        Paint paint2 = new Paint(1);
        this.p = paint2;
        paint2.setTextSize(this.k);
        this.p.setColor(this.m);
        typedArrayObtainStyledAttributes.recycle();
    }

    public SideIndexBar b(a aVar) {
        this.u = aVar;
        return this;
    }

    public SideIndexBar c(TextView textView) {
        this.t = textView;
        return this;
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        int i = 0;
        while (i < this.i.size()) {
            String str = this.i.get(i);
            Paint.FontMetrics fontMetrics = this.o.getFontMetrics();
            float fMeasureText = (this.q - this.o.measureText(str)) / 2.0f;
            float f = this.f6094j;
            float f2 = fontMetrics.bottom;
            canvas.drawText(str, fMeasureText, (((f / 2.0f) + ((f2 - fontMetrics.top) / 2.0f)) - f2) + (f * i) + this.s, i == this.f6096n ? this.p : this.o);
            i++;
        }
    }

    @Override // android.view.View
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        this.q = getWidth();
        if (Math.abs(i2 - i4) == this.v) {
            this.r = i2;
        } else {
            this.r = Math.max(getHeight(), i4);
        }
        float size = this.r / this.i.size();
        this.f6094j = size;
        this.s = (this.r - (size * this.i.size())) / 2.0f;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0014  */
    /* JADX WARN: Code duplicated, block: B:12:0x001b  */
    /* JADX WARN: Code duplicated, block: B:14:0x0024  */
    /* JADX WARN: Code duplicated, block: B:16:0x0036  */
    /* JADX WARN: Code duplicated, block: B:17:0x0038 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:18:0x003a  */
    /* JADX WARN: Code duplicated, block: B:27:0x004e  */
    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        float y;
        int size;
        int i;
        TextView textView;
        TextView textView2;
        performClick();
        int action = motionEvent.getAction();
        if (action == 0) {
            y = motionEvent.getY();
            size = this.i.size();
            i = (int) (y / this.f6094j);
            if (i < 0) {
                i = 0;
            } else if (i >= size) {
                i = size - 1;
            }
            if (this.u != null && i >= 0 && i < size && i != this.f6096n) {
                this.f6096n = i;
                textView = this.t;
                if (textView != null) {
                    textView.setVisibility(0);
                    this.t.setText(this.i.get(i));
                    this.t.setY(y + ((this.t.getBottom() - this.t.getTop()) / 2.0f));
                }
                this.u.z2(this.i.get(i), i);
                invalidate();
            }
        } else if (action == 1) {
            this.f6096n = -1;
            textView2 = this.t;
            if (textView2 != null) {
                textView2.setVisibility(8);
            }
            invalidate();
        } else if (action == 2) {
            y = motionEvent.getY();
            size = this.i.size();
            i = (int) (y / this.f6094j);
            if (i < 0) {
                i = 0;
            } else if (i >= size) {
                i = size - 1;
            }
            if (this.u != null) {
                this.f6096n = i;
                textView = this.t;
                if (textView != null) {
                    textView.setVisibility(0);
                    this.t.setText(this.i.get(i));
                    this.t.setY(y + ((this.t.getBottom() - this.t.getTop()) / 2.0f));
                }
                this.u.z2(this.i.get(i), i);
                invalidate();
            }
        } else if (action == 3) {
            this.f6096n = -1;
            textView2 = this.t;
            if (textView2 != null) {
                textView2.setVisibility(8);
            }
            invalidate();
        }
        return true;
    }

    @Override // android.view.View
    public boolean performClick() {
        return super.performClick();
    }

    public void setNavigationBarHeight(int i) {
        this.v = i;
    }

    public SideIndexBar(Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public SideIndexBar(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f6096n = -1;
        a(context, attributeSet, i);
    }
}
