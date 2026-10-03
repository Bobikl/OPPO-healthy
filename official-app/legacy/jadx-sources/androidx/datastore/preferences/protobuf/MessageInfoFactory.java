package androidx.datastore.preferences.protobuf;

/* JADX INFO: loaded from: classes12.dex */
@CheckReturnValue
interface MessageInfoFactory {
    boolean isSupported(Class<?> cls);

    MessageInfo messageInfoFor(Class<?> cls);
}
