package com.oplus.aiunit.vision;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.TypeIntrinsics;
import kotlin.ranges.RangesKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes8.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\t\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B\u0007¢\u0006\u0004\b/\u00100J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u000f\u0010\u0006\u001a\u0004\u0018\u00018\u0000¢\u0006\u0004\b\u0006\u0010\u0007J\f\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0000J!\u0010\n\u001a\u0004\u0018\u00018\u0001\"\u0004\b\u0001\u0010\u00012\b\u0010\t\u001a\u0004\u0018\u00018\u0001H\u0002¢\u0006\u0004\b\n\u0010\u000bR\"\u0010\u0012\u001a\u00020\f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\b\u0010\r\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\"\u0010\u0015\u001a\u00020\f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\n\u0010\r\u001a\u0004\b\u0013\u0010\u000f\"\u0004\b\u0014\u0010\u0011R$\u0010\u0003\u001a\u0004\u0018\u00018\u00008\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000e\u0010\u0016\u001a\u0004\b\u0017\u0010\u0007\"\u0004\b\u0018\u0010\u0019R\"\u0010 \u001a\u00020\u001a8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0013\u0010\u001b\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001fR$\u0010'\u001a\u0004\u0018\u00010!8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001c\u0010\"\u001a\u0004\b#\u0010$\"\u0004\b%\u0010&R\"\u0010.\u001a\u00020(8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0006\u0010)\u001a\u0004\b*\u0010+\"\u0004\b,\u0010-¨\u00061"}, d2 = {"Lcom/oplus/aiunit/vision/nmk;", "T", "", "values", "", "l", "f", "()Ljava/lang/Object;", "a", "value", "b", "(Ljava/lang/Object;)Ljava/lang/Object;", "", "Ljava/lang/String;", "c", "()Ljava/lang/String;", "g", "(Ljava/lang/String;)V", "name", "d", "i", "type", "Ljava/lang/Object;", "getValues", "setValues", "(Ljava/lang/Object;)V", "", "Z", "e", "()Z", "k", "(Z)V", "updateDirty", "Lcom/oplus/aiunit/vision/t0a;", "Lcom/oplus/aiunit/vision/t0a;", "getUpdate", "()Lcom/oplus/aiunit/vision/t0a;", "j", "(Lcom/oplus/aiunit/vision/t0a;)V", "update", "", "I", "getPassId", "()I", "h", "(I)V", "passId", "<init>", "()V", "coecommon.1.1.0_release"}, k = 1, mv = {1, 9, 0})
@SourceDebugExtension({"SMAP\nUniformData.kt\nKotlin\n*S Kotlin\n*F\n+ 1 UniformData.kt\ncom/oplus/vfxsdk/common/UniformData\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n+ 5 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n*L\n1#1,54:1\n1549#2:55\n1620#2,2:56\n1622#2:59\n1208#2,2:60\n1238#2,4:62\n1#3:58\n11065#4:66\n11400#4,3:67\n37#5,2:70\n*S KotlinDebug\n*F\n+ 1 UniformData.kt\ncom/oplus/vfxsdk/common/UniformData\n*L\n48#1:55\n48#1:56,2\n48#1:59\n49#1:60,2\n49#1:62,4\n50#1:66\n50#1:67,3\n50#1:70,2\n*E\n"})
public final class nmk<T> {

    @Nullable
    public T c;
    public boolean d;

    @Nullable
    public t0a e;

    @NotNull
    public String a = "";

    @NotNull
    public String b = "";
    public int f = -1;

    @NotNull
    public final nmk<T> a() {
        nmk<T> nmkVar = new nmk<>();
        nmkVar.a = this.a;
        nmkVar.b = this.b;
        nmkVar.d = this.d;
        nmkVar.c = nmkVar.b(this.c);
        return nmkVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v17, types: [T, java.util.ArrayList, java.util.Collection] */
    /* JADX WARN: Type inference failed for: r1v4, types: [T, java.util.LinkedHashMap, java.util.Map] */
    public final <T> T b(T value) {
        if (TypeIntrinsics.isMutableList(value)) {
            Intrinsics.checkNotNull(value, "null cannot be cast to non-null type kotlin.collections.List<*>");
            List list = (List) value;
            ?? r0 = (T) new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                T next = it.next();
                r0.add(next != null ? b(next) : null);
            }
            return r0;
        }
        if (TypeIntrinsics.isMutableMap(value)) {
            Intrinsics.checkNotNull(value, "null cannot be cast to non-null type kotlin.collections.Map<*, *>");
            Set<Map.Entry> setEntrySet = ((Map) value).entrySet();
            ?? r1 = (T) new LinkedHashMap(RangesKt.coerceAtLeast(MapsKt.mapCapacity(CollectionsKt.collectionSizeOrDefault(setEntrySet, 10)), 16));
            for (Map.Entry entry : setEntrySet) {
                Object key = entry.getKey();
                Object value2 = entry.getValue();
                r1.put(key, value2 != null ? b(value2) : null);
            }
            return r1;
        }
        if (!(value instanceof Object[])) {
            return value;
        }
        Intrinsics.checkNotNull(value, "null cannot be cast to non-null type kotlin.Array<*>");
        Object[] objArr = (Object[]) value;
        ArrayList arrayList = new ArrayList(objArr.length);
        int length = objArr.length;
        for (int i = 0; i < length; i++) {
            Object obj = objArr[i];
            arrayList.add(obj != null ? b(obj) : null);
        }
        return (T) arrayList.toArray(new Object[0]);
    }

    @NotNull
    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getA() {
        return this.a;
    }

    @NotNull
    /* JADX INFO: renamed from: d, reason: from getter */
    public final String getB() {
        return this.b;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final boolean getD() {
        return this.d;
    }

    @Nullable
    public final T f() {
        return this.c;
    }

    public final void g(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.a = str;
    }

    public final void h(int i) {
        this.f = i;
    }

    public final void i(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.b = str;
    }

    public final void j(@Nullable t0a t0aVar) {
        this.e = t0aVar;
    }

    public final void k(boolean z) {
        this.d = z;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void l(@NotNull Object values) {
        Intrinsics.checkNotNullParameter(values, "values");
        this.c = values;
    }
}
