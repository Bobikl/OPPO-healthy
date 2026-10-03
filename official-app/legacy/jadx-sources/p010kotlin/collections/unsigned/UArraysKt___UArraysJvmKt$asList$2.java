package p010kotlin.collections.unsigned;

import com.oplus.smartenginehelper.ParserTag;
import java.util.RandomAccess;
import p010kotlin.Metadata;
import p010kotlin.ULong;
import p010kotlin.ULongArray;
import p010kotlin.collections.AbstractList;
import p010kotlin.collections.ArraysKt___ArraysKt;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000'\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000e*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00060\u0003j\u0002`\u0004J\u0018\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u0002H\u0096\u0002¢\u0006\u0004\b\f\u0010\rJ\u001b\u0010\u000e\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u0006H\u0096\u0002ø\u0001\u0000¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0012\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\b\u0010\u0015\u001a\u00020\nH\u0016J\u0017\u0010\u0016\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0017\u0010\u0014R\u0014\u0010\u0005\u001a\u00020\u00068VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\b\u0082\u0002\u0004\n\u0002\b!¨\u0006\u0018"}, d2 = {"kotlin/collections/unsigned/UArraysKt___UArraysJvmKt$asList$2", "Lkotlin/collections/AbstractList;", "Lkotlin/ULong;", "Ljava/util/RandomAccess;", "Lkotlin/collections/RandomAccess;", "size", "", "getSize", "()I", "contains", "", "element", "contains-VKZWuLQ", "(J)Z", ParserTag.TAG_GET, "index", "get-s-VKNKU", "(I)J", "indexOf", "indexOf-VKZWuLQ", "(J)I", "isEmpty", "lastIndexOf", "lastIndexOf-VKZWuLQ", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class UArraysKt___UArraysJvmKt$asList$2 extends AbstractList<ULong> implements RandomAccess {
    final /* synthetic */ long[] $this_asList;

    public UArraysKt___UArraysJvmKt$asList$2(long[] jArr) {
        this.$this_asList = jArr;
    }

    @Override // p010kotlin.collections.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ boolean contains(Object obj) {
        if (obj instanceof ULong) {
            return m5812containsVKZWuLQ(((ULong) obj).getData());
        }
        return false;
    }

    /* JADX INFO: renamed from: contains-VKZWuLQ, reason: not valid java name */
    public boolean m5812containsVKZWuLQ(long element) {
        return ULongArray.m5517containsVKZWuLQ(this.$this_asList, element);
    }

    @Override // p010kotlin.collections.AbstractList, java.util.List
    public /* bridge */ /* synthetic */ Object get(int i) {
        return ULong.m5455boximpl(m5813getsVKNKU(i));
    }

    /* JADX INFO: renamed from: get-s-VKNKU, reason: not valid java name */
    public long m5813getsVKNKU(int index) {
        return ULongArray.m5521getsVKNKU(this.$this_asList, index);
    }

    @Override // p010kotlin.collections.AbstractList, p010kotlin.collections.AbstractCollection
    public int getSize() {
        return ULongArray.m5522getSizeimpl(this.$this_asList);
    }

    @Override // p010kotlin.collections.AbstractList, java.util.List
    public final /* bridge */ int indexOf(Object obj) {
        if (obj instanceof ULong) {
            return m5814indexOfVKZWuLQ(((ULong) obj).getData());
        }
        return -1;
    }

    /* JADX INFO: renamed from: indexOf-VKZWuLQ, reason: not valid java name */
    public int m5814indexOfVKZWuLQ(long element) {
        return ArraysKt___ArraysKt.indexOf(this.$this_asList, element);
    }

    @Override // p010kotlin.collections.AbstractCollection, java.util.Collection
    public boolean isEmpty() {
        return ULongArray.m5524isEmptyimpl(this.$this_asList);
    }

    @Override // p010kotlin.collections.AbstractList, java.util.List
    public final /* bridge */ int lastIndexOf(Object obj) {
        if (obj instanceof ULong) {
            return m5815lastIndexOfVKZWuLQ(((ULong) obj).getData());
        }
        return -1;
    }

    /* JADX INFO: renamed from: lastIndexOf-VKZWuLQ, reason: not valid java name */
    public int m5815lastIndexOfVKZWuLQ(long element) {
        return ArraysKt___ArraysKt.lastIndexOf(this.$this_asList, element);
    }
}
