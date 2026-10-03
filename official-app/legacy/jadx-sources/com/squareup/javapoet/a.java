package com.squareup.javapoet;

import java.util.function.BiConsumer;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class a implements BiConsumer {
    @Override // java.util.function.BiConsumer
    public final void accept(Object obj, Object obj2) {
        ((CodeBlock.CodeBlockJoiner) obj).add((CodeBlock) obj2);
    }
}
