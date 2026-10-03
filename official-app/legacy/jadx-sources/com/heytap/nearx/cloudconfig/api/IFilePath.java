package com.heytap.nearx.cloudconfig.api;

import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;

/* JADX INFO: loaded from: classes17.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J,\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u0003H&¨\u0006\t"}, d2 = {"Lcom/heytap/nearx/cloudconfig/api/IFilePath;", "", "filePath", "", "configId", "configVersion", "", "configType", "endfix", "com.heytap.nearx.cloudconfig"}, k = 1, mv = {1, 1, 16})
public interface IFilePath {

    @Metadata(bv = {1, 0, 3}, k = 3, mv = {1, 1, 16})
    public static final class DefaultImpls {
        public static /* synthetic */ String filePath$default(IFilePath iFilePath, String str, int i, int i2, String str2, int i3, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: filePath");
            }
            if ((i3 & 4) != 0) {
                i2 = 0;
            }
            if ((i3 & 8) != 0) {
                str2 = "";
            }
            return iFilePath.filePath(str, i, i2, str2);
        }
    }

    @NotNull
    String filePath(@NotNull String configId, int configVersion, int configType, @NotNull String endfix);
}
