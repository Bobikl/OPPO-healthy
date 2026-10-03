package com.oplus.aiunit.vision;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.LinearSmoothScroller;
import androidx.recyclerview.widget.PagerSnapHelper;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: loaded from: classes2.dex */
public class rn0 implements Handler.Callback {
    public static final int SCORLL = 1;
    public static final long SCORLL_DELAYED = 2000;
    public static final String TAG = "AutoBannerHelper";

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f16267j;
    public boolean k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public c f16268l;
    public RecyclerView m;
    public boolean i = true;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public Handler f16269n = new Handler(Looper.getMainLooper(), this);
    public int o = 0;

    public class a extends LinearLayoutManager {

        /* JADX INFO: renamed from: com.oplus.aiunit.vision.rn0$a$a, reason: collision with other inner class name */
        public class C0926a extends LinearSmoothScroller {
            public C0926a(Context context) {
                super(context);
            }

            @Override // androidx.recyclerview.widget.LinearSmoothScroller
            public float calculateSpeedPerPixel(DisplayMetrics displayMetrics) {
                return 150.0f / displayMetrics.densityDpi;
            }
        }

        public a(Context context, int i, boolean z) {
            super(context, i, z);
        }

        @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
        public void scrollToPosition(int i) {
            super.scrollToPosition(i);
            rn0.this.o = i;
        }

        @Override // androidx.recyclerview.widget.LinearLayoutManager
        public void scrollToPositionWithOffset(int i, int i2) {
            super.scrollToPositionWithOffset(i, i2);
            rn0.this.o = i;
        }

        @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
        public void smoothScrollToPosition(RecyclerView recyclerView, RecyclerView.State state, int i) {
            if (rn0.this.o == 0) {
                super.smoothScrollToPosition(recyclerView, state, i);
                return;
            }
            C0926a c0926a = new C0926a(recyclerView.getContext());
            c0926a.setTargetPosition(i);
            startSmoothScroll(c0926a);
        }
    }

    public class b extends PagerSnapHelper {
        public b() {
        }

        @Override // androidx.recyclerview.widget.PagerSnapHelper, androidx.recyclerview.widget.SnapHelper
        public int findTargetSnapPosition(RecyclerView.LayoutManager layoutManager, int i, int i2) {
            rn0.this.o = super.findTargetSnapPosition(layoutManager, i, i2);
            StringBuilder sb = new StringBuilder();
            sb.append("findTargetSnapPosition position:");
            sb.append(rn0.this.o);
            rn0.this.e();
            return rn0.this.o;
        }
    }

    public interface c {
        void a(int i);
    }

    public rn0(RecyclerView recyclerView) {
        this.m = recyclerView;
        recyclerView.setLayoutManager(new a(recyclerView.getContext(), 0, false));
        new b().attachToRecyclerView(recyclerView);
        recyclerView.setOnTouchListener(new View.OnTouchListener() { // from class: com.oplus.aiunit.vision.qn0
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                return this.i.d(view, motionEvent);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ boolean d(View view, MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            this.f16269n.removeCallbacksAndMessages(null);
            return false;
        }
        if (motionEvent.getAction() != 1 && motionEvent.getAction() != 3) {
            return false;
        }
        this.k = true;
        k(2000L);
        return false;
    }

    public void c(c cVar) {
        this.f16268l = cVar;
    }

    public final void e() {
        c cVar = this.f16268l;
        if (cVar != null) {
            cVar.a(this.o);
        }
    }

    public void f() {
        if (this.i) {
            return;
        }
        this.f16269n.removeCallbacksAndMessages(null);
    }

    public void g() {
        if (this.i) {
            return;
        }
        k(2000L);
    }

    public void h() {
        this.i = true;
        this.f16269n.removeCallbacksAndMessages(null);
        this.f16268l = null;
    }

    @Override // android.os.Handler.Callback
    public boolean handleMessage(@NonNull Message message) {
        RecyclerView.Adapter adapter = this.m.getAdapter();
        if (adapter == null || (this.f16267j && this.k)) {
            return true;
        }
        int itemCount = adapter.getItemCount();
        int i = this.o + 1;
        this.o = i;
        if (i >= itemCount) {
            this.o = 0;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("handleMessage position:");
        sb.append(this.o);
        this.m.smoothScrollToPosition(this.o);
        e();
        k(2000L);
        return true;
    }

    public void i() {
        this.i = false;
    }

    public void j(boolean z) {
        this.f16267j = z;
    }

    public void k(long j2) {
        i();
        this.f16269n.removeCallbacksAndMessages(null);
        this.f16269n.sendEmptyMessageDelayed(1, j2);
    }
}
