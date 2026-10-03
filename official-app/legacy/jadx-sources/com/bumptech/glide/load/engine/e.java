package com.bumptech.glide.load.engine;

import android.util.Log;
import androidx.annotation.NonNull;
import androidx.core.util.Pools;
import com.oplus.aiunit.vision.btf;
import com.oplus.aiunit.vision.cpe;
import com.oplus.aiunit.vision.erd;
import com.oplus.aiunit.vision.mtf;
import com.oplus.aiunit.vision.usf;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes13.dex */
public class e<DataType, ResourceType, Transcode> {
    public final Class<DataType> a;
    public final List<? extends btf<DataType, ResourceType>> b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final mtf<ResourceType, Transcode> f1377c;
    public final Pools.Pool<List<Throwable>> d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f1378e;

    public interface a<ResourceType> {
        @NonNull
        usf<ResourceType> a(@NonNull usf<ResourceType> usfVar);
    }

    public e(Class<DataType> cls, Class<ResourceType> cls2, Class<Transcode> cls3, List<? extends btf<DataType, ResourceType>> list, mtf<ResourceType, Transcode> mtfVar, Pools.Pool<List<Throwable>> pool) {
        this.a = cls;
        this.b = list;
        this.f1377c = mtfVar;
        this.d = pool;
        this.f1378e = "Failed DecodePath{" + cls.getSimpleName() + "->" + cls2.getSimpleName() + "->" + cls3.getSimpleName() + "}";
    }

    public usf<Transcode> a(com.bumptech.glide.load.data.a<DataType> aVar, int i, int i2, @NonNull erd erdVar, a<ResourceType> aVar2) throws GlideException {
        return this.f1377c.a(aVar2.a(b(aVar, i, i2, erdVar)), erdVar);
    }

    @NonNull
    public final usf<ResourceType> b(com.bumptech.glide.load.data.a<DataType> aVar, int i, int i2, @NonNull erd erdVar) throws GlideException {
        List<Throwable> list = (List) cpe.d(this.d.acquire());
        try {
            return c(aVar, i, i2, erdVar, list);
        } finally {
            this.d.release(list);
        }
    }

    @NonNull
    public final usf<ResourceType> c(com.bumptech.glide.load.data.a<DataType> aVar, int i, int i2, @NonNull erd erdVar, List<Throwable> list) throws GlideException {
        int size = this.b.size();
        usf<ResourceType> usfVarA = null;
        for (int i3 = 0; i3 < size; i3++) {
            btf<DataType, ResourceType> btfVar = this.b.get(i3);
            try {
                if (btfVar.b(aVar.c(), erdVar)) {
                    usfVarA = btfVar.a(aVar.c(), i, i2, erdVar);
                }
            } catch (IOException | OutOfMemoryError | RuntimeException e2) {
                if (Log.isLoggable("DecodePath", 2)) {
                    Log.v("DecodePath", "Failed to decode data for " + btfVar, e2);
                }
                list.add(e2);
            }
            if (usfVarA != null) {
                break;
            }
        }
        if (usfVarA != null) {
            return usfVarA;
        }
        throw new GlideException(this.f1378e, new ArrayList(list));
    }

    public String toString() {
        return "DecodePath{ dataClass=" + this.a + ", decoders=" + this.b + ", transcoder=" + this.f1377c + '}';
    }
}
