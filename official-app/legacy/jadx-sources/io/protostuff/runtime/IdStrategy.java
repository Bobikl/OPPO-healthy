package io.protostuff.runtime;

import io.protostuff.CollectionSchema;
import io.protostuff.GraphInput;
import io.protostuff.Input;
import io.protostuff.MapSchema;
import io.protostuff.Message;
import io.protostuff.Output;
import io.protostuff.Pipe;
import io.protostuff.ProtostuffException;
import io.protostuff.Schema;
import java.io.IOException;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes10.dex */
public abstract class IdStrategy {
    public static final int ALLOW_NULL_ARRAY_ELEMENT = 4;
    public static final int AUTO_LOAD_POLYMORPHIC_CLASSES = 2;
    public static final int COLLECTION_SCHEMA_ON_REPEATED_FIELDS = 64;
    public static final int DEFAULT_FLAGS;
    public static final int ENUMS_BY_NAME = 1;
    public static final int MORPH_COLLECTION_INTERFACES = 16;
    public static final int MORPH_MAP_INTERFACES = 32;
    public static final int MORPH_NON_FINAL_POJOS = 8;
    public static final int POJO_SCHEMA_ON_COLLECTION_FIELDS = 128;
    public static final int POJO_SCHEMA_ON_MAP_FIELDS = 256;
    final ArraySchemas.BigDecimalArray ARRAY_BIGDECIMAL_SCHEMA;
    final ArraySchemas.BigIntegerArray ARRAY_BIGINTEGER_SCHEMA;
    final ArraySchemas.BoolArray ARRAY_BOOL_BOXED_SCHEMA;
    final ArraySchemas.BoolArray ARRAY_BOOL_DERIVED_SCHEMA;
    final ArraySchemas.BoolArray ARRAY_BOOL_PRIMITIVE_SCHEMA;
    final ArraySchemas.ByteArrayArray ARRAY_BYTEARRAY_SCHEMA;
    final ArraySchemas.ByteStringArray ARRAY_BYTESTRING_SCHEMA;
    final ArraySchemas.CharArray ARRAY_CHAR_BOXED_SCHEMA;
    final ArraySchemas.CharArray ARRAY_CHAR_DERIVED_SCHEMA;
    final ArraySchemas.CharArray ARRAY_CHAR_PRIMITIVE_SCHEMA;
    final ArraySchemas.DateArray ARRAY_DATE_SCHEMA;
    final ArraySchemas.DoubleArray ARRAY_DOUBLE_BOXED_SCHEMA;
    final ArraySchemas.DoubleArray ARRAY_DOUBLE_DERIVED_SCHEMA;
    final ArraySchemas.DoubleArray ARRAY_DOUBLE_PRIMITIVE_SCHEMA;
    final ArraySchema ARRAY_ELEMENT_SCHEMA;
    final ArraySchemas.FloatArray ARRAY_FLOAT_BOXED_SCHEMA;
    final ArraySchemas.FloatArray ARRAY_FLOAT_DERIVED_SCHEMA;
    final ArraySchemas.FloatArray ARRAY_FLOAT_PRIMITIVE_SCHEMA;
    final ArraySchemas.Int32Array ARRAY_INT32_BOXED_SCHEMA;
    final ArraySchemas.Int32Array ARRAY_INT32_DERIVED_SCHEMA;
    final ArraySchemas.Int32Array ARRAY_INT32_PRIMITIVE_SCHEMA;
    final ArraySchemas.Int64Array ARRAY_INT64_BOXED_SCHEMA;
    final ArraySchemas.Int64Array ARRAY_INT64_DERIVED_SCHEMA;
    final ArraySchemas.Int64Array ARRAY_INT64_PRIMITIVE_SCHEMA;
    final Pipe.Schema<Object> ARRAY_PIPE_SCHEMA;
    final Schema<Object> ARRAY_SCHEMA;
    final ArraySchemas.ShortArray ARRAY_SHORT_BOXED_SCHEMA;
    final ArraySchemas.ShortArray ARRAY_SHORT_DERIVED_SCHEMA;
    final ArraySchemas.ShortArray ARRAY_SHORT_PRIMITIVE_SCHEMA;
    final ArraySchemas.StringArray ARRAY_STRING_SCHEMA;
    final ClassSchema CLASS_ELEMENT_SCHEMA;
    final Pipe.Schema<Object> CLASS_PIPE_SCHEMA;
    final Schema<Object> CLASS_SCHEMA;
    final Pipe.Schema<Collection<Object>> COLLECTION_PIPE_SCHEMA;
    final Schema<Collection<Object>> COLLECTION_SCHEMA;
    final Pipe.Schema<Object> DYNAMIC_VALUE_PIPE_SCHEMA;
    final Schema<Object> DYNAMIC_VALUE_SCHEMA;
    final Pipe.Schema<Map.Entry<Object, Object>> ENTRY_PIPE_SCHEMA;
    final Schema<Map.Entry<Object, Object>> ENTRY_SCHEMA;
    final Pipe.Schema<Map<Object, Object>> MAP_PIPE_SCHEMA;
    final Schema<Map<Object, Object>> MAP_SCHEMA;
    final NumberSchema NUMBER_ELEMENT_SCHEMA;
    final ObjectSchema OBJECT_ELEMENT_SCHEMA;
    final Pipe.Schema<Object> OBJECT_PIPE_SCHEMA;
    final Schema<Object> OBJECT_SCHEMA;
    final Pipe.Schema<Object> POLYMORPHIC_COLLECTION_PIPE_SCHEMA;
    final Schema<Object> POLYMORPHIC_COLLECTION_SCHEMA;
    final PolymorphicEnumSchema POLYMORPHIC_ENUM_ELEMENT_SCHEMA;
    final Pipe.Schema<Object> POLYMORPHIC_MAP_PIPE_SCHEMA;
    final Schema<Object> POLYMORPHIC_MAP_SCHEMA;
    final DerivativeSchema POLYMORPHIC_POJO_ELEMENT_SCHEMA;
    final PolymorphicThrowableSchema POLYMORPHIC_THROWABLE_ELEMENT_SCHEMA;
    public final int flags;
    public final int groupId;
    public final IdStrategy primaryGroup;

    public interface Factory {
        IdStrategy create();

        void postCreate();
    }

    public static final class PMapWrapper implements Map.Entry<Object, Object> {
        final Map<Object, Object> map;
        private Object value;

        public PMapWrapper(Map<Object, Object> map) {
            this.map = map;
        }

        @Override // java.util.Map.Entry
        public Object getKey() {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Map.Entry
        public Object getValue() {
            return this.value;
        }

        @Override // java.util.Map.Entry
        public Object setValue(Object obj) {
            Object obj2 = this.value;
            this.value = obj;
            return obj2;
        }
    }

    public static class UnknownTypeException extends RuntimeException {
        private static final long serialVersionUID = 1;

        public UnknownTypeException(String str) {
            super(str);
        }
    }

    public static final class Wrapper {
        Object value;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1 */
    /* JADX WARN: Type inference failed for: r0v2 */
    /* JADX WARN: Type inference failed for: r0v25 */
    /* JADX WARN: Type inference failed for: r0v26 */
    /* JADX WARN: Type inference failed for: r0v27 */
    /* JADX WARN: Type inference failed for: r0v28 */
    /* JADX WARN: Type inference failed for: r0v29 */
    /* JADX WARN: Type inference failed for: r0v3 */
    /* JADX WARN: Type inference failed for: r0v30 */
    /* JADX WARN: Type inference failed for: r0v31 */
    /* JADX WARN: Type inference failed for: r0v32 */
    /* JADX WARN: Type inference failed for: r0v33 */
    /* JADX WARN: Type inference failed for: r0v34 */
    /* JADX WARN: Type inference failed for: r0v35 */
    /* JADX WARN: Type inference failed for: r0v36 */
    /* JADX WARN: Type inference failed for: r0v37 */
    /* JADX WARN: Type inference failed for: r0v38 */
    /* JADX WARN: Type inference failed for: r0v4 */
    /* JADX WARN: Type inference failed for: r0v5 */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* JADX WARN: Type inference failed for: r0v7 */
    static {
        boolean z = RuntimeEnv.ENUMS_BY_NAME;
        ?? r0 = z;
        if (RuntimeEnv.AUTO_LOAD_POLYMORPHIC_CLASSES) {
            r0 = (z ? 1 : 0) | 2;
        }
        ?? r1 = r0;
        if (RuntimeEnv.ALLOW_NULL_ARRAY_ELEMENT) {
            r1 = (r0 == true ? 1 : 0) | 4;
        }
        ?? r2 = r1;
        if (RuntimeEnv.MORPH_NON_FINAL_POJOS) {
            r2 = (r1 == true ? 1 : 0) | 8;
        }
        ?? r3 = r2;
        if (RuntimeEnv.MORPH_COLLECTION_INTERFACES) {
            r3 = (r2 == true ? 1 : 0) | 16;
        }
        ?? r4 = r3;
        if (RuntimeEnv.MORPH_MAP_INTERFACES) {
            r4 = (r3 == true ? 1 : 0) | 32;
        }
        ?? r5 = r4;
        if (RuntimeEnv.COLLECTION_SCHEMA_ON_REPEATED_FIELDS) {
            r5 = (r4 == true ? 1 : 0) | 64;
        }
        ?? r6 = r5;
        if (RuntimeEnv.POJO_SCHEMA_ON_COLLECTION_FIELDS) {
            r6 = (r5 == true ? 1 : 0) | 128;
        }
        int i = r6;
        if (RuntimeEnv.POJO_SCHEMA_ON_MAP_FIELDS) {
            i = (r6 == true ? 1 : 0) | 256;
        }
        DEFAULT_FLAGS = i;
    }

    public IdStrategy(int i, IdStrategy idStrategy, int i2) {
        if (idStrategy != null) {
            if (i2 <= 0 || ((i2 - 1) & i2) != 0) {
                throw new RuntimeException("The groupId must be a power of two (1,2,4,8,etc).");
            }
        } else if (i2 != 0) {
            throw new RuntimeException("An IdStrategy without a primaryGroup (standalone) must have a groupId of zero.");
        }
        this.flags = i;
        this.primaryGroup = idStrategy;
        this.groupId = i2;
        this.POLYMORPHIC_POJO_ELEMENT_SCHEMA = new DerivativeSchema(this) { // from class: io.protostuff.runtime.IdStrategy.1
            @Override // io.protostuff.runtime.DerivativeSchema
            public void doMergeFrom(Input input, Schema<Object> schema, Object obj) throws IOException {
                Object objNewMessage = schema.newMessage();
                if (input instanceof GraphInput) {
                    ((GraphInput) input).updateLast(objNewMessage, obj);
                }
                schema.mergeFrom(input, objNewMessage);
                if (MapSchema.MapWrapper.class == obj.getClass()) {
                    ((MapSchema.MapWrapper) obj).setValue(objNewMessage);
                } else {
                    ((Collection) obj).add(objNewMessage);
                }
            }
        };
        this.ARRAY_ELEMENT_SCHEMA = new ArraySchema(this) { // from class: io.protostuff.runtime.IdStrategy.2
            @Override // io.protostuff.runtime.PolymorphicSchema
            public void setValue(Object obj, Object obj2) {
                if (MapSchema.MapWrapper.class == obj2.getClass()) {
                    ((MapSchema.MapWrapper) obj2).setValue(obj);
                } else {
                    ((Collection) obj2).add(obj);
                }
            }
        };
        this.NUMBER_ELEMENT_SCHEMA = new NumberSchema(this) { // from class: io.protostuff.runtime.IdStrategy.3
            @Override // io.protostuff.runtime.PolymorphicSchema
            public void setValue(Object obj, Object obj2) {
                if (MapSchema.MapWrapper.class == obj2.getClass()) {
                    ((MapSchema.MapWrapper) obj2).setValue(obj);
                } else {
                    ((Collection) obj2).add(obj);
                }
            }
        };
        this.CLASS_ELEMENT_SCHEMA = new ClassSchema(this) { // from class: io.protostuff.runtime.IdStrategy.4
            @Override // io.protostuff.runtime.PolymorphicSchema
            public void setValue(Object obj, Object obj2) {
                if (MapSchema.MapWrapper.class == obj2.getClass()) {
                    ((MapSchema.MapWrapper) obj2).setValue(obj);
                } else {
                    ((Collection) obj2).add(obj);
                }
            }
        };
        this.POLYMORPHIC_ENUM_ELEMENT_SCHEMA = new PolymorphicEnumSchema(this) { // from class: io.protostuff.runtime.IdStrategy.5
            @Override // io.protostuff.runtime.PolymorphicSchema
            public void setValue(Object obj, Object obj2) {
                if (MapSchema.MapWrapper.class == obj2.getClass()) {
                    ((MapSchema.MapWrapper) obj2).setValue(obj);
                } else {
                    ((Collection) obj2).add(obj);
                }
            }
        };
        this.POLYMORPHIC_THROWABLE_ELEMENT_SCHEMA = new PolymorphicThrowableSchema(this) { // from class: io.protostuff.runtime.IdStrategy.6
            @Override // io.protostuff.runtime.PolymorphicSchema
            public void setValue(Object obj, Object obj2) {
                if (MapSchema.MapWrapper.class == obj2.getClass()) {
                    ((MapSchema.MapWrapper) obj2).setValue(obj);
                } else {
                    ((Collection) obj2).add(obj);
                }
            }
        };
        this.OBJECT_ELEMENT_SCHEMA = new ObjectSchema(this) { // from class: io.protostuff.runtime.IdStrategy.7
            @Override // io.protostuff.runtime.PolymorphicSchema
            public void setValue(Object obj, Object obj2) {
                if (MapSchema.MapWrapper.class == obj2.getClass()) {
                    ((MapSchema.MapWrapper) obj2).setValue(obj);
                } else {
                    ((Collection) obj2).add(obj);
                }
            }
        };
        Schema<Object> schema = new Schema<Object>() { // from class: io.protostuff.runtime.IdStrategy.8
            @Override // io.protostuff.Schema
            public String getFieldName(int i3) {
                return ObjectSchema.name(i3);
            }

            @Override // io.protostuff.Schema
            public int getFieldNumber(String str) {
                return ObjectSchema.number(str);
            }

            @Override // io.protostuff.Schema
            public boolean isInitialized(Object obj) {
                return true;
            }

            @Override // io.protostuff.Schema
            public void mergeFrom(Input input, Object obj) throws IOException {
                if (PMapWrapper.class == obj.getClass()) {
                    ((PMapWrapper) obj).setValue(ObjectSchema.readObjectFrom(input, this, obj, IdStrategy.this));
                } else {
                    ((Collection) obj).add(ObjectSchema.readObjectFrom(input, this, obj, IdStrategy.this));
                }
            }

            @Override // io.protostuff.Schema
            public String messageFullName() {
                return Object.class.getName();
            }

            @Override // io.protostuff.Schema
            public String messageName() {
                return Object.class.getSimpleName();
            }

            @Override // io.protostuff.Schema
            public Object newMessage() {
                throw new UnsupportedOperationException();
            }

            @Override // io.protostuff.Schema
            public Class<? super Object> typeClass() {
                return Object.class;
            }

            @Override // io.protostuff.Schema
            public void writeTo(Output output, Object obj) throws IOException {
                ObjectSchema.writeObjectTo(output, obj, this, IdStrategy.this);
            }
        };
        this.DYNAMIC_VALUE_SCHEMA = schema;
        this.DYNAMIC_VALUE_PIPE_SCHEMA = new Pipe.Schema<Object>(schema) { // from class: io.protostuff.runtime.IdStrategy.9
            @Override // io.protostuff.Pipe.Schema
            public void transfer(Pipe pipe, Input input, Output output) throws IOException {
                ObjectSchema.transferObject(this, pipe, input, output, IdStrategy.this);
            }
        };
        Schema<Collection<Object>> schema2 = new Schema<Collection<Object>>() { // from class: io.protostuff.runtime.IdStrategy.10
            @Override // io.protostuff.Schema
            public String getFieldName(int i3) {
                if (i3 == 1) {
                    return "v";
                }
                return null;
            }

            @Override // io.protostuff.Schema
            public int getFieldNumber(String str) {
                return (str.length() == 1 && str.charAt(0) == 'v') ? 1 : 0;
            }

            @Override // io.protostuff.Schema
            public boolean isInitialized(Collection<Object> collection) {
                return true;
            }

            @Override // io.protostuff.Schema
            public String messageFullName() {
                return Collection.class.getName();
            }

            @Override // io.protostuff.Schema
            public String messageName() {
                return Collection.class.getSimpleName();
            }

            @Override // io.protostuff.Schema
            public Class<? super Collection<Object>> typeClass() {
                return Collection.class;
            }

            @Override // io.protostuff.Schema
            public void mergeFrom(Input input, Collection<Object> collection) throws IOException {
                while (true) {
                    int fieldNumber = input.readFieldNumber(this);
                    if (fieldNumber == 0) {
                        return;
                    }
                    if (fieldNumber != 1) {
                        throw new ProtostuffException("Corrupt input.");
                    }
                    Object objMergeObject = input.mergeObject(collection, IdStrategy.this.DYNAMIC_VALUE_SCHEMA);
                    if ((input instanceof GraphInput) && ((GraphInput) input).isCurrentMessageReference()) {
                        collection.add(objMergeObject);
                    }
                }
            }

            @Override // io.protostuff.Schema
            public Collection<Object> newMessage() {
                throw new UnsupportedOperationException();
            }

            @Override // io.protostuff.Schema
            public void writeTo(Output output, Collection<Object> collection) throws IOException {
                for (Object obj : collection) {
                    if (obj != null) {
                        output.writeObject(1, obj, IdStrategy.this.DYNAMIC_VALUE_SCHEMA, true);
                    }
                }
            }
        };
        this.COLLECTION_SCHEMA = schema2;
        this.COLLECTION_PIPE_SCHEMA = new Pipe.Schema<Collection<Object>>(schema2) { // from class: io.protostuff.runtime.IdStrategy.11
            @Override // io.protostuff.Pipe.Schema
            public void transfer(Pipe pipe, Input input, Output output) throws IOException {
                while (true) {
                    int fieldNumber = input.readFieldNumber(this.wrappedSchema);
                    if (fieldNumber == 0) {
                        return;
                    }
                    if (fieldNumber != 1) {
                        throw new ProtostuffException("The collection was incorrectly serialized.");
                    }
                    output.writeObject(fieldNumber, pipe, IdStrategy.this.DYNAMIC_VALUE_PIPE_SCHEMA, true);
                }
            }
        };
        Schema<Object> schema3 = new Schema<Object>() { // from class: io.protostuff.runtime.IdStrategy.12
            @Override // io.protostuff.Schema
            public String getFieldName(int i3) {
                if (i3 == 1) {
                    return "v";
                }
                return null;
            }

            @Override // io.protostuff.Schema
            public int getFieldNumber(String str) {
                return (str.length() == 1 && str.charAt(0) == 'v') ? 1 : 0;
            }

            @Override // io.protostuff.Schema
            public boolean isInitialized(Object obj) {
                return true;
            }

            @Override // io.protostuff.Schema
            public void mergeFrom(Input input, Object obj) throws IOException {
                throw new UnsupportedOperationException();
            }

            @Override // io.protostuff.Schema
            public String messageFullName() {
                return Array.class.getName();
            }

            @Override // io.protostuff.Schema
            public String messageName() {
                return Array.class.getSimpleName();
            }

            @Override // io.protostuff.Schema
            public Object newMessage() {
                throw new UnsupportedOperationException();
            }

            @Override // io.protostuff.Schema
            public Class<? super Object> typeClass() {
                return Object.class;
            }

            @Override // io.protostuff.Schema
            public void writeTo(Output output, Object obj) throws IOException {
                for (Object obj2 : (Object[]) obj) {
                    if (obj2 != null) {
                        output.writeObject(1, obj2, IdStrategy.this.DYNAMIC_VALUE_SCHEMA, true);
                    }
                }
            }
        };
        this.ARRAY_SCHEMA = schema3;
        this.ARRAY_PIPE_SCHEMA = new Pipe.Schema<Object>(schema3) { // from class: io.protostuff.runtime.IdStrategy.13
            @Override // io.protostuff.Pipe.Schema
            public void transfer(Pipe pipe, Input input, Output output) throws IOException {
                while (true) {
                    int fieldNumber = input.readFieldNumber(this.wrappedSchema);
                    if (fieldNumber == 0) {
                        return;
                    }
                    if (fieldNumber != 1) {
                        throw new ProtostuffException("The array was incorrectly serialized.");
                    }
                    output.writeObject(fieldNumber, pipe, IdStrategy.this.DYNAMIC_VALUE_PIPE_SCHEMA, true);
                }
            }
        };
        Schema<Map<Object, Object>> schema4 = new Schema<Map<Object, Object>>() { // from class: io.protostuff.runtime.IdStrategy.14
            @Override // io.protostuff.Schema
            public final String getFieldName(int i3) {
                if (i3 == 1) {
                    return MapSchema.FIELD_NAME_ENTRY;
                }
                return null;
            }

            @Override // io.protostuff.Schema
            public final int getFieldNumber(String str) {
                return (str.length() == 1 && str.charAt(0) == 'e') ? 1 : 0;
            }

            @Override // io.protostuff.Schema
            public boolean isInitialized(Map<Object, Object> map) {
                return true;
            }

            @Override // io.protostuff.Schema
            public String messageFullName() {
                return Map.class.getName();
            }

            @Override // io.protostuff.Schema
            public String messageName() {
                return Map.class.getSimpleName();
            }

            @Override // io.protostuff.Schema
            public Class<? super Map<Object, Object>> typeClass() {
                return Map.class;
            }

            @Override // io.protostuff.Schema
            public void mergeFrom(Input input, Map<Object, Object> map) throws IOException {
                int fieldNumber = input.readFieldNumber(this);
                PMapWrapper pMapWrapper = null;
                while (fieldNumber != 0) {
                    if (fieldNumber != 1) {
                        throw new ProtostuffException("The map was incorrectly serialized.");
                    }
                    if (pMapWrapper == null) {
                        pMapWrapper = new PMapWrapper(map);
                    }
                    if (pMapWrapper != input.mergeObject(pMapWrapper, IdStrategy.this.ENTRY_SCHEMA)) {
                        throw new IllegalStateException("A Map.Entry will always be unique, hence it cannot be a reference obtained from " + input.getClass().getName());
                    }
                    fieldNumber = input.readFieldNumber(this);
                }
            }

            @Override // io.protostuff.Schema
            public Map<Object, Object> newMessage() {
                throw new UnsupportedOperationException();
            }

            @Override // io.protostuff.Schema
            public void writeTo(Output output, Map<Object, Object> map) throws IOException {
                Iterator<Map.Entry<Object, Object>> it = map.entrySet().iterator();
                while (it.hasNext()) {
                    output.writeObject(1, it.next(), IdStrategy.this.ENTRY_SCHEMA, true);
                }
            }
        };
        this.MAP_SCHEMA = schema4;
        this.MAP_PIPE_SCHEMA = new Pipe.Schema<Map<Object, Object>>(schema4) { // from class: io.protostuff.runtime.IdStrategy.15
            @Override // io.protostuff.Pipe.Schema
            public void transfer(Pipe pipe, Input input, Output output) throws IOException {
                while (true) {
                    int fieldNumber = input.readFieldNumber(this.wrappedSchema);
                    if (fieldNumber == 0) {
                        return;
                    }
                    if (fieldNumber != 1) {
                        throw new ProtostuffException("The map was incorrectly serialized.");
                    }
                    output.writeObject(fieldNumber, pipe, IdStrategy.this.ENTRY_PIPE_SCHEMA, true);
                }
            }
        };
        Schema<Map.Entry<Object, Object>> schema5 = new Schema<Map.Entry<Object, Object>>() { // from class: io.protostuff.runtime.IdStrategy.16
            static final /* synthetic */ boolean $assertionsDisabled = false;

            @Override // io.protostuff.Schema
            public final String getFieldName(int i3) {
                if (i3 == 1) {
                    return MapSchema.FIELD_NAME_KEY;
                }
                if (i3 != 2) {
                    return null;
                }
                return "v";
            }

            @Override // io.protostuff.Schema
            public final int getFieldNumber(String str) {
                if (str.length() != 1) {
                    return 0;
                }
                char cCharAt = str.charAt(0);
                if (cCharAt != 'k') {
                    return cCharAt != 'v' ? 0 : 2;
                }
                return 1;
            }

            @Override // io.protostuff.Schema
            public boolean isInitialized(Map.Entry<Object, Object> entry) {
                return true;
            }

            @Override // io.protostuff.Schema
            public String messageFullName() {
                return Map.Entry.class.getName();
            }

            @Override // io.protostuff.Schema
            public String messageName() {
                return Map.Entry.class.getSimpleName();
            }

            @Override // io.protostuff.Schema
            public Class<? super Map.Entry<Object, Object>> typeClass() {
                return Map.Entry.class;
            }

            @Override // io.protostuff.Schema
            public void mergeFrom(Input input, Map.Entry<Object, Object> entry) throws IOException {
                PMapWrapper pMapWrapper = (PMapWrapper) entry;
                int fieldNumber = input.readFieldNumber(this);
                Object objMergeObject = null;
                Object objMergeObject2 = null;
                while (fieldNumber != 0) {
                    if (fieldNumber != 1) {
                        if (fieldNumber != 2) {
                            throw new ProtostuffException("The map was incorrectly serialized.");
                        }
                        if (objMergeObject2 != null) {
                            throw new ProtostuffException("The map was incorrectly serialized.");
                        }
                        objMergeObject2 = input.mergeObject(pMapWrapper, IdStrategy.this.DYNAMIC_VALUE_SCHEMA);
                        if (pMapWrapper == objMergeObject2) {
                            objMergeObject2 = pMapWrapper.setValue(null);
                        }
                    } else {
                        if (objMergeObject != null) {
                            throw new ProtostuffException("The map was incorrectly serialized.");
                        }
                        objMergeObject = input.mergeObject(pMapWrapper, IdStrategy.this.DYNAMIC_VALUE_SCHEMA);
                        if (pMapWrapper == objMergeObject) {
                            objMergeObject = pMapWrapper.setValue(null);
                        }
                    }
                    fieldNumber = input.readFieldNumber(this);
                }
                pMapWrapper.map.put(objMergeObject, objMergeObject2);
            }

            @Override // io.protostuff.Schema
            public Map.Entry<Object, Object> newMessage() {
                throw new UnsupportedOperationException();
            }

            @Override // io.protostuff.Schema
            public void writeTo(Output output, Map.Entry<Object, Object> entry) throws IOException {
                if (entry.getKey() != null) {
                    output.writeObject(1, entry.getKey(), IdStrategy.this.DYNAMIC_VALUE_SCHEMA, false);
                }
                if (entry.getValue() != null) {
                    output.writeObject(2, entry.getValue(), IdStrategy.this.DYNAMIC_VALUE_SCHEMA, false);
                }
            }
        };
        this.ENTRY_SCHEMA = schema5;
        this.ENTRY_PIPE_SCHEMA = new Pipe.Schema<Map.Entry<Object, Object>>(schema5) { // from class: io.protostuff.runtime.IdStrategy.17
            @Override // io.protostuff.Pipe.Schema
            public void transfer(Pipe pipe, Input input, Output output) throws IOException {
                while (true) {
                    int fieldNumber = input.readFieldNumber(this.wrappedSchema);
                    if (fieldNumber == 0) {
                        return;
                    }
                    if (fieldNumber == 1) {
                        output.writeObject(fieldNumber, pipe, IdStrategy.this.DYNAMIC_VALUE_PIPE_SCHEMA, false);
                    } else {
                        if (fieldNumber != 2) {
                            throw new ProtostuffException("The map was incorrectly serialized.");
                        }
                        output.writeObject(fieldNumber, pipe, IdStrategy.this.DYNAMIC_VALUE_PIPE_SCHEMA, false);
                    }
                }
            }
        };
        Schema<Object> schema6 = new Schema<Object>() { // from class: io.protostuff.runtime.IdStrategy.18
            @Override // io.protostuff.Schema
            public String getFieldName(int i3) {
                return ObjectSchema.name(i3);
            }

            @Override // io.protostuff.Schema
            public int getFieldNumber(String str) {
                return ObjectSchema.number(str);
            }

            @Override // io.protostuff.Schema
            public boolean isInitialized(Object obj) {
                return true;
            }

            @Override // io.protostuff.Schema
            public void mergeFrom(Input input, Object obj) throws IOException {
                ((Wrapper) obj).value = ObjectSchema.readObjectFrom(input, this, obj, IdStrategy.this);
            }

            @Override // io.protostuff.Schema
            public String messageFullName() {
                return Object.class.getName();
            }

            @Override // io.protostuff.Schema
            public String messageName() {
                return Object.class.getSimpleName();
            }

            @Override // io.protostuff.Schema
            public Object newMessage() {
                throw new UnsupportedOperationException();
            }

            @Override // io.protostuff.Schema
            public Class<? super Object> typeClass() {
                return Object.class;
            }

            @Override // io.protostuff.Schema
            public void writeTo(Output output, Object obj) throws IOException {
                ObjectSchema.writeObjectTo(output, obj, this, IdStrategy.this);
            }
        };
        this.OBJECT_SCHEMA = schema6;
        this.OBJECT_PIPE_SCHEMA = new Pipe.Schema<Object>(schema6) { // from class: io.protostuff.runtime.IdStrategy.19
            @Override // io.protostuff.Pipe.Schema
            public void transfer(Pipe pipe, Input input, Output output) throws IOException {
                ObjectSchema.transferObject(this, pipe, input, output, IdStrategy.this);
            }
        };
        Schema<Object> schema7 = new Schema<Object>() { // from class: io.protostuff.runtime.IdStrategy.20
            @Override // io.protostuff.Schema
            public String getFieldName(int i3) {
                return ClassSchema.name(i3);
            }

            @Override // io.protostuff.Schema
            public int getFieldNumber(String str) {
                return ClassSchema.number(str);
            }

            @Override // io.protostuff.Schema
            public boolean isInitialized(Object obj) {
                return true;
            }

            @Override // io.protostuff.Schema
            public void mergeFrom(Input input, Object obj) throws IOException {
                ((Wrapper) obj).value = ClassSchema.readObjectFrom(input, this, obj, IdStrategy.this);
            }

            @Override // io.protostuff.Schema
            public String messageFullName() {
                return Class.class.getName();
            }

            @Override // io.protostuff.Schema
            public String messageName() {
                return Class.class.getSimpleName();
            }

            @Override // io.protostuff.Schema
            public Object newMessage() {
                throw new UnsupportedOperationException();
            }

            @Override // io.protostuff.Schema
            public Class<? super Object> typeClass() {
                return Object.class;
            }

            @Override // io.protostuff.Schema
            public void writeTo(Output output, Object obj) throws IOException {
                ClassSchema.writeObjectTo(output, obj, this, IdStrategy.this);
            }
        };
        this.CLASS_SCHEMA = schema7;
        this.CLASS_PIPE_SCHEMA = new Pipe.Schema<Object>(schema7) { // from class: io.protostuff.runtime.IdStrategy.21
            @Override // io.protostuff.Pipe.Schema
            public void transfer(Pipe pipe, Input input, Output output) throws IOException {
                ClassSchema.transferObject(this, pipe, input, output, IdStrategy.this);
            }
        };
        Schema<Object> schema8 = new Schema<Object>() { // from class: io.protostuff.runtime.IdStrategy.22
            @Override // io.protostuff.Schema
            public String getFieldName(int i3) {
                return PolymorphicCollectionSchema.name(i3);
            }

            @Override // io.protostuff.Schema
            public int getFieldNumber(String str) {
                return PolymorphicCollectionSchema.number(str);
            }

            @Override // io.protostuff.Schema
            public boolean isInitialized(Object obj) {
                return true;
            }

            @Override // io.protostuff.Schema
            public void mergeFrom(Input input, Object obj) throws IOException {
                ((Wrapper) obj).value = PolymorphicCollectionSchema.readObjectFrom(input, this, obj, IdStrategy.this);
            }

            @Override // io.protostuff.Schema
            public String messageFullName() {
                return Collection.class.getName();
            }

            @Override // io.protostuff.Schema
            public String messageName() {
                return Collection.class.getSimpleName();
            }

            @Override // io.protostuff.Schema
            public Object newMessage() {
                throw new UnsupportedOperationException();
            }

            @Override // io.protostuff.Schema
            public Class<? super Object> typeClass() {
                return Object.class;
            }

            @Override // io.protostuff.Schema
            public void writeTo(Output output, Object obj) throws IOException {
                PolymorphicCollectionSchema.writeObjectTo(output, obj, this, IdStrategy.this);
            }
        };
        this.POLYMORPHIC_COLLECTION_SCHEMA = schema8;
        this.POLYMORPHIC_COLLECTION_PIPE_SCHEMA = new Pipe.Schema<Object>(schema8) { // from class: io.protostuff.runtime.IdStrategy.23
            @Override // io.protostuff.Pipe.Schema
            public void transfer(Pipe pipe, Input input, Output output) throws IOException {
                PolymorphicCollectionSchema.transferObject(this, pipe, input, output, IdStrategy.this);
            }
        };
        Schema<Object> schema9 = new Schema<Object>() { // from class: io.protostuff.runtime.IdStrategy.24
            @Override // io.protostuff.Schema
            public String getFieldName(int i3) {
                return PolymorphicMapSchema.name(i3);
            }

            @Override // io.protostuff.Schema
            public int getFieldNumber(String str) {
                return PolymorphicMapSchema.number(str);
            }

            @Override // io.protostuff.Schema
            public boolean isInitialized(Object obj) {
                return true;
            }

            @Override // io.protostuff.Schema
            public void mergeFrom(Input input, Object obj) throws IOException {
                ((Wrapper) obj).value = PolymorphicMapSchema.readObjectFrom(input, this, obj, IdStrategy.this);
            }

            @Override // io.protostuff.Schema
            public String messageFullName() {
                return Map.class.getName();
            }

            @Override // io.protostuff.Schema
            public String messageName() {
                return Map.class.getSimpleName();
            }

            @Override // io.protostuff.Schema
            public Object newMessage() {
                throw new UnsupportedOperationException();
            }

            @Override // io.protostuff.Schema
            public Class<? super Object> typeClass() {
                return Object.class;
            }

            @Override // io.protostuff.Schema
            public void writeTo(Output output, Object obj) throws IOException {
                PolymorphicMapSchema.writeObjectTo(output, obj, this, IdStrategy.this);
            }
        };
        this.POLYMORPHIC_MAP_SCHEMA = schema9;
        this.POLYMORPHIC_MAP_PIPE_SCHEMA = new Pipe.Schema<Object>(schema9) { // from class: io.protostuff.runtime.IdStrategy.25
            @Override // io.protostuff.Pipe.Schema
            public void transfer(Pipe pipe, Input input, Output output) throws IOException {
                PolymorphicMapSchema.transferObject(this, pipe, input, output, IdStrategy.this);
            }
        };
        PolymorphicSchema.Handler handler = null;
        this.ARRAY_BOOL_PRIMITIVE_SCHEMA = new ArraySchemas.BoolArray(this, null, true);
        boolean z = false;
        this.ARRAY_BOOL_BOXED_SCHEMA = new ArraySchemas.BoolArray(this, null, false);
        this.ARRAY_BOOL_DERIVED_SCHEMA = new ArraySchemas.BoolArray(this, handler, z) { // from class: io.protostuff.runtime.IdStrategy.26
            @Override // io.protostuff.runtime.ArraySchemas.BoolArray, io.protostuff.runtime.ArraySchemas.Base
            public Object readFrom(Input input, Object obj) throws IOException {
                if (1 != input.readFieldNumber(this)) {
                    throw new ProtostuffException("Corrupt input.");
                }
                int int32 = input.readInt32();
                return int32 >= 0 ? readPrimitiveFrom(input, obj, int32) : readBoxedFrom(input, obj, (-int32) - 1);
            }

            @Override // io.protostuff.runtime.ArraySchemas.Base, io.protostuff.runtime.PolymorphicSchema
            public void setValue(Object obj, Object obj2) {
                if (MapSchema.MapWrapper.class == obj2.getClass()) {
                    ((MapSchema.MapWrapper) obj2).setValue(obj);
                } else {
                    ((Collection) obj2).add(obj);
                }
            }

            @Override // io.protostuff.runtime.ArraySchemas.BoolArray
            public void writeLengthTo(Output output, int i3, boolean z2) throws IOException {
                if (z2) {
                    output.writeInt32(1, i3, false);
                } else {
                    output.writeInt32(1, -(i3 + 1), false);
                }
            }

            @Override // io.protostuff.runtime.ArraySchemas.BoolArray, io.protostuff.Schema
            public void writeTo(Output output, Object obj) throws IOException {
                writeTo(output, obj, obj.getClass().getComponentType().isPrimitive());
            }
        };
        this.ARRAY_CHAR_PRIMITIVE_SCHEMA = new ArraySchemas.CharArray(this, null, true);
        this.ARRAY_CHAR_BOXED_SCHEMA = new ArraySchemas.CharArray(this, null, false);
        this.ARRAY_CHAR_DERIVED_SCHEMA = new ArraySchemas.CharArray(this, handler, z) { // from class: io.protostuff.runtime.IdStrategy.27
            @Override // io.protostuff.runtime.ArraySchemas.CharArray, io.protostuff.runtime.ArraySchemas.Base
            public Object readFrom(Input input, Object obj) throws IOException {
                if (1 != input.readFieldNumber(this)) {
                    throw new ProtostuffException("Corrupt input.");
                }
                int int32 = input.readInt32();
                return int32 >= 0 ? readPrimitiveFrom(input, obj, int32) : readBoxedFrom(input, obj, (-int32) - 1);
            }

            @Override // io.protostuff.runtime.ArraySchemas.Base, io.protostuff.runtime.PolymorphicSchema
            public void setValue(Object obj, Object obj2) {
                if (MapSchema.MapWrapper.class == obj2.getClass()) {
                    ((MapSchema.MapWrapper) obj2).setValue(obj);
                } else {
                    ((Collection) obj2).add(obj);
                }
            }

            @Override // io.protostuff.runtime.ArraySchemas.CharArray
            public void writeLengthTo(Output output, int i3, boolean z2) throws IOException {
                if (z2) {
                    output.writeInt32(1, i3, false);
                } else {
                    output.writeInt32(1, -(i3 + 1), false);
                }
            }

            @Override // io.protostuff.runtime.ArraySchemas.CharArray, io.protostuff.Schema
            public void writeTo(Output output, Object obj) throws IOException {
                writeTo(output, obj, obj.getClass().getComponentType().isPrimitive());
            }
        };
        this.ARRAY_SHORT_PRIMITIVE_SCHEMA = new ArraySchemas.ShortArray(this, null, true);
        this.ARRAY_SHORT_BOXED_SCHEMA = new ArraySchemas.ShortArray(this, null, false);
        this.ARRAY_SHORT_DERIVED_SCHEMA = new ArraySchemas.ShortArray(this, handler, z) { // from class: io.protostuff.runtime.IdStrategy.28
            @Override // io.protostuff.runtime.ArraySchemas.ShortArray, io.protostuff.runtime.ArraySchemas.Base
            public Object readFrom(Input input, Object obj) throws IOException {
                if (1 != input.readFieldNumber(this)) {
                    throw new ProtostuffException("Corrupt input.");
                }
                int int32 = input.readInt32();
                return int32 >= 0 ? readPrimitiveFrom(input, obj, int32) : readBoxedFrom(input, obj, (-int32) - 1);
            }

            @Override // io.protostuff.runtime.ArraySchemas.Base, io.protostuff.runtime.PolymorphicSchema
            public void setValue(Object obj, Object obj2) {
                if (MapSchema.MapWrapper.class == obj2.getClass()) {
                    ((MapSchema.MapWrapper) obj2).setValue(obj);
                } else {
                    ((Collection) obj2).add(obj);
                }
            }

            @Override // io.protostuff.runtime.ArraySchemas.ShortArray
            public void writeLengthTo(Output output, int i3, boolean z2) throws IOException {
                if (z2) {
                    output.writeInt32(1, i3, false);
                } else {
                    output.writeInt32(1, -(i3 + 1), false);
                }
            }

            @Override // io.protostuff.runtime.ArraySchemas.ShortArray, io.protostuff.Schema
            public void writeTo(Output output, Object obj) throws IOException {
                writeTo(output, obj, obj.getClass().getComponentType().isPrimitive());
            }
        };
        this.ARRAY_INT32_PRIMITIVE_SCHEMA = new ArraySchemas.Int32Array(this, null, true);
        this.ARRAY_INT32_BOXED_SCHEMA = new ArraySchemas.Int32Array(this, null, false);
        this.ARRAY_INT32_DERIVED_SCHEMA = new ArraySchemas.Int32Array(this, handler, z) { // from class: io.protostuff.runtime.IdStrategy.29
            @Override // io.protostuff.runtime.ArraySchemas.Int32Array, io.protostuff.runtime.ArraySchemas.Base
            public Object readFrom(Input input, Object obj) throws IOException {
                if (1 != input.readFieldNumber(this)) {
                    throw new ProtostuffException("Corrupt input.");
                }
                int int32 = input.readInt32();
                return int32 >= 0 ? readPrimitiveFrom(input, obj, int32) : readBoxedFrom(input, obj, (-int32) - 1);
            }

            @Override // io.protostuff.runtime.ArraySchemas.Base, io.protostuff.runtime.PolymorphicSchema
            public void setValue(Object obj, Object obj2) {
                if (MapSchema.MapWrapper.class == obj2.getClass()) {
                    ((MapSchema.MapWrapper) obj2).setValue(obj);
                } else {
                    ((Collection) obj2).add(obj);
                }
            }

            @Override // io.protostuff.runtime.ArraySchemas.Int32Array
            public void writeLengthTo(Output output, int i3, boolean z2) throws IOException {
                if (z2) {
                    output.writeInt32(1, i3, false);
                } else {
                    output.writeInt32(1, -(i3 + 1), false);
                }
            }

            @Override // io.protostuff.runtime.ArraySchemas.Int32Array, io.protostuff.Schema
            public void writeTo(Output output, Object obj) throws IOException {
                writeTo(output, obj, obj.getClass().getComponentType().isPrimitive());
            }
        };
        this.ARRAY_INT64_PRIMITIVE_SCHEMA = new ArraySchemas.Int64Array(this, null, true);
        this.ARRAY_INT64_BOXED_SCHEMA = new ArraySchemas.Int64Array(this, null, false);
        this.ARRAY_INT64_DERIVED_SCHEMA = new ArraySchemas.Int64Array(this, handler, z) { // from class: io.protostuff.runtime.IdStrategy.30
            @Override // io.protostuff.runtime.ArraySchemas.Int64Array, io.protostuff.runtime.ArraySchemas.Base
            public Object readFrom(Input input, Object obj) throws IOException {
                if (1 != input.readFieldNumber(this)) {
                    throw new ProtostuffException("Corrupt input.");
                }
                int int32 = input.readInt32();
                return int32 >= 0 ? readPrimitiveFrom(input, obj, int32) : readBoxedFrom(input, obj, (-int32) - 1);
            }

            @Override // io.protostuff.runtime.ArraySchemas.Base, io.protostuff.runtime.PolymorphicSchema
            public void setValue(Object obj, Object obj2) {
                if (MapSchema.MapWrapper.class == obj2.getClass()) {
                    ((MapSchema.MapWrapper) obj2).setValue(obj);
                } else {
                    ((Collection) obj2).add(obj);
                }
            }

            @Override // io.protostuff.runtime.ArraySchemas.Int64Array
            public void writeLengthTo(Output output, int i3, boolean z2) throws IOException {
                if (z2) {
                    output.writeInt32(1, i3, false);
                } else {
                    output.writeInt32(1, -(i3 + 1), false);
                }
            }

            @Override // io.protostuff.runtime.ArraySchemas.Int64Array, io.protostuff.Schema
            public void writeTo(Output output, Object obj) throws IOException {
                writeTo(output, obj, obj.getClass().getComponentType().isPrimitive());
            }
        };
        this.ARRAY_FLOAT_PRIMITIVE_SCHEMA = new ArraySchemas.FloatArray(this, null, true);
        this.ARRAY_FLOAT_BOXED_SCHEMA = new ArraySchemas.FloatArray(this, null, false);
        this.ARRAY_FLOAT_DERIVED_SCHEMA = new ArraySchemas.FloatArray(this, handler, z) { // from class: io.protostuff.runtime.IdStrategy.31
            @Override // io.protostuff.runtime.ArraySchemas.FloatArray, io.protostuff.runtime.ArraySchemas.Base
            public Object readFrom(Input input, Object obj) throws IOException {
                if (1 != input.readFieldNumber(this)) {
                    throw new ProtostuffException("Corrupt input.");
                }
                int int32 = input.readInt32();
                return int32 >= 0 ? readPrimitiveFrom(input, obj, int32) : readBoxedFrom(input, obj, (-int32) - 1);
            }

            @Override // io.protostuff.runtime.ArraySchemas.Base, io.protostuff.runtime.PolymorphicSchema
            public void setValue(Object obj, Object obj2) {
                if (MapSchema.MapWrapper.class == obj2.getClass()) {
                    ((MapSchema.MapWrapper) obj2).setValue(obj);
                } else {
                    ((Collection) obj2).add(obj);
                }
            }

            @Override // io.protostuff.runtime.ArraySchemas.FloatArray
            public void writeLengthTo(Output output, int i3, boolean z2) throws IOException {
                if (z2) {
                    output.writeInt32(1, i3, false);
                } else {
                    output.writeInt32(1, -(i3 + 1), false);
                }
            }

            @Override // io.protostuff.runtime.ArraySchemas.FloatArray, io.protostuff.Schema
            public void writeTo(Output output, Object obj) throws IOException {
                writeTo(output, obj, obj.getClass().getComponentType().isPrimitive());
            }
        };
        this.ARRAY_DOUBLE_PRIMITIVE_SCHEMA = new ArraySchemas.DoubleArray(this, null, true);
        this.ARRAY_DOUBLE_BOXED_SCHEMA = new ArraySchemas.DoubleArray(this, null, false);
        this.ARRAY_DOUBLE_DERIVED_SCHEMA = new ArraySchemas.DoubleArray(this, handler, z) { // from class: io.protostuff.runtime.IdStrategy.32
            @Override // io.protostuff.runtime.ArraySchemas.DoubleArray, io.protostuff.runtime.ArraySchemas.Base
            public Object readFrom(Input input, Object obj) throws IOException {
                if (1 != input.readFieldNumber(this)) {
                    throw new ProtostuffException("Corrupt input.");
                }
                int int32 = input.readInt32();
                return int32 >= 0 ? readPrimitiveFrom(input, obj, int32) : readBoxedFrom(input, obj, (-int32) - 1);
            }

            @Override // io.protostuff.runtime.ArraySchemas.Base, io.protostuff.runtime.PolymorphicSchema
            public void setValue(Object obj, Object obj2) {
                if (MapSchema.MapWrapper.class == obj2.getClass()) {
                    ((MapSchema.MapWrapper) obj2).setValue(obj);
                } else {
                    ((Collection) obj2).add(obj);
                }
            }

            @Override // io.protostuff.runtime.ArraySchemas.DoubleArray
            public void writeLengthTo(Output output, int i3, boolean z2) throws IOException {
                if (z2) {
                    output.writeInt32(1, i3, false);
                } else {
                    output.writeInt32(1, -(i3 + 1), false);
                }
            }

            @Override // io.protostuff.runtime.ArraySchemas.DoubleArray, io.protostuff.Schema
            public void writeTo(Output output, Object obj) throws IOException {
                writeTo(output, obj, obj.getClass().getComponentType().isPrimitive());
            }
        };
        this.ARRAY_STRING_SCHEMA = new ArraySchemas.StringArray(this, handler) { // from class: io.protostuff.runtime.IdStrategy.33
            @Override // io.protostuff.runtime.ArraySchemas.Base, io.protostuff.runtime.PolymorphicSchema
            public void setValue(Object obj, Object obj2) {
                if (MapSchema.MapWrapper.class == obj2.getClass()) {
                    ((MapSchema.MapWrapper) obj2).setValue(obj);
                } else {
                    ((Collection) obj2).add(obj);
                }
            }
        };
        this.ARRAY_BYTESTRING_SCHEMA = new ArraySchemas.ByteStringArray(this, handler) { // from class: io.protostuff.runtime.IdStrategy.34
            @Override // io.protostuff.runtime.ArraySchemas.Base, io.protostuff.runtime.PolymorphicSchema
            public void setValue(Object obj, Object obj2) {
                if (MapSchema.MapWrapper.class == obj2.getClass()) {
                    ((MapSchema.MapWrapper) obj2).setValue(obj);
                } else {
                    ((Collection) obj2).add(obj);
                }
            }
        };
        this.ARRAY_BYTEARRAY_SCHEMA = new ArraySchemas.ByteArrayArray(this, handler) { // from class: io.protostuff.runtime.IdStrategy.35
            @Override // io.protostuff.runtime.ArraySchemas.Base, io.protostuff.runtime.PolymorphicSchema
            public void setValue(Object obj, Object obj2) {
                if (MapSchema.MapWrapper.class == obj2.getClass()) {
                    ((MapSchema.MapWrapper) obj2).setValue(obj);
                } else {
                    ((Collection) obj2).add(obj);
                }
            }
        };
        this.ARRAY_BIGDECIMAL_SCHEMA = new ArraySchemas.BigDecimalArray(this, handler) { // from class: io.protostuff.runtime.IdStrategy.36
            @Override // io.protostuff.runtime.ArraySchemas.Base, io.protostuff.runtime.PolymorphicSchema
            public void setValue(Object obj, Object obj2) {
                if (MapSchema.MapWrapper.class == obj2.getClass()) {
                    ((MapSchema.MapWrapper) obj2).setValue(obj);
                } else {
                    ((Collection) obj2).add(obj);
                }
            }
        };
        this.ARRAY_BIGINTEGER_SCHEMA = new ArraySchemas.BigIntegerArray(this, handler) { // from class: io.protostuff.runtime.IdStrategy.37
            @Override // io.protostuff.runtime.ArraySchemas.Base, io.protostuff.runtime.PolymorphicSchema
            public void setValue(Object obj, Object obj2) {
                if (MapSchema.MapWrapper.class == obj2.getClass()) {
                    ((MapSchema.MapWrapper) obj2).setValue(obj);
                } else {
                    ((Collection) obj2).add(obj);
                }
            }
        };
        this.ARRAY_DATE_SCHEMA = new ArraySchemas.DateArray(this, handler) { // from class: io.protostuff.runtime.IdStrategy.38
            @Override // io.protostuff.runtime.ArraySchemas.Base, io.protostuff.runtime.PolymorphicSchema
            public void setValue(Object obj, Object obj2) {
                if (MapSchema.MapWrapper.class == obj2.getClass()) {
                    ((MapSchema.MapWrapper) obj2).setValue(obj);
                } else {
                    ((Collection) obj2).add(obj);
                }
            }
        };
    }

    public static <T> T createMessageInstance(Class<T> cls) {
        try {
            return cls.newInstance();
        } catch (IllegalAccessException e2) {
            try {
                Constructor<T> declaredConstructor = cls.getDeclaredConstructor(new Class[0]);
                declaredConstructor.setAccessible(true);
                return declaredConstructor.newInstance(new Object[0]);
            } catch (Exception unused) {
                throw new RuntimeException(e2);
            }
        } catch (InstantiationException e3) {
            throw new RuntimeException(e3);
        }
    }

    public abstract CollectionSchema.MessageFactory getCollectionFactory(Class<?> cls);

    public abstract <T> Delegate<T> getDelegate(Class<? super T> cls);

    public abstract <T> HasDelegate<T> getDelegateWrapper(Class<? super T> cls);

    public abstract EnumIO<? extends Enum<?>> getEnumIO(Class<?> cls);

    public abstract MapSchema.MessageFactory getMapFactory(Class<?> cls);

    public abstract <T> HasSchema<T> getSchemaWrapper(Class<T> cls, boolean z);

    public abstract boolean isDelegateRegistered(Class<?> cls);

    public abstract boolean isRegistered(Class<?> cls);

    public <T> Schema<T> newSchema(Class<T> cls) {
        IdStrategy idStrategy = this.primaryGroup;
        if (idStrategy == null) {
            return RuntimeSchema.createFrom(cls, this);
        }
        Schema<T> schema = idStrategy.getSchemaWrapper(cls, true).getSchema();
        if (!(schema instanceof RuntimeSchema)) {
            return schema;
        }
        RuntimeSchema runtimeSchema = (RuntimeSchema) schema;
        if (runtimeSchema.getFieldCount() == 0) {
            return runtimeSchema;
        }
        ArrayList arrayList = new ArrayList(runtimeSchema.getFieldCount());
        int i = 0;
        for (Field<T> field : runtimeSchema.getFields()) {
            int i2 = field.groupFilter;
            if (i2 != 0) {
                if (((i2 > 0 ? (~i2) & Integer.MAX_VALUE : -i2) & this.groupId) != 0) {
                }
            }
            Field<T> fieldCopy = field.copy(this);
            if (field != fieldCopy) {
                i++;
            }
            arrayList.add(fieldCopy);
        }
        return (i == 0 && arrayList.size() == runtimeSchema.getFieldCount()) ? runtimeSchema : new RuntimeSchema(cls, arrayList, runtimeSchema.instantiator);
    }

    public abstract Class<?> resolveArrayComponentTypeFrom(Input input, boolean z) throws IOException;

    public abstract Class<?> resolveClassFrom(Input input, boolean z, boolean z2) throws IOException;

    public abstract CollectionSchema.MessageFactory resolveCollectionFrom(Input input) throws IOException;

    public abstract <T> HasDelegate<T> resolveDelegateFrom(Input input) throws IOException;

    public abstract EnumIO<?> resolveEnumFrom(Input input) throws IOException;

    public abstract MapSchema.MessageFactory resolveMapFrom(Input input) throws IOException;

    public abstract <T> HasSchema<T> resolvePojoFrom(Input input, int i) throws IOException;

    public abstract void transferArrayId(Input input, Output output, int i, boolean z) throws IOException;

    public abstract void transferClassId(Input input, Output output, int i, boolean z, boolean z2) throws IOException;

    public abstract void transferCollectionId(Input input, Output output, int i) throws IOException;

    public abstract <T> HasDelegate<T> transferDelegateId(Input input, Output output, int i) throws IOException;

    public abstract void transferEnumId(Input input, Output output, int i) throws IOException;

    public abstract void transferMapId(Input input, Output output, int i) throws IOException;

    public abstract <T> HasSchema<T> transferPojoId(Input input, Output output, int i) throws IOException;

    public abstract <T> HasDelegate<T> tryWriteDelegateIdTo(Output output, int i, Class<T> cls) throws IOException;

    public abstract <T> HasSchema<T> tryWritePojoIdTo(Output output, int i, Class<T> cls, boolean z) throws IOException;

    public abstract void writeArrayIdTo(Output output, Class<?> cls) throws IOException;

    public abstract void writeClassIdTo(Output output, Class<?> cls, boolean z) throws IOException;

    public abstract void writeCollectionIdTo(Output output, int i, Class<?> cls) throws IOException;

    public abstract void writeEnumIdTo(Output output, int i, Class<?> cls) throws IOException;

    public abstract void writeMapIdTo(Output output, int i, Class<?> cls) throws IOException;

    public abstract <T> Schema<T> writeMessageIdTo(Output output, int i, Message<T> message) throws IOException;

    public abstract <T> HasSchema<T> writePojoIdTo(Output output, int i, Class<T> cls) throws IOException;
}
