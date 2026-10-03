package p010kotlin.collections.unsigned;

import com.oplus.smartenginehelper.ParserTag;
import java.util.RandomAccess;
import p010kotlin.Metadata;
import p010kotlin.UByte;
import p010kotlin.UByteArray;
import p010kotlin.collections.AbstractList;
import p010kotlin.collections.ArraysKt___ArraysKt;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000'\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000e*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00060\u0003j\u0002`\u0004J\u0018\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u0002H\u0096\u0002¢\u0006\u0004\b\f\u0010\rJ\u001b\u0010\u000e\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u0006H\u0096\u0002ø\u0001\u0000¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0012\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\b\u0010\u0015\u001a\u00020\nH\u0016J\u0017\u0010\u0016\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0017\u0010\u0014R\u0014\u0010\u0005\u001a\u00020\u00068VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\b\u0082\u0002\u0004\n\u0002\b!¨\u0006\u0018"}, d2 = {"kotlin/collections/unsigned/UArraysKt___UArraysJvmKt$asList$3", "Lkotlin/collections/AbstractList;", "Lkotlin/UByte;", "Ljava/util/RandomAccess;", "Lkotlin/collections/RandomAccess;", "size", "", "getSize", "()I", "contains", "", "element", "contains-7apg3OU", "(B)Z", ParserTag.TAG_GET, "index", "get-w2LRezQ", "(I)B", "indexOf", "indexOf-7apg3OU", "(B)I", "isEmpty", "lastIndexOf", "lastIndexOf-7apg3OU", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class UArraysKt___UArraysJvmKt$asList$3 extends AbstractList<UByte> implements RandomAccess {
    final /* synthetic */ byte[] $this_asList;

    public UArraysKt___UArraysJvmKt$asList$3(byte[] bArr) {
        this.$this_asList = bArr;
    }

    @Override // p010kotlin.collections.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ boolean contains(Object obj) {
        if (obj instanceof UByte) {
            return m5816contains7apg3OU(((UByte) obj).getData());
        }
        return false;
    }

    /* JADX INFO: renamed from: contains-7apg3OU, reason: not valid java name */
    public boolean m5816contains7apg3OU(byte element) {
        return UByteArray.m5359contains7apg3OU(this.$this_asList, element);
    }

    @Override // p010kotlin.collections.AbstractList, java.util.List
    public /* bridge */ /* synthetic */ Object get(int i) {
        return UByte.m5299boximpl(m5817getw2LRezQ(i));
    }

    /* JADX INFO: renamed from: get-w2LRezQ, reason: not valid java name */
    public byte m5817getw2LRezQ(int index) {
        return UByteArray.m5363getw2LRezQ(this.$this_asList, index);
    }

    @Override // p010kotlin.collections.AbstractList, p010kotlin.collections.AbstractCollection
    public int getSize() {
        return UByteArray.m5364getSizeimpl(this.$this_asList);
    }

    @Override // p010kotlin.collections.AbstractList, java.util.List
    public final /* bridge */ int indexOf(Object obj) {
        if (obj instanceof UByte) {
            return m5818indexOf7apg3OU(((UByte) obj).getData());
        }
        return -1;
    }

    /* JADX INFO: renamed from: indexOf-7apg3OU, reason: not valid java name */
    public int m5818indexOf7apg3OU(byte element) {
        return ArraysKt___ArraysKt.indexOf(this.$this_asList, element);
    }

    @Override // p010kotlin.collections.AbstractCollection, java.util.Collection
    public boolean isEmpty() {
        return UByteArray.m5366isEmptyimpl(this.$this_asList);
    }

    @Override // p010kotlin.collections.AbstractList, java.util.List
    public final /* bridge */ int lastIndexOf(Object obj) {
        if (obj instanceof UByte) {
            return m5819lastIndexOf7apg3OU(((UByte) obj).getData());
        }
        return -1;
    }

    /* JADX INFO: renamed from: lastIndexOf-7apg3OU, reason: not valid java name */
    public int m5819lastIndexOf7apg3OU(byte element) {
        return ArraysKt___ArraysKt.lastIndexOf(this.$this_asList, element);
    }
}
