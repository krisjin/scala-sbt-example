package scala.one

/**
 * Created by kris on 2014/7/30.
 */
class Person {
    private var age=0
    private var name=""
   def this(name:String){
     this()
      this.name=name
   }
    def this(name:String,age:Int){
      this(name)
      this.age=age
     }

    
}
