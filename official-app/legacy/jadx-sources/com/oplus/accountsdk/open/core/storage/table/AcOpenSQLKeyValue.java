package com.oplus.accountsdk.open.core.storage.table;

import androidx.annotation.Keep;
import androidx.annotation.NonNull;
import androidx.room.Entity;
import androidx.room.PrimaryKey;
import com.oplus.aiunit.vision.xa;
import java.io.Serializable;

/* JADX INFO: loaded from: classes6.dex */
@Entity(tableName = "ac_open_sql_config_tb")
@Keep
public class AcOpenSQLKeyValue implements Serializable {

    @NonNull
    @PrimaryKey
    private String sqlKey;

    @NonNull
    private String sqlValue;

    @NonNull
    public String getSqlKey() {
        return this.sqlKey;
    }

    public String getSqlValue() {
        return this.sqlValue;
    }

    public void setSqlKey(@NonNull String str) {
        this.sqlKey = str;
    }

    public void setSqlValue(String str) {
        this.sqlValue = str;
    }

    @NonNull
    public String toString() {
        return xa.d(this);
    }
}
