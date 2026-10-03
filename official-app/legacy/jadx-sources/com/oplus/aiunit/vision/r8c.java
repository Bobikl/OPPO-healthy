package com.oplus.aiunit.vision;

import com.oplus.nearx.track.internal.utils.HashCode;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 \n2\u00020\u0001:\u0001\u0005B\u000f\u0012\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\b\u0010\tJ\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002R\u0014\u0010\u0007\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u000b"}, d2 = {"Lcom/oplus/aiunit/vision/r8c;", "", "", "input", "Lcom/oplus/nearx/track/internal/utils/HashCode;", "a", "I", "seed", "<init>", "(I)V", "Companion", "core-statistics_release"}, k = 1, mv = {1, 7, 1})
public final class r8c {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    public final int seed;

    /* JADX INFO: renamed from: com.oplus.aiunit.vision.r8c$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\t\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u0016\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002J\u000e\u0010\b\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0002J\u0016\u0010\t\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0002R\u0014\u0010\n\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u0014\u0010\f\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\f\u0010\u000bR\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000e\u0010\u000f¨\u0006\u0012"}, d2 = {"Lcom/oplus/aiunit/vision/r8c$a;", "", "", "h1", "length", "Lcom/oplus/nearx/track/internal/utils/HashCode;", "a", "k1", "c", "b", c8l.KEY_C1, "I", c8l.KEY_C2, "", "serialVersionUID", "J", "<init>", "()V", "core-statistics_release"}, k = 1, mv = {1, 7, 1})
    public static final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final HashCode a(int h1, int length) {
            int i = h1 ^ length;
            int i2 = (i ^ (i >>> 16)) * (-2048144789);
            int i3 = (i2 ^ (i2 >>> 13)) * (-1028477387);
            return HashCode.INSTANCE.a(i3 ^ (i3 >>> 16));
        }

        public final int b(int h1, int k1) {
            return (Integer.rotateLeft(h1 ^ k1, 13) * 5) - 430675100;
        }

        public final int c(int k1) {
            return Integer.rotateLeft(k1 * (-862048943), 15) * 461845907;
        }
    }

    public r8c(int i) {
        this.seed = i;
    }

    @NotNull
    public final HashCode a(int input) {
        Companion companion = INSTANCE;
        return companion.a(companion.b(this.seed, companion.c(input)), 4);
    }
}
