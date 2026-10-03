package com.facebook.rebound.ui;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Color;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.SeekBar;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import android.widget.TableLayout;
import android.widget.TextView;
import com.oplus.aiunit.vision.kki;
import com.oplus.aiunit.vision.mki;
import com.oplus.aiunit.vision.nki;
import com.oplus.aiunit.vision.pki;
import com.oplus.aiunit.vision.qrd;
import com.oplus.aiunit.vision.ski;
import com.oplus.aiunit.vision.vqk;
import com.sensorsdata.analytics.android.autotrack.aop.SensorsDataAutoTrackHelper;
import com.sensorsdata.analytics.android.sdk.SensorsDataInstrumented;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes13.dex */
public class SpringConfiguratorView extends FrameLayout {
    public static final DecimalFormat v = new DecimalFormat("#.#");
    public final e i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final List<mki> f2229j;
    public final kki k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final float f2230l;
    public final float m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final nki f2231n;
    public final int o;
    public SeekBar p;
    public SeekBar q;
    public Spinner r;
    public TextView s;
    public TextView t;
    public mki u;

    public class b implements View.OnTouchListener {
        public b() {
        }

        @Override // android.view.View.OnTouchListener
        public boolean onTouch(View view, MotionEvent motionEvent) {
            if (motionEvent.getAction() != 0) {
                return true;
            }
            SpringConfiguratorView.this.p();
            return true;
        }
    }

    public class c implements pki {
        public c() {
        }

        @Override // com.oplus.aiunit.vision.pki
        public void onSpringActivate(kki kkiVar) {
        }

        @Override // com.oplus.aiunit.vision.pki
        public void onSpringAtRest(kki kkiVar) {
        }

        @Override // com.oplus.aiunit.vision.pki
        public void onSpringEndStateChange(kki kkiVar) {
        }

        @Override // com.oplus.aiunit.vision.pki
        public void onSpringUpdate(kki kkiVar) {
            float fC = (float) kkiVar.c();
            float f = SpringConfiguratorView.this.m;
            SpringConfiguratorView.this.setTranslationY((fC * (SpringConfiguratorView.this.f2230l - f)) + f);
        }
    }

    public class d implements SeekBar.OnSeekBarChangeListener {
        public d() {
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public void onProgressChanged(SeekBar seekBar, int i, boolean z) {
            if (seekBar == SpringConfiguratorView.this.p) {
                double d = ((i * 200.0f) / 100000.0f) + 0.0f;
                SpringConfiguratorView.this.u.b = qrd.d(d);
                String str = SpringConfiguratorView.v.format(d);
                SpringConfiguratorView.this.t.setText("T:" + str);
            }
            if (seekBar == SpringConfiguratorView.this.q) {
                double d2 = ((i * 50.0f) / 100000.0f) + 0.0f;
                SpringConfiguratorView.this.u.a = qrd.a(d2);
                String str2 = SpringConfiguratorView.v.format(d2);
                SpringConfiguratorView.this.s.setText("F:" + str2);
            }
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public void onStartTrackingTouch(SeekBar seekBar) {
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        @SensorsDataInstrumented
        public void onStopTrackingTouch(SeekBar seekBar) {
            SensorsDataAutoTrackHelper.trackViewOnClick(seekBar);
        }
    }

    public class e extends BaseAdapter {
        public final Context i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final List<String> f2232j = new ArrayList();

        public e(Context context) {
            this.i = context;
        }

        public void a(String str) {
            this.f2232j.add(str);
            notifyDataSetChanged();
        }

        public void b() {
            this.f2232j.clear();
            notifyDataSetChanged();
        }

        @Override // android.widget.Adapter
        public int getCount() {
            return this.f2232j.size();
        }

        @Override // android.widget.Adapter
        public Object getItem(int i) {
            return this.f2232j.get(i);
        }

        @Override // android.widget.Adapter
        public long getItemId(int i) {
            return i;
        }

        @Override // android.widget.Adapter
        public View getView(int i, View view, ViewGroup viewGroup) {
            TextView textView;
            if (view == null) {
                textView = new TextView(this.i);
                textView.setLayoutParams(new AbsListView.LayoutParams(-1, -1));
                int iD = vqk.d(12.0f, SpringConfiguratorView.this.getResources());
                textView.setPadding(iD, iD, iD, iD);
                textView.setTextColor(SpringConfiguratorView.this.o);
            } else {
                textView = (TextView) view;
            }
            textView.setText(this.f2232j.get(i));
            return textView;
        }
    }

    public class f implements AdapterView.OnItemSelectedListener {
        public f() {
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        @SensorsDataInstrumented
        public void onItemSelected(AdapterView<?> adapterView, View view, int i, long j2) {
            SpringConfiguratorView springConfiguratorView = SpringConfiguratorView.this;
            springConfiguratorView.u = (mki) springConfiguratorView.f2229j.get(i);
            SpringConfiguratorView springConfiguratorView2 = SpringConfiguratorView.this;
            springConfiguratorView2.q(springConfiguratorView2.u);
            SensorsDataAutoTrackHelper.trackListView(adapterView, view, i);
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public void onNothingSelected(AdapterView<?> adapterView) {
        }
    }

    public SpringConfiguratorView(Context context) {
        this(context, null);
    }

    public final View n(Context context) {
        Resources resources = getResources();
        int iD = vqk.d(5.0f, resources);
        int iD2 = vqk.d(10.0f, resources);
        int iD3 = vqk.d(20.0f, resources);
        TableLayout.LayoutParams layoutParams = new TableLayout.LayoutParams(0, -2, 1.0f);
        layoutParams.setMargins(0, 0, iD, 0);
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setLayoutParams(vqk.a(-1, vqk.d(300.0f, resources)));
        FrameLayout frameLayout2 = new FrameLayout(context);
        FrameLayout.LayoutParams layoutParamsB = vqk.b();
        layoutParamsB.setMargins(0, iD3, 0, 0);
        frameLayout2.setLayoutParams(layoutParamsB);
        frameLayout2.setBackgroundColor(Color.argb(100, 0, 0, 0));
        frameLayout.addView(frameLayout2);
        this.r = new Spinner(context, 0);
        FrameLayout.LayoutParams layoutParamsC = vqk.c();
        layoutParamsC.gravity = 48;
        layoutParamsC.setMargins(iD2, iD2, iD2, 0);
        this.r.setLayoutParams(layoutParamsC);
        frameLayout2.addView(this.r);
        LinearLayout linearLayout = new LinearLayout(context);
        FrameLayout.LayoutParams layoutParamsC2 = vqk.c();
        layoutParamsC2.setMargins(0, 0, 0, vqk.d(80.0f, resources));
        layoutParamsC2.gravity = 80;
        linearLayout.setLayoutParams(layoutParamsC2);
        linearLayout.setOrientation(1);
        frameLayout2.addView(linearLayout);
        LinearLayout linearLayout2 = new LinearLayout(context);
        FrameLayout.LayoutParams layoutParamsC3 = vqk.c();
        layoutParamsC3.setMargins(iD2, iD2, iD2, iD3);
        linearLayout2.setPadding(iD2, iD2, iD2, iD2);
        linearLayout2.setLayoutParams(layoutParamsC3);
        linearLayout2.setOrientation(0);
        linearLayout.addView(linearLayout2);
        SeekBar seekBar = new SeekBar(context);
        this.p = seekBar;
        seekBar.setLayoutParams(layoutParams);
        linearLayout2.addView(this.p);
        TextView textView = new TextView(getContext());
        this.t = textView;
        textView.setTextColor(this.o);
        FrameLayout.LayoutParams layoutParamsA = vqk.a(vqk.d(50.0f, resources), -1);
        this.t.setGravity(19);
        this.t.setLayoutParams(layoutParamsA);
        this.t.setMaxLines(1);
        linearLayout2.addView(this.t);
        LinearLayout linearLayout3 = new LinearLayout(context);
        FrameLayout.LayoutParams layoutParamsC4 = vqk.c();
        layoutParamsC4.setMargins(iD2, iD2, iD2, iD3);
        linearLayout3.setPadding(iD2, iD2, iD2, iD2);
        linearLayout3.setLayoutParams(layoutParamsC4);
        linearLayout3.setOrientation(0);
        linearLayout.addView(linearLayout3);
        SeekBar seekBar2 = new SeekBar(context);
        this.q = seekBar2;
        seekBar2.setLayoutParams(layoutParams);
        linearLayout3.addView(this.q);
        TextView textView2 = new TextView(getContext());
        this.s = textView2;
        textView2.setTextColor(this.o);
        FrameLayout.LayoutParams layoutParamsA2 = vqk.a(vqk.d(50.0f, resources), -1);
        this.s.setGravity(19);
        this.s.setLayoutParams(layoutParamsA2);
        this.s.setMaxLines(1);
        linearLayout3.addView(this.s);
        View view = new View(context);
        FrameLayout.LayoutParams layoutParamsA3 = vqk.a(vqk.d(60.0f, resources), vqk.d(40.0f, resources));
        layoutParamsA3.gravity = 49;
        view.setLayoutParams(layoutParamsA3);
        view.setOnTouchListener(new b());
        view.setBackgroundColor(Color.argb(255, 0, 164, 209));
        frameLayout.addView(view);
        return frameLayout;
    }

    public void o() {
        Map<mki, String> mapB = this.f2231n.b();
        this.i.b();
        this.f2229j.clear();
        for (Map.Entry<mki, String> entry : mapB.entrySet()) {
            if (entry.getKey() != mki.defaultConfig) {
                this.f2229j.add(entry.getKey());
                this.i.a(entry.getValue());
            }
        }
        this.f2229j.add(mki.defaultConfig);
        this.i.a(mapB.get(mki.defaultConfig));
        this.i.notifyDataSetChanged();
        if (this.f2229j.size() > 0) {
            this.r.setSelection(0);
        }
    }

    public final void p() {
        this.k.o(this.k.e() == 1.0d ? 0.0d : 1.0d);
    }

    public final void q(mki mkiVar) {
        int iRound = Math.round(((((float) qrd.c(mkiVar.b)) - 0.0f) * 100000.0f) / 200.0f);
        int iRound2 = Math.round(((((float) qrd.b(mkiVar.a)) - 0.0f) * 100000.0f) / 50.0f);
        this.p.setProgress(iRound);
        this.q.setProgress(iRound2);
    }

    public SpringConfiguratorView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    @TargetApi(11)
    public SpringConfiguratorView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f2229j = new ArrayList();
        this.o = Color.argb(255, 225, 225, 225);
        ski skiVarG = ski.g();
        this.f2231n = nki.c();
        e eVar = new e(context);
        this.i = eVar;
        Resources resources = getResources();
        this.m = vqk.d(40.0f, resources);
        float fD = vqk.d(280.0f, resources);
        this.f2230l = fD;
        kki kkiVarC = skiVarG.c();
        this.k = kkiVarC;
        kkiVarC.m(1.0d).o(1.0d).a(new c());
        addView(n(context));
        d dVar = new d();
        this.p.setMax(100000);
        this.p.setOnSeekBarChangeListener(dVar);
        this.q.setMax(100000);
        this.q.setOnSeekBarChangeListener(dVar);
        this.r.setAdapter((SpinnerAdapter) eVar);
        this.r.setOnItemSelectedListener(new f());
        o();
        setTranslationY(fD);
    }
}
