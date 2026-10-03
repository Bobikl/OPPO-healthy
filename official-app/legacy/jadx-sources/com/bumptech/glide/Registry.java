package com.bumptech.glide;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.util.Pools;
import com.bumptech.glide.load.ImageHeaderParser;
import com.bumptech.glide.load.engine.i;
import com.oplus.aiunit.vision.bn6;
import com.oplus.aiunit.vision.btf;
import com.oplus.aiunit.vision.ctf;
import com.oplus.aiunit.vision.etf;
import com.oplus.aiunit.vision.ftf;
import com.oplus.aiunit.vision.im6;
import com.oplus.aiunit.vision.j3b;
import com.oplus.aiunit.vision.mtf;
import com.oplus.aiunit.vision.n2c;
import com.oplus.aiunit.vision.n9k;
import com.oplus.aiunit.vision.o2c;
import com.oplus.aiunit.vision.p2c;
import com.oplus.aiunit.vision.usf;
import com.oplus.aiunit.vision.w3a;
import com.oplus.aiunit.vision.x07;
import com.oplus.aiunit.vision.x2c;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes13.dex */
public class Registry {
    public static final String BUCKET_ANIMATION = "Animation";
    public static final String BUCKET_BITMAP = "Bitmap";
    public static final String BUCKET_BITMAP_DRAWABLE = "BitmapDrawable";

    @Deprecated
    public static final String BUCKET_GIF = "Animation";
    public final p2c a;
    public final bn6 b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ctf f1343c;
    public final ftf d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final com.bumptech.glide.load.data.b f1344e;
    public final n9k f;
    public final w3a g;
    public final x2c h = new x2c();
    public final j3b i = new j3b();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final Pools.Pool<List<Throwable>> f1345j;

    public static class MissingComponentException extends RuntimeException {
        public MissingComponentException(@NonNull String str) {
            super(str);
        }
    }

    public static final class NoImageHeaderParserException extends MissingComponentException {
        public NoImageHeaderParserException() {
            super("Failed to find image header parser.");
        }
    }

    public static class NoModelLoaderAvailableException extends MissingComponentException {
        public NoModelLoaderAvailableException(@NonNull Object obj) {
            super("Failed to find any ModelLoaders registered for model class: " + obj.getClass());
        }

        public <M> NoModelLoaderAvailableException(@NonNull M m, @NonNull List<n2c<M, ?>> list) {
            super("Found ModelLoaders for model class: " + list + ", but none that handle this specific model instance: " + m);
        }

        public NoModelLoaderAvailableException(@NonNull Class<?> cls, @NonNull Class<?> cls2) {
            super("Failed to find any ModelLoaders for model: " + cls + " and data: " + cls2);
        }
    }

    public static class NoResultEncoderAvailableException extends MissingComponentException {
        public NoResultEncoderAvailableException(@NonNull Class<?> cls) {
            super("Failed to find result encoder for resource class: " + cls + ", you may need to consider registering a new Encoder for the requested type or DiskCacheStrategy.DATA/DiskCacheStrategy.NONE if caching your transformed resource is unnecessary.");
        }
    }

    public static class NoSourceEncoderAvailableException extends MissingComponentException {
        public NoSourceEncoderAvailableException(@NonNull Class<?> cls) {
            super("Failed to find source encoder for data class: " + cls);
        }
    }

    public Registry() {
        Pools.Pool<List<Throwable>> poolE = x07.e();
        this.f1345j = poolE;
        this.a = new p2c(poolE);
        this.b = new bn6();
        this.f1343c = new ctf();
        this.d = new ftf();
        this.f1344e = new com.bumptech.glide.load.data.b();
        this.f = new n9k();
        this.g = new w3a();
        t(Arrays.asList("Animation", BUCKET_BITMAP, BUCKET_BITMAP_DRAWABLE));
    }

    @NonNull
    public <Data> Registry a(@NonNull Class<Data> cls, @NonNull im6<Data> im6Var) {
        this.b.a(cls, im6Var);
        return this;
    }

    @NonNull
    public <TResource> Registry b(@NonNull Class<TResource> cls, @NonNull etf<TResource> etfVar) {
        this.d.a(cls, etfVar);
        return this;
    }

    @NonNull
    public <Model, Data> Registry c(@NonNull Class<Model> cls, @NonNull Class<Data> cls2, @NonNull o2c<Model, Data> o2cVar) {
        this.a.a(cls, cls2, o2cVar);
        return this;
    }

    @NonNull
    public <Data, TResource> Registry d(@NonNull Class<Data> cls, @NonNull Class<TResource> cls2, @NonNull btf<Data, TResource> btfVar) {
        e("legacy_append", cls, cls2, btfVar);
        return this;
    }

    @NonNull
    public <Data, TResource> Registry e(@NonNull String str, @NonNull Class<Data> cls, @NonNull Class<TResource> cls2, @NonNull btf<Data, TResource> btfVar) {
        this.f1343c.a(str, btfVar, cls, cls2);
        return this;
    }

    @NonNull
    public final <Data, TResource, Transcode> List<com.bumptech.glide.load.engine.e<Data, TResource, Transcode>> f(@NonNull Class<Data> cls, @NonNull Class<TResource> cls2, @NonNull Class<Transcode> cls3) {
        ArrayList arrayList = new ArrayList();
        for (Class cls4 : this.f1343c.d(cls, cls2)) {
            for (Class cls5 : this.f.b(cls4, cls3)) {
                arrayList.add(new com.bumptech.glide.load.engine.e(cls, cls4, cls5, this.f1343c.b(cls, cls4), this.f.a(cls4, cls5), this.f1345j));
            }
        }
        return arrayList;
    }

    @NonNull
    public List<ImageHeaderParser> g() {
        List<ImageHeaderParser> listB = this.g.b();
        if (listB.isEmpty()) {
            throw new NoImageHeaderParserException();
        }
        return listB;
    }

    @Nullable
    public <Data, TResource, Transcode> i<Data, TResource, Transcode> h(@NonNull Class<Data> cls, @NonNull Class<TResource> cls2, @NonNull Class<Transcode> cls3) {
        i<Data, TResource, Transcode> iVarA = this.i.a(cls, cls2, cls3);
        if (this.i.c(iVarA)) {
            return null;
        }
        if (iVarA == null) {
            List<com.bumptech.glide.load.engine.e<Data, TResource, Transcode>> listF = f(cls, cls2, cls3);
            iVarA = listF.isEmpty() ? null : new i<>(cls, cls2, cls3, listF, this.f1345j);
            this.i.d(cls, cls2, cls3, iVarA);
        }
        return iVarA;
    }

    @NonNull
    public <Model> List<n2c<Model, ?>> i(@NonNull Model model) {
        return this.a.d(model);
    }

    @NonNull
    public <Model, TResource, Transcode> List<Class<?>> j(@NonNull Class<Model> cls, @NonNull Class<TResource> cls2, @NonNull Class<Transcode> cls3) {
        List<Class<?>> listA = this.h.a(cls, cls2, cls3);
        if (listA == null) {
            listA = new ArrayList<>();
            Iterator<Class<?>> it = this.a.c(cls).iterator();
            while (it.hasNext()) {
                for (Class<?> cls4 : this.f1343c.d(it.next(), cls2)) {
                    if (!this.f.b(cls4, cls3).isEmpty() && !listA.contains(cls4)) {
                        listA.add(cls4);
                    }
                }
            }
            this.h.b(cls, cls2, cls3, Collections.unmodifiableList(listA));
        }
        return listA;
    }

    @NonNull
    public <X> etf<X> k(@NonNull usf<X> usfVar) throws NoResultEncoderAvailableException {
        etf<X> etfVarB = this.d.b(usfVar.a());
        if (etfVarB != null) {
            return etfVarB;
        }
        throw new NoResultEncoderAvailableException(usfVar.a());
    }

    @NonNull
    public <X> com.bumptech.glide.load.data.a<X> l(@NonNull X x) {
        return this.f1344e.a(x);
    }

    @NonNull
    public <X> im6<X> m(@NonNull X x) throws NoSourceEncoderAvailableException {
        im6<X> im6VarB = this.b.b(x.getClass());
        if (im6VarB != null) {
            return im6VarB;
        }
        throw new NoSourceEncoderAvailableException(x.getClass());
    }

    public boolean n(@NonNull usf<?> usfVar) {
        return this.d.b(usfVar.a()) != null;
    }

    @NonNull
    public <Model, Data> Registry o(@NonNull Class<Model> cls, @NonNull Class<Data> cls2, @NonNull o2c<Model, Data> o2cVar) {
        this.a.f(cls, cls2, o2cVar);
        return this;
    }

    @NonNull
    public Registry p(@NonNull ImageHeaderParser imageHeaderParser) {
        this.g.a(imageHeaderParser);
        return this;
    }

    @NonNull
    public Registry q(@NonNull com.bumptech.glide.load.data.a.InterfaceC0176a<?> interfaceC0176a) {
        this.f1344e.b(interfaceC0176a);
        return this;
    }

    @NonNull
    public <TResource, Transcode> Registry r(@NonNull Class<TResource> cls, @NonNull Class<Transcode> cls2, @NonNull mtf<TResource, Transcode> mtfVar) {
        this.f.c(cls, cls2, mtfVar);
        return this;
    }

    @NonNull
    public <Model, Data> Registry s(@NonNull Class<Model> cls, @NonNull Class<Data> cls2, @NonNull o2c<? extends Model, ? extends Data> o2cVar) {
        this.a.g(cls, cls2, o2cVar);
        return this;
    }

    @NonNull
    public final Registry t(@NonNull List<String> list) {
        ArrayList arrayList = new ArrayList(list.size());
        arrayList.add("legacy_prepend_all");
        Iterator<String> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next());
        }
        arrayList.add("legacy_append");
        this.f1343c.e(arrayList);
        return this;
    }
}
