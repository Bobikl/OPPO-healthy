package com.heytap.health.watch.contactsync.db.table;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import androidx.room.ColumnInfo;
import androidx.room.Entity;
import com.heytap.accessory.pair.provider.ProtocolEventManager;
import com.heytap.databaseengineservice.db.table.healtharchives.DBHealthIndicatorDetail;

/* JADX INFO: loaded from: classes19.dex */
@Entity(primaryKeys = {ProtocolEventManager.Event.MAC_ADDRESS, "contact_id"}, tableName = "selectcontact_lite")
public class DBSelectContactLite implements Parcelable {
    public static final Parcelable.Creator<DBSelectContactLite> CREATOR = new a();

    @ColumnInfo(name = "contact_id")
    private long contactId;

    @NonNull
    @ColumnInfo(name = ProtocolEventManager.Event.MAC_ADDRESS)
    private String macAddress;

    @ColumnInfo(name = "name")
    private String name;

    @ColumnInfo(name = DBHealthIndicatorDetail.SORT)
    private int sort;

    public class a implements Parcelable.Creator<DBSelectContactLite> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public DBSelectContactLite createFromParcel(Parcel parcel) {
            return new DBSelectContactLite(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public DBSelectContactLite[] newArray(int i) {
            return new DBSelectContactLite[i];
        }
    }

    public DBSelectContactLite(@NonNull String str, long j2) {
        this.macAddress = str;
        this.contactId = j2;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public long getContactId() {
        return this.contactId;
    }

    @NonNull
    public String getMacAddress() {
        return this.macAddress;
    }

    public String getName() {
        return this.name;
    }

    public int getSort() {
        return this.sort;
    }

    public void setContactId(long j2) {
        this.contactId = j2;
    }

    public void setMacAddress(@NonNull String str) {
        this.macAddress = str;
    }

    public void setName(String str) {
        this.name = str;
    }

    public void setSort(int i) {
        this.sort = i;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.macAddress);
        parcel.writeLong(this.contactId);
        parcel.writeString(this.name);
        parcel.writeInt(this.sort);
    }

    public DBSelectContactLite(Parcel parcel) {
        this.macAddress = parcel.readString();
        this.contactId = parcel.readLong();
        this.name = parcel.readString();
        this.sort = parcel.readInt();
    }
}
