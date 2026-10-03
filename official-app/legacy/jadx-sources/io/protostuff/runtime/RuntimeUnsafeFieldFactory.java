package io.protostuff.runtime;

import io.protostuff.ByteString;
import io.protostuff.GraphInput;
import io.protostuff.Input;
import io.protostuff.Morph;
import io.protostuff.Output;
import io.protostuff.Pipe;
import io.protostuff.Schema;
import io.protostuff.Tag;
import io.protostuff.WireFormat;
import java.io.IOException;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Date;
import sun.misc.Unsafe;

/* JADX INFO: loaded from: classes10.dex */
public final class RuntimeUnsafeFieldFactory {
    static final Unsafe us = initUnsafe();
    public static final RuntimeFieldFactory<Character> CHAR = new RuntimeFieldFactory<Character>(3) { // from class: io.protostuff.runtime.RuntimeUnsafeFieldFactory.1
        @Override // io.protostuff.runtime.RuntimeFieldFactory
        public <T> Field<T> create(int i, String str, java.lang.reflect.Field field, IdStrategy idStrategy) {
            final boolean zIsPrimitive = field.getType().isPrimitive();
            final long jObjectFieldOffset = RuntimeUnsafeFieldFactory.us.objectFieldOffset(field);
            return new Field<T>(WireFormat.FieldType.UINT32, i, str, (Tag) field.getAnnotation(Tag.class)) { // from class: io.protostuff.runtime.RuntimeUnsafeFieldFactory.1.1
                @Override // io.protostuff.runtime.Field
                public void mergeFrom(Input input, T t) throws IOException {
                    if (zIsPrimitive) {
                        RuntimeUnsafeFieldFactory.us.putChar(t, jObjectFieldOffset, (char) input.readUInt32());
                    } else {
                        RuntimeUnsafeFieldFactory.us.putObject(t, jObjectFieldOffset, Character.valueOf((char) input.readUInt32()));
                    }
                }

                @Override // io.protostuff.runtime.Field
                public void transfer(Pipe pipe, Input input, Output output, boolean z) throws IOException {
                    output.writeUInt32(this.number, input.readUInt32(), z);
                }

                @Override // io.protostuff.runtime.Field
                public void writeTo(Output output, T t) throws IOException {
                    if (zIsPrimitive) {
                        output.writeUInt32(this.number, RuntimeUnsafeFieldFactory.us.getChar(t, jObjectFieldOffset), false);
                        return;
                    }
                    Character ch = (Character) RuntimeUnsafeFieldFactory.us.getObject(t, jObjectFieldOffset);
                    if (ch != null) {
                        output.writeUInt32(this.number, ch.charValue(), false);
                    }
                }
            };
        }

        @Override // io.protostuff.runtime.Delegate
        public WireFormat.FieldType getFieldType() {
            return WireFormat.FieldType.UINT32;
        }

        @Override // io.protostuff.runtime.Delegate
        public void transfer(Pipe pipe, Input input, Output output, int i, boolean z) throws IOException {
            output.writeUInt32(i, input.readUInt32(), z);
        }

        @Override // io.protostuff.runtime.Delegate
        public Class<?> typeClass() {
            return Character.class;
        }

        @Override // io.protostuff.runtime.Delegate
        public Character readFrom(Input input) throws IOException {
            return Character.valueOf((char) input.readUInt32());
        }

        @Override // io.protostuff.runtime.Delegate
        public void writeTo(Output output, int i, Character ch, boolean z) throws IOException {
            output.writeUInt32(i, ch.charValue(), z);
        }
    };
    public static final RuntimeFieldFactory<Short> SHORT = new RuntimeFieldFactory<Short>(4) { // from class: io.protostuff.runtime.RuntimeUnsafeFieldFactory.2
        @Override // io.protostuff.runtime.RuntimeFieldFactory
        public <T> Field<T> create(int i, String str, java.lang.reflect.Field field, IdStrategy idStrategy) {
            final boolean zIsPrimitive = field.getType().isPrimitive();
            final long jObjectFieldOffset = RuntimeUnsafeFieldFactory.us.objectFieldOffset(field);
            return new Field<T>(WireFormat.FieldType.UINT32, i, str, (Tag) field.getAnnotation(Tag.class)) { // from class: io.protostuff.runtime.RuntimeUnsafeFieldFactory.2.1
                @Override // io.protostuff.runtime.Field
                public void mergeFrom(Input input, T t) throws IOException {
                    if (zIsPrimitive) {
                        RuntimeUnsafeFieldFactory.us.putShort(t, jObjectFieldOffset, (short) input.readUInt32());
                    } else {
                        RuntimeUnsafeFieldFactory.us.putObject(t, jObjectFieldOffset, Short.valueOf((short) input.readUInt32()));
                    }
                }

                @Override // io.protostuff.runtime.Field
                public void transfer(Pipe pipe, Input input, Output output, boolean z) throws IOException {
                    output.writeUInt32(this.number, input.readUInt32(), z);
                }

                @Override // io.protostuff.runtime.Field
                public void writeTo(Output output, T t) throws IOException {
                    if (zIsPrimitive) {
                        output.writeUInt32(this.number, RuntimeUnsafeFieldFactory.us.getShort(t, jObjectFieldOffset), false);
                        return;
                    }
                    Short sh = (Short) RuntimeUnsafeFieldFactory.us.getObject(t, jObjectFieldOffset);
                    if (sh != null) {
                        output.writeUInt32(this.number, sh.shortValue(), false);
                    }
                }
            };
        }

        @Override // io.protostuff.runtime.Delegate
        public WireFormat.FieldType getFieldType() {
            return WireFormat.FieldType.UINT32;
        }

        @Override // io.protostuff.runtime.Delegate
        public void transfer(Pipe pipe, Input input, Output output, int i, boolean z) throws IOException {
            output.writeUInt32(i, input.readUInt32(), z);
        }

        @Override // io.protostuff.runtime.Delegate
        public Class<?> typeClass() {
            return Short.class;
        }

        @Override // io.protostuff.runtime.Delegate
        public Short readFrom(Input input) throws IOException {
            return Short.valueOf((short) input.readUInt32());
        }

        @Override // io.protostuff.runtime.Delegate
        public void writeTo(Output output, int i, Short sh, boolean z) throws IOException {
            output.writeUInt32(i, sh.shortValue(), z);
        }
    };
    public static final RuntimeFieldFactory<Byte> BYTE = new RuntimeFieldFactory<Byte>(2) { // from class: io.protostuff.runtime.RuntimeUnsafeFieldFactory.3
        @Override // io.protostuff.runtime.RuntimeFieldFactory
        public <T> Field<T> create(int i, String str, java.lang.reflect.Field field, IdStrategy idStrategy) {
            final boolean zIsPrimitive = field.getType().isPrimitive();
            final long jObjectFieldOffset = RuntimeUnsafeFieldFactory.us.objectFieldOffset(field);
            return new Field<T>(WireFormat.FieldType.UINT32, i, str, (Tag) field.getAnnotation(Tag.class)) { // from class: io.protostuff.runtime.RuntimeUnsafeFieldFactory.3.1
                @Override // io.protostuff.runtime.Field
                public void mergeFrom(Input input, T t) throws IOException {
                    if (zIsPrimitive) {
                        RuntimeUnsafeFieldFactory.us.putByte(t, jObjectFieldOffset, (byte) input.readUInt32());
                    } else {
                        RuntimeUnsafeFieldFactory.us.putObject(t, jObjectFieldOffset, Byte.valueOf((byte) input.readUInt32()));
                    }
                }

                @Override // io.protostuff.runtime.Field
                public void transfer(Pipe pipe, Input input, Output output, boolean z) throws IOException {
                    output.writeUInt32(this.number, input.readUInt32(), z);
                }

                @Override // io.protostuff.runtime.Field
                public void writeTo(Output output, T t) throws IOException {
                    if (zIsPrimitive) {
                        output.writeUInt32(this.number, RuntimeUnsafeFieldFactory.us.getByte(t, jObjectFieldOffset), false);
                        return;
                    }
                    Byte b = (Byte) RuntimeUnsafeFieldFactory.us.getObject(t, jObjectFieldOffset);
                    if (b != null) {
                        output.writeUInt32(this.number, b.byteValue(), false);
                    }
                }
            };
        }

        @Override // io.protostuff.runtime.Delegate
        public WireFormat.FieldType getFieldType() {
            return WireFormat.FieldType.UINT32;
        }

        @Override // io.protostuff.runtime.Delegate
        public void transfer(Pipe pipe, Input input, Output output, int i, boolean z) throws IOException {
            output.writeUInt32(i, input.readUInt32(), z);
        }

        @Override // io.protostuff.runtime.Delegate
        public Class<?> typeClass() {
            return Byte.class;
        }

        @Override // io.protostuff.runtime.Delegate
        public Byte readFrom(Input input) throws IOException {
            return Byte.valueOf((byte) input.readUInt32());
        }

        @Override // io.protostuff.runtime.Delegate
        public void writeTo(Output output, int i, Byte b, boolean z) throws IOException {
            output.writeUInt32(i, b.byteValue(), z);
        }
    };
    public static final RuntimeFieldFactory<Integer> INT32 = new RuntimeFieldFactory<Integer>(5) { // from class: io.protostuff.runtime.RuntimeUnsafeFieldFactory.4
        @Override // io.protostuff.runtime.RuntimeFieldFactory
        public <T> Field<T> create(int i, String str, java.lang.reflect.Field field, IdStrategy idStrategy) {
            final boolean zIsPrimitive = field.getType().isPrimitive();
            final long jObjectFieldOffset = RuntimeUnsafeFieldFactory.us.objectFieldOffset(field);
            return new Field<T>(WireFormat.FieldType.INT32, i, str, (Tag) field.getAnnotation(Tag.class)) { // from class: io.protostuff.runtime.RuntimeUnsafeFieldFactory.4.1
                @Override // io.protostuff.runtime.Field
                public void mergeFrom(Input input, T t) throws IOException {
                    if (zIsPrimitive) {
                        RuntimeUnsafeFieldFactory.us.putInt(t, jObjectFieldOffset, input.readInt32());
                    } else {
                        RuntimeUnsafeFieldFactory.us.putObject(t, jObjectFieldOffset, Integer.valueOf(input.readInt32()));
                    }
                }

                @Override // io.protostuff.runtime.Field
                public void transfer(Pipe pipe, Input input, Output output, boolean z) throws IOException {
                    output.writeInt32(this.number, input.readInt32(), z);
                }

                @Override // io.protostuff.runtime.Field
                public void writeTo(Output output, T t) throws IOException {
                    if (zIsPrimitive) {
                        output.writeInt32(this.number, RuntimeUnsafeFieldFactory.us.getInt(t, jObjectFieldOffset), false);
                        return;
                    }
                    Integer num = (Integer) RuntimeUnsafeFieldFactory.us.getObject(t, jObjectFieldOffset);
                    if (num != null) {
                        output.writeInt32(this.number, num.intValue(), false);
                    }
                }
            };
        }

        @Override // io.protostuff.runtime.Delegate
        public WireFormat.FieldType getFieldType() {
            return WireFormat.FieldType.INT32;
        }

        @Override // io.protostuff.runtime.Delegate
        public void transfer(Pipe pipe, Input input, Output output, int i, boolean z) throws IOException {
            output.writeInt32(i, input.readInt32(), z);
        }

        @Override // io.protostuff.runtime.Delegate
        public Class<?> typeClass() {
            return Integer.class;
        }

        @Override // io.protostuff.runtime.Delegate
        public Integer readFrom(Input input) throws IOException {
            return Integer.valueOf(input.readInt32());
        }

        @Override // io.protostuff.runtime.Delegate
        public void writeTo(Output output, int i, Integer num, boolean z) throws IOException {
            output.writeInt32(i, num.intValue(), z);
        }
    };
    public static final RuntimeFieldFactory<Long> INT64 = new RuntimeFieldFactory<Long>(6) { // from class: io.protostuff.runtime.RuntimeUnsafeFieldFactory.5
        @Override // io.protostuff.runtime.RuntimeFieldFactory
        public <T> Field<T> create(int i, String str, java.lang.reflect.Field field, IdStrategy idStrategy) {
            final boolean zIsPrimitive = field.getType().isPrimitive();
            final long jObjectFieldOffset = RuntimeUnsafeFieldFactory.us.objectFieldOffset(field);
            return new Field<T>(WireFormat.FieldType.INT64, i, str, (Tag) field.getAnnotation(Tag.class)) { // from class: io.protostuff.runtime.RuntimeUnsafeFieldFactory.5.1
                @Override // io.protostuff.runtime.Field
                public void mergeFrom(Input input, T t) throws IOException {
                    if (zIsPrimitive) {
                        RuntimeUnsafeFieldFactory.us.putLong(t, jObjectFieldOffset, input.readInt64());
                    } else {
                        RuntimeUnsafeFieldFactory.us.putObject(t, jObjectFieldOffset, Long.valueOf(input.readInt64()));
                    }
                }

                @Override // io.protostuff.runtime.Field
                public void transfer(Pipe pipe, Input input, Output output, boolean z) throws IOException {
                    output.writeInt64(this.number, input.readInt64(), z);
                }

                @Override // io.protostuff.runtime.Field
                public void writeTo(Output output, T t) throws IOException {
                    if (zIsPrimitive) {
                        output.writeInt64(this.number, RuntimeUnsafeFieldFactory.us.getLong(t, jObjectFieldOffset), false);
                        return;
                    }
                    Long l2 = (Long) RuntimeUnsafeFieldFactory.us.getObject(t, jObjectFieldOffset);
                    if (l2 != null) {
                        output.writeInt64(this.number, l2.longValue(), false);
                    }
                }
            };
        }

        @Override // io.protostuff.runtime.Delegate
        public WireFormat.FieldType getFieldType() {
            return WireFormat.FieldType.INT64;
        }

        @Override // io.protostuff.runtime.Delegate
        public void transfer(Pipe pipe, Input input, Output output, int i, boolean z) throws IOException {
            output.writeInt64(i, input.readInt64(), z);
        }

        @Override // io.protostuff.runtime.Delegate
        public Class<?> typeClass() {
            return Long.class;
        }

        @Override // io.protostuff.runtime.Delegate
        public Long readFrom(Input input) throws IOException {
            return Long.valueOf(input.readInt64());
        }

        @Override // io.protostuff.runtime.Delegate
        public void writeTo(Output output, int i, Long l2, boolean z) throws IOException {
            output.writeInt64(i, l2.longValue(), z);
        }
    };
    public static final RuntimeFieldFactory<Float> FLOAT = new RuntimeFieldFactory<Float>(7) { // from class: io.protostuff.runtime.RuntimeUnsafeFieldFactory.6
        @Override // io.protostuff.runtime.RuntimeFieldFactory
        public <T> Field<T> create(int i, String str, java.lang.reflect.Field field, IdStrategy idStrategy) {
            final boolean zIsPrimitive = field.getType().isPrimitive();
            final long jObjectFieldOffset = RuntimeUnsafeFieldFactory.us.objectFieldOffset(field);
            return new Field<T>(WireFormat.FieldType.FLOAT, i, str, (Tag) field.getAnnotation(Tag.class)) { // from class: io.protostuff.runtime.RuntimeUnsafeFieldFactory.6.1
                @Override // io.protostuff.runtime.Field
                public void mergeFrom(Input input, T t) throws IOException {
                    if (zIsPrimitive) {
                        RuntimeUnsafeFieldFactory.us.putFloat(t, jObjectFieldOffset, input.readFloat());
                    } else {
                        RuntimeUnsafeFieldFactory.us.putObject(t, jObjectFieldOffset, new Float(input.readFloat()));
                    }
                }

                @Override // io.protostuff.runtime.Field
                public void transfer(Pipe pipe, Input input, Output output, boolean z) throws IOException {
                    output.writeFloat(this.number, input.readFloat(), z);
                }

                @Override // io.protostuff.runtime.Field
                public void writeTo(Output output, T t) throws IOException {
                    if (zIsPrimitive) {
                        output.writeFloat(this.number, RuntimeUnsafeFieldFactory.us.getFloat(t, jObjectFieldOffset), false);
                        return;
                    }
                    Float f = (Float) RuntimeUnsafeFieldFactory.us.getObject(t, jObjectFieldOffset);
                    if (f != null) {
                        output.writeFloat(this.number, f.floatValue(), false);
                    }
                }
            };
        }

        @Override // io.protostuff.runtime.Delegate
        public WireFormat.FieldType getFieldType() {
            return WireFormat.FieldType.FLOAT;
        }

        @Override // io.protostuff.runtime.Delegate
        public void transfer(Pipe pipe, Input input, Output output, int i, boolean z) throws IOException {
            output.writeFloat(i, input.readFloat(), z);
        }

        @Override // io.protostuff.runtime.Delegate
        public Class<?> typeClass() {
            return Float.class;
        }

        @Override // io.protostuff.runtime.Delegate
        public Float readFrom(Input input) throws IOException {
            return new Float(input.readFloat());
        }

        @Override // io.protostuff.runtime.Delegate
        public void writeTo(Output output, int i, Float f, boolean z) throws IOException {
            output.writeFloat(i, f.floatValue(), z);
        }
    };
    public static final RuntimeFieldFactory<Double> DOUBLE = new RuntimeFieldFactory<Double>(8) { // from class: io.protostuff.runtime.RuntimeUnsafeFieldFactory.7
        @Override // io.protostuff.runtime.RuntimeFieldFactory
        public <T> Field<T> create(int i, String str, java.lang.reflect.Field field, IdStrategy idStrategy) {
            final boolean zIsPrimitive = field.getType().isPrimitive();
            final long jObjectFieldOffset = RuntimeUnsafeFieldFactory.us.objectFieldOffset(field);
            return new Field<T>(WireFormat.FieldType.DOUBLE, i, str, (Tag) field.getAnnotation(Tag.class)) { // from class: io.protostuff.runtime.RuntimeUnsafeFieldFactory.7.1
                @Override // io.protostuff.runtime.Field
                public void mergeFrom(Input input, T t) throws IOException {
                    if (zIsPrimitive) {
                        RuntimeUnsafeFieldFactory.us.putDouble(t, jObjectFieldOffset, input.readDouble());
                    } else {
                        RuntimeUnsafeFieldFactory.us.putObject(t, jObjectFieldOffset, new Double(input.readDouble()));
                    }
                }

                @Override // io.protostuff.runtime.Field
                public void transfer(Pipe pipe, Input input, Output output, boolean z) throws IOException {
                    output.writeDouble(this.number, input.readDouble(), z);
                }

                @Override // io.protostuff.runtime.Field
                public void writeTo(Output output, T t) throws IOException {
                    if (zIsPrimitive) {
                        output.writeDouble(this.number, RuntimeUnsafeFieldFactory.us.getDouble(t, jObjectFieldOffset), false);
                        return;
                    }
                    Double d = (Double) RuntimeUnsafeFieldFactory.us.getObject(t, jObjectFieldOffset);
                    if (d != null) {
                        output.writeDouble(this.number, d.doubleValue(), false);
                    }
                }
            };
        }

        @Override // io.protostuff.runtime.Delegate
        public WireFormat.FieldType getFieldType() {
            return WireFormat.FieldType.DOUBLE;
        }

        @Override // io.protostuff.runtime.Delegate
        public void transfer(Pipe pipe, Input input, Output output, int i, boolean z) throws IOException {
            output.writeDouble(i, input.readDouble(), z);
        }

        @Override // io.protostuff.runtime.Delegate
        public Class<?> typeClass() {
            return Double.class;
        }

        @Override // io.protostuff.runtime.Delegate
        public Double readFrom(Input input) throws IOException {
            return new Double(input.readDouble());
        }

        @Override // io.protostuff.runtime.Delegate
        public void writeTo(Output output, int i, Double d, boolean z) throws IOException {
            output.writeDouble(i, d.doubleValue(), z);
        }
    };
    public static final RuntimeFieldFactory<Boolean> BOOL = new RuntimeFieldFactory<Boolean>(1) { // from class: io.protostuff.runtime.RuntimeUnsafeFieldFactory.8
        @Override // io.protostuff.runtime.RuntimeFieldFactory
        public <T> Field<T> create(int i, String str, java.lang.reflect.Field field, IdStrategy idStrategy) {
            final boolean zIsPrimitive = field.getType().isPrimitive();
            final long jObjectFieldOffset = RuntimeUnsafeFieldFactory.us.objectFieldOffset(field);
            return new Field<T>(WireFormat.FieldType.BOOL, i, str, (Tag) field.getAnnotation(Tag.class)) { // from class: io.protostuff.runtime.RuntimeUnsafeFieldFactory.8.1
                @Override // io.protostuff.runtime.Field
                public void mergeFrom(Input input, T t) throws IOException {
                    if (zIsPrimitive) {
                        RuntimeUnsafeFieldFactory.us.putBoolean(t, jObjectFieldOffset, input.readBool());
                    } else {
                        RuntimeUnsafeFieldFactory.us.putObject(t, jObjectFieldOffset, input.readBool() ? Boolean.TRUE : Boolean.FALSE);
                    }
                }

                @Override // io.protostuff.runtime.Field
                public void transfer(Pipe pipe, Input input, Output output, boolean z) throws IOException {
                    output.writeBool(this.number, input.readBool(), z);
                }

                @Override // io.protostuff.runtime.Field
                public void writeTo(Output output, T t) throws IOException {
                    if (zIsPrimitive) {
                        output.writeBool(this.number, RuntimeUnsafeFieldFactory.us.getBoolean(t, jObjectFieldOffset), false);
                        return;
                    }
                    Boolean bool = (Boolean) RuntimeUnsafeFieldFactory.us.getObject(t, jObjectFieldOffset);
                    if (bool != null) {
                        output.writeBool(this.number, bool.booleanValue(), false);
                    }
                }
            };
        }

        @Override // io.protostuff.runtime.Delegate
        public WireFormat.FieldType getFieldType() {
            return WireFormat.FieldType.BOOL;
        }

        @Override // io.protostuff.runtime.Delegate
        public void transfer(Pipe pipe, Input input, Output output, int i, boolean z) throws IOException {
            output.writeBool(i, input.readBool(), z);
        }

        @Override // io.protostuff.runtime.Delegate
        public Class<?> typeClass() {
            return Boolean.class;
        }

        @Override // io.protostuff.runtime.Delegate
        public Boolean readFrom(Input input) throws IOException {
            return input.readBool() ? Boolean.TRUE : Boolean.FALSE;
        }

        @Override // io.protostuff.runtime.Delegate
        public void writeTo(Output output, int i, Boolean bool, boolean z) throws IOException {
            output.writeBool(i, bool.booleanValue(), z);
        }
    };
    public static final RuntimeFieldFactory<String> STRING = new RuntimeFieldFactory<String>(9) { // from class: io.protostuff.runtime.RuntimeUnsafeFieldFactory.9
        @Override // io.protostuff.runtime.RuntimeFieldFactory
        public <T> Field<T> create(int i, String str, java.lang.reflect.Field field, IdStrategy idStrategy) {
            final long jObjectFieldOffset = RuntimeUnsafeFieldFactory.us.objectFieldOffset(field);
            return new Field<T>(WireFormat.FieldType.STRING, i, str, (Tag) field.getAnnotation(Tag.class)) { // from class: io.protostuff.runtime.RuntimeUnsafeFieldFactory.9.1
                @Override // io.protostuff.runtime.Field
                public void mergeFrom(Input input, T t) throws IOException {
                    RuntimeUnsafeFieldFactory.us.putObject(t, jObjectFieldOffset, input.readString());
                }

                @Override // io.protostuff.runtime.Field
                public void transfer(Pipe pipe, Input input, Output output, boolean z) throws IOException {
                    input.transferByteRangeTo(output, true, this.number, z);
                }

                @Override // io.protostuff.runtime.Field
                public void writeTo(Output output, T t) throws IOException {
                    CharSequence charSequence = (CharSequence) RuntimeUnsafeFieldFactory.us.getObject(t, jObjectFieldOffset);
                    if (charSequence != null) {
                        output.writeString(this.number, charSequence, false);
                    }
                }
            };
        }

        @Override // io.protostuff.runtime.Delegate
        public WireFormat.FieldType getFieldType() {
            return WireFormat.FieldType.STRING;
        }

        @Override // io.protostuff.runtime.Delegate
        public void transfer(Pipe pipe, Input input, Output output, int i, boolean z) throws IOException {
            input.transferByteRangeTo(output, true, i, z);
        }

        @Override // io.protostuff.runtime.Delegate
        public Class<?> typeClass() {
            return String.class;
        }

        @Override // io.protostuff.runtime.Delegate
        public String readFrom(Input input) throws IOException {
            return input.readString();
        }

        @Override // io.protostuff.runtime.Delegate
        public void writeTo(Output output, int i, String str, boolean z) throws IOException {
            output.writeString(i, str, z);
        }
    };
    public static final RuntimeFieldFactory<ByteString> BYTES = new RuntimeFieldFactory<ByteString>(10) { // from class: io.protostuff.runtime.RuntimeUnsafeFieldFactory.10
        @Override // io.protostuff.runtime.RuntimeFieldFactory
        public <T> Field<T> create(int i, String str, java.lang.reflect.Field field, IdStrategy idStrategy) {
            final long jObjectFieldOffset = RuntimeUnsafeFieldFactory.us.objectFieldOffset(field);
            return new Field<T>(WireFormat.FieldType.BYTES, i, str, (Tag) field.getAnnotation(Tag.class)) { // from class: io.protostuff.runtime.RuntimeUnsafeFieldFactory.10.1
                @Override // io.protostuff.runtime.Field
                public void mergeFrom(Input input, T t) throws IOException {
                    RuntimeUnsafeFieldFactory.us.putObject(t, jObjectFieldOffset, input.readBytes());
                }

                @Override // io.protostuff.runtime.Field
                public void transfer(Pipe pipe, Input input, Output output, boolean z) throws IOException {
                    input.transferByteRangeTo(output, false, this.number, z);
                }

                @Override // io.protostuff.runtime.Field
                public void writeTo(Output output, T t) throws IOException {
                    ByteString byteString = (ByteString) RuntimeUnsafeFieldFactory.us.getObject(t, jObjectFieldOffset);
                    if (byteString != null) {
                        output.writeBytes(this.number, byteString, false);
                    }
                }
            };
        }

        @Override // io.protostuff.runtime.Delegate
        public WireFormat.FieldType getFieldType() {
            return WireFormat.FieldType.BYTES;
        }

        @Override // io.protostuff.runtime.Delegate
        public void transfer(Pipe pipe, Input input, Output output, int i, boolean z) throws IOException {
            input.transferByteRangeTo(output, false, i, z);
        }

        @Override // io.protostuff.runtime.Delegate
        public Class<?> typeClass() {
            return ByteString.class;
        }

        @Override // io.protostuff.runtime.Delegate
        public ByteString readFrom(Input input) throws IOException {
            return input.readBytes();
        }

        @Override // io.protostuff.runtime.Delegate
        public void writeTo(Output output, int i, ByteString byteString, boolean z) throws IOException {
            output.writeBytes(i, byteString, z);
        }
    };
    public static final RuntimeFieldFactory<byte[]> BYTE_ARRAY = new RuntimeFieldFactory<byte[]>(11) { // from class: io.protostuff.runtime.RuntimeUnsafeFieldFactory.11
        @Override // io.protostuff.runtime.RuntimeFieldFactory
        public <T> Field<T> create(int i, String str, java.lang.reflect.Field field, IdStrategy idStrategy) {
            final long jObjectFieldOffset = RuntimeUnsafeFieldFactory.us.objectFieldOffset(field);
            return new Field<T>(WireFormat.FieldType.BYTES, i, str, (Tag) field.getAnnotation(Tag.class)) { // from class: io.protostuff.runtime.RuntimeUnsafeFieldFactory.11.1
                @Override // io.protostuff.runtime.Field
                public void mergeFrom(Input input, T t) throws IOException {
                    RuntimeUnsafeFieldFactory.us.putObject(t, jObjectFieldOffset, input.readByteArray());
                }

                @Override // io.protostuff.runtime.Field
                public void transfer(Pipe pipe, Input input, Output output, boolean z) throws IOException {
                    input.transferByteRangeTo(output, false, this.number, z);
                }

                @Override // io.protostuff.runtime.Field
                public void writeTo(Output output, T t) throws IOException {
                    byte[] bArr = (byte[]) RuntimeUnsafeFieldFactory.us.getObject(t, jObjectFieldOffset);
                    if (bArr != null) {
                        output.writeByteArray(this.number, bArr, false);
                    }
                }
            };
        }

        @Override // io.protostuff.runtime.Delegate
        public WireFormat.FieldType getFieldType() {
            return WireFormat.FieldType.BYTES;
        }

        @Override // io.protostuff.runtime.Delegate
        public void transfer(Pipe pipe, Input input, Output output, int i, boolean z) throws IOException {
            input.transferByteRangeTo(output, false, i, z);
        }

        @Override // io.protostuff.runtime.Delegate
        public Class<?> typeClass() {
            return byte[].class;
        }

        @Override // io.protostuff.runtime.Delegate
        public byte[] readFrom(Input input) throws IOException {
            return input.readByteArray();
        }

        @Override // io.protostuff.runtime.Delegate
        public void writeTo(Output output, int i, byte[] bArr, boolean z) throws IOException {
            output.writeByteArray(i, bArr, z);
        }
    };
    public static final RuntimeFieldFactory<Integer> ENUM = new RuntimeFieldFactory<Integer>(24) { // from class: io.protostuff.runtime.RuntimeUnsafeFieldFactory.12
        @Override // io.protostuff.runtime.RuntimeFieldFactory
        public <T> Field<T> create(int i, String str, java.lang.reflect.Field field, final IdStrategy idStrategy) {
            final EnumIO<? extends Enum<?>> enumIO = idStrategy.getEnumIO(field.getType());
            final long jObjectFieldOffset = RuntimeUnsafeFieldFactory.us.objectFieldOffset(field);
            return new Field<T>(WireFormat.FieldType.ENUM, i, str, (Tag) field.getAnnotation(Tag.class)) { // from class: io.protostuff.runtime.RuntimeUnsafeFieldFactory.12.1
                @Override // io.protostuff.runtime.Field
                public void mergeFrom(Input input, T t) throws IOException {
                    RuntimeUnsafeFieldFactory.us.putObject(t, jObjectFieldOffset, enumIO.readFrom(input));
                }

                @Override // io.protostuff.runtime.Field
                public void transfer(Pipe pipe, Input input, Output output, boolean z) throws IOException {
                    EnumIO.transfer(pipe, input, output, this.number, z, idStrategy);
                }

                @Override // io.protostuff.runtime.Field
                public void writeTo(Output output, T t) throws IOException {
                    Enum<?> r5 = (Enum) RuntimeUnsafeFieldFactory.us.getObject(t, jObjectFieldOffset);
                    if (r5 != null) {
                        enumIO.writeTo(output, this.number, this.repeated, r5);
                    }
                }
            };
        }

        @Override // io.protostuff.runtime.Delegate
        public WireFormat.FieldType getFieldType() {
            throw new UnsupportedOperationException();
        }

        @Override // io.protostuff.runtime.Delegate
        public void transfer(Pipe pipe, Input input, Output output, int i, boolean z) throws IOException {
            throw new UnsupportedOperationException();
        }

        @Override // io.protostuff.runtime.Delegate
        public Class<?> typeClass() {
            throw new UnsupportedOperationException();
        }

        @Override // io.protostuff.runtime.Delegate
        public Integer readFrom(Input input) throws IOException {
            throw new UnsupportedOperationException();
        }

        @Override // io.protostuff.runtime.Delegate
        public void writeTo(Output output, int i, Integer num, boolean z) throws IOException {
            throw new UnsupportedOperationException();
        }
    };
    static final RuntimeFieldFactory<Object> POJO = new RuntimeFieldFactory<Object>(127) { // from class: io.protostuff.runtime.RuntimeUnsafeFieldFactory.13
        @Override // io.protostuff.runtime.RuntimeFieldFactory
        public <T> Field<T> create(int i, String str, final java.lang.reflect.Field field, IdStrategy idStrategy) {
            Class<?> type = field.getType();
            final long jObjectFieldOffset = RuntimeUnsafeFieldFactory.us.objectFieldOffset(field);
            return new RuntimeMessageField<T, Object>(type, idStrategy.getSchemaWrapper(type, true), WireFormat.FieldType.MESSAGE, i, str, false, (Tag) field.getAnnotation(Tag.class)) { // from class: io.protostuff.runtime.RuntimeUnsafeFieldFactory.13.1
                @Override // io.protostuff.runtime.Field
                public Field<T> copy(IdStrategy idStrategy2) {
                    return RuntimeFieldFactory.POJO.create(this.number, this.name, field, idStrategy2);
                }

                /* JADX WARN: Multi-variable type inference failed */
                @Override // io.protostuff.runtime.Field
                public void mergeFrom(Input input, T t) throws IOException {
                    Unsafe unsafe = RuntimeUnsafeFieldFactory.us;
                    long j2 = jObjectFieldOffset;
                    unsafe.putObject(t, j2, input.mergeObject(unsafe.getObject(t, j2), getSchema()));
                }

                @Override // io.protostuff.runtime.Field
                public void transfer(Pipe pipe, Input input, Output output, boolean z) throws IOException {
                    output.writeObject(this.number, pipe, getPipeSchema(), z);
                }

                /* JADX WARN: Multi-variable type inference failed */
                @Override // io.protostuff.runtime.Field
                public void writeTo(Output output, T t) throws IOException {
                    Object object = RuntimeUnsafeFieldFactory.us.getObject(t, jObjectFieldOffset);
                    if (object != null) {
                        output.writeObject(this.number, object, getSchema(), false);
                    }
                }
            };
        }

        @Override // io.protostuff.runtime.Delegate
        public WireFormat.FieldType getFieldType() {
            throw new UnsupportedOperationException();
        }

        @Override // io.protostuff.runtime.Delegate
        public Object readFrom(Input input) throws IOException {
            throw new UnsupportedOperationException();
        }

        @Override // io.protostuff.runtime.Delegate
        public void transfer(Pipe pipe, Input input, Output output, int i, boolean z) throws IOException {
            throw new UnsupportedOperationException();
        }

        @Override // io.protostuff.runtime.Delegate
        public Class<?> typeClass() {
            throw new UnsupportedOperationException();
        }

        @Override // io.protostuff.runtime.Delegate
        public void writeTo(Output output, int i, Object obj, boolean z) throws IOException {
            throw new UnsupportedOperationException();
        }
    };
    static final RuntimeFieldFactory<Object> POLYMORPHIC_POJO = new RuntimeFieldFactory<Object>(0) { // from class: io.protostuff.runtime.RuntimeUnsafeFieldFactory.14
        @Override // io.protostuff.runtime.RuntimeFieldFactory
        public <T> Field<T> create(int i, String str, final java.lang.reflect.Field field, IdStrategy idStrategy) {
            if (RuntimeFieldFactory.pojo(field.getType(), (Morph) field.getAnnotation(Morph.class), idStrategy)) {
                return RuntimeFieldFactory.POJO.create(i, str, field, idStrategy);
            }
            final long jObjectFieldOffset = RuntimeUnsafeFieldFactory.us.objectFieldOffset(field);
            return new RuntimeDerivativeField<T>(field.getType(), WireFormat.FieldType.MESSAGE, i, str, false, (Tag) field.getAnnotation(Tag.class), idStrategy) { // from class: io.protostuff.runtime.RuntimeUnsafeFieldFactory.14.1
                @Override // io.protostuff.runtime.Field
                public Field<T> copy(IdStrategy idStrategy2) {
                    return RuntimeFieldFactory.POLYMORPHIC_POJO.create(this.number, this.name, field, idStrategy2);
                }

                @Override // io.protostuff.runtime.RuntimeDerivativeField
                public void doMergeFrom(Input input, Schema<Object> schema, Object obj) throws IOException {
                    Unsafe unsafe = RuntimeUnsafeFieldFactory.us;
                    Object object = unsafe.getObject(obj, jObjectFieldOffset);
                    if (object == null || object.getClass() != schema.typeClass()) {
                        object = schema.newMessage();
                    }
                    if (input instanceof GraphInput) {
                        ((GraphInput) input).updateLast(object, obj);
                    }
                    schema.mergeFrom(input, object);
                    unsafe.putObject(obj, jObjectFieldOffset, object);
                }

                @Override // io.protostuff.runtime.Field
                public void mergeFrom(Input input, T t) throws IOException {
                    Object objMergeObject = input.mergeObject(t, this.schema);
                    if ((input instanceof GraphInput) && ((GraphInput) input).isCurrentMessageReference()) {
                        RuntimeUnsafeFieldFactory.us.putObject(t, jObjectFieldOffset, objMergeObject);
                    }
                }

                @Override // io.protostuff.runtime.Field
                public void transfer(Pipe pipe, Input input, Output output, boolean z) throws IOException {
                    output.writeObject(this.number, pipe, this.schema.pipeSchema, false);
                }

                /* JADX WARN: Multi-variable type inference failed */
                @Override // io.protostuff.runtime.Field
                public void writeTo(Output output, T t) throws IOException {
                    Object object = RuntimeUnsafeFieldFactory.us.getObject(t, jObjectFieldOffset);
                    if (object != null) {
                        output.writeObject(this.number, object, this.schema, false);
                    }
                }
            };
        }

        @Override // io.protostuff.runtime.Delegate
        public WireFormat.FieldType getFieldType() {
            throw new UnsupportedOperationException();
        }

        @Override // io.protostuff.runtime.Delegate
        public Object readFrom(Input input) throws IOException {
            throw new UnsupportedOperationException();
        }

        @Override // io.protostuff.runtime.Delegate
        public void transfer(Pipe pipe, Input input, Output output, int i, boolean z) throws IOException {
            throw new UnsupportedOperationException();
        }

        @Override // io.protostuff.runtime.Delegate
        public Class<?> typeClass() {
            throw new UnsupportedOperationException();
        }

        @Override // io.protostuff.runtime.Delegate
        public void writeTo(Output output, int i, Object obj, boolean z) throws IOException {
            throw new UnsupportedOperationException();
        }
    };
    static final RuntimeFieldFactory<Object> OBJECT = new RuntimeFieldFactory<Object>(16) { // from class: io.protostuff.runtime.RuntimeUnsafeFieldFactory.15
        @Override // io.protostuff.runtime.RuntimeFieldFactory
        public <T> Field<T> create(int i, String str, final java.lang.reflect.Field field, IdStrategy idStrategy) {
            final long jObjectFieldOffset = RuntimeUnsafeFieldFactory.us.objectFieldOffset(field);
            return new RuntimeObjectField<T>(field.getType(), WireFormat.FieldType.MESSAGE, i, str, false, (Tag) field.getAnnotation(Tag.class), PolymorphicSchemaFactories.getFactoryFromField(field, idStrategy), idStrategy) { // from class: io.protostuff.runtime.RuntimeUnsafeFieldFactory.15.1
                @Override // io.protostuff.runtime.Field
                public Field<T> copy(IdStrategy idStrategy2) {
                    return RuntimeFieldFactory.OBJECT.create(this.number, this.name, field, idStrategy2);
                }

                @Override // io.protostuff.runtime.Field
                public void mergeFrom(Input input, T t) throws IOException {
                    Object objMergeObject = input.mergeObject(t, this.schema);
                    if ((input instanceof GraphInput) && ((GraphInput) input).isCurrentMessageReference()) {
                        RuntimeUnsafeFieldFactory.us.putObject(t, jObjectFieldOffset, objMergeObject);
                    }
                }

                @Override // io.protostuff.runtime.PolymorphicSchema.Handler
                public void setValue(Object obj, Object obj2) {
                    RuntimeUnsafeFieldFactory.us.putObject(obj2, jObjectFieldOffset, obj);
                }

                @Override // io.protostuff.runtime.Field
                public void transfer(Pipe pipe, Input input, Output output, boolean z) throws IOException {
                    output.writeObject(this.number, pipe, this.schema.getPipeSchema(), false);
                }

                /* JADX WARN: Multi-variable type inference failed */
                @Override // io.protostuff.runtime.Field
                public void writeTo(Output output, T t) throws IOException {
                    Object object = RuntimeUnsafeFieldFactory.us.getObject(t, jObjectFieldOffset);
                    if (object != null) {
                        output.writeObject(this.number, object, this.schema, false);
                    }
                }
            };
        }

        @Override // io.protostuff.runtime.Delegate
        public WireFormat.FieldType getFieldType() {
            return WireFormat.FieldType.MESSAGE;
        }

        @Override // io.protostuff.runtime.Delegate
        public Object readFrom(Input input) throws IOException {
            throw new UnsupportedOperationException();
        }

        @Override // io.protostuff.runtime.Delegate
        public void transfer(Pipe pipe, Input input, Output output, int i, boolean z) throws IOException {
            throw new UnsupportedOperationException();
        }

        @Override // io.protostuff.runtime.Delegate
        public Class<?> typeClass() {
            return Object.class;
        }

        @Override // io.protostuff.runtime.Delegate
        public void writeTo(Output output, int i, Object obj, boolean z) throws IOException {
            throw new UnsupportedOperationException();
        }
    };
    public static final RuntimeFieldFactory<BigDecimal> BIGDECIMAL = new RuntimeFieldFactory<BigDecimal>(12) { // from class: io.protostuff.runtime.RuntimeUnsafeFieldFactory.16
        @Override // io.protostuff.runtime.RuntimeFieldFactory
        public <T> Field<T> create(int i, String str, java.lang.reflect.Field field, IdStrategy idStrategy) {
            final long jObjectFieldOffset = RuntimeUnsafeFieldFactory.us.objectFieldOffset(field);
            return new Field<T>(WireFormat.FieldType.STRING, i, str, (Tag) field.getAnnotation(Tag.class)) { // from class: io.protostuff.runtime.RuntimeUnsafeFieldFactory.16.1
                @Override // io.protostuff.runtime.Field
                public void mergeFrom(Input input, T t) throws IOException {
                    RuntimeUnsafeFieldFactory.us.putObject(t, jObjectFieldOffset, new BigDecimal(input.readString()));
                }

                @Override // io.protostuff.runtime.Field
                public void transfer(Pipe pipe, Input input, Output output, boolean z) throws IOException {
                    input.transferByteRangeTo(output, true, this.number, z);
                }

                @Override // io.protostuff.runtime.Field
                public void writeTo(Output output, T t) throws IOException {
                    BigDecimal bigDecimal = (BigDecimal) RuntimeUnsafeFieldFactory.us.getObject(t, jObjectFieldOffset);
                    if (bigDecimal != null) {
                        output.writeString(this.number, bigDecimal.toString(), false);
                    }
                }
            };
        }

        @Override // io.protostuff.runtime.Delegate
        public WireFormat.FieldType getFieldType() {
            return WireFormat.FieldType.STRING;
        }

        @Override // io.protostuff.runtime.Delegate
        public void transfer(Pipe pipe, Input input, Output output, int i, boolean z) throws IOException {
            input.transferByteRangeTo(output, true, i, z);
        }

        @Override // io.protostuff.runtime.Delegate
        public Class<?> typeClass() {
            return BigDecimal.class;
        }

        @Override // io.protostuff.runtime.Delegate
        public BigDecimal readFrom(Input input) throws IOException {
            return new BigDecimal(input.readString());
        }

        @Override // io.protostuff.runtime.Delegate
        public void writeTo(Output output, int i, BigDecimal bigDecimal, boolean z) throws IOException {
            output.writeString(i, bigDecimal.toString(), z);
        }
    };
    public static final RuntimeFieldFactory<BigInteger> BIGINTEGER = new RuntimeFieldFactory<BigInteger>(13) { // from class: io.protostuff.runtime.RuntimeUnsafeFieldFactory.17
        @Override // io.protostuff.runtime.RuntimeFieldFactory
        public <T> Field<T> create(int i, String str, java.lang.reflect.Field field, IdStrategy idStrategy) {
            final long jObjectFieldOffset = RuntimeUnsafeFieldFactory.us.objectFieldOffset(field);
            return new Field<T>(WireFormat.FieldType.BYTES, i, str, (Tag) field.getAnnotation(Tag.class)) { // from class: io.protostuff.runtime.RuntimeUnsafeFieldFactory.17.1
                @Override // io.protostuff.runtime.Field
                public void mergeFrom(Input input, T t) throws IOException {
                    RuntimeUnsafeFieldFactory.us.putObject(t, jObjectFieldOffset, new BigInteger(input.readByteArray()));
                }

                @Override // io.protostuff.runtime.Field
                public void transfer(Pipe pipe, Input input, Output output, boolean z) throws IOException {
                    input.transferByteRangeTo(output, false, this.number, z);
                }

                @Override // io.protostuff.runtime.Field
                public void writeTo(Output output, T t) throws IOException {
                    BigInteger bigInteger = (BigInteger) RuntimeUnsafeFieldFactory.us.getObject(t, jObjectFieldOffset);
                    if (bigInteger != null) {
                        output.writeByteArray(this.number, bigInteger.toByteArray(), false);
                    }
                }
            };
        }

        @Override // io.protostuff.runtime.Delegate
        public WireFormat.FieldType getFieldType() {
            return WireFormat.FieldType.BYTES;
        }

        @Override // io.protostuff.runtime.Delegate
        public void transfer(Pipe pipe, Input input, Output output, int i, boolean z) throws IOException {
            input.transferByteRangeTo(output, false, i, z);
        }

        @Override // io.protostuff.runtime.Delegate
        public Class<?> typeClass() {
            return BigInteger.class;
        }

        @Override // io.protostuff.runtime.Delegate
        public BigInteger readFrom(Input input) throws IOException {
            return new BigInteger(input.readByteArray());
        }

        @Override // io.protostuff.runtime.Delegate
        public void writeTo(Output output, int i, BigInteger bigInteger, boolean z) throws IOException {
            output.writeByteArray(i, bigInteger.toByteArray(), z);
        }
    };
    public static final RuntimeFieldFactory<Date> DATE = new RuntimeFieldFactory<Date>(14) { // from class: io.protostuff.runtime.RuntimeUnsafeFieldFactory.18
        @Override // io.protostuff.runtime.RuntimeFieldFactory
        public <T> Field<T> create(int i, String str, java.lang.reflect.Field field, IdStrategy idStrategy) {
            final long jObjectFieldOffset = RuntimeUnsafeFieldFactory.us.objectFieldOffset(field);
            return new Field<T>(WireFormat.FieldType.FIXED64, i, str, (Tag) field.getAnnotation(Tag.class)) { // from class: io.protostuff.runtime.RuntimeUnsafeFieldFactory.18.1
                @Override // io.protostuff.runtime.Field
                public void mergeFrom(Input input, T t) throws IOException {
                    RuntimeUnsafeFieldFactory.us.putObject(t, jObjectFieldOffset, new Date(input.readFixed64()));
                }

                @Override // io.protostuff.runtime.Field
                public void transfer(Pipe pipe, Input input, Output output, boolean z) throws IOException {
                    output.writeFixed64(this.number, input.readFixed64(), z);
                }

                @Override // io.protostuff.runtime.Field
                public void writeTo(Output output, T t) throws IOException {
                    Date date = (Date) RuntimeUnsafeFieldFactory.us.getObject(t, jObjectFieldOffset);
                    if (date != null) {
                        output.writeFixed64(this.number, date.getTime(), false);
                    }
                }
            };
        }

        @Override // io.protostuff.runtime.Delegate
        public WireFormat.FieldType getFieldType() {
            return WireFormat.FieldType.FIXED64;
        }

        @Override // io.protostuff.runtime.Delegate
        public void transfer(Pipe pipe, Input input, Output output, int i, boolean z) throws IOException {
            output.writeFixed64(i, input.readFixed64(), z);
        }

        @Override // io.protostuff.runtime.Delegate
        public Class<?> typeClass() {
            return Date.class;
        }

        @Override // io.protostuff.runtime.Delegate
        public Date readFrom(Input input) throws IOException {
            return new Date(input.readFixed64());
        }

        @Override // io.protostuff.runtime.Delegate
        public void writeTo(Output output, int i, Date date, boolean z) throws IOException {
            output.writeFixed64(i, date.getTime(), z);
        }
    };
    public static final RuntimeFieldFactory<Object> DELEGATE = new RuntimeFieldFactory<Object>(30) { // from class: io.protostuff.runtime.RuntimeUnsafeFieldFactory.19
        /* JADX WARN: Multi-variable type inference failed */
        @Override // io.protostuff.runtime.RuntimeFieldFactory
        public <T> Field<T> create(int i, String str, java.lang.reflect.Field field, IdStrategy idStrategy) {
            final Delegate delegate = idStrategy.getDelegate(field.getType());
            final long jObjectFieldOffset = RuntimeUnsafeFieldFactory.us.objectFieldOffset(field);
            return new Field<T>(WireFormat.FieldType.BYTES, i, str, (Tag) field.getAnnotation(Tag.class)) { // from class: io.protostuff.runtime.RuntimeUnsafeFieldFactory.19.1
                @Override // io.protostuff.runtime.Field
                public void mergeFrom(Input input, T t) throws IOException {
                    RuntimeUnsafeFieldFactory.us.putObject(t, jObjectFieldOffset, delegate.readFrom(input));
                }

                @Override // io.protostuff.runtime.Field
                public void transfer(Pipe pipe, Input input, Output output, boolean z) throws IOException {
                    delegate.transfer(pipe, input, output, this.number, z);
                }

                @Override // io.protostuff.runtime.Field
                public void writeTo(Output output, T t) throws IOException {
                    Object object = RuntimeUnsafeFieldFactory.us.getObject(t, jObjectFieldOffset);
                    if (object != null) {
                        delegate.writeTo(output, this.number, object, false);
                    }
                }
            };
        }

        @Override // io.protostuff.runtime.Delegate
        public WireFormat.FieldType getFieldType() {
            throw new UnsupportedOperationException();
        }

        @Override // io.protostuff.runtime.Delegate
        public Object readFrom(Input input) throws IOException {
            throw new UnsupportedOperationException();
        }

        @Override // io.protostuff.runtime.Delegate
        public void transfer(Pipe pipe, Input input, Output output, int i, boolean z) throws IOException {
            throw new UnsupportedOperationException();
        }

        @Override // io.protostuff.runtime.Delegate
        public Class<?> typeClass() {
            throw new UnsupportedOperationException();
        }

        @Override // io.protostuff.runtime.Delegate
        public void writeTo(Output output, int i, Object obj, boolean z) throws IOException {
            throw new UnsupportedOperationException();
        }
    };

    private RuntimeUnsafeFieldFactory() {
    }

    private static Unsafe initUnsafe() {
        try {
            java.lang.reflect.Field declaredField = Unsafe.class.getDeclaredField("theUnsafe");
            declaredField.setAccessible(true);
            return (Unsafe) declaredField.get(null);
        } catch (Exception unused) {
            return Unsafe.getUnsafe();
        }
    }
}
