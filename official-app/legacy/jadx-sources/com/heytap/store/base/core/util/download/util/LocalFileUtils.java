package com.heytap.store.base.core.util.download.util;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.DefaultConstructorMarker;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u0018\u0000 \u00032\u00020\u0001:\u0001\u0003B\u0005¢\u0006\u0002\u0010\u0002¨\u0006\u0004"}, d2 = {"Lcom/heytap/store/base/core/util/download/util/LocalFileUtils;", "", "()V", "Companion", "download_release"}, k = 1, mv = {1, 4, 2})
public final class LocalFileUtils {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0012\u0010\u0003\u001a\u0004\u0018\u00010\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004J\u0018\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¨\u0006\t"}, d2 = {"Lcom/heytap/store/base/core/util/download/util/LocalFileUtils$Companion;", "", "()V", "readJson", "", "path", "writeToJsonFile", "", "json", "download_release"}, k = 1, mv = {1, 4, 2})
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @Nullable
        public final String readJson(@Nullable String path) throws Throwable {
            File file = new File(path);
            if (!file.exists() || !file.isFile()) {
                return "";
            }
            StringBuffer stringBuffer = new StringBuffer();
            BufferedReader bufferedReader = null;
            try {
                try {
                    try {
                        BufferedReader bufferedReader2 = new BufferedReader(new FileReader(file));
                        while (true) {
                            try {
                                String line = bufferedReader2.readLine();
                                if (line == null) {
                                    break;
                                }
                                stringBuffer.append(line);
                            } catch (FileNotFoundException e2) {
                                e = e2;
                                bufferedReader = bufferedReader2;
                                e.printStackTrace();
                                if (bufferedReader != null) {
                                    bufferedReader.close();
                                }
                                return stringBuffer.toString();
                            } catch (IOException e3) {
                                e = e3;
                                bufferedReader = bufferedReader2;
                                e.printStackTrace();
                                if (bufferedReader != null) {
                                    bufferedReader.close();
                                }
                                return stringBuffer.toString();
                            } catch (Throwable th) {
                                th = th;
                                bufferedReader = bufferedReader2;
                                if (bufferedReader != null) {
                                    try {
                                        bufferedReader.close();
                                    } catch (IOException e4) {
                                        e4.printStackTrace();
                                    }
                                }
                                throw th;
                            }
                        }
                        bufferedReader2.close();
                    } catch (IOException e5) {
                        e5.printStackTrace();
                    }
                } catch (FileNotFoundException e6) {
                    e = e6;
                } catch (IOException e7) {
                    e = e7;
                }
                return stringBuffer.toString();
            } catch (Throwable th2) {
                th = th2;
            }
        }

        public final boolean writeToJsonFile(@NotNull String json, @Nullable String path) throws Throwable {
            Intrinsics.checkNotNullParameter(json, "json");
            File file = new File(path);
            File parentFile = file.getParentFile();
            if (!parentFile.exists()) {
                try {
                    parentFile.mkdirs();
                    file.createNewFile();
                } catch (IOException e2) {
                    e2.printStackTrace();
                }
            }
            BufferedWriter bufferedWriter = null;
            try {
                try {
                    BufferedWriter bufferedWriter2 = new BufferedWriter(new FileWriter(file));
                    try {
                        bufferedWriter2.write(json);
                        try {
                            bufferedWriter2.close();
                        } catch (IOException e3) {
                            e3.printStackTrace();
                        }
                        return true;
                    } catch (IOException e4) {
                        e = e4;
                        bufferedWriter = bufferedWriter2;
                        e.printStackTrace();
                        if (bufferedWriter != null) {
                            try {
                                bufferedWriter.close();
                            } catch (IOException e5) {
                                e5.printStackTrace();
                            }
                        }
                        return false;
                    } catch (Throwable th) {
                        th = th;
                        bufferedWriter = bufferedWriter2;
                        if (bufferedWriter != null) {
                            try {
                                bufferedWriter.close();
                            } catch (IOException e6) {
                                e6.printStackTrace();
                            }
                        }
                        throw th;
                    }
                } catch (IOException e7) {
                    e = e7;
                }
            } catch (Throwable th2) {
                th = th2;
            }
        }
    }
}
