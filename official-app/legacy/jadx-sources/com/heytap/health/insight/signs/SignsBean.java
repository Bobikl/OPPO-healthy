package com.heytap.health.insight.signs;

import androidx.annotation.Keep;
import androidx.compose.runtime.internal.StabilityInferred;
import java.util.ArrayList;
import p010kotlin.Metadata;

/* JADX INFO: loaded from: classes16.dex */
@StabilityInferred(parameters = 0)
@Keep
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u0012\u0012\u0004\u0012\u00020\u00020\u0001j\b\u0012\u0004\u0012\u00020\u0002`\u0003B\u0005¢\u0006\u0002\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/heytap/health/insight/signs/SignsBean;", "Ljava/util/ArrayList;", "Lcom/heytap/health/insight/signs/SignsBeanItem;", "Lkotlin/collections/ArrayList;", "()V", "health_impl_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class SignsBean extends ArrayList<SignsBeanItem> {
    public static final int $stable = 0;

    public /* bridge */ boolean contains(SignsBeanItem signsBeanItem) {
        return super.contains((Object) signsBeanItem);
    }

    public /* bridge */ int getSize() {
        return super.size();
    }

    public /* bridge */ int indexOf(SignsBeanItem signsBeanItem) {
        return super.indexOf((Object) signsBeanItem);
    }

    public /* bridge */ int lastIndexOf(SignsBeanItem signsBeanItem) {
        return super.lastIndexOf((Object) signsBeanItem);
    }

    @Override // java.util.ArrayList, java.util.AbstractList, java.util.List
    public final /* bridge */ SignsBeanItem remove(int i) {
        return removeAt(i);
    }

    public /* bridge */ SignsBeanItem removeAt(int i) {
        return (SignsBeanItem) super.remove(i);
    }

    @Override // java.util.ArrayList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ int size() {
        return getSize();
    }

    @Override // java.util.ArrayList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ boolean contains(Object obj) {
        if (obj instanceof SignsBeanItem) {
            return contains((SignsBeanItem) obj);
        }
        return false;
    }

    @Override // java.util.ArrayList, java.util.AbstractList, java.util.List
    public final /* bridge */ int indexOf(Object obj) {
        if (obj instanceof SignsBeanItem) {
            return indexOf((SignsBeanItem) obj);
        }
        return -1;
    }

    @Override // java.util.ArrayList, java.util.AbstractList, java.util.List
    public final /* bridge */ int lastIndexOf(Object obj) {
        if (obj instanceof SignsBeanItem) {
            return lastIndexOf((SignsBeanItem) obj);
        }
        return -1;
    }

    public /* bridge */ boolean remove(SignsBeanItem signsBeanItem) {
        return super.remove((Object) signsBeanItem);
    }

    @Override // java.util.ArrayList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ boolean remove(Object obj) {
        if (obj instanceof SignsBeanItem) {
            return remove((SignsBeanItem) obj);
        }
        return false;
    }
}
