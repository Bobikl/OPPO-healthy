package com.squareup.javapoet;

import java.util.function.BinaryOperator;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class b implements BinaryOperator {
    @Override // java.util.function.BiFunction
    public final Object apply(Object obj, Object obj2) {
        return ((CodeBlock.CodeBlockJoiner) obj).merge((CodeBlock.CodeBlockJoiner) obj2);
    }
}
