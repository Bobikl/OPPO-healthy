package coil.memory;

import android.graphics.Bitmap;
import androidx.annotation.VisibleForTesting;
import com.opos.process.bridge.base.BridgeConstant;
import io.protostuff.MapSchema;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.collections.CollectionsKt___CollectionsKt;
import p010kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\b\u0000\u0018\u0000 \"2\u00020\u0001:\u0002\u0011\u0005B\u0007¢\u0006\u0004\b!\u0010\u0013J\u0012\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J4\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u00062\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\b2\u0006\u0010\r\u001a\u00020\fH\u0016J\u0010\u0010\u0011\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\fH\u0016J\u000f\u0010\u0012\u001a\u00020\u000eH\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\b\u0010\u0014\u001a\u00020\u000eH\u0002R\\\u0010\u001e\u001a>\u0012\u0004\u0012\u00020\u0002\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\u00170\u0016j\b\u0012\u0004\u0012\u00020\u0017`\u00180\u0015j\u001e\u0012\u0004\u0012\u00020\u0002\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\u00170\u0016j\b\u0012\u0004\u0012\u00020\u0017`\u0018`\u00198\u0000X\u0081\u0004¢\u0006\u0012\n\u0004\b\u0011\u0010\u001a\u0012\u0004\b\u001d\u0010\u0013\u001a\u0004\b\u001b\u0010\u001cR\u0016\u0010 \u001a\u00020\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0005\u0010\u001f¨\u0006#"}, d2 = {"Lcoil/memory/e;", "Lcoil/memory/g;", "Lcoil/memory/MemoryCache$Key;", "key", "Lcoil/memory/MemoryCache$b;", "b", "Landroid/graphics/Bitmap;", "bitmap", "", "", "", BridgeConstant.KEY_EXTRAS, "", "size", "", "c", "level", "a", "d", "()V", MapSchema.FIELD_NAME_ENTRY, "Ljava/util/LinkedHashMap;", "Ljava/util/ArrayList;", "Lcoil/memory/e$b;", "Lkotlin/collections/ArrayList;", "Lkotlin/collections/LinkedHashMap;", "Ljava/util/LinkedHashMap;", "getCache$coil_base_release", "()Ljava/util/LinkedHashMap;", "getCache$coil_base_release$annotations", "cache", "I", "operationsSinceCleanUp", "<init>", "Companion", "coil-base_release"}, k = 1, mv = {1, 9, 0})
@SourceDebugExtension({"SMAP\nWeakMemoryCache.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WeakMemoryCache.kt\ncoil/memory/RealWeakMemoryCache\n+ 2 Collections.kt\ncoil/util/-Collections\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 Maps.kt\nkotlin/collections/MapsKt__MapsKt\n+ 5 Utils.kt\ncoil/util/-Utils\n*L\n1#1,158:1\n44#2,2:159\n47#2:163\n55#2,9:172\n1#3:161\n1#3:162\n372#4,7:164\n162#5:171\n*S KotlinDebug\n*F\n+ 1 WeakMemoryCache.kt\ncoil/memory/RealWeakMemoryCache\n*L\n63#1:159,2\n63#1:163\n137#1:172,9\n63#1:162\n73#1:164,7\n77#1:171\n*E\n"})
public final class e implements g {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final LinkedHashMap<MemoryCache.Key, ArrayList<b>> cache = new LinkedHashMap<>();

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public int operationsSinceCleanUp;

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\b\b\u0001\u0018\u00002\u00020\u0001B9\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\t0\b\u0012\u0012\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00010\u000e\u0012\u0006\u0010\u0014\u001a\u00020\u0002¢\u0006\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u001d\u0010\r\u001a\b\u0012\u0004\u0012\u00020\t0\b8\u0006¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\u0003\u0010\fR#\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00010\u000e8\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0010\u001a\u0004\b\n\u0010\u0011R\u0017\u0010\u0014\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0004\u001a\u0004\b\u0013\u0010\u0006¨\u0006\u0017"}, d2 = {"Lcoil/memory/e$b;", "", "", "a", "I", "c", "()I", "identityHashCode", "Ljava/lang/ref/WeakReference;", "Landroid/graphics/Bitmap;", "b", "Ljava/lang/ref/WeakReference;", "()Ljava/lang/ref/WeakReference;", "bitmap", "", "", "Ljava/util/Map;", "()Ljava/util/Map;", BridgeConstant.KEY_EXTRAS, "d", "size", "<init>", "(ILjava/lang/ref/WeakReference;Ljava/util/Map;I)V", "coil-base_release"}, k = 1, mv = {1, 9, 0})
    @VisibleForTesting
    public static final class b {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        public final int identityHashCode;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        @NotNull
        public final WeakReference<Bitmap> bitmap;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        @NotNull
        public final Map<String, Object> extras;

        /* JADX INFO: renamed from: d, reason: from kotlin metadata */
        public final int size;

        public b(int i, @NotNull WeakReference<Bitmap> weakReference, @NotNull Map<String, ? extends Object> map, int i2) {
            this.identityHashCode = i;
            this.bitmap = weakReference;
            this.extras = map;
            this.size = i2;
        }

        @NotNull
        public final WeakReference<Bitmap> a() {
            return this.bitmap;
        }

        @NotNull
        public final Map<String, Object> b() {
            return this.extras;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final int getIdentityHashCode() {
            return this.identityHashCode;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final int getSize() {
            return this.size;
        }
    }

    @Override // coil.memory.g
    public synchronized void a(int level) {
        if (level >= 10 && level != 20) {
            d();
        }
    }

    @Override // coil.memory.g
    @Nullable
    public synchronized MemoryCache.Value b(@NotNull MemoryCache.Key key) {
        ArrayList<b> arrayList = this.cache.get(key);
        MemoryCache.Value bVar = null;
        if (arrayList == null) {
            return null;
        }
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            b bVar2 = arrayList.get(i);
            Bitmap bitmap = bVar2.a().get();
            MemoryCache.Value bVar3 = bitmap != null ? new MemoryCache.Value(bitmap, bVar2.b()) : null;
            if (bVar3 != null) {
                bVar = bVar3;
                break;
            }
        }
        e();
        return bVar;
    }

    @Override // coil.memory.g
    public synchronized void c(@NotNull MemoryCache.Key key, @NotNull Bitmap bitmap, @NotNull Map<String, ? extends Object> extras, int size) {
        LinkedHashMap<MemoryCache.Key, ArrayList<b>> linkedHashMap = this.cache;
        ArrayList<b> arrayList = linkedHashMap.get(key);
        if (arrayList == null) {
            arrayList = new ArrayList<>();
            linkedHashMap.put(key, arrayList);
        }
        ArrayList<b> arrayList2 = arrayList;
        int iIdentityHashCode = System.identityHashCode(bitmap);
        b bVar = new b(iIdentityHashCode, new WeakReference(bitmap), extras, size);
        int size2 = arrayList2.size();
        int i = 0;
        while (true) {
            if (i >= size2) {
                arrayList2.add(bVar);
                break;
            }
            b bVar2 = arrayList2.get(i);
            if (size >= bVar2.getSize()) {
                if (bVar2.getIdentityHashCode() != iIdentityHashCode || bVar2.a().get() != bitmap) {
                    arrayList2.add(i, bVar);
                    break;
                } else {
                    arrayList2.set(i, bVar);
                    break;
                }
            }
            i++;
        }
        e();
    }

    @VisibleForTesting
    public final void d() {
        WeakReference<Bitmap> weakReferenceA;
        this.operationsSinceCleanUp = 0;
        Iterator<ArrayList<b>> it = this.cache.values().iterator();
        while (it.hasNext()) {
            ArrayList<b> next = it.next();
            if (next.size() <= 1) {
                b bVar = (b) CollectionsKt___CollectionsKt.firstOrNull((List) next);
                if (((bVar == null || (weakReferenceA = bVar.a()) == null) ? null : weakReferenceA.get()) == null) {
                    it.remove();
                }
            } else {
                int size = next.size();
                int i = 0;
                for (int i2 = 0; i2 < size; i2++) {
                    int i3 = i2 - i;
                    if (next.get(i3).a().get() == null) {
                        next.remove(i3);
                        i++;
                    }
                }
                if (next.isEmpty()) {
                    it.remove();
                }
            }
        }
    }

    public final void e() {
        int i = this.operationsSinceCleanUp;
        this.operationsSinceCleanUp = i + 1;
        if (i >= 10) {
            d();
        }
    }
}
