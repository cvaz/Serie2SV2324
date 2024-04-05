package serie2.part2

class Node<T> (
    var value: T = Any() as T,
    var next: Node<T>? = null,
    var previous: Node<T>? = null) {
}

fun plusOnTwoLists(list1: Node<Int>, list2: Node<Int>){
	TODO()
}

fun <T> removeNonIncresing(list: Node<T>, cmp: Comparator<T>) {
    TODO()
}