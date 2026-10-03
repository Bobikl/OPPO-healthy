package com.oplus.aiunit.vision;

import androidx.annotation.MainThread;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;
import p010kotlin.jvm.JvmField;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\bæ\u0080\u0001\u0018\u00002\u00020\u0001:\u0001\u0003J\b\u0010\u0003\u001a\u00020\u0002H'ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0004À\u0006\u0001"}, d2 = {"Lcom/oplus/aiunit/vision/nak;", "", "", "a", "coil-base_release"}, k = 1, mv = {1, 9, 0})
public interface nak {

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bæ\u0080\u0001\u0018\u0000 \b2\u00020\u0001:\u0001\u0007J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H&ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\tÀ\u0006\u0001"}, d2 = {"Lcom/oplus/aiunit/vision/nak$a;", "", "Lcom/oplus/aiunit/vision/rak;", "target", "Lcom/oplus/aiunit/vision/m4a;", "result", "Lcom/oplus/aiunit/vision/nak;", "a", "Companion", "coil-base_release"}, k = 1, mv = {1, 9, 0})
    public interface a {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        @NotNull
        public static final Companion INSTANCE = Companion.a;

        @JvmField
        @NotNull
        public static final a NONE = new nuc.a();

        /* JADX INFO: renamed from: com.oplus.aiunit.vision.nak$a$a, reason: collision with other inner class name and from kotlin metadata */
        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u0017\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0001¨\u0006\u0007"}, d2 = {"Lcom/oplus/aiunit/vision/nak$a$a;", "", "Lcom/oplus/aiunit/vision/nak$a;", "NONE", "Lcom/oplus/aiunit/vision/nak$a;", "<init>", "()V", "coil-base_release"}, k = 1, mv = {1, 9, 0})
        public static final class Companion {
            public static final /* synthetic */ Companion a = new Companion();
        }

        @NotNull
        nak a(@NotNull rak target, @NotNull m4a result);
    }

    @MainThread
    void a();
}
