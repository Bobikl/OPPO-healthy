package com.oplus.aiunit.vision;

import com.google.protobuf.StringValue;
import com.heytap.wearable.dialer.proto.ContactSyncProto;
import java.util.List;
import java.util.Objects;

/* JADX INFO: loaded from: classes19.dex */
public class qz7 extends ao9<ContactSyncProto.ContactSyncCallLog.Builder, n15> {
    public qz7(String str, List<ContactSyncProto.ContactSyncCallLog.Builder> list, List<n15> list2) {
        super(str, list, list2, new ao9.a() { // from class: com.oplus.aiunit.vision.pz7
            @Override // com.oplus.aiunit.vision.ao9.a
            public final int a(Object obj, yr9 yr9Var) {
                return qz7.q((ContactSyncProto.ContactSyncCallLog.Builder) obj, (n15) yr9Var);
            }
        });
    }

    public static /* synthetic */ int q(ContactSyncProto.ContactSyncCallLog.Builder builder, n15 n15Var) {
        return Long.compare(builder.getDate(), n15Var.c());
    }

    @Override // com.oplus.aiunit.vision.ao9
    /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
    public n15 a(ContactSyncProto.ContactSyncCallLog.Builder builder) {
        n15 n15Var = new n15(f(), builder.getId());
        if (builder.hasNumber()) {
            n15Var.k(builder.getNumber().getValue());
        }
        n15Var.i(builder.getDate());
        n15Var.j(builder.getLastModified());
        return n15Var;
    }

    @Override // com.oplus.aiunit.vision.ao9
    /* JADX INFO: renamed from: o, reason: merged with bridge method [inline-methods] */
    public ContactSyncProto.ContactSyncCallLog.Builder b(n15 n15Var) {
        final ContactSyncProto.ContactSyncCallLog.Builder lastModified = ContactSyncProto.ContactSyncCallLog.newBuilder().setId(n15Var.d()).setDate(n15Var.c()).setLastModified(n15Var.e());
        Objects.requireNonNull(lastModified);
        x64.c(new x64.a() { // from class: com.oplus.aiunit.vision.oz7
            @Override // com.oplus.aiunit.vision.x64.a
            public final void invoke(Object obj) {
                lastModified.setNumber((StringValue) obj);
            }
        }, n15Var.g());
        return lastModified;
    }

    @Override // com.oplus.aiunit.vision.ao9
    /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
    public boolean g(ContactSyncProto.ContactSyncCallLog.Builder builder, n15 n15Var) {
        return builder.getLastModified() == n15Var.e();
    }
}
