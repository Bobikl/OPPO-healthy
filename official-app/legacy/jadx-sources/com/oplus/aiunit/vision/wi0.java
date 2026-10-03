package com.oplus.aiunit.vision;

import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Looper;
import android.os.SystemClock;
import android.text.Spanned;
import android.view.View;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import io.noties.markwon.R$id;

/* JADX INFO: loaded from: classes10.dex */
public abstract class wi0 {

    public class a implements View.OnAttachStateChangeListener {
        public final /* synthetic */ TextView i;

        public a(TextView textView) {
            this.i = textView;
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View view) {
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
            wi0.c(this.i);
            view.removeOnAttachStateChangeListener(this);
            view.setTag(R$id.markwon_drawables_scheduler, null);
        }
    }

    public static class b implements Drawable.Callback {
        public final TextView i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final InterfaceC0940b f18269j;
        public Rect k;

        public class a implements Runnable {
            public final /* synthetic */ Drawable i;

            public a(Drawable drawable) {
                this.i = drawable;
            }

            @Override // java.lang.Runnable
            public void run() {
                b.this.invalidateDrawable(this.i);
            }
        }

        /* JADX INFO: renamed from: com.oplus.aiunit.vision.wi0$b$b, reason: collision with other inner class name */
        public interface InterfaceC0940b {
            void invalidate();
        }

        public b(@NonNull TextView textView, @NonNull InterfaceC0940b interfaceC0940b, Rect rect) {
            this.i = textView;
            this.f18269j = interfaceC0940b;
            this.k = new Rect(rect);
        }

        @Override // android.graphics.drawable.Drawable.Callback
        public void invalidateDrawable(@NonNull Drawable drawable) {
            if (Looper.myLooper() != Looper.getMainLooper()) {
                this.i.post(new a(drawable));
                return;
            }
            Rect bounds = drawable.getBounds();
            if (this.k.equals(bounds)) {
                this.i.postInvalidate();
            } else {
                this.f18269j.invalidate();
                this.k = new Rect(bounds);
            }
        }

        @Override // android.graphics.drawable.Drawable.Callback
        public void scheduleDrawable(@NonNull Drawable drawable, @NonNull Runnable runnable, long j2) {
            this.i.postDelayed(runnable, j2 - SystemClock.uptimeMillis());
        }

        @Override // android.graphics.drawable.Drawable.Callback
        public void unscheduleDrawable(@NonNull Drawable drawable, @NonNull Runnable runnable) {
            this.i.removeCallbacks(runnable);
        }
    }

    public static class c implements b.InterfaceC0940b, Runnable {
        public final TextView i;

        public c(@NonNull TextView textView) {
            this.i = textView;
        }

        @Override // com.oplus.aiunit.vision.wi0.b.InterfaceC0940b
        public void invalidate() {
            this.i.removeCallbacks(this);
            this.i.post(this);
        }

        @Override // java.lang.Runnable
        public void run() {
            TextView textView = this.i;
            textView.setText(textView.getText());
        }
    }

    @Nullable
    public static xi0[] a(@NonNull TextView textView) {
        CharSequence text = textView.getText();
        int length = text != null ? text.length() : 0;
        if (length == 0 || !(text instanceof Spanned)) {
            return null;
        }
        return (xi0[]) ((Spanned) text).getSpans(0, length, xi0.class);
    }

    public static void b(@NonNull TextView textView) {
        int i = R$id.markwon_drawables_scheduler_last_text_hashcode;
        Integer num = (Integer) textView.getTag(i);
        int iHashCode = textView.getText().hashCode();
        if (num == null || num.intValue() != iHashCode) {
            textView.setTag(i, Integer.valueOf(iHashCode));
            xi0[] xi0VarArrA = a(textView);
            if (xi0VarArrA == null || xi0VarArrA.length <= 0) {
                return;
            }
            int i2 = R$id.markwon_drawables_scheduler;
            if (textView.getTag(i2) == null) {
                a aVar = new a(textView);
                textView.addOnAttachStateChangeListener(aVar);
                textView.setTag(i2, aVar);
            }
            c cVar = new c(textView);
            for (xi0 xi0Var : xi0VarArrA) {
                ti0 ti0VarA = xi0Var.a();
                ti0VarA.l(new b(textView, cVar, ti0VarA.getBounds()));
            }
        }
    }

    public static void c(@NonNull TextView textView) {
        int i = R$id.markwon_drawables_scheduler_last_text_hashcode;
        if (textView.getTag(i) == null) {
            return;
        }
        textView.setTag(i, null);
        xi0[] xi0VarArrA = a(textView);
        if (xi0VarArrA == null || xi0VarArrA.length <= 0) {
            return;
        }
        for (xi0 xi0Var : xi0VarArrA) {
            xi0Var.a().l(null);
        }
    }
}
