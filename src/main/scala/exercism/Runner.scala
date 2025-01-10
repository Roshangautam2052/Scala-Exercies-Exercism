package exercism

import exercism.typeErasureDemo.{Thing, ThingUsingReflection}

object Runner extends App{
 println("Thing without using Reflection Type")
  val thing = Thing(12)
  val thing2 = Thing("Hello")
  val thing3 = Thing(Seq(1, 2, 3, 4))
  val thing4 = Thing(Seq("Hello ", "World"))
  println(thing.processThing(thing))
  println(thing2.processThing(thing2))
  println(thing3.processThing(thing3))
  println(thing4.processThing(thing4))


  println("Thing with using Reflection for Generics Type")
  // Thing using after using Reflection
   val thingUsingReflection1 = ThingUsingReflection(12)
   val thingUsingReflection3 = ThingUsingReflection(Seq("Hello", "World"))
   val thingUsingReflection4 = ThingUsingReflection(Seq(1, 2, 3, 4, 5))

  println(thingUsingReflection1.processThing(thingUsingReflection1))
  println(thingUsingReflection3.processThing(thingUsingReflection3))
  println(thingUsingReflection4.processThing(thingUsingReflection4))

}
