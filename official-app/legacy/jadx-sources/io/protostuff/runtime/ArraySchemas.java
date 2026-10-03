package io.protostuff.runtime;

import io.protostuff.ByteString;
import io.protostuff.GraphInput;
import io.protostuff.Input;
import io.protostuff.MapSchema;
import io.protostuff.Output;
import io.protostuff.Pipe;
import io.protostuff.ProtostuffException;
import java.io.IOException;
import java.lang.reflect.Array;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Collection;
import java.util.Date;

/* JADX INFO: loaded from: classes10.dex */
public final class ArraySchemas {
    static final PolymorphicSchema.Handler GENERIC_HANDLER = new PolymorphicSchema.Handler() { // from class: io.protostuff.runtime.ArraySchemas.1
        @Override // io.protostuff.runtime.PolymorphicSchema.Handler
        public void setValue(Object obj, Object obj2) {
            if (MapSchema.MapWrapper.class == obj2.getClass()) {
                ((MapSchema.MapWrapper) obj2).setValue(obj);
            } else {
                ((Collection) obj2).add(obj);
            }
        }
    };
    static final int ID_ARRAY_DATA = 2;
    static final int ID_ARRAY_LEN = 1;
    static final int ID_ARRAY_NULLCOUNT = 3;
    static final String STR_ARRAY_DATA = "b";
    static final String STR_ARRAY_LEN = "a";
    static final String STR_ARRAY_NULLCOUNT = "c";

    public static abstract class Base extends PolymorphicSchema {
        protected final boolean allowNullArrayElement;
        protected final PolymorphicSchema.Handler handler;

        public Base(IdStrategy idStrategy, PolymorphicSchema.Handler handler) {
            super(idStrategy);
            this.handler = handler;
            this.allowNullArrayElement = (idStrategy.flags & 4) != 0;
        }

        @Override // io.protostuff.Schema
        public String getFieldName(int i) {
            return ArraySchemas.name(i);
        }

        @Override // io.protostuff.Schema
        public int getFieldNumber(String str) {
            return ArraySchemas.number(str);
        }

        @Override // io.protostuff.Schema
        public void mergeFrom(Input input, Object obj) throws IOException {
            setValue(readFrom(input, obj), obj);
        }

        @Override // io.protostuff.Schema
        public String messageFullName() {
            return Array.class.getName();
        }

        @Override // io.protostuff.Schema
        public String messageName() {
            return Array.class.getSimpleName();
        }

        public abstract Object readFrom(Input input, Object obj) throws IOException;

        @Override // io.protostuff.runtime.PolymorphicSchema
        public void setValue(Object obj, Object obj2) {
            this.handler.setValue(obj, obj2);
        }
    }

    public static class BigDecimalArray extends Base {
        protected final Pipe.Schema<Object> pipeSchema;

        public BigDecimalArray(IdStrategy idStrategy, PolymorphicSchema.Handler handler) {
            super(idStrategy, handler);
            this.pipeSchema = new Pipe.Schema<Object>(this) { // from class: io.protostuff.runtime.ArraySchemas.BigDecimalArray.1
                @Override // io.protostuff.Pipe.Schema
                public void transfer(Pipe pipe, Input input, Output output) throws IOException {
                    ArraySchemas.transferObject(this, pipe, input, output, BigDecimalArray.this.strategy, RuntimeFieldFactory.BIGDECIMAL);
                }
            };
        }

        @Override // io.protostuff.runtime.PolymorphicSchema
        public Pipe.Schema<Object> getPipeSchema() {
            return this.pipeSchema;
        }

        @Override // io.protostuff.runtime.ArraySchemas.Base
        public Object readFrom(Input input, Object obj) throws IOException {
            if (1 != input.readFieldNumber(this)) {
                throw new ProtostuffException("Corrupt input.");
            }
            int int32 = input.readInt32();
            BigDecimal[] bigDecimalArr = new BigDecimal[int32];
            if (input instanceof GraphInput) {
                ((GraphInput) input).updateLast(bigDecimalArr, obj);
            }
            int uInt32 = 0;
            while (uInt32 < int32) {
                int fieldNumber = input.readFieldNumber(this);
                if (fieldNumber == 2) {
                    bigDecimalArr[uInt32] = new BigDecimal(input.readString());
                    uInt32++;
                } else {
                    if (fieldNumber != 3) {
                        throw new ProtostuffException("Corrupt input.");
                    }
                    uInt32 += input.readUInt32();
                }
            }
            if (input.readFieldNumber(this) == 0) {
                return bigDecimalArr;
            }
            throw new ProtostuffException("Corrupt input.");
        }

        @Override // io.protostuff.Schema
        public void writeTo(Output output, Object obj) throws IOException {
            BigDecimal[] bigDecimalArr = (BigDecimal[]) obj;
            output.writeInt32(1, bigDecimalArr.length, false);
            int i = 0;
            for (BigDecimal bigDecimal : bigDecimalArr) {
                if (bigDecimal != null) {
                    if (i != 0) {
                        output.writeUInt32(3, i, false);
                        i = 0;
                    }
                    output.writeString(2, bigDecimal.toString(), true);
                } else if (this.allowNullArrayElement) {
                    i++;
                }
            }
            if (i != 0) {
                output.writeUInt32(3, i, false);
            }
        }
    }

    public static class BigIntegerArray extends Base {
        protected final Pipe.Schema<Object> pipeSchema;

        public BigIntegerArray(IdStrategy idStrategy, PolymorphicSchema.Handler handler) {
            super(idStrategy, handler);
            this.pipeSchema = new Pipe.Schema<Object>(this) { // from class: io.protostuff.runtime.ArraySchemas.BigIntegerArray.1
                @Override // io.protostuff.Pipe.Schema
                public void transfer(Pipe pipe, Input input, Output output) throws IOException {
                    ArraySchemas.transferObject(this, pipe, input, output, BigIntegerArray.this.strategy, RuntimeFieldFactory.BIGINTEGER);
                }
            };
        }

        @Override // io.protostuff.runtime.PolymorphicSchema
        public Pipe.Schema<Object> getPipeSchema() {
            return this.pipeSchema;
        }

        @Override // io.protostuff.runtime.ArraySchemas.Base
        public Object readFrom(Input input, Object obj) throws IOException {
            if (1 != input.readFieldNumber(this)) {
                throw new ProtostuffException("Corrupt input.");
            }
            int int32 = input.readInt32();
            BigInteger[] bigIntegerArr = new BigInteger[int32];
            if (input instanceof GraphInput) {
                ((GraphInput) input).updateLast(bigIntegerArr, obj);
            }
            int uInt32 = 0;
            while (uInt32 < int32) {
                int fieldNumber = input.readFieldNumber(this);
                if (fieldNumber == 2) {
                    bigIntegerArr[uInt32] = new BigInteger(input.readByteArray());
                    uInt32++;
                } else {
                    if (fieldNumber != 3) {
                        throw new ProtostuffException("Corrupt input.");
                    }
                    uInt32 += input.readUInt32();
                }
            }
            if (input.readFieldNumber(this) == 0) {
                return bigIntegerArr;
            }
            throw new ProtostuffException("Corrupt input.");
        }

        @Override // io.protostuff.Schema
        public void writeTo(Output output, Object obj) throws IOException {
            BigInteger[] bigIntegerArr = (BigInteger[]) obj;
            output.writeInt32(1, bigIntegerArr.length, false);
            int i = 0;
            for (BigInteger bigInteger : bigIntegerArr) {
                if (bigInteger != null) {
                    if (i != 0) {
                        output.writeUInt32(3, i, false);
                        i = 0;
                    }
                    output.writeByteArray(2, bigInteger.toByteArray(), true);
                } else if (this.allowNullArrayElement) {
                    i++;
                }
            }
            if (i != 0) {
                output.writeUInt32(3, i, false);
            }
        }
    }

    public static class ByteArrayArray extends Base {
        protected final Pipe.Schema<Object> pipeSchema;

        public ByteArrayArray(IdStrategy idStrategy, PolymorphicSchema.Handler handler) {
            super(idStrategy, handler);
            this.pipeSchema = new Pipe.Schema<Object>(this) { // from class: io.protostuff.runtime.ArraySchemas.ByteArrayArray.1
                @Override // io.protostuff.Pipe.Schema
                public void transfer(Pipe pipe, Input input, Output output) throws IOException {
                    ArraySchemas.transferObject(this, pipe, input, output, ByteArrayArray.this.strategy, RuntimeFieldFactory.BYTE_ARRAY);
                }
            };
        }

        @Override // io.protostuff.runtime.PolymorphicSchema
        public Pipe.Schema<Object> getPipeSchema() {
            return this.pipeSchema;
        }

        @Override // io.protostuff.runtime.ArraySchemas.Base
        public Object readFrom(Input input, Object obj) throws IOException {
            if (1 != input.readFieldNumber(this)) {
                throw new ProtostuffException("Corrupt input.");
            }
            int int32 = input.readInt32();
            byte[][] bArr = new byte[int32][];
            if (input instanceof GraphInput) {
                ((GraphInput) input).updateLast(bArr, obj);
            }
            int uInt32 = 0;
            while (uInt32 < int32) {
                int fieldNumber = input.readFieldNumber(this);
                if (fieldNumber == 2) {
                    bArr[uInt32] = input.readByteArray();
                    uInt32++;
                } else {
                    if (fieldNumber != 3) {
                        throw new ProtostuffException("Corrupt input.");
                    }
                    uInt32 += input.readUInt32();
                }
            }
            if (input.readFieldNumber(this) == 0) {
                return bArr;
            }
            throw new ProtostuffException("Corrupt input.");
        }

        @Override // io.protostuff.Schema
        public void writeTo(Output output, Object obj) throws IOException {
            byte[][] bArr = (byte[][]) obj;
            output.writeInt32(1, bArr.length, false);
            int i = 0;
            for (byte[] bArr2 : bArr) {
                if (bArr2 != null) {
                    if (i != 0) {
                        output.writeUInt32(3, i, false);
                        i = 0;
                    }
                    output.writeByteArray(2, bArr2, true);
                } else if (this.allowNullArrayElement) {
                    i++;
                }
            }
            if (i != 0) {
                output.writeUInt32(3, i, false);
            }
        }
    }

    public static class ByteStringArray extends Base {
        protected final Pipe.Schema<Object> pipeSchema;

        public ByteStringArray(IdStrategy idStrategy, PolymorphicSchema.Handler handler) {
            super(idStrategy, handler);
            this.pipeSchema = new Pipe.Schema<Object>(this) { // from class: io.protostuff.runtime.ArraySchemas.ByteStringArray.1
                @Override // io.protostuff.Pipe.Schema
                public void transfer(Pipe pipe, Input input, Output output) throws IOException {
                    ArraySchemas.transferObject(this, pipe, input, output, ByteStringArray.this.strategy, RuntimeFieldFactory.BYTES);
                }
            };
        }

        @Override // io.protostuff.runtime.PolymorphicSchema
        public Pipe.Schema<Object> getPipeSchema() {
            return this.pipeSchema;
        }

        @Override // io.protostuff.runtime.ArraySchemas.Base
        public Object readFrom(Input input, Object obj) throws IOException {
            if (1 != input.readFieldNumber(this)) {
                throw new ProtostuffException("Corrupt input.");
            }
            int int32 = input.readInt32();
            ByteString[] byteStringArr = new ByteString[int32];
            if (input instanceof GraphInput) {
                ((GraphInput) input).updateLast(byteStringArr, obj);
            }
            int uInt32 = 0;
            while (uInt32 < int32) {
                int fieldNumber = input.readFieldNumber(this);
                if (fieldNumber == 2) {
                    byteStringArr[uInt32] = input.readBytes();
                    uInt32++;
                } else {
                    if (fieldNumber != 3) {
                        throw new ProtostuffException("Corrupt input.");
                    }
                    uInt32 += input.readUInt32();
                }
            }
            if (input.readFieldNumber(this) == 0) {
                return byteStringArr;
            }
            throw new ProtostuffException("Corrupt input.");
        }

        @Override // io.protostuff.Schema
        public void writeTo(Output output, Object obj) throws IOException {
            ByteString[] byteStringArr = (ByteString[]) obj;
            output.writeInt32(1, byteStringArr.length, false);
            int i = 0;
            for (ByteString byteString : byteStringArr) {
                if (byteString != null) {
                    if (i != 0) {
                        output.writeUInt32(3, i, false);
                        i = 0;
                    }
                    output.writeBytes(2, byteString, true);
                } else if (this.allowNullArrayElement) {
                    i++;
                }
            }
            if (i != 0) {
                output.writeUInt32(3, i, false);
            }
        }
    }

    public static class DateArray extends Base {
        protected final Pipe.Schema<Object> pipeSchema;

        public DateArray(IdStrategy idStrategy, PolymorphicSchema.Handler handler) {
            super(idStrategy, handler);
            this.pipeSchema = new Pipe.Schema<Object>(this) { // from class: io.protostuff.runtime.ArraySchemas.DateArray.1
                @Override // io.protostuff.Pipe.Schema
                public void transfer(Pipe pipe, Input input, Output output) throws IOException {
                    ArraySchemas.transferObject(this, pipe, input, output, DateArray.this.strategy, RuntimeFieldFactory.DATE);
                }
            };
        }

        @Override // io.protostuff.runtime.PolymorphicSchema
        public Pipe.Schema<Object> getPipeSchema() {
            return this.pipeSchema;
        }

        @Override // io.protostuff.runtime.ArraySchemas.Base
        public Object readFrom(Input input, Object obj) throws IOException {
            if (1 != input.readFieldNumber(this)) {
                throw new ProtostuffException("Corrupt input.");
            }
            int int32 = input.readInt32();
            Date[] dateArr = new Date[int32];
            if (input instanceof GraphInput) {
                ((GraphInput) input).updateLast(dateArr, obj);
            }
            int uInt32 = 0;
            while (uInt32 < int32) {
                int fieldNumber = input.readFieldNumber(this);
                if (fieldNumber == 2) {
                    dateArr[uInt32] = new Date(input.readFixed64());
                    uInt32++;
                } else {
                    if (fieldNumber != 3) {
                        throw new ProtostuffException("Corrupt input.");
                    }
                    uInt32 += input.readUInt32();
                }
            }
            if (input.readFieldNumber(this) == 0) {
                return dateArr;
            }
            throw new ProtostuffException("Corrupt input.");
        }

        @Override // io.protostuff.Schema
        public void writeTo(Output output, Object obj) throws IOException {
            Date[] dateArr = (Date[]) obj;
            output.writeInt32(1, dateArr.length, false);
            int i = 0;
            for (Date date : dateArr) {
                if (date != null) {
                    if (i != 0) {
                        output.writeUInt32(3, i, false);
                        i = 0;
                    }
                    output.writeFixed64(2, date.getTime(), true);
                } else if (this.allowNullArrayElement) {
                    i++;
                }
            }
            if (i != 0) {
                output.writeUInt32(3, i, false);
            }
        }
    }

    public static class DelegateArray extends Base {
        final Delegate<Object> delegate;
        protected final Pipe.Schema<Object> pipeSchema;

        public DelegateArray(IdStrategy idStrategy, PolymorphicSchema.Handler handler, Delegate<Object> delegate) {
            super(idStrategy, handler);
            this.pipeSchema = new Pipe.Schema<Object>(this) { // from class: io.protostuff.runtime.ArraySchemas.DelegateArray.1
                @Override // io.protostuff.Pipe.Schema
                public void transfer(Pipe pipe, Input input, Output output) throws IOException {
                    DelegateArray delegateArray = DelegateArray.this;
                    ArraySchemas.transferObject(this, pipe, input, output, delegateArray.strategy, delegateArray.delegate);
                }
            };
            this.delegate = delegate;
        }

        @Override // io.protostuff.runtime.PolymorphicSchema
        public Pipe.Schema<Object> getPipeSchema() {
            return this.pipeSchema;
        }

        @Override // io.protostuff.runtime.ArraySchemas.Base
        public Object readFrom(Input input, Object obj) throws IOException {
            if (1 != input.readFieldNumber(this)) {
                throw new ProtostuffException("Corrupt input.");
            }
            int int32 = input.readInt32();
            Object[] objArr = (Object[]) Array.newInstance(this.delegate.typeClass(), int32);
            if (input instanceof GraphInput) {
                ((GraphInput) input).updateLast(objArr, obj);
            }
            int uInt32 = 0;
            while (uInt32 < int32) {
                int fieldNumber = input.readFieldNumber(this);
                if (fieldNumber == 2) {
                    objArr[uInt32] = this.delegate.readFrom(input);
                    uInt32++;
                } else {
                    if (fieldNumber != 3) {
                        throw new ProtostuffException("Corrupt input.");
                    }
                    uInt32 += input.readUInt32();
                }
            }
            if (input.readFieldNumber(this) == 0) {
                return objArr;
            }
            throw new ProtostuffException("Corrupt input.");
        }

        @Override // io.protostuff.Schema
        public void writeTo(Output output, Object obj) throws IOException {
            Object[] objArr = (Object[]) obj;
            output.writeInt32(1, objArr.length, false);
            int i = 0;
            for (Object obj2 : objArr) {
                if (obj2 != null) {
                    if (i != 0) {
                        output.writeUInt32(3, i, false);
                        i = 0;
                    }
                    this.delegate.writeTo(output, 2, obj2, true);
                } else if (this.allowNullArrayElement) {
                    i++;
                }
            }
            if (i != 0) {
                output.writeUInt32(3, i, false);
            }
        }
    }

    public static class EnumArray extends Base {
        final EnumIO<?> eio;
        protected final Pipe.Schema<Object> pipeSchema;

        public EnumArray(IdStrategy idStrategy, PolymorphicSchema.Handler handler, EnumIO<?> enumIO) {
            super(idStrategy, handler);
            this.pipeSchema = new Pipe.Schema<Object>(this) { // from class: io.protostuff.runtime.ArraySchemas.EnumArray.1
                @Override // io.protostuff.Pipe.Schema
                public void transfer(Pipe pipe, Input input, Output output) throws IOException {
                    if (1 != input.readFieldNumber(EnumArray.this.pipeSchema.wrappedSchema)) {
                        throw new ProtostuffException("Corrupt input.");
                    }
                    int int32 = input.readInt32();
                    output.writeInt32(1, int32, false);
                    int i = 0;
                    while (i < int32) {
                        int fieldNumber = input.readFieldNumber(EnumArray.this.pipeSchema.wrappedSchema);
                        if (fieldNumber == 2) {
                            i++;
                            EnumIO.transfer(pipe, input, output, 2, true, EnumArray.this.eio.strategy);
                        } else {
                            if (fieldNumber != 3) {
                                throw new ProtostuffException("Corrupt input.");
                            }
                            int uInt32 = input.readUInt32();
                            i += uInt32;
                            output.writeUInt32(3, uInt32, false);
                        }
                    }
                    if (input.readFieldNumber(EnumArray.this.pipeSchema.wrappedSchema) != 0) {
                        throw new ProtostuffException("Corrupt input.");
                    }
                }
            };
            this.eio = enumIO;
        }

        @Override // io.protostuff.runtime.PolymorphicSchema
        public Pipe.Schema<Object> getPipeSchema() {
            return this.pipeSchema;
        }

        @Override // io.protostuff.runtime.ArraySchemas.Base
        public Object readFrom(Input input, Object obj) throws IOException {
            if (1 != input.readFieldNumber(this)) {
                throw new ProtostuffException("Corrupt input.");
            }
            int int32 = input.readInt32();
            Object[] objArr = (Object[]) Array.newInstance((Class<?>) this.eio.enumClass, int32);
            if (input instanceof GraphInput) {
                ((GraphInput) input).updateLast(objArr, obj);
            }
            int uInt32 = 0;
            while (uInt32 < int32) {
                int fieldNumber = input.readFieldNumber(this);
                if (fieldNumber == 2) {
                    objArr[uInt32] = this.eio.readFrom(input);
                    uInt32++;
                } else {
                    if (fieldNumber != 3) {
                        throw new ProtostuffException("Corrupt input.");
                    }
                    uInt32 += input.readUInt32();
                }
            }
            if (input.readFieldNumber(this) == 0) {
                return objArr;
            }
            throw new ProtostuffException("Corrupt input.");
        }

        @Override // io.protostuff.Schema
        public void writeTo(Output output, Object obj) throws IOException {
            Enum<?>[] enumArr = (Enum[]) obj;
            output.writeInt32(1, enumArr.length, false);
            int i = 0;
            for (Enum<?> r6 : enumArr) {
                if (r6 != null) {
                    if (i != 0) {
                        output.writeUInt32(3, i, false);
                        i = 0;
                    }
                    this.eio.writeTo(output, 2, true, r6);
                } else if (this.allowNullArrayElement) {
                    i++;
                }
            }
            if (i != 0) {
                output.writeUInt32(3, i, false);
            }
        }
    }

    public static class PojoArray extends Base {
        final HasSchema<Object> hs;
        protected final Pipe.Schema<Object> pipeSchema;

        public PojoArray(IdStrategy idStrategy, PolymorphicSchema.Handler handler, HasSchema<Object> hasSchema) {
            super(idStrategy, handler);
            this.pipeSchema = new Pipe.Schema<Object>(this) { // from class: io.protostuff.runtime.ArraySchemas.PojoArray.1
                @Override // io.protostuff.Pipe.Schema
                public void transfer(Pipe pipe, Input input, Output output) throws IOException {
                    if (1 != input.readFieldNumber(PojoArray.this.pipeSchema.wrappedSchema)) {
                        throw new ProtostuffException("Corrupt input.");
                    }
                    int int32 = input.readInt32();
                    output.writeInt32(1, int32, false);
                    int i = 0;
                    while (i < int32) {
                        int fieldNumber = input.readFieldNumber(PojoArray.this.pipeSchema.wrappedSchema);
                        if (fieldNumber == 2) {
                            i++;
                            output.writeObject(2, pipe, PojoArray.this.hs.getPipeSchema(), true);
                        } else {
                            if (fieldNumber != 3) {
                                throw new ProtostuffException("Corrupt input.");
                            }
                            int uInt32 = input.readUInt32();
                            i += uInt32;
                            output.writeUInt32(3, uInt32, false);
                        }
                    }
                    if (input.readFieldNumber(PojoArray.this.pipeSchema.wrappedSchema) != 0) {
                        throw new ProtostuffException("Corrupt input.");
                    }
                }
            };
            this.hs = hasSchema;
        }

        @Override // io.protostuff.runtime.PolymorphicSchema
        public Pipe.Schema<Object> getPipeSchema() {
            return this.pipeSchema;
        }

        @Override // io.protostuff.runtime.ArraySchemas.Base
        public Object readFrom(Input input, Object obj) throws IOException {
            if (1 != input.readFieldNumber(this)) {
                throw new ProtostuffException("Corrupt input.");
            }
            int int32 = input.readInt32();
            Object[] objArr = (Object[]) Array.newInstance(this.hs.getSchema().typeClass(), int32);
            if (input instanceof GraphInput) {
                ((GraphInput) input).updateLast(objArr, obj);
            }
            int uInt32 = 0;
            while (uInt32 < int32) {
                int fieldNumber = input.readFieldNumber(this);
                if (fieldNumber == 2) {
                    objArr[uInt32] = input.mergeObject(null, this.hs.getSchema());
                    uInt32++;
                } else {
                    if (fieldNumber != 3) {
                        throw new ProtostuffException("Corrupt input.");
                    }
                    uInt32 += input.readUInt32();
                }
            }
            if (input.readFieldNumber(this) == 0) {
                return objArr;
            }
            throw new ProtostuffException("Corrupt input.");
        }

        @Override // io.protostuff.Schema
        public void writeTo(Output output, Object obj) throws IOException {
            Object[] objArr = (Object[]) obj;
            output.writeInt32(1, objArr.length, false);
            int i = 0;
            for (Object obj2 : objArr) {
                if (obj2 != null) {
                    if (i != 0) {
                        output.writeUInt32(3, i, false);
                        i = 0;
                    }
                    output.writeObject(2, obj2, this.hs.getSchema(), true);
                } else if (this.allowNullArrayElement) {
                    i++;
                }
            }
            if (i != 0) {
                output.writeUInt32(3, i, false);
            }
        }
    }

    public static class StringArray extends Base {
        protected final Pipe.Schema<Object> pipeSchema;

        public StringArray(IdStrategy idStrategy, PolymorphicSchema.Handler handler) {
            super(idStrategy, handler);
            this.pipeSchema = new Pipe.Schema<Object>(this) { // from class: io.protostuff.runtime.ArraySchemas.StringArray.1
                @Override // io.protostuff.Pipe.Schema
                public void transfer(Pipe pipe, Input input, Output output) throws IOException {
                    ArraySchemas.transferObject(this, pipe, input, output, StringArray.this.strategy, RuntimeFieldFactory.STRING);
                }
            };
        }

        @Override // io.protostuff.runtime.PolymorphicSchema
        public Pipe.Schema<Object> getPipeSchema() {
            return this.pipeSchema;
        }

        @Override // io.protostuff.runtime.ArraySchemas.Base
        public Object readFrom(Input input, Object obj) throws IOException {
            if (1 != input.readFieldNumber(this)) {
                throw new ProtostuffException("Corrupt input.");
            }
            int int32 = input.readInt32();
            String[] strArr = new String[int32];
            if (input instanceof GraphInput) {
                ((GraphInput) input).updateLast(strArr, obj);
            }
            int uInt32 = 0;
            while (uInt32 < int32) {
                int fieldNumber = input.readFieldNumber(this);
                if (fieldNumber == 2) {
                    strArr[uInt32] = input.readString();
                    uInt32++;
                } else {
                    if (fieldNumber != 3) {
                        throw new ProtostuffException("Corrupt input.");
                    }
                    uInt32 += input.readUInt32();
                }
            }
            if (input.readFieldNumber(this) == 0) {
                return strArr;
            }
            throw new ProtostuffException("Corrupt input.");
        }

        @Override // io.protostuff.Schema
        public void writeTo(Output output, Object obj) throws IOException {
            CharSequence[] charSequenceArr = (CharSequence[]) obj;
            output.writeInt32(1, charSequenceArr.length, false);
            int i = 0;
            for (CharSequence charSequence : charSequenceArr) {
                if (charSequence != null) {
                    if (i != 0) {
                        output.writeUInt32(3, i, false);
                        i = 0;
                    }
                    output.writeString(2, charSequence, true);
                } else if (this.allowNullArrayElement) {
                    i++;
                }
            }
            if (i != 0) {
                output.writeUInt32(3, i, false);
            }
        }
    }

    private ArraySchemas() {
    }

    public static Base getGenericElementSchema(int i, IdStrategy idStrategy) {
        switch (i) {
            case 1:
                return idStrategy.ARRAY_BOOL_DERIVED_SCHEMA;
            case 2:
            default:
                throw new RuntimeException("Should not happen.");
            case 3:
                return idStrategy.ARRAY_CHAR_DERIVED_SCHEMA;
            case 4:
                return idStrategy.ARRAY_SHORT_DERIVED_SCHEMA;
            case 5:
                return idStrategy.ARRAY_INT32_DERIVED_SCHEMA;
            case 6:
                return idStrategy.ARRAY_INT64_DERIVED_SCHEMA;
            case 7:
                return idStrategy.ARRAY_FLOAT_DERIVED_SCHEMA;
            case 8:
                return idStrategy.ARRAY_DOUBLE_DERIVED_SCHEMA;
            case 9:
                return idStrategy.ARRAY_STRING_SCHEMA;
            case 10:
                return idStrategy.ARRAY_BYTESTRING_SCHEMA;
            case 11:
                return idStrategy.ARRAY_BYTEARRAY_SCHEMA;
            case 12:
                return idStrategy.ARRAY_BIGDECIMAL_SCHEMA;
            case 13:
                return idStrategy.ARRAY_BIGINTEGER_SCHEMA;
            case 14:
                return idStrategy.ARRAY_DATE_SCHEMA;
        }
    }

    public static Base getSchema(int i, boolean z, IdStrategy idStrategy) {
        switch (i) {
            case 1:
                return z ? idStrategy.ARRAY_BOOL_PRIMITIVE_SCHEMA : idStrategy.ARRAY_BOOL_BOXED_SCHEMA;
            case 2:
            default:
                throw new RuntimeException("Should not happen.");
            case 3:
                return z ? idStrategy.ARRAY_CHAR_PRIMITIVE_SCHEMA : idStrategy.ARRAY_CHAR_BOXED_SCHEMA;
            case 4:
                return z ? idStrategy.ARRAY_SHORT_PRIMITIVE_SCHEMA : idStrategy.ARRAY_SHORT_BOXED_SCHEMA;
            case 5:
                return z ? idStrategy.ARRAY_INT32_PRIMITIVE_SCHEMA : idStrategy.ARRAY_INT32_BOXED_SCHEMA;
            case 6:
                return z ? idStrategy.ARRAY_INT64_PRIMITIVE_SCHEMA : idStrategy.ARRAY_INT64_BOXED_SCHEMA;
            case 7:
                return z ? idStrategy.ARRAY_FLOAT_PRIMITIVE_SCHEMA : idStrategy.ARRAY_FLOAT_BOXED_SCHEMA;
            case 8:
                return z ? idStrategy.ARRAY_DOUBLE_PRIMITIVE_SCHEMA : idStrategy.ARRAY_DOUBLE_BOXED_SCHEMA;
            case 9:
                return idStrategy.ARRAY_STRING_SCHEMA;
            case 10:
                return idStrategy.ARRAY_BYTESTRING_SCHEMA;
            case 11:
                return idStrategy.ARRAY_BYTEARRAY_SCHEMA;
            case 12:
                return idStrategy.ARRAY_BIGDECIMAL_SCHEMA;
            case 13:
                return idStrategy.ARRAY_BIGINTEGER_SCHEMA;
            case 14:
                return idStrategy.ARRAY_DATE_SCHEMA;
        }
    }

    public static boolean isPrimitive(int i) {
        return i < 8;
    }

    public static String name(int i) {
        if (i == 1) {
            return STR_ARRAY_LEN;
        }
        if (i == 2) {
            return STR_ARRAY_DATA;
        }
        if (i != 3) {
            return null;
        }
        return STR_ARRAY_NULLCOUNT;
    }

    public static Base newSchema(int i, Class<?> cls, Class<?> cls2, IdStrategy idStrategy, PolymorphicSchema.Handler handler) {
        switch (i) {
            case 1:
                return new BoolArray(idStrategy, handler, cls.isPrimitive());
            case 2:
            default:
                throw new RuntimeException("Should not happen.");
            case 3:
                return new CharArray(idStrategy, handler, cls.isPrimitive());
            case 4:
                return new ShortArray(idStrategy, handler, cls.isPrimitive());
            case 5:
                return new Int32Array(idStrategy, handler, cls.isPrimitive());
            case 6:
                return new Int64Array(idStrategy, handler, cls.isPrimitive());
            case 7:
                return new FloatArray(idStrategy, handler, cls.isPrimitive());
            case 8:
                return new DoubleArray(idStrategy, handler, cls.isPrimitive());
            case 9:
                return new StringArray(idStrategy, handler);
            case 10:
                return new ByteStringArray(idStrategy, handler);
            case 11:
                return new ByteArrayArray(idStrategy, handler);
            case 12:
                return new BigDecimalArray(idStrategy, handler);
            case 13:
                return new BigIntegerArray(idStrategy, handler);
            case 14:
                return new DateArray(idStrategy, handler);
        }
    }

    public static int number(String str) {
        if (str.length() != 1) {
            return 0;
        }
        switch (str.charAt(0)) {
            case 'a':
                return 1;
            case 'b':
                return 2;
            case 'c':
                return 3;
            default:
                return 0;
        }
    }

    public static int toArrayId(int i, boolean z) {
        if (z) {
            return i - 1;
        }
        return i < 9 ? (i - 1) | 8 : i + 7;
    }

    public static int toInlineId(int i) {
        if (i < 8) {
            return i + 1;
        }
        return i < 16 ? (i & 7) + 1 : i - 7;
    }

    public static void transferObject(Pipe.Schema<Object> schema, Pipe pipe, Input input, Output output, IdStrategy idStrategy, Delegate<?> delegate) throws IOException {
        if (1 != input.readFieldNumber(schema.wrappedSchema)) {
            throw new ProtostuffException("Corrupt input.");
        }
        int int32 = input.readInt32();
        output.writeInt32(1, int32, false);
        if (int32 < 0) {
            int32 = (-int32) - 1;
        }
        int i = 0;
        while (i < int32) {
            int fieldNumber = input.readFieldNumber(schema.wrappedSchema);
            if (fieldNumber == 2) {
                i++;
                delegate.transfer(pipe, input, output, 2, true);
            } else {
                if (fieldNumber != 3) {
                    throw new ProtostuffException("Corrupt input.");
                }
                int uInt32 = input.readUInt32();
                i += uInt32;
                output.writeUInt32(3, uInt32, false);
            }
        }
        if (input.readFieldNumber(schema.wrappedSchema) != 0) {
            throw new ProtostuffException("Corrupt input.");
        }
    }

    public static class BoolArray extends Base {
        protected final Pipe.Schema<Object> pipeSchema;
        final boolean primitive;

        public BoolArray(IdStrategy idStrategy, PolymorphicSchema.Handler handler, boolean z) {
            super(idStrategy, handler);
            this.pipeSchema = new Pipe.Schema<Object>(this) { // from class: io.protostuff.runtime.ArraySchemas.BoolArray.1
                @Override // io.protostuff.Pipe.Schema
                public void transfer(Pipe pipe, Input input, Output output) throws IOException {
                    ArraySchemas.transferObject(this, pipe, input, output, BoolArray.this.strategy, RuntimeFieldFactory.BOOL);
                }
            };
            this.primitive = z;
        }

        @Override // io.protostuff.runtime.PolymorphicSchema
        public Pipe.Schema<Object> getPipeSchema() {
            return this.pipeSchema;
        }

        public Object readBoxedFrom(Input input, Object obj, int i) throws IOException {
            Boolean[] boolArr = new Boolean[i];
            if (input instanceof GraphInput) {
                ((GraphInput) input).updateLast(boolArr, obj);
            }
            int uInt32 = 0;
            while (uInt32 < i) {
                int fieldNumber = input.readFieldNumber(this);
                if (fieldNumber == 2) {
                    boolArr[uInt32] = Boolean.valueOf(input.readBool());
                    uInt32++;
                } else {
                    if (fieldNumber != 3) {
                        throw new ProtostuffException("Corrupt input.");
                    }
                    uInt32 += input.readUInt32();
                }
            }
            if (input.readFieldNumber(this) == 0) {
                return boolArr;
            }
            throw new ProtostuffException("Corrupt input.");
        }

        @Override // io.protostuff.runtime.ArraySchemas.Base
        public Object readFrom(Input input, Object obj) throws IOException {
            if (1 != input.readFieldNumber(this)) {
                throw new ProtostuffException("Corrupt input.");
            }
            int int32 = input.readInt32();
            return this.primitive ? readPrimitiveFrom(input, obj, int32) : readBoxedFrom(input, obj, int32);
        }

        public Object readPrimitiveFrom(Input input, Object obj, int i) throws IOException {
            boolean[] zArr = new boolean[i];
            if (input instanceof GraphInput) {
                ((GraphInput) input).updateLast(zArr, obj);
            }
            for (int i2 = 0; i2 < i; i2++) {
                if (2 != input.readFieldNumber(this)) {
                    throw new ProtostuffException("Corrupt input.");
                }
                zArr[i2] = input.readBool();
            }
            if (input.readFieldNumber(this) == 0) {
                return zArr;
            }
            throw new ProtostuffException("Corrupt input.");
        }

        public void writeLengthTo(Output output, int i, boolean z) throws IOException {
            output.writeInt32(1, i, false);
        }

        public void writeTo(Output output, Object obj, boolean z) throws IOException {
            if (z) {
                boolean[] zArr = (boolean[]) obj;
                writeLengthTo(output, zArr.length, true);
                for (boolean z2 : zArr) {
                    output.writeBool(2, z2, true);
                }
                return;
            }
            Boolean[] boolArr = (Boolean[]) obj;
            writeLengthTo(output, boolArr.length, false);
            int i = 0;
            for (Boolean bool : boolArr) {
                if (bool != null) {
                    if (i != 0) {
                        output.writeUInt32(3, i, false);
                        i = 0;
                    }
                    output.writeBool(2, bool.booleanValue(), true);
                } else if (this.allowNullArrayElement) {
                    i++;
                }
            }
            if (i != 0) {
                output.writeUInt32(3, i, false);
            }
        }

        @Override // io.protostuff.Schema
        public void writeTo(Output output, Object obj) throws IOException {
            writeTo(output, obj, this.primitive);
        }
    }

    public static class CharArray extends Base {
        protected final Pipe.Schema<Object> pipeSchema;
        final boolean primitive;

        public CharArray(IdStrategy idStrategy, PolymorphicSchema.Handler handler, boolean z) {
            super(idStrategy, handler);
            this.pipeSchema = new Pipe.Schema<Object>(this) { // from class: io.protostuff.runtime.ArraySchemas.CharArray.1
                @Override // io.protostuff.Pipe.Schema
                public void transfer(Pipe pipe, Input input, Output output) throws IOException {
                    ArraySchemas.transferObject(this, pipe, input, output, CharArray.this.strategy, RuntimeFieldFactory.CHAR);
                }
            };
            this.primitive = z;
        }

        @Override // io.protostuff.runtime.PolymorphicSchema
        public Pipe.Schema<Object> getPipeSchema() {
            return this.pipeSchema;
        }

        public Object readBoxedFrom(Input input, Object obj, int i) throws IOException {
            Character[] chArr = new Character[i];
            if (input instanceof GraphInput) {
                ((GraphInput) input).updateLast(chArr, obj);
            }
            int uInt32 = 0;
            while (uInt32 < i) {
                int fieldNumber = input.readFieldNumber(this);
                if (fieldNumber == 2) {
                    chArr[uInt32] = Character.valueOf((char) input.readUInt32());
                    uInt32++;
                } else {
                    if (fieldNumber != 3) {
                        throw new ProtostuffException("Corrupt input.");
                    }
                    uInt32 += input.readUInt32();
                }
            }
            if (input.readFieldNumber(this) == 0) {
                return chArr;
            }
            throw new ProtostuffException("Corrupt input.");
        }

        @Override // io.protostuff.runtime.ArraySchemas.Base
        public Object readFrom(Input input, Object obj) throws IOException {
            if (1 != input.readFieldNumber(this)) {
                throw new ProtostuffException("Corrupt input.");
            }
            int int32 = input.readInt32();
            return this.primitive ? readPrimitiveFrom(input, obj, int32) : readBoxedFrom(input, obj, int32);
        }

        public Object readPrimitiveFrom(Input input, Object obj, int i) throws IOException {
            char[] cArr = new char[i];
            if (input instanceof GraphInput) {
                ((GraphInput) input).updateLast(cArr, obj);
            }
            for (int i2 = 0; i2 < i; i2++) {
                if (2 != input.readFieldNumber(this)) {
                    throw new ProtostuffException("Corrupt input.");
                }
                cArr[i2] = (char) input.readUInt32();
            }
            if (input.readFieldNumber(this) == 0) {
                return cArr;
            }
            throw new ProtostuffException("Corrupt input.");
        }

        public void writeLengthTo(Output output, int i, boolean z) throws IOException {
            output.writeInt32(1, i, false);
        }

        public void writeTo(Output output, Object obj, boolean z) throws IOException {
            if (z) {
                char[] cArr = (char[]) obj;
                writeLengthTo(output, cArr.length, true);
                for (char c2 : cArr) {
                    output.writeUInt32(2, c2, true);
                }
                return;
            }
            Character[] chArr = (Character[]) obj;
            writeLengthTo(output, chArr.length, false);
            int i = 0;
            for (Character ch : chArr) {
                if (ch != null) {
                    if (i != 0) {
                        output.writeUInt32(3, i, false);
                        i = 0;
                    }
                    output.writeUInt32(2, ch.charValue(), true);
                } else if (this.allowNullArrayElement) {
                    i++;
                }
            }
            if (i != 0) {
                output.writeUInt32(3, i, false);
            }
        }

        @Override // io.protostuff.Schema
        public void writeTo(Output output, Object obj) throws IOException {
            writeTo(output, obj, this.primitive);
        }
    }

    public static class DoubleArray extends Base {
        protected final Pipe.Schema<Object> pipeSchema;
        final boolean primitive;

        public DoubleArray(IdStrategy idStrategy, PolymorphicSchema.Handler handler, boolean z) {
            super(idStrategy, handler);
            this.pipeSchema = new Pipe.Schema<Object>(this) { // from class: io.protostuff.runtime.ArraySchemas.DoubleArray.1
                @Override // io.protostuff.Pipe.Schema
                public void transfer(Pipe pipe, Input input, Output output) throws IOException {
                    ArraySchemas.transferObject(this, pipe, input, output, DoubleArray.this.strategy, RuntimeFieldFactory.DOUBLE);
                }
            };
            this.primitive = z;
        }

        @Override // io.protostuff.runtime.PolymorphicSchema
        public Pipe.Schema<Object> getPipeSchema() {
            return this.pipeSchema;
        }

        public Object readBoxedFrom(Input input, Object obj, int i) throws IOException {
            Double[] dArr = new Double[i];
            if (input instanceof GraphInput) {
                ((GraphInput) input).updateLast(dArr, obj);
            }
            int uInt32 = 0;
            while (uInt32 < i) {
                int fieldNumber = input.readFieldNumber(this);
                if (fieldNumber == 2) {
                    dArr[uInt32] = Double.valueOf(input.readDouble());
                    uInt32++;
                } else {
                    if (fieldNumber != 3) {
                        throw new ProtostuffException("Corrupt input.");
                    }
                    uInt32 += input.readUInt32();
                }
            }
            if (input.readFieldNumber(this) == 0) {
                return dArr;
            }
            throw new ProtostuffException("Corrupt input.");
        }

        @Override // io.protostuff.runtime.ArraySchemas.Base
        public Object readFrom(Input input, Object obj) throws IOException {
            if (1 != input.readFieldNumber(this)) {
                throw new ProtostuffException("Corrupt input.");
            }
            int int32 = input.readInt32();
            return this.primitive ? readPrimitiveFrom(input, obj, int32) : readBoxedFrom(input, obj, int32);
        }

        public Object readPrimitiveFrom(Input input, Object obj, int i) throws IOException {
            double[] dArr = new double[i];
            if (input instanceof GraphInput) {
                ((GraphInput) input).updateLast(dArr, obj);
            }
            for (int i2 = 0; i2 < i; i2++) {
                if (2 != input.readFieldNumber(this)) {
                    throw new ProtostuffException("Corrupt input.");
                }
                dArr[i2] = input.readDouble();
            }
            if (input.readFieldNumber(this) == 0) {
                return dArr;
            }
            throw new ProtostuffException("Corrupt input.");
        }

        public void writeLengthTo(Output output, int i, boolean z) throws IOException {
            output.writeInt32(1, i, false);
        }

        public void writeTo(Output output, Object obj, boolean z) throws IOException {
            if (z) {
                double[] dArr = (double[]) obj;
                writeLengthTo(output, dArr.length, true);
                for (double d : dArr) {
                    output.writeDouble(2, d, true);
                }
                return;
            }
            Double[] dArr2 = (Double[]) obj;
            writeLengthTo(output, dArr2.length, false);
            int i = 0;
            for (Double d2 : dArr2) {
                if (d2 != null) {
                    if (i != 0) {
                        output.writeUInt32(3, i, false);
                        i = 0;
                    }
                    output.writeDouble(2, d2.doubleValue(), true);
                } else if (this.allowNullArrayElement) {
                    i++;
                }
            }
            if (i != 0) {
                output.writeUInt32(3, i, false);
            }
        }

        @Override // io.protostuff.Schema
        public void writeTo(Output output, Object obj) throws IOException {
            writeTo(output, obj, this.primitive);
        }
    }

    public static class FloatArray extends Base {
        protected final Pipe.Schema<Object> pipeSchema;
        final boolean primitive;

        public FloatArray(IdStrategy idStrategy, PolymorphicSchema.Handler handler, boolean z) {
            super(idStrategy, handler);
            this.pipeSchema = new Pipe.Schema<Object>(this) { // from class: io.protostuff.runtime.ArraySchemas.FloatArray.1
                @Override // io.protostuff.Pipe.Schema
                public void transfer(Pipe pipe, Input input, Output output) throws IOException {
                    ArraySchemas.transferObject(this, pipe, input, output, FloatArray.this.strategy, RuntimeFieldFactory.FLOAT);
                }
            };
            this.primitive = z;
        }

        @Override // io.protostuff.runtime.PolymorphicSchema
        public Pipe.Schema<Object> getPipeSchema() {
            return this.pipeSchema;
        }

        public Object readBoxedFrom(Input input, Object obj, int i) throws IOException {
            Float[] fArr = new Float[i];
            if (input instanceof GraphInput) {
                ((GraphInput) input).updateLast(fArr, obj);
            }
            int uInt32 = 0;
            while (uInt32 < i) {
                int fieldNumber = input.readFieldNumber(this);
                if (fieldNumber == 2) {
                    fArr[uInt32] = Float.valueOf(input.readFloat());
                    uInt32++;
                } else {
                    if (fieldNumber != 3) {
                        throw new ProtostuffException("Corrupt input.");
                    }
                    uInt32 += input.readUInt32();
                }
            }
            if (input.readFieldNumber(this) == 0) {
                return fArr;
            }
            throw new ProtostuffException("Corrupt input.");
        }

        @Override // io.protostuff.runtime.ArraySchemas.Base
        public Object readFrom(Input input, Object obj) throws IOException {
            if (1 != input.readFieldNumber(this)) {
                throw new ProtostuffException("Corrupt input.");
            }
            int int32 = input.readInt32();
            return this.primitive ? readPrimitiveFrom(input, obj, int32) : readBoxedFrom(input, obj, int32);
        }

        public Object readPrimitiveFrom(Input input, Object obj, int i) throws IOException {
            float[] fArr = new float[i];
            if (input instanceof GraphInput) {
                ((GraphInput) input).updateLast(fArr, obj);
            }
            for (int i2 = 0; i2 < i; i2++) {
                if (2 != input.readFieldNumber(this)) {
                    throw new ProtostuffException("Corrupt input.");
                }
                fArr[i2] = input.readFloat();
            }
            if (input.readFieldNumber(this) == 0) {
                return fArr;
            }
            throw new ProtostuffException("Corrupt input.");
        }

        public void writeLengthTo(Output output, int i, boolean z) throws IOException {
            output.writeInt32(1, i, false);
        }

        public void writeTo(Output output, Object obj, boolean z) throws IOException {
            if (z) {
                float[] fArr = (float[]) obj;
                writeLengthTo(output, fArr.length, true);
                for (float f : fArr) {
                    output.writeFloat(2, f, true);
                }
                return;
            }
            Float[] fArr2 = (Float[]) obj;
            writeLengthTo(output, fArr2.length, false);
            int i = 0;
            for (Float f2 : fArr2) {
                if (f2 != null) {
                    if (i != 0) {
                        output.writeUInt32(3, i, false);
                        i = 0;
                    }
                    output.writeFloat(2, f2.floatValue(), true);
                } else if (this.allowNullArrayElement) {
                    i++;
                }
            }
            if (i != 0) {
                output.writeUInt32(3, i, false);
            }
        }

        @Override // io.protostuff.Schema
        public void writeTo(Output output, Object obj) throws IOException {
            writeTo(output, obj, this.primitive);
        }
    }

    public static class Int32Array extends Base {
        protected final Pipe.Schema<Object> pipeSchema;
        final boolean primitive;

        public Int32Array(IdStrategy idStrategy, PolymorphicSchema.Handler handler, boolean z) {
            super(idStrategy, handler);
            this.pipeSchema = new Pipe.Schema<Object>(this) { // from class: io.protostuff.runtime.ArraySchemas.Int32Array.1
                @Override // io.protostuff.Pipe.Schema
                public void transfer(Pipe pipe, Input input, Output output) throws IOException {
                    ArraySchemas.transferObject(this, pipe, input, output, Int32Array.this.strategy, RuntimeFieldFactory.INT32);
                }
            };
            this.primitive = z;
        }

        @Override // io.protostuff.runtime.PolymorphicSchema
        public Pipe.Schema<Object> getPipeSchema() {
            return this.pipeSchema;
        }

        public Object readBoxedFrom(Input input, Object obj, int i) throws IOException {
            Integer[] numArr = new Integer[i];
            if (input instanceof GraphInput) {
                ((GraphInput) input).updateLast(numArr, obj);
            }
            int uInt32 = 0;
            while (uInt32 < i) {
                int fieldNumber = input.readFieldNumber(this);
                if (fieldNumber == 2) {
                    numArr[uInt32] = Integer.valueOf(input.readInt32());
                    uInt32++;
                } else {
                    if (fieldNumber != 3) {
                        throw new ProtostuffException("Corrupt input.");
                    }
                    uInt32 += input.readUInt32();
                }
            }
            if (input.readFieldNumber(this) == 0) {
                return numArr;
            }
            throw new ProtostuffException("Corrupt input.");
        }

        @Override // io.protostuff.runtime.ArraySchemas.Base
        public Object readFrom(Input input, Object obj) throws IOException {
            if (1 != input.readFieldNumber(this)) {
                throw new ProtostuffException("Corrupt input.");
            }
            int int32 = input.readInt32();
            return this.primitive ? readPrimitiveFrom(input, obj, int32) : readBoxedFrom(input, obj, int32);
        }

        public Object readPrimitiveFrom(Input input, Object obj, int i) throws IOException {
            int[] iArr = new int[i];
            if (input instanceof GraphInput) {
                ((GraphInput) input).updateLast(iArr, obj);
            }
            for (int i2 = 0; i2 < i; i2++) {
                if (2 != input.readFieldNumber(this)) {
                    throw new ProtostuffException("Corrupt input.");
                }
                iArr[i2] = input.readInt32();
            }
            if (input.readFieldNumber(this) == 0) {
                return iArr;
            }
            throw new ProtostuffException("Corrupt input.");
        }

        public void writeLengthTo(Output output, int i, boolean z) throws IOException {
            output.writeInt32(1, i, false);
        }

        public void writeTo(Output output, Object obj, boolean z) throws IOException {
            if (z) {
                int[] iArr = (int[]) obj;
                writeLengthTo(output, iArr.length, true);
                for (int i : iArr) {
                    output.writeInt32(2, i, true);
                }
                return;
            }
            Integer[] numArr = (Integer[]) obj;
            writeLengthTo(output, numArr.length, false);
            int i2 = 0;
            for (Integer num : numArr) {
                if (num != null) {
                    if (i2 != 0) {
                        output.writeUInt32(3, i2, false);
                        i2 = 0;
                    }
                    output.writeInt32(2, num.intValue(), true);
                } else if (this.allowNullArrayElement) {
                    i2++;
                }
            }
            if (i2 != 0) {
                output.writeUInt32(3, i2, false);
            }
        }

        @Override // io.protostuff.Schema
        public void writeTo(Output output, Object obj) throws IOException {
            writeTo(output, obj, this.primitive);
        }
    }

    public static class Int64Array extends Base {
        protected final Pipe.Schema<Object> pipeSchema;
        final boolean primitive;

        public Int64Array(IdStrategy idStrategy, PolymorphicSchema.Handler handler, boolean z) {
            super(idStrategy, handler);
            this.pipeSchema = new Pipe.Schema<Object>(this) { // from class: io.protostuff.runtime.ArraySchemas.Int64Array.1
                @Override // io.protostuff.Pipe.Schema
                public void transfer(Pipe pipe, Input input, Output output) throws IOException {
                    ArraySchemas.transferObject(this, pipe, input, output, Int64Array.this.strategy, RuntimeFieldFactory.INT64);
                }
            };
            this.primitive = z;
        }

        @Override // io.protostuff.runtime.PolymorphicSchema
        public Pipe.Schema<Object> getPipeSchema() {
            return this.pipeSchema;
        }

        public Object readBoxedFrom(Input input, Object obj, int i) throws IOException {
            Long[] lArr = new Long[i];
            if (input instanceof GraphInput) {
                ((GraphInput) input).updateLast(lArr, obj);
            }
            int uInt32 = 0;
            while (uInt32 < i) {
                int fieldNumber = input.readFieldNumber(this);
                if (fieldNumber == 2) {
                    lArr[uInt32] = Long.valueOf(input.readInt64());
                    uInt32++;
                } else {
                    if (fieldNumber != 3) {
                        throw new ProtostuffException("Corrupt input.");
                    }
                    uInt32 += input.readUInt32();
                }
            }
            if (input.readFieldNumber(this) == 0) {
                return lArr;
            }
            throw new ProtostuffException("Corrupt input.");
        }

        @Override // io.protostuff.runtime.ArraySchemas.Base
        public Object readFrom(Input input, Object obj) throws IOException {
            if (1 != input.readFieldNumber(this)) {
                throw new ProtostuffException("Corrupt input.");
            }
            int int32 = input.readInt32();
            return this.primitive ? readPrimitiveFrom(input, obj, int32) : readBoxedFrom(input, obj, int32);
        }

        public Object readPrimitiveFrom(Input input, Object obj, int i) throws IOException {
            long[] jArr = new long[i];
            if (input instanceof GraphInput) {
                ((GraphInput) input).updateLast(jArr, obj);
            }
            for (int i2 = 0; i2 < i; i2++) {
                if (2 != input.readFieldNumber(this)) {
                    throw new ProtostuffException("Corrupt input.");
                }
                jArr[i2] = input.readInt64();
            }
            if (input.readFieldNumber(this) == 0) {
                return jArr;
            }
            throw new ProtostuffException("Corrupt input.");
        }

        public void writeLengthTo(Output output, int i, boolean z) throws IOException {
            output.writeInt32(1, i, false);
        }

        public void writeTo(Output output, Object obj, boolean z) throws IOException {
            if (z) {
                long[] jArr = (long[]) obj;
                writeLengthTo(output, jArr.length, true);
                for (long j2 : jArr) {
                    output.writeInt64(2, j2, true);
                }
                return;
            }
            Long[] lArr = (Long[]) obj;
            writeLengthTo(output, lArr.length, false);
            int i = 0;
            for (Long l2 : lArr) {
                if (l2 != null) {
                    if (i != 0) {
                        output.writeUInt32(3, i, false);
                        i = 0;
                    }
                    output.writeInt64(2, l2.longValue(), true);
                } else if (this.allowNullArrayElement) {
                    i++;
                }
            }
            if (i != 0) {
                output.writeUInt32(3, i, false);
            }
        }

        @Override // io.protostuff.Schema
        public void writeTo(Output output, Object obj) throws IOException {
            writeTo(output, obj, this.primitive);
        }
    }

    public static class ShortArray extends Base {
        protected final Pipe.Schema<Object> pipeSchema;
        final boolean primitive;

        public ShortArray(IdStrategy idStrategy, PolymorphicSchema.Handler handler, boolean z) {
            super(idStrategy, handler);
            this.pipeSchema = new Pipe.Schema<Object>(this) { // from class: io.protostuff.runtime.ArraySchemas.ShortArray.1
                @Override // io.protostuff.Pipe.Schema
                public void transfer(Pipe pipe, Input input, Output output) throws IOException {
                    ArraySchemas.transferObject(this, pipe, input, output, ShortArray.this.strategy, RuntimeFieldFactory.SHORT);
                }
            };
            this.primitive = z;
        }

        @Override // io.protostuff.runtime.PolymorphicSchema
        public Pipe.Schema<Object> getPipeSchema() {
            return this.pipeSchema;
        }

        public Object readBoxedFrom(Input input, Object obj, int i) throws IOException {
            Short[] shArr = new Short[i];
            if (input instanceof GraphInput) {
                ((GraphInput) input).updateLast(shArr, obj);
            }
            int uInt32 = 0;
            while (uInt32 < i) {
                int fieldNumber = input.readFieldNumber(this);
                if (fieldNumber == 2) {
                    shArr[uInt32] = Short.valueOf((short) input.readUInt32());
                    uInt32++;
                } else {
                    if (fieldNumber != 3) {
                        throw new ProtostuffException("Corrupt input.");
                    }
                    uInt32 += input.readUInt32();
                }
            }
            if (input.readFieldNumber(this) == 0) {
                return shArr;
            }
            throw new ProtostuffException("Corrupt input.");
        }

        @Override // io.protostuff.runtime.ArraySchemas.Base
        public Object readFrom(Input input, Object obj) throws IOException {
            if (1 != input.readFieldNumber(this)) {
                throw new ProtostuffException("Corrupt input.");
            }
            int int32 = input.readInt32();
            return this.primitive ? readPrimitiveFrom(input, obj, int32) : readBoxedFrom(input, obj, int32);
        }

        public Object readPrimitiveFrom(Input input, Object obj, int i) throws IOException {
            short[] sArr = new short[i];
            if (input instanceof GraphInput) {
                ((GraphInput) input).updateLast(sArr, obj);
            }
            for (int i2 = 0; i2 < i; i2++) {
                if (2 != input.readFieldNumber(this)) {
                    throw new ProtostuffException("Corrupt input.");
                }
                sArr[i2] = (short) input.readUInt32();
            }
            if (input.readFieldNumber(this) == 0) {
                return sArr;
            }
            throw new ProtostuffException("Corrupt input.");
        }

        public void writeLengthTo(Output output, int i, boolean z) throws IOException {
            output.writeInt32(1, i, false);
        }

        public void writeTo(Output output, Object obj, boolean z) throws IOException {
            if (z) {
                short[] sArr = (short[]) obj;
                writeLengthTo(output, sArr.length, true);
                for (short s : sArr) {
                    output.writeUInt32(2, s, true);
                }
                return;
            }
            Short[] shArr = (Short[]) obj;
            writeLengthTo(output, shArr.length, false);
            int i = 0;
            for (Short sh : shArr) {
                if (sh != null) {
                    if (i != 0) {
                        output.writeUInt32(3, i, false);
                        i = 0;
                    }
                    output.writeUInt32(2, sh.shortValue(), true);
                } else if (this.allowNullArrayElement) {
                    i++;
                }
            }
            if (i != 0) {
                output.writeUInt32(3, i, false);
            }
        }

        @Override // io.protostuff.Schema
        public void writeTo(Output output, Object obj) throws IOException {
            writeTo(output, obj, this.primitive);
        }
    }
}
