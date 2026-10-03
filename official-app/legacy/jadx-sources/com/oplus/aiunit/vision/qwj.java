package com.oplus.aiunit.vision;

import android.util.SparseArray;
import androidx.exifinterface.media.ExifInterface;
import io.protostuff.MapSchema;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.Unit;
import p010kotlin.collections.CollectionsKt__CollectionsKt;
import p010kotlin.jvm.functions.Function2;
import p010kotlin.jvm.internal.Intrinsics;
import p010kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010!\n\u0002\b\u0005\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0017\u0010\u0018J\u001d\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00028\u0000¢\u0006\u0004\b\u0007\u0010\bJ\u0016\u0010\n\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\t2\u0006\u0010\u0004\u001a\u00020\u0003J\u0017\u0010\u000b\u001a\u0004\u0018\u00018\u00002\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\r\u001a\u0004\u0018\u00018\u00002\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\r\u0010\fJ>\u0010\u0012\u001a\u00020\u000626\u0010\u0011\u001a2\u0012\u0013\u0012\u00110\u0003¢\u0006\f\b\u000f\u0012\b\b\u0010\u0012\u0004\b\b(\u0004\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\u000f\u0012\b\b\u0010\u0012\u0004\b\b(\u0005\u0012\u0004\u0012\u00020\u00060\u000eR \u0010\u0016\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00140\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0015¨\u0006\u0019"}, d2 = {"Lcom/oplus/aiunit/vision/qwj;", ExifInterface.LONGITUDE_EAST, "", "", "key", "value", "", "c", "(ILjava/lang/Object;)V", "", "b", "d", "(I)Ljava/lang/Object;", MapSchema.FIELD_NAME_ENTRY, "Lkotlin/Function2;", "Lkotlin/ParameterName;", "name", "action", "a", "Landroid/util/SparseArray;", "", "Landroid/util/SparseArray;", "sparseArray", "<init>", "()V", "lib_base_release"}, k = 1, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nThreadSafeSparseArray.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ThreadSafeSparseArray.kt\ncom/heytap/health/ThreadSafeSparseList\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 SparseArray.kt\nandroidx/core/util/SparseArrayKt\n+ 4 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,125:1\n1#2:126\n76#3,2:127\n79#3:131\n1855#4,2:129\n*S KotlinDebug\n*F\n+ 1 ThreadSafeSparseArray.kt\ncom/heytap/health/ThreadSafeSparseList\n*L\n55#1:127,2\n55#1:131\n56#1:129,2\n*E\n"})
public final class qwj<E> {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final SparseArray<List<E>> sparseArray = new SparseArray<>();

    public final synchronized void a(@NotNull Function2<? super Integer, ? super E, Unit> action) {
        Intrinsics.checkNotNullParameter(action, "action");
        SparseArray<List<E>> sparseArray = this.sparseArray;
        int size = sparseArray.size();
        for (int i = 0; i < size; i++) {
            int iKeyAt = sparseArray.keyAt(i);
            Iterator<T> it = sparseArray.valueAt(i).iterator();
            while (it.hasNext()) {
                action.invoke(Integer.valueOf(iKeyAt), (Object) it.next());
            }
        }
        this.sparseArray.clear();
    }

    @Nullable
    public final synchronized List<E> b(int key) {
        List<E> list;
        list = this.sparseArray.get(key);
        if (list == null) {
            return null;
        }
        return list;
    }

    public final synchronized void c(int key, E value) {
        List<E> arrayList = this.sparseArray.get(key);
        if (arrayList == null) {
            arrayList = new ArrayList<>();
            this.sparseArray.put(key, arrayList);
        }
        arrayList.add(value);
    }

    @Nullable
    public final synchronized E d(int key) {
        List<E> list = this.sparseArray.get(key);
        if (list == null) {
            return null;
        }
        if (!(!list.isEmpty())) {
            return null;
        }
        return list.remove(0);
    }

    @Nullable
    public final synchronized E e(int key) {
        List<E> list = this.sparseArray.get(key);
        if (list == null) {
            return null;
        }
        if (!(!list.isEmpty())) {
            return null;
        }
        return list.remove(CollectionsKt__CollectionsKt.getLastIndex(list));
    }
}
