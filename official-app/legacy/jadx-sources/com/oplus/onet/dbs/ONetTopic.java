package com.oplus.onet.dbs;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.gson.annotations.SerializedName;
import com.oplus.aiunit.vision.zqm;
import java.util.Map;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
public class ONetTopic implements Parcelable {
    public static final Parcelable.Creator<ONetTopic> CREATOR = new a();

    @SerializedName("dbs_topic_name")
    @NotNull
    public final String name;

    @Nullable
    @SerializedName("dbs_topic_qos")
    public Map<String, String> qosOption;

    @SerializedName("dbs_topic_tag")
    public final int tag;

    public class a implements Parcelable.Creator<ONetTopic> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public ONetTopic createFromParcel(Parcel parcel) {
            return new ONetTopic(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public ONetTopic[] newArray(int i) {
            return new ONetTopic[i];
        }
    }

    public ONetTopic(@NotNull String str, int i, @Nullable Map map) {
        this.name = str;
        this.tag = i;
        this.qosOption = map;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ONetTopic)) {
            return false;
        }
        ONetTopic oNetTopic = (ONetTopic) obj;
        if (this.tag != oNetTopic.tag) {
            return false;
        }
        return this.name.equals(oNetTopic.name);
    }

    @NotNull
    public String getName() {
        return this.name;
    }

    @Nullable
    public Map<String, String> getQosOption() {
        return this.qosOption;
    }

    public int getTag() {
        return this.tag;
    }

    public int hashCode() {
        return (this.name.hashCode() * 31) + this.tag;
    }

    public void setQosOption(@Nullable Map<String, String> map) {
        this.qosOption = map;
    }

    public String toString() {
        StringBuilder sbA = zqm.a("ONetTopic{name='");
        sbA.append(this.name);
        sbA.append('\'');
        sbA.append(", tag=");
        sbA.append(this.tag);
        sbA.append(", qosOption=");
        sbA.append(this.qosOption);
        sbA.append('}');
        return sbA.toString();
    }

    public String toStringWithoutQos() {
        StringBuilder sbA = zqm.a("ONetTopic(name= ");
        sbA.append(this.name);
        sbA.append(", tag= ");
        sbA.append(this.tag);
        sbA.append(")");
        return sbA.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NonNull Parcel parcel, int i) {
        parcel.writeString(this.name);
        parcel.writeInt(this.tag);
        parcel.writeMap(this.qosOption);
    }

    public ONetTopic(@NotNull String str, int i) {
        this(str, i, null);
    }

    public ONetTopic(@NotNull String str) {
        this(str, 0);
    }

    public ONetTopic(Parcel parcel) {
        this.name = parcel.readString();
        this.tag = parcel.readInt();
        this.qosOption = parcel.readHashMap(getClass().getClassLoader());
    }
}
