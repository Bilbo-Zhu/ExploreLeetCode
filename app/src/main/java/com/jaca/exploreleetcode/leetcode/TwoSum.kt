package com.jaca.exploreleetcode.leetcode

class TwoSum {

    /**
     * O(n^2)
     */
    fun twoSum(numbers: IntArray, target: Int): IntArray {
        numbers.forEachIndexed { index, value ->
            for (i in index + 1 until numbers.size) {
                if (value + numbers[i] == target) {
                    return intArrayOf(index, i)
                }
            }
        }
        return intArrayOf()
    }

    /**
     * O(n)
     */
    fun twoSum2(numbers: IntArray, target: Int): IntArray {
        hashMapOf<Int, Int>().apply {
            numbers.forEachIndexed { index, value ->
                val targetIndex = target - value
                if (containsKey(targetIndex)) {
                    return intArrayOf(index, get(targetIndex) ?: 0)
                }
                put(value, index)
            }
        }
        return intArrayOf()
    }
}