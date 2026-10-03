package io.protostuff.runtime;

import com.heytap.databaseengine.model.UserInfo;
import com.heytap.log.formatter.LogFieldKey;
import com.oplus.aiunit.vision.b2n;
import com.oplus.aiunit.vision.c8l;
import io.protostuff.GraphInput;
import io.protostuff.Input;
import io.protostuff.MapSchema;
import io.protostuff.Message;
import io.protostuff.Output;
import io.protostuff.Pipe;
import io.protostuff.ProtostuffException;
import io.protostuff.Schema;
import io.protostuff.StatefulOutput;
import java.io.IOException;
import java.lang.reflect.Array;
import java.lang.reflect.Modifier;
import java.util.Collection;
import java.util.Collections;
import java.util.EnumMap;
import java.util.EnumSet;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes10.dex */
public abstract class ObjectSchema extends PolymorphicSchema {
    static final int ID_ARRAY_DIMENSION = 2;
    static final int ID_ARRAY_LEN = 3;
    static final int ID_ENUM_VALUE = 1;
    protected final Pipe.Schema<Object> pipeSchema;

    public static final class ArrayWrapper implements Collection<Object> {
        final Object[] array;
        int offset = 0;

        public ArrayWrapper(Object obj) {
            this.array = (Object[]) obj;
        }

        @Override // java.util.Collection
        public boolean add(Object obj) {
            Object[] objArr = this.array;
            int i = this.offset;
            this.offset = i + 1;
            objArr[i] = obj;
            return true;
        }

        @Override // java.util.Collection
        public boolean addAll(Collection<? extends Object> collection) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Collection
        public void clear() {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Collection
        public boolean contains(Object obj) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Collection
        public boolean containsAll(Collection<?> collection) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Collection
        public boolean isEmpty() {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Collection, java.lang.Iterable
        public Iterator<Object> iterator() {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Collection
        public boolean remove(Object obj) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Collection
        public boolean removeAll(Collection<?> collection) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Collection
        public boolean retainAll(Collection<?> collection) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Collection
        public int size() {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Collection
        public Object[] toArray() {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Collection
        public <T> T[] toArray(T[] tArr) {
            throw new UnsupportedOperationException();
        }
    }

    public ObjectSchema(IdStrategy idStrategy) {
        super(idStrategy);
        this.pipeSchema = new Pipe.Schema<Object>(this) { // from class: io.protostuff.runtime.ObjectSchema.1
            @Override // io.protostuff.Pipe.Schema
            public void transfer(Pipe pipe, Input input, Output output) throws IOException {
                ObjectSchema.transferObject(this, pipe, input, output, ObjectSchema.this.strategy);
            }
        };
    }

    public static Class<?> getArrayClass(Input input, Schema<?> schema, Class<?> cls) throws IOException {
        if (input.readFieldNumber(schema) != 2) {
            throw new ProtostuffException("Corrupt input.");
        }
        int uInt32 = input.readUInt32();
        if (uInt32 == 1) {
            return Array.newInstance(cls, 0).getClass();
        }
        int[] iArr = new int[uInt32];
        iArr[0] = 0;
        return Array.newInstance(cls, iArr).getClass();
    }

    private static boolean isComponentPojo(Class<?> cls) {
        return Message.class.isAssignableFrom(cls) || !(Throwable.class.isAssignableFrom(cls) || Map.class.isAssignableFrom(cls) || Collection.class.isAssignableFrom(cls));
    }

    public static String name(int i) {
        if (i == 52) {
            return "Z";
        }
        if (i == 127) {
            return "_";
        }
        switch (i) {
            case 1:
                return "a";
            case 2:
                return "b";
            case 3:
                return "c";
            case 4:
                return "d";
            case 5:
                return MapSchema.FIELD_NAME_ENTRY;
            case 6:
                return "f";
            case 7:
                return b2n.f;
            case 8:
                return b2n.g;
            case 9:
                return "i";
            case 10:
                return "j";
            case 11:
                return MapSchema.FIELD_NAME_KEY;
            case 12:
                return LogFieldKey.LEVEL_KEY;
            case 13:
                return LogFieldKey.MESSAGE_KEY;
            case 14:
                return "n";
            case 15:
                return "o";
            case 16:
                return LogFieldKey.PROCESS_NAME_KEY;
            case 17:
                return "q";
            case 18:
                return "r";
            case 19:
                return "s";
            case 20:
                return "t";
            case 21:
                return "u";
            case 22:
                return "v";
            case 23:
                return "w";
            case 24:
                return "x";
            case 25:
                return "y";
            case 26:
                return "z";
            default:
                switch (i) {
                    case 28:
                        return c8l.KEY_B;
                    case 29:
                        return "C";
                    case 30:
                        return "D";
                    default:
                        switch (i) {
                            case 32:
                                return UserInfo.SEX_FEMALE;
                            case 33:
                                return "G";
                            case 34:
                                return "H";
                            case 35:
                                return "I";
                            default:
                                return null;
                        }
                }
        }
    }

    public static ArrayWrapper newArrayWrapper(Input input, Schema<?> schema, boolean z, IdStrategy idStrategy) throws IOException {
        Class<?> clsResolveArrayComponentTypeFrom = idStrategy.resolveArrayComponentTypeFrom(input, z);
        if (input.readFieldNumber(schema) != 3) {
            throw new ProtostuffException("Corrupt input.");
        }
        int uInt32 = input.readUInt32();
        if (input.readFieldNumber(schema) != 2) {
            throw new ProtostuffException("Corrupt input.");
        }
        int uInt33 = input.readUInt32();
        if (uInt33 == 1) {
            return new ArrayWrapper(Array.newInstance(clsResolveArrayComponentTypeFrom, uInt32));
        }
        int[] iArr = new int[uInt33];
        iArr[0] = uInt32;
        return new ArrayWrapper(Array.newInstance(clsResolveArrayComponentTypeFrom, iArr));
    }

    public static int number(String str) {
        if (str.length() != 1) {
            return 0;
        }
        char cCharAt = str.charAt(0);
        if (cCharAt == 'Z') {
            return 52;
        }
        if (cCharAt == '_') {
            return 127;
        }
        switch (cCharAt) {
            case 'B':
                return 28;
            case 'C':
                return 29;
            case 'D':
                return 30;
            default:
                switch (cCharAt) {
                    case 'F':
                        return 32;
                    case 'G':
                        return 33;
                    case 'H':
                        return 34;
                    case 'I':
                        return 35;
                    default:
                        switch (cCharAt) {
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
                            case 'i':
                                return 9;
                            case 'j':
                                return 10;
                            case 'k':
                                return 11;
                            case 'l':
                                return 12;
                            case 'm':
                                return 13;
                            case 'n':
                                return 14;
                            case 'o':
                                return 15;
                            case 'p':
                                return 16;
                            case 'q':
                                return 17;
                            case 'r':
                                return 18;
                            case 's':
                                return 19;
                            case 't':
                                return 20;
                            case 'u':
                                return 21;
                            case 'v':
                                return 22;
                            case 'w':
                                return 23;
                            case 'x':
                                return 24;
                            case 'y':
                                return 25;
                            case 'z':
                                return 26;
                            default:
                                return 0;
                        }
                }
        }
    }

    public static Object readObjectFrom(Input input, Schema<?> schema, Object obj, IdStrategy idStrategy) throws IOException {
        Object from;
        int fieldNumber = input.readFieldNumber(schema);
        if (fieldNumber == 52) {
            return PolymorphicThrowableSchema.readObjectFrom(input, schema, obj, idStrategy, fieldNumber);
        }
        if (fieldNumber == 127) {
            Schema schema2 = idStrategy.resolvePojoFrom(input, fieldNumber).getSchema();
            Object objNewMessage = schema2.newMessage();
            if (input instanceof GraphInput) {
                ((GraphInput) input).updateLast(objNewMessage, obj);
            }
            schema2.mergeFrom(input, objNewMessage);
            return objNewMessage;
        }
        switch (fieldNumber) {
            case 1:
                from = RuntimeFieldFactory.BOOL.readFrom(input);
                break;
            case 2:
                from = RuntimeFieldFactory.BYTE.readFrom(input);
                break;
            case 3:
                from = RuntimeFieldFactory.CHAR.readFrom(input);
                break;
            case 4:
                from = RuntimeFieldFactory.SHORT.readFrom(input);
                break;
            case 5:
                from = RuntimeFieldFactory.INT32.readFrom(input);
                break;
            case 6:
                from = RuntimeFieldFactory.INT64.readFrom(input);
                break;
            case 7:
                from = RuntimeFieldFactory.FLOAT.readFrom(input);
                break;
            case 8:
                from = RuntimeFieldFactory.DOUBLE.readFrom(input);
                break;
            case 9:
                from = RuntimeFieldFactory.STRING.readFrom(input);
                break;
            case 10:
                from = RuntimeFieldFactory.BYTES.readFrom(input);
                break;
            case 11:
                from = RuntimeFieldFactory.BYTE_ARRAY.readFrom(input);
                break;
            case 12:
                from = RuntimeFieldFactory.BIGDECIMAL.readFrom(input);
                break;
            case 13:
                from = RuntimeFieldFactory.BIGINTEGER.readFrom(input);
                break;
            case 14:
                from = RuntimeFieldFactory.DATE.readFrom(input);
                break;
            case 15:
                ArrayWrapper arrayWrapperNewArrayWrapper = newArrayWrapper(input, schema, false, idStrategy);
                if (input instanceof GraphInput) {
                    ((GraphInput) input).updateLast(arrayWrapperNewArrayWrapper.array, obj);
                }
                idStrategy.COLLECTION_SCHEMA.mergeFrom(input, arrayWrapperNewArrayWrapper);
                return arrayWrapperNewArrayWrapper.array;
            case 16:
                if (input.readUInt32() != 0) {
                    throw new ProtostuffException("Corrupt input.");
                }
                from = new Object();
                break;
                break;
            case 17:
                ArrayWrapper arrayWrapperNewArrayWrapper2 = newArrayWrapper(input, schema, true, idStrategy);
                if (input instanceof GraphInput) {
                    ((GraphInput) input).updateLast(arrayWrapperNewArrayWrapper2.array, obj);
                }
                idStrategy.COLLECTION_SCHEMA.mergeFrom(input, arrayWrapperNewArrayWrapper2);
                return arrayWrapperNewArrayWrapper2.array;
            case 18:
                from = idStrategy.resolveClassFrom(input, false, false);
                break;
            case 19:
                from = idStrategy.resolveClassFrom(input, true, false);
                break;
            case 20:
                from = getArrayClass(input, schema, idStrategy.resolveClassFrom(input, false, true));
                break;
            case 21:
                from = getArrayClass(input, schema, idStrategy.resolveClassFrom(input, true, true));
                break;
            case 22:
                Collection<Object> collectionNewEnumSet = idStrategy.resolveEnumFrom(input).newEnumSet();
                if (input instanceof GraphInput) {
                    ((GraphInput) input).updateLast(collectionNewEnumSet, obj);
                }
                idStrategy.COLLECTION_SCHEMA.mergeFrom(input, collectionNewEnumSet);
                return collectionNewEnumSet;
            case 23:
                Map<Object, Object> mapNewEnumMap = idStrategy.resolveEnumFrom(input).newEnumMap();
                if (input instanceof GraphInput) {
                    ((GraphInput) input).updateLast(mapNewEnumMap, obj);
                }
                idStrategy.MAP_SCHEMA.mergeFrom(input, mapNewEnumMap);
                return mapNewEnumMap;
            case 24:
                EnumIO<?> enumIOResolveEnumFrom = idStrategy.resolveEnumFrom(input);
                if (input.readFieldNumber(schema) != 1) {
                    throw new ProtostuffException("Corrupt input.");
                }
                from = enumIOResolveEnumFrom.readFrom(input);
                break;
                break;
            case 25:
                Collection<Object> collectionNewMessage = idStrategy.resolveCollectionFrom(input).newMessage();
                if (input instanceof GraphInput) {
                    ((GraphInput) input).updateLast(collectionNewMessage, obj);
                }
                idStrategy.COLLECTION_SCHEMA.mergeFrom(input, collectionNewMessage);
                return collectionNewMessage;
            case 26:
                Map<Object, Object> mapNewMessage = idStrategy.resolveMapFrom(input).newMessage();
                if (input instanceof GraphInput) {
                    ((GraphInput) input).updateLast(mapNewMessage, obj);
                }
                idStrategy.MAP_SCHEMA.mergeFrom(input, mapNewMessage);
                return mapNewMessage;
            default:
                switch (fieldNumber) {
                    case 28:
                        if (input.readUInt32() != 0) {
                            throw new ProtostuffException("Corrupt input.");
                        }
                        Object objectFrom = PolymorphicCollectionSchema.readObjectFrom(input, idStrategy.POLYMORPHIC_COLLECTION_SCHEMA, obj, idStrategy);
                        if (input instanceof GraphInput) {
                            ((GraphInput) input).updateLast(objectFrom, obj);
                        }
                        return objectFrom;
                    case 29:
                        if (input.readUInt32() != 0) {
                            throw new ProtostuffException("Corrupt input.");
                        }
                        Object objectFrom2 = PolymorphicMapSchema.readObjectFrom(input, idStrategy.POLYMORPHIC_MAP_SCHEMA, obj, idStrategy);
                        if (input instanceof GraphInput) {
                            ((GraphInput) input).updateLast(objectFrom2, obj);
                        }
                        return objectFrom2;
                    case 30:
                        HasDelegate hasDelegateResolveDelegateFrom = idStrategy.resolveDelegateFrom(input);
                        if (1 != input.readFieldNumber(schema)) {
                            throw new ProtostuffException("Corrupt input.");
                        }
                        from = hasDelegateResolveDelegateFrom.delegate.readFrom(input);
                        break;
                        break;
                    default:
                        switch (fieldNumber) {
                            case 32:
                                return idStrategy.resolveDelegateFrom(input).genericElementSchema.readFrom(input, obj);
                            case 33:
                                int uInt32 = input.readUInt32();
                                return ArraySchemas.getSchema(ArraySchemas.toInlineId(uInt32), ArraySchemas.isPrimitive(uInt32), idStrategy).readFrom(input, obj);
                            case 34:
                                return idStrategy.resolveEnumFrom(input).genericElementSchema.readFrom(input, obj);
                            case 35:
                                return idStrategy.resolvePojoFrom(input, fieldNumber).genericElementSchema.readFrom(input, obj);
                            default:
                                throw new ProtostuffException("Corrupt input.  Unknown field number: " + fieldNumber);
                        }
                }
                break;
        }
        if (input instanceof GraphInput) {
            ((GraphInput) input).updateLast(from, obj);
        }
        if (input.readFieldNumber(schema) == 0) {
            return from;
        }
        throw new ProtostuffException("Corrupt input.");
    }

    public static void transferArray(Pipe pipe, Input input, Output output, int i, Pipe.Schema<?> schema, boolean z, IdStrategy idStrategy) throws IOException {
        idStrategy.transferArrayId(input, output, i, z);
        if (input.readFieldNumber(schema.wrappedSchema) != 3) {
            throw new ProtostuffException("Corrupt input.");
        }
        output.writeUInt32(3, input.readUInt32(), false);
        if (input.readFieldNumber(schema.wrappedSchema) != 2) {
            throw new ProtostuffException("Corrupt input.");
        }
        output.writeUInt32(2, input.readUInt32(), false);
        if (output instanceof StatefulOutput) {
            ((StatefulOutput) output).updateLast(idStrategy.ARRAY_PIPE_SCHEMA, schema);
        }
        Pipe.transferDirect(idStrategy.ARRAY_PIPE_SCHEMA, pipe, input, output);
    }

    public static void transferClass(Pipe pipe, Input input, Output output, int i, Pipe.Schema<?> schema, boolean z, boolean z2, IdStrategy idStrategy) throws IOException {
        idStrategy.transferClassId(input, output, i, z, z2);
        if (z2) {
            if (input.readFieldNumber(schema.wrappedSchema) != 2) {
                throw new ProtostuffException("Corrupt input.");
            }
            output.writeUInt32(2, input.readUInt32(), false);
        }
    }

    public static void transferObject(Pipe.Schema<Object> schema, Pipe pipe, Input input, Output output, IdStrategy idStrategy) throws IOException {
        int fieldNumber = input.readFieldNumber(schema.wrappedSchema);
        if (fieldNumber == 52) {
            PolymorphicThrowableSchema.transferObject(schema, pipe, input, output, idStrategy, fieldNumber);
            return;
        }
        if (fieldNumber == 127) {
            Pipe.Schema pipeSchema = idStrategy.transferPojoId(input, output, fieldNumber).getPipeSchema();
            if (output instanceof StatefulOutput) {
                ((StatefulOutput) output).updateLast(pipeSchema, schema);
            }
            Pipe.transferDirect(pipeSchema, pipe, input, output);
            return;
        }
        switch (fieldNumber) {
            case 1:
                RuntimeFieldFactory.BOOL.transfer(pipe, input, output, fieldNumber, false);
                break;
            case 2:
                RuntimeFieldFactory.BYTE.transfer(pipe, input, output, fieldNumber, false);
                break;
            case 3:
                RuntimeFieldFactory.CHAR.transfer(pipe, input, output, fieldNumber, false);
                break;
            case 4:
                RuntimeFieldFactory.SHORT.transfer(pipe, input, output, fieldNumber, false);
                break;
            case 5:
                RuntimeFieldFactory.INT32.transfer(pipe, input, output, fieldNumber, false);
                break;
            case 6:
                RuntimeFieldFactory.INT64.transfer(pipe, input, output, fieldNumber, false);
                break;
            case 7:
                RuntimeFieldFactory.FLOAT.transfer(pipe, input, output, fieldNumber, false);
                break;
            case 8:
                RuntimeFieldFactory.DOUBLE.transfer(pipe, input, output, fieldNumber, false);
                break;
            case 9:
                RuntimeFieldFactory.STRING.transfer(pipe, input, output, fieldNumber, false);
                break;
            case 10:
                RuntimeFieldFactory.BYTES.transfer(pipe, input, output, fieldNumber, false);
                break;
            case 11:
                RuntimeFieldFactory.BYTE_ARRAY.transfer(pipe, input, output, fieldNumber, false);
                break;
            case 12:
                RuntimeFieldFactory.BIGDECIMAL.transfer(pipe, input, output, fieldNumber, false);
                break;
            case 13:
                RuntimeFieldFactory.BIGINTEGER.transfer(pipe, input, output, fieldNumber, false);
                break;
            case 14:
                RuntimeFieldFactory.DATE.transfer(pipe, input, output, fieldNumber, false);
                break;
            case 15:
                transferArray(pipe, input, output, fieldNumber, schema, false, idStrategy);
                return;
            case 16:
                output.writeUInt32(fieldNumber, input.readUInt32(), false);
                break;
            case 17:
                transferArray(pipe, input, output, fieldNumber, schema, true, idStrategy);
                return;
            case 18:
                transferClass(pipe, input, output, fieldNumber, schema, false, false, idStrategy);
                break;
            case 19:
                transferClass(pipe, input, output, fieldNumber, schema, true, false, idStrategy);
                break;
            case 20:
                transferClass(pipe, input, output, fieldNumber, schema, false, true, idStrategy);
                break;
            case 21:
                transferClass(pipe, input, output, fieldNumber, schema, true, true, idStrategy);
                break;
            case 22:
                idStrategy.transferEnumId(input, output, fieldNumber);
                if (output instanceof StatefulOutput) {
                    ((StatefulOutput) output).updateLast(idStrategy.COLLECTION_PIPE_SCHEMA, schema);
                }
                Pipe.transferDirect(idStrategy.COLLECTION_PIPE_SCHEMA, pipe, input, output);
                return;
            case 23:
                idStrategy.transferEnumId(input, output, fieldNumber);
                if (output instanceof StatefulOutput) {
                    ((StatefulOutput) output).updateLast(idStrategy.MAP_PIPE_SCHEMA, schema);
                }
                Pipe.transferDirect(idStrategy.MAP_PIPE_SCHEMA, pipe, input, output);
                return;
            case 24:
                idStrategy.transferEnumId(input, output, fieldNumber);
                if (input.readFieldNumber(schema.wrappedSchema) != 1) {
                    throw new ProtostuffException("Corrupt input.");
                }
                EnumIO.transfer(pipe, input, output, 1, false, idStrategy);
                break;
                break;
            case 25:
                idStrategy.transferCollectionId(input, output, fieldNumber);
                if (output instanceof StatefulOutput) {
                    ((StatefulOutput) output).updateLast(idStrategy.COLLECTION_PIPE_SCHEMA, schema);
                }
                Pipe.transferDirect(idStrategy.COLLECTION_PIPE_SCHEMA, pipe, input, output);
                return;
            case 26:
                idStrategy.transferMapId(input, output, fieldNumber);
                if (output instanceof StatefulOutput) {
                    ((StatefulOutput) output).updateLast(idStrategy.MAP_PIPE_SCHEMA, schema);
                }
                Pipe.transferDirect(idStrategy.MAP_PIPE_SCHEMA, pipe, input, output);
                return;
            default:
                switch (fieldNumber) {
                    case 28:
                        if (input.readUInt32() != 0) {
                            throw new ProtostuffException("Corrupt input.");
                        }
                        output.writeUInt32(fieldNumber, 0, false);
                        if (output instanceof StatefulOutput) {
                            ((StatefulOutput) output).updateLast(idStrategy.POLYMORPHIC_COLLECTION_PIPE_SCHEMA, schema);
                        }
                        Pipe.transferDirect(idStrategy.POLYMORPHIC_COLLECTION_PIPE_SCHEMA, pipe, input, output);
                        return;
                    case 29:
                        if (input.readUInt32() != 0) {
                            throw new ProtostuffException("Corrupt input.");
                        }
                        output.writeUInt32(fieldNumber, 0, false);
                        if (output instanceof StatefulOutput) {
                            ((StatefulOutput) output).updateLast(idStrategy.POLYMORPHIC_MAP_PIPE_SCHEMA, schema);
                        }
                        Pipe.transferDirect(idStrategy.POLYMORPHIC_MAP_PIPE_SCHEMA, pipe, input, output);
                        return;
                    case 30:
                        HasDelegate hasDelegateTransferDelegateId = idStrategy.transferDelegateId(input, output, fieldNumber);
                        if (1 != input.readFieldNumber(schema.wrappedSchema)) {
                            throw new ProtostuffException("Corrupt input.");
                        }
                        hasDelegateTransferDelegateId.delegate.transfer(pipe, input, output, 1, false);
                        break;
                        break;
                    default:
                        switch (fieldNumber) {
                            case 32:
                                HasDelegate hasDelegateTransferDelegateId2 = idStrategy.transferDelegateId(input, output, fieldNumber);
                                if (output instanceof StatefulOutput) {
                                    ((StatefulOutput) output).updateLast(hasDelegateTransferDelegateId2.genericElementSchema.getPipeSchema(), schema);
                                }
                                Pipe.transferDirect(hasDelegateTransferDelegateId2.genericElementSchema.getPipeSchema(), pipe, input, output);
                                return;
                            case 33:
                                int uInt32 = input.readUInt32();
                                ArraySchemas.Base schema2 = ArraySchemas.getSchema(ArraySchemas.toInlineId(uInt32), ArraySchemas.isPrimitive(uInt32), idStrategy);
                                output.writeUInt32(fieldNumber, uInt32, false);
                                if (output instanceof StatefulOutput) {
                                    ((StatefulOutput) output).updateLast(schema2.getPipeSchema(), schema);
                                }
                                Pipe.transferDirect(schema2.getPipeSchema(), pipe, input, output);
                                return;
                            case 34:
                                EnumIO<?> enumIOResolveEnumFrom = idStrategy.resolveEnumFrom(input);
                                idStrategy.writeEnumIdTo(output, fieldNumber, enumIOResolveEnumFrom.enumClass);
                                if (output instanceof StatefulOutput) {
                                    ((StatefulOutput) output).updateLast(enumIOResolveEnumFrom.genericElementSchema.getPipeSchema(), schema);
                                }
                                Pipe.transferDirect(enumIOResolveEnumFrom.genericElementSchema.getPipeSchema(), pipe, input, output);
                                return;
                            case 35:
                                HasSchema hasSchemaTransferPojoId = idStrategy.transferPojoId(input, output, fieldNumber);
                                if (output instanceof StatefulOutput) {
                                    ((StatefulOutput) output).updateLast(hasSchemaTransferPojoId.genericElementSchema.getPipeSchema(), schema);
                                }
                                Pipe.transferDirect(hasSchemaTransferPojoId.genericElementSchema.getPipeSchema(), pipe, input, output);
                                return;
                            default:
                                throw new ProtostuffException("Corrupt input.  Unknown field number: " + fieldNumber);
                        }
                }
                break;
        }
        if (input.readFieldNumber(schema.wrappedSchema) != 0) {
            throw new ProtostuffException("Corrupt input.");
        }
    }

    private static void writeArrayTo(Output output, Object obj, Schema<?> schema, IdStrategy idStrategy, Class<Object> cls) throws IOException {
        Class<?> componentType = cls.getComponentType();
        HasDelegate hasDelegateTryWriteDelegateIdTo = idStrategy.tryWriteDelegateIdTo(output, 32, componentType);
        if (hasDelegateTryWriteDelegateIdTo != null) {
            if (output instanceof StatefulOutput) {
                ((StatefulOutput) output).updateLast(hasDelegateTryWriteDelegateIdTo.genericElementSchema, schema);
            }
            hasDelegateTryWriteDelegateIdTo.genericElementSchema.writeTo(output, obj);
            return;
        }
        RuntimeFieldFactory inline = RuntimeFieldFactory.getInline(componentType);
        if (inline != null) {
            boolean zIsPrimitive = componentType.isPrimitive();
            ArraySchemas.Base schema2 = ArraySchemas.getSchema(inline.id, zIsPrimitive, idStrategy);
            output.writeUInt32(33, ArraySchemas.toArrayId(inline.id, zIsPrimitive), false);
            if (output instanceof StatefulOutput) {
                ((StatefulOutput) output).updateLast(schema2, schema);
            }
            schema2.writeTo(output, obj);
            return;
        }
        if (componentType.isArray()) {
            Class<?> componentType2 = componentType.getComponentType();
            int i = 2;
            while (componentType2.isArray()) {
                i++;
                componentType2 = componentType2.getComponentType();
            }
            writeComponentTo(output, obj, schema, idStrategy, componentType2, i);
            return;
        }
        if (!componentType.isEnum()) {
            Class<? super Object> superclass = componentType.getSuperclass();
            if (superclass == null || !superclass.isEnum()) {
                if (Object.class == componentType || Class.class == componentType) {
                    writeComponentTo(output, obj, schema, idStrategy, componentType, 1);
                    return;
                }
                HasSchema hasSchemaTryWritePojoIdTo = idStrategy.tryWritePojoIdTo(output, 35, componentType, false);
                if (hasSchemaTryWritePojoIdTo != null) {
                    if (output instanceof StatefulOutput) {
                        ((StatefulOutput) output).updateLast(hasSchemaTryWritePojoIdTo.genericElementSchema, schema);
                    }
                    hasSchemaTryWritePojoIdTo.genericElementSchema.writeTo(output, obj);
                    return;
                } else {
                    if (componentType.isInterface() || Modifier.isAbstract(componentType.getModifiers()) || !isComponentPojo(componentType)) {
                        writeComponentTo(output, obj, schema, idStrategy, componentType, 1);
                        return;
                    }
                    HasSchema hasSchemaWritePojoIdTo = idStrategy.writePojoIdTo(output, 35, componentType);
                    if (output instanceof StatefulOutput) {
                        ((StatefulOutput) output).updateLast(hasSchemaWritePojoIdTo.genericElementSchema, schema);
                    }
                    hasSchemaWritePojoIdTo.genericElementSchema.writeTo(output, obj);
                    return;
                }
            }
            componentType = superclass;
        }
        EnumIO<? extends Enum<?>> enumIO = idStrategy.getEnumIO(componentType);
        idStrategy.writeEnumIdTo(output, 34, componentType);
        if (output instanceof StatefulOutput) {
            ((StatefulOutput) output).updateLast(enumIO.genericElementSchema, schema);
        }
        enumIO.genericElementSchema.writeTo(output, obj);
    }

    private static void writeComponentTo(Output output, Object obj, Schema<?> schema, IdStrategy idStrategy, Class<?> cls, int i) throws IOException {
        idStrategy.writeArrayIdTo(output, cls);
        output.writeUInt32(3, ((Object[]) obj).length, false);
        output.writeUInt32(2, i, false);
        if (output instanceof StatefulOutput) {
            ((StatefulOutput) output).updateLast(idStrategy.ARRAY_SCHEMA, schema);
        }
        idStrategy.ARRAY_SCHEMA.writeTo(output, obj);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    public static void writeObjectTo(Output output, Object obj, Schema<?> schema, IdStrategy idStrategy) throws IOException {
        Class<?> cls = obj.getClass();
        HasDelegate hasDelegateTryWriteDelegateIdTo = idStrategy.tryWriteDelegateIdTo(output, 30, cls);
        if (hasDelegateTryWriteDelegateIdTo != null) {
            hasDelegateTryWriteDelegateIdTo.delegate.writeTo(output, 1, (T) obj, false);
            return;
        }
        RuntimeFieldFactory inline = RuntimeFieldFactory.getInline(cls);
        if (inline != null) {
            inline.writeTo(output, inline.id, obj, false);
            return;
        }
        if (cls.isArray()) {
            writeArrayTo(output, obj, schema, idStrategy, cls);
            return;
        }
        if (!cls.isEnum()) {
            Class<? super Object> superclass = cls.getSuperclass();
            if (superclass == null || !superclass.isEnum()) {
                if (Object.class == cls) {
                    output.writeUInt32(16, 0, false);
                    return;
                }
                if (Class.class == obj.getClass()) {
                    Class<?> cls2 = (Class) obj;
                    if (!cls2.isArray()) {
                        idStrategy.writeClassIdTo(output, cls2, false);
                        return;
                    }
                    Class<?> componentType = cls2.getComponentType();
                    int i = 1;
                    while (componentType.isArray()) {
                        i++;
                        componentType = componentType.getComponentType();
                    }
                    idStrategy.writeClassIdTo(output, componentType, true);
                    output.writeUInt32(2, i, false);
                    return;
                }
                if (Message.class.isAssignableFrom(cls)) {
                    Schema<?> schemaWriteMessageIdTo = idStrategy.writeMessageIdTo(output, 127, (Message) obj);
                    if (output instanceof StatefulOutput) {
                        ((StatefulOutput) output).updateLast(schemaWriteMessageIdTo, schema);
                    }
                    schemaWriteMessageIdTo.writeTo(output, obj);
                    return;
                }
                HasSchema hasSchemaTryWritePojoIdTo = idStrategy.tryWritePojoIdTo(output, 127, cls, false);
                if (hasSchemaTryWritePojoIdTo != null) {
                    Schema<?> schema2 = hasSchemaTryWritePojoIdTo.getSchema();
                    if (output instanceof StatefulOutput) {
                        ((StatefulOutput) output).updateLast(schema2, schema);
                    }
                    schema2.writeTo(output, obj);
                    return;
                }
                if (Throwable.class.isAssignableFrom(cls)) {
                    PolymorphicThrowableSchema.writeObjectTo(output, obj, schema, idStrategy);
                    return;
                }
                if (Map.class.isAssignableFrom(cls)) {
                    if (Collections.class == cls.getDeclaringClass()) {
                        output.writeUInt32(29, 0, false);
                        if (output instanceof StatefulOutput) {
                            ((StatefulOutput) output).updateLast(idStrategy.POLYMORPHIC_MAP_SCHEMA, schema);
                        }
                        PolymorphicMapSchema.writeNonPublicMapTo(output, obj, idStrategy.POLYMORPHIC_MAP_SCHEMA, idStrategy);
                        return;
                    }
                    if (EnumMap.class.isAssignableFrom(cls)) {
                        idStrategy.writeEnumIdTo(output, 23, EnumIO.getKeyTypeFromEnumMap(obj));
                    } else {
                        idStrategy.writeMapIdTo(output, 26, cls);
                    }
                    if (output instanceof StatefulOutput) {
                        ((StatefulOutput) output).updateLast(idStrategy.MAP_SCHEMA, schema);
                    }
                    idStrategy.MAP_SCHEMA.writeTo(output, (Map) obj);
                    return;
                }
                if (!Collection.class.isAssignableFrom(cls)) {
                    Schema<?> schema3 = idStrategy.writePojoIdTo(output, 127, cls).getSchema();
                    if (output instanceof StatefulOutput) {
                        ((StatefulOutput) output).updateLast(schema3, schema);
                    }
                    schema3.writeTo(output, obj);
                    return;
                }
                if (Collections.class == cls.getDeclaringClass()) {
                    output.writeUInt32(28, 0, false);
                    if (output instanceof StatefulOutput) {
                        ((StatefulOutput) output).updateLast(idStrategy.POLYMORPHIC_COLLECTION_SCHEMA, schema);
                    }
                    PolymorphicCollectionSchema.writeNonPublicCollectionTo(output, obj, idStrategy.POLYMORPHIC_COLLECTION_SCHEMA, idStrategy);
                    return;
                }
                if (EnumSet.class.isAssignableFrom(cls)) {
                    idStrategy.writeEnumIdTo(output, 22, EnumIO.getElementTypeFromEnumSet(obj));
                } else {
                    idStrategy.writeCollectionIdTo(output, 25, cls);
                }
                if (output instanceof StatefulOutput) {
                    ((StatefulOutput) output).updateLast(idStrategy.COLLECTION_SCHEMA, schema);
                }
                idStrategy.COLLECTION_SCHEMA.writeTo(output, (Collection) obj);
                return;
            }
            cls = superclass;
        }
        EnumIO<? extends Enum<?>> enumIO = idStrategy.getEnumIO(cls);
        idStrategy.writeEnumIdTo(output, 24, cls);
        enumIO.writeTo(output, 1, false, (Enum) obj);
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
        return Object.class.getName();
    }

    @Override // io.protostuff.Schema
    public String messageName() {
        return Object.class.getSimpleName();
    }

    @Override // io.protostuff.Schema
    public void writeTo(Output output, Object obj) throws IOException {
        writeObjectTo(output, obj, this, this.strategy);
    }
}
