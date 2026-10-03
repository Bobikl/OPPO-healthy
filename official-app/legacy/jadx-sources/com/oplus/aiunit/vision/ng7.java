package com.oplus.aiunit.vision;

import android.app.Activity;
import android.view.View;
import android.view.ViewTreeObserver;
import androidx.annotation.RequiresApi;
import java.util.Collections;
import java.util.Set;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes13.dex */
@RequiresApi(26)
public final class ng7 implements xy7 {
    public final Set<Activity> a = Collections.newSetFromMap(new WeakHashMap());
    public volatile boolean b;

    public class a implements ViewTreeObserver.OnDrawListener {
        public final /* synthetic */ View i;

        /* JADX INFO: renamed from: com.oplus.aiunit.vision.ng7$a$a, reason: collision with other inner class name */
        public class RunnableC0904a implements Runnable {
            public final /* synthetic */ ViewTreeObserver.OnDrawListener i;

            public RunnableC0904a(ViewTreeObserver.OnDrawListener onDrawListener) {
                this.i = onDrawListener;
            }

            @Override // java.lang.Runnable
            public void run() {
                jh8.b().h();
                ng7.this.b = true;
                ng7.b(a.this.i, this.i);
                ng7.this.a.clear();
            }
        }

        public a(View view) {
            this.i = view;
        }

        @Override // android.view.ViewTreeObserver.OnDrawListener
        public void onDraw() {
            uqk.w(new RunnableC0904a(this));
        }
    }

    public static void b(View view, ViewTreeObserver.OnDrawListener onDrawListener) {
        view.getViewTreeObserver().removeOnDrawListener(onDrawListener);
    }

    @Override // com.oplus.aiunit.vision.xy7
    public void a(Activity activity) {
        if (!this.b && this.a.add(activity)) {
            View decorView = activity.getWindow().getDecorView();
            decorView.getViewTreeObserver().addOnDrawListener(new a(decorView));
        }
    }
}
