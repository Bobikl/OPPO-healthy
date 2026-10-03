package com.oplus.aiunit.vision;

import com.heytap.mcssdk.constant.MessageConstant$MessageType;

/* JADX INFO: loaded from: classes19.dex */
public class khm extends com.heytap.msp.push.mode.a {
    public String a;
    public String b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f13293c;
    public String d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f13294e;
    public String f;
    public int g = -2;
    public String h;
    public String i;

    @Override // com.heytap.msp.push.mode.a
    public int a() {
        return MessageConstant$MessageType.MESSAGE_CALL_BACK;
    }

    public void b(int i) {
        this.f13294e = i;
    }

    public void c(String str) {
        this.a = str;
    }

    public void d(int i) {
        this.g = i;
    }

    public void e(String str) {
        this.b = str;
    }

    public int f() {
        return this.f13294e;
    }

    public void g(String str) {
        this.f = str;
    }

    public String h() {
        return this.f;
    }

    public void i(String str) {
        this.i = str;
    }

    public int j() {
        return this.g;
    }

    public void k(String str) {
        this.h = str;
    }

    public String l() {
        return this.i;
    }

    public String m() {
        return this.h;
    }

    public String toString() {
        return "CallBackResult{, mRegisterID='" + this.f13293c + "', mSdkVersion='" + this.d + "', mCommand=" + this.f13294e + "', mContent='" + this.f + "', mAppPackage=" + this.h + "', mResponseCode=" + this.g + ", miniProgramPkg=" + this.i + '}';
    }
}
