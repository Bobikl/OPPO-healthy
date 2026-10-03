package com.heytap.health.wallet.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.os.Handler;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.widget.TextView;
import androidx.annotation.Nullable;
import androidx.core.content.ContextCompat;
import androidx.exifinterface.media.ExifInterface;
import com.google.security.cryptauth.lib.securegcm.SecureGcmConstants;
import com.heytap.databaseengine.model.UserInfo;
import com.oplus.aiunit.vision.c8l;
import com.oplus.aiunit.vision.ejg;
import com.oplus.aiunit.vision.qz0;
import com.oplus.aiunit.vision.sr0;
import com.oplus.aiunit.vision.t6b;
import com.oplus.aiunit.vision.y04;
import com.oplus.smartenginehelper.entity.TextEntity;
import com.oppo.lib.common.R$color;
import com.oppo.lib.common.R$styleable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: loaded from: classes18.dex */
public class SideIndexBar extends View {
    public static final String[] y = {"☆", "A", c8l.KEY_B, "C", "D", ExifInterface.LONGITUDE_EAST, UserInfo.SEX_FEMALE, "G", "H", "I", "J", "K", "L", "M", "N", "O", SecureGcmConstants.MESSAGE_KEY, "Q", "R", "S", ExifInterface.GPS_DIRECTION_TRUE, "U", ExifInterface.GPS_MEASUREMENT_INTERRUPTED, ExifInterface.LONGITUDE_WEST, "X", "Y", "Z", "#"};
    public static final String[] z = {"A", c8l.KEY_B, "C", "D", ExifInterface.LONGITUDE_EAST, UserInfo.SEX_FEMALE, "G", "H", "I", "J", "K", "L", "M", "N", "O", SecureGcmConstants.MESSAGE_KEY, "Q", "R", "S", ExifInterface.GPS_DIRECTION_TRUE, "U", ExifInterface.GPS_MEASUREMENT_INTERRUPTED, ExifInterface.LONGITUDE_WEST, "X", "Y", "Z", "#"};
    public List<String> i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public float f6425j;
    public int k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f6426l;
    public int m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f6427n;
    public Paint o;
    public Paint p;
    public int q;
    public int r;
    public float s;
    public TextView t;
    public c u;
    public b v;
    public int w;
    public Handler x;

    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (SideIndexBar.this.t != null) {
                SideIndexBar.this.t.setVisibility(8);
            }
        }
    }

    public interface b {
        void d2();
    }

    public interface c {
        void K4(String str, int i, float f);
    }

    public SideIndexBar(Context context) {
        this(context, null);
    }

    public final void b(Context context, AttributeSet attributeSet) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.SlideIndexBarStyle);
        boolean z2 = typedArrayObtainStyledAttributes.getBoolean(R$styleable.SlideIndexBarStyle_hideStar, false);
        ArrayList arrayList = new ArrayList();
        this.i = arrayList;
        if (z2) {
            arrayList.addAll(Arrays.asList(z));
        } else {
            arrayList.addAll(Arrays.asList(y));
        }
        typedArrayObtainStyledAttributes.recycle();
        this.k = ejg.a(qz0.mContext, 10.0f);
        this.f6426l = ContextCompat.getColor(getContext(), R$color.color_8D000000);
        this.m = ContextCompat.getColor(getContext(), com.heytap.health.base.R$color.lib_base_colorPrimary);
        Paint paint = new Paint(1);
        this.o = paint;
        paint.setTextSize(this.k);
        this.o.setColor(this.f6426l);
        Paint paint2 = new Paint(1);
        this.p = paint2;
        paint2.setTextSize(this.k);
        this.p.setColor(this.m);
    }

    public SideIndexBar c(c cVar) {
        this.u = cVar;
        return this;
    }

    public SideIndexBar d(TextView textView) {
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
            float f = this.f6425j;
            float f2 = fontMetrics.bottom;
            canvas.drawText(str, fMeasureText, (((f / 2.0f) + ((f2 - fontMetrics.top) / 2.0f)) - f2) + (f * i) + this.s, i == this.f6427n ? this.p : this.o);
            i++;
        }
    }

    @Override // android.view.View
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        this.q = getWidth();
        if (Math.abs(i2 - i4) == this.w) {
            this.r = i2;
        } else {
            this.r = Math.max(getHeight(), i4);
        }
        float size = this.r / this.i.size();
        this.f6425j = size;
        this.s = (this.r - (size * this.i.size())) / 2.0f;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0017  */
    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        performClick();
        int action = motionEvent.getAction();
        if (action != 0) {
            if (action == 1) {
                t6b.i("test_test", TextEntity.ELLIPSIZE_END);
                this.f6427n = -1;
                this.x.removeCallbacksAndMessages(null);
                this.x.postDelayed(new a(), 200L);
                invalidate();
            } else if (action != 2) {
                if (action == 3) {
                    t6b.i("test_test", TextEntity.ELLIPSIZE_END);
                    this.f6427n = -1;
                    this.x.removeCallbacksAndMessages(null);
                    this.x.postDelayed(new a(), 200L);
                    invalidate();
                }
            }
            return true;
        }
        t6b.i("test_test", y04.TIME_STYLE_DOWN_DIR_NAME);
        this.v.d2();
        float y2 = motionEvent.getY();
        int size = this.i.size();
        int i = (int) (y2 / this.f6425j);
        t6b.i("test_test", "move,touchedIndex=" + i + ",indexSize=" + size + ",mCurrentIndex=" + this.f6427n);
        if (i < 0) {
            i = 0;
        } else if (i >= size) {
            i = size - 1;
        }
        if (this.u != null && i >= 0 && i < size && i != this.f6427n) {
            this.f6427n = i;
            TextView textView = this.t;
            if (textView != null) {
                textView.setVisibility(0);
                this.t.setText(this.i.get(i));
            }
            c cVar = this.u;
            String str = this.i.get(i);
            float f = this.f6425j;
            cVar.K4(str, i, ((i * f) - this.s) - (f / 2.0f));
            invalidate();
        }
        return true;
    }

    @Override // android.view.View
    public boolean performClick() {
        return super.performClick();
    }

    public void setNavigationBarHeight(int i) {
        this.w = i;
    }

    public void setOnDownListener(b bVar) {
        this.v = bVar;
    }

    public SideIndexBar(Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public SideIndexBar(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f6427n = -1;
        this.x = sr0.a();
        b(context, attributeSet);
    }
}
