package ex1

import scala.util.control.Breaks

object Functions {

  // Връща големината на масив (без да ползва data.length!!!)
  def length(data: List[Int]) = data.size;

  // Ако cond е true връща onTrue
  def ifelse(cond: Boolean, onTrue: Int, onFalse: Int) =
    if(cond)  onTrue
    else  onFalse

  // Проверява дали скобите в даден масив от символи са балансирани.
  // Коректно: (a)asda(b)(v) | (((a))) | ()(()асдасд)
  // Грешно: )() | ((д) | ((das) (d)( 
  def balance(chars: List[Char]): Boolean = {
    // recursive func
    def getBalance(chars: List[Char], openBracketsCount: Int): Boolean = {
      if (chars.isEmpty) openBracketsCount = 0
      else
        if (chars.head == '(') getBalance(chars.tail, openBracketsCount + 1)
      else (chars.head == ')') open > 0 && getBalance(chars.tail, openBracketsCount - 1)
    }
    // initial run
    getBalance(chars, 0);
  }

//
//  def map(chars: List[Char], f: Any) =  ???
//
//  def toUpperCase(chars: List[Char]) = {
//    def upperCase(char: Char) = char.toUpper
//
//  }

  // Проверява дали съществува елемент отговарящ на f
  def exists(data: List[Int], f: Any) = {
    if(f.isInstanceOf[Int]) {
      var loop = new Breaks
      loop.breakable {
        for (item <- data if item == f) {
          if (item == f) {
            println(f + " is in the list")
            loop.break()
          }

        }
        println(f + " is not in the list")
      }
    }
    else
      println("f must be Int")
  }

  // Връща масив съдържащ само елементите отговарящи на f
  def filter(data: List[Int], f: Any) = ???

  // Проверява дали всички елементи отговарят на f
  def forall(data: List[Int], f: Any) = ???

  // Връща числото от триъгълника на Паскал отговарящо на съответния ред/колона
  def pascal(c: Int, r: Int): Int = ???
}
