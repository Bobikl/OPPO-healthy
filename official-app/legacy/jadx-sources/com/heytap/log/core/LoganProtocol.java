package com.heytap.log.core;

/* JADX INFO: loaded from: classes19.dex */
public class LoganProtocol implements LoganProtocolHandler {
    private LoganProtocolHandler mCurProtocol;
    private boolean mIsInit;
    private OnLoganProtocolStatus mLoganProtocolStatus;

    @Override // com.heytap.log.core.LoganProtocolHandler
    public void logan_clean() {
        LoganProtocolHandler loganProtocolHandler = this.mCurProtocol;
        if (loganProtocolHandler != null) {
            loganProtocolHandler.logan_clean();
        }
    }

    @Override // com.heytap.log.core.LoganProtocolHandler
    public void logan_debug(boolean z) {
        LoganProtocolHandler loganProtocolHandler = this.mCurProtocol;
        if (loganProtocolHandler != null) {
            loganProtocolHandler.logan_debug(z);
        }
    }

    @Override // com.heytap.log.core.LoganProtocolHandler
    public void logan_flush() {
        LoganProtocolHandler loganProtocolHandler = this.mCurProtocol;
        if (loganProtocolHandler != null) {
            loganProtocolHandler.logan_flush();
        }
    }

    @Override // com.heytap.log.core.LoganProtocolHandler
    public void logan_init(String str, String str2, int i, String str3, String str4, int i2) {
        if (this.mIsInit) {
            return;
        }
        if (!CLoganProtocol.isCloganSuccess()) {
            this.mCurProtocol = null;
            return;
        }
        CLoganProtocol cLoganProtocol = new CLoganProtocol();
        this.mCurProtocol = cLoganProtocol;
        cLoganProtocol.setOnLoganProtocolStatus(this.mLoganProtocolStatus);
        this.mCurProtocol.logan_init(str, str2, i, str3, str4, i2);
        this.mIsInit = true;
    }

    @Override // com.heytap.log.core.LoganProtocolHandler
    public void logan_open(String str) {
        LoganProtocolHandler loganProtocolHandler = this.mCurProtocol;
        if (loganProtocolHandler != null) {
            loganProtocolHandler.logan_open(str);
        }
    }

    @Override // com.heytap.log.core.LoganProtocolHandler
    public void logan_write(int i, String str, long j2, String str2, long j3) {
        LoganProtocolHandler loganProtocolHandler = this.mCurProtocol;
        if (loganProtocolHandler != null) {
            loganProtocolHandler.logan_write(i, str, j2, str2, j3);
        }
    }

    @Override // com.heytap.log.core.LoganProtocolHandler
    public void setOnLoganProtocolStatus(OnLoganProtocolStatus onLoganProtocolStatus) {
        this.mLoganProtocolStatus = onLoganProtocolStatus;
    }
}
