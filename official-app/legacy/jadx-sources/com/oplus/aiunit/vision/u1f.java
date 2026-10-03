package com.oplus.aiunit.vision;

import android.content.Context;
import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
import androidx.core.content.ContextCompat;
import com.heytap.health.base.R$color;

/* JADX INFO: loaded from: classes15.dex */
public class u1f {
    public d a;
    public e b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public ClickableSpan f17255c;
    public ClickableSpan d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public ClickableSpan f17256e;

    public class a extends ClickableSpan {
        public a() {
        }

        @Override // android.text.style.ClickableSpan
        public void onClick(View view) {
            if (u1f.this.b != null) {
                u1f.this.b.f();
            }
        }

        @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
        public void updateDrawState(TextPaint textPaint) {
            super.updateDrawState(textPaint);
            textPaint.setColor(ContextCompat.getColor(b78.a(), R$color.lib_base_colorPrimary));
            textPaint.setUnderlineText(false);
        }
    }

    public class b extends ClickableSpan {
        public b() {
        }

        @Override // android.text.style.ClickableSpan
        public void onClick(View view) {
            if (u1f.this.a != null) {
                u1f.this.a.b();
            }
            if (u1f.this.b != null) {
                u1f.this.b.b();
            }
        }

        @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
        public void updateDrawState(TextPaint textPaint) {
            super.updateDrawState(textPaint);
            textPaint.setColor(ContextCompat.getColor(b78.a(), R$color.lib_base_colorPrimary));
            textPaint.setUnderlineText(false);
        }
    }

    public class c extends ClickableSpan {
        public c() {
        }

        @Override // android.text.style.ClickableSpan
        public void onClick(View view) {
            if (u1f.this.a != null) {
                u1f.this.a.c();
            }
            if (u1f.this.b != null) {
                u1f.this.b.c();
            }
        }

        @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
        public void updateDrawState(TextPaint textPaint) {
            super.updateDrawState(textPaint);
            textPaint.setColor(ContextCompat.getColor(b78.a(), R$color.lib_base_colorPrimary));
            textPaint.setUnderlineText(false);
        }
    }

    public interface d {
        void b();

        void c();
    }

    public interface e {
        void b();

        void c();

        void f();
    }

    public u1f(Context context, d dVar) {
        f(context);
        this.a = dVar;
    }

    public ClickableSpan c() {
        return this.f17255c;
    }

    public ClickableSpan d() {
        return this.f17256e;
    }

    public ClickableSpan e() {
        return this.d;
    }

    public final void f(Context context) {
        this.f17255c = new a();
        this.d = new b();
        this.f17256e = new c();
    }

    public void setProtocolListener(e eVar) {
        this.b = eVar;
    }

    public void setProtocolListener(d dVar) {
        this.a = dVar;
    }

    public u1f(Context context, e eVar) {
        f(context);
        this.b = eVar;
    }
}
