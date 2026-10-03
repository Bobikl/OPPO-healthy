package com.platform.usercenter.tools.statistics;

/* JADX INFO: loaded from: classes9.dex */
public class SessionFactory implements ISessionFactory {
    @Override // com.platform.usercenter.tools.statistics.ISessionFactory
    public ISession build(ISession iSession) {
        return iSession.create(iSession);
    }
}
