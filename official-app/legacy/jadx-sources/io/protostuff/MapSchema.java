package io.protostuff;

import com.oplus.aiunit.vision.upj;
import java.io.IOException;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Properties;
import java.util.Set;
import java.util.TreeMap;
import java.util.WeakHashMap;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentSkipListMap;

/* JADX INFO: loaded from: classes10.dex */
public abstract class MapSchema<K, V> implements Schema<Map<K, V>> {
    public static final String FIELD_NAME_ENTRY = "e";
    public static final String FIELD_NAME_KEY = "k";
    public static final String FIELD_NAME_VALUE = "v";
    static final Set<String> MESSAGE_FACTORIES_NAMES;
    private final Pipe.Schema<Map.Entry<K, V>> entryPipeSchema;
    private final Schema<Map.Entry<K, V>> entrySchema;
    public final MessageFactory messageFactory;
    public final Pipe.Schema<Map<K, V>> pipeSchema;

    public static final class MapWrapper<K, V> implements Map.Entry<K, V> {
        final Map<K, V> map;
        V value;

        public MapWrapper(Map<K, V> map) {
            this.map = map;
        }

        @Override // java.util.Map.Entry
        public K getKey() {
            return null;
        }

        @Override // java.util.Map.Entry
        public V getValue() {
            return this.value;
        }

        public void put(K k, V v) {
            if (k == null) {
                this.value = v;
            } else {
                this.map.put(k, v);
            }
        }

        @Override // java.util.Map.Entry
        public V setValue(V v) {
            V v2 = this.value;
            this.value = v;
            return v2;
        }
    }

    /* JADX WARN: Enum visitor error
    jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'Map' uses external variables
    	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:485)
    	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:422)
    	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:351)
    	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:284)
    	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:153)
    	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:102)
     */
    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    public static abstract class MessageFactories implements MessageFactory {
        private static final /* synthetic */ MessageFactories[] $VALUES;
        public static final MessageFactories ConcurrentHashMap;
        public static final MessageFactories ConcurrentMap;
        public static final MessageFactories ConcurrentNavigableMap;
        public static final MessageFactories ConcurrentSkipListMap;
        public static final MessageFactories HashMap;
        public static final MessageFactories Hashtable;
        public static final MessageFactories IdentityHashMap;
        public static final MessageFactories LinkedHashMap;
        public static final MessageFactories Map;
        public static final MessageFactories NavigableMap;
        public static final MessageFactories Properties;
        public static final MessageFactories SortedMap;
        public static final MessageFactories TreeMap;
        public static final MessageFactories WeakHashMap;
        public final Class<?> typeClass;

        static {
            Class<HashMap> cls = HashMap.class;
            MessageFactories messageFactories = new MessageFactories(upj.CHARTODEL_MAPPING_EL, 0, cls) { // from class: io.protostuff.MapSchema.MessageFactories.1
                @Override // io.protostuff.MapSchema.MessageFactory
                public <K, V> Map<K, V> newMessage() {
                    return new HashMap();
                }
            };
            Map = messageFactories;
            Class<TreeMap> cls2 = TreeMap.class;
            MessageFactories messageFactories2 = new MessageFactories("SortedMap", 1, cls2) { // from class: io.protostuff.MapSchema.MessageFactories.2
                @Override // io.protostuff.MapSchema.MessageFactory
                public <K, V> Map<K, V> newMessage() {
                    return new TreeMap();
                }
            };
            SortedMap = messageFactories2;
            MessageFactories messageFactories3 = new MessageFactories("NavigableMap", 2, cls2) { // from class: io.protostuff.MapSchema.MessageFactories.3
                @Override // io.protostuff.MapSchema.MessageFactory
                public <K, V> Map<K, V> newMessage() {
                    return new TreeMap();
                }
            };
            NavigableMap = messageFactories3;
            MessageFactories messageFactories4 = new MessageFactories("HashMap", 3, cls) { // from class: io.protostuff.MapSchema.MessageFactories.4
                @Override // io.protostuff.MapSchema.MessageFactory
                public <K, V> Map<K, V> newMessage() {
                    return new HashMap();
                }
            };
            HashMap = messageFactories4;
            MessageFactories messageFactories5 = new MessageFactories("LinkedHashMap", 4, LinkedHashMap.class) { // from class: io.protostuff.MapSchema.MessageFactories.5
                @Override // io.protostuff.MapSchema.MessageFactory
                public <K, V> Map<K, V> newMessage() {
                    return new LinkedHashMap();
                }
            };
            LinkedHashMap = messageFactories5;
            MessageFactories messageFactories6 = new MessageFactories("TreeMap", 5, cls2) { // from class: io.protostuff.MapSchema.MessageFactories.6
                @Override // io.protostuff.MapSchema.MessageFactory
                public <K, V> Map<K, V> newMessage() {
                    return new TreeMap();
                }
            };
            TreeMap = messageFactories6;
            MessageFactories messageFactories7 = new MessageFactories("WeakHashMap", 6, WeakHashMap.class) { // from class: io.protostuff.MapSchema.MessageFactories.7
                @Override // io.protostuff.MapSchema.MessageFactory
                public <K, V> Map<K, V> newMessage() {
                    return new WeakHashMap();
                }
            };
            WeakHashMap = messageFactories7;
            MessageFactories messageFactories8 = new MessageFactories("IdentityHashMap", 7, IdentityHashMap.class) { // from class: io.protostuff.MapSchema.MessageFactories.8
                @Override // io.protostuff.MapSchema.MessageFactory
                public <K, V> Map<K, V> newMessage() {
                    return new IdentityHashMap();
                }
            };
            IdentityHashMap = messageFactories8;
            MessageFactories messageFactories9 = new MessageFactories("Hashtable", 8, Hashtable.class) { // from class: io.protostuff.MapSchema.MessageFactories.9
                @Override // io.protostuff.MapSchema.MessageFactory
                public <K, V> Map<K, V> newMessage() {
                    return new Hashtable();
                }
            };
            Hashtable = messageFactories9;
            Class<ConcurrentHashMap> cls3 = ConcurrentHashMap.class;
            MessageFactories messageFactories10 = new MessageFactories("ConcurrentMap", 9, cls3) { // from class: io.protostuff.MapSchema.MessageFactories.10
                @Override // io.protostuff.MapSchema.MessageFactory
                public <K, V> Map<K, V> newMessage() {
                    return new ConcurrentHashMap();
                }
            };
            ConcurrentMap = messageFactories10;
            MessageFactories messageFactories11 = new MessageFactories("ConcurrentHashMap", 10, cls3) { // from class: io.protostuff.MapSchema.MessageFactories.11
                @Override // io.protostuff.MapSchema.MessageFactory
                public <K, V> Map<K, V> newMessage() {
                    return new ConcurrentHashMap();
                }
            };
            ConcurrentHashMap = messageFactories11;
            Class<ConcurrentSkipListMap> cls4 = ConcurrentSkipListMap.class;
            MessageFactories messageFactories12 = new MessageFactories("ConcurrentNavigableMap", 11, cls4) { // from class: io.protostuff.MapSchema.MessageFactories.12
                @Override // io.protostuff.MapSchema.MessageFactory
                public <K, V> Map<K, V> newMessage() {
                    return new ConcurrentSkipListMap();
                }
            };
            ConcurrentNavigableMap = messageFactories12;
            MessageFactories messageFactories13 = new MessageFactories("ConcurrentSkipListMap", 12, cls4) { // from class: io.protostuff.MapSchema.MessageFactories.13
                @Override // io.protostuff.MapSchema.MessageFactory
                public <K, V> Map<K, V> newMessage() {
                    return new ConcurrentSkipListMap();
                }
            };
            ConcurrentSkipListMap = messageFactories13;
            MessageFactories messageFactories14 = new MessageFactories("Properties", 13, Properties.class) { // from class: io.protostuff.MapSchema.MessageFactories.14
                @Override // io.protostuff.MapSchema.MessageFactory
                public <K, V> Map<K, V> newMessage() {
                    return new Properties();
                }
            };
            Properties = messageFactories14;
            $VALUES = new MessageFactories[]{messageFactories, messageFactories2, messageFactories3, messageFactories4, messageFactories5, messageFactories6, messageFactories7, messageFactories8, messageFactories9, messageFactories10, messageFactories11, messageFactories12, messageFactories13, messageFactories14};
        }

        public static boolean accept(String str) {
            return MapSchema.MESSAGE_FACTORIES_NAMES.contains(str);
        }

        public static MessageFactories getFactory(Class<? extends Map<?, ?>> cls) {
            if (cls.getName().startsWith("java.util")) {
                return valueOf(cls.getSimpleName());
            }
            return null;
        }

        public static MessageFactories valueOf(String str) {
            return (MessageFactories) Enum.valueOf(MessageFactories.class, str);
        }

        public static MessageFactories[] values() {
            return (MessageFactories[]) $VALUES.clone();
        }

        @Override // io.protostuff.MapSchema.MessageFactory
        public Class<?> typeClass() {
            return this.typeClass;
        }

        private MessageFactories(String str, int i, Class cls) {
            super(str, i);
            this.typeClass = cls;
        }

        public static MessageFactories getFactory(String str) {
            return valueOf(str);
        }
    }

    public interface MessageFactory {
        <K, V> Map<K, V> newMessage();

        Class<?> typeClass();
    }

    static {
        MessageFactories[] messageFactoriesArrValues = MessageFactories.values();
        MESSAGE_FACTORIES_NAMES = new HashSet(messageFactoriesArrValues.length);
        for (MessageFactories messageFactories : messageFactoriesArrValues) {
            MESSAGE_FACTORIES_NAMES.add(messageFactories.name());
        }
    }

    public MapSchema() {
        this(MessageFactories.HashMap);
    }

    @Override // io.protostuff.Schema
    public final String getFieldName(int i) {
        if (i == 1) {
            return FIELD_NAME_ENTRY;
        }
        return null;
    }

    @Override // io.protostuff.Schema
    public final int getFieldNumber(String str) {
        return (str.length() == 1 && str.charAt(0) == 'e') ? 1 : 0;
    }

    @Override // io.protostuff.Schema
    public final boolean isInitialized(Map<K, V> map) {
        return true;
    }

    @Override // io.protostuff.Schema
    public final String messageFullName() {
        return Map.class.getName();
    }

    @Override // io.protostuff.Schema
    public final String messageName() {
        return Map.class.getSimpleName();
    }

    public abstract void putValueFrom(Input input, MapWrapper<K, V> mapWrapper, K k) throws IOException;

    public abstract K readKeyFrom(Input input, MapWrapper<K, V> mapWrapper) throws IOException;

    public abstract void transferKey(Pipe pipe, Input input, Output output, int i, boolean z) throws IOException;

    public abstract void transferValue(Pipe pipe, Input input, Output output, int i, boolean z) throws IOException;

    @Override // io.protostuff.Schema
    public final Class<? super Map<K, V>> typeClass() {
        return Map.class;
    }

    public abstract void writeKeyTo(Output output, int i, K k, boolean z) throws IOException;

    public abstract void writeValueTo(Output output, int i, V v, boolean z) throws IOException;

    public MapSchema(MessageFactory messageFactory) {
        this.pipeSchema = new Pipe.Schema<Map<K, V>>(this) { // from class: io.protostuff.MapSchema.1
            @Override // io.protostuff.Pipe.Schema
            public void transfer(Pipe pipe, Input input, Output output) throws IOException {
                int fieldNumber = input.readFieldNumber(MapSchema.this);
                while (fieldNumber != 0) {
                    if (fieldNumber != 1) {
                        throw new ProtostuffException("The map was incorrectly serialized.");
                    }
                    output.writeObject(fieldNumber, pipe, MapSchema.this.entryPipeSchema, true);
                    fieldNumber = input.readFieldNumber(MapSchema.this);
                }
            }
        };
        Schema<Map.Entry<K, V>> schema = new Schema<Map.Entry<K, V>>() { // from class: io.protostuff.MapSchema.2
            static final /* synthetic */ boolean $assertionsDisabled = false;

            @Override // io.protostuff.Schema
            public final String getFieldName(int i) {
                if (i == 1) {
                    return MapSchema.FIELD_NAME_KEY;
                }
                if (i != 2) {
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
            public boolean isInitialized(Map.Entry<K, V> entry) {
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
            public Class<? super Map.Entry<K, V>> typeClass() {
                return Map.Entry.class;
            }

            /* JADX WARN: Type inference incomplete: some casts might be missing */
            @Override // io.protostuff.Schema
            public void mergeFrom(Input input, Map.Entry<K, V> entry) throws IOException {
                MapWrapper<K, V> mapWrapper = (MapWrapper) entry;
                int fieldNumber = input.readFieldNumber(this);
                boolean z = false;
                Object keyFrom = null;
                while (fieldNumber != 0) {
                    if (fieldNumber != 1) {
                        if (fieldNumber != 2) {
                            throw new ProtostuffException("The map was incorrectly serialized.");
                        }
                        if (z) {
                            throw new ProtostuffException("The map was incorrectly serialized.");
                        }
                        MapSchema.this.putValueFrom(input, mapWrapper, keyFrom);
                        z = true;
                    } else {
                        if (keyFrom != null) {
                            throw new ProtostuffException("The map was incorrectly serialized.");
                        }
                        keyFrom = MapSchema.this.readKeyFrom(input, mapWrapper);
                    }
                    fieldNumber = input.readFieldNumber(this);
                }
                if (keyFrom == null) {
                    mapWrapper.map.put(null, z ? mapWrapper.value : null);
                } else {
                    if (z) {
                        return;
                    }
                    mapWrapper.map.put((K) keyFrom, null);
                }
            }

            @Override // io.protostuff.Schema
            public Map.Entry<K, V> newMessage() {
                throw new UnsupportedOperationException();
            }

            @Override // io.protostuff.Schema
            public void writeTo(Output output, Map.Entry<K, V> entry) throws IOException {
                if (entry.getKey() != null) {
                    MapSchema.this.writeKeyTo(output, 1, entry.getKey(), false);
                }
                if (entry.getValue() != null) {
                    MapSchema.this.writeValueTo(output, 2, entry.getValue(), false);
                }
            }
        };
        this.entrySchema = schema;
        this.entryPipeSchema = new Pipe.Schema<Map.Entry<K, V>>(schema) { // from class: io.protostuff.MapSchema.3
            @Override // io.protostuff.Pipe.Schema
            public void transfer(Pipe pipe, Input input, Output output) throws IOException {
                int fieldNumber = input.readFieldNumber(MapSchema.this.entrySchema);
                while (fieldNumber != 0) {
                    if (fieldNumber == 1) {
                        MapSchema.this.transferKey(pipe, input, output, 1, false);
                    } else {
                        if (fieldNumber != 2) {
                            throw new ProtostuffException("The map was incorrectly serialized.");
                        }
                        MapSchema.this.transferValue(pipe, input, output, 2, false);
                    }
                    fieldNumber = input.readFieldNumber(MapSchema.this.entrySchema);
                }
            }
        };
        this.messageFactory = messageFactory;
    }

    @Override // io.protostuff.Schema
    public final void mergeFrom(Input input, Map<K, V> map) throws IOException {
        int fieldNumber = input.readFieldNumber(this);
        MapWrapper mapWrapper = null;
        while (fieldNumber != 0) {
            if (fieldNumber != 1) {
                throw new ProtostuffException("The map was incorrectly serialized.");
            }
            if (mapWrapper == null) {
                mapWrapper = new MapWrapper(map);
            }
            if (mapWrapper != input.mergeObject(mapWrapper, this.entrySchema)) {
                throw new IllegalStateException("A Map.Entry will always be unique, hence it cannot be a reference obtained from " + input.getClass().getName());
            }
            fieldNumber = input.readFieldNumber(this);
        }
    }

    @Override // io.protostuff.Schema
    public final Map<K, V> newMessage() {
        return this.messageFactory.newMessage();
    }

    @Override // io.protostuff.Schema
    public final void writeTo(Output output, Map<K, V> map) throws IOException {
        Iterator<Map.Entry<K, V>> it = map.entrySet().iterator();
        while (it.hasNext()) {
            output.writeObject(1, it.next(), this.entrySchema, true);
        }
    }
}
