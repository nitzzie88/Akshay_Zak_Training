// Databricks notebook source
// Q1) Create a list with 10 items
val myList:List[Int] = List(1,2,3,4,5,6,7,8,9,10)

// COMMAND ----------

// Q1.A) Product of each list element in myEachProductList
val myEachProductList: List[Int] = List(1,2,3,4,5,6,7,8,9,10)
for (j <- myEachProductList){
  println(j * j)
}

// COMMAND ----------

// Q1.B) Addition of each list element in myEachAddList
val myEachAddList:List[Int] = List(2,4,6)
for (k <- myEachAddList){
  println(k + k)
}

// COMMAND ----------

// Q2) Mutable list and immuatable list with example
//Mutable List
var myMutableList: List[Int] = List(1,2,3)

// COMMAND ----------

myMutableList = List(3)

// COMMAND ----------

//Immutable List
val myImmutableList: List[Int] = List(1,2,3)

// COMMAND ----------

myImmutableList = List(3)

// COMMAND ----------

// Q3) Remove duplicates from list
val mySet = Set(1,2,3,1,2,3,4)

// COMMAND ----------

println(mySet)

// COMMAND ----------

// Q4) Create Map of Strings and List[String]
var myMap = Map(1 -> "Batman", 2 -> "SuperMan", 3 -> "WonderWoman")

// COMMAND ----------

// Q4.A) Print keys and values
println(myMap)

// COMMAND ----------

// Q4.B) Print keys only
println(myMap.keys)

// COMMAND ----------

// Q4.C) Print values only
println(myMap.values)

// COMMAND ----------

// Q5) Create list of 1 to 20
val myNewList = 1 to 20

// COMMAND ----------

for (eo <- myNewList)
print(eo + " ")

// COMMAND ----------

// Q5.A) Print list of ODD  number 
//var odd=5
for (eo <- myNewList)
//print(odd)  
  if (eo % 2 != 0){
    print(eo + " ")
  }

// COMMAND ----------

// Q5.B) Print list of Even number
for (eo <- myNewList){
  if (eo % 2 == 0){
    print(eo + " ")
  }
}
