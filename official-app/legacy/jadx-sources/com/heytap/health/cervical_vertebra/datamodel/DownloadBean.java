package com.heytap.health.cervical_vertebra.datamodel;

import androidx.annotation.Keep;
import com.heytap.health.cervical_vertebra.viewmodel.MobilityIntroViewModel;
import com.heytap.log.consts.LogSenderConst;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;
import p010kotlin.text.StringsKt__StringsKt;

/* JADX INFO: loaded from: classes15.dex */
@Keep
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0005HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0003HÖ\u0001R$\u0010\b\u001a\u0004\u0018\u00010\u00032\b\u0010\u0007\u001a\u0004\u0018\u00010\u00038F@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR$\u0010\u000b\u001a\u0004\u0018\u00010\u00032\b\u0010\u0007\u001a\u0004\u0018\u00010\u00038F@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\n¨\u0006\u0018"}, d2 = {"Lcom/heytap/health/cervical_vertebra/datamodel/DownloadBean;", "", "url", "", "size", "", "(Ljava/lang/String;I)V", "<set-?>", LogSenderConst.FILENAME, "getFileName", "()Ljava/lang/String;", "filePath", "getFilePath", "getSize", "()I", "getUrl", "component1", "component2", "copy", "equals", "", "other", "hashCode", "toString", "cervical_vertebra_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final /* data */ class DownloadBean {

    @Nullable
    private String fileName;

    @Nullable
    private String filePath;
    private final int size;

    @NotNull
    private final String url;

    public DownloadBean(@NotNull String url, int i) {
        Intrinsics.checkNotNullParameter(url, "url");
        this.url = url;
        this.size = i;
    }

    public static /* synthetic */ DownloadBean copy$default(DownloadBean downloadBean, String str, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = downloadBean.url;
        }
        if ((i2 & 2) != 0) {
            i = downloadBean.size;
        }
        return downloadBean.copy(str, i);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getUrl() {
        return this.url;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getSize() {
        return this.size;
    }

    @NotNull
    public final DownloadBean copy(@NotNull String url, int size) {
        Intrinsics.checkNotNullParameter(url, "url");
        return new DownloadBean(url, size);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DownloadBean)) {
            return false;
        }
        DownloadBean downloadBean = (DownloadBean) other;
        return Intrinsics.areEqual(this.url, downloadBean.url) && this.size == downloadBean.size;
    }

    @Nullable
    public final String getFileName() {
        if (this.fileName == null) {
            String strSubstring = this.url.substring(StringsKt__StringsKt.lastIndexOf$default((CharSequence) this.url, "/", 0, false, 6, (Object) null) + 1);
            Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
            this.fileName = strSubstring;
        }
        return this.fileName;
    }

    @Nullable
    public final String getFilePath() {
        if (this.filePath == null) {
            this.filePath = MobilityIntroViewModel.INSTANCE.a() + getFileName();
        }
        return this.filePath;
    }

    public final int getSize() {
        return this.size;
    }

    @NotNull
    public final String getUrl() {
        return this.url;
    }

    public int hashCode() {
        return (this.url.hashCode() * 31) + Integer.hashCode(this.size);
    }

    @NotNull
    public String toString() {
        return "DownloadBean(url=" + this.url + ", size=" + this.size + ")";
    }
}
