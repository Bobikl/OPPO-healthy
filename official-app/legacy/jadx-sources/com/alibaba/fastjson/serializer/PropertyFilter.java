package com.alibaba.fastjson.serializer;

/* JADX INFO: loaded from: classes12.dex */
public interface PropertyFilter extends SerializeFilter {
    boolean apply(Object obj, String str, Object obj2);
}
