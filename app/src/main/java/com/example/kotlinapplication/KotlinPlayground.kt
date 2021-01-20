package com.example.kotlinapplication

/**
 * @author zhangyongkang01_sx
 * @date 1/20/2021
 * com.example.kotlinapplication
 */

class Test {
    fun numTeams(rating: IntArray): Int {
        var count = 0
        for (i in 1..rating.size - 2) {
            var pre = 0
            var next = 0
            var maxPre = 0
            var maxNext = 0
            for (j in 0 until i) {
                if (rating[j] < rating[i]) pre++ else if (rating[j] > rating[i]) maxPre++
            }
            for (k in i + 1 until rating.size) {
                if (rating[i] < rating[k]) next++ else if (rating[i] > rating[k]) maxNext++
            }
            count += pre * next + maxPre * maxNext
        }
        return count
    }
}