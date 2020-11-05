import scala.util.matching.Regex
import scala.io.StdIn.readLine

class PhoneNumber(var text:String) {

    def findNumber():Unit={
        val fullNumber=new Regex("(\\d{3})-(\\d{3})-(\\d{4})")
        
        
        val number=fullNumber findAllIn text
        

        return number
    }
    
}
object RunProgram   
{  
    
    def main(args: Array[String])  
    {  
       
       var text=readLine()
       val num=new PhoneNumber(text)

       println(num.findNumber())
       println("The number is "+add(1,3))
        
       
    }  
}  
