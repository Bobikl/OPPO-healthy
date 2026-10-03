package com.heytap.speech.engine.protocol.event.payload.customerData;

import androidx.annotation.Keep;
import com.heytap.speech.engine.protocol.event.Payload;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
@Keep
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005J\u000b\u0010\t\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\u001f\u0010\u000b\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fHÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007¨\u0006\u0013"}, d2 = {"Lcom/heytap/speech/engine/protocol/event/payload/customerData/ZipContact;", "Lcom/heytap/speech/engine/protocol/event/Payload;", "compression", "", "data", "(Ljava/lang/String;Ljava/lang/String;)V", "getCompression", "()Ljava/lang/String;", "getData", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "protocol_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final /* data */ class ZipContact extends Payload {

    @Nullable
    private final String compression;

    @NotNull
    private final String data;

    public ZipContact(@Nullable String str, @NotNull String data) {
        Intrinsics.checkNotNullParameter(data, "data");
        this.compression = str;
        this.data = data;
    }

    public static /* synthetic */ ZipContact copy$default(ZipContact zipContact, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = zipContact.compression;
        }
        if ((i & 2) != 0) {
            str2 = zipContact.data;
        }
        return zipContact.copy(str, str2);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getCompression() {
        return this.compression;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getData() {
        return this.data;
    }

    @NotNull
    public final ZipContact copy(@Nullable String compression, @NotNull String data) {
        Intrinsics.checkNotNullParameter(data, "data");
        return new ZipContact(compression, data);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ZipContact)) {
            return false;
        }
        ZipContact zipContact = (ZipContact) other;
        return Intrinsics.areEqual(this.compression, zipContact.compression) && Intrinsics.areEqual(this.data, zipContact.data);
    }

    @Nullable
    public final String getCompression() {
        return this.compression;
    }

    @NotNull
    public final String getData() {
        return this.data;
    }

    public int hashCode() {
        String str = this.compression;
        return ((str == null ? 0 : str.hashCode()) * 31) + this.data.hashCode();
    }

    @NotNull
    public String toString() {
        return "ZipContact(compression=" + ((Object) this.compression) + ", data=" + this.data + ')';
    }
}
