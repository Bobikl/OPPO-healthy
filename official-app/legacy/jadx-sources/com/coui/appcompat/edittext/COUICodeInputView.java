package com.coui.appcompat.edittext;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.text.Editable;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import com.oplus.aiunit.vision.hh2;
import com.oplus.aiunit.vision.lh2;
import com.oplus.aiunit.vision.ph2;
import com.oplus.aiunit.vision.xl2;
import com.support.appcompat.R$attr;
import com.support.input.R$color;
import com.support.input.R$dimen;
import com.support.input.R$id;
import com.support.input.R$layout;
import com.support.input.R$styleable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes13.dex */
public class COUICodeInputView extends RelativeLayout {
    public final int i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final int f1708j;
    public int k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f1709l;
    public List<String> m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public EditText f1710n;
    public LinearLayout o;
    public List<CodeItemView> p;
    public e q;
    public int r;
    public int s;
    public int t;
    public int u;
    public int v;
    public int w;

    public static class CodeItemView extends View {
        public int i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public int f1711j;
        public int k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public int f1712l;
        public int m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public TextPaint f1713n;
        public Paint o;
        public Paint p;
        public Paint q;
        public Path r;
        public String s;
        public boolean t;
        public boolean u;
        public hh2 v;

        public CodeItemView(Context context) {
            super(context);
            this.i = getResources().getDimensionPixelSize(R$dimen.coui_code_input_cell_text_size);
            this.f1711j = lh2.c(getContext(), R$attr.couiRoundCornerS);
            this.k = getResources().getDimensionPixelSize(R$dimen.coui_code_input_cell_stroke_width);
            this.f1712l = getResources().getDimensionPixelSize(R$dimen.coui_code_input_cell_security_circle_radius);
            this.m = lh2.h(getContext(), R$color.coui_code_input_security_circle_color);
            this.f1713n = new TextPaint();
            this.o = new Paint();
            this.p = new Paint();
            this.q = new Paint();
            this.r = new Path();
            this.s = "";
            this.f1713n.setTextSize(this.i);
            this.f1713n.setAntiAlias(true);
            this.f1713n.setColor(lh2.a(getContext(), R$attr.couiColorPrimaryNeutral));
            this.o.setColor(lh2.a(getContext(), R$attr.couiColorCardBackground));
            this.p.setColor(lh2.a(getContext(), R$attr.couiColorPrimary));
            this.p.setStyle(Paint.Style.STROKE);
            this.p.setStrokeWidth(this.k);
            this.q.setColor(this.m);
            this.q.setAntiAlias(true);
            this.v = new hh2(this);
        }

        public final float a(int i, String str) {
            return (i / 2) - (this.f1713n.measureText(str) / 2.0f);
        }

        public final float b(int i) {
            Paint.FontMetricsInt fontMetricsInt = this.f1713n.getFontMetricsInt();
            return (i / 2) - ((fontMetricsInt.descent + fontMetricsInt.ascent) / 2);
        }

        @Override // android.view.View
        public void onDraw(Canvas canvas) {
            float fA;
            float fB;
            int width = getWidth();
            int height = getHeight();
            Path pathA = xl2.a(this.r, new RectF(0.0f, 0.0f, width, height), this.f1711j);
            this.r = pathA;
            canvas.drawPath(pathA, this.o);
            if (this.t || this.v.p()) {
                int i = this.k >> 1;
                float f = i;
                RectF rectF = new RectF(f, f, width - i, height - i);
                this.p.setAlpha((int) (this.v.l() * 255.0f));
                Path pathA2 = xl2.a(this.r, rectF, this.f1711j);
                this.r = pathA2;
                canvas.drawPath(pathA2, this.p);
            }
            if (!TextUtils.isEmpty(this.s) || this.v.q()) {
                if (this.u) {
                    canvas.drawCircle(width / 2, height / 2, this.f1712l, this.q);
                    return;
                }
                if (!this.v.q()) {
                    float fA2 = a(width, this.s);
                    float fB2 = b(height);
                    this.f1713n.setAlpha(255);
                    canvas.drawText(this.s, fA2, fB2, this.f1713n);
                    return;
                }
                float fM = this.v.m();
                String strK = this.s;
                this.f1713n.setAlpha((int) (fM * 255.0f));
                if (this.v.o()) {
                    fA = a(width, strK);
                    fB = b(height);
                    float fN = this.v.n();
                    canvas.scale(fN, fN, fA, fB);
                } else {
                    strK = this.v.k();
                    fA = a(width, strK);
                    fB = b(height);
                }
                canvas.drawText(strK, fA, fB, this.f1713n);
            }
        }

        public void setEnableSecurity(boolean z) {
            this.u = z;
        }

        public void setIsSelected(boolean z) {
            if (z != this.t) {
                this.v.t(z);
            }
            this.t = z;
        }

        public void setNumber(String str) {
            if (!this.u) {
                if (!TextUtils.isEmpty(this.s) && TextUtils.isEmpty(str)) {
                    this.v.u(false, this.s);
                } else if (TextUtils.isEmpty(this.s) && !TextUtils.isEmpty(str)) {
                    this.v.u(true, str);
                }
            }
            this.s = str;
        }
    }

    public class a implements TextWatcher {
        public a() {
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            if (editable == null || editable.length() <= 0) {
                return;
            }
            COUICodeInputView.this.f1710n.setText("");
            if (COUICodeInputView.this.m.size() < COUICodeInputView.this.k) {
                String strTrim = editable.toString().trim();
                if (strTrim.length() > 1) {
                    if (strTrim.length() > COUICodeInputView.this.k) {
                        strTrim = strTrim.substring(0, COUICodeInputView.this.k);
                    }
                    List listAsList = Arrays.asList(strTrim.split(""));
                    COUICodeInputView.this.m = new ArrayList(listAsList);
                } else {
                    COUICodeInputView.this.m.add(strTrim);
                }
            }
            COUICodeInputView.this.n();
            COUICodeInputView.this.i();
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }
    }

    public class b implements View.OnKeyListener {
        public b() {
        }

        @Override // android.view.View.OnKeyListener
        public boolean onKey(View view, int i, KeyEvent keyEvent) {
            COUICodeInputView cOUICodeInputView = COUICodeInputView.this;
            if (!cOUICodeInputView.m(cOUICodeInputView.m) || i != 67 || keyEvent.getAction() != 0 || COUICodeInputView.this.m.size() <= 0) {
                return false;
            }
            COUICodeInputView.this.m.remove(COUICodeInputView.this.m.size() - 1);
            COUICodeInputView.this.n();
            COUICodeInputView.this.i();
            return true;
        }
    }

    public class c implements View.OnFocusChangeListener {
        public c() {
        }

        @Override // android.view.View.OnFocusChangeListener
        public void onFocusChange(View view, boolean z) {
            CodeItemView codeItemView = (CodeItemView) COUICodeInputView.this.p.get(Math.min(COUICodeInputView.this.m.size(), COUICodeInputView.this.k - 1));
            codeItemView.setIsSelected(z);
            codeItemView.invalidate();
        }
    }

    public interface d {
    }

    public static class e implements Runnable {
        public View i;

        public e() {
        }

        public /* synthetic */ e(a aVar) {
            this();
        }

        public void a(View view) {
            this.i = view;
        }

        @Override // java.lang.Runnable
        public void run() {
            View view = this.i;
            if (view != null) {
                view.requestLayout();
                this.i = null;
            }
        }
    }

    public COUICodeInputView(Context context) {
        this(context, null);
    }

    private void setCodeItemWidth(int i) {
        double dMin = Math.min(getResources().getConfiguration().screenWidthDp, 360.0d) / 360.0d;
        int i2 = (int) (((double) this.v) * dMin);
        int i3 = (int) (((double) this.w) * dMin);
        this.r = j(i, i2);
        for (int i4 = 0; i4 < this.o.getChildCount(); i4++) {
            View childAt = this.o.getChildAt(i4);
            if (childAt != null && (childAt instanceof CodeItemView)) {
                LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) childAt.getLayoutParams();
                layoutParams.width = i2;
                layoutParams.height = i3;
                if (i4 == 0) {
                    layoutParams.setMarginStart(0);
                } else {
                    layoutParams.setMarginStart(this.r);
                }
                if (i4 == this.k - 1) {
                    layoutParams.setMarginEnd(0);
                } else {
                    layoutParams.setMarginEnd(this.r);
                }
                childAt.setLayoutParams(layoutParams);
            }
        }
        this.q.a(this.o);
        post(this.q);
    }

    public String getPhoneCode() {
        StringBuilder sb = new StringBuilder();
        Iterator<String> it = this.m.iterator();
        while (it.hasNext()) {
            sb.append(it.next());
        }
        return sb.toString();
    }

    public final void i() {
    }

    public final int j(int i, int i2) {
        int iMin = Math.min(Math.max(Math.round(((i - (i2 * this.p.size())) - (this.u * 2)) / ((this.p.size() * 2) - 2)), this.t), this.s);
        this.r = iMin;
        return iMin;
    }

    public final void k() {
        this.v = getResources().getDimensionPixelSize(R$dimen.coui_code_input_cell_width);
        this.r = getResources().getDimensionPixelSize(R$dimen.coui_code_input_cell_margin_horizontal);
        this.w = getResources().getDimensionPixelSize(R$dimen.coui_code_input_cell_height);
        this.s = getResources().getDimensionPixelSize(R$dimen.coui_code_input_cell_max_margin_horizontal);
        this.t = getResources().getDimensionPixelSize(R$dimen.coui_code_input_cell_min_margin_horizontal);
        this.u = getResources().getDimensionPixelSize(R$dimen.coui_code_input_layout_margin_start);
    }

    public final void l(View view) {
        this.o = (LinearLayout) view.findViewById(R$id.code_container_layout);
        for (int i = 0; i < this.k; i++) {
            CodeItemView codeItemView = new CodeItemView(getContext());
            codeItemView.setEnableSecurity(this.f1709l);
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(this.v, -1);
            layoutParams.setMarginStart(this.r);
            layoutParams.setMarginEnd(this.r);
            this.o.addView(codeItemView, layoutParams);
            this.p.add(codeItemView);
        }
        this.p.get(0).setIsSelected(true);
        EditText editText = (EditText) view.findViewById(R$id.code_container_edittext);
        this.f1710n = editText;
        editText.requestFocus();
        this.f1710n.addTextChangedListener(new a());
        this.f1710n.setOnKeyListener(new b());
        this.f1710n.setOnFocusChangeListener(new c());
    }

    public final boolean m(List<String> list) {
        return !list.isEmpty();
    }

    public final void n() {
        int size = this.m.size();
        int i = 0;
        while (i < this.k) {
            String str = size > i ? this.m.get(i) : "";
            CodeItemView codeItemView = this.p.get(i);
            codeItemView.setNumber(str);
            int i2 = this.k;
            if (size == i2 && i == i2 - 1) {
                codeItemView.setIsSelected(true);
            } else {
                codeItemView.setIsSelected(size == i);
            }
            codeItemView.invalidate();
            i++;
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        e eVar = this.q;
        if (eVar != null) {
            removeCallbacks(eVar);
        }
    }

    @Override // android.view.View
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        if (i != i3) {
            setCodeItemWidth(i);
        }
    }

    public void setOnInputListener(d dVar) {
    }

    public COUICodeInputView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public COUICodeInputView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.i = 6;
        this.f1708j = 360;
        this.f1709l = false;
        this.m = new ArrayList();
        this.p = new ArrayList();
        this.q = new e(null);
        ph2.c(this, false);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.COUICodeInputView, i, 0);
        this.k = typedArrayObtainStyledAttributes.getInteger(R$styleable.COUICodeInputView_couiCodeInputCount, 6);
        this.f1709l = typedArrayObtainStyledAttributes.getBoolean(R$styleable.COUICodeInputView_couiEnableSecurityInput, false);
        typedArrayObtainStyledAttributes.recycle();
        View viewInflate = LayoutInflater.from(context).inflate(R$layout.coui_phone_code_layout, this);
        k();
        l(viewInflate);
    }
}
