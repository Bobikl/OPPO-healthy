package com.heytap.store.platform.htrouter.facade.service;

import androidx.exifinterface.media.ExifInterface;
import com.heytap.store.platform.htrouter.facade.template.IProvider;
import java.lang.reflect.Type;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H&J#\u0010\u0006\u001a\u0002H\u0007\"\u0004\b\u0000\u0010\u00072\u0006\u0010\b\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\nH&¢\u0006\u0002\u0010\u000b¨\u0006\f"}, d2 = {"Lcom/heytap/store/platform/htrouter/facade/service/SerializationService;", "Lcom/heytap/store/platform/htrouter/facade/template/IProvider;", "object2Json", "", "instance", "", "parseObject", ExifInterface.GPS_DIRECTION_TRUE, "input", "clazz", "Ljava/lang/reflect/Type;", "(Ljava/lang/String;Ljava/lang/reflect/Type;)Ljava/lang/Object;", "htrouter-api_release"}, k = 1, mv = {1, 4, 0})
public interface SerializationService extends IProvider {
    @NotNull
    String object2Json(@Nullable Object instance);

    <T> T parseObject(@NotNull String input, @NotNull Type clazz);
}
