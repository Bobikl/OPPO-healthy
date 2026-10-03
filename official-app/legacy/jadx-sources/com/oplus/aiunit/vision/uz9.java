package com.oplus.aiunit.vision;

import com.heytap.nearx.taphttp.core.HeyCenter;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u001a\u0012\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000\u001a\u0012\u0010\u0006\u001a\u00020\u0005*\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u0002¨\u0006\u0007"}, d2 = {"Lcom/heytap/nearx/taphttp/core/HeyCenter;", "heyCenter", "", "a", "userAgent", "", "b", "com.heytap.nearx.common"}, k = 2, mv = {1, 4, 0})
public final class uz9 {

    @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\u0004"}, d2 = {"com/oplus/aiunit/vision/uz9$a", "Lcom/oplus/aiunit/vision/tz9;", "", "a", "com.heytap.nearx.common"}, k = 1, mv = {1, 4, 0})
    public static final class a implements tz9 {
        public final /* synthetic */ String a;

        public a(String str) {
            this.a = str;
        }

        @Override // com.oplus.aiunit.vision.tz9
        @NotNull
        /* JADX INFO: renamed from: a, reason: from getter */
        public String getA() {
            return this.a;
        }
    }

    @Nullable
    public static final String a(@Nullable HeyCenter heyCenter) {
        tz9 tz9Var;
        if (heyCenter == null || (tz9Var = (tz9) heyCenter.g(tz9.class)) == null) {
            return null;
        }
        return tz9Var.getA();
    }

    public static final void b(@NotNull HeyCenter setDefaultUserAgent, @NotNull String userAgent) {
        Intrinsics.checkNotNullParameter(setDefaultUserAgent, "$this$setDefaultUserAgent");
        Intrinsics.checkNotNullParameter(userAgent, "userAgent");
        setDefaultUserAgent.o(tz9.class, new a(userAgent));
    }
}
