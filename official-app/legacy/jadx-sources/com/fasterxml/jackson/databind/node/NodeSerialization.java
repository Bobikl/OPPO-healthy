package com.fasterxml.jackson.databind.node;

import com.oplus.aiunit.vision.ifa;
import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import java.io.Serializable;

/* JADX INFO: loaded from: classes13.dex */
class NodeSerialization implements Serializable, Externalizable {
    private static final long serialVersionUID = 1;
    public byte[] json;

    public NodeSerialization() {
    }

    public NodeSerialization(byte[] bArr) {
        this.json = bArr;
    }

    public static NodeSerialization from(Object obj) {
        try {
            return new NodeSerialization(ifa.d(obj));
        } catch (IOException e2) {
            throw new IllegalArgumentException("Failed to JDK serialize `" + obj.getClass().getSimpleName() + "` value: " + e2.getMessage(), e2);
        }
    }

    @Override // java.io.Externalizable
    public void readExternal(ObjectInput objectInput) throws IOException {
        int i = objectInput.readInt();
        byte[] bArr = new byte[i];
        this.json = bArr;
        objectInput.readFully(bArr, 0, i);
    }

    public Object readResolve() {
        try {
            return ifa.a(this.json);
        } catch (IOException e2) {
            throw new IllegalArgumentException("Failed to JDK deserialize `JsonNode` value: " + e2.getMessage(), e2);
        }
    }

    @Override // java.io.Externalizable
    public void writeExternal(ObjectOutput objectOutput) throws IOException {
        objectOutput.writeInt(this.json.length);
        objectOutput.write(this.json);
    }
}
