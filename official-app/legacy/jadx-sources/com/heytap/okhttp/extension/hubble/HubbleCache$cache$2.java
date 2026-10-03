package com.heytap.okhttp.extension.hubble;

import java.util.concurrent.ConcurrentHashMap;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;
import p010kotlin.jvm.functions.Function0;
import p010kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes18.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "Ljava/util/concurrent/ConcurrentHashMap;", "", "Lcom/heytap/okhttp/extension/hubble/HubbleEntity;", "invoke"}, k = 3, mv = {1, 4, 0})
final class HubbleCache$cache$2 extends Lambda implements Function0<ConcurrentHashMap<String, HubbleEntity>> {
    public static final HubbleCache$cache$2 INSTANCE = new HubbleCache$cache$2();

    public HubbleCache$cache$2() {
        super(0);
    }

    @Override // p010kotlin.jvm.functions.Function0
    @NotNull
    public final ConcurrentHashMap<String, HubbleEntity> invoke() {
        return new ConcurrentHashMap<>();
    }
}
