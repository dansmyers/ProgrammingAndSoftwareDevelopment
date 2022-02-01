Rough notes from class on the `static` keyword in Java
==========================

When you declare a method to be static, you can call it using just its name

```
double a = areaOfCircle(10.0);
```

This is the same way you could call functions in Python.

What does it mean for a method to be non-static?

```
Scanner s = new Scanner(System.in);
```

When you make a `Scanner`, you have to specify, as part of the constructor, the
input source that the `Scanner` will read from (like `System.in`). To invoke one of the `Scanner`'s methods, you must do it within the context of
an object created using `new`:

```
int number = s.nextInt();
```

What you **cannot** do is just call the `nextInt()` method without attaching it to
a particular object

```
int number = nextInt();
```

Java cannot use a `Scanner` method without you invoking (using dot notation) a particular `Scanner` object. Static methods just exist---they
are part of the class as a whole and can be called from anywhere using only the name. Static methods don't need additional information to be able to execute
For example, `Math.sqrt()` takesa number, calculates its square root, and returns it to you. You don't need to instantiate any object with `new` to calculate
square roots.
