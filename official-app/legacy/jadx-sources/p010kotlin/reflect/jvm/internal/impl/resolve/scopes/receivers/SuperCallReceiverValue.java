package p010kotlin.reflect.jvm.internal.impl.resolve.scopes.receivers;

import org.jetbrains.annotations.NotNull;
import p010kotlin.reflect.jvm.internal.impl.types.KotlinType;

/* JADX INFO: loaded from: classes11.dex */
public interface SuperCallReceiverValue extends ReceiverValue {
    @NotNull
    KotlinType getThisType();
}
