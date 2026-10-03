package com.oplus.aiunit.vision;

import com.heytap.databaseengine.model.healtharchive.ArchivePageData;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.DefaultConstructorMarker;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes16.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, d2 = {"Lcom/oplus/aiunit/vision/c0l;", "", "<init>", "()V", "a", "b", "Lcom/oplus/aiunit/vision/c0l$a;", "Lcom/oplus/aiunit/vision/c0l$b;", "health_archives_release"}, k = 1, mv = {1, 8, 0})
public abstract class c0l {

    /* JADX INFO: renamed from: com.oplus.aiunit.vision.c0l$a, reason: from toString */
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u000e\u001a\u00020\n¢\u0006\u0004\b\u000f\u0010\u0010J\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\t\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006HÖ\u0003R\u0017\u0010\u000e\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\u000b\u0010\r¨\u0006\u0011"}, d2 = {"Lcom/oplus/aiunit/vision/c0l$a;", "Lcom/oplus/aiunit/vision/c0l;", "", "toString", "", "hashCode", "", "other", "", "equals", "Lcom/heytap/databaseengine/model/healtharchive/ArchivePageData;", "a", "Lcom/heytap/databaseengine/model/healtharchive/ArchivePageData;", "()Lcom/heytap/databaseengine/model/healtharchive/ArchivePageData;", "pageData", "<init>", "(Lcom/heytap/databaseengine/model/healtharchive/ArchivePageData;)V", "health_archives_release"}, k = 1, mv = {1, 8, 0})
    public static final /* data */ class TableView extends c0l {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
        @NotNull
        public final ArchivePageData pageData;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public TableView(@NotNull ArchivePageData pageData) {
            super(null);
            Intrinsics.checkNotNullParameter(pageData, "pageData");
            this.pageData = pageData;
        }

        @NotNull
        /* JADX INFO: renamed from: a, reason: from getter */
        public final ArchivePageData getPageData() {
            return this.pageData;
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof TableView) && Intrinsics.areEqual(this.pageData, ((TableView) other).pageData);
        }

        public int hashCode() {
            return this.pageData.hashCode();
        }

        @NotNull
        public String toString() {
            return "TableView(pageData=" + this.pageData + ")";
        }
    }

    /* JADX INFO: renamed from: com.oplus.aiunit.vision.c0l$b, reason: from toString */
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u000e\u001a\u00020\n¢\u0006\u0004\b\u000f\u0010\u0010J\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\t\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006HÖ\u0003R\u0017\u0010\u000e\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\u000b\u0010\r¨\u0006\u0011"}, d2 = {"Lcom/oplus/aiunit/vision/c0l$b;", "Lcom/oplus/aiunit/vision/c0l;", "", "toString", "", "hashCode", "", "other", "", "equals", "Lcom/heytap/databaseengine/model/healtharchive/ArchivePageData;", "a", "Lcom/heytap/databaseengine/model/healtharchive/ArchivePageData;", "()Lcom/heytap/databaseengine/model/healtharchive/ArchivePageData;", "pageData", "<init>", "(Lcom/heytap/databaseengine/model/healtharchive/ArchivePageData;)V", "health_archives_release"}, k = 1, mv = {1, 8, 0})
    public static final /* data */ class TextView extends c0l {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
        @NotNull
        public final ArchivePageData pageData;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public TextView(@NotNull ArchivePageData pageData) {
            super(null);
            Intrinsics.checkNotNullParameter(pageData, "pageData");
            this.pageData = pageData;
        }

        @NotNull
        /* JADX INFO: renamed from: a, reason: from getter */
        public final ArchivePageData getPageData() {
            return this.pageData;
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof TextView) && Intrinsics.areEqual(this.pageData, ((TextView) other).pageData);
        }

        public int hashCode() {
            return this.pageData.hashCode();
        }

        @NotNull
        public String toString() {
            return "TextView(pageData=" + this.pageData + ")";
        }
    }

    public c0l() {
    }

    public /* synthetic */ c0l(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }
}
