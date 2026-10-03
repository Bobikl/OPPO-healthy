package com.oplus.accountsdk.open.core.storage.table;

import androidx.annotation.Keep;
import androidx.annotation.NonNull;
import androidx.room.Entity;
import androidx.room.PrimaryKey;
import com.oplus.aiunit.vision.xa;
import java.io.Serializable;

/* JADX INFO: loaded from: classes6.dex */
@Entity(tableName = "ac_open_trace_chain_tb_new")
@Keep
public class AcOpenTraceChain implements Serializable {

    @NonNull
    private String chainContent;

    @NonNull
    @PrimaryKey(autoGenerate = true)
    private int id;

    @NonNull
    private String traceId;

    @NonNull
    public String getChainContent() {
        return this.chainContent;
    }

    public int getId() {
        return this.id;
    }

    @NonNull
    public String getTraceId() {
        return this.traceId;
    }

    public void setChainContent(@NonNull String str) {
        this.chainContent = str;
    }

    public void setId(int i) {
        this.id = i;
    }

    public void setTraceId(@NonNull String str) {
        this.traceId = str;
    }

    @NonNull
    public String toString() {
        return xa.d(this);
    }
}
