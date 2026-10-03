package com.oplus.aiunit.vision;

import android.annotation.TargetApi;
import android.app.Activity;
import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.os.Build;
import android.os.Handler;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.WindowManager;
import android.widget.AutoCompleteTextView;
import android.widget.RelativeLayout;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import com.badlogic.gdx.Application;
import com.badlogic.gdx.Graphics;
import com.badlogic.gdx.Input;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes13.dex */
public class r35 extends i6 implements q20 {
    public static final int NUM_TOUCHES = 20;
    public final boolean A;
    public SensorManager C;
    public Handler H;
    public final Application I;
    public final Context J;
    public final j30 K;
    public int L;
    public final p20 M;
    public boolean P;
    public final u10 W;
    public final Input.Orientation X;
    public f Z;
    public SensorEventListener a0;
    public SensorEventListener b0;
    public SensorEventListener c0;
    public SensorEventListener d0;
    public final v20 f0;
    public boolean j0;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public mne<e> f16036n = new a(16, 1000);
    public mne<h> o = new b(16, 1000);
    public ArrayList<View.OnKeyListener> p = new ArrayList<>();
    public ArrayList<e> q = new ArrayList<>();
    public ArrayList<h> r = new ArrayList<>();
    public int[] s = new int[20];
    public int[] t = new int[20];
    public int[] u = new int[20];
    public int[] v = new int[20];
    public boolean[] w = new boolean[20];
    public int[] x = new int[20];
    public int[] y = new int[20];
    public float[] z = new float[20];
    public boolean[] B = new boolean[20];
    public boolean D = false;
    public final float[] E = new float[3];
    public boolean F = false;
    public final float[] G = new float[3];
    public boolean N = false;
    public boolean O = false;
    public final float[] Q = new float[3];
    public final float[] R = new float[3];
    public float S = 0.0f;
    public float T = 0.0f;
    public float U = 0.0f;
    public boolean V = false;
    public long Y = 0;
    public final ArrayList<View.OnGenericMotionListener> e0 = new ArrayList<>();
    public boolean g0 = true;
    public boolean h0 = false;
    public RelativeLayout i0 = null;
    public boolean k0 = false;
    public final float[] l0 = new float[9];
    public final float[] m0 = new float[3];

    public class a extends mne<e> {
        public a(int i, int i2) {
            super(i, i2);
        }

        @Override // com.oplus.aiunit.vision.mne
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public e c() {
            return new e();
        }
    }

    public class b extends mne<h> {
        public b(int i, int i2) {
            super(i, i2);
        }

        @Override // com.oplus.aiunit.vision.mne
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public h c() {
            return new h();
        }
    }

    public class c implements Runnable {
        public final /* synthetic */ boolean i;

        public class a implements Runnable {
            public final /* synthetic */ String i;

            /* JADX INFO: renamed from: j, reason: collision with root package name */
            public final /* synthetic */ int f16038j;
            public final /* synthetic */ View k;

            public a(String str, int i, View view) {
                this.i = str;
                this.f16038j = i;
                this.k = view;
                r35.m(r35.this);
            }

            @Override // java.lang.Runnable
            public void run() {
                throw null;
            }
        }

        public c(boolean z) {
            this.i = z;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (!r35.this.r()) {
                r35.this.k0 = false;
                return;
            }
            View viewP = ((n20) r35.this.I.P()).p();
            viewP.requestFocus();
            AutoCompleteTextView autoCompleteTextViewO = r35.this.o();
            x38.app.H(new a(autoCompleteTextViewO.getText().toString(), autoCompleteTextViewO.getSelectionStart(), viewP));
            if (r35.this.i0.getChildCount() > 1) {
                r35.this.i0.removeViews(1, r35.this.i0.getChildCount() - 1);
            }
            r35.this.i0.setVisibility(4);
            r35.this.k0 = false;
        }
    }

    public static /* synthetic */ class d {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[Input.OnscreenKeyboardType.values().length];
            a = iArr;
            try {
                iArr[Input.OnscreenKeyboardType.NumberPad.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[Input.OnscreenKeyboardType.PhonePad.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                a[Input.OnscreenKeyboardType.Email.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                a[Input.OnscreenKeyboardType.Password.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                a[Input.OnscreenKeyboardType.URI.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    public static class e {
        public long a;
        public int b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f16040c;
        public char d;
    }

    public class g implements SensorEventListener {
        public g() {
        }

        @Override // android.hardware.SensorEventListener
        public void onAccuracyChanged(Sensor sensor, int i) {
        }

        @Override // android.hardware.SensorEventListener
        public void onSensorChanged(SensorEvent sensorEvent) {
            if (sensorEvent.sensor.getType() == 1) {
                r35 r35Var = r35.this;
                if (r35Var.X == Input.Orientation.Portrait) {
                    float[] fArr = sensorEvent.values;
                    float[] fArr2 = r35Var.E;
                    System.arraycopy(fArr, 0, fArr2, 0, fArr2.length);
                } else {
                    float[] fArr3 = r35Var.E;
                    float[] fArr4 = sensorEvent.values;
                    fArr3[0] = fArr4[1];
                    fArr3[1] = -fArr4[0];
                    fArr3[2] = fArr4[2];
                }
            }
            if (sensorEvent.sensor.getType() == 2) {
                float[] fArr5 = sensorEvent.values;
                float[] fArr6 = r35.this.Q;
                System.arraycopy(fArr5, 0, fArr6, 0, fArr6.length);
            }
            if (sensorEvent.sensor.getType() == 4) {
                r35 r35Var2 = r35.this;
                if (r35Var2.X == Input.Orientation.Portrait) {
                    float[] fArr7 = sensorEvent.values;
                    float[] fArr8 = r35Var2.G;
                    System.arraycopy(fArr7, 0, fArr8, 0, fArr8.length);
                } else {
                    float[] fArr9 = r35Var2.G;
                    float[] fArr10 = sensorEvent.values;
                    fArr9[0] = fArr10[1];
                    fArr9[1] = -fArr10[0];
                    fArr9[2] = fArr10[2];
                }
            }
            if (sensorEvent.sensor.getType() == 11) {
                r35 r35Var3 = r35.this;
                if (r35Var3.X == Input.Orientation.Portrait) {
                    float[] fArr11 = sensorEvent.values;
                    float[] fArr12 = r35Var3.R;
                    System.arraycopy(fArr11, 0, fArr12, 0, fArr12.length);
                } else {
                    float[] fArr13 = r35Var3.R;
                    float[] fArr14 = sensorEvent.values;
                    fArr13[0] = fArr14[1];
                    fArr13[1] = -fArr14[0];
                    fArr13[2] = fArr14[2];
                }
            }
        }
    }

    public static class h {
        public long a;
        public int b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f16042c;
        public int d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int f16043e;
        public int f;
        public int g;
        public int h;
    }

    public r35(Application application, Context context, Object obj, u10 u10Var) {
        int i = 0;
        this.L = 0;
        a aVar = null;
        if (obj instanceof View) {
            View view = (View) obj;
            view.setOnKeyListener(this);
            view.setOnTouchListener(this);
            view.setFocusable(true);
            view.setFocusableInTouchMode(true);
            view.requestFocus();
            view.setOnGenericMotionListener(this);
        }
        this.W = u10Var;
        this.f0 = new v20();
        while (true) {
            int[] iArr = this.y;
            if (i >= iArr.length) {
                break;
            }
            iArr[i] = -1;
            i++;
        }
        this.H = new Handler();
        this.I = application;
        this.J = context;
        this.L = u10Var.m;
        j30 j30Var = new j30();
        this.K = j30Var;
        this.A = j30Var.c(context);
        this.M = new p20(context);
        if (Build.VERSION.SDK_INT >= 33 && (context instanceof Activity)) {
            this.Z = new f(this, aVar);
        }
        int iQ = q();
        Graphics.b bVarI = application.P().i();
        if (((iQ == 0 || iQ == 180) && bVarI.a >= bVarI.b) || ((iQ == 90 || iQ == 270) && bVarI.a <= bVarI.b)) {
            this.X = Input.Orientation.Landscape;
        } else {
            this.X = Input.Orientation.Portrait;
        }
        g(255, true);
    }

    public static /* synthetic */ h9a i(r35 r35Var) {
        r35Var.getClass();
        return null;
    }

    public static /* synthetic */ wsj m(r35 r35Var) {
        r35Var.getClass();
        return null;
    }

    public static int n(Input.OnscreenKeyboardType onscreenKeyboardType) {
        int i = d.a[onscreenKeyboardType.ordinal()];
        if (i == 1) {
            return 2;
        }
        if (i == 2) {
            return 3;
        }
        if (i == 3) {
            return 33;
        }
        if (i != 4) {
            return i != 5 ? 1 : 17;
        }
        return 129;
    }

    @Override // com.oplus.aiunit.vision.q20
    public void S1() {
        x();
    }

    @Override // com.badlogic.gdx.Input
    public boolean a() {
        synchronized (this) {
            if (this.A) {
                for (int i = 0; i < 20; i++) {
                    if (this.w[i]) {
                        return true;
                    }
                }
            }
            return this.w[0];
        }
    }

    @Override // com.oplus.aiunit.vision.q20
    public void addGenericMotionListener(View.OnGenericMotionListener onGenericMotionListener) {
        this.e0.add(onGenericMotionListener);
    }

    @Override // com.oplus.aiunit.vision.q20
    public void addKeyListener(View.OnKeyListener onKeyListener) {
        this.p.add(onKeyListener);
    }

    @Override // com.badlogic.gdx.Input
    public void b(boolean z) {
        if (!this.k0 && r()) {
            this.k0 = true;
            this.H.post(new c(z));
        }
    }

    @Override // com.badlogic.gdx.Input
    public void c(int i, int i2, boolean z) {
        this.M.b(i, i2, z);
    }

    @Override // com.badlogic.gdx.Input
    public float d() {
        return this.E[0];
    }

    @Override // com.badlogic.gdx.Input
    public float e() {
        return this.E[1];
    }

    @Override // com.oplus.aiunit.vision.i6
    public void g(int i, boolean z) {
        f fVar;
        super.g(i, z);
        if (i != 4 || (fVar = this.Z) == null) {
            return;
        }
        if (z) {
            fVar.c();
        } else {
            fVar.d();
        }
    }

    @Override // com.oplus.aiunit.vision.q20
    public void h5() {
        synchronized (this) {
            if (this.V) {
                this.V = false;
                int i = 0;
                while (true) {
                    boolean[] zArr = this.B;
                    if (i >= zArr.length) {
                        break;
                    }
                    zArr[i] = false;
                    i++;
                }
            }
            if (this.m) {
                this.m = false;
                int i2 = 0;
                while (true) {
                    boolean[] zArr2 = this.f12392j;
                    if (i2 >= zArr2.length) {
                        break;
                    }
                    zArr2[i2] = false;
                    i2++;
                }
            }
            int size = this.r.size();
            for (int i3 = 0; i3 < size; i3++) {
                h hVar = this.r.get(i3);
                if (hVar.b == 0) {
                    this.V = true;
                }
                this.o.b(hVar);
            }
            int size2 = this.q.size();
            for (int i4 = 0; i4 < size2; i4++) {
                this.f16036n.b(this.q.get(i4));
            }
            if (this.r.isEmpty()) {
                int i5 = 0;
                while (true) {
                    int[] iArr = this.u;
                    if (i5 >= iArr.length) {
                        break;
                    }
                    iArr[0] = 0;
                    this.v[0] = 0;
                    i5++;
                }
            }
            this.q.clear();
            this.r.clear();
        }
    }

    @Override // com.oplus.aiunit.vision.q20
    public void m0(boolean z) {
        this.P = z;
    }

    public final AutoCompleteTextView o() {
        return (AutoCompleteTextView) this.i0.getChildAt(0);
    }

    @Override // android.view.View.OnGenericMotionListener
    public boolean onGenericMotion(View view, MotionEvent motionEvent) {
        if (this.f0.a(motionEvent, this)) {
            return true;
        }
        int size = this.e0.size();
        for (int i = 0; i < size; i++) {
            if (this.e0.get(i).onGenericMotion(view, motionEvent)) {
                return true;
            }
        }
        return false;
    }

    @Override // android.view.View.OnKeyListener
    public boolean onKey(View view, int i, KeyEvent keyEvent) {
        int size = this.p.size();
        for (int i2 = 0; i2 < size; i2++) {
            if (this.p.get(i2).onKey(view, i, keyEvent)) {
                return true;
            }
        }
        if (keyEvent.getAction() == 0 && keyEvent.getRepeatCount() > 0) {
            return f(i);
        }
        synchronized (this) {
            if (keyEvent.getKeyCode() == 0 && keyEvent.getAction() == 2) {
                String characters = keyEvent.getCharacters();
                for (int i3 = 0; i3 < characters.length(); i3++) {
                    e eVarD = this.f16036n.d();
                    eVarD.a = System.nanoTime();
                    eVarD.f16040c = 0;
                    eVarD.d = characters.charAt(i3);
                    eVarD.b = 2;
                    this.q.add(eVarD);
                }
                return false;
            }
            char unicodeChar = (char) keyEvent.getUnicodeChar();
            if (i == 67) {
                unicodeChar = '\b';
            }
            if (keyEvent.getKeyCode() >= 0 && keyEvent.getKeyCode() <= 255) {
                int action = keyEvent.getAction();
                if (action == 0) {
                    e eVarD2 = this.f16036n.d();
                    eVarD2.a = System.nanoTime();
                    eVarD2.d = (char) 0;
                    eVarD2.f16040c = keyEvent.getKeyCode();
                    eVarD2.b = 0;
                    if (i == 4 && keyEvent.isAltPressed()) {
                        eVarD2.f16040c = 255;
                        i = 255;
                    }
                    this.q.add(eVarD2);
                    boolean[] zArr = this.i;
                    int i4 = eVarD2.f16040c;
                    if (!zArr[i4]) {
                        this.f12393l++;
                        zArr[i4] = true;
                    }
                } else if (action == 1) {
                    long jNanoTime = System.nanoTime();
                    e eVarD3 = this.f16036n.d();
                    eVarD3.a = jNanoTime;
                    eVarD3.d = (char) 0;
                    eVarD3.f16040c = keyEvent.getKeyCode();
                    eVarD3.b = 1;
                    if (i == 4 && keyEvent.isAltPressed()) {
                        eVarD3.f16040c = 255;
                        i = 255;
                    }
                    this.q.add(eVarD3);
                    e eVarD4 = this.f16036n.d();
                    eVarD4.a = jNanoTime;
                    eVarD4.d = unicodeChar;
                    eVarD4.f16040c = 0;
                    eVarD4.b = 2;
                    this.q.add(eVarD4);
                    if (i == 255) {
                        boolean[] zArr2 = this.i;
                        if (zArr2[255]) {
                            this.f12393l--;
                            zArr2[255] = false;
                        }
                    } else if (this.i[keyEvent.getKeyCode()]) {
                        this.f12393l--;
                        this.i[keyEvent.getKeyCode()] = false;
                    }
                }
                this.I.P().b();
                return f(i);
            }
            return false;
        }
    }

    @Override // com.oplus.aiunit.vision.q20
    public void onPause() {
        x();
    }

    @Override // com.oplus.aiunit.vision.q20
    public void onResume() {
        t();
    }

    @Override // android.view.View.OnTouchListener
    public boolean onTouch(View view, MotionEvent motionEvent) {
        if (this.g0 && view != null) {
            view.setFocusableInTouchMode(true);
            view.requestFocus();
            this.g0 = false;
        }
        this.K.a(motionEvent, this);
        int i = this.L;
        if (i != 0) {
            try {
                Thread.sleep(i);
            } catch (InterruptedException unused) {
            }
        }
        return true;
    }

    public int p() {
        int length = this.y.length;
        for (int i = 0; i < length; i++) {
            if (this.y[i] == -1) {
                return i;
            }
        }
        this.z = u(this.z);
        this.y = v(this.y);
        this.s = v(this.s);
        this.t = v(this.t);
        this.u = v(this.u);
        this.v = v(this.v);
        this.w = w(this.w);
        this.x = v(this.x);
        return length;
    }

    public int q() {
        Context context = this.J;
        int rotation = context instanceof Activity ? ((Activity) context).getWindowManager().getDefaultDisplay().getRotation() : ((WindowManager) context.getSystemService("window")).getDefaultDisplay().getRotation();
        if (rotation == 1) {
            return 90;
        }
        if (rotation != 2) {
            return rotation != 3 ? 0 : 270;
        }
        return 180;
    }

    public final boolean r() {
        RelativeLayout relativeLayout = this.i0;
        return relativeLayout != null && relativeLayout.getVisibility() == 0;
    }

    public int s(int i) {
        int length = this.y.length;
        for (int i2 = 0; i2 < length; i2++) {
            if (this.y[i2] == i) {
                return i2;
            }
        }
        StringBuilder sb = new StringBuilder();
        for (int i3 = 0; i3 < length; i3++) {
            sb.append(i3 + ":" + this.y[i3] + " ");
        }
        x38.app.c("AndroidInput", "Pointer ID lookup failed: " + i + ", " + sb.toString());
        return -1;
    }

    public void t() {
        if (this.W.h) {
            SensorManager sensorManager = (SensorManager) this.J.getSystemService(com.heytap.health.gdxui.stars.b.TAG_SENSOR);
            this.C = sensorManager;
            if (sensorManager.getSensorList(1).isEmpty()) {
                this.D = false;
            } else {
                Sensor sensor = this.C.getSensorList(1).get(0);
                g gVar = new g();
                this.a0 = gVar;
                this.D = this.C.registerListener(gVar, sensor, this.W.f17245l);
            }
        } else {
            this.D = false;
        }
        if (this.W.i) {
            SensorManager sensorManager2 = (SensorManager) this.J.getSystemService(com.heytap.health.gdxui.stars.b.TAG_SENSOR);
            this.C = sensorManager2;
            if (sensorManager2.getSensorList(4).isEmpty()) {
                this.F = false;
            } else {
                Sensor sensor2 = this.C.getSensorList(4).get(0);
                g gVar2 = new g();
                this.b0 = gVar2;
                this.F = this.C.registerListener(gVar2, sensor2, this.W.f17245l);
            }
        } else {
            this.F = false;
        }
        this.O = false;
        if (this.W.k) {
            if (this.C == null) {
                this.C = (SensorManager) this.J.getSystemService(com.heytap.health.gdxui.stars.b.TAG_SENSOR);
            }
            List<Sensor> sensorList = this.C.getSensorList(11);
            if (!sensorList.isEmpty()) {
                this.d0 = new g();
                for (Sensor sensor3 : sensorList) {
                    if (sensor3.getVendor().equals("Google Inc.") && sensor3.getVersion() == 3) {
                        this.O = this.C.registerListener(this.d0, sensor3, this.W.f17245l);
                        break;
                    }
                }
                if (!this.O) {
                    this.O = this.C.registerListener(this.d0, sensorList.get(0), this.W.f17245l);
                }
            }
        }
        if (!this.W.f17244j || this.O) {
            this.N = false;
        } else {
            if (this.C == null) {
                this.C = (SensorManager) this.J.getSystemService(com.heytap.health.gdxui.stars.b.TAG_SENSOR);
            }
            Sensor defaultSensor = this.C.getDefaultSensor(2);
            if (defaultSensor != null) {
                boolean z = this.D;
                this.N = z;
                if (z) {
                    g gVar3 = new g();
                    this.c0 = gVar3;
                    this.N = this.C.registerListener(gVar3, defaultSensor, this.W.f17245l);
                }
            } else {
                this.N = false;
            }
        }
        x38.app.c("AndroidInput", "sensor listener setup");
    }

    public final float[] u(float[] fArr) {
        float[] fArr2 = new float[fArr.length + 2];
        System.arraycopy(fArr, 0, fArr2, 0, fArr.length);
        return fArr2;
    }

    public final int[] v(int[] iArr) {
        int[] iArr2 = new int[iArr.length + 2];
        System.arraycopy(iArr, 0, iArr2, 0, iArr.length);
        return iArr2;
    }

    public final boolean[] w(boolean[] zArr) {
        boolean[] zArr2 = new boolean[zArr.length + 2];
        System.arraycopy(zArr, 0, zArr2, 0, zArr.length);
        return zArr2;
    }

    @Override // com.oplus.aiunit.vision.q20
    public void w4() {
        t();
    }

    public void x() {
        SensorManager sensorManager = this.C;
        if (sensorManager != null) {
            SensorEventListener sensorEventListener = this.a0;
            if (sensorEventListener != null) {
                sensorManager.unregisterListener(sensorEventListener);
                this.a0 = null;
            }
            SensorEventListener sensorEventListener2 = this.b0;
            if (sensorEventListener2 != null) {
                this.C.unregisterListener(sensorEventListener2);
                this.b0 = null;
            }
            SensorEventListener sensorEventListener3 = this.d0;
            if (sensorEventListener3 != null) {
                this.C.unregisterListener(sensorEventListener3);
                this.d0 = null;
            }
            SensorEventListener sensorEventListener4 = this.c0;
            if (sensorEventListener4 != null) {
                this.C.unregisterListener(sensorEventListener4);
                this.c0 = null;
            }
            this.C = null;
        }
        x38.app.c("AndroidInput", "sensor listener tear down");
    }

    @TargetApi(33)
    public class f {
        public final OnBackInvokedDispatcher a;
        public final OnBackInvokedCallback b;

        public class a implements OnBackInvokedCallback {
            public a() {
            }

            public void onBackInvoked() {
                r35.i(r35.this);
            }
        }

        public f() {
            this.a = ((Activity) r35.this.J).getOnBackInvokedDispatcher();
            this.b = new a();
        }

        public final void c() {
            this.a.registerOnBackInvokedCallback(0, this.b);
        }

        public final void d() {
            this.a.unregisterOnBackInvokedCallback(this.b);
        }

        public /* synthetic */ f(r35 r35Var, a aVar) {
            this();
        }
    }
}
