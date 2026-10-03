package com.oplus.aiunit.vision;

import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;
import p010kotlin.Metadata;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0012\u0010\u0003\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001*\u00020\u0000¨\u0006\u0004"}, d2 = {"", "Ljava/time/LocalDateTime;", "kotlin.jvm.PlatformType", "a", "databaseengine_release"}, k = 2, mv = {1, 8, 0})
public final class ptb {
    public static final LocalDateTime a(long j2) {
        return LocalDateTime.ofInstant(Instant.ofEpochMilli(j2), ZoneId.systemDefault());
    }
}
