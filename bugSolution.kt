fun main() {
    val list = mutableListOf<Int>(1, 2, 3, 4, 5)
    val evenNumbers = list.filter { it % 2 == 0 }
    list.removeAll(evenNumbers)
    println(list)
}

This solution creates a separate list to hold even numbers and then removes all elements from the original list using `removeAll`. This avoids the issue of concurrent modification, making it thread-safe.