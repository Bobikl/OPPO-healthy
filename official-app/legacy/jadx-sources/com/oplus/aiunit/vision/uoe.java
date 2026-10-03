package com.oplus.aiunit.vision;

import android.view.MotionEvent;
import android.view.View;
import com.sensorsdata.analytics.android.autotrack.aop.SensorsDataAutoTrackHelper;
import com.sensorsdata.analytics.android.sdk.SensorsDataInstrumented;

/* JADX INFO: loaded from: classes13.dex */
public class uoe {
    public View a;
    public c b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public float[] f17542c = new float[2];
    public View.OnTouchListener d = new a();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public View.OnClickListener f17543e = new b();

    public class a implements View.OnTouchListener {
        public a() {
        }

        @Override // android.view.View.OnTouchListener
        public boolean onTouch(View view, MotionEvent motionEvent) {
            if (motionEvent.getActionMasked() == 0) {
                uoe.this.f17542c[0] = motionEvent.getX();
                uoe.this.f17542c[1] = motionEvent.getY();
            }
            return false;
        }
    }

    public class b implements View.OnClickListener {
        public b() {
        }

        @Override // android.view.View.OnClickListener
        @SensorsDataInstrumented
        public void onClick(View view) {
            if (we2.c(view.getContext()) || (uoe.this.f17542c[0] == 0.0f && uoe.this.f17542c[1] == 0.0f)) {
                uoe.this.b.onClick(view, view.getWidth() / 2, view.getHeight() / 2);
                SensorsDataAutoTrackHelper.trackViewOnClick(view);
            } else {
                uoe.this.b.onClick(view, Math.round(uoe.this.f17542c[0]), Math.round(uoe.this.f17542c[1]));
                SensorsDataAutoTrackHelper.trackViewOnClick(view);
            }
        }
    }

    public interface c {
        void onClick(View view, int i, int i2);
    }

    public uoe(View view, c cVar) {
        this.a = view;
        this.b = cVar;
    }

    public View c() {
        return this.a;
    }

    public void d() {
        this.a.setOnTouchListener(this.d);
        this.a.setOnClickListener(this.f17543e);
    }

    public void e() {
        this.a.setOnClickListener(null);
        this.a.setOnTouchListener(null);
    }
}
