package fizzBuzz

fun fizzBuzz(n: Int): List<String> {
    val myList = MutableList(n){""}
    for (num in 1 ..  n){
        if (num %3 == 0 && num %5 == 0) myList[num-1] = "FizzBuzz"
        else if (num %3 == 0) myList[num-1] = "Fizz"
        else if (num %5 == 0) myList[num-1] = "Buzz"
        else myList[num-1] = num.toString()
    }
    return myList
}

fun main() {
    println(fizzBuzz(3))
}