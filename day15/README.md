# Day15

# Java Collections Framework II

#  Topics Covered

# 1. Set Interface

A Set is a collection that does not allow duplicate elements.

Key Features:
* Does not allow duplicate elements.
* Provides methods to add, remove, and search elements.
* Ordering depends on the implementation.
* Can store null depending on the implementation.

Common Implementations:
* HashSet
* LinkedHashSet
* TreeSet

# 2. HashSet
HashSet stores unique elements without guaranteeing their iteration order.

Features:
* Does not allow duplicates.
* Does not maintain insertion order.
* Provides average constant-time performance for basic operations such as add(), remove(), and contains(), assuming good hash distribution.
* Allows one null element.

# 3. LinkedHashSet

LinkedHashSet stores unique elements while maintaining insertion order.

Features:
* Does not allow duplicates.
* Maintains insertion order.
* Allows one null element.
* Useful when both uniqueness and predictable iteration order are required.

4. TreeSet

TreeSet stores unique elements in sorted order.

Features:

Does not allow duplicates.
Maintains sorted order according to natural ordering or a supplied comparator.
Basic operations such as add(), remove(), and contains() generally take logarithmic time.
Does not permit null with its natural ordering.

# 5. Map Interface

A Map stores data as key-value pairs.
Each key must be unique, but multiple keys can have the same value.
Key Features:
Stores key-value pairs.
Does not allow duplicate keys.
Allows values to be duplicated.
Provides methods to add, retrieve, update, and remove entries.
Ordering and null support depend on the implementation.

Common Implementations:
HashMap
LinkedHashMap
TreeMap

Note: Map is part of the Java Collections Framework, but it does not extend the Collection interface.

# 6. HashMap
HashMap stores data as key-value pairs without guaranteeing iteration order.
Features:
Does not allow duplicate keys.
Allows duplicate values.
Allows one null key and multiple null values.
Provides average constant-time performance for put(), get(), and remove(), assuming good hash distribution.

# 7. LinkedHashMap

LinkedHashMap stores key-value pairs while maintaining a predictable iteration order.
By default, it maintains insertion order.
Features:
Does not allow duplicate keys.
Allows duplicate values.
Maintains insertion order by default.
Allows one null key and multiple null values.
Useful when predictable iteration order is important.

# 8. TreeMap

TreeMap stores key-value pairs sorted by their keys.
Features:
Does not allow duplicate keys.
Allows duplicate values.
Sorts keys according to natural ordering or a supplied comparator.
Basic operations such as put(), get(), and remove() generally take logarithmic time.
Does not permit null keys with its natural ordering, but can support them with a suitable custom comparator.
Allows null values.
