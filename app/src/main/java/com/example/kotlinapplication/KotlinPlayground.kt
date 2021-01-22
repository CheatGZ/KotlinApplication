package com.example.kotlinapplication

/**
 * @author zhangyongkang01_sx
 * @date 1/20/2021
 * com.example.kotlinapplication
 */
fun main() {
    val solution = Solution()
    val test = intArrayOf(4, 1, 1, 0)
    val listNode = ListNode(1)
//    listNode.next = ListNode(2)
    println(solution.maxArea(test))
}

class TreeNode(var `val`: Int) {
    var left: TreeNode? = null
    var right: TreeNode? = null
}

class ListNode(var `val`: Int) {
    var next: ListNode? = null
}

class Solution {
    fun maxArea(height: IntArray): Int {
        var max=0

        return max
    }
}