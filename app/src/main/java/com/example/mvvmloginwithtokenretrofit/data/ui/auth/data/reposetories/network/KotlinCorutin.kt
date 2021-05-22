package com.example.mvvmloginwithtokenretrofit.data.ui.auth.data.reposetories.network

import java.util.*


fun main() {

/*    println("$this")
    println("Thread Start ${Thread.currentThread().name}")
    Thread.sleep(10000)

    GlobalScope.launch {
        println("Thread inside ${Thread.currentThread().name}")
        println("Thread inside ${Thread.currentThread().name}")

    }
    Thread.sleep(10000)

    println("Thread End ${Thread.currentThread().name}")

    inlineFunction { println("Call inline function") }*/


    var str1: String = "adc"
    var str2: String = "cad"
    var anagram: Boolean = false
    if (str1.length != str2.length) {
        anagram = false
    }
    if (isAnagram(str1, str2)) {
        anagram = true
        println("Anagram")
    } else {
        println("Not Anagram")

    }

    val sc = Scanner(System.`in`)

    //Enter String Value
    println("Enter String1 : ")
    val str11: String = sc.nextLine()

    println("Enter String2 : ")
    val str22: String = sc.next()

    //Call Function to  check anagram String
    if (isAnagram(str11, str22)) {
        println("Anagram Strings !!")
    } else {
        println("Strings are not Anagram !!")
    }


    val str = "PRASANT"
    str.replace(" ", " ")
    val feqMap: Map<*, *> = LinkedHashMap<Char, Int>()
    for (ch:Char in str.toCharArray()){
        if (feqMap.containsKey(ch)){
        }
    }



    val emp=User()
    emp.age = 23
    emp.name = "RAMA"

    emp.apply {
       age = 55
       name = "Prasant"
    }

print("$emp")



}

fun isAnagram(string1: String, string2: String): Boolean {
    if (string1.length != string2.length) {
        return false
    }
//Convert String to char array
    val charArr1=string1.toCharArray()
    val charArr2=string2.toCharArray()

    //Sort the Array
    Arrays.sort(charArr1)
    Arrays.sort(charArr2)

    //Convert Array to string

    val sortString1=String(charArr1)
    val sortString2= String(charArr2)

    return sortString1==sortString2
}

fun inlineFunction(fn: () -> Unit) {
    fn()
    println("Code inside inline function")
}