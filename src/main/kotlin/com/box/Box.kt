package com.box.kotlin

import java.util.*

fun main(args: Array<String>) {

    val scanner = Scanner(System.`in`)
    print("Please enter object's length:")
    val length = scanner.nextFloat()
    print("Please enter object's width:")
    val width = scanner.nextFloat()
    print("Please enter object's height:")
    val height = scanner.nextInt()
    val box3 = Box3()
    val box5 = Box5()

    if (box3.validate(length, width, height)){
        println("Box3")
    } else if (box5.validate(length, width, height)){
        println("Box5")
    } else {
        println("Out of Size!!!")
    }
}

open class Box (var length:Float, var width:Float, var height:Int) {
    fun validate(length: Float, width: Float, height: Int): Boolean
            =(this.length >= length && this.width >= width && this.height >= height)
}

class Box3:Box (23f,14f,13)
class Box5:Box(39.5f,27.5f,23)




