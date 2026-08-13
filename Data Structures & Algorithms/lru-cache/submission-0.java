
class ListNode {
    int key;
    int val;

    ListNode prev;
    ListNode next;

    public ListNode(int key, int val) {
        this.key = key;
        this.val = val;
        this.prev = null;
        this.next = null;
    }
}

class LRUCache {

    private int capacity;

    private HashMap<Integer, ListNode> map;

    private ListNode left;
    private ListNode right;

    public LRUCache(int capacity) {

        this.capacity = capacity;
        this.map = new HashMap<>();

        // Dummy nodes
        this.left = new ListNode(0, 0);
        this.right = new ListNode(0, 0);

        left.next = right;
        right.prev = left;
    }

    // Remove node from linked list
    public void remove(ListNode node) {

        ListNode prev = node.prev;
        ListNode next = node.next;

        prev.next = next;
        next.prev = prev;
    }

    // Insert node just before right
    public void insert(ListNode node) {

        ListNode prev = right.prev;

        prev.next = node;

        node.prev = prev;
        node.next = right;

        right.prev = node;
    }

    public int get(int key) {

        if (map.containsKey(key)) {

            ListNode node = map.get(key);

            // Make this node most recently used
            remove(node);
            insert(node);

            return node.val;
        }

        return -1;
    }

    public void put(int key, int value) {

        // If key already exists
        if (map.containsKey(key)) {
            remove(map.get(key));
        }

        ListNode newNode = new ListNode(key, value);

        map.put(key, newNode);

        // New node becomes most recently used
        insert(newNode);

        // Cache exceeded capacity
        if (map.size() > capacity) {

            // Least recently used node
            ListNode lru = left.next;

            remove(lru);

            map.remove(lru.key);
        }
    }
}