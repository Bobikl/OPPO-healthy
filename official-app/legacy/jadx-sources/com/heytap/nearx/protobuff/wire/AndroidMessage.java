package com.heytap.nearx.protobuff.wire;

import android.os.Parcel;
import android.os.Parcelable;
import com.heytap.nearx.protobuff.wire.Message;
import com.heytap.nearx.protobuff.wire.Message.a;
import java.io.IOException;
import java.lang.reflect.Array;
import okio.ByteString;

/* JADX INFO: loaded from: classes17.dex */
public abstract class AndroidMessage<M extends Message<M, B>, B extends Message.a<M, B>> extends Message<M, B> implements Parcelable {

    public static final class a<M> implements Parcelable.Creator<M> {
        public final ProtoAdapter<M> a;

        public a(ProtoAdapter<M> protoAdapter) {
            this.a = protoAdapter;
        }

        @Override // android.os.Parcelable.Creator
        public M createFromParcel(Parcel parcel) {
            try {
                return this.a.decode(parcel.createByteArray());
            } catch (IOException e2) {
                throw new RuntimeException(e2);
            }
        }

        @Override // android.os.Parcelable.Creator
        public M[] newArray(int i) {
            return (M[]) ((Object[]) Array.newInstance(this.a.javaType, i));
        }
    }

    public AndroidMessage(ProtoAdapter<M> protoAdapter, ByteString byteString) {
        super(protoAdapter, byteString);
    }

    public static <E> Parcelable.Creator<E> newCreator(ProtoAdapter<E> protoAdapter) {
        return new a(protoAdapter);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeByteArray(encode());
    }
}
