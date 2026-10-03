package autodispose2;

import com.oplus.aiunit.vision.ds3;
import com.oplus.aiunit.vision.ev5;
import com.oplus.aiunit.vision.l6h;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes12.dex */
public final class c<T> implements l6h, io.reactivex.rxjava3.disposables.a {
    public final AtomicReference<io.reactivex.rxjava3.disposables.a> i = new AtomicReference<>();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final AtomicReference<io.reactivex.rxjava3.disposables.a> f353j = new AtomicReference<>();
    public final ds3 k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final l6h<? super T> f354l;

    public class a extends ev5 {
        public a() {
        }

        @Override // com.oplus.aiunit.vision.as3
        public void onComplete() {
            c.this.f353j.lazySet(AutoDisposableHelper.DISPOSED);
            AutoDisposableHelper.dispose(c.this.i);
        }

        @Override // com.oplus.aiunit.vision.as3
        public void onError(Throwable th) {
            c.this.f353j.lazySet(AutoDisposableHelper.DISPOSED);
            c.this.onError(th);
        }
    }

    public c(ds3 ds3Var, l6h<? super T> l6hVar) {
        this.k = ds3Var;
        this.f354l = l6hVar;
    }

    @Override // io.reactivex.rxjava3.disposables.a
    public void dispose() {
        AutoDisposableHelper.dispose(this.f353j);
        AutoDisposableHelper.dispose(this.i);
    }

    @Override // io.reactivex.rxjava3.disposables.a
    public boolean isDisposed() {
        return this.i.get() == AutoDisposableHelper.DISPOSED;
    }

    @Override // com.oplus.aiunit.vision.l6h
    public void onError(Throwable th) {
        if (isDisposed()) {
            return;
        }
        this.i.lazySet(AutoDisposableHelper.DISPOSED);
        AutoDisposableHelper.dispose(this.f353j);
        this.f354l.onError(th);
    }

    @Override // com.oplus.aiunit.vision.l6h
    public void onSubscribe(io.reactivex.rxjava3.disposables.a aVar) {
        a aVar2 = new a();
        if (autodispose2.a.d(this.f353j, aVar2, c.class)) {
            this.f354l.onSubscribe(this);
            this.k.a(aVar2);
            autodispose2.a.d(this.i, aVar, c.class);
        }
    }

    @Override // com.oplus.aiunit.vision.l6h
    public void onSuccess(T t) {
        if (isDisposed()) {
            return;
        }
        this.i.lazySet(AutoDisposableHelper.DISPOSED);
        AutoDisposableHelper.dispose(this.f353j);
        this.f354l.onSuccess(t);
    }
}
