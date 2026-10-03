package io.protostuff;

import java.util.AbstractList;
import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
public final class ListAdapter<F, T> extends AbstractList<T> {
    private final Converter<F, T> converter;
    private final List<F> fromList;

    public interface Converter<F, T> {
        T convert(F f);
    }

    public ListAdapter(List<F> list, Converter<F, T> converter) {
        this.fromList = list;
        this.converter = converter;
    }

    @Override // java.util.AbstractList, java.util.List
    public T get(int i) {
        return (T) this.converter.convert(this.fromList.get(i));
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        return this.fromList.size();
    }
}
