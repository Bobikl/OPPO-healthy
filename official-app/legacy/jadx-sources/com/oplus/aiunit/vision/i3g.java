package com.oplus.aiunit.vision;

import io.reactivex.rxjava3.subjects.PublishSubject;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/* JADX INFO: loaded from: classes15.dex */
@Deprecated
public class i3g {
    public final s2j<Object> a;
    public final s2j<Object> b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final s2j<Object> f12372c;
    public ConcurrentMap<String, Object> d;

    public class a implements d08<m3g, Object> {
        public a() {
        }

        @Override // com.oplus.aiunit.vision.d08
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Object apply(m3g m3gVar) throws Exception {
            return m3gVar.a();
        }
    }

    public class b implements mpe<m3g> {
        public final /* synthetic */ String i;

        public b(String str) {
            this.i = str;
        }

        @Override // com.oplus.aiunit.vision.mpe
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public boolean test(m3g m3gVar) throws Exception {
            return m3gVar.b().equals(this.i);
        }
    }

    public class c implements d08<Object, m3g> {
        public c() {
        }

        @Override // com.oplus.aiunit.vision.d08
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public m3g apply(Object obj) throws Exception {
            return (m3g) obj;
        }
    }

    public static final class d {
        public static final i3g a = new i3g();
    }

    public static i3g b() {
        return d.a;
    }

    public void a(String str) {
        this.d.remove(str);
    }

    public boolean c(String str) {
        return this.d.get(str) != null;
    }

    public io.reactivex.rxjava3.disposables.a d(String str, n3g<Object> n3gVar) {
        io.reactivex.rxjava3.disposables.a aVar = (io.reactivex.rxjava3.disposables.a) b().f(this.b, str).M0(n3gVar);
        Object obj = this.d.get(str);
        if (obj != null) {
            this.b.onNext(obj);
        }
        return aVar;
    }

    public void e(m3g m3gVar) {
        if (m3gVar == null || m3gVar.a() == null || m3gVar.a() == null) {
            return;
        }
        this.d.put(m3gVar.b(), m3gVar);
    }

    public final lbd<Object> f(s2j<Object> s2jVar, String str) {
        return s2jVar.j0(new c()).P(new b(str)).j0(new a());
    }

    public i3g() {
        this.d = new ConcurrentHashMap();
        this.a = PublishSubject.v1().t1();
        this.b = PublishSubject.v1().t1();
        this.f12372c = PublishSubject.v1().t1();
    }
}
