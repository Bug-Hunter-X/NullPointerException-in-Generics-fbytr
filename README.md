# NullPointerException in Scala Generics

This repository demonstrates a common error in Scala related to using type parameters and null values.  The `MyClass` class is a simple generic class that takes a type parameter `T`. When we try to create an instance of `MyClass` with a `null` value, we get a `NullPointerException`.  This is because the type parameter `T` doesn't inherently handle `null` values unless explicitly constrained.

To fix this, consider adding a type constraint to `T` to ensure that it is either a reference type or use an `Option[T]` to handle potential null values.  The solution demonstrates how to modify the code to gracefully handle potential null values.