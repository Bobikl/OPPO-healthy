package com.omron;

/* JADX INFO: loaded from: classes5.dex */
public class bs extends by {
    private int d;

    public bs(int i, int i2, byte[] bArr, int i3) {
        super(i, i2, bArr);
        this.d = i3;
    }

    @Override // com.omron.by
    public String toString() {
        return String.format("ADManufacturerSpecific(Length=%d,Type=0x%02X,CompanyID=0x%04X)", Integer.valueOf(b()), Integer.valueOf(c()), Integer.valueOf(this.d));
    }
}
