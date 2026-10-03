package com.oplus.aiunit.vision;

import android.annotation.SuppressLint;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.core.view.GestureDetectorCompat;

/* JADX INFO: loaded from: classes13.dex */
public class c9b {
    public static final int CLICK_EVENT = 1;
    public static final int LONG_CLICK_EVENT = 2;
    public View a;
    public Runnable b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public GestureDetectorCompat f10003c;
    public View.OnTouchListener f;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Handler f10004e = new b(Looper.getMainLooper());
    public GestureDetector.OnGestureListener d = new a();

    public class a extends GestureDetector.SimpleOnGestureListener {
        public a() {
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
        public void onLongPress(MotionEvent motionEvent) {
            super.onLongPress(motionEvent);
            c9b.this.f10004e.sendEmptyMessage(2);
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
        public boolean onSingleTapUp(MotionEvent motionEvent) {
            c9b.this.f10004e.sendEmptyMessage(1);
            return true;
        }
    }

    public class b extends Handler {
        public b(Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public void handleMessage(@NonNull Message message) {
            super.handleMessage(message);
            int i = message.what;
            if (i == 1) {
                c9b.this.b.run();
            } else if (i == 2 && c9b.this.a.isEnabled()) {
                c9b.this.b.run();
                sendEmptyMessageDelayed(2, 100L);
            }
        }
    }

    public c9b(View view, Runnable runnable) {
        this.a = view;
        this.b = runnable;
        this.f10003c = new GestureDetectorCompat(this.a.getContext(), this.d);
        e();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ boolean f(View view, MotionEvent motionEvent) {
        View.OnTouchListener onTouchListener = this.f;
        if (onTouchListener != null) {
            onTouchListener.onTouch(view, motionEvent);
        }
        this.f10003c.onTouchEvent(motionEvent);
        if (motionEvent.getActionMasked() == 3 || motionEvent.getActionMasked() == 1) {
            this.f10004e.removeMessages(2);
        }
        return true;
    }

    @SuppressLint({"ClickableViewAccessibility"})
    public final void e() {
        this.a.setOnTouchListener(new View.OnTouchListener() { // from class: com.oplus.aiunit.vision.b9b
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                return this.i.f(view, motionEvent);
            }
        });
    }

    public void g() {
        this.f10004e.removeCallbacksAndMessages(null);
        this.f10004e = null;
        View view = this.a;
        if (view != null) {
            view.setOnTouchListener(null);
            this.a.removeCallbacks(this.b);
            this.a = null;
        }
        this.b = null;
        this.f = null;
    }

    public void setOnTouchListener(View.OnTouchListener onTouchListener) {
        this.f = onTouchListener;
    }
}
