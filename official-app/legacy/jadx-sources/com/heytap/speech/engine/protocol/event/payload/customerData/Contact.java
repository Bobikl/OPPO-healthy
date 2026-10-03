package com.heytap.speech.engine.protocol.event.payload.customerData;

import androidx.annotation.Keep;
import com.heytap.speech.engine.protocol.event.Payload;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.DefaultConstructorMarker;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
@Keep
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\b\u0087\b\u0018\u0000 \u00192\u00020\u0001:\u0001\u001aB\u001f\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0017\u0010\u0018J\u000b\u0010\u0003\u001a\u0004\u0018\u00010\u0002HÆ\u0003J\u000f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0003J%\u0010\t\u001a\u00020\u00002\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00022\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001J\t\u0010\n\u001a\u00020\u0002HÖ\u0001J\t\u0010\f\u001a\u00020\u000bHÖ\u0001J\u0013\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\b\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016¨\u0006\u001b"}, d2 = {"Lcom/heytap/speech/engine/protocol/event/payload/customerData/Contact;", "Lcom/heytap/speech/engine/protocol/event/Payload;", "", "component1", "", "Lcom/heytap/speech/engine/protocol/event/payload/customerData/ContactItem;", "component2", "compression", "data", "copy", "toString", "", "hashCode", "", "other", "", "equals", "Ljava/lang/String;", "getCompression", "()Ljava/lang/String;", "Ljava/util/List;", "getData", "()Ljava/util/List;", "<init>", "(Ljava/lang/String;Ljava/util/List;)V", "Companion", "a", "protocol_release"}, k = 1, mv = {1, 5, 1})
public final /* data */ class Contact extends Payload {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final String VERSION = "2.0";

    @Nullable
    private final String compression;

    @NotNull
    private final List<ContactItem> data;

    /* JADX INFO: renamed from: com.heytap.speech.engine.protocol.event.payload.customerData.Contact$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0007\u0010\bR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0086D¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006¨\u0006\t"}, d2 = {"Lcom/heytap/speech/engine/protocol/event/payload/customerData/Contact$a;", "", "", "VERSION", "Ljava/lang/String;", "a", "()Ljava/lang/String;", "<init>", "()V", "protocol_release"}, k = 1, mv = {1, 5, 1})
    public static final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final String a() {
            return Contact.VERSION;
        }
    }

    public Contact(@Nullable String str, @NotNull List<ContactItem> data) {
        Intrinsics.checkNotNullParameter(data, "data");
        this.compression = str;
        this.data = data;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Contact copy$default(Contact contact, String str, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            str = contact.compression;
        }
        if ((i & 2) != 0) {
            list = contact.data;
        }
        return contact.copy(str, list);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getCompression() {
        return this.compression;
    }

    @NotNull
    public final List<ContactItem> component2() {
        return this.data;
    }

    @NotNull
    public final Contact copy(@Nullable String compression, @NotNull List<ContactItem> data) {
        Intrinsics.checkNotNullParameter(data, "data");
        return new Contact(compression, data);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Contact)) {
            return false;
        }
        Contact contact = (Contact) other;
        return Intrinsics.areEqual(this.compression, contact.compression) && Intrinsics.areEqual(this.data, contact.data);
    }

    @Nullable
    public final String getCompression() {
        return this.compression;
    }

    @NotNull
    public final List<ContactItem> getData() {
        return this.data;
    }

    public int hashCode() {
        String str = this.compression;
        return ((str == null ? 0 : str.hashCode()) * 31) + this.data.hashCode();
    }

    @NotNull
    public String toString() {
        return "Contact(compression=" + ((Object) this.compression) + ", data=" + this.data + ')';
    }
}
