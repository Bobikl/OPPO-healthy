package io.protostuff.runtime;

import com.oplus.aiunit.vision.f04;
import io.protostuff.CollectionSchema;
import io.protostuff.Input;
import io.protostuff.MapSchema;
import io.protostuff.Output;
import io.protostuff.Pipe;
import io.protostuff.Tag;
import java.io.IOException;
import java.lang.Enum;
import java.util.Collection;
import java.util.EnumMap;
import java.util.EnumSet;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes10.dex */
public abstract class EnumIO<E extends Enum<E>> implements PolymorphicSchema.Factory {
    private static final java.lang.reflect.Field __elementTypeFromEnumSet;
    private static final java.lang.reflect.Field __keyTypeFromEnumMap;
    private final String[] alias;
    public final Class<E> enumClass;
    private volatile MapSchema.MessageFactory enumMapFactory;
    private volatile CollectionSchema.MessageFactory enumSetFactory;
    public final ArraySchemas.Base genericElementSchema;
    public final IdStrategy strategy;
    private final int[] tag;
    private final Map<String, E> valueByAliasMap;
    private final Map<Integer, E> valueByTagMap;

    public static final class ByName<E extends Enum<E>> extends EnumIO<E> {
        public ByName(Class<E> cls, IdStrategy idStrategy) {
            super(cls, idStrategy);
        }

        @Override // io.protostuff.runtime.EnumIO
        public E readFrom(Input input) throws IOException {
            return getByAlias(input.readString());
        }
    }

    public static final class ByNumber<E extends Enum<E>> extends EnumIO<E> {
        public ByNumber(Class<E> cls, IdStrategy idStrategy) {
            super(cls, idStrategy);
        }

        @Override // io.protostuff.runtime.EnumIO
        public E readFrom(Input input) throws IOException {
            return getByTag(input.readEnum());
        }
    }

    static {
        java.lang.reflect.Field declaredField;
        java.lang.reflect.Field declaredField2;
        boolean z;
        try {
            declaredField = EnumMap.class.getDeclaredField(f04.JSON_KEY_DIGITAL_KEY_TYPE);
            z = true;
            try {
                declaredField.setAccessible(true);
                declaredField2 = EnumSet.class.getDeclaredField("elementType");
                try {
                    declaredField2.setAccessible(true);
                } catch (Exception unused) {
                    z = false;
                }
            } catch (Exception unused2) {
                declaredField2 = null;
            }
        } catch (Exception unused3) {
            declaredField = null;
            declaredField2 = null;
        }
        if (!z) {
            declaredField = null;
        }
        __keyTypeFromEnumMap = declaredField;
        __elementTypeFromEnumSet = z ? declaredField2 : null;
    }

    public EnumIO(Class<E> cls, IdStrategy idStrategy) {
        this.enumClass = cls;
        this.strategy = idStrategy;
        this.genericElementSchema = new ArraySchemas.EnumArray(idStrategy, null, this);
        int length = cls.getFields().length;
        this.alias = new String[length];
        this.tag = new int[length];
        int i = length * 2;
        this.valueByAliasMap = new HashMap(i);
        this.valueByTagMap = new HashMap(i);
        for (E e2 : cls.getEnumConstants()) {
            int iOrdinal = e2.ordinal();
            try {
                java.lang.reflect.Field field = cls.getField(e2.name());
                if (field.isAnnotationPresent(Tag.class)) {
                    Tag tag = (Tag) field.getAnnotation(Tag.class);
                    this.tag[iOrdinal] = tag.value();
                    this.alias[iOrdinal] = tag.alias();
                    this.valueByTagMap.put(Integer.valueOf(tag.value()), e2);
                    this.valueByAliasMap.put(tag.alias(), e2);
                } else {
                    this.tag[iOrdinal] = iOrdinal;
                    this.alias[iOrdinal] = field.getName();
                    this.valueByTagMap.put(Integer.valueOf(iOrdinal), e2);
                    this.valueByAliasMap.put(field.getName(), e2);
                }
            } catch (NoSuchFieldException e3) {
                throw new IllegalStateException(e3);
            }
        }
    }

    public static Class<?> getElementTypeFromEnumSet(Object obj) {
        java.lang.reflect.Field field = __elementTypeFromEnumSet;
        if (field == null) {
            throw new RuntimeException("Could not access (reflection) the private field *elementType* (enumClass) from: class java.util.EnumSet");
        }
        try {
            return (Class) field.get(obj);
        } catch (Exception e2) {
            throw new RuntimeException(e2);
        }
    }

    public static Class<?> getKeyTypeFromEnumMap(Object obj) {
        java.lang.reflect.Field field = __keyTypeFromEnumMap;
        if (field == null) {
            throw new RuntimeException("Could not access (reflection) the private field *keyType* (enumClass) from: class java.util.EnumMap");
        }
        try {
            return (Class) field.get(obj);
        } catch (Exception e2) {
            throw new RuntimeException(e2);
        }
    }

    public static EnumIO<? extends Enum<?>> newEnumIO(Class<?> cls, IdStrategy idStrategy) {
        return (idStrategy.flags & 1) == 0 ? new ByNumber(cls, idStrategy) : new ByName(cls, idStrategy);
    }

    private static <E extends Enum<E>> MapSchema.MessageFactory newEnumMapFactory(EnumIO<E> enumIO) {
        return new MapSchema.MessageFactory() { // from class: io.protostuff.runtime.EnumIO.2
            @Override // io.protostuff.MapSchema.MessageFactory
            public <K, V> Map<K, V> newMessage() {
                return EnumIO.this.newEnumMap();
            }

            @Override // io.protostuff.MapSchema.MessageFactory
            public Class<?> typeClass() {
                return EnumMap.class;
            }
        };
    }

    private static <E extends Enum<E>> CollectionSchema.MessageFactory newEnumSetFactory(EnumIO<E> enumIO) {
        return new CollectionSchema.MessageFactory() { // from class: io.protostuff.runtime.EnumIO.1
            @Override // io.protostuff.CollectionSchema.MessageFactory
            public <V> Collection<V> newMessage() {
                return EnumIO.this.newEnumSet();
            }

            @Override // io.protostuff.CollectionSchema.MessageFactory
            public Class<?> typeClass() {
                return EnumSet.class;
            }
        };
    }

    public static void transfer(Pipe pipe, Input input, Output output, int i, boolean z, IdStrategy idStrategy) throws IOException {
        if ((idStrategy.flags & 1) == 0) {
            output.writeEnum(i, input.readEnum(), z);
        } else {
            input.transferByteRangeTo(output, true, i, z);
        }
    }

    public String getAlias(Enum<?> r1) {
        return this.alias[r1.ordinal()];
    }

    public E getByAlias(String str) {
        return this.valueByAliasMap.get(str);
    }

    public E getByTag(int i) {
        return this.valueByTagMap.get(Integer.valueOf(i));
    }

    public MapSchema.MessageFactory getEnumMapFactory() {
        MapSchema.MessageFactory messageFactoryNewEnumMapFactory = this.enumMapFactory;
        if (messageFactoryNewEnumMapFactory == null) {
            synchronized (this) {
                messageFactoryNewEnumMapFactory = this.enumMapFactory;
                if (messageFactoryNewEnumMapFactory == null) {
                    messageFactoryNewEnumMapFactory = newEnumMapFactory(this);
                    this.enumMapFactory = messageFactoryNewEnumMapFactory;
                }
            }
        }
        return messageFactoryNewEnumMapFactory;
    }

    public CollectionSchema.MessageFactory getEnumSetFactory() {
        CollectionSchema.MessageFactory messageFactoryNewEnumSetFactory = this.enumSetFactory;
        if (messageFactoryNewEnumSetFactory == null) {
            synchronized (this) {
                messageFactoryNewEnumSetFactory = this.enumSetFactory;
                if (messageFactoryNewEnumSetFactory == null) {
                    messageFactoryNewEnumSetFactory = newEnumSetFactory(this);
                    this.enumSetFactory = messageFactoryNewEnumSetFactory;
                }
            }
        }
        return messageFactoryNewEnumSetFactory;
    }

    public int getTag(Enum<?> r1) {
        return this.tag[r1.ordinal()];
    }

    public <V> EnumMap<E, V> newEnumMap() {
        return new EnumMap<>(this.enumClass);
    }

    public EnumSet<E> newEnumSet() {
        return EnumSet.noneOf(this.enumClass);
    }

    @Override // io.protostuff.runtime.PolymorphicSchema.Factory
    public PolymorphicSchema newSchema(Class<?> cls, IdStrategy idStrategy, PolymorphicSchema.Handler handler) {
        return new ArraySchemas.EnumArray(idStrategy, handler, this);
    }

    public abstract E readFrom(Input input) throws IOException;

    public void writeTo(Output output, int i, boolean z, Enum<?> r5) throws IOException {
        if ((this.strategy.flags & 1) == 0) {
            output.writeEnum(i, getTag(r5), z);
        } else {
            output.writeString(i, getAlias(r5), z);
        }
    }
}
