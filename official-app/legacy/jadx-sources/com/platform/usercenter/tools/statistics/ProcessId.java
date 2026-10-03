package com.platform.usercenter.tools.statistics;

import java.util.UUID;

/* JADX INFO: loaded from: classes9.dex */
public class ProcessId implements ISession {
    private final String mUuid = "account_" + UUID.randomUUID().toString().replace("-", "").toLowerCase();

    @Override // com.platform.usercenter.tools.statistics.ISession
    public ISession create(ISession iSession) {
        return this;
    }

    @Override // com.platform.usercenter.tools.statistics.ISession
    public long createTime() {
        return 0L;
    }

    @Override // com.platform.usercenter.tools.statistics.ISession
    public String unique() {
        return this.mUuid;
    }
}
