package com.heytap.health.backup;

import androidx.annotation.Keep;
import com.heytap.voiceassistant.sdk.tts.constant.SpeechConstant;
import java.util.List;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;

/* JADX INFO: loaded from: classes15.dex */
@Keep
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\"\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Lcom/heytap/health/backup/SPData;", "", "()V", SpeechConstant.KEY_APP_VERSION, "", "getAppVersion", "()Ljava/lang/String;", "setAppVersion", "(Ljava/lang/String;)V", "spDataList", "", "Lcom/heytap/health/backup/SPDataItem;", "getSpDataList", "()Ljava/util/List;", "setSpDataList", "(Ljava/util/List;)V", "Health-6.4.4_03460bd_260624_OPlusRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class SPData {

    @Nullable
    private String appVersion;

    @Nullable
    private List<SPDataItem> spDataList;

    @Nullable
    public final String getAppVersion() {
        return this.appVersion;
    }

    @Nullable
    public final List<SPDataItem> getSpDataList() {
        return this.spDataList;
    }

    public final void setAppVersion(@Nullable String str) {
        this.appVersion = str;
    }

    public final void setSpDataList(@Nullable List<SPDataItem> list) {
        this.spDataList = list;
    }
}
