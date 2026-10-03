package com.oplus.mydevices.sdk.constants;

import androidx.annotation.Keep;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.DefaultConstructorMarker;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
@Keep
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000f\b\u0087\u0001\u0018\u0000 \u00112\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0011B\u0017\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007j\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010¨\u0006\u0012"}, d2 = {"Lcom/oplus/mydevices/sdk/constants/ContentEventType;", "", "typeName", "", "typeKey", "(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;)V", "getTypeKey", "()Ljava/lang/String;", "getTypeName", "OTHER", "ADD", "DELETE", "UPDATE", "CLEAR", "VISIBLE", "SORT", "PRIVACY", "Companion", "sdk_domesticRelease"}, k = 1, mv = {1, 4, 0})
public enum ContentEventType {
    OTHER("Other", "0"),
    ADD("Add", "1"),
    DELETE("Delete", "2"),
    UPDATE("Update", "3"),
    CLEAR("Clear", "4"),
    VISIBLE("Visible", "5"),
    SORT("Sort", "6"),
    PRIVACY("Privacy", "7");


    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private final String typeKey;

    @NotNull
    private final String typeName;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006¨\u0006\u0007"}, d2 = {"Lcom/oplus/mydevices/sdk/constants/ContentEventType$Companion;", "", "()V", "from", "Lcom/oplus/mydevices/sdk/constants/ContentEventType;", "typeKey", "", "sdk_domesticRelease"}, k = 1, mv = {1, 4, 0})
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX WARN: Code duplicated, block: B:11:0x0021  */
        /* JADX WARN: Code duplicated, block: B:15:? A[RETURN, SYNTHETIC] */
        @NotNull
        public final ContentEventType from(@NotNull String typeKey) {
            Intrinsics.checkNotNullParameter(typeKey, "typeKey");
            for (ContentEventType contentEventType : ContentEventType.values()) {
                if (Intrinsics.areEqual(contentEventType.getTypeKey(), typeKey)) {
                    if (contentEventType != null) {
                        return contentEventType;
                    }
                    return ContentEventType.OTHER;
                }
            }
            contentEventType = null;
            if (contentEventType != null) {
                return contentEventType;
            }
            return ContentEventType.OTHER;
        }
    }

    ContentEventType(String str, String str2) {
        this.typeName = str;
        this.typeKey = str2;
    }

    @NotNull
    public final String getTypeKey() {
        return this.typeKey;
    }

    @NotNull
    public final String getTypeName() {
        return this.typeName;
    }
}
