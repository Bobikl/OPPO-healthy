package io.protostuff.runtime;

import io.protostuff.CollectionSchema;
import io.protostuff.Input;
import io.protostuff.MapSchema;
import io.protostuff.Message;
import io.protostuff.Output;
import io.protostuff.Pipe;
import io.protostuff.ProtostuffException;
import io.protostuff.Schema;
import java.io.IOException;
import java.lang.reflect.Modifier;
import java.util.Collection;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes10.dex */
public final class DefaultIdStrategy extends IdStrategy {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    final ConcurrentHashMap<String, CollectionSchema.MessageFactory> collectionMapping;
    final ConcurrentHashMap<String, HasDelegate<?>> delegateMapping;
    final ConcurrentHashMap<String, EnumIO<?>> enumMapping;
    final ConcurrentHashMap<String, MapSchema.MessageFactory> mapMapping;
    final ConcurrentHashMap<String, HasSchema<?>> pojoMapping;

    public static final class Lazy<T> extends HasSchema<T> {
        private volatile Pipe.Schema<T> pipeSchema;
        private volatile Schema<T> schema;
        final Class<T> typeClass;

        public Lazy(Class<T> cls, IdStrategy idStrategy) {
            super(idStrategy);
            this.typeClass = cls;
        }

        @Override // io.protostuff.runtime.HasSchema
        public Pipe.Schema<T> getPipeSchema() {
            Pipe.Schema<T> schemaResolvePipeSchema = this.pipeSchema;
            if (schemaResolvePipeSchema == null) {
                synchronized (this) {
                    schemaResolvePipeSchema = this.pipeSchema;
                    if (schemaResolvePipeSchema == null) {
                        schemaResolvePipeSchema = RuntimeSchema.resolvePipeSchema(getSchema(), this.typeClass, true);
                        this.pipeSchema = schemaResolvePipeSchema;
                    }
                }
            }
            return schemaResolvePipeSchema;
        }

        @Override // io.protostuff.runtime.HasSchema
        public Schema<T> getSchema() {
            Schema<T> schemaNewSchema = this.schema;
            if (schemaNewSchema == null) {
                synchronized (this) {
                    schemaNewSchema = this.schema;
                    if (schemaNewSchema == null) {
                        if (Message.class.isAssignableFrom(this.typeClass)) {
                            schemaNewSchema = ((Message) IdStrategy.createMessageInstance(this.typeClass)).cachedSchema();
                            this.schema = schemaNewSchema;
                        } else {
                            schemaNewSchema = this.strategy.newSchema(this.typeClass);
                            this.schema = schemaNewSchema;
                        }
                    }
                }
            }
            return schemaNewSchema;
        }
    }

    public static final class LazyRegister<T> extends HasSchema<T> {
        private volatile Pipe.Schema<T> pipeSchema;
        private volatile Schema<T> schema;
        final Class<T> typeClass;

        public LazyRegister(Class<T> cls, IdStrategy idStrategy) {
            super(idStrategy);
            this.typeClass = cls;
        }

        @Override // io.protostuff.runtime.HasSchema
        public Pipe.Schema<T> getPipeSchema() {
            Pipe.Schema<T> schemaResolvePipeSchema = this.pipeSchema;
            if (schemaResolvePipeSchema == null) {
                synchronized (this) {
                    schemaResolvePipeSchema = this.pipeSchema;
                    if (schemaResolvePipeSchema == null) {
                        schemaResolvePipeSchema = RuntimeSchema.resolvePipeSchema(getSchema(), this.typeClass, true);
                        this.pipeSchema = schemaResolvePipeSchema;
                    }
                }
            }
            return schemaResolvePipeSchema;
        }

        @Override // io.protostuff.runtime.HasSchema
        public Schema<T> getSchema() {
            Schema<T> schemaNewSchema = this.schema;
            if (schemaNewSchema == null) {
                synchronized (this) {
                    schemaNewSchema = this.schema;
                    if (schemaNewSchema == null) {
                        schemaNewSchema = this.strategy.newSchema(this.typeClass);
                        this.schema = schemaNewSchema;
                    }
                }
            }
            return schemaNewSchema;
        }
    }

    public static final class Mapped<T> extends HasSchema<T> {
        final Class<? super T> baseClass;
        final Class<T> typeClass;
        private volatile HasSchema<T> wrapper;

        public Mapped(Class<? super T> cls, Class<T> cls2, IdStrategy idStrategy) {
            super(idStrategy);
            this.baseClass = cls;
            this.typeClass = cls2;
        }

        @Override // io.protostuff.runtime.HasSchema
        public Pipe.Schema<T> getPipeSchema() {
            HasSchema<T> schemaWrapper = this.wrapper;
            if (schemaWrapper == null) {
                synchronized (this) {
                    schemaWrapper = this.wrapper;
                    if (schemaWrapper == null) {
                        schemaWrapper = this.strategy.getSchemaWrapper(this.typeClass, true);
                        this.wrapper = schemaWrapper;
                    }
                }
            }
            return schemaWrapper.getPipeSchema();
        }

        @Override // io.protostuff.runtime.HasSchema
        public Schema<T> getSchema() {
            HasSchema<T> schemaWrapper = this.wrapper;
            if (schemaWrapper == null) {
                synchronized (this) {
                    schemaWrapper = this.wrapper;
                    if (schemaWrapper == null) {
                        schemaWrapper = this.strategy.getSchemaWrapper(this.typeClass, true);
                        this.wrapper = schemaWrapper;
                    }
                }
            }
            return schemaWrapper.getSchema();
        }
    }

    public static final class Registered<T> extends HasSchema<T> {
        private volatile Pipe.Schema<T> pipeSchema;
        final Schema<T> schema;

        public Registered(Schema<T> schema, IdStrategy idStrategy) {
            super(idStrategy);
            this.schema = schema;
        }

        @Override // io.protostuff.runtime.HasSchema
        public Pipe.Schema<T> getPipeSchema() {
            Pipe.Schema<T> schemaResolvePipeSchema = this.pipeSchema;
            if (schemaResolvePipeSchema == null) {
                synchronized (this) {
                    schemaResolvePipeSchema = this.pipeSchema;
                    if (schemaResolvePipeSchema == null) {
                        Schema<T> schema = this.schema;
                        schemaResolvePipeSchema = RuntimeSchema.resolvePipeSchema(schema, schema.typeClass(), true);
                        this.pipeSchema = schemaResolvePipeSchema;
                    }
                }
            }
            return schemaResolvePipeSchema;
        }

        @Override // io.protostuff.runtime.HasSchema
        public Schema<T> getSchema() {
            return this.schema;
        }
    }

    public static final class RuntimeCollectionFactory implements CollectionSchema.MessageFactory {
        final Class<?> collectionClass;
        final RuntimeEnv.Instantiator<?> instantiator;

        public RuntimeCollectionFactory(Class<?> cls) {
            this.collectionClass = cls;
            this.instantiator = RuntimeEnv.newInstantiator(cls);
        }

        @Override // io.protostuff.CollectionSchema.MessageFactory
        public <V> Collection<V> newMessage() {
            return (Collection) this.instantiator.newInstance();
        }

        @Override // io.protostuff.CollectionSchema.MessageFactory
        public Class<?> typeClass() {
            return this.collectionClass;
        }
    }

    public static final class RuntimeMapFactory implements MapSchema.MessageFactory {
        final RuntimeEnv.Instantiator<?> instantiator;
        final Class<?> mapClass;

        public RuntimeMapFactory(Class<?> cls) {
            this.mapClass = cls;
            this.instantiator = RuntimeEnv.newInstantiator(cls);
        }

        @Override // io.protostuff.MapSchema.MessageFactory
        public <K, V> Map<K, V> newMessage() {
            return (Map) this.instantiator.newInstance();
        }

        @Override // io.protostuff.MapSchema.MessageFactory
        public Class<?> typeClass() {
            return this.mapClass;
        }
    }

    public DefaultIdStrategy() {
        super(IdStrategy.DEFAULT_FLAGS, null, 0);
        this.pojoMapping = new ConcurrentHashMap<>();
        this.enumMapping = new ConcurrentHashMap<>();
        this.collectionMapping = new ConcurrentHashMap<>();
        this.mapMapping = new ConcurrentHashMap<>();
        this.delegateMapping = new ConcurrentHashMap<>();
    }

    private EnumIO<? extends Enum<?>> getEnumIO(String str, boolean z) {
        EnumIO<? extends Enum<?>> enumIO = (EnumIO) this.enumMapping.get(str);
        if (enumIO != null) {
            return enumIO;
        }
        if (!z) {
            return null;
        }
        Class clsLoadClass = RuntimeEnv.loadClass(str);
        EnumIO<? extends Enum<?>> enumIONewEnumIO = EnumIO.newEnumIO(clsLoadClass, this);
        EnumIO<? extends Enum<?>> enumIO2 = (EnumIO) this.enumMapping.putIfAbsent(clsLoadClass.getName(), enumIONewEnumIO);
        return enumIO2 != null ? enumIO2 : enumIONewEnumIO;
    }

    private <T> HasSchema<T> getSchemaWrapper(String str, boolean z) {
        HasSchema<T> hasSchema = (HasSchema) this.pojoMapping.get(str);
        if (hasSchema != null) {
            return hasSchema;
        }
        if (!z) {
            return null;
        }
        Class clsLoadClass = RuntimeEnv.loadClass(str);
        Lazy lazy = new Lazy(clsLoadClass, this);
        HasSchema<T> hasSchema2 = (HasSchema) this.pojoMapping.putIfAbsent(clsLoadClass.getName(), lazy);
        return hasSchema2 != null ? hasSchema2 : lazy;
    }

    public static Class<?> resolveClass(String str) {
        RuntimeFieldFactory inline = RuntimeFieldFactory.getInline(str);
        if (inline == null) {
            return RuntimeEnv.loadClass(str);
        }
        if (str.indexOf(46) != -1) {
            return inline.typeClass();
        }
        switch (inline.id) {
            case 1:
                return Boolean.TYPE;
            case 2:
                return Byte.TYPE;
            case 3:
                return Character.TYPE;
            case 4:
                return Short.TYPE;
            case 5:
                return Integer.TYPE;
            case 6:
                return Long.TYPE;
            case 7:
                return Float.TYPE;
            case 8:
                return Double.TYPE;
            default:
                throw new RuntimeException("Should never happen.");
        }
    }

    @Override // io.protostuff.runtime.IdStrategy
    public CollectionSchema.MessageFactory getCollectionFactory(Class<?> cls) {
        String name = cls.getName();
        CollectionSchema.MessageFactory messageFactory = this.collectionMapping.get(name);
        if (messageFactory != null) {
            return messageFactory;
        }
        if (name.startsWith("java.util") && CollectionSchema.MessageFactories.accept(cls.getSimpleName())) {
            return CollectionSchema.MessageFactories.valueOf(cls.getSimpleName());
        }
        RuntimeCollectionFactory runtimeCollectionFactory = new RuntimeCollectionFactory(cls);
        CollectionSchema.MessageFactory messageFactoryPutIfAbsent = this.collectionMapping.putIfAbsent(name, runtimeCollectionFactory);
        return messageFactoryPutIfAbsent != null ? messageFactoryPutIfAbsent : runtimeCollectionFactory;
    }

    @Override // io.protostuff.runtime.IdStrategy
    public <T> Delegate<T> getDelegate(Class<? super T> cls) {
        HasDelegate<?> hasDelegate = this.delegateMapping.get(cls.getName());
        if (hasDelegate == null) {
            return null;
        }
        return (Delegate<T>) hasDelegate.delegate;
    }

    @Override // io.protostuff.runtime.IdStrategy
    public <T> HasDelegate<T> getDelegateWrapper(Class<? super T> cls) {
        return (HasDelegate) this.delegateMapping.get(cls.getName());
    }

    @Override // io.protostuff.runtime.IdStrategy
    public MapSchema.MessageFactory getMapFactory(Class<?> cls) {
        String name = cls.getName();
        MapSchema.MessageFactory messageFactory = this.mapMapping.get(name);
        if (messageFactory != null) {
            return messageFactory;
        }
        if (name.startsWith("java.util") && MapSchema.MessageFactories.accept(cls.getSimpleName())) {
            return MapSchema.MessageFactories.valueOf(cls.getSimpleName());
        }
        RuntimeMapFactory runtimeMapFactory = new RuntimeMapFactory(cls);
        MapSchema.MessageFactory messageFactoryPutIfAbsent = this.mapMapping.putIfAbsent(name, runtimeMapFactory);
        return messageFactoryPutIfAbsent != null ? messageFactoryPutIfAbsent : runtimeMapFactory;
    }

    @Override // io.protostuff.runtime.IdStrategy
    public boolean isDelegateRegistered(Class<?> cls) {
        return this.delegateMapping.containsKey(cls.getName());
    }

    @Override // io.protostuff.runtime.IdStrategy
    public boolean isRegistered(Class<?> cls) {
        HasSchema<?> hasSchema = this.pojoMapping.get(cls.getName());
        return (hasSchema == null || (hasSchema instanceof Lazy)) ? false : true;
    }

    public <T> boolean map(Class<? super T> cls, Class<T> cls2) {
        if (!cls2.isInterface() && !Modifier.isAbstract(cls2.getModifiers())) {
            HasSchema<?> hasSchemaPutIfAbsent = this.pojoMapping.putIfAbsent(cls.getName(), new Mapped(cls, cls2, this));
            return hasSchemaPutIfAbsent == null || ((hasSchemaPutIfAbsent instanceof Mapped) && ((Mapped) hasSchemaPutIfAbsent).typeClass == cls2);
        }
        throw new IllegalArgumentException(cls2 + " cannot be an interface/abstract class.");
    }

    public boolean registerCollection(CollectionSchema.MessageFactory messageFactory) {
        return this.collectionMapping.putIfAbsent(messageFactory.typeClass().getName(), messageFactory) == null;
    }

    public <T> boolean registerDelegate(Delegate<T> delegate) {
        return registerDelegate(delegate.typeClass().getName(), delegate);
    }

    public <T extends Enum<T>> boolean registerEnum(Class<T> cls) {
        return this.enumMapping.putIfAbsent(cls.getName(), EnumIO.newEnumIO(cls, this)) == null;
    }

    public boolean registerMap(MapSchema.MessageFactory messageFactory) {
        return this.mapMapping.putIfAbsent(messageFactory.typeClass().getName(), messageFactory) == null;
    }

    public <T> boolean registerPojo(Class<T> cls, Schema<T> schema) {
        HasSchema<?> hasSchemaPutIfAbsent = this.pojoMapping.putIfAbsent(cls.getName(), new Registered(schema, this));
        return hasSchemaPutIfAbsent == null || ((hasSchemaPutIfAbsent instanceof Registered) && ((Registered) hasSchemaPutIfAbsent).schema == schema);
    }

    @Override // io.protostuff.runtime.IdStrategy
    public Class<?> resolveArrayComponentTypeFrom(Input input, boolean z) throws IOException {
        return resolveClass(input.readString());
    }

    @Override // io.protostuff.runtime.IdStrategy
    public Class<?> resolveClassFrom(Input input, boolean z, boolean z2) throws IOException {
        return resolveClass(input.readString());
    }

    @Override // io.protostuff.runtime.IdStrategy
    public CollectionSchema.MessageFactory resolveCollectionFrom(Input input) throws IOException {
        String string = input.readString();
        CollectionSchema.MessageFactory messageFactory = this.collectionMapping.get(string);
        if (messageFactory != null) {
            return messageFactory;
        }
        if (string.indexOf(46) == -1 && CollectionSchema.MessageFactories.accept(string)) {
            return CollectionSchema.MessageFactories.valueOf(string);
        }
        RuntimeCollectionFactory runtimeCollectionFactory = new RuntimeCollectionFactory(RuntimeEnv.loadClass(string));
        CollectionSchema.MessageFactory messageFactoryPutIfAbsent = this.collectionMapping.putIfAbsent(string, runtimeCollectionFactory);
        return messageFactoryPutIfAbsent != null ? messageFactoryPutIfAbsent : runtimeCollectionFactory;
    }

    @Override // io.protostuff.runtime.IdStrategy
    public <T> HasDelegate<T> resolveDelegateFrom(Input input) throws IOException {
        String string = input.readString();
        HasDelegate<T> hasDelegate = (HasDelegate) this.delegateMapping.get(string);
        if (hasDelegate != null) {
            return hasDelegate;
        }
        throw new IdStrategy.UnknownTypeException("delegate: " + string + " (Outdated registry)");
    }

    @Override // io.protostuff.runtime.IdStrategy
    public EnumIO<?> resolveEnumFrom(Input input) throws IOException {
        return getEnumIO(input.readString(), true);
    }

    @Override // io.protostuff.runtime.IdStrategy
    public MapSchema.MessageFactory resolveMapFrom(Input input) throws IOException {
        String string = input.readString();
        MapSchema.MessageFactory messageFactory = this.mapMapping.get(string);
        if (messageFactory != null) {
            return messageFactory;
        }
        if (string.indexOf(46) == -1 && MapSchema.MessageFactories.accept(string)) {
            return MapSchema.MessageFactories.valueOf(string);
        }
        RuntimeMapFactory runtimeMapFactory = new RuntimeMapFactory(RuntimeEnv.loadClass(string));
        MapSchema.MessageFactory messageFactoryPutIfAbsent = this.mapMapping.putIfAbsent(string, runtimeMapFactory);
        return messageFactoryPutIfAbsent != null ? messageFactoryPutIfAbsent : runtimeMapFactory;
    }

    @Override // io.protostuff.runtime.IdStrategy
    public <T> HasSchema<T> resolvePojoFrom(Input input, int i) throws IOException {
        String string = input.readString();
        HasSchema<T> schemaWrapper = getSchemaWrapper(string, (this.flags & 2) != 0);
        if (schemaWrapper != null) {
            return schemaWrapper;
        }
        throw new ProtostuffException("polymorphic pojo not registered: " + string);
    }

    @Override // io.protostuff.runtime.IdStrategy
    public void transferArrayId(Input input, Output output, int i, boolean z) throws IOException {
        input.transferByteRangeTo(output, true, i, false);
    }

    @Override // io.protostuff.runtime.IdStrategy
    public void transferClassId(Input input, Output output, int i, boolean z, boolean z2) throws IOException {
        input.transferByteRangeTo(output, true, i, false);
    }

    @Override // io.protostuff.runtime.IdStrategy
    public void transferCollectionId(Input input, Output output, int i) throws IOException {
        input.transferByteRangeTo(output, true, i, false);
    }

    @Override // io.protostuff.runtime.IdStrategy
    public <T> HasDelegate<T> transferDelegateId(Input input, Output output, int i) throws IOException {
        String string = input.readString();
        HasDelegate<T> hasDelegate = (HasDelegate) this.delegateMapping.get(string);
        if (hasDelegate != null) {
            output.writeString(i, string, false);
            return hasDelegate;
        }
        throw new IdStrategy.UnknownTypeException("delegate: " + string + " (Outdated registry)");
    }

    @Override // io.protostuff.runtime.IdStrategy
    public void transferEnumId(Input input, Output output, int i) throws IOException {
        input.transferByteRangeTo(output, true, i, false);
    }

    @Override // io.protostuff.runtime.IdStrategy
    public void transferMapId(Input input, Output output, int i) throws IOException {
        input.transferByteRangeTo(output, true, i, false);
    }

    @Override // io.protostuff.runtime.IdStrategy
    public <T> HasSchema<T> transferPojoId(Input input, Output output, int i) throws IOException {
        String string = input.readString();
        HasSchema<T> schemaWrapper = getSchemaWrapper(string, (this.flags & 2) != 0);
        if (schemaWrapper != null) {
            output.writeString(i, string, false);
            return schemaWrapper;
        }
        throw new ProtostuffException("polymorphic pojo not registered: " + string);
    }

    @Override // io.protostuff.runtime.IdStrategy
    public <T> HasDelegate<T> tryWriteDelegateIdTo(Output output, int i, Class<T> cls) throws IOException {
        HasDelegate<T> hasDelegate = (HasDelegate) this.delegateMapping.get(cls.getName());
        if (hasDelegate == null) {
            return null;
        }
        output.writeString(i, cls.getName(), false);
        return hasDelegate;
    }

    @Override // io.protostuff.runtime.IdStrategy
    public <T> HasSchema<T> tryWritePojoIdTo(Output output, int i, Class<T> cls, boolean z) throws IOException {
        HasSchema<T> schemaWrapper = getSchemaWrapper((Class) cls, false);
        if (schemaWrapper == null) {
            return null;
        }
        if (z && (schemaWrapper instanceof Lazy)) {
            return null;
        }
        output.writeString(i, cls.getName(), false);
        return schemaWrapper;
    }

    @Override // io.protostuff.runtime.IdStrategy
    public void writeArrayIdTo(Output output, Class<?> cls) throws IOException {
        output.writeString(15, cls.getName(), false);
    }

    @Override // io.protostuff.runtime.IdStrategy
    public void writeClassIdTo(Output output, Class<?> cls, boolean z) throws IOException {
        output.writeString(z ? 20 : 18, cls.getName(), false);
    }

    @Override // io.protostuff.runtime.IdStrategy
    public void writeCollectionIdTo(Output output, int i, Class<?> cls) throws IOException {
        if (this.collectionMapping.get(cls.getName()) == null && cls.getName().startsWith("java.util") && CollectionSchema.MessageFactories.accept(cls.getSimpleName())) {
            output.writeString(i, cls.getSimpleName(), false);
        } else {
            output.writeString(i, cls.getName(), false);
        }
    }

    @Override // io.protostuff.runtime.IdStrategy
    public void writeEnumIdTo(Output output, int i, Class<?> cls) throws IOException {
        output.writeString(i, cls.getName(), false);
    }

    @Override // io.protostuff.runtime.IdStrategy
    public void writeMapIdTo(Output output, int i, Class<?> cls) throws IOException {
        if (this.mapMapping.get(cls) == null && cls.getName().startsWith("java.util") && MapSchema.MessageFactories.accept(cls.getSimpleName())) {
            output.writeString(i, cls.getSimpleName(), false);
        } else {
            output.writeString(i, cls.getName(), false);
        }
    }

    @Override // io.protostuff.runtime.IdStrategy
    public <T> Schema<T> writeMessageIdTo(Output output, int i, Message<T> message) throws IOException {
        output.writeString(i, message.getClass().getName(), false);
        return message.cachedSchema();
    }

    @Override // io.protostuff.runtime.IdStrategy
    public <T> HasSchema<T> writePojoIdTo(Output output, int i, Class<T> cls) throws IOException {
        output.writeString(i, cls.getName(), false);
        return getSchemaWrapper((Class) cls, true);
    }

    public <T> boolean registerDelegate(String str, Delegate<T> delegate) {
        return this.delegateMapping.putIfAbsent(str, new HasDelegate<>(delegate, this)) == null;
    }

    public <T> boolean registerPojo(Class<T> cls) {
        HasSchema<?> hasSchemaPutIfAbsent = this.pojoMapping.putIfAbsent(cls.getName(), new LazyRegister(cls, this));
        return hasSchemaPutIfAbsent == null || (hasSchemaPutIfAbsent instanceof LazyRegister);
    }

    @Override // io.protostuff.runtime.IdStrategy
    public EnumIO<? extends Enum<?>> getEnumIO(Class<?> cls) {
        EnumIO<? extends Enum<?>> enumIO = (EnumIO) this.enumMapping.get(cls.getName());
        if (enumIO != null) {
            return enumIO;
        }
        EnumIO<? extends Enum<?>> enumIONewEnumIO = EnumIO.newEnumIO(cls, this);
        EnumIO<? extends Enum<?>> enumIO2 = (EnumIO) this.enumMapping.putIfAbsent(cls.getName(), enumIONewEnumIO);
        return enumIO2 != null ? enumIO2 : enumIONewEnumIO;
    }

    @Override // io.protostuff.runtime.IdStrategy
    public <T> HasSchema<T> getSchemaWrapper(Class<T> cls, boolean z) {
        HasSchema<T> hasSchema = (HasSchema) this.pojoMapping.get(cls.getName());
        if (hasSchema != null || !z) {
            return hasSchema;
        }
        Lazy lazy = new Lazy(cls, this);
        HasSchema<T> hasSchema2 = (HasSchema) this.pojoMapping.putIfAbsent(cls.getName(), lazy);
        return hasSchema2 != null ? hasSchema2 : lazy;
    }

    public DefaultIdStrategy(IdStrategy idStrategy, int i) {
        super(IdStrategy.DEFAULT_FLAGS, idStrategy, i);
        this.pojoMapping = new ConcurrentHashMap<>();
        this.enumMapping = new ConcurrentHashMap<>();
        this.collectionMapping = new ConcurrentHashMap<>();
        this.mapMapping = new ConcurrentHashMap<>();
        this.delegateMapping = new ConcurrentHashMap<>();
    }

    public DefaultIdStrategy(int i) {
        super(i, null, 0);
        this.pojoMapping = new ConcurrentHashMap<>();
        this.enumMapping = new ConcurrentHashMap<>();
        this.collectionMapping = new ConcurrentHashMap<>();
        this.mapMapping = new ConcurrentHashMap<>();
        this.delegateMapping = new ConcurrentHashMap<>();
    }

    public DefaultIdStrategy(int i, IdStrategy idStrategy, int i2) {
        super(i, idStrategy, i2);
        this.pojoMapping = new ConcurrentHashMap<>();
        this.enumMapping = new ConcurrentHashMap<>();
        this.collectionMapping = new ConcurrentHashMap<>();
        this.mapMapping = new ConcurrentHashMap<>();
        this.delegateMapping = new ConcurrentHashMap<>();
    }
}
