package coil.request;

import androidx.exifinterface.media.ExifInterface;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.Pair;
import p010kotlin.TuplesKt;
import p010kotlin.collections.MapsKt__MapsKt;
import p010kotlin.jvm.JvmField;
import p010kotlin.jvm.internal.DefaultConstructorMarker;
import p010kotlin.jvm.internal.Intrinsics;
import p010kotlin.jvm.internal.SourceDebugExtension;
import p010kotlin.jvm.internal.markers.KMappedMarker;

/* JADX INFO: renamed from: coil.request.b, reason: from toString */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010$\n\u0000\n\u0002\u0010(\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u0000 \u001d2\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00020\u0001:\u0003\u001e\r\u0016B\u001d\b\u0002\u0012\u0012\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\f¢\u0006\u0004\b\u001a\u0010\u001bB\t\b\u0016¢\u0006\u0004\b\u001a\u0010\u001cJ!\u0010\b\u001a\u0004\u0018\u00018\u0000\"\b\b\u0000\u0010\u0006*\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0003¢\u0006\u0004\b\b\u0010\tJ\u0006\u0010\u000b\u001a\u00020\nJ\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\fJ\u001b\u0010\u000f\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00020\u000eH\u0096\u0002J\u0013\u0010\u0011\u001a\u00020\n2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0005H\u0096\u0002J\b\u0010\u0013\u001a\u00020\u0012H\u0016J\b\u0010\u0014\u001a\u00020\u0003H\u0016J\u0006\u0010\u0016\u001a\u00020\u0015R \u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018¨\u0006\u001f"}, d2 = {"Lcoil/request/b;", "", "Lkotlin/Pair;", "", "Lcoil/request/b$c;", "", ExifInterface.GPS_DIRECTION_TRUE, "key", "d", "(Ljava/lang/String;)Ljava/lang/Object;", "", "isEmpty", "", "b", "", "iterator", "other", "equals", "", "hashCode", "toString", "Lcoil/request/b$a;", "c", "i", "Ljava/util/Map;", "entries", "<init>", "(Ljava/util/Map;)V", "()V", "Companion", "a", "coil-base_release"}, k = 1, mv = {1, 9, 0})
@SourceDebugExtension({"SMAP\nParameters.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Parameters.kt\ncoil/request/Parameters\n+ 2 Maps.kt\nkotlin/collections/MapsKt__MapsKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 4 Collections.kt\ncoil/util/-Collections\n+ 5 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n*L\n1#1,138:1\n453#2:139\n403#2:140\n1238#3,4:141\n72#4,8:145\n125#5:153\n152#5,3:154\n*S KotlinDebug\n*F\n+ 1 Parameters.kt\ncoil/request/Parameters\n*L\n44#1:139\n44#1:140\n44#1:141,4\n53#1:145,8\n59#1:153\n59#1:154,3\n*E\n"})
public final class Parameters implements Iterable<Pair<? extends String, ? extends Entry>>, KMappedMarker {

    @JvmField
    @NotNull
    public static final Parameters EMPTY = new Parameters();

    /* JADX INFO: renamed from: i, reason: from kotlin metadata and from toString */
    @NotNull
    public final Map<String, Entry> entries;

    /* JADX INFO: renamed from: coil.request.b$a */
    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0011\b\u0016\u0012\u0006\u0010\t\u001a\u00020\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0006\u0010\u0003\u001a\u00020\u0002R \u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0007¨\u0006\f"}, d2 = {"Lcoil/request/b$a;", "", "Lcoil/request/b;", "a", "", "", "Lcoil/request/b$c;", "Ljava/util/Map;", "entries", "parameters", "<init>", "(Lcoil/request/b;)V", "coil-base_release"}, k = 1, mv = {1, 9, 0})
    public static final class a {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        @NotNull
        public final Map<String, Entry> entries;

        public a(@NotNull Parameters parameters) {
            this.entries = MapsKt__MapsKt.toMutableMap(parameters.entries);
        }

        @NotNull
        public final Parameters a() {
            return new Parameters(com.oplus.aiunit.vision.c.b(this.entries), null);
        }
    }

    /* JADX INFO: renamed from: coil.request.b$c, reason: from toString */
    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\u00020\u00032\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\b\u0010\u0006\u001a\u00020\u0005H\u0016J\b\u0010\b\u001a\u00020\u0007H\u0016R\u0019\u0010\r\u001a\u0004\u0018\u00010\u00018\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u0019\u0010\u0010\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\u000b\u0010\u000e\u001a\u0004\b\t\u0010\u000f¨\u0006\u0011"}, d2 = {"Lcoil/request/b$c;", "", "other", "", "equals", "", "hashCode", "", "toString", "a", "Ljava/lang/Object;", "b", "()Ljava/lang/Object;", "value", "Ljava/lang/String;", "()Ljava/lang/String;", "memoryCacheKey", "coil-base_release"}, k = 1, mv = {1, 9, 0})
    public static final class Entry {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
        @Nullable
        public final Object value;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
        @Nullable
        public final String memoryCacheKey;

        @Nullable
        /* JADX INFO: renamed from: a, reason: from getter */
        public final String getMemoryCacheKey() {
            return this.memoryCacheKey;
        }

        @Nullable
        /* JADX INFO: renamed from: b, reason: from getter */
        public final Object getValue() {
            return this.value;
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (other instanceof Entry) {
                Entry entry = (Entry) other;
                if (Intrinsics.areEqual(this.value, entry.value) && Intrinsics.areEqual(this.memoryCacheKey, entry.memoryCacheKey)) {
                    return true;
                }
            }
            return false;
        }

        public int hashCode() {
            Object obj = this.value;
            int iHashCode = (obj != null ? obj.hashCode() : 0) * 31;
            String str = this.memoryCacheKey;
            return iHashCode + (str != null ? str.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            return "Entry(value=" + this.value + ", memoryCacheKey=" + this.memoryCacheKey + ')';
        }
    }

    public /* synthetic */ Parameters(Map map, DefaultConstructorMarker defaultConstructorMarker) {
        this(map);
    }

    @NotNull
    public final Map<String, String> b() {
        if (isEmpty()) {
            return MapsKt__MapsKt.emptyMap();
        }
        Map<String, Entry> map = this.entries;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry<String, Entry> entry : map.entrySet()) {
            String memoryCacheKey = entry.getValue().getMemoryCacheKey();
            if (memoryCacheKey != null) {
                linkedHashMap.put(entry.getKey(), memoryCacheKey);
            }
        }
        return linkedHashMap;
    }

    @NotNull
    public final a c() {
        return new a(this);
    }

    @Nullable
    public final <T> T d(@NotNull String key) {
        Entry entry = this.entries.get(key);
        if (entry != null) {
            return (T) entry.getValue();
        }
        return null;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof Parameters) && Intrinsics.areEqual(this.entries, ((Parameters) other).entries);
    }

    public int hashCode() {
        return this.entries.hashCode();
    }

    public final boolean isEmpty() {
        return this.entries.isEmpty();
    }

    @Override // java.lang.Iterable
    @NotNull
    public Iterator<Pair<? extends String, ? extends Entry>> iterator() {
        Map<String, Entry> map = this.entries;
        ArrayList arrayList = new ArrayList(map.size());
        for (Map.Entry<String, Entry> entry : map.entrySet()) {
            arrayList.add(TuplesKt.to(entry.getKey(), entry.getValue()));
        }
        return arrayList.iterator();
    }

    @NotNull
    public String toString() {
        return "Parameters(entries=" + this.entries + ')';
    }

    public Parameters(Map<String, Entry> map) {
        this.entries = map;
    }

    public Parameters() {
        this(MapsKt__MapsKt.emptyMap());
    }
}
