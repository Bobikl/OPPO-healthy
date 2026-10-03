package com.heytap.voiceassistant.sdk.tts.internal;

import com.heytap.voiceassistant.sdk.tts.closure.a.a;

/* JADX INFO: loaded from: classes19.dex */
public class CallerInfo {
    public String mAppId;
    public String mName;
    public String mPackageName;
    public String mUserId;
    public String mVersion;
    public String mVersionName;

    public String toString() {
        StringBuilder sbA = a.a("PackageName=");
        sbA.append(this.mPackageName);
        sbA.append(" name=");
        sbA.append(this.mName);
        sbA.append(" userId");
        sbA.append(this.mUserId);
        sbA.append(" appid=");
        sbA.append(this.mAppId);
        sbA.append(" version=");
        sbA.append(this.mVersion);
        sbA.append(" VersionName=");
        sbA.append(this.mVersionName);
        return sbA.toString();
    }
}
