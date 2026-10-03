package com.bumptech.glide.load.engine;

import androidx.annotation.NonNull;
import androidx.core.util.Pools;
import com.oplus.aiunit.vision.cpe;
import com.oplus.aiunit.vision.erd;
import com.oplus.aiunit.vision.usf;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: loaded from: classes13.dex */
public class i<Data, ResourceType, Transcode> {
    public final Class<Data> a;
    public final Pools.Pool<List<Throwable>> b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List<? extends e<Data, ResourceType, Transcode>> f1393c;
    public final String d;

    public i(Class<Data> cls, Class<ResourceType> cls2, Class<Transcode> cls3, List<e<Data, ResourceType, Transcode>> list, Pools.Pool<List<Throwable>> pool) {
        this.a = cls;
        this.b = pool;
        this.f1393c = (List) cpe.c(list);
        this.d = "Failed LoadPath{" + cls.getSimpleName() + "->" + cls2.getSimpleName() + "->" + cls3.getSimpleName() + "}";
    }

    public usf<Transcode> a(com.bumptech.glide.load.data.a<Data> aVar, @NonNull erd erdVar, int i, int i2, e.a<ResourceType> aVar2) throws GlideException {
        List<Throwable> list = (List) cpe.d(this.b.acquire());
        try {
            return b(aVar, erdVar, i, i2, aVar2, list);
        } finally {
            this.b.release(list);
        }
    }

    public final usf<Transcode> b(com.bumptech.glide.load.data.a<Data> aVar, @NonNull erd erdVar, int i, int i2, e.a<ResourceType> aVar2, List<Throwable> list) throws GlideException {
        int size = this.f1393c.size();
        usf<Transcode> usfVarA = null;
        for (int i3 = 0; i3 < size; i3++) {
            try {
                usfVarA = this.f1393c.get(i3).a(aVar, i, i2, erdVar, aVar2);
            } catch (GlideException e2) {
                list.add(e2);
            }
            if (usfVarA != null) {
                break;
            }
        }
        if (usfVarA != null) {
            return usfVarA;
        }
        throw new GlideException(this.d, new ArrayList(list));
    }

    public String toString() {
        return "LoadPath{decodePaths=" + Arrays.toString(this.f1393c.toArray()) + '}';
    }
}
