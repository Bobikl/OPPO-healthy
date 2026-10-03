package com.oplus.aiunit.vision;

import android.view.View;

/* JADX INFO: loaded from: classes13.dex */
public class r30 {

    public class a implements View.OnSystemUiVisibilityChangeListener {
        public final /* synthetic */ t10 i;

        /* JADX INFO: renamed from: com.oplus.aiunit.vision.r30$a$a, reason: collision with other inner class name */
        public class RunnableC0919a implements Runnable {
            public RunnableC0919a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                a.this.i.R(true);
            }
        }

        public a(t10 t10Var) {
            this.i = t10Var;
        }

        @Override // android.view.View.OnSystemUiVisibilityChangeListener
        public void onSystemUiVisibilityChange(int i) {
            this.i.getHandler().post(new RunnableC0919a());
        }
    }

    public void a(t10 t10Var) {
        try {
            t10Var.C().getDecorView().setOnSystemUiVisibilityChangeListener(new a(t10Var));
        } catch (Throwable th) {
            t10Var.b("AndroidApplication", "Can't create OnSystemUiVisibilityChangeListener, unable to use immersive mode.", th);
        }
    }
}
