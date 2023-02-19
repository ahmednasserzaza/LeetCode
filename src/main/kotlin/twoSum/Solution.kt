package twoSum

fun twoSum(nums: IntArray, target: Int): List<Int> {
    val result = mutableListOf<Int>()
    for(i in nums.indices) {
        for(j in i + 1 until nums.size) {
            if (nums[i] + nums[j] == target) {
                result.add(i)
                result.add(j)
            }
        }
    }
    return result
}

fun main() {
    println(twoSum(intArrayOf(1,3,5,7) , 4 ))
}
