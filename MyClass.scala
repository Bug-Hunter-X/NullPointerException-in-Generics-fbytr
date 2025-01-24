```scala
class MyClass[T](val value: T) {
  def printValue(): Unit = {
    println(value)
  }
}

object MainObject {
  def main(args: Array[String]): Unit = {
    val myInt = new MyClass(10)
    myInt.printValue()  //Prints 10
    
    val myString = new MyClass("Hello")
    myString.printValue() // Prints Hello
    
    val myList = new MyClass(List(1,2,3))
    myList.printValue() //Prints List(1, 2, 3)

    //The below line will cause an error because the type parameter T in MyClass is not defined to handle null values
    val myNull = new MyClass(null)
    myNull.printValue()
  }
}
```