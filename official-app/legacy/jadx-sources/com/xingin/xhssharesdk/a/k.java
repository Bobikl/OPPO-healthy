package com.xingin.xhssharesdk.a;

import com.oplus.aiunit.vision.e9n;
import com.oplus.aiunit.vision.k7n;
import com.oplus.aiunit.vision.pzm;
import com.xingin.xhssharesdk.a.k;
import com.xingin.xhssharesdk.a.k.a;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.charset.Charset;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes10.dex */
public abstract class k<MessageType extends k<MessageType, BuilderType>, BuilderType extends a<MessageType, BuilderType>> extends com.xingin.xhssharesdk.a.a<MessageType, BuilderType> {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public e9n f20426j = e9n.d;
    public int k = -1;

    public static abstract class a<MessageType extends k<MessageType, BuilderType>, BuilderType extends a<MessageType, BuilderType>> extends com.xingin.xhssharesdk.a.a.AbstractC1016a<MessageType, BuilderType> {
        public final MessageType i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public MessageType f20427j;
        public boolean k = false;

        public a(MessageType messagetype) {
            this.i = messagetype;
            this.f20427j = (MessageType) messagetype.b(h.f20430e);
        }

        public final BuilderType b(MessageType messagetype) {
            f();
            this.f20427j.e(g.a, messagetype);
            return this;
        }

        @Override // com.oplus.aiunit.vision.k7n
        public final k c() {
            return this.i;
        }

        public final Object clone() {
            a aVar = (a) this.i.b(h.f);
            if (!this.k) {
                this.f20427j.g();
                this.k = true;
            }
            aVar.b(this.f20427j);
            return aVar;
        }

        public final MessageType e() {
            if (!this.k) {
                this.f20427j.g();
                this.k = true;
            }
            MessageType messagetype = this.f20427j;
            if (messagetype.f()) {
                return messagetype;
            }
            throw new y();
        }

        public final void f() {
            if (this.k) {
                MessageType messagetype = (MessageType) this.f20427j.b(h.f20430e);
                messagetype.e(g.a, this.f20427j);
                this.f20427j = messagetype;
                this.k = false;
            }
        }
    }

    public static class b<T extends k<T, ?>> extends com.xingin.xhssharesdk.a.b<T> {
        public final T a;

        public b(T t) {
            this.a = t;
        }

        @Override // com.oplus.aiunit.vision.v8n
        public final k a(com.xingin.xhssharesdk.a.c cVar, pzm pzmVar) throws m {
            k kVar = (k) this.a.b(h.f20430e);
            try {
                kVar.c(h.f20429c, cVar, pzmVar);
                kVar.g();
                return kVar;
            } catch (RuntimeException e2) {
                if (e2.getCause() instanceof m) {
                    throw ((m) e2.getCause());
                }
                throw e2;
            }
        }
    }

    public static class c implements i {
        public static final c a = new c();
        public static final a b = new a();

        public static final class a extends RuntimeException {
        }

        @Override // com.xingin.xhssharesdk.a.k.i
        public final com.xingin.xhssharesdk.a.d<e> a(com.xingin.xhssharesdk.a.d<e> dVar, com.xingin.xhssharesdk.a.d<e> dVar2) {
            if (dVar.equals(dVar2)) {
                return dVar;
            }
            throw b;
        }

        @Override // com.xingin.xhssharesdk.a.k.i
        public final l b(k kVar, k kVar2) {
            if (kVar == null && kVar2 == null) {
                return null;
            }
            if (kVar == null || kVar2 == null) {
                throw b;
            }
            if (kVar != kVar2 && ((k) kVar.b(h.g)).getClass().isInstance(kVar2)) {
                kVar.e(this, kVar2);
            }
            return kVar;
        }

        @Override // com.xingin.xhssharesdk.a.k.i
        public final String c(boolean z, String str, boolean z2, String str2) {
            if (z == z2 && str.equals(str2)) {
                return str;
            }
            throw b;
        }

        @Override // com.xingin.xhssharesdk.a.k.i
        public final <K, V> q<K, V> d(q<K, V> qVar, q<K, V> qVar2) {
            if (qVar.equals(qVar2)) {
                return qVar;
            }
            throw b;
        }

        @Override // com.xingin.xhssharesdk.a.k.i
        public final e9n e(e9n e9nVar, e9n e9nVar2) {
            if (e9nVar.equals(e9nVar2)) {
                return e9nVar;
            }
            throw b;
        }

        @Override // com.xingin.xhssharesdk.a.k.i
        public final long f(boolean z, long j2, boolean z2, long j3) {
            if (z == z2 && j2 == j3) {
                return j2;
            }
            throw b;
        }

        @Override // com.xingin.xhssharesdk.a.k.i
        public final int g(boolean z, int i, boolean z2, int i2) {
            if (z == z2 && i == i2) {
                return i;
            }
            throw b;
        }
    }

    public static abstract class d<MessageType extends d<MessageType, BuilderType>, BuilderType> extends k<MessageType, BuilderType> implements k7n {

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public com.xingin.xhssharesdk.a.d<e> f20428l = com.xingin.xhssharesdk.a.d.i();

        @Override // com.xingin.xhssharesdk.a.k, com.oplus.aiunit.vision.k7n
        public final k c() {
            return (k) b(h.g);
        }

        @Override // com.xingin.xhssharesdk.a.k, com.xingin.xhssharesdk.a.l
        public final /* bridge */ /* synthetic */ a d() {
            return d();
        }

        @Override // com.xingin.xhssharesdk.a.k
        public final void e(i iVar, k kVar) {
            d dVar = (d) kVar;
            super.e(iVar, dVar);
            this.f20428l = iVar.a(this.f20428l, dVar.f20428l);
        }

        @Override // com.xingin.xhssharesdk.a.k
        public final void g() {
            super.g();
            this.f20428l.h();
        }
    }

    public static final class e implements com.xingin.xhssharesdk.a.d.a<e> {
        @Override // com.xingin.xhssharesdk.a.d.a
        public final void a() {
        }

        @Override // com.xingin.xhssharesdk.a.d.a
        public final void b() {
        }

        @Override // com.xingin.xhssharesdk.a.d.a
        public final c0.b c() {
            throw null;
        }

        @Override // java.lang.Comparable
        public final int compareTo(Object obj) {
            ((e) obj).getClass();
            return 0;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.xingin.xhssharesdk.a.d.a
        public final a k(l.a aVar, l lVar) {
            return ((a) aVar).b((k) lVar);
        }
    }

    public static class f implements i {
        public int a = 0;

        @Override // com.xingin.xhssharesdk.a.k.i
        public final com.xingin.xhssharesdk.a.d<e> a(com.xingin.xhssharesdk.a.d<e> dVar, com.xingin.xhssharesdk.a.d<e> dVar2) {
            this.a = dVar.a.hashCode() + (this.a * 53);
            return dVar;
        }

        @Override // com.xingin.xhssharesdk.a.k.i
        public final l b(k kVar, k kVar2) {
            int i;
            if (kVar != null) {
                if (kVar.i == 0) {
                    int i2 = this.a;
                    this.a = 0;
                    kVar.e(this, kVar);
                    kVar.i = this.a;
                    this.a = i2;
                }
                i = kVar.i;
            } else {
                i = 37;
            }
            this.a = (this.a * 53) + i;
            return kVar;
        }

        @Override // com.xingin.xhssharesdk.a.k.i
        public final String c(boolean z, String str, boolean z2, String str2) {
            this.a = str.hashCode() + (this.a * 53);
            return str;
        }

        @Override // com.xingin.xhssharesdk.a.k.i
        public final <K, V> q<K, V> d(q<K, V> qVar, q<K, V> qVar2) {
            this.a = qVar.hashCode() + (this.a * 53);
            return qVar;
        }

        @Override // com.xingin.xhssharesdk.a.k.i
        public final e9n e(e9n e9nVar, e9n e9nVar2) {
            this.a = e9nVar.hashCode() + (this.a * 53);
            return e9nVar;
        }

        @Override // com.xingin.xhssharesdk.a.k.i
        public final long f(boolean z, long j2, boolean z2, long j3) {
            int i = this.a * 53;
            Charset charset = com.xingin.xhssharesdk.a.f.a;
            this.a = i + ((int) ((j2 >>> 32) ^ j2));
            return j2;
        }

        @Override // com.xingin.xhssharesdk.a.k.i
        public final int g(boolean z, int i, boolean z2, int i2) {
            this.a = (this.a * 53) + i;
            return i;
        }
    }

    public static class g implements i {
        public static final g a = new g();

        @Override // com.xingin.xhssharesdk.a.k.i
        public final com.xingin.xhssharesdk.a.d<e> a(com.xingin.xhssharesdk.a.d<e> dVar, com.xingin.xhssharesdk.a.d<e> dVar2) {
            if (dVar.b) {
                dVar = dVar.clone();
            }
            for (int i = 0; i < dVar2.a.f20431j.size(); i++) {
                dVar.g(dVar2.a.f20431j.get(i));
            }
            o oVar = dVar2.a;
            Iterator it = (oVar.k.isEmpty() ? p.a.b : oVar.k.entrySet()).iterator();
            while (it.hasNext()) {
                dVar.g((Map.Entry) it.next());
            }
            return dVar;
        }

        @Override // com.xingin.xhssharesdk.a.k.i
        public final l b(k kVar, k kVar2) {
            if (kVar == null || kVar2 == null) {
                return kVar != null ? kVar : kVar2;
            }
            a aVarD = kVar.d();
            aVarD.getClass();
            if (aVarD.i.getClass().isInstance(kVar2)) {
                return aVarD.b(kVar2).e();
            }
            throw new IllegalArgumentException("mergeFrom(MessageLite) can only merge messages of the same type.");
        }

        @Override // com.xingin.xhssharesdk.a.k.i
        public final String c(boolean z, String str, boolean z2, String str2) {
            return z2 ? str2 : str;
        }

        @Override // com.xingin.xhssharesdk.a.k.i
        public final <K, V> q<K, V> d(q<K, V> qVar, q<K, V> qVar2) {
            if (!qVar2.isEmpty()) {
                if (!qVar.a) {
                    qVar = qVar.isEmpty() ? new q<>() : new q<>(qVar);
                }
                qVar.a(qVar2);
            }
            return qVar;
        }

        @Override // com.xingin.xhssharesdk.a.k.i
        public final e9n e(e9n e9nVar, e9n e9nVar2) {
            return e9nVar2 == e9n.d ? e9nVar : e9n.a(e9nVar, e9nVar2);
        }

        @Override // com.xingin.xhssharesdk.a.k.i
        public final long f(boolean z, long j2, boolean z2, long j3) {
            return z2 ? j3 : j2;
        }

        @Override // com.xingin.xhssharesdk.a.k.i
        public final int g(boolean z, int i, boolean z2, int i2) {
            return z2 ? i2 : i;
        }
    }

    public enum h {
        a,
        b,
        f20429c,
        d,
        f20430e,
        f,
        g,
        h;

        h() {
        }
    }

    public interface i {
        com.xingin.xhssharesdk.a.d<e> a(com.xingin.xhssharesdk.a.d<e> dVar, com.xingin.xhssharesdk.a.d<e> dVar2);

        l b(k kVar, k kVar2);

        String c(boolean z, String str, boolean z2, String str2);

        <K, V> q<K, V> d(q<K, V> qVar, q<K, V> qVar2);

        e9n e(e9n e9nVar, e9n e9nVar2);

        long f(boolean z, long j2, boolean z2, long j3);

        int g(boolean z, int i, boolean z2, int i2);
    }

    public static Object d(Method method, Object obj, Object... objArr) {
        try {
            return method.invoke(obj, objArr);
        } catch (IllegalAccessException e2) {
            throw new RuntimeException("Couldn't use Java reflection to implement protocol message reflection.", e2);
        } catch (InvocationTargetException e3) {
            Throwable cause = e3.getCause();
            if (cause instanceof RuntimeException) {
                throw ((RuntimeException) cause);
            }
            if (cause instanceof Error) {
                throw ((Error) cause);
            }
            throw new RuntimeException("Unexpected exception thrown by generated accessor method.", cause);
        }
    }

    public final Object b(h hVar) {
        return c(hVar, null, null);
    }

    @Override // com.oplus.aiunit.vision.k7n
    public k c() {
        return (k) b(h.g);
    }

    public abstract Object c(h hVar, Object obj, Object obj2);

    public void e(i iVar, MessageType messagetype) {
        c(h.b, iVar, messagetype);
        this.f20426j = iVar.e(this.f20426j, messagetype.f20426j);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!((k) b(h.g)).getClass().isInstance(obj)) {
            return false;
        }
        try {
            e(c.a, (k) obj);
            return true;
        } catch (c.a unused) {
            return false;
        }
    }

    public final boolean f() {
        return c(h.a, Boolean.TRUE, null) != null;
    }

    public void g() {
        b(h.d);
        this.f20426j.getClass();
    }

    @Override // com.xingin.xhssharesdk.a.l
    /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
    public final BuilderType d() {
        BuilderType buildertype = (BuilderType) b(h.f);
        buildertype.b(this);
        return buildertype;
    }

    public final int hashCode() {
        if (this.i == 0) {
            f fVar = new f();
            e(fVar, this);
            this.i = fVar.a;
        }
        return this.i;
    }

    public final String toString() {
        String string = super.toString();
        StringBuilder sb = new StringBuilder();
        sb.append("# ");
        sb.append(string);
        n.a(this, sb, 0);
        return sb.toString();
    }
}
