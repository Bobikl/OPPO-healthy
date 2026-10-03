package androidx.datastore.preferences.protobuf;

/* JADX INFO: loaded from: classes12.dex */
@CheckReturnValue
interface SchemaFactory {
    <T> Schema<T> createSchema(Class<T> cls);
}
