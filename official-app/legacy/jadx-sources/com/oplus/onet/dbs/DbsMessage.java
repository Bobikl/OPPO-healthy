package com.oplus.onet.dbs;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.gson.annotations.SerializedName;
import com.oplus.aiunit.vision.wpg;
import com.oplus.aiunit.vision.zqm;
import com.oplus.smartenginehelper.entity.ClickApiEntity;
import java.util.Map;
import java.util.Objects;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
public class DbsMessage implements Parcelable {
    public static final Parcelable.Creator<DbsMessage> CREATOR = new a();

    @SerializedName("dbs_msg_encrypt")
    public final boolean encryption;

    @Nullable
    @SerializedName("dbs_msg_extra")
    public final Map extraOption;

    @SerializedName("dbs_msg_from_device")
    @NotNull
    public String fromDevice;

    @SerializedName("dbs_msg_id")
    @NotNull
    public String id;

    @SerializedName("dbs_msg_payload")
    @NotNull
    public final Object payload;

    @SerializedName("dbs_msg_priority")
    public int priority;

    @SerializedName(ClickApiEntity.TIME)
    @NotNull
    public long time;

    @SerializedName("dbs_msg_to_device")
    @NotNull
    public final String toDevice;

    @Nullable
    @SerializedName("dbs_msg_topic")
    public final ONetTopic topic;

    @SerializedName("dbs_msg_type")
    @NotNull
    public final String type;

    public class a implements Parcelable.Creator<DbsMessage> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public DbsMessage createFromParcel(Parcel parcel) {
            return new DbsMessage(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public DbsMessage[] newArray(int i) {
            return new DbsMessage[i];
        }
    }

    public static final class b {
    }

    public /* synthetic */ DbsMessage(b bVar, a aVar) {
        this(bVar);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DbsMessage)) {
            return false;
        }
        DbsMessage dbsMessage = (DbsMessage) obj;
        if (this.priority == dbsMessage.priority && this.encryption == dbsMessage.encryption && Objects.equals(this.topic, dbsMessage.topic) && this.toDevice.equals(dbsMessage.toDevice) && this.fromDevice.equals(dbsMessage.fromDevice) && this.type.equals(dbsMessage.type) && this.id.equals(dbsMessage.id) && this.payload.equals(dbsMessage.payload)) {
            return Objects.equals(this.extraOption, dbsMessage.extraOption);
        }
        return false;
    }

    public final boolean getEncryption() {
        return this.encryption;
    }

    @Nullable
    public Map getExtraOption() {
        return this.extraOption;
    }

    @NotNull
    public final String getFromDevice() {
        return this.fromDevice;
    }

    @NotNull
    public final String getId() {
        return this.id;
    }

    @NotNull
    public final Object getPayload() {
        return this.payload;
    }

    public final int getPriority() {
        return this.priority;
    }

    public long getTime() {
        return this.time;
    }

    @NotNull
    public final String getToDevice() {
        return this.toDevice;
    }

    @Nullable
    public final ONetTopic getTopic() {
        return this.topic;
    }

    @NotNull
    public final String getType() {
        return this.type;
    }

    public int hashCode() {
        ONetTopic oNetTopic = this.topic;
        int iHashCode = (((this.payload.hashCode() + ((this.id.hashCode() + ((this.type.hashCode() + ((((this.fromDevice.hashCode() + ((this.toDevice.hashCode() + ((oNetTopic != null ? oNetTopic.hashCode() : 0) * 31)) * 31)) * 31) + this.priority) * 31)) * 31)) * 31)) * 31) + (this.encryption ? 1 : 0)) * 31;
        Map map = this.extraOption;
        return iHashCode + (map != null ? map.hashCode() : 0);
    }

    public void setTime(long j2) {
        this.time = j2;
    }

    public String toString() {
        StringBuilder sbA = zqm.a("DbsMessage{topic=");
        sbA.append(this.topic);
        sbA.append(", toDevice='");
        sbA.append(wpg.e(this.toDevice));
        sbA.append('\'');
        sbA.append(", fromDevice='");
        sbA.append(wpg.e(this.fromDevice));
        sbA.append('\'');
        sbA.append(", priority=");
        sbA.append(this.priority);
        sbA.append(", type='");
        sbA.append(this.type);
        sbA.append('\'');
        sbA.append(", id='");
        sbA.append(this.id);
        sbA.append('\'');
        sbA.append(", payload=");
        sbA.append(wpg.b(this.payload.toString(), 5, 5));
        sbA.append(", encryption=");
        sbA.append(this.encryption);
        sbA.append(", extraOption=");
        sbA.append(this.extraOption);
        sbA.append('}');
        return sbA.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NonNull Parcel parcel, int i) {
        parcel.writeParcelable(this.topic, i);
        parcel.writeString(this.toDevice);
        parcel.writeString(this.fromDevice);
        parcel.writeInt(this.priority);
        parcel.writeString(this.type);
        parcel.writeString(this.id);
        parcel.writeValue(this.payload);
        parcel.writeByte(this.encryption ? (byte) 1 : (byte) 0);
        parcel.writeMap(this.extraOption);
    }

    private DbsMessage(@Nullable ONetTopic oNetTopic, @NonNull String str, @NonNull String str2, int i, @NonNull String str3, @NonNull String str4, @NonNull Object obj, boolean z, @Nullable Map<String, String> map) {
        this.time = System.currentTimeMillis();
        this.topic = oNetTopic;
        this.toDevice = str;
        this.fromDevice = str2;
        this.priority = i;
        this.type = str3;
        this.id = str4;
        this.payload = obj;
        this.encryption = z;
        this.extraOption = map;
    }

    private DbsMessage(b bVar) {
        throw null;
    }

    public DbsMessage(Parcel parcel) {
        this.time = System.currentTimeMillis();
        this.topic = (ONetTopic) parcel.readParcelable(ONetTopic.class.getClassLoader());
        this.toDevice = parcel.readString();
        this.fromDevice = parcel.readString();
        this.priority = parcel.readInt();
        this.type = parcel.readString();
        this.id = parcel.readString();
        this.payload = parcel.readValue(Object.class.getClassLoader());
        this.encryption = parcel.readByte() != 0;
        this.extraOption = parcel.readHashMap(getClass().getClassLoader());
    }
}
