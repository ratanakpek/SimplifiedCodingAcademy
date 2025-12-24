package com.example.simplifiedcodingacademy

import org.junit.Test

class VarVsValUnitTest {

    @Test
    fun testingVarAndVal() {
        var fruit = "Apple" // First init
        fruit = fruit + " and Pineapple." // change to other value
        fruit = fruit + " Thank You!" // Change again
        print(fruit)
    }

    @Test
    fun testingVarWithIntValue() {
        var score = 10
        score = 11
        score = 100
        println(score)
    }

}