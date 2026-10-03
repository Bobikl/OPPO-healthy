package com.heytap.sports.transfer;

import androidx.compose.runtime.internal.StabilityInferred;
import com.heytap.databaseengine.model.OneTimeSport;
import com.heytap.databaseengine.model.UserInfo;
import com.heytap.webview.extension.protocol.Const;
import com.oplus.aiunit.vision.ImportResultDetail;
import java.io.File;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.DefaultConstructorMarker;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0003\u0007\b\t¨\u0006\n"}, d2 = {"Lcom/heytap/sports/transfer/a;", "", "<init>", "()V", "a", "b", "c", "Lcom/heytap/sports/transfer/a$a;", "Lcom/heytap/sports/transfer/a$b;", "Lcom/heytap/sports/transfer/a$c;", "sport_impl_release"}, k = 1, mv = {1, 8, 0})
public abstract class a {
    public static final int $stable = 0;

    /* JADX INFO: renamed from: com.heytap.sports.transfer.a$a, reason: collision with other inner class name and from toString */
    @StabilityInferred(parameters = 0)
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u000e\u001a\u00020\n¢\u0006\u0004\b\u000f\u0010\u0010J\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\t\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006HÖ\u0003R\u0017\u0010\u000e\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\u000b\u0010\r¨\u0006\u0011"}, d2 = {"Lcom/heytap/sports/transfer/a$a;", "Lcom/heytap/sports/transfer/a;", "", "toString", "", "hashCode", "", "other", "", "equals", "", "a", "Ljava/lang/Throwable;", "()Ljava/lang/Throwable;", "throwable", "<init>", "(Ljava/lang/Throwable;)V", "sport_impl_release"}, k = 1, mv = {1, 8, 0})
    public static final /* data */ class Error extends a {
        public static final int $stable = 8;

        /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
        @NotNull
        public final Throwable throwable;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Error(@NotNull Throwable throwable) {
            super(null);
            Intrinsics.checkNotNullParameter(throwable, "throwable");
            this.throwable = throwable;
        }

        @NotNull
        /* JADX INFO: renamed from: a, reason: from getter */
        public final Throwable getThrowable() {
            return this.throwable;
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Error) && Intrinsics.areEqual(this.throwable, ((Error) other).throwable);
        }

        public int hashCode() {
            return this.throwable.hashCode();
        }

        @NotNull
        public String toString() {
            return "Error(throwable=" + this.throwable + ")";
        }
    }

    /* JADX INFO: renamed from: com.heytap.sports.transfer.a$b, reason: from toString */
    @StabilityInferred(parameters = 0)
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u000e\u001a\u00020\n¢\u0006\u0004\b\u000f\u0010\u0010J\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\t\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006HÖ\u0003R\u0017\u0010\u000e\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\u000b\u0010\r¨\u0006\u0011"}, d2 = {"Lcom/heytap/sports/transfer/a$b;", "Lcom/heytap/sports/transfer/a;", "", "toString", "", "hashCode", "", "other", "", "equals", "", "a", UserInfo.SEX_FEMALE, "()F", "progress", "<init>", "(F)V", "sport_impl_release"}, k = 1, mv = {1, 8, 0})
    public static final /* data */ class Progress extends a {
        public static final int $stable = 0;

        /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
        public final float progress;

        public Progress(float f) {
            super(null);
            this.progress = f;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final float getProgress() {
            return this.progress;
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Progress) && Float.compare(this.progress, ((Progress) other).progress) == 0;
        }

        public int hashCode() {
            return Float.hashCode(this.progress);
        }

        @NotNull
        public String toString() {
            return "Progress(progress=" + this.progress + ")";
        }
    }

    /* JADX INFO: renamed from: com.heytap.sports.transfer.a$c, reason: from toString */
    @StabilityInferred(parameters = 0)
    @Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B1\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\n\u0012\u0010\b\u0002\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000f\u0012\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\t\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006HÖ\u0003R\u0019\u0010\u000e\u001a\u0004\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\u000b\u0010\rR\u001f\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000f8\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u0019\u0010\u0019\u001a\u0004\u0018\u00010\u00168\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0017\u001a\u0004\b\u0011\u0010\u0018¨\u0006\u001c"}, d2 = {"Lcom/heytap/sports/transfer/a$c;", "Lcom/heytap/sports/transfer/a;", "", "toString", "", "hashCode", "", "other", "", "equals", "Ljava/io/File;", "a", "Ljava/io/File;", "()Ljava/io/File;", Const.Scheme.SCHEME_FILE, "", "Lcom/heytap/databaseengine/model/OneTimeSport;", "b", "Ljava/util/List;", "c", "()Ljava/util/List;", "records", "Lcom/oplus/aiunit/vision/u5a;", "Lcom/oplus/aiunit/vision/u5a;", "()Lcom/oplus/aiunit/vision/u5a;", "importDetail", "<init>", "(Ljava/io/File;Ljava/util/List;Lcom/oplus/aiunit/vision/u5a;)V", "sport_impl_release"}, k = 1, mv = {1, 8, 0})
    public static final /* data */ class Success extends a {
        public static final int $stable = 8;

        /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
        @Nullable
        public final File file;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
        @Nullable
        public final List<OneTimeSport> records;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        @Nullable
        public final ImportResultDetail importDetail;

        public Success() {
            this(null, null, null, 7, null);
        }

        @Nullable
        /* JADX INFO: renamed from: a, reason: from getter */
        public final File getFile() {
            return this.file;
        }

        @Nullable
        /* JADX INFO: renamed from: b, reason: from getter */
        public final ImportResultDetail getImportDetail() {
            return this.importDetail;
        }

        @Nullable
        public final List<OneTimeSport> c() {
            return this.records;
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Success)) {
                return false;
            }
            Success success = (Success) other;
            return Intrinsics.areEqual(this.file, success.file) && Intrinsics.areEqual(this.records, success.records) && Intrinsics.areEqual(this.importDetail, success.importDetail);
        }

        public int hashCode() {
            File file = this.file;
            int iHashCode = (file == null ? 0 : file.hashCode()) * 31;
            List<OneTimeSport> list = this.records;
            int iHashCode2 = (iHashCode + (list == null ? 0 : list.hashCode())) * 31;
            ImportResultDetail importResultDetail = this.importDetail;
            return iHashCode2 + (importResultDetail != null ? importResultDetail.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            return "Success(file=" + this.file + ", records=" + this.records + ", importDetail=" + this.importDetail + ")";
        }

        public /* synthetic */ Success(File file, List list, ImportResultDetail importResultDetail, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : file, (i & 2) != 0 ? null : list, (i & 4) != 0 ? null : importResultDetail);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public Success(@Nullable File file, @Nullable List<? extends OneTimeSport> list, @Nullable ImportResultDetail importResultDetail) {
            super(null);
            this.file = file;
            this.records = list;
            this.importDetail = importResultDetail;
        }
    }

    public a() {
    }

    public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }
}
