package richestCustomerWealth

fun maximumWealth(accounts: Array<IntArray>): Int {
    var richestCustomer = 0
    var wilth = 0
    for (customer in accounts) {
        for (i in customer) {
            wilth += i
        }
        if (wilth >= richestCustomer) richestCustomer = wilth
        wilth = 0
    }
    return richestCustomer
}