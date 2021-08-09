package com.jaca.exploreleetcode

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.jaca.exploreleetcode.leetcode.TwoSum

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        startLeetCode()
    }

    private fun startLeetCode() {
        twoSumTest()
    }

    private fun twoSumTest() {
        val numbers = intArrayOf(1, 2, 3, 5, 7, 9, 12)
        var target = 21

        val testCase = TwoSum()
        println("twoSum: ${testCase.twoSum(numbers, target).toList()}")
        println("twoSum2: ${testCase.twoSum2(numbers, target).toList()}")

        target = 22
        println("twoSum: ${testCase.twoSum(numbers, target).toList()}")
        println("twoSum2: ${testCase.twoSum2(numbers, target).toList()}")
    }
}