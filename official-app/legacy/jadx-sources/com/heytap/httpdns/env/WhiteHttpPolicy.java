package com.heytap.httpdns.env;

import java.util.concurrent.CopyOnWriteArraySet;
import p010kotlin.Metadata;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/heytap/httpdns/env/WhiteHttpPolicy;", "Ljava/util/concurrent/CopyOnWriteArraySet;", "", "()V", "com.heytap.nearx.httpdns"}, k = 1, mv = {1, 4, 0})
public final class WhiteHttpPolicy extends CopyOnWriteArraySet<String> {
    public static final WhiteHttpPolicy INSTANCE = new WhiteHttpPolicy();

    private WhiteHttpPolicy() {
    }

    @Override // java.util.concurrent.CopyOnWriteArraySet, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final /* bridge */ boolean contains(Object obj) {
        if (obj != null ? obj instanceof String : true) {
            return contains((String) obj);
        }
        return false;
    }

    public /* bridge */ int getSize() {
        return super.size();
    }

    @Override // java.util.concurrent.CopyOnWriteArraySet, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final /* bridge */ boolean remove(Object obj) {
        if (obj != null ? obj instanceof String : true) {
            return remove((String) obj);
        }
        return false;
    }

    @Override // java.util.concurrent.CopyOnWriteArraySet, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final /* bridge */ int size() {
        return getSize();
    }

    public /* bridge */ boolean contains(String str) {
        return super.contains((Object) str);
    }

    public /* bridge */ boolean remove(String str) {
        return super.remove((Object) str);
    }
}
