package com.oplus.aiunit.vision;

import androidx.annotation.NonNull;
import androidx.room.ColumnInfo;
import androidx.room.Entity;
import com.heytap.accessory.pair.provider.ProtocolEventManager;
import java.util.Objects;

/* JADX INFO: loaded from: classes19.dex */
@Entity(primaryKeys = {"unique_flag", ProtocolEventManager.Event.MAC_ADDRESS})
public class ud4 {

    @NonNull
    @ColumnInfo(defaultValue = "", name = "unique_flag")
    public String b;
    public String d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public String f17424e;
    public boolean f;
    public int g;
    public int h;
    public String i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f17425j;
    public String k;

    @NonNull
    @ColumnInfo(defaultValue = "", name = ProtocolEventManager.Event.MAC_ADDRESS)
    public String a = "";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NonNull
    @ColumnInfo(defaultValue = "", name = "zip_file")
    public String f17423c = "";

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ud4 ud4Var = (ud4) obj;
        return this.a.equals(ud4Var.a) && this.b.equals(ud4Var.b);
    }

    public int hashCode() {
        return Objects.hash(this.a, this.b);
    }

    public String toString() {
        return "CreationRecord{macAddress='" + this.a + "', uniqueFlag='" + this.b + "', zipFile='" + this.f17423c + "', preview='" + this.d + "', originImg='" + this.f17424e + "', isCurrent=" + this.f + ", position=" + this.g + ", type=" + this.h + ", remark='" + this.i + "', isDelete=" + this.f17425j + ", packageName='" + this.k + "'}";
    }
}
