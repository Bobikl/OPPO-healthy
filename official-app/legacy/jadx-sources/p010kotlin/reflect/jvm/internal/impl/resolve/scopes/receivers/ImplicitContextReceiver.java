package p010kotlin.reflect.jvm.internal.impl.resolve.scopes.receivers;

import org.jetbrains.annotations.Nullable;
import p010kotlin.reflect.jvm.internal.impl.name.Name;

/* JADX INFO: loaded from: classes11.dex */
public interface ImplicitContextReceiver extends ImplicitReceiver {
    @Nullable
    Name getCustomLabelName();
}
