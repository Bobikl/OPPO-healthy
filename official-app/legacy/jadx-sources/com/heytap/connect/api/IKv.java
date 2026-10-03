package com.heytap.connect.api;

import androidx.exifinterface.media.ExifInterface;
import com.oplus.smartenginehelper.ParserTag;
import java.util.concurrent.ConcurrentHashMap;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\bf\u0018\u0000 \u000e2\u00020\u0001:\u0001\u000eJ/\u0010\t\u001a\u00020\b\"\u0004\b\u0000\u0010\u00022\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00028\u00002\b\b\u0002\u0010\u0007\u001a\u00020\u0006H&¢\u0006\u0004\b\t\u0010\nJ/\u0010\f\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00022\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00028\u00002\b\b\u0002\u0010\u0007\u001a\u00020\u0006H&¢\u0006\u0004\b\f\u0010\r¨\u0006\u000f"}, d2 = {"Lcom/heytap/connect/api/IKv;", "", ExifInterface.GPS_DIRECTION_TRUE, "", "key", "value", "", "isSign", "", "put", "(Ljava/lang/String;Ljava/lang/Object;Z)V", "default", ParserTag.TAG_GET, "(Ljava/lang/String;Ljava/lang/Object;Z)Ljava/lang/Object;", "Companion", "connect_release"}, k = 1, mv = {1, 5, 1})
public interface IKv {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = Companion.$$INSTANCE;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0007\u0010\bR\u0019\u0010\u0003\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006¨\u0006\t"}, d2 = {"Lcom/heytap/connect/api/IKv$Companion;", "", "Lcom/heytap/connect/api/IKv;", "DEFAULT", "Lcom/heytap/connect/api/IKv;", "getDEFAULT", "()Lcom/heytap/connect/api/IKv;", "<init>", "()V", "connect_release"}, k = 1, mv = {1, 5, 1})
    public static final class Companion {
        public static final /* synthetic */ Companion $$INSTANCE = new Companion();

        @NotNull
        private static final IKv DEFAULT = new IKv() { // from class: com.heytap.connect.api.IKv$Companion$DEFAULT$1

            @NotNull
            private final ConcurrentHashMap<String, String> kvMap = new ConcurrentHashMap<>();

            @Override // com.heytap.connect.api.IKv
            public <T> T get(@NotNull String key, T t, boolean isSign) {
                Intrinsics.checkNotNullParameter(key, "key");
                if (this.kvMap.containsKey(key)) {
                    try {
                        if (t instanceof String) {
                            String str = this.kvMap.get(key);
                            Intrinsics.checkNotNull(str);
                            t = (T) str.toString();
                        } else if (t instanceof Integer) {
                            String str2 = this.kvMap.get(key);
                            Intrinsics.checkNotNull(str2);
                            t = (T) Integer.valueOf(Integer.parseInt(str2));
                        } else if (t instanceof Boolean) {
                            String str3 = this.kvMap.get(key);
                            Intrinsics.checkNotNull(str3);
                            t = (T) Boolean.valueOf(Boolean.parseBoolean(str3));
                        } else if (t instanceof Float) {
                            String str4 = this.kvMap.get(key);
                            Intrinsics.checkNotNull(str4);
                            t = (T) Float.valueOf(Float.parseFloat(str4));
                        } else if (t instanceof Double) {
                            String str5 = this.kvMap.get(key);
                            Intrinsics.checkNotNull(str5);
                            t = (T) Double.valueOf(Double.parseDouble(str5));
                        } else if (t instanceof Long) {
                            String str6 = this.kvMap.get(key);
                            Intrinsics.checkNotNull(str6);
                            t = (T) Long.valueOf(Long.parseLong(str6));
                        } else if (t instanceof Short) {
                            String str7 = this.kvMap.get(key);
                            Intrinsics.checkNotNull(str7);
                            t = (T) Short.valueOf(Short.parseShort(str7));
                        }
                    } catch (Exception unused) {
                    }
                }
                return t;
            }

            @NotNull
            public final ConcurrentHashMap<String, String> getKvMap() {
                return this.kvMap;
            }

            @Override // com.heytap.connect.api.IKv
            public <T> void put(@NotNull String key, T value, boolean isSign) {
                Intrinsics.checkNotNullParameter(key, "key");
                this.kvMap.put(key, String.valueOf(value));
            }
        };

        private Companion() {
        }

        @NotNull
        public final IKv getDEFAULT() {
            return DEFAULT;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    public static final class DefaultImpls {
        public static /* synthetic */ Object get$default(IKv iKv, String str, Object obj, boolean z, int i, Object obj2) {
            if (obj2 != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: get");
            }
            if ((i & 4) != 0) {
                z = false;
            }
            return iKv.get(str, obj, z);
        }

        public static /* synthetic */ void put$default(IKv iKv, String str, Object obj, boolean z, int i, Object obj2) {
            if (obj2 != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: put");
            }
            if ((i & 4) != 0) {
                z = false;
            }
            iKv.put(str, obj, z);
        }
    }

    <T> T get(@NotNull String key, T t, boolean isSign);

    <T> void put(@NotNull String key, T value, boolean isSign);
}
