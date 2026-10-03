package com.heytap.health.watch.contactsync.data;

import com.heytap.wearable.dialer.proto.ContactSyncProto;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;
import p010kotlin.jvm.functions.Function1;
import p010kotlin.jvm.internal.FunctionReferenceImpl;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
public /* synthetic */ class ContactsRemoteDataSource$query$1 extends FunctionReferenceImpl implements Function1<ContactSyncProto.ContactSyncContact.Builder, Long> {
    public static final ContactsRemoteDataSource$query$1 INSTANCE = new ContactsRemoteDataSource$query$1();

    public ContactsRemoteDataSource$query$1() {
        super(1, ContactSyncProto.ContactSyncContact.Builder.class, "getContactId", "getContactId()J", 0);
    }

    @Override // p010kotlin.jvm.functions.Function1
    @NotNull
    public final Long invoke(@NotNull ContactSyncProto.ContactSyncContact.Builder p0) {
        Intrinsics.checkNotNullParameter(p0, "p0");
        return Long.valueOf(p0.getContactId());
    }
}
