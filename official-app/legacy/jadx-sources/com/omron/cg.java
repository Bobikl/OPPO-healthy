package com.omron;

/* JADX INFO: loaded from: classes5.dex */
public class cg extends by {
    private boolean d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f8865e;
    private boolean f;
    private boolean g;
    private boolean h;

    public cg(int i, int i2, byte[] bArr) {
        super(i, i2, bArr);
        a(bArr);
    }

    private void a(byte[] bArr) {
        if (bArr != null) {
            if (bArr.length < 1) {
                return;
            }
            byte b = bArr[0];
            this.d = (b & 1) != 0;
            this.f8865e = (b & 2) != 0;
            this.f = (b & 4) == 0;
            this.g = (b & 8) != 0;
            this.h = (b & 16) != 0;
        }
    }

    @Override // com.omron.by
    public String toString() {
        return String.format("Flags(LimitedDiscoverable=%s,GeneralDiscoverable=%s,LegacySupported=%s,ControllerSimultaneitySupported=%s,HostSimultaneitySupported=%s)", Boolean.valueOf(this.d), Boolean.valueOf(this.f8865e), Boolean.valueOf(this.f), Boolean.valueOf(this.g), Boolean.valueOf(this.h));
    }
}
