package com.oplus.aiunit.core.data;

import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;
import p010kotlin.enums.EnumEntries;
import p010kotlin.enums.EnumEntriesKt;
import p010kotlin.jvm.JvmStatic;
import p010kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\b\b\u0086\u0081\u0002\u0018\u0000 \u00042\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0005B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\t"}, d2 = {"Lcom/oplus/aiunit/core/data/DownloadType;", "", "<init>", "(Ljava/lang/String;I)V", "Companion", "a", "DOWNLOAD_NONE", "DOWNLOAD_LOST", "DOWNLOAD_NEW", "aiunit.sdk.toolkits_release"}, k = 1, mv = {1, 9, 0})
public enum DownloadType {
    DOWNLOAD_NONE,
    DOWNLOAD_LOST,
    DOWNLOAD_NEW;

    private static final /* synthetic */ EnumEntries $ENTRIES = EnumEntriesKt.enumEntries(values());

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: com.oplus.aiunit.core.data.DownloadType$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0007¨\u0006\b"}, d2 = {"Lcom/oplus/aiunit/core/data/DownloadType$a;", "", "", "type", "Lcom/oplus/aiunit/core/data/DownloadType;", "a", "<init>", "()V", "aiunit.sdk.toolkits_release"}, k = 1, mv = {1, 9, 0})
    public static final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        @NotNull
        public final DownloadType a(int type) {
            if (type != 0) {
                if (type == 1) {
                    return DownloadType.DOWNLOAD_LOST;
                }
                if (type == 2) {
                    return DownloadType.DOWNLOAD_NEW;
                }
            }
            return DownloadType.DOWNLOAD_NONE;
        }
    }

    @JvmStatic
    @NotNull
    public static final DownloadType find(int i) {
        return INSTANCE.a(i);
    }

    @NotNull
    public static EnumEntries<DownloadType> getEntries() {
        return $ENTRIES;
    }
}
