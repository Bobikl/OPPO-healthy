package com.oplus.pantaconnect.sdk.connection;

import com.google.protobuf.ByteString;
import com.heytap.databaseengineservice.db.table.sportrecord.DBSportMetadata;
import com.oplus.pantaconnect.agents.ConnectParams;
import com.oplus.pantaconnect.agents.ExtensionArgs;
import com.oplus.pantaconnect.sdk.RequestScope;
import com.oplus.utrace.db.UTraceSQLiteHelperKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\n\u0010\n\u001a\u0004\u0018\u00010\u000bH&J\b\u0010\f\u001a\u00020\rH&J\u0012\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011H&J\u0012\u0010\u0012\u001a\u00020\u000f2\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014H&R\u0012\u0010\u0002\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u0012\u0010\u0006\u001a\u00020\u0007X¦\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\t¨\u0006\u0015"}, d2 = {"Lcom/oplus/pantaconnect/sdk/connection/ConnectionExtension;", "", "requestScope", "Lcom/oplus/pantaconnect/sdk/RequestScope;", "getRequestScope", "()Lcom/oplus/pantaconnect/sdk/RequestScope;", "type", "", "getType", "()Ljava/lang/String;", "connectionOptions", "Lcom/oplus/pantaconnect/agents/ConnectParams;", "getConnectionId", "", "setAgentExtension", "", DBSportMetadata.EXTENSION, "Lcom/oplus/pantaconnect/agents/ExtensionArgs;", "setConnectionInfo", UTraceSQLiteHelperKt.COL_INFO, "Lcom/google/protobuf/ByteString;", "core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public interface ConnectionExtension {
    @Nullable
    ConnectParams connectionOptions();

    long getConnectionId();

    @NotNull
    RequestScope getRequestScope();

    @NotNull
    String getType();

    void setAgentExtension(@Nullable ExtensionArgs extension);

    void setConnectionInfo(@Nullable ByteString info);
}
