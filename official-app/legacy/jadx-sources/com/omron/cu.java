package com.omron;

import java.util.UUID;

/* JADX INFO: loaded from: classes5.dex */
public class cu extends by {
    private UUID[] d;

    public cu() {
    }

    public cu(int i, int i2, byte[] bArr, UUID... uuidArr) {
        super(i, i2, bArr);
        this.d = uuidArr;
    }

    public UUID[] d() {
        return this.d;
    }

    @Override // com.omron.by
    public String toString() {
        if (this.d == null) {
            return String.format("UUIDs(%s)", "null");
        }
        StringBuilder sb = new StringBuilder();
        for (UUID uuid : this.d) {
            sb.append(uuid);
            sb.append(",");
        }
        if (sb.length() != 0) {
            sb.setLength(sb.length() - 1);
        }
        return String.format("UUIDs(%s)", sb.toString());
    }
}
