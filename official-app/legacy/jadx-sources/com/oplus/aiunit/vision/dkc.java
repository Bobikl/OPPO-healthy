package com.oplus.aiunit.vision;

import android.annotation.SuppressLint;
import android.view.MotionEvent;
import android.view.View;

/* JADX INFO: loaded from: classes15.dex */
public class dkc {

    public static class a {
        public View a;
        public final dkc b = new dkc();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final fkc f10601c = new fkc();

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ boolean c(View view, MotionEvent motionEvent) {
            int action = motionEvent.getAction();
            if (action == 0) {
                a7b.f("NearPressFeedbackHelper", "MotionEvent.ACTION_DOWN");
                this.f10601c.l(view);
                return false;
            }
            if (action == 1) {
                a7b.f("NearPressFeedbackHelper", "MotionEvent.ACTION_UP");
                this.f10601c.m(view);
                return false;
            }
            if (action != 3) {
                return false;
            }
            a7b.f("NearPressFeedbackHelper", "MotionEvent.ACTION_CANCEL");
            this.f10601c.k(view);
            return false;
        }

        @SuppressLint({"ClickableViewAccessibility"})
        public dkc b() {
            this.a.setOnTouchListener(new View.OnTouchListener() { // from class: com.oplus.aiunit.vision.ckc
                @Override // android.view.View.OnTouchListener
                public final boolean onTouch(View view, MotionEvent motionEvent) {
                    return this.i.c(view, motionEvent);
                }
            });
            return this.b;
        }

        public a d(View view) {
            this.a = view;
            return this;
        }
    }

    public dkc() {
    }
}
