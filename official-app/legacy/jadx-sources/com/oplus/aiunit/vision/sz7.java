package com.oplus.aiunit.vision;

import com.heytap.wearable.dialer.proto.ContactSyncProto;
import java.util.List;

/* JADX INFO: loaded from: classes19.dex */
public class sz7 extends ao9<ContactSyncProto.ContactSyncContact.Builder, r15> {
    public sz7(String str, List<ContactSyncProto.ContactSyncContact.Builder> list, List<r15> list2) {
        super(str, list, list2, new ao9.a() { // from class: com.oplus.aiunit.vision.rz7
            @Override // com.oplus.aiunit.vision.ao9.a
            public final int a(Object obj, yr9 yr9Var) {
                return sz7.q((ContactSyncProto.ContactSyncContact.Builder) obj, (r15) yr9Var);
            }
        });
    }

    public static /* synthetic */ int q(ContactSyncProto.ContactSyncContact.Builder builder, r15 r15Var) {
        return Long.compare(builder.getContactId(), r15Var.c());
    }

    @Override // com.oplus.aiunit.vision.ao9
    /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
    public r15 a(ContactSyncProto.ContactSyncContact.Builder builder) {
        r15 r15Var = new r15(f(), builder.getContactId());
        r15Var.i(builder.getContactLastUpdatedTimestamp());
        return r15Var;
    }

    @Override // com.oplus.aiunit.vision.ao9
    /* JADX INFO: renamed from: o, reason: merged with bridge method [inline-methods] */
    public ContactSyncProto.ContactSyncContact.Builder b(r15 r15Var) {
        return ContactSyncProto.ContactSyncContact.newBuilder().setContactId(r15Var.c());
    }

    @Override // com.oplus.aiunit.vision.ao9
    /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
    public boolean g(ContactSyncProto.ContactSyncContact.Builder builder, r15 r15Var) {
        return builder.getContactLastUpdatedTimestamp() == r15Var.e();
    }
}
