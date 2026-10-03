package com.oplus.aiunit.vision;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import java.util.Queue;

/* JADX INFO: loaded from: classes13.dex */
public class k2c<A, B> {
    public final pbb<b<A>, B> a;

    public class a extends pbb<b<A>, B> {
        public a(long j2) {
            super(j2);
        }

        @Override // com.oplus.aiunit.vision.pbb
        /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
        public void i(@NonNull b<A> bVar, @Nullable B b) {
            bVar.c();
        }
    }

    @VisibleForTesting
    public static final class b<A> {
        public static final Queue<b<?>> d = uqk.g(0);
        public int a;
        public int b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public A f13133c;

        public static <A> b<A> a(A a, int i, int i2) {
            b<A> bVar;
            Queue<b<?>> queue = d;
            synchronized (queue) {
                bVar = (b) queue.poll();
            }
            if (bVar == null) {
                bVar = new b<>();
            }
            bVar.b(a, i, i2);
            return bVar;
        }

        public final void b(A a, int i, int i2) {
            this.f13133c = a;
            this.b = i;
            this.a = i2;
        }

        public void c() {
            Queue<b<?>> queue = d;
            synchronized (queue) {
                queue.offer(this);
            }
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return this.b == bVar.b && this.a == bVar.a && this.f13133c.equals(bVar.f13133c);
        }

        public int hashCode() {
            return (((this.a * 31) + this.b) * 31) + this.f13133c.hashCode();
        }
    }

    public k2c(long j2) {
        this.a = new a(j2);
    }

    @Nullable
    public B a(A a2, int i, int i2) {
        b<A> bVarA = b.a(a2, i, i2);
        B bF = this.a.f(bVarA);
        bVarA.c();
        return bF;
    }

    public void b(A a2, int i, int i2, B b2) {
        this.a.j(b.a(a2, i, i2), b2);
    }
}
