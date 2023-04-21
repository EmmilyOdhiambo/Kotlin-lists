fun main() {
    remElement()
    people()
    numbers()
    compareString()
    students()
}
//Create a mutable list with elements and remove all the occurance of an element
fun remElement(){
    var mutableList = mutableListOf<Int>(5,1,2,3,4,5,6,8,5,78)
//    println(mutableList)
    val element = 5
    while (mutableList.contains(element)){
        mutableList.remove(element)
    }
    println(mutableList)
}
//Given a list of people’s heights in metres. Write a function that returns
//the average height and the total height (2 points)
fun people () {
    var heights= listOf<Int>(10,5,7,9,20)
    println(heights.average())
    println(heights.sum())
}
//Write a function that takes in a list of integers and filter only even numbers
fun numbers (){
    var num1 = listOf<Int>(1,2,3,4,5,6,7,8,9,10)
    var newNum = num1.filter { x -> x % 2 == 0 }
    println(newNum)
}

//Write a function to compare two strings and print when equal or not equal
fun compareString (){
    var a=("Today is Madaraka day")
    var b=("Today is not public holiday in Kenya")
    if (a==b){
        println("are equal")
    }else{
        println("are not equal")
    }
}
//Write a function to iterate elements over each other using for each() function
fun students (){
    var mylist = setOf(2,3,4,5,7)
    mylist.forEach(){
        println(it)
    }
}

