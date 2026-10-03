package com.oplus.nearx.cloudconfig.impl;

import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;
import p010kotlin.jvm.functions.Function1;
import p010kotlin.jvm.internal.Intrinsics;
import p010kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "", "it", "invoke"}, k = 3, mv = {1, 1, 16})
final class EntityDBProvider$queryParams$where$1 extends Lambda implements Function1<String, String> {
    public static final EntityDBProvider$queryParams$where$1 INSTANCE = new EntityDBProvider$queryParams$where$1();

    public EntityDBProvider$queryParams$where$1() {
        super(1);
    }

    @Override // p010kotlin.jvm.functions.Function1
    @NotNull
    public final String invoke(@NotNull String it) {
        Intrinsics.checkParameterIsNotNull(it, "it");
        return String.valueOf(it);
    }
}
