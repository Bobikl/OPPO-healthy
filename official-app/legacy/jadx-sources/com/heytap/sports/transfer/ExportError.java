package com.heytap.sports.transfer;

import androidx.compose.runtime.internal.StabilityInferred;
import com.heytap.sports.R$string;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.DefaultConstructorMarker;
import p010kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: classes2.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u0000\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00060\u0001j\u0002`\u0002:\u0003\u000e\u000f\u0010B!\b\u0004\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0010\b\u0002\u0010\u0005\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00070\u0006¢\u0006\u0002\u0010\bR\u001b\u0010\u0005\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00070\u0006¢\u0006\n\n\u0002\u0010\u000b\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r\u0082\u0001\u0003\u0011\u0012\u0013¨\u0006\u0014"}, d2 = {"Lcom/heytap/sports/transfer/ExportError;", "Ljava/lang/Exception;", "Lkotlin/Exception;", "messageResId", "", "formatArgs", "", "", "(I[Ljava/lang/Object;)V", "getFormatArgs", "()[Ljava/lang/Object;", "[Ljava/lang/Object;", "getMessageResId", "()I", "InsufficientStorage", "NetworkError", "ServerError", "Lcom/heytap/sports/transfer/ExportError$InsufficientStorage;", "Lcom/heytap/sports/transfer/ExportError$NetworkError;", "Lcom/heytap/sports/transfer/ExportError$ServerError;", "sport_impl_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nSportTransferManager.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SportTransferManager.kt\ncom/heytap/sports/transfer/ExportError\n+ 2 ArrayIntrinsics.kt\nkotlin/ArrayIntrinsicsKt\n*L\n1#1,714:1\n26#2:715\n*S KotlinDebug\n*F\n+ 1 SportTransferManager.kt\ncom/heytap/sports/transfer/ExportError\n*L\n76#1:715\n*E\n"})
public abstract class ExportError extends Exception {
    public static final int $stable = 8;

    @NotNull
    private final Object[] formatArgs;
    private final int messageResId;

    @StabilityInferred(parameters = 0)
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/heytap/sports/transfer/ExportError$InsufficientStorage;", "Lcom/heytap/sports/transfer/ExportError;", "()V", "sport_impl_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class InsufficientStorage extends ExportError {
        public static final int $stable = 0;

        /* JADX WARN: Multi-variable type inference failed */
        public InsufficientStorage() {
            super(R$string.sports_transfer_error_export_storage, null, 2, 0 == true ? 1 : 0);
        }
    }

    @StabilityInferred(parameters = 0)
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/heytap/sports/transfer/ExportError$NetworkError;", "Lcom/heytap/sports/transfer/ExportError;", "()V", "sport_impl_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class NetworkError extends ExportError {
        public static final int $stable = 0;

        /* JADX WARN: Multi-variable type inference failed */
        public NetworkError() {
            super(R$string.sports_transfer_error_export_network, null, 2, 0 == true ? 1 : 0);
        }
    }

    @StabilityInferred(parameters = 0)
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/heytap/sports/transfer/ExportError$ServerError;", "Lcom/heytap/sports/transfer/ExportError;", "()V", "sport_impl_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class ServerError extends ExportError {
        public static final int $stable = 0;

        /* JADX WARN: Multi-variable type inference failed */
        public ServerError() {
            super(R$string.sports_transfer_error_server_busy, null, 2, 0 == true ? 1 : 0);
        }
    }

    public /* synthetic */ ExportError(int i, Object[] objArr, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, objArr);
    }

    @NotNull
    public final Object[] getFormatArgs() {
        return this.formatArgs;
    }

    public final int getMessageResId() {
        return this.messageResId;
    }

    public /* synthetic */ ExportError(int i, Object[] objArr, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, (i2 & 2) != 0 ? new Object[0] : objArr, null);
    }

    private ExportError(int i, Object[] objArr) {
        this.messageResId = i;
        this.formatArgs = objArr;
    }
}
