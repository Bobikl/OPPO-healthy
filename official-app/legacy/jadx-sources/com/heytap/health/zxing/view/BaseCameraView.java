package com.heytap.health.zxing.view;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.AttributeSet;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.lifecycle.Observer;
import com.coui.appcompat.dialog.COUIAlertDialogBuilder;
import com.heytap.health.base.R$string;
import com.oplus.aiunit.vision.cx9;
import com.oplus.aiunit.vision.gw2;
import com.oplus.aiunit.vision.k3;
import com.oplus.aiunit.vision.lt3;
import com.oplus.aiunit.vision.neg;
import com.oplus.aiunit.vision.t4f;
import com.oplus.aiunit.vision.vte;

/* JADX INFO: loaded from: classes19.dex */
public abstract class BaseCameraView extends ConstraintLayout implements Handler.Callback {
    public static final String TAG = "BaseCameraView";
    public Handler i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public t4f f7230j;
    public Context k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public k3 f7231l;
    public cx9 m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public Rect f7232n;
    public Observer<Boolean> o;

    public BaseCameraView(@NonNull Context context) {
        this(context, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void p() {
        Rect rect = this.f7232n;
        if (rect == null || rect.isEmpty()) {
            View viewB = this.m.b();
            this.f7232n = new Rect(viewB.getLeft(), viewB.getTop(), viewB.getLeft() + viewB.getMeasuredWidth(), viewB.getTop() + viewB.getMeasuredHeight());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void q(Boolean bool) {
        if (bool.booleanValue()) {
            this.m.c();
            this.m.b().post(new Runnable() { // from class: com.oplus.aiunit.vision.n01
                @Override // java.lang.Runnable
                public final void run() {
                    this.i.p();
                }
            });
        } else {
            this.m.a();
            m();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void r() {
        lt3.scanRect.c(v(this));
        lt3.scanRect.d(null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void s(DialogInterface dialogInterface, int i) {
        l();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void t(DialogInterface dialogInterface) {
        l();
    }

    @Override // android.os.Handler.Callback
    public boolean handleMessage(@NonNull Message message) {
        if (message.what == 1) {
            neg negVar = (neg) message.obj;
            gw2.a(TAG, "qrcode result:" + negVar);
            t4f t4fVar = this.f7230j;
            if (t4fVar != null) {
                boolean zT0 = t4fVar.t0(negVar);
                if (zT0) {
                    y();
                }
                k3 k3Var = this.f7231l;
                if (k3Var instanceof vte) {
                    ((vte) k3Var).s().postValue(Boolean.valueOf(zT0));
                }
            }
        }
        return true;
    }

    public final void j() {
        this.m = w();
        if (this.o == null) {
            this.o = new Observer() { // from class: com.oplus.aiunit.vision.l01
                @Override // androidx.lifecycle.Observer
                public final void onChanged(Object obj) {
                    this.i.q((Boolean) obj);
                }
            };
        }
        this.f7231l.c().observeForever(this.o);
        post(new Runnable() { // from class: com.oplus.aiunit.vision.m01
            @Override // java.lang.Runnable
            public final void run() {
                this.i.r();
            }
        });
    }

    public abstract void k(Context context);

    public final void l() {
        Context context = this.k;
        if (context instanceof AppCompatActivity) {
            ((AppCompatActivity) context).finish();
        }
    }

    public void m() {
        Context context = getContext();
        if ((context instanceof AppCompatActivity) && ((AppCompatActivity) context).isFinishing()) {
            gw2.b(TAG, "displayFrameworkBugMessageAndExit isFinish");
            return;
        }
        COUIAlertDialogBuilder cOUIAlertDialogBuilder = new COUIAlertDialogBuilder(this.k);
        cOUIAlertDialogBuilder.setTitle(this.k.getResources().getString(R$string.lib_base_share_no_camera));
        cOUIAlertDialogBuilder.setPositiveButton(R$string.lib_base_close, new DialogInterface.OnClickListener() { // from class: com.oplus.aiunit.vision.o01
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                this.i.s(dialogInterface, i);
            }
        });
        cOUIAlertDialogBuilder.setOnCancelListener(new DialogInterface.OnCancelListener() { // from class: com.oplus.aiunit.vision.p01
            @Override // android.content.DialogInterface.OnCancelListener
            public final void onCancel(DialogInterface dialogInterface) {
                this.i.t(dialogInterface);
            }
        });
        cOUIAlertDialogBuilder.show();
    }

    public final float[] n(View view, int i, int i2) {
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        int i3 = iArr[0];
        int i4 = iArr[1];
        int[] iArr2 = {i3, i4, view.getMeasuredWidth() + i3, view.getMeasuredHeight() + i4};
        int[] iArr3 = new int[2];
        getLocationOnScreen(iArr3);
        float[] fArr = new float[4];
        int i5 = iArr2[0];
        int i6 = iArr3[0];
        float f = i;
        fArr[0] = (i5 - i6) / f;
        int i7 = iArr2[1];
        int i8 = iArr3[1];
        float f2 = i2;
        fArr[1] = (i7 - i8) / f2;
        fArr[2] = (iArr2[2] - i6) / f;
        fArr[3] = (iArr2[3] - i8) / f2;
        for (int i9 = 0; i9 < 4; i9++) {
            if (fArr[i9] < 0.0f) {
                fArr[i9] = 0.0f;
            }
            if (fArr[i9] > 1.0f) {
                fArr[i9] = 1.0f;
            }
        }
        return fArr;
    }

    public final void o(Context context) {
        vte vteVar = new vte(this.i, context);
        this.f7231l = vteVar;
        View viewA = vteVar.a();
        ConstraintLayout.LayoutParams layoutParams = new ConstraintLayout.LayoutParams(0, 0);
        layoutParams.startToStart = 0;
        layoutParams.topToTop = 0;
        layoutParams.endToEnd = 0;
        layoutParams.bottomToBottom = 0;
        viewA.setLayoutParams(layoutParams);
        addView(viewA);
        k(context);
        j();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.i.removeCallbacksAndMessages(null);
        k3 k3Var = this.f7231l;
        if (k3Var != null) {
            if (this.o != null) {
                k3Var.c().removeObserver(this.o);
            }
            this.f7231l.f();
        }
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.View
    public void onMeasure(int i, int i2) {
        if (isInEditMode()) {
            super.onMeasure(i, i2);
            return;
        }
        super.onMeasure(i, i2);
        lt3.scanRect.a(getMeasuredWidth());
        lt3.scanRect.b(getMeasuredHeight());
    }

    public void setQRResultCallback(t4f t4fVar) {
        this.f7230j = t4fVar;
    }

    public void u(Intent intent) {
        this.f7231l.g(intent);
    }

    public RectF v(View view) {
        RectF rectF = new RectF();
        float[] fArrN = n(view, getMeasuredWidth(), getMeasuredHeight());
        rectF.left = fArrN[0];
        rectF.right = fArrN[2];
        rectF.top = fArrN[1];
        rectF.bottom = fArrN[3];
        return rectF;
    }

    public abstract cx9 w();

    public void x() {
        this.f7231l.b();
    }

    public void y() {
        this.f7231l.e();
        this.m.a();
    }

    public BaseCameraView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    @SuppressLint({"ObsoleteSdkInt"})
    public BaseCameraView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.i = new Handler(Looper.getMainLooper(), this);
        this.k = context;
        setBackgroundColor(0);
        o(context);
        if (isForceDarkAllowed()) {
            setForceDarkAllowed(false);
        }
    }
}
