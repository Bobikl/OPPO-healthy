package com.heytap.speech.engine.protocol.event.payload.customerData;

import androidx.annotation.Keep;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.DefaultConstructorMarker;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
@Keep
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001d\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0005J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0003HÆ\u0003J!\u0010\u000e\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001R\u001c\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u0007\"\u0004\b\u000b\u0010\t¨\u0006\u0015"}, d2 = {"Lcom/heytap/speech/engine/protocol/event/payload/customerData/ContactItem;", "", "name", "", "relatives", "(Ljava/lang/String;Ljava/lang/String;)V", "getName", "()Ljava/lang/String;", "setName", "(Ljava/lang/String;)V", "getRelatives", "setRelatives", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "protocol_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final /* data */ class ContactItem {

    @Nullable
    private String name;

    @Nullable
    private String relatives;

    /* JADX WARN: Multi-variable type inference failed */
    public ContactItem() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ ContactItem copy$default(ContactItem contactItem, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = contactItem.name;
        }
        if ((i & 2) != 0) {
            str2 = contactItem.relatives;
        }
        return contactItem.copy(str, str2);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getName() {
        return this.name;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getRelatives() {
        return this.relatives;
    }

    @NotNull
    public final ContactItem copy(@Nullable String name, @Nullable String relatives) {
        return new ContactItem(name, relatives);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ContactItem)) {
            return false;
        }
        ContactItem contactItem = (ContactItem) other;
        return Intrinsics.areEqual(this.name, contactItem.name) && Intrinsics.areEqual(this.relatives, contactItem.relatives);
    }

    @Nullable
    public final String getName() {
        return this.name;
    }

    @Nullable
    public final String getRelatives() {
        return this.relatives;
    }

    public int hashCode() {
        String str = this.name;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.relatives;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public final void setName(@Nullable String str) {
        this.name = str;
    }

    public final void setRelatives(@Nullable String str) {
        this.relatives = str;
    }

    @NotNull
    public String toString() {
        return "ContactItem(name=" + ((Object) this.name) + ", relatives=" + ((Object) this.relatives) + ')';
    }

    public ContactItem(@Nullable String str, @Nullable String str2) {
        this.name = str;
        this.relatives = str2;
    }

    public /* synthetic */ ContactItem(String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2);
    }
}
