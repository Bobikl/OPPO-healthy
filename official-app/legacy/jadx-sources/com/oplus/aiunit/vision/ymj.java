package com.oplus.aiunit.vision;

import android.text.Spanned;
import android.text.TextUtils;
import android.view.View;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import io.noties.markwon.ext.tables.R$id;

/* JADX INFO: loaded from: classes10.dex */
public abstract class ymj {

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
            ymj.c(this.i);
            this.i.removeOnAttachStateChangeListener(this);
            this.i.setTag(R$id.markwon_tables_scheduler, null);
        }
    }

    public class b implements xmj.e {
        public final Runnable a = new a();
        public final /* synthetic */ TextView b;

        public class a implements Runnable {
            public a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                TextView textView = b.this.b;
                textView.setText(textView.getText());
            }
        }

        public b(TextView textView) {
            this.b = textView;
        }

        @Override // com.oplus.aiunit.vision.xmj.e
        public void invalidate() {
            this.b.removeCallbacks(this.a);
            this.b.post(this.a);
        }
    }

    @Nullable
    public static Object[] a(@NonNull TextView textView) {
        CharSequence text = textView.getText();
        if (TextUtils.isEmpty(text) || !(text instanceof Spanned)) {
            return null;
        }
        return ((Spanned) text).getSpans(0, text.length(), xmj.class);
    }

    public static void b(@NonNull TextView textView) {
        Object[] objArrA = a(textView);
        if (objArrA == null || objArrA.length <= 0) {
            return;
        }
        int i = R$id.markwon_tables_scheduler;
        if (textView.getTag(i) == null) {
            a aVar = new a(textView);
            textView.addOnAttachStateChangeListener(aVar);
            textView.setTag(i, aVar);
        }
        b bVar = new b(textView);
        for (Object obj : objArrA) {
            ((xmj) obj).f(bVar);
        }
    }

    public static void c(@NonNull TextView textView) {
        Object[] objArrA = a(textView);
        if (objArrA == null || objArrA.length <= 0) {
            return;
        }
        for (Object obj : objArrA) {
            ((xmj) obj).f(null);
        }
    }
}
