package io.protostuff;

/* JADX INFO: loaded from: classes10.dex */
public interface GraphInput extends Input {
    boolean isCurrentMessageReference();

    void updateLast(Object obj, Object obj2);
}
