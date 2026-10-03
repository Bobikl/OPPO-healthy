package com.google.protobuf;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes14.dex */
@CheckReturnValue
final class ExtensionSchemas {
    private static final ExtensionSchema<?> LITE_SCHEMA = new ExtensionSchemaLite();
    private static final ExtensionSchema<?> FULL_SCHEMA = loadSchemaForFullRuntime();

    public static ExtensionSchema<?> full() {
        ExtensionSchema<?> extensionSchema = FULL_SCHEMA;
        if (extensionSchema != null) {
            return extensionSchema;
        }
        throw new IllegalStateException("Protobuf runtime is not correctly loaded.");
    }

    public static ExtensionSchema<?> lite() {
        return LITE_SCHEMA;
    }

    private static ExtensionSchema<?> loadSchemaForFullRuntime() {
        try {
            int i = ExtensionSchemaFull.a;
            return (ExtensionSchema) ExtensionSchemaFull.class.getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception unused) {
            return null;
        }
    }
}
