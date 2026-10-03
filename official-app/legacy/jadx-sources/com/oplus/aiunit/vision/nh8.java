package com.oplus.aiunit.vision;

import androidx.exifinterface.media.ExifInterface;
import io.protostuff.MapSchema;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.functions.Function2;
import p010kotlin.jvm.internal.Intrinsics;
import p010kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022\u00020\u0003B\u0007¢\u0006\u0004\b\u001f\u0010 J\u0015\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00028\u0000¢\u0006\u0004\b\u0006\u0010\u0007J\u001d\u0010\t\u001a\n\u0012\u0004\u0012\u00028\u0001\u0018\u00010\b2\u0006\u0010\u0004\u001a\u00028\u0000¢\u0006\u0004\b\t\u0010\nJ\u001d\u0010\u000b\u001a\n\u0012\u0004\u0012\u00028\u0001\u0018\u00010\b2\u0006\u0010\u0004\u001a\u00028\u0000¢\u0006\u0004\b\u000b\u0010\nJ\u0006\u0010\r\u001a\u00020\fJ>\u0010\u0014\u001a\u00020\u001326\u0010\u0012\u001a2\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\u000f\u0012\b\b\u0010\u0012\u0004\b\b(\u0004\u0012\u0013\u0012\u00118\u0001¢\u0006\f\b\u000f\u0012\b\b\u0010\u0012\u0004\b\b(\u0011\u0012\u0004\u0012\u00020\u00050\u000eJ\u001d\u0010\u0015\u001a\u00020\u00132\u0006\u0010\u0004\u001a\u00028\u00002\u0006\u0010\u0011\u001a\u00028\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u001d\u0010\u0017\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00028\u00002\u0006\u0010\u0011\u001a\u00028\u0001¢\u0006\u0004\b\u0017\u0010\u0018RP\u0010\u001e\u001a>\u0012\u0004\u0012\u00028\u0000\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00028\u00010\u001aj\b\u0012\u0004\u0012\u00028\u0001`\u001b0\u0019j\u001e\u0012\u0004\u0012\u00028\u0000\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00028\u00010\u001aj\b\u0012\u0004\u0012\u00028\u0001`\u001b`\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u001d¨\u0006!"}, d2 = {"Lcom/oplus/aiunit/vision/nh8;", "K", ExifInterface.GPS_MEASUREMENT_INTERRUPTED, "", "key", "", "a", "(Ljava/lang/Object;)Z", "", "c", "(Ljava/lang/Object;)Ljava/util/List;", "f", "", b2n.f, "Lkotlin/Function2;", "Lkotlin/ParameterName;", "name", "value", "each", "", "b", "d", "(Ljava/lang/Object;Ljava/lang/Object;)V", MapSchema.FIELD_NAME_ENTRY, "(Ljava/lang/Object;Ljava/lang/Object;)Z", "Ljava/util/HashMap;", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "Lkotlin/collections/HashMap;", "Ljava/util/HashMap;", "map", "<init>", "()V", "lib_heytapconnect_release"}, k = 1, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nHashMultimap.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HashMultimap.kt\ncom/heytap/health/connect/rawapi/call/HashMultimap\n+ 2 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n*L\n1#1,56:1\n215#2,2:57\n*S KotlinDebug\n*F\n+ 1 HashMultimap.kt\ncom/heytap/health/connect/rawapi/call/HashMultimap\n*L\n20#1:57,2\n*E\n"})
public final class nh8<K, V> {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final HashMap<K, ArrayList<V>> map = new HashMap<>();

    public final boolean a(K key) {
        return this.map.containsKey(key);
    }

    public final void b(@NotNull Function2<? super K, ? super V, Boolean> each) {
        Intrinsics.checkNotNullParameter(each, "each");
        Iterator<Map.Entry<K, ArrayList<V>>> it = this.map.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry<K, ArrayList<V>> next = it.next();
            K key = next.getKey();
            ArrayList<V> value = next.getValue();
            Iterator<V> it2 = value.iterator();
            Intrinsics.checkNotNullExpressionValue(it2, "eachList.iterator()");
            while (it2.hasNext()) {
                if (each.invoke(key, it2.next()).booleanValue()) {
                    it2.remove();
                }
            }
            if (value.size() == 0) {
                it.remove();
            }
        }
    }

    @Nullable
    public final List<V> c(K key) {
        return this.map.get(key);
    }

    public final void d(K key, V value) {
        ArrayList<V> arrayList = this.map.get(key);
        if (arrayList == null) {
            arrayList = new ArrayList<>();
            this.map.put(key, arrayList);
        }
        arrayList.add(value);
    }

    public final boolean e(K key, V value) {
        ArrayList<V> arrayList = this.map.get(key);
        return arrayList != null && arrayList.remove(value);
    }

    @Nullable
    public final List<V> f(K key) {
        return this.map.remove(key);
    }

    public final int g() {
        Iterator<Map.Entry<K, ArrayList<V>>> it = this.map.entrySet().iterator();
        int size = 0;
        while (it.hasNext()) {
            size += it.next().getValue().size();
        }
        return size;
    }
}
