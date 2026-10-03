package androidx.datastore.preferences.protobuf;

/* JADX INFO: loaded from: classes12.dex */
@CheckReturnValue
interface MessageInfo {
    MessageLite getDefaultInstance();

    ProtoSyntax getSyntax();

    boolean isMessageSetWireFormat();
}
