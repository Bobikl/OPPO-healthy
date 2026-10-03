package com.oplus.nearx.cloudconfig.stat;

import java.security.SecureRandom;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;
import p010kotlin.jvm.functions.Function0;
import p010kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Ljava/security/SecureRandom;", "invoke"}, k = 3, mv = {1, 1, 16})
final class TaskStat$Companion$sampleRandom$2 extends Lambda implements Function0<SecureRandom> {
    public static final TaskStat$Companion$sampleRandom$2 INSTANCE = new TaskStat$Companion$sampleRandom$2();

    public TaskStat$Companion$sampleRandom$2() {
        super(0);
    }

    @Override // p010kotlin.jvm.functions.Function0
    @NotNull
    public final SecureRandom invoke() {
        return new SecureRandom();
    }
}
