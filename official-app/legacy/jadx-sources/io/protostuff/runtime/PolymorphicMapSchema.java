package io.protostuff.runtime;

import com.heytap.log.formatter.LogFieldKey;
import com.oplus.aiunit.vision.f04;
import io.protostuff.GraphInput;
import io.protostuff.Input;
import io.protostuff.MapSchema;
import io.protostuff.Output;
import io.protostuff.Pipe;
import io.protostuff.ProtostuffException;
import io.protostuff.Schema;
import io.protostuff.StatefulOutput;
import java.io.IOException;
import java.util.Collection;
import java.util.Collections;
import java.util.EnumMap;
import java.util.IdentityHashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes10.dex */
public abstract class PolymorphicMapSchema extends PolymorphicSchema {
    static final int ID_CHECKED_MAP = 7;
    static final int ID_CHECKED_SORTED_MAP = 8;
    static final int ID_EMPTY_MAP = 1;
    static final int ID_SINGLETON_MAP = 2;
    static final int ID_SYNCHRONIZED_MAP = 5;
    static final int ID_SYNCHRONIZED_SORTED_MAP = 6;
    static final int ID_UNMODIFIABLE_MAP = 3;
    static final int ID_UNMODIFIABLE_SORTED_MAP = 4;
    static final String STR_CHECKED_MAP = "g";
    static final String STR_CHECKED_SORTED_MAP = "h";
    static final String STR_EMPTY_MAP = "a";
    static final String STR_SINGLETON_MAP = "b";
    static final String STR_SYNCHRONIZED_MAP = "e";
    static final String STR_SYNCHRONIZED_SORTED_MAP = "f";
    static final String STR_UNMODIFIABLE_MAP = "c";
    static final String STR_UNMODIFIABLE_SORTED_MAP = "d";
    static final IdentityHashMap<Class<?>, Integer> __nonPublicMaps = new IdentityHashMap<>();
    static final java.lang.reflect.Field fCheckedMap_keyType;
    static final java.lang.reflect.Field fCheckedMap_m;
    static final java.lang.reflect.Field fCheckedMap_valueType;
    static final java.lang.reflect.Field fCheckedSortedMap_sm;
    static final java.lang.reflect.Field fSingletonMap_k;
    static final java.lang.reflect.Field fSingletonMap_v;
    static final java.lang.reflect.Field fSynchronizedMap_m;
    static final java.lang.reflect.Field fSynchronizedMap_mutex;
    static final java.lang.reflect.Field fSynchronizedSortedMap_sm;
    static final java.lang.reflect.Field fUnmodifiableMap_m;
    static final java.lang.reflect.Field fUnmodifiableSortedMap_sm;
    static final RuntimeEnv.Instantiator<?> iCheckedMap;
    static final RuntimeEnv.Instantiator<?> iCheckedSortedMap;
    static final RuntimeEnv.Instantiator<?> iSingletonMap;
    static final RuntimeEnv.Instantiator<?> iSynchronizedMap;
    static final RuntimeEnv.Instantiator<?> iSynchronizedSortedMap;
    static final RuntimeEnv.Instantiator<?> iUnmodifiableMap;
    static final RuntimeEnv.Instantiator<?> iUnmodifiableSortedMap;
    protected final Pipe.Schema<Object> pipeSchema;

    static {
        map("java.util.Collections$EmptyMap", 1);
        Class<?> map = map("java.util.Collections$SingletonMap", 2);
        Class<?> map2 = map("java.util.Collections$UnmodifiableMap", 3);
        Class<?> map3 = map("java.util.Collections$UnmodifiableSortedMap", 4);
        Class<?> map4 = map("java.util.Collections$SynchronizedMap", 5);
        Class<?> map5 = map("java.util.Collections$SynchronizedSortedMap", 6);
        Class<?> map6 = map("java.util.Collections$CheckedMap", 7);
        Class<?> map7 = map("java.util.Collections$CheckedSortedMap", 8);
        try {
            java.lang.reflect.Field declaredField = map.getDeclaredField(MapSchema.FIELD_NAME_KEY);
            fSingletonMap_k = declaredField;
            java.lang.reflect.Field declaredField2 = map.getDeclaredField("v");
            fSingletonMap_v = declaredField2;
            java.lang.reflect.Field declaredField3 = map2.getDeclaredField(LogFieldKey.MESSAGE_KEY);
            fUnmodifiableMap_m = declaredField3;
            java.lang.reflect.Field declaredField4 = map3.getDeclaredField("sm");
            fUnmodifiableSortedMap_sm = declaredField4;
            java.lang.reflect.Field declaredField5 = map4.getDeclaredField(LogFieldKey.MESSAGE_KEY);
            fSynchronizedMap_m = declaredField5;
            java.lang.reflect.Field declaredField6 = map5.getDeclaredField("sm");
            fSynchronizedSortedMap_sm = declaredField6;
            java.lang.reflect.Field declaredField7 = map4.getDeclaredField("mutex");
            fSynchronizedMap_mutex = declaredField7;
            java.lang.reflect.Field declaredField8 = map6.getDeclaredField(LogFieldKey.MESSAGE_KEY);
            fCheckedMap_m = declaredField8;
            java.lang.reflect.Field declaredField9 = map7.getDeclaredField("sm");
            fCheckedSortedMap_sm = declaredField9;
            java.lang.reflect.Field declaredField10 = map6.getDeclaredField(f04.JSON_KEY_DIGITAL_KEY_TYPE);
            fCheckedMap_keyType = declaredField10;
            java.lang.reflect.Field declaredField11 = map6.getDeclaredField("valueType");
            fCheckedMap_valueType = declaredField11;
            iSingletonMap = RuntimeEnv.newInstantiator(map);
            iUnmodifiableMap = RuntimeEnv.newInstantiator(map2);
            iUnmodifiableSortedMap = RuntimeEnv.newInstantiator(map3);
            iSynchronizedMap = RuntimeEnv.newInstantiator(map4);
            iSynchronizedSortedMap = RuntimeEnv.newInstantiator(map5);
            iCheckedMap = RuntimeEnv.newInstantiator(map6);
            iCheckedSortedMap = RuntimeEnv.newInstantiator(map7);
            declaredField.setAccessible(true);
            declaredField2.setAccessible(true);
            declaredField3.setAccessible(true);
            declaredField4.setAccessible(true);
            declaredField5.setAccessible(true);
            declaredField6.setAccessible(true);
            declaredField7.setAccessible(true);
            declaredField8.setAccessible(true);
            declaredField9.setAccessible(true);
            declaredField10.setAccessible(true);
            declaredField11.setAccessible(true);
        } catch (Exception e2) {
            throw new RuntimeException(e2);
        }
    }

    public PolymorphicMapSchema(IdStrategy idStrategy) {
        super(idStrategy);
        this.pipeSchema = new Pipe.Schema<Object>(this) { // from class: io.protostuff.runtime.PolymorphicMapSchema.1
            @Override // io.protostuff.Pipe.Schema
            public void transfer(Pipe pipe, Input input, Output output) throws IOException {
                PolymorphicMapSchema.transferObject(this, pipe, input, output, PolymorphicMapSchema.this.strategy);
            }
        };
    }

    private static Object fillSingletonMapFrom(Input input, Schema<?> schema, Object obj, IdStrategy idStrategy, boolean z, Object obj2) throws IOException {
        int fieldNumber = input.readFieldNumber(schema);
        if (fieldNumber == 0) {
            return obj2;
        }
        if (fieldNumber != 1) {
            if (fieldNumber != 3) {
                throw new ProtostuffException("Corrupt input.");
            }
            IdStrategy.Wrapper wrapper = new IdStrategy.Wrapper();
            Object objMergeObject = input.mergeObject(wrapper, idStrategy.OBJECT_SCHEMA);
            if (!z || !((GraphInput) input).isCurrentMessageReference()) {
                objMergeObject = wrapper.value;
            }
            try {
                fSingletonMap_v.set(obj2, objMergeObject);
                if (input.readFieldNumber(schema) == 0) {
                    return obj2;
                }
                throw new ProtostuffException("Corrupt input.");
            } catch (Exception e2) {
                throw new RuntimeException(e2);
            }
        }
        IdStrategy.Wrapper wrapper2 = new IdStrategy.Wrapper();
        Object objMergeObject2 = input.mergeObject(wrapper2, idStrategy.OBJECT_SCHEMA);
        if (!z || !((GraphInput) input).isCurrentMessageReference()) {
            objMergeObject2 = wrapper2.value;
        }
        int fieldNumber2 = input.readFieldNumber(schema);
        if (fieldNumber2 == 0) {
            try {
                fSingletonMap_k.set(obj2, objMergeObject2);
                return obj2;
            } catch (Exception e3) {
                throw new RuntimeException(e3);
            }
        }
        if (fieldNumber2 != 3) {
            throw new ProtostuffException("Corrupt input.");
        }
        Object objMergeObject3 = input.mergeObject(wrapper2, idStrategy.OBJECT_SCHEMA);
        if (!z || !((GraphInput) input).isCurrentMessageReference()) {
            objMergeObject3 = wrapper2.value;
        }
        try {
            fSingletonMap_k.set(obj2, objMergeObject2);
            fSingletonMap_v.set(obj2, objMergeObject3);
            if (input.readFieldNumber(schema) == 0) {
                return obj2;
            }
            throw new ProtostuffException("Corrupt input.");
        } catch (Exception e4) {
            throw new RuntimeException(e4);
        }
    }

    public static int idFrom(Class<?> cls) {
        Integer num = __nonPublicMaps.get(cls);
        if (num != null) {
            return num.intValue();
        }
        throw new RuntimeException("Unknown map: " + cls);
    }

    public static Object instanceFrom(int i) {
        switch (i) {
            case 1:
                return Collections.EMPTY_MAP;
            case 2:
                return iSingletonMap.newInstance();
            case 3:
                return iUnmodifiableMap.newInstance();
            case 4:
                return iUnmodifiableSortedMap.newInstance();
            case 5:
                return iSynchronizedMap.newInstance();
            case 6:
                return iSynchronizedSortedMap.newInstance();
            case 7:
                return iCheckedMap.newInstance();
            case 8:
                return iCheckedSortedMap.newInstance();
            default:
                throw new RuntimeException("Unknown id: " + i);
        }
    }

    private static Class<?> map(String str, int i) {
        Class<?> clsLoadClass = RuntimeEnv.loadClass(str);
        __nonPublicMaps.put(clsLoadClass, Integer.valueOf(i));
        return clsLoadClass;
    }

    public static String name(int i) {
        if (i == 23) {
            return "w";
        }
        if (i == 26) {
            return "z";
        }
        switch (i) {
            case 1:
                return STR_EMPTY_MAP;
            case 2:
                return STR_SINGLETON_MAP;
            case 3:
                return STR_UNMODIFIABLE_MAP;
            case 4:
                return STR_UNMODIFIABLE_SORTED_MAP;
            case 5:
                return "e";
            case 6:
                return STR_SYNCHRONIZED_SORTED_MAP;
            case 7:
                return "g";
            case 8:
                return "h";
            default:
                return null;
        }
    }

    public static int number(char c2) {
        if (c2 == 'w') {
            return 23;
        }
        if (c2 == 'z') {
            return 26;
        }
        switch (c2) {
            case 'a':
                return 1;
            case 'b':
                return 2;
            case 'c':
                return 3;
            case 'd':
                return 4;
            case 'e':
                return 5;
            case 'f':
                return 6;
            case 'g':
                return 7;
            case 'h':
                return 8;
            default:
                return 0;
        }
    }

    private static Object readCheckedMapFrom(Input input, Schema<?> schema, Object obj, IdStrategy idStrategy, boolean z, Object obj2, boolean z2) throws IOException {
        if (z) {
            ((GraphInput) input).updateLast(obj2, obj);
        }
        IdStrategy.Wrapper wrapper = new IdStrategy.Wrapper();
        Object objMergeObject = input.mergeObject(wrapper, idStrategy.POLYMORPHIC_MAP_SCHEMA);
        if (!z || !((GraphInput) input).isCurrentMessageReference()) {
            objMergeObject = wrapper.value;
        }
        if (1 != input.readFieldNumber(schema)) {
            throw new ProtostuffException("Corrupt input.");
        }
        Object objMergeObject2 = input.mergeObject(wrapper, idStrategy.CLASS_SCHEMA);
        if (!z || !((GraphInput) input).isCurrentMessageReference()) {
            objMergeObject2 = wrapper.value;
        }
        if (2 != input.readFieldNumber(schema)) {
            throw new ProtostuffException("Corrupt input.");
        }
        Object objMergeObject3 = input.mergeObject(wrapper, idStrategy.CLASS_SCHEMA);
        if (!z || !((GraphInput) input).isCurrentMessageReference()) {
            objMergeObject3 = wrapper.value;
        }
        try {
            fCheckedMap_m.set(obj2, objMergeObject);
            fCheckedMap_keyType.set(obj2, objMergeObject2);
            fCheckedMap_valueType.set(obj2, objMergeObject3);
            if (z2) {
                fCheckedSortedMap_sm.set(obj2, objMergeObject);
            }
            return obj2;
        } catch (Exception e2) {
            throw new RuntimeException(e2);
        }
    }

    public static Object readObjectFrom(Input input, Schema<?> schema, Object obj, IdStrategy idStrategy) throws IOException {
        return readObjectFrom(input, schema, obj, idStrategy, input.readFieldNumber(schema));
    }

    private static Object readSynchronizedMapFrom(Input input, Schema<?> schema, Object obj, IdStrategy idStrategy, boolean z, Object obj2, boolean z2) throws IOException {
        if (z) {
            ((GraphInput) input).updateLast(obj2, obj);
        }
        IdStrategy.Wrapper wrapper = new IdStrategy.Wrapper();
        Object objMergeObject = input.mergeObject(wrapper, idStrategy.POLYMORPHIC_MAP_SCHEMA);
        if (!z || !((GraphInput) input).isCurrentMessageReference()) {
            objMergeObject = wrapper.value;
        }
        try {
            fSynchronizedMap_m.set(obj2, objMergeObject);
            fSynchronizedMap_mutex.set(obj2, obj2);
            if (z2) {
                fSynchronizedSortedMap_sm.set(obj2, objMergeObject);
            }
            return obj2;
        } catch (Exception e2) {
            throw new RuntimeException(e2);
        }
    }

    private static Object readUnmodifiableMapFrom(Input input, Schema<?> schema, Object obj, IdStrategy idStrategy, boolean z, Object obj2, boolean z2) throws IOException {
        if (z) {
            ((GraphInput) input).updateLast(obj2, obj);
        }
        IdStrategy.Wrapper wrapper = new IdStrategy.Wrapper();
        Object objMergeObject = input.mergeObject(wrapper, idStrategy.POLYMORPHIC_MAP_SCHEMA);
        if (!z || !((GraphInput) input).isCurrentMessageReference()) {
            objMergeObject = wrapper.value;
        }
        try {
            fUnmodifiableMap_m.set(obj2, objMergeObject);
            if (z2) {
                fUnmodifiableSortedMap_sm.set(obj2, objMergeObject);
            }
            return obj2;
        } catch (Exception e2) {
            throw new RuntimeException(e2);
        }
    }

    public static void transferObject(Pipe.Schema<Object> schema, Pipe pipe, Input input, Output output, IdStrategy idStrategy) throws IOException {
        transferObject(schema, pipe, input, output, idStrategy, input.readFieldNumber(schema.wrappedSchema));
    }

    public static void transferSingletonMap(Pipe.Schema<Object> schema, Pipe pipe, Input input, Output output, IdStrategy idStrategy) throws IOException {
        int fieldNumber = input.readFieldNumber(schema.wrappedSchema);
        if (fieldNumber != 0) {
            if (fieldNumber != 1) {
                if (fieldNumber != 3) {
                    throw new ProtostuffException("Corrupt input.");
                }
                output.writeObject(3, pipe, idStrategy.OBJECT_PIPE_SCHEMA, false);
                if (input.readFieldNumber(schema.wrappedSchema) != 0) {
                    throw new ProtostuffException("Corrupt input.");
                }
                return;
            }
            output.writeObject(1, pipe, idStrategy.OBJECT_PIPE_SCHEMA, false);
            int fieldNumber2 = input.readFieldNumber(schema.wrappedSchema);
            if (fieldNumber2 != 0) {
                if (fieldNumber2 != 3) {
                    throw new ProtostuffException("Corrupt input.");
                }
                output.writeObject(3, pipe, idStrategy.OBJECT_PIPE_SCHEMA, false);
                if (input.readFieldNumber(schema.wrappedSchema) != 0) {
                    throw new ProtostuffException("Corrupt input.");
                }
            }
        }
    }

    private static void writeCheckedMapTo(Output output, Object obj, Schema<?> schema, IdStrategy idStrategy, int i) throws IOException {
        try {
            Object obj2 = fCheckedMap_m.get(obj);
            Object obj3 = fCheckedMap_keyType.get(obj);
            Object obj4 = fCheckedMap_valueType.get(obj);
            output.writeObject(i, obj2, idStrategy.POLYMORPHIC_MAP_SCHEMA, false);
            output.writeObject(1, obj3, idStrategy.CLASS_SCHEMA, false);
            output.writeObject(2, obj4, idStrategy.CLASS_SCHEMA, false);
        } catch (Exception e2) {
            throw new RuntimeException(e2);
        }
    }

    public static void writeNonPublicMapTo(Output output, Object obj, Schema<?> schema, IdStrategy idStrategy) throws IOException {
        Integer num = __nonPublicMaps.get(obj.getClass());
        if (num == null) {
            throw new RuntimeException("Unknown collection: " + obj.getClass());
        }
        int iIntValue = num.intValue();
        switch (iIntValue) {
            case 1:
                output.writeUInt32(iIntValue, 0, false);
                return;
            case 2:
                try {
                    Object obj2 = fSingletonMap_k.get(obj);
                    Object obj3 = fSingletonMap_v.get(obj);
                    output.writeUInt32(iIntValue, 0, false);
                    if (obj2 != null) {
                        output.writeObject(1, obj2, idStrategy.OBJECT_SCHEMA, false);
                    }
                    if (obj3 != null) {
                        output.writeObject(3, obj3, idStrategy.OBJECT_SCHEMA, false);
                        return;
                    }
                    return;
                } catch (Exception e2) {
                    throw new RuntimeException(e2);
                }
            case 3:
                writeUnmodifiableMapTo(output, obj, schema, idStrategy, iIntValue);
                return;
            case 4:
                writeUnmodifiableMapTo(output, obj, schema, idStrategy, iIntValue);
                return;
            case 5:
                writeSynchronizedMapTo(output, obj, schema, idStrategy, iIntValue);
                return;
            case 6:
                writeSynchronizedMapTo(output, obj, schema, idStrategy, iIntValue);
                return;
            case 7:
                writeCheckedMapTo(output, obj, schema, idStrategy, iIntValue);
                return;
            case 8:
                writeCheckedMapTo(output, obj, schema, idStrategy, iIntValue);
                return;
            default:
                throw new RuntimeException("Should not happen.");
        }
    }

    public static void writeObjectTo(Output output, Object obj, Schema<?> schema, IdStrategy idStrategy) throws IOException {
        if (Collections.class == obj.getClass().getDeclaringClass()) {
            writeNonPublicMapTo(output, obj, schema, idStrategy);
            return;
        }
        Class<?> cls = obj.getClass();
        if (EnumMap.class.isAssignableFrom(cls)) {
            idStrategy.writeEnumIdTo(output, 23, EnumIO.getKeyTypeFromEnumMap(obj));
        } else {
            idStrategy.writeMapIdTo(output, 26, cls);
        }
        if (output instanceof StatefulOutput) {
            ((StatefulOutput) output).updateLast(idStrategy.MAP_SCHEMA, schema);
        }
        idStrategy.MAP_SCHEMA.writeTo(output, (Map) obj);
    }

    private static void writeSynchronizedMapTo(Output output, Object obj, Schema<?> schema, IdStrategy idStrategy, int i) throws IOException {
        try {
            Object obj2 = fSynchronizedMap_m.get(obj);
            if (fSynchronizedMap_mutex.get(obj) != obj) {
                throw new RuntimeException("This exception is thrown to fail fast. Synchronized collections with a different mutex would only work if graph format is used, since the reference is retained.");
            }
            output.writeObject(i, obj2, idStrategy.POLYMORPHIC_MAP_SCHEMA, false);
        } catch (Exception e2) {
            throw new RuntimeException(e2);
        }
    }

    private static void writeUnmodifiableMapTo(Output output, Object obj, Schema<?> schema, IdStrategy idStrategy, int i) throws IOException {
        try {
            output.writeObject(i, fUnmodifiableMap_m.get(obj), idStrategy.POLYMORPHIC_MAP_SCHEMA, false);
        } catch (Exception e2) {
            throw new RuntimeException(e2);
        }
    }

    @Override // io.protostuff.Schema
    public String getFieldName(int i) {
        return name(i);
    }

    @Override // io.protostuff.Schema
    public int getFieldNumber(String str) {
        return number(str);
    }

    @Override // io.protostuff.runtime.PolymorphicSchema
    public Pipe.Schema<Object> getPipeSchema() {
        return this.pipeSchema;
    }

    @Override // io.protostuff.Schema
    public void mergeFrom(Input input, Object obj) throws IOException {
        setValue(readObjectFrom(input, this, obj, this.strategy), obj);
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
    public void writeTo(Output output, Object obj) throws IOException {
        writeObjectTo(output, obj, this, this.strategy);
    }

    public static int number(String str) {
        if (str.length() != 1) {
            return 0;
        }
        return number(str.charAt(0));
    }

    public static Object readObjectFrom(Input input, Schema<?> schema, Object obj, IdStrategy idStrategy, int i) throws IOException {
        Object unmodifiableMapFrom;
        boolean z = input instanceof GraphInput;
        if (i == 23) {
            Map<Object, Object> mapNewEnumMap = idStrategy.resolveEnumFrom(input).newEnumMap();
            if (z) {
                ((GraphInput) input).updateLast(mapNewEnumMap, obj);
            }
            idStrategy.MAP_SCHEMA.mergeFrom(input, mapNewEnumMap);
            return mapNewEnumMap;
        }
        if (i == 26) {
            Map<Object, Object> mapNewMessage = idStrategy.resolveMapFrom(input).newMessage();
            if (z) {
                ((GraphInput) input).updateLast(mapNewMessage, obj);
            }
            idStrategy.MAP_SCHEMA.mergeFrom(input, mapNewMessage);
            return mapNewMessage;
        }
        switch (i) {
            case 1:
                if (z) {
                    ((GraphInput) input).updateLast(Collections.EMPTY_MAP, obj);
                }
                if (input.readUInt32() != 0) {
                    throw new ProtostuffException("Corrupt input.");
                }
                unmodifiableMapFrom = Collections.EMPTY_MAP;
                break;
                break;
            case 2:
                Object objNewInstance = iSingletonMap.newInstance();
                if (z) {
                    ((GraphInput) input).updateLast(objNewInstance, obj);
                }
                if (input.readUInt32() == 0) {
                    return fillSingletonMapFrom(input, schema, obj, idStrategy, z, objNewInstance);
                }
                throw new ProtostuffException("Corrupt input.");
            case 3:
                unmodifiableMapFrom = readUnmodifiableMapFrom(input, schema, obj, idStrategy, z, iUnmodifiableMap.newInstance(), false);
                break;
            case 4:
                unmodifiableMapFrom = readUnmodifiableMapFrom(input, schema, obj, idStrategy, z, iUnmodifiableSortedMap.newInstance(), true);
                break;
            case 5:
                unmodifiableMapFrom = readSynchronizedMapFrom(input, schema, obj, idStrategy, z, iSynchronizedMap.newInstance(), false);
                break;
            case 6:
                unmodifiableMapFrom = readSynchronizedMapFrom(input, schema, obj, idStrategy, z, iSynchronizedSortedMap.newInstance(), true);
                break;
            case 7:
                unmodifiableMapFrom = readCheckedMapFrom(input, schema, obj, idStrategy, z, iCheckedMap.newInstance(), false);
                break;
            case 8:
                unmodifiableMapFrom = readCheckedMapFrom(input, schema, obj, idStrategy, z, iCheckedSortedMap.newInstance(), true);
                break;
            default:
                throw new ProtostuffException("Corrupt input.");
        }
        if (input.readFieldNumber(schema) == 0) {
            return unmodifiableMapFrom;
        }
        throw new ProtostuffException("Corrupt input.");
    }

    public static void transferObject(Pipe.Schema<Object> schema, Pipe pipe, Input input, Output output, IdStrategy idStrategy, int i) throws IOException {
        if (i == 23) {
            idStrategy.transferEnumId(input, output, i);
            if (output instanceof StatefulOutput) {
                ((StatefulOutput) output).updateLast(idStrategy.MAP_PIPE_SCHEMA, schema);
            }
            Pipe.transferDirect(idStrategy.MAP_PIPE_SCHEMA, pipe, input, output);
            return;
        }
        if (i == 26) {
            idStrategy.transferMapId(input, output, i);
            if (output instanceof StatefulOutput) {
                ((StatefulOutput) output).updateLast(idStrategy.MAP_PIPE_SCHEMA, schema);
            }
            Pipe.transferDirect(idStrategy.MAP_PIPE_SCHEMA, pipe, input, output);
            return;
        }
        switch (i) {
            case 1:
                output.writeUInt32(i, input.readUInt32(), false);
                break;
            case 2:
                if (input.readUInt32() != 0) {
                    throw new ProtostuffException("Corrupt input.");
                }
                output.writeUInt32(i, 0, false);
                transferSingletonMap(schema, pipe, input, output, idStrategy);
                return;
            case 3:
                output.writeObject(i, pipe, idStrategy.POLYMORPHIC_MAP_PIPE_SCHEMA, false);
                break;
            case 4:
                output.writeObject(i, pipe, idStrategy.POLYMORPHIC_MAP_PIPE_SCHEMA, false);
                break;
            case 5:
                output.writeObject(i, pipe, idStrategy.POLYMORPHIC_MAP_PIPE_SCHEMA, false);
                break;
            case 6:
                output.writeObject(i, pipe, idStrategy.POLYMORPHIC_MAP_PIPE_SCHEMA, false);
                break;
            case 7:
                output.writeObject(i, pipe, idStrategy.POLYMORPHIC_MAP_PIPE_SCHEMA, false);
                if (1 != input.readFieldNumber(schema.wrappedSchema)) {
                    throw new ProtostuffException("Corrupt input.");
                }
                output.writeObject(1, pipe, idStrategy.CLASS_PIPE_SCHEMA, false);
                if (2 != input.readFieldNumber(schema.wrappedSchema)) {
                    throw new ProtostuffException("Corrupt input.");
                }
                output.writeObject(2, pipe, idStrategy.CLASS_PIPE_SCHEMA, false);
                break;
                break;
            case 8:
                output.writeObject(i, pipe, idStrategy.POLYMORPHIC_MAP_PIPE_SCHEMA, false);
                if (1 != input.readFieldNumber(schema.wrappedSchema)) {
                    throw new ProtostuffException("Corrupt input.");
                }
                output.writeObject(1, pipe, idStrategy.CLASS_PIPE_SCHEMA, false);
                if (2 != input.readFieldNumber(schema.wrappedSchema)) {
                    throw new ProtostuffException("Corrupt input.");
                }
                output.writeObject(2, pipe, idStrategy.CLASS_PIPE_SCHEMA, false);
                break;
                break;
            default:
                throw new ProtostuffException("Corrupt input.");
        }
        if (input.readFieldNumber(schema.wrappedSchema) != 0) {
            throw new ProtostuffException("Corrupt input.");
        }
    }
}
