package com.heytap.sports.recommend.bean;

import androidx.annotation.Keep;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.DefaultConstructorMarker;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
@Keep
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\b\b\u0087\u0001\u0018\u0000 \u00042\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0005B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\t"}, d2 = {"Lcom/heytap/sports/recommend/bean/NormalStatus;", "", "<init>", "(Ljava/lang/String;I)V", "Companion", "a", "LEVEL_NONE", "LEVEL_NORMAL", "LEVEL_ABNORMAL", "recommend_release"}, k = 1, mv = {1, 8, 0})
public enum NormalStatus {
    LEVEL_NONE,
    LEVEL_NORMAL,
    LEVEL_ABNORMAL;


    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: com.heytap.sports.recommend.bean.NormalStatus$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\t"}, d2 = {"Lcom/heytap/sports/recommend/bean/NormalStatus$a;", "", "Lcom/heytap/sports/recommend/bean/NormalStatus;", "status", "", "a", "(Lcom/heytap/sports/recommend/bean/NormalStatus;)Ljava/lang/Integer;", "<init>", "()V", "recommend_release"}, k = 1, mv = {1, 8, 0})
    public static final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @Nullable
        public final Integer a(@NotNull NormalStatus status) {
            Intrinsics.checkNotNullParameter(status, "status");
            if (status == NormalStatus.LEVEL_NONE) {
                return null;
            }
            return Integer.valueOf(status.ordinal());
        }
    }
}
