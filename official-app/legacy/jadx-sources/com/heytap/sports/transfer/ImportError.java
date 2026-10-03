package com.heytap.sports.transfer;

import androidx.compose.runtime.internal.StabilityInferred;
import com.heytap.log.consts.LogSenderConst;
import com.heytap.sports.R$string;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.DefaultConstructorMarker;
import p010kotlin.jvm.internal.Intrinsics;
import p010kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: classes2.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u0000\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00060\u0001j\u0002`\u0002:\u0007\u000e\u000f\u0010\u0011\u0012\u0013\u0014B!\b\u0004\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0010\b\u0002\u0010\u0005\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00070\u0006¢\u0006\u0002\u0010\bR\u001b\u0010\u0005\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00070\u0006¢\u0006\n\n\u0002\u0010\u000b\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r\u0082\u0001\u0007\u0015\u0016\u0017\u0018\u0019\u001a\u001b¨\u0006\u001c"}, d2 = {"Lcom/heytap/sports/transfer/ImportError;", "Ljava/lang/Exception;", "Lkotlin/Exception;", "messageResId", "", "formatArgs", "", "", "(I[Ljava/lang/Object;)V", "getFormatArgs", "()[Ljava/lang/Object;", "[Ljava/lang/Object;", "getMessageResId", "()I", "DataIncomplete", "DuplicateRecord", "EmptyZip", "FileTooLarge", "InsufficientMemory", "ParseError", "UnsupportedFormat", "Lcom/heytap/sports/transfer/ImportError$DataIncomplete;", "Lcom/heytap/sports/transfer/ImportError$DuplicateRecord;", "Lcom/heytap/sports/transfer/ImportError$EmptyZip;", "Lcom/heytap/sports/transfer/ImportError$FileTooLarge;", "Lcom/heytap/sports/transfer/ImportError$InsufficientMemory;", "Lcom/heytap/sports/transfer/ImportError$ParseError;", "Lcom/heytap/sports/transfer/ImportError$UnsupportedFormat;", "sport_impl_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nSportTransferManager.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SportTransferManager.kt\ncom/heytap/sports/transfer/ImportError\n+ 2 ArrayIntrinsics.kt\nkotlin/ArrayIntrinsicsKt\n*L\n1#1,714:1\n26#2:715\n*S KotlinDebug\n*F\n+ 1 SportTransferManager.kt\ncom/heytap/sports/transfer/ImportError\n*L\n53#1:715\n*E\n"})
public abstract class ImportError extends Exception {
    public static final int $stable = 8;

    @NotNull
    private final Object[] formatArgs;
    private final int messageResId;

    @StabilityInferred(parameters = 0)
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/heytap/sports/transfer/ImportError$DataIncomplete;", "Lcom/heytap/sports/transfer/ImportError;", LogSenderConst.FILENAME, "", "(Ljava/lang/String;)V", "getFileName", "()Ljava/lang/String;", "sport_impl_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    @SourceDebugExtension({"SMAP\nSportTransferManager.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SportTransferManager.kt\ncom/heytap/sports/transfer/ImportError$DataIncomplete\n+ 2 ArrayIntrinsics.kt\nkotlin/ArrayIntrinsicsKt\n*L\n1#1,714:1\n26#2:715\n*S KotlinDebug\n*F\n+ 1 SportTransferManager.kt\ncom/heytap/sports/transfer/ImportError$DataIncomplete\n*L\n65#1:715\n*E\n"})
    public static final class DataIncomplete extends ImportError {
        public static final int $stable = 0;

        @NotNull
        private final String fileName;

        /* JADX WARN: Multi-variable type inference failed */
        public DataIncomplete() {
            this(null, 1, 0 == true ? 1 : 0);
        }

        @NotNull
        public final String getFileName() {
            return this.fileName;
        }

        public /* synthetic */ DataIncomplete(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? "" : str);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public DataIncomplete(@NotNull String fileName) {
            super(fileName.length() > 0 ? R$string.sports_transfer_error_data_incomplete_named : R$string.sports_transfer_error_data_incomplete, fileName.length() > 0 ? new String[]{fileName} : new Object[0], null);
            Intrinsics.checkNotNullParameter(fileName, "fileName");
            this.fileName = fileName;
        }
    }

    @StabilityInferred(parameters = 0)
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/heytap/sports/transfer/ImportError$DuplicateRecord;", "Lcom/heytap/sports/transfer/ImportError;", "()V", "sport_impl_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class DuplicateRecord extends ImportError {
        public static final int $stable = 0;

        /* JADX WARN: Multi-variable type inference failed */
        public DuplicateRecord() {
            super(R$string.sports_transfer_error_duplicate_record, null, 2, 0 == true ? 1 : 0);
        }
    }

    @StabilityInferred(parameters = 0)
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/heytap/sports/transfer/ImportError$EmptyZip;", "Lcom/heytap/sports/transfer/ImportError;", LogSenderConst.FILENAME, "", "(Ljava/lang/String;)V", "getFileName", "()Ljava/lang/String;", "sport_impl_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    @SourceDebugExtension({"SMAP\nSportTransferManager.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SportTransferManager.kt\ncom/heytap/sports/transfer/ImportError$EmptyZip\n+ 2 ArrayIntrinsics.kt\nkotlin/ArrayIntrinsicsKt\n*L\n1#1,714:1\n26#2:715\n*S KotlinDebug\n*F\n+ 1 SportTransferManager.kt\ncom/heytap/sports/transfer/ImportError$EmptyZip\n*L\n60#1:715\n*E\n"})
    public static final class EmptyZip extends ImportError {
        public static final int $stable = 0;

        @NotNull
        private final String fileName;

        /* JADX WARN: Multi-variable type inference failed */
        public EmptyZip() {
            this(null, 1, 0 == true ? 1 : 0);
        }

        @NotNull
        public final String getFileName() {
            return this.fileName;
        }

        public /* synthetic */ EmptyZip(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? "" : str);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public EmptyZip(@NotNull String fileName) {
            super(fileName.length() > 0 ? R$string.sports_transfer_error_empty_zip_named : R$string.sports_transfer_error_empty_zip, fileName.length() > 0 ? new String[]{fileName} : new Object[0], null);
            Intrinsics.checkNotNullParameter(fileName, "fileName");
            this.fileName = fileName;
        }
    }

    @StabilityInferred(parameters = 0)
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/heytap/sports/transfer/ImportError$FileTooLarge;", "Lcom/heytap/sports/transfer/ImportError;", "()V", "sport_impl_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class FileTooLarge extends ImportError {
        public static final int $stable = 0;

        /* JADX WARN: Multi-variable type inference failed */
        public FileTooLarge() {
            super(R$string.sports_transfer_error_file_too_large, null, 2, 0 == true ? 1 : 0);
        }
    }

    @StabilityInferred(parameters = 0)
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/heytap/sports/transfer/ImportError$InsufficientMemory;", "Lcom/heytap/sports/transfer/ImportError;", "()V", "sport_impl_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class InsufficientMemory extends ImportError {
        public static final int $stable = 0;

        /* JADX WARN: Multi-variable type inference failed */
        public InsufficientMemory() {
            super(R$string.sports_transfer_error_insufficient_memory, null, 2, 0 == true ? 1 : 0);
        }
    }

    @StabilityInferred(parameters = 0)
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/heytap/sports/transfer/ImportError$ParseError;", "Lcom/heytap/sports/transfer/ImportError;", "detail", "", "(Ljava/lang/String;)V", "getDetail", "()Ljava/lang/String;", "sport_impl_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class ParseError extends ImportError {
        public static final int $stable = 0;

        @NotNull
        private final String detail;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ParseError(@NotNull String detail) {
            super(R$string.sports_transfer_error_parse_error, new String[]{detail}, null);
            Intrinsics.checkNotNullParameter(detail, "detail");
            this.detail = detail;
        }

        @NotNull
        public final String getDetail() {
            return this.detail;
        }
    }

    @StabilityInferred(parameters = 0)
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/heytap/sports/transfer/ImportError$UnsupportedFormat;", "Lcom/heytap/sports/transfer/ImportError;", "()V", "sport_impl_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class UnsupportedFormat extends ImportError {
        public static final int $stable = 0;

        /* JADX WARN: Multi-variable type inference failed */
        public UnsupportedFormat() {
            super(R$string.sports_transfer_error_unsupported_format, null, 2, 0 == true ? 1 : 0);
        }
    }

    public /* synthetic */ ImportError(int i, Object[] objArr, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, objArr);
    }

    @NotNull
    public final Object[] getFormatArgs() {
        return this.formatArgs;
    }

    public final int getMessageResId() {
        return this.messageResId;
    }

    public /* synthetic */ ImportError(int i, Object[] objArr, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, (i2 & 2) != 0 ? new Object[0] : objArr, null);
    }

    private ImportError(int i, Object[] objArr) {
        this.messageResId = i;
        this.formatArgs = objArr;
    }
}
