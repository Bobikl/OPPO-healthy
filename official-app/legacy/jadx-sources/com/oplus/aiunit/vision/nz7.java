package com.oplus.aiunit.vision;

import com.google.protobuf.StringValue;
import com.heytap.wearable.dialer.proto.ContactSyncProto;
import java.util.List;
import java.util.Objects;

/* JADX INFO: loaded from: classes19.dex */
public class nz7 extends ao9<ContactSyncProto.ContactSyncBlockNum.Builder, m15> {
    public nz7(String str, List<ContactSyncProto.ContactSyncBlockNum.Builder> list, List<m15> list2) {
        super(str, list, list2, new ao9.a() { // from class: com.oplus.aiunit.vision.mz7
            @Override // com.oplus.aiunit.vision.ao9.a
            public final int a(Object obj, yr9 yr9Var) {
                return nz7.q((ContactSyncProto.ContactSyncBlockNum.Builder) obj, (m15) yr9Var);
            }
        });
    }

    public static /* synthetic */ int q(ContactSyncProto.ContactSyncBlockNum.Builder builder, m15 m15Var) {
        return Long.compare(builder.getId(), m15Var.c());
    }

    @Override // com.oplus.aiunit.vision.ao9
    /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
    public m15 a(ContactSyncProto.ContactSyncBlockNum.Builder builder) {
        m15 m15Var = new m15(f(), builder.getId());
        if (builder.hasOriginalNumber()) {
            m15Var.g(builder.getOriginalNumber().getValue());
        }
        return m15Var;
    }

    @Override // com.oplus.aiunit.vision.ao9
    /* JADX INFO: renamed from: o, reason: merged with bridge method [inline-methods] */
    public ContactSyncProto.ContactSyncBlockNum.Builder b(m15 m15Var) {
        final ContactSyncProto.ContactSyncBlockNum.Builder id = ContactSyncProto.ContactSyncBlockNum.newBuilder().setId(m15Var.c());
        Objects.requireNonNull(id);
        x64.c(new x64.a() { // from class: com.oplus.aiunit.vision.lz7
            @Override // com.oplus.aiunit.vision.x64.a
            public final void invoke(Object obj) {
                id.setOriginalNumber((StringValue) obj);
            }
        }, m15Var.e());
        return id;
    }

    @Override // com.oplus.aiunit.vision.ao9
    /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
    public boolean g(ContactSyncProto.ContactSyncBlockNum.Builder builder, m15 m15Var) {
        return true;
    }
}
