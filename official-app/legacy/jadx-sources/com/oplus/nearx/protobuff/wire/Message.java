package com.oplus.nearx.protobuff.wire;

import com.oplus.nearx.protobuff.wire.Message;
import com.oplus.nearx.protobuff.wire.Message.a;
import java.io.IOException;
import java.io.ObjectStreamException;
import java.io.OutputStream;
import java.io.Serializable;
import okio.Buffer;
import okio.BufferedSink;
import okio.ByteString;

/* JADX INFO: loaded from: classes8.dex */
public abstract class Message<M extends Message<M, B>, B extends a<M, B>> implements Serializable {
    private static final long serialVersionUID = 0;
    private final transient ProtoAdapter<M> adapter;
    transient int cachedSerializedSize = 0;
    protected transient int hashCode = 0;
    private final transient ByteString unknownFields;

    public static abstract class a<T extends Message<T, B>, B extends a<T, B>> {
        public Buffer a;
        public b b;

        public final a<T, B> a(int i, FieldEncoding fieldEncoding, Object obj) {
            if (this.b == null) {
                Buffer buffer = new Buffer();
                this.a = buffer;
                this.b = new b(buffer);
            }
            try {
                fieldEncoding.rawProtoAdapter().l(this.b, i, obj);
                return this;
            } catch (IOException unused) {
                throw new AssertionError();
            }
        }

        public abstract T b();

        public final a<T, B> c() {
            this.b = null;
            this.a = null;
            return this;
        }
    }

    public Message(ProtoAdapter<M> protoAdapter, ByteString byteString) {
        if (protoAdapter == null) {
            throw new NullPointerException("adapter == null");
        }
        if (byteString == null) {
            throw new NullPointerException("unknownFields == null");
        }
        this.adapter = protoAdapter;
        this.unknownFields = byteString;
    }

    public final ProtoAdapter<M> adapter() {
        return this.adapter;
    }

    public final void encode(OutputStream outputStream) throws IOException {
        this.adapter.i(outputStream, this);
    }

    public abstract a<M, B> newBuilder();

    public String toString() {
        return this.adapter.s(this);
    }

    public final ByteString unknownFields() {
        ByteString byteString = this.unknownFields;
        return byteString != null ? byteString : ByteString.EMPTY;
    }

    public final M withoutUnknownFields() {
        return (M) newBuilder().c().b();
    }

    public final Object writeReplace() throws ObjectStreamException {
        return new MessageSerializedForm(encode(), getClass());
    }

    public final void encode(BufferedSink bufferedSink) throws IOException {
        this.adapter.j(bufferedSink, this);
    }

    public final byte[] encode() {
        return this.adapter.k(this);
    }
}
