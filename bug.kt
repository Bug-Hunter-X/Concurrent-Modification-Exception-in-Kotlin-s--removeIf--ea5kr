fun main() {
    val list = mutableListOf<Int>(1, 2, 3, 4, 5)
    list.removeIf { it % 2 == 0 }
    println(list)
}

This code seems correct at first glance, attempting to remove even numbers from a list.  However, it may result in unexpected behavior due to concurrent modification if another thread is altering the list while `removeIf` is operating. Although less common with simple examples, this is a subtle issue that appears in multi-threaded applications.