package com.platform.usercenter.tools.statistics;

import java.util.UUID;

/* JADX INFO: loaded from: classes9.dex */
public class SessionId implements ISession {
    private static final long DEFAULT_EFFECTIVE_TIME = 1800000;
    private final String mUuid = UUID.randomUUID().toString().replace("-", "").toLowerCase();
    private final long mStartTime = System.currentTimeMillis();
    private final long mEffectiveTime = 1800000;

    @Override // com.platform.usercenter.tools.statistics.ISession
    public ISession create(ISession iSession) {
        return this.mEffectiveTime <= iSession.createTime() - System.currentTimeMillis() ? new SessionId() : this;
    }

    @Override // com.platform.usercenter.tools.statistics.ISession
    public long createTime() {
        return this.mStartTime;
    }

    @Override // com.platform.usercenter.tools.statistics.ISession
    public String unique() {
        return this.mUuid;
    }
}
