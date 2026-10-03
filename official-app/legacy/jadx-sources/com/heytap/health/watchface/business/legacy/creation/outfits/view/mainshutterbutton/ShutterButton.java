package com.heytap.health.watchface.business.legacy.creation.outfits.view.mainshutterbutton;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.MotionEvent;
import com.oplus.aiunit.vision.ltl;

/* JADX INFO: loaded from: classes19.dex */
public class ShutterButton extends RotateImageView {
    public static final String TAG = "ShutterButton";
    public b p;
    public boolean q;
    public boolean r;

    public class a implements Runnable {
        public final /* synthetic */ boolean i;

        public a(boolean z) {
            this.i = z;
        }

        @Override // java.lang.Runnable
        public void run() {
            ShutterButton.this.c(this.i);
        }
    }

    public interface b {
        void a(ShutterButton shutterButton);

        void b(ShutterButton shutterButton);

        void c(ShutterButton shutterButton);

        boolean d();

        void e(ShutterButton shutterButton);

        void f(ShutterButton shutterButton);

        void g(ShutterButton shutterButton, boolean z);
    }

    public ShutterButton(Context context) {
        super(context);
        this.r = false;
    }

    public final void c(boolean z) {
        b bVar = this.p;
        if (bVar != null) {
            bVar.g(this, z);
        }
    }

    @Override // android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override // android.widget.ImageView, android.view.View
    public void drawableStateChanged() {
        super.drawableStateChanged();
        boolean zIsPressed = isPressed();
        if (zIsPressed != this.q) {
            if (zIsPressed) {
                c(zIsPressed);
            } else {
                post(new a(zIsPressed));
            }
            this.q = zIsPressed;
        }
    }

    @Override // com.heytap.health.watchface.business.legacy.creation.outfits.view.mainshutterbutton.RotateImageView, android.widget.ImageView, android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        b bVar;
        b bVar2;
        ltl.h(TAG, "onTouchEvent, isEnabled: " + isEnabled() + ", event.getAction: " + motionEvent.getAction() + ", getY: " + motionEvent.getY() + ", getRawY: " + motionEvent.getRawY());
        b bVar3 = this.p;
        if (bVar3 != null && !bVar3.d()) {
            return super.onTouchEvent(motionEvent);
        }
        if ((motionEvent.getAction() == 1 || motionEvent.getAction() == 3) && this.r) {
            b bVar4 = this.p;
            if (bVar4 != null) {
                bVar4.a(this);
            }
            this.r = false;
        }
        if (motionEvent.getAction() == 0 && (bVar2 = this.p) != null) {
            bVar2.f(this);
        }
        if ((motionEvent.getAction() == 1 || motionEvent.getAction() == 3) && (bVar = this.p) != null) {
            bVar.e(this);
        }
        return super.onTouchEvent(motionEvent);
    }

    @Override // android.view.View
    public boolean performClick() {
        boolean zPerformClick = super.performClick();
        b bVar = this.p;
        if (bVar != null) {
            bVar.b(this);
        }
        return zPerformClick;
    }

    @Override // android.view.View
    public boolean performLongClick() {
        this.r = true;
        b bVar = this.p;
        if (bVar != null) {
            bVar.c(this);
        }
        return true;
    }

    public void setOnShutterButtonListener(b bVar) {
        this.p = bVar;
    }

    public ShutterButton(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.r = false;
    }

    public ShutterButton(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.r = false;
    }
}
