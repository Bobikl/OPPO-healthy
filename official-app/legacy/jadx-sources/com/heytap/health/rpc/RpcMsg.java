package com.heytap.health.rpc;

import android.os.Parcel;
import android.os.Parcelable;
import com.heytap.voiceassistant.sdk.tts.constant.SpeechConstant;
import com.oplus.utrace.db.UTraceSQLiteHelperKt;
import io.protostuff.MapSchema;
import java.util.concurrent.atomic.AtomicInteger;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.DefaultConstructorMarker;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes17.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010\u0012\n\u0002\b\f\u0018\u0000 '2\u00020\u0001:\u0001(B5\b\u0002\u0012\u0006\u0010\u000b\u001a\u00020\u0004\u0012\u0006\u0010\u0011\u001a\u00020\u0004\u0012\u0006\u0010\u0015\u001a\u00020\u0014\u0012\u0006\u0010\u001a\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u001d¢\u0006\u0004\b$\u0010%B\u0011\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b$\u0010&J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\b\u0010\b\u001a\u00020\u0004H\u0016J\b\u0010\n\u001a\u00020\tH\u0016R\"\u0010\u000b\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\"\u0010\u0011\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0011\u0010\f\u001a\u0004\b\u0012\u0010\u000e\"\u0004\b\u0013\u0010\u0010R\"\u0010\u0015\u001a\u00020\u00148\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0015\u0010\u0017\"\u0004\b\u0018\u0010\u0019R\"\u0010\u001a\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001a\u0010\f\u001a\u0004\b\u001b\u0010\u000e\"\u0004\b\u001c\u0010\u0010R$\u0010\u001e\u001a\u0004\u0018\u00010\u001d8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#¨\u0006)"}, d2 = {"Lcom/heytap/health/rpc/RpcMsg;", "Landroid/os/Parcelable;", "Landroid/os/Parcel;", "parcel", "", UTraceSQLiteHelperKt.COL_FLAGS, "", "writeToParcel", "describeContents", "", "toString", SpeechConstant.KEY_EVENT_SID, "I", "getSid", "()I", "setSid", "(I)V", "cid", "getCid", "setCid", "", "isRespMsg", "Z", "()Z", "setRespMsg", "(Z)V", "msgId", "getMsgId", "setMsgId", "", "data", "[B", "getData", "()[B", "setData", "([B)V", "<init>", "(IIZI[B)V", "(Landroid/os/Parcel;)V", "CREATOR", "a", "lib_rpc_base_release"}, k = 1, mv = {1, 8, 0})
public final class RpcMsg implements Parcelable {

    /* JADX INFO: renamed from: CREATOR, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final AtomicInteger atomicInt = new AtomicInteger(1);
    private int cid;

    @Nullable
    private byte[] data;
    private boolean isRespMsg;
    private int msgId;
    private int sid;

    /* JADX INFO: renamed from: com.heytap.health.rpc.RpcMsg$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0004\n\u0002\u0010\u0012\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0003H\u0016J\u001f\u0010\t\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\nJ\"\u0010\u000f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u00062\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\rJ(\u0010\u0011\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\u00062\b\u0010\u000e\u001a\u0004\u0018\u00010\rJ\b\u0010\u0012\u001a\u00020\u0006H\u0002R\u0014\u0010\u0014\u001a\u00020\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015¨\u0006\u0018"}, d2 = {"Lcom/heytap/health/rpc/RpcMsg$a;", "Landroid/os/Parcelable$Creator;", "Lcom/heytap/health/rpc/RpcMsg;", "Landroid/os/Parcel;", "parcel", "a", "", "size", "", "f", "(I)[Lcom/heytap/health/rpc/RpcMsg;", SpeechConstant.KEY_EVENT_SID, "cid", "", "data", "b", "respId", "d", MapSchema.FIELD_NAME_ENTRY, "Ljava/util/concurrent/atomic/AtomicInteger;", "atomicInt", "Ljava/util/concurrent/atomic/AtomicInteger;", "<init>", "()V", "lib_rpc_base_release"}, k = 1, mv = {1, 8, 0})
    public static final class Companion implements Parcelable.Creator<RpcMsg> {
        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static /* synthetic */ RpcMsg c(Companion companion, int i, int i2, byte[] bArr, int i3, Object obj) {
            if ((i3 & 4) != 0) {
                bArr = null;
            }
            return companion.b(i, i2, bArr);
        }

        @Override // android.os.Parcelable.Creator
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public RpcMsg createFromParcel(@NotNull Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new RpcMsg(parcel);
        }

        @NotNull
        public final RpcMsg b(int sid, int cid, @Nullable byte[] data) {
            return new RpcMsg(sid, cid, false, e(), data, null);
        }

        @NotNull
        public final RpcMsg d(int sid, int cid, int respId, @Nullable byte[] data) {
            return new RpcMsg(sid, cid, true, respId, data, null);
        }

        public final int e() {
            if (RpcMsg.atomicInt.get() == Integer.MAX_VALUE) {
                RpcMsg.atomicInt.set(1);
            }
            return RpcMsg.atomicInt.getAndIncrement();
        }

        @Override // android.os.Parcelable.Creator
        @NotNull
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public RpcMsg[] newArray(int size) {
            return new RpcMsg[size];
        }
    }

    public /* synthetic */ RpcMsg(int i, int i2, boolean z, int i3, byte[] bArr, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, i2, z, i3, bArr);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public final int getCid() {
        return this.cid;
    }

    @Nullable
    public final byte[] getData() {
        return this.data;
    }

    public final int getMsgId() {
        return this.msgId;
    }

    public final int getSid() {
        return this.sid;
    }

    /* JADX INFO: renamed from: isRespMsg, reason: from getter */
    public final boolean getIsRespMsg() {
        return this.isRespMsg;
    }

    public final void setCid(int i) {
        this.cid = i;
    }

    public final void setData(@Nullable byte[] bArr) {
        this.data = bArr;
    }

    public final void setMsgId(int i) {
        this.msgId = i;
    }

    public final void setRespMsg(boolean z) {
        this.isRespMsg = z;
    }

    public final void setSid(int i) {
        this.sid = i;
    }

    @NotNull
    public String toString() {
        int i = this.sid;
        int i2 = this.cid;
        boolean z = this.isRespMsg;
        int i3 = this.msgId;
        byte[] bArr = this.data;
        return "RpcMsg(sid=" + i + ", cid=" + i2 + ", isResponse=" + z + ", msgId=" + i3 + ", dataSize=" + (bArr != null ? Integer.valueOf(bArr.length) : null) + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel parcel, int flags) {
        Intrinsics.checkNotNullParameter(parcel, "parcel");
        parcel.writeInt(this.sid);
        parcel.writeInt(this.cid);
        parcel.writeByte(this.isRespMsg ? (byte) 1 : (byte) 0);
        parcel.writeInt(this.msgId);
        parcel.writeByteArray(this.data);
    }

    private RpcMsg(int i, int i2, boolean z, int i3, byte[] bArr) {
        this.sid = i;
        this.cid = i2;
        this.isRespMsg = z;
        this.msgId = i3;
        this.data = bArr;
    }

    public /* synthetic */ RpcMsg(int i, int i2, boolean z, int i3, byte[] bArr, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, i2, z, i3, (i4 & 16) != 0 ? null : bArr);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public RpcMsg(@NotNull Parcel parcel) {
        this(parcel.readInt(), parcel.readInt(), parcel.readByte() != 0, parcel.readInt(), parcel.createByteArray());
        Intrinsics.checkNotNullParameter(parcel, "parcel");
    }
}
