// Databricks notebook source
val a = 10
val myString = "Hello"
val myBoolVariable = true
val myFloatVariable = 13.5f
val myDoubleVariable = 20.5
// 01010101010..32 float 
// 0101010101..64 in double

// COMMAND ----------

print (a)
print (myString)
print (myBoolVariable)
print (myFloatVariable)
print (myDoubleVariable)

// COMMAND ----------

val c1:Int = 10
val myString1:String = "Hello"
val myBool1:Boolean = true
val myFloatVariable1:Float = 10.5F
val myDoubleVariable1:Double = 10.2

// COMMAND ----------

// Let us see what happens with val
val myVariable2:Int = 6

// COMMAND ----------

myVariable2 = 23

// COMMAND ----------

//With var
var myVariable:Int = 30

// COMMAND ----------

myVariable = 50
// The variable was over-written as 50

// COMMAND ----------

//Val vs. Var
//Var is mutabale, and Val is immuatable
//Scala allows one to decide whether a variable is immutable or mutable. Immutable is Read only where as mutable is read-write. Immutable variables are declared with the keyword “val“.

// COMMAND ----------

val myList = List(1, 2, 3)
val myList2 = List(1.4, 3, 5)
val myList3 = List(1.2f, 1.5f)
val myList4 = List("Hello", "Brother")
val myList5 = List("Hello", 1, 1.5, true)

// COMMAND ----------

//List of Any
// Any is the superset
//Any is the father in Scala
//Any is super class in Scala

// COMMAND ----------

val myList:List[Double] = List(2.4, 4.6)

// COMMAND ----------



// COMMAND ----------

// Iterations
val myIntList:List[Int] = List(1,2,3,4,5,6)

// python code:  for i in myIntList : 
for (i <- myIntList) {
  println(i)
}

// COMMAND ----------

val myStringList:List[String] = List("Apple", "Orange", "Pineapple")
for (j <- myStringList) {
  println(j)
}

// COMMAND ----------

val myIntList2:List[Int] = List(1,2,3,4,5,6,7)
for (m <- myIntList2) {
  println(m * m)
}

// COMMAND ----------

val myList = 1 to 10
val myList2 = 1 until 10
//Until restricts the numbers 

// COMMAND ----------

val mySet = Set(1,2,3,1,2,3)
//SET Removes duplicates

// COMMAND ----------

val myList = List(1,2,3,1,2,3)
//List does not remove duplicates

// COMMAND ----------

var my_map = Map(1 -> "apple", 2 -> "ball")
my_map(2)

// COMMAND ----------

var age:Int = 17

if (age >= 16) {
  println("You can drive")
}
else if (age >= 18){
  println("You can drive, You can drink")
}
else {
  println("Wait until you turn 16")
}

// COMMAND ----------

//Functions
def addition(x:Int, y:Int) : Int = {
  x + y
}

// COMMAND ----------

addition(20,30)

// COMMAND ----------

// Class will be capital letter
// Variable and Function starts with lowercase

// COMMAND ----------

def multiplication(a:Float, b:Float) : Float = {
  a * b
}

multiplication(10.1f, 20.1f)

// COMMAND ----------

def square(s:Int) : Int = {
  s * s
}

square(12)

// COMMAND ----------

//Lambda Function
var squareLambda = (s:Int) => s*s

// COMMAND ----------

// Unit is VOID by default
class ArithmaticOperations() {
  def addition(f:Int, p:Int): Unit ={
    println("Addition is " , f+p)
  }
  def subtraction(f:Int, p:Int): Unit ={
    println("Subtraction is " , f-p)
  }
  def multiplication(f:Int, p:Int): Unit ={
    println("Multiplication is " , f*p)
  }
}

// COMMAND ----------

var obj1 = new ArithmaticOperations()

// COMMAND ----------

obj1 = ArithmaticOperations(2,3)

// COMMAND ----------


