fun isPrime(n: Int): Boolean {
    if (n <= 1)
        return false
    if (n == 2)
        return true
    if (n % 2 == 0)
        return false
    var i = 3
    while (i * i <= n) {
        if (n % i == 0)
            return false
        i += 2
    }
    return true
}

fun main() {
    var currentPower = 1
    while (true) {
        println("Dla potęgi ${currentPower * 2}:")
        for (number in 2..currentPower * 2) {
            if (number == 13)
                continue
            if (isPrime(number)) print("$number ")
            if (number == 11057)
                break
        }
        println()
        if (currentPower * 2 >= 11057)
            break
        currentPower *= 2
    }
}