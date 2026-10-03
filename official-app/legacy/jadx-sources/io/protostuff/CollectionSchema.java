package io.protostuff;

import java.io.IOException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Set;
import java.util.Stack;
import java.util.TreeSet;
import java.util.Vector;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ConcurrentLinkedDeque;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.ConcurrentSkipListSet;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.PriorityBlockingQueue;

/* JADX INFO: loaded from: classes10.dex */
public abstract class CollectionSchema<V> implements Schema<Collection<V>> {
    public static final String FIELD_NAME_VALUE = "v";
    static final Set<String> MESSAGE_FACTORIES_NAMES;
    public final MessageFactory messageFactory;
    public final Pipe.Schema<Collection<V>> pipeSchema;

    /* JADX WARN: Enum visitor error
    jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'Collection' uses external variables
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
        public static final MessageFactories ArrayBlockingQueue;
        public static final MessageFactories ArrayDeque;
        public static final MessageFactories ArrayList;
        public static final MessageFactories BlockingDeque;
        public static final MessageFactories BlockingQueue;
        public static final MessageFactories Collection;
        public static final MessageFactories ConcurrentLinkedDeque;
        public static final MessageFactories ConcurrentLinkedQueue;
        public static final MessageFactories ConcurrentSkipListSet;
        public static final MessageFactories CopyOnWriteArrayList;
        public static final MessageFactories CopyOnWriteArraySet;
        public static final MessageFactories Deque;
        public static final MessageFactories HashSet;
        public static final MessageFactories LinkedBlockingDeque;
        public static final MessageFactories LinkedBlockingQueue;
        public static final MessageFactories LinkedHashSet;
        public static final MessageFactories LinkedList;
        public static final MessageFactories List;
        public static final MessageFactories NavigableSet;
        public static final MessageFactories PriorityBlockingQueue;
        public static final MessageFactories PriorityQueue;
        public static final MessageFactories Queue;
        public static final MessageFactories Set;
        public static final MessageFactories SortedSet;
        public static final MessageFactories Stack;
        public static final MessageFactories TreeSet;
        public static final MessageFactories Vector;
        public final Class<?> typeClass;

        static {
            Class<ArrayList> cls = ArrayList.class;
            MessageFactories messageFactories = new MessageFactories("Collection", 0, cls) { // from class: io.protostuff.CollectionSchema.MessageFactories.1
                @Override // io.protostuff.CollectionSchema.MessageFactory
                public <V> Collection<V> newMessage() {
                    return new ArrayList();
                }
            };
            Collection = messageFactories;
            MessageFactories messageFactories2 = new MessageFactories("List", 1, cls) { // from class: io.protostuff.CollectionSchema.MessageFactories.2
                @Override // io.protostuff.CollectionSchema.MessageFactory
                public <V> Collection<V> newMessage() {
                    return new ArrayList();
                }
            };
            List = messageFactories2;
            MessageFactories messageFactories3 = new MessageFactories("ArrayList", 2, cls) { // from class: io.protostuff.CollectionSchema.MessageFactories.3
                @Override // io.protostuff.CollectionSchema.MessageFactory
                public <V> Collection<V> newMessage() {
                    return new ArrayList();
                }
            };
            ArrayList = messageFactories3;
            Class<LinkedList> cls2 = LinkedList.class;
            MessageFactories messageFactories4 = new MessageFactories("LinkedList", 3, cls2) { // from class: io.protostuff.CollectionSchema.MessageFactories.4
                @Override // io.protostuff.CollectionSchema.MessageFactory
                public <V> Collection<V> newMessage() {
                    return new LinkedList();
                }
            };
            LinkedList = messageFactories4;
            MessageFactories messageFactories5 = new MessageFactories("CopyOnWriteArrayList", 4, CopyOnWriteArrayList.class) { // from class: io.protostuff.CollectionSchema.MessageFactories.5
                @Override // io.protostuff.CollectionSchema.MessageFactory
                public <V> Collection<V> newMessage() {
                    return new CopyOnWriteArrayList();
                }
            };
            CopyOnWriteArrayList = messageFactories5;
            MessageFactories messageFactories6 = new MessageFactories("Stack", 5, Stack.class) { // from class: io.protostuff.CollectionSchema.MessageFactories.6
                @Override // io.protostuff.CollectionSchema.MessageFactory
                public <V> Collection<V> newMessage() {
                    return new Stack();
                }
            };
            Stack = messageFactories6;
            MessageFactories messageFactories7 = new MessageFactories("Vector", 6, Vector.class) { // from class: io.protostuff.CollectionSchema.MessageFactories.7
                @Override // io.protostuff.CollectionSchema.MessageFactory
                public <V> Collection<V> newMessage() {
                    return new Vector();
                }
            };
            Vector = messageFactories7;
            Class<HashSet> cls3 = HashSet.class;
            MessageFactories messageFactories8 = new MessageFactories("Set", 7, cls3) { // from class: io.protostuff.CollectionSchema.MessageFactories.8
                @Override // io.protostuff.CollectionSchema.MessageFactory
                public <V> Collection<V> newMessage() {
                    return new HashSet();
                }
            };
            Set = messageFactories8;
            MessageFactories messageFactories9 = new MessageFactories("HashSet", 8, cls3) { // from class: io.protostuff.CollectionSchema.MessageFactories.9
                @Override // io.protostuff.CollectionSchema.MessageFactory
                public <V> Collection<V> newMessage() {
                    return new HashSet();
                }
            };
            HashSet = messageFactories9;
            MessageFactories messageFactories10 = new MessageFactories("LinkedHashSet", 9, LinkedHashSet.class) { // from class: io.protostuff.CollectionSchema.MessageFactories.10
                @Override // io.protostuff.CollectionSchema.MessageFactory
                public <V> Collection<V> newMessage() {
                    return new LinkedHashSet();
                }
            };
            LinkedHashSet = messageFactories10;
            Class<TreeSet> cls4 = TreeSet.class;
            MessageFactories messageFactories11 = new MessageFactories("SortedSet", 10, cls4) { // from class: io.protostuff.CollectionSchema.MessageFactories.11
                @Override // io.protostuff.CollectionSchema.MessageFactory
                public <V> Collection<V> newMessage() {
                    return new TreeSet();
                }
            };
            SortedSet = messageFactories11;
            MessageFactories messageFactories12 = new MessageFactories("NavigableSet", 11, cls4) { // from class: io.protostuff.CollectionSchema.MessageFactories.12
                @Override // io.protostuff.CollectionSchema.MessageFactory
                public <V> Collection<V> newMessage() {
                    return new TreeSet();
                }
            };
            NavigableSet = messageFactories12;
            MessageFactories messageFactories13 = new MessageFactories("TreeSet", 12, cls4) { // from class: io.protostuff.CollectionSchema.MessageFactories.13
                @Override // io.protostuff.CollectionSchema.MessageFactory
                public <V> Collection<V> newMessage() {
                    return new TreeSet();
                }
            };
            TreeSet = messageFactories13;
            MessageFactories messageFactories14 = new MessageFactories("ConcurrentSkipListSet", 13, ConcurrentSkipListSet.class) { // from class: io.protostuff.CollectionSchema.MessageFactories.14
                @Override // io.protostuff.CollectionSchema.MessageFactory
                public <V> Collection<V> newMessage() {
                    return new ConcurrentSkipListSet();
                }
            };
            ConcurrentSkipListSet = messageFactories14;
            MessageFactories messageFactories15 = new MessageFactories("CopyOnWriteArraySet", 14, CopyOnWriteArraySet.class) { // from class: io.protostuff.CollectionSchema.MessageFactories.15
                @Override // io.protostuff.CollectionSchema.MessageFactory
                public <V> Collection<V> newMessage() {
                    return new CopyOnWriteArraySet();
                }
            };
            CopyOnWriteArraySet = messageFactories15;
            MessageFactories messageFactories16 = new MessageFactories("Queue", 15, cls2) { // from class: io.protostuff.CollectionSchema.MessageFactories.16
                @Override // io.protostuff.CollectionSchema.MessageFactory
                public <V> Collection<V> newMessage() {
                    return new LinkedList();
                }
            };
            Queue = messageFactories16;
            Class<LinkedBlockingQueue> cls5 = LinkedBlockingQueue.class;
            MessageFactories messageFactories17 = new MessageFactories("BlockingQueue", 16, cls5) { // from class: io.protostuff.CollectionSchema.MessageFactories.17
                @Override // io.protostuff.CollectionSchema.MessageFactory
                public <V> Collection<V> newMessage() {
                    return new LinkedBlockingQueue();
                }
            };
            BlockingQueue = messageFactories17;
            MessageFactories messageFactories18 = new MessageFactories("LinkedBlockingQueue", 17, cls5) { // from class: io.protostuff.CollectionSchema.MessageFactories.18
                @Override // io.protostuff.CollectionSchema.MessageFactory
                public <V> Collection<V> newMessage() {
                    return new LinkedBlockingQueue();
                }
            };
            LinkedBlockingQueue = messageFactories18;
            MessageFactories messageFactories19 = new MessageFactories("Deque", 18, cls2) { // from class: io.protostuff.CollectionSchema.MessageFactories.19
                @Override // io.protostuff.CollectionSchema.MessageFactory
                public <V> Collection<V> newMessage() {
                    return new LinkedList();
                }
            };
            Deque = messageFactories19;
            MessageFactories messageFactories20 = new MessageFactories("BlockingDeque", 19, LinkedBlockingDeque.class) { // from class: io.protostuff.CollectionSchema.MessageFactories.20
                @Override // io.protostuff.CollectionSchema.MessageFactory
                public <V> Collection<V> newMessage() {
                    return new LinkedBlockingDeque();
                }
            };
            BlockingDeque = messageFactories20;
            MessageFactories messageFactories21 = new MessageFactories("LinkedBlockingDeque", 20, LinkedBlockingDeque.class) { // from class: io.protostuff.CollectionSchema.MessageFactories.21
                @Override // io.protostuff.CollectionSchema.MessageFactory
                public <V> Collection<V> newMessage() {
                    return new LinkedBlockingDeque();
                }
            };
            LinkedBlockingDeque = messageFactories21;
            MessageFactories messageFactories22 = new MessageFactories("ArrayBlockingQueue", 21, ArrayBlockingQueue.class) { // from class: io.protostuff.CollectionSchema.MessageFactories.22
                @Override // io.protostuff.CollectionSchema.MessageFactory
                public <V> Collection<V> newMessage() {
                    return new ArrayBlockingQueue(10);
                }
            };
            ArrayBlockingQueue = messageFactories22;
            MessageFactories messageFactories23 = new MessageFactories("ArrayDeque", 22, ArrayDeque.class) { // from class: io.protostuff.CollectionSchema.MessageFactories.23
                @Override // io.protostuff.CollectionSchema.MessageFactory
                public <V> Collection<V> newMessage() {
                    return new ArrayDeque();
                }
            };
            ArrayDeque = messageFactories23;
            MessageFactories messageFactories24 = new MessageFactories("ConcurrentLinkedQueue", 23, ConcurrentLinkedQueue.class) { // from class: io.protostuff.CollectionSchema.MessageFactories.24
                @Override // io.protostuff.CollectionSchema.MessageFactory
                public <V> Collection<V> newMessage() {
                    return new ConcurrentLinkedQueue();
                }
            };
            ConcurrentLinkedQueue = messageFactories24;
            MessageFactories messageFactories25 = new MessageFactories("ConcurrentLinkedDeque", 24, ConcurrentLinkedDeque.class) { // from class: io.protostuff.CollectionSchema.MessageFactories.25
                @Override // io.protostuff.CollectionSchema.MessageFactory
                public <V> Collection<V> newMessage() {
                    return new ConcurrentLinkedDeque();
                }
            };
            ConcurrentLinkedDeque = messageFactories25;
            MessageFactories messageFactories26 = new MessageFactories("PriorityBlockingQueue", 25, PriorityBlockingQueue.class) { // from class: io.protostuff.CollectionSchema.MessageFactories.26
                @Override // io.protostuff.CollectionSchema.MessageFactory
                public <V> Collection<V> newMessage() {
                    return new PriorityBlockingQueue();
                }
            };
            PriorityBlockingQueue = messageFactories26;
            MessageFactories messageFactories27 = new MessageFactories("PriorityQueue", 26, PriorityQueue.class) { // from class: io.protostuff.CollectionSchema.MessageFactories.27
                @Override // io.protostuff.CollectionSchema.MessageFactory
                public <V> Collection<V> newMessage() {
                    return new PriorityQueue();
                }
            };
            PriorityQueue = messageFactories27;
            $VALUES = new MessageFactories[]{messageFactories, messageFactories2, messageFactories3, messageFactories4, messageFactories5, messageFactories6, messageFactories7, messageFactories8, messageFactories9, messageFactories10, messageFactories11, messageFactories12, messageFactories13, messageFactories14, messageFactories15, messageFactories16, messageFactories17, messageFactories18, messageFactories19, messageFactories20, messageFactories21, messageFactories22, messageFactories23, messageFactories24, messageFactories25, messageFactories26, messageFactories27};
        }

        public static boolean accept(String str) {
            return CollectionSchema.MESSAGE_FACTORIES_NAMES.contains(str);
        }

        public static MessageFactories getFactory(Class<? extends Collection<?>> cls) {
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

        @Override // io.protostuff.CollectionSchema.MessageFactory
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
        <V> Collection<V> newMessage();

        Class<?> typeClass();
    }

    static {
        MessageFactories[] messageFactoriesArrValues = MessageFactories.values();
        MESSAGE_FACTORIES_NAMES = new HashSet(messageFactoriesArrValues.length);
        for (MessageFactories messageFactories : messageFactoriesArrValues) {
            MESSAGE_FACTORIES_NAMES.add(messageFactories.name());
        }
    }

    public CollectionSchema() {
        this(MessageFactories.ArrayList);
    }

    public abstract void addValueFrom(Input input, Collection<V> collection) throws IOException;

    @Override // io.protostuff.Schema
    public final String getFieldName(int i) {
        if (i == 1) {
            return "v";
        }
        return null;
    }

    @Override // io.protostuff.Schema
    public final int getFieldNumber(String str) {
        return (str.length() == 1 && str.charAt(0) == 'v') ? 1 : 0;
    }

    @Override // io.protostuff.Schema
    public final boolean isInitialized(Collection<V> collection) {
        return true;
    }

    @Override // io.protostuff.Schema
    public final String messageFullName() {
        return Collection.class.getName();
    }

    @Override // io.protostuff.Schema
    public final String messageName() {
        return Collection.class.getSimpleName();
    }

    public abstract void transferValue(Pipe pipe, Input input, Output output, int i, boolean z) throws IOException;

    @Override // io.protostuff.Schema
    public final Class<? super Collection<V>> typeClass() {
        return Collection.class;
    }

    public abstract void writeValueTo(Output output, int i, V v, boolean z) throws IOException;

    public CollectionSchema(MessageFactory messageFactory) {
        this.pipeSchema = new Pipe.Schema<Collection<V>>(this) { // from class: io.protostuff.CollectionSchema.1
            @Override // io.protostuff.Pipe.Schema
            public void transfer(Pipe pipe, Input input, Output output) throws IOException {
                int fieldNumber = input.readFieldNumber(this);
                while (fieldNumber != 0) {
                    if (fieldNumber != 1) {
                        throw new ProtostuffException("The collection was incorrectly serialized.");
                    }
                    CollectionSchema.this.transferValue(pipe, input, output, 1, true);
                    fieldNumber = input.readFieldNumber(this);
                }
            }
        };
        this.messageFactory = messageFactory;
    }

    @Override // io.protostuff.Schema
    public void mergeFrom(Input input, Collection<V> collection) throws IOException {
        while (true) {
            int fieldNumber = input.readFieldNumber(this);
            if (fieldNumber == 0) {
                return;
            }
            if (fieldNumber != 1) {
                throw new ProtostuffException("The collection was incorrectly serialized.");
            }
            addValueFrom(input, collection);
        }
    }

    @Override // io.protostuff.Schema
    public final Collection<V> newMessage() {
        return this.messageFactory.newMessage();
    }

    @Override // io.protostuff.Schema
    public void writeTo(Output output, Collection<V> collection) throws IOException {
        for (V v : collection) {
            if (v != null) {
                writeValueTo(output, 1, v, true);
            }
        }
    }
}
