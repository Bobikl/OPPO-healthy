package com.oplus.aiunit.vision;

import android.graphics.Paint;
import androidx.annotation.ColorInt;
import androidx.annotation.NonNull;
import androidx.annotation.Px;

/* JADX INFO: loaded from: classes10.dex */
public class bnj {
    public final int a;
    public final int b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f9796c;
    public final int d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f9797e;
    public final int f;

    public static class a {
        public int a;
        public int b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f9798c = -1;
        public int d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int f9799e;
        public int f;

        @NonNull
        public bnj g() {
            return new bnj(this);
        }

        @NonNull
        public a h(@ColorInt int i) {
            this.b = i;
            return this;
        }

        @NonNull
        public a i(@Px int i) {
            this.f9798c = i;
            return this;
        }

        @NonNull
        public a j(@Px int i) {
            this.a = i;
            return this;
        }

        @NonNull
        public a k(@ColorInt int i) {
            this.f9799e = i;
            return this;
        }

        @NonNull
        public a l(@ColorInt int i) {
            this.f = i;
            return this;
        }

        @NonNull
        public a m(@ColorInt int i) {
            this.d = i;
            return this;
        }
    }

    public bnj(@NonNull a aVar) {
        this.a = aVar.a;
        this.b = aVar.b;
        this.f9796c = aVar.f9798c;
        this.d = aVar.d;
        this.f9797e = aVar.f9799e;
        this.f = aVar.f;
    }

    public void a(@NonNull Paint paint) {
        int iA = this.b;
        if (iA == 0) {
            iA = kl3.a(paint.getColor(), 75);
        }
        paint.setColor(iA);
        paint.setStyle(Paint.Style.FILL);
    }

    public void b(@NonNull Paint paint) {
        paint.setColor(this.f9797e);
        paint.setStyle(Paint.Style.FILL);
    }

    public void c(@NonNull Paint paint) {
        paint.setColor(this.f);
        paint.setStyle(Paint.Style.FILL);
    }

    public void d(@NonNull Paint paint) {
        int iA = this.d;
        if (iA == 0) {
            iA = kl3.a(paint.getColor(), 22);
        }
        paint.setColor(iA);
        paint.setStyle(Paint.Style.FILL);
    }

    public int e(@NonNull Paint paint) {
        int i = this.f9796c;
        return i == -1 ? (int) (paint.getStrokeWidth() + 0.5f) : i;
    }

    public int f() {
        return this.a;
    }
}
